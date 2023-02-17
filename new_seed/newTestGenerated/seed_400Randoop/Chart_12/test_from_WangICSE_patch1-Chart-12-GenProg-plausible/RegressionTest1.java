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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        java.awt.Paint paint8 = jFreeChart4.getBorderPaint();
        jFreeChart4.setTitle("Other");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot11.getDrawingSupplier();
        java.awt.Paint paint13 = multiplePiePlot11.getBackgroundPaint();
        java.awt.Paint paint14 = multiplePiePlot11.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        multiplePiePlot11.setDataset(categoryDataset15);
        multiplePiePlot11.setForegroundAlpha((float) 1L);
        boolean boolean19 = jFreeChart4.equals((java.lang.Object) multiplePiePlot11);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
        java.lang.Object obj13 = multiplePiePlot12.clone();
        multiplePiePlot12.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier16);
        multiplePiePlot12.setForegroundAlpha(0.0f);
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot12.zoom((double) (byte) 0);
        java.awt.Paint paint24 = multiplePiePlot12.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart25 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        org.jfree.chart.title.LegendTitle legendTitle27 = jFreeChart25.getLegend(100);
        jFreeChart25.setBorderVisible(false);
        java.awt.Stroke stroke30 = jFreeChart25.getBorderStroke();
        jFreeChart8.setBorderStroke(stroke30);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNull(paint24);
        org.junit.Assert.assertNull(legendTitle27);
        org.junit.Assert.assertNotNull(stroke30);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint4 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setNoDataMessagePaint(paint4);
        java.awt.Font font6 = multiplePiePlot0.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = multiplePiePlot0.getDrawingSupplier();
        java.lang.String str8 = multiplePiePlot0.getNoDataMessage();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot0.getParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.Plot plot10 = plot9.getParent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(drawingSupplier7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(plot9);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
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
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage27 = jFreeChart8.createBufferedImage(0, (int) (byte) 1, (double) 100, (double) (short) 100, chartRenderingInfo26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (0) and height (1) cannot be <= 0");
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
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
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
        jFreeChart4.setBackgroundImageAlpha((float) 100);
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
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
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
        org.jfree.chart.event.TitleChangeEvent titleChangeEvent14 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart9.titleChanged(titleChangeEvent14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
        org.jfree.chart.event.TitleChangeEvent titleChangeEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.titleChanged(titleChangeEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        java.awt.Paint paint14 = multiplePiePlot12.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot12.setInsets(rectangleInsets15, false);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj19 = multiplePiePlot18.clone();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        multiplePiePlot18.setDataset(categoryDataset20);
        java.awt.Font font22 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot18.setNoDataMessageFont(font22);
        java.lang.String str24 = multiplePiePlot18.getPlotType();
        boolean boolean25 = multiplePiePlot18.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot18.setInsets(rectangleInsets26, false);
        multiplePiePlot12.setInsets(rectangleInsets26, false);
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.setTextAntiAlias((java.lang.Object) multiplePiePlot12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: org.jfree.chart.plot.MultiplePiePlot@3364ea9f incompatible with Text-specific antialiasing enable key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Multiple Pie Plot" + "'", str24, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(rectangleInsets26);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        int int10 = multiplePiePlot0.getBackgroundImageAlignment();
        java.awt.Image image11 = multiplePiePlot0.getBackgroundImage();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNull(image11);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        java.util.List list8 = jFreeChart4.getSubtitles();
        java.util.List list9 = jFreeChart4.getSubtitles();
        jFreeChart4.setTitle("");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = multiplePiePlot13.getDrawingSupplier();
        java.awt.Paint paint15 = multiplePiePlot13.getBackgroundPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot13.getLegendItems();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj18 = multiplePiePlot17.clone();
        multiplePiePlot17.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint21 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot17.setNoDataMessagePaint(paint21);
        java.awt.Font font23 = multiplePiePlot17.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = multiplePiePlot17.getDrawingSupplier();
        multiplePiePlot13.setDrawingSupplier(drawingSupplier24);
        // The following exception was thrown during execution in test generation
        try {
            plot12.setDrawingSupplier(drawingSupplier24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(plot12);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNotNull(drawingSupplier24);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
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
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage18 = jFreeChart14.createBufferedImage((int) (byte) 0, (int) '4', chartRenderingInfo17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (0) and height (52) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(paint13);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        java.awt.Paint paint7 = jFreeChart4.getBorderPaint();
        java.lang.Object obj8 = jFreeChart4.clone();
        java.awt.image.BufferedImage bufferedImage11 = jFreeChart4.createBufferedImage((int) ' ', 1);
        jFreeChart4.setBackgroundImageAlpha((float) 10);
        jFreeChart4.fireChartChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.CategoryPlot categoryPlot15 = jFreeChart4.getCategoryPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.MultiplePiePlot cannot be cast to org.jfree.chart.plot.CategoryPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(bufferedImage11);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        multiplePiePlot1.setForegroundAlpha((float) (byte) 0);
        java.awt.Paint paint7 = multiplePiePlot1.getOutlinePaint();
        java.awt.Paint paint8 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.Title title10 = jFreeChart8.getSubtitle((int) (byte) 0);
        java.lang.Object obj11 = jFreeChart8.clone();
        java.awt.Paint paint12 = jFreeChart8.getBorderPaint();
        java.awt.Paint paint13 = jFreeChart8.getBorderPaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
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
        java.lang.Object obj13 = jFreeChart9.getTextAntiAlias();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent2);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder5 = multiplePiePlot4.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot();
        float float8 = multiplePiePlot7.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot7.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart10 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot7);
        java.awt.Paint paint11 = jFreeChart10.getBackgroundPaint();
        java.awt.Stroke stroke12 = jFreeChart10.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener13 = null;
        jFreeChart10.addProgressListener(chartProgressListener13);
        org.jfree.chart.event.ChartProgressListener chartProgressListener15 = null;
        jFreeChart10.removeProgressListener(chartProgressListener15);
        java.awt.Image image17 = jFreeChart10.getBackgroundImage();
        float float18 = jFreeChart10.getBackgroundImageAlpha();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo23 = null;
        java.awt.image.BufferedImage bufferedImage24 = jFreeChart10.createBufferedImage((int) ' ', 100, (double) 10L, 0.0d, chartRenderingInfo23);
        jFreeChart10.setBorderVisible(false);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo31 = null;
        java.awt.image.BufferedImage bufferedImage32 = jFreeChart10.createBufferedImage((int) (short) 10, (int) (byte) 10, 0.0d, (double) (byte) 10, chartRenderingInfo31);
        multiplePiePlot4.setBackgroundImage((java.awt.Image) bufferedImage32);
        multiplePiePlot1.setBackgroundImage((java.awt.Image) bufferedImage32);
        org.junit.Assert.assertNotNull(tableOrder5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(image17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(bufferedImage24);
        org.junit.Assert.assertNotNull(bufferedImage32);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
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
        int int17 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(textTitle11);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        multiplePiePlot1.setForegroundAlpha((float) (byte) 0);
        java.awt.Paint paint7 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        multiplePiePlot1.handleClick((-1), 15, plotRenderingInfo10);
        java.awt.Paint paint12 = multiplePiePlot1.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
        java.awt.image.BufferedImage bufferedImage15 = jFreeChart4.createBufferedImage(10, 15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(bufferedImage15);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        float float5 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
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
        double double14 = multiplePiePlot0.getLimit();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
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
        float float20 = plot19.getForegroundAlpha();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertNotNull(plot19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) "");
        float float10 = multiplePiePlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
        jFreeChart8.setNotify(false);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(legendTitle19);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint4 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setNoDataMessagePaint(paint4);
        java.awt.Font font6 = multiplePiePlot0.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = multiplePiePlot0.getDrawingSupplier();
        java.lang.String str8 = multiplePiePlot0.getNoDataMessage();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot0.getParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.general.DatasetGroup datasetGroup10 = plot9.getDatasetGroup();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(drawingSupplier7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(plot9);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
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
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo21 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.handleClick((int) '4', (int) '4', chartRenderingInfo21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
        java.lang.Object obj16 = jFreeChart11.getTextAntiAlias();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNull(textTitle12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        jFreeChart4.removeLegend();
        org.jfree.chart.title.LegendTitle legendTitle12 = jFreeChart4.getLegend();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertNotNull(legendTitle12);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot0.getDrawingSupplier();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(tableOrder2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertNotNull(drawingSupplier11);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent10);
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
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
        org.jfree.chart.title.LegendTitle legendTitle20 = jFreeChart18.getLegend((int) 'a');
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertNull(legendTitle20);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Paint paint2 = multiplePiePlot0.getNoDataMessagePaint();
        multiplePiePlot0.setForegroundAlpha((float) (-1L));
        java.awt.Paint paint5 = multiplePiePlot0.getOutlinePaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent6);
        float float8 = multiplePiePlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
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
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage24 = jFreeChart8.createBufferedImage((int) (byte) 1, (int) 'a', (-1), chartRenderingInfo23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown image type -1");
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
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
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
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage14 = jFreeChart4.createBufferedImage((int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (-1) and height (0) cannot be <= 0");
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
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
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
        java.awt.Paint paint13 = jFreeChart4.getBorderPaint();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.title.Title title15 = jFreeChart4.getSubtitle((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index out of range.");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(legendTitle12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        java.awt.Image image7 = jFreeChart4.getBackgroundImage();
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
        org.junit.Assert.assertNull(image7);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
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
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(legendTitle19);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
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
        java.awt.Image image15 = jFreeChart4.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(image15);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
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
        int int17 = multiplePiePlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(plot2);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier17);
        multiplePiePlot13.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot13.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset22 = multiplePiePlot13.getDataset();
        java.awt.Paint paint23 = multiplePiePlot13.getOutlinePaint();
        jFreeChart12.setBorderPaint(paint23);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage27 = jFreeChart12.createBufferedImage((-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (-1) and height (-1) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(jFreeChart21);
        org.junit.Assert.assertNull(categoryDataset22);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
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
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertNotNull(plot12);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
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
        org.jfree.chart.event.ChartChangeListener chartChangeListener19 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.addChangeListener(chartChangeListener19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(bufferedImage18);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
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
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage22 = jFreeChart4.createBufferedImage((int) (short) 0, (int) (byte) 0, (double) '#', (double) 1, chartRenderingInfo21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (0) and height (0) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
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
        jFreeChart8.setTextAntiAlias(true);
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
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
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
        java.awt.Image image18 = jFreeChart13.getBackgroundImage();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage22 = jFreeChart13.createBufferedImage(0, (int) ' ', chartRenderingInfo21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (0) and height (32) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(image18);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier6);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        jFreeChart8.setNotify(false);
        jFreeChart8.setAntiAlias(true);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        multiplePiePlot0.setDataset(categoryDataset2);
        java.awt.Font font4 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot0.setNoDataMessageFont(font4);
        boolean boolean6 = multiplePiePlot0.isSubplot();
        java.awt.Paint paint7 = multiplePiePlot0.getOutlinePaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.title.Title title16 = jFreeChart4.getSubtitle((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot0.getParent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = plot15.isOutlineVisible();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + "Other" + "'", comparable14, "Other");
        org.junit.Assert.assertNull(plot15);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
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
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo17 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.draw(graphics2D15, rectangle2D16, chartRenderingInfo17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertNotNull(legendTitle12);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = multiplePiePlot1.getDrawingSupplier();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertNull(drawingSupplier18);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Paint paint6 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setBackgroundPaint(paint6);
        org.jfree.chart.util.TableOrder tableOrder8 = multiplePiePlot0.getDataExtractOrder();
        boolean boolean9 = multiplePiePlot0.isOutlineVisible();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(tableOrder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        float float2 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Stroke stroke3 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot0.setOutlineStroke(stroke3);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) true);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(stroke3);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        multiplePiePlot0.setDataset(categoryDataset2);
        java.awt.Font font4 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot0.setNoDataMessageFont(font4);
        java.lang.String str6 = multiplePiePlot0.getPlotType();
        boolean boolean7 = multiplePiePlot0.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot0.setInsets(rectangleInsets8, false);
        java.awt.Font font11 = multiplePiePlot0.getNoDataMessageFont();
        java.awt.Paint paint12 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.util.TableOrder tableOrder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.setDataExtractOrder(tableOrder13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
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
        boolean boolean17 = jFreeChart13.isBorderVisible();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage21 = jFreeChart13.createBufferedImage((int) 'a', (-1), chartRenderingInfo20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (97) and height (-1) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset9 = multiplePiePlot0.getDataset();
        multiplePiePlot0.setForegroundAlpha(0.0f);
        java.awt.Image image12 = multiplePiePlot0.getBackgroundImage();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.setInsets(rectangleInsets13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNull(categoryDataset9);
        org.junit.Assert.assertNull(image12);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.setInsets(rectangleInsets14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
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
        java.awt.Paint paint17 = multiplePiePlot0.getAggregatedItemsPaint();
        java.awt.Paint paint18 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot0.getParent();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(plot2);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(plot19);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = multiplePiePlot0.getDatasetGroup();
        float float8 = multiplePiePlot0.getBackgroundImageAlpha();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = multiplePiePlot0.getLegendItems();
        java.lang.String str10 = multiplePiePlot0.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset11 = multiplePiePlot0.getDataset();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(categoryDataset11);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        java.lang.Object obj11 = jFreeChart4.getTextAntiAlias();
        int int12 = jFreeChart4.getBackgroundImageAlignment();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage18 = jFreeChart4.createBufferedImage((int) (short) 0, (int) '4', 100.0d, (double) (-1.0f), chartRenderingInfo17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (0) and height (52) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier5);
        java.awt.Image image7 = multiplePiePlot1.getBackgroundImage();
        boolean boolean9 = multiplePiePlot1.equals((java.lang.Object) 1.0f);
        org.jfree.chart.JFreeChart jFreeChart10 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot1);
        multiplePiePlot1.setNoDataMessage("");
        org.jfree.data.general.DatasetGroup datasetGroup13 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent14 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent14);
        java.awt.Font font16 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj18 = multiplePiePlot17.clone();
        multiplePiePlot17.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = null;
        multiplePiePlot17.setDrawingSupplier(drawingSupplier21);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = null;
        multiplePiePlot17.setDrawingSupplier(drawingSupplier23);
        org.jfree.chart.JFreeChart jFreeChart25 = multiplePiePlot17.getPieChart();
        multiplePiePlot17.setNoDataMessage("Other");
        boolean boolean29 = multiplePiePlot17.equals((java.lang.Object) '4');
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot17.getParent();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart32 = new org.jfree.chart.JFreeChart("hi!", font16, plot30, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null 'plot' argument.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(datasetGroup13);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(jFreeChart25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(plot30);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
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
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.handleClick((int) (short) 100, (int) (byte) 1, chartRenderingInfo15);
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
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
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
        multiplePiePlot0.zoom((double) ' ');
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot0.getDrawingSupplier();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertNull(drawingSupplier21);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder2 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent4);
        org.jfree.chart.util.TableOrder tableOrder6 = multiplePiePlot0.getDataExtractOrder();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(tableOrder2);
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertNotNull(tableOrder6);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot0.markerChanged(markerChangeEvent3);
        multiplePiePlot0.setBackgroundImageAlignment((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(plot2);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
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
        float float17 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(textTitle11);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
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
        java.awt.Font font15 = multiplePiePlot0.getNoDataMessageFont();
        float float16 = multiplePiePlot0.getForegroundAlpha();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(datasetGroup12);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
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
            jFreeChart4.addChangeListener(chartChangeListener8);
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
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        multiplePiePlot0.setLimit((double) 0);
        java.awt.Paint paint7 = multiplePiePlot0.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        float float9 = multiplePiePlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        java.awt.Image image7 = jFreeChart4.getBackgroundImage();
        jFreeChart4.setBackgroundImageAlignment((int) '#');
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage13 = jFreeChart4.createBufferedImage((int) 'a', 0, chartRenderingInfo12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (97) and height (0) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNull(image7);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
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
        org.jfree.chart.plot.Plot plot13 = plot8.getParent();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(plot13);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot0.getDatasetGroup();
        java.lang.String str9 = multiplePiePlot0.getNoDataMessage();
        java.lang.Comparable comparable10 = multiplePiePlot0.getAggregatedItemsKey();
        java.awt.Paint paint11 = multiplePiePlot0.getAggregatedItemsPaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
        org.junit.Assert.assertNull(paint11);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
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
        jFreeChart4.setNotify(false);
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
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
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
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.draw(graphics2D17, rectangle2D18);
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
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        java.lang.Object obj11 = jFreeChart4.getTextAntiAlias();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.XYPlot xYPlot12 = jFreeChart4.getXYPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.MultiplePiePlot cannot be cast to org.jfree.chart.plot.XYPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.JFreeChart jFreeChart3 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.drawBackground(graphics2D4, rectangle2D5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = multiplePiePlot0.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
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
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage22 = jFreeChart15.createBufferedImage((int) (short) 100, (int) 'a', (int) (short) 100, chartRenderingInfo21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown image type 100");
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
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        jFreeChart17.fireChartChanged();
        java.lang.Object obj19 = jFreeChart17.clone();
        jFreeChart17.setTextAntiAlias(false);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.setPieChart(jFreeChart17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'pieChart' argument must be a chart based on a PiePlot.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
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
        java.lang.Object obj17 = jFreeChart4.getTextAntiAlias();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.title.Title title19 = jFreeChart4.getSubtitle(15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index out of range.");
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
        org.junit.Assert.assertNull(legendTitle13);
        org.junit.Assert.assertNotNull(textTitle16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        java.awt.Paint paint7 = jFreeChart4.getBorderPaint();
        java.lang.Object obj8 = jFreeChart4.clone();
        java.lang.Object obj9 = jFreeChart4.clone();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.plotChanged(plotChangeEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
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
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
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
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        multiplePiePlot0.setDataset(categoryDataset16);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(title12);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = jFreeChart8.getPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = jFreeChart8.getPadding();
        boolean boolean11 = jFreeChart8.isNotify();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
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
        java.lang.Object obj22 = null;
        boolean boolean23 = multiplePiePlot0.equals(obj22);
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertNotNull(title13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot0.getRootPlot();
        plot9.setOutlineVisible(true);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(plot9);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot0.setInsets(rectangleInsets3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        multiplePiePlot0.setDataset(categoryDataset5);
        java.lang.String str7 = multiplePiePlot0.getPlotType();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent8);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Multiple Pie Plot" + "'", str7, "Multiple Pie Plot");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
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
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage17 = jFreeChart4.createBufferedImage((int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (32) and height (-1) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
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
        java.util.List list12 = jFreeChart4.getSubtitles();
        org.jfree.chart.title.Title title13 = null;
        jFreeChart4.removeSubtitle(title13);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(legendTitle8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(list12);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Paint paint2 = multiplePiePlot0.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot0.setInsets(rectangleInsets3, false);
        multiplePiePlot0.setNoDataMessage("hi!");
        org.jfree.chart.util.TableOrder tableOrder8 = multiplePiePlot0.getDataExtractOrder();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(tableOrder8);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        java.awt.Font font7 = multiplePiePlot0.getNoDataMessageFont();
        java.awt.Font font8 = multiplePiePlot0.getNoDataMessageFont();
        boolean boolean9 = multiplePiePlot0.isSubplot();
        java.awt.Paint paint10 = multiplePiePlot0.getOutlinePaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent5);
        java.awt.Paint paint7 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Paint paint8 = multiplePiePlot1.getBackgroundPaint();
        boolean boolean9 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        double double9 = multiplePiePlot0.getLimit();
        org.jfree.chart.JFreeChart jFreeChart10 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage14 = jFreeChart10.createBufferedImage((-1), (int) (byte) 100, chartRenderingInfo13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (-1) and height (100) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        org.jfree.chart.event.ChartProgressListener chartProgressListener8 = null;
        jFreeChart4.addProgressListener(chartProgressListener8);
        jFreeChart4.setTitle("Other");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.title.Title title27 = jFreeChart8.getSubtitle((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index out of range.");
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
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = jFreeChart4.getPadding();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(bufferedImage18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
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
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D17, rectangle2D18);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
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
        multiplePiePlot0.setOutlineVisible(false);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
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
        java.awt.Paint paint12 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        boolean boolean13 = jFreeChart4.equals((java.lang.Object) paint12);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
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
        java.lang.Comparable comparable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.setAggregatedItemsKey(comparable14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Multiple Pie Plot" + "'", str13, "Multiple Pie Plot");
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = jFreeChart9.getPadding();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
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
        java.awt.image.BufferedImage bufferedImage19 = jFreeChart4.createBufferedImage((int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(bufferedImage19);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage(100, (int) '#', chartRenderingInfo9);
        org.jfree.chart.event.ChartProgressListener chartProgressListener11 = null;
        jFreeChart4.removeProgressListener(chartProgressListener11);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
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
        org.jfree.chart.title.LegendTitle legendTitle16 = jFreeChart4.getLegend((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(legendTitle16);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getRootPlot();
        java.awt.Paint paint3 = multiplePiePlot0.getOutlinePaint();
        java.awt.Paint paint4 = multiplePiePlot0.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(plot2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
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
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(image13);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
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
        jFreeChart4.setBackgroundImageAlpha((float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
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
        boolean boolean14 = multiplePiePlot0.isOutlineVisible();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(plot13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        java.awt.geom.Point2D point2D14 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.draw(graphics2D12, rectangle2D13, point2D14, chartRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(image11);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.Title title10 = jFreeChart8.getSubtitle((int) (byte) 0);
        org.jfree.chart.plot.Plot plot11 = jFreeChart8.getPlot();
        jFreeChart8.setBackgroundImageAlpha((float) '#');
        org.jfree.chart.title.LegendTitle legendTitle15 = jFreeChart8.getLegend((int) (byte) 10);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertNull(legendTitle15);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        multiplePiePlot1.setForegroundAlpha((float) (byte) 0);
        java.awt.Paint paint7 = multiplePiePlot1.getOutlinePaint();
        float float8 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        java.lang.Comparable comparable14 = multiplePiePlot0.getAggregatedItemsKey();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        float float17 = multiplePiePlot16.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot16.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot16);
        java.awt.Paint paint20 = jFreeChart19.getBackgroundPaint();
        java.awt.Stroke stroke21 = jFreeChart19.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle22 = jFreeChart19.getTitle();
        java.awt.Image image23 = jFreeChart19.getBackgroundImage();
        java.awt.Paint paint24 = jFreeChart19.getBorderPaint();
        boolean boolean25 = jFreeChart19.isNotify();
        org.jfree.chart.title.LegendTitle legendTitle27 = jFreeChart19.getLegend((int) (short) 10);
        jFreeChart19.setNotify(true);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.setPieChart(jFreeChart19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'pieChart' argument must be a chart based on a PiePlot.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + "Other" + "'", comparable14, "Other");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(textTitle22);
        org.junit.Assert.assertNull(image23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(legendTitle27);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
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
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.lang.Object obj8 = jFreeChart4.clone();
        java.awt.Paint paint9 = jFreeChart4.getBackgroundPaint();
        jFreeChart4.setAntiAlias(true);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = jFreeChart8.getPadding();
        int int10 = jFreeChart8.getSubtitleCount();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        java.awt.geom.Point2D point2D13 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo14 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.draw(graphics2D11, rectangle2D12, point2D13, chartRenderingInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Font font2 = multiplePiePlot0.getNoDataMessageFont();
        float float3 = multiplePiePlot0.getForegroundAlpha();
        java.awt.Paint paint4 = multiplePiePlot0.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        multiplePiePlot0.setDataset(categoryDataset5);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(font2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertNull(paint4);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart1 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = jFreeChart1.getPadding();
        java.util.List list3 = jFreeChart1.getSubtitles();
        org.jfree.chart.plot.Plot plot4 = jFreeChart1.getPlot();
        org.jfree.chart.JFreeChart jFreeChart5 = new org.jfree.chart.JFreeChart(plot4);
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(plot4);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder1 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder3 = multiplePiePlot2.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        multiplePiePlot0.setDataset(categoryDataset7);
        float float9 = multiplePiePlot0.getForegroundAlpha();
        java.lang.Comparable comparable10 = multiplePiePlot0.getAggregatedItemsKey();
        org.junit.Assert.assertNotNull(tableOrder1);
        org.junit.Assert.assertNotNull(tableOrder3);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertNotNull(legendItemCollection6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint4 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setNoDataMessagePaint(paint4);
        java.awt.Font font6 = multiplePiePlot0.getNoDataMessageFont();
        float float7 = multiplePiePlot0.getBackgroundAlpha();
        java.lang.Object obj8 = multiplePiePlot0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setNoDataMessagePaint(paint5);
        float float7 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart("", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.notifyListeners(plotChangeEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertNotNull(plot9);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot0.getDrawingSupplier();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertNotNull(drawingSupplier11);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
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
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setNoDataMessagePaint(paint5);
        float float7 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart("", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage12 = jFreeChart8.createBufferedImage((int) 'a', (int) (short) 0, chartRenderingInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (97) and height (0) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
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
        java.awt.Paint paint20 = jFreeChart15.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(title12);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNotNull(jFreeChart15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(paint20);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        jFreeChart4.setBackgroundImageAlpha((float) (byte) 0);
        int int9 = jFreeChart4.getSubtitleCount();
        int int10 = jFreeChart4.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
        jFreeChart4.removeLegend();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
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
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage15 = jFreeChart4.createBufferedImage(0, 1);
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
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.awt.Image image6 = jFreeChart4.getBackgroundImage();
        org.jfree.chart.event.ChartProgressListener chartProgressListener7 = null;
        jFreeChart4.addProgressListener(chartProgressListener7);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNull(image6);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        float float18 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot17.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot17);
        jFreeChart20.fireChartChanged();
        java.lang.Object obj22 = jFreeChart20.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo25 = null;
        java.awt.image.BufferedImage bufferedImage26 = jFreeChart20.createBufferedImage((int) '#', 1, chartRenderingInfo25);
        boolean boolean27 = jFreeChart20.isNotify();
        java.awt.Image image28 = jFreeChart20.getBackgroundImage();
        java.lang.Object obj29 = jFreeChart20.getTextAntiAlias();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.setPieChart(jFreeChart20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'pieChart' argument must be a chart based on a PiePlot.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Multiple Pie Plot" + "'", str15, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNotNull(plot19);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(bufferedImage26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(image28);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder2 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.util.TableOrder tableOrder5 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot();
        float float8 = multiplePiePlot7.getBackgroundAlpha();
        java.awt.Paint paint9 = multiplePiePlot7.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart10 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot7);
        float float11 = multiplePiePlot7.getForegroundAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent12 = null;
        multiplePiePlot7.axisChanged(axisChangeEvent12);
        multiplePiePlot7.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot17.getParent();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        float float21 = multiplePiePlot20.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot22 = multiplePiePlot20.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart23 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot20);
        jFreeChart23.fireChartChanged();
        boolean boolean25 = jFreeChart23.getAntiAlias();
        java.awt.Paint paint26 = jFreeChart23.getBorderPaint();
        multiplePiePlot17.setAggregatedItemsPaint(paint26);
        java.awt.Paint paint28 = multiplePiePlot17.getNoDataMessagePaint();
        multiplePiePlot7.setBackgroundPaint(paint28);
        boolean boolean30 = multiplePiePlot0.equals((java.lang.Object) multiplePiePlot7);
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(tableOrder2);
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertNotNull(tableOrder5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNull(plot18);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
        org.junit.Assert.assertNotNull(plot22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
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
        boolean boolean18 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint19 = multiplePiePlot1.getOutlinePaint();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        float float8 = multiplePiePlot0.getForegroundAlpha();
        java.awt.Image image9 = multiplePiePlot0.getBackgroundImage();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(image9);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        multiplePiePlot0.setDataset(categoryDataset11);
        java.lang.String str13 = multiplePiePlot0.getPlotType();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        float float16 = multiplePiePlot15.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot15.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart18 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot15);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.setPieChart(jFreeChart18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'pieChart' argument must be a chart based on a PiePlot.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Multiple Pie Plot" + "'", str13, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(plot17);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        multiplePiePlot0.setForegroundAlpha((-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.setBackgroundImageAlpha((float) 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Font font2 = multiplePiePlot0.getNoDataMessageFont();
        float float3 = multiplePiePlot0.getForegroundAlpha();
        java.awt.Paint paint4 = multiplePiePlot0.getAggregatedItemsPaint();
        multiplePiePlot0.setForegroundAlpha((float) (byte) 0);
        java.awt.Image image7 = multiplePiePlot0.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(font2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertNull(paint4);
        org.junit.Assert.assertNull(image7);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
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
            org.jfree.chart.plot.CategoryPlot categoryPlot9 = jFreeChart4.getCategoryPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.MultiplePiePlot cannot be cast to org.jfree.chart.plot.CategoryPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
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
        org.jfree.chart.event.ChartProgressListener chartProgressListener14 = null;
        jFreeChart11.removeProgressListener(chartProgressListener14);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(plot8);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
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
        boolean boolean15 = jFreeChart13.isBorderVisible();
        jFreeChart13.setBackgroundImageAlignment((int) (byte) 0);
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
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        org.jfree.chart.title.LegendTitle legendTitle12 = jFreeChart4.getLegend();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(legendTitle12);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
        org.jfree.chart.title.TextTitle textTitle13 = jFreeChart9.getTitle();
        boolean boolean14 = jFreeChart9.isNotify();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNull(textTitle13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent2);
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        jFreeChart4.setBackgroundImageAlpha((float) (byte) 0);
        org.jfree.chart.event.ChartProgressListener chartProgressListener9 = null;
        jFreeChart4.removeProgressListener(chartProgressListener9);
        java.awt.Stroke stroke11 = jFreeChart4.getBorderStroke();
        int int12 = jFreeChart4.getBackgroundImageAlignment();
        java.awt.Paint paint13 = jFreeChart4.getBorderPaint();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder2 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot();
        float float4 = multiplePiePlot3.getBackgroundAlpha();
        java.awt.Paint paint5 = multiplePiePlot3.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot3.setInsets(rectangleInsets6, false);
        multiplePiePlot0.setInsets(rectangleInsets6);
        java.lang.Object obj10 = multiplePiePlot0.clone();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(tableOrder2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 10.0f);
        java.awt.Paint paint5 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setNoDataMessagePaint(paint5);
        org.jfree.chart.JFreeChart jFreeChart7 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint8 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.JFreeChart jFreeChart9 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setPieChart(jFreeChart9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'pieChart' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        java.awt.Paint paint8 = jFreeChart4.getBorderPaint();
        jFreeChart4.setTitle("Other");
        java.awt.Paint paint11 = jFreeChart4.getBorderPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = multiplePiePlot12.getDrawingSupplier();
        java.awt.Paint paint14 = multiplePiePlot12.getBackgroundPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj16 = multiplePiePlot15.clone();
        multiplePiePlot15.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = null;
        multiplePiePlot15.setDrawingSupplier(drawingSupplier19);
        multiplePiePlot15.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot15.getPieChart();
        org.jfree.chart.title.Title title25 = jFreeChart23.getSubtitle((int) (byte) 0);
        multiplePiePlot12.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart23);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        multiplePiePlot12.handleClick((int) '4', 0, plotRenderingInfo29);
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.setTextAntiAlias((java.lang.Object) plotRenderingInfo29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null incompatible with Text-specific antialiasing enable key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(drawingSupplier13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(jFreeChart23);
        org.junit.Assert.assertNotNull(title25);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        int int9 = jFreeChart8.getSubtitleCount();
        jFreeChart8.fireChartChanged();
        java.util.List list11 = jFreeChart8.getSubtitles();
        int int12 = jFreeChart8.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        multiplePiePlot0.markerChanged(markerChangeEvent16);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
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
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.draw(graphics2D17, rectangle2D18);
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
        org.junit.Assert.assertNull(legendTitle13);
        org.junit.Assert.assertNotNull(textTitle16);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        multiplePiePlot1.setForegroundAlpha((float) (byte) 0);
        java.awt.Paint paint7 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot1.getDrawingSupplier();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getRootPlot();
        java.awt.Paint paint3 = multiplePiePlot0.getOutlinePaint();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.drawOutline(graphics2D4, rectangle2D5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(plot2);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.awt.Paint paint6 = jFreeChart4.getBorderPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = jFreeChart4.getPadding();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage12 = jFreeChart4.createBufferedImage((int) '#', 0, (int) ' ', chartRenderingInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown image type 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        boolean boolean8 = multiplePiePlot0.equals((java.lang.Object) 1.0f);
        java.awt.Stroke stroke9 = multiplePiePlot0.getOutlineStroke();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot0.getRootPlot();
        org.jfree.chart.util.TableOrder tableOrder11 = multiplePiePlot0.getDataExtractOrder();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertNotNull(tableOrder11);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder1 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder3 = multiplePiePlot2.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot0.getLegendItems();
        java.lang.String str7 = multiplePiePlot0.getNoDataMessage();
        java.awt.Stroke stroke8 = multiplePiePlot0.getOutlineStroke();
        org.junit.Assert.assertNotNull(tableOrder1);
        org.junit.Assert.assertNotNull(tableOrder3);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertNotNull(legendItemCollection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent5);
        java.lang.Object obj7 = multiplePiePlot1.clone();
        java.awt.Paint paint8 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.lang.Comparable comparable10 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNotNull(drawingSupplier2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        jFreeChart4.setTextAntiAlias(false);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.XYPlot xYPlot9 = jFreeChart4.getXYPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.MultiplePiePlot cannot be cast to org.jfree.chart.plot.XYPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo10 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.handleClick((int) (short) 10, 1, chartRenderingInfo10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
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
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo19 = null;
        java.awt.image.BufferedImage bufferedImage20 = jFreeChart4.createBufferedImage((int) '#', 1, 1, chartRenderingInfo19);
        java.lang.Object obj21 = jFreeChart4.clone();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bufferedImage15);
        org.junit.Assert.assertNotNull(bufferedImage20);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        jFreeChart4.setBackgroundImageAlignment(0);
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
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle8 = jFreeChart4.getLegend((int) (short) 0);
        boolean boolean9 = jFreeChart4.isNotify();
        int int10 = jFreeChart4.getBackgroundImageAlignment();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        java.awt.geom.Point2D point2D13 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo14 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.draw(graphics2D11, rectangle2D12, point2D13, chartRenderingInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(legendTitle8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        java.awt.Font font8 = multiplePiePlot0.getNoDataMessageFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot0.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot0.getDataset();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNull(categoryDataset10);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent5);
        multiplePiePlot1.setLimit((double) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        multiplePiePlot0.setDataset(categoryDataset11);
        java.lang.String str13 = multiplePiePlot0.getPlotType();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.drawBackground(graphics2D14, rectangle2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Multiple Pie Plot" + "'", str13, "Multiple Pie Plot");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder1 = multiplePiePlot0.getDataExtractOrder();
        float float2 = multiplePiePlot0.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        org.junit.Assert.assertNotNull(tableOrder1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.5f + "'", float2 == 0.5f);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
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
        java.lang.Object obj16 = jFreeChart4.clone();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(legendTitle13);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
        boolean boolean16 = plot15.isSubplot();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
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
        jFreeChart13.setAntiAlias(false);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier6);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.event.TitleChangeEvent titleChangeEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.titleChanged(titleChangeEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.draw(graphics2D22, rectangle2D23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
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
        org.jfree.data.category.CategoryDataset categoryDataset15 = multiplePiePlot1.getDataset();
        java.lang.String str16 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getParent();
        java.lang.Comparable comparable3 = multiplePiePlot0.getAggregatedItemsKey();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent4 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent4);
        multiplePiePlot0.setBackgroundImageAlpha((float) (byte) 1);
        java.lang.String str8 = multiplePiePlot0.getPlotType();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.drawOutline(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + "Other" + "'", comparable3, "Other");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Multiple Pie Plot" + "'", str8, "Multiple Pie Plot");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        multiplePiePlot0.zoom(0.0d);
        org.jfree.data.general.DatasetGroup datasetGroup7 = multiplePiePlot0.getDatasetGroup();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(datasetGroup7);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.title.LegendTitle legendTitle5 = jFreeChart4.getLegend();
        org.jfree.chart.title.LegendTitle legendTitle6 = jFreeChart4.getLegend();
        boolean boolean7 = jFreeChart4.getAntiAlias();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj9 = multiplePiePlot8.clone();
        multiplePiePlot8.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot8.getDataset();
        java.awt.Image image13 = null;
        multiplePiePlot8.setBackgroundImage(image13);
        java.awt.Font font15 = multiplePiePlot8.getNoDataMessageFont();
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.setTextAntiAlias((java.lang.Object) multiplePiePlot8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: org.jfree.chart.plot.MultiplePiePlot@5820cf55 incompatible with Text-specific antialiasing enable key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(legendTitle5);
        org.junit.Assert.assertNotNull(legendTitle6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(font15);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getRootPlot();
        java.awt.Paint paint9 = plot8.getBackgroundPaint();
        float float10 = plot8.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
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
        java.awt.Paint paint14 = multiplePiePlot2.getAggregatedItemsPaint();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        multiplePiePlot2.drawBackgroundImage(graphics2D15, rectangle2D16);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(paint14);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.JFreeChart jFreeChart2 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        java.awt.Paint paint3 = multiplePiePlot0.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot0.getParent();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj6 = multiplePiePlot5.clone();
        multiplePiePlot5.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot5.setDrawingSupplier(drawingSupplier9);
        multiplePiePlot5.zoom(0.0d);
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot5.getRootPlot();
        java.awt.Paint paint14 = plot13.getBackgroundPaint();
        boolean boolean15 = multiplePiePlot0.equals((java.lang.Object) paint14);
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Paint paint2 = multiplePiePlot0.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = multiplePiePlot0.getInsets();
        org.jfree.chart.util.TableOrder tableOrder4 = multiplePiePlot0.getDataExtractOrder();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(tableOrder4);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        java.awt.Paint paint7 = jFreeChart4.getBorderPaint();
        java.lang.Object obj8 = jFreeChart4.clone();
        jFreeChart4.setAntiAlias(false);
        java.awt.RenderingHints renderingHints11 = jFreeChart4.getRenderingHints();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(renderingHints11);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        multiplePiePlot0.setDataset(categoryDataset2);
        java.awt.Font font4 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot0.setNoDataMessageFont(font4);
        multiplePiePlot0.setForegroundAlpha(100.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = multiplePiePlot0.getInsets();
        boolean boolean9 = multiplePiePlot0.isSubplot();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        float float11 = multiplePiePlot10.getBackgroundAlpha();
        java.awt.Paint paint12 = multiplePiePlot10.getNoDataMessagePaint();
        multiplePiePlot10.setForegroundAlpha((float) (-1L));
        java.awt.Paint paint15 = multiplePiePlot10.getOutlinePaint();
        java.awt.Font font16 = multiplePiePlot10.getNoDataMessageFont();
        java.awt.Paint paint17 = multiplePiePlot10.getOutlinePaint();
        multiplePiePlot0.setBackgroundPaint(paint17);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
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
        boolean boolean13 = jFreeChart4.isNotify();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        jFreeChart4.setBackgroundImageAlpha((float) (byte) 0);
        org.jfree.chart.event.ChartProgressListener chartProgressListener9 = null;
        jFreeChart4.removeProgressListener(chartProgressListener9);
        java.awt.Stroke stroke11 = jFreeChart4.getBorderStroke();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo14 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.draw(graphics2D12, rectangle2D13, chartRenderingInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent5);
        java.awt.Paint paint7 = multiplePiePlot1.getAggregatedItemsPaint();
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier14);
        multiplePiePlot10.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot10.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot10);
        java.awt.Paint paint20 = jFreeChart19.getBackgroundPaint();
        multiplePiePlot1.setOutlinePaint(paint20);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(jFreeChart18);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setNoDataMessagePaint(paint5);
        float float7 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart("", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        double double9 = multiplePiePlot1.getLimit();
        boolean boolean10 = multiplePiePlot1.isOutlineVisible();
        java.awt.Font font11 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(font11);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        jFreeChart4.setTextAntiAlias(false);
        java.awt.Stroke stroke9 = jFreeChart4.getBorderStroke();
        boolean boolean10 = jFreeChart4.isBorderVisible();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
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
        java.lang.Object obj16 = multiplePiePlot15.clone();
        multiplePiePlot15.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = null;
        multiplePiePlot15.setDrawingSupplier(drawingSupplier19);
        multiplePiePlot15.setForegroundAlpha(0.0f);
        multiplePiePlot15.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot15.zoom((double) (byte) 0);
        java.awt.Paint paint27 = multiplePiePlot15.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart28 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot15);
        java.awt.Paint paint29 = multiplePiePlot15.getBackgroundPaint();
        plot11.setBackgroundPaint(paint29);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(paint27);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
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
        jFreeChart4.setTextAntiAlias(true);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart1 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = jFreeChart1.getPadding();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage7 = jFreeChart1.createBufferedImage((int) 'a', 15, (int) 'a', chartRenderingInfo6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown image type 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets2);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
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
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo30 = null;
        java.awt.image.BufferedImage bufferedImage31 = jFreeChart8.createBufferedImage((int) 'a', (int) (byte) 1, (double) ' ', 0.0d, chartRenderingInfo30);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.CategoryPlot categoryPlot32 = jFreeChart8.getCategoryPlot();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bufferedImage31);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        int int8 = jFreeChart4.getBackgroundImageAlignment();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage11 = jFreeChart4.createBufferedImage((int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (0) and height (10) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getParent();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertNull(plot8);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.JFreeChart jFreeChart2 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart4 = multiplePiePlot0.getPieChart();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.notifyListeners(plotChangeEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(jFreeChart4);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) "");
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = multiplePiePlot0.getDrawingSupplier();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = multiplePiePlot0.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(drawingSupplier10);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        multiplePiePlot0.setDataset(categoryDataset2);
        java.awt.Font font4 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot0.setNoDataMessageFont(font4);
        boolean boolean6 = multiplePiePlot0.isSubplot();
        java.lang.String str7 = multiplePiePlot0.getNoDataMessage();
        java.lang.String str8 = multiplePiePlot0.getNoDataMessage();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.Title title10 = jFreeChart8.getSubtitle((int) (byte) 0);
        java.lang.Object obj11 = jFreeChart8.clone();
        boolean boolean12 = jFreeChart8.isNotify();
        org.jfree.chart.title.LegendTitle legendTitle14 = jFreeChart8.getLegend((int) (byte) 0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        float float17 = multiplePiePlot16.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot16.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot16);
        jFreeChart19.fireChartChanged();
        boolean boolean21 = jFreeChart19.getAntiAlias();
        java.awt.Paint paint22 = jFreeChart19.getBorderPaint();
        java.lang.Object obj23 = jFreeChart19.clone();
        java.awt.image.BufferedImage bufferedImage26 = jFreeChart19.createBufferedImage((int) ' ', 1);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = jFreeChart19.getPadding();
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.setTextAntiAlias((java.lang.Object) rectangleInsets27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: RectangleInsets[t=0.0,l=0.0,b=0.0,r=0.0] incompatible with Text-specific antialiasing enable key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(legendTitle14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(bufferedImage26);
        org.junit.Assert.assertNotNull(rectangleInsets27);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
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
        org.jfree.chart.title.TextTitle textTitle13 = jFreeChart9.getTitle();
        int int14 = jFreeChart9.getSubtitleCount();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNull(textTitle13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
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
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo17 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart11.draw(graphics2D15, rectangle2D16, chartRenderingInfo17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder2 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot();
        float float4 = multiplePiePlot3.getBackgroundAlpha();
        java.awt.Paint paint5 = multiplePiePlot3.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot3.setInsets(rectangleInsets6, false);
        multiplePiePlot0.setInsets(rectangleInsets6);
        multiplePiePlot0.setOutlineVisible(false);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent12 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent12);
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(tableOrder2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
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
        org.jfree.chart.event.ChartProgressListener chartProgressListener23 = null;
        jFreeChart14.removeProgressListener(chartProgressListener23);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNull(legendTitle16);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
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
        org.jfree.data.general.DatasetGroup datasetGroup15 = multiplePiePlot0.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(title12);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNull(datasetGroup15);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = multiplePiePlot15.getDrawingSupplier();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        float float19 = multiplePiePlot18.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot18.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot18);
        jFreeChart21.fireChartChanged();
        java.lang.Object obj23 = jFreeChart21.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo26 = null;
        java.awt.image.BufferedImage bufferedImage27 = jFreeChart21.createBufferedImage((int) '#', 1, chartRenderingInfo26);
        boolean boolean28 = jFreeChart21.isNotify();
        java.awt.Paint paint29 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart21.setBorderPaint(paint29);
        multiplePiePlot15.setOutlinePaint(paint29);
        jFreeChart8.setBorderPaint(paint29);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent33 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.plotChanged(plotChangeEvent33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertNotNull(drawingSupplier16);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(bufferedImage27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.lang.Object obj8 = jFreeChart4.clone();
        int int9 = jFreeChart4.getBackgroundImageAlignment();
        org.jfree.chart.title.Title title11 = jFreeChart4.getSubtitle(0);
        float float12 = jFreeChart4.getBackgroundImageAlpha();
        org.jfree.chart.event.TitleChangeEvent titleChangeEvent13 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.titleChanged(titleChangeEvent13);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(title11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.lang.String str3 = multiplePiePlot0.getPlotType();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Multiple Pie Plot" + "'", str3, "Multiple Pie Plot");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        int int3 = multiplePiePlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        float float2 = multiplePiePlot0.getBackgroundAlpha();
        multiplePiePlot0.setOutlineVisible(false);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.drawBackground(graphics2D5, rectangle2D6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent7 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent7);
        org.jfree.chart.JFreeChart jFreeChart9 = multiplePiePlot0.getPieChart();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.drawOutline(graphics2D10, rectangle2D11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertNotNull(jFreeChart9);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
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
        multiplePiePlot0.setBackgroundImageAlpha(0.5f);
        float float17 = multiplePiePlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(title12);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = multiplePiePlot0.getDatasetGroup();
        float float8 = multiplePiePlot0.getForegroundAlpha();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
        multiplePiePlot1.setBackgroundAlpha((float) '4');
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(paint13);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
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
        org.jfree.chart.event.ChartProgressListener chartProgressListener11 = null;
        jFreeChart4.addProgressListener(chartProgressListener11);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
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
        multiplePiePlot1.zoom((double) 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(textTitle11);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint4 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setNoDataMessagePaint(paint4);
        float float6 = multiplePiePlot0.getBackgroundAlpha();
        multiplePiePlot0.setForegroundAlpha((float) 10L);
        java.awt.Paint paint9 = multiplePiePlot0.getNoDataMessagePaint();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.setBackgroundImageAlpha(10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        java.lang.String str8 = multiplePiePlot0.getNoDataMessage();
        multiplePiePlot0.setForegroundAlpha(10.0f);
        java.awt.Stroke stroke11 = multiplePiePlot0.getOutlineStroke();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getRootPlot();
        plot8.setBackgroundImageAlignment((int) (byte) 100);
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart(plot8);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent12 = null;
        plot8.axisChanged(axisChangeEvent12);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(plot8);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj7 = multiplePiePlot6.clone();
        multiplePiePlot6.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot6.setDrawingSupplier(drawingSupplier10);
        java.awt.Image image12 = multiplePiePlot6.getBackgroundImage();
        boolean boolean14 = multiplePiePlot6.equals((java.lang.Object) 1.0f);
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot6);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart15);
        java.awt.Font font17 = multiplePiePlot0.getNoDataMessageFont();
        multiplePiePlot0.setForegroundAlpha((float) 'a');
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        multiplePiePlot0.setDataset(categoryDataset20);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(font17);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint4 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setNoDataMessagePaint(paint4);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent6 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent6);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        int int8 = jFreeChart4.getBackgroundImageAlignment();
        int int9 = jFreeChart4.getSubtitleCount();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        multiplePiePlot0.setBackgroundImageAlignment(15);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent10);
        java.awt.Paint paint12 = multiplePiePlot0.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
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
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.drawOutline(graphics2D20, rectangle2D21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertNotNull(title13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
        java.lang.Object obj17 = jFreeChart4.getTextAntiAlias();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.XYPlot xYPlot18 = jFreeChart4.getXYPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.MultiplePiePlot cannot be cast to org.jfree.chart.plot.XYPlot");
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
        org.junit.Assert.assertNull(legendTitle13);
        org.junit.Assert.assertNotNull(textTitle16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        int int9 = jFreeChart8.getSubtitleCount();
        jFreeChart8.fireChartChanged();
        org.jfree.chart.event.ChartProgressListener chartProgressListener11 = null;
        jFreeChart8.removeProgressListener(chartProgressListener11);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.handleClick((int) ' ', 1, chartRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        boolean boolean8 = multiplePiePlot0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.JFreeChart jFreeChart10 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        int int10 = multiplePiePlot0.getBackgroundImageAlignment();
        java.awt.Paint paint11 = multiplePiePlot0.getAggregatedItemsPaint();
        java.awt.Paint paint12 = multiplePiePlot0.getBackgroundPaint();
        java.lang.Class<?> wildcardClass13 = paint12.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
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
        boolean boolean15 = jFreeChart13.isBorderVisible();
        jFreeChart13.setBackgroundImageAlignment((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.CategoryPlot categoryPlot18 = jFreeChart13.getCategoryPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.MultiplePiePlot cannot be cast to org.jfree.chart.plot.CategoryPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setNoDataMessagePaint(paint5);
        float float7 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart("", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart8.removeLegend();
        java.lang.Object obj10 = jFreeChart8.clone();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent15 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent15);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(paint13);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
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
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot0.getParent();
        java.awt.Paint paint31 = multiplePiePlot0.getOutlinePaint();
        org.junit.Assert.assertNotNull(tableOrder1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
        org.junit.Assert.assertNotNull(bufferedImage20);
        org.junit.Assert.assertNotNull(bufferedImage28);
        org.junit.Assert.assertNull(plot30);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        multiplePiePlot0.setLimit((double) 0);
        multiplePiePlot0.setBackgroundAlpha((float) (-1));
        java.lang.Object obj9 = multiplePiePlot0.clone();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot0.getDrawingSupplier();
        float float22 = multiplePiePlot0.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Multiple Pie Plot" + "'", str12, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
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
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder1 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder3 = multiplePiePlot2.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D6, rectangle2D7);
        org.junit.Assert.assertNotNull(tableOrder1);
        org.junit.Assert.assertNotNull(tableOrder3);
        org.junit.Assert.assertNull(categoryDataset5);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        int int9 = jFreeChart8.getSubtitleCount();
        jFreeChart8.fireChartChanged();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent11 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.plotChanged(plotChangeEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.setTitle("");
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage9 = jFreeChart4.createBufferedImage((-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (-1) and height (10) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        int int9 = jFreeChart8.getSubtitleCount();
        jFreeChart8.fireChartChanged();
        org.jfree.chart.event.ChartProgressListener chartProgressListener11 = null;
        jFreeChart8.removeProgressListener(chartProgressListener11);
        java.awt.Paint paint13 = jFreeChart8.getBorderPaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        jFreeChart8.setBorderVisible(true);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(plot11);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = multiplePiePlot18.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder20 = multiplePiePlot18.getDataExtractOrder();
        multiplePiePlot18.zoom((double) (short) -1);
        int int23 = multiplePiePlot18.getBackgroundImageAlignment();
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart13.setTextAntiAlias((java.lang.Object) int23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 15 incompatible with Text-specific antialiasing enable key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(drawingSupplier19);
        org.junit.Assert.assertNotNull(tableOrder20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder2 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = multiplePiePlot0.getLegendItems();
        java.awt.Paint paint4 = multiplePiePlot0.getBackgroundPaint();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(tableOrder2);
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.awt.Paint paint6 = jFreeChart4.getBorderPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj8 = multiplePiePlot7.clone();
        multiplePiePlot7.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot7.setDrawingSupplier(drawingSupplier11);
        multiplePiePlot7.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart15 = multiplePiePlot7.getPieChart();
        multiplePiePlot7.setForegroundAlpha((-1.0f));
        java.awt.Paint paint18 = multiplePiePlot7.getBackgroundPaint();
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.setTextAntiAlias((java.lang.Object) multiplePiePlot7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: org.jfree.chart.plot.MultiplePiePlot@51bdff29 incompatible with Text-specific antialiasing enable key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(jFreeChart15);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        float float18 = multiplePiePlot0.getBackgroundAlpha();
        boolean boolean19 = multiplePiePlot0.isSubplot();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(plot7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
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
        org.jfree.chart.event.ChartChangeListener chartChangeListener18 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart14.addChangeListener(chartChangeListener18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNull(legendTitle16);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
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
        org.jfree.chart.title.LegendTitle legendTitle20 = jFreeChart13.getLegend();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(legendTitle20);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.lang.Object obj8 = jFreeChart4.clone();
        java.awt.Paint paint9 = jFreeChart4.getBorderPaint();
        jFreeChart4.setBackgroundImageAlignment((int) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        int int5 = jFreeChart4.getBackgroundImageAlignment();
        float float6 = jFreeChart4.getBackgroundImageAlpha();
        jFreeChart4.setBackgroundImageAlignment((-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        java.awt.RenderingHints renderingHints7 = jFreeChart4.getRenderingHints();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renderingHints7);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        multiplePiePlot0.setForegroundAlpha((-1.0f));
        java.awt.Stroke stroke11 = multiplePiePlot0.getOutlineStroke();
        multiplePiePlot0.setLimit((double) '#');
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
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
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.handleClick((int) (short) 100, (int) (short) 0, chartRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent8);
        boolean boolean10 = multiplePiePlot0.isSubplot();
        java.lang.String str11 = multiplePiePlot0.getNoDataMessage();
        java.awt.Paint paint12 = multiplePiePlot0.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.XYPlot xYPlot14 = jFreeChart11.getXYPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.MultiplePiePlot cannot be cast to org.jfree.chart.plot.XYPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(plot10);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        double double2 = multiplePiePlot0.getLimit();
        float float3 = multiplePiePlot0.getBackgroundImageAlpha();
        java.lang.String str4 = multiplePiePlot0.getPlotType();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Multiple Pie Plot" + "'", str4, "Multiple Pie Plot");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
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
        org.jfree.chart.plot.Plot plot15 = jFreeChart8.getPlot();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo18 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.handleClick(0, (int) (byte) 0, chartRenderingInfo18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertNotNull(plot15);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder1 = multiplePiePlot0.getDataExtractOrder();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.setBackgroundImageAlpha((float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tableOrder1);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        boolean boolean8 = multiplePiePlot0.equals((java.lang.Object) 1.0f);
        java.awt.Stroke stroke9 = multiplePiePlot0.getOutlineStroke();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot0.getRootPlot();
        plot10.zoom((double) 100);
        boolean boolean13 = plot10.isSubplot();
        plot10.setBackgroundImageAlpha(1.0f);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot0.getDatasetGroup();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = multiplePiePlot0.getDrawingSupplier();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNull(drawingSupplier9);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        java.awt.Image image7 = multiplePiePlot0.getBackgroundImage();
        multiplePiePlot0.setBackgroundAlpha((float) (-1));
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.drawBackground(graphics2D10, rectangle2D11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertNull(image7);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.title.Title title11 = jFreeChart7.getSubtitle((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        jFreeChart4.setNotify(true);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = multiplePiePlot0.getInsets();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(tableOrder2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.awt.Paint paint3 = multiplePiePlot0.getOutlinePaint();
        multiplePiePlot0.setOutlineVisible(true);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot();
        float float8 = multiplePiePlot7.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot7.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart10 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot7);
        jFreeChart10.fireChartChanged();
        java.lang.Object obj12 = jFreeChart10.clone();
        java.awt.Paint paint13 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart10.setBackgroundPaint(paint13);
        org.jfree.chart.event.ChartProgressListener chartProgressListener15 = null;
        jFreeChart10.addProgressListener(chartProgressListener15);
        boolean boolean17 = multiplePiePlot0.equals((java.lang.Object) chartProgressListener15);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = multiplePiePlot0.getInsets();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(rectangleInsets18);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent16 = null;
        plot15.datasetChanged(datasetChangeEvent16);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(plot15);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.awt.Paint paint3 = multiplePiePlot0.getOutlinePaint();
        multiplePiePlot0.setOutlineVisible(true);
        java.awt.Font font6 = multiplePiePlot0.getNoDataMessageFont();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        java.awt.geom.Point2D point2D9 = null;
        org.jfree.chart.plot.PlotState plotState10 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.draw(graphics2D7, rectangle2D8, point2D9, plotState10, plotRenderingInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(font6);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        boolean boolean8 = jFreeChart4.isNotify();
        java.awt.Image image9 = jFreeChart4.getBackgroundImage();
        java.awt.Stroke stroke10 = jFreeChart4.getBorderStroke();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.handleClick(15, (int) (byte) 100, chartRenderingInfo13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        multiplePiePlot0.setNoDataMessage("hi!");
        multiplePiePlot0.setForegroundAlpha((float) ' ');
        java.awt.Stroke stroke11 = multiplePiePlot0.getOutlineStroke();
        java.lang.String str12 = multiplePiePlot0.getPlotType();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Multiple Pie Plot" + "'", str12, "Multiple Pie Plot");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot0.getDatasetGroup();
        java.lang.String str9 = multiplePiePlot0.getNoDataMessage();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = multiplePiePlot0.getInsets();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        java.awt.Paint paint17 = multiplePiePlot0.getAggregatedItemsPaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNull(paint17);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.title.Title title14 = jFreeChart8.getSubtitle((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.Title title10 = jFreeChart8.getSubtitle((int) (byte) 0);
        java.lang.Object obj11 = jFreeChart8.clone();
        boolean boolean12 = jFreeChart8.isNotify();
        org.jfree.chart.title.LegendTitle legendTitle14 = jFreeChart8.getLegend((int) (byte) 0);
        java.lang.Object obj15 = jFreeChart8.getTextAntiAlias();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(legendTitle14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
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
        boolean boolean12 = jFreeChart11.getAntiAlias();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.title.Title title14 = jFreeChart11.getSubtitle((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        multiplePiePlot1.setForegroundAlpha((float) (byte) 0);
        java.awt.Paint paint7 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        multiplePiePlot1.handleClick((-1), 15, plotRenderingInfo10);
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(plot12);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        jFreeChart17.fireChartChanged();
        boolean boolean19 = jFreeChart17.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle21 = jFreeChart17.getLegend((int) (short) 0);
        boolean boolean22 = jFreeChart17.isNotify();
        float float23 = jFreeChart17.getBackgroundImageAlpha();
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.setTextAntiAlias((java.lang.Object) jFreeChart17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: org.jfree.chart.JFreeChart@7445c6e2 incompatible with Text-specific antialiasing enable key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(legendTitle21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.5f + "'", float23 == 0.5f);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = multiplePiePlot27.getDrawingSupplier();
        org.jfree.chart.JFreeChart jFreeChart29 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot27);
        java.awt.Image image30 = multiplePiePlot27.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart31 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot27);
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.setTextAntiAlias((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! incompatible with Text-specific antialiasing enable key");
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
        org.junit.Assert.assertNull(legendTitle25);
        org.junit.Assert.assertNotNull(drawingSupplier28);
        org.junit.Assert.assertNull(image30);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
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
        org.jfree.chart.event.ChartChangeListener chartChangeListener32 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.removeChangeListener(chartChangeListener32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(paint28);
        org.junit.Assert.assertNotNull(rectangleInsets30);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
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
        java.awt.Image image36 = jFreeChart8.getBackgroundImage();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertNotNull(legendTitle12);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(jFreeChart23);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertNull(image36);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
        jFreeChart4.setBackgroundImageAlpha((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        java.awt.Paint paint7 = jFreeChart4.getBorderPaint();
        java.lang.Object obj8 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage14 = jFreeChart4.createBufferedImage((int) (short) 100, (int) (byte) -1, (double) (byte) 10, (double) '#', chartRenderingInfo13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (100) and height (-1) cannot be <= 0");
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
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getRootPlot();
        java.awt.Paint paint3 = plot2.getBackgroundPaint();
        org.jfree.data.general.DatasetGroup datasetGroup4 = plot2.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(plot2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(datasetGroup4);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle8 = jFreeChart4.getLegend((int) (short) 0);
        boolean boolean9 = jFreeChart4.isNotify();
        jFreeChart4.setBackgroundImageAlpha(0.0f);
        jFreeChart4.setBackgroundImageAlpha((float) (short) 1);
        jFreeChart4.setBorderVisible(true);
        org.jfree.chart.event.ChartChangeListener chartChangeListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.addChangeListener(chartChangeListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(legendTitle8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
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
        java.awt.Stroke stroke13 = multiplePiePlot0.getOutlineStroke();
        boolean boolean14 = multiplePiePlot0.isOutlineVisible();
        java.lang.String str15 = multiplePiePlot0.getPlotType();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Multiple Pie Plot" + "'", str15, "Multiple Pie Plot");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
        java.lang.Comparable comparable22 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Multiple Pie Plot" + "'", str13, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNull(plot20);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + "Other" + "'", comparable22, "Other");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder1 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder3 = multiplePiePlot2.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot0.getLegendItems();
        java.lang.String str7 = multiplePiePlot0.getNoDataMessage();
        boolean boolean8 = multiplePiePlot0.isOutlineVisible();
        org.junit.Assert.assertNotNull(tableOrder1);
        org.junit.Assert.assertNotNull(tableOrder3);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertNotNull(legendItemCollection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
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
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage16 = jFreeChart4.createBufferedImage((int) (short) -1, (int) 'a', chartRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (-1) and height (97) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
        float float24 = jFreeChart8.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(legendTitle19);
        org.junit.Assert.assertNull(textTitle23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.5f + "'", float24 == 0.5f);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        java.awt.Font font1 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot();
        float float4 = multiplePiePlot3.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot3.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart6 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot3);
        multiplePiePlot3.setForegroundAlpha((float) (byte) 0);
        java.awt.Paint paint9 = multiplePiePlot3.getOutlinePaint();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart("hi!", font1, (org.jfree.chart.plot.Plot) multiplePiePlot3, true);
        org.jfree.chart.title.LegendTitle legendTitle12 = jFreeChart11.getLegend();
        org.jfree.chart.plot.Plot plot13 = jFreeChart11.getPlot();
        org.junit.Assert.assertNotNull(font1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(legendTitle12);
        org.junit.Assert.assertNotNull(plot13);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder1 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder3 = multiplePiePlot2.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        multiplePiePlot0.setDataset(categoryDataset7);
        multiplePiePlot0.setLimit((double) (short) 1);
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot0.getParent();
        org.junit.Assert.assertNotNull(tableOrder1);
        org.junit.Assert.assertNotNull(tableOrder3);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertNotNull(legendItemCollection6);
        org.junit.Assert.assertNull(plot11);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
        java.awt.RenderingHints renderingHints22 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart21.setRenderingHints(renderingHints22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: RenderingHints given are null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        org.jfree.chart.title.LegendTitle legendTitle13 = jFreeChart9.getLegend();
        jFreeChart9.setAntiAlias(false);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(legendTitle13);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        jFreeChart4.setTitle("hi!");
        jFreeChart4.setTitle("Multiple Pie Plot");
        java.util.List list11 = jFreeChart4.getSubtitles();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        java.util.List list8 = jFreeChart4.getSubtitles();
        java.awt.RenderingHints renderingHints9 = jFreeChart4.getRenderingHints();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage15 = jFreeChart4.createBufferedImage((int) (short) -1, 15, (double) (byte) 0, (double) 1.0f, chartRenderingInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (-1) and height (15) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(list8);
        org.junit.Assert.assertNotNull(renderingHints9);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.JFreeChart jFreeChart2 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart4 = multiplePiePlot0.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(jFreeChart4);
        org.junit.Assert.assertNull(categoryDataset5);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
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
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        java.awt.geom.Point2D point2D17 = null;
        org.jfree.chart.plot.PlotState plotState18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.draw(graphics2D15, rectangle2D16, point2D17, plotState18, plotRenderingInfo19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent2);
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        multiplePiePlot1.setDataset(categoryDataset5);
        org.junit.Assert.assertNotNull(legendItemCollection4);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setNoDataMessagePaint(paint5);
        float float7 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart("", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.event.ChartChangeListener chartChangeListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.removeChangeListener(chartChangeListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint4 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setNoDataMessagePaint(paint4);
        java.awt.Font font6 = multiplePiePlot0.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = multiplePiePlot0.getDrawingSupplier();
        multiplePiePlot0.setNoDataMessage("Multiple Pie Plot");
        float float10 = multiplePiePlot0.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(drawingSupplier7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 10.0f);
        java.awt.Paint paint5 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setNoDataMessagePaint(paint5);
        org.jfree.chart.JFreeChart jFreeChart7 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        float float8 = multiplePiePlot1.getForegroundAlpha();
        multiplePiePlot1.setLimit(1.0d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
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
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage25 = jFreeChart8.createBufferedImage((-1), 1, chartRenderingInfo24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (-1) and height (1) cannot be <= 0");
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
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getRootPlot();
        plot8.setBackgroundImageAlignment((int) (byte) 100);
        java.awt.Paint paint11 = null;
        plot8.setBackgroundPaint(paint11);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        plot8.drawBackground(graphics2D13, rectangle2D14);
        org.jfree.chart.plot.Plot plot16 = plot8.getRootPlot();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(plot16);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.awt.Image image8 = jFreeChart4.getBackgroundImage();
        jFreeChart4.removeLegend();
        java.awt.Stroke stroke10 = jFreeChart4.getBorderStroke();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        int int10 = multiplePiePlot0.getBackgroundImageAlignment();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot0.getDrawingSupplier();
        int int12 = multiplePiePlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNull(drawingSupplier11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        java.awt.Paint paint7 = jFreeChart4.getBorderPaint();
        java.lang.Object obj8 = jFreeChart4.clone();
        java.awt.image.BufferedImage bufferedImage11 = jFreeChart4.createBufferedImage((int) ' ', 1);
        jFreeChart4.setTextAntiAlias(true);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(bufferedImage11);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
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
        multiplePiePlot7.setOutlineVisible(false);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(plot2);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(font18);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Paint paint6 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setBackgroundPaint(paint6);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getParent();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(plot8);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        boolean boolean5 = multiplePiePlot0.isOutlineVisible();
        multiplePiePlot0.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        multiplePiePlot0.handleClick((int) (byte) -1, (int) 'a', plotRenderingInfo10);
        java.awt.Stroke stroke12 = multiplePiePlot0.getOutlineStroke();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = jFreeChart11.getPadding();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage19 = jFreeChart11.createBufferedImage((int) (short) 0, (int) '#', (int) (byte) 0, chartRenderingInfo18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown image type 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(rectangleInsets14);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.JFreeChart jFreeChart2 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        java.awt.Paint paint4 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.setNoDataMessagePaint(paint4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNull(image3);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
        org.jfree.chart.LegendItemCollection legendItemCollection14 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.LegendItemCollection legendItemCollection15 = multiplePiePlot0.getLegendItems();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertNotNull(legendItemCollection15);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        multiplePiePlot1.setForegroundAlpha((float) (byte) 0);
        java.awt.Paint paint7 = multiplePiePlot1.getOutlinePaint();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart4.setBackgroundPaint(paint7);
        jFreeChart4.setTextAntiAlias(false);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
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
        java.lang.Object obj15 = jFreeChart4.getTextAntiAlias();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(legendTitle12);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        org.jfree.chart.title.LegendTitle legendTitle11 = jFreeChart4.getLegend();
        java.lang.Object obj12 = jFreeChart4.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.XYPlot xYPlot13 = jFreeChart4.getXYPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.MultiplePiePlot cannot be cast to org.jfree.chart.plot.XYPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertNotNull(legendTitle11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
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
        java.lang.Object obj12 = null;
        boolean boolean13 = jFreeChart4.equals(obj12);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
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
        java.awt.Image image16 = multiplePiePlot0.getBackgroundImage();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(image16);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
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
        java.awt.Paint paint15 = jFreeChart4.getBorderPaint();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(legendTitle12);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.awt.Paint paint3 = multiplePiePlot0.getOutlinePaint();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        java.awt.geom.Point2D point2D6 = null;
        org.jfree.chart.plot.PlotState plotState7 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.draw(graphics2D4, rectangle2D5, point2D6, plotState7, plotRenderingInfo8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        java.awt.Paint paint7 = multiplePiePlot0.getNoDataMessagePaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent8);
        multiplePiePlot0.setBackgroundAlpha((float) (byte) -1);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot0.setDataset(categoryDataset12);
        multiplePiePlot0.setBackgroundImageAlpha(1.0f);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
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
        org.jfree.chart.event.TitleChangeEvent titleChangeEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.titleChanged(titleChangeEvent12);
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
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
        multiplePiePlot2.zoom((double) 1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + "Other" + "'", comparable14, "Other");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        multiplePiePlot0.setDataset(categoryDataset11);
        java.awt.Paint paint13 = multiplePiePlot0.getBackgroundPaint();
        multiplePiePlot0.setLimit((double) (byte) 100);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        multiplePiePlot1.setForegroundAlpha((float) (byte) 0);
        org.jfree.chart.JFreeChart jFreeChart7 = multiplePiePlot1.getPieChart();
        jFreeChart7.removeLegend();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart7.handleClick((int) (short) 0, 0, chartRenderingInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
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
        int int17 = jFreeChart16.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
        int int20 = jFreeChart14.getSubtitleCount();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNull(legendTitle16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        multiplePiePlot0.setDataset(categoryDataset2);
        java.awt.Font font4 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot0.setNoDataMessageFont(font4);
        java.lang.String str6 = multiplePiePlot0.getPlotType();
        boolean boolean7 = multiplePiePlot0.isSubplot();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getParent();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(plot8);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        boolean boolean5 = multiplePiePlot0.isOutlineVisible();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot0.getRootPlot();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 1);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(plot6);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
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
        org.jfree.chart.plot.Plot plot15 = jFreeChart8.getPlot();
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        plot15.addChangeListener(plotChangeListener16);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertNotNull(plot15);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
        java.lang.Object obj11 = jFreeChart8.clone();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.CategoryPlot categoryPlot12 = jFreeChart8.getCategoryPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.PiePlot cannot be cast to org.jfree.chart.plot.CategoryPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        boolean boolean8 = multiplePiePlot0.equals((java.lang.Object) 1.0f);
        java.awt.Stroke stroke9 = multiplePiePlot0.getOutlineStroke();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot0.getRootPlot();
        plot10.zoom((double) 100);
        boolean boolean13 = plot10.isSubplot();
        plot10.zoom((double) 1.0f);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Paint paint2 = multiplePiePlot0.getNoDataMessagePaint();
        multiplePiePlot0.setForegroundAlpha((float) (-1L));
        java.awt.Paint paint5 = multiplePiePlot0.getOutlinePaint();
        java.awt.Font font6 = multiplePiePlot0.getNoDataMessageFont();
        int int7 = multiplePiePlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj29 = multiplePiePlot28.clone();
        multiplePiePlot28.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier32 = null;
        multiplePiePlot28.setDrawingSupplier(drawingSupplier32);
        multiplePiePlot28.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart36 = multiplePiePlot28.getPieChart();
        java.awt.Image image37 = null;
        multiplePiePlot28.setBackgroundImage(image37);
        org.jfree.chart.JFreeChart jFreeChart39 = multiplePiePlot28.getPieChart();
        java.awt.Image image40 = jFreeChart39.getBackgroundImage();
        jFreeChart39.clearSubtitles();
        java.awt.Stroke stroke42 = jFreeChart39.getBorderStroke();
        jFreeChart18.setBorderStroke(stroke42);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(legendTitle22);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(jFreeChart36);
        org.junit.Assert.assertNotNull(jFreeChart39);
        org.junit.Assert.assertNull(image40);
        org.junit.Assert.assertNotNull(stroke42);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.JFreeChart jFreeChart2 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        java.awt.Paint paint3 = multiplePiePlot0.getBackgroundPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        multiplePiePlot0.handleClick((int) 'a', (int) (byte) 0, plotRenderingInfo6);
        java.lang.Object obj8 = multiplePiePlot0.clone();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.lang.Comparable comparable3 = multiplePiePlot0.getAggregatedItemsKey();
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot0.getParent();
        org.jfree.chart.event.PlotChangeListener plotChangeListener5 = null;
        multiplePiePlot0.addChangeListener(plotChangeListener5);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.setBackgroundImageAlpha((float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + "Other" + "'", comparable3, "Other");
        org.junit.Assert.assertNull(plot4);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj7 = multiplePiePlot6.clone();
        multiplePiePlot6.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot6.setDrawingSupplier(drawingSupplier10);
        java.awt.Image image12 = multiplePiePlot6.getBackgroundImage();
        boolean boolean14 = multiplePiePlot6.equals((java.lang.Object) 1.0f);
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot6);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart15);
        java.awt.Paint paint17 = multiplePiePlot0.getAggregatedItemsPaint();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(paint17);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent8);
        boolean boolean10 = multiplePiePlot0.isSubplot();
        boolean boolean11 = multiplePiePlot0.isSubplot();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        org.jfree.chart.event.ChartChangeListener chartChangeListener6 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.removeChangeListener(chartChangeListener6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
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
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart11.draw(graphics2D12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(plot10);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
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
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        multiplePiePlot1.setDataset(categoryDataset17);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent19);
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
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
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
        java.awt.Paint paint18 = jFreeChart13.getBorderPaint();
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
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        java.awt.Font font5 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.JFreeChart jFreeChart6 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint7 = multiplePiePlot1.getOutlinePaint();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
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
        multiplePiePlot0.setForegroundAlpha((float) (byte) 0);
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertNotNull(title13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        double double8 = multiplePiePlot0.getLimit();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj15 = multiplePiePlot14.clone();
        multiplePiePlot14.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot14.setDrawingSupplier(drawingSupplier18);
        multiplePiePlot14.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot14.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = jFreeChart22.getPadding();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot();
        float float26 = multiplePiePlot25.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot27 = multiplePiePlot25.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart28 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot25);
        jFreeChart28.fireChartChanged();
        boolean boolean30 = jFreeChart28.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle32 = jFreeChart28.getLegend((int) (short) 0);
        jFreeChart22.removeSubtitle((org.jfree.chart.title.Title) legendTitle32);
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.addSubtitle((int) (short) -1, (org.jfree.chart.title.Title) legendTitle32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'index' argument is out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(jFreeChart22);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 1.0f + "'", float26 == 1.0f);
        org.junit.Assert.assertNotNull(plot27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(legendTitle32);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
        jFreeChart8.setNotify(false);
        jFreeChart8.fireChartChanged();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        multiplePiePlot0.setBackgroundAlpha(10.0f);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        float float9 = multiplePiePlot8.getBackgroundAlpha();
        java.awt.Paint paint10 = multiplePiePlot8.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot8);
        multiplePiePlot0.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        int int13 = multiplePiePlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        java.lang.String str14 = multiplePiePlot0.getPlotType();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(plot13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Multiple Pie Plot" + "'", str14, "Multiple Pie Plot");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
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
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        java.awt.geom.Point2D point2D19 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo20 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart13.draw(graphics2D17, rectangle2D18, point2D19, chartRenderingInfo20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getParent();
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        float float4 = multiplePiePlot0.getForegroundAlpha();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj7 = multiplePiePlot6.clone();
        multiplePiePlot6.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot6.setDrawingSupplier(drawingSupplier10);
        java.awt.Image image12 = multiplePiePlot6.getBackgroundImage();
        boolean boolean14 = multiplePiePlot6.equals((java.lang.Object) 1.0f);
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot6);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart15);
        java.awt.Font font17 = multiplePiePlot0.getNoDataMessageFont();
        multiplePiePlot0.setBackgroundImageAlignment((int) (byte) 10);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(font17);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        multiplePiePlot0.setDataset(categoryDataset2);
        java.awt.Font font4 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot0.setNoDataMessageFont(font4);
        multiplePiePlot0.setForegroundAlpha(100.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = multiplePiePlot0.getInsets();
        boolean boolean9 = multiplePiePlot0.isSubplot();
        org.jfree.data.general.DatasetGroup datasetGroup10 = multiplePiePlot0.getDatasetGroup();
        java.awt.Paint paint11 = multiplePiePlot0.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(datasetGroup10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot0.getDrawingSupplier();
        java.lang.String str9 = multiplePiePlot0.getPlotType();
        org.jfree.chart.LegendItemCollection legendItemCollection10 = multiplePiePlot0.getLegendItems();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(drawingSupplier8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Multiple Pie Plot" + "'", str9, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(legendItemCollection10);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 10.0f);
        java.awt.Paint paint5 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setNoDataMessagePaint(paint5);
        org.jfree.chart.JFreeChart jFreeChart7 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage10 = jFreeChart7.createBufferedImage((int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (0) and height (0) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
        jFreeChart4.setTextAntiAlias(true);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(legendTitle8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 10.0f);
        java.awt.Paint paint4 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setNoDataMessagePaint(paint4);
        boolean boolean6 = multiplePiePlot0.isOutlineVisible();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        java.awt.geom.Point2D point2D9 = null;
        org.jfree.chart.plot.PlotState plotState10 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.draw(graphics2D7, rectangle2D8, point2D9, plotState10, plotRenderingInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = jFreeChart8.getPadding();
        float float14 = jFreeChart8.getBackgroundImageAlpha();
        java.awt.image.BufferedImage bufferedImage17 = jFreeChart8.createBufferedImage(15, (int) (short) 100);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
        org.junit.Assert.assertNotNull(bufferedImage17);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        jFreeChart4.setBackgroundImageAlpha((float) (byte) 0);
        int int9 = jFreeChart4.getSubtitleCount();
        boolean boolean10 = jFreeChart4.isNotify();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundAlpha((float) 1L);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot4.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder6 = multiplePiePlot4.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder6);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D8, rectangle2D9);
        boolean boolean11 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(tableOrder6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj7 = multiplePiePlot6.clone();
        multiplePiePlot6.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint10 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot6.setNoDataMessagePaint(paint10);
        java.awt.Font font12 = multiplePiePlot6.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = multiplePiePlot6.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier13);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(drawingSupplier13);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundAlpha((float) 1L);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        multiplePiePlot1.setDataset(categoryDataset4);
        boolean boolean6 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.lang.Comparable comparable3 = multiplePiePlot0.getAggregatedItemsKey();
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot0.getParent();
        org.jfree.chart.JFreeChart jFreeChart5 = multiplePiePlot0.getPieChart();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo8 = null;
        java.awt.image.BufferedImage bufferedImage9 = jFreeChart5.createBufferedImage((int) (byte) 10, (int) (byte) 100, chartRenderingInfo8);
        java.awt.Paint paint10 = jFreeChart5.getBackgroundPaint();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + "Other" + "'", comparable3, "Other");
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertNotNull(bufferedImage9);
        org.junit.Assert.assertNull(paint10);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        java.awt.Image image7 = jFreeChart4.getBackgroundImage();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.CategoryPlot categoryPlot8 = jFreeChart4.getCategoryPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.MultiplePiePlot cannot be cast to org.jfree.chart.plot.CategoryPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNull(image7);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
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
        jFreeChart14.setBorderVisible(true);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        boolean boolean5 = multiplePiePlot0.isOutlineVisible();
        multiplePiePlot0.setBackgroundImageAlignment((int) (short) 1);
        multiplePiePlot0.zoom(0.0d);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.JFreeChart jFreeChart3 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        int int4 = multiplePiePlot0.getBackgroundImageAlignment();
        java.lang.String str5 = multiplePiePlot0.getNoDataMessage();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
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
        int int16 = jFreeChart4.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(legendTitle8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(bufferedImage15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
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
        jFreeChart14.clearSubtitles();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNull(legendTitle16);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.JFreeChart jFreeChart2 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        java.lang.Object obj3 = multiplePiePlot0.clone();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent4 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent4);
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', (int) (byte) 1, 1.0d, (double) 1, chartRenderingInfo9);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(bufferedImage10);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getRootPlot();
        float float9 = multiplePiePlot0.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
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
        java.lang.String str12 = multiplePiePlot1.getPlotType();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        java.awt.geom.Point2D point2D15 = null;
        org.jfree.chart.plot.PlotState plotState16 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D13, rectangle2D14, point2D15, plotState16, plotRenderingInfo17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Multiple Pie Plot" + "'", str12, "Multiple Pie Plot");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        multiplePiePlot0.setNoDataMessage("hi!");
        int int9 = multiplePiePlot0.getBackgroundImageAlignment();
        java.lang.String str10 = multiplePiePlot0.getNoDataMessage();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        float float17 = multiplePiePlot16.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot16.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot16);
        multiplePiePlot16.setForegroundAlpha((float) (byte) 0);
        java.awt.Paint paint22 = multiplePiePlot16.getOutlinePaint();
        jFreeChart4.setBackgroundPaint(paint22);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertNotNull(legendTitle11);
        org.junit.Assert.assertNotNull(renderingHints12);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
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
        jFreeChart9.fireChartChanged();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertNotNull(title12);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
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
        jFreeChart4.setTextAntiAlias(false);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder2 = multiplePiePlot0.getDataExtractOrder();
        multiplePiePlot0.zoom((double) (short) -1);
        int int5 = multiplePiePlot0.getBackgroundImageAlignment();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent6);
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(tableOrder2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = jFreeChart8.getPadding();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleInsets25);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.awt.Paint paint3 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent4);
        java.lang.Object obj6 = multiplePiePlot0.clone();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        multiplePiePlot0.setDataset(categoryDataset7);
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
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
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.draw(graphics2D18, rectangle2D19);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(rectangleInsets16);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint4 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setNoDataMessagePaint(paint4);
        multiplePiePlot0.setForegroundAlpha(10.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = multiplePiePlot0.getInsets();
        java.awt.Image image9 = multiplePiePlot0.getBackgroundImage();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        float float12 = multiplePiePlot11.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot11.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot11);
        java.awt.Paint paint15 = jFreeChart14.getBackgroundPaint();
        java.awt.Stroke stroke16 = jFreeChart14.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle17 = jFreeChart14.getTitle();
        java.lang.Object obj18 = jFreeChart14.clone();
        java.awt.Stroke stroke19 = jFreeChart14.getBorderStroke();
        java.awt.Stroke stroke20 = jFreeChart14.getBorderStroke();
        boolean boolean21 = jFreeChart14.getAntiAlias();
        java.lang.Object obj22 = jFreeChart14.clone();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.setPieChart(jFreeChart14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'pieChart' argument must be a chart based on a PiePlot.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(textTitle17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
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
        multiplePiePlot0.setNoDataMessage("Multiple Pie Plot");
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.drawOutline(graphics2D16, rectangle2D17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        java.awt.Paint paint7 = jFreeChart4.getBorderPaint();
        java.lang.Object obj8 = jFreeChart4.clone();
        java.awt.image.BufferedImage bufferedImage11 = jFreeChart4.createBufferedImage((int) ' ', 1);
        jFreeChart4.setBackgroundImageAlpha((float) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.title.Title title15 = jFreeChart4.getSubtitle((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Index out of range.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(bufferedImage11);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
        multiplePiePlot0.setNoDataMessage("hi!");
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent27 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent27);
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
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        java.lang.Object obj12 = jFreeChart4.clone();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(legendTitle8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        multiplePiePlot0.setBackgroundAlpha(10.0f);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        float float9 = multiplePiePlot8.getBackgroundAlpha();
        java.awt.Paint paint10 = multiplePiePlot8.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot8);
        multiplePiePlot0.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        multiplePiePlot0.setNoDataMessage("hi!");
        multiplePiePlot0.setNoDataMessage("Multiple Pie Plot");
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
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
        multiplePiePlot0.zoom((double) (short) -1);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font12);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        jFreeChart4.setBackgroundImageAlignment((int) 'a');
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
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
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
        boolean boolean12 = jFreeChart11.getAntiAlias();
        java.lang.Object obj13 = jFreeChart11.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
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
        boolean boolean12 = multiplePiePlot0.isSubplot();
        multiplePiePlot0.setBackgroundAlpha(0.5f);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        java.lang.String str10 = multiplePiePlot0.getNoDataMessage();
        org.jfree.chart.plot.Plot plot11 = null;
        multiplePiePlot0.setParent(plot11);
        multiplePiePlot0.setLimit((double) '4');
        multiplePiePlot0.setNoDataMessage("Other");
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot0.getParent();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(plot17);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart1 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = jFreeChart1.getPadding();
        java.util.List list3 = jFreeChart1.getSubtitles();
        org.jfree.chart.title.Title title5 = jFreeChart1.getSubtitle(0);
        org.jfree.chart.title.TextTitle textTitle6 = jFreeChart1.getTitle();
        org.junit.Assert.assertNotNull(rectangleInsets2);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNotNull(title5);
        org.junit.Assert.assertNull(textTitle6);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
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
        jFreeChart13.fireChartChanged();
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
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
        org.jfree.data.category.CategoryDataset categoryDataset15 = multiplePiePlot0.getDataset();
        java.lang.Object obj16 = multiplePiePlot0.clone();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(title12);
        org.junit.Assert.assertNull(plot14);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
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
        float float19 = jFreeChart8.getBackgroundImageAlpha();
        jFreeChart8.setBackgroundImageAlpha(0.5f);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.5f + "'", float19 == 0.5f);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = jFreeChart8.getPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = jFreeChart8.getPadding();
        jFreeChart8.setBackgroundImageAlignment(0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier17);
        multiplePiePlot13.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot13.getPieChart();
        jFreeChart21.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot();
        float float25 = multiplePiePlot24.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot26 = multiplePiePlot24.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart27 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot24);
        java.awt.Paint paint28 = jFreeChart27.getBackgroundPaint();
        java.awt.Stroke stroke29 = jFreeChart27.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle30 = jFreeChart27.getTitle();
        jFreeChart21.setTitle(textTitle30);
        jFreeChart8.removeSubtitle((org.jfree.chart.title.Title) textTitle30);
        int int33 = jFreeChart8.getSubtitleCount();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo38 = null;
        java.awt.image.BufferedImage bufferedImage39 = jFreeChart8.createBufferedImage((int) (byte) 10, (int) '#', (double) 1, (double) 100.0f, chartRenderingInfo38);
        jFreeChart8.removeLegend();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo44 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage45 = jFreeChart8.createBufferedImage((int) ' ', (int) (byte) 100, (int) 'a', chartRenderingInfo44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown image type 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(jFreeChart21);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
        org.junit.Assert.assertNotNull(plot26);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(textTitle30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(bufferedImage39);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot1.getParent();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot();
        float float4 = multiplePiePlot3.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot3.getRootPlot();
        multiplePiePlot3.setBackgroundImageAlignment(0);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        multiplePiePlot3.axisChanged(axisChangeEvent8);
        java.lang.String str10 = multiplePiePlot3.getPlotType();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj12 = multiplePiePlot11.clone();
        multiplePiePlot11.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset15 = multiplePiePlot11.getDataset();
        java.awt.Image image16 = null;
        multiplePiePlot11.setBackgroundImage(image16);
        java.awt.Paint paint18 = multiplePiePlot11.getNoDataMessagePaint();
        multiplePiePlot3.setAggregatedItemsPaint(paint18);
        multiplePiePlot1.setAggregatedItemsPaint(paint18);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
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
        multiplePiePlot1.setBackgroundImageAlpha(0.5f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(jFreeChart13);
        org.junit.Assert.assertNotNull(rectangleInsets14);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot0.getRootPlot();
        // The following exception was thrown during execution in test generation
        try {
            plot9.setBackgroundImageAlpha((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(plot9);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        multiplePiePlot1.setDataset(categoryDataset17);
        java.awt.Paint paint19 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(textTitle11);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
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
        java.util.List list12 = jFreeChart9.getSubtitles();
        org.jfree.chart.title.TextTitle textTitle13 = jFreeChart9.getTitle();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertNull(textTitle13);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
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
        java.awt.RenderingHints renderingHints20 = jFreeChart14.getRenderingHints();
        java.awt.Stroke stroke21 = jFreeChart14.getBorderStroke();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNull(legendTitle16);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(renderingHints20);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = multiplePiePlot15.getDrawingSupplier();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        float float19 = multiplePiePlot18.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot18.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot18);
        jFreeChart21.fireChartChanged();
        java.lang.Object obj23 = jFreeChart21.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo26 = null;
        java.awt.image.BufferedImage bufferedImage27 = jFreeChart21.createBufferedImage((int) '#', 1, chartRenderingInfo26);
        boolean boolean28 = jFreeChart21.isNotify();
        java.awt.Paint paint29 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart21.setBorderPaint(paint29);
        multiplePiePlot15.setOutlinePaint(paint29);
        java.lang.String str32 = multiplePiePlot15.getPlotType();
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.setTextAntiAlias((java.lang.Object) multiplePiePlot15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: org.jfree.chart.plot.MultiplePiePlot@1100a581 incompatible with Text-specific antialiasing enable key");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(list13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(drawingSupplier16);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(bufferedImage27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Multiple Pie Plot" + "'", str32, "Multiple Pie Plot");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
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
        java.awt.Graphics2D graphics2D32 = null;
        java.awt.geom.Rectangle2D rectangle2D33 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D32, rectangle2D33);
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
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(jFreeChart17);
        org.junit.Assert.assertNotNull(title19);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
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
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.draw(graphics2D15, rectangle2D16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        java.awt.Paint paint7 = jFreeChart4.getBorderPaint();
        java.lang.Object obj8 = jFreeChart4.clone();
        java.awt.image.BufferedImage bufferedImage11 = jFreeChart4.createBufferedImage((int) ' ', 1);
        jFreeChart4.setBackgroundImageAlpha((float) 10);
        jFreeChart4.fireChartChanged();
        java.lang.Class<?> wildcardClass15 = jFreeChart4.getClass();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(bufferedImage11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        multiplePiePlot1.setForegroundAlpha((float) (byte) 0);
        org.jfree.chart.JFreeChart jFreeChart7 = multiplePiePlot1.getPieChart();
        jFreeChart7.removeLegend();
        java.lang.Object obj9 = jFreeChart7.clone();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.Title title10 = jFreeChart8.getSubtitle((int) (byte) 0);
        jFreeChart8.removeLegend();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.CategoryPlot categoryPlot12 = jFreeChart8.getCategoryPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.PiePlot cannot be cast to org.jfree.chart.plot.CategoryPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        int int9 = jFreeChart8.getSubtitleCount();
        jFreeChart8.fireChartChanged();
        java.util.List list11 = jFreeChart8.getSubtitles();
        java.awt.Stroke stroke12 = jFreeChart8.getBorderStroke();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
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
        java.awt.Paint paint15 = multiplePiePlot0.getOutlinePaint();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D16, rectangle2D17);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        jFreeChart4.setBackgroundImageAlpha((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bufferedImage15);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
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
        jFreeChart9.setTitle("");
        jFreeChart9.fireChartChanged();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertNotNull(title12);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
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
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        java.awt.geom.Point2D point2D15 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo16 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.draw(graphics2D13, rectangle2D14, point2D15, chartRenderingInfo16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier17);
        multiplePiePlot13.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot13.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = jFreeChart21.getPadding();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot();
        float float25 = multiplePiePlot24.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot26 = multiplePiePlot24.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart27 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot24);
        jFreeChart27.fireChartChanged();
        boolean boolean29 = jFreeChart27.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle31 = jFreeChart27.getLegend((int) (short) 0);
        jFreeChart21.removeSubtitle((org.jfree.chart.title.Title) legendTitle31);
        jFreeChart8.addLegend(legendTitle31);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(jFreeChart21);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
        org.junit.Assert.assertNotNull(plot26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(legendTitle31);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
        java.lang.Object obj11 = jFreeChart8.clone();
        java.lang.Object obj12 = jFreeChart8.getTextAntiAlias();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
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
        jFreeChart4.setTextAntiAlias(true);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot0.markerChanged(markerChangeEvent3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(plot2);
        org.junit.Assert.assertNull(categoryDataset5);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        java.awt.Paint paint10 = jFreeChart9.getBackgroundPaint();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        java.awt.geom.Point2D point2D13 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo14 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart9.draw(graphics2D11, rectangle2D12, point2D13, chartRenderingInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
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
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent2);
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset6 = multiplePiePlot1.getDataset();
        org.jfree.chart.JFreeChart jFreeChart7 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.notifyListeners(plotChangeEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(categoryDataset6);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = jFreeChart8.getPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = jFreeChart8.getPadding();
        jFreeChart8.setBackgroundImageAlignment(0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier17);
        multiplePiePlot13.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot13.getPieChart();
        jFreeChart21.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot();
        float float25 = multiplePiePlot24.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot26 = multiplePiePlot24.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart27 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot24);
        java.awt.Paint paint28 = jFreeChart27.getBackgroundPaint();
        java.awt.Stroke stroke29 = jFreeChart27.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle30 = jFreeChart27.getTitle();
        jFreeChart21.setTitle(textTitle30);
        jFreeChart8.removeSubtitle((org.jfree.chart.title.Title) textTitle30);
        int int33 = jFreeChart8.getSubtitleCount();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo38 = null;
        java.awt.image.BufferedImage bufferedImage39 = jFreeChart8.createBufferedImage((int) (byte) 10, (int) '#', (double) 1, (double) 100.0f, chartRenderingInfo38);
        jFreeChart8.removeLegend();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent41 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.plotChanged(plotChangeEvent41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(jFreeChart21);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
        org.junit.Assert.assertNotNull(plot26);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(textTitle30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(bufferedImage39);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        multiplePiePlot0.setLimit((double) 0);
        java.awt.Paint paint7 = multiplePiePlot0.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        java.awt.Font font9 = multiplePiePlot0.getNoDataMessageFont();
        org.jfree.chart.JFreeChart jFreeChart10 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(font9);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        java.lang.String str10 = multiplePiePlot0.getNoDataMessage();
        java.awt.Font font11 = multiplePiePlot0.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot0.getDataset();
        java.awt.Font font13 = multiplePiePlot0.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(font13);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
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
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        java.awt.geom.Point2D point2D16 = null;
        org.jfree.chart.plot.PlotState plotState17 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.draw(graphics2D14, rectangle2D15, point2D16, plotState17, plotRenderingInfo18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(title12);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
        org.jfree.chart.event.ChartProgressListener chartProgressListener17 = null;
        jFreeChart4.removeProgressListener(chartProgressListener17);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.draw(graphics2D19, rectangle2D20);
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
        org.junit.Assert.assertNull(legendTitle13);
        org.junit.Assert.assertNotNull(textTitle16);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
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
        org.jfree.chart.plot.Plot plot15 = jFreeChart8.getPlot();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.CategoryPlot categoryPlot16 = jFreeChart8.getCategoryPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.PiePlot cannot be cast to org.jfree.chart.plot.CategoryPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertNotNull(plot15);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
        org.jfree.data.category.CategoryDataset categoryDataset15 = multiplePiePlot0.getDataset();
        java.awt.Image image16 = multiplePiePlot0.getBackgroundImage();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertNull(image16);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        java.awt.Font font7 = multiplePiePlot0.getNoDataMessageFont();
        java.awt.Font font8 = multiplePiePlot0.getNoDataMessageFont();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent9);
        org.jfree.chart.util.TableOrder tableOrder11 = multiplePiePlot0.getDataExtractOrder();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(tableOrder11);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
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
        multiplePiePlot0.setBackgroundImageAlpha(0.5f);
        multiplePiePlot0.setLimit((double) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(title12);
        org.junit.Assert.assertNull(categoryDataset14);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        java.lang.String str8 = multiplePiePlot0.getNoDataMessage();
        multiplePiePlot0.setForegroundAlpha(10.0f);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder12 = multiplePiePlot0.getDataExtractOrder();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(drawingSupplier11);
        org.junit.Assert.assertNotNull(tableOrder12);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier6);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        multiplePiePlot0.setForegroundAlpha((float) 0L);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
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
        java.awt.Font font18 = multiplePiePlot0.getNoDataMessageFont();
        java.lang.Class<?> wildcardClass19 = multiplePiePlot0.getClass();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(plot7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
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
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage31 = jFreeChart26.createBufferedImage((int) (byte) 0, 100, (int) (byte) 100, chartRenderingInfo30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown image type 100");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot1.setDataset(categoryDataset3);
        java.awt.Font font5 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot1.setNoDataMessageFont(font5);
        java.lang.String str7 = multiplePiePlot1.getPlotType();
        boolean boolean8 = multiplePiePlot1.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets9, false);
        java.awt.Font font12 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        float float15 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", font12, (org.jfree.chart.plot.Plot) multiplePiePlot13, false);
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot13.getPieChart();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        java.awt.geom.Point2D point2D21 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo22 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart18.draw(graphics2D19, rectangle2D20, point2D21, chartRenderingInfo22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Multiple Pie Plot" + "'", str7, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNotNull(jFreeChart18);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        boolean boolean8 = multiplePiePlot0.equals((java.lang.Object) 1.0f);
        java.awt.Stroke stroke9 = multiplePiePlot0.getOutlineStroke();
        java.lang.String str10 = multiplePiePlot0.getNoDataMessage();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        boolean boolean6 = multiplePiePlot0.isOutlineVisible();
        java.awt.Paint paint7 = multiplePiePlot0.getNoDataMessagePaint();
        multiplePiePlot0.setNoDataMessage("Multiple Pie Plot");
        java.awt.Paint paint10 = multiplePiePlot0.getNoDataMessagePaint();
        java.awt.Paint paint11 = multiplePiePlot0.getAggregatedItemsPaint();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(paint11);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
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
        jFreeChart4.setTextAntiAlias(true);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bufferedImage15);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
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
        java.awt.Paint paint15 = multiplePiePlot0.getBackgroundPaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(plot13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
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
        java.awt.Image image16 = multiplePiePlot0.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(image16);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
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
        jFreeChart4.fireChartChanged();
        org.jfree.chart.event.TitleChangeEvent titleChangeEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.titleChanged(titleChangeEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = jFreeChart18.getPadding();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNotNull(title10);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(legendTitle22);
        org.junit.Assert.assertNotNull(rectangleInsets24);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.lang.Comparable comparable3 = multiplePiePlot0.getAggregatedItemsKey();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot0.getLegendItems();
        double double5 = multiplePiePlot0.getLimit();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + "Other" + "'", comparable3, "Other");
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
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
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage31 = jFreeChart8.createBufferedImage((int) (byte) -1, (int) (byte) 0, (double) (-1), (double) (byte) 100, chartRenderingInfo30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (-1) and height (0) cannot be <= 0");
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
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        java.awt.Paint paint16 = multiplePiePlot14.getNoDataMessagePaint();
        multiplePiePlot14.setForegroundAlpha((float) (-1L));
        java.awt.Paint paint19 = multiplePiePlot14.getOutlinePaint();
        jFreeChart4.setBorderPaint(paint19);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.CategoryPlot categoryPlot8 = jFreeChart4.getCategoryPlot();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jfree.chart.plot.MultiplePiePlot cannot be cast to org.jfree.chart.plot.CategoryPlot");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier5);
        multiplePiePlot1.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart9 = multiplePiePlot1.getPieChart();
        double double10 = multiplePiePlot1.getLimit();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint12 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Font font13 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", font13, plot14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Null 'plot' argument.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(font13);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 10.0f);
        java.awt.Paint paint4 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setNoDataMessagePaint(paint4);
        java.lang.Class<?> wildcardClass6 = paint4.getClass();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        multiplePiePlot0.setNoDataMessage("hi!");
        org.jfree.data.category.CategoryDataset categoryDataset9 = multiplePiePlot0.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = multiplePiePlot0.getDrawingSupplier();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertNull(categoryDataset9);
        org.junit.Assert.assertNotNull(drawingSupplier10);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
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
        jFreeChart12.setBackgroundImageAlignment((int) ' ');
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(jFreeChart12);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        java.awt.Paint paint8 = jFreeChart4.getBorderPaint();
        int int9 = jFreeChart4.getSubtitleCount();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        java.awt.geom.Point2D point2D15 = null;
        org.jfree.chart.plot.PlotState plotState16 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.draw(graphics2D13, rectangle2D14, point2D15, plotState16, plotRenderingInfo17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
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
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot0.getParent();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        multiplePiePlot0.handleClick(0, 1, plotRenderingInfo22);
        java.lang.String str24 = multiplePiePlot0.getNoDataMessage();
        java.lang.Object obj25 = multiplePiePlot0.clone();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Multiple Pie Plot" + "'", str12, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNull(plot19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.lang.Object obj8 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.handleClick((int) (short) 10, (int) (byte) 10, chartRenderingInfo11);
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
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        multiplePiePlot0.setLimit((double) 0);
        java.awt.Paint paint7 = multiplePiePlot0.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        jFreeChart8.clearSubtitles();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(paint7);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
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
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo25 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart8.handleClick(1, (int) (byte) 10, chartRenderingInfo25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = multiplePiePlot0.getBackgroundImage();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent6);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertNull(image5);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
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
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot0.getParent();
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNull(plot15);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        float float17 = multiplePiePlot16.getBackgroundAlpha();
        java.awt.Paint paint18 = multiplePiePlot16.getNoDataMessagePaint();
        multiplePiePlot16.setForegroundAlpha((float) (-1L));
        java.awt.Paint paint21 = multiplePiePlot16.getOutlinePaint();
        java.awt.Font font22 = multiplePiePlot16.getNoDataMessageFont();
        multiplePiePlot0.setNoDataMessageFont(font22);
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(tableOrder2);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(font22);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
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
        org.jfree.chart.event.ChartProgressListener chartProgressListener13 = null;
        jFreeChart4.addProgressListener(chartProgressListener13);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        java.awt.Font font7 = multiplePiePlot0.getNoDataMessageFont();
        java.awt.Font font8 = multiplePiePlot0.getNoDataMessageFont();
        boolean boolean9 = multiplePiePlot0.isSubplot();
        multiplePiePlot0.setOutlineVisible(false);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint4 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setNoDataMessagePaint(paint4);
        float float6 = multiplePiePlot0.getBackgroundAlpha();
        multiplePiePlot0.setForegroundAlpha((float) 10L);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        multiplePiePlot0.setDataset(categoryDataset9);
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
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
        org.jfree.chart.LegendItemCollection legendItemCollection28 = multiplePiePlot0.getLegendItems();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(jFreeChart18);
        org.junit.Assert.assertNotNull(title20);
        org.junit.Assert.assertNotNull(legendTitle22);
        org.junit.Assert.assertNotNull(legendItemCollection28);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getRootPlot();
        multiplePiePlot0.setBackgroundImageAlignment(0);
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot0.getRootPlot();
        java.lang.String str6 = plot5.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(plot2);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
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
        java.lang.Object obj15 = jFreeChart14.getTextAntiAlias();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart14.plotChanged(plotChangeEvent16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo25 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart12.handleClick((int) (byte) -1, (-1), chartRenderingInfo25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
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
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.handleClick(1, 0, chartRenderingInfo15);
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
        org.junit.Assert.assertNotNull(legendTitle12);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
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
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart12.draw(graphics2D13, rectangle2D14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(jFreeChart12);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        java.awt.Font font8 = multiplePiePlot0.getNoDataMessageFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot0.getInsets();
        float float10 = multiplePiePlot0.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        multiplePiePlot0.markerChanged(markerChangeEvent11);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
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
        jFreeChart4.setTitle("Multiple Pie Plot");
        java.util.List list18 = jFreeChart4.getSubtitles();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(textTitle7);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(list18);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Paint paint2 = multiplePiePlot0.getNoDataMessagePaint();
        multiplePiePlot0.setForegroundAlpha((float) (-1L));
        java.awt.Paint paint5 = multiplePiePlot0.getOutlinePaint();
        java.awt.Font font6 = multiplePiePlot0.getNoDataMessageFont();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        multiplePiePlot0.handleClick(100, (int) (short) 1, plotRenderingInfo9);
        multiplePiePlot0.setBackgroundAlpha((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font6);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder1 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder3 = multiplePiePlot2.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        multiplePiePlot0.setDataset(categoryDataset7);
        multiplePiePlot0.setLimit((double) (short) 1);
        java.awt.Paint paint11 = multiplePiePlot0.getOutlinePaint();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.drawOutline(graphics2D12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(tableOrder1);
        org.junit.Assert.assertNotNull(tableOrder3);
        org.junit.Assert.assertNull(categoryDataset5);
        org.junit.Assert.assertNotNull(legendItemCollection6);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder2 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        multiplePiePlot0.setLimit((double) 100L);
        multiplePiePlot0.setBackgroundImageAlignment(0);
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(tableOrder2);
        org.junit.Assert.assertNotNull(legendItemCollection3);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        multiplePiePlot0.setBackgroundAlpha(10.0f);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        float float9 = multiplePiePlot8.getBackgroundAlpha();
        java.awt.Paint paint10 = multiplePiePlot8.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot8);
        multiplePiePlot0.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot8.getDataset();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(legendItemCollection2);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(categoryDataset13);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        jFreeChart4.setBackgroundImageAlpha((float) (byte) 0);
        jFreeChart4.setTitle("hi!");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.lang.Comparable comparable3 = multiplePiePlot0.getAggregatedItemsKey();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj5 = multiplePiePlot4.clone();
        multiplePiePlot4.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot4.setNoDataMessagePaint(paint8);
        multiplePiePlot4.setForegroundAlpha(10.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = multiplePiePlot4.getInsets();
        multiplePiePlot4.setOutlineVisible(true);
        int int15 = multiplePiePlot4.getBackgroundImageAlignment();
        java.awt.Paint paint16 = multiplePiePlot4.getNoDataMessagePaint();
        multiplePiePlot0.setNoDataMessagePaint(paint16);
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertEquals("'" + comparable3 + "' != '" + "Other" + "'", comparable3, "Other");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
        java.awt.Graphics2D graphics2D33 = null;
        java.awt.geom.Rectangle2D rectangle2D34 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.drawOutline(graphics2D33, rectangle2D34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
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
        org.jfree.chart.event.ChartChangeListener chartChangeListener28 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart18.removeChangeListener(chartChangeListener28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
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
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        float float2 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Stroke stroke3 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot0.setOutlineStroke(stroke3);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent5);
        java.awt.Paint paint7 = multiplePiePlot0.getOutlinePaint();
        java.lang.String str8 = multiplePiePlot0.getPlotType();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Multiple Pie Plot" + "'", str8, "Multiple Pie Plot");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
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
        org.jfree.chart.title.LegendTitle legendTitle14 = jFreeChart4.getLegend();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(plot3);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(bufferedImage10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(legendTitle14);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        float float16 = multiplePiePlot15.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot15.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart18 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot15);
        java.awt.Paint paint19 = jFreeChart18.getBackgroundPaint();
        java.awt.Stroke stroke20 = jFreeChart18.getBorderStroke();
        boolean boolean21 = jFreeChart18.isBorderVisible();
        jFreeChart18.removeLegend();
        jFreeChart18.setBackgroundImageAlignment(15);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot0.setPieChart(jFreeChart18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'pieChart' argument must be a chart based on a PiePlot.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertNull(categoryDataset9);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo17 = null;
        // The following exception was thrown during execution in test generation
        try {
            jFreeChart4.draw(graphics2D15, rectangle2D16, chartRenderingInfo17);
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
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getRootPlot();
        multiplePiePlot0.setBackgroundImageAlignment(0);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent5);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent7);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(plot2);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent17 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent17);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNull(categoryDataset16);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        boolean boolean5 = multiplePiePlot0.isOutlineVisible();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot0.getRootPlot();
        org.jfree.chart.plot.Plot plot7 = plot6.getRootPlot();
        java.awt.Paint paint8 = plot6.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(categoryDataset4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent2);
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent8);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNull(image5);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        boolean boolean11 = jFreeChart8.isNotify();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(jFreeChart8);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Paint paint2 = multiplePiePlot0.getNoDataMessagePaint();
        multiplePiePlot0.setForegroundAlpha((float) (-1L));
        java.awt.Paint paint5 = multiplePiePlot0.getOutlinePaint();
        java.awt.Font font6 = multiplePiePlot0.getNoDataMessageFont();
        java.awt.Paint paint7 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        multiplePiePlot0.handleClick((int) (byte) 1, 0, plotRenderingInfo10);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        multiplePiePlot0.setDataset(categoryDataset2);
        java.awt.Font font4 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot0.setNoDataMessageFont(font4);
        multiplePiePlot0.setForegroundAlpha(100.0f);
        float float8 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Paint paint9 = multiplePiePlot0.getOutlinePaint();
        java.awt.Paint paint10 = null;
        multiplePiePlot0.setOutlinePaint(paint10);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        float float2 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Stroke stroke3 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot0.setOutlineStroke(stroke3);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent5);
        java.awt.Font font7 = multiplePiePlot0.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(font7);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getRootPlot();
        plot8.setBackgroundImageAlignment((int) (byte) 100);
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart(plot8);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        plot8.drawBackgroundImage(graphics2D12, rectangle2D13);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = plot8.getInsets();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        java.lang.String str7 = multiplePiePlot0.getPlotType();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Multiple Pie Plot" + "'", str7, "Multiple Pie Plot");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent2);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot();
        float float5 = multiplePiePlot4.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot4.getRootPlot();
        java.awt.Paint paint7 = multiplePiePlot4.getOutlinePaint();
        multiplePiePlot1.setBackgroundPaint(paint7);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
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
        jFreeChart4.fireChartChanged();
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
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder2 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent4);
        float float6 = multiplePiePlot0.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(tableOrder2);
        org.junit.Assert.assertNotNull(legendItemCollection3);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 10.0f);
        java.awt.Paint paint5 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setNoDataMessagePaint(paint5);
        org.jfree.chart.JFreeChart jFreeChart7 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        multiplePiePlot1.setOutlineVisible(true);
        org.jfree.data.general.DatasetGroup datasetGroup10 = multiplePiePlot1.getDatasetGroup();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj12 = multiplePiePlot11.clone();
        multiplePiePlot11.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier15);
        multiplePiePlot11.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot11.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = jFreeChart19.getPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = jFreeChart19.getPadding();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj23 = multiplePiePlot22.clone();
        multiplePiePlot22.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = null;
        multiplePiePlot22.setDrawingSupplier(drawingSupplier26);
        multiplePiePlot22.setForegroundAlpha(0.0f);
        multiplePiePlot22.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        int int32 = multiplePiePlot22.getBackgroundImageAlignment();
        java.awt.Paint paint33 = multiplePiePlot22.getAggregatedItemsPaint();
        java.awt.Paint paint34 = multiplePiePlot22.getBackgroundPaint();
        jFreeChart19.setBorderPaint(paint34);
        jFreeChart19.setNotify(false);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart19);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(datasetGroup10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 15 + "'", int32 == 15);
        org.junit.Assert.assertNull(paint33);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder2 = multiplePiePlot0.getDataExtractOrder();
        multiplePiePlot0.zoom((double) (short) -1);
        int int5 = multiplePiePlot0.getBackgroundImageAlignment();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        multiplePiePlot0.handleClick((-1), (int) '#', plotRenderingInfo8);
        org.junit.Assert.assertNotNull(drawingSupplier1);
        org.junit.Assert.assertNotNull(tableOrder2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
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
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
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
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundAlpha((float) 1L);
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        multiplePiePlot1.setDataset(categoryDataset4);
        org.jfree.chart.JFreeChart jFreeChart6 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart6.setTitle("");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
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
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
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
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
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
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
}

