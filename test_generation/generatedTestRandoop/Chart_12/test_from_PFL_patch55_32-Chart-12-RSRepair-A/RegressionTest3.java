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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.setLimit((double) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        boolean boolean12 = multiplePiePlot11.isSubplot();
        multiplePiePlot11.setOutlineVisible(false);
        org.jfree.chart.util.TableOrder tableOrder15 = multiplePiePlot11.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder15);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent17);
        double double19 = multiplePiePlot1.getLimit();
        multiplePiePlot1.zoom((double) (byte) -1);
        java.lang.String str22 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint23 = multiplePiePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tableOrder15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        java.awt.Stroke stroke8 = multiplePiePlot1.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        multiplePiePlot10.setForegroundAlpha((float) 0L);
        java.awt.Paint paint14 = multiplePiePlot10.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        multiplePiePlot10.setDataset(categoryDataset15);
        java.awt.Font font17 = multiplePiePlot10.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font17);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = multiplePiePlot1.getInsets();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D20, rectangle2D21);
        java.awt.Paint paint23 = multiplePiePlot1.getBackgroundPaint();
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent38 = null;
        multiplePiePlot28.axisChanged(axisChangeEvent38);
        java.awt.Font font40 = multiplePiePlot28.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font40);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(font40);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.setLimit((double) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        boolean boolean12 = multiplePiePlot11.isSubplot();
        multiplePiePlot11.setOutlineVisible(false);
        org.jfree.chart.util.TableOrder tableOrder15 = multiplePiePlot11.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder15);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.lang.String str21 = multiplePiePlot20.getNoDataMessage();
        java.awt.Image image22 = null;
        multiplePiePlot20.setBackgroundImage(image22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = multiplePiePlot20.getDataset();
        java.lang.String str25 = multiplePiePlot20.getNoDataMessage();
        org.jfree.chart.plot.Plot plot26 = multiplePiePlot20.getRootPlot();
        org.jfree.chart.util.TableOrder tableOrder27 = multiplePiePlot20.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder27);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tableOrder15);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(categoryDataset24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(plot26);
        org.junit.Assert.assertNotNull(tableOrder27);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets5);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        multiplePiePlot1.handleClick((int) (byte) -1, (int) (short) 100, plotRenderingInfo10);
        float float12 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot1.getRootPlot();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(plot13);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent6);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent8);
        multiplePiePlot1.zoom((double) 10);
        java.lang.String str12 = multiplePiePlot1.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.lang.String str15 = multiplePiePlot14.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.lang.String str18 = multiplePiePlot17.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        multiplePiePlot17.markerChanged(markerChangeEvent19);
        java.awt.Paint paint21 = multiplePiePlot17.getAggregatedItemsPaint();
        multiplePiePlot14.setOutlinePaint(paint21);
        java.lang.String str23 = multiplePiePlot14.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        boolean boolean26 = multiplePiePlot25.isSubplot();
        multiplePiePlot25.setForegroundAlpha((float) 0L);
        multiplePiePlot25.setOutlineVisible(true);
        org.jfree.chart.JFreeChart jFreeChart31 = multiplePiePlot25.getPieChart();
        multiplePiePlot14.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart31);
        java.awt.Paint paint33 = multiplePiePlot14.getBackgroundPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection34 = multiplePiePlot14.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        boolean boolean37 = multiplePiePlot36.isSubplot();
        multiplePiePlot36.setForegroundAlpha((float) 0L);
        java.awt.Paint paint40 = multiplePiePlot36.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        multiplePiePlot36.setDataset(categoryDataset41);
        multiplePiePlot36.setLimit((double) 10.0f);
        org.jfree.chart.util.TableOrder tableOrder45 = multiplePiePlot36.getDataExtractOrder();
        org.jfree.chart.JFreeChart jFreeChart46 = multiplePiePlot36.getPieChart();
        multiplePiePlot14.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart46);
        multiplePiePlot1.setPieChart(jFreeChart46);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Multiple Pie Plot" + "'", str12, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Multiple Pie Plot" + "'", str23, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jFreeChart31);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(legendItemCollection34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(tableOrder45);
        org.junit.Assert.assertNotNull(jFreeChart46);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot1.getRootPlot();
        java.awt.Paint paint11 = plot10.getNoDataMessagePaint();
        plot10.setNoDataMessage("Multiple Pie Plot");
        java.awt.Image image14 = null;
        plot10.setBackgroundImage(image14);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.lang.String str4 = multiplePiePlot1.getPlotType();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.awt.Image image9 = null;
        multiplePiePlot8.setBackgroundImage(image9);
        multiplePiePlot8.zoom((double) 10L);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.awt.Paint paint15 = multiplePiePlot14.getOutlinePaint();
        multiplePiePlot8.setAggregatedItemsPaint(paint15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = multiplePiePlot8.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        multiplePiePlot8.setDataset(categoryDataset18);
        multiplePiePlot8.setLimit((double) 10);
        java.awt.Paint paint22 = multiplePiePlot8.getOutlinePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        multiplePiePlot1.setDataset(categoryDataset24);
        org.jfree.chart.JFreeChart jFreeChart26 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Multiple Pie Plot" + "'", str4, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryDataset17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(jFreeChart26);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Image image3 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent5);
        java.awt.Stroke stroke7 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot8.setBackgroundImageAlpha((float) (byte) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = multiplePiePlot8.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets11);
        java.awt.Font font13 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot17.setDrawingSupplier(drawingSupplier18);
        java.awt.Image image20 = null;
        multiplePiePlot17.setBackgroundImage(image20);
        boolean boolean22 = multiplePiePlot17.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        multiplePiePlot17.setDataset(categoryDataset23);
        java.lang.String str25 = multiplePiePlot17.getNoDataMessage();
        java.awt.Paint paint26 = multiplePiePlot17.getNoDataMessagePaint();
        multiplePiePlot1.setOutlinePaint(paint26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        multiplePiePlot1.handleClick(100, (int) (byte) 1, plotRenderingInfo6);
        multiplePiePlot1.zoom((double) (byte) 0);
        multiplePiePlot1.setBackgroundAlpha((float) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        boolean boolean14 = multiplePiePlot13.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        boolean boolean17 = multiplePiePlot16.isSubplot();
        multiplePiePlot16.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot13.setParent((org.jfree.chart.plot.Plot) multiplePiePlot16);
        java.awt.Stroke stroke21 = multiplePiePlot16.getOutlineStroke();
        java.lang.String str22 = multiplePiePlot16.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = null;
        multiplePiePlot24.setDrawingSupplier(drawingSupplier25);
        org.jfree.chart.plot.Plot plot27 = multiplePiePlot24.getRootPlot();
        org.jfree.chart.plot.Plot plot28 = multiplePiePlot24.getParent();
        multiplePiePlot24.setForegroundAlpha((float) '#');
        java.awt.Paint paint31 = multiplePiePlot24.getOutlinePaint();
        boolean boolean32 = multiplePiePlot24.isOutlineVisible();
        multiplePiePlot16.setParent((org.jfree.chart.plot.Plot) multiplePiePlot24);
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        boolean boolean36 = multiplePiePlot35.isSubplot();
        multiplePiePlot35.setForegroundAlpha((float) 0L);
        java.awt.Paint paint39 = multiplePiePlot35.getNoDataMessagePaint();
        float float40 = multiplePiePlot35.getBackgroundAlpha();
        org.jfree.chart.util.TableOrder tableOrder41 = multiplePiePlot35.getDataExtractOrder();
        multiplePiePlot16.setDataExtractOrder(tableOrder41);
        multiplePiePlot1.setDataExtractOrder(tableOrder41);
        multiplePiePlot1.zoom(0.0d);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent46 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent46);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(plot27);
        org.junit.Assert.assertNull(plot28);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 1.0f + "'", float40 == 1.0f);
        org.junit.Assert.assertNotNull(tableOrder41);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        boolean boolean3 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        multiplePiePlot5.markerChanged(markerChangeEvent7);
        java.awt.Paint paint9 = multiplePiePlot5.getAggregatedItemsPaint();
        java.lang.Comparable comparable10 = multiplePiePlot5.getAggregatedItemsKey();
        multiplePiePlot5.setBackgroundImageAlpha((float) 0);
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot5.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = multiplePiePlot5.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets14, false);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent19);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
        org.junit.Assert.assertNull(plot13);
        org.junit.Assert.assertNotNull(rectangleInsets14);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier9);
        boolean boolean12 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint13 = multiplePiePlot8.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection14 = multiplePiePlot8.getLegendItems();
        multiplePiePlot8.setLimit((double) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        multiplePiePlot18.setOutlineVisible(false);
        org.jfree.chart.util.TableOrder tableOrder22 = multiplePiePlot18.getDataExtractOrder();
        multiplePiePlot8.setDataExtractOrder(tableOrder22);
        boolean boolean24 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot8);
        multiplePiePlot8.setForegroundAlpha((float) (byte) 10);
        multiplePiePlot8.setNoDataMessage("");
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        boolean boolean31 = multiplePiePlot30.isSubplot();
        java.awt.Paint paint32 = multiplePiePlot30.getBackgroundPaint();
        java.awt.Paint paint33 = multiplePiePlot30.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        multiplePiePlot30.setDataset(categoryDataset34);
        multiplePiePlot8.setParent((org.jfree.chart.plot.Plot) multiplePiePlot30);
        float float37 = multiplePiePlot30.getBackgroundAlpha();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tableOrder22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 1.0f + "'", float37 == 1.0f);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        float float7 = plot4.getBackgroundImageAlpha();
        plot4.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.plot.Plot plot10 = plot4.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = plot4.getInsets();
        java.awt.Paint paint12 = plot4.getOutlinePaint();
        java.awt.Image image13 = plot4.getBackgroundImage();
        plot4.zoom(0.0d);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(image13);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        multiplePiePlot1.handleClick((int) (short) 0, 0, plotRenderingInfo9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent13 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent13);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
        org.jfree.data.general.DatasetGroup datasetGroup17 = multiplePiePlot1.getDatasetGroup();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent18 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent18);
        java.awt.Image image20 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertNull(image20);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier9);
        boolean boolean12 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint13 = multiplePiePlot8.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection14 = multiplePiePlot8.getLegendItems();
        multiplePiePlot8.setLimit((double) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        multiplePiePlot18.setOutlineVisible(false);
        org.jfree.chart.util.TableOrder tableOrder22 = multiplePiePlot18.getDataExtractOrder();
        multiplePiePlot8.setDataExtractOrder(tableOrder22);
        boolean boolean24 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot8);
        multiplePiePlot8.setForegroundAlpha((float) (byte) 10);
        multiplePiePlot8.setNoDataMessage("");
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        boolean boolean31 = multiplePiePlot30.isSubplot();
        java.awt.Paint paint32 = multiplePiePlot30.getBackgroundPaint();
        java.awt.Paint paint33 = multiplePiePlot30.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        multiplePiePlot30.setDataset(categoryDataset34);
        multiplePiePlot8.setParent((org.jfree.chart.plot.Plot) multiplePiePlot30);
        float float37 = multiplePiePlot30.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D38 = null;
        java.awt.geom.Rectangle2D rectangle2D39 = null;
        multiplePiePlot30.drawBackgroundImage(graphics2D38, rectangle2D39);
        multiplePiePlot30.setOutlineVisible(true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tableOrder22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.5f + "'", float37 == 0.5f);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        multiplePiePlot1.setLimit((double) 10.0f);
        org.jfree.chart.util.TableOrder tableOrder10 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.JFreeChart jFreeChart11 = multiplePiePlot1.getPieChart();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent12 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(tableOrder10);
        org.junit.Assert.assertNotNull(jFreeChart11);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent13 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent13);
        java.lang.String str15 = multiplePiePlot1.getPlotType();
        java.lang.Comparable comparable16 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Stroke stroke17 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Multiple Pie Plot" + "'", str15, "Multiple Pie Plot");
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + "Other" + "'", comparable16, "Other");
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        boolean boolean7 = multiplePiePlot1.isSubplot();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent8);
        java.lang.Comparable comparable10 = multiplePiePlot1.getAggregatedItemsKey();
        float float11 = multiplePiePlot1.getBackgroundImageAlpha();
        boolean boolean12 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0.5f);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.lang.String str17 = multiplePiePlot16.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.lang.String str20 = multiplePiePlot19.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        multiplePiePlot19.markerChanged(markerChangeEvent21);
        java.awt.Paint paint23 = multiplePiePlot19.getAggregatedItemsPaint();
        multiplePiePlot16.setOutlinePaint(paint23);
        java.lang.String str25 = multiplePiePlot16.getPlotType();
        org.jfree.chart.LegendItemCollection legendItemCollection26 = multiplePiePlot16.getLegendItems();
        java.lang.String str27 = multiplePiePlot16.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        boolean boolean30 = multiplePiePlot29.isSubplot();
        multiplePiePlot29.setForegroundAlpha((float) 0L);
        multiplePiePlot29.setOutlineVisible(true);
        org.jfree.chart.JFreeChart jFreeChart35 = multiplePiePlot29.getPieChart();
        multiplePiePlot16.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart35);
        java.awt.Paint paint37 = multiplePiePlot16.getAggregatedItemsPaint();
        java.lang.Comparable comparable38 = multiplePiePlot16.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = multiplePiePlot16.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets39);
        multiplePiePlot1.setNoDataMessage("Other");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Multiple Pie Plot" + "'", str25, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(legendItemCollection26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Multiple Pie Plot" + "'", str27, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jFreeChart35);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertEquals("'" + comparable38 + "' != '" + "Other" + "'", comparable38, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets39);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setLimit((double) (byte) 1);
        java.lang.String str7 = multiplePiePlot1.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier10);
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot9.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        plot12.markerChanged(markerChangeEvent13);
        float float15 = plot12.getBackgroundImageAlpha();
        plot12.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.plot.Plot plot18 = plot12.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = plot12.getInsets();
        java.awt.Paint paint20 = plot12.getOutlinePaint();
        java.awt.Image image21 = plot12.getBackgroundImage();
        plot12.setBackgroundImageAlpha((float) 1L);
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        plot12.drawBackgroundImage(graphics2D24, rectangle2D25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        boolean boolean29 = multiplePiePlot28.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        boolean boolean32 = multiplePiePlot31.isSubplot();
        multiplePiePlot31.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot28.setParent((org.jfree.chart.plot.Plot) multiplePiePlot31);
        java.awt.Stroke stroke36 = multiplePiePlot31.getOutlineStroke();
        multiplePiePlot31.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot40 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset39);
        java.lang.String str41 = multiplePiePlot40.getNoDataMessage();
        java.awt.Image image42 = null;
        multiplePiePlot40.setBackgroundImage(image42);
        multiplePiePlot40.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.util.RectangleInsets rectangleInsets46 = multiplePiePlot40.getInsets();
        multiplePiePlot31.setInsets(rectangleInsets46);
        plot12.setInsets(rectangleInsets46, true);
        multiplePiePlot1.setInsets(rectangleInsets46, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Multiple Pie Plot" + "'", str7, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(image21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(rectangleInsets46);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        float float6 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        boolean boolean9 = multiplePiePlot8.isSubplot();
        multiplePiePlot8.setForegroundAlpha((float) 0L);
        java.awt.Paint paint12 = multiplePiePlot8.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        multiplePiePlot8.setDataset(categoryDataset13);
        multiplePiePlot8.setLimit((double) 10.0f);
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot8.getRootPlot();
        boolean boolean18 = multiplePiePlot1.equals((java.lang.Object) plot17);
        float float19 = plot17.getForegroundAlpha();
        plot17.setNoDataMessage("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
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
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        float float7 = multiplePiePlot1.getBackgroundAlpha();
        multiplePiePlot1.setNoDataMessage("hi!");
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) 10);
        multiplePiePlot12.setBackgroundImageAlpha(0.5f);
        java.awt.Stroke stroke17 = multiplePiePlot12.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.lang.String str21 = multiplePiePlot20.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        multiplePiePlot20.markerChanged(markerChangeEvent22);
        java.awt.Image image24 = multiplePiePlot20.getBackgroundImage();
        java.lang.Comparable comparable25 = multiplePiePlot20.getAggregatedItemsKey();
        org.jfree.chart.JFreeChart jFreeChart26 = multiplePiePlot20.getPieChart();
        java.awt.Paint paint27 = multiplePiePlot20.getOutlinePaint();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot20);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(image24);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + "Other" + "'", comparable25, "Other");
        org.junit.Assert.assertNotNull(jFreeChart26);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        boolean boolean5 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.general.DatasetGroup datasetGroup6 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.setForegroundAlpha((float) (byte) 0);
        boolean boolean9 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.util.TableOrder tableOrder10 = multiplePiePlot1.getDataExtractOrder();
        java.lang.String str11 = multiplePiePlot1.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        boolean boolean14 = multiplePiePlot13.isSubplot();
        multiplePiePlot13.setForegroundAlpha((float) 0L);
        java.awt.Paint paint17 = multiplePiePlot13.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        multiplePiePlot13.setDataset(categoryDataset18);
        multiplePiePlot13.setLimit((double) 10.0f);
        org.jfree.chart.util.TableOrder tableOrder22 = multiplePiePlot13.getDataExtractOrder();
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot13.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(tableOrder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Multiple Pie Plot" + "'", str11, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(tableOrder22);
        org.junit.Assert.assertNotNull(jFreeChart23);
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
        multiplePiePlot1.setLimit((double) (-1L));
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent10);
        multiplePiePlot1.zoom((double) 10.0f);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
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
        org.junit.Assert.assertNull(plot14);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        boolean boolean8 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.lang.String str11 = multiplePiePlot10.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot10.markerChanged(markerChangeEvent12);
        java.awt.Image image14 = multiplePiePlot10.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset15 = multiplePiePlot10.getDataset();
        java.awt.Paint paint16 = multiplePiePlot10.getAggregatedItemsPaint();
        java.lang.Comparable comparable17 = multiplePiePlot10.getAggregatedItemsKey();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent18 = null;
        multiplePiePlot10.axisChanged(axisChangeEvent18);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = multiplePiePlot10.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = null;
        multiplePiePlot22.setDrawingSupplier(drawingSupplier23);
        boolean boolean26 = multiplePiePlot22.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot27 = multiplePiePlot22.getRootPlot();
        plot27.setBackgroundImageAlpha((float) 1);
        plot27.setBackgroundAlpha((float) (byte) -1);
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        java.lang.String str34 = multiplePiePlot33.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent35 = null;
        multiplePiePlot33.markerChanged(markerChangeEvent35);
        float float37 = multiplePiePlot33.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot38 = multiplePiePlot33.getParent();
        org.jfree.chart.plot.Plot plot39 = multiplePiePlot33.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot41 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset40);
        boolean boolean42 = multiplePiePlot41.isSubplot();
        multiplePiePlot41.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo47 = null;
        multiplePiePlot41.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo47);
        org.jfree.data.category.CategoryDataset categoryDataset49 = null;
        multiplePiePlot41.setDataset(categoryDataset49);
        org.jfree.chart.JFreeChart jFreeChart51 = multiplePiePlot41.getPieChart();
        plot39.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart51);
        plot27.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart51);
        multiplePiePlot10.setPieChart(jFreeChart51);
        org.jfree.chart.util.TableOrder tableOrder55 = multiplePiePlot10.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset56 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot57 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset56);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier58 = null;
        multiplePiePlot57.setDrawingSupplier(drawingSupplier58);
        float float60 = multiplePiePlot57.getBackgroundImageAlpha();
        multiplePiePlot57.setBackgroundAlpha((float) (-1L));
        org.jfree.chart.util.RectangleInsets rectangleInsets63 = multiplePiePlot57.getInsets();
        multiplePiePlot10.setInsets(rectangleInsets63);
        boolean boolean65 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + "Other" + "'", comparable17, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(plot27);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 1.0f + "'", float37 == 1.0f);
        org.junit.Assert.assertNull(plot38);
        org.junit.Assert.assertNotNull(plot39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jFreeChart51);
        org.junit.Assert.assertNotNull(tableOrder55);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 0.5f + "'", float60 == 0.5f);
        org.junit.Assert.assertNotNull(rectangleInsets63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
        java.awt.Paint paint14 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint15 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener16);
        multiplePiePlot1.setBackgroundAlpha((float) 1L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
        int int14 = plot13.getBackgroundImageAlignment();
        java.awt.Stroke stroke15 = plot13.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        boolean boolean12 = multiplePiePlot11.isSubplot();
        multiplePiePlot11.setForegroundAlpha((float) 0L);
        java.awt.Paint paint15 = multiplePiePlot11.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        multiplePiePlot11.setDataset(categoryDataset16);
        java.awt.Font font18 = multiplePiePlot11.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font18);
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D20, rectangle2D21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font18);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        java.lang.String str8 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        boolean boolean14 = multiplePiePlot13.isSubplot();
        multiplePiePlot13.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot10.setParent((org.jfree.chart.plot.Plot) multiplePiePlot13);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        multiplePiePlot10.handleClick((int) (short) -1, (-1), plotRenderingInfo20);
        multiplePiePlot10.setForegroundAlpha((float) (-1));
        java.awt.Paint paint24 = multiplePiePlot10.getNoDataMessagePaint();
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) 100.0d);
        float float27 = multiplePiePlot10.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        java.awt.Paint paint29 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.5f + "'", float27 == 0.5f);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setLimit((double) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        boolean boolean10 = multiplePiePlot9.isSubplot();
        java.awt.Paint paint11 = multiplePiePlot9.getBackgroundPaint();
        java.awt.Paint paint12 = multiplePiePlot9.getNoDataMessagePaint();
        multiplePiePlot9.setLimit((double) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot16.setDrawingSupplier(drawingSupplier17);
        boolean boolean20 = multiplePiePlot16.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot16.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        java.lang.String str24 = multiplePiePlot23.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener25 = null;
        multiplePiePlot23.addChangeListener(plotChangeListener25);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = multiplePiePlot23.getDrawingSupplier();
        java.awt.Paint paint28 = multiplePiePlot23.getNoDataMessagePaint();
        multiplePiePlot16.setBackgroundPaint(paint28);
        multiplePiePlot9.setBackgroundPaint(paint28);
        multiplePiePlot1.setNoDataMessagePaint(paint28);
        float float32 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.util.TableOrder tableOrder33 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(plot21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(drawingSupplier27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.5f + "'", float32 == 0.5f);
        org.junit.Assert.assertNotNull(tableOrder33);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.lang.String str9 = multiplePiePlot1.getPlotType();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Stroke stroke11 = multiplePiePlot1.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier14);
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot13.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        java.awt.Paint paint20 = multiplePiePlot18.getBackgroundPaint();
        float float21 = multiplePiePlot18.getForegroundAlpha();
        boolean boolean22 = multiplePiePlot18.isOutlineVisible();
        org.jfree.data.general.DatasetGroup datasetGroup23 = multiplePiePlot18.getDatasetGroup();
        multiplePiePlot18.setForegroundAlpha((float) (byte) 0);
        boolean boolean26 = multiplePiePlot18.isOutlineVisible();
        org.jfree.chart.util.TableOrder tableOrder27 = multiplePiePlot18.getDataExtractOrder();
        multiplePiePlot13.setDataExtractOrder(tableOrder27);
        org.jfree.data.general.DatasetGroup datasetGroup29 = multiplePiePlot13.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        java.lang.String str32 = multiplePiePlot31.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        java.lang.String str35 = multiplePiePlot34.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent36 = null;
        multiplePiePlot34.markerChanged(markerChangeEvent36);
        java.awt.Paint paint38 = multiplePiePlot34.getAggregatedItemsPaint();
        multiplePiePlot31.setOutlinePaint(paint38);
        java.lang.String str40 = multiplePiePlot31.getPlotType();
        java.lang.String str41 = multiplePiePlot31.getNoDataMessage();
        float float42 = multiplePiePlot31.getBackgroundImageAlpha();
        multiplePiePlot31.setLimit(100.0d);
        java.awt.Paint paint45 = multiplePiePlot31.getNoDataMessagePaint();
        multiplePiePlot13.setOutlinePaint(paint45);
        multiplePiePlot1.setAggregatedItemsPaint(paint45);
        org.jfree.chart.util.TableOrder tableOrder48 = multiplePiePlot1.getDataExtractOrder();
        boolean boolean49 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Multiple Pie Plot" + "'", str9, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(plot16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(datasetGroup23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(tableOrder27);
        org.junit.Assert.assertNull(datasetGroup29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Multiple Pie Plot" + "'", str40, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.5f + "'", float42 == 0.5f);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(tableOrder48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent10);
        multiplePiePlot1.setOutlineVisible(true);
        java.awt.Image image14 = multiplePiePlot1.getBackgroundImage();
        java.lang.String str15 = multiplePiePlot1.getPlotType();
        multiplePiePlot1.zoom((double) 0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        boolean boolean20 = multiplePiePlot19.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        boolean boolean23 = multiplePiePlot22.isSubplot();
        multiplePiePlot22.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot19.setParent((org.jfree.chart.plot.Plot) multiplePiePlot22);
        java.awt.Stroke stroke27 = multiplePiePlot22.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke27);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Multiple Pie Plot" + "'", str15, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(stroke27);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        java.awt.Paint paint14 = multiplePiePlot4.getAggregatedItemsPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent15 = null;
        multiplePiePlot4.datasetChanged(datasetChangeEvent15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        boolean boolean7 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot1.getDrawingSupplier();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(drawingSupplier8);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) -1);
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.lang.String str15 = multiplePiePlot14.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot14.addChangeListener(plotChangeListener16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = multiplePiePlot14.getDrawingSupplier();
        java.awt.Paint paint19 = multiplePiePlot14.getNoDataMessagePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = multiplePiePlot14.getDrawingSupplier();
        float float21 = multiplePiePlot14.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot14);
        java.awt.Font font23 = multiplePiePlot14.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        boolean boolean26 = multiplePiePlot25.isSubplot();
        java.awt.Paint paint27 = multiplePiePlot25.getBackgroundPaint();
        java.awt.Paint paint28 = multiplePiePlot25.getNoDataMessagePaint();
        java.awt.Paint paint29 = multiplePiePlot25.getNoDataMessagePaint();
        multiplePiePlot14.setNoDataMessagePaint(paint29);
        java.awt.Paint paint31 = multiplePiePlot14.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(drawingSupplier18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(drawingSupplier20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        multiplePiePlot1.setDataset(categoryDataset8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier12);
        boolean boolean15 = multiplePiePlot11.equals((java.lang.Object) 1.0d);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot11);
        multiplePiePlot11.setNoDataMessage("Other");
        multiplePiePlot11.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot11.getRootPlot();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(jFreeChart6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(plot21);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        multiplePiePlot13.setAggregatedItemsKey((java.lang.Comparable) 10);
        multiplePiePlot13.setNoDataMessage("");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot18.setBackgroundImageAlpha((float) (byte) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = multiplePiePlot18.getInsets();
        multiplePiePlot13.setInsets(rectangleInsets21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        boolean boolean25 = multiplePiePlot24.isSubplot();
        multiplePiePlot24.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        multiplePiePlot24.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        multiplePiePlot24.setDataset(categoryDataset32);
        java.awt.Font font34 = multiplePiePlot24.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        boolean boolean37 = multiplePiePlot36.isSubplot();
        multiplePiePlot36.setForegroundAlpha((float) 0L);
        multiplePiePlot36.setOutlineVisible(true);
        org.jfree.chart.JFreeChart jFreeChart42 = multiplePiePlot36.getPieChart();
        multiplePiePlot24.setPieChart(jFreeChart42);
        multiplePiePlot13.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart42);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart42);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(font34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jFreeChart42);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        java.lang.String str10 = multiplePiePlot4.getNoDataMessage();
        boolean boolean11 = multiplePiePlot4.isSubplot();
        java.lang.Object obj12 = multiplePiePlot4.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = multiplePiePlot4.getInsets();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
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
        multiplePiePlot1.setForegroundAlpha((float) (-1));
        java.awt.Paint paint15 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 100.0d);
        float float18 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        boolean boolean21 = multiplePiePlot20.isSubplot();
        multiplePiePlot20.setForegroundAlpha((float) 0L);
        java.awt.Paint paint24 = multiplePiePlot20.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        multiplePiePlot20.setDataset(categoryDataset25);
        multiplePiePlot20.setLimit((double) 10.0f);
        org.jfree.chart.util.TableOrder tableOrder29 = multiplePiePlot20.getDataExtractOrder();
        java.awt.Paint paint30 = multiplePiePlot20.getAggregatedItemsPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier34 = null;
        multiplePiePlot33.setDrawingSupplier(drawingSupplier34);
        boolean boolean37 = multiplePiePlot33.equals((java.lang.Object) 1.0d);
        boolean boolean38 = multiplePiePlot33.isOutlineVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo41 = null;
        multiplePiePlot33.handleClick((int) (short) 0, 0, plotRenderingInfo41);
        java.lang.Object obj43 = null;
        boolean boolean44 = multiplePiePlot33.equals(obj43);
        java.awt.Graphics2D graphics2D45 = null;
        java.awt.geom.Rectangle2D rectangle2D46 = null;
        multiplePiePlot33.drawBackgroundImage(graphics2D45, rectangle2D46);
        org.jfree.chart.JFreeChart jFreeChart48 = multiplePiePlot33.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart48);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(tableOrder29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jFreeChart48);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.setLimit((double) (-1L));
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent10);
        multiplePiePlot1.zoom((double) 10.0f);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        org.jfree.chart.JFreeChart jFreeChart15 = multiplePiePlot1.getPieChart();
        java.awt.Font font16 = multiplePiePlot1.getNoDataMessageFont();
        java.awt.Font font17 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(plot14);
        org.junit.Assert.assertNotNull(jFreeChart15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(font17);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        multiplePiePlot1.setBackgroundAlpha(10.0f);
        multiplePiePlot1.setBackgroundImageAlignment((int) ' ');
        java.awt.Paint paint8 = multiplePiePlot1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
        multiplePiePlot1.setNoDataMessage("Other");
        float float15 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        multiplePiePlot1.setDataset(categoryDataset8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent11);
        boolean boolean13 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Image image4 = null;
        multiplePiePlot1.setBackgroundImage(image4);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = null;
        multiplePiePlot7.setDrawingSupplier(drawingSupplier8);
        java.awt.Image image10 = null;
        multiplePiePlot7.setBackgroundImage(image10);
        boolean boolean12 = multiplePiePlot7.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        multiplePiePlot7.setDataset(categoryDataset13);
        java.lang.String str15 = multiplePiePlot7.getNoDataMessage();
        java.awt.Image image16 = multiplePiePlot7.getBackgroundImage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent17 = null;
        multiplePiePlot7.datasetChanged(datasetChangeEvent17);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot7);
        multiplePiePlot7.setLimit((double) 10);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = multiplePiePlot7.getInsets();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(image16);
        org.junit.Assert.assertNotNull(rectangleInsets22);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Paint paint6 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        java.awt.Image image8 = multiplePiePlot1.getBackgroundImage();
        java.awt.Image image9 = null;
        multiplePiePlot1.setBackgroundImage(image9);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(image8);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Image image4 = null;
        multiplePiePlot1.setBackgroundImage(image4);
        boolean boolean6 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        multiplePiePlot1.setDataset(categoryDataset7);
        java.lang.String str9 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.setOutlineVisible(false);
        java.awt.Paint paint12 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent10);
        multiplePiePlot1.setOutlineVisible(true);
        float float14 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Image image15 = null;
        multiplePiePlot1.setBackgroundImage(image15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        boolean boolean7 = multiplePiePlot6.isSubplot();
        java.awt.Paint paint8 = multiplePiePlot6.getBackgroundPaint();
        float float9 = multiplePiePlot6.getForegroundAlpha();
        boolean boolean10 = multiplePiePlot6.isOutlineVisible();
        org.jfree.data.general.DatasetGroup datasetGroup11 = multiplePiePlot6.getDatasetGroup();
        multiplePiePlot6.setForegroundAlpha((float) (byte) 0);
        boolean boolean14 = multiplePiePlot6.isOutlineVisible();
        org.jfree.chart.util.TableOrder tableOrder15 = multiplePiePlot6.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder15);
        org.jfree.data.general.DatasetGroup datasetGroup17 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.lang.String str20 = multiplePiePlot19.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.lang.String str23 = multiplePiePlot22.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        multiplePiePlot22.markerChanged(markerChangeEvent24);
        java.awt.Paint paint26 = multiplePiePlot22.getAggregatedItemsPaint();
        multiplePiePlot19.setOutlinePaint(paint26);
        java.lang.String str28 = multiplePiePlot19.getPlotType();
        java.lang.String str29 = multiplePiePlot19.getNoDataMessage();
        float float30 = multiplePiePlot19.getBackgroundImageAlpha();
        multiplePiePlot19.setLimit(100.0d);
        java.awt.Paint paint33 = multiplePiePlot19.getNoDataMessagePaint();
        multiplePiePlot1.setOutlinePaint(paint33);
        java.awt.Image image35 = null;
        multiplePiePlot1.setBackgroundImage(image35);
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(datasetGroup11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(tableOrder15);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Multiple Pie Plot" + "'", str28, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.5f + "'", float30 == 0.5f);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
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
        double double17 = multiplePiePlot1.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        boolean boolean20 = multiplePiePlot19.isSubplot();
        multiplePiePlot19.setForegroundAlpha((float) 0L);
        java.awt.Paint paint23 = multiplePiePlot19.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        multiplePiePlot19.setDataset(categoryDataset24);
        multiplePiePlot19.setLimit((double) 10.0f);
        org.jfree.chart.plot.Plot plot28 = multiplePiePlot19.getRootPlot();
        java.awt.Stroke stroke29 = plot28.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke29);
        boolean boolean31 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(plot28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        multiplePiePlot1.setDataset(categoryDataset5);
        boolean boolean7 = multiplePiePlot1.isOutlineVisible();
        boolean boolean8 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        java.awt.Paint paint13 = multiplePiePlot1.getAggregatedItemsPaint();
        multiplePiePlot1.zoom((double) (short) 100);
        boolean boolean17 = multiplePiePlot1.equals((java.lang.Object) '#');
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder19 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot1.getParent();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(drawingSupplier18);
        org.junit.Assert.assertNotNull(tableOrder19);
        org.junit.Assert.assertNull(plot20);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        java.awt.Image image9 = null;
        multiplePiePlot7.setBackgroundImage(image9);
        multiplePiePlot7.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        boolean boolean15 = multiplePiePlot14.isSubplot();
        multiplePiePlot14.setOutlineVisible(false);
        org.jfree.chart.util.TableOrder tableOrder18 = multiplePiePlot14.getDataExtractOrder();
        multiplePiePlot7.setDataExtractOrder(tableOrder18);
        multiplePiePlot1.setDataExtractOrder(tableOrder18);
        java.awt.Paint paint21 = multiplePiePlot1.getAggregatedItemsPaint();
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
        java.lang.String str32 = multiplePiePlot23.getPlotType();
        java.awt.Paint paint33 = multiplePiePlot23.getAggregatedItemsPaint();
        java.awt.Image image34 = null;
        multiplePiePlot23.setBackgroundImage(image34);
        org.jfree.chart.util.TableOrder tableOrder36 = multiplePiePlot23.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder36);
        org.jfree.chart.LegendItemCollection legendItemCollection38 = multiplePiePlot1.getLegendItems();
        int int39 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(tableOrder18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Multiple Pie Plot" + "'", str32, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(tableOrder36);
        org.junit.Assert.assertNotNull(legendItemCollection38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 15 + "'", int39 == 15);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        multiplePiePlot1.setOutlineVisible(true);
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent8);
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        java.lang.Object obj11 = multiplePiePlot1.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        java.awt.Image image3 = null;
        multiplePiePlot1.setBackgroundImage(image3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        multiplePiePlot1.setForegroundAlpha((float) (short) -1);
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
        java.lang.String str18 = multiplePiePlot9.getPlotType();
        org.jfree.chart.LegendItemCollection legendItemCollection19 = multiplePiePlot9.getLegendItems();
        java.lang.String str20 = multiplePiePlot9.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        boolean boolean23 = multiplePiePlot22.isSubplot();
        multiplePiePlot22.setForegroundAlpha((float) 0L);
        multiplePiePlot22.setOutlineVisible(true);
        org.jfree.chart.JFreeChart jFreeChart28 = multiplePiePlot22.getPieChart();
        multiplePiePlot9.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart28);
        java.awt.Paint paint30 = multiplePiePlot9.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint30);
        java.awt.Graphics2D graphics2D32 = null;
        java.awt.geom.Rectangle2D rectangle2D33 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D32, rectangle2D33);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Multiple Pie Plot" + "'", str18, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(legendItemCollection19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Multiple Pie Plot" + "'", str20, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jFreeChart28);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
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
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D13, rectangle2D14);
        java.awt.Font font16 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        java.lang.String str19 = multiplePiePlot18.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        multiplePiePlot18.addChangeListener(plotChangeListener20);
        java.awt.Image image22 = multiplePiePlot18.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot18.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = multiplePiePlot18.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        multiplePiePlot18.setDataset(categoryDataset25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = null;
        multiplePiePlot28.setDrawingSupplier(drawingSupplier29);
        boolean boolean32 = multiplePiePlot28.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint33 = multiplePiePlot28.getOutlinePaint();
        multiplePiePlot18.setBackgroundPaint(paint33);
        multiplePiePlot1.setAggregatedItemsPaint(paint33);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent36 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent36);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(image22);
        org.junit.Assert.assertNotNull(jFreeChart23);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        boolean boolean9 = multiplePiePlot1.isSubplot();
        double double10 = multiplePiePlot1.getLimit();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot1.getDrawingSupplier();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier11);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        multiplePiePlot1.setLimit(10.0d);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        multiplePiePlot1.handleClick(1, 1, plotRenderingInfo9);
        java.lang.String str11 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        multiplePiePlot13.addChangeListener(plotChangeListener15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = multiplePiePlot13.getDrawingSupplier();
        java.lang.String str18 = multiplePiePlot13.getNoDataMessage();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = multiplePiePlot13.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier19);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(drawingSupplier17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(drawingSupplier19);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        java.lang.Comparable comparable8 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.plot.Plot plot9 = null;
        multiplePiePlot1.setParent(plot9);
        java.awt.Stroke stroke11 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + "Other" + "'", comparable8, "Other");
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) -1);
        float float11 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot14.setDrawingSupplier(drawingSupplier15);
        boolean boolean18 = multiplePiePlot14.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint19 = multiplePiePlot14.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection20 = multiplePiePlot14.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = multiplePiePlot14.getInsets();
        float float22 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset23 = multiplePiePlot14.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        boolean boolean26 = multiplePiePlot25.isSubplot();
        multiplePiePlot25.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        multiplePiePlot25.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo31);
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = multiplePiePlot25.getInsets();
        org.jfree.chart.plot.Plot plot34 = multiplePiePlot25.getParent();
        boolean boolean35 = multiplePiePlot14.equals((java.lang.Object) multiplePiePlot25);
        plot12.setParent((org.jfree.chart.plot.Plot) multiplePiePlot25);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = null;
        plot12.handleClick(15, (int) (byte) 10, plotRenderingInfo39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(legendItemCollection20);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNull(plot34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        float float7 = plot6.getBackgroundAlpha();
        plot6.zoom(100.0d);
        float float10 = plot6.getForegroundAlpha();
        java.awt.Font font11 = plot6.getNoDataMessageFont();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        plot6.drawBackgroundImage(graphics2D12, rectangle2D13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(font11);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        float float7 = plot4.getBackgroundImageAlpha();
        plot4.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = plot4.getDrawingSupplier();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot4.drawBackground(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNull(drawingSupplier10);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        java.lang.Comparable comparable8 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.Comparable comparable9 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        multiplePiePlot1.setLimit((double) 100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + "Other" + "'", comparable8, "Other");
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        multiplePiePlot1.setBackgroundAlpha((float) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        boolean boolean9 = multiplePiePlot8.isSubplot();
        multiplePiePlot8.setForegroundAlpha((float) 0L);
        multiplePiePlot8.setOutlineVisible(true);
        org.jfree.chart.JFreeChart jFreeChart14 = multiplePiePlot8.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart14);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = multiplePiePlot1.getDrawingSupplier();
        multiplePiePlot1.zoom((double) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        boolean boolean21 = multiplePiePlot20.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        boolean boolean24 = multiplePiePlot23.isSubplot();
        multiplePiePlot23.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot20.setParent((org.jfree.chart.plot.Plot) multiplePiePlot23);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = multiplePiePlot23.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = multiplePiePlot23.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets29);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jFreeChart14);
        org.junit.Assert.assertNull(drawingSupplier16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(rectangleInsets29);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        multiplePiePlot1.setForegroundAlpha((float) '#');
        java.awt.Paint paint8 = multiplePiePlot1.getOutlinePaint();
        boolean boolean9 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNull(plot5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(categoryDataset10);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) 10);
        multiplePiePlot11.setNoDataMessage("");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot16.setBackgroundImageAlpha((float) (byte) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = multiplePiePlot16.getInsets();
        multiplePiePlot11.setInsets(rectangleInsets19);
        multiplePiePlot1.setInsets(rectangleInsets19);
        org.jfree.chart.plot.Plot plot22 = multiplePiePlot1.getRootPlot();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(plot22);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        plot6.setBackgroundImageAlpha((float) 1);
        plot6.setBackgroundAlpha((float) (byte) -1);
        boolean boolean11 = plot6.isSubplot();
        org.jfree.chart.plot.Plot plot12 = plot6.getRootPlot();
        plot12.setNoDataMessage("");
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        boolean boolean17 = multiplePiePlot16.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        boolean boolean20 = multiplePiePlot19.isSubplot();
        multiplePiePlot19.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot16.setParent((org.jfree.chart.plot.Plot) multiplePiePlot19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        multiplePiePlot16.handleClick((int) (short) -1, (-1), plotRenderingInfo26);
        multiplePiePlot16.setForegroundAlpha((float) (-1));
        java.awt.Paint paint30 = multiplePiePlot16.getNoDataMessagePaint();
        multiplePiePlot16.setAggregatedItemsKey((java.lang.Comparable) 100.0d);
        float float33 = multiplePiePlot16.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        boolean boolean36 = multiplePiePlot35.isSubplot();
        multiplePiePlot35.setForegroundAlpha((float) 0L);
        java.awt.Paint paint39 = multiplePiePlot35.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        multiplePiePlot35.setDataset(categoryDataset40);
        multiplePiePlot35.setLimit((double) 10.0f);
        org.jfree.chart.util.TableOrder tableOrder44 = multiplePiePlot35.getDataExtractOrder();
        java.awt.Paint paint45 = multiplePiePlot35.getAggregatedItemsPaint();
        multiplePiePlot16.setAggregatedItemsPaint(paint45);
        plot12.setOutlinePaint(paint45);
        org.jfree.data.category.CategoryDataset categoryDataset48 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot49 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset48);
        java.lang.String str50 = multiplePiePlot49.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener51 = null;
        multiplePiePlot49.addChangeListener(plotChangeListener51);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier53 = multiplePiePlot49.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset54 = null;
        multiplePiePlot49.setDataset(categoryDataset54);
        java.awt.Stroke stroke56 = multiplePiePlot49.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset57 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot58 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset57);
        boolean boolean59 = multiplePiePlot58.isSubplot();
        multiplePiePlot58.setForegroundAlpha((float) 0L);
        multiplePiePlot58.setOutlineVisible(true);
        java.awt.Font font64 = multiplePiePlot58.getNoDataMessageFont();
        multiplePiePlot49.setNoDataMessageFont(font64);
        plot12.setNoDataMessageFont(font64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.5f + "'", float33 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(tableOrder44);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(drawingSupplier53);
        org.junit.Assert.assertNotNull(stroke56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(font64);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        multiplePiePlot1.setDataset(categoryDataset9);
        org.jfree.chart.JFreeChart jFreeChart11 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset14 = multiplePiePlot1.getDataset();
        org.jfree.chart.JFreeChart jFreeChart15 = multiplePiePlot1.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = multiplePiePlot1.getInsets();
        multiplePiePlot1.setLimit((double) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNotNull(jFreeChart15);
        org.junit.Assert.assertNotNull(rectangleInsets16);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        boolean boolean12 = multiplePiePlot11.isSubplot();
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        multiplePiePlot11.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo17);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = multiplePiePlot11.getInsets();
        org.jfree.chart.util.TableOrder tableOrder20 = multiplePiePlot11.getDataExtractOrder();
        boolean boolean21 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot11);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(tableOrder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        float float7 = plot4.getBackgroundImageAlpha();
        plot4.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.plot.Plot plot10 = plot4.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = plot4.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        boolean boolean14 = multiplePiePlot13.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        boolean boolean17 = multiplePiePlot16.isSubplot();
        multiplePiePlot16.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot13.setParent((org.jfree.chart.plot.Plot) multiplePiePlot16);
        java.awt.Paint paint21 = multiplePiePlot16.getOutlinePaint();
        plot4.setNoDataMessagePaint(paint21);
        java.awt.Paint paint23 = plot4.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        multiplePiePlot10.setForegroundAlpha((float) 0L);
        multiplePiePlot10.setOutlineVisible(true);
        org.jfree.chart.JFreeChart jFreeChart16 = multiplePiePlot10.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart16);
        java.awt.Stroke stroke18 = null;
        multiplePiePlot1.setOutlineStroke(stroke18);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = multiplePiePlot1.getDrawingSupplier();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jFreeChart16);
        org.junit.Assert.assertNotNull(drawingSupplier20);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.plot.Plot plot9 = null;
        multiplePiePlot1.setParent(plot9);
        java.awt.Image image11 = null;
        multiplePiePlot1.setBackgroundImage(image11);
        float float13 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeListener plotChangeListener14 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot17.setDrawingSupplier(drawingSupplier18);
        boolean boolean21 = multiplePiePlot17.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint22 = multiplePiePlot17.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection23 = multiplePiePlot17.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = multiplePiePlot17.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        boolean boolean27 = multiplePiePlot26.isSubplot();
        multiplePiePlot26.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = null;
        multiplePiePlot26.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        java.lang.String str36 = multiplePiePlot35.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        java.lang.String str39 = multiplePiePlot38.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent40 = null;
        multiplePiePlot38.markerChanged(markerChangeEvent40);
        java.awt.Paint paint42 = multiplePiePlot38.getAggregatedItemsPaint();
        multiplePiePlot35.setOutlinePaint(paint42);
        java.lang.String str44 = multiplePiePlot35.getPlotType();
        java.awt.Paint paint45 = multiplePiePlot35.getOutlinePaint();
        multiplePiePlot26.setAggregatedItemsPaint(paint45);
        multiplePiePlot17.setNoDataMessagePaint(paint45);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent48 = null;
        multiplePiePlot17.markerChanged(markerChangeEvent48);
        org.jfree.chart.JFreeChart jFreeChart50 = multiplePiePlot17.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart50);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(legendItemCollection23);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Multiple Pie Plot" + "'", str44, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(jFreeChart50);
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
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier9);
        boolean boolean12 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint13 = multiplePiePlot8.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection14 = multiplePiePlot8.getLegendItems();
        multiplePiePlot8.setLimit((double) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        multiplePiePlot18.setOutlineVisible(false);
        org.jfree.chart.util.TableOrder tableOrder22 = multiplePiePlot18.getDataExtractOrder();
        multiplePiePlot8.setDataExtractOrder(tableOrder22);
        boolean boolean24 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot8);
        multiplePiePlot8.setForegroundAlpha((float) (byte) 10);
        float float27 = multiplePiePlot8.getBackgroundImageAlpha();
        java.awt.Image image28 = multiplePiePlot8.getBackgroundImage();
        float float29 = multiplePiePlot8.getForegroundAlpha();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tableOrder22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.5f + "'", float27 == 0.5f);
        org.junit.Assert.assertNull(image28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 10.0f + "'", float29 == 10.0f);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        java.awt.Paint paint6 = multiplePiePlot4.getBackgroundPaint();
        java.awt.Paint paint7 = multiplePiePlot4.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        multiplePiePlot4.setDataset(categoryDataset8);
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        multiplePiePlot4.removeChangeListener(plotChangeListener10);
        boolean boolean12 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot4);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent13);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 0);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot1.getInsets();
        float float8 = multiplePiePlot1.getBackgroundImageAlpha();
        boolean boolean9 = multiplePiePlot1.isOutlineVisible();
        float float10 = multiplePiePlot1.getBackgroundAlpha();
        multiplePiePlot1.setBackgroundImageAlpha((float) (byte) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(jFreeChart6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
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
        org.jfree.data.general.DatasetGroup datasetGroup12 = multiplePiePlot1.getDatasetGroup();
        org.jfree.chart.JFreeChart jFreeChart13 = multiplePiePlot1.getPieChart();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        java.awt.geom.Point2D point2D16 = null;
        org.jfree.chart.plot.PlotState plotState17 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D14, rectangle2D15, point2D16, plotState17, plotRenderingInfo18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(datasetGroup12);
        org.junit.Assert.assertNotNull(jFreeChart13);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
        java.awt.Paint paint14 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint15 = multiplePiePlot1.getAggregatedItemsPaint();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
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
        java.awt.Paint paint17 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection18 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = multiplePiePlot1.getInsets();
        java.lang.Comparable comparable20 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(legendItemCollection18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + "Other" + "'", comparable20, "Other");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
        java.lang.String str6 = multiplePiePlot1.getPlotType();
        float float7 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
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
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot4.setDataset(categoryDataset12);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot4.notifyListeners(plotChangeEvent14);
        boolean boolean17 = multiplePiePlot4.equals((java.lang.Object) 1L);
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        multiplePiePlot4.removeChangeListener(plotChangeListener18);
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot4.getRootPlot();
        java.awt.Paint paint21 = multiplePiePlot4.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        boolean boolean9 = multiplePiePlot8.isSubplot();
        multiplePiePlot8.setForegroundAlpha((float) 0L);
        java.awt.Paint paint12 = multiplePiePlot8.getNoDataMessagePaint();
        float float13 = multiplePiePlot8.getBackgroundAlpha();
        org.jfree.chart.util.TableOrder tableOrder14 = multiplePiePlot8.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(tableOrder14);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) -1);
        float float11 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot14.setDrawingSupplier(drawingSupplier15);
        boolean boolean18 = multiplePiePlot14.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint19 = multiplePiePlot14.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection20 = multiplePiePlot14.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = multiplePiePlot14.getInsets();
        float float22 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset23 = multiplePiePlot14.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        boolean boolean26 = multiplePiePlot25.isSubplot();
        multiplePiePlot25.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        multiplePiePlot25.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo31);
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = multiplePiePlot25.getInsets();
        org.jfree.chart.plot.Plot plot34 = multiplePiePlot25.getParent();
        boolean boolean35 = multiplePiePlot14.equals((java.lang.Object) multiplePiePlot25);
        plot12.setParent((org.jfree.chart.plot.Plot) multiplePiePlot25);
        multiplePiePlot25.setLimit((double) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(legendItemCollection20);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNull(plot34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        java.lang.String str6 = multiplePiePlot1.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        java.awt.Paint paint8 = multiplePiePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = multiplePiePlot1.getInsets();
        multiplePiePlot1.setNoDataMessage("");
        multiplePiePlot1.setForegroundAlpha((float) 10L);
        org.jfree.chart.util.TableOrder tableOrder18 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.general.DatasetGroup datasetGroup19 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(tableOrder18);
        org.junit.Assert.assertNull(datasetGroup19);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent14 = null;
        multiplePiePlot4.axisChanged(axisChangeEvent14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        multiplePiePlot4.setDataset(categoryDataset16);
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot4.getRootPlot();
        multiplePiePlot4.setBackgroundAlpha((float) 100L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(plot18);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        multiplePiePlot10.setForegroundAlpha((float) 0L);
        multiplePiePlot10.setOutlineVisible(true);
        org.jfree.chart.JFreeChart jFreeChart16 = multiplePiePlot10.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart16);
        multiplePiePlot1.setNoDataMessage("");
        java.lang.Object obj20 = multiplePiePlot1.clone();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jFreeChart16);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        boolean boolean10 = multiplePiePlot4.isOutlineVisible();
        java.awt.Stroke stroke11 = multiplePiePlot4.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = multiplePiePlot4.getInsets();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setForegroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.lang.String str11 = multiplePiePlot10.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot10.markerChanged(markerChangeEvent12);
        java.awt.Paint paint14 = multiplePiePlot10.getAggregatedItemsPaint();
        multiplePiePlot7.setOutlinePaint(paint14);
        java.lang.String str16 = multiplePiePlot7.getPlotType();
        java.lang.String str17 = multiplePiePlot7.getNoDataMessage();
        float float18 = multiplePiePlot7.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot7.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart19);
        java.lang.Object obj21 = multiplePiePlot1.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Multiple Pie Plot" + "'", str16, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        java.awt.Image image3 = null;
        multiplePiePlot1.setBackgroundImage(image3);
        java.lang.Object obj5 = multiplePiePlot1.clone();
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        java.awt.Paint paint13 = multiplePiePlot1.getNoDataMessagePaint();
        float float14 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setBackgroundImageAlpha((float) (byte) 0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent3);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setBackgroundImageAlpha(1.0f);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier11);
        boolean boolean14 = multiplePiePlot10.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot10.getRootPlot();
        java.awt.Image image16 = null;
        plot15.setBackgroundImage(image16);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        plot15.drawBackgroundImage(graphics2D18, rectangle2D19);
        boolean boolean21 = multiplePiePlot1.equals((java.lang.Object) plot15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(jFreeChart6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        java.awt.Paint paint7 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable8 = multiplePiePlot1.getAggregatedItemsKey();
        java.lang.Comparable comparable9 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot11.markerChanged(markerChangeEvent13);
        java.awt.Paint paint15 = multiplePiePlot11.getAggregatedItemsPaint();
        java.lang.Comparable comparable16 = multiplePiePlot11.getAggregatedItemsKey();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent17 = null;
        multiplePiePlot11.axisChanged(axisChangeEvent17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        boolean boolean21 = multiplePiePlot20.isSubplot();
        multiplePiePlot20.setForegroundAlpha((float) 0L);
        multiplePiePlot20.setOutlineVisible(true);
        org.jfree.chart.JFreeChart jFreeChart26 = multiplePiePlot20.getPieChart();
        multiplePiePlot11.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart26);
        multiplePiePlot1.setPieChart(jFreeChart26);
        org.jfree.data.general.DatasetGroup datasetGroup29 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + "Other" + "'", comparable8, "Other");
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + "Other" + "'", comparable16, "Other");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jFreeChart26);
        org.junit.Assert.assertNull(datasetGroup29);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
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
        boolean boolean13 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.setLimit((double) (byte) 100);
        multiplePiePlot1.setLimit((double) (short) 10);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
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
        plot6.setBackgroundImageAlpha((float) 1);
        java.awt.Stroke stroke9 = plot6.getOutlineStroke();
        java.awt.Paint paint10 = null;
        plot6.setBackgroundPaint(paint10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        multiplePiePlot1.zoom((double) 10L);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.awt.Paint paint8 = multiplePiePlot7.getOutlinePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot1.getDataset();
        java.lang.String str11 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot1.setDataset(categoryDataset12);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D14, rectangle2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        boolean boolean7 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.JFreeChart jFreeChart9 = multiplePiePlot1.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot1.getPieChart();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        multiplePiePlot1.handleClick((int) (short) 10, (int) (byte) -1, plotRenderingInfo13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertNotNull(jFreeChart10);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
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
        java.awt.Paint paint11 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Image image12 = null;
        multiplePiePlot1.setBackgroundImage(image12);
        org.jfree.chart.util.TableOrder tableOrder14 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = multiplePiePlot1.getDrawingSupplier();
        multiplePiePlot1.setNoDataMessage("Other");
        org.jfree.data.category.CategoryDataset categoryDataset18 = multiplePiePlot1.getDataset();
        java.awt.Image image19 = null;
        multiplePiePlot1.setBackgroundImage(image19);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(tableOrder14);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNull(categoryDataset18);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) -1);
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.lang.String str15 = multiplePiePlot14.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot14.addChangeListener(plotChangeListener16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = multiplePiePlot14.getDrawingSupplier();
        java.awt.Paint paint19 = multiplePiePlot14.getNoDataMessagePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = multiplePiePlot14.getDrawingSupplier();
        float float21 = multiplePiePlot14.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot14);
        int int23 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent24 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent24);
        org.jfree.chart.plot.Plot plot26 = multiplePiePlot1.getParent();
        plot26.setBackgroundImageAlignment(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(drawingSupplier18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(drawingSupplier20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertNotNull(plot26);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        multiplePiePlot1.setLimit((double) 100L);
        java.awt.Stroke stroke15 = multiplePiePlot1.getOutlineStroke();
        multiplePiePlot1.setBackgroundImageAlpha(0.0f);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Multiple Pie Plot" + "'", str12, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        boolean boolean15 = multiplePiePlot14.isSubplot();
        multiplePiePlot14.setForegroundAlpha((float) 0L);
        multiplePiePlot14.setOutlineVisible(true);
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot14.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart20);
        float float22 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Multiple Pie Plot" + "'", str12, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jFreeChart20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.5f + "'", float22 == 0.5f);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        java.awt.Paint paint23 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        multiplePiePlot1.handleClick(0, (int) '4', plotRenderingInfo26);
        java.lang.String str28 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(drawingSupplier19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 10);
        multiplePiePlot1.setBackgroundImageAlpha(0.5f);
        java.awt.Stroke stroke6 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.util.TableOrder tableOrder7 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Font font8 = multiplePiePlot1.getNoDataMessageFont();
        java.lang.Comparable comparable9 = multiplePiePlot1.getAggregatedItemsKey();
        double double10 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(tableOrder7);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + 10 + "'", comparable9, 10);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        multiplePiePlot1.handleClick(100, (int) (short) 1, plotRenderingInfo9);
        double double11 = multiplePiePlot1.getLimit();
        java.awt.Stroke stroke12 = multiplePiePlot1.getOutlineStroke();
        java.lang.String str13 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        plot6.setBackgroundImageAlpha((float) 1);
        plot6.setBackgroundAlpha((float) (byte) -1);
        boolean boolean11 = plot6.isSubplot();
        org.jfree.chart.plot.Plot plot12 = plot6.getRootPlot();
        java.awt.Paint paint13 = plot6.getBackgroundPaint();
        plot6.setBackgroundAlpha((float) (byte) 100);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.lang.String str18 = multiplePiePlot17.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        multiplePiePlot17.markerChanged(markerChangeEvent19);
        java.awt.Paint paint21 = null;
        multiplePiePlot17.setBackgroundPaint(paint21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = multiplePiePlot17.getDataset();
        java.awt.Stroke stroke24 = multiplePiePlot17.getOutlineStroke();
        java.awt.Paint paint25 = multiplePiePlot17.getBackgroundPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        multiplePiePlot17.markerChanged(markerChangeEvent26);
        plot6.setParent((org.jfree.chart.plot.Plot) multiplePiePlot17);
        java.lang.String str29 = multiplePiePlot17.getPlotType();
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot17.getParent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(categoryDataset23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNull(paint25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Multiple Pie Plot" + "'", str29, "Multiple Pie Plot");
        org.junit.Assert.assertNull(plot30);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
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
        boolean boolean14 = multiplePiePlot4.isSubplot();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot4.getParent();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent16 = null;
        multiplePiePlot4.datasetChanged(datasetChangeEvent16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(plot15);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        multiplePiePlot1.setDataset(categoryDataset5);
        java.lang.String str7 = multiplePiePlot1.getPlotType();
        java.awt.Font font8 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier11);
        boolean boolean14 = multiplePiePlot10.equals((java.lang.Object) 1.0d);
        boolean boolean15 = multiplePiePlot10.isOutlineVisible();
        java.lang.String str16 = multiplePiePlot10.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent17 = null;
        multiplePiePlot10.datasetChanged(datasetChangeEvent17);
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) 1L);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot10.getDrawingSupplier();
        java.awt.Paint paint22 = multiplePiePlot10.getBackgroundPaint();
        multiplePiePlot1.setOutlinePaint(paint22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Multiple Pie Plot" + "'", str7, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(drawingSupplier21);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        java.awt.Paint paint14 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint15 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Paint paint16 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(jFreeChart17);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        java.awt.Image image3 = null;
        multiplePiePlot1.setBackgroundImage(image3);
        java.lang.Object obj5 = multiplePiePlot1.clone();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        multiplePiePlot1.handleClick((int) (short) 10, 100, plotRenderingInfo8);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
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
        multiplePiePlot1.setBackgroundAlpha((float) (short) 10);
        java.lang.Comparable comparable16 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + "Other" + "'", comparable16, "Other");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        multiplePiePlot1.handleClick(1, 10, plotRenderingInfo14);
        java.awt.Stroke stroke16 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        java.awt.Stroke stroke8 = multiplePiePlot1.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        multiplePiePlot10.setForegroundAlpha((float) 0L);
        java.awt.Paint paint14 = multiplePiePlot10.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        multiplePiePlot10.setDataset(categoryDataset15);
        java.awt.Font font17 = multiplePiePlot10.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font17);
        multiplePiePlot1.setNoDataMessage("Other");
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        multiplePiePlot1.handleClick((-1), (-1), plotRenderingInfo23);
        java.awt.Paint paint25 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNull(paint25);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        double double5 = multiplePiePlot1.getLimit();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        multiplePiePlot8.markerChanged(markerChangeEvent10);
        java.awt.Paint paint12 = null;
        multiplePiePlot8.setBackgroundPaint(paint12);
        multiplePiePlot8.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Paint paint16 = multiplePiePlot8.getNoDataMessagePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint16);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent18 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent18);
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        float float8 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.lang.String str11 = multiplePiePlot10.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        multiplePiePlot13.markerChanged(markerChangeEvent15);
        java.awt.Paint paint17 = multiplePiePlot13.getAggregatedItemsPaint();
        multiplePiePlot10.setOutlinePaint(paint17);
        java.lang.String str19 = multiplePiePlot10.getPlotType();
        org.jfree.chart.LegendItemCollection legendItemCollection20 = multiplePiePlot10.getLegendItems();
        java.lang.String str21 = multiplePiePlot10.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        boolean boolean24 = multiplePiePlot23.isSubplot();
        multiplePiePlot23.setForegroundAlpha((float) 0L);
        multiplePiePlot23.setOutlineVisible(true);
        org.jfree.chart.JFreeChart jFreeChart29 = multiplePiePlot23.getPieChart();
        multiplePiePlot10.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart29);
        java.awt.Paint paint31 = multiplePiePlot10.getAggregatedItemsPaint();
        java.lang.Comparable comparable32 = multiplePiePlot10.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = multiplePiePlot10.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets33, false);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent36 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent36);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Multiple Pie Plot" + "'", str19, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(legendItemCollection20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Multiple Pie Plot" + "'", str21, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jFreeChart29);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertEquals("'" + comparable32 + "' != '" + "Other" + "'", comparable32, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets33);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        java.awt.Image image15 = null;
        multiplePiePlot13.setBackgroundImage(image15);
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = multiplePiePlot13.getInsets();
        multiplePiePlot4.setInsets(rectangleInsets19);
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        java.awt.geom.Point2D point2D23 = null;
        org.jfree.chart.plot.PlotState plotState24 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot4.draw(graphics2D21, rectangle2D22, point2D23, plotState24, plotRenderingInfo25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(rectangleInsets19);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        boolean boolean7 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.JFreeChart jFreeChart9 = multiplePiePlot1.getPieChart();
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot1.getRootPlot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.lang.String str16 = multiplePiePlot15.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        multiplePiePlot15.markerChanged(markerChangeEvent17);
        java.awt.Paint paint19 = null;
        multiplePiePlot15.setBackgroundPaint(paint19);
        multiplePiePlot15.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.lang.Object obj23 = null;
        boolean boolean24 = multiplePiePlot15.equals(obj23);
        multiplePiePlot15.setOutlineVisible(false);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent27 = null;
        multiplePiePlot15.notifyListeners(plotChangeEvent27);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot29.setBackgroundImageAlpha((float) (byte) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = multiplePiePlot29.getInsets();
        multiplePiePlot15.setInsets(rectangleInsets32, false);
        multiplePiePlot1.setInsets(rectangleInsets32, true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(rectangleInsets32);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getParent();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot1.getRootPlot();
        double double8 = multiplePiePlot1.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        multiplePiePlot10.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        multiplePiePlot10.setDataset(categoryDataset18);
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot10.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart20);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jFreeChart20);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
        org.jfree.chart.LegendItemCollection legendItemCollection15 = multiplePiePlot1.getLegendItems();
        java.awt.Paint paint16 = multiplePiePlot1.getOutlinePaint();
        boolean boolean17 = multiplePiePlot1.isOutlineVisible();
        boolean boolean18 = multiplePiePlot1.isOutlineVisible();
        float float19 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent20 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent20);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = multiplePiePlot1.getInsets();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(legendItemCollection15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.5f + "'", float19 == 0.5f);
        org.junit.Assert.assertNotNull(rectangleInsets22);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent6);
        java.lang.Comparable comparable8 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.lang.String str11 = multiplePiePlot10.getNoDataMessage();
        java.awt.Image image12 = null;
        multiplePiePlot10.setBackgroundImage(image12);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        multiplePiePlot10.setBackgroundImageAlignment(1);
        java.lang.String str17 = multiplePiePlot10.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + "Other" + "'", comparable8, "Other");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        java.lang.String str10 = multiplePiePlot4.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent11 = null;
        multiplePiePlot4.datasetChanged(datasetChangeEvent11);
        multiplePiePlot4.zoom((double) 1);
        org.jfree.chart.LegendItemCollection legendItemCollection15 = multiplePiePlot4.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot17.setDrawingSupplier(drawingSupplier18);
        boolean boolean21 = multiplePiePlot17.equals((java.lang.Object) 1.0d);
        multiplePiePlot17.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Font font24 = multiplePiePlot17.getNoDataMessageFont();
        multiplePiePlot4.setNoDataMessageFont(font24);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(legendItemCollection15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(font24);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
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
        java.awt.Paint paint14 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint15 = multiplePiePlot1.getNoDataMessagePaint();
        double double16 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 10);
        multiplePiePlot1.setNoDataMessage("");
        int int6 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D7, rectangle2D8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier12);
        boolean boolean15 = multiplePiePlot11.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot11.getRootPlot();
        java.awt.Image image17 = null;
        plot16.setBackgroundImage(image17);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        plot16.drawBackgroundImage(graphics2D19, rectangle2D20);
        plot16.setNoDataMessage("Multiple Pie Plot");
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        java.lang.String str26 = multiplePiePlot25.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        multiplePiePlot25.markerChanged(markerChangeEvent27);
        float float29 = multiplePiePlot25.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot25.getParent();
        org.jfree.chart.plot.Plot plot31 = multiplePiePlot25.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        boolean boolean34 = multiplePiePlot33.isSubplot();
        multiplePiePlot33.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = null;
        multiplePiePlot33.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo39);
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        multiplePiePlot33.setDataset(categoryDataset41);
        org.jfree.chart.JFreeChart jFreeChart43 = multiplePiePlot33.getPieChart();
        plot31.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart43);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier45 = plot31.getDrawingSupplier();
        plot16.setDrawingSupplier(drawingSupplier45);
        multiplePiePlot1.setDrawingSupplier(drawingSupplier45);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
        org.junit.Assert.assertNull(plot30);
        org.junit.Assert.assertNotNull(plot31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jFreeChart43);
        org.junit.Assert.assertNotNull(drawingSupplier45);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        multiplePiePlot4.zoom((double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        multiplePiePlot1.zoom((double) 10L);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.awt.Paint paint8 = multiplePiePlot7.getOutlinePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot1.getDataset();
        java.lang.Object obj11 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) 100);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
        multiplePiePlot1.setBackgroundImageAlignment((int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset20 = multiplePiePlot1.getDataset();
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot1.getPieChart();
        java.lang.String str22 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.setNoDataMessage("");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset20);
        org.junit.Assert.assertNotNull(jFreeChart21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        java.lang.String str10 = multiplePiePlot4.getNoDataMessage();
        boolean boolean11 = multiplePiePlot4.isSubplot();
        java.lang.Object obj12 = multiplePiePlot4.clone();
        multiplePiePlot4.setOutlineVisible(false);
        multiplePiePlot4.setNoDataMessage("Multiple Pie Plot");
        multiplePiePlot4.setBackgroundImageAlignment((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets5);
        multiplePiePlot1.zoom((double) (byte) 0);
        float float9 = multiplePiePlot1.getBackgroundImageAlpha();
        boolean boolean10 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.plot.Plot plot9 = null;
        multiplePiePlot1.setParent(plot9);
        java.awt.Image image11 = null;
        multiplePiePlot1.setBackgroundImage(image11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        multiplePiePlot1.handleClick((int) (short) 100, 15, plotRenderingInfo15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        boolean boolean22 = multiplePiePlot21.isSubplot();
        multiplePiePlot21.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot18.setParent((org.jfree.chart.plot.Plot) multiplePiePlot21);
        java.awt.Stroke stroke26 = multiplePiePlot21.getOutlineStroke();
        multiplePiePlot21.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        multiplePiePlot21.setDataset(categoryDataset29);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent31 = null;
        multiplePiePlot21.axisChanged(axisChangeEvent31);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot21);
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        java.lang.String str36 = multiplePiePlot35.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent37 = null;
        multiplePiePlot35.markerChanged(markerChangeEvent37);
        java.awt.Paint paint39 = null;
        multiplePiePlot35.setBackgroundPaint(paint39);
        org.jfree.data.category.CategoryDataset categoryDataset41 = multiplePiePlot35.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup42 = multiplePiePlot35.getDatasetGroup();
        org.jfree.chart.plot.Plot plot43 = multiplePiePlot35.getParent();
        java.awt.Image image44 = null;
        multiplePiePlot35.setBackgroundImage(image44);
        java.awt.Stroke stroke46 = multiplePiePlot35.getOutlineStroke();
        multiplePiePlot21.setOutlineStroke(stroke46);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(categoryDataset41);
        org.junit.Assert.assertNull(datasetGroup42);
        org.junit.Assert.assertNull(plot43);
        org.junit.Assert.assertNotNull(stroke46);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets10, true);
        org.jfree.chart.util.TableOrder tableOrder13 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(tableOrder13);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        double double17 = multiplePiePlot1.getLimit();
        java.lang.String str18 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        java.awt.Font font8 = multiplePiePlot1.getNoDataMessageFont();
        float float9 = multiplePiePlot1.getBackgroundAlpha();
        multiplePiePlot1.setBackgroundAlpha((float) (short) 1);
        java.awt.Paint paint12 = multiplePiePlot1.getNoDataMessagePaint();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        boolean boolean7 = multiplePiePlot1.isSubplot();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent8);
        java.lang.Comparable comparable10 = multiplePiePlot1.getAggregatedItemsKey();
        float float11 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getParent();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
        org.junit.Assert.assertNull(plot12);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        java.lang.String str10 = multiplePiePlot4.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent11 = null;
        multiplePiePlot4.datasetChanged(datasetChangeEvent11);
        multiplePiePlot4.zoom((double) 1);
        org.jfree.chart.LegendItemCollection legendItemCollection15 = multiplePiePlot4.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.lang.String str18 = multiplePiePlot17.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        multiplePiePlot17.addChangeListener(plotChangeListener19);
        java.awt.Image image21 = multiplePiePlot17.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot17.getPieChart();
        multiplePiePlot17.setBackgroundImageAlpha(1.0f);
        boolean boolean25 = multiplePiePlot4.equals((java.lang.Object) multiplePiePlot17);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = multiplePiePlot4.getDrawingSupplier();
        java.lang.String str27 = multiplePiePlot4.getPlotType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(legendItemCollection15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(image21);
        org.junit.Assert.assertNotNull(jFreeChart22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(drawingSupplier26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Multiple Pie Plot" + "'", str27, "Multiple Pie Plot");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot4.getInsets();
        multiplePiePlot4.setBackgroundAlpha((float) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        boolean boolean14 = multiplePiePlot13.isSubplot();
        multiplePiePlot13.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        boolean boolean17 = multiplePiePlot13.isOutlineVisible();
        multiplePiePlot4.setParent((org.jfree.chart.plot.Plot) multiplePiePlot13);
        boolean boolean19 = multiplePiePlot13.isOutlineVisible();
        boolean boolean20 = multiplePiePlot13.isOutlineVisible();
        java.awt.Image image21 = multiplePiePlot13.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(image21);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        java.lang.String str10 = multiplePiePlot4.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent11 = null;
        multiplePiePlot4.datasetChanged(datasetChangeEvent11);
        multiplePiePlot4.zoom((double) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent15 = null;
        multiplePiePlot4.axisChanged(axisChangeEvent15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        float float6 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        boolean boolean9 = multiplePiePlot8.isSubplot();
        multiplePiePlot8.setForegroundAlpha((float) 0L);
        java.awt.Paint paint12 = multiplePiePlot8.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        multiplePiePlot8.setDataset(categoryDataset13);
        multiplePiePlot8.setLimit((double) 10.0f);
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot8.getRootPlot();
        boolean boolean18 = multiplePiePlot1.equals((java.lang.Object) plot17);
        multiplePiePlot1.setBackgroundAlpha((float) 10);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent23 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent23);
        java.awt.Image image25 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(image25);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = plot4.getInsets();
        java.awt.Stroke stroke6 = plot4.getOutlineStroke();
        boolean boolean7 = plot4.isSubplot();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot4.drawOutline(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        multiplePiePlot1.setBackgroundAlpha((float) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        boolean boolean9 = multiplePiePlot8.isSubplot();
        multiplePiePlot8.setForegroundAlpha((float) 0L);
        multiplePiePlot8.setOutlineVisible(true);
        org.jfree.chart.JFreeChart jFreeChart14 = multiplePiePlot8.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart14);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = multiplePiePlot1.getDrawingSupplier();
        multiplePiePlot1.zoom((double) (byte) 1);
        multiplePiePlot1.setForegroundAlpha(0.5f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jFreeChart14);
        org.junit.Assert.assertNull(drawingSupplier16);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
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
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent18 = null;
        plot17.axisChanged(axisChangeEvent18);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(plot17);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = multiplePiePlot1.getInsets();
        float float9 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        boolean boolean13 = multiplePiePlot12.isSubplot();
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        multiplePiePlot12.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo18);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = multiplePiePlot12.getInsets();
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot12.getParent();
        boolean boolean22 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot12);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        multiplePiePlot12.markerChanged(markerChangeEvent23);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNull(plot21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        multiplePiePlot1.setBackgroundAlpha(10.0f);
        multiplePiePlot1.setBackgroundImageAlignment((int) ' ');
        java.awt.Image image8 = null;
        multiplePiePlot1.setBackgroundImage(image8);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
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
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        boolean boolean13 = multiplePiePlot12.isSubplot();
        multiplePiePlot12.setForegroundAlpha((float) 0L);
        multiplePiePlot12.setOutlineVisible(true);
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot12.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart18);
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jFreeChart18);
        org.junit.Assert.assertNotNull(jFreeChart20);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.setLimit((double) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        boolean boolean12 = multiplePiePlot11.isSubplot();
        multiplePiePlot11.setOutlineVisible(false);
        org.jfree.chart.util.TableOrder tableOrder15 = multiplePiePlot11.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder15);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent17);
        double double19 = multiplePiePlot1.getLimit();
        multiplePiePlot1.zoom((double) (byte) -1);
        java.lang.String str22 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = null;
        multiplePiePlot24.setDrawingSupplier(drawingSupplier25);
        boolean boolean28 = multiplePiePlot24.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot29 = multiplePiePlot24.getRootPlot();
        plot29.setBackgroundImageAlpha((float) 1);
        plot29.setBackgroundAlpha((float) (byte) -1);
        boolean boolean34 = plot29.isSubplot();
        org.jfree.chart.plot.Plot plot35 = plot29.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot37 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset36);
        boolean boolean38 = multiplePiePlot37.isSubplot();
        multiplePiePlot37.setForegroundAlpha((float) 0L);
        java.awt.Paint paint41 = multiplePiePlot37.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot43 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset42);
        java.lang.String str44 = multiplePiePlot43.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener45 = null;
        multiplePiePlot43.addChangeListener(plotChangeListener45);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier47 = multiplePiePlot43.getDrawingSupplier();
        multiplePiePlot37.setDrawingSupplier(drawingSupplier47);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo51 = null;
        multiplePiePlot37.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo51);
        float float53 = multiplePiePlot37.getBackgroundAlpha();
        multiplePiePlot37.setBackgroundImageAlignment((int) ' ');
        org.jfree.data.category.CategoryDataset categoryDataset56 = multiplePiePlot37.getDataset();
        org.jfree.chart.JFreeChart jFreeChart57 = multiplePiePlot37.getPieChart();
        plot29.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart57);
        boolean boolean59 = multiplePiePlot1.equals((java.lang.Object) plot29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tableOrder15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(plot29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(plot35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(drawingSupplier47);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 1.0f + "'", float53 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset56);
        org.junit.Assert.assertNotNull(jFreeChart57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.awt.Image image8 = null;
        multiplePiePlot7.setBackgroundImage(image8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        multiplePiePlot11.addChangeListener(plotChangeListener13);
        java.awt.Image image15 = multiplePiePlot11.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart16 = multiplePiePlot11.getPieChart();
        multiplePiePlot7.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.lang.String str20 = multiplePiePlot19.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        multiplePiePlot19.markerChanged(markerChangeEvent21);
        java.awt.Paint paint23 = null;
        multiplePiePlot19.setBackgroundPaint(paint23);
        org.jfree.data.category.CategoryDataset categoryDataset25 = multiplePiePlot19.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup26 = multiplePiePlot19.getDatasetGroup();
        java.awt.Paint paint27 = multiplePiePlot19.getOutlinePaint();
        multiplePiePlot7.setNoDataMessagePaint(paint27);
        multiplePiePlot1.setOutlinePaint(paint27);
        double double30 = multiplePiePlot1.getLimit();
        java.awt.Paint paint31 = multiplePiePlot1.getBackgroundPaint();
        boolean boolean32 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertNotNull(jFreeChart16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertNull(datasetGroup26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = null;
        multiplePiePlot7.setDrawingSupplier(drawingSupplier8);
        boolean boolean11 = multiplePiePlot7.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot7.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.lang.String str15 = multiplePiePlot14.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot14.addChangeListener(plotChangeListener16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = multiplePiePlot14.getDrawingSupplier();
        java.awt.Paint paint19 = multiplePiePlot14.getNoDataMessagePaint();
        multiplePiePlot7.setBackgroundPaint(paint19);
        java.awt.Image image21 = null;
        multiplePiePlot7.setBackgroundImage(image21);
        boolean boolean23 = multiplePiePlot7.isSubplot();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot7);
        double double25 = multiplePiePlot1.getLimit();
        java.awt.Font font26 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setNoDataMessageFont(font26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'font' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(drawingSupplier18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
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
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot15.setDrawingSupplier(drawingSupplier16);
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot15.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        plot18.markerChanged(markerChangeEvent19);
        float float21 = plot18.getBackgroundImageAlpha();
        plot18.setBackgroundImageAlpha(0.0f);
        java.awt.Paint paint24 = plot18.getNoDataMessagePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint24);
        float float26 = multiplePiePlot1.getBackgroundImageAlpha();
        java.lang.String str27 = multiplePiePlot1.getPlotType();
        org.jfree.chart.plot.Plot plot28 = multiplePiePlot1.getRootPlot();
        java.lang.Comparable comparable29 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.5f + "'", float26 == 0.5f);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Multiple Pie Plot" + "'", str27, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(plot28);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + "Other" + "'", comparable29, "Other");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets5);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot1.getInsets();
        java.awt.Image image8 = null;
        multiplePiePlot1.setBackgroundImage(image8);
        boolean boolean10 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot1.getParent();
        java.lang.Comparable comparable10 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.general.DatasetGroup datasetGroup11 = multiplePiePlot1.getDatasetGroup();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getRootPlot();
        java.lang.Class<?> wildcardClass15 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNull(plot9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
        org.junit.Assert.assertNull(datasetGroup11);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(legendItemCollection13);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
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
        java.awt.Image image15 = multiplePiePlot1.getBackgroundImage();
        multiplePiePlot1.setOutlineVisible(false);
        multiplePiePlot1.setBackgroundImageAlignment(15);
        java.awt.Paint paint20 = multiplePiePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
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
        java.awt.Paint paint11 = multiplePiePlot1.getOutlinePaint();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) true);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Image image15 = plot14.getBackgroundImage();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(plot14);
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
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot1.getInsets();
        float float8 = multiplePiePlot1.getBackgroundImageAlpha();
        boolean boolean9 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.general.DatasetGroup datasetGroup10 = multiplePiePlot1.getDatasetGroup();
        float float11 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(jFreeChart6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(datasetGroup10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        float float8 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot1.getRootPlot();
        plot9.setNoDataMessage("Multiple Pie Plot");
        float float12 = plot9.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier9);
        boolean boolean12 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint13 = multiplePiePlot8.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection14 = multiplePiePlot8.getLegendItems();
        multiplePiePlot8.setLimit((double) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        multiplePiePlot18.setOutlineVisible(false);
        org.jfree.chart.util.TableOrder tableOrder22 = multiplePiePlot18.getDataExtractOrder();
        multiplePiePlot8.setDataExtractOrder(tableOrder22);
        boolean boolean24 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot8);
        multiplePiePlot8.setForegroundAlpha((float) (byte) 10);
        multiplePiePlot8.setNoDataMessage("");
        float float29 = multiplePiePlot8.getForegroundAlpha();
        boolean boolean30 = multiplePiePlot8.isOutlineVisible();
        org.jfree.chart.plot.Plot plot31 = multiplePiePlot8.getParent();
        // The following exception was thrown during execution in test generation
        try {
            plot31.setBackgroundAlpha((float) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tableOrder22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 10.0f + "'", float29 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(plot31);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setBackgroundImageAlpha(1.0f);
        multiplePiePlot1.setBackgroundAlpha((float) 0);
        multiplePiePlot1.zoom((double) 1.0f);
        multiplePiePlot1.setNoDataMessage("");
        float float15 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(jFreeChart6);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        float float7 = plot4.getBackgroundImageAlpha();
        plot4.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.plot.Plot plot10 = plot4.getRootPlot();
        java.lang.String str11 = plot10.getNoDataMessage();
        java.awt.Paint paint12 = plot10.getOutlinePaint();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        multiplePiePlot1.setBackgroundAlpha((float) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        boolean boolean9 = multiplePiePlot8.isSubplot();
        multiplePiePlot8.setForegroundAlpha((float) 0L);
        multiplePiePlot8.setOutlineVisible(true);
        org.jfree.chart.JFreeChart jFreeChart14 = multiplePiePlot8.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart14);
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
        java.awt.Paint paint27 = multiplePiePlot17.getOutlinePaint();
        multiplePiePlot1.setOutlinePaint(paint27);
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D29, rectangle2D30);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jFreeChart14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Multiple Pie Plot" + "'", str26, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.setLimit((double) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        boolean boolean12 = multiplePiePlot11.isSubplot();
        multiplePiePlot11.setOutlineVisible(false);
        org.jfree.chart.util.TableOrder tableOrder15 = multiplePiePlot11.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder15);
        java.lang.Comparable comparable17 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setOutlineVisible(true);
        java.awt.Paint paint20 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tableOrder15);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + "Other" + "'", comparable17, "Other");
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        multiplePiePlot1.zoom((double) 10L);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.awt.Paint paint8 = multiplePiePlot7.getOutlinePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot1.getDataset();
        java.lang.String str11 = multiplePiePlot1.getNoDataMessage();
        boolean boolean12 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        boolean boolean15 = multiplePiePlot14.isSubplot();
        multiplePiePlot14.setForegroundAlpha((float) 0L);
        java.awt.Paint paint18 = multiplePiePlot14.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.lang.String str21 = multiplePiePlot20.getNoDataMessage();
        java.awt.Image image22 = null;
        multiplePiePlot20.setBackgroundImage(image22);
        multiplePiePlot20.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        boolean boolean28 = multiplePiePlot27.isSubplot();
        multiplePiePlot27.setOutlineVisible(false);
        org.jfree.chart.util.TableOrder tableOrder31 = multiplePiePlot27.getDataExtractOrder();
        multiplePiePlot20.setDataExtractOrder(tableOrder31);
        multiplePiePlot14.setDataExtractOrder(tableOrder31);
        multiplePiePlot1.setDataExtractOrder(tableOrder31);
        java.lang.Comparable comparable35 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(tableOrder31);
        org.junit.Assert.assertEquals("'" + comparable35 + "' != '" + "Other" + "'", comparable35, "Other");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setBackgroundImageAlpha(1.0f);
        multiplePiePlot1.setForegroundAlpha((float) (short) 0);
        boolean boolean11 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = multiplePiePlot1.getInsets();
        float float13 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(jFreeChart6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        float float7 = plot4.getBackgroundImageAlpha();
        java.awt.Paint paint8 = plot4.getBackgroundPaint();
        java.awt.Font font9 = plot4.getNoDataMessageFont();
        int int10 = plot4.getBackgroundImageAlignment();
        boolean boolean11 = plot4.isOutlineVisible();
        plot4.setBackgroundImageAlignment((-1));
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent14 = null;
        multiplePiePlot4.axisChanged(axisChangeEvent14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        multiplePiePlot4.setDataset(categoryDataset16);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = multiplePiePlot4.getInsets();
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot4.getPieChart();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(jFreeChart19);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        multiplePiePlot10.setForegroundAlpha((float) 0L);
        multiplePiePlot10.setOutlineVisible(true);
        org.jfree.chart.JFreeChart jFreeChart16 = multiplePiePlot10.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart16);
        multiplePiePlot1.setForegroundAlpha(0.0f);
        java.awt.Paint paint20 = multiplePiePlot1.getAggregatedItemsPaint();
        boolean boolean21 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jFreeChart16);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
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
        boolean boolean13 = multiplePiePlot1.isOutlineVisible();
        java.awt.Paint paint14 = multiplePiePlot1.getNoDataMessagePaint();
        java.lang.String str15 = multiplePiePlot1.getPlotType();
        int int16 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Multiple Pie Plot" + "'", str15, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
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
        float float11 = multiplePiePlot8.getBackgroundImageAlpha();
        multiplePiePlot8.setBackgroundAlpha((float) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        boolean boolean16 = multiplePiePlot15.isSubplot();
        multiplePiePlot15.setForegroundAlpha((float) 0L);
        multiplePiePlot15.setOutlineVisible(true);
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot15.getPieChart();
        multiplePiePlot8.setPieChart(jFreeChart21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.lang.String str25 = multiplePiePlot24.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        java.lang.String str28 = multiplePiePlot27.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        multiplePiePlot27.markerChanged(markerChangeEvent29);
        java.awt.Paint paint31 = multiplePiePlot27.getAggregatedItemsPaint();
        multiplePiePlot24.setOutlinePaint(paint31);
        java.lang.String str33 = multiplePiePlot24.getPlotType();
        java.awt.Paint paint34 = multiplePiePlot24.getOutlinePaint();
        multiplePiePlot8.setOutlinePaint(paint34);
        multiplePiePlot1.setNoDataMessagePaint(paint34);
        org.jfree.chart.LegendItemCollection legendItemCollection37 = multiplePiePlot1.getLegendItems();
        java.awt.Graphics2D graphics2D38 = null;
        java.awt.geom.Rectangle2D rectangle2D39 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D38, rectangle2D39);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jFreeChart21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Multiple Pie Plot" + "'", str33, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(legendItemCollection37);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Image image7 = multiplePiePlot1.getBackgroundImage();
        java.lang.String str8 = multiplePiePlot1.getNoDataMessage();
        int int9 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent10 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
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
        java.awt.Paint paint17 = multiplePiePlot1.getOutlinePaint();
        multiplePiePlot1.zoom(1.0d);
        multiplePiePlot1.setOutlineVisible(false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier9);
        boolean boolean12 = multiplePiePlot8.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint13 = multiplePiePlot8.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection14 = multiplePiePlot8.getLegendItems();
        multiplePiePlot8.setLimit((double) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        multiplePiePlot18.setOutlineVisible(false);
        org.jfree.chart.util.TableOrder tableOrder22 = multiplePiePlot18.getDataExtractOrder();
        multiplePiePlot8.setDataExtractOrder(tableOrder22);
        boolean boolean24 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot8);
        multiplePiePlot8.setForegroundAlpha((float) (byte) 10);
        multiplePiePlot8.setNoDataMessage("");
        java.lang.Comparable comparable29 = multiplePiePlot8.getAggregatedItemsKey();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tableOrder22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + "Other" + "'", comparable29, "Other");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.lang.String str6 = multiplePiePlot5.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        multiplePiePlot5.markerChanged(markerChangeEvent7);
        java.awt.Paint paint9 = multiplePiePlot5.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        multiplePiePlot11.addChangeListener(plotChangeListener13);
        java.awt.Image image15 = multiplePiePlot11.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart16 = multiplePiePlot11.getPieChart();
        multiplePiePlot5.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart16);
        java.awt.Stroke stroke18 = multiplePiePlot5.getOutlineStroke();
        multiplePiePlot5.setBackgroundImageAlignment(1);
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot5.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart22);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertNotNull(jFreeChart16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(plot21);
        org.junit.Assert.assertNotNull(jFreeChart22);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.awt.Image image12 = null;
        multiplePiePlot11.setBackgroundImage(image12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.lang.String str16 = multiplePiePlot15.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        multiplePiePlot15.addChangeListener(plotChangeListener17);
        java.awt.Image image19 = multiplePiePlot15.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot15.getPieChart();
        multiplePiePlot11.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = multiplePiePlot11.getDataset();
        multiplePiePlot11.setBackgroundImageAlpha((float) 0);
        multiplePiePlot11.setBackgroundImageAlignment(100);
        java.awt.Paint paint27 = multiplePiePlot11.getOutlinePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint27);
        double double29 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(image19);
        org.junit.Assert.assertNotNull(jFreeChart20);
        org.junit.Assert.assertNull(categoryDataset22);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent6);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        boolean boolean12 = multiplePiePlot11.isSubplot();
        java.awt.Paint paint13 = multiplePiePlot11.getBackgroundPaint();
        float float14 = multiplePiePlot11.getForegroundAlpha();
        boolean boolean15 = multiplePiePlot11.isOutlineVisible();
        org.jfree.data.general.DatasetGroup datasetGroup16 = multiplePiePlot11.getDatasetGroup();
        java.awt.Stroke stroke17 = multiplePiePlot11.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke17);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(datasetGroup16);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.lang.Object obj9 = null;
        boolean boolean10 = multiplePiePlot1.equals(obj9);
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.awt.Image image15 = null;
        multiplePiePlot14.setBackgroundImage(image15);
        multiplePiePlot14.zoom((double) 10L);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.awt.Paint paint21 = multiplePiePlot20.getOutlinePaint();
        multiplePiePlot14.setAggregatedItemsPaint(paint21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = multiplePiePlot14.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        multiplePiePlot14.setDataset(categoryDataset24);
        multiplePiePlot14.setLimit((double) 10);
        java.awt.Paint paint28 = multiplePiePlot14.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = null;
        multiplePiePlot30.setDrawingSupplier(drawingSupplier31);
        boolean boolean34 = multiplePiePlot30.equals((java.lang.Object) 1.0d);
        boolean boolean35 = multiplePiePlot30.isOutlineVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo38 = null;
        multiplePiePlot30.handleClick((int) (short) 0, 0, plotRenderingInfo38);
        multiplePiePlot30.setAggregatedItemsKey((java.lang.Comparable) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo44 = null;
        multiplePiePlot30.handleClick(0, 0, plotRenderingInfo44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot47 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset46);
        boolean boolean48 = multiplePiePlot47.isSubplot();
        multiplePiePlot47.setForegroundAlpha((float) 0L);
        multiplePiePlot47.setOutlineVisible(true);
        org.jfree.chart.JFreeChart jFreeChart53 = multiplePiePlot47.getPieChart();
        multiplePiePlot30.setPieChart(jFreeChart53);
        multiplePiePlot14.setPieChart(jFreeChart53);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart53);
        java.awt.Paint paint57 = multiplePiePlot1.getOutlinePaint();
        java.lang.Comparable comparable58 = multiplePiePlot1.getAggregatedItemsKey();
        float float59 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNull(categoryDataset23);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jFreeChart53);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertEquals("'" + comparable58 + "' != '" + (-1.0d) + "'", comparable58, (-1.0d));
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 0.5f + "'", float59 == 0.5f);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 10);
        multiplePiePlot1.setBackgroundImageAlpha(0.5f);
        java.awt.Stroke stroke6 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.util.TableOrder tableOrder7 = multiplePiePlot1.getDataExtractOrder();
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
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(tableOrder7);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
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
        org.jfree.data.general.DatasetGroup datasetGroup12 = multiplePiePlot1.getDatasetGroup();
        java.awt.Image image13 = multiplePiePlot1.getBackgroundImage();
        java.awt.Paint paint14 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D15, rectangle2D16);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(datasetGroup12);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
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
        java.awt.Paint paint14 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint15 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener16);
        org.jfree.chart.util.TableOrder tableOrder18 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(tableOrder18);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent7);
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 100);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        multiplePiePlot13.markerChanged(markerChangeEvent15);
        java.awt.Paint paint17 = multiplePiePlot13.getAggregatedItemsPaint();
        float float18 = multiplePiePlot13.getForegroundAlpha();
        java.awt.Paint paint19 = multiplePiePlot13.getAggregatedItemsPaint();
        float float20 = multiplePiePlot13.getForegroundAlpha();
        multiplePiePlot13.setBackgroundImageAlignment(1);
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        multiplePiePlot13.drawBackgroundImage(graphics2D23, rectangle2D24);
        org.jfree.chart.JFreeChart jFreeChart26 = multiplePiePlot13.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart26);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNotNull(jFreeChart26);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        boolean boolean5 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.general.DatasetGroup datasetGroup6 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        multiplePiePlot8.markerChanged(markerChangeEvent10);
        java.awt.Paint paint12 = null;
        multiplePiePlot8.setBackgroundPaint(paint12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = multiplePiePlot8.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup15 = multiplePiePlot8.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.lang.String str18 = multiplePiePlot17.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        multiplePiePlot17.markerChanged(markerChangeEvent19);
        java.awt.Image image21 = multiplePiePlot17.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset22 = multiplePiePlot17.getDataset();
        java.awt.Paint paint23 = multiplePiePlot17.getAggregatedItemsPaint();
        multiplePiePlot8.setAggregatedItemsPaint(paint23);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = multiplePiePlot8.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets25);
        java.awt.Paint paint27 = multiplePiePlot1.getOutlinePaint();
        java.awt.Image image28 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(image21);
        org.junit.Assert.assertNull(categoryDataset22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNull(image28);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot1.getInsets();
        org.jfree.chart.LegendItemCollection legendItemCollection10 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier13);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        plot15.markerChanged(markerChangeEvent16);
        float float18 = plot15.getBackgroundImageAlpha();
        java.awt.Paint paint19 = plot15.getNoDataMessagePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(legendItemCollection10);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
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
        multiplePiePlot1.setForegroundAlpha((float) (-1));
        java.awt.Paint paint15 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = plot16.getDrawingSupplier();
        java.lang.Class<?> wildcardClass18 = drawingSupplier17.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNotNull(drawingSupplier17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = null;
        multiplePiePlot7.setDrawingSupplier(drawingSupplier8);
        boolean boolean11 = multiplePiePlot7.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot7.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.lang.String str15 = multiplePiePlot14.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot14.addChangeListener(plotChangeListener16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = multiplePiePlot14.getDrawingSupplier();
        java.awt.Paint paint19 = multiplePiePlot14.getNoDataMessagePaint();
        multiplePiePlot7.setBackgroundPaint(paint19);
        java.awt.Image image21 = null;
        multiplePiePlot7.setBackgroundImage(image21);
        boolean boolean23 = multiplePiePlot7.isSubplot();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot7);
        org.jfree.chart.LegendItemCollection legendItemCollection25 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.LegendItemCollection legendItemCollection26 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(drawingSupplier18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(legendItemCollection25);
        org.junit.Assert.assertNotNull(legendItemCollection26);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        boolean boolean5 = multiplePiePlot1.isOutlineVisible();
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setBackgroundPaint(paint6);
        java.lang.String str8 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint9 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(paint9);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        multiplePiePlot1.setDataset(categoryDataset5);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        multiplePiePlot1.removeChangeListener(plotChangeListener7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot1.getInsets();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets9);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.setLimit((double) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        boolean boolean12 = multiplePiePlot11.isSubplot();
        multiplePiePlot11.setOutlineVisible(false);
        org.jfree.chart.util.TableOrder tableOrder15 = multiplePiePlot11.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder15);
        java.lang.Comparable comparable17 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset18 = multiplePiePlot1.getDataset();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D19, rectangle2D20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(tableOrder15);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + "Other" + "'", comparable17, "Other");
        org.junit.Assert.assertNull(categoryDataset18);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
        java.lang.String str11 = multiplePiePlot1.getNoDataMessage();
        boolean boolean12 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.setForegroundAlpha((-1.0f));
        java.awt.Paint paint15 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(image10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.chart.util.TableOrder tableOrder5 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.general.DatasetGroup datasetGroup6 = multiplePiePlot1.getDatasetGroup();
        org.jfree.chart.util.TableOrder tableOrder7 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tableOrder5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(tableOrder7);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) -1);
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.lang.String str15 = multiplePiePlot14.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot14.addChangeListener(plotChangeListener16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = multiplePiePlot14.getDrawingSupplier();
        java.awt.Paint paint19 = multiplePiePlot14.getNoDataMessagePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = multiplePiePlot14.getDrawingSupplier();
        float float21 = multiplePiePlot14.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot14);
        int int23 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent24 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent24);
        java.awt.Paint paint26 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setBackgroundAlpha((float) 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(drawingSupplier18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(drawingSupplier20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
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
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot1.getParent();
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot1.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        multiplePiePlot1.setDataset(categoryDataset18);
        org.jfree.chart.LegendItemCollection legendItemCollection20 = multiplePiePlot1.getLegendItems();
        java.awt.Paint paint21 = multiplePiePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNull(plot16);
        org.junit.Assert.assertNotNull(jFreeChart17);
        org.junit.Assert.assertNotNull(legendItemCollection20);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        boolean boolean9 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot10.setBackgroundImageAlpha((float) (byte) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        multiplePiePlot10.handleClick((int) (byte) 100, 1, plotRenderingInfo15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        java.awt.Paint paint20 = multiplePiePlot18.getBackgroundPaint();
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        multiplePiePlot18.drawBackgroundImage(graphics2D21, rectangle2D22);
        multiplePiePlot18.zoom((double) (byte) -1);
        java.awt.Stroke stroke26 = multiplePiePlot18.getOutlineStroke();
        multiplePiePlot10.setOutlineStroke(stroke26);
        multiplePiePlot10.setLimit((double) (-1.0f));
        java.awt.Paint paint30 = multiplePiePlot10.getBackgroundPaint();
        multiplePiePlot1.setOutlinePaint(paint30);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.plot.Plot plot9 = null;
        multiplePiePlot1.setParent(plot9);
        java.awt.Image image11 = null;
        multiplePiePlot1.setBackgroundImage(image11);
        float float13 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart14 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(jFreeChart14);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
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
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        boolean boolean15 = multiplePiePlot14.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        boolean boolean18 = multiplePiePlot17.isSubplot();
        multiplePiePlot17.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot14.setParent((org.jfree.chart.plot.Plot) multiplePiePlot17);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        multiplePiePlot14.handleClick((int) (short) -1, (-1), plotRenderingInfo24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = null;
        multiplePiePlot27.setDrawingSupplier(drawingSupplier28);
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot27.getRootPlot();
        org.jfree.chart.plot.Plot plot31 = multiplePiePlot27.getParent();
        multiplePiePlot27.setForegroundAlpha((float) '#');
        java.awt.Paint paint34 = multiplePiePlot27.getOutlinePaint();
        multiplePiePlot14.setNoDataMessagePaint(paint34);
        multiplePiePlot14.setAggregatedItemsKey((java.lang.Comparable) (short) 1);
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = multiplePiePlot14.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets38, false);
        java.awt.Graphics2D graphics2D41 = null;
        java.awt.geom.Rectangle2D rectangle2D42 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D41, rectangle2D42);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(plot30);
        org.junit.Assert.assertNull(plot31);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(rectangleInsets38);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent14);
        multiplePiePlot1.setLimit((-1.0d));
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot1.getParent();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + "Other" + "'", comparable13, "Other");
        org.junit.Assert.assertNull(plot18);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) -1);
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.lang.String str15 = multiplePiePlot14.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot14.addChangeListener(plotChangeListener16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = multiplePiePlot14.getDrawingSupplier();
        java.awt.Paint paint19 = multiplePiePlot14.getNoDataMessagePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = multiplePiePlot14.getDrawingSupplier();
        float float21 = multiplePiePlot14.getBackgroundImageAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot14);
        int int23 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent24 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent24);
        java.awt.Paint paint26 = multiplePiePlot1.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(drawingSupplier18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(drawingSupplier20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.plot.Plot plot9 = null;
        multiplePiePlot1.setParent(plot9);
        java.awt.Image image11 = null;
        multiplePiePlot1.setBackgroundImage(image11);
        float float13 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeListener plotChangeListener14 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener14);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) "Multiple Pie Plot");
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.lang.String str20 = multiplePiePlot19.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.lang.String str23 = multiplePiePlot22.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        multiplePiePlot22.markerChanged(markerChangeEvent24);
        java.awt.Paint paint26 = multiplePiePlot22.getAggregatedItemsPaint();
        multiplePiePlot19.setOutlinePaint(paint26);
        java.lang.String str28 = multiplePiePlot19.getPlotType();
        java.lang.String str29 = multiplePiePlot19.getNoDataMessage();
        float float30 = multiplePiePlot19.getBackgroundImageAlpha();
        multiplePiePlot19.setNoDataMessage("Other");
        multiplePiePlot19.zoom((double) 10);
        boolean boolean35 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot19);
        int int36 = multiplePiePlot1.getBackgroundImageAlignment();
        multiplePiePlot1.setLimit((double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Multiple Pie Plot" + "'", str28, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.5f + "'", float30 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 15 + "'", int36 == 15);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.lang.String str6 = multiplePiePlot1.getNoDataMessage();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D7, rectangle2D8);
        java.awt.Image image10 = null;
        multiplePiePlot1.setBackgroundImage(image10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
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
        double double16 = multiplePiePlot1.getLimit();
        boolean boolean17 = multiplePiePlot1.isSubplot();
        org.jfree.chart.LegendItemCollection legendItemCollection18 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(legendItemCollection18);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.chart.util.TableOrder tableOrder5 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getParent();
        double double7 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tableOrder5);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
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
        multiplePiePlot1.setLimit(100.0d);
        java.awt.Paint paint15 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener18);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        java.awt.Image image24 = null;
        multiplePiePlot23.setBackgroundImage(image24);
        multiplePiePlot23.zoom((double) 10L);
        multiplePiePlot23.setBackgroundImageAlignment((int) (byte) 100);
        java.awt.Paint paint30 = multiplePiePlot23.getNoDataMessagePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint30);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent32);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
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
        multiplePiePlot4.setNoDataMessage("Multiple Pie Plot");
        org.jfree.data.category.CategoryDataset categoryDataset18 = multiplePiePlot4.getDataset();
        java.awt.Paint paint19 = multiplePiePlot4.getAggregatedItemsPaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(categoryDataset18);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        java.lang.String str10 = multiplePiePlot4.getNoDataMessage();
        boolean boolean11 = multiplePiePlot4.isSubplot();
        java.lang.Object obj12 = multiplePiePlot4.clone();
        multiplePiePlot4.setOutlineVisible(false);
        java.awt.Paint paint15 = multiplePiePlot4.getAggregatedItemsPaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        java.awt.Font font8 = multiplePiePlot1.getNoDataMessageFont();
        float float9 = multiplePiePlot1.getBackgroundAlpha();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 35.0f);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        boolean boolean14 = multiplePiePlot13.isSubplot();
        multiplePiePlot13.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        multiplePiePlot13.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        multiplePiePlot13.setDataset(categoryDataset21);
        java.awt.Font font23 = multiplePiePlot13.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font23);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        boolean boolean27 = multiplePiePlot26.isSubplot();
        java.awt.Paint paint28 = multiplePiePlot26.getBackgroundPaint();
        float float29 = multiplePiePlot26.getForegroundAlpha();
        boolean boolean30 = multiplePiePlot26.isOutlineVisible();
        org.jfree.data.general.DatasetGroup datasetGroup31 = multiplePiePlot26.getDatasetGroup();
        multiplePiePlot26.setForegroundAlpha((float) (byte) 0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier34 = multiplePiePlot26.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        java.lang.String str37 = multiplePiePlot36.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener38 = null;
        multiplePiePlot36.addChangeListener(plotChangeListener38);
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = multiplePiePlot36.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot42 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset41);
        java.lang.String str43 = multiplePiePlot42.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener44 = null;
        multiplePiePlot42.addChangeListener(plotChangeListener44);
        java.awt.Image image46 = multiplePiePlot42.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart47 = multiplePiePlot42.getPieChart();
        multiplePiePlot42.setBackgroundImageAlpha(1.0f);
        multiplePiePlot42.setBackgroundAlpha((float) 0);
        multiplePiePlot42.zoom((double) 1.0f);
        org.jfree.data.category.CategoryDataset categoryDataset54 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot55 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset54);
        boolean boolean56 = multiplePiePlot55.isSubplot();
        multiplePiePlot55.setForegroundAlpha((float) 0L);
        multiplePiePlot55.setLimit((double) (byte) 100);
        org.jfree.chart.JFreeChart jFreeChart61 = multiplePiePlot55.getPieChart();
        multiplePiePlot42.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart61);
        multiplePiePlot36.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart61);
        multiplePiePlot26.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart61);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart61);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(datasetGroup31);
        org.junit.Assert.assertNotNull(drawingSupplier34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(rectangleInsets40);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(image46);
        org.junit.Assert.assertNotNull(jFreeChart47);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jFreeChart61);
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
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        java.awt.Paint paint9 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot1.getRootPlot();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent11 = null;
        plot10.datasetChanged(datasetChangeEvent11);
        org.jfree.data.general.DatasetGroup datasetGroup13 = plot10.getDatasetGroup();
        int int14 = plot10.getBackgroundImageAlignment();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertNull(datasetGroup13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.util.TableOrder tableOrder7 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.util.TableOrder tableOrder8 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(tableOrder7);
        org.junit.Assert.assertNotNull(tableOrder8);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
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
        float float14 = multiplePiePlot1.getForegroundAlpha();
        int int15 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.plot.Plot plot16 = null;
        multiplePiePlot1.setParent(plot16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        java.awt.geom.Point2D point2D18 = null;
        org.jfree.chart.plot.PlotState plotState19 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D16, rectangle2D17, point2D18, plotState19, plotRenderingInfo20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent11);
        float float13 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(image10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        java.lang.String str10 = multiplePiePlot4.getNoDataMessage();
        boolean boolean11 = multiplePiePlot4.isSubplot();
        java.lang.Object obj12 = multiplePiePlot4.clone();
        multiplePiePlot4.setNoDataMessage("Other");
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent15 = null;
        multiplePiePlot4.axisChanged(axisChangeEvent15);
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot4.getParent();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(plot17);
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
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        java.awt.Stroke stroke8 = multiplePiePlot1.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        multiplePiePlot10.setForegroundAlpha((float) 0L);
        java.awt.Paint paint14 = multiplePiePlot10.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        multiplePiePlot10.setDataset(categoryDataset15);
        java.awt.Font font17 = multiplePiePlot10.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font17);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = multiplePiePlot1.getInsets();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D20, rectangle2D21);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent23 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent23);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(rectangleInsets19);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
        boolean boolean6 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        multiplePiePlot8.markerChanged(markerChangeEvent10);
        java.awt.Paint paint12 = multiplePiePlot8.getAggregatedItemsPaint();
        float float13 = multiplePiePlot8.getForegroundAlpha();
        java.awt.Paint paint14 = multiplePiePlot8.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint14);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
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
        multiplePiePlot1.setForegroundAlpha((float) (-1));
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.lang.String str17 = multiplePiePlot16.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        multiplePiePlot16.addChangeListener(plotChangeListener18);
        java.awt.Image image20 = multiplePiePlot16.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot16.getPieChart();
        multiplePiePlot16.setBackgroundImageAlpha(1.0f);
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot16.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart24);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        multiplePiePlot1.handleClick((int) (byte) 0, (-1), plotRenderingInfo28);
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D30, rectangle2D31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(image20);
        org.junit.Assert.assertNotNull(jFreeChart21);
        org.junit.Assert.assertNotNull(jFreeChart24);
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        java.awt.Stroke stroke8 = multiplePiePlot1.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        multiplePiePlot10.setForegroundAlpha((float) 0L);
        multiplePiePlot10.setOutlineVisible(true);
        java.awt.Font font16 = multiplePiePlot10.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font16);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 100);
        org.jfree.data.category.CategoryDataset categoryDataset20 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNull(categoryDataset20);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
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
        java.lang.Comparable comparable15 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        java.awt.geom.Point2D point2D18 = null;
        org.jfree.chart.plot.PlotState plotState19 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D16, rectangle2D17, point2D18, plotState19, plotRenderingInfo20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + "Other" + "'", comparable15, "Other");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 0);
        boolean boolean8 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier11);
        boolean boolean14 = multiplePiePlot10.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot10.getRootPlot();
        plot15.setBackgroundImageAlpha((float) 1);
        plot15.setBackgroundAlpha((float) (byte) -1);
        java.awt.Paint paint20 = plot15.getOutlinePaint();
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        plot15.drawBackgroundImage(graphics2D21, rectangle2D22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        boolean boolean26 = multiplePiePlot25.isSubplot();
        java.awt.Paint paint27 = multiplePiePlot25.getBackgroundPaint();
        float float28 = multiplePiePlot25.getForegroundAlpha();
        boolean boolean29 = multiplePiePlot25.isOutlineVisible();
        org.jfree.data.general.DatasetGroup datasetGroup30 = multiplePiePlot25.getDatasetGroup();
        multiplePiePlot25.setForegroundAlpha((float) (byte) 0);
        boolean boolean33 = multiplePiePlot25.isOutlineVisible();
        org.jfree.chart.util.TableOrder tableOrder34 = multiplePiePlot25.getDataExtractOrder();
        java.lang.String str35 = multiplePiePlot25.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot37 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset36);
        java.lang.String str38 = multiplePiePlot37.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent39 = null;
        multiplePiePlot37.markerChanged(markerChangeEvent39);
        java.awt.Image image41 = multiplePiePlot37.getBackgroundImage();
        java.lang.Comparable comparable42 = multiplePiePlot37.getAggregatedItemsKey();
        org.jfree.chart.JFreeChart jFreeChart43 = multiplePiePlot37.getPieChart();
        multiplePiePlot25.setPieChart(jFreeChart43);
        plot15.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart43);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart43);
        org.jfree.data.category.CategoryDataset categoryDataset47 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot48 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset47);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier49 = null;
        multiplePiePlot48.setDrawingSupplier(drawingSupplier49);
        org.jfree.chart.plot.Plot plot51 = multiplePiePlot48.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent52 = null;
        plot51.markerChanged(markerChangeEvent52);
        float float54 = plot51.getBackgroundImageAlpha();
        java.awt.Paint paint55 = plot51.getNoDataMessagePaint();
        plot51.setNoDataMessage("Other");
        org.jfree.chart.plot.Plot plot58 = plot51.getRootPlot();
        multiplePiePlot1.setParent(plot58);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.0f + "'", float28 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(datasetGroup30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(tableOrder34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Multiple Pie Plot" + "'", str35, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(image41);
        org.junit.Assert.assertEquals("'" + comparable42 + "' != '" + "Other" + "'", comparable42, "Other");
        org.junit.Assert.assertNotNull(jFreeChart43);
        org.junit.Assert.assertNotNull(plot51);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 0.5f + "'", float54 == 0.5f);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNotNull(plot58);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        multiplePiePlot1.setDataset(categoryDataset10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        boolean boolean14 = multiplePiePlot13.isSubplot();
        multiplePiePlot13.setForegroundAlpha((float) 0L);
        java.awt.Paint paint17 = multiplePiePlot13.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        multiplePiePlot13.setDataset(categoryDataset18);
        multiplePiePlot13.setOutlineVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        boolean boolean24 = multiplePiePlot23.isSubplot();
        java.awt.Image image25 = multiplePiePlot23.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection26 = multiplePiePlot23.getLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent27 = null;
        multiplePiePlot23.axisChanged(axisChangeEvent27);
        java.awt.Stroke stroke29 = multiplePiePlot23.getOutlineStroke();
        multiplePiePlot13.setOutlineStroke(stroke29);
        multiplePiePlot1.setOutlineStroke(stroke29);
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        java.lang.String str34 = multiplePiePlot33.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent35 = null;
        multiplePiePlot33.markerChanged(markerChangeEvent35);
        java.awt.Paint paint37 = null;
        multiplePiePlot33.setBackgroundPaint(paint37);
        org.jfree.data.category.CategoryDataset categoryDataset39 = multiplePiePlot33.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup40 = multiplePiePlot33.getDatasetGroup();
        org.jfree.chart.plot.Plot plot41 = multiplePiePlot33.getParent();
        float float42 = multiplePiePlot33.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot43 = multiplePiePlot33.getRootPlot();
        java.awt.Stroke stroke44 = plot43.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke44);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(image25);
        org.junit.Assert.assertNotNull(legendItemCollection26);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(categoryDataset39);
        org.junit.Assert.assertNull(datasetGroup40);
        org.junit.Assert.assertNull(plot41);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 1.0f + "'", float42 == 1.0f);
        org.junit.Assert.assertNotNull(plot43);
        org.junit.Assert.assertNotNull(stroke44);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        multiplePiePlot1.setDataset(categoryDataset9);
        org.jfree.chart.JFreeChart jFreeChart11 = multiplePiePlot1.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        boolean boolean14 = multiplePiePlot13.isSubplot();
        java.awt.Paint paint15 = multiplePiePlot13.getBackgroundPaint();
        java.awt.Paint paint16 = multiplePiePlot13.getNoDataMessagePaint();
        multiplePiePlot13.setLimit((double) (byte) 1);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = multiplePiePlot13.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets19, false);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        boolean boolean24 = multiplePiePlot23.isSubplot();
        java.awt.Stroke stroke25 = multiplePiePlot23.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke25);
        java.lang.Object obj27 = multiplePiePlot1.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = multiplePiePlot1.getInsets();
        multiplePiePlot1.zoom(100.0d);
        org.jfree.data.category.CategoryDataset categoryDataset9 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(categoryDataset9);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        multiplePiePlot1.handleClick(100, (int) (short) 1, plotRenderingInfo9);
        double double11 = multiplePiePlot1.getLimit();
        int int12 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets5);
        multiplePiePlot1.zoom((double) (byte) 0);
        java.lang.String str9 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.lang.String str5 = multiplePiePlot1.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot7.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot7.setDataset(categoryDataset12);
        java.awt.Stroke stroke14 = multiplePiePlot7.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.lang.String str18 = multiplePiePlot17.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        multiplePiePlot17.markerChanged(markerChangeEvent19);
        java.awt.Paint paint21 = null;
        multiplePiePlot17.setBackgroundPaint(paint21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = multiplePiePlot17.getDataset();
        java.awt.Stroke stroke24 = multiplePiePlot17.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke24);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Multiple Pie Plot" + "'", str5, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(categoryDataset23);
        org.junit.Assert.assertNotNull(stroke24);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        float float6 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.chart.util.TableOrder tableOrder5 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.general.DatasetGroup datasetGroup6 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        multiplePiePlot1.setDataset(categoryDataset7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.lang.String str11 = multiplePiePlot10.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot10.markerChanged(markerChangeEvent12);
        java.awt.Paint paint14 = null;
        multiplePiePlot10.setBackgroundPaint(paint14);
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font18 = multiplePiePlot10.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font18);
        java.awt.Paint paint20 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tableOrder5);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot4.getInsets();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        multiplePiePlot4.datasetChanged(datasetChangeEvent10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        multiplePiePlot4.handleClick(1, (int) (byte) 0, plotRenderingInfo14);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent16 = null;
        multiplePiePlot4.datasetChanged(datasetChangeEvent16);
        java.lang.String str18 = multiplePiePlot4.getPlotType();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot4.getRootPlot();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Multiple Pie Plot" + "'", str18, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(plot19);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
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
        multiplePiePlot4.setForegroundAlpha((float) (byte) 1);
        float float18 = multiplePiePlot4.getBackgroundImageAlpha();
        java.awt.Image image19 = multiplePiePlot4.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNull(image19);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
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
        java.lang.Class<?> wildcardClass13 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Multiple Pie Plot" + "'", str12, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        java.lang.String str10 = multiplePiePlot4.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent11 = null;
        multiplePiePlot4.datasetChanged(datasetChangeEvent11);
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot4.getRootPlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = multiplePiePlot4.getDrawingSupplier();
        java.lang.String str15 = multiplePiePlot4.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
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
        boolean boolean13 = multiplePiePlot1.isOutlineVisible();
        java.awt.Paint paint14 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
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
        org.jfree.chart.LegendItemCollection legendItemCollection15 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(plot14);
        org.junit.Assert.assertNotNull(legendItemCollection15);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent10);
        multiplePiePlot1.setOutlineVisible(true);
        java.awt.Image image14 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection15 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent16 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent16);
        multiplePiePlot1.setBackgroundImageAlignment((-1));
        multiplePiePlot1.setOutlineVisible(true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertNotNull(legendItemCollection15);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
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
        multiplePiePlot1.setLimit(100.0d);
        java.awt.Paint paint15 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        multiplePiePlot1.setBackgroundImageAlpha(1.0f);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
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
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(drawingSupplier8);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.chart.util.TableOrder tableOrder4 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setForegroundAlpha(0.0f);
        org.junit.Assert.assertNotNull(tableOrder4);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Image image3 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        java.lang.Comparable comparable5 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Paint paint6 = multiplePiePlot1.getAggregatedItemsPaint();
        int int7 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + "Other" + "'", comparable5, "Other");
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        multiplePiePlot1.setBackgroundAlpha((float) (short) 10);
        org.jfree.data.general.DatasetGroup datasetGroup13 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot15.setDrawingSupplier(drawingSupplier16);
        boolean boolean19 = multiplePiePlot15.equals((java.lang.Object) 1.0d);
        multiplePiePlot15.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint22 = multiplePiePlot15.getOutlinePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint22);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(datasetGroup13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        java.awt.Paint paint6 = multiplePiePlot4.getBackgroundPaint();
        java.awt.Paint paint7 = multiplePiePlot4.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        multiplePiePlot4.setDataset(categoryDataset8);
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        multiplePiePlot4.removeChangeListener(plotChangeListener10);
        boolean boolean12 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot4);
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot4.getParent();
        java.awt.Paint paint14 = multiplePiePlot4.getAggregatedItemsPaint();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(plot13);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        java.lang.String str8 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        multiplePiePlot10.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo16);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = multiplePiePlot10.getInsets();
        org.jfree.chart.util.TableOrder tableOrder19 = multiplePiePlot10.getDataExtractOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = multiplePiePlot10.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier20);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(tableOrder19);
        org.junit.Assert.assertNotNull(drawingSupplier20);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        java.lang.String str8 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        multiplePiePlot10.setForegroundAlpha((float) 0L);
        multiplePiePlot10.setOutlineVisible(true);
        java.awt.Font font16 = multiplePiePlot10.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font16);
        multiplePiePlot1.zoom((double) 15);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        boolean boolean22 = multiplePiePlot21.isSubplot();
        multiplePiePlot21.setForegroundAlpha((float) 0L);
        java.awt.Paint paint25 = multiplePiePlot21.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        multiplePiePlot21.setDataset(categoryDataset26);
        multiplePiePlot21.setLimit((double) 10.0f);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        boolean boolean32 = multiplePiePlot31.isSubplot();
        multiplePiePlot31.setForegroundAlpha((float) 0L);
        multiplePiePlot31.setLimit((double) (byte) 100);
        org.jfree.chart.JFreeChart jFreeChart37 = multiplePiePlot31.getPieChart();
        multiplePiePlot21.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart37);
        multiplePiePlot1.setPieChart(jFreeChart37);
        java.awt.Font font40 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jFreeChart37);
        org.junit.Assert.assertNotNull(font40);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
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
        boolean boolean17 = multiplePiePlot4.equals((java.lang.Object) 1L);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent18);
        float float20 = multiplePiePlot4.getBackgroundAlpha();
        int int21 = multiplePiePlot4.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        multiplePiePlot1.setDataset(categoryDataset8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier12);
        boolean boolean15 = multiplePiePlot11.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint16 = multiplePiePlot11.getOutlinePaint();
        multiplePiePlot1.setBackgroundPaint(paint16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        boolean boolean20 = multiplePiePlot19.isSubplot();
        multiplePiePlot19.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        multiplePiePlot19.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        multiplePiePlot19.setDataset(categoryDataset27);
        java.awt.Font font29 = multiplePiePlot19.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font29);
        multiplePiePlot1.setForegroundAlpha((float) (byte) -1);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent33 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent33);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(jFreeChart6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(font29);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Stroke stroke4 = multiplePiePlot1.getOutlineStroke();
        java.lang.Comparable comparable5 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        multiplePiePlot1.handleClick((int) (byte) 0, 0, plotRenderingInfo8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertEquals("'" + comparable5 + "' != '" + "Other" + "'", comparable5, "Other");
    }
}

