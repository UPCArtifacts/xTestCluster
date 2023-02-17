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
        jFreeChart13.removeLegend();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.lang.String str6 = multiplePiePlot0.getNoDataMessage();
        boolean boolean7 = multiplePiePlot0.isOutlineVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        multiplePiePlot0.handleClick(100, 0, plotRenderingInfo10);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
        boolean boolean17 = multiplePiePlot0.isOutlineVisible();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertNull(categoryDataset9);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        java.awt.Image image7 = jFreeChart4.getBackgroundImage();
        jFreeChart4.setBackgroundImageAlignment((int) '#');
        jFreeChart4.setBackgroundImageAlpha((float) ' ');
        jFreeChart4.removeLegend();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        java.awt.geom.Point2D point2D15 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo16 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.draw(graphics2D13, rectangle2D14, point2D15, chartRenderingInfo16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNull(image7);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getRootPlot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent3);
        org.jfree.chart.util.TableOrder tableOrder5 = multiplePiePlot0.getDataExtractOrder();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(plot2);
        org.junit.Assert.assertNotNull(tableOrder5);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        java.lang.String str8 = multiplePiePlot0.getNoDataMessage();
        multiplePiePlot0.setForegroundAlpha(10.0f);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot0.getDrawingSupplier();
        multiplePiePlot0.setNoDataMessage("");
        multiplePiePlot0.setOutlineVisible(true);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(drawingSupplier11);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        multiplePiePlot0.setDataset(categoryDataset2);
        java.awt.Font font4 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot0.setNoDataMessageFont(font4);
        java.lang.String str6 = multiplePiePlot0.getPlotType();
        multiplePiePlot0.zoom((-1.0d));
        java.lang.Comparable comparable9 = multiplePiePlot0.getAggregatedItemsKey();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        double double9 = multiplePiePlot0.getLimit();
        org.jfree.chart.JFreeChart jFreeChart10 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.event.ChartProgressListener chartProgressListener11 = null;
        jFreeChart10.removeProgressListener(chartProgressListener11);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = jFreeChart10.getPadding();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets13);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getParent();
        java.lang.Comparable comparable3 = multiplePiePlot0.getAggregatedItemsKey();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent4 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent4);
        java.awt.Paint paint6 = multiplePiePlot0.getBackgroundPaint();
        org.jfree.data.general.DatasetGroup datasetGroup7 = multiplePiePlot0.getDatasetGroup();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + "Other" + "'", comparable3, "Other");
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(datasetGroup7);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        org.jfree.chart.event.ChartProgressListener chartProgressListener20 = null;
        jFreeChart8.addProgressListener(chartProgressListener20);
        jFreeChart8.setBackgroundImageAlpha(0.5f);
        org.jfree.chart.title.LegendTitle legendTitle25 = jFreeChart8.getLegend((int) (short) 1);
        org.jfree.chart.plot.Plot plot26 = jFreeChart8.getPlot();
        java.awt.Paint paint27 = plot26.getOutlinePaint();
        plot26.setForegroundAlpha((float) '4');
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(legendTitle18);
        org.junit.Assert.assertNull(legendTitle25);
        org.junit.Assert.assertNotNull(plot26);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        multiplePiePlot0.setLimit((double) 0);
        boolean boolean7 = multiplePiePlot0.isSubplot();
        java.lang.String str8 = multiplePiePlot0.getNoDataMessage();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
        jFreeChart4.setBackgroundImageAlpha((float) 15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(bufferedImage18);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        java.awt.Stroke stroke8 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        jFreeChart4.setBorderStroke(stroke8);
        boolean boolean10 = jFreeChart4.getAntiAlias();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder1 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder3 = multiplePiePlot2.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot0.getInsets();
        java.awt.Paint paint8 = multiplePiePlot0.getBackgroundPaint();
        java.awt.Stroke stroke9 = multiplePiePlot0.getOutlineStroke();
        org.junit.Assert.assertNotNull(tableOrder1);
        org.junit.Assert.assertNotNull(tableOrder3);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertNotNull(legendItemCollection6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        boolean boolean8 = multiplePiePlot0.equals((java.lang.Object) 1.0f);
        java.awt.Stroke stroke9 = multiplePiePlot0.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot0.getDataset();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(categoryDataset10);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
        java.util.List list28 = jFreeChart18.getSubtitles();
        org.jfree.chart.event.TitleChangeEvent titleChangeEvent29 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart18.titleChanged(titleChangeEvent29);
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
        org.junit.Assert.assertNotNull(list28);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.lang.String str6 = multiplePiePlot0.getNoDataMessage();
        int int7 = multiplePiePlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
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
        java.awt.Paint paint16 = jFreeChart11.getBackgroundPaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(legendTitle15);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
        org.jfree.chart.event.ChartProgressListener chartProgressListener13 = null;
        jFreeChart8.addProgressListener(chartProgressListener13);
        org.jfree.chart.title.LegendTitle legendTitle15 = jFreeChart8.getLegend();
        org.jfree.chart.event.ChartChangeListener chartChangeListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.removeChangeListener(chartChangeListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertNotNull(legendTitle12);
        org.junit.Assert.assertNotNull(legendTitle15);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot8.getDataset();
        java.awt.Image image13 = null;
        multiplePiePlot8.setBackgroundImage(image13);
        java.awt.Paint paint15 = multiplePiePlot8.getNoDataMessagePaint();
        multiplePiePlot0.setAggregatedItemsPaint(paint15);
        boolean boolean17 = multiplePiePlot0.isOutlineVisible();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent18 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent18);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(plot2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Multiple Pie Plot" + "'", str7, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        double double9 = multiplePiePlot0.getLimit();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        multiplePiePlot0.handleClick((int) (byte) 10, 0, plotRenderingInfo12);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Paint paint2 = multiplePiePlot0.getNoDataMessagePaint();
        java.awt.Font font3 = multiplePiePlot0.getNoDataMessageFont();
        multiplePiePlot0.setBackgroundAlpha((float) 10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(font3);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
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
        jFreeChart8.setBorderVisible(false);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
        int int14 = jFreeChart4.getBackgroundImageAlignment();
        org.jfree.chart.title.TextTitle textTitle15 = jFreeChart4.getTitle();
        java.util.List list16 = jFreeChart4.getSubtitles();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertNotNull(textTitle15);
        org.junit.Assert.assertNotNull(list16);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent2);
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        float float10 = multiplePiePlot9.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot9.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart12 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot9);
        java.awt.Paint paint13 = jFreeChart12.getBackgroundPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint13);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
        int int13 = jFreeChart9.getSubtitleCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        java.awt.Paint paint8 = multiplePiePlot0.getBackgroundPaint();
        float float9 = multiplePiePlot0.getForegroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot0.getPieChart();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage13 = jFreeChart10.createBufferedImage((int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (35) and height (-1) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(jFreeChart10);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent28 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent28);
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot0.getParent();
        multiplePiePlot0.setNoDataMessage("Other");
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(jFreeChart18);
        org.junit.Assert.assertNotNull(title20);
        org.junit.Assert.assertNotNull(legendTitle22);
        org.junit.Assert.assertNull(plot30);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) "");
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.drawOutline(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(drawingSupplier10);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        multiplePiePlot0.setBackgroundImageAlignment(15);
        java.lang.Comparable comparable10 = multiplePiePlot0.getAggregatedItemsKey();
        multiplePiePlot0.setBackgroundAlpha((float) 1);
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot0.getDataset();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
        org.junit.Assert.assertNull(categoryDataset13);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        java.awt.Paint paint8 = jFreeChart4.getBorderPaint();
        java.awt.Image image9 = jFreeChart4.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(image9);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        multiplePiePlot0.setNoDataMessage("hi!");
        org.jfree.data.category.CategoryDataset categoryDataset9 = multiplePiePlot0.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot0.getDataset();
        int int11 = multiplePiePlot0.getBackgroundImageAlignment();
        multiplePiePlot0.setLimit(10.0d);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertNull(categoryDataset9);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
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
        java.awt.Paint paint16 = null;
        jFreeChart13.setBackgroundPaint(paint16);
        jFreeChart13.clearSubtitles();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
        org.jfree.chart.event.ChartProgressListener chartProgressListener20 = null;
        jFreeChart8.addProgressListener(chartProgressListener20);
        jFreeChart8.setBackgroundImageAlpha(0.5f);
        org.jfree.chart.title.LegendTitle legendTitle25 = jFreeChart8.getLegend((int) (short) 1);
        org.jfree.chart.plot.Plot plot26 = jFreeChart8.getPlot();
        java.awt.Paint paint27 = plot26.getOutlinePaint();
        float float28 = plot26.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(legendTitle18);
        org.junit.Assert.assertNull(legendTitle25);
        org.junit.Assert.assertNotNull(plot26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.0f + "'", float28 == 1.0f);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.CategoryPlot categoryPlot12 = jFreeChart4.getCategoryPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.MultiplePiePlot cannot be cast to org.jfree.chart.plot.CategoryPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        org.jfree.chart.event.TitleChangeEvent titleChangeEvent19 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart13.titleChanged(titleChangeEvent19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        boolean boolean16 = jFreeChart4.getAntiAlias();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(title15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
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
        org.jfree.chart.event.ChartProgressListener chartProgressListener20 = null;
        jFreeChart8.addProgressListener(chartProgressListener20);
        jFreeChart8.setBackgroundImageAlpha(0.5f);
        org.jfree.chart.title.LegendTitle legendTitle25 = jFreeChart8.getLegend((int) (short) 1);
        org.jfree.chart.plot.Plot plot26 = jFreeChart8.getPlot();
        jFreeChart8.setTextAntiAlias(false);
        jFreeChart8.setBorderVisible(false);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(legendTitle18);
        org.junit.Assert.assertNull(legendTitle25);
        org.junit.Assert.assertNotNull(plot26);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        boolean boolean5 = multiplePiePlot0.isSubplot();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.drawOutline(graphics2D6, rectangle2D7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        boolean boolean11 = jFreeChart4.isNotify();
        boolean boolean12 = jFreeChart4.isBorderVisible();
        jFreeChart4.setBackgroundImageAlignment(10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle8 = jFreeChart4.getLegend((int) (short) 0);
        boolean boolean9 = jFreeChart4.isNotify();
        jFreeChart4.setBackgroundImageAlpha(0.0f);
        boolean boolean12 = jFreeChart4.isNotify();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(legendTitle8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.awt.Paint paint3 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent4);
        java.lang.Object obj6 = multiplePiePlot0.clone();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        multiplePiePlot0.handleClick(10, 1, plotRenderingInfo9);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent11 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent11);
        double double13 = multiplePiePlot0.getLimit();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent2);
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        float float5 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D6, rectangle2D7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        java.awt.Image image9 = null;
        multiplePiePlot0.setBackgroundImage(image9);
        multiplePiePlot0.zoom((double) ' ');
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart7 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener8);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
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
        jFreeChart9.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj22 = multiplePiePlot21.clone();
        multiplePiePlot21.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint25 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot21.setNoDataMessagePaint(paint25);
        float float27 = multiplePiePlot21.getBackgroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart28 = new org.jfree.chart.JFreeChart("", (org.jfree.chart.plot.Plot) multiplePiePlot21);
        org.jfree.data.category.CategoryDataset categoryDataset29 = multiplePiePlot21.getDataset();
        multiplePiePlot21.setNoDataMessage("Other");
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart9.setTextAntiAlias((java.lang.Object) multiplePiePlot21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: org.jfree.chart.plot.MultiplePiePlot@3dd8ca88 incompatible with Text-specific antialiasing enable key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-1.0f) + "'", float27 == (-1.0f));
        org.junit.Assert.assertNull(categoryDataset29);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
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
        org.jfree.chart.event.ChartProgressListener chartProgressListener13 = null;
        jFreeChart4.addProgressListener(chartProgressListener13);
        java.awt.Paint paint15 = jFreeChart4.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(legendTitle12);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
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
        float float12 = multiplePiePlot0.getBackgroundImageAlpha();
        int int13 = multiplePiePlot0.getBackgroundImageAlignment();
        java.awt.Stroke stroke14 = multiplePiePlot0.getOutlineStroke();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot0.zoom((double) (byte) 0);
        boolean boolean12 = multiplePiePlot0.isSubplot();
        java.awt.Stroke stroke13 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot0.setOutlineStroke(stroke13);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 1L);
        int int17 = multiplePiePlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.awt.Image image6 = jFreeChart4.getBackgroundImage();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo11 = null;
        java.awt.image.BufferedImage bufferedImage12 = jFreeChart4.createBufferedImage((int) 'a', (int) ' ', (double) (byte) 10, (double) 10, chartRenderingInfo11);
        org.jfree.chart.event.ChartChangeListener chartChangeListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.removeChangeListener(chartChangeListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertNotNull(bufferedImage12);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        java.awt.Stroke stroke10 = jFreeChart9.getBorderStroke();
        boolean boolean11 = jFreeChart9.getAntiAlias();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
        boolean boolean16 = jFreeChart4.getAntiAlias();
        jFreeChart4.removeLegend();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(title15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        boolean boolean6 = multiplePiePlot0.isOutlineVisible();
        org.jfree.chart.JFreeChart jFreeChart7 = multiplePiePlot0.getPieChart();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
        jFreeChart4.setBorderVisible(false);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(bufferedImage18);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
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
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot0.getRootPlot();
        // The following exception was thrown during execution in test generation
        try {
            plot19.setBackgroundImageAlpha((float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
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
        org.junit.Assert.assertNotNull(plot19);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        multiplePiePlot1.setForegroundAlpha((float) (byte) 0);
        java.awt.Paint paint7 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        multiplePiePlot1.handleClick((-1), 15, plotRenderingInfo10);
        float float12 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        multiplePiePlot14.notifyListeners(plotChangeEvent15);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        float float19 = multiplePiePlot18.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot18.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot18);
        java.awt.Paint paint22 = jFreeChart21.getBackgroundPaint();
        java.awt.Stroke stroke23 = jFreeChart21.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle24 = jFreeChart21.getTitle();
        java.awt.Image image25 = jFreeChart21.getBackgroundImage();
        java.awt.Paint paint26 = jFreeChart21.getBorderPaint();
        multiplePiePlot14.setAggregatedItemsPaint(paint26);
        org.jfree.chart.plot.Plot plot28 = multiplePiePlot14.getParent();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot14);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(textTitle24);
        org.junit.Assert.assertNull(image25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNull(plot28);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
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
        boolean boolean13 = jFreeChart4.isBorderVisible();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertNotNull(textTitle12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot0.getDatasetGroup();
        java.lang.String str9 = multiplePiePlot0.getNoDataMessage();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D10, rectangle2D11);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent13 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent13);
        org.jfree.chart.util.TableOrder tableOrder15 = multiplePiePlot0.getDataExtractOrder();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(tableOrder15);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
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
        multiplePiePlot0.zoom((double) 0);
        multiplePiePlot0.zoom((double) 15);
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
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
        java.util.List list17 = jFreeChart9.getSubtitles();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(list17);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
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
        multiplePiePlot0.setLimit((double) (-1L));
        java.awt.Paint paint17 = multiplePiePlot0.getAggregatedItemsPaint();
        org.jfree.chart.util.TableOrder tableOrder18 = multiplePiePlot0.getDataExtractOrder();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(title12);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertNotNull(tableOrder18);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        float float12 = multiplePiePlot0.getBackgroundImageAlpha();
        int int13 = multiplePiePlot0.getBackgroundImageAlignment();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot0.markerChanged(markerChangeEvent14);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Font font2 = multiplePiePlot0.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj4 = multiplePiePlot3.clone();
        multiplePiePlot3.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        multiplePiePlot3.setDrawingSupplier(drawingSupplier7);
        multiplePiePlot3.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart11 = multiplePiePlot3.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot3.getDataset();
        java.awt.Paint paint13 = multiplePiePlot3.getOutlinePaint();
        multiplePiePlot0.setAggregatedItemsPaint(paint13);
        java.lang.String str15 = multiplePiePlot0.getPlotType();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot0.getRootPlot();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(font2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Multiple Pie Plot" + "'", str15, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(plot16);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        org.jfree.chart.event.ChartProgressListener chartProgressListener13 = null;
        jFreeChart8.removeProgressListener(chartProgressListener13);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj16 = multiplePiePlot15.clone();
        multiplePiePlot15.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = null;
        multiplePiePlot15.setDrawingSupplier(drawingSupplier19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = null;
        multiplePiePlot15.setDrawingSupplier(drawingSupplier21);
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot15.getPieChart();
        multiplePiePlot15.setNoDataMessage("Other");
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = multiplePiePlot15.getInsets();
        jFreeChart8.setPadding(rectangleInsets26);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(jFreeChart23);
        org.junit.Assert.assertNotNull(rectangleInsets26);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        jFreeChart4.setBorderVisible(false);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertNotNull(textTitle12);
        org.junit.Assert.assertNotNull(list13);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Paint paint2 = multiplePiePlot0.getNoDataMessagePaint();
        multiplePiePlot0.setForegroundAlpha((float) (-1L));
        java.awt.Paint paint5 = multiplePiePlot0.getOutlinePaint();
        double double6 = multiplePiePlot0.getLimit();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        jFreeChart4.setNotify(false);
        org.jfree.chart.title.LegendTitle legendTitle17 = jFreeChart4.getLegend();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(legendTitle17);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder1 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder3 = multiplePiePlot2.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder3);
        java.awt.Paint paint5 = multiplePiePlot0.getOutlinePaint();
        multiplePiePlot0.setOutlineVisible(true);
        org.junit.Assert.assertNotNull(tableOrder1);
        org.junit.Assert.assertNotNull(tableOrder3);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
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
        multiplePiePlot0.zoom((double) (byte) -1);
        java.lang.String str28 = multiplePiePlot0.getPlotType();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Multiple Pie Plot" + "'", str28, "Multiple Pie Plot");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        multiplePiePlot0.setDataset(categoryDataset2);
        java.awt.Font font4 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot0.setNoDataMessageFont(font4);
        java.lang.String str6 = multiplePiePlot0.getPlotType();
        boolean boolean7 = multiplePiePlot0.isSubplot();
        multiplePiePlot0.setOutlineVisible(true);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = multiplePiePlot0.getDatasetGroup();
        float float8 = multiplePiePlot0.getBackgroundImageAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = multiplePiePlot0.getLegendItems();
        multiplePiePlot0.setBackgroundImageAlignment((int) (short) 1);
        multiplePiePlot0.setForegroundAlpha((float) (byte) 100);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertNotNull(legendItemCollection9);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        java.lang.Object obj18 = jFreeChart4.clone();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(title15);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        boolean boolean12 = jFreeChart4.getAntiAlias();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        jFreeChart8.removeLegend();
        org.jfree.chart.event.ChartProgressListener chartProgressListener10 = null;
        jFreeChart8.addProgressListener(chartProgressListener10);
        jFreeChart8.setBackgroundImageAlignment((int) ' ');
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj9 = multiplePiePlot8.clone();
        multiplePiePlot8.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier12);
        multiplePiePlot8.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart16 = multiplePiePlot8.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = jFreeChart16.getPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = jFreeChart16.getPadding();
        jFreeChart16.setAntiAlias(false);
        java.awt.Stroke stroke21 = jFreeChart16.getBorderStroke();
        jFreeChart4.setBorderStroke(stroke21);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(jFreeChart16);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        java.lang.Comparable comparable3 = multiplePiePlot0.getAggregatedItemsKey();
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot0.getRootPlot();
        plot4.setBackgroundAlpha(0.0f);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + "Other" + "'", comparable3, "Other");
        org.junit.Assert.assertNotNull(plot4);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        jFreeChart8.removeLegend();
        java.awt.Paint paint10 = jFreeChart8.getBorderPaint();
        jFreeChart8.setBackgroundImageAlpha((-1.0f));
        jFreeChart8.fireChartChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.title.Title title15 = jFreeChart8.getSubtitle((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        multiplePiePlot1.handleClick(15, (int) (short) 1, plotRenderingInfo22);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(textTitle11);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(plot15);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        int int7 = jFreeChart4.getSubtitleCount();
        jFreeChart4.setBorderVisible(true);
        java.awt.Paint paint10 = jFreeChart4.getBorderPaint();
        org.jfree.chart.title.LegendTitle legendTitle11 = jFreeChart4.getLegend();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = jFreeChart4.getPadding();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(legendTitle11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder3 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.JFreeChart jFreeChart5 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.JFreeChart jFreeChart6 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        multiplePiePlot8.notifyListeners(plotChangeEvent9);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        java.awt.Paint paint16 = jFreeChart15.getBackgroundPaint();
        java.awt.Stroke stroke17 = jFreeChart15.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle18 = jFreeChart15.getTitle();
        java.awt.Image image19 = jFreeChart15.getBackgroundImage();
        java.awt.Paint paint20 = jFreeChart15.getBorderPaint();
        multiplePiePlot8.setAggregatedItemsPaint(paint20);
        multiplePiePlot1.setAggregatedItemsPaint(paint20);
        org.junit.Assert.assertNotNull(drawingSupplier2);
        org.junit.Assert.assertNotNull(tableOrder3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(textTitle18);
        org.junit.Assert.assertNull(image19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        boolean boolean8 = multiplePiePlot0.equals((java.lang.Object) 1.0f);
        java.awt.Stroke stroke9 = multiplePiePlot0.getOutlineStroke();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot0.getRootPlot();
        multiplePiePlot0.setForegroundAlpha((float) 10L);
        boolean boolean13 = multiplePiePlot0.isOutlineVisible();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
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
        org.jfree.chart.event.ChartProgressListener chartProgressListener17 = null;
        jFreeChart16.addProgressListener(chartProgressListener17);
        jFreeChart16.setTextAntiAlias(true);
        java.lang.Object obj21 = jFreeChart16.getTextAntiAlias();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "Antialiased text mode");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "Antialiased text mode");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "Antialiased text mode");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 10.0f);
        java.awt.Paint paint4 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setNoDataMessagePaint(paint4);
        boolean boolean6 = multiplePiePlot0.isSubplot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent7 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent7);
        float float9 = multiplePiePlot0.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.JFreeChart jFreeChart3 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart3.plotChanged(plotChangeEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 10.0f);
        java.awt.Paint paint4 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setNoDataMessagePaint(paint4);
        boolean boolean6 = multiplePiePlot0.isSubplot();
        int int7 = multiplePiePlot0.getBackgroundImageAlignment();
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent9 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent9);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNotNull(jFreeChart8);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getRootPlot();
        multiplePiePlot0.setBackgroundImageAlignment(0);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent5);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj8 = multiplePiePlot7.clone();
        multiplePiePlot7.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint11 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot7.setNoDataMessagePaint(paint11);
        multiplePiePlot7.setForegroundAlpha(10.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = multiplePiePlot7.getInsets();
        multiplePiePlot0.setInsets(rectangleInsets15);
        java.awt.Paint paint17 = multiplePiePlot0.getBackgroundPaint();
        float float18 = multiplePiePlot0.getBackgroundAlpha();
        float float19 = multiplePiePlot0.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(plot2);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        jFreeChart4.setTitle("hi!");
        jFreeChart4.setTitle("Multiple Pie Plot");
        org.jfree.chart.title.LegendTitle legendTitle11 = jFreeChart4.getLegend();
        float float12 = jFreeChart4.getBackgroundImageAlpha();
        jFreeChart4.setBorderVisible(true);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(legendTitle11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        org.jfree.chart.title.TextTitle textTitle18 = jFreeChart17.getTitle();
        org.junit.Assert.assertNotNull(drawingSupplier2);
        org.junit.Assert.assertNotNull(tableOrder3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(textTitle18);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot1.setDataset(categoryDataset3);
        java.awt.Font font5 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot1.setNoDataMessageFont(font5);
        multiplePiePlot1.setForegroundAlpha(100.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot1.getInsets();
        boolean boolean10 = multiplePiePlot1.isSubplot();
        float float11 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart12 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = jFreeChart4.getPadding();
        org.jfree.chart.event.ChartChangeListener chartChangeListener15 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.removeChangeListener(chartChangeListener15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
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
        org.junit.Assert.assertNotNull(bufferedImage13);
        org.junit.Assert.assertNotNull(rectangleInsets14);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
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
        org.jfree.chart.title.TextTitle textTitle11 = jFreeChart4.getTitle();
        java.awt.RenderingHints renderingHints12 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.setRenderingHints(renderingHints12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: RenderingHints given are null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle11);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        java.awt.Font font1 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot2.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot2.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        multiplePiePlot2.setDataset(categoryDataset5);
        multiplePiePlot2.setLimit((double) 0);
        java.awt.Paint paint9 = multiplePiePlot2.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart10 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot2);
        java.awt.Font font11 = multiplePiePlot2.getNoDataMessageFont();
        multiplePiePlot2.setForegroundAlpha((float) (short) -1);
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("Other", font1, (org.jfree.chart.plot.Plot) multiplePiePlot2, false);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent16 = null;
        multiplePiePlot2.datasetChanged(datasetChangeEvent16);
        org.jfree.data.general.DatasetGroup datasetGroup18 = multiplePiePlot2.getDatasetGroup();
        org.junit.Assert.assertNull(plot3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNull(datasetGroup18);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        java.awt.Image image9 = null;
        multiplePiePlot0.setBackgroundImage(image9);
        java.awt.Paint paint11 = multiplePiePlot0.getNoDataMessagePaint();
        multiplePiePlot0.setNoDataMessage("");
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent14);
        java.awt.Paint paint16 = multiplePiePlot0.getAggregatedItemsPaint();
        multiplePiePlot0.setOutlineVisible(false);
        java.lang.String str19 = multiplePiePlot0.getPlotType();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(paint16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Multiple Pie Plot" + "'", str19, "Multiple Pie Plot");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        java.awt.Image image9 = null;
        multiplePiePlot0.setBackgroundImage(image9);
        java.awt.Paint paint11 = multiplePiePlot0.getNoDataMessagePaint();
        multiplePiePlot0.setNoDataMessage("");
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent14);
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot0.getRootPlot();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(plot16);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.draw(graphics2D13, rectangle2D14);
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
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        java.awt.Paint paint8 = multiplePiePlot0.getBackgroundPaint();
        float float9 = multiplePiePlot0.getForegroundAlpha();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint11 = multiplePiePlot0.getAggregatedItemsPaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNull(drawingSupplier10);
        org.junit.Assert.assertNull(paint11);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
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
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo17 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.handleClick(0, 0, chartRenderingInfo17);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        java.lang.String str9 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.JFreeChart jFreeChart10 = new org.jfree.chart.JFreeChart("", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        multiplePiePlot1.setOutlineVisible(false);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setNoDataMessagePaint(paint5);
        float float7 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart("", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.lang.Object obj9 = jFreeChart8.clone();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        jFreeChart8.setAntiAlias(true);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj17 = multiplePiePlot16.clone();
        multiplePiePlot16.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = null;
        multiplePiePlot16.setDrawingSupplier(drawingSupplier20);
        multiplePiePlot16.setForegroundAlpha(0.0f);
        multiplePiePlot16.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot16.zoom((double) (byte) 0);
        java.awt.Paint paint28 = multiplePiePlot16.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart29 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot16);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = multiplePiePlot16.getInsets();
        jFreeChart8.setPadding(rectangleInsets30);
        java.util.List list32 = jFreeChart8.getSubtitles();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = jFreeChart8.getPadding();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(paint28);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(rectangleInsets33);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        org.jfree.chart.plot.Plot plot8 = jFreeChart4.getPlot();
        jFreeChart4.setAntiAlias(true);
        java.awt.Image image11 = jFreeChart4.getBackgroundImage();
        jFreeChart4.setTextAntiAlias(true);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage19 = jFreeChart4.createBufferedImage((int) '#', (-1), 100.0d, (double) (short) 0, chartRenderingInfo18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (35) and height (-1) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNull(image11);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
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
        jFreeChart4.setBackgroundImageAlpha((float) (short) -1);
        int int15 = jFreeChart4.getSubtitleCount();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo18 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.handleClick(1, 100, chartRenderingInfo18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
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
        java.awt.Paint paint13 = multiplePiePlot0.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + "Other" + "'", comparable12, "Other");
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        java.awt.Paint paint7 = jFreeChart4.getBorderPaint();
        java.lang.Object obj8 = jFreeChart4.clone();
        java.awt.image.BufferedImage bufferedImage11 = jFreeChart4.createBufferedImage((int) ' ', 1);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = jFreeChart4.getPadding();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage15 = jFreeChart4.createBufferedImage((int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (35) and height (-1) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(bufferedImage11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        java.awt.Font font1 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot();
        float float4 = multiplePiePlot3.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot3.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart6 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot3);
        multiplePiePlot3.setForegroundAlpha((float) (byte) 0);
        java.awt.Paint paint9 = multiplePiePlot3.getOutlinePaint();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart("hi!", font1, (org.jfree.chart.plot.Plot) multiplePiePlot3, true);
        jFreeChart11.setNotify(true);
        org.jfree.chart.title.TextTitle textTitle14 = jFreeChart11.getTitle();
        java.lang.Object obj15 = jFreeChart11.getTextAntiAlias();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        float float18 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot17.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot17);
        jFreeChart20.fireChartChanged();
        jFreeChart20.fireChartChanged();
        boolean boolean23 = jFreeChart20.isBorderVisible();
        java.awt.Stroke stroke24 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        jFreeChart20.setBorderStroke(stroke24);
        jFreeChart11.setBorderStroke(stroke24);
        org.junit.Assert.assertNotNull(font1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(textTitle14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNotNull(plot19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(stroke24);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
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
        org.jfree.chart.title.LegendTitle legendTitle11 = jFreeChart4.getLegend();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(legendTitle11);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D18, rectangle2D19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder2 = multiplePiePlot1.getDataExtractOrder();
        float float3 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        java.lang.String str5 = multiplePiePlot1.getPlotType();
        org.jfree.chart.JFreeChart jFreeChart6 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.junit.Assert.assertNotNull(tableOrder2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Multiple Pie Plot" + "'", str5, "Multiple Pie Plot");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
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
        jFreeChart18.fireChartChanged();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot();
        float float29 = multiplePiePlot28.getBackgroundAlpha();
        float float30 = multiplePiePlot28.getBackgroundAlpha();
        java.awt.Stroke stroke31 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot28.setOutlineStroke(stroke31);
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart18.setTextAntiAlias((java.lang.Object) multiplePiePlot28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: org.jfree.chart.plot.MultiplePiePlot@470f9d39 incompatible with Text-specific antialiasing enable key");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertNotNull(stroke31);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
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
        multiplePiePlot0.setOutlineVisible(false);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent7 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent7);
        org.jfree.chart.JFreeChart jFreeChart9 = multiplePiePlot0.getPieChart();
        jFreeChart9.setBackgroundImageAlpha((float) (byte) 1);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertNotNull(jFreeChart9);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
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
            java.awt.image.BufferedImage bufferedImage22 = jFreeChart14.createBufferedImage((int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (10) and height (0) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNull(legendTitle16);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
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
        multiplePiePlot1.setLimit((double) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(jFreeChart13);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNull(paint17);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
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
        jFreeChart14.clearSubtitles();
        jFreeChart14.setTextAntiAlias(false);
        jFreeChart14.fireChartChanged();
        jFreeChart14.setNotify(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.title.Title title24 = jFreeChart14.getSubtitle((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNull(legendTitle16);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        int int5 = jFreeChart4.getBackgroundImageAlignment();
        float float6 = jFreeChart4.getBackgroundImageAlpha();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        int int8 = jFreeChart4.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Paint paint2 = multiplePiePlot0.getNoDataMessagePaint();
        multiplePiePlot0.setForegroundAlpha((float) (-1L));
        java.awt.Paint paint5 = multiplePiePlot0.getOutlinePaint();
        java.awt.Font font6 = multiplePiePlot0.getNoDataMessageFont();
        java.awt.Paint paint7 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.event.TitleChangeEvent titleChangeEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.titleChanged(titleChangeEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        float float2 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Stroke stroke3 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot0.setOutlineStroke(stroke3);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent5);
        java.lang.Class<?> wildcardClass7 = multiplePiePlot0.getClass();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        boolean boolean5 = multiplePiePlot0.isSubplot();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot0.getPieChart();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        multiplePiePlot0.handleClick((int) (short) -1, 10, plotRenderingInfo9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = multiplePiePlot0.getDataset();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jFreeChart6);
        org.junit.Assert.assertNull(categoryDataset11);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        int int9 = jFreeChart8.getSubtitleCount();
        java.awt.RenderingHints renderingHints10 = jFreeChart8.getRenderingHints();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(renderingHints10);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        java.awt.geom.Point2D point2D12 = null;
        org.jfree.chart.plot.PlotState plotState13 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.draw(graphics2D10, rectangle2D11, point2D12, plotState13, plotRenderingInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
        boolean boolean15 = jFreeChart4.isNotify();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj20 = multiplePiePlot19.clone();
        multiplePiePlot19.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = null;
        multiplePiePlot19.setDrawingSupplier(drawingSupplier23);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = null;
        multiplePiePlot19.setDrawingSupplier(drawingSupplier25);
        org.jfree.chart.JFreeChart jFreeChart27 = multiplePiePlot19.getPieChart();
        jFreeChart27.setNotify(false);
        int int30 = jFreeChart27.getBackgroundImageAlignment();
        boolean boolean31 = jFreeChart8.equals((java.lang.Object) jFreeChart27);
        jFreeChart8.setTitle("");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(jFreeChart27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 15 + "'", int30 == 15);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        jFreeChart16.fireChartChanged();
        boolean boolean18 = jFreeChart16.getAntiAlias();
        java.awt.Paint paint19 = jFreeChart16.getBorderPaint();
        java.lang.Object obj20 = jFreeChart16.clone();
        java.awt.image.BufferedImage bufferedImage23 = jFreeChart16.createBufferedImage((int) ' ', 1);
        jFreeChart16.setBackgroundImageAlpha((float) 10);
        jFreeChart16.setBackgroundImageAlpha(10.0f);
        multiplePiePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart16);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(plot2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Other" + "'", str11, "Other");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(bufferedImage23);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
        org.jfree.chart.LegendItemCollection legendItemCollection12 = multiplePiePlot0.getLegendItems();
        java.awt.Paint paint13 = multiplePiePlot0.getOutlinePaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertNotNull(legendItemCollection12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
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
        org.jfree.chart.event.ChartProgressListener chartProgressListener20 = null;
        jFreeChart8.addProgressListener(chartProgressListener20);
        jFreeChart8.setBackgroundImageAlpha(0.5f);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj25 = multiplePiePlot24.clone();
        multiplePiePlot24.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = null;
        multiplePiePlot24.setDrawingSupplier(drawingSupplier28);
        multiplePiePlot24.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        java.lang.String str32 = multiplePiePlot24.getNoDataMessage();
        multiplePiePlot24.setForegroundAlpha(10.0f);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier35 = multiplePiePlot24.getDrawingSupplier();
        org.jfree.chart.plot.Plot plot36 = multiplePiePlot24.getParent();
        java.awt.Graphics2D graphics2D37 = null;
        java.awt.geom.Rectangle2D rectangle2D38 = null;
        multiplePiePlot24.drawBackgroundImage(graphics2D37, rectangle2D38);
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.setTextAntiAlias((java.lang.Object) rectangle2D38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null incompatible with Text-specific antialiasing enable key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(legendTitle18);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(drawingSupplier35);
        org.junit.Assert.assertNull(plot36);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
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
        java.lang.Object obj28 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo33 = null;
        java.awt.image.BufferedImage bufferedImage34 = jFreeChart4.createBufferedImage((int) (byte) 100, 100, (double) (byte) 1, (double) 'a', chartRenderingInfo33);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(bufferedImage18);
        org.junit.Assert.assertNotNull(bufferedImage26);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(bufferedImage34);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        java.awt.Image image9 = null;
        multiplePiePlot0.setBackgroundImage(image9);
        java.awt.Paint paint11 = multiplePiePlot0.getNoDataMessagePaint();
        multiplePiePlot0.setNoDataMessage("");
        java.lang.Comparable comparable14 = multiplePiePlot0.getAggregatedItemsKey();
        multiplePiePlot0.setNoDataMessage("hi!");
        org.jfree.chart.LegendItemCollection legendItemCollection17 = multiplePiePlot0.getLegendItems();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + "Other" + "'", comparable14, "Other");
        org.junit.Assert.assertNotNull(legendItemCollection17);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot();
        float float5 = multiplePiePlot4.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot4.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart7 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot4);
        jFreeChart7.fireChartChanged();
        java.awt.Image image9 = jFreeChart7.getBackgroundImage();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo14 = null;
        java.awt.image.BufferedImage bufferedImage15 = jFreeChart7.createBufferedImage((int) 'a', (int) ' ', (double) (byte) 10, (double) 10, chartRenderingInfo14);
        multiplePiePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart7);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(bufferedImage15);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        multiplePiePlot0.setLimit((double) 1.0f);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertNotNull(jFreeChart20);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent19 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent19);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
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
        java.lang.Object obj20 = jFreeChart8.getTextAntiAlias();
        jFreeChart8.setBackgroundImageAlpha((-1.0f));
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        java.awt.Stroke stroke8 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        jFreeChart4.setBorderStroke(stroke8);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = jFreeChart4.getPadding();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(rectangleInsets10);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
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
        jFreeChart8.setNotify(true);
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
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot();
        float float22 = multiplePiePlot21.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot23 = multiplePiePlot21.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart24 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot21);
        jFreeChart24.fireChartChanged();
        java.lang.Object obj26 = jFreeChart24.clone();
        int int27 = jFreeChart24.getSubtitleCount();
        jFreeChart24.setBorderVisible(true);
        java.awt.Image image30 = jFreeChart24.getBackgroundImage();
        java.util.List list31 = jFreeChart24.getSubtitles();
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.setTextAntiAlias((java.lang.Object) list31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: [org.jfree.chart.title.LegendTitle@c368996c] incompatible with Text-specific antialiasing enable key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(plot23);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(image30);
        org.junit.Assert.assertNotNull(list31);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
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
        jFreeChart13.setTextAntiAlias(false);
        jFreeChart13.setBorderVisible(false);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.5f + "'", float20 == 0.5f);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
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
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = null;
        java.awt.image.BufferedImage bufferedImage16 = jFreeChart11.createBufferedImage(15, (int) 'a', chartRenderingInfo15);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(bufferedImage16);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        java.lang.Object obj11 = jFreeChart4.getTextAntiAlias();
        jFreeChart4.setTitle("Multiple Pie Plot");
        boolean boolean14 = jFreeChart4.getAntiAlias();
        jFreeChart4.setTextAntiAlias(false);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
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
        jFreeChart12.removeLegend();
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
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent2);
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        org.jfree.chart.JFreeChart jFreeChart7 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot1);
        int int8 = jFreeChart7.getBackgroundImageAlignment();
        float float9 = jFreeChart7.getBackgroundImageAlpha();
        boolean boolean10 = jFreeChart7.isNotify();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart7.draw(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(categoryDataset6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Paint paint2 = multiplePiePlot0.getNoDataMessagePaint();
        multiplePiePlot0.setForegroundAlpha((float) (-1));
        float float5 = multiplePiePlot0.getBackgroundAlpha();
        multiplePiePlot0.setLimit((double) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
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
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
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
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo18 = null;
        java.awt.image.BufferedImage bufferedImage19 = jFreeChart4.createBufferedImage((int) (short) 100, (int) (short) 100, (double) (-1.0f), 10.0d, chartRenderingInfo18);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(legendTitle13);
        org.junit.Assert.assertNotNull(bufferedImage19);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
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
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent27 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent27);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        multiplePiePlot0.markerChanged(markerChangeEvent29);
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
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        multiplePiePlot0.handleClick((int) (short) 1, 0, plotRenderingInfo19);
        java.awt.Paint paint21 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection22 = multiplePiePlot0.getLegendItems();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNull(categoryDataset16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(legendItemCollection22);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
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
        boolean boolean12 = plot11.isSubplot();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
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
        jFreeChart4.setAntiAlias(false);
        org.jfree.chart.event.ChartChangeListener chartChangeListener17 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.removeChangeListener(chartChangeListener17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
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
        org.jfree.chart.LegendItemCollection legendItemCollection18 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot0.getParent();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(jFreeChart14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(legendItemCollection18);
        org.junit.Assert.assertNull(plot19);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        jFreeChart8.removeLegend();
        java.awt.Paint paint10 = jFreeChart8.getBorderPaint();
        jFreeChart8.setBackgroundImageAlpha((-1.0f));
        boolean boolean13 = jFreeChart8.isBorderVisible();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.setTitle("");
        jFreeChart4.setBackgroundImageAlignment((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        java.awt.Paint paint12 = plot11.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(image10);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setNoDataMessagePaint(paint5);
        float float7 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart("", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        double double9 = multiplePiePlot1.getLimit();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.JFreeChart jFreeChart11 = multiplePiePlot1.getPieChart();
        jFreeChart11.setAntiAlias(false);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertNotNull(jFreeChart11);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 10.0f);
        java.awt.Paint paint5 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setNoDataMessagePaint(paint5);
        org.jfree.chart.JFreeChart jFreeChart7 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        multiplePiePlot1.setOutlineVisible(true);
        java.lang.String str10 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.zoom((double) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = multiplePiePlot0.getLegendItems();
        java.lang.String str6 = multiplePiePlot0.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        multiplePiePlot0.setDataset(categoryDataset7);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        java.awt.Paint paint15 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent16);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
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
        jFreeChart9.setAntiAlias(true);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        java.awt.geom.Point2D point2D17 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo18 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart9.draw(graphics2D15, rectangle2D16, point2D17, chartRenderingInfo18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart4.setBackgroundPaint(paint7);
        boolean boolean9 = jFreeChart4.isBorderVisible();
        jFreeChart4.removeLegend();
        jFreeChart4.setBackgroundImageAlignment((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
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
        multiplePiePlot1.setBackgroundImageAlpha((float) 1);
        org.junit.Assert.assertNotNull(drawingSupplier2);
        org.junit.Assert.assertNotNull(tableOrder3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart4.setBackgroundPaint(paint7);
        java.awt.Paint paint9 = jFreeChart4.getBackgroundPaint();
        jFreeChart4.removeLegend();
        org.jfree.chart.event.ChartChangeListener chartChangeListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.removeChangeListener(chartChangeListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getRootPlot();
        multiplePiePlot0.zoom((double) 15);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        multiplePiePlot0.handleClick(0, (-1), plotRenderingInfo13);
        multiplePiePlot0.setLimit(10.0d);
        float float17 = multiplePiePlot0.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        java.awt.Image image13 = jFreeChart4.getBackgroundImage();
        org.jfree.chart.event.ChartProgressListener chartProgressListener14 = null;
        jFreeChart4.removeProgressListener(chartProgressListener14);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo18 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.draw(graphics2D16, rectangle2D17, chartRenderingInfo18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(image13);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
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
        java.awt.Image image13 = jFreeChart4.getBackgroundImage();
        org.jfree.chart.event.ChartProgressListener chartProgressListener14 = null;
        jFreeChart4.removeProgressListener(chartProgressListener14);
        int int16 = jFreeChart4.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        int int5 = jFreeChart4.getBackgroundImageAlignment();
        java.awt.image.BufferedImage bufferedImage8 = jFreeChart4.createBufferedImage((int) 'a', (int) (byte) 10);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj10 = multiplePiePlot9.clone();
        multiplePiePlot9.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier13);
        multiplePiePlot9.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot9.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart18 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot9);
        java.awt.Paint paint19 = jFreeChart18.getBackgroundPaint();
        java.awt.Paint paint20 = jFreeChart18.getBackgroundPaint();
        int int21 = jFreeChart18.getBackgroundImageAlignment();
        org.jfree.chart.title.Title title22 = null;
        jFreeChart18.removeSubtitle(title22);
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.setTextAntiAlias((java.lang.Object) jFreeChart18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: org.jfree.chart.JFreeChart@19096577 incompatible with Text-specific antialiasing enable key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(bufferedImage8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(jFreeChart17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        boolean boolean6 = multiplePiePlot0.isOutlineVisible();
        org.jfree.chart.JFreeChart jFreeChart7 = multiplePiePlot0.getPieChart();
        org.jfree.chart.event.ChartProgressListener chartProgressListener8 = null;
        jFreeChart7.removeProgressListener(chartProgressListener8);
        jFreeChart7.fireChartChanged();
        org.jfree.chart.title.LegendTitle legendTitle11 = jFreeChart7.getLegend();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(legendTitle11);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier6);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        jFreeChart8.setNotify(false);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj12 = multiplePiePlot11.clone();
        multiplePiePlot11.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier15);
        multiplePiePlot11.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot11.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = jFreeChart19.getPadding();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot();
        float float23 = multiplePiePlot22.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot22.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart25 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot22);
        jFreeChart25.fireChartChanged();
        boolean boolean27 = jFreeChart25.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle29 = jFreeChart25.getLegend((int) (short) 0);
        jFreeChart19.removeSubtitle((org.jfree.chart.title.Title) legendTitle29);
        jFreeChart8.removeSubtitle((org.jfree.chart.title.Title) legendTitle29);
        java.awt.RenderingHints renderingHints32 = jFreeChart8.getRenderingHints();
        org.jfree.chart.title.LegendTitle legendTitle34 = jFreeChart8.getLegend(10);
        java.lang.Object obj35 = jFreeChart8.clone();
        org.jfree.chart.event.ChartChangeListener chartChangeListener36 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.addChangeListener(chartChangeListener36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(legendTitle29);
        org.junit.Assert.assertNotNull(renderingHints32);
        org.junit.Assert.assertNull(legendTitle34);
        org.junit.Assert.assertNotNull(obj35);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
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
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo18 = null;
        java.awt.image.BufferedImage bufferedImage19 = jFreeChart4.createBufferedImage((int) '4', 15, chartRenderingInfo18);
        jFreeChart4.setBackgroundImageAlignment(100);
        org.jfree.chart.event.TitleChangeEvent titleChangeEvent22 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.titleChanged(titleChangeEvent22);
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
        org.junit.Assert.assertNotNull(bufferedImage19);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
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
        jFreeChart4.setTextAntiAlias(true);
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
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        multiplePiePlot0.setDataset(categoryDataset2);
        java.awt.Font font4 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot0.setNoDataMessageFont(font4);
        multiplePiePlot0.setForegroundAlpha(100.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = multiplePiePlot0.getInsets();
        multiplePiePlot0.setBackgroundImageAlignment((int) 'a');
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent11 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent11);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(rectangleInsets8);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) "");
        boolean boolean10 = multiplePiePlot0.isOutlineVisible();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        jFreeChart4.setTitle("hi!");
        java.awt.Image image9 = jFreeChart4.getBackgroundImage();
        jFreeChart4.setTitle("");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNull(image9);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
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
        float float15 = multiplePiePlot0.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        boolean boolean6 = multiplePiePlot0.isOutlineVisible();
        org.jfree.chart.JFreeChart jFreeChart7 = multiplePiePlot0.getPieChart();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getParent();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj10 = multiplePiePlot9.clone();
        multiplePiePlot9.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier13);
        java.awt.Paint paint15 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot9.setBackgroundPaint(paint15);
        org.jfree.chart.util.TableOrder tableOrder17 = multiplePiePlot9.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder17);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(tableOrder17);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot0.setInsets(rectangleInsets3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        multiplePiePlot0.setDataset(categoryDataset5);
        org.jfree.chart.util.TableOrder tableOrder7 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getParent();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(tableOrder7);
        org.junit.Assert.assertNull(plot8);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
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
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage17 = jFreeChart4.createBufferedImage((int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (0) and height (1) cannot be <= 0");
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
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        java.awt.Paint paint8 = jFreeChart4.getBorderPaint();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.XYPlot xYPlot9 = jFreeChart4.getXYPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.MultiplePiePlot cannot be cast to org.jfree.chart.plot.XYPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
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
        multiplePiePlot0.setForegroundAlpha((float) 1);
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertNotNull(title13);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        java.awt.Paint paint6 = multiplePiePlot1.getAggregatedItemsPaint();
        float float7 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = multiplePiePlot1.getInsets();
        org.jfree.chart.ui.ProjectInfo projectInfo9 = org.jfree.chart.JFreeChart.INFO;
        boolean boolean10 = multiplePiePlot1.equals((java.lang.Object) projectInfo9);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.notifyListeners(plotChangeEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(projectInfo9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
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
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.draw(graphics2D13, rectangle2D14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundAlpha((float) 1L);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot4.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder6 = multiplePiePlot4.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder6);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        float float10 = multiplePiePlot9.getBackgroundAlpha();
        multiplePiePlot9.setAggregatedItemsKey((java.lang.Comparable) 10.0f);
        java.awt.Paint paint13 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot9.setNoDataMessagePaint(paint13);
        multiplePiePlot1.setNoDataMessagePaint(paint13);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(tableOrder6);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
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
        boolean boolean15 = jFreeChart14.getAntiAlias();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent18);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(textTitle11);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(plot15);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getRootPlot();
        java.awt.Paint paint9 = plot8.getBackgroundPaint();
        org.jfree.chart.JFreeChart jFreeChart10 = new org.jfree.chart.JFreeChart(plot8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.XYPlot xYPlot11 = jFreeChart10.getXYPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.MultiplePiePlot cannot be cast to org.jfree.chart.plot.XYPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
        jFreeChart4.setTitle("Other");
        jFreeChart4.setBackgroundImageAlpha((float) (short) -1);
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = jFreeChart4.getPadding();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(rectangleInsets17);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot2.setDataset(categoryDataset14);
        java.awt.Paint paint16 = multiplePiePlot2.getAggregatedItemsPaint();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        multiplePiePlot2.drawBackgroundImage(graphics2D17, rectangle2D18);
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot2.getRootPlot();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(paint16);
        org.junit.Assert.assertNotNull(plot20);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        float float8 = multiplePiePlot0.getForegroundAlpha();
        java.awt.Paint paint9 = multiplePiePlot0.getAggregatedItemsPaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(paint9);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
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
        multiplePiePlot0.setOutlineVisible(true);
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(font13);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        java.awt.Image image7 = jFreeChart4.getBackgroundImage();
        jFreeChart4.setBackgroundImageAlignment((int) '#');
        int int10 = jFreeChart4.getSubtitleCount();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.draw(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier5);
        multiplePiePlot1.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart9 = multiplePiePlot1.getPieChart();
        java.awt.Image image10 = null;
        multiplePiePlot1.setBackgroundImage(image10);
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot1.getPieChart();
        double double13 = multiplePiePlot1.getLimit();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("Other", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        float float16 = multiplePiePlot1.getBackgroundImageAlpha();
        double double17 = multiplePiePlot1.getLimit();
        org.jfree.chart.LegendItemCollection legendItemCollection18 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(plot14);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(legendItemCollection18);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
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
        jFreeChart4.setTextAntiAlias(false);
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
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
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
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo14 = null;
        java.awt.image.BufferedImage bufferedImage15 = jFreeChart4.createBufferedImage((int) '#', 1, (int) (byte) 10, chartRenderingInfo14);
        jFreeChart4.fireChartChanged();
        java.awt.Stroke stroke17 = jFreeChart4.getBorderStroke();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(bufferedImage15);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        multiplePiePlot0.setNoDataMessage("hi!");
        java.awt.Font font9 = multiplePiePlot0.getNoDataMessageFont();
        java.awt.Font font10 = multiplePiePlot0.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(font10);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
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
        multiplePiePlot0.zoom((double) 0.5f);
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot0.getRootPlot();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(plot15);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
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
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        java.awt.geom.Point2D point2D17 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo18 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart14.draw(graphics2D15, rectangle2D16, point2D17, chartRenderingInfo18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(paint13);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = multiplePiePlot0.getLegendItems();
        java.lang.String str6 = multiplePiePlot0.getPlotType();
        multiplePiePlot0.setLimit((double) (byte) 1);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
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
        jFreeChart4.clearSubtitles();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage17 = jFreeChart4.createBufferedImage(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (1) and height (0) cannot be <= 0");
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
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
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
        org.jfree.chart.event.ChartChangeListener chartChangeListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.removeChangeListener(chartChangeListener16);
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
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getRootPlot();
        java.awt.Paint paint9 = plot8.getBackgroundPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = plot8.getInsets();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        jFreeChart4.removeLegend();
        jFreeChart4.setBackgroundImageAlignment(15);
        jFreeChart4.setTextAntiAlias(true);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        boolean boolean6 = multiplePiePlot0.isOutlineVisible();
        org.jfree.chart.JFreeChart jFreeChart7 = multiplePiePlot0.getPieChart();
        org.jfree.chart.util.TableOrder tableOrder8 = multiplePiePlot0.getDataExtractOrder();
        java.awt.Paint paint9 = multiplePiePlot0.getNoDataMessagePaint();
        boolean boolean10 = multiplePiePlot0.isSubplot();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(tableOrder8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        java.awt.Font font1 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot();
        float float4 = multiplePiePlot3.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot3.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart6 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot3);
        multiplePiePlot3.setForegroundAlpha((float) (byte) 0);
        java.awt.Paint paint9 = multiplePiePlot3.getOutlinePaint();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart("hi!", font1, (org.jfree.chart.plot.Plot) multiplePiePlot3, true);
        boolean boolean12 = jFreeChart11.isBorderVisible();
        org.jfree.chart.title.TextTitle textTitle13 = jFreeChart11.getTitle();
        org.junit.Assert.assertNotNull(font1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(textTitle13);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
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
        java.awt.Stroke stroke11 = jFreeChart4.getBorderStroke();
        java.awt.Paint paint12 = jFreeChart4.getBackgroundPaint();
        int int13 = jFreeChart4.getSubtitleCount();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        boolean boolean8 = multiplePiePlot0.equals((java.lang.Object) 1.0f);
        boolean boolean9 = multiplePiePlot0.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot0.getDataset();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 0.0f);
        int int13 = multiplePiePlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.lang.String str6 = multiplePiePlot0.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        multiplePiePlot0.setDataset(categoryDataset7);
        boolean boolean9 = multiplePiePlot0.isOutlineVisible();
        multiplePiePlot0.setBackgroundAlpha((float) 10);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.setBackgroundImageAlpha((float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint4 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setNoDataMessagePaint(paint4);
        float float6 = multiplePiePlot0.getBackgroundAlpha();
        multiplePiePlot0.setForegroundAlpha((float) 10L);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        multiplePiePlot0.setDataset(categoryDataset9);
        java.awt.Image image11 = multiplePiePlot0.getBackgroundImage();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertNull(image11);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent5);
        java.awt.Paint paint7 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj9 = multiplePiePlot8.clone();
        multiplePiePlot8.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier12);
        multiplePiePlot8.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart16 = multiplePiePlot8.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = jFreeChart16.getPadding();
        multiplePiePlot1.setInsets(rectangleInsets17, true);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj21 = multiplePiePlot20.clone();
        multiplePiePlot20.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = null;
        multiplePiePlot20.setDrawingSupplier(drawingSupplier24);
        multiplePiePlot20.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart28 = multiplePiePlot20.getPieChart();
        org.jfree.chart.title.Title title30 = jFreeChart28.getSubtitle((int) (byte) 0);
        org.jfree.chart.plot.Plot plot31 = jFreeChart28.getPlot();
        plot31.setBackgroundImageAlignment((int) (short) 100);
        multiplePiePlot1.setParent(plot31);
        java.awt.Graphics2D graphics2D35 = null;
        java.awt.geom.Rectangle2D rectangle2D36 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D35, rectangle2D36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(jFreeChart16);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(jFreeChart28);
        org.junit.Assert.assertNotNull(title30);
        org.junit.Assert.assertNotNull(plot31);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
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
        org.jfree.chart.title.TextTitle textTitle22 = jFreeChart8.getTitle();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(legendTitle20);
        org.junit.Assert.assertNull(textTitle22);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = jFreeChart9.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
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
        org.jfree.chart.event.ChartProgressListener chartProgressListener13 = null;
        jFreeChart12.addProgressListener(chartProgressListener13);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(jFreeChart12);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getRootPlot();
        multiplePiePlot0.zoom((double) 15);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        multiplePiePlot0.handleClick(0, (-1), plotRenderingInfo13);
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(plot8);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
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
        org.jfree.chart.title.LegendTitle legendTitle14 = jFreeChart11.getLegend();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(legendTitle14);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.JFreeChart jFreeChart3 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot();
        float float6 = multiplePiePlot5.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot5.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot5);
        jFreeChart8.fireChartChanged();
        boolean boolean10 = jFreeChart8.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle12 = jFreeChart8.getLegend((int) (short) 0);
        boolean boolean13 = jFreeChart8.isNotify();
        float float14 = jFreeChart8.getBackgroundImageAlpha();
        java.awt.Paint paint15 = jFreeChart8.getBorderPaint();
        multiplePiePlot0.setBackgroundPaint(paint15);
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot0.getPieChart();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(legendTitle12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(jFreeChart17);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder2 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.util.TableOrder tableOrder5 = multiplePiePlot0.getDataExtractOrder();
        multiplePiePlot0.setBackgroundImageAlignment((int) (short) 10);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj9 = multiplePiePlot8.clone();
        multiplePiePlot8.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier14);
        org.jfree.chart.JFreeChart jFreeChart16 = multiplePiePlot8.getPieChart();
        multiplePiePlot8.setNoDataMessage("Other");
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = multiplePiePlot8.getInsets();
        java.awt.Paint paint20 = multiplePiePlot8.getNoDataMessagePaint();
        multiplePiePlot0.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(tableOrder2);
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertNotNull(tableOrder5);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(jFreeChart16);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
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
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.handleClick((int) (byte) 0, (int) (byte) 0, chartRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        java.awt.Stroke stroke9 = multiplePiePlot0.getOutlineStroke();
        java.awt.Paint paint10 = multiplePiePlot0.getOutlinePaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder2 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.util.TableOrder tableOrder5 = multiplePiePlot0.getDataExtractOrder();
        multiplePiePlot0.setBackgroundImageAlpha((float) (short) 1);
        boolean boolean8 = multiplePiePlot0.isSubplot();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(tableOrder2);
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertNotNull(tableOrder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
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
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        java.awt.geom.Point2D point2D23 = null;
        org.jfree.chart.plot.PlotState plotState24 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D21, rectangle2D22, point2D23, plotState24, plotRenderingInfo25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        float float16 = multiplePiePlot15.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot15.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart18 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot15);
        jFreeChart18.fireChartChanged();
        java.lang.Object obj20 = jFreeChart18.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo23 = null;
        java.awt.image.BufferedImage bufferedImage24 = jFreeChart18.createBufferedImage((int) '#', 1, chartRenderingInfo23);
        boolean boolean25 = jFreeChart18.isNotify();
        java.awt.Image image26 = jFreeChart18.getBackgroundImage();
        java.lang.Object obj27 = jFreeChart18.getTextAntiAlias();
        jFreeChart18.removeLegend();
        org.jfree.chart.title.TextTitle textTitle29 = jFreeChart18.getTitle();
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart12.addSubtitle((int) (byte) 10, (org.jfree.chart.title.Title) textTitle29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'index' argument is out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(bufferedImage24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(image26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(textTitle29);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle8 = jFreeChart4.getLegend((int) (short) 0);
        java.awt.Image image9 = jFreeChart4.getBackgroundImage();
        jFreeChart4.fireChartChanged();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(legendTitle8);
        org.junit.Assert.assertNull(image9);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj15 = multiplePiePlot14.clone();
        multiplePiePlot14.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot14.setDrawingSupplier(drawingSupplier18);
        multiplePiePlot14.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot14.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = jFreeChart22.getPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = jFreeChart22.getPadding();
        jFreeChart22.setBackgroundImageAlignment(0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj28 = multiplePiePlot27.clone();
        multiplePiePlot27.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = null;
        multiplePiePlot27.setDrawingSupplier(drawingSupplier31);
        multiplePiePlot27.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart35 = multiplePiePlot27.getPieChart();
        jFreeChart35.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot();
        float float39 = multiplePiePlot38.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot40 = multiplePiePlot38.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart41 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot38);
        java.awt.Paint paint42 = jFreeChart41.getBackgroundPaint();
        java.awt.Stroke stroke43 = jFreeChart41.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle44 = jFreeChart41.getTitle();
        jFreeChart35.setTitle(textTitle44);
        jFreeChart22.removeSubtitle((org.jfree.chart.title.Title) textTitle44);
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.addSubtitle((int) (short) 100, (org.jfree.chart.title.Title) textTitle44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'index' argument is out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(jFreeChart22);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(jFreeChart35);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 1.0f + "'", float39 == 1.0f);
        org.junit.Assert.assertNotNull(plot40);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(textTitle44);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
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
        jFreeChart4.setNotify(false);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo18 = null;
        java.awt.image.BufferedImage bufferedImage19 = jFreeChart4.createBufferedImage((int) (byte) 1, (int) (byte) 100, chartRenderingInfo18);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(bufferedImage19);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        boolean boolean8 = multiplePiePlot0.equals((java.lang.Object) 1.0f);
        boolean boolean9 = multiplePiePlot0.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot0.getDataset();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent11 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent11);
        multiplePiePlot0.setOutlineVisible(false);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(categoryDataset10);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder1 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder3 = multiplePiePlot2.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot0.getLegendItems();
        java.awt.Paint paint7 = multiplePiePlot0.getOutlinePaint();
        org.junit.Assert.assertNotNull(tableOrder1);
        org.junit.Assert.assertNotNull(tableOrder3);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertNotNull(legendItemCollection6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.JFreeChart jFreeChart2 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart4 = multiplePiePlot0.getPieChart();
        float float5 = multiplePiePlot0.getBackgroundAlpha();
        multiplePiePlot0.setNoDataMessage("Multiple Pie Plot");
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(jFreeChart4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener7 = null;
        jFreeChart4.addProgressListener(chartProgressListener7);
        jFreeChart4.removeLegend();
        org.jfree.chart.title.LegendTitle legendTitle10 = jFreeChart4.getLegend();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(legendTitle10);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder2 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        float float7 = multiplePiePlot6.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot6.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot6);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent10 = null;
        multiplePiePlot6.axisChanged(axisChangeEvent10);
        java.awt.Paint paint12 = multiplePiePlot6.getAggregatedItemsPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier17);
        multiplePiePlot13.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot13.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = jFreeChart21.getPadding();
        multiplePiePlot6.setInsets(rectangleInsets22, true);
        multiplePiePlot0.setParent((org.jfree.chart.plot.Plot) multiplePiePlot6);
        java.awt.Image image26 = multiplePiePlot0.getBackgroundImage();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(tableOrder2);
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(jFreeChart21);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNull(image26);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
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
        boolean boolean12 = jFreeChart4.getAntiAlias();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
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
        multiplePiePlot0.setLimit((double) 100L);
        java.awt.Paint paint14 = multiplePiePlot0.getBackgroundPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = multiplePiePlot0.getInsets();
        java.lang.Class<?> wildcardClass16 = rectangleInsets15.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        java.awt.Paint paint6 = multiplePiePlot1.getAggregatedItemsPaint();
        float float7 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj10 = multiplePiePlot9.clone();
        multiplePiePlot9.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier13);
        multiplePiePlot9.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot9.getPieChart();
        org.jfree.chart.title.Title title19 = jFreeChart17.getSubtitle((int) (byte) 0);
        jFreeChart17.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot();
        float float22 = multiplePiePlot21.getBackgroundAlpha();
        java.awt.Paint paint23 = multiplePiePlot21.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot21.setInsets(rectangleInsets24, false);
        jFreeChart17.setPadding(rectangleInsets24);
        java.awt.Paint paint28 = jFreeChart17.getBorderPaint();
        java.awt.Paint paint29 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        jFreeChart17.setBorderPaint(paint29);
        multiplePiePlot1.setOutlinePaint(paint29);
        org.jfree.chart.JFreeChart jFreeChart32 = multiplePiePlot1.getPieChart();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot();
        float float35 = multiplePiePlot34.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot36 = multiplePiePlot34.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart37 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot34);
        java.awt.Paint paint38 = jFreeChart37.getBackgroundPaint();
        java.awt.Stroke stroke39 = jFreeChart37.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener40 = null;
        jFreeChart37.addProgressListener(chartProgressListener40);
        org.jfree.chart.event.ChartProgressListener chartProgressListener42 = null;
        jFreeChart37.removeProgressListener(chartProgressListener42);
        java.awt.Image image44 = jFreeChart37.getBackgroundImage();
        float float45 = jFreeChart37.getBackgroundImageAlpha();
        boolean boolean46 = jFreeChart37.isBorderVisible();
        org.jfree.chart.event.ChartProgressListener chartProgressListener47 = null;
        jFreeChart37.removeProgressListener(chartProgressListener47);
        org.jfree.chart.util.RectangleInsets rectangleInsets49 = jFreeChart37.getPadding();
        int int50 = jFreeChart37.getSubtitleCount();
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart32.setTextAntiAlias((java.lang.Object) int50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1 incompatible with Text-specific antialiasing enable key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(jFreeChart17);
        org.junit.Assert.assertNotNull(title19);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(jFreeChart32);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertNotNull(plot36);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNull(image44);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.5f + "'", float45 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(rectangleInsets49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
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
        java.awt.Font font15 = multiplePiePlot0.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(title12);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNotNull(font15);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        int int12 = jFreeChart11.getSubtitleCount();
        boolean boolean13 = jFreeChart11.isBorderVisible();
        jFreeChart11.setBorderVisible(true);
        java.awt.image.BufferedImage bufferedImage18 = jFreeChart11.createBufferedImage(100, 1);
        multiplePiePlot0.setPieChart(jFreeChart11);
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bufferedImage18);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        int int8 = jFreeChart4.getBackgroundImageAlignment();
        int int9 = jFreeChart4.getSubtitleCount();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.draw(graphics2D10, rectangle2D11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder2 = multiplePiePlot1.getDataExtractOrder();
        float float3 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart5 = new org.jfree.chart.JFreeChart("", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertNotNull(tableOrder2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(categoryDataset6);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart3 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.lang.Object obj4 = jFreeChart3.getTextAntiAlias();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = jFreeChart3.getPadding();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        java.awt.Image image9 = null;
        multiplePiePlot0.setBackgroundImage(image9);
        multiplePiePlot0.zoom(0.0d);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj13 = multiplePiePlot12.clone();
        multiplePiePlot12.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier16);
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) "");
        org.jfree.chart.util.TableOrder tableOrder22 = multiplePiePlot12.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder22);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(tableOrder22);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
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
        org.jfree.chart.event.ChartProgressListener chartProgressListener32 = null;
        jFreeChart4.addProgressListener(chartProgressListener32);
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
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        multiplePiePlot0.setBackgroundImageAlignment(15);
        org.jfree.chart.JFreeChart jFreeChart10 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D11, rectangle2D12);
        float float14 = multiplePiePlot0.getBackgroundImageAlpha();
        java.awt.Paint paint15 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        double double8 = multiplePiePlot0.getLimit();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = multiplePiePlot0.getDrawingSupplier();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(drawingSupplier9);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getRootPlot();
        multiplePiePlot0.zoom((double) 15);
        multiplePiePlot0.setBackgroundAlpha((float) '#');
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(plot8);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        multiplePiePlot0.handleClick((int) (short) 0, 1, plotRenderingInfo17);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot0.getDatasetGroup();
        java.lang.String str9 = multiplePiePlot0.getNoDataMessage();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D10, rectangle2D11);
        java.awt.Paint paint13 = multiplePiePlot0.getBackgroundPaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier5);
        multiplePiePlot1.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart9 = multiplePiePlot1.getPieChart();
        java.awt.Image image10 = null;
        multiplePiePlot1.setBackgroundImage(image10);
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot1.getPieChart();
        double double13 = multiplePiePlot1.getLimit();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("Other", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart15.setBackgroundImageAlignment((int) (byte) -1);
        float float18 = jFreeChart15.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(plot14);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getRootPlot();
        multiplePiePlot0.setBackgroundImageAlignment(0);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent5);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj8 = multiplePiePlot7.clone();
        multiplePiePlot7.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint11 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot7.setNoDataMessagePaint(paint11);
        multiplePiePlot7.setForegroundAlpha(10.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = multiplePiePlot7.getInsets();
        multiplePiePlot0.setInsets(rectangleInsets15);
        java.lang.Class<?> wildcardClass17 = multiplePiePlot0.getClass();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(plot2);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent5);
        java.awt.Paint paint7 = multiplePiePlot1.getAggregatedItemsPaint();
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0L);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj13 = multiplePiePlot12.clone();
        multiplePiePlot12.setBackgroundAlpha((float) (short) -1);
        java.awt.Font font16 = multiplePiePlot12.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font16);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(font16);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        multiplePiePlot0.setLimit((double) 0);
        java.awt.Paint paint7 = multiplePiePlot0.getAggregatedItemsPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot0.getDataset();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        java.awt.Paint paint12 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setAggregatedItemsPaint(paint12);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getParent();
        java.lang.Comparable comparable3 = multiplePiePlot0.getAggregatedItemsKey();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent4 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent4);
        multiplePiePlot0.setBackgroundImageAlpha((float) (byte) 1);
        java.lang.Object obj8 = multiplePiePlot0.clone();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot0.markerChanged(markerChangeEvent9);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + "Other" + "'", comparable3, "Other");
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
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
        java.awt.Font font25 = multiplePiePlot0.getNoDataMessageFont();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(jFreeChart18);
        org.junit.Assert.assertNotNull(title20);
        org.junit.Assert.assertNotNull(legendTitle22);
        org.junit.Assert.assertNotNull(font25);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
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
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        multiplePiePlot1.setDataset(categoryDataset16);
        java.awt.Paint paint18 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(textTitle11);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(plot15);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        float float5 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        float float7 = multiplePiePlot6.getBackgroundAlpha();
        float float8 = multiplePiePlot6.getBackgroundAlpha();
        multiplePiePlot6.setOutlineVisible(false);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        multiplePiePlot6.drawBackgroundImage(graphics2D11, rectangle2D12);
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot6);
        org.jfree.chart.title.LegendTitle legendTitle16 = jFreeChart14.getLegend(0);
        multiplePiePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart14);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(legendTitle16);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
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
        jFreeChart4.setTextAntiAlias(true);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = jFreeChart8.getPadding();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rectangleInsets12);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.title.Title title15 = jFreeChart4.getSubtitle(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
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
        org.jfree.chart.event.ChartProgressListener chartProgressListener17 = null;
        jFreeChart16.addProgressListener(chartProgressListener17);
        java.lang.Object obj19 = null;
        boolean boolean20 = jFreeChart16.equals(obj19);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
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
        jFreeChart8.setBorderVisible(false);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertNotNull(plot11);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
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
        java.lang.Object obj35 = jFreeChart8.getTextAntiAlias();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertNotNull(legendTitle12);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(jFreeChart23);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        int int9 = jFreeChart8.getSubtitleCount();
        jFreeChart8.setBackgroundImageAlignment(15);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart1 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = jFreeChart1.getPadding();
        java.util.List list3 = jFreeChart1.getSubtitles();
        org.jfree.chart.title.Title title5 = jFreeChart1.getSubtitle(0);
        jFreeChart1.setTextAntiAlias(true);
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(title5);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.Title title10 = jFreeChart8.getSubtitle((int) (byte) 0);
        java.lang.Object obj11 = jFreeChart8.clone();
        org.jfree.chart.plot.Plot plot12 = jFreeChart8.getPlot();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(plot12);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        java.lang.String str8 = multiplePiePlot0.getNoDataMessage();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot0.getInsets();
        java.awt.Paint paint10 = multiplePiePlot0.getBackgroundPaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
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
        org.jfree.chart.event.ChartProgressListener chartProgressListener16 = null;
        jFreeChart13.removeProgressListener(chartProgressListener16);
        org.jfree.chart.event.ChartChangeListener chartChangeListener18 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart13.removeChangeListener(chartChangeListener18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        multiplePiePlot0.handleClick((int) (short) 1, 0, plotRenderingInfo19);
        java.awt.Paint paint21 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.plot.Plot plot22 = multiplePiePlot0.getRootPlot();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNull(categoryDataset16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(plot22);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
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
        java.awt.RenderingHints renderingHints18 = jFreeChart13.getRenderingHints();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(renderingHints18);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
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
        java.lang.Object obj29 = jFreeChart4.getTextAntiAlias();
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
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        multiplePiePlot13.setForegroundAlpha((float) (byte) 0);
        java.awt.Paint paint19 = multiplePiePlot13.getOutlinePaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        multiplePiePlot13.handleClick((-1), 15, plotRenderingInfo22);
        boolean boolean24 = jFreeChart4.equals((java.lang.Object) multiplePiePlot13);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(legendTitle8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getRootPlot();
        multiplePiePlot0.setBackgroundImageAlignment(0);
        float float5 = multiplePiePlot0.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(plot2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
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
        jFreeChart8.fireChartChanged();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        float float3 = multiplePiePlot2.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot2.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart5 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot2);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot2.axisChanged(axisChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot2.getAggregatedItemsPaint();
        multiplePiePlot2.setNoDataMessage("Multiple Pie Plot");
        java.lang.String str11 = multiplePiePlot2.getPlotType();
        java.awt.Font font12 = multiplePiePlot2.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        java.awt.Paint paint15 = multiplePiePlot13.getNoDataMessagePaint();
        multiplePiePlot13.setForegroundAlpha((float) (-1));
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = multiplePiePlot13.getDrawingSupplier();
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", font12, (org.jfree.chart.plot.Plot) multiplePiePlot13, false);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Multiple Pie Plot" + "'", str11, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(drawingSupplier18);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        boolean boolean11 = jFreeChart4.isNotify();
        java.awt.Image image12 = jFreeChart4.getBackgroundImage();
        java.lang.Object obj13 = jFreeChart4.getTextAntiAlias();
        jFreeChart4.setTextAntiAlias(true);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        multiplePiePlot0.setNoDataMessage("hi!");
        float float9 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot0.getParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleInsets rectangleInsets11 = plot10.getInsets();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertNull(plot10);
    }
}

