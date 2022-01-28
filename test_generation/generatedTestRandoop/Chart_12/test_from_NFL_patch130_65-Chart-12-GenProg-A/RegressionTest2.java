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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier5);
        multiplePiePlot1.setForegroundAlpha(0.0f);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot1.zoom((double) (byte) 0);
        java.awt.Paint paint13 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.title.LegendTitle legendTitle16 = jFreeChart14.getLegend(100);
        jFreeChart14.setBorderVisible(false);
        java.awt.Stroke stroke19 = jFreeChart14.getBorderStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.XYPlot xYPlot20 = jFreeChart14.getXYPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.MultiplePiePlot cannot be cast to org.jfree.chart.plot.XYPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNull(legendTitle16);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setNoDataMessagePaint(paint5);
        float float7 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart("", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.data.category.CategoryDataset categoryDataset9 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setNoDataMessage("Other");
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = multiplePiePlot1.getInsets();
        float float13 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertNull(categoryDataset9);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setNoDataMessagePaint(paint5);
        float float7 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart("", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        double double9 = multiplePiePlot1.getLimit();
        multiplePiePlot1.setBackgroundImageAlignment(100);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart4.setBackgroundPaint(paint7);
        boolean boolean9 = jFreeChart4.isBorderVisible();
        jFreeChart4.setBackgroundImageAlignment(1);
        org.jfree.chart.event.ChartProgressListener chartProgressListener12 = null;
        jFreeChart4.removeProgressListener(chartProgressListener12);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage16 = jFreeChart4.createBufferedImage(0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (0) and height (1) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder2 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.util.TableOrder tableOrder5 = multiplePiePlot0.getDataExtractOrder();
        multiplePiePlot0.setBackgroundImageAlignment((int) (short) 10);
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(tableOrder2);
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertNotNull(tableOrder5);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundAlpha((float) 1L);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        multiplePiePlot1.setDataset(categoryDataset4);
        org.jfree.chart.JFreeChart jFreeChart6 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart6.setTitle("");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = jFreeChart8.getPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = jFreeChart8.getPadding();
        jFreeChart8.setAntiAlias(false);
        java.awt.Stroke stroke13 = jFreeChart8.getBorderStroke();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot14.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot14.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        multiplePiePlot14.setDataset(categoryDataset17);
        multiplePiePlot14.zoom(0.0d);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot();
        float float23 = multiplePiePlot22.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot22.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart25 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot22);
        jFreeChart25.fireChartChanged();
        boolean boolean27 = jFreeChart25.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle29 = jFreeChart25.getLegend((int) (short) 0);
        boolean boolean30 = jFreeChart25.isNotify();
        float float31 = jFreeChart25.getBackgroundImageAlpha();
        int int32 = jFreeChart25.getSubtitleCount();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo35 = null;
        java.awt.image.BufferedImage bufferedImage36 = jFreeChart25.createBufferedImage((int) (short) 1, 1, chartRenderingInfo35);
        multiplePiePlot14.setBackgroundImage((java.awt.Image) bufferedImage36);
        jFreeChart8.setBackgroundImage((java.awt.Image) bufferedImage36);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNull(plot15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(legendTitle29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.5f + "'", float31 == 0.5f);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(bufferedImage36);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj4 = multiplePiePlot3.clone();
        multiplePiePlot3.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        multiplePiePlot3.setDrawingSupplier(drawingSupplier7);
        multiplePiePlot3.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart11 = multiplePiePlot3.getPieChart();
        org.jfree.chart.title.Title title13 = jFreeChart11.getSubtitle((int) (byte) 0);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        multiplePiePlot0.handleClick((int) '4', 0, plotRenderingInfo17);
        boolean boolean19 = multiplePiePlot0.isSubplot();
        java.awt.Stroke stroke20 = multiplePiePlot0.getOutlineStroke();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertNotNull(title13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(stroke20);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.lang.Comparable comparable3 = multiplePiePlot0.getAggregatedItemsKey();
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot0.getParent();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj6 = multiplePiePlot5.clone();
        multiplePiePlot5.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot5.setDrawingSupplier(drawingSupplier9);
        multiplePiePlot5.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart13 = multiplePiePlot5.getPieChart();
        org.jfree.chart.title.Title title15 = jFreeChart13.getSubtitle((int) (byte) 0);
        jFreeChart13.removeLegend();
        jFreeChart13.removeLegend();
        multiplePiePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart13);
        org.jfree.chart.LegendItemCollection legendItemCollection19 = multiplePiePlot0.getLegendItems();
        int int20 = multiplePiePlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + "Other" + "'", comparable3, "Other");
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(jFreeChart13);
        org.junit.Assert.assertNotNull(title15);
        org.junit.Assert.assertNotNull(legendItemCollection19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        multiplePiePlot0.handleClick(1, (int) (short) 10, plotRenderingInfo10);
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder1 = multiplePiePlot0.getDataExtractOrder();
        float float2 = multiplePiePlot0.getBackgroundImageAlpha();
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
        org.junit.Assert.assertNotNull(tableOrder1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.awt.Font font1 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot2);
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("", font1, (org.jfree.chart.plot.Plot) multiplePiePlot2, false);
        boolean boolean14 = jFreeChart13.isBorderVisible();
        java.lang.Object obj15 = jFreeChart13.getTextAntiAlias();
        boolean boolean16 = jFreeChart13.isBorderVisible();
        jFreeChart13.setNotify(false);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage23 = jFreeChart13.createBufferedImage((int) (byte) 0, (int) (byte) 1, 0, chartRenderingInfo22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown image type 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        boolean boolean11 = jFreeChart4.isNotify();
        java.util.List list12 = jFreeChart4.getSubtitles();
        jFreeChart4.setNotify(true);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot6.getParent();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        float float10 = multiplePiePlot9.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot9.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart12 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot9);
        jFreeChart12.fireChartChanged();
        boolean boolean14 = jFreeChart12.getAntiAlias();
        java.awt.Paint paint15 = jFreeChart12.getBorderPaint();
        multiplePiePlot6.setAggregatedItemsPaint(paint15);
        multiplePiePlot0.setNoDataMessagePaint(paint15);
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot0.getRootPlot();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(plot7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(plot18);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = jFreeChart8.getPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = jFreeChart8.getPadding();
        org.jfree.chart.plot.Plot plot11 = jFreeChart8.getPlot();
        plot11.setForegroundAlpha((float) 0L);
        java.awt.Paint paint14 = plot11.getOutlinePaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj4 = multiplePiePlot3.clone();
        multiplePiePlot3.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        multiplePiePlot3.setDrawingSupplier(drawingSupplier7);
        multiplePiePlot3.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart11 = multiplePiePlot3.getPieChart();
        org.jfree.chart.title.Title title13 = jFreeChart11.getSubtitle((int) (byte) 0);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        multiplePiePlot0.handleClick((int) '4', 0, plotRenderingInfo17);
        boolean boolean19 = multiplePiePlot0.isSubplot();
        multiplePiePlot0.setForegroundAlpha((float) (short) -1);
        java.lang.String str22 = multiplePiePlot0.getNoDataMessage();
        int int23 = multiplePiePlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertNotNull(title13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.Title title10 = jFreeChart8.getSubtitle((int) (byte) 0);
        org.jfree.chart.plot.Plot plot11 = jFreeChart8.getPlot();
        jFreeChart8.fireChartChanged();
        org.jfree.chart.event.ChartProgressListener chartProgressListener13 = null;
        jFreeChart8.addProgressListener(chartProgressListener13);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertNotNull(plot11);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        multiplePiePlot0.zoom(0.0d);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent7 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent7);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder3 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj5 = multiplePiePlot4.clone();
        multiplePiePlot4.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = null;
        multiplePiePlot4.setDrawingSupplier(drawingSupplier8);
        multiplePiePlot4.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot4.getPieChart();
        java.awt.Image image13 = null;
        multiplePiePlot4.setBackgroundImage(image13);
        java.awt.Paint paint15 = multiplePiePlot4.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundPaint(paint15);
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("Other", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D18, rectangle2D19);
        multiplePiePlot1.setNoDataMessage("hi!");
        org.junit.Assert.assertNotNull(drawingSupplier2);
        org.junit.Assert.assertNotNull(tableOrder3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.awt.Image image8 = jFreeChart4.getBackgroundImage();
        java.awt.Paint paint9 = jFreeChart4.getBorderPaint();
        int int10 = jFreeChart4.getBackgroundImageAlignment();
        java.awt.image.BufferedImage bufferedImage13 = jFreeChart4.createBufferedImage(100, (int) 'a');
        jFreeChart4.setBorderVisible(false);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(bufferedImage13);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle8 = jFreeChart4.getLegend((int) (short) 0);
        boolean boolean9 = jFreeChart4.isNotify();
        java.util.List list10 = jFreeChart4.getSubtitles();
        java.util.List list11 = jFreeChart4.getSubtitles();
        boolean boolean12 = jFreeChart4.getAntiAlias();
        jFreeChart4.clearSubtitles();
        jFreeChart4.setBackgroundImageAlignment((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(legendTitle8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        java.lang.String str10 = multiplePiePlot0.getNoDataMessage();
        multiplePiePlot0.zoom((double) 10L);
        multiplePiePlot0.setOutlineVisible(true);
        org.jfree.chart.util.TableOrder tableOrder15 = multiplePiePlot0.getDataExtractOrder();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(tableOrder15);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle8 = jFreeChart4.getLegend((int) (short) 0);
        boolean boolean9 = jFreeChart4.isNotify();
        jFreeChart4.setBackgroundImageAlpha(0.0f);
        java.awt.Paint paint12 = jFreeChart4.getBorderPaint();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(legendTitle8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot11.getParent();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        jFreeChart17.fireChartChanged();
        boolean boolean19 = jFreeChart17.getAntiAlias();
        java.awt.Paint paint20 = jFreeChart17.getBorderPaint();
        multiplePiePlot11.setAggregatedItemsPaint(paint20);
        java.awt.Paint paint22 = multiplePiePlot11.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundPaint(paint22);
        multiplePiePlot1.setOutlineVisible(false);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNull(plot12);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        java.awt.Paint paint10 = jFreeChart9.getBackgroundPaint();
        float float11 = jFreeChart9.getBackgroundImageAlpha();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage15 = jFreeChart9.createBufferedImage((int) (short) 0, 15, chartRenderingInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (0) and height (15) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        boolean boolean11 = jFreeChart4.isNotify();
        jFreeChart4.fireChartChanged();
        org.jfree.chart.plot.Plot plot13 = jFreeChart4.getPlot();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        java.awt.geom.Point2D point2D16 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo17 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.draw(graphics2D14, rectangle2D15, point2D16, chartRenderingInfo17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(plot13);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.JFreeChart jFreeChart3 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        int int4 = multiplePiePlot0.getBackgroundImageAlignment();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot0.getParent();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNull(plot5);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = jFreeChart4.getPadding();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.CategoryPlot categoryPlot8 = jFreeChart4.getCategoryPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.MultiplePiePlot cannot be cast to org.jfree.chart.plot.CategoryPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder1 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder3 = multiplePiePlot2.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot0.getLegendItems();
        multiplePiePlot0.setBackgroundAlpha(0.0f);
        java.lang.String str9 = multiplePiePlot0.getPlotType();
        multiplePiePlot0.setLimit(0.0d);
        multiplePiePlot0.setNoDataMessage("");
        org.junit.Assert.assertNotNull(tableOrder1);
        org.junit.Assert.assertNotNull(tableOrder3);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertNotNull(legendItemCollection6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Multiple Pie Plot" + "'", str9, "Multiple Pie Plot");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        java.awt.Paint paint10 = jFreeChart9.getBackgroundPaint();
        java.awt.Paint paint11 = jFreeChart9.getBackgroundPaint();
        int int12 = jFreeChart9.getBackgroundImageAlignment();
        java.awt.Stroke stroke13 = jFreeChart9.getBorderStroke();
        org.jfree.chart.plot.Plot plot14 = jFreeChart9.getPlot();
        java.awt.Paint paint15 = jFreeChart9.getBackgroundPaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D11, rectangle2D12);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = multiplePiePlot0.getInsets();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent15 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent15);
        float float17 = multiplePiePlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent2);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot();
        float float6 = multiplePiePlot5.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot5.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot5);
        java.awt.Paint paint9 = jFreeChart8.getBackgroundPaint();
        java.awt.Stroke stroke10 = jFreeChart8.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle11 = jFreeChart8.getTitle();
        java.awt.Image image12 = jFreeChart8.getBackgroundImage();
        java.awt.Paint paint13 = jFreeChart8.getBorderPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint13);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot1.getParent();
        multiplePiePlot1.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        multiplePiePlot1.setDataset(categoryDataset18);
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(textTitle11);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(plot15);
        org.junit.Assert.assertNotNull(jFreeChart20);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = jFreeChart8.getPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = jFreeChart8.getPadding();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj12 = multiplePiePlot11.clone();
        multiplePiePlot11.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier15);
        multiplePiePlot11.setForegroundAlpha(0.0f);
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        int int21 = multiplePiePlot11.getBackgroundImageAlignment();
        java.awt.Paint paint22 = multiplePiePlot11.getAggregatedItemsPaint();
        java.awt.Paint paint23 = multiplePiePlot11.getBackgroundPaint();
        jFreeChart8.setBorderPaint(paint23);
        boolean boolean25 = jFreeChart8.isBorderVisible();
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo28 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.draw(graphics2D26, rectangle2D27, chartRenderingInfo28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getRootPlot();
        multiplePiePlot0.setBackgroundImageAlignment(0);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent5);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj8 = multiplePiePlot7.clone();
        multiplePiePlot7.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot7.setDrawingSupplier(drawingSupplier11);
        multiplePiePlot7.setForegroundAlpha(0.0f);
        multiplePiePlot7.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        java.lang.String str17 = multiplePiePlot7.getNoDataMessage();
        java.awt.Font font18 = multiplePiePlot7.getNoDataMessageFont();
        multiplePiePlot0.setParent((org.jfree.chart.plot.Plot) multiplePiePlot7);
        java.awt.Paint paint20 = multiplePiePlot0.getAggregatedItemsPaint();
        java.awt.Paint paint21 = multiplePiePlot0.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(plot2);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) "");
        org.jfree.chart.util.TableOrder tableOrder10 = multiplePiePlot0.getDataExtractOrder();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(tableOrder10);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        java.lang.String str8 = multiplePiePlot0.getNoDataMessage();
        multiplePiePlot0.setForegroundAlpha(10.0f);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = multiplePiePlot0.getLegendItems();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(drawingSupplier11);
        org.junit.Assert.assertNull(plot12);
        org.junit.Assert.assertNotNull(legendItemCollection13);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart1 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        java.awt.Paint paint2 = multiplePiePlot0.getAggregatedItemsPaint();
        org.junit.Assert.assertNull(paint2);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        java.awt.Paint paint10 = jFreeChart9.getBackgroundPaint();
        java.awt.Paint paint11 = jFreeChart9.getBackgroundPaint();
        int int12 = jFreeChart9.getBackgroundImageAlignment();
        java.awt.Stroke stroke13 = jFreeChart9.getBorderStroke();
        org.jfree.chart.plot.Plot plot14 = jFreeChart9.getPlot();
        org.jfree.chart.plot.Plot plot15 = plot14.getRootPlot();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(plot15);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        multiplePiePlot2.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        int int12 = multiplePiePlot2.getBackgroundImageAlignment();
        java.awt.Paint paint13 = multiplePiePlot2.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart14 = multiplePiePlot2.getPieChart();
        multiplePiePlot2.setBackgroundAlpha((float) (short) 10);
        boolean boolean17 = multiplePiePlot0.equals((java.lang.Object) multiplePiePlot2);
        java.awt.Paint paint18 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj21 = multiplePiePlot20.clone();
        multiplePiePlot20.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = null;
        multiplePiePlot20.setDrawingSupplier(drawingSupplier24);
        multiplePiePlot20.setForegroundAlpha(0.0f);
        multiplePiePlot20.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot20.zoom((double) (byte) 0);
        boolean boolean32 = multiplePiePlot20.isSubplot();
        multiplePiePlot20.zoom((double) 100.0f);
        org.jfree.chart.JFreeChart jFreeChart35 = new org.jfree.chart.JFreeChart("Other", (org.jfree.chart.plot.Plot) multiplePiePlot20);
        org.jfree.chart.event.ChartProgressListener chartProgressListener36 = null;
        jFreeChart35.addProgressListener(chartProgressListener36);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.setPieChart(jFreeChart35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'pieChart' argument must be a chart based on a PiePlot.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(jFreeChart14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart1 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = jFreeChart1.getPadding();
        jFreeChart1.removeLegend();
        jFreeChart1.setTitle("Multiple Pie Plot");
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart1.draw(graphics2D6, rectangle2D7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets2);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.JFreeChart jFreeChart3 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        int int4 = multiplePiePlot0.getBackgroundImageAlignment();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent5);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.awt.Font font1 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot2);
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("", font1, (org.jfree.chart.plot.Plot) multiplePiePlot2, false);
        jFreeChart13.setAntiAlias(false);
        jFreeChart13.setNotify(true);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo20 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart13.handleClick((-1), 10, chartRenderingInfo20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        multiplePiePlot0.setLimit((double) 0);
        java.awt.Paint paint7 = multiplePiePlot0.getAggregatedItemsPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent8);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier14);
        multiplePiePlot10.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot10.getPieChart();
        org.jfree.chart.title.Title title20 = jFreeChart18.getSubtitle((int) (byte) 0);
        jFreeChart18.removeLegend();
        org.jfree.chart.title.LegendTitle legendTitle22 = jFreeChart18.getLegend();
        multiplePiePlot0.setPieChart(jFreeChart18);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent24);
        java.lang.String str26 = multiplePiePlot0.getPlotType();
        boolean boolean27 = multiplePiePlot0.isSubplot();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(jFreeChart18);
        org.junit.Assert.assertNotNull(title20);
        org.junit.Assert.assertNotNull(legendTitle22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Multiple Pie Plot" + "'", str26, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        java.awt.Image image9 = null;
        multiplePiePlot0.setBackgroundImage(image9);
        org.jfree.chart.JFreeChart jFreeChart11 = multiplePiePlot0.getPieChart();
        double double12 = multiplePiePlot0.getLimit();
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot0.getParent();
        java.lang.String str14 = multiplePiePlot0.getNoDataMessage();
        java.awt.Paint paint15 = multiplePiePlot0.getAggregatedItemsPaint();
        java.awt.Paint paint16 = multiplePiePlot0.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(plot13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle8 = jFreeChart4.getLegend((int) (short) 0);
        boolean boolean9 = jFreeChart4.isNotify();
        float float10 = jFreeChart4.getBackgroundImageAlpha();
        java.awt.Paint paint11 = jFreeChart4.getBorderPaint();
        java.awt.RenderingHints renderingHints12 = jFreeChart4.getRenderingHints();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(legendTitle8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(renderingHints12);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getRootPlot();
        plot8.setBackgroundImageAlignment((int) (byte) 100);
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart(plot8);
        jFreeChart11.setBackgroundImageAlignment(100);
        java.awt.Stroke stroke14 = jFreeChart11.getBorderStroke();
        org.jfree.chart.title.LegendTitle legendTitle15 = jFreeChart11.getLegend();
        java.util.List list16 = jFreeChart11.getSubtitles();
        java.awt.Image image17 = jFreeChart11.getBackgroundImage();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(legendTitle15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertNull(image17);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        java.awt.Image image9 = null;
        multiplePiePlot0.setBackgroundImage(image9);
        org.jfree.chart.JFreeChart jFreeChart11 = multiplePiePlot0.getPieChart();
        java.awt.Image image12 = jFreeChart11.getBackgroundImage();
        jFreeChart11.clearSubtitles();
        java.awt.Stroke stroke14 = jFreeChart11.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle15 = jFreeChart11.getTitle();
        java.awt.Font font17 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot();
        float float20 = multiplePiePlot19.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot19.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart22 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot19);
        multiplePiePlot19.setForegroundAlpha((float) (byte) 0);
        java.awt.Paint paint25 = multiplePiePlot19.getOutlinePaint();
        org.jfree.chart.JFreeChart jFreeChart27 = new org.jfree.chart.JFreeChart("hi!", font17, (org.jfree.chart.plot.Plot) multiplePiePlot19, true);
        java.lang.Object obj28 = jFreeChart27.getTextAntiAlias();
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart11.setTextAntiAlias((java.lang.Object) jFreeChart27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: org.jfree.chart.JFreeChart@39964816 incompatible with Text-specific antialiasing enable key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNull(textTitle15);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNotNull(plot21);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent5);
        java.awt.Paint paint7 = multiplePiePlot1.getAggregatedItemsPaint();
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        int int11 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        jFreeChart4.removeLegend();
        boolean boolean12 = jFreeChart4.isNotify();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 10.0f);
        java.awt.Paint paint4 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setNoDataMessagePaint(paint4);
        float float6 = multiplePiePlot0.getBackgroundAlpha();
        multiplePiePlot0.setBackgroundAlpha(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent2);
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        org.jfree.chart.JFreeChart jFreeChart7 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(categoryDataset6);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getRootPlot();
        multiplePiePlot0.setBackgroundImageAlignment(0);
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot0.getRootPlot();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot6.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection8 = multiplePiePlot6.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        multiplePiePlot6.setDataset(categoryDataset9);
        multiplePiePlot6.setLimit((double) 0);
        java.awt.Paint paint13 = multiplePiePlot6.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot6);
        java.awt.Font font15 = multiplePiePlot6.getNoDataMessageFont();
        plot5.setNoDataMessageFont(font15);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(plot2);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertNull(plot7);
        org.junit.Assert.assertNotNull(legendItemCollection8);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(font15);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle8 = jFreeChart4.getLegend((int) (short) 0);
        boolean boolean9 = jFreeChart4.isNotify();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = jFreeChart4.getPadding();
        org.jfree.chart.event.ChartChangeListener chartChangeListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.addChangeListener(chartChangeListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(legendTitle8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(rectangleInsets10);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle8 = jFreeChart4.getLegend((int) (short) 0);
        boolean boolean9 = jFreeChart4.isNotify();
        java.util.List list10 = jFreeChart4.getSubtitles();
        java.util.List list11 = jFreeChart4.getSubtitles();
        org.jfree.chart.title.TextTitle textTitle12 = jFreeChart4.getTitle();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(legendTitle8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(textTitle12);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart4.setBackgroundPaint(paint7);
        org.jfree.chart.event.ChartProgressListener chartProgressListener9 = null;
        jFreeChart4.addProgressListener(chartProgressListener9);
        jFreeChart4.setNotify(false);
        org.jfree.chart.event.ChartProgressListener chartProgressListener13 = null;
        jFreeChart4.removeProgressListener(chartProgressListener13);
        java.lang.Object obj15 = jFreeChart4.getTextAntiAlias();
        jFreeChart4.setTextAntiAlias(true);
        org.jfree.chart.event.ChartChangeListener chartChangeListener18 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.removeChangeListener(chartChangeListener18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.awt.Image image8 = jFreeChart4.getBackgroundImage();
        java.awt.Paint paint9 = jFreeChart4.getBorderPaint();
        boolean boolean10 = jFreeChart4.isNotify();
        org.jfree.chart.title.LegendTitle legendTitle12 = jFreeChart4.getLegend((int) (short) 10);
        float float13 = jFreeChart4.getBackgroundImageAlpha();
        jFreeChart4.fireChartChanged();
        java.util.List list15 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.setSubtitles(list15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null 'subtitles' argument.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(legendTitle12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        int int10 = multiplePiePlot0.getBackgroundImageAlignment();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        multiplePiePlot0.handleClick(100, 15, plotRenderingInfo13);
        multiplePiePlot0.setBackgroundAlpha((float) 15);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = jFreeChart8.getPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = jFreeChart8.getPadding();
        java.awt.Paint paint11 = jFreeChart8.getBorderPaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        int int9 = jFreeChart8.getSubtitleCount();
        boolean boolean10 = jFreeChart8.isBorderVisible();
        jFreeChart8.setBorderVisible(true);
        java.awt.image.BufferedImage bufferedImage15 = jFreeChart8.createBufferedImage(100, 1);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bufferedImage15);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.lang.Object obj8 = jFreeChart4.clone();
        java.awt.Stroke stroke9 = jFreeChart4.getBorderStroke();
        java.awt.Stroke stroke10 = jFreeChart4.getBorderStroke();
        boolean boolean11 = jFreeChart4.getAntiAlias();
        int int12 = jFreeChart4.getBackgroundImageAlignment();
        java.lang.Object obj13 = jFreeChart4.getTextAntiAlias();
        java.awt.Paint paint14 = jFreeChart4.getBorderPaint();
        org.jfree.chart.event.ChartChangeListener chartChangeListener15 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.addChangeListener(chartChangeListener15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        org.jfree.chart.plot.Plot plot8 = jFreeChart4.getPlot();
        jFreeChart4.setAntiAlias(true);
        int int11 = jFreeChart4.getSubtitleCount();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint4 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setNoDataMessagePaint(paint4);
        java.awt.Font font6 = multiplePiePlot0.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = multiplePiePlot0.getDrawingSupplier();
        java.lang.String str8 = multiplePiePlot0.getNoDataMessage();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot0.getParent();
        org.jfree.data.general.DatasetGroup datasetGroup10 = multiplePiePlot0.getDatasetGroup();
        int int11 = multiplePiePlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(drawingSupplier7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(plot9);
        org.junit.Assert.assertNull(datasetGroup10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint4 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setNoDataMessagePaint(paint4);
        java.awt.Font font6 = multiplePiePlot0.getNoDataMessageFont();
        multiplePiePlot0.setBackgroundImageAlpha((float) (byte) 0);
        float float9 = multiplePiePlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot0.getParent();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNull(plot9);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent2);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot();
        float float6 = multiplePiePlot5.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot5.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot5);
        java.awt.Paint paint9 = jFreeChart8.getBackgroundPaint();
        java.awt.Stroke stroke10 = jFreeChart8.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle11 = jFreeChart8.getTitle();
        java.awt.Image image12 = jFreeChart8.getBackgroundImage();
        java.awt.Paint paint13 = jFreeChart8.getBorderPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint13);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot1.getParent();
        multiplePiePlot1.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        multiplePiePlot1.setDataset(categoryDataset18);
        java.awt.Image image20 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(textTitle11);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(plot15);
        org.junit.Assert.assertNull(image20);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.lang.Object obj8 = jFreeChart4.clone();
        java.awt.Stroke stroke9 = jFreeChart4.getBorderStroke();
        java.awt.Stroke stroke10 = jFreeChart4.getBorderStroke();
        int int11 = jFreeChart4.getBackgroundImageAlignment();
        org.jfree.chart.event.ChartProgressListener chartProgressListener12 = null;
        jFreeChart4.addProgressListener(chartProgressListener12);
        org.jfree.chart.title.TextTitle textTitle14 = jFreeChart4.getTitle();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj16 = multiplePiePlot15.clone();
        multiplePiePlot15.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = null;
        multiplePiePlot15.setDrawingSupplier(drawingSupplier19);
        multiplePiePlot15.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot15.getPieChart();
        java.awt.Image image24 = null;
        multiplePiePlot15.setBackgroundImage(image24);
        boolean boolean26 = multiplePiePlot15.isSubplot();
        org.jfree.chart.plot.Plot plot27 = multiplePiePlot15.getParent();
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.setTextAntiAlias((java.lang.Object) multiplePiePlot15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: org.jfree.chart.plot.MultiplePiePlot@7dec8c60 incompatible with Text-specific antialiasing enable key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(textTitle14);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(jFreeChart23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(plot27);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier6);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        java.awt.Image image9 = jFreeChart8.getBackgroundImage();
        java.awt.Stroke stroke10 = jFreeChart8.getBorderStroke();
        jFreeChart8.fireChartChanged();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener7 = null;
        jFreeChart4.addProgressListener(chartProgressListener7);
        org.jfree.chart.event.ChartProgressListener chartProgressListener9 = null;
        jFreeChart4.removeProgressListener(chartProgressListener9);
        java.awt.Image image11 = jFreeChart4.getBackgroundImage();
        float float12 = jFreeChart4.getBackgroundImageAlpha();
        boolean boolean13 = jFreeChart4.isBorderVisible();
        org.jfree.chart.event.ChartProgressListener chartProgressListener14 = null;
        jFreeChart4.removeProgressListener(chartProgressListener14);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = jFreeChart4.getPadding();
        java.lang.Object obj17 = jFreeChart4.clone();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        float float2 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Stroke stroke3 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot0.setOutlineStroke(stroke3);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj6 = multiplePiePlot5.clone();
        multiplePiePlot5.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot5.setDrawingSupplier(drawingSupplier9);
        java.awt.Paint paint11 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot5.setBackgroundPaint(paint11);
        multiplePiePlot0.setBackgroundPaint(paint11);
        multiplePiePlot0.setForegroundAlpha(100.0f);
        java.awt.Paint paint16 = multiplePiePlot0.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.awt.Paint paint3 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent4);
        java.lang.Object obj6 = multiplePiePlot0.clone();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        multiplePiePlot0.handleClick(10, 1, plotRenderingInfo9);
        java.awt.Stroke stroke11 = multiplePiePlot0.getOutlineStroke();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        java.lang.String str9 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.JFreeChart jFreeChart10 = new org.jfree.chart.JFreeChart("", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.plot.Plot plot11 = jFreeChart10.getPlot();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(plot11);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.awt.Paint paint3 = multiplePiePlot0.getOutlinePaint();
        multiplePiePlot0.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot0.setDataset(categoryDataset6);
        multiplePiePlot0.zoom((double) 0.0f);
        multiplePiePlot0.zoom((double) '#');
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle8 = jFreeChart4.getLegend((int) (short) 0);
        boolean boolean9 = jFreeChart4.isNotify();
        java.util.List list10 = jFreeChart4.getSubtitles();
        jFreeChart4.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.CategoryPlot categoryPlot13 = jFreeChart4.getCategoryPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.MultiplePiePlot cannot be cast to org.jfree.chart.plot.CategoryPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(legendTitle8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot0.setInsets(rectangleInsets3);
        multiplePiePlot0.setOutlineVisible(true);
        multiplePiePlot0.setNoDataMessage("Multiple Pie Plot");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = jFreeChart8.getPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = jFreeChart8.getPadding();
        jFreeChart8.setAntiAlias(false);
        java.awt.Stroke stroke13 = jFreeChart8.getBorderStroke();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.XYPlot xYPlot14 = jFreeChart8.getXYPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.PiePlot cannot be cast to org.jfree.chart.plot.XYPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setForegroundAlpha((float) (-1L));
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        float float9 = multiplePiePlot8.getBackgroundAlpha();
        java.awt.Paint paint10 = multiplePiePlot8.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart12 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", font7, (org.jfree.chart.plot.Plot) multiplePiePlot8, true);
        org.jfree.chart.util.TableOrder tableOrder13 = multiplePiePlot8.getDataExtractOrder();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(tableOrder13);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.awt.Paint paint3 = multiplePiePlot0.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        multiplePiePlot0.setDataset(categoryDataset4);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) -1);
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        jFreeChart4.setTitle("hi!");
        org.jfree.chart.title.TextTitle textTitle9 = jFreeChart4.getTitle();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = jFreeChart4.getPadding();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(textTitle9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setForegroundAlpha((float) (-1L));
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj9 = multiplePiePlot8.clone();
        multiplePiePlot8.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier12);
        multiplePiePlot8.zoom(0.0d);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        multiplePiePlot8.drawBackgroundImage(graphics2D16, rectangle2D17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        multiplePiePlot8.setDataset(categoryDataset19);
        java.lang.String str21 = multiplePiePlot8.getPlotType();
        org.jfree.chart.JFreeChart jFreeChart23 = new org.jfree.chart.JFreeChart("Other", font7, (org.jfree.chart.plot.Plot) multiplePiePlot8, true);
        java.awt.Image image24 = jFreeChart23.getBackgroundImage();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage30 = jFreeChart23.createBufferedImage((int) (short) 0, (int) (byte) 100, (double) ' ', (double) (-1L), chartRenderingInfo29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (0) and height (100) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Multiple Pie Plot" + "'", str21, "Multiple Pie Plot");
        org.junit.Assert.assertNull(image24);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier5);
        multiplePiePlot1.setForegroundAlpha(0.0f);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot1.zoom((double) (byte) 0);
        java.awt.Paint paint13 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Stroke stroke15 = jFreeChart14.getBorderStroke();
        boolean boolean16 = jFreeChart14.isBorderVisible();
        jFreeChart14.setAntiAlias(true);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        multiplePiePlot0.setNoDataMessage("hi!");
        org.jfree.data.category.CategoryDataset categoryDataset9 = multiplePiePlot0.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot0.getDataset();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent11);
        java.awt.Image image13 = multiplePiePlot0.getBackgroundImage();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot0.getRootPlot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent15);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertNull(categoryDataset9);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNotNull(plot14);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        java.awt.Image image7 = jFreeChart4.getBackgroundImage();
        jFreeChart4.removeLegend();
        org.jfree.chart.event.ChartChangeListener chartChangeListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.removeChangeListener(chartChangeListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNull(image7);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundAlpha((float) 1L);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        multiplePiePlot1.setDataset(categoryDataset4);
        org.jfree.chart.JFreeChart jFreeChart6 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart6.setAntiAlias(false);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.lang.Object obj8 = jFreeChart4.clone();
        java.awt.Stroke stroke9 = jFreeChart4.getBorderStroke();
        jFreeChart4.setAntiAlias(true);
        org.jfree.chart.title.LegendTitle legendTitle13 = jFreeChart4.getLegend(100);
        jFreeChart4.setNotify(false);
        org.jfree.chart.title.TextTitle textTitle16 = jFreeChart4.getTitle();
        boolean boolean17 = jFreeChart4.isBorderVisible();
        int int18 = jFreeChart4.getBackgroundImageAlignment();
        jFreeChart4.removeLegend();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(legendTitle13);
        org.junit.Assert.assertNotNull(textTitle16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart4.setBackgroundPaint(paint7);
        boolean boolean9 = jFreeChart4.isBorderVisible();
        jFreeChart4.setBackgroundImageAlignment(1);
        jFreeChart4.removeLegend();
        java.awt.image.BufferedImage bufferedImage15 = jFreeChart4.createBufferedImage((int) (short) 1, (int) ' ');
        jFreeChart4.fireChartChanged();
        java.awt.Paint paint17 = jFreeChart4.getBorderPaint();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bufferedImage15);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        multiplePiePlot0.setForegroundAlpha((-1.0f));
        java.awt.Paint paint11 = multiplePiePlot0.getBackgroundPaint();
        multiplePiePlot0.setOutlineVisible(true);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent14 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent14);
        java.lang.Comparable comparable16 = multiplePiePlot0.getAggregatedItemsKey();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + "Other" + "'", comparable16, "Other");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        int int7 = jFreeChart4.getSubtitleCount();
        java.awt.Image image8 = jFreeChart4.getBackgroundImage();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = jFreeChart4.getPadding();
        java.util.List list10 = jFreeChart4.getSubtitles();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.title.LegendTitle legendTitle5 = jFreeChart4.getLegend();
        org.jfree.chart.title.LegendTitle legendTitle6 = jFreeChart4.getLegend();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.draw(graphics2D7, rectangle2D8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(legendTitle5);
        org.junit.Assert.assertNotNull(legendTitle6);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent5);
        java.awt.Paint paint7 = multiplePiePlot1.getAggregatedItemsPaint();
        multiplePiePlot1.setForegroundAlpha((float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNull(paint7);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        java.awt.Stroke stroke9 = multiplePiePlot0.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = multiplePiePlot0.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Paint paint2 = multiplePiePlot0.getNoDataMessagePaint();
        java.awt.Font font3 = multiplePiePlot0.getNoDataMessageFont();
        int int4 = multiplePiePlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(font3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot0.getDatasetGroup();
        java.awt.Font font9 = multiplePiePlot0.getNoDataMessageFont();
        java.lang.String str10 = multiplePiePlot0.getNoDataMessage();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        int int9 = jFreeChart8.getSubtitleCount();
        boolean boolean10 = jFreeChart8.isBorderVisible();
        float float11 = jFreeChart8.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot1.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        multiplePiePlot1.setDataset(categoryDataset4);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot7.getParent();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        float float11 = multiplePiePlot10.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot10.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot10);
        jFreeChart13.fireChartChanged();
        boolean boolean15 = jFreeChart13.getAntiAlias();
        java.awt.Paint paint16 = jFreeChart13.getBorderPaint();
        multiplePiePlot7.setAggregatedItemsPaint(paint16);
        multiplePiePlot1.setNoDataMessagePaint(paint16);
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = multiplePiePlot1.getInsets();
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(rectangleInsets20);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getRootPlot();
        multiplePiePlot0.setBackgroundImageAlignment(0);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent5);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj8 = multiplePiePlot7.clone();
        multiplePiePlot7.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot7.setDrawingSupplier(drawingSupplier11);
        multiplePiePlot7.setForegroundAlpha(0.0f);
        multiplePiePlot7.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        java.lang.String str17 = multiplePiePlot7.getNoDataMessage();
        java.awt.Font font18 = multiplePiePlot7.getNoDataMessageFont();
        multiplePiePlot0.setParent((org.jfree.chart.plot.Plot) multiplePiePlot7);
        int int20 = multiplePiePlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(plot2);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier5);
        multiplePiePlot1.setLimit((double) 100L);
        multiplePiePlot1.setBackgroundImageAlignment(15);
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D12, rectangle2D13);
        float float15 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        jFreeChart4.setTitle("hi!");
        org.jfree.chart.title.TextTitle textTitle9 = jFreeChart4.getTitle();
        java.awt.Paint paint10 = jFreeChart4.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(textTitle9);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = jFreeChart8.getPadding();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        float float12 = multiplePiePlot11.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot11.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot11);
        jFreeChart14.fireChartChanged();
        java.lang.Object obj16 = jFreeChart14.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo19 = null;
        java.awt.image.BufferedImage bufferedImage20 = jFreeChart14.createBufferedImage((int) '#', 1, chartRenderingInfo19);
        boolean boolean21 = jFreeChart14.isNotify();
        java.awt.Paint paint22 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart14.setBorderPaint(paint22);
        jFreeChart8.setBorderPaint(paint22);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent25 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.plotChanged(plotChangeEvent25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(bufferedImage20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        java.awt.Image image9 = null;
        multiplePiePlot0.setBackgroundImage(image9);
        org.jfree.chart.JFreeChart jFreeChart11 = multiplePiePlot0.getPieChart();
        int int12 = multiplePiePlot0.getBackgroundImageAlignment();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier17);
        multiplePiePlot13.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot13.getPieChart();
        java.awt.Image image22 = null;
        multiplePiePlot13.setBackgroundImage(image22);
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot13.getPieChart();
        java.awt.Image image25 = jFreeChart24.getBackgroundImage();
        jFreeChart24.clearSubtitles();
        java.awt.Stroke stroke27 = jFreeChart24.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle28 = jFreeChart24.getTitle();
        multiplePiePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart24);
        java.awt.Stroke stroke30 = jFreeChart24.getBorderStroke();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(jFreeChart21);
        org.junit.Assert.assertNotNull(jFreeChart24);
        org.junit.Assert.assertNull(image25);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNull(textTitle28);
        org.junit.Assert.assertNotNull(stroke30);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier6);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        jFreeChart8.setNotify(false);
        int int11 = jFreeChart8.getBackgroundImageAlignment();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        jFreeChart16.fireChartChanged();
        java.awt.Image image18 = jFreeChart16.getBackgroundImage();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo23 = null;
        java.awt.image.BufferedImage bufferedImage24 = jFreeChart16.createBufferedImage((int) 'a', (int) ' ', (double) (byte) 10, (double) 10, chartRenderingInfo23);
        jFreeChart8.setBackgroundImage((java.awt.Image) bufferedImage24);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo28 = null;
        java.awt.image.BufferedImage bufferedImage29 = jFreeChart8.createBufferedImage(10, (int) (short) 10, chartRenderingInfo28);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNull(image18);
        org.junit.Assert.assertNotNull(bufferedImage24);
        org.junit.Assert.assertNotNull(bufferedImage29);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = multiplePiePlot0.getLegendItems();
        double double6 = multiplePiePlot0.getLimit();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        int int9 = jFreeChart8.getSubtitleCount();
        jFreeChart8.fireChartChanged();
        java.awt.Image image11 = null;
        jFreeChart8.setBackgroundImage(image11);
        jFreeChart8.fireChartChanged();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setNoDataMessagePaint(paint5);
        float float7 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart("", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        double double9 = multiplePiePlot1.getLimit();
        boolean boolean10 = multiplePiePlot1.isOutlineVisible();
        java.lang.Class<?> wildcardClass11 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent8);
        java.awt.Image image10 = multiplePiePlot0.getBackgroundImage();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = multiplePiePlot0.getInsets();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot0.getRootPlot();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(image10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(plot12);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot0.getRootPlot();
        multiplePiePlot0.setNoDataMessage("");
        java.awt.Paint paint12 = multiplePiePlot0.getAggregatedItemsPaint();
        multiplePiePlot0.setBackgroundImageAlignment((int) (byte) 10);
        java.awt.Paint paint15 = multiplePiePlot0.getBackgroundPaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener7 = null;
        jFreeChart4.addProgressListener(chartProgressListener7);
        org.jfree.chart.event.ChartProgressListener chartProgressListener9 = null;
        jFreeChart4.removeProgressListener(chartProgressListener9);
        java.awt.Image image11 = jFreeChart4.getBackgroundImage();
        float float12 = jFreeChart4.getBackgroundImageAlpha();
        boolean boolean13 = jFreeChart4.isBorderVisible();
        org.jfree.chart.event.ChartProgressListener chartProgressListener14 = null;
        jFreeChart4.removeProgressListener(chartProgressListener14);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = jFreeChart4.getPadding();
        jFreeChart4.fireChartChanged();
        jFreeChart4.setBorderVisible(false);
        org.jfree.chart.title.LegendTitle legendTitle20 = jFreeChart4.getLegend();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(legendTitle20);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.JFreeChart jFreeChart2 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        java.lang.Object obj3 = multiplePiePlot0.clone();
        java.awt.Font font4 = multiplePiePlot0.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(font4);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.awt.Image image8 = jFreeChart4.getBackgroundImage();
        jFreeChart4.removeLegend();
        org.jfree.chart.event.ChartProgressListener chartProgressListener10 = null;
        jFreeChart4.removeProgressListener(chartProgressListener10);
        boolean boolean12 = jFreeChart4.isNotify();
        java.awt.Stroke stroke13 = jFreeChart4.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener14 = null;
        jFreeChart4.addProgressListener(chartProgressListener14);
        jFreeChart4.setBackgroundImageAlignment(10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.Title title10 = jFreeChart8.getSubtitle((int) (byte) 0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        jFreeChart15.fireChartChanged();
        boolean boolean17 = jFreeChart15.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle19 = jFreeChart15.getLegend((int) (short) 0);
        jFreeChart8.addLegend(legendTitle19);
        org.jfree.chart.title.TextTitle textTitle21 = null;
        jFreeChart8.setTitle(textTitle21);
        org.jfree.chart.event.ChartProgressListener chartProgressListener23 = null;
        jFreeChart8.removeProgressListener(chartProgressListener23);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.CategoryPlot categoryPlot25 = jFreeChart8.getCategoryPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.PiePlot cannot be cast to org.jfree.chart.plot.CategoryPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(legendTitle19);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getRootPlot();
        plot8.setBackgroundImageAlignment((int) (byte) 100);
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart(plot8);
        jFreeChart11.setBackgroundImageAlignment(100);
        java.awt.Stroke stroke14 = jFreeChart11.getBorderStroke();
        org.jfree.chart.title.LegendTitle legendTitle15 = jFreeChart11.getLegend();
        org.jfree.chart.event.ChartProgressListener chartProgressListener16 = null;
        jFreeChart11.addProgressListener(chartProgressListener16);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(legendTitle15);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        java.awt.Paint paint7 = jFreeChart4.getBorderPaint();
        java.lang.Object obj8 = jFreeChart4.clone();
        jFreeChart4.setAntiAlias(false);
        jFreeChart4.setTextAntiAlias(false);
        org.jfree.chart.event.ChartChangeListener chartChangeListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.addChangeListener(chartChangeListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets4, false);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj8 = multiplePiePlot7.clone();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        multiplePiePlot7.setDataset(categoryDataset9);
        java.awt.Font font11 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot7.setNoDataMessageFont(font11);
        java.lang.String str13 = multiplePiePlot7.getPlotType();
        boolean boolean14 = multiplePiePlot7.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot7.setInsets(rectangleInsets15, false);
        multiplePiePlot1.setInsets(rectangleInsets15, false);
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot1.getParent();
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.JFreeChart jFreeChart22 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Multiple Pie Plot" + "'", str13, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNull(plot20);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.lang.Object obj8 = jFreeChart4.clone();
        java.awt.Stroke stroke9 = jFreeChart4.getBorderStroke();
        java.awt.Stroke stroke10 = jFreeChart4.getBorderStroke();
        int int11 = jFreeChart4.getBackgroundImageAlignment();
        org.jfree.chart.event.TitleChangeEvent titleChangeEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.titleChanged(titleChangeEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        double double8 = multiplePiePlot0.getLimit();
        java.awt.Paint paint9 = multiplePiePlot0.getNoDataMessagePaint();
        java.awt.Font font10 = multiplePiePlot0.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(font10);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        java.awt.Font font1 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot2);
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("", font1, (org.jfree.chart.plot.Plot) multiplePiePlot2, false);
        jFreeChart13.setAntiAlias(false);
        org.jfree.chart.title.Title title16 = null;
        jFreeChart13.removeSubtitle(title16);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent18 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart13.plotChanged(plotChangeEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        boolean boolean8 = jFreeChart4.isNotify();
        java.awt.Image image9 = jFreeChart4.getBackgroundImage();
        java.lang.Object obj10 = jFreeChart4.clone();
        jFreeChart4.setNotify(false);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        java.lang.String str9 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.JFreeChart jFreeChart10 = new org.jfree.chart.JFreeChart("", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        int int11 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent12 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent12);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier5);
        multiplePiePlot1.setLimit((double) 100L);
        multiplePiePlot1.setBackgroundImageAlignment(15);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        multiplePiePlot1.setDataset(categoryDataset11);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent13 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent13);
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.XYPlot xYPlot16 = jFreeChart15.getXYPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.MultiplePiePlot cannot be cast to org.jfree.chart.plot.XYPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart4.setBackgroundPaint(paint7);
        boolean boolean9 = jFreeChart4.isBorderVisible();
        jFreeChart4.setBackgroundImageAlignment(1);
        org.jfree.chart.event.ChartProgressListener chartProgressListener12 = null;
        jFreeChart4.removeProgressListener(chartProgressListener12);
        jFreeChart4.removeLegend();
        jFreeChart4.setAntiAlias(true);
        jFreeChart4.clearSubtitles();
        org.jfree.chart.title.LegendTitle legendTitle18 = jFreeChart4.getLegend();
        boolean boolean19 = jFreeChart4.getAntiAlias();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(legendTitle18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        int int7 = jFreeChart4.getSubtitleCount();
        java.awt.Image image8 = jFreeChart4.getBackgroundImage();
        org.jfree.chart.plot.Plot plot9 = jFreeChart4.getPlot();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(plot9);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent11);
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle8 = jFreeChart4.getLegend((int) (short) 0);
        boolean boolean9 = jFreeChart4.isNotify();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = jFreeChart4.getPadding();
        float float11 = jFreeChart4.getBackgroundImageAlpha();
        boolean boolean12 = jFreeChart4.isNotify();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.draw(graphics2D13, rectangle2D14, chartRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(legendTitle8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Paint paint2 = multiplePiePlot0.getNoDataMessagePaint();
        multiplePiePlot0.setForegroundAlpha((float) (-1L));
        java.awt.Paint paint5 = multiplePiePlot0.getOutlinePaint();
        java.awt.Font font6 = multiplePiePlot0.getNoDataMessageFont();
        java.awt.Paint paint7 = multiplePiePlot0.getOutlinePaint();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier6);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        multiplePiePlot0.setNoDataMessage("Other");
        boolean boolean12 = multiplePiePlot0.equals((java.lang.Object) '4');
        java.awt.Paint paint13 = multiplePiePlot0.getOutlinePaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.awt.Paint paint3 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent4);
        java.lang.Object obj6 = multiplePiePlot0.clone();
        multiplePiePlot0.setOutlineVisible(true);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent9 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent9);
        java.lang.String str11 = multiplePiePlot0.getPlotType();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Multiple Pie Plot" + "'", str11, "Multiple Pie Plot");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder2 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        jFreeChart4.removeLegend();
        org.jfree.chart.event.ChartProgressListener chartProgressListener6 = null;
        jFreeChart4.removeProgressListener(chartProgressListener6);
        int int8 = jFreeChart4.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(tableOrder2);
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        java.awt.Font font1 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot2);
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("", font1, (org.jfree.chart.plot.Plot) multiplePiePlot2, false);
        boolean boolean14 = jFreeChart13.isBorderVisible();
        jFreeChart13.setBorderVisible(false);
        jFreeChart13.setBackgroundImageAlignment((-1));
        int int19 = jFreeChart13.getSubtitleCount();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.title.Title title12 = jFreeChart10.getSubtitle((int) (byte) 0);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.general.DatasetGroup datasetGroup14 = multiplePiePlot0.getDatasetGroup();
        java.lang.String str15 = multiplePiePlot0.getPlotType();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = multiplePiePlot0.getInsets();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(title12);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Multiple Pie Plot" + "'", str15, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(rectangleInsets16);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.lang.Comparable comparable3 = multiplePiePlot0.getAggregatedItemsKey();
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot0.getParent();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj6 = multiplePiePlot5.clone();
        multiplePiePlot5.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot5.setDrawingSupplier(drawingSupplier9);
        multiplePiePlot5.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart13 = multiplePiePlot5.getPieChart();
        org.jfree.chart.title.Title title15 = jFreeChart13.getSubtitle((int) (byte) 0);
        jFreeChart13.removeLegend();
        jFreeChart13.removeLegend();
        multiplePiePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart13);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart13.plotChanged(plotChangeEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + "Other" + "'", comparable3, "Other");
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(jFreeChart13);
        org.junit.Assert.assertNotNull(title15);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        float float3 = multiplePiePlot2.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot2.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart5 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot2);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot2.axisChanged(axisChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot2.getAggregatedItemsPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        float float11 = multiplePiePlot10.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot10.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot10);
        jFreeChart13.fireChartChanged();
        boolean boolean15 = jFreeChart13.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle17 = jFreeChart13.getLegend((int) (short) 0);
        boolean boolean18 = jFreeChart13.isNotify();
        float float19 = jFreeChart13.getBackgroundImageAlpha();
        java.awt.Paint paint20 = jFreeChart13.getBorderPaint();
        multiplePiePlot2.setAggregatedItemsPaint(paint20);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = multiplePiePlot22.getDrawingSupplier();
        java.awt.Paint paint24 = multiplePiePlot22.getBackgroundPaint();
        java.awt.Paint paint25 = multiplePiePlot22.getOutlinePaint();
        multiplePiePlot22.setOutlineVisible(true);
        boolean boolean28 = multiplePiePlot2.equals((java.lang.Object) multiplePiePlot22);
        multiplePiePlot22.setNoDataMessage("Other");
        org.jfree.chart.JFreeChart jFreeChart31 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot22);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot();
        float float34 = multiplePiePlot33.getBackgroundAlpha();
        multiplePiePlot33.setAggregatedItemsKey((java.lang.Comparable) 10.0f);
        java.awt.Paint paint37 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot33.setNoDataMessagePaint(paint37);
        org.jfree.chart.JFreeChart jFreeChart39 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot33);
        java.awt.Paint paint40 = multiplePiePlot33.getBackgroundPaint();
        multiplePiePlot22.setBackgroundPaint(paint40);
        java.awt.Paint paint42 = multiplePiePlot22.getAggregatedItemsPaint();
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(legendTitle17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.5f + "'", float19 == 0.5f);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(drawingSupplier23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 1.0f + "'", float34 == 1.0f);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNull(paint42);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener7 = null;
        jFreeChart4.addProgressListener(chartProgressListener7);
        org.jfree.chart.event.ChartProgressListener chartProgressListener9 = null;
        jFreeChart4.removeProgressListener(chartProgressListener9);
        java.awt.Image image11 = jFreeChart4.getBackgroundImage();
        float float12 = jFreeChart4.getBackgroundImageAlpha();
        java.util.List list13 = jFreeChart4.getSubtitles();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.draw(graphics2D14, rectangle2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D11, rectangle2D12);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = multiplePiePlot0.getInsets();
        float float15 = multiplePiePlot0.getBackgroundImageAlpha();
        multiplePiePlot0.setBackgroundImageAlignment((int) ' ');
        org.jfree.chart.JFreeChart jFreeChart18 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        java.lang.String str19 = multiplePiePlot0.getNoDataMessage();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.drawOutline(graphics2D20, rectangle2D21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent2);
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        float float7 = multiplePiePlot6.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot6.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot6);
        jFreeChart9.fireChartChanged();
        java.lang.Object obj11 = jFreeChart9.clone();
        java.awt.Paint paint12 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart9.setBackgroundPaint(paint12);
        org.jfree.chart.event.ChartProgressListener chartProgressListener14 = null;
        jFreeChart9.addProgressListener(chartProgressListener14);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo19 = null;
        java.awt.image.BufferedImage bufferedImage20 = jFreeChart9.createBufferedImage((int) '#', 1, (int) (byte) 10, chartRenderingInfo19);
        java.lang.Class<?> wildcardClass21 = bufferedImage20.getClass();
        boolean boolean22 = multiplePiePlot1.equals((java.lang.Object) wildcardClass21);
        float float23 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(bufferedImage20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier5);
        multiplePiePlot1.setForegroundAlpha(0.0f);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot1.zoom((double) (byte) 0);
        java.awt.Paint paint13 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Stroke stroke15 = jFreeChart14.getBorderStroke();
        jFreeChart14.setNotify(true);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.title.Title title12 = jFreeChart10.getSubtitle((int) (byte) 0);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.category.CategoryDataset categoryDataset14 = multiplePiePlot0.getDataset();
        org.jfree.chart.JFreeChart jFreeChart15 = multiplePiePlot0.getPieChart();
        jFreeChart15.clearSubtitles();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart15.draw(graphics2D17, rectangle2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(title12);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNotNull(jFreeChart15);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart4.setBackgroundPaint(paint7);
        boolean boolean9 = jFreeChart4.isBorderVisible();
        jFreeChart4.setBackgroundImageAlignment(1);
        jFreeChart4.removeLegend();
        java.awt.image.BufferedImage bufferedImage15 = jFreeChart4.createBufferedImage((int) (short) 1, (int) ' ');
        jFreeChart4.fireChartChanged();
        java.lang.Object obj17 = jFreeChart4.getTextAntiAlias();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        java.awt.geom.Point2D point2D20 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo21 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.draw(graphics2D18, rectangle2D19, point2D20, chartRenderingInfo21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bufferedImage15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        java.awt.Font font1 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = jFreeChart10.getPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = jFreeChart10.getPadding();
        org.jfree.chart.plot.Plot plot13 = jFreeChart10.getPlot();
        plot13.setForegroundAlpha((float) 0L);
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("Other", font1, plot13, true);
        org.jfree.chart.title.TextTitle textTitle18 = jFreeChart17.getTitle();
        org.junit.Assert.assertNotNull(font1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNotNull(textTitle18);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        java.awt.Font font1 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot2);
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("", font1, (org.jfree.chart.plot.Plot) multiplePiePlot2, false);
        java.awt.Paint paint14 = jFreeChart13.getBorderPaint();
        org.jfree.chart.event.ChartProgressListener chartProgressListener15 = null;
        jFreeChart13.removeProgressListener(chartProgressListener15);
        int int17 = jFreeChart13.getSubtitleCount();
        org.jfree.chart.event.ChartProgressListener chartProgressListener18 = null;
        jFreeChart13.addProgressListener(chartProgressListener18);
        float float20 = jFreeChart13.getBackgroundImageAlpha();
        java.awt.RenderingHints renderingHints21 = jFreeChart13.getRenderingHints();
        boolean boolean22 = jFreeChart13.isNotify();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.5f + "'", float20 == 0.5f);
        org.junit.Assert.assertNotNull(renderingHints21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getRootPlot();
        java.lang.Comparable comparable9 = multiplePiePlot0.getAggregatedItemsKey();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        boolean boolean11 = jFreeChart4.isNotify();
        java.awt.Paint paint12 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart4.setBorderPaint(paint12);
        jFreeChart4.clearSubtitles();
        int int15 = jFreeChart4.getBackgroundImageAlignment();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.plotChanged(plotChangeEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.awt.Image image8 = jFreeChart4.getBackgroundImage();
        java.awt.Paint paint9 = jFreeChart4.getBorderPaint();
        boolean boolean10 = jFreeChart4.isNotify();
        org.jfree.chart.title.LegendTitle legendTitle12 = jFreeChart4.getLegend((int) (short) 10);
        jFreeChart4.setNotify(true);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj16 = multiplePiePlot15.clone();
        multiplePiePlot15.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = null;
        multiplePiePlot15.setDrawingSupplier(drawingSupplier19);
        multiplePiePlot15.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot15.getPieChart();
        java.awt.Image image24 = null;
        multiplePiePlot15.setBackgroundImage(image24);
        org.jfree.chart.JFreeChart jFreeChart26 = multiplePiePlot15.getPieChart();
        java.awt.Image image27 = jFreeChart26.getBackgroundImage();
        jFreeChart26.clearSubtitles();
        java.awt.Stroke stroke29 = jFreeChart26.getBorderStroke();
        jFreeChart4.setBorderStroke(stroke29);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(legendTitle12);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(jFreeChart23);
        org.junit.Assert.assertNotNull(jFreeChart26);
        org.junit.Assert.assertNull(image27);
        org.junit.Assert.assertNotNull(stroke29);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Paint paint2 = multiplePiePlot0.getNoDataMessagePaint();
        multiplePiePlot0.setForegroundAlpha((float) (-1L));
        java.awt.Paint paint5 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.JFreeChart jFreeChart6 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot0.getRootPlot();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(plot7);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot0.zoom((double) (byte) 0);
        boolean boolean12 = multiplePiePlot0.isSubplot();
        java.lang.String str13 = multiplePiePlot0.getPlotType();
        multiplePiePlot0.zoom((double) (-1L));
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        java.awt.geom.Point2D point2D18 = null;
        org.jfree.chart.plot.PlotState plotState19 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.draw(graphics2D16, rectangle2D17, point2D18, plotState19, plotRenderingInfo20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Multiple Pie Plot" + "'", str13, "Multiple Pie Plot");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.title.Title title12 = jFreeChart10.getSubtitle((int) (byte) 0);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.general.DatasetGroup datasetGroup14 = multiplePiePlot0.getDatasetGroup();
        java.awt.Paint paint15 = multiplePiePlot0.getOutlinePaint();
        boolean boolean16 = multiplePiePlot0.isOutlineVisible();
        boolean boolean17 = multiplePiePlot0.isOutlineVisible();
        org.jfree.chart.util.TableOrder tableOrder18 = multiplePiePlot0.getDataExtractOrder();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        java.awt.geom.Point2D point2D21 = null;
        org.jfree.chart.plot.PlotState plotState22 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.draw(graphics2D19, rectangle2D20, point2D21, plotState22, plotRenderingInfo23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(title12);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(tableOrder18);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj4 = multiplePiePlot3.clone();
        multiplePiePlot3.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        multiplePiePlot3.setDrawingSupplier(drawingSupplier7);
        multiplePiePlot3.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart11 = multiplePiePlot3.getPieChart();
        org.jfree.chart.title.Title title13 = jFreeChart11.getSubtitle((int) (byte) 0);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        multiplePiePlot0.handleClick((int) '4', 0, plotRenderingInfo17);
        boolean boolean19 = multiplePiePlot0.isSubplot();
        multiplePiePlot0.setForegroundAlpha((float) (short) -1);
        java.lang.String str22 = multiplePiePlot0.getNoDataMessage();
        multiplePiePlot0.zoom((double) (short) 100);
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertNotNull(title13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = jFreeChart8.getPadding();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        float float12 = multiplePiePlot11.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot11.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot11);
        jFreeChart14.fireChartChanged();
        boolean boolean16 = jFreeChart14.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle18 = jFreeChart14.getLegend((int) (short) 0);
        jFreeChart8.removeSubtitle((org.jfree.chart.title.Title) legendTitle18);
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.draw(graphics2D20, rectangle2D21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(legendTitle18);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        java.awt.Image image9 = null;
        multiplePiePlot0.setBackgroundImage(image9);
        org.jfree.chart.JFreeChart jFreeChart11 = multiplePiePlot0.getPieChart();
        java.awt.Image image12 = jFreeChart11.getBackgroundImage();
        jFreeChart11.clearSubtitles();
        java.awt.Stroke stroke14 = jFreeChart11.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle15 = jFreeChart11.getTitle();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart11.draw(graphics2D16, rectangle2D17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNull(textTitle15);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier5);
        multiplePiePlot1.setForegroundAlpha(0.0f);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot1.zoom((double) (byte) 0);
        boolean boolean13 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.zoom((double) 100.0f);
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("Other", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        float float17 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection18 = multiplePiePlot1.getLegendItems();
        float float19 = multiplePiePlot1.getBackgroundImageAlpha();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = multiplePiePlot1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertNotNull(legendItemCollection18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.5f + "'", float19 == 0.5f);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Font font2 = multiplePiePlot0.getNoDataMessageFont();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = multiplePiePlot0.getLegendItems();
        float float4 = multiplePiePlot0.getBackgroundImageAlpha();
        float float5 = multiplePiePlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(font2);
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        multiplePiePlot0.setDataset(categoryDataset2);
        java.awt.Font font4 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot0.setNoDataMessageFont(font4);
        multiplePiePlot0.setForegroundAlpha(100.0f);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent8);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(font4);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier5);
        multiplePiePlot1.setForegroundAlpha(0.0f);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot1.zoom((double) (byte) 0);
        java.awt.Paint paint13 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        multiplePiePlot1.setBackgroundImageAlignment((-1));
        org.jfree.data.general.DatasetGroup datasetGroup17 = multiplePiePlot1.getDatasetGroup();
        float float18 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener7 = null;
        jFreeChart4.addProgressListener(chartProgressListener7);
        org.jfree.chart.event.ChartProgressListener chartProgressListener9 = null;
        jFreeChart4.removeProgressListener(chartProgressListener9);
        jFreeChart4.setBackgroundImageAlpha((float) 1L);
        java.lang.Object obj13 = jFreeChart4.getTextAntiAlias();
        java.util.List list14 = jFreeChart4.getSubtitles();
        java.awt.Image image15 = jFreeChart4.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(image15);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.awt.Paint paint6 = jFreeChart4.getBorderPaint();
        jFreeChart4.setBorderVisible(false);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.awt.Image image8 = jFreeChart4.getBackgroundImage();
        java.awt.Paint paint9 = jFreeChart4.getBorderPaint();
        int int10 = jFreeChart4.getBackgroundImageAlignment();
        java.awt.image.BufferedImage bufferedImage13 = jFreeChart4.createBufferedImage(100, (int) 'a');
        java.lang.Object obj14 = jFreeChart4.getTextAntiAlias();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(bufferedImage13);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        java.awt.Font font1 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot2);
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("", font1, (org.jfree.chart.plot.Plot) multiplePiePlot2, false);
        java.awt.Paint paint14 = jFreeChart13.getBorderPaint();
        org.jfree.chart.event.ChartProgressListener chartProgressListener15 = null;
        jFreeChart13.removeProgressListener(chartProgressListener15);
        int int17 = jFreeChart13.getSubtitleCount();
        org.jfree.chart.event.ChartProgressListener chartProgressListener18 = null;
        jFreeChart13.addProgressListener(chartProgressListener18);
        float float20 = jFreeChart13.getBackgroundImageAlpha();
        jFreeChart13.setNotify(false);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage28 = jFreeChart13.createBufferedImage(10, 15, 0.0d, 10.0d, chartRenderingInfo27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: alpha value out of range");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.5f + "'", float20 == 0.5f);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart1 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = jFreeChart1.getPadding();
        jFreeChart1.removeLegend();
        jFreeChart1.setTitle("Multiple Pie Plot");
        jFreeChart1.setBackgroundImageAlignment((int) '4');
        org.junit.Assert.assertNotNull(rectangleInsets2);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart1 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = jFreeChart1.getPadding();
        java.util.List list3 = jFreeChart1.getSubtitles();
        org.jfree.chart.plot.Plot plot4 = jFreeChart1.getPlot();
        boolean boolean5 = jFreeChart1.isNotify();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo8 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart1.handleClick((int) 'a', (int) (short) 0, chartRenderingInfo8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        org.jfree.chart.event.ChartProgressListener chartProgressListener8 = null;
        jFreeChart4.addProgressListener(chartProgressListener8);
        int int10 = jFreeChart4.getBackgroundImageAlignment();
        jFreeChart4.clearSubtitles();
        jFreeChart4.setBorderVisible(true);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = jFreeChart8.getPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = jFreeChart8.getPadding();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj12 = multiplePiePlot11.clone();
        multiplePiePlot11.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier15);
        multiplePiePlot11.setForegroundAlpha(0.0f);
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        int int21 = multiplePiePlot11.getBackgroundImageAlignment();
        java.awt.Paint paint22 = multiplePiePlot11.getAggregatedItemsPaint();
        java.awt.Paint paint23 = multiplePiePlot11.getBackgroundPaint();
        jFreeChart8.setBorderPaint(paint23);
        boolean boolean25 = jFreeChart8.isBorderVisible();
        jFreeChart8.setTextAntiAlias(false);
        jFreeChart8.setBorderVisible(true);
        int int30 = jFreeChart8.getSubtitleCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart4.setBackgroundPaint(paint7);
        org.jfree.chart.event.ChartProgressListener chartProgressListener9 = null;
        jFreeChart4.addProgressListener(chartProgressListener9);
        jFreeChart4.setNotify(false);
        jFreeChart4.setTextAntiAlias(true);
        java.util.List list15 = jFreeChart4.getSubtitles();
        jFreeChart4.setTitle("Multiple Pie Plot");
        jFreeChart4.setBackgroundImageAlpha(100.0f);
        org.jfree.chart.event.ChartProgressListener chartProgressListener20 = null;
        jFreeChart4.addProgressListener(chartProgressListener20);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.lang.Object obj8 = jFreeChart4.clone();
        java.awt.RenderingHints renderingHints9 = jFreeChart4.getRenderingHints();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.CategoryPlot categoryPlot10 = jFreeChart4.getCategoryPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.MultiplePiePlot cannot be cast to org.jfree.chart.plot.CategoryPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(renderingHints9);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        jFreeChart4.removeLegend();
        java.lang.Object obj12 = jFreeChart4.getTextAntiAlias();
        jFreeChart4.setBorderVisible(false);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart1 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = jFreeChart1.getPadding();
        java.util.List list3 = jFreeChart1.getSubtitles();
        org.jfree.chart.plot.Plot plot4 = jFreeChart1.getPlot();
        boolean boolean5 = jFreeChart1.isNotify();
        java.lang.Object obj6 = jFreeChart1.getTextAntiAlias();
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getRootPlot();
        plot8.setBackgroundImageAlignment((int) (byte) 100);
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart(plot8);
        org.jfree.chart.title.TextTitle textTitle12 = jFreeChart11.getTitle();
        jFreeChart11.setAntiAlias(false);
        int int15 = jFreeChart11.getBackgroundImageAlignment();
        java.awt.Paint paint16 = jFreeChart11.getBorderPaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNull(textTitle12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Paint paint2 = multiplePiePlot0.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot0.setInsets(rectangleInsets3, false);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj7 = multiplePiePlot6.clone();
        multiplePiePlot6.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot6.setDrawingSupplier(drawingSupplier10);
        multiplePiePlot6.zoom(0.0d);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot6.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        plot14.setInsets(rectangleInsets15);
        multiplePiePlot0.setInsets(rectangleInsets15, false);
        java.awt.Paint paint19 = multiplePiePlot0.getAggregatedItemsPaint();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNull(paint19);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D11, rectangle2D12);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = multiplePiePlot0.getInsets();
        float float15 = multiplePiePlot0.getBackgroundImageAlpha();
        multiplePiePlot0.setBackgroundImageAlignment((int) ' ');
        org.jfree.chart.JFreeChart jFreeChart18 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        java.awt.Image image19 = jFreeChart18.getBackgroundImage();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertNull(image19);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        java.lang.String str8 = multiplePiePlot0.getNoDataMessage();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot0.getInsets();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        jFreeChart4.fireChartChanged();
        org.jfree.chart.event.ChartProgressListener chartProgressListener12 = null;
        jFreeChart4.addProgressListener(chartProgressListener12);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.CategoryPlot categoryPlot14 = jFreeChart4.getCategoryPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.MultiplePiePlot cannot be cast to org.jfree.chart.plot.CategoryPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.title.Title title12 = jFreeChart10.getSubtitle((int) (byte) 0);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.general.DatasetGroup datasetGroup14 = multiplePiePlot0.getDatasetGroup();
        java.awt.Paint paint15 = multiplePiePlot0.getOutlinePaint();
        boolean boolean16 = multiplePiePlot0.isOutlineVisible();
        boolean boolean17 = multiplePiePlot0.isOutlineVisible();
        org.jfree.data.general.DatasetGroup datasetGroup18 = multiplePiePlot0.getDatasetGroup();
        multiplePiePlot0.setLimit((double) (short) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(title12);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(datasetGroup18);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart4.setBackgroundPaint(paint7);
        org.jfree.chart.event.ChartProgressListener chartProgressListener9 = null;
        jFreeChart4.addProgressListener(chartProgressListener9);
        jFreeChart4.setNotify(false);
        jFreeChart4.setTextAntiAlias(true);
        java.awt.Paint paint15 = jFreeChart4.getBorderPaint();
        boolean boolean16 = jFreeChart4.getAntiAlias();
        jFreeChart4.setBackgroundImageAlignment((int) (byte) 0);
        boolean boolean19 = jFreeChart4.isNotify();
        org.jfree.chart.event.ChartProgressListener chartProgressListener20 = null;
        jFreeChart4.removeProgressListener(chartProgressListener20);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        jFreeChart4.setBackgroundImageAlpha((float) (byte) 0);
        org.jfree.chart.event.ChartProgressListener chartProgressListener9 = null;
        jFreeChart4.removeProgressListener(chartProgressListener9);
        org.jfree.chart.event.ChartProgressListener chartProgressListener11 = null;
        jFreeChart4.addProgressListener(chartProgressListener11);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        jFreeChart17.fireChartChanged();
        boolean boolean19 = jFreeChart17.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle21 = jFreeChart17.getLegend((int) (short) 0);
        boolean boolean22 = jFreeChart17.isNotify();
        java.awt.RenderingHints renderingHints23 = jFreeChart17.getRenderingHints();
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.setTextAntiAlias((java.lang.Object) jFreeChart17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: org.jfree.chart.JFreeChart@6ed89c23 incompatible with Text-specific antialiasing enable key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(legendTitle21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(renderingHints23);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        boolean boolean8 = multiplePiePlot0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        multiplePiePlot0.setNoDataMessage("");
        org.jfree.data.general.DatasetGroup datasetGroup12 = multiplePiePlot0.getDatasetGroup();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent13 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent13);
        java.awt.Image image15 = multiplePiePlot0.getBackgroundImage();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(datasetGroup12);
        org.junit.Assert.assertNull(image15);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        multiplePiePlot0.setLimit((double) 0);
        boolean boolean7 = multiplePiePlot0.isSubplot();
        java.lang.Comparable comparable8 = multiplePiePlot0.getAggregatedItemsKey();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + comparable8 + "' != '" + "Other" + "'", comparable8, "Other");
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier5);
        multiplePiePlot1.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart9 = multiplePiePlot1.getPieChart();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot1.getRootPlot();
        multiplePiePlot1.setNoDataMessage("");
        java.awt.Paint paint13 = multiplePiePlot1.getAggregatedItemsPaint();
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) 10);
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        boolean boolean17 = multiplePiePlot1.isOutlineVisible();
        int int18 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent19 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent19);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj4 = multiplePiePlot3.clone();
        multiplePiePlot3.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        multiplePiePlot3.setDrawingSupplier(drawingSupplier7);
        multiplePiePlot3.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart11 = multiplePiePlot3.getPieChart();
        org.jfree.chart.title.Title title13 = jFreeChart11.getSubtitle((int) (byte) 0);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        multiplePiePlot0.handleClick((int) '4', 0, plotRenderingInfo17);
        boolean boolean19 = multiplePiePlot0.isSubplot();
        multiplePiePlot0.setLimit((double) (byte) 10);
        org.jfree.chart.JFreeChart jFreeChart22 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertNotNull(title13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        java.awt.Paint paint10 = jFreeChart9.getBackgroundPaint();
        float float11 = jFreeChart9.getBackgroundImageAlpha();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.title.Title title13 = jFreeChart9.getSubtitle(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        jFreeChart4.removeLegend();
        jFreeChart4.setBackgroundImageAlignment(15);
        org.jfree.chart.title.LegendTitle legendTitle12 = jFreeChart4.getLegend((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.XYPlot xYPlot13 = jFreeChart4.getXYPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.MultiplePiePlot cannot be cast to org.jfree.chart.plot.XYPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(legendTitle12);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.Title title10 = jFreeChart8.getSubtitle((int) (byte) 0);
        jFreeChart8.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        java.awt.Paint paint14 = multiplePiePlot12.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot12.setInsets(rectangleInsets15, false);
        jFreeChart8.setPadding(rectangleInsets15);
        java.awt.Paint paint19 = jFreeChart8.getBorderPaint();
        org.jfree.chart.title.LegendTitle legendTitle20 = jFreeChart8.getLegend();
        jFreeChart8.removeLegend();
        jFreeChart8.fireChartChanged();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(legendTitle20);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.drawOutline(graphics2D6, rectangle2D7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(categoryDataset5);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.Title title10 = jFreeChart8.getSubtitle((int) (byte) 0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        jFreeChart15.fireChartChanged();
        boolean boolean17 = jFreeChart15.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle19 = jFreeChart15.getLegend((int) (short) 0);
        jFreeChart8.addLegend(legendTitle19);
        jFreeChart8.setAntiAlias(true);
        org.jfree.chart.title.TextTitle textTitle23 = jFreeChart8.getTitle();
        org.jfree.chart.event.ChartChangeListener chartChangeListener24 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.addChangeListener(chartChangeListener24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(legendTitle19);
        org.junit.Assert.assertNull(textTitle23);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.title.Title title12 = jFreeChart10.getSubtitle((int) (byte) 0);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.general.DatasetGroup datasetGroup14 = multiplePiePlot0.getDatasetGroup();
        java.awt.Paint paint15 = multiplePiePlot0.getOutlinePaint();
        boolean boolean16 = multiplePiePlot0.isOutlineVisible();
        boolean boolean17 = multiplePiePlot0.isOutlineVisible();
        org.jfree.chart.util.TableOrder tableOrder18 = multiplePiePlot0.getDataExtractOrder();
        int int19 = multiplePiePlot0.getBackgroundImageAlignment();
        java.lang.Class<?> wildcardClass20 = multiplePiePlot0.getClass();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(title12);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(tableOrder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Paint paint2 = multiplePiePlot0.getNoDataMessagePaint();
        multiplePiePlot0.setForegroundAlpha((float) (-1L));
        java.awt.Paint paint5 = multiplePiePlot0.getOutlinePaint();
        multiplePiePlot0.setForegroundAlpha((float) (byte) 10);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        float float10 = multiplePiePlot9.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot9.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart12 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot9);
        java.awt.Paint paint13 = jFreeChart12.getBackgroundPaint();
        boolean boolean14 = jFreeChart12.isBorderVisible();
        boolean boolean15 = jFreeChart12.getAntiAlias();
        multiplePiePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart12);
        org.jfree.chart.title.TextTitle textTitle17 = jFreeChart12.getTitle();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(textTitle17);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        java.awt.Image image6 = null;
        multiplePiePlot1.setBackgroundImage(image6);
        multiplePiePlot1.setNoDataMessage("hi!");
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset11 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent12 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent12);
        java.awt.Image image14 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", plot15);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertNotNull(plot15);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart4.setBackgroundPaint(paint7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.title.Title title10 = jFreeChart4.getSubtitle((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        plot8.setInsets(rectangleInsets9);
        java.awt.Paint paint11 = plot8.getBackgroundPaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D11, rectangle2D12);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = multiplePiePlot0.getInsets();
        float float15 = multiplePiePlot0.getBackgroundImageAlpha();
        multiplePiePlot0.setBackgroundImageAlignment((int) ' ');
        org.jfree.chart.JFreeChart jFreeChart18 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.plot.Plot plot19 = jFreeChart18.getPlot();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart18.draw(graphics2D20, rectangle2D21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertNotNull(plot19);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener7 = null;
        jFreeChart4.addProgressListener(chartProgressListener7);
        org.jfree.chart.event.ChartProgressListener chartProgressListener9 = null;
        jFreeChart4.removeProgressListener(chartProgressListener9);
        java.awt.Stroke stroke11 = null;
        jFreeChart4.setBorderStroke(stroke11);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        org.jfree.chart.event.ChartProgressListener chartProgressListener8 = null;
        jFreeChart4.addProgressListener(chartProgressListener8);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage14 = jFreeChart4.createBufferedImage(0, 0, 10, chartRenderingInfo13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (0) and height (0) must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.Title title10 = jFreeChart8.getSubtitle((int) (byte) 0);
        jFreeChart8.removeLegend();
        float float12 = jFreeChart8.getBackgroundImageAlpha();
        jFreeChart8.setTitle("Multiple Pie Plot");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        float float17 = multiplePiePlot16.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot16.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot16);
        jFreeChart19.fireChartChanged();
        java.lang.Object obj21 = jFreeChart19.clone();
        java.awt.Paint paint22 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart19.setBackgroundPaint(paint22);
        org.jfree.chart.event.ChartProgressListener chartProgressListener24 = null;
        jFreeChart19.addProgressListener(chartProgressListener24);
        jFreeChart19.setNotify(false);
        jFreeChart19.setTextAntiAlias(true);
        java.awt.Paint paint30 = jFreeChart19.getBorderPaint();
        jFreeChart8.setBorderPaint(paint30);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        multiplePiePlot0.setBackgroundImageAlignment(15);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        multiplePiePlot0.setDataset(categoryDataset10);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent12 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent12);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) "");
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        multiplePiePlot0.setNoDataMessage("hi!");
        java.awt.Font font9 = multiplePiePlot0.getNoDataMessageFont();
        multiplePiePlot0.setOutlineVisible(false);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertNotNull(font9);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setForegroundAlpha((float) (-1L));
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        float float9 = multiplePiePlot8.getBackgroundAlpha();
        java.awt.Paint paint10 = multiplePiePlot8.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart12 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", font7, (org.jfree.chart.plot.Plot) multiplePiePlot8, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = jFreeChart12.getPadding();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj6 = multiplePiePlot5.clone();
        multiplePiePlot5.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot5.setDrawingSupplier(drawingSupplier9);
        multiplePiePlot5.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart13 = multiplePiePlot5.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = jFreeChart13.getPadding();
        multiplePiePlot1.setInsets(rectangleInsets14, false);
        java.awt.Paint paint17 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Paint paint18 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent19);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(jFreeChart13);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertNull(paint18);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        java.awt.Font font1 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot2);
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("", font1, (org.jfree.chart.plot.Plot) multiplePiePlot2, false);
        jFreeChart13.setBackgroundImageAlignment((int) (short) 10);
        org.jfree.chart.event.ChartProgressListener chartProgressListener16 = null;
        jFreeChart13.removeProgressListener(chartProgressListener16);
        boolean boolean18 = jFreeChart13.isBorderVisible();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getRootPlot();
        plot8.setBackgroundImageAlignment((int) (byte) 100);
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart(plot8);
        org.jfree.chart.title.TextTitle textTitle12 = jFreeChart11.getTitle();
        jFreeChart11.setAntiAlias(false);
        boolean boolean15 = jFreeChart11.getAntiAlias();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNull(textTitle12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        boolean boolean8 = jFreeChart4.isNotify();
        java.awt.Image image9 = jFreeChart4.getBackgroundImage();
        jFreeChart4.setTitle("Other");
        boolean boolean12 = jFreeChart4.isNotify();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.Title title10 = jFreeChart8.getSubtitle((int) (byte) 0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        jFreeChart15.fireChartChanged();
        boolean boolean17 = jFreeChart15.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle19 = jFreeChart15.getLegend((int) (short) 0);
        jFreeChart8.addLegend(legendTitle19);
        org.jfree.chart.title.TextTitle textTitle21 = null;
        jFreeChart8.setTitle(textTitle21);
        org.jfree.chart.event.ChartProgressListener chartProgressListener23 = null;
        jFreeChart8.removeProgressListener(chartProgressListener23);
        boolean boolean25 = jFreeChart8.isNotify();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(legendTitle19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder2 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent3 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent3);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent5);
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(tableOrder2);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent7 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent7);
        org.jfree.chart.JFreeChart jFreeChart9 = multiplePiePlot0.getPieChart();
        org.jfree.chart.event.ChartChangeListener chartChangeListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart9.removeChangeListener(chartChangeListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertNotNull(jFreeChart9);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 10.0f);
        java.awt.Paint paint5 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setNoDataMessagePaint(paint5);
        org.jfree.chart.JFreeChart jFreeChart7 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        float float8 = multiplePiePlot1.getForegroundAlpha();
        multiplePiePlot1.setForegroundAlpha((float) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        java.awt.Font font1 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot2);
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("", font1, (org.jfree.chart.plot.Plot) multiplePiePlot2, false);
        java.awt.Paint paint14 = jFreeChart13.getBorderPaint();
        org.jfree.chart.event.ChartProgressListener chartProgressListener15 = null;
        jFreeChart13.removeProgressListener(chartProgressListener15);
        int int17 = jFreeChart13.getSubtitleCount();
        org.jfree.chart.event.ChartProgressListener chartProgressListener18 = null;
        jFreeChart13.addProgressListener(chartProgressListener18);
        jFreeChart13.clearSubtitles();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        multiplePiePlot0.setLimit((double) 0);
        java.awt.Paint paint7 = multiplePiePlot0.getAggregatedItemsPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent8);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier14);
        multiplePiePlot10.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot10.getPieChart();
        org.jfree.chart.title.Title title20 = jFreeChart18.getSubtitle((int) (byte) 0);
        jFreeChart18.removeLegend();
        org.jfree.chart.title.LegendTitle legendTitle22 = jFreeChart18.getLegend();
        multiplePiePlot0.setPieChart(jFreeChart18);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent24);
        org.jfree.data.general.DatasetGroup datasetGroup26 = multiplePiePlot0.getDatasetGroup();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(jFreeChart18);
        org.junit.Assert.assertNotNull(title20);
        org.junit.Assert.assertNotNull(legendTitle22);
        org.junit.Assert.assertNull(datasetGroup26);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        java.awt.Font font1 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot2);
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("", font1, (org.jfree.chart.plot.Plot) multiplePiePlot2, false);
        boolean boolean14 = multiplePiePlot2.isOutlineVisible();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        multiplePiePlot2.drawBackgroundImage(graphics2D15, rectangle2D16);
        java.awt.Paint paint18 = multiplePiePlot2.getAggregatedItemsPaint();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(paint18);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Paint paint2 = multiplePiePlot0.getNoDataMessagePaint();
        multiplePiePlot0.setForegroundAlpha((float) (-1));
        java.lang.String str5 = multiplePiePlot0.getNoDataMessage();
        double double6 = multiplePiePlot0.getLimit();
        java.awt.Image image7 = multiplePiePlot0.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(image7);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.draw(graphics2D5, rectangle2D6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        boolean boolean6 = multiplePiePlot0.isOutlineVisible();
        org.jfree.chart.JFreeChart jFreeChart7 = multiplePiePlot0.getPieChart();
        java.lang.Object obj8 = jFreeChart7.clone();
        float float9 = jFreeChart7.getBackgroundImageAlpha();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.title.Title title12 = jFreeChart10.getSubtitle((int) (byte) 0);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.category.CategoryDataset categoryDataset14 = multiplePiePlot0.getDataset();
        boolean boolean15 = multiplePiePlot0.isOutlineVisible();
        boolean boolean16 = multiplePiePlot0.isSubplot();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(title12);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        float float2 = multiplePiePlot0.getForegroundAlpha();
        org.jfree.chart.util.TableOrder tableOrder3 = multiplePiePlot0.getDataExtractOrder();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(tableOrder3);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.Title title10 = jFreeChart8.getSubtitle((int) (byte) 0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        jFreeChart15.fireChartChanged();
        boolean boolean17 = jFreeChart15.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle19 = jFreeChart15.getLegend((int) (short) 0);
        jFreeChart8.addLegend(legendTitle19);
        jFreeChart8.setAntiAlias(true);
        jFreeChart8.fireChartChanged();
        org.jfree.chart.title.TextTitle textTitle24 = jFreeChart8.getTitle();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(legendTitle19);
        org.junit.Assert.assertNull(textTitle24);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart3 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.lang.Object obj4 = jFreeChart3.getTextAntiAlias();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.title.Title title12 = jFreeChart10.getSubtitle((int) (byte) 0);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot0.getParent();
        java.lang.String str15 = multiplePiePlot0.getPlotType();
        multiplePiePlot0.setNoDataMessage("");
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot0.getPieChart();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(title12);
        org.junit.Assert.assertNull(plot14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Multiple Pie Plot" + "'", str15, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(jFreeChart18);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.lang.Object obj8 = jFreeChart4.clone();
        java.awt.Stroke stroke9 = jFreeChart4.getBorderStroke();
        java.awt.Stroke stroke10 = jFreeChart4.getBorderStroke();
        int int11 = jFreeChart4.getBackgroundImageAlignment();
        org.jfree.chart.event.ChartChangeListener chartChangeListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.addChangeListener(chartChangeListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        boolean boolean8 = multiplePiePlot0.equals((java.lang.Object) 1.0f);
        java.awt.Stroke stroke9 = multiplePiePlot0.getOutlineStroke();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot0.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        float float12 = multiplePiePlot0.getForegroundAlpha();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        multiplePiePlot0.handleClick((int) '#', 10, plotRenderingInfo15);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        double double9 = multiplePiePlot0.getLimit();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent10);
        boolean boolean12 = multiplePiePlot0.isOutlineVisible();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        java.awt.Paint paint18 = jFreeChart17.getBackgroundPaint();
        java.awt.Stroke stroke19 = jFreeChart17.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle20 = jFreeChart17.getTitle();
        java.lang.Object obj21 = jFreeChart17.clone();
        jFreeChart17.setTextAntiAlias(true);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.setPieChart(jFreeChart17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'pieChart' argument must be a chart based on a PiePlot.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(textTitle20);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent2);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot();
        float float6 = multiplePiePlot5.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot5.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot5);
        java.awt.Paint paint9 = jFreeChart8.getBackgroundPaint();
        java.awt.Stroke stroke10 = jFreeChart8.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle11 = jFreeChart8.getTitle();
        java.awt.Image image12 = jFreeChart8.getBackgroundImage();
        java.awt.Paint paint13 = jFreeChart8.getBorderPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint13);
        java.awt.Font font15 = multiplePiePlot1.getNoDataMessageFont();
        float float16 = multiplePiePlot1.getBackgroundImageAlpha();
        multiplePiePlot1.setBackgroundImageAlignment(0);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(textTitle11);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder1 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot();
        float float4 = multiplePiePlot3.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot3.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart6 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot3);
        java.awt.Paint paint7 = jFreeChart6.getBackgroundPaint();
        java.awt.Stroke stroke8 = jFreeChart6.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener9 = null;
        jFreeChart6.addProgressListener(chartProgressListener9);
        org.jfree.chart.event.ChartProgressListener chartProgressListener11 = null;
        jFreeChart6.removeProgressListener(chartProgressListener11);
        java.awt.Image image13 = jFreeChart6.getBackgroundImage();
        float float14 = jFreeChart6.getBackgroundImageAlpha();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo19 = null;
        java.awt.image.BufferedImage bufferedImage20 = jFreeChart6.createBufferedImage((int) ' ', 100, (double) 10L, 0.0d, chartRenderingInfo19);
        jFreeChart6.setBorderVisible(false);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo27 = null;
        java.awt.image.BufferedImage bufferedImage28 = jFreeChart6.createBufferedImage((int) (short) 10, (int) (byte) 10, 0.0d, (double) (byte) 10, chartRenderingInfo27);
        multiplePiePlot0.setBackgroundImage((java.awt.Image) bufferedImage28);
        org.jfree.chart.util.TableOrder tableOrder30 = multiplePiePlot0.getDataExtractOrder();
        org.junit.Assert.assertNotNull(tableOrder1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
        org.junit.Assert.assertNotNull(bufferedImage20);
        org.junit.Assert.assertNotNull(bufferedImage28);
        org.junit.Assert.assertNotNull(tableOrder30);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.title.Title title12 = jFreeChart10.getSubtitle((int) (byte) 0);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.category.CategoryDataset categoryDataset14 = multiplePiePlot0.getDataset();
        boolean boolean15 = multiplePiePlot0.isOutlineVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        multiplePiePlot0.handleClick((int) (short) 0, (int) (byte) 10, plotRenderingInfo18);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(title12);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier6);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        jFreeChart8.setNotify(false);
        int int11 = jFreeChart8.getBackgroundImageAlignment();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo14 = null;
        java.awt.image.BufferedImage bufferedImage15 = jFreeChart8.createBufferedImage((int) ' ', (int) (short) 100, chartRenderingInfo14);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(bufferedImage15);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        java.awt.Paint paint6 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        float float9 = multiplePiePlot8.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot8.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint12 = jFreeChart11.getBackgroundPaint();
        java.awt.Stroke stroke13 = jFreeChart11.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle14 = jFreeChart11.getTitle();
        java.awt.Image image15 = jFreeChart11.getBackgroundImage();
        java.awt.Paint paint16 = jFreeChart11.getBorderPaint();
        multiplePiePlot1.setBackgroundPaint(paint16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(textTitle14);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(categoryDataset18);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot0.getRootPlot();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNotNull(plot5);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        boolean boolean8 = multiplePiePlot0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        multiplePiePlot0.setNoDataMessage("");
        multiplePiePlot0.setNoDataMessage("hi!");
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) false);
        java.awt.Paint paint16 = multiplePiePlot0.getOutlinePaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder2 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj4 = multiplePiePlot3.clone();
        multiplePiePlot3.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        multiplePiePlot3.setDrawingSupplier(drawingSupplier7);
        multiplePiePlot3.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart11 = multiplePiePlot3.getPieChart();
        java.awt.Image image12 = null;
        multiplePiePlot3.setBackgroundImage(image12);
        java.awt.Paint paint14 = multiplePiePlot3.getNoDataMessagePaint();
        multiplePiePlot0.setBackgroundPaint(paint14);
        float float16 = multiplePiePlot0.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(tableOrder2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = jFreeChart8.getPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = jFreeChart8.getPadding();
        org.jfree.chart.title.LegendTitle legendTitle11 = jFreeChart8.getLegend();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(legendTitle11);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.Title title10 = jFreeChart8.getSubtitle((int) (byte) 0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        jFreeChart15.fireChartChanged();
        boolean boolean17 = jFreeChart15.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle19 = jFreeChart15.getLegend((int) (short) 0);
        jFreeChart8.addLegend(legendTitle19);
        jFreeChart8.setAntiAlias(true);
        org.jfree.chart.title.TextTitle textTitle23 = jFreeChart8.getTitle();
        java.awt.Stroke stroke24 = null;
        jFreeChart8.setBorderStroke(stroke24);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(legendTitle19);
        org.junit.Assert.assertNull(textTitle23);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        java.awt.Paint paint7 = jFreeChart4.getBorderPaint();
        java.lang.Object obj8 = jFreeChart4.clone();
        java.lang.Object obj9 = jFreeChart4.clone();
        org.jfree.chart.event.ChartChangeListener chartChangeListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.removeChangeListener(chartChangeListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle8 = jFreeChart4.getLegend((int) (short) 0);
        boolean boolean9 = jFreeChart4.isNotify();
        jFreeChart4.setBackgroundImageAlpha(0.0f);
        java.awt.Image image12 = jFreeChart4.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(legendTitle8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(image12);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.title.Title title12 = jFreeChart10.getSubtitle((int) (byte) 0);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.category.CategoryDataset categoryDataset14 = multiplePiePlot0.getDataset();
        org.jfree.chart.JFreeChart jFreeChart15 = multiplePiePlot0.getPieChart();
        jFreeChart15.clearSubtitles();
        boolean boolean17 = jFreeChart15.isBorderVisible();
        jFreeChart15.setTitle("Other");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.CategoryPlot categoryPlot20 = jFreeChart15.getCategoryPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.PiePlot cannot be cast to org.jfree.chart.plot.CategoryPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(title12);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNotNull(jFreeChart15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setNoDataMessagePaint(paint5);
        float float7 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart("", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 10);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener7 = null;
        jFreeChart4.addProgressListener(chartProgressListener7);
        org.jfree.chart.event.ChartProgressListener chartProgressListener9 = null;
        jFreeChart4.removeProgressListener(chartProgressListener9);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.draw(graphics2D11, rectangle2D12, chartRenderingInfo13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder2 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        float float5 = multiplePiePlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(tableOrder2);
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getRootPlot();
        multiplePiePlot0.setBackgroundImageAlignment(0);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent5);
        multiplePiePlot0.setNoDataMessage("Other");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot0.markerChanged(markerChangeEvent9);
        java.lang.String str11 = multiplePiePlot0.getNoDataMessage();
        float float12 = multiplePiePlot0.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(plot2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Other" + "'", str11, "Other");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier6);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        multiplePiePlot0.setNoDataMessage("Other");
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = multiplePiePlot0.getInsets();
        java.awt.Paint paint12 = multiplePiePlot0.getNoDataMessagePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = multiplePiePlot0.getDrawingSupplier();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(drawingSupplier13);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setNoDataMessagePaint(paint5);
        float float7 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart("", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        double double9 = multiplePiePlot1.getLimit();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = multiplePiePlot1.getDrawingSupplier();
        float float11 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Paint paint2 = multiplePiePlot0.getNoDataMessagePaint();
        multiplePiePlot0.setForegroundAlpha((float) (-1));
        java.lang.String str5 = multiplePiePlot0.getNoDataMessage();
        double double6 = multiplePiePlot0.getLimit();
        java.awt.Font font8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj10 = multiplePiePlot9.clone();
        multiplePiePlot9.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier13);
        multiplePiePlot9.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot9.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart18 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot9);
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart("", font8, (org.jfree.chart.plot.Plot) multiplePiePlot9, false);
        jFreeChart20.setAntiAlias(false);
        org.jfree.chart.title.Title title23 = null;
        jFreeChart20.removeSubtitle(title23);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart20);
        float float26 = multiplePiePlot0.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(jFreeChart17);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-1.0f) + "'", float26 == (-1.0f));
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        boolean boolean8 = multiplePiePlot0.equals((java.lang.Object) 1.0f);
        boolean boolean9 = multiplePiePlot0.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot0.getDataset();
        multiplePiePlot0.setForegroundAlpha((float) 'a');
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        java.awt.Paint paint15 = multiplePiePlot13.getNoDataMessagePaint();
        multiplePiePlot13.setForegroundAlpha((float) (-1L));
        java.awt.Paint paint18 = multiplePiePlot13.getOutlinePaint();
        multiplePiePlot0.setOutlinePaint(paint18);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.lang.Object obj8 = jFreeChart4.clone();
        java.awt.Stroke stroke9 = jFreeChart4.getBorderStroke();
        jFreeChart4.setAntiAlias(true);
        org.jfree.chart.title.LegendTitle legendTitle13 = jFreeChart4.getLegend(100);
        jFreeChart4.setNotify(false);
        org.jfree.chart.title.TextTitle textTitle16 = jFreeChart4.getTitle();
        jFreeChart4.setAntiAlias(true);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(legendTitle13);
        org.junit.Assert.assertNotNull(textTitle16);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.awt.Image image8 = jFreeChart4.getBackgroundImage();
        java.awt.Paint paint9 = jFreeChart4.getBorderPaint();
        boolean boolean10 = jFreeChart4.isNotify();
        org.jfree.chart.title.LegendTitle legendTitle12 = jFreeChart4.getLegend((int) (short) 10);
        boolean boolean13 = jFreeChart4.isBorderVisible();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.CategoryPlot categoryPlot14 = jFreeChart4.getCategoryPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.MultiplePiePlot cannot be cast to org.jfree.chart.plot.CategoryPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(legendTitle12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        multiplePiePlot0.setLimit((double) 0);
        java.awt.Paint paint7 = multiplePiePlot0.getAggregatedItemsPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent8);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier14);
        multiplePiePlot10.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot10.getPieChart();
        org.jfree.chart.title.Title title20 = jFreeChart18.getSubtitle((int) (byte) 0);
        jFreeChart18.removeLegend();
        org.jfree.chart.title.LegendTitle legendTitle22 = jFreeChart18.getLegend();
        multiplePiePlot0.setPieChart(jFreeChart18);
        org.jfree.chart.JFreeChart jFreeChart24 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        java.awt.Paint paint25 = multiplePiePlot0.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = multiplePiePlot0.getInsets();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        multiplePiePlot0.handleClick((int) (byte) -1, (int) (byte) 1, plotRenderingInfo29);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(jFreeChart18);
        org.junit.Assert.assertNotNull(title20);
        org.junit.Assert.assertNotNull(legendTitle22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(rectangleInsets26);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundAlpha((float) 1L);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        multiplePiePlot1.setDataset(categoryDataset4);
        org.jfree.chart.JFreeChart jFreeChart6 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot1);
        int int7 = jFreeChart6.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot0.getRootPlot();
        multiplePiePlot0.setNoDataMessage("");
        multiplePiePlot0.zoom((double) (byte) 100);
        int int14 = multiplePiePlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        jFreeChart9.setAntiAlias(true);
        jFreeChart9.setBorderVisible(false);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getRootPlot();
        java.awt.Paint paint9 = plot8.getBackgroundPaint();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot8.drawOutline(graphics2D10, rectangle2D11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        org.jfree.chart.event.ChartProgressListener chartProgressListener8 = null;
        jFreeChart4.addProgressListener(chartProgressListener8);
        jFreeChart4.setAntiAlias(true);
        jFreeChart4.setNotify(false);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo16 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.handleClick(15, (int) ' ', chartRenderingInfo16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.awt.Paint paint3 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent4);
        boolean boolean6 = multiplePiePlot0.isSubplot();
        java.awt.Stroke stroke7 = multiplePiePlot0.getOutlineStroke();
        java.lang.String str8 = multiplePiePlot0.getPlotType();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj10 = multiplePiePlot9.clone();
        multiplePiePlot9.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier13);
        multiplePiePlot9.zoom(0.0d);
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot9.getRootPlot();
        plot17.setBackgroundImageAlignment((int) (byte) 100);
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart(plot17);
        org.jfree.chart.title.TextTitle textTitle21 = jFreeChart20.getTitle();
        jFreeChart20.setAntiAlias(false);
        boolean boolean24 = multiplePiePlot0.equals((java.lang.Object) jFreeChart20);
        java.lang.String str25 = multiplePiePlot0.getPlotType();
        multiplePiePlot0.setBackgroundAlpha((float) (byte) -1);
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Multiple Pie Plot" + "'", str8, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertNull(textTitle21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Multiple Pie Plot" + "'", str25, "Multiple Pie Plot");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        java.awt.Image image7 = multiplePiePlot0.getBackgroundImage();
        multiplePiePlot0.setBackgroundAlpha((float) (-1));
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent10 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent10);
        boolean boolean12 = multiplePiePlot0.isOutlineVisible();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        float float7 = jFreeChart4.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder2 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot();
        float float4 = multiplePiePlot3.getBackgroundAlpha();
        java.awt.Paint paint5 = multiplePiePlot3.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot3.setInsets(rectangleInsets6, false);
        multiplePiePlot0.setInsets(rectangleInsets6);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = multiplePiePlot0.getDrawingSupplier();
        multiplePiePlot0.zoom((double) 15);
        multiplePiePlot0.setBackgroundAlpha((float) 10);
        org.jfree.data.general.DatasetGroup datasetGroup15 = multiplePiePlot0.getDatasetGroup();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot0.getLegendItems();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(tableOrder2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        java.awt.Font font5 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.JFreeChart jFreeChart6 = new org.jfree.chart.JFreeChart("", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(font5);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        java.lang.String str10 = multiplePiePlot0.getNoDataMessage();
        multiplePiePlot0.zoom((double) 10L);
        multiplePiePlot0.setOutlineVisible(true);
        java.awt.Paint paint15 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setAggregatedItemsPaint(paint15);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent2);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot();
        float float6 = multiplePiePlot5.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot5.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot5);
        java.awt.Paint paint9 = jFreeChart8.getBackgroundPaint();
        java.awt.Stroke stroke10 = jFreeChart8.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle11 = jFreeChart8.getTitle();
        java.awt.Image image12 = jFreeChart8.getBackgroundImage();
        java.awt.Paint paint13 = jFreeChart8.getBorderPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint13);
        java.awt.Font font15 = multiplePiePlot1.getNoDataMessageFont();
        float float16 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D17, rectangle2D18);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(textTitle11);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundAlpha((float) 1L);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        multiplePiePlot1.setDataset(categoryDataset4);
        org.jfree.chart.JFreeChart jFreeChart6 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D7, rectangle2D8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier5);
        multiplePiePlot1.zoom(0.0d);
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        plot9.setInsets(rectangleInsets10);
        java.awt.Image image12 = null;
        plot9.setBackgroundImage(image12);
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", plot9);
        java.awt.Paint paint15 = plot9.getBackgroundPaint();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        int int7 = jFreeChart4.getSubtitleCount();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        java.awt.geom.Point2D point2D10 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.draw(graphics2D8, rectangle2D9, point2D10, chartRenderingInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        float float10 = jFreeChart9.getBackgroundImageAlpha();
        java.awt.Paint paint11 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        jFreeChart9.setBorderPaint(paint11);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = jFreeChart9.getPadding();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets13);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getRootPlot();
        plot8.setBackgroundImageAlignment((int) (byte) 100);
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart(plot8);
        java.awt.Paint paint12 = plot8.getBackgroundPaint();
        org.jfree.data.general.DatasetGroup datasetGroup13 = plot8.getDatasetGroup();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(datasetGroup13);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder2 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        multiplePiePlot0.setLimit((double) 100L);
        float float7 = multiplePiePlot0.getForegroundAlpha();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(tableOrder2);
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent5);
        boolean boolean7 = multiplePiePlot1.isSubplot();
        java.awt.Stroke stroke8 = multiplePiePlot1.getOutlineStroke();
        java.lang.String str9 = multiplePiePlot1.getPlotType();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier14);
        multiplePiePlot10.zoom(0.0d);
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot10.getRootPlot();
        plot18.setBackgroundImageAlignment((int) (byte) 100);
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart(plot18);
        org.jfree.chart.title.TextTitle textTitle22 = jFreeChart21.getTitle();
        jFreeChart21.setAntiAlias(false);
        boolean boolean25 = multiplePiePlot1.equals((java.lang.Object) jFreeChart21);
        org.jfree.chart.JFreeChart jFreeChart26 = new org.jfree.chart.JFreeChart("Other", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo29 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart26.draw(graphics2D27, rectangle2D28, chartRenderingInfo29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Multiple Pie Plot" + "'", str9, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertNull(textTitle22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        multiplePiePlot0.setLimit((double) 0);
        multiplePiePlot0.setBackgroundAlpha((float) (-1));
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        multiplePiePlot0.setDataset(categoryDataset9);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        float float12 = multiplePiePlot11.getBackgroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier17);
        multiplePiePlot13.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot13.getPieChart();
        org.jfree.chart.title.Title title23 = jFreeChart21.getSubtitle((int) (byte) 0);
        multiplePiePlot11.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart21);
        org.jfree.data.category.CategoryDataset categoryDataset25 = multiplePiePlot11.getDataset();
        multiplePiePlot0.setParent((org.jfree.chart.plot.Plot) multiplePiePlot11);
        double double27 = multiplePiePlot11.getLimit();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(jFreeChart21);
        org.junit.Assert.assertNotNull(title23);
        org.junit.Assert.assertNull(categoryDataset25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        java.awt.Image image9 = null;
        multiplePiePlot0.setBackgroundImage(image9);
        boolean boolean11 = multiplePiePlot0.isSubplot();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot0.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = plot12.getNoDataMessage();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(plot12);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundAlpha((float) 1L);
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertNotNull(legendItemCollection4);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle8 = jFreeChart4.getLegend((int) (short) 0);
        boolean boolean9 = jFreeChart4.isNotify();
        java.util.List list10 = jFreeChart4.getSubtitles();
        int int11 = jFreeChart4.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(legendTitle8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        java.awt.Font font1 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot2);
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("", font1, (org.jfree.chart.plot.Plot) multiplePiePlot2, false);
        java.awt.Paint paint14 = jFreeChart13.getBorderPaint();
        org.jfree.chart.event.ChartProgressListener chartProgressListener15 = null;
        jFreeChart13.removeProgressListener(chartProgressListener15);
        int int17 = jFreeChart13.getSubtitleCount();
        org.jfree.chart.event.ChartProgressListener chartProgressListener18 = null;
        jFreeChart13.addProgressListener(chartProgressListener18);
        org.jfree.chart.event.ChartProgressListener chartProgressListener20 = null;
        jFreeChart13.addProgressListener(chartProgressListener20);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        float float10 = jFreeChart9.getBackgroundImageAlpha();
        java.awt.Paint paint11 = jFreeChart9.getBackgroundPaint();
        boolean boolean12 = jFreeChart9.getAntiAlias();
        jFreeChart9.setAntiAlias(true);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart4.setBackgroundPaint(paint7);
        org.jfree.chart.event.ChartProgressListener chartProgressListener9 = null;
        jFreeChart4.addProgressListener(chartProgressListener9);
        jFreeChart4.setNotify(false);
        jFreeChart4.setTextAntiAlias(true);
        java.util.List list15 = jFreeChart4.getSubtitles();
        jFreeChart4.setTitle("Multiple Pie Plot");
        jFreeChart4.setBackgroundImageAlpha(100.0f);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo22 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.handleClick(15, 15, chartRenderingInfo22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot1.getParent();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot();
        float float5 = multiplePiePlot4.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot4.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart7 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot4);
        jFreeChart7.fireChartChanged();
        boolean boolean9 = jFreeChart7.getAntiAlias();
        java.awt.Paint paint10 = jFreeChart7.getBorderPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint10);
        java.awt.Paint paint12 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setOutlineVisible(true);
        int int15 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        float float19 = multiplePiePlot18.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot18.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot18);
        jFreeChart21.fireChartChanged();
        boolean boolean23 = jFreeChart21.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle25 = jFreeChart21.getLegend((int) (short) 0);
        boolean boolean26 = jFreeChart21.isNotify();
        float float27 = jFreeChart21.getBackgroundImageAlpha();
        int int28 = jFreeChart21.getSubtitleCount();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo31 = null;
        java.awt.image.BufferedImage bufferedImage32 = jFreeChart21.createBufferedImage((int) (short) 1, 1, chartRenderingInfo31);
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = jFreeChart21.getPadding();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setPieChart(jFreeChart21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'pieChart' argument must be a chart based on a PiePlot.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(legendTitle25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.5f + "'", float27 == 0.5f);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(bufferedImage32);
        org.junit.Assert.assertNotNull(rectangleInsets33);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        org.jfree.chart.event.ChartProgressListener chartProgressListener8 = null;
        jFreeChart4.addProgressListener(chartProgressListener8);
        java.lang.Object obj10 = jFreeChart4.getTextAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle11 = jFreeChart4.getLegend();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.XYPlot xYPlot12 = jFreeChart4.getXYPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.MultiplePiePlot cannot be cast to org.jfree.chart.plot.XYPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(legendTitle11);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.Title title10 = jFreeChart8.getSubtitle((int) (byte) 0);
        jFreeChart8.removeLegend();
        org.jfree.chart.title.LegendTitle legendTitle12 = jFreeChart8.getLegend();
        java.awt.Font font14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj16 = multiplePiePlot15.clone();
        multiplePiePlot15.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = null;
        multiplePiePlot15.setDrawingSupplier(drawingSupplier19);
        multiplePiePlot15.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot15.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart24 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot15);
        org.jfree.chart.JFreeChart jFreeChart26 = new org.jfree.chart.JFreeChart("", font14, (org.jfree.chart.plot.Plot) multiplePiePlot15, false);
        java.awt.Paint paint27 = jFreeChart26.getBorderPaint();
        org.jfree.chart.event.ChartProgressListener chartProgressListener28 = null;
        jFreeChart26.removeProgressListener(chartProgressListener28);
        java.util.List list30 = jFreeChart26.getSubtitles();
        jFreeChart8.setSubtitles(list30);
        jFreeChart8.setBackgroundImageAlignment((int) (byte) -1);
        jFreeChart8.setTitle("Other");
        jFreeChart8.setBorderVisible(true);
        jFreeChart8.setTitle("");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertNotNull(legendTitle12);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(jFreeChart23);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(list30);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener7 = null;
        jFreeChart4.addProgressListener(chartProgressListener7);
        org.jfree.chart.event.ChartProgressListener chartProgressListener9 = null;
        jFreeChart4.removeProgressListener(chartProgressListener9);
        java.awt.Image image11 = jFreeChart4.getBackgroundImage();
        float float12 = jFreeChart4.getBackgroundImageAlpha();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo17 = null;
        java.awt.image.BufferedImage bufferedImage18 = jFreeChart4.createBufferedImage((int) ' ', 100, (double) 10L, 0.0d, chartRenderingInfo17);
        jFreeChart4.setBorderVisible(false);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo25 = null;
        java.awt.image.BufferedImage bufferedImage26 = jFreeChart4.createBufferedImage((int) (short) 10, (int) (byte) 10, 0.0d, (double) (byte) 10, chartRenderingInfo25);
        boolean boolean27 = jFreeChart4.getAntiAlias();
        java.awt.Paint paint28 = jFreeChart4.getBorderPaint();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(bufferedImage18);
        org.junit.Assert.assertNotNull(bufferedImage26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent5);
        java.awt.Paint paint7 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        float float10 = multiplePiePlot9.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot9.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart12 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot9);
        jFreeChart12.fireChartChanged();
        boolean boolean14 = jFreeChart12.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle16 = jFreeChart12.getLegend((int) (short) 0);
        boolean boolean17 = jFreeChart12.isNotify();
        float float18 = jFreeChart12.getBackgroundImageAlpha();
        java.awt.Paint paint19 = jFreeChart12.getBorderPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint19);
        java.awt.Stroke stroke21 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(legendTitle16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        multiplePiePlot0.setNoDataMessage("hi!");
        int int9 = multiplePiePlot0.getBackgroundImageAlignment();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = multiplePiePlot0.getInsets();
        java.awt.Paint paint11 = multiplePiePlot0.getAggregatedItemsPaint();
        float float12 = multiplePiePlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        jFreeChart4.fireChartChanged();
        org.jfree.chart.plot.Plot plot12 = jFreeChart4.getPlot();
        java.lang.Object obj13 = jFreeChart4.getTextAntiAlias();
        int int14 = jFreeChart4.getSubtitleCount();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.Title title10 = jFreeChart8.getSubtitle((int) (byte) 0);
        jFreeChart8.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        java.awt.Font font14 = multiplePiePlot12.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj16 = multiplePiePlot15.clone();
        multiplePiePlot15.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = null;
        multiplePiePlot15.setDrawingSupplier(drawingSupplier19);
        multiplePiePlot15.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot15.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset24 = multiplePiePlot15.getDataset();
        java.awt.Paint paint25 = multiplePiePlot15.getOutlinePaint();
        multiplePiePlot12.setAggregatedItemsPaint(paint25);
        jFreeChart8.setBorderPaint(paint25);
        jFreeChart8.setBorderVisible(true);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(jFreeChart23);
        org.junit.Assert.assertNull(categoryDataset24);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getRootPlot();
        multiplePiePlot0.setBackgroundImageAlignment(0);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent5);
        java.lang.String str7 = multiplePiePlot0.getPlotType();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj9 = multiplePiePlot8.clone();
        multiplePiePlot8.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier12);
        multiplePiePlot8.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart16 = multiplePiePlot8.getPieChart();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj18 = multiplePiePlot17.clone();
        multiplePiePlot17.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint21 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot17.setNoDataMessagePaint(paint21);
        java.awt.Font font23 = multiplePiePlot17.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = multiplePiePlot17.getDrawingSupplier();
        java.lang.String str25 = multiplePiePlot17.getNoDataMessage();
        org.jfree.chart.plot.Plot plot26 = multiplePiePlot17.getParent();
        org.jfree.data.general.DatasetGroup datasetGroup27 = multiplePiePlot17.getDatasetGroup();
        java.awt.Paint paint28 = multiplePiePlot17.getOutlinePaint();
        jFreeChart16.setBackgroundPaint(paint28);
        jFreeChart16.setBorderVisible(false);
        multiplePiePlot0.setPieChart(jFreeChart16);
        org.jfree.chart.title.LegendTitle legendTitle33 = jFreeChart16.getLegend();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(plot2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Multiple Pie Plot" + "'", str7, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(jFreeChart16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNotNull(drawingSupplier24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(plot26);
        org.junit.Assert.assertNull(datasetGroup27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(legendTitle33);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        multiplePiePlot0.setNoDataMessage("hi!");
        float float9 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot0.getParent();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertNull(plot10);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getParent();
        java.lang.Comparable comparable3 = multiplePiePlot0.getAggregatedItemsKey();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent4 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent4);
        multiplePiePlot0.setBackgroundImageAlpha((float) (byte) 1);
        multiplePiePlot0.setOutlineVisible(true);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = multiplePiePlot0.getLegendItems();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.drawOutline(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + "Other" + "'", comparable3, "Other");
        org.junit.Assert.assertNotNull(legendItemCollection10);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        boolean boolean11 = jFreeChart4.isNotify();
        jFreeChart4.fireChartChanged();
        java.lang.Object obj13 = jFreeChart4.getTextAntiAlias();
        org.jfree.chart.event.ChartProgressListener chartProgressListener14 = null;
        jFreeChart4.removeProgressListener(chartProgressListener14);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        double double9 = multiplePiePlot0.getLimit();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = multiplePiePlot0.getDrawingSupplier();
        double double11 = multiplePiePlot0.getLimit();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(drawingSupplier10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier5);
        multiplePiePlot1.zoom(0.0d);
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        plot9.setInsets(rectangleInsets10);
        java.awt.Image image12 = null;
        plot9.setBackgroundImage(image12);
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", plot9);
        java.awt.Paint paint15 = plot9.getOutlinePaint();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        java.awt.Image image7 = jFreeChart4.getBackgroundImage();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = jFreeChart4.getPadding();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(rectangleInsets8);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.awt.Paint paint3 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent4);
        java.lang.Object obj6 = multiplePiePlot0.clone();
        multiplePiePlot0.setOutlineVisible(true);
        java.awt.Paint paint9 = multiplePiePlot0.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier6);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        jFreeChart8.setNotify(false);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        jFreeChart15.fireChartChanged();
        java.lang.Object obj17 = jFreeChart15.clone();
        jFreeChart15.setTextAntiAlias(false);
        org.jfree.chart.event.ChartProgressListener chartProgressListener20 = null;
        jFreeChart15.removeProgressListener(chartProgressListener20);
        boolean boolean22 = jFreeChart8.equals((java.lang.Object) jFreeChart15);
        jFreeChart15.setBackgroundImageAlpha((float) 1);
        java.lang.Object obj25 = jFreeChart15.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.title.Title title12 = jFreeChart10.getSubtitle((int) (byte) 0);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.general.DatasetGroup datasetGroup14 = multiplePiePlot0.getDatasetGroup();
        java.awt.Paint paint15 = multiplePiePlot0.getOutlinePaint();
        boolean boolean16 = multiplePiePlot0.isOutlineVisible();
        int int17 = multiplePiePlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(title12);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = jFreeChart8.getPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = jFreeChart8.getPadding();
        org.jfree.chart.plot.Plot plot11 = jFreeChart8.getPlot();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo14 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.handleClick(100, 100, chartRenderingInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(plot11);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.lang.Object obj8 = jFreeChart4.clone();
        java.awt.Stroke stroke9 = jFreeChart4.getBorderStroke();
        java.awt.Stroke stroke10 = jFreeChart4.getBorderStroke();
        boolean boolean11 = jFreeChart4.getAntiAlias();
        java.awt.RenderingHints renderingHints12 = jFreeChart4.getRenderingHints();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(renderingHints12);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier6);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        jFreeChart8.setNotify(false);
        int int11 = jFreeChart8.getBackgroundImageAlignment();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        jFreeChart16.fireChartChanged();
        java.awt.Image image18 = jFreeChart16.getBackgroundImage();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo23 = null;
        java.awt.image.BufferedImage bufferedImage24 = jFreeChart16.createBufferedImage((int) 'a', (int) ' ', (double) (byte) 10, (double) 10, chartRenderingInfo23);
        jFreeChart8.setBackgroundImage((java.awt.Image) bufferedImage24);
        java.awt.image.BufferedImage bufferedImage28 = jFreeChart8.createBufferedImage(100, (int) ' ');
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj30 = multiplePiePlot29.clone();
        multiplePiePlot29.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier33 = null;
        multiplePiePlot29.setDrawingSupplier(drawingSupplier33);
        java.awt.Image image35 = multiplePiePlot29.getBackgroundImage();
        boolean boolean37 = multiplePiePlot29.equals((java.lang.Object) 1.0f);
        org.jfree.chart.JFreeChart jFreeChart38 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot29);
        multiplePiePlot29.setNoDataMessage("");
        org.jfree.data.general.DatasetGroup datasetGroup41 = multiplePiePlot29.getDatasetGroup();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent42 = null;
        multiplePiePlot29.datasetChanged(datasetChangeEvent42);
        java.awt.Font font44 = multiplePiePlot29.getNoDataMessageFont();
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.setTextAntiAlias((java.lang.Object) font44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.awt.Font[family=SansSerif,name=SansSerif,style=plain,size=12] incompatible with Text-specific antialiasing enable key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNull(image18);
        org.junit.Assert.assertNotNull(bufferedImage24);
        org.junit.Assert.assertNotNull(bufferedImage28);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNull(image35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(datasetGroup41);
        org.junit.Assert.assertNotNull(font44);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        boolean boolean8 = multiplePiePlot0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        multiplePiePlot0.setNoDataMessage("");
        org.jfree.data.general.DatasetGroup datasetGroup12 = multiplePiePlot0.getDatasetGroup();
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(datasetGroup12);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart4.setBackgroundPaint(paint7);
        org.jfree.chart.event.ChartProgressListener chartProgressListener9 = null;
        jFreeChart4.addProgressListener(chartProgressListener9);
        jFreeChart4.setNotify(false);
        jFreeChart4.setTextAntiAlias(true);
        float float15 = jFreeChart4.getBackgroundImageAlpha();
        boolean boolean16 = jFreeChart4.getAntiAlias();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier6);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot0.markerChanged(markerChangeEvent9);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        multiplePiePlot2.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        int int12 = multiplePiePlot2.getBackgroundImageAlignment();
        java.awt.Paint paint13 = multiplePiePlot2.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart14 = multiplePiePlot2.getPieChart();
        multiplePiePlot2.setBackgroundAlpha((float) (short) 10);
        boolean boolean17 = multiplePiePlot0.equals((java.lang.Object) multiplePiePlot2);
        java.awt.Paint paint18 = multiplePiePlot0.getOutlinePaint();
        multiplePiePlot0.setBackgroundImageAlignment((int) (byte) 0);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(jFreeChart14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder2 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = multiplePiePlot0.getLegendItems();
        java.lang.Object obj4 = multiplePiePlot0.clone();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(tableOrder2);
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getParent();
        java.lang.Comparable comparable3 = multiplePiePlot0.getAggregatedItemsKey();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent4 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent4);
        multiplePiePlot0.setBackgroundImageAlpha((float) (byte) 1);
        java.lang.Object obj8 = multiplePiePlot0.clone();
        multiplePiePlot0.setForegroundAlpha(100.0f);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + "Other" + "'", comparable3, "Other");
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier6);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        float float9 = multiplePiePlot0.getBackgroundImageAlpha();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        multiplePiePlot0.handleClick((int) (short) 1, (-1), plotRenderingInfo12);
        org.jfree.data.general.DatasetGroup datasetGroup14 = multiplePiePlot0.getDatasetGroup();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.drawBackground(graphics2D15, rectangle2D16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(datasetGroup14);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.awt.Paint paint3 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent4);
        boolean boolean6 = multiplePiePlot0.isSubplot();
        java.awt.Stroke stroke7 = multiplePiePlot0.getOutlineStroke();
        java.lang.String str8 = multiplePiePlot0.getPlotType();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj10 = multiplePiePlot9.clone();
        multiplePiePlot9.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier13);
        multiplePiePlot9.zoom(0.0d);
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot9.getRootPlot();
        plot17.setBackgroundImageAlignment((int) (byte) 100);
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart(plot17);
        org.jfree.chart.title.TextTitle textTitle21 = jFreeChart20.getTitle();
        jFreeChart20.setAntiAlias(false);
        boolean boolean24 = multiplePiePlot0.equals((java.lang.Object) jFreeChart20);
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        java.awt.geom.Point2D point2D27 = null;
        org.jfree.chart.plot.PlotState plotState28 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.draw(graphics2D25, rectangle2D26, point2D27, plotState28, plotRenderingInfo29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Multiple Pie Plot" + "'", str8, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertNull(textTitle21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.Title title10 = jFreeChart8.getSubtitle((int) (byte) 0);
        org.jfree.chart.plot.Plot plot11 = jFreeChart8.getPlot();
        plot11.setBackgroundImageAlignment((int) (short) 100);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        float float16 = multiplePiePlot15.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot15.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart18 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot15);
        jFreeChart18.fireChartChanged();
        boolean boolean20 = jFreeChart18.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle22 = jFreeChart18.getLegend((int) (short) 0);
        plot11.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart18);
        jFreeChart18.setBorderVisible(true);
        jFreeChart18.setTextAntiAlias(false);
        org.jfree.chart.event.ChartProgressListener chartProgressListener28 = null;
        jFreeChart18.removeProgressListener(chartProgressListener28);
        org.jfree.chart.event.TitleChangeEvent titleChangeEvent30 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart18.titleChanged(titleChangeEvent30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(legendTitle22);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.lang.Comparable comparable3 = multiplePiePlot0.getAggregatedItemsKey();
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot0.getParent();
        org.jfree.chart.JFreeChart jFreeChart5 = multiplePiePlot0.getPieChart();
        java.awt.Paint paint6 = multiplePiePlot0.getBackgroundPaint();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + "Other" + "'", comparable3, "Other");
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        java.awt.Font font1 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot2);
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("", font1, (org.jfree.chart.plot.Plot) multiplePiePlot2, false);
        jFreeChart13.setBackgroundImageAlignment((int) (short) 10);
        boolean boolean16 = jFreeChart13.isNotify();
        float float17 = jFreeChart13.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener7 = null;
        jFreeChart4.addProgressListener(chartProgressListener7);
        org.jfree.chart.event.ChartProgressListener chartProgressListener9 = null;
        jFreeChart4.removeProgressListener(chartProgressListener9);
        java.awt.Image image11 = jFreeChart4.getBackgroundImage();
        float float12 = jFreeChart4.getBackgroundImageAlpha();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo17 = null;
        java.awt.image.BufferedImage bufferedImage18 = jFreeChart4.createBufferedImage((int) ' ', 100, (double) 10L, 0.0d, chartRenderingInfo17);
        jFreeChart4.setBorderVisible(false);
        java.lang.Class<?> wildcardClass21 = jFreeChart4.getClass();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(bufferedImage18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.title.LegendTitle legendTitle5 = jFreeChart4.getLegend();
        org.jfree.chart.title.LegendTitle legendTitle6 = jFreeChart4.getLegend();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.plotChanged(plotChangeEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(legendTitle5);
        org.junit.Assert.assertNotNull(legendTitle6);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart4.setBackgroundPaint(paint7);
        boolean boolean9 = jFreeChart4.isBorderVisible();
        jFreeChart4.setBackgroundImageAlignment(1);
        jFreeChart4.removeLegend();
        org.jfree.chart.event.ChartChangeListener chartChangeListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.addChangeListener(chartChangeListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        multiplePiePlot0.setLimit((double) 0);
        java.awt.Paint paint7 = multiplePiePlot0.getAggregatedItemsPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent8);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier14);
        multiplePiePlot10.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot10.getPieChart();
        org.jfree.chart.title.Title title20 = jFreeChart18.getSubtitle((int) (byte) 0);
        jFreeChart18.removeLegend();
        org.jfree.chart.title.LegendTitle legendTitle22 = jFreeChart18.getLegend();
        multiplePiePlot0.setPieChart(jFreeChart18);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent24);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 10);
        boolean boolean28 = multiplePiePlot0.isOutlineVisible();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(jFreeChart18);
        org.junit.Assert.assertNotNull(title20);
        org.junit.Assert.assertNotNull(legendTitle22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener7 = null;
        jFreeChart4.addProgressListener(chartProgressListener7);
        org.jfree.chart.event.ChartProgressListener chartProgressListener9 = null;
        jFreeChart4.removeProgressListener(chartProgressListener9);
        float float11 = jFreeChart4.getBackgroundImageAlpha();
        java.awt.Paint paint12 = jFreeChart4.getBorderPaint();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.XYPlot xYPlot13 = jFreeChart4.getXYPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.MultiplePiePlot cannot be cast to org.jfree.chart.plot.XYPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        boolean boolean11 = jFreeChart4.getAntiAlias();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage15 = jFreeChart4.createBufferedImage((int) (short) -1, (int) (short) 10, chartRenderingInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (-1) and height (10) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        jFreeChart9.setAntiAlias(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = jFreeChart9.getPadding();
        java.awt.Paint paint13 = jFreeChart9.getBackgroundPaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset9 = multiplePiePlot0.getDataset();
        java.awt.Paint paint10 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj13 = multiplePiePlot12.clone();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot12.setDataset(categoryDataset14);
        java.awt.Font font16 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot12.setNoDataMessageFont(font16);
        java.lang.String str18 = multiplePiePlot12.getPlotType();
        boolean boolean19 = multiplePiePlot12.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot12.setInsets(rectangleInsets20, false);
        java.awt.Font font23 = multiplePiePlot12.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot();
        float float25 = multiplePiePlot24.getBackgroundAlpha();
        float float26 = multiplePiePlot24.getBackgroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart28 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", font23, (org.jfree.chart.plot.Plot) multiplePiePlot24, false);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.setPieChart(jFreeChart28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'pieChart' argument must be a chart based on a PiePlot.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNull(categoryDataset9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Multiple Pie Plot" + "'", str18, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 1.0f + "'", float26 == 1.0f);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder1 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder3 = multiplePiePlot2.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot0.getInsets();
        boolean boolean8 = multiplePiePlot0.isSubplot();
        org.junit.Assert.assertNotNull(tableOrder1);
        org.junit.Assert.assertNotNull(tableOrder3);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertNotNull(legendItemCollection6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo8 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.draw(graphics2D6, rectangle2D7, chartRenderingInfo8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart4.setBackgroundPaint(paint7);
        boolean boolean9 = jFreeChart4.isBorderVisible();
        jFreeChart4.setBackgroundImageAlignment(1);
        jFreeChart4.removeLegend();
        java.awt.image.BufferedImage bufferedImage15 = jFreeChart4.createBufferedImage((int) (short) 1, (int) ' ');
        jFreeChart4.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot18.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection20 = multiplePiePlot18.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        multiplePiePlot18.setDataset(categoryDataset21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = multiplePiePlot18.getDataset();
        boolean boolean24 = multiplePiePlot18.isOutlineVisible();
        org.jfree.chart.JFreeChart jFreeChart25 = multiplePiePlot18.getPieChart();
        org.jfree.chart.event.ChartProgressListener chartProgressListener26 = null;
        jFreeChart25.removeProgressListener(chartProgressListener26);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot();
        float float30 = multiplePiePlot29.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot31 = multiplePiePlot29.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart32 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot29);
        jFreeChart32.fireChartChanged();
        jFreeChart32.fireChartChanged();
        jFreeChart32.setTitle("hi!");
        org.jfree.chart.title.TextTitle textTitle37 = jFreeChart32.getTitle();
        jFreeChart25.setTitle(textTitle37);
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.addSubtitle((int) '4', (org.jfree.chart.title.Title) textTitle37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'index' argument is out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bufferedImage15);
        org.junit.Assert.assertNull(plot19);
        org.junit.Assert.assertNotNull(legendItemCollection20);
        org.junit.Assert.assertNull(categoryDataset23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jFreeChart25);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertNotNull(plot31);
        org.junit.Assert.assertNotNull(textTitle37);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        boolean boolean8 = multiplePiePlot0.equals((java.lang.Object) 1.0f);
        java.awt.Stroke stroke9 = multiplePiePlot0.getOutlineStroke();
        java.awt.Paint paint10 = multiplePiePlot0.getBackgroundPaint();
        boolean boolean11 = multiplePiePlot0.isOutlineVisible();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 1L);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder1 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder3 = multiplePiePlot2.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot0.getLegendItems();
        multiplePiePlot0.setBackgroundAlpha(0.0f);
        java.lang.String str9 = multiplePiePlot0.getPlotType();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D10, rectangle2D11);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = multiplePiePlot0.getInsets();
        org.junit.Assert.assertNotNull(tableOrder1);
        org.junit.Assert.assertNotNull(tableOrder3);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertNotNull(legendItemCollection6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Multiple Pie Plot" + "'", str9, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(rectangleInsets13);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        multiplePiePlot0.setNoDataMessage("hi!");
        org.jfree.data.category.CategoryDataset categoryDataset9 = multiplePiePlot0.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot0.getDataset();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent11);
        java.awt.Paint paint13 = multiplePiePlot0.getNoDataMessagePaint();
        multiplePiePlot0.setForegroundAlpha((float) 1L);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertNull(categoryDataset9);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart4.setBackgroundPaint(paint7);
        boolean boolean9 = jFreeChart4.isBorderVisible();
        jFreeChart4.setBorderVisible(false);
        jFreeChart4.fireChartChanged();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent2);
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        float float7 = multiplePiePlot6.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot6.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot6);
        jFreeChart9.fireChartChanged();
        java.lang.Object obj11 = jFreeChart9.clone();
        java.awt.Paint paint12 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart9.setBackgroundPaint(paint12);
        org.jfree.chart.event.ChartProgressListener chartProgressListener14 = null;
        jFreeChart9.addProgressListener(chartProgressListener14);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo19 = null;
        java.awt.image.BufferedImage bufferedImage20 = jFreeChart9.createBufferedImage((int) '#', 1, (int) (byte) 10, chartRenderingInfo19);
        java.lang.Class<?> wildcardClass21 = bufferedImage20.getClass();
        boolean boolean22 = multiplePiePlot1.equals((java.lang.Object) wildcardClass21);
        float float23 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(bufferedImage20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.5f + "'", float23 == 0.5f);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent2);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot();
        float float6 = multiplePiePlot5.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot5.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot5);
        java.awt.Paint paint9 = jFreeChart8.getBackgroundPaint();
        java.awt.Stroke stroke10 = jFreeChart8.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle11 = jFreeChart8.getTitle();
        java.awt.Image image12 = jFreeChart8.getBackgroundImage();
        java.awt.Paint paint13 = jFreeChart8.getBorderPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint13);
        java.awt.Font font15 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset16 = multiplePiePlot1.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup17 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(textTitle11);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNull(categoryDataset16);
        org.junit.Assert.assertNull(datasetGroup17);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier5);
        multiplePiePlot1.setForegroundAlpha(0.0f);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot1.zoom((double) (byte) 0);
        boolean boolean13 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.zoom((double) 100.0f);
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("Other", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.data.general.DatasetGroup datasetGroup17 = multiplePiePlot1.getDatasetGroup();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = multiplePiePlot1.getInsets();
        java.awt.Paint paint19 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNull(paint19);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = jFreeChart8.getPadding();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        float float12 = multiplePiePlot11.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot11.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot11);
        jFreeChart14.fireChartChanged();
        boolean boolean16 = jFreeChart14.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle18 = jFreeChart14.getLegend((int) (short) 0);
        jFreeChart8.removeSubtitle((org.jfree.chart.title.Title) legendTitle18);
        int int20 = jFreeChart8.getBackgroundImageAlignment();
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.draw(graphics2D21, rectangle2D22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(legendTitle18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.title.Title title12 = jFreeChart10.getSubtitle((int) (byte) 0);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot0.getParent();
        org.jfree.chart.JFreeChart jFreeChart15 = multiplePiePlot0.getPieChart();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(title12);
        org.junit.Assert.assertNull(plot14);
        org.junit.Assert.assertNotNull(jFreeChart15);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        multiplePiePlot0.setLimit((double) 0);
        multiplePiePlot0.setBackgroundAlpha((float) (-1));
        multiplePiePlot0.setBackgroundImageAlpha((float) 1L);
        java.awt.Paint paint11 = multiplePiePlot0.getOutlinePaint();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        multiplePiePlot0.setForegroundAlpha((-1.0f));
        java.awt.Paint paint11 = multiplePiePlot0.getBackgroundPaint();
        multiplePiePlot0.setOutlineVisible(true);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent14 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent14);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        multiplePiePlot0.handleClick((-1), 1, plotRenderingInfo18);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        java.awt.Image image9 = null;
        multiplePiePlot0.setBackgroundImage(image9);
        boolean boolean11 = multiplePiePlot0.isSubplot();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent17 = null;
        multiplePiePlot13.axisChanged(axisChangeEvent17);
        java.awt.Paint paint19 = multiplePiePlot13.getAggregatedItemsPaint();
        multiplePiePlot13.setNoDataMessage("Multiple Pie Plot");
        multiplePiePlot13.zoom((double) (byte) 10);
        java.awt.Stroke stroke24 = multiplePiePlot13.getOutlineStroke();
        multiplePiePlot0.setOutlineStroke(stroke24);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(stroke24);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Font font2 = multiplePiePlot0.getNoDataMessageFont();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent3 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent3);
        org.jfree.chart.event.PlotChangeListener plotChangeListener5 = null;
        multiplePiePlot0.addChangeListener(plotChangeListener5);
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot0.getParent();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(font2);
        org.junit.Assert.assertNull(plot7);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        multiplePiePlot0.setForegroundAlpha((-1.0f));
        java.awt.Paint paint11 = multiplePiePlot0.getBackgroundPaint();
        multiplePiePlot0.setOutlineVisible(true);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent14 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent14);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D18, rectangle2D19);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.setBackgroundImageAlpha((float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.title.LegendTitle legendTitle5 = jFreeChart4.getLegend();
        org.jfree.chart.title.LegendTitle legendTitle6 = jFreeChart4.getLegend();
        boolean boolean7 = jFreeChart4.getAntiAlias();
        jFreeChart4.setBackgroundImageAlignment((int) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(legendTitle5);
        org.junit.Assert.assertNotNull(legendTitle6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        java.awt.Font font8 = multiplePiePlot0.getNoDataMessageFont();
        org.jfree.chart.JFreeChart jFreeChart9 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.Title title11 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart9.addSubtitle((int) (byte) 1, title11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'subtitle' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(jFreeChart9);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        multiplePiePlot0.setLimit((double) 0);
        java.awt.Paint paint7 = multiplePiePlot0.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        java.awt.Font font9 = multiplePiePlot0.getNoDataMessageFont();
        multiplePiePlot0.setForegroundAlpha((float) (short) -1);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) 10.0f);
        java.awt.Paint paint16 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot12.setNoDataMessagePaint(paint16);
        boolean boolean18 = multiplePiePlot12.isSubplot();
        int int19 = multiplePiePlot12.getBackgroundImageAlignment();
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot12.getPieChart();
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart20);
        org.jfree.chart.plot.Plot plot22 = jFreeChart20.getPlot();
        java.lang.Object obj23 = plot22.clone();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertNotNull(jFreeChart20);
        org.junit.Assert.assertNotNull(plot22);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.util.TableOrder tableOrder6 = multiplePiePlot0.getDataExtractOrder();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(tableOrder6);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        java.awt.Image image9 = null;
        multiplePiePlot0.setBackgroundImage(image9);
        org.jfree.chart.JFreeChart jFreeChart11 = multiplePiePlot0.getPieChart();
        double double12 = multiplePiePlot0.getLimit();
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot0.getParent();
        java.lang.String str14 = multiplePiePlot0.getNoDataMessage();
        java.awt.Paint paint15 = multiplePiePlot0.getAggregatedItemsPaint();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot0.getRootPlot();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(plot13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(plot16);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        java.awt.Font font1 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot2);
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("", font1, (org.jfree.chart.plot.Plot) multiplePiePlot2, false);
        java.awt.Paint paint14 = jFreeChart13.getBorderPaint();
        org.jfree.chart.event.ChartProgressListener chartProgressListener15 = null;
        jFreeChart13.removeProgressListener(chartProgressListener15);
        int int17 = jFreeChart13.getSubtitleCount();
        org.jfree.chart.event.ChartProgressListener chartProgressListener18 = null;
        jFreeChart13.addProgressListener(chartProgressListener18);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot();
        float float22 = multiplePiePlot21.getBackgroundAlpha();
        float float23 = multiplePiePlot21.getBackgroundAlpha();
        multiplePiePlot21.setOutlineVisible(false);
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        multiplePiePlot21.drawBackgroundImage(graphics2D26, rectangle2D27);
        org.jfree.chart.JFreeChart jFreeChart29 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot21);
        org.jfree.chart.title.LegendTitle legendTitle31 = jFreeChart29.getLegend(0);
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart13.addSubtitle(10, (org.jfree.chart.title.Title) legendTitle31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'index' argument is out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertNotNull(legendTitle31);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart4.setBackgroundPaint(paint7);
        org.jfree.chart.event.ChartProgressListener chartProgressListener9 = null;
        jFreeChart4.addProgressListener(chartProgressListener9);
        jFreeChart4.setNotify(false);
        org.jfree.chart.event.ChartProgressListener chartProgressListener13 = null;
        jFreeChart4.removeProgressListener(chartProgressListener13);
        java.lang.Object obj15 = jFreeChart4.getTextAntiAlias();
        jFreeChart4.setTextAntiAlias(true);
        java.lang.Object obj18 = jFreeChart4.clone();
        jFreeChart4.setTitle("hi!");
        java.awt.Stroke stroke21 = jFreeChart4.getBorderStroke();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        jFreeChart4.removeLegend();
        org.jfree.chart.title.TextTitle textTitle12 = jFreeChart4.getTitle();
        java.util.List list13 = jFreeChart4.getSubtitles();
        boolean boolean14 = jFreeChart4.getAntiAlias();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertNotNull(textTitle12);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage(1, (int) '#', chartRenderingInfo9);
        java.lang.Class<?> wildcardClass11 = jFreeChart4.getClass();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart1 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = jFreeChart1.getPadding();
        java.util.List list3 = jFreeChart1.getSubtitles();
        org.jfree.chart.plot.Plot plot4 = jFreeChart1.getPlot();
        java.lang.Object obj5 = jFreeChart1.getTextAntiAlias();
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart1 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = jFreeChart1.getPadding();
        java.util.List list3 = jFreeChart1.getSubtitles();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo6 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart1.draw(graphics2D4, rectangle2D5, chartRenderingInfo6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.JFreeChart jFreeChart2 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        int int3 = jFreeChart2.getSubtitleCount();
        boolean boolean4 = jFreeChart2.isBorderVisible();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.awt.Image image8 = jFreeChart4.getBackgroundImage();
        java.awt.Paint paint9 = jFreeChart4.getBorderPaint();
        boolean boolean10 = jFreeChart4.isNotify();
        org.jfree.chart.title.LegendTitle legendTitle12 = jFreeChart4.getLegend((int) (short) 10);
        org.jfree.chart.event.ChartProgressListener chartProgressListener13 = null;
        jFreeChart4.removeProgressListener(chartProgressListener13);
        jFreeChart4.removeLegend();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(legendTitle12);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.awt.Paint paint3 = multiplePiePlot0.getOutlinePaint();
        java.lang.Comparable comparable4 = multiplePiePlot0.getAggregatedItemsKey();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.Title title10 = jFreeChart8.getSubtitle((int) (byte) 0);
        org.jfree.chart.plot.Plot plot11 = jFreeChart8.getPlot();
        jFreeChart8.fireChartChanged();
        org.jfree.chart.event.ChartChangeListener chartChangeListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.addChangeListener(chartChangeListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertNotNull(plot11);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder2 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = multiplePiePlot0.getLegendItems();
        java.awt.Paint paint4 = multiplePiePlot0.getBackgroundPaint();
        java.lang.Class<?> wildcardClass5 = paint4.getClass();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(tableOrder2);
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.title.Title title12 = jFreeChart10.getSubtitle((int) (byte) 0);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.category.CategoryDataset categoryDataset14 = multiplePiePlot0.getDataset();
        org.jfree.chart.JFreeChart jFreeChart15 = multiplePiePlot0.getPieChart();
        jFreeChart15.clearSubtitles();
        boolean boolean17 = jFreeChart15.isBorderVisible();
        jFreeChart15.setTitle("Other");
        java.lang.Object obj20 = jFreeChart15.getTextAntiAlias();
        org.jfree.chart.event.ChartChangeListener chartChangeListener21 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart15.addChangeListener(chartChangeListener21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(title12);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNotNull(jFreeChart15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        org.jfree.chart.event.ChartProgressListener chartProgressListener8 = null;
        jFreeChart4.addProgressListener(chartProgressListener8);
        jFreeChart4.setAntiAlias(true);
        jFreeChart4.setBackgroundImageAlignment(100);
        java.awt.Stroke stroke14 = jFreeChart4.getBorderStroke();
        org.jfree.chart.event.TitleChangeEvent titleChangeEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.titleChanged(titleChangeEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Font font2 = multiplePiePlot0.getNoDataMessageFont();
        float float3 = multiplePiePlot0.getForegroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot();
        float float6 = multiplePiePlot5.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot5.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot5);
        jFreeChart8.fireChartChanged();
        jFreeChart8.fireChartChanged();
        jFreeChart8.fireChartChanged();
        boolean boolean12 = jFreeChart8.isNotify();
        java.awt.Image image13 = jFreeChart8.getBackgroundImage();
        java.lang.Object obj14 = jFreeChart8.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo17 = null;
        java.awt.image.BufferedImage bufferedImage18 = jFreeChart8.createBufferedImage((int) ' ', (int) 'a', chartRenderingInfo17);
        boolean boolean19 = multiplePiePlot0.equals((java.lang.Object) jFreeChart8);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(font2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(bufferedImage18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier5);
        multiplePiePlot1.setForegroundAlpha(0.0f);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot1.zoom((double) (byte) 0);
        boolean boolean13 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.zoom((double) 100.0f);
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("Other", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.title.TextTitle textTitle17 = jFreeChart16.getTitle();
        boolean boolean18 = jFreeChart16.isBorderVisible();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(textTitle17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        java.awt.Paint paint10 = jFreeChart9.getBackgroundPaint();
        boolean boolean11 = jFreeChart9.isNotify();
        jFreeChart9.setNotify(true);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        java.lang.Comparable comparable3 = multiplePiePlot0.getAggregatedItemsKey();
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot0.getRootPlot();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        java.awt.geom.Point2D point2D7 = null;
        org.jfree.chart.plot.PlotState plotState8 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.draw(graphics2D5, rectangle2D6, point2D7, plotState8, plotRenderingInfo9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + "Other" + "'", comparable3, "Other");
        org.junit.Assert.assertNotNull(plot4);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        jFreeChart4.fireChartChanged();
        org.jfree.chart.plot.Plot plot12 = jFreeChart4.getPlot();
        java.awt.Paint paint13 = jFreeChart4.getBackgroundPaint();
        jFreeChart4.setNotify(true);
        jFreeChart4.clearSubtitles();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.XYPlot xYPlot17 = jFreeChart4.getXYPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.MultiplePiePlot cannot be cast to org.jfree.chart.plot.XYPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getRootPlot();
        boolean boolean9 = plot8.isOutlineVisible();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        int int10 = multiplePiePlot0.getBackgroundImageAlignment();
        java.awt.Paint paint11 = multiplePiePlot0.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot0.getPieChart();
        java.awt.Paint paint13 = jFreeChart12.getBorderPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        float float16 = multiplePiePlot15.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot15.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart18 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot15);
        int int19 = jFreeChart18.getBackgroundImageAlignment();
        float float20 = jFreeChart18.getBackgroundImageAlpha();
        org.jfree.chart.title.TextTitle textTitle21 = jFreeChart18.getTitle();
        jFreeChart12.setTitle(textTitle21);
        jFreeChart12.setBackgroundImageAlpha((float) 100);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.5f + "'", float20 == 0.5f);
        org.junit.Assert.assertNotNull(textTitle21);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.lang.Object obj8 = jFreeChart4.clone();
        java.awt.Stroke stroke9 = jFreeChart4.getBorderStroke();
        jFreeChart4.setAntiAlias(true);
        org.jfree.chart.title.LegendTitle legendTitle13 = jFreeChart4.getLegend(100);
        jFreeChart4.setNotify(false);
        org.jfree.chart.title.TextTitle textTitle16 = jFreeChart4.getTitle();
        org.jfree.chart.title.TextTitle textTitle17 = jFreeChart4.getTitle();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(legendTitle13);
        org.junit.Assert.assertNotNull(textTitle16);
        org.junit.Assert.assertNotNull(textTitle17);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener7 = null;
        jFreeChart4.addProgressListener(chartProgressListener7);
        org.jfree.chart.event.ChartProgressListener chartProgressListener9 = null;
        jFreeChart4.removeProgressListener(chartProgressListener9);
        java.awt.Image image11 = jFreeChart4.getBackgroundImage();
        float float12 = jFreeChart4.getBackgroundImageAlpha();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo17 = null;
        java.awt.image.BufferedImage bufferedImage18 = jFreeChart4.createBufferedImage((int) ' ', 100, (double) 10L, 0.0d, chartRenderingInfo17);
        jFreeChart4.setBorderVisible(false);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo25 = null;
        java.awt.image.BufferedImage bufferedImage26 = jFreeChart4.createBufferedImage((int) (short) 10, (int) (byte) 10, 0.0d, (double) (byte) 10, chartRenderingInfo25);
        java.awt.Stroke stroke27 = jFreeChart4.getBorderStroke();
        org.jfree.chart.plot.Plot plot28 = jFreeChart4.getPlot();
        jFreeChart4.setAntiAlias(true);
        java.awt.Paint paint31 = jFreeChart4.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(bufferedImage18);
        org.junit.Assert.assertNotNull(bufferedImage26);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(plot28);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.title.Title title12 = jFreeChart10.getSubtitle((int) (byte) 0);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.general.DatasetGroup datasetGroup14 = multiplePiePlot0.getDatasetGroup();
        java.awt.Paint paint15 = multiplePiePlot0.getOutlinePaint();
        java.lang.Comparable comparable16 = multiplePiePlot0.getAggregatedItemsKey();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        multiplePiePlot0.handleClick((int) (byte) 0, (int) '#', plotRenderingInfo19);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(title12);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + "Other" + "'", comparable16, "Other");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Paint paint2 = multiplePiePlot0.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot0.setInsets(rectangleInsets3, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        multiplePiePlot0.handleClick((int) 'a', (int) (short) 10, plotRenderingInfo8);
        java.lang.Comparable comparable10 = multiplePiePlot0.getAggregatedItemsKey();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot1.getParent();
        java.awt.Graphics2D graphics2D3 = null;
        java.awt.geom.Rectangle2D rectangle2D4 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D3, rectangle2D4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot2);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent5);
        java.awt.Paint paint7 = multiplePiePlot1.getAggregatedItemsPaint();
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        java.awt.Font font11 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(font11);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        java.awt.Image image9 = null;
        multiplePiePlot0.setBackgroundImage(image9);
        org.jfree.chart.JFreeChart jFreeChart11 = multiplePiePlot0.getPieChart();
        float float12 = multiplePiePlot0.getBackgroundImageAlpha();
        java.lang.String str13 = multiplePiePlot0.getPlotType();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Multiple Pie Plot" + "'", str13, "Multiple Pie Plot");
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        boolean boolean8 = multiplePiePlot0.equals((java.lang.Object) 1.0f);
        java.awt.Stroke stroke9 = multiplePiePlot0.getOutlineStroke();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot0.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = multiplePiePlot0.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(plot10);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        multiplePiePlot0.setDataset(categoryDataset2);
        java.awt.Font font4 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot0.setNoDataMessageFont(font4);
        java.lang.String str6 = multiplePiePlot0.getPlotType();
        boolean boolean7 = multiplePiePlot0.isSubplot();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent8);
        java.awt.Paint paint10 = multiplePiePlot0.getNoDataMessagePaint();
        float float11 = multiplePiePlot0.getForegroundAlpha();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 1L);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.JFreeChart jFreeChart2 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        int int3 = jFreeChart2.getSubtitleCount();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj6 = multiplePiePlot5.clone();
        multiplePiePlot5.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot5.setDrawingSupplier(drawingSupplier9);
        multiplePiePlot5.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart13 = multiplePiePlot5.getPieChart();
        org.jfree.chart.title.Title title15 = jFreeChart13.getSubtitle((int) (byte) 0);
        jFreeChart13.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        float float18 = multiplePiePlot17.getBackgroundAlpha();
        java.awt.Paint paint19 = multiplePiePlot17.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot17.setInsets(rectangleInsets20, false);
        jFreeChart13.setPadding(rectangleInsets20);
        java.awt.Paint paint24 = jFreeChart13.getBorderPaint();
        org.jfree.chart.title.LegendTitle legendTitle25 = jFreeChart13.getLegend();
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart2.addSubtitle((int) (byte) -1, (org.jfree.chart.title.Title) legendTitle25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'index' argument is out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(jFreeChart13);
        org.junit.Assert.assertNotNull(title15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(legendTitle25);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        java.lang.Comparable comparable3 = multiplePiePlot0.getAggregatedItemsKey();
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot0.getRootPlot();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.drawBackground(graphics2D5, rectangle2D6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + "Other" + "'", comparable3, "Other");
        org.junit.Assert.assertNotNull(plot4);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        boolean boolean11 = jFreeChart4.isNotify();
        jFreeChart4.fireChartChanged();
        java.util.List list13 = jFreeChart4.getSubtitles();
        java.awt.Stroke stroke14 = jFreeChart4.getBorderStroke();
        float float15 = jFreeChart4.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.Title title10 = jFreeChart8.getSubtitle((int) (byte) 0);
        jFreeChart8.removeLegend();
        float float12 = jFreeChart8.getBackgroundImageAlpha();
        jFreeChart8.setTitle("Multiple Pie Plot");
        java.awt.Stroke stroke15 = jFreeChart8.getBorderStroke();
        boolean boolean16 = jFreeChart8.getAntiAlias();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.CategoryPlot categoryPlot17 = jFreeChart8.getCategoryPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.PiePlot cannot be cast to org.jfree.chart.plot.CategoryPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        jFreeChart4.fireChartChanged();
        org.jfree.chart.event.ChartProgressListener chartProgressListener12 = null;
        jFreeChart4.addProgressListener(chartProgressListener12);
        java.awt.Paint paint14 = jFreeChart4.getBackgroundPaint();
        boolean boolean15 = jFreeChart4.getAntiAlias();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        int int5 = jFreeChart4.getBackgroundImageAlignment();
        float float6 = jFreeChart4.getBackgroundImageAlpha();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.handleClick((int) (short) 0, 0, chartRenderingInfo9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener7 = null;
        jFreeChart4.addProgressListener(chartProgressListener7);
        org.jfree.chart.event.ChartProgressListener chartProgressListener9 = null;
        jFreeChart4.removeProgressListener(chartProgressListener9);
        java.awt.Image image11 = jFreeChart4.getBackgroundImage();
        float float12 = jFreeChart4.getBackgroundImageAlpha();
        org.jfree.chart.title.LegendTitle legendTitle13 = jFreeChart4.getLegend();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo16 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.handleClick(1, (int) (byte) -1, chartRenderingInfo16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(legendTitle13);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        int int10 = multiplePiePlot0.getBackgroundImageAlignment();
        java.awt.Paint paint11 = multiplePiePlot0.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot0.getPieChart();
        multiplePiePlot0.setBackgroundAlpha((float) (short) 10);
        java.lang.String str15 = multiplePiePlot0.getPlotType();
        boolean boolean16 = multiplePiePlot0.isOutlineVisible();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Multiple Pie Plot" + "'", str15, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart4.setBackgroundPaint(paint7);
        org.jfree.chart.event.ChartProgressListener chartProgressListener9 = null;
        jFreeChart4.addProgressListener(chartProgressListener9);
        jFreeChart4.setNotify(false);
        jFreeChart4.setTextAntiAlias(true);
        java.util.List list15 = jFreeChart4.getSubtitles();
        jFreeChart4.setTitle("Multiple Pie Plot");
        jFreeChart4.setBackgroundImageAlpha(100.0f);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent20 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.plotChanged(plotChangeEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        multiplePiePlot1.setForegroundAlpha((float) (byte) 0);
        org.jfree.chart.JFreeChart jFreeChart7 = multiplePiePlot1.getPieChart();
        java.util.List list8 = jFreeChart7.getSubtitles();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj10 = multiplePiePlot9.clone();
        multiplePiePlot9.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier13);
        multiplePiePlot9.setLimit((double) 100L);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent17);
        java.awt.Image image19 = multiplePiePlot9.getBackgroundImage();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = multiplePiePlot9.getInsets();
        jFreeChart7.setPadding(rectangleInsets20);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(image19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.Title title10 = jFreeChart8.getSubtitle((int) (byte) 0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        jFreeChart15.fireChartChanged();
        boolean boolean17 = jFreeChart15.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle19 = jFreeChart15.getLegend((int) (short) 0);
        jFreeChart8.addLegend(legendTitle19);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = jFreeChart8.getPadding();
        jFreeChart8.clearSubtitles();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(legendTitle19);
        org.junit.Assert.assertNotNull(rectangleInsets21);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle8 = jFreeChart4.getLegend((int) (short) 0);
        boolean boolean9 = jFreeChart4.isNotify();
        float float10 = jFreeChart4.getBackgroundImageAlpha();
        int int11 = jFreeChart4.getSubtitleCount();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo14 = null;
        java.awt.image.BufferedImage bufferedImage15 = jFreeChart4.createBufferedImage((int) (short) 1, 1, chartRenderingInfo14);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = jFreeChart4.getPadding();
        java.awt.Paint paint17 = jFreeChart4.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(legendTitle8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(bufferedImage15);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier5);
        multiplePiePlot1.setForegroundAlpha(0.0f);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot1.zoom((double) (byte) 0);
        java.awt.Paint paint13 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        multiplePiePlot1.setBackgroundImageAlignment((-1));
        org.jfree.data.general.DatasetGroup datasetGroup17 = multiplePiePlot1.getDatasetGroup();
        double double18 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.lang.Object obj8 = jFreeChart4.clone();
        java.awt.Stroke stroke9 = jFreeChart4.getBorderStroke();
        java.awt.Stroke stroke10 = jFreeChart4.getBorderStroke();
        int int11 = jFreeChart4.getBackgroundImageAlignment();
        org.jfree.chart.event.ChartProgressListener chartProgressListener12 = null;
        jFreeChart4.addProgressListener(chartProgressListener12);
        org.jfree.chart.event.ChartChangeListener chartChangeListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.removeChangeListener(chartChangeListener14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.Title title10 = jFreeChart8.getSubtitle((int) (byte) 0);
        jFreeChart8.removeLegend();
        org.jfree.chart.title.LegendTitle legendTitle12 = jFreeChart8.getLegend();
        java.awt.Font font14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj16 = multiplePiePlot15.clone();
        multiplePiePlot15.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = null;
        multiplePiePlot15.setDrawingSupplier(drawingSupplier19);
        multiplePiePlot15.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot15.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart24 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot15);
        org.jfree.chart.JFreeChart jFreeChart26 = new org.jfree.chart.JFreeChart("", font14, (org.jfree.chart.plot.Plot) multiplePiePlot15, false);
        java.awt.Paint paint27 = jFreeChart26.getBorderPaint();
        org.jfree.chart.event.ChartProgressListener chartProgressListener28 = null;
        jFreeChart26.removeProgressListener(chartProgressListener28);
        java.util.List list30 = jFreeChart26.getSubtitles();
        jFreeChart8.setSubtitles(list30);
        jFreeChart8.setBackgroundImageAlignment((int) (byte) -1);
        java.lang.Object obj34 = jFreeChart8.getTextAntiAlias();
        boolean boolean35 = jFreeChart8.isBorderVisible();
        jFreeChart8.setTitle("Multiple Pie Plot");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertNotNull(legendTitle12);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(jFreeChart23);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Paint paint2 = multiplePiePlot0.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot0.setInsets(rectangleInsets3, false);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj7 = multiplePiePlot6.clone();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        multiplePiePlot6.setDataset(categoryDataset8);
        java.awt.Font font10 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot6.setNoDataMessageFont(font10);
        java.lang.String str12 = multiplePiePlot6.getPlotType();
        boolean boolean13 = multiplePiePlot6.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot6.setInsets(rectangleInsets14, false);
        multiplePiePlot0.setInsets(rectangleInsets14, false);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        multiplePiePlot0.setDataset(categoryDataset19);
        java.awt.Font font21 = multiplePiePlot0.getNoDataMessageFont();
        java.lang.String str22 = multiplePiePlot0.getPlotType();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Multiple Pie Plot" + "'", str12, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Multiple Pie Plot" + "'", str22, "Multiple Pie Plot");
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint4 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setNoDataMessagePaint(paint4);
        java.awt.Font font6 = multiplePiePlot0.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = multiplePiePlot0.getDrawingSupplier();
        java.lang.String str8 = multiplePiePlot0.getNoDataMessage();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot0.getParent();
        org.jfree.data.general.DatasetGroup datasetGroup10 = multiplePiePlot0.getDatasetGroup();
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot0.getRootPlot();
        java.awt.Stroke stroke12 = plot11.getOutlineStroke();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(drawingSupplier7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(plot9);
        org.junit.Assert.assertNull(datasetGroup10);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart1 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = jFreeChart1.getPadding();
        java.util.List list3 = jFreeChart1.getSubtitles();
        org.jfree.chart.plot.Plot plot4 = jFreeChart1.getPlot();
        org.jfree.chart.plot.Plot plot5 = plot4.getParent();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot4.notifyListeners(plotChangeEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNull(plot5);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.lang.Comparable comparable3 = multiplePiePlot0.getAggregatedItemsKey();
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot0.getParent();
        java.awt.Paint paint5 = multiplePiePlot0.getAggregatedItemsPaint();
        multiplePiePlot0.setLimit((double) 1L);
        int int8 = multiplePiePlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + "Other" + "'", comparable3, "Other");
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        boolean boolean8 = multiplePiePlot0.equals((java.lang.Object) 1.0f);
        java.awt.Stroke stroke9 = multiplePiePlot0.getOutlineStroke();
        java.awt.Paint paint10 = multiplePiePlot0.getBackgroundPaint();
        boolean boolean11 = multiplePiePlot0.isOutlineVisible();
        java.awt.Paint paint12 = multiplePiePlot0.getAggregatedItemsPaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(paint12);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot0.setInsets(rectangleInsets3);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot0.markerChanged(markerChangeEvent8);
        org.jfree.chart.util.TableOrder tableOrder10 = multiplePiePlot0.getDataExtractOrder();
        java.lang.String str11 = multiplePiePlot0.getNoDataMessage();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(tableOrder10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        java.lang.Object obj11 = jFreeChart4.getTextAntiAlias();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage16 = jFreeChart4.createBufferedImage((int) (short) 100, (int) '#', 15, chartRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown image type 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.awt.Paint paint3 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent4);
        boolean boolean6 = multiplePiePlot0.isSubplot();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj8 = multiplePiePlot7.clone();
        multiplePiePlot7.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset11 = multiplePiePlot7.getDataset();
        java.awt.Image image12 = null;
        multiplePiePlot7.setBackgroundImage(image12);
        java.awt.Paint paint14 = multiplePiePlot7.getNoDataMessagePaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent15 = null;
        multiplePiePlot7.datasetChanged(datasetChangeEvent15);
        multiplePiePlot7.setBackgroundAlpha((float) (byte) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot0.setDrawingSupplier(drawingSupplier19);
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(drawingSupplier19);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        jFreeChart4.setTitle("hi!");
        jFreeChart4.setTitle("Multiple Pie Plot");
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage16 = jFreeChart4.createBufferedImage((int) (short) -1, (int) (short) 10, (double) 0, (double) '#', chartRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (-1) and height (10) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener7 = null;
        jFreeChart4.addProgressListener(chartProgressListener7);
        org.jfree.chart.event.ChartProgressListener chartProgressListener9 = null;
        jFreeChart4.removeProgressListener(chartProgressListener9);
        jFreeChart4.setBackgroundImageAlpha((float) 1L);
        java.lang.Object obj13 = jFreeChart4.getTextAntiAlias();
        java.util.List list14 = jFreeChart4.getSubtitles();
        java.util.List list15 = jFreeChart4.getSubtitles();
        boolean boolean16 = jFreeChart4.isNotify();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        multiplePiePlot0.setLimit((double) 0);
        java.awt.Paint paint7 = multiplePiePlot0.getAggregatedItemsPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent8);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier14);
        multiplePiePlot10.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot10.getPieChart();
        org.jfree.chart.title.Title title20 = jFreeChart18.getSubtitle((int) (byte) 0);
        jFreeChart18.removeLegend();
        org.jfree.chart.title.LegendTitle legendTitle22 = jFreeChart18.getLegend();
        multiplePiePlot0.setPieChart(jFreeChart18);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent24);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 10);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        multiplePiePlot0.setDataset(categoryDataset28);
        org.jfree.data.general.DatasetGroup datasetGroup30 = multiplePiePlot0.getDatasetGroup();
        java.awt.Image image31 = multiplePiePlot0.getBackgroundImage();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(jFreeChart18);
        org.junit.Assert.assertNotNull(title20);
        org.junit.Assert.assertNotNull(legendTitle22);
        org.junit.Assert.assertNull(datasetGroup30);
        org.junit.Assert.assertNull(image31);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        multiplePiePlot0.setLimit((double) 0);
        java.awt.Paint paint7 = multiplePiePlot0.getAggregatedItemsPaint();
        float float8 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Image image9 = multiplePiePlot0.getBackgroundImage();
        boolean boolean10 = multiplePiePlot0.isOutlineVisible();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) "Multiple Pie Plot");
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        float float10 = jFreeChart9.getBackgroundImageAlpha();
        java.awt.Paint paint11 = jFreeChart9.getBackgroundPaint();
        boolean boolean12 = jFreeChart9.isNotify();
        jFreeChart9.fireChartChanged();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = jFreeChart9.getPadding();
        jFreeChart9.setTextAntiAlias(false);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(rectangleInsets14);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        java.lang.Comparable comparable3 = multiplePiePlot0.getAggregatedItemsKey();
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot0.getRootPlot();
        java.awt.Font font5 = plot4.getNoDataMessageFont();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + "Other" + "'", comparable3, "Other");
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(font5);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier6);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        jFreeChart8.setNotify(false);
        int int11 = jFreeChart8.getBackgroundImageAlignment();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        jFreeChart17.fireChartChanged();
        boolean boolean19 = jFreeChart17.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle21 = jFreeChart17.getLegend((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.addSubtitle(15, (org.jfree.chart.title.Title) legendTitle21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'index' argument is out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(legendTitle21);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.awt.Image image8 = jFreeChart4.getBackgroundImage();
        java.awt.Paint paint9 = jFreeChart4.getBorderPaint();
        int int10 = jFreeChart4.getBackgroundImageAlignment();
        java.awt.Paint paint11 = jFreeChart4.getBackgroundPaint();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage16 = jFreeChart4.createBufferedImage(0, (int) (byte) 10, (int) (short) 1, chartRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (0) and height (10) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        java.awt.Image image9 = null;
        multiplePiePlot0.setBackgroundImage(image9);
        float float11 = multiplePiePlot0.getForegroundAlpha();
        java.lang.Comparable comparable12 = multiplePiePlot0.getAggregatedItemsKey();
        multiplePiePlot0.setBackgroundImageAlignment(10);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + "Other" + "'", comparable12, "Other");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getRootPlot();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot0.getParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart(plot3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null 'plot' argument.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(plot2);
        org.junit.Assert.assertNull(plot3);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier6);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        java.awt.Image image9 = jFreeChart8.getBackgroundImage();
        java.awt.Stroke stroke10 = jFreeChart8.getBorderStroke();
        org.jfree.chart.title.LegendTitle legendTitle11 = jFreeChart8.getLegend();
        jFreeChart8.setTitle("");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.CategoryPlot categoryPlot14 = jFreeChart8.getCategoryPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.PiePlot cannot be cast to org.jfree.chart.plot.CategoryPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(legendTitle11);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent5);
        java.lang.Object obj7 = multiplePiePlot1.clone();
        java.awt.Paint paint8 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.JFreeChart jFreeChart10 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.event.ChartChangeListener chartChangeListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart10.removeChangeListener(chartChangeListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        float float10 = jFreeChart9.getBackgroundImageAlpha();
        java.awt.Paint paint11 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        jFreeChart9.setBorderPaint(paint11);
        jFreeChart9.setNotify(false);
        org.jfree.chart.event.ChartProgressListener chartProgressListener15 = null;
        jFreeChart9.removeProgressListener(chartProgressListener15);
        java.awt.Stroke stroke17 = jFreeChart9.getBorderStroke();
        org.jfree.chart.plot.Plot plot18 = jFreeChart9.getPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent19 = null;
        plot18.axisChanged(axisChangeEvent19);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(plot18);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot0.zoom((double) (byte) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        multiplePiePlot0.handleClick((int) '4', (int) (short) 1, plotRenderingInfo14);
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        jFreeChart4.removeLegend();
        java.lang.Object obj12 = jFreeChart4.getTextAntiAlias();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo17 = null;
        java.awt.image.BufferedImage bufferedImage18 = jFreeChart4.createBufferedImage(1, (int) (short) 10, (double) 0.0f, 100.0d, chartRenderingInfo17);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        java.awt.geom.Point2D point2D21 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo22 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.draw(graphics2D19, rectangle2D20, point2D21, chartRenderingInfo22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(bufferedImage18);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D11, rectangle2D12);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = multiplePiePlot0.getInsets();
        double double15 = multiplePiePlot0.getLimit();
        double double16 = multiplePiePlot0.getLimit();
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        multiplePiePlot0.removeChangeListener(plotChangeListener17);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getRootPlot();
        plot8.setBackgroundImageAlignment((int) (byte) 100);
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart(plot8);
        jFreeChart11.setBackgroundImageAlignment(100);
        java.awt.Stroke stroke14 = jFreeChart11.getBorderStroke();
        org.jfree.chart.title.LegendTitle legendTitle15 = jFreeChart11.getLegend();
        java.util.List list16 = jFreeChart11.getSubtitles();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        float float18 = multiplePiePlot17.getBackgroundAlpha();
        multiplePiePlot17.setAggregatedItemsKey((java.lang.Comparable) 10.0f);
        java.awt.Paint paint21 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot17.setNoDataMessagePaint(paint21);
        jFreeChart11.setBackgroundPaint(paint21);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo26 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart11.handleClick((int) (short) 10, (int) (short) 10, chartRenderingInfo26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(legendTitle15);
        org.junit.Assert.assertNotNull(list16);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot11.getParent();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        jFreeChart17.fireChartChanged();
        boolean boolean19 = jFreeChart17.getAntiAlias();
        java.awt.Paint paint20 = jFreeChart17.getBorderPaint();
        multiplePiePlot11.setAggregatedItemsPaint(paint20);
        java.awt.Paint paint22 = multiplePiePlot11.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundPaint(paint22);
        java.awt.Paint paint24 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNull(plot12);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(paint24);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        multiplePiePlot1.setForegroundAlpha((float) (byte) 0);
        org.jfree.chart.JFreeChart jFreeChart7 = multiplePiePlot1.getPieChart();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        float float10 = multiplePiePlot9.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot9.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart12 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot9);
        java.awt.Paint paint13 = jFreeChart12.getBackgroundPaint();
        java.awt.Stroke stroke14 = jFreeChart12.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle15 = jFreeChart12.getTitle();
        java.lang.Object obj16 = jFreeChart12.clone();
        java.awt.Stroke stroke17 = jFreeChart12.getBorderStroke();
        jFreeChart12.setAntiAlias(true);
        org.jfree.chart.title.LegendTitle legendTitle21 = jFreeChart12.getLegend(100);
        jFreeChart12.setNotify(false);
        org.jfree.chart.title.TextTitle textTitle24 = jFreeChart12.getTitle();
        boolean boolean25 = jFreeChart12.isBorderVisible();
        org.jfree.chart.event.ChartProgressListener chartProgressListener26 = null;
        jFreeChart12.addProgressListener(chartProgressListener26);
        boolean boolean28 = multiplePiePlot1.equals((java.lang.Object) chartProgressListener26);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(textTitle15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(legendTitle21);
        org.junit.Assert.assertNotNull(textTitle24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.title.Title title12 = jFreeChart10.getSubtitle((int) (byte) 0);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.general.DatasetGroup datasetGroup14 = multiplePiePlot0.getDatasetGroup();
        java.awt.Paint paint15 = multiplePiePlot0.getOutlinePaint();
        boolean boolean16 = multiplePiePlot0.isOutlineVisible();
        boolean boolean17 = multiplePiePlot0.isOutlineVisible();
        org.jfree.chart.util.TableOrder tableOrder18 = multiplePiePlot0.getDataExtractOrder();
        int int19 = multiplePiePlot0.getBackgroundImageAlignment();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.drawOutline(graphics2D20, rectangle2D21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(title12);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(tableOrder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Font font2 = multiplePiePlot0.getNoDataMessageFont();
        float float3 = multiplePiePlot0.getForegroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot();
        float float6 = multiplePiePlot5.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot5.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot5);
        jFreeChart8.fireChartChanged();
        java.lang.Object obj10 = jFreeChart8.clone();
        java.awt.Paint paint11 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart8.setBackgroundPaint(paint11);
        boolean boolean13 = jFreeChart8.isBorderVisible();
        jFreeChart8.setBackgroundImageAlignment(1);
        jFreeChart8.removeLegend();
        java.awt.image.BufferedImage bufferedImage19 = jFreeChart8.createBufferedImage((int) (short) 1, (int) ' ');
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo23 = null;
        java.awt.image.BufferedImage bufferedImage24 = jFreeChart8.createBufferedImage((int) '#', 1, 1, chartRenderingInfo23);
        multiplePiePlot0.setBackgroundImage((java.awt.Image) bufferedImage24);
        java.awt.Paint paint26 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.plot.Plot plot27 = multiplePiePlot0.getRootPlot();
        plot27.setBackgroundAlpha((float) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(font2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bufferedImage19);
        org.junit.Assert.assertNotNull(bufferedImage24);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(plot27);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        jFreeChart4.fireChartChanged();
        org.jfree.chart.plot.Plot plot12 = jFreeChart4.getPlot();
        java.awt.Paint paint13 = jFreeChart4.getBackgroundPaint();
        jFreeChart4.setNotify(true);
        jFreeChart4.clearSubtitles();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.plotChanged(plotChangeEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier5);
        multiplePiePlot1.setForegroundAlpha(0.0f);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot1.zoom((double) (byte) 0);
        boolean boolean13 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.zoom((double) 100.0f);
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("Other", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        multiplePiePlot1.setOutlineVisible(true);
        float float19 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent20 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent20);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.5f + "'", float19 == 0.5f);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent7 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent7);
        org.jfree.chart.JFreeChart jFreeChart9 = multiplePiePlot0.getPieChart();
        java.awt.Image image10 = multiplePiePlot0.getBackgroundImage();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertNull(image10);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        java.awt.Paint paint6 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNotNull(font7);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        boolean boolean6 = multiplePiePlot0.isOutlineVisible();
        org.jfree.chart.JFreeChart jFreeChart7 = multiplePiePlot0.getPieChart();
        java.lang.Object obj8 = jFreeChart7.clone();
        jFreeChart7.setBackgroundImageAlignment((int) (byte) 100);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        java.awt.Paint paint10 = jFreeChart9.getBackgroundPaint();
        java.awt.Paint paint11 = jFreeChart9.getBackgroundPaint();
        int int12 = jFreeChart9.getBackgroundImageAlignment();
        org.jfree.chart.title.Title title13 = null;
        jFreeChart9.removeSubtitle(title13);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage20 = jFreeChart9.createBufferedImage((int) (byte) 10, (int) ' ', (double) (-1L), (double) 0.0f, chartRenderingInfo19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: alpha value out of range");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        org.jfree.chart.event.ChartProgressListener chartProgressListener11 = null;
        jFreeChart4.addProgressListener(chartProgressListener11);
        boolean boolean13 = jFreeChart4.getAntiAlias();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        org.jfree.chart.event.ChartChangeListener chartChangeListener8 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.removeChangeListener(chartChangeListener8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        boolean boolean11 = jFreeChart4.isNotify();
        java.awt.Paint paint12 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart4.setBorderPaint(paint12);
        jFreeChart4.clearSubtitles();
        int int15 = jFreeChart4.getBackgroundImageAlignment();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj17 = multiplePiePlot16.clone();
        multiplePiePlot16.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = null;
        multiplePiePlot16.setDrawingSupplier(drawingSupplier20);
        multiplePiePlot16.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot16.getPieChart();
        java.awt.Image image25 = null;
        multiplePiePlot16.setBackgroundImage(image25);
        org.jfree.chart.JFreeChart jFreeChart27 = multiplePiePlot16.getPieChart();
        java.awt.Image image28 = jFreeChart27.getBackgroundImage();
        jFreeChart27.clearSubtitles();
        java.awt.RenderingHints renderingHints30 = jFreeChart27.getRenderingHints();
        jFreeChart4.setRenderingHints(renderingHints30);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(jFreeChart24);
        org.junit.Assert.assertNotNull(jFreeChart27);
        org.junit.Assert.assertNull(image28);
        org.junit.Assert.assertNotNull(renderingHints30);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        boolean boolean8 = multiplePiePlot0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        multiplePiePlot0.setNoDataMessage("");
        multiplePiePlot0.setNoDataMessage("hi!");
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) false);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent16 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent16);
        boolean boolean18 = multiplePiePlot0.isSubplot();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Font font2 = multiplePiePlot0.getNoDataMessageFont();
        float float3 = multiplePiePlot0.getForegroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot();
        float float6 = multiplePiePlot5.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot5.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot5);
        jFreeChart8.fireChartChanged();
        java.lang.Object obj10 = jFreeChart8.clone();
        java.awt.Paint paint11 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart8.setBackgroundPaint(paint11);
        boolean boolean13 = jFreeChart8.isBorderVisible();
        jFreeChart8.setBackgroundImageAlignment(1);
        jFreeChart8.removeLegend();
        java.awt.image.BufferedImage bufferedImage19 = jFreeChart8.createBufferedImage((int) (short) 1, (int) ' ');
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo23 = null;
        java.awt.image.BufferedImage bufferedImage24 = jFreeChart8.createBufferedImage((int) '#', 1, 1, chartRenderingInfo23);
        multiplePiePlot0.setBackgroundImage((java.awt.Image) bufferedImage24);
        org.jfree.chart.JFreeChart jFreeChart26 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(font2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bufferedImage19);
        org.junit.Assert.assertNotNull(bufferedImage24);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        jFreeChart4.setBackgroundImageAlignment(0);
        org.jfree.chart.event.TitleChangeEvent titleChangeEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.titleChanged(titleChangeEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        jFreeChart4.fireChartChanged();
        int int12 = jFreeChart4.getBackgroundImageAlignment();
        java.awt.Paint paint13 = jFreeChart4.getBackgroundPaint();
        java.lang.Object obj14 = jFreeChart4.getTextAntiAlias();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.XYPlot xYPlot15 = jFreeChart4.getXYPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.MultiplePiePlot cannot be cast to org.jfree.chart.plot.XYPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        multiplePiePlot0.setForegroundAlpha((-1.0f));
        java.awt.Paint paint11 = multiplePiePlot0.getBackgroundPaint();
        multiplePiePlot0.setOutlineVisible(true);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent14 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent14);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D18, rectangle2D19);
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        multiplePiePlot0.setDataset(categoryDataset22);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        boolean boolean11 = jFreeChart4.isNotify();
        java.awt.Stroke stroke12 = jFreeChart4.getBorderStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = jFreeChart4.getPadding();
        jFreeChart4.setBackgroundImageAlignment((int) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        java.awt.Paint paint6 = multiplePiePlot1.getAggregatedItemsPaint();
        float float7 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder10 = multiplePiePlot9.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        java.awt.Paint paint16 = jFreeChart15.getBackgroundPaint();
        java.awt.Stroke stroke17 = jFreeChart15.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener18 = null;
        jFreeChart15.addProgressListener(chartProgressListener18);
        org.jfree.chart.event.ChartProgressListener chartProgressListener20 = null;
        jFreeChart15.removeProgressListener(chartProgressListener20);
        java.awt.Image image22 = jFreeChart15.getBackgroundImage();
        float float23 = jFreeChart15.getBackgroundImageAlpha();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo28 = null;
        java.awt.image.BufferedImage bufferedImage29 = jFreeChart15.createBufferedImage((int) ' ', 100, (double) 10L, 0.0d, chartRenderingInfo28);
        jFreeChart15.setBorderVisible(false);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo36 = null;
        java.awt.image.BufferedImage bufferedImage37 = jFreeChart15.createBufferedImage((int) (short) 10, (int) (byte) 10, 0.0d, (double) (byte) 10, chartRenderingInfo36);
        multiplePiePlot9.setBackgroundImage((java.awt.Image) bufferedImage37);
        multiplePiePlot1.setBackgroundImage((java.awt.Image) bufferedImage37);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(tableOrder10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(image22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.5f + "'", float23 == 0.5f);
        org.junit.Assert.assertNotNull(bufferedImage29);
        org.junit.Assert.assertNotNull(bufferedImage37);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        multiplePiePlot0.setDataset(categoryDataset2);
        java.awt.Font font4 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot0.setNoDataMessageFont(font4);
        float float6 = multiplePiePlot0.getBackgroundImageAlpha();
        multiplePiePlot0.setBackgroundImageAlpha((float) (short) 0);
        multiplePiePlot0.setLimit((-1.0d));
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.lang.Object obj8 = jFreeChart4.clone();
        org.jfree.chart.event.ChartProgressListener chartProgressListener9 = null;
        jFreeChart4.addProgressListener(chartProgressListener9);
        jFreeChart4.setBackgroundImageAlpha((float) (byte) -1);
        jFreeChart4.setTextAntiAlias(false);
        float float15 = jFreeChart4.getBackgroundImageAlpha();
        jFreeChart4.clearSubtitles();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.Title title10 = jFreeChart8.getSubtitle((int) (byte) 0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        jFreeChart15.fireChartChanged();
        boolean boolean17 = jFreeChart15.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle19 = jFreeChart15.getLegend((int) (short) 0);
        jFreeChart8.addLegend(legendTitle19);
        jFreeChart8.setAntiAlias(true);
        jFreeChart8.setAntiAlias(false);
        boolean boolean25 = jFreeChart8.isBorderVisible();
        org.jfree.chart.event.ChartProgressListener chartProgressListener26 = null;
        jFreeChart8.removeProgressListener(chartProgressListener26);
        java.awt.Image image28 = jFreeChart8.getBackgroundImage();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(legendTitle19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(image28);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.lang.Object obj8 = jFreeChart4.clone();
        java.awt.Stroke stroke9 = jFreeChart4.getBorderStroke();
        java.awt.Stroke stroke10 = jFreeChart4.getBorderStroke();
        boolean boolean11 = jFreeChart4.getAntiAlias();
        int int12 = jFreeChart4.getBackgroundImageAlignment();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.CategoryPlot categoryPlot13 = jFreeChart4.getCategoryPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.MultiplePiePlot cannot be cast to org.jfree.chart.plot.CategoryPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener7 = null;
        jFreeChart4.addProgressListener(chartProgressListener7);
        org.jfree.chart.event.ChartProgressListener chartProgressListener9 = null;
        jFreeChart4.removeProgressListener(chartProgressListener9);
        java.awt.Image image11 = jFreeChart4.getBackgroundImage();
        float float12 = jFreeChart4.getBackgroundImageAlpha();
        boolean boolean13 = jFreeChart4.isBorderVisible();
        org.jfree.chart.event.ChartProgressListener chartProgressListener14 = null;
        jFreeChart4.removeProgressListener(chartProgressListener14);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = jFreeChart4.getPadding();
        int int17 = jFreeChart4.getSubtitleCount();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.Title title10 = jFreeChart8.getSubtitle((int) (byte) 0);
        jFreeChart8.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        java.awt.Paint paint14 = multiplePiePlot12.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot12.setInsets(rectangleInsets15, false);
        jFreeChart8.setPadding(rectangleInsets15);
        java.awt.Paint paint19 = jFreeChart8.getBorderPaint();
        org.jfree.chart.title.LegendTitle legendTitle20 = jFreeChart8.getLegend();
        jFreeChart8.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = multiplePiePlot22.getDrawingSupplier();
        java.awt.Paint paint24 = multiplePiePlot22.getBackgroundPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj26 = multiplePiePlot25.clone();
        multiplePiePlot25.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = null;
        multiplePiePlot25.setDrawingSupplier(drawingSupplier29);
        multiplePiePlot25.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart33 = multiplePiePlot25.getPieChart();
        org.jfree.chart.title.Title title35 = jFreeChart33.getSubtitle((int) (byte) 0);
        multiplePiePlot22.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart33);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = null;
        multiplePiePlot22.handleClick((int) '4', 0, plotRenderingInfo39);
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.setTextAntiAlias((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 0 incompatible with Text-specific antialiasing enable key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(legendTitle20);
        org.junit.Assert.assertNotNull(drawingSupplier23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(jFreeChart33);
        org.junit.Assert.assertNotNull(title35);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.lang.Object obj8 = jFreeChart4.clone();
        java.awt.Stroke stroke9 = jFreeChart4.getBorderStroke();
        java.awt.Stroke stroke10 = jFreeChart4.getBorderStroke();
        boolean boolean11 = jFreeChart4.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle12 = jFreeChart4.getLegend();
        org.jfree.chart.title.TextTitle textTitle13 = jFreeChart4.getTitle();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(legendTitle12);
        org.junit.Assert.assertNotNull(textTitle13);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        jFreeChart4.setBackgroundImageAlpha((float) (byte) 0);
        jFreeChart4.clearSubtitles();
        int int10 = jFreeChart4.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        multiplePiePlot0.zoom(0.0d);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj8 = multiplePiePlot7.clone();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot7.getParent();
        java.awt.Image image10 = multiplePiePlot7.getBackgroundImage();
        multiplePiePlot7.setNoDataMessage("");
        java.awt.Paint paint13 = multiplePiePlot7.getNoDataMessagePaint();
        multiplePiePlot0.setAggregatedItemsPaint(paint13);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(plot9);
        org.junit.Assert.assertNull(image10);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage(1, (int) '#', chartRenderingInfo9);
        jFreeChart4.clearSubtitles();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(bufferedImage10);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier5);
        multiplePiePlot1.setForegroundAlpha(0.0f);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot1.zoom((double) (byte) 0);
        java.awt.Paint paint13 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Stroke stroke15 = jFreeChart14.getBorderStroke();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo18 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart14.draw(graphics2D16, rectangle2D17, chartRenderingInfo18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = jFreeChart8.getPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = jFreeChart8.getPadding();
        org.jfree.chart.plot.Plot plot11 = jFreeChart8.getPlot();
        plot11.setForegroundAlpha((float) 0L);
        plot11.setBackgroundImageAlignment((int) (short) 10);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(plot11);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        multiplePiePlot0.setDataset(categoryDataset2);
        java.awt.Font font4 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot0.setNoDataMessageFont(font4);
        multiplePiePlot0.setForegroundAlpha(100.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = multiplePiePlot0.getInsets();
        boolean boolean9 = multiplePiePlot0.isSubplot();
        float float10 = multiplePiePlot0.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        multiplePiePlot0.setDataset(categoryDataset11);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = multiplePiePlot0.getDrawingSupplier();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertNotNull(drawingSupplier13);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.lang.Comparable comparable3 = multiplePiePlot0.getAggregatedItemsKey();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot();
        float float6 = multiplePiePlot5.getBackgroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj8 = multiplePiePlot7.clone();
        multiplePiePlot7.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot7.setDrawingSupplier(drawingSupplier11);
        multiplePiePlot7.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart15 = multiplePiePlot7.getPieChart();
        org.jfree.chart.title.Title title17 = jFreeChart15.getSubtitle((int) (byte) 0);
        multiplePiePlot5.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart15);
        org.jfree.data.category.CategoryDataset categoryDataset19 = multiplePiePlot5.getDataset();
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot5.getPieChart();
        jFreeChart20.clearSubtitles();
        boolean boolean22 = jFreeChart20.isBorderVisible();
        jFreeChart20.setTitle("Other");
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = jFreeChart20.getPadding();
        multiplePiePlot0.setInsets(rectangleInsets25, false);
        java.awt.Paint paint28 = multiplePiePlot0.getAggregatedItemsPaint();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + "Other" + "'", comparable3, "Other");
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(jFreeChart15);
        org.junit.Assert.assertNotNull(title17);
        org.junit.Assert.assertNull(categoryDataset19);
        org.junit.Assert.assertNotNull(jFreeChart20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNull(paint28);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.Title title10 = jFreeChart8.getSubtitle((int) (byte) 0);
        jFreeChart8.removeLegend();
        jFreeChart8.removeLegend();
        java.awt.Image image13 = jFreeChart8.getBackgroundImage();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertNull(image13);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle8 = jFreeChart4.getLegend((int) (short) 0);
        boolean boolean9 = jFreeChart4.isNotify();
        java.util.List list10 = jFreeChart4.getSubtitles();
        jFreeChart4.setNotify(true);
        jFreeChart4.setTitle("hi!");
        jFreeChart4.setTextAntiAlias(false);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(legendTitle8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(list10);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.removeLegend();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        multiplePiePlot0.setLimit((double) 0);
        java.awt.Paint paint7 = multiplePiePlot0.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        java.awt.Font font9 = multiplePiePlot0.getNoDataMessageFont();
        java.awt.Paint paint10 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = multiplePiePlot0.getInsets();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        jFreeChart16.fireChartChanged();
        boolean boolean18 = jFreeChart16.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle20 = jFreeChart16.getLegend((int) (short) 0);
        java.awt.Image image21 = jFreeChart16.getBackgroundImage();
        java.lang.Object obj22 = jFreeChart16.getTextAntiAlias();
        org.jfree.chart.event.ChartProgressListener chartProgressListener23 = null;
        jFreeChart16.addProgressListener(chartProgressListener23);
        jFreeChart16.setBackgroundImageAlpha((float) (byte) 100);
        java.awt.Paint paint27 = jFreeChart16.getBorderPaint();
        multiplePiePlot0.setOutlinePaint(paint27);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(legendTitle20);
        org.junit.Assert.assertNull(image21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Paint paint6 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setBackgroundPaint(paint6);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getRootPlot();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(plot8);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier6);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        float float9 = multiplePiePlot0.getBackgroundImageAlpha();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        multiplePiePlot0.handleClick((int) (short) 1, (-1), plotRenderingInfo12);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        multiplePiePlot0.handleClick((int) (byte) 1, (int) (short) -1, plotRenderingInfo16);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        multiplePiePlot0.setNoDataMessage("hi!");
        org.jfree.data.category.CategoryDataset categoryDataset9 = multiplePiePlot0.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot0.getDataset();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent11);
        java.awt.Image image13 = multiplePiePlot0.getBackgroundImage();
        boolean boolean14 = multiplePiePlot0.isSubplot();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        multiplePiePlot0.setBackgroundAlpha(10.0f);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertNull(categoryDataset9);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle8 = jFreeChart4.getLegend((int) (short) 0);
        boolean boolean9 = jFreeChart4.isNotify();
        jFreeChart4.removeLegend();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(legendTitle8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint4 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setNoDataMessagePaint(paint4);
        java.awt.Font font6 = multiplePiePlot0.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = multiplePiePlot0.getDrawingSupplier();
        java.lang.String str8 = multiplePiePlot0.getNoDataMessage();
        java.awt.Paint paint9 = multiplePiePlot0.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot0.getDataset();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(drawingSupplier7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertNull(categoryDataset10);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        multiplePiePlot0.setDataset(categoryDataset2);
        java.awt.Font font4 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot0.setNoDataMessageFont(font4);
        java.lang.String str6 = multiplePiePlot0.getPlotType();
        boolean boolean7 = multiplePiePlot0.isSubplot();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent8);
        java.awt.Paint paint10 = multiplePiePlot0.getNoDataMessagePaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent11 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent11);
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot0.getParent();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot13.drawBackgroundImage(graphics2D14, rectangle2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(plot13);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart4.setBackgroundPaint(paint7);
        org.jfree.chart.event.ChartProgressListener chartProgressListener9 = null;
        jFreeChart4.addProgressListener(chartProgressListener9);
        jFreeChart4.setNotify(false);
        jFreeChart4.setTextAntiAlias(true);
        float float15 = jFreeChart4.getBackgroundImageAlpha();
        jFreeChart4.setAntiAlias(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.title.Title title19 = jFreeChart4.getSubtitle((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        float float2 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = multiplePiePlot0.getInsets();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj5 = multiplePiePlot4.clone();
        multiplePiePlot4.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = null;
        multiplePiePlot4.setDrawingSupplier(drawingSupplier8);
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent12 = null;
        multiplePiePlot4.axisChanged(axisChangeEvent12);
        boolean boolean14 = multiplePiePlot0.equals((java.lang.Object) multiplePiePlot4);
        java.awt.Font font15 = multiplePiePlot0.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset16 = multiplePiePlot0.getDataset();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.drawOutline(graphics2D17, rectangle2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNull(categoryDataset16);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Font font2 = multiplePiePlot0.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(font2);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getRootPlot();
        plot8.setBackgroundImageAlignment((int) (byte) 100);
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart(plot8);
        org.jfree.chart.title.TextTitle textTitle12 = jFreeChart11.getTitle();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage16 = jFreeChart11.createBufferedImage((int) (byte) 1, (int) '#', chartRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: alpha value out of range");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNull(textTitle12);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.lang.Comparable comparable4 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        java.awt.Paint paint6 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart7 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.junit.Assert.assertNotNull(drawingSupplier2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertEquals("'" + comparable4 + "' != '" + "Other" + "'", comparable4, "Other");
        org.junit.Assert.assertNull(plot5);
        org.junit.Assert.assertNull(paint6);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.title.Title title12 = jFreeChart10.getSubtitle((int) (byte) 0);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.category.CategoryDataset categoryDataset14 = multiplePiePlot0.getDataset();
        org.jfree.chart.JFreeChart jFreeChart15 = multiplePiePlot0.getPieChart();
        jFreeChart15.clearSubtitles();
        boolean boolean17 = jFreeChart15.isBorderVisible();
        jFreeChart15.setTitle("Other");
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent20 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart15.plotChanged(plotChangeEvent20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(title12);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNotNull(jFreeChart15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot0.getRootPlot();
        multiplePiePlot0.setNoDataMessage("");
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent12 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent12);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(plot9);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        boolean boolean11 = jFreeChart4.isNotify();
        jFreeChart4.fireChartChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.title.Title title14 = jFreeChart4.getSubtitle(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener7 = null;
        jFreeChart4.addProgressListener(chartProgressListener7);
        org.jfree.chart.event.ChartProgressListener chartProgressListener9 = null;
        jFreeChart4.removeProgressListener(chartProgressListener9);
        java.awt.Image image11 = jFreeChart4.getBackgroundImage();
        float float12 = jFreeChart4.getBackgroundImageAlpha();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo17 = null;
        java.awt.image.BufferedImage bufferedImage18 = jFreeChart4.createBufferedImage((int) ' ', 100, (double) 10L, 0.0d, chartRenderingInfo17);
        java.awt.Image image19 = jFreeChart4.getBackgroundImage();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo22 = null;
        java.awt.image.BufferedImage bufferedImage23 = jFreeChart4.createBufferedImage((int) '4', (int) (short) 100, chartRenderingInfo22);
        java.lang.Class<?> wildcardClass24 = bufferedImage23.getClass();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(bufferedImage18);
        org.junit.Assert.assertNull(image19);
        org.junit.Assert.assertNotNull(bufferedImage23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier5);
        multiplePiePlot1.setLimit((double) 100L);
        multiplePiePlot1.setBackgroundImageAlignment(15);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        multiplePiePlot1.setDataset(categoryDataset11);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent13 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent13);
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Image image16 = jFreeChart15.getBackgroundImage();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(image16);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot0.zoom((double) (byte) 0);
        boolean boolean12 = multiplePiePlot0.isSubplot();
        java.lang.Object obj13 = null;
        boolean boolean14 = multiplePiePlot0.equals(obj13);
        java.lang.Comparable comparable15 = multiplePiePlot0.getAggregatedItemsKey();
        float float16 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Paint paint17 = multiplePiePlot0.getOutlinePaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + (short) 100 + "'", comparable15, (short) 100);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.awt.Image image8 = jFreeChart4.getBackgroundImage();
        java.awt.Paint paint9 = jFreeChart4.getBorderPaint();
        boolean boolean10 = jFreeChart4.isNotify();
        org.jfree.chart.title.LegendTitle legendTitle12 = jFreeChart4.getLegend((int) (short) 10);
        jFreeChart4.setNotify(true);
        jFreeChart4.setBackgroundImageAlignment(100);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo19 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.handleClick((int) ' ', (-1), chartRenderingInfo19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(legendTitle12);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj10 = multiplePiePlot9.clone();
        multiplePiePlot9.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint13 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot9.setNoDataMessagePaint(paint13);
        java.awt.Font font15 = multiplePiePlot9.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = multiplePiePlot9.getDrawingSupplier();
        java.lang.String str17 = multiplePiePlot9.getNoDataMessage();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot9.getParent();
        org.jfree.data.general.DatasetGroup datasetGroup19 = multiplePiePlot9.getDatasetGroup();
        java.awt.Paint paint20 = multiplePiePlot9.getOutlinePaint();
        jFreeChart8.setBackgroundPaint(paint20);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = jFreeChart8.getPadding();
        org.jfree.chart.title.LegendTitle legendTitle24 = jFreeChart8.getLegend(100);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(drawingSupplier16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(plot18);
        org.junit.Assert.assertNull(datasetGroup19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNull(legendTitle24);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        boolean boolean11 = jFreeChart4.isNotify();
        java.awt.Paint paint12 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart4.setBorderPaint(paint12);
        org.jfree.chart.title.Title title15 = jFreeChart4.getSubtitle((int) (short) 0);
        jFreeChart4.setBackgroundImageAlpha(0.0f);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo20 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.draw(graphics2D18, rectangle2D19, chartRenderingInfo20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(title15);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        boolean boolean8 = multiplePiePlot0.equals((java.lang.Object) 1.0f);
        java.awt.Stroke stroke9 = multiplePiePlot0.getOutlineStroke();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot0.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot0.markerChanged(markerChangeEvent12);
        java.awt.Paint paint14 = multiplePiePlot0.getNoDataMessagePaint();
        java.lang.Class<?> wildcardClass15 = multiplePiePlot0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.Title title10 = jFreeChart8.getSubtitle((int) (byte) 0);
        org.jfree.chart.plot.Plot plot11 = jFreeChart8.getPlot();
        plot11.setBackgroundImageAlignment((int) (short) 100);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        float float16 = multiplePiePlot15.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot15.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart18 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot15);
        jFreeChart18.fireChartChanged();
        boolean boolean20 = jFreeChart18.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle22 = jFreeChart18.getLegend((int) (short) 0);
        plot11.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart18);
        jFreeChart18.setBorderVisible(true);
        boolean boolean26 = jFreeChart18.getAntiAlias();
        jFreeChart18.removeLegend();
        org.jfree.chart.event.ChartProgressListener chartProgressListener28 = null;
        jFreeChart18.addProgressListener(chartProgressListener28);
        org.jfree.chart.event.ChartProgressListener chartProgressListener30 = null;
        jFreeChart18.removeProgressListener(chartProgressListener30);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(legendTitle22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Paint paint2 = multiplePiePlot0.getNoDataMessagePaint();
        multiplePiePlot0.setForegroundAlpha((float) (-1));
        java.lang.String str5 = multiplePiePlot0.getNoDataMessage();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent6);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        java.awt.Font font1 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot2);
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("", font1, (org.jfree.chart.plot.Plot) multiplePiePlot2, false);
        java.lang.Comparable comparable14 = multiplePiePlot2.getAggregatedItemsKey();
        java.awt.Font font15 = multiplePiePlot2.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + "Other" + "'", comparable14, "Other");
        org.junit.Assert.assertNotNull(font15);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        multiplePiePlot0.setBackgroundImageAlignment(15);
        org.jfree.chart.JFreeChart jFreeChart10 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.title.LegendTitle legendTitle12 = jFreeChart10.getLegend((int) (short) 100);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(legendTitle12);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        multiplePiePlot2.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        int int12 = multiplePiePlot2.getBackgroundImageAlignment();
        java.awt.Paint paint13 = multiplePiePlot2.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart14 = multiplePiePlot2.getPieChart();
        multiplePiePlot2.setBackgroundAlpha((float) (short) 10);
        boolean boolean17 = multiplePiePlot0.equals((java.lang.Object) multiplePiePlot2);
        java.awt.Image image18 = multiplePiePlot0.getBackgroundImage();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(jFreeChart14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(image18);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot0.zoom((double) (byte) 0);
        boolean boolean12 = multiplePiePlot0.isSubplot();
        multiplePiePlot0.zoom((double) 100.0f);
        boolean boolean15 = multiplePiePlot0.isOutlineVisible();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        float float17 = multiplePiePlot16.getBackgroundAlpha();
        java.awt.Paint paint18 = multiplePiePlot16.getNoDataMessagePaint();
        multiplePiePlot16.setForegroundAlpha((float) (-1L));
        java.awt.Paint paint21 = multiplePiePlot16.getOutlinePaint();
        java.awt.Font font22 = multiplePiePlot16.getNoDataMessageFont();
        multiplePiePlot0.setNoDataMessageFont(font22);
        java.awt.Paint paint24 = multiplePiePlot0.getBackgroundPaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Font font3 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot4.getDrawingSupplier();
        java.awt.Paint paint6 = multiplePiePlot4.getBackgroundPaint();
        java.awt.Paint paint7 = multiplePiePlot4.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        multiplePiePlot4.setDataset(categoryDataset8);
        multiplePiePlot4.setForegroundAlpha((float) 1L);
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("hi!", font3, (org.jfree.chart.plot.Plot) multiplePiePlot4, false);
        java.lang.Object obj14 = null;
        boolean boolean15 = multiplePiePlot4.equals(obj14);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(font3);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.Title title10 = jFreeChart8.getSubtitle((int) (byte) 0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        jFreeChart15.fireChartChanged();
        boolean boolean17 = jFreeChart15.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle19 = jFreeChart15.getLegend((int) (short) 0);
        jFreeChart8.addLegend(legendTitle19);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = jFreeChart8.getPadding();
        jFreeChart8.setAntiAlias(true);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(legendTitle19);
        org.junit.Assert.assertNotNull(rectangleInsets21);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        boolean boolean11 = jFreeChart4.getAntiAlias();
        float float12 = jFreeChart4.getBackgroundImageAlpha();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo17 = null;
        java.awt.image.BufferedImage bufferedImage18 = jFreeChart4.createBufferedImage(15, 10, (double) (byte) 100, (double) 0.5f, chartRenderingInfo17);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = jFreeChart4.getPadding();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(bufferedImage18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        org.jfree.chart.event.ChartProgressListener chartProgressListener8 = null;
        jFreeChart4.addProgressListener(chartProgressListener8);
        jFreeChart4.setAntiAlias(true);
        jFreeChart4.setBackgroundImageAlignment(100);
        org.jfree.chart.plot.Plot plot14 = jFreeChart4.getPlot();
        float float15 = plot14.getBackgroundAlpha();
        java.awt.Paint paint16 = plot14.getNoDataMessagePaint();
        plot14.setBackgroundImageAlignment((int) (byte) 10);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot14.drawBackground(graphics2D19, rectangle2D20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.lang.Object obj8 = jFreeChart4.clone();
        org.jfree.chart.event.ChartProgressListener chartProgressListener9 = null;
        jFreeChart4.addProgressListener(chartProgressListener9);
        jFreeChart4.setBackgroundImageAlpha((float) (byte) -1);
        jFreeChart4.setTextAntiAlias(false);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.plotChanged(plotChangeEvent15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setForegroundAlpha((float) (-1L));
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj9 = multiplePiePlot8.clone();
        multiplePiePlot8.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier12);
        multiplePiePlot8.zoom(0.0d);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        multiplePiePlot8.drawBackgroundImage(graphics2D16, rectangle2D17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        multiplePiePlot8.setDataset(categoryDataset19);
        java.lang.String str21 = multiplePiePlot8.getPlotType();
        org.jfree.chart.JFreeChart jFreeChart23 = new org.jfree.chart.JFreeChart("Other", font7, (org.jfree.chart.plot.Plot) multiplePiePlot8, true);
        java.awt.Paint paint24 = jFreeChart23.getBackgroundPaint();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.CategoryPlot categoryPlot25 = jFreeChart23.getCategoryPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.MultiplePiePlot cannot be cast to org.jfree.chart.plot.CategoryPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Multiple Pie Plot" + "'", str21, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier5);
        multiplePiePlot1.setForegroundAlpha(0.0f);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot1.zoom((double) (byte) 0);
        boolean boolean13 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.zoom((double) 100.0f);
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("Other", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.data.general.DatasetGroup datasetGroup17 = multiplePiePlot1.getDatasetGroup();
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot1.getPieChart();
        java.lang.String str19 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertNotNull(jFreeChart18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Multiple Pie Plot" + "'", str19, "Multiple Pie Plot");
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart4.setBackgroundPaint(paint7);
        org.jfree.chart.event.ChartProgressListener chartProgressListener9 = null;
        jFreeChart4.addProgressListener(chartProgressListener9);
        jFreeChart4.setNotify(false);
        jFreeChart4.setTextAntiAlias(true);
        float float15 = jFreeChart4.getBackgroundImageAlpha();
        jFreeChart4.setAntiAlias(false);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        java.awt.geom.Point2D point2D20 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo21 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.draw(graphics2D18, rectangle2D19, point2D20, chartRenderingInfo21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        java.awt.Font font1 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot2);
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("", font1, (org.jfree.chart.plot.Plot) multiplePiePlot2, false);
        java.awt.Paint paint14 = jFreeChart13.getBorderPaint();
        org.jfree.chart.event.ChartProgressListener chartProgressListener15 = null;
        jFreeChart13.removeProgressListener(chartProgressListener15);
        java.util.List list17 = jFreeChart13.getSubtitles();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage23 = jFreeChart13.createBufferedImage(10, 1, (double) 10.0f, 0.0d, chartRenderingInfo22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: alpha value out of range");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        multiplePiePlot1.setForegroundAlpha((float) (byte) 0);
        org.jfree.chart.JFreeChart jFreeChart7 = multiplePiePlot1.getPieChart();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        float float9 = multiplePiePlot8.getBackgroundAlpha();
        float float10 = multiplePiePlot8.getBackgroundAlpha();
        multiplePiePlot8.setOutlineVisible(false);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        multiplePiePlot8.drawBackgroundImage(graphics2D13, rectangle2D14);
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot8);
        org.jfree.chart.title.LegendTitle legendTitle18 = jFreeChart16.getLegend(0);
        jFreeChart7.addLegend(legendTitle18);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(legendTitle18);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        boolean boolean8 = multiplePiePlot0.equals((java.lang.Object) 1.0f);
        java.awt.Stroke stroke9 = multiplePiePlot0.getOutlineStroke();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot0.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        jFreeChart11.setTitle("");
        org.jfree.chart.event.ChartProgressListener chartProgressListener14 = null;
        jFreeChart11.removeProgressListener(chartProgressListener14);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(plot10);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D11, rectangle2D12);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = multiplePiePlot0.getInsets();
        float float15 = multiplePiePlot0.getBackgroundImageAlpha();
        multiplePiePlot0.setBackgroundImageAlignment((int) ' ');
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D18, rectangle2D19);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        boolean boolean8 = multiplePiePlot0.equals((java.lang.Object) 1.0f);
        java.awt.Stroke stroke9 = multiplePiePlot0.getOutlineStroke();
        java.awt.Paint paint10 = multiplePiePlot0.getBackgroundPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) 10.0f);
        java.awt.Paint paint16 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot12.setNoDataMessagePaint(paint16);
        org.jfree.chart.JFreeChart jFreeChart18 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        java.awt.Paint paint19 = multiplePiePlot12.getBackgroundPaint();
        multiplePiePlot0.setOutlinePaint(paint19);
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot0.getPieChart();
        boolean boolean22 = jFreeChart21.isBorderVisible();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(jFreeChart21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        jFreeChart4.setTitle("hi!");
        org.jfree.chart.title.TextTitle textTitle9 = jFreeChart4.getTitle();
        jFreeChart4.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.CategoryPlot categoryPlot12 = jFreeChart4.getCategoryPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.MultiplePiePlot cannot be cast to org.jfree.chart.plot.CategoryPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(textTitle9);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        org.jfree.chart.title.LegendTitle legendTitle11 = jFreeChart4.getLegend();
        java.awt.RenderingHints renderingHints12 = jFreeChart4.getRenderingHints();
        jFreeChart4.setTextAntiAlias(false);
        jFreeChart4.setTextAntiAlias(true);
        boolean boolean17 = jFreeChart4.getAntiAlias();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertNotNull(legendTitle11);
        org.junit.Assert.assertNotNull(renderingHints12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        multiplePiePlot0.setDataset(categoryDataset2);
        java.awt.Font font4 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot0.setNoDataMessageFont(font4);
        java.lang.String str6 = multiplePiePlot0.getPlotType();
        boolean boolean7 = multiplePiePlot0.isSubplot();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent8);
        java.awt.Paint paint10 = multiplePiePlot0.getNoDataMessagePaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent11 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent11);
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot0.getParent();
        java.awt.Paint paint14 = multiplePiePlot0.getAggregatedItemsPaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(plot13);
        org.junit.Assert.assertNull(paint14);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.lang.Comparable comparable3 = multiplePiePlot0.getAggregatedItemsKey();
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot0.getParent();
        org.jfree.chart.JFreeChart jFreeChart5 = multiplePiePlot0.getPieChart();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo8 = null;
        java.awt.image.BufferedImage bufferedImage9 = jFreeChart5.createBufferedImage((int) (byte) 10, (int) (byte) 100, chartRenderingInfo8);
        boolean boolean10 = jFreeChart5.isBorderVisible();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage16 = jFreeChart5.createBufferedImage((int) (byte) 100, (-1), (double) 0.5f, (double) 0, chartRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (100) and height (-1) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + "Other" + "'", comparable3, "Other");
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertNotNull(bufferedImage9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setForegroundAlpha((float) (-1L));
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj9 = multiplePiePlot8.clone();
        multiplePiePlot8.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier12);
        multiplePiePlot8.zoom(0.0d);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        multiplePiePlot8.drawBackgroundImage(graphics2D16, rectangle2D17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        multiplePiePlot8.setDataset(categoryDataset19);
        java.lang.String str21 = multiplePiePlot8.getPlotType();
        org.jfree.chart.JFreeChart jFreeChart23 = new org.jfree.chart.JFreeChart("Other", font7, (org.jfree.chart.plot.Plot) multiplePiePlot8, true);
        java.awt.Paint paint24 = jFreeChart23.getBackgroundPaint();
        boolean boolean25 = jFreeChart23.isNotify();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage30 = jFreeChart23.createBufferedImage((int) '4', (int) (byte) -1, (int) 'a', chartRenderingInfo29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown image type 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Multiple Pie Plot" + "'", str21, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        int int10 = multiplePiePlot0.getBackgroundImageAlignment();
        java.awt.Paint paint11 = multiplePiePlot0.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot0.getPieChart();
        boolean boolean13 = jFreeChart12.isNotify();
        boolean boolean14 = jFreeChart12.isNotify();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart12.setPadding(rectangleInsets15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'padding' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot0.zoom((double) (byte) 0);
        boolean boolean12 = multiplePiePlot0.isSubplot();
        java.awt.Font font13 = multiplePiePlot0.getNoDataMessageFont();
        multiplePiePlot0.setBackgroundAlpha((-1.0f));
        java.awt.Paint paint16 = multiplePiePlot0.getOutlinePaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        float float10 = jFreeChart9.getBackgroundImageAlpha();
        org.jfree.chart.title.Title title12 = jFreeChart9.getSubtitle((int) (short) 0);
        java.awt.Paint paint13 = jFreeChart9.getBorderPaint();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo16 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart9.draw(graphics2D14, rectangle2D15, chartRenderingInfo16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertNotNull(title12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = jFreeChart8.getPadding();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        float float12 = multiplePiePlot11.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot11.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot11);
        jFreeChart14.fireChartChanged();
        java.lang.Object obj16 = jFreeChart14.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo19 = null;
        java.awt.image.BufferedImage bufferedImage20 = jFreeChart14.createBufferedImage((int) '#', 1, chartRenderingInfo19);
        boolean boolean21 = jFreeChart14.isNotify();
        java.awt.Paint paint22 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart14.setBorderPaint(paint22);
        jFreeChart8.setBorderPaint(paint22);
        jFreeChart8.setBorderVisible(true);
        int int27 = jFreeChart8.getSubtitleCount();
        jFreeChart8.removeLegend();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(bufferedImage20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.awt.Paint paint3 = multiplePiePlot0.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        multiplePiePlot0.setDataset(categoryDataset4);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.setBackgroundImageAlpha(100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent8);
        java.awt.Image image10 = multiplePiePlot0.getBackgroundImage();
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot0.getRootPlot();
        // The following exception was thrown during execution in test generation
        try {
            plot11.setBackgroundImageAlpha((float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(image10);
        org.junit.Assert.assertNotNull(plot11);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle8 = jFreeChart4.getLegend((int) (short) 0);
        boolean boolean9 = jFreeChart4.isNotify();
        java.util.List list10 = jFreeChart4.getSubtitles();
        java.util.List list11 = jFreeChart4.getSubtitles();
        org.jfree.chart.event.ChartChangeListener chartChangeListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.addChangeListener(chartChangeListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(legendTitle8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.lang.String str3 = multiplePiePlot0.getNoDataMessage();
        boolean boolean5 = multiplePiePlot0.equals((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        double double9 = multiplePiePlot0.getLimit();
        org.jfree.chart.JFreeChart jFreeChart10 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        java.awt.Paint paint11 = multiplePiePlot0.getNoDataMessagePaint();
        java.awt.Font font12 = multiplePiePlot0.getNoDataMessageFont();
        multiplePiePlot0.setForegroundAlpha(100.0f);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font12);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        boolean boolean8 = multiplePiePlot0.equals((java.lang.Object) 1.0f);
        java.awt.Stroke stroke9 = multiplePiePlot0.getOutlineStroke();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot0.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot0.markerChanged(markerChangeEvent12);
        double double14 = multiplePiePlot0.getLimit();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        int int10 = multiplePiePlot0.getBackgroundImageAlignment();
        java.awt.Paint paint11 = multiplePiePlot0.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot0.getPieChart();
        multiplePiePlot0.setBackgroundAlpha((float) (short) 10);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot0.getRootPlot();
        java.awt.Paint paint16 = multiplePiePlot0.getBackgroundPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection17 = multiplePiePlot0.getLegendItems();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(legendItemCollection17);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.Title title10 = jFreeChart8.getSubtitle((int) (byte) 0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        jFreeChart15.fireChartChanged();
        boolean boolean17 = jFreeChart15.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle19 = jFreeChart15.getLegend((int) (short) 0);
        jFreeChart8.addLegend(legendTitle19);
        jFreeChart8.setAntiAlias(true);
        jFreeChart8.fireChartChanged();
        java.awt.RenderingHints renderingHints24 = jFreeChart8.getRenderingHints();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(legendTitle19);
        org.junit.Assert.assertNotNull(renderingHints24);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        java.awt.Font font1 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot2.setDrawingSupplier(drawingSupplier6);
        multiplePiePlot2.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot2.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot2);
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("", font1, (org.jfree.chart.plot.Plot) multiplePiePlot2, false);
        java.awt.Paint paint14 = jFreeChart13.getBorderPaint();
        org.jfree.chart.event.ChartProgressListener chartProgressListener15 = null;
        jFreeChart13.removeProgressListener(chartProgressListener15);
        int int17 = jFreeChart13.getSubtitleCount();
        org.jfree.chart.event.ChartProgressListener chartProgressListener18 = null;
        jFreeChart13.addProgressListener(chartProgressListener18);
        float float20 = jFreeChart13.getBackgroundImageAlpha();
        java.awt.RenderingHints renderingHints21 = jFreeChart13.getRenderingHints();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage25 = jFreeChart13.createBufferedImage((-1), (int) '#', chartRenderingInfo24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (-1) and height (35) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.5f + "'", float20 == 0.5f);
        org.junit.Assert.assertNotNull(renderingHints21);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.JFreeChart jFreeChart2 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        java.awt.Paint paint3 = multiplePiePlot0.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot0.getParent();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot0.getDrawingSupplier();
        java.lang.String str6 = multiplePiePlot0.getNoDataMessage();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        multiplePiePlot0.setDataset(categoryDataset2);
        java.awt.Font font4 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot0.setNoDataMessageFont(font4);
        float float6 = multiplePiePlot0.getBackgroundImageAlpha();
        multiplePiePlot0.setBackgroundImageAlpha((float) (short) 0);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent9);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener7 = null;
        jFreeChart4.addProgressListener(chartProgressListener7);
        org.jfree.chart.event.ChartProgressListener chartProgressListener9 = null;
        jFreeChart4.removeProgressListener(chartProgressListener9);
        java.awt.Image image11 = jFreeChart4.getBackgroundImage();
        float float12 = jFreeChart4.getBackgroundImageAlpha();
        jFreeChart4.setBackgroundImageAlignment((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.lang.Object obj8 = jFreeChart4.clone();
        java.awt.Stroke stroke9 = jFreeChart4.getBorderStroke();
        boolean boolean10 = jFreeChart4.isBorderVisible();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage14 = jFreeChart4.createBufferedImage(0, (int) 'a', chartRenderingInfo13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (0) and height (97) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.lang.Object obj8 = jFreeChart4.clone();
        java.awt.Paint paint9 = jFreeChart4.getBackgroundPaint();
        org.jfree.chart.event.ChartChangeListener chartChangeListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.addChangeListener(chartChangeListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setForegroundAlpha((float) (-1L));
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj9 = multiplePiePlot8.clone();
        multiplePiePlot8.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier12);
        multiplePiePlot8.zoom(0.0d);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        multiplePiePlot8.drawBackgroundImage(graphics2D16, rectangle2D17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        multiplePiePlot8.setDataset(categoryDataset19);
        java.lang.String str21 = multiplePiePlot8.getPlotType();
        org.jfree.chart.JFreeChart jFreeChart23 = new org.jfree.chart.JFreeChart("Other", font7, (org.jfree.chart.plot.Plot) multiplePiePlot8, true);
        multiplePiePlot8.setLimit((double) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Multiple Pie Plot" + "'", str21, "Multiple Pie Plot");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        multiplePiePlot0.setDataset(categoryDataset2);
        java.awt.Font font4 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot0.setNoDataMessageFont(font4);
        java.lang.String str6 = multiplePiePlot0.getPlotType();
        boolean boolean7 = multiplePiePlot0.isSubplot();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent8);
        java.awt.Paint paint10 = multiplePiePlot0.getNoDataMessagePaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent11 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        multiplePiePlot0.setDataset(categoryDataset13);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier6);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        jFreeChart8.setNotify(false);
        int int11 = jFreeChart8.getBackgroundImageAlignment();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        jFreeChart16.fireChartChanged();
        java.awt.Image image18 = jFreeChart16.getBackgroundImage();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo23 = null;
        java.awt.image.BufferedImage bufferedImage24 = jFreeChart16.createBufferedImage((int) 'a', (int) ' ', (double) (byte) 10, (double) 10, chartRenderingInfo23);
        jFreeChart8.setBackgroundImage((java.awt.Image) bufferedImage24);
        jFreeChart8.setBackgroundImageAlpha((float) (byte) 0);
        jFreeChart8.clearSubtitles();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNull(image18);
        org.junit.Assert.assertNotNull(bufferedImage24);
    }
}

