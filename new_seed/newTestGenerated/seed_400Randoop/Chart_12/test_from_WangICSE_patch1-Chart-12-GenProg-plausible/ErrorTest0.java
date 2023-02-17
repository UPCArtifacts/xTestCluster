import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getRootPlot();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj4 = multiplePiePlot3.clone();
        multiplePiePlot0.setParent((org.jfree.chart.plot.Plot) multiplePiePlot3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot0 and obj4", multiplePiePlot0.equals(obj4) ? multiplePiePlot0.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        boolean boolean6 = jFreeChart4.isBorderVisible();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        float float9 = multiplePiePlot8.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot8.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint12 = jFreeChart11.getBackgroundPaint();
        java.awt.Stroke stroke13 = jFreeChart11.getBorderStroke();
        jFreeChart4.setBorderStroke(stroke13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot8", multiplePiePlot1.equals(multiplePiePlot8) ? multiplePiePlot1.hashCode() == multiplePiePlot8.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart4.setBackgroundPaint(paint7);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        float float11 = multiplePiePlot10.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot10.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot10);
        java.awt.Paint paint14 = jFreeChart13.getBackgroundPaint();
        java.awt.Stroke stroke15 = jFreeChart13.getBorderStroke();
        jFreeChart4.setBorderStroke(stroke15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot10", multiplePiePlot1.equals(multiplePiePlot10) ? multiplePiePlot1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder1 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder3 = multiplePiePlot2.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder3);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj6 = multiplePiePlot5.clone();
        boolean boolean7 = multiplePiePlot0.equals(obj6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot2 and multiplePiePlot5", multiplePiePlot2.equals(multiplePiePlot5) ? multiplePiePlot2.hashCode() == multiplePiePlot5.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj6 = multiplePiePlot5.clone();
        multiplePiePlot5.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot5.setDrawingSupplier(drawingSupplier9);
        multiplePiePlot5.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart13 = multiplePiePlot5.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj6", multiplePiePlot1.equals(obj6) ? multiplePiePlot1.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        float float10 = multiplePiePlot9.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot9.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart12 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot9);
        java.awt.Paint paint13 = jFreeChart12.getBackgroundPaint();
        java.awt.Stroke stroke14 = jFreeChart12.getBorderStroke();
        multiplePiePlot0.setOutlineStroke(stroke14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot9", obj1.equals(multiplePiePlot9) ? obj1.hashCode() == multiplePiePlot9.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        float float10 = multiplePiePlot9.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot9.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart12 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot9);
        jFreeChart12.fireChartChanged();
        java.lang.Object obj14 = jFreeChart12.clone();
        java.awt.Paint paint15 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart12.setBackgroundPaint(paint15);
        multiplePiePlot0.setAggregatedItemsPaint(paint15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot9", obj1.equals(multiplePiePlot9) ? obj1.hashCode() == multiplePiePlot9.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier14);
        java.awt.Paint paint16 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot10.setBackgroundPaint(paint16);
        jFreeChart9.setBorderPaint(paint16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj11", obj1.equals(obj11) ? obj1.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        float float9 = multiplePiePlot8.getBackgroundAlpha();
        java.awt.Paint paint10 = multiplePiePlot8.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot8.setInsets(rectangleInsets11, false);
        jFreeChart4.setPadding(rectangleInsets11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot8", multiplePiePlot1.equals(multiplePiePlot8) ? multiplePiePlot1.hashCode() == multiplePiePlot8.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        float float7 = multiplePiePlot6.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot6.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot6);
        jFreeChart9.fireChartChanged();
        java.lang.Object obj11 = jFreeChart9.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo14 = null;
        java.awt.image.BufferedImage bufferedImage15 = jFreeChart9.createBufferedImage((int) '#', 1, chartRenderingInfo14);
        org.jfree.chart.title.LegendTitle legendTitle16 = jFreeChart9.getLegend();
        jFreeChart4.addLegend(legendTitle16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot6", multiplePiePlot1.equals(multiplePiePlot6) ? multiplePiePlot1.hashCode() == multiplePiePlot6.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        float float10 = multiplePiePlot9.getBackgroundAlpha();
        java.awt.Paint paint11 = multiplePiePlot9.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot9.setInsets(rectangleInsets12, false);
        multiplePiePlot0.setInsets(rectangleInsets12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot9", obj1.equals(multiplePiePlot9) ? obj1.hashCode() == multiplePiePlot9.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Paint paint6 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setBackgroundPaint(paint6);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = multiplePiePlot8.getDrawingSupplier();
        java.awt.Paint paint10 = multiplePiePlot8.getBackgroundPaint();
        multiplePiePlot0.setNoDataMessagePaint(paint10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot8", obj1.equals(multiplePiePlot8) ? obj1.hashCode() == multiplePiePlot8.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        float float9 = multiplePiePlot8.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot8.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot8);
        jFreeChart11.fireChartChanged();
        java.lang.Object obj13 = jFreeChart11.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo16 = null;
        java.awt.image.BufferedImage bufferedImage17 = jFreeChart11.createBufferedImage((int) '#', 1, chartRenderingInfo16);
        org.jfree.chart.title.LegendTitle legendTitle18 = jFreeChart11.getLegend();
        jFreeChart4.removeSubtitle((org.jfree.chart.title.Title) legendTitle18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot8", multiplePiePlot1.equals(multiplePiePlot8) ? multiplePiePlot1.hashCode() == multiplePiePlot8.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj8 = multiplePiePlot7.clone();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot7.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot7.setInsets(rectangleInsets10);
        jFreeChart4.setPadding(rectangleInsets10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot7", multiplePiePlot1.equals(multiplePiePlot7) ? multiplePiePlot1.hashCode() == multiplePiePlot7.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        float float10 = multiplePiePlot9.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot9.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart12 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot9);
        java.awt.Paint paint13 = jFreeChart12.getBackgroundPaint();
        boolean boolean14 = jFreeChart12.isBorderVisible();
        multiplePiePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot9", obj1.equals(multiplePiePlot9) ? obj1.hashCode() == multiplePiePlot9.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.Title title10 = jFreeChart8.getSubtitle((int) (byte) 0);
        org.jfree.chart.plot.Plot plot11 = jFreeChart8.getPlot();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        jFreeChart16.fireChartChanged();
        java.lang.Object obj18 = jFreeChart16.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo21 = null;
        java.awt.image.BufferedImage bufferedImage22 = jFreeChart16.createBufferedImage((int) '#', 1, chartRenderingInfo21);
        java.lang.Object obj23 = jFreeChart16.getTextAntiAlias();
        plot11.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot13", obj1.equals(multiplePiePlot13) ? obj1.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        java.awt.Paint paint16 = jFreeChart15.getBackgroundPaint();
        java.awt.Stroke stroke17 = jFreeChart15.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle18 = jFreeChart15.getTitle();
        jFreeChart4.setTitle(textTitle18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot12", multiplePiePlot1.equals(multiplePiePlot12) ? multiplePiePlot1.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        java.awt.Paint paint8 = multiplePiePlot0.getBackgroundPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        float float11 = multiplePiePlot10.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot10.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot10);
        jFreeChart13.fireChartChanged();
        java.lang.Object obj15 = jFreeChart13.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo18 = null;
        java.awt.image.BufferedImage bufferedImage19 = jFreeChart13.createBufferedImage((int) '#', 1, chartRenderingInfo18);
        multiplePiePlot0.setBackgroundImage((java.awt.Image) bufferedImage19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot10", obj1.equals(multiplePiePlot10) ? obj1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
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
        org.jfree.chart.title.Title title15 = jFreeChart13.getSubtitle((int) (byte) 0);
        jFreeChart4.addSubtitle(title15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj6", multiplePiePlot1.equals(obj6) ? multiplePiePlot1.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.lang.Object obj8 = jFreeChart4.clone();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        float float11 = multiplePiePlot10.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot10.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot10);
        java.awt.Paint paint14 = jFreeChart13.getBackgroundPaint();
        java.awt.Stroke stroke15 = jFreeChart13.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle16 = jFreeChart13.getTitle();
        jFreeChart4.removeSubtitle((org.jfree.chart.title.Title) textTitle16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot10", multiplePiePlot1.equals(multiplePiePlot10) ? multiplePiePlot1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        int int10 = multiplePiePlot0.getBackgroundImageAlignment();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        float float12 = multiplePiePlot11.getBackgroundAlpha();
        java.awt.Paint paint13 = multiplePiePlot11.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot11.setInsets(rectangleInsets14, false);
        multiplePiePlot0.setInsets(rectangleInsets14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot11", obj1.equals(multiplePiePlot11) ? obj1.hashCode() == multiplePiePlot11.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
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
        boolean boolean15 = jFreeChart10.equals((java.lang.Object) 100L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot0 and obj3", multiplePiePlot0.equals(obj3) ? multiplePiePlot0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        float float12 = multiplePiePlot11.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot11.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot11);
        jFreeChart14.fireChartChanged();
        boolean boolean16 = jFreeChart14.getAntiAlias();
        java.awt.Paint paint17 = jFreeChart14.getBorderPaint();
        jFreeChart9.setBackgroundPaint(paint17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot11", obj1.equals(multiplePiePlot11) ? obj1.hashCode() == multiplePiePlot11.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj15 = multiplePiePlot14.clone();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot14.setInsets(rectangleInsets17);
        multiplePiePlot2.setInsets(rectangleInsets17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot14", obj3.equals(multiplePiePlot14) ? obj3.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier6);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = multiplePiePlot8.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder10 = multiplePiePlot8.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        float float12 = multiplePiePlot11.getBackgroundAlpha();
        java.awt.Paint paint13 = multiplePiePlot11.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot11.setInsets(rectangleInsets14, false);
        multiplePiePlot8.setInsets(rectangleInsets14);
        multiplePiePlot0.setInsets(rectangleInsets14, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot8", obj1.equals(multiplePiePlot8) ? obj1.hashCode() == multiplePiePlot8.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getRootPlot();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        float float11 = multiplePiePlot10.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot10.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot10);
        jFreeChart13.fireChartChanged();
        java.lang.Object obj15 = jFreeChart13.clone();
        int int16 = jFreeChart13.getSubtitleCount();
        float float17 = jFreeChart13.getBackgroundImageAlpha();
        boolean boolean18 = multiplePiePlot0.equals((java.lang.Object) float17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot10", obj1.equals(multiplePiePlot10) ? obj1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier6);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        multiplePiePlot0.setNoDataMessage("Other");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        float float12 = multiplePiePlot11.getBackgroundAlpha();
        java.awt.Paint paint13 = multiplePiePlot11.getNoDataMessagePaint();
        multiplePiePlot0.setAggregatedItemsPaint(paint13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot11", obj1.equals(multiplePiePlot11) ? obj1.hashCode() == multiplePiePlot11.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder2 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot();
        float float4 = multiplePiePlot3.getBackgroundAlpha();
        java.awt.Paint paint5 = multiplePiePlot3.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot3.setInsets(rectangleInsets6, false);
        multiplePiePlot0.setInsets(rectangleInsets6);
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
        multiplePiePlot0.setAggregatedItemsPaint(paint22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot3 and multiplePiePlot11", multiplePiePlot3.equals(multiplePiePlot11) ? multiplePiePlot3.hashCode() == multiplePiePlot11.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder1 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder3 = multiplePiePlot2.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = multiplePiePlot6.getDrawingSupplier();
        java.awt.Paint paint8 = multiplePiePlot6.getBackgroundPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj10 = multiplePiePlot9.clone();
        multiplePiePlot9.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier13);
        multiplePiePlot9.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot9.getPieChart();
        org.jfree.chart.title.Title title19 = jFreeChart17.getSubtitle((int) (byte) 0);
        multiplePiePlot6.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart17);
        multiplePiePlot0.setParent((org.jfree.chart.plot.Plot) multiplePiePlot6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot2 and obj10", multiplePiePlot2.equals(obj10) ? multiplePiePlot2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getRootPlot();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = multiplePiePlot3.getDrawingSupplier();
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot0 and multiplePiePlot3", multiplePiePlot0.equals(multiplePiePlot3) ? multiplePiePlot0.hashCode() == multiplePiePlot3.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        java.awt.Font font4 = multiplePiePlot0.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        float float7 = multiplePiePlot6.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot6.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot6);
        jFreeChart9.fireChartChanged();
        java.lang.Object obj11 = jFreeChart9.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo14 = null;
        java.awt.image.BufferedImage bufferedImage15 = jFreeChart9.createBufferedImage(100, (int) '#', chartRenderingInfo14);
        multiplePiePlot0.setBackgroundImage((java.awt.Image) bufferedImage15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot6", obj1.equals(multiplePiePlot6) ? obj1.hashCode() == multiplePiePlot6.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage(100, (int) '#', chartRenderingInfo9);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj12 = multiplePiePlot11.clone();
        multiplePiePlot11.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier15);
        multiplePiePlot11.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot11.getPieChart();
        org.jfree.chart.title.Title title21 = jFreeChart19.getSubtitle((int) (byte) 0);
        jFreeChart4.removeSubtitle(title21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj12", multiplePiePlot1.equals(obj12) ? multiplePiePlot1.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        jFreeChart17.fireChartChanged();
        java.lang.Object obj19 = jFreeChart17.clone();
        java.awt.Paint paint20 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart17.setBackgroundPaint(paint20);
        jFreeChart4.setBorderPaint(paint20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot14", multiplePiePlot1.equals(multiplePiePlot14) ? multiplePiePlot1.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder2 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot();
        float float4 = multiplePiePlot3.getBackgroundAlpha();
        java.awt.Paint paint5 = multiplePiePlot3.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot3.setInsets(rectangleInsets6, false);
        multiplePiePlot0.setInsets(rectangleInsets6);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot10.setDataset(categoryDataset12);
        java.awt.Font font14 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot10.setNoDataMessageFont(font14);
        multiplePiePlot10.setForegroundAlpha(100.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = multiplePiePlot10.getInsets();
        multiplePiePlot0.setInsets(rectangleInsets18, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot3 and obj11", multiplePiePlot3.equals(obj11) ? multiplePiePlot3.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj6 = multiplePiePlot5.clone();
        multiplePiePlot5.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot5.setDrawingSupplier(drawingSupplier9);
        multiplePiePlot5.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart13 = multiplePiePlot5.getPieChart();
        int int14 = jFreeChart13.getSubtitleCount();
        boolean boolean15 = jFreeChart13.isBorderVisible();
        multiplePiePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj6", obj1.equals(obj6) ? obj1.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        java.awt.Paint paint17 = jFreeChart16.getBackgroundPaint();
        java.awt.Stroke stroke18 = jFreeChart16.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle19 = jFreeChart16.getTitle();
        jFreeChart4.addSubtitle((org.jfree.chart.title.Title) textTitle19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot13", multiplePiePlot1.equals(multiplePiePlot13) ? multiplePiePlot1.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier6);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj10 = multiplePiePlot9.clone();
        multiplePiePlot9.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier13);
        multiplePiePlot9.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot9.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart18 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot9);
        float float19 = jFreeChart18.getBackgroundImageAlpha();
        java.awt.Paint paint20 = jFreeChart18.getBackgroundPaint();
        multiplePiePlot0.setBackgroundPaint(paint20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj10", obj1.equals(obj10) ? obj1.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot0.setInsets(rectangleInsets3);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj9 = multiplePiePlot8.clone();
        multiplePiePlot8.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier12);
        multiplePiePlot8.setLimit((double) 100L);
        multiplePiePlot8.setBackgroundImageAlignment(15);
        org.jfree.chart.JFreeChart jFreeChart18 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot8);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj9", obj1.equals(obj9) ? obj1.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot();
        float float4 = multiplePiePlot3.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot3.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart6 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot3);
        java.awt.Paint paint7 = jFreeChart6.getBackgroundPaint();
        java.awt.Stroke stroke8 = jFreeChart6.getBorderStroke();
        multiplePiePlot0.setOutlineStroke(stroke8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot3", obj1.equals(multiplePiePlot3) ? obj1.hashCode() == multiplePiePlot3.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        multiplePiePlot0.setBackgroundImageAlignment(15);
        org.jfree.chart.JFreeChart jFreeChart10 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj12 = multiplePiePlot11.clone();
        multiplePiePlot11.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier15);
        multiplePiePlot11.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot11.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot11);
        float float21 = jFreeChart20.getBackgroundImageAlpha();
        java.awt.Paint paint22 = jFreeChart20.getBackgroundPaint();
        jFreeChart10.setBorderPaint(paint22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj12", obj1.equals(obj12) ? obj1.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot();
        float float4 = multiplePiePlot3.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot3.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart6 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot3);
        jFreeChart6.fireChartChanged();
        java.lang.Object obj8 = jFreeChart6.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo11 = null;
        java.awt.image.BufferedImage bufferedImage12 = jFreeChart6.createBufferedImage((int) '#', 1, chartRenderingInfo11);
        boolean boolean13 = jFreeChart6.isNotify();
        java.awt.Paint paint14 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart6.setBorderPaint(paint14);
        multiplePiePlot0.setOutlinePaint(paint14);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj18 = multiplePiePlot17.clone();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        multiplePiePlot17.setDataset(categoryDataset19);
        java.awt.Font font21 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot17.setNoDataMessageFont(font21);
        multiplePiePlot17.setForegroundAlpha(100.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = multiplePiePlot17.getInsets();
        multiplePiePlot0.setInsets(rectangleInsets25, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot3 and obj18", multiplePiePlot3.equals(obj18) ? multiplePiePlot3.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        int int7 = jFreeChart4.getSubtitleCount();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        float float10 = multiplePiePlot9.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot9.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart12 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot9);
        jFreeChart12.fireChartChanged();
        java.lang.Object obj14 = jFreeChart12.clone();
        java.awt.image.BufferedImage bufferedImage17 = jFreeChart12.createBufferedImage((int) '4', (int) (short) 10);
        jFreeChart4.setBackgroundImage((java.awt.Image) bufferedImage17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot9", multiplePiePlot1.equals(multiplePiePlot9) ? multiplePiePlot1.hashCode() == multiplePiePlot9.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
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
        jFreeChart8.setBackgroundImage((java.awt.Image) bufferedImage20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart14 and obj16", jFreeChart14.equals(obj16) ? jFreeChart14.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj15 = multiplePiePlot14.clone();
        multiplePiePlot14.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot14.setDrawingSupplier(drawingSupplier18);
        multiplePiePlot14.setForegroundAlpha(0.0f);
        multiplePiePlot14.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot14.zoom((double) (byte) 0);
        boolean boolean26 = multiplePiePlot14.isSubplot();
        boolean boolean27 = jFreeChart4.equals((java.lang.Object) multiplePiePlot14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj15", multiplePiePlot1.equals(obj15) ? multiplePiePlot1.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        org.jfree.chart.title.LegendTitle legendTitle16 = jFreeChart15.getLegend();
        jFreeChart4.addSubtitle((org.jfree.chart.title.Title) legendTitle16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot12", multiplePiePlot1.equals(multiplePiePlot12) ? multiplePiePlot1.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj17 = multiplePiePlot16.clone();
        multiplePiePlot16.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint20 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot16.setNoDataMessagePaint(paint20);
        multiplePiePlot2.setBackgroundPaint(paint20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj17", obj3.equals(obj17) ? obj3.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj6 = multiplePiePlot5.clone();
        multiplePiePlot5.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot5.setDrawingSupplier(drawingSupplier9);
        multiplePiePlot5.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart13 = multiplePiePlot5.getPieChart();
        jFreeChart13.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        float float17 = multiplePiePlot16.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot16.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot16);
        java.awt.Paint paint20 = jFreeChart19.getBackgroundPaint();
        java.awt.Stroke stroke21 = jFreeChart19.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle22 = jFreeChart19.getTitle();
        jFreeChart13.setTitle(textTitle22);
        jFreeChart4.removeSubtitle((org.jfree.chart.title.Title) textTitle22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot16", multiplePiePlot1.equals(multiplePiePlot16) ? multiplePiePlot1.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        float float10 = multiplePiePlot9.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot9.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart12 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot9);
        java.awt.Paint paint13 = jFreeChart12.getBackgroundPaint();
        jFreeChart4.setBackgroundPaint(paint13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot9", multiplePiePlot1.equals(multiplePiePlot9) ? multiplePiePlot1.hashCode() == multiplePiePlot9.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot13.setNoDataMessagePaint(paint17);
        multiplePiePlot13.setForegroundAlpha(10.0f);
        boolean boolean21 = jFreeChart4.equals((java.lang.Object) multiplePiePlot13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj14", multiplePiePlot1.equals(obj14) ? multiplePiePlot1.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset9 = multiplePiePlot0.getDataset();
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj13 = multiplePiePlot12.clone();
        multiplePiePlot12.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier16);
        multiplePiePlot12.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot12.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot12);
        float float22 = jFreeChart21.getBackgroundImageAlpha();
        java.awt.Paint paint23 = jFreeChart21.getBackgroundPaint();
        jFreeChart21.setTextAntiAlias(true);
        boolean boolean26 = multiplePiePlot0.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj13", obj1.equals(obj13) ? obj1.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        float float2 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj4 = multiplePiePlot3.clone();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot3.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot3.setInsets(rectangleInsets6);
        multiplePiePlot0.setInsets(rectangleInsets6, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot3 and obj4", multiplePiePlot3.equals(obj4) ? multiplePiePlot3.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset14 = multiplePiePlot10.getDataset();
        multiplePiePlot0.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj11", obj1.equals(obj11) ? obj1.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint4 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setNoDataMessagePaint(paint4);
        multiplePiePlot0.setForegroundAlpha(10.0f);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = multiplePiePlot8.getDrawingSupplier();
        java.awt.Paint paint10 = multiplePiePlot8.getBackgroundPaint();
        multiplePiePlot0.setBackgroundPaint(paint10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot8", obj1.equals(multiplePiePlot8) ? obj1.hashCode() == multiplePiePlot8.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset9 = multiplePiePlot0.getDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier14);
        multiplePiePlot10.setForegroundAlpha(0.0f);
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        int int20 = multiplePiePlot10.getBackgroundImageAlignment();
        multiplePiePlot0.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj11", obj1.equals(obj11) ? obj1.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot7.getDrawingSupplier();
        java.awt.Paint paint9 = multiplePiePlot7.getBackgroundPaint();
        jFreeChart4.setBackgroundPaint(paint9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot7", multiplePiePlot1.equals(multiplePiePlot7) ? multiplePiePlot1.hashCode() == multiplePiePlot7.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle8 = jFreeChart4.getLegend((int) (short) 0);
        boolean boolean9 = jFreeChart4.isNotify();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = jFreeChart4.getPadding();
        java.awt.Font font12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier17);
        multiplePiePlot13.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot13.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart22 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot13);
        org.jfree.chart.JFreeChart jFreeChart24 = new org.jfree.chart.JFreeChart("", font12, (org.jfree.chart.plot.Plot) multiplePiePlot13, false);
        java.awt.Paint paint25 = jFreeChart24.getBorderPaint();
        jFreeChart4.setBorderPaint(paint25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj14", multiplePiePlot1.equals(obj14) ? multiplePiePlot1.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getRootPlot();
        java.lang.Object obj3 = multiplePiePlot0.clone();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot();
        float float6 = multiplePiePlot5.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot5.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot5);
        jFreeChart8.fireChartChanged();
        java.lang.Object obj10 = jFreeChart8.clone();
        java.awt.Paint paint11 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart8.setBackgroundPaint(paint11);
        multiplePiePlot0.setOutlinePaint(paint11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot5", obj3.equals(multiplePiePlot5) ? obj3.hashCode() == multiplePiePlot5.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
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
        org.jfree.chart.title.LegendTitle legendTitle15 = jFreeChart10.getLegend(0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot0 and obj3", multiplePiePlot0.equals(obj3) ? multiplePiePlot0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder2 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot();
        float float4 = multiplePiePlot3.getBackgroundAlpha();
        java.awt.Paint paint5 = multiplePiePlot3.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot3.setInsets(rectangleInsets6, false);
        multiplePiePlot0.setInsets(rectangleInsets6);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        float float12 = multiplePiePlot11.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot11.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot11);
        jFreeChart14.fireChartChanged();
        java.lang.Object obj16 = jFreeChart14.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo19 = null;
        java.awt.image.BufferedImage bufferedImage20 = jFreeChart14.createBufferedImage((int) '#', 1, chartRenderingInfo19);
        multiplePiePlot0.setBackgroundImage((java.awt.Image) bufferedImage20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot3 and multiplePiePlot11", multiplePiePlot3.equals(multiplePiePlot11) ? multiplePiePlot3.hashCode() == multiplePiePlot11.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = multiplePiePlot14.getDrawingSupplier();
        java.awt.Paint paint16 = multiplePiePlot14.getBackgroundPaint();
        java.awt.Paint paint17 = multiplePiePlot14.getOutlinePaint();
        jFreeChart4.setBorderPaint(paint17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot14", multiplePiePlot1.equals(multiplePiePlot14) ? multiplePiePlot1.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj25 = multiplePiePlot24.clone();
        multiplePiePlot24.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = null;
        multiplePiePlot24.setDrawingSupplier(drawingSupplier28);
        multiplePiePlot24.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart32 = multiplePiePlot24.getPieChart();
        jFreeChart32.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot();
        float float36 = multiplePiePlot35.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot37 = multiplePiePlot35.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart38 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot35);
        java.awt.Paint paint39 = jFreeChart38.getBackgroundPaint();
        java.awt.Stroke stroke40 = jFreeChart38.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle41 = jFreeChart38.getTitle();
        jFreeChart32.setTitle(textTitle41);
        jFreeChart18.removeSubtitle((org.jfree.chart.title.Title) textTitle41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot15 and multiplePiePlot35", multiplePiePlot15.equals(multiplePiePlot35) ? multiplePiePlot15.hashCode() == multiplePiePlot35.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.lang.Object obj8 = jFreeChart4.clone();
        int int9 = jFreeChart4.getBackgroundImageAlignment();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier14);
        multiplePiePlot10.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot10.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset19 = multiplePiePlot10.getDataset();
        java.awt.Paint paint20 = multiplePiePlot10.getOutlinePaint();
        jFreeChart4.setBackgroundPaint(paint20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj11", multiplePiePlot1.equals(obj11) ? multiplePiePlot1.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot0.setInsets(rectangleInsets3);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        float float7 = multiplePiePlot6.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot6.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot6);
        java.awt.Paint paint10 = jFreeChart9.getBackgroundPaint();
        java.awt.Stroke stroke11 = jFreeChart9.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle12 = jFreeChart9.getTitle();
        java.lang.Object obj13 = jFreeChart9.clone();
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot6", obj1.equals(multiplePiePlot6) ? obj1.hashCode() == multiplePiePlot6.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        java.awt.Paint paint7 = jFreeChart4.getBorderPaint();
        java.awt.Font font9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier14);
        multiplePiePlot10.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot10.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot10);
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart("", font9, (org.jfree.chart.plot.Plot) multiplePiePlot10, false);
        java.awt.Paint paint22 = jFreeChart21.getBorderPaint();
        jFreeChart4.setBackgroundPaint(paint22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj11", multiplePiePlot1.equals(obj11) ? multiplePiePlot1.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        multiplePiePlot0.setNoDataMessage("hi!");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        float float11 = multiplePiePlot10.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot10.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot10);
        java.awt.Paint paint14 = jFreeChart13.getBackgroundPaint();
        java.awt.Stroke stroke15 = jFreeChart13.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle16 = jFreeChart13.getTitle();
        java.awt.Image image17 = jFreeChart13.getBackgroundImage();
        java.awt.Paint paint18 = jFreeChart13.getBorderPaint();
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot10", obj1.equals(multiplePiePlot10) ? obj1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        java.awt.Font font12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier17);
        multiplePiePlot13.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot13.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart22 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot13);
        org.jfree.chart.JFreeChart jFreeChart24 = new org.jfree.chart.JFreeChart("", font12, (org.jfree.chart.plot.Plot) multiplePiePlot13, false);
        java.awt.Paint paint25 = jFreeChart24.getBorderPaint();
        org.jfree.chart.event.ChartProgressListener chartProgressListener26 = null;
        jFreeChart24.removeProgressListener(chartProgressListener26);
        java.util.List list28 = jFreeChart24.getSubtitles();
        jFreeChart4.setSubtitles(list28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj14", multiplePiePlot1.equals(obj14) ? multiplePiePlot1.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        float float19 = multiplePiePlot18.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot18.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot18);
        jFreeChart21.fireChartChanged();
        jFreeChart21.fireChartChanged();
        boolean boolean24 = jFreeChart21.isBorderVisible();
        java.awt.Stroke stroke25 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        jFreeChart21.setBorderStroke(stroke25);
        jFreeChart13.setBorderStroke(stroke25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot18", obj3.equals(multiplePiePlot18) ? obj3.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        float float10 = jFreeChart9.getBackgroundImageAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj12 = multiplePiePlot11.clone();
        multiplePiePlot11.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier15);
        multiplePiePlot11.setLimit((double) 100L);
        multiplePiePlot11.setBackgroundImageAlignment(15);
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot11);
        boolean boolean22 = jFreeChart9.equals((java.lang.Object) jFreeChart21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj12", obj1.equals(obj12) ? obj1.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
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
        org.jfree.chart.JFreeChart jFreeChart22 = new org.jfree.chart.JFreeChart("hi!", font4, (org.jfree.chart.plot.Plot) multiplePiePlot5, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj8", multiplePiePlot1.equals(obj8) ? multiplePiePlot1.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
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
        jFreeChart4.addSubtitle((int) (short) 1, (org.jfree.chart.title.Title) textTitle44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot38", multiplePiePlot1.equals(multiplePiePlot38) ? multiplePiePlot1.hashCode() == multiplePiePlot38.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        java.awt.image.BufferedImage bufferedImage9 = jFreeChart4.createBufferedImage((int) '4', (int) (short) 10);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        float float12 = multiplePiePlot11.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot11.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot11);
        jFreeChart14.fireChartChanged();
        java.lang.Object obj16 = jFreeChart14.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo19 = null;
        java.awt.image.BufferedImage bufferedImage20 = jFreeChart14.createBufferedImage((int) '#', 1, chartRenderingInfo19);
        jFreeChart14.fireChartChanged();
        org.jfree.chart.plot.Plot plot22 = jFreeChart14.getPlot();
        java.awt.Paint paint23 = jFreeChart14.getBackgroundPaint();
        jFreeChart4.setBorderPaint(paint23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot11", multiplePiePlot1.equals(multiplePiePlot11) ? multiplePiePlot1.hashCode() == multiplePiePlot11.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getRootPlot();
        java.lang.Object obj3 = multiplePiePlot0.clone();
        float float4 = multiplePiePlot0.getBackgroundAlpha();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot0 and obj3", multiplePiePlot0.equals(obj3) ? multiplePiePlot0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        float float16 = multiplePiePlot15.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot15.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart18 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot15);
        jFreeChart18.fireChartChanged();
        java.lang.Object obj20 = jFreeChart18.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo23 = null;
        java.awt.image.BufferedImage bufferedImage24 = jFreeChart18.createBufferedImage((int) '#', 1, chartRenderingInfo23);
        boolean boolean25 = jFreeChart18.isNotify();
        jFreeChart18.fireChartChanged();
        java.util.List list27 = jFreeChart18.getSubtitles();
        jFreeChart4.setSubtitles(list27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot15", multiplePiePlot1.equals(multiplePiePlot15) ? multiplePiePlot1.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.lang.Object obj8 = jFreeChart4.clone();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        float float11 = multiplePiePlot10.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot10.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot10);
        java.awt.Paint paint14 = jFreeChart13.getBackgroundPaint();
        java.awt.Stroke stroke15 = jFreeChart13.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle16 = jFreeChart13.getTitle();
        java.awt.Image image17 = jFreeChart13.getBackgroundImage();
        java.awt.Paint paint18 = jFreeChart13.getBorderPaint();
        jFreeChart4.setBackgroundPaint(paint18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot10", multiplePiePlot1.equals(multiplePiePlot10) ? multiplePiePlot1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        java.awt.Font font5 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj7 = multiplePiePlot6.clone();
        multiplePiePlot6.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot6.setDrawingSupplier(drawingSupplier10);
        java.awt.Paint paint12 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot6.setBackgroundPaint(paint12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = multiplePiePlot6.getDataset();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("Other", font5, (org.jfree.chart.plot.Plot) multiplePiePlot6, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj2 and obj7", obj2.equals(obj7) ? obj2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = multiplePiePlot3.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder5 = multiplePiePlot3.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        float float7 = multiplePiePlot6.getBackgroundAlpha();
        java.awt.Paint paint8 = multiplePiePlot6.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot6.setInsets(rectangleInsets9, false);
        multiplePiePlot3.setInsets(rectangleInsets9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = multiplePiePlot3.getDrawingSupplier();
        multiplePiePlot0.setDrawingSupplier(drawingSupplier13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot3 and multiplePiePlot6", multiplePiePlot3.equals(multiplePiePlot6) ? multiplePiePlot3.hashCode() == multiplePiePlot6.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        jFreeChart16.fireChartChanged();
        java.lang.Object obj18 = jFreeChart16.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo21 = null;
        java.awt.image.BufferedImage bufferedImage22 = jFreeChart16.createBufferedImage((int) '#', 1, chartRenderingInfo21);
        boolean boolean23 = jFreeChart16.isNotify();
        java.awt.Paint paint24 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart16.setBorderPaint(paint24);
        jFreeChart4.setBorderPaint(paint24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot13", multiplePiePlot1.equals(multiplePiePlot13) ? multiplePiePlot1.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot0.zoom((double) (byte) 0);
        java.awt.Paint paint12 = multiplePiePlot0.getAggregatedItemsPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder14 = multiplePiePlot13.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot13", obj1.equals(multiplePiePlot13) ? obj1.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot();
        float float22 = multiplePiePlot21.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot23 = multiplePiePlot21.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart24 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot21);
        jFreeChart24.fireChartChanged();
        boolean boolean26 = jFreeChart24.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle28 = jFreeChart24.getLegend((int) (short) 0);
        jFreeChart8.removeSubtitle((org.jfree.chart.title.Title) legendTitle28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and multiplePiePlot21", multiplePiePlot11.equals(multiplePiePlot21) ? multiplePiePlot11.hashCode() == multiplePiePlot21.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart4.setBackgroundPaint(paint7);
        boolean boolean9 = jFreeChart4.isBorderVisible();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier14);
        java.awt.Image image16 = multiplePiePlot10.getBackgroundImage();
        boolean boolean18 = multiplePiePlot10.equals((java.lang.Object) 1.0f);
        java.awt.Stroke stroke19 = multiplePiePlot10.getOutlineStroke();
        java.awt.Paint paint20 = multiplePiePlot10.getBackgroundPaint();
        jFreeChart4.setBorderPaint(paint20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj11", multiplePiePlot1.equals(obj11) ? multiplePiePlot1.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        multiplePiePlot0.setDataset(categoryDataset2);
        java.awt.Font font4 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot0.setNoDataMessageFont(font4);
        java.lang.String str6 = multiplePiePlot0.getPlotType();
        boolean boolean7 = multiplePiePlot0.isSubplot();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        float float10 = multiplePiePlot9.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot9.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart12 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot9);
        jFreeChart12.fireChartChanged();
        java.lang.Object obj14 = jFreeChart12.clone();
        java.awt.Paint paint15 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart12.setBackgroundPaint(paint15);
        multiplePiePlot0.setNoDataMessagePaint(paint15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot9", obj1.equals(multiplePiePlot9) ? obj1.hashCode() == multiplePiePlot9.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        java.awt.Image image9 = null;
        multiplePiePlot0.setBackgroundImage(image9);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj12 = multiplePiePlot11.clone();
        multiplePiePlot11.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier15);
        multiplePiePlot11.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot11.getPieChart();
        jFreeChart19.removeLegend();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo25 = null;
        java.awt.image.BufferedImage bufferedImage26 = jFreeChart19.createBufferedImage((int) ' ', (int) (byte) 10, (double) (short) 1, 10.0d, chartRenderingInfo25);
        multiplePiePlot0.setBackgroundImage((java.awt.Image) bufferedImage26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj12", obj1.equals(obj12) ? obj1.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        float float18 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot17.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot17);
        jFreeChart20.fireChartChanged();
        java.lang.Object obj22 = jFreeChart20.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo25 = null;
        java.awt.image.BufferedImage bufferedImage26 = jFreeChart20.createBufferedImage((int) '#', 1, chartRenderingInfo25);
        org.jfree.chart.title.LegendTitle legendTitle27 = jFreeChart20.getLegend();
        jFreeChart13.addLegend(legendTitle27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot17", obj3.equals(multiplePiePlot17) ? obj3.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        float float16 = multiplePiePlot15.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot15.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart18 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot15);
        java.awt.Paint paint19 = jFreeChart18.getBackgroundPaint();
        java.awt.Stroke stroke20 = jFreeChart18.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener21 = null;
        jFreeChart18.addProgressListener(chartProgressListener21);
        org.jfree.chart.event.ChartProgressListener chartProgressListener23 = null;
        jFreeChart18.removeProgressListener(chartProgressListener23);
        java.awt.Image image25 = jFreeChart18.getBackgroundImage();
        float float26 = jFreeChart18.getBackgroundImageAlpha();
        org.jfree.chart.title.LegendTitle legendTitle27 = jFreeChart18.getLegend();
        jFreeChart13.addLegend(legendTitle27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot15", obj3.equals(multiplePiePlot15) ? obj3.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj6 = multiplePiePlot5.clone();
        multiplePiePlot5.setBackgroundAlpha((float) (short) -1);
        java.awt.Font font9 = multiplePiePlot5.getNoDataMessageFont();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart("", font4, (org.jfree.chart.plot.Plot) multiplePiePlot5, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj6", multiplePiePlot1.equals(obj6) ? multiplePiePlot1.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        boolean boolean8 = jFreeChart4.isNotify();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        float float11 = multiplePiePlot10.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot10.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot10);
        jFreeChart13.fireChartChanged();
        boolean boolean15 = jFreeChart13.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle17 = jFreeChart13.getLegend((int) (short) 0);
        boolean boolean18 = jFreeChart13.isNotify();
        java.awt.RenderingHints renderingHints19 = jFreeChart13.getRenderingHints();
        jFreeChart4.setRenderingHints(renderingHints19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot10", multiplePiePlot1.equals(multiplePiePlot10) ? multiplePiePlot1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle8 = jFreeChart4.getLegend((int) (short) 0);
        boolean boolean9 = jFreeChart4.isNotify();
        java.awt.RenderingHints renderingHints10 = jFreeChart4.getRenderingHints();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        jFreeChart15.fireChartChanged();
        java.lang.Object obj17 = jFreeChart15.clone();
        java.awt.image.BufferedImage bufferedImage20 = jFreeChart15.createBufferedImage((int) '4', (int) (short) 10);
        jFreeChart4.setBackgroundImage((java.awt.Image) bufferedImage20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot12", multiplePiePlot1.equals(multiplePiePlot12) ? multiplePiePlot1.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        jFreeChart4.setTextAntiAlias(false);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier14);
        multiplePiePlot10.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot10.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = jFreeChart18.getPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = jFreeChart18.getPadding();
        jFreeChart18.setBackgroundImageAlignment(0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj24 = multiplePiePlot23.clone();
        multiplePiePlot23.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = null;
        multiplePiePlot23.setDrawingSupplier(drawingSupplier27);
        multiplePiePlot23.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart31 = multiplePiePlot23.getPieChart();
        jFreeChart31.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot();
        float float35 = multiplePiePlot34.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot36 = multiplePiePlot34.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart37 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot34);
        java.awt.Paint paint38 = jFreeChart37.getBackgroundPaint();
        java.awt.Stroke stroke39 = jFreeChart37.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle40 = jFreeChart37.getTitle();
        jFreeChart31.setTitle(textTitle40);
        jFreeChart18.removeSubtitle((org.jfree.chart.title.Title) textTitle40);
        jFreeChart4.addSubtitle(0, (org.jfree.chart.title.Title) textTitle40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot34", multiplePiePlot1.equals(multiplePiePlot34) ? multiplePiePlot1.hashCode() == multiplePiePlot34.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        float float11 = multiplePiePlot10.getBackgroundAlpha();
        java.awt.Paint paint12 = multiplePiePlot10.getNoDataMessagePaint();
        java.awt.Font font13 = multiplePiePlot10.getNoDataMessageFont();
        multiplePiePlot0.setNoDataMessageFont(font13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot10", obj1.equals(multiplePiePlot10) ? obj1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
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
        org.jfree.data.general.DatasetGroup datasetGroup13 = plot12.getDatasetGroup();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart4 and obj6", jFreeChart4.equals(obj6) ? jFreeChart4.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getParent();
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot4.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder6 = multiplePiePlot4.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot();
        float float8 = multiplePiePlot7.getBackgroundAlpha();
        java.awt.Paint paint9 = multiplePiePlot7.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot7.setInsets(rectangleInsets10, false);
        multiplePiePlot4.setInsets(rectangleInsets10);
        multiplePiePlot0.setInsets(rectangleInsets10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot4", obj1.equals(multiplePiePlot4) ? obj1.hashCode() == multiplePiePlot4.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 10.0f);
        java.awt.Paint paint4 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setNoDataMessagePaint(paint4);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot();
        float float8 = multiplePiePlot7.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot7.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart10 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot7);
        jFreeChart10.fireChartChanged();
        java.lang.Object obj12 = jFreeChart10.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo15 = null;
        java.awt.image.BufferedImage bufferedImage16 = jFreeChart10.createBufferedImage((int) '#', 1, chartRenderingInfo15);
        jFreeChart10.fireChartChanged();
        org.jfree.chart.plot.Plot plot18 = jFreeChart10.getPlot();
        java.awt.Paint paint19 = jFreeChart10.getBackgroundPaint();
        multiplePiePlot0.setBackgroundPaint(paint19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart10 and obj12", jFreeChart10.equals(obj12) ? jFreeChart10.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        java.awt.Image image9 = null;
        multiplePiePlot0.setBackgroundImage(image9);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj12 = multiplePiePlot11.clone();
        multiplePiePlot11.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier15);
        java.awt.Image image17 = multiplePiePlot11.getBackgroundImage();
        boolean boolean19 = multiplePiePlot11.equals((java.lang.Object) 1.0f);
        java.awt.Stroke stroke20 = multiplePiePlot11.getOutlineStroke();
        java.awt.Paint paint21 = multiplePiePlot11.getBackgroundPaint();
        multiplePiePlot0.setOutlinePaint(paint21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj12", obj1.equals(obj12) ? obj1.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot();
        float float22 = multiplePiePlot21.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot23 = multiplePiePlot21.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart24 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot21);
        jFreeChart24.fireChartChanged();
        java.lang.Object obj26 = jFreeChart24.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo29 = null;
        java.awt.image.BufferedImage bufferedImage30 = jFreeChart24.createBufferedImage((int) '#', 1, chartRenderingInfo29);
        boolean boolean31 = jFreeChart24.isNotify();
        jFreeChart24.fireChartChanged();
        java.util.List list33 = jFreeChart24.getSubtitles();
        jFreeChart8.setSubtitles(list33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot12 and multiplePiePlot21", multiplePiePlot12.equals(multiplePiePlot21) ? multiplePiePlot12.hashCode() == multiplePiePlot21.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle8 = jFreeChart4.getLegend((int) (short) 0);
        java.awt.Image image9 = jFreeChart4.getBackgroundImage();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint14 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot10.setNoDataMessagePaint(paint14);
        jFreeChart4.setBorderPaint(paint14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj11", multiplePiePlot1.equals(obj11) ? multiplePiePlot1.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        multiplePiePlot0.setDataset(categoryDataset2);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot4.getDrawingSupplier();
        java.awt.Paint paint6 = multiplePiePlot4.getBackgroundPaint();
        java.awt.Paint paint7 = multiplePiePlot4.getOutlinePaint();
        multiplePiePlot0.setOutlinePaint(paint7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot4", obj1.equals(multiplePiePlot4) ? obj1.hashCode() == multiplePiePlot4.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        boolean boolean5 = multiplePiePlot0.isOutlineVisible();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj7 = multiplePiePlot6.clone();
        multiplePiePlot6.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot6.setDrawingSupplier(drawingSupplier10);
        java.awt.Paint paint12 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot6.setBackgroundPaint(paint12);
        org.jfree.chart.util.TableOrder tableOrder14 = multiplePiePlot6.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj7", obj1.equals(obj7) ? obj1.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        float float14 = multiplePiePlot12.getBackgroundAlpha();
        java.awt.Stroke stroke15 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot12.setOutlineStroke(stroke15);
        multiplePiePlot0.setOutlineStroke(stroke15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot12", obj1.equals(multiplePiePlot12) ? obj1.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart4.setBackgroundPaint(paint7);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        float float11 = multiplePiePlot10.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot10.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot10);
        jFreeChart13.fireChartChanged();
        boolean boolean15 = jFreeChart13.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle17 = jFreeChart13.getLegend((int) (short) 0);
        boolean boolean18 = jFreeChart13.isNotify();
        java.awt.RenderingHints renderingHints19 = jFreeChart13.getRenderingHints();
        jFreeChart4.setRenderingHints(renderingHints19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot10", multiplePiePlot1.equals(multiplePiePlot10) ? multiplePiePlot1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj15 = multiplePiePlot14.clone();
        multiplePiePlot14.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot14.setDrawingSupplier(drawingSupplier18);
        multiplePiePlot14.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot14.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = jFreeChart22.getPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = jFreeChart22.getPadding();
        multiplePiePlot0.setInsets(rectangleInsets24, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj15", obj1.equals(obj15) ? obj1.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier5);
        multiplePiePlot1.setLimit((double) 100L);
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        float float11 = multiplePiePlot10.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot10.getRootPlot();
        java.lang.Object obj13 = multiplePiePlot10.clone();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", font9, (org.jfree.chart.plot.Plot) multiplePiePlot10, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj2 and multiplePiePlot10", obj2.equals(multiplePiePlot10) ? obj2.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot();
        float float26 = multiplePiePlot25.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot27 = multiplePiePlot25.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart28 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot25);
        jFreeChart28.fireChartChanged();
        boolean boolean30 = jFreeChart28.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle32 = jFreeChart28.getLegend((int) (short) 0);
        plot11.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot15 and multiplePiePlot25", multiplePiePlot15.equals(multiplePiePlot25) ? multiplePiePlot15.hashCode() == multiplePiePlot25.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot();
        float float20 = multiplePiePlot19.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot19.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart22 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot19);
        jFreeChart22.fireChartChanged();
        java.lang.Object obj24 = jFreeChart22.clone();
        java.awt.Paint paint25 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart22.setBackgroundPaint(paint25);
        boolean boolean27 = jFreeChart22.isBorderVisible();
        jFreeChart22.setBackgroundImageAlignment(1);
        jFreeChart22.removeLegend();
        java.awt.image.BufferedImage bufferedImage33 = jFreeChart22.createBufferedImage((int) (short) 1, (int) ' ');
        jFreeChart13.setBackgroundImage((java.awt.Image) bufferedImage33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot19", obj3.equals(multiplePiePlot19) ? obj3.hashCode() == multiplePiePlot19.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        double double9 = multiplePiePlot0.getLimit();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier14);
        multiplePiePlot10.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot10.getPieChart();
        int int19 = jFreeChart18.getSubtitleCount();
        jFreeChart18.fireChartChanged();
        multiplePiePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj11", obj1.equals(obj11) ? obj1.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        jFreeChart16.fireChartChanged();
        java.lang.Object obj18 = jFreeChart16.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo21 = null;
        java.awt.image.BufferedImage bufferedImage22 = jFreeChart16.createBufferedImage((int) '#', 1, chartRenderingInfo21);
        org.jfree.chart.title.LegendTitle legendTitle23 = jFreeChart16.getLegend();
        jFreeChart4.addLegend(legendTitle23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot13", multiplePiePlot1.equals(multiplePiePlot13) ? multiplePiePlot1.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot0.setInsets(rectangleInsets3);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj9 = multiplePiePlot8.clone();
        multiplePiePlot8.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot8.getDataset();
        java.awt.Image image13 = null;
        multiplePiePlot8.setBackgroundImage(image13);
        java.awt.Font font15 = multiplePiePlot8.getNoDataMessageFont();
        multiplePiePlot0.setNoDataMessageFont(font15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj9", obj1.equals(obj9) ? obj1.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        float float17 = multiplePiePlot16.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot16.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot16);
        jFreeChart19.fireChartChanged();
        boolean boolean21 = jFreeChart19.getAntiAlias();
        java.awt.Paint paint22 = jFreeChart19.getBorderPaint();
        java.lang.Object obj23 = jFreeChart19.clone();
        java.lang.Object obj24 = jFreeChart19.clone();
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj4 and multiplePiePlot16", obj4.equals(multiplePiePlot16) ? obj4.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot0.setInsets(rectangleInsets3);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj6 = multiplePiePlot5.clone();
        multiplePiePlot5.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot5.setDrawingSupplier(drawingSupplier9);
        multiplePiePlot5.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart13 = multiplePiePlot5.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot5);
        float float15 = jFreeChart14.getBackgroundImageAlpha();
        java.awt.Paint paint16 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        jFreeChart14.setBorderPaint(paint16);
        multiplePiePlot0.setNoDataMessagePaint(paint16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj6", obj1.equals(obj6) ? obj1.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        java.awt.image.BufferedImage bufferedImage9 = jFreeChart4.createBufferedImage((int) '4', (int) (short) 10);
        org.jfree.chart.title.LegendTitle legendTitle11 = jFreeChart4.getLegend((int) (byte) 100);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        jFreeChart16.fireChartChanged();
        java.lang.Object obj18 = jFreeChart16.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo21 = null;
        java.awt.image.BufferedImage bufferedImage22 = jFreeChart16.createBufferedImage((int) '#', 1, chartRenderingInfo21);
        org.jfree.chart.title.LegendTitle legendTitle23 = jFreeChart16.getLegend();
        java.awt.RenderingHints renderingHints24 = jFreeChart16.getRenderingHints();
        jFreeChart4.setRenderingHints(renderingHints24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot13", multiplePiePlot1.equals(multiplePiePlot13) ? multiplePiePlot1.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj13 = multiplePiePlot12.clone();
        multiplePiePlot12.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier16);
        multiplePiePlot12.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot12.getPieChart();
        org.jfree.chart.title.Title title22 = jFreeChart20.getSubtitle((int) (byte) 0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot();
        float float25 = multiplePiePlot24.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot26 = multiplePiePlot24.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart27 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot24);
        jFreeChart27.fireChartChanged();
        boolean boolean29 = jFreeChart27.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle31 = jFreeChart27.getLegend((int) (short) 0);
        jFreeChart20.addLegend(legendTitle31);
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = jFreeChart20.getPadding();
        jFreeChart11.setPadding(rectangleInsets33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot24", obj1.equals(multiplePiePlot24) ? obj1.hashCode() == multiplePiePlot24.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        float float16 = multiplePiePlot15.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot15.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart18 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot15);
        jFreeChart18.fireChartChanged();
        java.lang.Object obj20 = jFreeChart18.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo23 = null;
        java.awt.image.BufferedImage bufferedImage24 = jFreeChart18.createBufferedImage((int) '#', 1, chartRenderingInfo23);
        boolean boolean25 = jFreeChart18.isNotify();
        jFreeChart18.fireChartChanged();
        java.util.List list27 = jFreeChart18.getSubtitles();
        jFreeChart4.setSubtitles(list27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot15", multiplePiePlot1.equals(multiplePiePlot15) ? multiplePiePlot1.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot4.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder6 = multiplePiePlot4.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier1 and drawingSupplier5", drawingSupplier1.equals(drawingSupplier5) ? drawingSupplier1.hashCode() == drawingSupplier5.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.lang.Object obj8 = jFreeChart4.clone();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj10 = multiplePiePlot9.clone();
        multiplePiePlot9.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier13);
        multiplePiePlot9.setForegroundAlpha(0.0f);
        multiplePiePlot9.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        int int19 = multiplePiePlot9.getBackgroundImageAlignment();
        java.awt.Paint paint20 = multiplePiePlot9.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot9.getPieChart();
        boolean boolean22 = jFreeChart4.equals((java.lang.Object) multiplePiePlot9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj10", multiplePiePlot1.equals(obj10) ? multiplePiePlot1.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        java.awt.Paint paint7 = jFreeChart4.getBorderPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj9 = multiplePiePlot8.clone();
        multiplePiePlot8.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier12);
        multiplePiePlot8.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart16 = multiplePiePlot8.getPieChart();
        org.jfree.chart.title.Title title18 = jFreeChart16.getSubtitle((int) (byte) 0);
        jFreeChart4.addSubtitle(title18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj9", multiplePiePlot1.equals(obj9) ? multiplePiePlot1.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
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
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        multiplePiePlot0.drawBackgroundImage(graphics2D16, rectangle2D17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart10 and jFreeChart15", jFreeChart10.equals(jFreeChart15) ? jFreeChart10.hashCode() == jFreeChart15.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        multiplePiePlot0.setDataset(categoryDataset2);
        java.awt.Font font4 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot0.setNoDataMessageFont(font4);
        float float6 = multiplePiePlot0.getBackgroundImageAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj8 = multiplePiePlot7.clone();
        multiplePiePlot7.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot7.setDrawingSupplier(drawingSupplier11);
        multiplePiePlot7.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart15 = multiplePiePlot7.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset16 = multiplePiePlot7.getDataset();
        java.awt.Paint paint17 = multiplePiePlot7.getOutlinePaint();
        multiplePiePlot0.setNoDataMessagePaint(paint17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj8", obj1.equals(obj8) ? obj1.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj17 = multiplePiePlot16.clone();
        multiplePiePlot16.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = null;
        multiplePiePlot16.setDrawingSupplier(drawingSupplier20);
        multiplePiePlot16.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot16.getPieChart();
        jFreeChart24.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot();
        float float28 = multiplePiePlot27.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot29 = multiplePiePlot27.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart30 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot27);
        java.awt.Paint paint31 = jFreeChart30.getBackgroundPaint();
        java.awt.Stroke stroke32 = jFreeChart30.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle33 = jFreeChart30.getTitle();
        jFreeChart24.setTitle(textTitle33);
        jFreeChart4.setTitle(textTitle33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot27", multiplePiePlot1.equals(multiplePiePlot27) ? multiplePiePlot1.hashCode() == multiplePiePlot27.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj6 = multiplePiePlot5.clone();
        multiplePiePlot5.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot5.setDrawingSupplier(drawingSupplier9);
        multiplePiePlot5.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart13 = multiplePiePlot5.getPieChart();
        jFreeChart13.removeLegend();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo19 = null;
        java.awt.image.BufferedImage bufferedImage20 = jFreeChart13.createBufferedImage((int) ' ', (int) (byte) 10, (double) (short) 1, 10.0d, chartRenderingInfo19);
        multiplePiePlot0.setBackgroundImage((java.awt.Image) bufferedImage20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj6", obj1.equals(obj6) ? obj1.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        jFreeChart4.setTextAntiAlias(false);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        float float11 = multiplePiePlot10.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot10.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot10);
        java.awt.Paint paint14 = jFreeChart13.getBackgroundPaint();
        java.awt.Stroke stroke15 = jFreeChart13.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle16 = jFreeChart13.getTitle();
        jFreeChart4.setTitle(textTitle16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot10", multiplePiePlot1.equals(multiplePiePlot10) ? multiplePiePlot1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
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
        multiplePiePlot0.setInsets(rectangleInsets26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj16", obj1.equals(obj16) ? obj1.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = multiplePiePlot14.getDrawingSupplier();
        java.awt.Paint paint16 = multiplePiePlot14.getBackgroundPaint();
        jFreeChart4.setBackgroundPaint(paint16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot14", multiplePiePlot1.equals(multiplePiePlot14) ? multiplePiePlot1.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        boolean boolean5 = multiplePiePlot0.isOutlineVisible();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot0.getRootPlot();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj8 = multiplePiePlot7.clone();
        multiplePiePlot7.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset11 = multiplePiePlot7.getDataset();
        java.awt.Image image12 = null;
        multiplePiePlot7.setBackgroundImage(image12);
        java.awt.Font font14 = multiplePiePlot7.getNoDataMessageFont();
        plot6.setNoDataMessageFont(font14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on plot6 and multiplePiePlot7", plot6.equals(multiplePiePlot7) ? plot6.hashCode() == multiplePiePlot7.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
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
        int int14 = jFreeChart10.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot0 and obj3", multiplePiePlot0.equals(obj3) ? multiplePiePlot0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj19 = multiplePiePlot18.clone();
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot18.getParent();
        java.awt.Image image21 = multiplePiePlot18.getBackgroundImage();
        boolean boolean22 = multiplePiePlot0.equals((java.lang.Object) multiplePiePlot18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and obj19", multiplePiePlot9.equals(obj19) ? multiplePiePlot9.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        float float5 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        float float7 = multiplePiePlot6.getBackgroundAlpha();
        java.awt.Paint paint8 = multiplePiePlot6.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot6.setInsets(rectangleInsets9, false);
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
        multiplePiePlot6.setInsets(rectangleInsets20, false);
        multiplePiePlot0.setInsets(rectangleInsets20, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot6", obj1.equals(multiplePiePlot6) ? obj1.hashCode() == multiplePiePlot6.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj17 = multiplePiePlot16.clone();
        multiplePiePlot16.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = null;
        multiplePiePlot16.setDrawingSupplier(drawingSupplier20);
        multiplePiePlot16.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot16.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = jFreeChart24.getPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = jFreeChart24.getPadding();
        jFreeChart4.setPadding(rectangleInsets26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj17", multiplePiePlot1.equals(obj17) ? multiplePiePlot1.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj13 = multiplePiePlot12.clone();
        multiplePiePlot12.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier16);
        multiplePiePlot12.setForegroundAlpha(0.0f);
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        int int22 = multiplePiePlot12.getBackgroundImageAlignment();
        java.awt.Paint paint23 = multiplePiePlot12.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot12.getPieChart();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj26 = multiplePiePlot25.clone();
        multiplePiePlot25.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = null;
        multiplePiePlot25.setDrawingSupplier(drawingSupplier29);
        multiplePiePlot25.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart33 = multiplePiePlot25.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset34 = multiplePiePlot25.getDataset();
        java.awt.Paint paint35 = multiplePiePlot25.getOutlinePaint();
        jFreeChart24.setBorderPaint(paint35);
        multiplePiePlot0.setBackgroundPaint(paint35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj26", obj1.equals(obj26) ? obj1.hashCode() == obj26.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj13 = multiplePiePlot12.clone();
        multiplePiePlot12.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier16);
        multiplePiePlot12.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot12.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot12);
        java.awt.Paint paint22 = jFreeChart21.getBackgroundPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and obj13", multiplePiePlot4.equals(obj13) ? multiplePiePlot4.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot0.getRootPlot();
        multiplePiePlot0.setNoDataMessage("");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj13 = multiplePiePlot12.clone();
        multiplePiePlot12.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier16);
        java.awt.Image image18 = multiplePiePlot12.getBackgroundImage();
        boolean boolean20 = multiplePiePlot12.equals((java.lang.Object) 1.0f);
        java.awt.Stroke stroke21 = multiplePiePlot12.getOutlineStroke();
        multiplePiePlot0.setOutlineStroke(stroke21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj13", obj1.equals(obj13) ? obj1.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        jFreeChart4.setBorderVisible(false);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        java.awt.Paint paint18 = jFreeChart17.getBackgroundPaint();
        java.awt.Stroke stroke19 = jFreeChart17.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle20 = jFreeChart17.getTitle();
        java.lang.Object obj21 = jFreeChart17.clone();
        java.awt.Stroke stroke22 = jFreeChart17.getBorderStroke();
        jFreeChart17.setAntiAlias(true);
        org.jfree.chart.title.LegendTitle legendTitle26 = jFreeChart17.getLegend(100);
        jFreeChart17.setNotify(false);
        org.jfree.chart.title.TextTitle textTitle29 = jFreeChart17.getTitle();
        jFreeChart4.setTitle(textTitle29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot14", multiplePiePlot1.equals(multiplePiePlot14) ? multiplePiePlot1.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        java.awt.Font font9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier14);
        multiplePiePlot10.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot10.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot10);
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart("", font9, (org.jfree.chart.plot.Plot) multiplePiePlot10, false);
        java.awt.Paint paint22 = jFreeChart21.getBorderPaint();
        jFreeChart4.setBorderPaint(paint22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj11", multiplePiePlot1.equals(obj11) ? multiplePiePlot1.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        float float18 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot17.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot17);
        java.awt.Paint paint21 = jFreeChart20.getBackgroundPaint();
        java.awt.Stroke stroke22 = jFreeChart20.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle23 = jFreeChart20.getTitle();
        jFreeChart4.setTitle(textTitle23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot17", multiplePiePlot1.equals(multiplePiePlot17) ? multiplePiePlot1.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        float float21 = multiplePiePlot20.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot22 = multiplePiePlot20.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart23 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot20);
        java.awt.Paint paint24 = jFreeChart23.getBackgroundPaint();
        java.awt.Stroke stroke25 = jFreeChart23.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle26 = jFreeChart23.getTitle();
        jFreeChart13.setTitle(textTitle26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot0 and multiplePiePlot20", multiplePiePlot0.equals(multiplePiePlot20) ? multiplePiePlot0.hashCode() == multiplePiePlot20.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        java.awt.Paint paint17 = jFreeChart16.getBackgroundPaint();
        java.awt.Stroke stroke18 = jFreeChart16.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle19 = jFreeChart16.getTitle();
        java.lang.Object obj20 = jFreeChart16.clone();
        java.awt.Stroke stroke21 = jFreeChart16.getBorderStroke();
        jFreeChart16.setAntiAlias(true);
        org.jfree.chart.title.LegendTitle legendTitle25 = jFreeChart16.getLegend(100);
        jFreeChart16.setNotify(false);
        org.jfree.chart.title.TextTitle textTitle28 = jFreeChart16.getTitle();
        jFreeChart4.removeSubtitle((org.jfree.chart.title.Title) textTitle28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot13", multiplePiePlot1.equals(multiplePiePlot13) ? multiplePiePlot1.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getRootPlot();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = multiplePiePlot3.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder5 = multiplePiePlot3.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        float float7 = multiplePiePlot6.getBackgroundAlpha();
        java.awt.Paint paint8 = multiplePiePlot6.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot6.setInsets(rectangleInsets9, false);
        multiplePiePlot3.setInsets(rectangleInsets9);
        multiplePiePlot0.setInsets(rectangleInsets9, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot0 and multiplePiePlot3", multiplePiePlot0.equals(multiplePiePlot3) ? multiplePiePlot0.hashCode() == multiplePiePlot3.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        java.awt.Paint paint7 = jFreeChart4.getBorderPaint();
        java.lang.Object obj8 = jFreeChart4.clone();
        java.lang.Object obj9 = jFreeChart4.clone();
        float float10 = jFreeChart4.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and obj9", obj8.equals(obj9) ? obj8.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj5 = multiplePiePlot4.clone();
        multiplePiePlot4.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot4.setNoDataMessagePaint(paint8);
        java.awt.Font font10 = multiplePiePlot4.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot4.getDrawingSupplier();
        multiplePiePlot0.setDrawingSupplier(drawingSupplier11);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        jFreeChart17.fireChartChanged();
        boolean boolean19 = jFreeChart17.getAntiAlias();
        java.awt.Paint paint20 = jFreeChart17.getBorderPaint();
        boolean boolean21 = multiplePiePlot0.equals((java.lang.Object) jFreeChart17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier1 and drawingSupplier11", drawingSupplier1.equals(drawingSupplier11) ? drawingSupplier1.hashCode() == drawingSupplier11.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = multiplePiePlot0.getDatasetGroup();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj9 = multiplePiePlot8.clone();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot8.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot8.setInsets(rectangleInsets11);
        multiplePiePlot0.setInsets(rectangleInsets11, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot8", obj1.equals(multiplePiePlot8) ? obj1.hashCode() == multiplePiePlot8.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        java.awt.Image image7 = jFreeChart4.getBackgroundImage();
        jFreeChart4.setBackgroundImageAlignment((int) '#');
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier14);
        multiplePiePlot10.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot10.getPieChart();
        jFreeChart18.removeLegend();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo24 = null;
        java.awt.image.BufferedImage bufferedImage25 = jFreeChart18.createBufferedImage((int) ' ', (int) (byte) 10, (double) (short) 1, 10.0d, chartRenderingInfo24);
        jFreeChart4.setBackgroundImage((java.awt.Image) bufferedImage25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj11", multiplePiePlot1.equals(obj11) ? multiplePiePlot1.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj16 = multiplePiePlot15.clone();
        multiplePiePlot15.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = null;
        multiplePiePlot15.setDrawingSupplier(drawingSupplier19);
        multiplePiePlot15.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot15.getPieChart();
        jFreeChart23.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot();
        float float27 = multiplePiePlot26.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot28 = multiplePiePlot26.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart29 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot26);
        java.awt.Paint paint30 = jFreeChart29.getBackgroundPaint();
        java.awt.Stroke stroke31 = jFreeChart29.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle32 = jFreeChart29.getTitle();
        jFreeChart23.setTitle(textTitle32);
        jFreeChart13.setTitle(textTitle32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot26", obj3.equals(multiplePiePlot26) ? obj3.hashCode() == multiplePiePlot26.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj19 = multiplePiePlot18.clone();
        multiplePiePlot18.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = null;
        multiplePiePlot18.setDrawingSupplier(drawingSupplier22);
        multiplePiePlot18.zoom(0.0d);
        org.jfree.chart.plot.Plot plot26 = multiplePiePlot18.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        plot26.setInsets(rectangleInsets27);
        jFreeChart17.setPadding(rectangleInsets27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj2 and multiplePiePlot13", obj2.equals(multiplePiePlot13) ? obj2.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj13 = multiplePiePlot12.clone();
        multiplePiePlot12.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier16);
        multiplePiePlot12.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot12.getPieChart();
        org.jfree.chart.title.Title title22 = jFreeChart20.getSubtitle((int) (byte) 0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot();
        float float25 = multiplePiePlot24.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot26 = multiplePiePlot24.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart27 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot24);
        jFreeChart27.fireChartChanged();
        boolean boolean29 = jFreeChart27.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle31 = jFreeChart27.getLegend((int) (short) 0);
        jFreeChart20.addLegend(legendTitle31);
        jFreeChart4.removeSubtitle((org.jfree.chart.title.Title) legendTitle31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot24", multiplePiePlot1.equals(multiplePiePlot24) ? multiplePiePlot1.hashCode() == multiplePiePlot24.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier17);
        boolean boolean19 = jFreeChart4.equals((java.lang.Object) drawingSupplier17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj14", multiplePiePlot1.equals(obj14) ? multiplePiePlot1.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        float float16 = multiplePiePlot15.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot15.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart18 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot15);
        org.jfree.chart.title.LegendTitle legendTitle19 = jFreeChart18.getLegend();
        org.jfree.chart.title.LegendTitle legendTitle20 = jFreeChart18.getLegend();
        jFreeChart4.addLegend(legendTitle20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot15", multiplePiePlot1.equals(multiplePiePlot15) ? multiplePiePlot1.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        float float17 = multiplePiePlot16.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot16.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot16);
        jFreeChart19.fireChartChanged();
        java.lang.Object obj21 = jFreeChart19.clone();
        java.awt.Paint paint22 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart19.setBackgroundPaint(paint22);
        boolean boolean24 = jFreeChart19.isBorderVisible();
        jFreeChart19.setBackgroundImageAlignment(1);
        jFreeChart19.removeLegend();
        java.awt.image.BufferedImage bufferedImage30 = jFreeChart19.createBufferedImage((int) (short) 1, (int) ' ');
        jFreeChart4.setBackgroundImage((java.awt.Image) bufferedImage30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot16", multiplePiePlot1.equals(multiplePiePlot16) ? multiplePiePlot1.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        float float18 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot17.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot17);
        java.awt.Paint paint21 = jFreeChart20.getBackgroundPaint();
        java.awt.Stroke stroke22 = jFreeChart20.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle23 = jFreeChart20.getTitle();
        jFreeChart4.setTitle(textTitle23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot17", multiplePiePlot1.equals(multiplePiePlot17) ? multiplePiePlot1.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart4.setBackgroundPaint(paint7);
        boolean boolean9 = jFreeChart4.isBorderVisible();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        float float12 = multiplePiePlot11.getBackgroundAlpha();
        java.awt.Paint paint13 = multiplePiePlot11.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot11);
        float float15 = multiplePiePlot11.getForegroundAlpha();
        java.awt.Paint paint16 = multiplePiePlot11.getAggregatedItemsPaint();
        float float17 = multiplePiePlot11.getForegroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = multiplePiePlot11.getInsets();
        jFreeChart4.setPadding(rectangleInsets18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot11", multiplePiePlot1.equals(multiplePiePlot11) ? multiplePiePlot1.hashCode() == multiplePiePlot11.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
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
        java.lang.Class<?> wildcardClass16 = multiplePiePlot0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart10 and jFreeChart15", jFreeChart10.equals(jFreeChart15) ? jFreeChart10.hashCode() == jFreeChart15.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        multiplePiePlot0.setBackgroundImageAlignment(15);
        org.jfree.chart.JFreeChart jFreeChart10 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        jFreeChart15.fireChartChanged();
        boolean boolean17 = jFreeChart15.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle19 = jFreeChart15.getLegend((int) (short) 0);
        jFreeChart10.addSubtitle((org.jfree.chart.title.Title) legendTitle19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot12", obj1.equals(multiplePiePlot12) ? obj1.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot13.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection15 = multiplePiePlot13.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        multiplePiePlot13.setDataset(categoryDataset16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = multiplePiePlot13.getDataset();
        boolean boolean19 = multiplePiePlot13.isOutlineVisible();
        plot12.setParent((org.jfree.chart.plot.Plot) multiplePiePlot13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart4 and obj6", jFreeChart4.equals(obj6) ? jFreeChart4.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        jFreeChart17.fireChartChanged();
        java.lang.Object obj19 = jFreeChart17.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo22 = null;
        java.awt.image.BufferedImage bufferedImage23 = jFreeChart17.createBufferedImage((int) '#', 1, chartRenderingInfo22);
        boolean boolean24 = jFreeChart17.isNotify();
        java.awt.Stroke stroke25 = jFreeChart17.getBorderStroke();
        jFreeChart8.setBorderStroke(stroke25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot14", obj1.equals(multiplePiePlot14) ? obj1.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        float float18 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot17.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot17);
        jFreeChart20.fireChartChanged();
        java.lang.Object obj22 = jFreeChart20.clone();
        java.awt.Paint paint23 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart20.setBackgroundPaint(paint23);
        boolean boolean25 = jFreeChart20.isBorderVisible();
        jFreeChart20.setBackgroundImageAlignment(1);
        jFreeChart20.removeLegend();
        java.awt.image.BufferedImage bufferedImage31 = jFreeChart20.createBufferedImage((int) (short) 1, (int) ' ');
        jFreeChart4.setBackgroundImage((java.awt.Image) bufferedImage31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot17", multiplePiePlot1.equals(multiplePiePlot17) ? multiplePiePlot1.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        float float18 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot17.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot17);
        jFreeChart20.fireChartChanged();
        java.lang.Object obj22 = jFreeChart20.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo25 = null;
        java.awt.image.BufferedImage bufferedImage26 = jFreeChart20.createBufferedImage((int) '#', 1, chartRenderingInfo25);
        org.jfree.chart.title.LegendTitle legendTitle27 = jFreeChart20.getLegend();
        java.awt.RenderingHints renderingHints28 = jFreeChart20.getRenderingHints();
        jFreeChart4.setRenderingHints(renderingHints28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot17", multiplePiePlot1.equals(multiplePiePlot17) ? multiplePiePlot1.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier3 = multiplePiePlot2.getDrawingSupplier();
        java.awt.Paint paint4 = multiplePiePlot2.getBackgroundPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = multiplePiePlot2.getLegendItems();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj7 = multiplePiePlot6.clone();
        multiplePiePlot6.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint10 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot6.setNoDataMessagePaint(paint10);
        java.awt.Font font12 = multiplePiePlot6.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = multiplePiePlot6.getDrawingSupplier();
        multiplePiePlot2.setDrawingSupplier(drawingSupplier13);
        multiplePiePlot1.setDrawingSupplier(drawingSupplier13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot2 and obj7", multiplePiePlot2.equals(obj7) ? multiplePiePlot2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
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
        boolean boolean20 = jFreeChart15.isNotify();
        java.awt.RenderingHints renderingHints21 = jFreeChart15.getRenderingHints();
        jFreeChart8.setRenderingHints(renderingHints21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot12", obj1.equals(multiplePiePlot12) ? obj1.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        java.lang.Object obj11 = jFreeChart4.getTextAntiAlias();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        jFreeChart16.fireChartChanged();
        java.lang.Object obj18 = jFreeChart16.clone();
        java.awt.image.BufferedImage bufferedImage21 = jFreeChart16.createBufferedImage((int) '4', (int) (short) 10);
        jFreeChart4.setBackgroundImage((java.awt.Image) bufferedImage21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot13", multiplePiePlot1.equals(multiplePiePlot13) ? multiplePiePlot1.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        float float18 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot17.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot17);
        jFreeChart20.fireChartChanged();
        java.lang.Object obj22 = jFreeChart20.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo25 = null;
        java.awt.image.BufferedImage bufferedImage26 = jFreeChart20.createBufferedImage((int) '#', 1, chartRenderingInfo25);
        jFreeChart4.setBackgroundImage((java.awt.Image) bufferedImage26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot17", multiplePiePlot1.equals(multiplePiePlot17) ? multiplePiePlot1.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint4 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setNoDataMessagePaint(paint4);
        java.awt.Font font6 = multiplePiePlot0.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = multiplePiePlot0.getDrawingSupplier();
        java.lang.String str8 = multiplePiePlot0.getNoDataMessage();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        float float11 = multiplePiePlot10.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot10.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot10);
        java.awt.Paint paint14 = jFreeChart13.getBackgroundPaint();
        java.awt.Stroke stroke15 = jFreeChart13.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle16 = jFreeChart13.getTitle();
        java.lang.Object obj17 = jFreeChart13.clone();
        java.awt.Stroke stroke18 = jFreeChart13.getBorderStroke();
        multiplePiePlot0.setOutlineStroke(stroke18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot10", obj1.equals(multiplePiePlot10) ? obj1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.awt.Image image8 = jFreeChart4.getBackgroundImage();
        jFreeChart4.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        float float11 = multiplePiePlot10.getBackgroundAlpha();
        java.awt.Paint paint12 = multiplePiePlot10.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot10.setInsets(rectangleInsets13, false);
        jFreeChart4.setPadding(rectangleInsets13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot10", multiplePiePlot1.equals(multiplePiePlot10) ? multiplePiePlot1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = multiplePiePlot0.getDatasetGroup();
        float float8 = multiplePiePlot0.getBackgroundImageAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot9.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection11 = multiplePiePlot9.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot9.setDataset(categoryDataset12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = multiplePiePlot9.getDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj16 = multiplePiePlot15.clone();
        multiplePiePlot15.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = null;
        multiplePiePlot15.setDrawingSupplier(drawingSupplier19);
        java.awt.Image image21 = multiplePiePlot15.getBackgroundImage();
        boolean boolean23 = multiplePiePlot15.equals((java.lang.Object) 1.0f);
        org.jfree.chart.JFreeChart jFreeChart24 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot15);
        multiplePiePlot9.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart24);
        multiplePiePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot9", obj1.equals(multiplePiePlot9) ? obj1.hashCode() == multiplePiePlot9.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
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
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart10 and jFreeChart15", jFreeChart10.equals(jFreeChart15) ? jFreeChart10.hashCode() == jFreeChart15.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        multiplePiePlot0.zoom((double) ' ');
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        float float9 = multiplePiePlot8.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot8.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot8);
        jFreeChart11.fireChartChanged();
        java.lang.Object obj13 = jFreeChart11.clone();
        int int14 = jFreeChart11.getSubtitleCount();
        java.awt.Image image15 = jFreeChart11.getBackgroundImage();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = jFreeChart11.getPadding();
        multiplePiePlot0.setInsets(rectangleInsets16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot8", obj1.equals(multiplePiePlot8) ? obj1.hashCode() == multiplePiePlot8.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        float float19 = multiplePiePlot18.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot18.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot18);
        java.awt.Paint paint22 = jFreeChart21.getBackgroundPaint();
        java.awt.Stroke stroke23 = jFreeChart21.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle24 = jFreeChart21.getTitle();
        java.lang.Object obj25 = jFreeChart21.clone();
        int int26 = jFreeChart21.getBackgroundImageAlignment();
        org.jfree.chart.title.Title title28 = jFreeChart21.getSubtitle(0);
        jFreeChart13.addSubtitle(title28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot18", obj3.equals(multiplePiePlot18) ? obj3.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
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
        java.awt.Stroke stroke13 = jFreeChart4.getBorderStroke();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj12", obj6.equals(obj12) ? obj6.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj15 = multiplePiePlot14.clone();
        multiplePiePlot14.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot14.setDrawingSupplier(drawingSupplier18);
        multiplePiePlot14.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot14.getPieChart();
        org.jfree.chart.title.Title title24 = jFreeChart22.getSubtitle((int) (byte) 0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot();
        float float27 = multiplePiePlot26.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot28 = multiplePiePlot26.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart29 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot26);
        jFreeChart29.fireChartChanged();
        boolean boolean31 = jFreeChart29.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle33 = jFreeChart29.getLegend((int) (short) 0);
        jFreeChart22.addLegend(legendTitle33);
        jFreeChart4.removeSubtitle((org.jfree.chart.title.Title) legendTitle33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot26", multiplePiePlot1.equals(multiplePiePlot26) ? multiplePiePlot1.hashCode() == multiplePiePlot26.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        float float21 = multiplePiePlot20.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot22 = multiplePiePlot20.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart23 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot20);
        jFreeChart23.fireChartChanged();
        java.lang.Object obj25 = jFreeChart23.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo28 = null;
        java.awt.image.BufferedImage bufferedImage29 = jFreeChart23.createBufferedImage((int) '#', 1, chartRenderingInfo28);
        boolean boolean30 = jFreeChart23.isNotify();
        java.awt.Stroke stroke31 = jFreeChart23.getBorderStroke();
        multiplePiePlot0.setOutlineStroke(stroke31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and multiplePiePlot20", obj6.equals(multiplePiePlot20) ? obj6.hashCode() == multiplePiePlot20.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
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
        java.lang.Object obj14 = multiplePiePlot13.clone();
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier17);
        multiplePiePlot13.zoom(0.0d);
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        multiplePiePlot13.drawBackgroundImage(graphics2D21, rectangle2D22);
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        multiplePiePlot13.drawBackgroundImage(graphics2D24, rectangle2D25);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = multiplePiePlot13.getInsets();
        float float28 = multiplePiePlot13.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart30 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", font12, (org.jfree.chart.plot.Plot) multiplePiePlot13, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj2 and obj14", obj2.equals(obj14) ? obj2.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj21 = multiplePiePlot20.clone();
        multiplePiePlot20.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint24 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot20.setNoDataMessagePaint(paint24);
        java.awt.Font font26 = multiplePiePlot20.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot();
        float float28 = multiplePiePlot27.getBackgroundAlpha();
        java.awt.Paint paint29 = multiplePiePlot27.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = multiplePiePlot27.getInsets();
        org.jfree.chart.JFreeChart jFreeChart32 = new org.jfree.chart.JFreeChart("Other", font26, (org.jfree.chart.plot.Plot) multiplePiePlot27, true);
        multiplePiePlot0.setNoDataMessageFont(font26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj21", obj7.equals(obj21) ? obj7.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot();
        float float23 = multiplePiePlot22.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot22.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart25 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot22);
        jFreeChart25.fireChartChanged();
        boolean boolean27 = jFreeChart25.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle29 = jFreeChart25.getLegend((int) (short) 0);
        jFreeChart8.addSubtitle((org.jfree.chart.title.Title) legendTitle29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot12 and multiplePiePlot22", multiplePiePlot12.equals(multiplePiePlot22) ? multiplePiePlot12.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        float float18 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot17.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot17);
        jFreeChart20.fireChartChanged();
        java.lang.Object obj22 = jFreeChart20.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo25 = null;
        java.awt.image.BufferedImage bufferedImage26 = jFreeChart20.createBufferedImage(100, (int) '#', chartRenderingInfo25);
        jFreeChart4.setBackgroundImage((java.awt.Image) bufferedImage26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot17", multiplePiePlot1.equals(multiplePiePlot17) ? multiplePiePlot1.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
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
        java.util.List list16 = jFreeChart13.getSubtitles();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj18 = multiplePiePlot17.clone();
        multiplePiePlot17.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = null;
        multiplePiePlot17.setDrawingSupplier(drawingSupplier21);
        multiplePiePlot17.setLimit((double) 100L);
        multiplePiePlot17.setBackgroundImageAlignment(15);
        org.jfree.chart.JFreeChart jFreeChart27 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot17);
        java.awt.Paint paint28 = multiplePiePlot17.getBackgroundPaint();
        jFreeChart13.setBorderPaint(paint28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj18", obj3.equals(obj18) ? obj3.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.awt.Image image8 = jFreeChart4.getBackgroundImage();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        float float11 = multiplePiePlot10.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot10.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot10);
        jFreeChart13.fireChartChanged();
        java.lang.Object obj15 = jFreeChart13.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo18 = null;
        java.awt.image.BufferedImage bufferedImage19 = jFreeChart13.createBufferedImage((int) '#', 1, chartRenderingInfo18);
        org.jfree.chart.title.LegendTitle legendTitle20 = jFreeChart13.getLegend();
        java.awt.RenderingHints renderingHints21 = jFreeChart13.getRenderingHints();
        jFreeChart4.setRenderingHints(renderingHints21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot10", multiplePiePlot1.equals(multiplePiePlot10) ? multiplePiePlot1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint4 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setNoDataMessagePaint(paint4);
        float float6 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj8 = multiplePiePlot7.clone();
        multiplePiePlot7.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot7.setDrawingSupplier(drawingSupplier11);
        multiplePiePlot7.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart15 = multiplePiePlot7.getPieChart();
        org.jfree.chart.title.Title title17 = jFreeChart15.getSubtitle((int) (byte) 0);
        jFreeChart15.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot();
        float float20 = multiplePiePlot19.getBackgroundAlpha();
        java.awt.Paint paint21 = multiplePiePlot19.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot19.setInsets(rectangleInsets22, false);
        jFreeChart15.setPadding(rectangleInsets22);
        java.awt.Paint paint26 = jFreeChart15.getBorderPaint();
        org.jfree.chart.title.LegendTitle legendTitle27 = jFreeChart15.getLegend();
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot19", obj1.equals(multiplePiePlot19) ? obj1.hashCode() == multiplePiePlot19.hashCode() : true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder1 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder3 = multiplePiePlot2.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj7 = multiplePiePlot6.clone();
        multiplePiePlot6.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot6.setDrawingSupplier(drawingSupplier10);
        multiplePiePlot6.setLimit((double) 100L);
        multiplePiePlot6.setBackgroundImageAlignment(15);
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot6);
        java.awt.Paint paint17 = multiplePiePlot6.getBackgroundPaint();
        multiplePiePlot0.setNoDataMessagePaint(paint17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot2 and obj7", multiplePiePlot2.equals(obj7) ? multiplePiePlot2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj5 = multiplePiePlot4.clone();
        multiplePiePlot4.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot4.setNoDataMessagePaint(paint8);
        java.awt.Font font10 = multiplePiePlot4.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot4.getDrawingSupplier();
        multiplePiePlot0.setDrawingSupplier(drawingSupplier11);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        jFreeChart17.fireChartChanged();
        java.lang.Object obj19 = jFreeChart17.clone();
        java.awt.Paint paint20 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart17.setBackgroundPaint(paint20);
        boolean boolean22 = jFreeChart17.isBorderVisible();
        jFreeChart17.setBackgroundImageAlignment(1);
        jFreeChart17.removeLegend();
        java.awt.image.BufferedImage bufferedImage28 = jFreeChart17.createBufferedImage((int) (short) 1, (int) ' ');
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier1 and drawingSupplier11", drawingSupplier1.equals(drawingSupplier11) ? drawingSupplier1.hashCode() == drawingSupplier11.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = multiplePiePlot14.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder16 = multiplePiePlot14.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        float float18 = multiplePiePlot17.getBackgroundAlpha();
        java.awt.Paint paint19 = multiplePiePlot17.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot17.setInsets(rectangleInsets20, false);
        multiplePiePlot14.setInsets(rectangleInsets20);
        multiplePiePlot0.setInsets(rectangleInsets20, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot14", obj1.equals(multiplePiePlot14) ? obj1.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder16 = multiplePiePlot15.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder18 = multiplePiePlot17.getDataExtractOrder();
        multiplePiePlot15.setDataExtractOrder(tableOrder18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = multiplePiePlot15.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection21 = multiplePiePlot15.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = multiplePiePlot15.getInsets();
        jFreeChart13.setPadding(rectangleInsets22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot15", obj3.equals(multiplePiePlot15) ? obj3.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) 10.0f);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot();
        float float5 = multiplePiePlot4.getBackgroundAlpha();
        java.awt.Paint paint6 = multiplePiePlot4.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot4.setInsets(rectangleInsets7, false);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot10.setDataset(categoryDataset12);
        java.awt.Font font14 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot10.setNoDataMessageFont(font14);
        java.lang.String str16 = multiplePiePlot10.getPlotType();
        boolean boolean17 = multiplePiePlot10.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot10.setInsets(rectangleInsets18, false);
        multiplePiePlot4.setInsets(rectangleInsets18, false);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        multiplePiePlot4.setDataset(categoryDataset23);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = multiplePiePlot4.getDrawingSupplier();
        multiplePiePlot0.setDrawingSupplier(drawingSupplier25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and obj11", multiplePiePlot4.equals(obj11) ? multiplePiePlot4.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        double double8 = multiplePiePlot0.getLimit();
        java.awt.Paint paint9 = multiplePiePlot0.getNoDataMessagePaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot10.getDrawingSupplier();
        multiplePiePlot0.setDrawingSupplier(drawingSupplier11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot10", obj1.equals(multiplePiePlot10) ? obj1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        java.awt.Stroke stroke8 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        jFreeChart4.setBorderStroke(stroke8);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        float float11 = multiplePiePlot10.getBackgroundAlpha();
        float float12 = multiplePiePlot10.getBackgroundAlpha();
        java.awt.Stroke stroke13 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot10.setOutlineStroke(stroke13);
        jFreeChart4.setBorderStroke(stroke13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot10", multiplePiePlot1.equals(multiplePiePlot10) ? multiplePiePlot1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder1 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder3 = multiplePiePlot2.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot0.getLegendItems();
        multiplePiePlot0.setBackgroundAlpha(0.0f);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj10 = multiplePiePlot9.clone();
        multiplePiePlot9.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier13);
        multiplePiePlot9.setForegroundAlpha(0.0f);
        multiplePiePlot9.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot9.zoom((double) (byte) 0);
        boolean boolean21 = multiplePiePlot9.isSubplot();
        java.awt.Stroke stroke22 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot9.setOutlineStroke(stroke22);
        multiplePiePlot0.setOutlineStroke(stroke22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot2 and obj10", multiplePiePlot2.equals(obj10) ? multiplePiePlot2.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj15 = multiplePiePlot14.clone();
        multiplePiePlot14.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot14.setDrawingSupplier(drawingSupplier18);
        java.awt.Image image20 = multiplePiePlot14.getBackgroundImage();
        boolean boolean22 = multiplePiePlot14.equals((java.lang.Object) 1.0f);
        java.awt.Stroke stroke23 = multiplePiePlot14.getOutlineStroke();
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot14.getRootPlot();
        multiplePiePlot0.setParent(plot24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj15", obj1.equals(obj15) ? obj1.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj20 = multiplePiePlot19.clone();
        multiplePiePlot19.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint23 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot19.setNoDataMessagePaint(paint23);
        java.awt.Font font25 = multiplePiePlot19.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = multiplePiePlot19.getDrawingSupplier();
        multiplePiePlot0.setDrawingSupplier(drawingSupplier26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj20", obj6.equals(obj20) ? obj6.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj22 = multiplePiePlot21.clone();
        org.jfree.chart.plot.Plot plot23 = multiplePiePlot21.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot21.setInsets(rectangleInsets24);
        multiplePiePlot1.setInsets(rectangleInsets24, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot21", multiplePiePlot9.equals(multiplePiePlot21) ? multiplePiePlot9.hashCode() == multiplePiePlot21.hashCode() : true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        int int7 = jFreeChart4.getSubtitleCount();
        java.awt.Image image8 = jFreeChart4.getBackgroundImage();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = jFreeChart4.getPadding();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier14);
        multiplePiePlot10.setForegroundAlpha(0.0f);
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot10.zoom((double) (byte) 0);
        boolean boolean22 = multiplePiePlot10.isSubplot();
        java.awt.Stroke stroke23 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot10.setOutlineStroke(stroke23);
        jFreeChart4.setBorderStroke(stroke23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj11", multiplePiePlot1.equals(obj11) ? multiplePiePlot1.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        java.awt.Image image9 = null;
        multiplePiePlot0.setBackgroundImage(image9);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        java.awt.Paint paint16 = jFreeChart15.getBackgroundPaint();
        java.awt.Stroke stroke17 = jFreeChart15.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle18 = jFreeChart15.getTitle();
        java.lang.Object obj19 = jFreeChart15.clone();
        org.jfree.chart.event.ChartProgressListener chartProgressListener20 = null;
        jFreeChart15.addProgressListener(chartProgressListener20);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot12", obj1.equals(multiplePiePlot12) ? obj1.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        java.awt.Image image7 = multiplePiePlot0.getBackgroundImage();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        float float10 = multiplePiePlot9.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot9.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart12 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot9);
        java.awt.Paint paint13 = jFreeChart12.getBackgroundPaint();
        multiplePiePlot0.setOutlinePaint(paint13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot9", obj1.equals(multiplePiePlot9) ? obj1.hashCode() == multiplePiePlot9.hashCode() : true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        java.awt.Image image7 = multiplePiePlot0.getBackgroundImage();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj9 = multiplePiePlot8.clone();
        multiplePiePlot8.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier12);
        java.awt.Paint paint14 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot8.setBackgroundPaint(paint14);
        org.jfree.chart.util.TableOrder tableOrder16 = multiplePiePlot8.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj9", obj1.equals(obj9) ? obj1.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.lang.Object obj8 = jFreeChart4.clone();
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
        org.jfree.chart.title.LegendTitle legendTitle29 = jFreeChart17.getLegend();
        jFreeChart4.removeSubtitle((org.jfree.chart.title.Title) legendTitle29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot21", multiplePiePlot1.equals(multiplePiePlot21) ? multiplePiePlot1.hashCode() == multiplePiePlot21.hashCode() : true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj15 = multiplePiePlot14.clone();
        multiplePiePlot14.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot14.setDrawingSupplier(drawingSupplier18);
        multiplePiePlot14.setForegroundAlpha(0.0f);
        multiplePiePlot14.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        int int24 = multiplePiePlot14.getBackgroundImageAlignment();
        java.awt.Paint paint25 = multiplePiePlot14.getAggregatedItemsPaint();
        java.awt.Paint paint26 = multiplePiePlot14.getBackgroundPaint();
        multiplePiePlot0.setNoDataMessagePaint(paint26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj15", obj1.equals(obj15) ? obj1.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        boolean boolean8 = multiplePiePlot0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        multiplePiePlot0.setNoDataMessage("");
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
        multiplePiePlot0.setNoDataMessageFont(font23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj13", obj1.equals(obj13) ? obj1.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
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
        java.util.List list18 = jFreeChart13.getSubtitles();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj20 = multiplePiePlot19.clone();
        multiplePiePlot19.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint23 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot19.setNoDataMessagePaint(paint23);
        float float25 = multiplePiePlot19.getBackgroundAlpha();
        boolean boolean26 = jFreeChart13.equals((java.lang.Object) multiplePiePlot19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj20", obj3.equals(obj20) ? obj3.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        int int7 = jFreeChart4.getSubtitleCount();
        java.awt.Image image8 = jFreeChart4.getBackgroundImage();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        float float11 = multiplePiePlot10.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot10.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot10);
        java.awt.Paint paint14 = jFreeChart13.getBackgroundPaint();
        java.awt.Stroke stroke15 = jFreeChart13.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener16 = null;
        jFreeChart13.addProgressListener(chartProgressListener16);
        org.jfree.chart.event.ChartProgressListener chartProgressListener18 = null;
        jFreeChart13.removeProgressListener(chartProgressListener18);
        org.jfree.chart.title.TextTitle textTitle20 = jFreeChart13.getTitle();
        jFreeChart4.setTitle(textTitle20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot10", multiplePiePlot1.equals(multiplePiePlot10) ? multiplePiePlot1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj16 = multiplePiePlot15.clone();
        multiplePiePlot15.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = null;
        multiplePiePlot15.setDrawingSupplier(drawingSupplier19);
        multiplePiePlot15.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot15.getPieChart();
        org.jfree.chart.title.Title title25 = jFreeChart23.getSubtitle((int) (byte) 0);
        jFreeChart23.removeLegend();
        org.jfree.chart.title.LegendTitle legendTitle27 = jFreeChart23.getLegend();
        jFreeChart11.addLegend(legendTitle27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj16", obj1.equals(obj16) ? obj1.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj12 = multiplePiePlot11.clone();
        multiplePiePlot11.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier15);
        multiplePiePlot11.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot11.getPieChart();
        org.jfree.chart.title.Title title21 = jFreeChart19.getSubtitle((int) (byte) 0);
        jFreeChart19.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot();
        float float24 = multiplePiePlot23.getBackgroundAlpha();
        java.awt.Font font25 = multiplePiePlot23.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj27 = multiplePiePlot26.clone();
        multiplePiePlot26.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = null;
        multiplePiePlot26.setDrawingSupplier(drawingSupplier30);
        multiplePiePlot26.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart34 = multiplePiePlot26.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset35 = multiplePiePlot26.getDataset();
        java.awt.Paint paint36 = multiplePiePlot26.getOutlinePaint();
        multiplePiePlot23.setAggregatedItemsPaint(paint36);
        jFreeChart19.setBorderPaint(paint36);
        multiplePiePlot0.setOutlinePaint(paint36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj27", obj1.equals(obj27) ? obj1.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        jFreeChart4.fireChartChanged();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        jFreeChart16.fireChartChanged();
        java.lang.Object obj18 = jFreeChart16.clone();
        java.awt.Paint paint19 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart16.setBackgroundPaint(paint19);
        org.jfree.chart.event.ChartProgressListener chartProgressListener21 = null;
        jFreeChart16.addProgressListener(chartProgressListener21);
        jFreeChart16.setNotify(false);
        jFreeChart16.setTextAntiAlias(true);
        java.util.List list27 = jFreeChart16.getSubtitles();
        jFreeChart4.setSubtitles(list27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot13", multiplePiePlot1.equals(multiplePiePlot13) ? multiplePiePlot1.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.awt.Image image6 = jFreeChart4.getBackgroundImage();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        float float9 = multiplePiePlot8.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot8.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot8);
        jFreeChart11.fireChartChanged();
        java.lang.Object obj13 = jFreeChart11.clone();
        int int14 = jFreeChart11.getSubtitleCount();
        java.awt.Image image15 = jFreeChart11.getBackgroundImage();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = jFreeChart11.getPadding();
        jFreeChart4.setPadding(rectangleInsets16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot8", multiplePiePlot1.equals(multiplePiePlot8) ? multiplePiePlot1.hashCode() == multiplePiePlot8.hashCode() : true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder1 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder3 = multiplePiePlot2.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = multiplePiePlot6.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder8 = multiplePiePlot6.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        float float10 = multiplePiePlot9.getBackgroundAlpha();
        java.awt.Paint paint11 = multiplePiePlot9.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot9.setInsets(rectangleInsets12, false);
        multiplePiePlot6.setInsets(rectangleInsets12);
        multiplePiePlot0.setInsets(rectangleInsets12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot2 and multiplePiePlot6", multiplePiePlot2.equals(multiplePiePlot6) ? multiplePiePlot2.hashCode() == multiplePiePlot6.hashCode() : true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = multiplePiePlot16.getDrawingSupplier();
        java.awt.Paint paint18 = multiplePiePlot16.getBackgroundPaint();
        java.awt.Paint paint19 = multiplePiePlot16.getOutlinePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent20 = null;
        multiplePiePlot16.notifyListeners(plotChangeEvent20);
        boolean boolean22 = multiplePiePlot16.isSubplot();
        java.awt.Stroke stroke23 = multiplePiePlot16.getOutlineStroke();
        jFreeChart13.setBorderStroke(stroke23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot16", obj3.equals(multiplePiePlot16) ? obj3.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot0.zoom((double) (byte) 0);
        java.awt.Paint paint12 = multiplePiePlot0.getAggregatedItemsPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier17);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier19);
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot13.getPieChart();
        jFreeChart21.removeLegend();
        multiplePiePlot0.setPieChart(jFreeChart21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj14", obj1.equals(obj14) ? obj1.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        float float7 = multiplePiePlot6.getBackgroundAlpha();
        java.awt.Paint paint8 = multiplePiePlot6.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot6);
        float float10 = multiplePiePlot6.getForegroundAlpha();
        java.awt.Paint paint11 = multiplePiePlot6.getAggregatedItemsPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        java.awt.Paint paint17 = jFreeChart16.getBackgroundPaint();
        java.awt.Stroke stroke18 = jFreeChart16.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle19 = jFreeChart16.getTitle();
        java.awt.Image image20 = jFreeChart16.getBackgroundImage();
        java.awt.Paint paint21 = jFreeChart16.getBorderPaint();
        multiplePiePlot6.setBackgroundPaint(paint21);
        jFreeChart4.setBorderPaint(paint21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot13", multiplePiePlot1.equals(multiplePiePlot13) ? multiplePiePlot1.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj15 = multiplePiePlot14.clone();
        multiplePiePlot14.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot14.setDrawingSupplier(drawingSupplier18);
        multiplePiePlot14.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot14.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart23 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot14);
        float float24 = jFreeChart23.getBackgroundImageAlpha();
        org.jfree.chart.title.Title title26 = jFreeChart23.getSubtitle((int) (short) 0);
        jFreeChart4.removeSubtitle(title26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj15", multiplePiePlot1.equals(obj15) ? multiplePiePlot1.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj28 = multiplePiePlot27.clone();
        multiplePiePlot27.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = null;
        multiplePiePlot27.setDrawingSupplier(drawingSupplier31);
        multiplePiePlot27.zoom(0.0d);
        java.awt.Paint paint35 = multiplePiePlot27.getBackgroundPaint();
        jFreeChart8.setBorderPaint(paint35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and obj28", multiplePiePlot11.equals(obj28) ? multiplePiePlot11.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.awt.Image image8 = jFreeChart4.getBackgroundImage();
        java.awt.Paint paint9 = jFreeChart4.getBorderPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        float float12 = multiplePiePlot11.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot11.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot11);
        jFreeChart14.fireChartChanged();
        java.lang.Object obj16 = jFreeChart14.clone();
        int int17 = jFreeChart14.getSubtitleCount();
        java.awt.Image image18 = jFreeChart14.getBackgroundImage();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = jFreeChart14.getPadding();
        jFreeChart4.setPadding(rectangleInsets19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot11", multiplePiePlot1.equals(multiplePiePlot11) ? multiplePiePlot1.hashCode() == multiplePiePlot11.hashCode() : true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
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
        boolean boolean27 = jFreeChart26.isBorderVisible();
        java.lang.Object obj28 = jFreeChart26.getTextAntiAlias();
        java.util.List list29 = jFreeChart26.getSubtitles();
        jFreeChart11.setSubtitles(list29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj16", obj1.equals(obj16) ? obj1.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        float float18 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot17.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot17);
        java.awt.Paint paint21 = jFreeChart20.getBackgroundPaint();
        java.awt.Stroke stroke22 = jFreeChart20.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener23 = null;
        jFreeChart20.addProgressListener(chartProgressListener23);
        org.jfree.chart.event.ChartProgressListener chartProgressListener25 = null;
        jFreeChart20.removeProgressListener(chartProgressListener25);
        java.awt.Image image27 = jFreeChart20.getBackgroundImage();
        float float28 = jFreeChart20.getBackgroundImageAlpha();
        org.jfree.chart.title.LegendTitle legendTitle29 = jFreeChart20.getLegend();
        jFreeChart4.addSubtitle((org.jfree.chart.title.Title) legendTitle29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot17", multiplePiePlot1.equals(multiplePiePlot17) ? multiplePiePlot1.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj13 = multiplePiePlot12.clone();
        multiplePiePlot12.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier16);
        multiplePiePlot12.zoom(0.0d);
        java.awt.Paint paint20 = multiplePiePlot12.getBackgroundPaint();
        multiplePiePlot1.setBackgroundPaint(paint20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and obj13", multiplePiePlot4.equals(obj13) ? multiplePiePlot4.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
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
        java.awt.Font font28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj30 = multiplePiePlot29.clone();
        multiplePiePlot29.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier33 = null;
        multiplePiePlot29.setDrawingSupplier(drawingSupplier33);
        multiplePiePlot29.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart37 = multiplePiePlot29.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart38 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot29);
        org.jfree.chart.JFreeChart jFreeChart40 = new org.jfree.chart.JFreeChart("", font28, (org.jfree.chart.plot.Plot) multiplePiePlot29, false);
        boolean boolean41 = jFreeChart40.isBorderVisible();
        java.lang.Object obj42 = jFreeChart40.getTextAntiAlias();
        java.util.List list43 = jFreeChart40.getSubtitles();
        jFreeChart18.setSubtitles(list43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot15 and obj30", multiplePiePlot15.equals(obj30) ? multiplePiePlot15.hashCode() == obj30.hashCode() : true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        boolean boolean8 = multiplePiePlot0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        multiplePiePlot0.setNoDataMessage("");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder13 = multiplePiePlot12.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder15 = multiplePiePlot14.getDataExtractOrder();
        multiplePiePlot12.setDataExtractOrder(tableOrder15);
        multiplePiePlot0.setDataExtractOrder(tableOrder15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot12", obj1.equals(multiplePiePlot12) ? obj1.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        java.awt.Font font16 = multiplePiePlot14.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj18 = multiplePiePlot17.clone();
        multiplePiePlot17.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = null;
        multiplePiePlot17.setDrawingSupplier(drawingSupplier21);
        multiplePiePlot17.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart25 = multiplePiePlot17.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset26 = multiplePiePlot17.getDataset();
        java.awt.Paint paint27 = multiplePiePlot17.getOutlinePaint();
        multiplePiePlot14.setAggregatedItemsPaint(paint27);
        jFreeChart4.setBackgroundPaint(paint27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj18", multiplePiePlot1.equals(obj18) ? multiplePiePlot1.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot0.getDatasetGroup();
        multiplePiePlot0.setOutlineVisible(true);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj13 = multiplePiePlot12.clone();
        multiplePiePlot12.setBackgroundAlpha((float) (short) -1);
        java.awt.Font font16 = multiplePiePlot12.getNoDataMessageFont();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        boolean boolean18 = multiplePiePlot0.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj13", obj1.equals(obj13) ? obj1.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint4 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setNoDataMessagePaint(paint4);
        java.awt.Font font6 = multiplePiePlot0.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        float float9 = multiplePiePlot8.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot8.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot8);
        jFreeChart11.fireChartChanged();
        java.lang.Object obj13 = jFreeChart11.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo16 = null;
        java.awt.image.BufferedImage bufferedImage17 = jFreeChart11.createBufferedImage((int) '#', 1, chartRenderingInfo16);
        boolean boolean18 = jFreeChart11.isNotify();
        java.awt.Paint paint19 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart11.setBorderPaint(paint19);
        jFreeChart11.clearSubtitles();
        multiplePiePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot8", obj1.equals(multiplePiePlot8) ? obj1.hashCode() == multiplePiePlot8.hashCode() : true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        java.awt.Paint paint15 = multiplePiePlot13.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        float float17 = multiplePiePlot13.getForegroundAlpha();
        java.awt.Paint paint18 = multiplePiePlot13.getAggregatedItemsPaint();
        boolean boolean19 = multiplePiePlot0.equals((java.lang.Object) paint18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot13", obj1.equals(multiplePiePlot13) ? obj1.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        java.awt.Paint paint7 = jFreeChart4.getBorderPaint();
        java.lang.Object obj8 = jFreeChart4.clone();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        float float10 = multiplePiePlot9.getBackgroundAlpha();
        java.awt.Paint paint11 = multiplePiePlot9.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot9.setInsets(rectangleInsets12, false);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj16 = multiplePiePlot15.clone();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        multiplePiePlot15.setDataset(categoryDataset17);
        java.awt.Font font19 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot15.setNoDataMessageFont(font19);
        java.lang.String str21 = multiplePiePlot15.getPlotType();
        boolean boolean22 = multiplePiePlot15.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot15.setInsets(rectangleInsets23, false);
        multiplePiePlot9.setInsets(rectangleInsets23, false);
        jFreeChart4.setPadding(rectangleInsets23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot9", multiplePiePlot1.equals(multiplePiePlot9) ? multiplePiePlot1.hashCode() == multiplePiePlot9.hashCode() : true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint4 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setNoDataMessagePaint(paint4);
        java.awt.Font font6 = multiplePiePlot0.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj8 = multiplePiePlot7.clone();
        multiplePiePlot7.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot7.setDrawingSupplier(drawingSupplier11);
        multiplePiePlot7.setForegroundAlpha(0.0f);
        multiplePiePlot7.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        int int17 = multiplePiePlot7.getBackgroundImageAlignment();
        java.awt.Paint paint18 = multiplePiePlot7.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot7.getPieChart();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj21 = multiplePiePlot20.clone();
        multiplePiePlot20.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = null;
        multiplePiePlot20.setDrawingSupplier(drawingSupplier24);
        multiplePiePlot20.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart28 = multiplePiePlot20.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset29 = multiplePiePlot20.getDataset();
        java.awt.Paint paint30 = multiplePiePlot20.getOutlinePaint();
        jFreeChart19.setBorderPaint(paint30);
        multiplePiePlot0.setNoDataMessagePaint(paint30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj21", obj1.equals(obj21) ? obj1.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj16 = multiplePiePlot15.clone();
        multiplePiePlot15.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset19 = multiplePiePlot15.getDataset();
        java.awt.Image image20 = null;
        multiplePiePlot15.setBackgroundImage(image20);
        multiplePiePlot15.setNoDataMessage("hi!");
        org.jfree.chart.util.TableOrder tableOrder24 = multiplePiePlot15.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj16", obj3.equals(obj16) ? obj3.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        java.awt.Font font5 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj7 = multiplePiePlot6.clone();
        multiplePiePlot6.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint10 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot6.setNoDataMessagePaint(paint10);
        java.awt.Font font12 = multiplePiePlot6.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = multiplePiePlot6.getDrawingSupplier();
        java.lang.String str14 = multiplePiePlot6.getNoDataMessage();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot6.getParent();
        org.jfree.data.general.DatasetGroup datasetGroup16 = multiplePiePlot6.getDatasetGroup();
        java.awt.Paint paint17 = multiplePiePlot6.getOutlinePaint();
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart("hi!", font5, (org.jfree.chart.plot.Plot) multiplePiePlot6, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj2 and obj7", obj2.equals(obj7) ? obj2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier6);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj9 = multiplePiePlot8.clone();
        multiplePiePlot8.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier12);
        multiplePiePlot8.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart16 = multiplePiePlot8.getPieChart();
        org.jfree.chart.title.Title title18 = jFreeChart16.getSubtitle((int) (byte) 0);
        java.lang.Object obj19 = jFreeChart16.clone();
        java.awt.Paint paint20 = jFreeChart16.getBorderPaint();
        multiplePiePlot0.setAggregatedItemsPaint(paint20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj9", obj1.equals(obj9) ? obj1.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        float float18 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot17.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot17);
        jFreeChart20.fireChartChanged();
        java.lang.Object obj22 = jFreeChart20.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo25 = null;
        java.awt.image.BufferedImage bufferedImage26 = jFreeChart20.createBufferedImage((int) '#', 1, chartRenderingInfo25);
        multiplePiePlot0.setBackgroundImage((java.awt.Image) bufferedImage26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot17", obj1.equals(multiplePiePlot17) ? obj1.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener7 = null;
        jFreeChart4.addProgressListener(chartProgressListener7);
        jFreeChart4.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier14);
        multiplePiePlot10.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot10.getPieChart();
        org.jfree.chart.title.Title title20 = jFreeChart18.getSubtitle((int) (byte) 0);
        jFreeChart18.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot();
        float float23 = multiplePiePlot22.getBackgroundAlpha();
        java.awt.Paint paint24 = multiplePiePlot22.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot22.setInsets(rectangleInsets25, false);
        jFreeChart18.setPadding(rectangleInsets25);
        java.awt.Paint paint29 = jFreeChart18.getBorderPaint();
        org.jfree.chart.title.LegendTitle legendTitle30 = jFreeChart18.getLegend();
        jFreeChart4.addSubtitle((org.jfree.chart.title.Title) legendTitle30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot22", multiplePiePlot1.equals(multiplePiePlot22) ? multiplePiePlot1.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage(1, (int) '#', chartRenderingInfo9);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        java.awt.Paint paint16 = jFreeChart15.getBackgroundPaint();
        java.awt.Stroke stroke17 = jFreeChart15.getBorderStroke();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo20 = null;
        java.awt.image.BufferedImage bufferedImage21 = jFreeChart15.createBufferedImage(1, (int) '#', chartRenderingInfo20);
        jFreeChart4.setBackgroundImage((java.awt.Image) bufferedImage21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot12", multiplePiePlot1.equals(multiplePiePlot12) ? multiplePiePlot1.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.awt.Paint paint3 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent4);
        java.lang.Object obj6 = multiplePiePlot0.clone();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj8 = multiplePiePlot7.clone();
        multiplePiePlot7.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot7.setDrawingSupplier(drawingSupplier11);
        multiplePiePlot7.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart15 = multiplePiePlot7.getPieChart();
        java.awt.Image image16 = null;
        multiplePiePlot7.setBackgroundImage(image16);
        java.awt.Paint paint18 = multiplePiePlot7.getNoDataMessagePaint();
        multiplePiePlot7.setNoDataMessage("");
        multiplePiePlot0.setParent((org.jfree.chart.plot.Plot) multiplePiePlot7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj8", obj6.equals(obj8) ? obj6.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot0.markerChanged(markerChangeEvent3);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        float float7 = multiplePiePlot6.getBackgroundAlpha();
        java.awt.Paint paint8 = multiplePiePlot6.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot6);
        float float10 = multiplePiePlot6.getForegroundAlpha();
        java.awt.Paint paint11 = multiplePiePlot6.getAggregatedItemsPaint();
        float float12 = multiplePiePlot6.getForegroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = multiplePiePlot6.getInsets();
        multiplePiePlot0.setInsets(rectangleInsets13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot0 and multiplePiePlot6", multiplePiePlot0.equals(multiplePiePlot6) ? multiplePiePlot0.hashCode() == multiplePiePlot6.hashCode() : true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj19 = multiplePiePlot18.clone();
        multiplePiePlot18.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = null;
        multiplePiePlot18.setDrawingSupplier(drawingSupplier22);
        multiplePiePlot18.zoom(0.0d);
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        multiplePiePlot18.drawBackgroundImage(graphics2D26, rectangle2D27);
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        multiplePiePlot18.drawBackgroundImage(graphics2D29, rectangle2D30);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = multiplePiePlot18.getInsets();
        jFreeChart13.setPadding(rectangleInsets32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj19", obj3.equals(obj19) ? obj3.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.data.general.DatasetGroup datasetGroup6 = multiplePiePlot0.getDatasetGroup();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj8 = multiplePiePlot7.clone();
        multiplePiePlot7.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot7.setDrawingSupplier(drawingSupplier11);
        multiplePiePlot7.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart15 = multiplePiePlot7.getPieChart();
        org.jfree.chart.title.Title title17 = jFreeChart15.getSubtitle((int) (byte) 0);
        jFreeChart15.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot();
        float float20 = multiplePiePlot19.getBackgroundAlpha();
        java.awt.Paint paint21 = multiplePiePlot19.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot19.setInsets(rectangleInsets22, false);
        jFreeChart15.setPadding(rectangleInsets22);
        java.awt.Paint paint26 = jFreeChart15.getBorderPaint();
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        jFreeChart15.setBorderPaint(paint27);
        multiplePiePlot0.setOutlinePaint(paint27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot19", obj1.equals(multiplePiePlot19) ? obj1.hashCode() == multiplePiePlot19.hashCode() : true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj5 = multiplePiePlot4.clone();
        multiplePiePlot4.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot4.setNoDataMessagePaint(paint8);
        java.awt.Font font10 = multiplePiePlot4.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot4.getDrawingSupplier();
        multiplePiePlot0.setDrawingSupplier(drawingSupplier11);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent13 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier1 and drawingSupplier11", drawingSupplier1.equals(drawingSupplier11) ? drawingSupplier1.hashCode() == drawingSupplier11.hashCode() : true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        float float17 = multiplePiePlot16.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot16.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot16);
        jFreeChart19.fireChartChanged();
        jFreeChart19.fireChartChanged();
        jFreeChart19.fireChartChanged();
        boolean boolean23 = jFreeChart19.isNotify();
        java.awt.Image image24 = jFreeChart19.getBackgroundImage();
        java.lang.Object obj25 = jFreeChart19.clone();
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot16", obj1.equals(multiplePiePlot16) ? obj1.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj18 = multiplePiePlot17.clone();
        multiplePiePlot17.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = null;
        multiplePiePlot17.setDrawingSupplier(drawingSupplier21);
        multiplePiePlot17.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart25 = multiplePiePlot17.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset26 = multiplePiePlot17.getDataset();
        java.awt.Paint paint27 = multiplePiePlot17.getOutlinePaint();
        multiplePiePlot0.setNoDataMessagePaint(paint27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj18", obj7.equals(obj18) ? obj7.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        float float18 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot17.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot17);
        jFreeChart20.fireChartChanged();
        java.lang.Object obj22 = jFreeChart20.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo25 = null;
        java.awt.image.BufferedImage bufferedImage26 = jFreeChart20.createBufferedImage((int) '#', 1, chartRenderingInfo25);
        jFreeChart20.setBorderVisible(false);
        boolean boolean29 = jFreeChart4.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot17", multiplePiePlot1.equals(multiplePiePlot17) ? multiplePiePlot1.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.awt.Paint paint3 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent4);
        java.lang.Object obj6 = multiplePiePlot0.clone();
        java.awt.Paint paint7 = multiplePiePlot0.getOutlinePaint();
        boolean boolean8 = multiplePiePlot0.isSubplot();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier14);
        multiplePiePlot10.setForegroundAlpha(0.0f);
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot10.zoom((double) (byte) 0);
        java.awt.Paint paint22 = multiplePiePlot10.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart23 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot10);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = multiplePiePlot10.getInsets();
        multiplePiePlot0.setInsets(rectangleInsets24, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj11", obj6.equals(obj11) ? obj6.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.awt.Paint paint3 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent4);
        java.lang.Object obj6 = multiplePiePlot0.clone();
        java.awt.Paint paint7 = multiplePiePlot0.getOutlinePaint();
        boolean boolean8 = multiplePiePlot0.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot10.getParent();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        jFreeChart16.fireChartChanged();
        boolean boolean18 = jFreeChart16.getAntiAlias();
        java.awt.Paint paint19 = jFreeChart16.getBorderPaint();
        multiplePiePlot10.setAggregatedItemsPaint(paint19);
        java.awt.Paint paint21 = multiplePiePlot10.getNoDataMessagePaint();
        multiplePiePlot0.setAggregatedItemsPaint(paint21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and multiplePiePlot13", obj6.equals(multiplePiePlot13) ? obj6.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj20 = multiplePiePlot19.clone();
        multiplePiePlot19.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = null;
        multiplePiePlot19.setDrawingSupplier(drawingSupplier23);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = null;
        multiplePiePlot19.setDrawingSupplier(drawingSupplier25);
        org.jfree.chart.JFreeChart jFreeChart27 = multiplePiePlot19.getPieChart();
        jFreeChart27.setNotify(false);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj31 = multiplePiePlot30.clone();
        multiplePiePlot30.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier34 = null;
        multiplePiePlot30.setDrawingSupplier(drawingSupplier34);
        multiplePiePlot30.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart38 = multiplePiePlot30.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = jFreeChart38.getPadding();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot41 = new org.jfree.chart.plot.MultiplePiePlot();
        float float42 = multiplePiePlot41.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot43 = multiplePiePlot41.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart44 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot41);
        jFreeChart44.fireChartChanged();
        boolean boolean46 = jFreeChart44.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle48 = jFreeChart44.getLegend((int) (short) 0);
        jFreeChart38.removeSubtitle((org.jfree.chart.title.Title) legendTitle48);
        jFreeChart27.removeSubtitle((org.jfree.chart.title.Title) legendTitle48);
        jFreeChart13.addLegend(legendTitle48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot0 and multiplePiePlot41", multiplePiePlot0.equals(multiplePiePlot41) ? multiplePiePlot0.hashCode() == multiplePiePlot41.hashCode() : true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
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
        jFreeChart9.setTextAntiAlias(true);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        float float16 = multiplePiePlot15.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot15.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart18 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot15);
        java.awt.Paint paint19 = jFreeChart18.getBackgroundPaint();
        java.awt.Stroke stroke20 = jFreeChart18.getBorderStroke();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo23 = null;
        java.awt.image.BufferedImage bufferedImage24 = jFreeChart18.createBufferedImage(1, (int) '#', chartRenderingInfo23);
        jFreeChart9.setBackgroundImage((java.awt.Image) bufferedImage24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot15", obj1.equals(multiplePiePlot15) ? obj1.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        java.awt.Stroke stroke10 = jFreeChart9.getBorderStroke();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        jFreeChart15.fireChartChanged();
        java.lang.Object obj17 = jFreeChart15.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo20 = null;
        java.awt.image.BufferedImage bufferedImage21 = jFreeChart15.createBufferedImage((int) '#', 1, chartRenderingInfo20);
        jFreeChart9.setBackgroundImage((java.awt.Image) bufferedImage21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot12", obj1.equals(multiplePiePlot12) ? obj1.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        multiplePiePlot2.setDataset(categoryDataset4);
        java.awt.Font font6 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot2.setNoDataMessageFont(font6);
        java.lang.String str8 = multiplePiePlot2.getPlotType();
        boolean boolean9 = multiplePiePlot2.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot2.setInsets(rectangleInsets10, false);
        java.awt.Font font13 = multiplePiePlot2.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        float float16 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart18 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", font13, (org.jfree.chart.plot.Plot) multiplePiePlot14, false);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj20 = multiplePiePlot19.clone();
        multiplePiePlot19.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = null;
        multiplePiePlot19.setDrawingSupplier(drawingSupplier23);
        multiplePiePlot19.setForegroundAlpha(0.0f);
        multiplePiePlot19.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        int int29 = multiplePiePlot19.getBackgroundImageAlignment();
        java.awt.Paint paint30 = multiplePiePlot19.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart31 = multiplePiePlot19.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart33 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", font13, (org.jfree.chart.plot.Plot) multiplePiePlot19, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot14", obj3.equals(multiplePiePlot14) ? obj3.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj12 = multiplePiePlot11.clone();
        multiplePiePlot11.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier15);
        multiplePiePlot11.setForegroundAlpha(0.0f);
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot11.zoom((double) (byte) 0);
        java.awt.Paint paint23 = multiplePiePlot11.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart24 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot11);
        org.jfree.chart.title.LegendTitle legendTitle26 = jFreeChart24.getLegend(100);
        jFreeChart24.setBorderVisible(false);
        java.awt.Stroke stroke29 = jFreeChart24.getBorderStroke();
        multiplePiePlot0.setOutlineStroke(stroke29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj12", obj1.equals(obj12) ? obj1.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj15 = multiplePiePlot14.clone();
        multiplePiePlot14.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot14.setDrawingSupplier(drawingSupplier18);
        multiplePiePlot14.setForegroundAlpha(0.0f);
        multiplePiePlot14.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot14.zoom((double) (byte) 0);
        boolean boolean26 = multiplePiePlot14.isSubplot();
        multiplePiePlot14.zoom((double) 100.0f);
        org.jfree.chart.JFreeChart jFreeChart29 = new org.jfree.chart.JFreeChart("Other", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        java.awt.Paint paint30 = jFreeChart29.getBorderPaint();
        jFreeChart4.setBorderPaint(paint30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj15", multiplePiePlot1.equals(obj15) ? multiplePiePlot1.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier17);
        multiplePiePlot13.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot13.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = jFreeChart21.getPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = jFreeChart21.getPadding();
        jFreeChart21.setBackgroundImageAlignment(0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj27 = multiplePiePlot26.clone();
        multiplePiePlot26.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = null;
        multiplePiePlot26.setDrawingSupplier(drawingSupplier30);
        multiplePiePlot26.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart34 = multiplePiePlot26.getPieChart();
        jFreeChart34.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot37 = new org.jfree.chart.plot.MultiplePiePlot();
        float float38 = multiplePiePlot37.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot39 = multiplePiePlot37.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart40 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot37);
        java.awt.Paint paint41 = jFreeChart40.getBackgroundPaint();
        java.awt.Stroke stroke42 = jFreeChart40.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle43 = jFreeChart40.getTitle();
        jFreeChart34.setTitle(textTitle43);
        jFreeChart21.removeSubtitle((org.jfree.chart.title.Title) textTitle43);
        jFreeChart11.setTitle(textTitle43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot37", obj1.equals(multiplePiePlot37) ? obj1.hashCode() == multiplePiePlot37.hashCode() : true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj12 = multiplePiePlot11.clone();
        multiplePiePlot11.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier15);
        multiplePiePlot11.setForegroundAlpha(0.0f);
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        int int21 = multiplePiePlot11.getBackgroundImageAlignment();
        java.awt.Paint paint22 = multiplePiePlot11.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot11.getPieChart();
        boolean boolean24 = jFreeChart23.isNotify();
        boolean boolean25 = jFreeChart4.equals((java.lang.Object) boolean24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj12", multiplePiePlot1.equals(obj12) ? multiplePiePlot1.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        jFreeChart17.fireChartChanged();
        java.lang.Object obj19 = jFreeChart17.clone();
        java.awt.Paint paint20 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart17.setBackgroundPaint(paint20);
        org.jfree.chart.event.ChartProgressListener chartProgressListener22 = null;
        jFreeChart17.addProgressListener(chartProgressListener22);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo27 = null;
        java.awt.image.BufferedImage bufferedImage28 = jFreeChart17.createBufferedImage((int) '#', 1, (int) (byte) 10, chartRenderingInfo27);
        jFreeChart9.setBackgroundImage((java.awt.Image) bufferedImage28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot14", obj1.equals(multiplePiePlot14) ? obj1.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.title.LegendTitle legendTitle5 = jFreeChart4.getLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot();
        float float8 = multiplePiePlot7.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot7.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart10 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot7);
        java.awt.Paint paint11 = jFreeChart10.getBackgroundPaint();
        java.awt.Stroke stroke12 = jFreeChart10.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle13 = jFreeChart10.getTitle();
        java.lang.Object obj14 = jFreeChart10.clone();
        java.awt.Stroke stroke15 = jFreeChart10.getBorderStroke();
        jFreeChart10.setAntiAlias(true);
        org.jfree.chart.title.LegendTitle legendTitle19 = jFreeChart10.getLegend(100);
        jFreeChart10.setNotify(false);
        org.jfree.chart.title.TextTitle textTitle22 = jFreeChart10.getTitle();
        jFreeChart4.addSubtitle((org.jfree.chart.title.Title) textTitle22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot7", multiplePiePlot1.equals(multiplePiePlot7) ? multiplePiePlot1.hashCode() == multiplePiePlot7.hashCode() : true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
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
        java.awt.Image image14 = multiplePiePlot0.getBackgroundImage();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        float float16 = multiplePiePlot15.getBackgroundAlpha();
        java.awt.Paint paint17 = multiplePiePlot15.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot15.setInsets(rectangleInsets18, false);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj22 = multiplePiePlot21.clone();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        multiplePiePlot21.setDataset(categoryDataset23);
        java.awt.Font font25 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot21.setNoDataMessageFont(font25);
        java.lang.String str27 = multiplePiePlot21.getPlotType();
        boolean boolean28 = multiplePiePlot21.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot21.setInsets(rectangleInsets29, false);
        multiplePiePlot15.setInsets(rectangleInsets29, false);
        multiplePiePlot0.setInsets(rectangleInsets29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot15", obj1.equals(multiplePiePlot15) ? obj1.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
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
        java.awt.Font font16 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        float float19 = multiplePiePlot18.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot18.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot18);
        multiplePiePlot18.setForegroundAlpha((float) (byte) 0);
        java.awt.Paint paint24 = multiplePiePlot18.getOutlinePaint();
        org.jfree.chart.JFreeChart jFreeChart26 = new org.jfree.chart.JFreeChart("hi!", font16, (org.jfree.chart.plot.Plot) multiplePiePlot18, true);
        multiplePiePlot0.setParent((org.jfree.chart.plot.Plot) multiplePiePlot18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart21 and jFreeChart26", jFreeChart21.equals(jFreeChart26) ? jFreeChart21.hashCode() == jFreeChart26.hashCode() : true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
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
        boolean boolean14 = jFreeChart10.isBorderVisible();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot0 and obj3", multiplePiePlot0.equals(obj3) ? multiplePiePlot0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj12 = multiplePiePlot11.clone();
        multiplePiePlot11.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier15);
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        double double19 = multiplePiePlot11.getLimit();
        java.awt.Paint paint20 = multiplePiePlot11.getNoDataMessagePaint();
        multiplePiePlot0.setAggregatedItemsPaint(paint20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj12", obj1.equals(obj12) ? obj1.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj19 = multiplePiePlot18.clone();
        multiplePiePlot18.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = null;
        multiplePiePlot18.setDrawingSupplier(drawingSupplier22);
        multiplePiePlot18.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart26 = multiplePiePlot18.getPieChart();
        jFreeChart26.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot();
        float float30 = multiplePiePlot29.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot31 = multiplePiePlot29.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart32 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot29);
        java.awt.Paint paint33 = jFreeChart32.getBackgroundPaint();
        java.awt.Stroke stroke34 = jFreeChart32.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle35 = jFreeChart32.getTitle();
        jFreeChart26.setTitle(textTitle35);
        jFreeChart13.setTitle(textTitle35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot29", obj3.equals(multiplePiePlot29) ? obj3.hashCode() == multiplePiePlot29.hashCode() : true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj5 = multiplePiePlot4.clone();
        multiplePiePlot4.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot4.setNoDataMessagePaint(paint8);
        java.awt.Font font10 = multiplePiePlot4.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot4.getDrawingSupplier();
        multiplePiePlot0.setDrawingSupplier(drawingSupplier11);
        double double13 = multiplePiePlot0.getLimit();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier1 and drawingSupplier11", drawingSupplier1.equals(drawingSupplier11) ? drawingSupplier1.hashCode() == drawingSupplier11.hashCode() : true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot15.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection17 = multiplePiePlot15.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        multiplePiePlot15.setDataset(categoryDataset18);
        multiplePiePlot15.setLimit((double) 0);
        java.awt.Paint paint22 = multiplePiePlot15.getAggregatedItemsPaint();
        float float23 = multiplePiePlot15.getBackgroundAlpha();
        boolean boolean24 = multiplePiePlot0.equals((java.lang.Object) float23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot15", obj1.equals(multiplePiePlot15) ? obj1.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = multiplePiePlot12.getDrawingSupplier();
        java.awt.Paint paint14 = multiplePiePlot12.getBackgroundPaint();
        java.awt.Paint paint15 = multiplePiePlot12.getOutlinePaint();
        jFreeChart4.setBorderPaint(paint15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot12", multiplePiePlot1.equals(multiplePiePlot12) ? multiplePiePlot1.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj16 = multiplePiePlot15.clone();
        multiplePiePlot15.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = null;
        multiplePiePlot15.setDrawingSupplier(drawingSupplier19);
        multiplePiePlot15.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot15.getPieChart();
        org.jfree.chart.title.Title title25 = jFreeChart23.getSubtitle((int) (byte) 0);
        org.jfree.chart.plot.Plot plot26 = jFreeChart23.getPlot();
        plot26.setBackgroundImageAlignment((int) (short) 100);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot();
        float float31 = multiplePiePlot30.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot32 = multiplePiePlot30.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart33 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot30);
        jFreeChart33.fireChartChanged();
        boolean boolean35 = jFreeChart33.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle37 = jFreeChart33.getLegend((int) (short) 0);
        plot26.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart33);
        jFreeChart33.setBorderVisible(true);
        jFreeChart33.setTextAntiAlias(false);
        java.util.List list43 = jFreeChart33.getSubtitles();
        jFreeChart8.setSubtitles(list43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot30", obj1.equals(multiplePiePlot30) ? obj1.hashCode() == multiplePiePlot30.hashCode() : true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = multiplePiePlot14.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder16 = multiplePiePlot14.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        float float18 = multiplePiePlot17.getBackgroundAlpha();
        java.awt.Paint paint19 = multiplePiePlot17.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot17.setInsets(rectangleInsets20, false);
        multiplePiePlot14.setInsets(rectangleInsets20);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = multiplePiePlot14.getDrawingSupplier();
        multiplePiePlot0.setDrawingSupplier(drawingSupplier24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot14", obj1.equals(multiplePiePlot14) ? obj1.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setNoDataMessagePaint(paint5);
        float float7 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart("", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        float float11 = multiplePiePlot10.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot10.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot10);
        jFreeChart13.fireChartChanged();
        boolean boolean15 = jFreeChart13.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle17 = jFreeChart13.getLegend((int) (short) 0);
        java.awt.Image image18 = jFreeChart13.getBackgroundImage();
        java.lang.Object obj19 = jFreeChart13.getTextAntiAlias();
        org.jfree.chart.title.TextTitle textTitle20 = jFreeChart13.getTitle();
        jFreeChart8.removeSubtitle((org.jfree.chart.title.Title) textTitle20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj2 and multiplePiePlot10", obj2.equals(multiplePiePlot10) ? obj2.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getParent();
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        multiplePiePlot0.setOutlineVisible(false);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj7 = multiplePiePlot6.clone();
        multiplePiePlot6.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot6.setDrawingSupplier(drawingSupplier10);
        java.awt.Image image12 = multiplePiePlot6.getBackgroundImage();
        boolean boolean14 = multiplePiePlot6.equals((java.lang.Object) 1.0f);
        java.awt.Stroke stroke15 = multiplePiePlot6.getOutlineStroke();
        multiplePiePlot0.setOutlineStroke(stroke15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj7", obj1.equals(obj7) ? obj1.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getParent();
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        multiplePiePlot0.setOutlineVisible(false);
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
        boolean boolean19 = jFreeChart10.isBorderVisible();
        org.jfree.chart.event.ChartProgressListener chartProgressListener20 = null;
        jFreeChart10.removeProgressListener(chartProgressListener20);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = jFreeChart10.getPadding();
        multiplePiePlot0.setInsets(rectangleInsets22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot7", obj1.equals(multiplePiePlot7) ? obj1.hashCode() == multiplePiePlot7.hashCode() : true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset14 = multiplePiePlot10.getDataset();
        java.awt.Image image15 = null;
        multiplePiePlot10.setBackgroundImage(image15);
        multiplePiePlot10.setNoDataMessage("hi!");
        org.jfree.data.category.CategoryDataset categoryDataset19 = multiplePiePlot10.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset20 = multiplePiePlot10.getDataset();
        boolean boolean21 = jFreeChart7.equals((java.lang.Object) multiplePiePlot10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot0 and obj11", multiplePiePlot0.equals(obj11) ? multiplePiePlot0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
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
        java.awt.Paint paint20 = plot19.getBackgroundPaint();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on plot19 and obj3", plot19.equals(obj3) ? plot19.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
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
        jFreeChart4.setBackgroundImageAlpha((float) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj12", obj6.equals(obj12) ? obj6.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getRootPlot();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot();
        float float5 = multiplePiePlot4.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot4.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart7 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot4);
        jFreeChart7.fireChartChanged();
        java.lang.Object obj9 = jFreeChart7.clone();
        java.awt.image.BufferedImage bufferedImage12 = jFreeChart7.createBufferedImage((int) '4', (int) (short) 10);
        plot2.setBackgroundImage((java.awt.Image) bufferedImage12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart7 and obj9", jFreeChart7.equals(obj9) ? jFreeChart7.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        float float19 = multiplePiePlot18.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot18.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot18);
        java.awt.Paint paint22 = jFreeChart21.getBackgroundPaint();
        java.awt.Stroke stroke23 = jFreeChart21.getBorderStroke();
        boolean boolean24 = jFreeChart21.isBorderVisible();
        java.util.List list25 = jFreeChart21.getSubtitles();
        jFreeChart14.setSubtitles(list25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj2 and multiplePiePlot18", obj2.equals(multiplePiePlot18) ? obj2.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle8 = jFreeChart4.getLegend((int) (short) 0);
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
        jFreeChart4.setBorderPaint(paint20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot10", multiplePiePlot1.equals(multiplePiePlot10) ? multiplePiePlot1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.data.general.DatasetGroup datasetGroup6 = multiplePiePlot0.getDatasetGroup();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot7.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder9 = multiplePiePlot7.getDataExtractOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection10 = multiplePiePlot7.getLegendItems();
        java.awt.Paint paint11 = multiplePiePlot7.getBackgroundPaint();
        multiplePiePlot0.setOutlinePaint(paint11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot7", obj1.equals(multiplePiePlot7) ? obj1.hashCode() == multiplePiePlot7.hashCode() : true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        jFreeChart16.fireChartChanged();
        jFreeChart16.fireChartChanged();
        jFreeChart16.fireChartChanged();
        boolean boolean20 = jFreeChart16.isNotify();
        java.awt.Image image21 = jFreeChart16.getBackgroundImage();
        java.lang.Object obj22 = jFreeChart16.clone();
        java.awt.Stroke stroke23 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        jFreeChart16.setBorderStroke(stroke23);
        jFreeChart4.setBorderStroke(stroke23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot13", multiplePiePlot1.equals(multiplePiePlot13) ? multiplePiePlot1.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getParent();
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        multiplePiePlot0.setNoDataMessage("");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj7 = multiplePiePlot6.clone();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot6.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot6.setInsets(rectangleInsets9);
        multiplePiePlot0.setInsets(rectangleInsets9, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot6", obj1.equals(multiplePiePlot6) ? obj1.hashCode() == multiplePiePlot6.hashCode() : true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getParent();
        java.awt.Image image3 = multiplePiePlot0.getBackgroundImage();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot();
        float float6 = multiplePiePlot5.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot5.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot5);
        jFreeChart8.fireChartChanged();
        java.lang.Object obj10 = jFreeChart8.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo13 = null;
        java.awt.image.BufferedImage bufferedImage14 = jFreeChart8.createBufferedImage((int) '#', 1, chartRenderingInfo13);
        boolean boolean15 = jFreeChart8.isNotify();
        java.awt.Stroke stroke16 = jFreeChart8.getBorderStroke();
        multiplePiePlot0.setOutlineStroke(stroke16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot5", obj1.equals(multiplePiePlot5) ? obj1.hashCode() == multiplePiePlot5.hashCode() : true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        float float17 = multiplePiePlot16.getBackgroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj19 = multiplePiePlot18.clone();
        multiplePiePlot18.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = null;
        multiplePiePlot18.setDrawingSupplier(drawingSupplier22);
        multiplePiePlot18.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart26 = multiplePiePlot18.getPieChart();
        org.jfree.chart.title.Title title28 = jFreeChart26.getSubtitle((int) (byte) 0);
        multiplePiePlot16.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart26);
        org.jfree.data.category.CategoryDataset categoryDataset30 = multiplePiePlot16.getDataset();
        multiplePiePlot0.setParent((org.jfree.chart.plot.Plot) multiplePiePlot16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj19", obj1.equals(obj19) ? obj1.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier17);
        multiplePiePlot13.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot13.getPieChart();
        org.jfree.chart.title.Title title23 = jFreeChart21.getSubtitle((int) (byte) 0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot();
        float float26 = multiplePiePlot25.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot27 = multiplePiePlot25.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart28 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot25);
        jFreeChart28.fireChartChanged();
        boolean boolean30 = jFreeChart28.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle32 = jFreeChart28.getLegend((int) (short) 0);
        jFreeChart21.addLegend(legendTitle32);
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = jFreeChart21.getPadding();
        jFreeChart4.setPadding(rectangleInsets34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot25", multiplePiePlot1.equals(multiplePiePlot25) ? multiplePiePlot1.hashCode() == multiplePiePlot25.hashCode() : true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        jFreeChart17.fireChartChanged();
        java.lang.Object obj19 = jFreeChart17.clone();
        java.awt.Paint paint20 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart17.setBackgroundPaint(paint20);
        boolean boolean22 = jFreeChart17.isBorderVisible();
        jFreeChart17.setBackgroundImageAlignment(1);
        jFreeChart17.removeLegend();
        java.awt.image.BufferedImage bufferedImage28 = jFreeChart17.createBufferedImage((int) (short) 1, (int) ' ');
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo31 = null;
        java.awt.image.BufferedImage bufferedImage32 = jFreeChart17.createBufferedImage((int) '4', 15, chartRenderingInfo31);
        multiplePiePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot14", obj1.equals(multiplePiePlot14) ? obj1.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.awt.Paint paint3 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent4);
        java.lang.Object obj6 = multiplePiePlot0.clone();
        java.awt.Paint paint7 = multiplePiePlot0.getOutlinePaint();
        boolean boolean8 = multiplePiePlot0.isSubplot();
        float float9 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier14);
        multiplePiePlot10.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot10.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = jFreeChart18.getPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = jFreeChart18.getPadding();
        multiplePiePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj11", obj6.equals(obj11) ? obj6.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot();
        float float4 = multiplePiePlot3.getBackgroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj6 = multiplePiePlot5.clone();
        multiplePiePlot5.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot5.setDrawingSupplier(drawingSupplier9);
        multiplePiePlot5.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart13 = multiplePiePlot5.getPieChart();
        org.jfree.chart.title.Title title15 = jFreeChart13.getSubtitle((int) (byte) 0);
        multiplePiePlot3.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart13);
        org.jfree.data.general.DatasetGroup datasetGroup17 = multiplePiePlot3.getDatasetGroup();
        java.awt.Paint paint18 = multiplePiePlot3.getOutlinePaint();
        multiplePiePlot0.setBackgroundPaint(paint18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot3 and obj6", multiplePiePlot3.equals(obj6) ? multiplePiePlot3.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setNoDataMessagePaint(paint5);
        float float7 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart("", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot1.getRootPlot();
        java.awt.Font font11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj13 = multiplePiePlot12.clone();
        multiplePiePlot12.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier16);
        multiplePiePlot12.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot12.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot12);
        org.jfree.chart.JFreeChart jFreeChart23 = new org.jfree.chart.JFreeChart("", font11, (org.jfree.chart.plot.Plot) multiplePiePlot12, false);
        java.awt.Paint paint24 = jFreeChart23.getBorderPaint();
        plot9.setOutlinePaint(paint24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj2 and obj13", obj2.equals(obj13) ? obj2.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        boolean boolean8 = multiplePiePlot0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        multiplePiePlot0.setNoDataMessage("");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        java.awt.Paint paint17 = jFreeChart16.getBackgroundPaint();
        java.awt.Stroke stroke18 = jFreeChart16.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle19 = jFreeChart16.getTitle();
        java.awt.Image image20 = jFreeChart16.getBackgroundImage();
        java.awt.Paint paint21 = jFreeChart16.getBorderPaint();
        int int22 = jFreeChart16.getBackgroundImageAlignment();
        java.awt.image.BufferedImage bufferedImage25 = jFreeChart16.createBufferedImage(100, (int) 'a');
        multiplePiePlot0.setBackgroundImage((java.awt.Image) bufferedImage25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot13", obj1.equals(multiplePiePlot13) ? obj1.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
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
        jFreeChart18.setTitle("Multiple Pie Plot");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot();
        float float28 = multiplePiePlot27.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot29 = multiplePiePlot27.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart30 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot27);
        jFreeChart30.fireChartChanged();
        java.lang.Object obj32 = jFreeChart30.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo35 = null;
        java.awt.image.BufferedImage bufferedImage36 = jFreeChart30.createBufferedImage((int) '#', 1, chartRenderingInfo35);
        org.jfree.chart.title.LegendTitle legendTitle37 = jFreeChart30.getLegend();
        jFreeChart18.removeSubtitle((org.jfree.chart.title.Title) legendTitle37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot15 and multiplePiePlot27", multiplePiePlot15.equals(multiplePiePlot27) ? multiplePiePlot15.hashCode() == multiplePiePlot27.hashCode() : true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
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
        double double15 = multiplePiePlot0.getLimit();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        float float18 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot17.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot17);
        jFreeChart20.fireChartChanged();
        java.lang.Object obj22 = jFreeChart20.clone();
        java.awt.Paint paint23 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart20.setBackgroundPaint(paint23);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and multiplePiePlot17", obj5.equals(multiplePiePlot17) ? obj5.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        float float21 = multiplePiePlot20.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot22 = multiplePiePlot20.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart23 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot20);
        java.awt.Paint paint24 = jFreeChart23.getBackgroundPaint();
        java.awt.Stroke stroke25 = jFreeChart23.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener26 = null;
        jFreeChart23.addProgressListener(chartProgressListener26);
        org.jfree.chart.event.ChartProgressListener chartProgressListener28 = null;
        jFreeChart23.removeProgressListener(chartProgressListener28);
        java.awt.Image image30 = jFreeChart23.getBackgroundImage();
        float float31 = jFreeChart23.getBackgroundImageAlpha();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo36 = null;
        java.awt.image.BufferedImage bufferedImage37 = jFreeChart23.createBufferedImage((int) ' ', 100, (double) 10L, 0.0d, chartRenderingInfo36);
        jFreeChart13.setBackgroundImage((java.awt.Image) bufferedImage37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot0 and multiplePiePlot20", multiplePiePlot0.equals(multiplePiePlot20) ? multiplePiePlot0.hashCode() == multiplePiePlot20.hashCode() : true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        java.awt.Stroke stroke8 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        jFreeChart4.setBorderStroke(stroke8);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        float float12 = multiplePiePlot11.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot11.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot11);
        java.awt.Paint paint15 = jFreeChart14.getBackgroundPaint();
        java.awt.Stroke stroke16 = jFreeChart14.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle17 = jFreeChart14.getTitle();
        java.lang.Object obj18 = jFreeChart14.clone();
        int int19 = jFreeChart14.getBackgroundImageAlignment();
        org.jfree.chart.title.Title title21 = jFreeChart14.getSubtitle(0);
        jFreeChart4.addSubtitle(title21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot11", multiplePiePlot1.equals(multiplePiePlot11) ? multiplePiePlot1.hashCode() == multiplePiePlot11.hashCode() : true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.lang.Object obj8 = jFreeChart4.clone();
        java.awt.Stroke stroke9 = jFreeChart4.getBorderStroke();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        float float11 = multiplePiePlot10.getBackgroundAlpha();
        float float12 = multiplePiePlot10.getBackgroundAlpha();
        java.awt.Stroke stroke13 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot10.setOutlineStroke(stroke13);
        jFreeChart4.setBorderStroke(stroke13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot10", multiplePiePlot1.equals(multiplePiePlot10) ? multiplePiePlot1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        float float17 = multiplePiePlot16.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot16.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot16);
        jFreeChart19.fireChartChanged();
        java.lang.Object obj21 = jFreeChart19.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo24 = null;
        java.awt.image.BufferedImage bufferedImage25 = jFreeChart19.createBufferedImage((int) '#', 1, chartRenderingInfo24);
        jFreeChart19.fireChartChanged();
        org.jfree.chart.plot.Plot plot27 = jFreeChart19.getPlot();
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot16", obj1.equals(multiplePiePlot16) ? obj1.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        int int8 = jFreeChart4.getBackgroundImageAlignment();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier14);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier16);
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot10.getPieChart();
        java.awt.Image image19 = jFreeChart18.getBackgroundImage();
        java.awt.Stroke stroke20 = jFreeChart18.getBorderStroke();
        org.jfree.chart.title.LegendTitle legendTitle21 = jFreeChart18.getLegend();
        jFreeChart4.addSubtitle(1, (org.jfree.chart.title.Title) legendTitle21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj11", multiplePiePlot1.equals(obj11) ? multiplePiePlot1.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj13 = multiplePiePlot12.clone();
        multiplePiePlot12.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier16);
        multiplePiePlot12.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot12.getPieChart();
        java.awt.RenderingHints renderingHints21 = jFreeChart20.getRenderingHints();
        jFreeChart4.setRenderingHints(renderingHints21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj13", multiplePiePlot1.equals(obj13) ? multiplePiePlot1.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj16 = multiplePiePlot15.clone();
        multiplePiePlot15.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint19 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot15.setNoDataMessagePaint(paint19);
        multiplePiePlot15.setForegroundAlpha(10.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = multiplePiePlot15.getInsets();
        boolean boolean24 = multiplePiePlot0.equals((java.lang.Object) rectangleInsets23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj4 and obj16", obj4.equals(obj16) ? obj4.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj19 = multiplePiePlot18.clone();
        multiplePiePlot18.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = null;
        multiplePiePlot18.setDrawingSupplier(drawingSupplier22);
        multiplePiePlot18.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart26 = multiplePiePlot18.getPieChart();
        org.jfree.chart.title.Title title28 = jFreeChart26.getSubtitle((int) (byte) 0);
        jFreeChart26.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot();
        float float31 = multiplePiePlot30.getBackgroundAlpha();
        java.awt.Paint paint32 = multiplePiePlot30.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot30.setInsets(rectangleInsets33, false);
        jFreeChart26.setPadding(rectangleInsets33);
        java.awt.Paint paint37 = jFreeChart26.getBorderPaint();
        jFreeChart14.setBackgroundPaint(paint37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj2 and multiplePiePlot30", obj2.equals(multiplePiePlot30) ? obj2.hashCode() == multiplePiePlot30.hashCode() : true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        float float19 = multiplePiePlot18.getBackgroundAlpha();
        float float20 = multiplePiePlot18.getBackgroundAlpha();
        java.awt.Stroke stroke21 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot18.setOutlineStroke(stroke21);
        multiplePiePlot1.setOutlineStroke(stroke21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and multiplePiePlot18", obj6.equals(multiplePiePlot18) ? obj6.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = multiplePiePlot16.getDrawingSupplier();
        java.awt.Paint paint18 = multiplePiePlot16.getBackgroundPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection19 = multiplePiePlot16.getLegendItems();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj21 = multiplePiePlot20.clone();
        multiplePiePlot20.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint24 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot20.setNoDataMessagePaint(paint24);
        java.awt.Font font26 = multiplePiePlot20.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = multiplePiePlot20.getDrawingSupplier();
        multiplePiePlot16.setDrawingSupplier(drawingSupplier27);
        multiplePiePlot0.setDrawingSupplier(drawingSupplier27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot16", obj3.equals(multiplePiePlot16) ? obj3.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        multiplePiePlot0.setBackgroundImageAlignment(15);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        float float12 = multiplePiePlot11.getBackgroundAlpha();
        java.awt.Paint paint13 = multiplePiePlot11.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot11);
        float float15 = multiplePiePlot11.getForegroundAlpha();
        java.awt.Paint paint16 = multiplePiePlot11.getAggregatedItemsPaint();
        float float17 = multiplePiePlot11.getForegroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = multiplePiePlot11.getInsets();
        java.awt.Paint paint19 = multiplePiePlot11.getOutlinePaint();
        multiplePiePlot0.setNoDataMessagePaint(paint19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot11", obj1.equals(multiplePiePlot11) ? obj1.hashCode() == multiplePiePlot11.hashCode() : true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = multiplePiePlot15.getDrawingSupplier();
        java.awt.Paint paint17 = multiplePiePlot15.getBackgroundPaint();
        java.awt.Paint paint18 = multiplePiePlot15.getOutlinePaint();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot15.getRootPlot();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj2 and multiplePiePlot15", obj2.equals(multiplePiePlot15) ? obj2.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        float float7 = multiplePiePlot6.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot6.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot6);
        java.awt.Paint paint10 = jFreeChart9.getBackgroundPaint();
        java.awt.Stroke stroke11 = jFreeChart9.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle12 = jFreeChart9.getTitle();
        java.lang.Object obj13 = jFreeChart9.clone();
        int int14 = jFreeChart9.getBackgroundImageAlignment();
        org.jfree.chart.title.Title title16 = jFreeChart9.getSubtitle(0);
        jFreeChart4.addSubtitle(title16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot6", multiplePiePlot1.equals(multiplePiePlot6) ? multiplePiePlot1.hashCode() == multiplePiePlot6.hashCode() : true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier17);
        multiplePiePlot13.setForegroundAlpha(0.0f);
        multiplePiePlot13.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot13.zoom((double) (byte) 0);
        boolean boolean25 = multiplePiePlot13.isSubplot();
        java.awt.Stroke stroke26 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot13.setOutlineStroke(stroke26);
        jFreeChart4.setBorderStroke(stroke26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj14", multiplePiePlot1.equals(obj14) ? multiplePiePlot1.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getParent();
        java.lang.Comparable comparable3 = multiplePiePlot0.getAggregatedItemsKey();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot();
        float float6 = multiplePiePlot5.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot5.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot5);
        jFreeChart8.fireChartChanged();
        java.lang.Object obj10 = jFreeChart8.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo13 = null;
        java.awt.image.BufferedImage bufferedImage14 = jFreeChart8.createBufferedImage((int) '#', 1, chartRenderingInfo13);
        jFreeChart8.fireChartChanged();
        int int16 = jFreeChart8.getBackgroundImageAlignment();
        java.awt.Paint paint17 = jFreeChart8.getBackgroundPaint();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo22 = null;
        java.awt.image.BufferedImage bufferedImage23 = jFreeChart8.createBufferedImage((int) (byte) 100, (int) ' ', (double) (-1), (double) (byte) 0, chartRenderingInfo22);
        multiplePiePlot0.setBackgroundImage((java.awt.Image) bufferedImage23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart8 and obj10", jFreeChart8.equals(obj10) ? jFreeChart8.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj7 = multiplePiePlot6.clone();
        multiplePiePlot6.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot6.setDrawingSupplier(drawingSupplier10);
        multiplePiePlot6.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart14 = multiplePiePlot6.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = jFreeChart14.getPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = jFreeChart14.getPadding();
        jFreeChart14.setBackgroundImageAlignment(0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj20 = multiplePiePlot19.clone();
        multiplePiePlot19.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = null;
        multiplePiePlot19.setDrawingSupplier(drawingSupplier23);
        multiplePiePlot19.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart27 = multiplePiePlot19.getPieChart();
        jFreeChart27.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot();
        float float31 = multiplePiePlot30.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot32 = multiplePiePlot30.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart33 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot30);
        java.awt.Paint paint34 = jFreeChart33.getBackgroundPaint();
        java.awt.Stroke stroke35 = jFreeChart33.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle36 = jFreeChart33.getTitle();
        jFreeChart27.setTitle(textTitle36);
        jFreeChart14.removeSubtitle((org.jfree.chart.title.Title) textTitle36);
        jFreeChart4.addSubtitle((org.jfree.chart.title.Title) textTitle36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot30", multiplePiePlot1.equals(multiplePiePlot30) ? multiplePiePlot1.hashCode() == multiplePiePlot30.hashCode() : true);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        float float17 = multiplePiePlot16.getBackgroundAlpha();
        java.awt.Paint paint18 = multiplePiePlot16.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = multiplePiePlot16.getInsets();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj21 = multiplePiePlot20.clone();
        multiplePiePlot20.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = null;
        multiplePiePlot20.setDrawingSupplier(drawingSupplier24);
        multiplePiePlot20.setForegroundAlpha(0.0f);
        multiplePiePlot20.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        int int30 = multiplePiePlot20.getBackgroundImageAlignment();
        java.awt.Paint paint31 = multiplePiePlot20.getAggregatedItemsPaint();
        java.awt.Paint paint32 = multiplePiePlot20.getBackgroundPaint();
        boolean boolean33 = multiplePiePlot16.equals((java.lang.Object) paint32);
        multiplePiePlot0.setAggregatedItemsPaint(paint32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot16", obj3.equals(multiplePiePlot16) ? obj3.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
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
        java.lang.String str19 = multiplePiePlot0.getNoDataMessage();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        float float21 = multiplePiePlot20.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot22 = multiplePiePlot20.getRootPlot();
        multiplePiePlot20.setBackgroundImageAlignment(0);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent25 = null;
        multiplePiePlot20.axisChanged(axisChangeEvent25);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj28 = multiplePiePlot27.clone();
        multiplePiePlot27.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint31 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot27.setNoDataMessagePaint(paint31);
        multiplePiePlot27.setForegroundAlpha(10.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = multiplePiePlot27.getInsets();
        multiplePiePlot20.setInsets(rectangleInsets35);
        multiplePiePlot0.setInsets(rectangleInsets35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj28", obj7.equals(obj28) ? obj7.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
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
        org.jfree.chart.event.ChartProgressListener chartProgressListener18 = null;
        jFreeChart17.addProgressListener(chartProgressListener18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj2 and multiplePiePlot13", obj2.equals(multiplePiePlot13) ? obj2.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        java.awt.Paint paint7 = jFreeChart4.getBorderPaint();
        java.lang.Object obj8 = jFreeChart4.clone();
        jFreeChart4.setAntiAlias(false);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        jFreeChart15.fireChartChanged();
        boolean boolean17 = jFreeChart15.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle19 = jFreeChart15.getLegend((int) (short) 0);
        java.awt.Image image20 = jFreeChart15.getBackgroundImage();
        java.lang.Object obj21 = jFreeChart15.getTextAntiAlias();
        org.jfree.chart.title.TextTitle textTitle22 = jFreeChart15.getTitle();
        jFreeChart4.setTitle(textTitle22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot12", multiplePiePlot1.equals(multiplePiePlot12) ? multiplePiePlot1.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        java.lang.String str10 = multiplePiePlot0.getNoDataMessage();
        java.awt.Font font11 = multiplePiePlot0.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        java.awt.Paint paint14 = multiplePiePlot12.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = multiplePiePlot12.getInsets();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj17 = multiplePiePlot16.clone();
        multiplePiePlot16.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = null;
        multiplePiePlot16.setDrawingSupplier(drawingSupplier20);
        multiplePiePlot16.setForegroundAlpha(0.0f);
        multiplePiePlot16.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        int int26 = multiplePiePlot16.getBackgroundImageAlignment();
        java.awt.Paint paint27 = multiplePiePlot16.getAggregatedItemsPaint();
        java.awt.Paint paint28 = multiplePiePlot16.getBackgroundPaint();
        boolean boolean29 = multiplePiePlot12.equals((java.lang.Object) paint28);
        multiplePiePlot0.setNoDataMessagePaint(paint28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot12", obj1.equals(multiplePiePlot12) ? obj1.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj15 = multiplePiePlot14.clone();
        multiplePiePlot14.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot14.setDrawingSupplier(drawingSupplier18);
        multiplePiePlot14.zoom(0.0d);
        org.jfree.chart.plot.Plot plot22 = multiplePiePlot14.getRootPlot();
        plot22.setBackgroundImageAlignment((int) (byte) 100);
        org.jfree.chart.JFreeChart jFreeChart25 = new org.jfree.chart.JFreeChart(plot22);
        jFreeChart25.setBackgroundImageAlignment(100);
        java.awt.Stroke stroke28 = jFreeChart25.getBorderStroke();
        org.jfree.chart.title.LegendTitle legendTitle29 = jFreeChart25.getLegend();
        jFreeChart4.removeSubtitle((org.jfree.chart.title.Title) legendTitle29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj15", multiplePiePlot1.equals(obj15) ? multiplePiePlot1.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj13 = multiplePiePlot12.clone();
        multiplePiePlot12.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier16);
        multiplePiePlot12.setLimit((double) 100L);
        java.awt.Font font20 = multiplePiePlot12.getNoDataMessageFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = multiplePiePlot12.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets21, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and obj13", multiplePiePlot4.equals(obj13) ? multiplePiePlot4.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
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
        java.awt.Paint paint12 = jFreeChart4.getBorderPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        java.awt.Paint paint18 = jFreeChart17.getBackgroundPaint();
        java.awt.Stroke stroke19 = jFreeChart17.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener20 = null;
        jFreeChart17.addProgressListener(chartProgressListener20);
        org.jfree.chart.event.ChartProgressListener chartProgressListener22 = null;
        jFreeChart17.removeProgressListener(chartProgressListener22);
        java.awt.Image image24 = jFreeChart17.getBackgroundImage();
        float float25 = jFreeChart17.getBackgroundImageAlpha();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo30 = null;
        java.awt.image.BufferedImage bufferedImage31 = jFreeChart17.createBufferedImage((int) ' ', 100, (double) 10L, 0.0d, chartRenderingInfo30);
        jFreeChart17.setBorderVisible(false);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo38 = null;
        java.awt.image.BufferedImage bufferedImage39 = jFreeChart17.createBufferedImage((int) (short) 10, (int) (byte) 10, 0.0d, (double) (byte) 10, chartRenderingInfo38);
        jFreeChart4.setBackgroundImage((java.awt.Image) bufferedImage39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot14", multiplePiePlot1.equals(multiplePiePlot14) ? multiplePiePlot1.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder21 = multiplePiePlot20.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and multiplePiePlot20", obj7.equals(multiplePiePlot20) ? obj7.hashCode() == multiplePiePlot20.hashCode() : true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = jFreeChart36.getPadding();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot39 = new org.jfree.chart.plot.MultiplePiePlot();
        float float40 = multiplePiePlot39.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot41 = multiplePiePlot39.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart42 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot39);
        jFreeChart42.fireChartChanged();
        boolean boolean44 = jFreeChart42.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle46 = jFreeChart42.getLegend((int) (short) 0);
        jFreeChart36.removeSubtitle((org.jfree.chart.title.Title) legendTitle46);
        jFreeChart18.addSubtitle((org.jfree.chart.title.Title) legendTitle46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot15 and multiplePiePlot39", multiplePiePlot15.equals(multiplePiePlot39) ? multiplePiePlot15.hashCode() == multiplePiePlot39.hashCode() : true);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getRootPlot();
        plot8.setBackgroundImageAlignment((int) (byte) 100);
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart(plot8);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj13 = multiplePiePlot12.clone();
        multiplePiePlot12.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier16);
        multiplePiePlot12.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot12.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot12);
        java.awt.Stroke stroke22 = jFreeChart21.getBorderStroke();
        jFreeChart11.setBorderStroke(stroke22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj13", obj1.equals(obj13) ? obj1.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        float float18 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot17.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot17);
        java.awt.Paint paint21 = jFreeChart20.getBackgroundPaint();
        java.awt.Stroke stroke22 = jFreeChart20.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle23 = jFreeChart20.getTitle();
        java.lang.Object obj24 = jFreeChart20.clone();
        java.awt.Stroke stroke25 = jFreeChart20.getBorderStroke();
        jFreeChart20.setAntiAlias(true);
        org.jfree.chart.title.LegendTitle legendTitle29 = jFreeChart20.getLegend(100);
        jFreeChart20.setNotify(false);
        org.jfree.chart.title.TextTitle textTitle32 = jFreeChart20.getTitle();
        jFreeChart4.setTitle(textTitle32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot17", multiplePiePlot1.equals(multiplePiePlot17) ? multiplePiePlot1.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj21 = multiplePiePlot20.clone();
        multiplePiePlot20.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = null;
        multiplePiePlot20.setDrawingSupplier(drawingSupplier24);
        multiplePiePlot20.setLimit((double) 100L);
        java.awt.Font font28 = multiplePiePlot20.getNoDataMessageFont();
        multiplePiePlot0.setNoDataMessageFont(font28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj21", obj6.equals(obj21) ? obj6.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj17 = multiplePiePlot16.clone();
        multiplePiePlot16.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = null;
        multiplePiePlot16.setDrawingSupplier(drawingSupplier20);
        multiplePiePlot16.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot16.getPieChart();
        jFreeChart24.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot();
        float float28 = multiplePiePlot27.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot29 = multiplePiePlot27.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart30 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot27);
        java.awt.Paint paint31 = jFreeChart30.getBackgroundPaint();
        java.awt.Stroke stroke32 = jFreeChart30.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle33 = jFreeChart30.getTitle();
        jFreeChart24.setTitle(textTitle33);
        jFreeChart15.addSubtitle((org.jfree.chart.title.Title) textTitle33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot27", obj3.equals(multiplePiePlot27) ? obj3.hashCode() == multiplePiePlot27.hashCode() : true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setNoDataMessagePaint(paint5);
        float float7 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart("", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.data.category.CategoryDataset categoryDataset9 = multiplePiePlot1.getDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot10.getDrawingSupplier();
        org.jfree.chart.JFreeChart jFreeChart12 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot10);
        java.awt.Paint paint13 = multiplePiePlot10.getBackgroundPaint();
        multiplePiePlot1.setBackgroundPaint(paint13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj2 and multiplePiePlot10", obj2.equals(multiplePiePlot10) ? obj2.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot();
        float float23 = multiplePiePlot22.getBackgroundAlpha();
        java.awt.Paint paint24 = multiplePiePlot22.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart25 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot22);
        float float26 = multiplePiePlot22.getForegroundAlpha();
        java.awt.Paint paint27 = multiplePiePlot22.getAggregatedItemsPaint();
        float float28 = multiplePiePlot22.getForegroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = multiplePiePlot22.getInsets();
        jFreeChart4.setPadding(rectangleInsets29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot22", multiplePiePlot1.equals(multiplePiePlot22) ? multiplePiePlot1.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        jFreeChart16.fireChartChanged();
        boolean boolean18 = jFreeChart16.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle20 = jFreeChart16.getLegend((int) (short) 0);
        boolean boolean21 = jFreeChart16.isNotify();
        java.awt.RenderingHints renderingHints22 = jFreeChart16.getRenderingHints();
        jFreeChart4.setRenderingHints(renderingHints22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot13", multiplePiePlot1.equals(multiplePiePlot13) ? multiplePiePlot1.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj18 = multiplePiePlot17.clone();
        multiplePiePlot17.setBackgroundAlpha((float) (short) -1);
        java.awt.Font font21 = multiplePiePlot17.getNoDataMessageFont();
        multiplePiePlot2.setNoDataMessageFont(font21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj18", obj3.equals(obj18) ? obj3.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        jFreeChart4.setBackgroundImageAlpha((float) (byte) 0);
        jFreeChart4.clearSubtitles();
        jFreeChart4.clearSubtitles();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj12 = multiplePiePlot11.clone();
        multiplePiePlot11.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset15 = multiplePiePlot11.getDataset();
        java.awt.Image image16 = null;
        multiplePiePlot11.setBackgroundImage(image16);
        multiplePiePlot11.setNoDataMessage("hi!");
        multiplePiePlot11.setForegroundAlpha((float) ' ');
        java.awt.Stroke stroke22 = multiplePiePlot11.getOutlineStroke();
        jFreeChart4.setBorderStroke(stroke22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj12", multiplePiePlot1.equals(obj12) ? multiplePiePlot1.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
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
        double double15 = multiplePiePlot0.getLimit();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj17 = multiplePiePlot16.clone();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot16.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot16.setInsets(rectangleInsets19);
        multiplePiePlot0.setInsets(rectangleInsets19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot16", obj3.equals(multiplePiePlot16) ? obj3.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj18 = multiplePiePlot17.clone();
        multiplePiePlot17.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset21 = multiplePiePlot17.getDataset();
        java.awt.Image image22 = null;
        multiplePiePlot17.setBackgroundImage(image22);
        multiplePiePlot17.setNoDataMessage("hi!");
        org.jfree.data.category.CategoryDataset categoryDataset26 = multiplePiePlot17.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset27 = multiplePiePlot17.getDataset();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent28 = null;
        multiplePiePlot17.axisChanged(axisChangeEvent28);
        java.awt.Stroke stroke30 = multiplePiePlot17.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj18", obj6.equals(obj18) ? obj6.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot();
        float float20 = multiplePiePlot19.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot19.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart22 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot19);
        jFreeChart22.fireChartChanged();
        java.lang.Object obj24 = jFreeChart22.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo27 = null;
        java.awt.image.BufferedImage bufferedImage28 = jFreeChart22.createBufferedImage((int) '#', 1, chartRenderingInfo27);
        org.jfree.chart.title.LegendTitle legendTitle29 = jFreeChart22.getLegend();
        java.awt.RenderingHints renderingHints30 = jFreeChart22.getRenderingHints();
        jFreeChart9.setRenderingHints(renderingHints30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot19", obj1.equals(multiplePiePlot19) ? obj1.hashCode() == multiplePiePlot19.hashCode() : true);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj18 = multiplePiePlot17.clone();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot17.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot17.setInsets(rectangleInsets20);
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        multiplePiePlot17.drawBackgroundImage(graphics2D22, rectangle2D23);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        multiplePiePlot17.markerChanged(markerChangeEvent25);
        org.jfree.chart.util.TableOrder tableOrder27 = multiplePiePlot17.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot17", obj1.equals(multiplePiePlot17) ? obj1.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        java.awt.Font font5 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj7 = multiplePiePlot6.clone();
        multiplePiePlot6.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot6.setDrawingSupplier(drawingSupplier10);
        multiplePiePlot6.zoom(0.0d);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        multiplePiePlot6.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        multiplePiePlot6.setDataset(categoryDataset17);
        java.lang.String str19 = multiplePiePlot6.getPlotType();
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", font5, (org.jfree.chart.plot.Plot) multiplePiePlot6, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj2 and obj7", obj2.equals(obj7) ? obj2.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent8);
        java.awt.Image image10 = multiplePiePlot0.getBackgroundImage();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        float float12 = multiplePiePlot11.getBackgroundAlpha();
        java.awt.Font font13 = multiplePiePlot11.getNoDataMessageFont();
        float float14 = multiplePiePlot11.getForegroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        float float17 = multiplePiePlot16.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot16.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot16);
        jFreeChart19.fireChartChanged();
        java.lang.Object obj21 = jFreeChart19.clone();
        java.awt.Paint paint22 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart19.setBackgroundPaint(paint22);
        boolean boolean24 = jFreeChart19.isBorderVisible();
        jFreeChart19.setBackgroundImageAlignment(1);
        jFreeChart19.removeLegend();
        java.awt.image.BufferedImage bufferedImage30 = jFreeChart19.createBufferedImage((int) (short) 1, (int) ' ');
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo34 = null;
        java.awt.image.BufferedImage bufferedImage35 = jFreeChart19.createBufferedImage((int) '#', 1, 1, chartRenderingInfo34);
        multiplePiePlot11.setBackgroundImage((java.awt.Image) bufferedImage35);
        multiplePiePlot0.setBackgroundImage((java.awt.Image) bufferedImage35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot16", obj1.equals(multiplePiePlot16) ? obj1.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getParent();
        java.lang.Comparable comparable3 = multiplePiePlot0.getAggregatedItemsKey();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent4 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent4);
        multiplePiePlot0.setBackgroundImageAlpha((float) (byte) 1);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        float float10 = multiplePiePlot9.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot9.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart12 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot9);
        jFreeChart12.fireChartChanged();
        boolean boolean14 = jFreeChart12.getAntiAlias();
        java.awt.Paint paint15 = jFreeChart12.getBorderPaint();
        java.lang.Object obj16 = jFreeChart12.clone();
        java.awt.image.BufferedImage bufferedImage19 = jFreeChart12.createBufferedImage((int) ' ', 1);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = jFreeChart12.getPadding();
        multiplePiePlot0.setInsets(rectangleInsets20, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart12 and obj16", jFreeChart12.equals(obj16) ? jFreeChart12.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder1 = multiplePiePlot0.getDataExtractOrder();
        float float2 = multiplePiePlot0.getBackgroundImageAlpha();
        java.awt.Paint paint3 = multiplePiePlot0.getNoDataMessagePaint();
        java.lang.String str4 = multiplePiePlot0.getPlotType();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        float float7 = multiplePiePlot6.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot6.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot6);
        jFreeChart9.fireChartChanged();
        java.lang.Object obj11 = jFreeChart9.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo14 = null;
        java.awt.image.BufferedImage bufferedImage15 = jFreeChart9.createBufferedImage(100, (int) '#', chartRenderingInfo14);
        multiplePiePlot0.setBackgroundImage((java.awt.Image) bufferedImage15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart9 and obj11", jFreeChart9.equals(obj11) ? jFreeChart9.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = plot19.getDrawingSupplier();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on plot19 and obj3", plot19.equals(obj3) ? plot19.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        float float17 = multiplePiePlot16.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot16.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot16);
        jFreeChart19.fireChartChanged();
        java.lang.Object obj21 = jFreeChart19.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo24 = null;
        java.awt.image.BufferedImage bufferedImage25 = jFreeChart19.createBufferedImage((int) '#', 1, chartRenderingInfo24);
        jFreeChart19.fireChartChanged();
        int int27 = jFreeChart19.getBackgroundImageAlignment();
        java.awt.Paint paint28 = jFreeChart19.getBackgroundPaint();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo33 = null;
        java.awt.image.BufferedImage bufferedImage34 = jFreeChart19.createBufferedImage((int) (byte) 100, (int) ' ', (double) (-1), (double) (byte) 0, chartRenderingInfo33);
        multiplePiePlot0.setBackgroundImage((java.awt.Image) bufferedImage34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot16", obj1.equals(multiplePiePlot16) ? obj1.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        org.jfree.chart.title.LegendTitle legendTitle16 = jFreeChart15.getLegend();
        jFreeChart4.removeSubtitle((org.jfree.chart.title.Title) legendTitle16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot12", multiplePiePlot1.equals(multiplePiePlot12) ? multiplePiePlot1.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        boolean boolean5 = multiplePiePlot0.isOutlineVisible();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot0.getRootPlot();
        org.jfree.chart.plot.Plot plot7 = plot6.getRootPlot();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        float float10 = multiplePiePlot9.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot9.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart12 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot9);
        jFreeChart12.fireChartChanged();
        java.lang.Object obj14 = jFreeChart12.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo17 = null;
        java.awt.image.BufferedImage bufferedImage18 = jFreeChart12.createBufferedImage((int) '#', 1, chartRenderingInfo17);
        jFreeChart12.fireChartChanged();
        int int20 = jFreeChart12.getBackgroundImageAlignment();
        java.awt.Paint paint21 = jFreeChart12.getBackgroundPaint();
        plot6.setBackgroundPaint(paint21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot9", obj1.equals(multiplePiePlot9) ? obj1.hashCode() == multiplePiePlot9.hashCode() : true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = multiplePiePlot5.getDrawingSupplier();
        java.awt.Paint paint7 = multiplePiePlot5.getBackgroundPaint();
        java.awt.Paint paint8 = multiplePiePlot5.getOutlinePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        multiplePiePlot5.notifyListeners(plotChangeEvent9);
        java.lang.Object obj11 = multiplePiePlot5.clone();
        java.awt.Paint paint12 = multiplePiePlot5.getOutlinePaint();
        org.jfree.chart.util.TableOrder tableOrder13 = multiplePiePlot5.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot5", obj1.equals(multiplePiePlot5) ? obj1.hashCode() == multiplePiePlot5.hashCode() : true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart4.setBackgroundPaint(paint7);
        jFreeChart4.setBackgroundImageAlpha((float) 1L);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj12 = multiplePiePlot11.clone();
        multiplePiePlot11.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier15);
        multiplePiePlot11.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot11.getPieChart();
        int int20 = jFreeChart19.getSubtitleCount();
        jFreeChart19.fireChartChanged();
        java.util.List list22 = jFreeChart19.getSubtitles();
        jFreeChart4.setSubtitles(list22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj12", multiplePiePlot1.equals(obj12) ? multiplePiePlot1.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        java.awt.Paint paint14 = multiplePiePlot12.getNoDataMessagePaint();
        jFreeChart4.setBackgroundPaint(paint14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot12", multiplePiePlot1.equals(multiplePiePlot12) ? multiplePiePlot1.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj22 = multiplePiePlot21.clone();
        multiplePiePlot21.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = null;
        multiplePiePlot21.setDrawingSupplier(drawingSupplier25);
        multiplePiePlot21.setForegroundAlpha(0.0f);
        multiplePiePlot21.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot21.zoom((double) (byte) 0);
        boolean boolean33 = multiplePiePlot21.isSubplot();
        java.awt.Stroke stroke34 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot21.setOutlineStroke(stroke34);
        jFreeChart8.setBorderStroke(stroke34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot12 and obj22", multiplePiePlot12.equals(obj22) ? multiplePiePlot12.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        boolean boolean6 = jFreeChart4.isBorderVisible();
        boolean boolean7 = jFreeChart4.getAntiAlias();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = multiplePiePlot8.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder10 = multiplePiePlot8.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        float float12 = multiplePiePlot11.getBackgroundAlpha();
        java.awt.Paint paint13 = multiplePiePlot11.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot11.setInsets(rectangleInsets14, false);
        multiplePiePlot8.setInsets(rectangleInsets14);
        jFreeChart4.setPadding(rectangleInsets14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot8", multiplePiePlot1.equals(multiplePiePlot8) ? multiplePiePlot1.hashCode() == multiplePiePlot8.hashCode() : true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        java.util.List list8 = jFreeChart4.getSubtitles();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        float float11 = multiplePiePlot10.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot10.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot10);
        jFreeChart13.fireChartChanged();
        boolean boolean15 = jFreeChart13.getAntiAlias();
        java.awt.Paint paint16 = jFreeChart13.getBorderPaint();
        java.lang.Object obj17 = jFreeChart13.clone();
        java.awt.image.BufferedImage bufferedImage20 = jFreeChart13.createBufferedImage((int) ' ', 1);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = jFreeChart13.getPadding();
        boolean boolean22 = jFreeChart4.equals((java.lang.Object) rectangleInsets21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot10", multiplePiePlot1.equals(multiplePiePlot10) ? multiplePiePlot1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
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
        java.awt.Font font11 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        multiplePiePlot13.setForegroundAlpha((float) (byte) 0);
        java.awt.Paint paint19 = multiplePiePlot13.getOutlinePaint();
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart("hi!", font11, (org.jfree.chart.plot.Plot) multiplePiePlot13, true);
        multiplePiePlot0.setNoDataMessageFont(font11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart16 and jFreeChart21", jFreeChart16.equals(jFreeChart21) ? jFreeChart16.hashCode() == jFreeChart21.hashCode() : true);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        jFreeChart4.setTitle("hi!");
        org.jfree.chart.title.TextTitle textTitle9 = jFreeChart4.getTitle();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj12 = multiplePiePlot11.clone();
        multiplePiePlot11.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier15);
        multiplePiePlot11.setForegroundAlpha(0.0f);
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot11.zoom((double) (byte) 0);
        java.awt.Paint paint23 = multiplePiePlot11.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart24 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot11);
        java.awt.Stroke stroke25 = jFreeChart24.getBorderStroke();
        jFreeChart4.setBorderStroke(stroke25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj12", multiplePiePlot1.equals(obj12) ? multiplePiePlot1.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
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
        java.lang.Object obj12 = jFreeChart4.clone();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        org.jfree.chart.title.LegendTitle legendTitle18 = jFreeChart17.getLegend();
        org.jfree.chart.title.LegendTitle legendTitle19 = jFreeChart17.getLegend();
        jFreeChart4.addLegend(legendTitle19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot14", multiplePiePlot1.equals(multiplePiePlot14) ? multiplePiePlot1.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder16 = multiplePiePlot15.getDataExtractOrder();
        float float17 = multiplePiePlot15.getBackgroundImageAlpha();
        java.awt.Paint paint18 = multiplePiePlot15.getNoDataMessagePaint();
        jFreeChart4.setBackgroundPaint(paint18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot15", multiplePiePlot1.equals(multiplePiePlot15) ? multiplePiePlot1.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj15 = multiplePiePlot14.clone();
        multiplePiePlot14.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot14.setDrawingSupplier(drawingSupplier18);
        multiplePiePlot14.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot14.getPieChart();
        org.jfree.chart.title.Title title24 = jFreeChart22.getSubtitle((int) (byte) 0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot();
        float float27 = multiplePiePlot26.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot28 = multiplePiePlot26.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart29 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot26);
        jFreeChart29.fireChartChanged();
        boolean boolean31 = jFreeChart29.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle33 = jFreeChart29.getLegend((int) (short) 0);
        jFreeChart22.addLegend(legendTitle33);
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = jFreeChart22.getPadding();
        jFreeChart4.setPadding(rectangleInsets35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot26", multiplePiePlot1.equals(multiplePiePlot26) ? multiplePiePlot1.hashCode() == multiplePiePlot26.hashCode() : true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot();
        float float35 = multiplePiePlot34.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot36 = multiplePiePlot34.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart37 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot34);
        jFreeChart37.fireChartChanged();
        boolean boolean39 = jFreeChart37.getAntiAlias();
        java.awt.Paint paint40 = jFreeChart37.getBorderPaint();
        java.lang.Object obj41 = jFreeChart37.clone();
        java.awt.image.BufferedImage bufferedImage44 = jFreeChart37.createBufferedImage((int) ' ', 1);
        jFreeChart8.setBackgroundImage((java.awt.Image) bufferedImage44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot18 and multiplePiePlot34", multiplePiePlot18.equals(multiplePiePlot34) ? multiplePiePlot18.hashCode() == multiplePiePlot34.hashCode() : true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        boolean boolean8 = multiplePiePlot0.equals((java.lang.Object) 1.0f);
        java.awt.Stroke stroke9 = multiplePiePlot0.getOutlineStroke();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot0.getRootPlot();
        java.awt.Font font12 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        multiplePiePlot14.setForegroundAlpha((float) (byte) 0);
        java.awt.Paint paint20 = multiplePiePlot14.getOutlinePaint();
        org.jfree.chart.JFreeChart jFreeChart22 = new org.jfree.chart.JFreeChart("hi!", font12, (org.jfree.chart.plot.Plot) multiplePiePlot14, true);
        multiplePiePlot0.setNoDataMessageFont(font12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart17 and jFreeChart22", jFreeChart17.equals(jFreeChart22) ? jFreeChart17.hashCode() == jFreeChart22.hashCode() : true);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
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
        multiplePiePlot2.setOutlineVisible(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot0 and obj3", multiplePiePlot0.equals(obj3) ? multiplePiePlot0.hashCode() == obj3.hashCode() : true);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
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
        java.awt.Image image11 = null;
        multiplePiePlot0.setBackgroundImage(image11);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        jFreeChart17.fireChartChanged();
        java.lang.Object obj19 = jFreeChart17.clone();
        java.awt.Paint paint20 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart17.setBackgroundPaint(paint20);
        boolean boolean22 = jFreeChart17.isBorderVisible();
        jFreeChart17.setBackgroundImageAlignment(1);
        jFreeChart17.removeLegend();
        java.awt.image.BufferedImage bufferedImage28 = jFreeChart17.createBufferedImage((int) (short) 1, (int) ' ');
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo32 = null;
        java.awt.image.BufferedImage bufferedImage33 = jFreeChart17.createBufferedImage((int) '#', 1, 1, chartRenderingInfo32);
        multiplePiePlot0.setBackgroundImage((java.awt.Image) bufferedImage33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot14", obj1.equals(multiplePiePlot14) ? obj1.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        jFreeChart17.fireChartChanged();
        boolean boolean19 = jFreeChart17.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle21 = jFreeChart17.getLegend((int) (short) 0);
        boolean boolean22 = jFreeChart17.isNotify();
        java.util.List list23 = jFreeChart17.getSubtitles();
        java.util.List list24 = jFreeChart17.getSubtitles();
        jFreeChart9.setSubtitles(list24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot14", obj1.equals(multiplePiePlot14) ? obj1.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj17 = multiplePiePlot16.clone();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        multiplePiePlot16.setDataset(categoryDataset18);
        java.awt.Font font20 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot16.setNoDataMessageFont(font20);
        boolean boolean22 = multiplePiePlot16.isSubplot();
        multiplePiePlot0.setParent((org.jfree.chart.plot.Plot) multiplePiePlot16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj17", obj3.equals(obj17) ? obj3.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot0.getDatasetGroup();
        java.lang.String str9 = multiplePiePlot0.getNoDataMessage();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        float float12 = multiplePiePlot11.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot11.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot11);
        java.awt.Paint paint15 = jFreeChart14.getBackgroundPaint();
        java.awt.Stroke stroke16 = jFreeChart14.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle17 = jFreeChart14.getTitle();
        java.awt.Image image18 = jFreeChart14.getBackgroundImage();
        java.awt.Paint paint19 = jFreeChart14.getBorderPaint();
        boolean boolean20 = jFreeChart14.isNotify();
        java.awt.Stroke stroke21 = jFreeChart14.getBorderStroke();
        multiplePiePlot0.setOutlineStroke(stroke21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot11", obj1.equals(multiplePiePlot11) ? obj1.hashCode() == multiplePiePlot11.hashCode() : true);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        jFreeChart17.fireChartChanged();
        java.lang.Object obj19 = jFreeChart17.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo22 = null;
        java.awt.image.BufferedImage bufferedImage23 = jFreeChart17.createBufferedImage((int) '#', 1, chartRenderingInfo22);
        org.jfree.chart.title.LegendTitle legendTitle24 = jFreeChart17.getLegend();
        java.awt.RenderingHints renderingHints25 = jFreeChart17.getRenderingHints();
        jFreeChart8.setRenderingHints(renderingHints25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart17 and obj19", jFreeChart17.equals(obj19) ? jFreeChart17.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        java.awt.Paint paint18 = jFreeChart17.getBackgroundPaint();
        java.awt.Stroke stroke19 = jFreeChart17.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle20 = jFreeChart17.getTitle();
        java.lang.Object obj21 = jFreeChart17.clone();
        java.awt.Stroke stroke22 = jFreeChart17.getBorderStroke();
        plot12.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on plot12 and multiplePiePlot14", plot12.equals(multiplePiePlot14) ? plot12.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj15 = multiplePiePlot14.clone();
        multiplePiePlot14.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot14.setDrawingSupplier(drawingSupplier18);
        multiplePiePlot14.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot14.getPieChart();
        org.jfree.chart.title.Title title24 = jFreeChart22.getSubtitle((int) (byte) 0);
        jFreeChart22.removeLegend();
        org.jfree.chart.title.LegendTitle legendTitle26 = jFreeChart22.getLegend();
        java.awt.Font font28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj30 = multiplePiePlot29.clone();
        multiplePiePlot29.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier33 = null;
        multiplePiePlot29.setDrawingSupplier(drawingSupplier33);
        multiplePiePlot29.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart37 = multiplePiePlot29.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart38 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot29);
        org.jfree.chart.JFreeChart jFreeChart40 = new org.jfree.chart.JFreeChart("", font28, (org.jfree.chart.plot.Plot) multiplePiePlot29, false);
        java.awt.Paint paint41 = jFreeChart40.getBorderPaint();
        org.jfree.chart.event.ChartProgressListener chartProgressListener42 = null;
        jFreeChart40.removeProgressListener(chartProgressListener42);
        java.util.List list44 = jFreeChart40.getSubtitles();
        jFreeChart22.setSubtitles(list44);
        jFreeChart4.setSubtitles(list44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj30", multiplePiePlot1.equals(obj30) ? multiplePiePlot1.hashCode() == obj30.hashCode() : true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot0.setInsets(rectangleInsets3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        multiplePiePlot0.setDataset(categoryDataset5);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        float float9 = multiplePiePlot8.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot8.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot8);
        jFreeChart11.fireChartChanged();
        java.lang.Object obj13 = jFreeChart11.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo16 = null;
        java.awt.image.BufferedImage bufferedImage17 = jFreeChart11.createBufferedImage((int) '#', 1, chartRenderingInfo16);
        jFreeChart11.removeLegend();
        java.lang.Object obj19 = jFreeChart11.getTextAntiAlias();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo24 = null;
        java.awt.image.BufferedImage bufferedImage25 = jFreeChart11.createBufferedImage(1, (int) (short) 10, (double) 0.0f, 100.0d, chartRenderingInfo24);
        multiplePiePlot0.setBackgroundImage((java.awt.Image) bufferedImage25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot8", obj1.equals(multiplePiePlot8) ? obj1.hashCode() == multiplePiePlot8.hashCode() : true);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot();
        float float4 = multiplePiePlot3.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot3.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart6 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot3);
        jFreeChart6.fireChartChanged();
        java.lang.Object obj8 = jFreeChart6.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo11 = null;
        java.awt.image.BufferedImage bufferedImage12 = jFreeChart6.createBufferedImage((int) '#', 1, chartRenderingInfo11);
        boolean boolean13 = jFreeChart6.isNotify();
        java.awt.Paint paint14 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart6.setBorderPaint(paint14);
        multiplePiePlot0.setOutlinePaint(paint14);
        java.lang.String str17 = multiplePiePlot0.getPlotType();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot();
        float float20 = multiplePiePlot19.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot19.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart22 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot19);
        java.awt.Paint paint23 = jFreeChart22.getBackgroundPaint();
        java.awt.Stroke stroke24 = jFreeChart22.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener25 = null;
        jFreeChart22.addProgressListener(chartProgressListener25);
        org.jfree.chart.event.ChartProgressListener chartProgressListener27 = null;
        jFreeChart22.removeProgressListener(chartProgressListener27);
        java.awt.Image image29 = jFreeChart22.getBackgroundImage();
        float float30 = jFreeChart22.getBackgroundImageAlpha();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo35 = null;
        java.awt.image.BufferedImage bufferedImage36 = jFreeChart22.createBufferedImage((int) ' ', 100, (double) 10L, 0.0d, chartRenderingInfo35);
        jFreeChart22.setBorderVisible(false);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo43 = null;
        java.awt.image.BufferedImage bufferedImage44 = jFreeChart22.createBufferedImage((int) (short) 10, (int) (byte) 10, 0.0d, (double) (byte) 10, chartRenderingInfo43);
        multiplePiePlot0.setBackgroundImage((java.awt.Image) bufferedImage44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot3 and multiplePiePlot19", multiplePiePlot3.equals(multiplePiePlot19) ? multiplePiePlot3.hashCode() == multiplePiePlot19.hashCode() : true);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        float float16 = multiplePiePlot15.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot15.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart18 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot15);
        java.awt.Paint paint19 = jFreeChart18.getBackgroundPaint();
        java.awt.Stroke stroke20 = jFreeChart18.getBorderStroke();
        boolean boolean21 = jFreeChart18.isBorderVisible();
        java.util.List list22 = jFreeChart18.getSubtitles();
        java.util.List list23 = jFreeChart18.getSubtitles();
        jFreeChart8.setSubtitles(list23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot15", obj1.equals(multiplePiePlot15) ? obj1.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        boolean boolean8 = multiplePiePlot0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        multiplePiePlot0.setNoDataMessage("");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot12.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection14 = multiplePiePlot12.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        multiplePiePlot12.setDataset(categoryDataset15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = multiplePiePlot12.getDataset();
        boolean boolean18 = multiplePiePlot12.isOutlineVisible();
        java.awt.Paint paint19 = multiplePiePlot12.getNoDataMessagePaint();
        multiplePiePlot0.setAggregatedItemsPaint(paint19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot12", obj1.equals(multiplePiePlot12) ? obj1.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
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
        jFreeChart12.fireChartChanged();
        java.lang.Object obj14 = jFreeChart12.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo17 = null;
        java.awt.image.BufferedImage bufferedImage18 = jFreeChart12.createBufferedImage((int) '#', 1, chartRenderingInfo17);
        jFreeChart12.removeLegend();
        java.lang.Object obj20 = jFreeChart12.getTextAntiAlias();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo25 = null;
        java.awt.image.BufferedImage bufferedImage26 = jFreeChart12.createBufferedImage(1, (int) (short) 10, (double) 0.0f, 100.0d, chartRenderingInfo25);
        multiplePiePlot1.setBackgroundImage((java.awt.Image) bufferedImage26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart12 and obj14", jFreeChart12.equals(obj14) ? jFreeChart12.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        float float17 = multiplePiePlot16.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot16.getRootPlot();
        multiplePiePlot16.setBackgroundImageAlignment(0);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent21 = null;
        multiplePiePlot16.axisChanged(axisChangeEvent21);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj24 = multiplePiePlot23.clone();
        multiplePiePlot23.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot23.setNoDataMessagePaint(paint27);
        multiplePiePlot23.setForegroundAlpha(10.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = multiplePiePlot23.getInsets();
        multiplePiePlot16.setInsets(rectangleInsets31);
        java.awt.Paint paint33 = multiplePiePlot16.getAggregatedItemsPaint();
        java.awt.Paint paint34 = multiplePiePlot16.getOutlinePaint();
        multiplePiePlot0.setBackgroundPaint(paint34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj24", obj3.equals(obj24) ? obj3.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj15 = multiplePiePlot14.clone();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        multiplePiePlot14.setDataset(categoryDataset16);
        java.awt.Font font18 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot14.setNoDataMessageFont(font18);
        java.lang.String str20 = multiplePiePlot14.getPlotType();
        boolean boolean21 = multiplePiePlot14.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot14.setInsets(rectangleInsets22, false);
        jFreeChart4.setPadding(rectangleInsets22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj15", multiplePiePlot1.equals(obj15) ? multiplePiePlot1.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        float float18 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot17.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot17);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent21 = null;
        multiplePiePlot17.axisChanged(axisChangeEvent21);
        java.awt.Paint paint23 = multiplePiePlot17.getAggregatedItemsPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot();
        float float26 = multiplePiePlot25.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot27 = multiplePiePlot25.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart28 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot25);
        jFreeChart28.fireChartChanged();
        boolean boolean30 = jFreeChart28.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle32 = jFreeChart28.getLegend((int) (short) 0);
        boolean boolean33 = jFreeChart28.isNotify();
        float float34 = jFreeChart28.getBackgroundImageAlpha();
        java.awt.Paint paint35 = jFreeChart28.getBorderPaint();
        multiplePiePlot17.setAggregatedItemsPaint(paint35);
        multiplePiePlot0.setAggregatedItemsPaint(paint35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot25", obj1.equals(multiplePiePlot25) ? obj1.hashCode() == multiplePiePlot25.hashCode() : true);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint4 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setNoDataMessagePaint(paint4);
        float float6 = multiplePiePlot0.getBackgroundAlpha();
        multiplePiePlot0.setForegroundAlpha((float) 10L);
        java.awt.Paint paint9 = multiplePiePlot0.getNoDataMessagePaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot10.setDataset(categoryDataset12);
        java.awt.Font font14 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot10.setNoDataMessageFont(font14);
        java.lang.String str16 = multiplePiePlot10.getPlotType();
        boolean boolean17 = multiplePiePlot10.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot10.setInsets(rectangleInsets18, false);
        java.awt.Font font21 = multiplePiePlot10.getNoDataMessageFont();
        java.awt.Paint paint22 = multiplePiePlot10.getOutlinePaint();
        multiplePiePlot0.setNoDataMessagePaint(paint22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj11", obj1.equals(obj11) ? obj1.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        float float17 = multiplePiePlot16.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot16.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot16);
        jFreeChart19.fireChartChanged();
        java.lang.Object obj21 = jFreeChart19.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo24 = null;
        java.awt.image.BufferedImage bufferedImage25 = jFreeChart19.createBufferedImage((int) '#', 1, chartRenderingInfo24);
        boolean boolean26 = jFreeChart19.isNotify();
        jFreeChart19.fireChartChanged();
        java.lang.Object obj28 = jFreeChart19.getTextAntiAlias();
        int int29 = jFreeChart19.getBackgroundImageAlignment();
        org.jfree.chart.title.TextTitle textTitle30 = jFreeChart19.getTitle();
        jFreeChart11.setTitle(textTitle30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot16", obj1.equals(multiplePiePlot16) ? obj1.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        jFreeChart17.fireChartChanged();
        java.lang.Object obj19 = jFreeChart17.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo22 = null;
        java.awt.image.BufferedImage bufferedImage23 = jFreeChart17.createBufferedImage((int) '#', 1, chartRenderingInfo22);
        boolean boolean24 = jFreeChart17.isNotify();
        jFreeChart17.fireChartChanged();
        java.lang.Object obj26 = jFreeChart17.getTextAntiAlias();
        int int27 = jFreeChart17.getBackgroundImageAlignment();
        org.jfree.chart.title.TextTitle textTitle28 = jFreeChart17.getTitle();
        jFreeChart8.setTitle(textTitle28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart17 and obj19", jFreeChart17.equals(obj19) ? jFreeChart17.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
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
        boolean boolean27 = jFreeChart26.isBorderVisible();
        java.lang.Object obj28 = jFreeChart26.getTextAntiAlias();
        java.util.List list29 = jFreeChart26.getSubtitles();
        jFreeChart4.setSubtitles(list29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj16", multiplePiePlot1.equals(obj16) ? multiplePiePlot1.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
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
        java.awt.Font font14 = multiplePiePlot0.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        float float17 = multiplePiePlot16.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot16.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot16);
        java.awt.Paint paint20 = jFreeChart19.getBackgroundPaint();
        java.awt.Stroke stroke21 = jFreeChart19.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle22 = jFreeChart19.getTitle();
        java.awt.Image image23 = jFreeChart19.getBackgroundImage();
        java.awt.Paint paint24 = jFreeChart19.getBorderPaint();
        multiplePiePlot0.setAggregatedItemsPaint(paint24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot16", obj1.equals(multiplePiePlot16) ? obj1.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        float float18 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot17.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot17);
        java.awt.Paint paint21 = jFreeChart20.getBackgroundPaint();
        java.awt.Stroke stroke22 = jFreeChart20.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener23 = null;
        jFreeChart20.addProgressListener(chartProgressListener23);
        org.jfree.chart.event.ChartProgressListener chartProgressListener25 = null;
        jFreeChart20.removeProgressListener(chartProgressListener25);
        java.awt.Image image27 = jFreeChart20.getBackgroundImage();
        java.awt.Paint paint28 = jFreeChart20.getBorderPaint();
        jFreeChart4.setBorderPaint(paint28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot17", multiplePiePlot1.equals(multiplePiePlot17) ? multiplePiePlot1.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint4 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setNoDataMessagePaint(paint4);
        java.awt.Font font6 = multiplePiePlot0.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = multiplePiePlot0.getDrawingSupplier();
        java.lang.String str8 = multiplePiePlot0.getNoDataMessage();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot0.getParent();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj12 = multiplePiePlot11.clone();
        multiplePiePlot11.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint15 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot11.setNoDataMessagePaint(paint15);
        java.awt.Font font17 = multiplePiePlot11.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        float float19 = multiplePiePlot18.getBackgroundAlpha();
        java.awt.Paint paint20 = multiplePiePlot18.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = multiplePiePlot18.getInsets();
        org.jfree.chart.JFreeChart jFreeChart23 = new org.jfree.chart.JFreeChart("Other", font17, (org.jfree.chart.plot.Plot) multiplePiePlot18, true);
        multiplePiePlot0.setNoDataMessageFont(font17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj12", obj1.equals(obj12) ? obj1.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.title.Title title10 = jFreeChart8.getSubtitle((int) (byte) 0);
        org.jfree.chart.plot.Plot plot11 = jFreeChart8.getPlot();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj13 = multiplePiePlot12.clone();
        multiplePiePlot12.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier16);
        multiplePiePlot12.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot12.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = jFreeChart20.getPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = jFreeChart20.getPadding();
        jFreeChart20.setBackgroundImageAlignment(0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj26 = multiplePiePlot25.clone();
        multiplePiePlot25.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = null;
        multiplePiePlot25.setDrawingSupplier(drawingSupplier29);
        multiplePiePlot25.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart33 = multiplePiePlot25.getPieChart();
        jFreeChart33.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot();
        float float37 = multiplePiePlot36.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot38 = multiplePiePlot36.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart39 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot36);
        java.awt.Paint paint40 = jFreeChart39.getBackgroundPaint();
        java.awt.Stroke stroke41 = jFreeChart39.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle42 = jFreeChart39.getTitle();
        jFreeChart33.setTitle(textTitle42);
        jFreeChart20.removeSubtitle((org.jfree.chart.title.Title) textTitle42);
        jFreeChart8.removeSubtitle((org.jfree.chart.title.Title) textTitle42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot36", obj1.equals(multiplePiePlot36) ? obj1.hashCode() == multiplePiePlot36.hashCode() : true);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        multiplePiePlot0.setNoDataMessage("hi!");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart10 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot9);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = jFreeChart10.getPadding();
        multiplePiePlot0.setInsets(rectangleInsets11, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot9", obj1.equals(multiplePiePlot9) ? obj1.hashCode() == multiplePiePlot9.hashCode() : true);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot();
        float float32 = multiplePiePlot31.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot33 = multiplePiePlot31.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart34 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot31);
        jFreeChart34.fireChartChanged();
        jFreeChart34.fireChartChanged();
        boolean boolean37 = jFreeChart34.isBorderVisible();
        java.awt.Paint paint38 = jFreeChart34.getBorderPaint();
        multiplePiePlot0.setOutlinePaint(paint38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot3 and multiplePiePlot31", multiplePiePlot3.equals(multiplePiePlot31) ? multiplePiePlot3.hashCode() == multiplePiePlot31.hashCode() : true);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj15 = multiplePiePlot14.clone();
        multiplePiePlot14.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot14.setDrawingSupplier(drawingSupplier18);
        multiplePiePlot14.zoom(0.0d);
        org.jfree.chart.plot.Plot plot22 = multiplePiePlot14.getRootPlot();
        plot22.setBackgroundImageAlignment((int) (byte) 100);
        org.jfree.chart.JFreeChart jFreeChart25 = new org.jfree.chart.JFreeChart(plot22);
        jFreeChart25.setBackgroundImageAlignment(100);
        java.awt.Stroke stroke28 = jFreeChart25.getBorderStroke();
        org.jfree.chart.title.LegendTitle legendTitle29 = jFreeChart25.getLegend();
        java.util.List list30 = jFreeChart25.getSubtitles();
        jFreeChart4.setSubtitles(list30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj15", multiplePiePlot1.equals(obj15) ? multiplePiePlot1.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        int int7 = jFreeChart4.getSubtitleCount();
        jFreeChart4.setBorderVisible(true);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier14);
        multiplePiePlot10.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot10.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = jFreeChart18.getPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = jFreeChart18.getPadding();
        jFreeChart18.setBackgroundImageAlignment(0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj24 = multiplePiePlot23.clone();
        multiplePiePlot23.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = null;
        multiplePiePlot23.setDrawingSupplier(drawingSupplier27);
        multiplePiePlot23.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart31 = multiplePiePlot23.getPieChart();
        jFreeChart31.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot();
        float float35 = multiplePiePlot34.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot36 = multiplePiePlot34.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart37 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot34);
        java.awt.Paint paint38 = jFreeChart37.getBackgroundPaint();
        java.awt.Stroke stroke39 = jFreeChart37.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle40 = jFreeChart37.getTitle();
        jFreeChart31.setTitle(textTitle40);
        jFreeChart18.removeSubtitle((org.jfree.chart.title.Title) textTitle40);
        jFreeChart4.removeSubtitle((org.jfree.chart.title.Title) textTitle40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot34", multiplePiePlot1.equals(multiplePiePlot34) ? multiplePiePlot1.hashCode() == multiplePiePlot34.hashCode() : true);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj13 = multiplePiePlot12.clone();
        multiplePiePlot12.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier16);
        multiplePiePlot12.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot12.getPieChart();
        multiplePiePlot12.setForegroundAlpha((-1.0f));
        java.awt.Stroke stroke23 = multiplePiePlot12.getOutlineStroke();
        jFreeChart11.setBorderStroke(stroke23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj13", obj1.equals(obj13) ? obj1.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj7 = multiplePiePlot6.clone();
        multiplePiePlot6.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot6.setDrawingSupplier(drawingSupplier10);
        multiplePiePlot6.setForegroundAlpha(0.0f);
        multiplePiePlot6.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot6.zoom((double) (byte) 0);
        java.awt.Paint paint18 = multiplePiePlot6.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot6);
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart("hi!", font4, (org.jfree.chart.plot.Plot) multiplePiePlot6, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj7", multiplePiePlot1.equals(obj7) ? multiplePiePlot1.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
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
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot0.getParent();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        float float16 = multiplePiePlot15.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot15.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart18 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot15);
        jFreeChart18.fireChartChanged();
        boolean boolean20 = jFreeChart18.getAntiAlias();
        java.awt.Paint paint21 = jFreeChart18.getBorderPaint();
        java.lang.Object obj22 = jFreeChart18.clone();
        java.awt.image.BufferedImage bufferedImage25 = jFreeChart18.createBufferedImage((int) ' ', 1);
        jFreeChart18.setBackgroundImageAlpha((float) 10);
        jFreeChart18.fireChartChanged();
        multiplePiePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot15", obj1.equals(multiplePiePlot15) ? obj1.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
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
        java.awt.Paint paint20 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        jFreeChart8.setBorderPaint(paint20);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj23 = multiplePiePlot22.clone();
        multiplePiePlot22.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = null;
        multiplePiePlot22.setDrawingSupplier(drawingSupplier26);
        multiplePiePlot22.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart30 = multiplePiePlot22.getPieChart();
        org.jfree.chart.title.Title title32 = jFreeChart30.getSubtitle((int) (byte) 0);
        jFreeChart30.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot();
        float float35 = multiplePiePlot34.getBackgroundAlpha();
        java.awt.Paint paint36 = multiplePiePlot34.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot34.setInsets(rectangleInsets37, false);
        jFreeChart30.setPadding(rectangleInsets37);
        java.awt.Paint paint41 = jFreeChart30.getBorderPaint();
        org.jfree.chart.title.LegendTitle legendTitle42 = jFreeChart30.getLegend();
        jFreeChart8.removeSubtitle((org.jfree.chart.title.Title) legendTitle42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot12 and multiplePiePlot34", multiplePiePlot12.equals(multiplePiePlot34) ? multiplePiePlot12.hashCode() == multiplePiePlot34.hashCode() : true);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj15 = multiplePiePlot14.clone();
        boolean boolean16 = multiplePiePlot0.equals(obj15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot14", obj1.equals(multiplePiePlot14) ? obj1.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
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
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot13.notifyListeners(plotChangeEvent14);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder17 = multiplePiePlot16.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot();
        float float20 = multiplePiePlot19.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot19.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart22 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot19);
        java.awt.Paint paint23 = jFreeChart22.getBackgroundPaint();
        java.awt.Stroke stroke24 = jFreeChart22.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener25 = null;
        jFreeChart22.addProgressListener(chartProgressListener25);
        org.jfree.chart.event.ChartProgressListener chartProgressListener27 = null;
        jFreeChart22.removeProgressListener(chartProgressListener27);
        java.awt.Image image29 = jFreeChart22.getBackgroundImage();
        float float30 = jFreeChart22.getBackgroundImageAlpha();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo35 = null;
        java.awt.image.BufferedImage bufferedImage36 = jFreeChart22.createBufferedImage((int) ' ', 100, (double) 10L, 0.0d, chartRenderingInfo35);
        jFreeChart22.setBorderVisible(false);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo43 = null;
        java.awt.image.BufferedImage bufferedImage44 = jFreeChart22.createBufferedImage((int) (short) 10, (int) (byte) 10, 0.0d, (double) (byte) 10, chartRenderingInfo43);
        multiplePiePlot16.setBackgroundImage((java.awt.Image) bufferedImage44);
        multiplePiePlot13.setBackgroundImage((java.awt.Image) bufferedImage44);
        jFreeChart4.setBackgroundImage((java.awt.Image) bufferedImage44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot19", multiplePiePlot1.equals(multiplePiePlot19) ? multiplePiePlot1.hashCode() == multiplePiePlot19.hashCode() : true);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
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
        int int13 = jFreeChart4.getBackgroundImageAlignment();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj15 = multiplePiePlot14.clone();
        multiplePiePlot14.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot14.setDrawingSupplier(drawingSupplier18);
        multiplePiePlot14.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot14.getPieChart();
        java.awt.RenderingHints renderingHints23 = jFreeChart22.getRenderingHints();
        jFreeChart4.setRenderingHints(renderingHints23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj15", multiplePiePlot1.equals(obj15) ? multiplePiePlot1.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        float float21 = multiplePiePlot20.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot22 = multiplePiePlot20.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart23 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot20);
        jFreeChart23.fireChartChanged();
        java.lang.Object obj25 = jFreeChart23.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo28 = null;
        java.awt.image.BufferedImage bufferedImage29 = jFreeChart23.createBufferedImage((int) '#', 1, chartRenderingInfo28);
        org.jfree.chart.title.LegendTitle legendTitle30 = jFreeChart23.getLegend();
        jFreeChart9.addLegend(legendTitle30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot20", obj1.equals(multiplePiePlot20) ? obj1.hashCode() == multiplePiePlot20.hashCode() : true);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        float float18 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot17.getRootPlot();
        multiplePiePlot17.setBackgroundImageAlignment(0);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent22 = null;
        multiplePiePlot17.axisChanged(axisChangeEvent22);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj25 = multiplePiePlot24.clone();
        multiplePiePlot24.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint28 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot24.setNoDataMessagePaint(paint28);
        multiplePiePlot24.setForegroundAlpha(10.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = multiplePiePlot24.getInsets();
        multiplePiePlot17.setInsets(rectangleInsets32);
        multiplePiePlot0.setInsets(rectangleInsets32, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj25", obj3.equals(obj25) ? obj3.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot();
        float float20 = multiplePiePlot19.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot19.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart22 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot19);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent23 = null;
        multiplePiePlot19.axisChanged(axisChangeEvent23);
        java.awt.Paint paint25 = multiplePiePlot19.getAggregatedItemsPaint();
        java.awt.Paint paint26 = multiplePiePlot19.getBackgroundPaint();
        multiplePiePlot1.setNoDataMessagePaint(paint26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot8 and multiplePiePlot19", multiplePiePlot8.equals(multiplePiePlot19) ? multiplePiePlot8.hashCode() == multiplePiePlot19.hashCode() : true);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
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
        java.awt.Paint paint16 = multiplePiePlot0.getOutlinePaint();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart10 and jFreeChart15", jFreeChart10.equals(jFreeChart15) ? jFreeChart10.hashCode() == jFreeChart15.hashCode() : true);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot();
        float float23 = multiplePiePlot22.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot22.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart25 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot22);
        java.awt.Paint paint26 = jFreeChart25.getBackgroundPaint();
        java.awt.Stroke stroke27 = jFreeChart25.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle28 = jFreeChart25.getTitle();
        java.lang.Object obj29 = jFreeChart25.clone();
        java.awt.Stroke stroke30 = jFreeChart25.getBorderStroke();
        java.awt.Stroke stroke31 = jFreeChart25.getBorderStroke();
        boolean boolean32 = jFreeChart25.getAntiAlias();
        java.awt.Paint paint33 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        boolean boolean34 = jFreeChart25.equals((java.lang.Object) paint33);
        jFreeChart13.setBackgroundPaint(paint33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot22", obj3.equals(multiplePiePlot22) ? obj3.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent16 = null;
        multiplePiePlot12.axisChanged(axisChangeEvent16);
        java.awt.Paint paint18 = multiplePiePlot12.getAggregatedItemsPaint();
        java.awt.Paint paint19 = multiplePiePlot12.getBackgroundPaint();
        boolean boolean20 = multiplePiePlot12.isOutlineVisible();
        multiplePiePlot0.setParent((org.jfree.chart.plot.Plot) multiplePiePlot12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot12", obj1.equals(multiplePiePlot12) ? obj1.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj16 = multiplePiePlot15.clone();
        multiplePiePlot15.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = null;
        multiplePiePlot15.setDrawingSupplier(drawingSupplier19);
        multiplePiePlot15.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot15.getPieChart();
        org.jfree.chart.title.Title title25 = jFreeChart23.getSubtitle((int) (byte) 0);
        jFreeChart4.addSubtitle(title25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj16", multiplePiePlot1.equals(obj16) ? multiplePiePlot1.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        java.lang.String str10 = multiplePiePlot0.getNoDataMessage();
        java.awt.Font font11 = multiplePiePlot0.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj13 = multiplePiePlot12.clone();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot12.setDataset(categoryDataset14);
        java.awt.Font font16 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot12.setNoDataMessageFont(font16);
        multiplePiePlot12.setForegroundAlpha(100.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = multiplePiePlot12.getInsets();
        boolean boolean21 = multiplePiePlot12.isSubplot();
        float float22 = multiplePiePlot12.getBackgroundImageAlpha();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = multiplePiePlot12.getDrawingSupplier();
        multiplePiePlot0.setDrawingSupplier(drawingSupplier23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj13", obj1.equals(obj13) ? obj1.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj12 = multiplePiePlot11.clone();
        multiplePiePlot11.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint15 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot11.setNoDataMessagePaint(paint15);
        multiplePiePlot11.setForegroundAlpha(10.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = multiplePiePlot11.getInsets();
        double double20 = multiplePiePlot11.getLimit();
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot11);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj12", obj1.equals(obj12) ? obj1.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        int int8 = jFreeChart4.getBackgroundImageAlignment();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj10 = multiplePiePlot9.clone();
        multiplePiePlot9.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier15);
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot9.getPieChart();
        jFreeChart17.setNotify(false);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj21 = multiplePiePlot20.clone();
        multiplePiePlot20.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = null;
        multiplePiePlot20.setDrawingSupplier(drawingSupplier24);
        multiplePiePlot20.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart28 = multiplePiePlot20.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = jFreeChart28.getPadding();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot();
        float float32 = multiplePiePlot31.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot33 = multiplePiePlot31.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart34 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot31);
        jFreeChart34.fireChartChanged();
        boolean boolean36 = jFreeChart34.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle38 = jFreeChart34.getLegend((int) (short) 0);
        jFreeChart28.removeSubtitle((org.jfree.chart.title.Title) legendTitle38);
        jFreeChart17.removeSubtitle((org.jfree.chart.title.Title) legendTitle38);
        java.awt.RenderingHints renderingHints41 = jFreeChart17.getRenderingHints();
        jFreeChart4.setRenderingHints(renderingHints41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot31", multiplePiePlot1.equals(multiplePiePlot31) ? multiplePiePlot1.hashCode() == multiplePiePlot31.hashCode() : true);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot();
        float float4 = multiplePiePlot3.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot3.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart6 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot3);
        jFreeChart6.fireChartChanged();
        java.lang.Object obj8 = jFreeChart6.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo11 = null;
        java.awt.image.BufferedImage bufferedImage12 = jFreeChart6.createBufferedImage((int) '#', 1, chartRenderingInfo11);
        boolean boolean13 = jFreeChart6.isNotify();
        java.awt.Paint paint14 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart6.setBorderPaint(paint14);
        multiplePiePlot0.setOutlinePaint(paint14);
        java.lang.String str17 = multiplePiePlot0.getPlotType();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj19 = multiplePiePlot18.clone();
        multiplePiePlot18.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = null;
        multiplePiePlot18.setDrawingSupplier(drawingSupplier22);
        multiplePiePlot18.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart26 = multiplePiePlot18.getPieChart();
        multiplePiePlot18.setForegroundAlpha((-1.0f));
        java.awt.Paint paint29 = multiplePiePlot18.getBackgroundPaint();
        multiplePiePlot0.setAggregatedItemsPaint(paint29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot3 and obj19", multiplePiePlot3.equals(obj19) ? multiplePiePlot3.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
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
        jFreeChart4.setTextAntiAlias(false);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot();
        float float25 = multiplePiePlot24.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot26 = multiplePiePlot24.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart27 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot24);
        java.awt.Paint paint28 = jFreeChart27.getBackgroundPaint();
        java.awt.Stroke stroke29 = jFreeChart27.getBorderStroke();
        boolean boolean30 = jFreeChart27.isBorderVisible();
        org.jfree.chart.event.ChartProgressListener chartProgressListener31 = null;
        jFreeChart27.addProgressListener(chartProgressListener31);
        jFreeChart27.setAntiAlias(true);
        org.jfree.chart.title.LegendTitle legendTitle35 = jFreeChart27.getLegend();
        jFreeChart4.addLegend(legendTitle35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot24", multiplePiePlot1.equals(multiplePiePlot24) ? multiplePiePlot1.hashCode() == multiplePiePlot24.hashCode() : true);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
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
        int int20 = jFreeChart4.getSubtitleCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot11", multiplePiePlot1.equals(multiplePiePlot11) ? multiplePiePlot1.hashCode() == multiplePiePlot11.hashCode() : true);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot();
        float float28 = multiplePiePlot27.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot29 = multiplePiePlot27.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart30 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot27);
        jFreeChart30.fireChartChanged();
        java.lang.Object obj32 = jFreeChart30.clone();
        jFreeChart30.setTextAntiAlias(false);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj11 and multiplePiePlot27", obj11.equals(multiplePiePlot27) ? obj11.hashCode() == multiplePiePlot27.hashCode() : true);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = jFreeChart8.getPadding();
        int int10 = jFreeChart8.getSubtitleCount();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        java.awt.Paint paint14 = multiplePiePlot12.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        float float16 = multiplePiePlot12.getForegroundAlpha();
        java.awt.Paint paint17 = multiplePiePlot12.getAggregatedItemsPaint();
        float float18 = multiplePiePlot12.getForegroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = multiplePiePlot12.getInsets();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj21 = multiplePiePlot20.clone();
        multiplePiePlot20.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = null;
        multiplePiePlot20.setDrawingSupplier(drawingSupplier24);
        multiplePiePlot20.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart28 = multiplePiePlot20.getPieChart();
        org.jfree.chart.title.Title title30 = jFreeChart28.getSubtitle((int) (byte) 0);
        jFreeChart28.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot();
        float float33 = multiplePiePlot32.getBackgroundAlpha();
        java.awt.Paint paint34 = multiplePiePlot32.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot32.setInsets(rectangleInsets35, false);
        jFreeChart28.setPadding(rectangleInsets35);
        java.awt.Paint paint39 = jFreeChart28.getBorderPaint();
        java.awt.Paint paint40 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        jFreeChart28.setBorderPaint(paint40);
        multiplePiePlot12.setOutlinePaint(paint40);
        jFreeChart8.setBackgroundPaint(paint40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot12 and multiplePiePlot32", multiplePiePlot12.equals(multiplePiePlot32) ? multiplePiePlot12.hashCode() == multiplePiePlot32.hashCode() : true);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        java.awt.Paint paint18 = jFreeChart17.getBackgroundPaint();
        java.awt.Stroke stroke19 = jFreeChart17.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener20 = null;
        jFreeChart17.addProgressListener(chartProgressListener20);
        org.jfree.chart.event.ChartProgressListener chartProgressListener22 = null;
        jFreeChart17.removeProgressListener(chartProgressListener22);
        java.awt.Image image24 = jFreeChart17.getBackgroundImage();
        java.awt.Paint paint25 = jFreeChart17.getBorderPaint();
        plot8.setBackgroundPaint(paint25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot14", obj1.equals(multiplePiePlot14) ? obj1.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        jFreeChart17.fireChartChanged();
        java.lang.Object obj19 = jFreeChart17.clone();
        jFreeChart17.setTextAntiAlias(false);
        java.awt.Stroke stroke22 = jFreeChart17.getBorderStroke();
        jFreeChart12.setBorderStroke(stroke22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot14", obj1.equals(multiplePiePlot14) ? obj1.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier6);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        float float9 = multiplePiePlot0.getBackgroundImageAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier14);
        multiplePiePlot10.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot10.getPieChart();
        org.jfree.chart.title.Title title20 = jFreeChart18.getSubtitle((int) (byte) 0);
        jFreeChart18.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot();
        float float23 = multiplePiePlot22.getBackgroundAlpha();
        java.awt.Paint paint24 = multiplePiePlot22.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot22.setInsets(rectangleInsets25, false);
        jFreeChart18.setPadding(rectangleInsets25);
        java.awt.Paint paint29 = jFreeChart18.getBorderPaint();
        java.awt.Paint paint30 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        jFreeChart18.setBorderPaint(paint30);
        boolean boolean32 = jFreeChart18.getAntiAlias();
        multiplePiePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot22", obj1.equals(multiplePiePlot22) ? obj1.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj6 = multiplePiePlot5.clone();
        multiplePiePlot5.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot5.setDrawingSupplier(drawingSupplier9);
        multiplePiePlot5.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart13 = multiplePiePlot5.getPieChart();
        double double14 = multiplePiePlot5.getLimit();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent15 = null;
        multiplePiePlot5.datasetChanged(datasetChangeEvent15);
        multiplePiePlot5.zoom((double) 0.5f);
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", font4, (org.jfree.chart.plot.Plot) multiplePiePlot5, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj6", multiplePiePlot1.equals(obj6) ? multiplePiePlot1.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot();
        float float27 = multiplePiePlot26.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot28 = multiplePiePlot26.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart29 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot26);
        jFreeChart29.fireChartChanged();
        java.lang.Object obj31 = jFreeChart29.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo34 = null;
        java.awt.image.BufferedImage bufferedImage35 = jFreeChart29.createBufferedImage((int) '#', 1, chartRenderingInfo34);
        org.jfree.chart.title.LegendTitle legendTitle36 = jFreeChart29.getLegend();
        java.awt.RenderingHints renderingHints37 = jFreeChart29.getRenderingHints();
        jFreeChart12.setRenderingHints(renderingHints37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj14 and multiplePiePlot26", obj14.equals(multiplePiePlot26) ? obj14.hashCode() == multiplePiePlot26.hashCode() : true);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        float float19 = multiplePiePlot18.getBackgroundAlpha();
        java.awt.Paint paint20 = multiplePiePlot18.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot18);
        float float22 = multiplePiePlot18.getForegroundAlpha();
        java.awt.Paint paint23 = multiplePiePlot18.getAggregatedItemsPaint();
        float float24 = multiplePiePlot18.getForegroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = multiplePiePlot18.getInsets();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj27 = multiplePiePlot26.clone();
        multiplePiePlot26.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = null;
        multiplePiePlot26.setDrawingSupplier(drawingSupplier30);
        multiplePiePlot26.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart34 = multiplePiePlot26.getPieChart();
        org.jfree.chart.title.Title title36 = jFreeChart34.getSubtitle((int) (byte) 0);
        jFreeChart34.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot();
        float float39 = multiplePiePlot38.getBackgroundAlpha();
        java.awt.Paint paint40 = multiplePiePlot38.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot38.setInsets(rectangleInsets41, false);
        jFreeChart34.setPadding(rectangleInsets41);
        java.awt.Paint paint45 = jFreeChart34.getBorderPaint();
        java.awt.Paint paint46 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        jFreeChart34.setBorderPaint(paint46);
        multiplePiePlot18.setOutlinePaint(paint46);
        jFreeChart15.setBorderPaint(paint46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot18", obj3.equals(multiplePiePlot18) ? obj3.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        jFreeChart16.fireChartChanged();
        java.lang.Object obj18 = jFreeChart16.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo21 = null;
        java.awt.image.BufferedImage bufferedImage22 = jFreeChart16.createBufferedImage((int) '#', 1, chartRenderingInfo21);
        jFreeChart16.removeLegend();
        java.lang.Object obj24 = jFreeChart16.getTextAntiAlias();
        java.awt.image.BufferedImage bufferedImage27 = jFreeChart16.createBufferedImage(10, 15);
        multiplePiePlot0.setBackgroundImage((java.awt.Image) bufferedImage27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot13", obj1.equals(multiplePiePlot13) ? obj1.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        float float21 = multiplePiePlot20.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot22 = multiplePiePlot20.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart23 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot20);
        jFreeChart23.fireChartChanged();
        java.lang.Object obj25 = jFreeChart23.clone();
        jFreeChart23.setBackgroundImageAlpha((float) (byte) 0);
        org.jfree.chart.event.ChartProgressListener chartProgressListener28 = null;
        jFreeChart23.removeProgressListener(chartProgressListener28);
        java.awt.Stroke stroke30 = jFreeChart23.getBorderStroke();
        multiplePiePlot1.setOutlineStroke(stroke30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj2 and multiplePiePlot20", obj2.equals(multiplePiePlot20) ? obj2.hashCode() == multiplePiePlot20.hashCode() : true);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        multiplePiePlot0.setNoDataMessage("hi!");
        int int9 = multiplePiePlot0.getBackgroundImageAlignment();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot10.setDataset(categoryDataset12);
        java.awt.Font font14 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot10.setNoDataMessageFont(font14);
        multiplePiePlot10.setForegroundAlpha(100.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = multiplePiePlot10.getInsets();
        boolean boolean19 = multiplePiePlot10.isSubplot();
        float float20 = multiplePiePlot10.getBackgroundImageAlpha();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot10.getDrawingSupplier();
        multiplePiePlot0.setDrawingSupplier(drawingSupplier21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj11", obj1.equals(obj11) ? obj1.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
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
        float float11 = multiplePiePlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot3 and obj10", multiplePiePlot3.equals(obj10) ? multiplePiePlot3.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        multiplePiePlot0.setDataset(categoryDataset2);
        java.awt.Font font4 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot0.setNoDataMessageFont(font4);
        boolean boolean6 = multiplePiePlot0.isSubplot();
        java.lang.String str7 = multiplePiePlot0.getNoDataMessage();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj9 = multiplePiePlot8.clone();
        multiplePiePlot8.setBackgroundAlpha((float) (short) -1);
        java.awt.Font font12 = multiplePiePlot8.getNoDataMessageFont();
        multiplePiePlot0.setNoDataMessageFont(font12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj9", obj1.equals(obj9) ? obj1.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart4.setBackgroundPaint(paint7);
        boolean boolean9 = jFreeChart4.isBorderVisible();
        jFreeChart4.clearSubtitles();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj12 = multiplePiePlot11.clone();
        multiplePiePlot11.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier15);
        multiplePiePlot11.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot11.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot11);
        float float21 = jFreeChart20.getBackgroundImageAlpha();
        java.awt.Paint paint22 = jFreeChart20.getBackgroundPaint();
        boolean boolean23 = jFreeChart20.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle24 = jFreeChart20.getLegend();
        jFreeChart4.addSubtitle((org.jfree.chart.title.Title) legendTitle24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj12", multiplePiePlot1.equals(obj12) ? multiplePiePlot1.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot();
        float float25 = multiplePiePlot24.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot26 = multiplePiePlot24.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart27 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot24);
        jFreeChart27.fireChartChanged();
        boolean boolean29 = jFreeChart27.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle31 = jFreeChart27.getLegend((int) (short) 0);
        jFreeChart8.removeSubtitle((org.jfree.chart.title.Title) legendTitle31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot12", obj1.equals(multiplePiePlot12) ? obj1.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        float float17 = multiplePiePlot16.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot16.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot16);
        jFreeChart19.fireChartChanged();
        java.lang.Object obj21 = jFreeChart19.clone();
        java.awt.Paint paint22 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart19.setBackgroundPaint(paint22);
        boolean boolean24 = jFreeChart19.isBorderVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = jFreeChart19.getPadding();
        multiplePiePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj4 and multiplePiePlot16", obj4.equals(multiplePiePlot16) ? obj4.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        float float17 = multiplePiePlot16.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot16.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot16);
        jFreeChart19.fireChartChanged();
        java.lang.Object obj21 = jFreeChart19.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo24 = null;
        java.awt.image.BufferedImage bufferedImage25 = jFreeChart19.createBufferedImage((int) '#', 1, chartRenderingInfo24);
        boolean boolean26 = jFreeChart19.isNotify();
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart19.setBorderPaint(paint27);
        jFreeChart13.setBorderPaint(paint27);
        multiplePiePlot1.setBackgroundPaint(paint27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart4 and obj21", jFreeChart4.equals(obj21) ? jFreeChart4.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot();
        float float20 = multiplePiePlot19.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot19.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart22 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot19);
        java.awt.Paint paint23 = jFreeChart22.getBackgroundPaint();
        java.awt.Stroke stroke24 = jFreeChart22.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener25 = null;
        jFreeChart22.addProgressListener(chartProgressListener25);
        org.jfree.chart.event.ChartProgressListener chartProgressListener27 = null;
        jFreeChart22.removeProgressListener(chartProgressListener27);
        org.jfree.chart.title.TextTitle textTitle29 = jFreeChart22.getTitle();
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot19", multiplePiePlot9.equals(multiplePiePlot19) ? multiplePiePlot9.hashCode() == multiplePiePlot19.hashCode() : true);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
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
        java.awt.Stroke stroke34 = jFreeChart8.getBorderStroke();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj36 = multiplePiePlot35.clone();
        multiplePiePlot35.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier39 = null;
        multiplePiePlot35.setDrawingSupplier(drawingSupplier39);
        multiplePiePlot35.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart43 = multiplePiePlot35.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = jFreeChart43.getPadding();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot46 = new org.jfree.chart.plot.MultiplePiePlot();
        float float47 = multiplePiePlot46.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot48 = multiplePiePlot46.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart49 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot46);
        jFreeChart49.fireChartChanged();
        boolean boolean51 = jFreeChart49.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle53 = jFreeChart49.getLegend((int) (short) 0);
        jFreeChart43.removeSubtitle((org.jfree.chart.title.Title) legendTitle53);
        jFreeChart8.addSubtitle((org.jfree.chart.title.Title) legendTitle53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot24 and multiplePiePlot46", multiplePiePlot24.equals(multiplePiePlot46) ? multiplePiePlot24.hashCode() == multiplePiePlot46.hashCode() : true);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
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
        org.jfree.chart.event.ChartProgressListener chartProgressListener13 = null;
        jFreeChart4.removeProgressListener(chartProgressListener13);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        float float17 = multiplePiePlot16.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot16.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot16);
        java.awt.Paint paint20 = jFreeChart19.getBackgroundPaint();
        java.awt.Stroke stroke21 = jFreeChart19.getBorderStroke();
        boolean boolean22 = jFreeChart19.isBorderVisible();
        org.jfree.chart.event.ChartProgressListener chartProgressListener23 = null;
        jFreeChart19.addProgressListener(chartProgressListener23);
        jFreeChart19.setAntiAlias(true);
        org.jfree.chart.title.LegendTitle legendTitle27 = jFreeChart19.getLegend();
        jFreeChart4.addLegend(legendTitle27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot16", multiplePiePlot1.equals(multiplePiePlot16) ? multiplePiePlot1.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
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
        java.awt.Image image11 = null;
        multiplePiePlot0.setBackgroundImage(image11);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getRootPlot();
        java.awt.Paint paint16 = plot15.getBackgroundPaint();
        multiplePiePlot0.setNoDataMessagePaint(paint16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot13", obj1.equals(multiplePiePlot13) ? obj1.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
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
        float float19 = multiplePiePlot18.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot18.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot18);
        java.awt.Paint paint22 = jFreeChart21.getBackgroundPaint();
        java.awt.Stroke stroke23 = jFreeChart21.getBorderStroke();
        boolean boolean24 = jFreeChart21.isBorderVisible();
        org.jfree.chart.event.ChartProgressListener chartProgressListener25 = null;
        jFreeChart21.addProgressListener(chartProgressListener25);
        jFreeChart21.setAntiAlias(true);
        org.jfree.chart.title.LegendTitle legendTitle29 = jFreeChart21.getLegend();
        jFreeChart4.addLegend(legendTitle29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot18", multiplePiePlot1.equals(multiplePiePlot18) ? multiplePiePlot1.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent18 = null;
        multiplePiePlot14.axisChanged(axisChangeEvent18);
        java.awt.Paint paint20 = multiplePiePlot14.getAggregatedItemsPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj22 = multiplePiePlot21.clone();
        multiplePiePlot21.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = null;
        multiplePiePlot21.setDrawingSupplier(drawingSupplier25);
        multiplePiePlot21.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart29 = multiplePiePlot21.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = jFreeChart29.getPadding();
        multiplePiePlot14.setInsets(rectangleInsets30, true);
        jFreeChart4.setPadding(rectangleInsets30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj22", multiplePiePlot1.equals(obj22) ? multiplePiePlot1.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier17);
        multiplePiePlot13.setLimit((double) 100L);
        java.awt.Font font21 = multiplePiePlot13.getNoDataMessageFont();
        plot10.setNoDataMessageFont(font21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj14", obj1.equals(obj14) ? obj1.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = multiplePiePlot24.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder26 = multiplePiePlot24.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj28 = multiplePiePlot27.clone();
        multiplePiePlot27.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = null;
        multiplePiePlot27.setDrawingSupplier(drawingSupplier31);
        multiplePiePlot27.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart35 = multiplePiePlot27.getPieChart();
        java.awt.Image image36 = null;
        multiplePiePlot27.setBackgroundImage(image36);
        java.awt.Paint paint38 = multiplePiePlot27.getNoDataMessagePaint();
        multiplePiePlot24.setBackgroundPaint(paint38);
        jFreeChart18.setBackgroundPaint(paint38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot15 and obj28", multiplePiePlot15.equals(obj28) ? multiplePiePlot15.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint4 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setNoDataMessagePaint(paint4);
        java.awt.Font font6 = multiplePiePlot0.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot();
        float float8 = multiplePiePlot7.getBackgroundAlpha();
        java.awt.Paint paint9 = multiplePiePlot7.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot7.setInsets(rectangleInsets10, false);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        multiplePiePlot13.setDataset(categoryDataset15);
        java.awt.Font font17 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot13.setNoDataMessageFont(font17);
        java.lang.String str19 = multiplePiePlot13.getPlotType();
        boolean boolean20 = multiplePiePlot13.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot13.setInsets(rectangleInsets21, false);
        multiplePiePlot7.setInsets(rectangleInsets21, false);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        multiplePiePlot7.setDataset(categoryDataset26);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot0.setDrawingSupplier(drawingSupplier28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot7", obj1.equals(multiplePiePlot7) ? obj1.hashCode() == multiplePiePlot7.hashCode() : true);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj24 = multiplePiePlot23.clone();
        multiplePiePlot23.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot23.setNoDataMessagePaint(paint27);
        float float29 = multiplePiePlot23.getBackgroundAlpha();
        multiplePiePlot23.setForegroundAlpha((float) 10L);
        java.awt.Paint paint32 = multiplePiePlot23.getNoDataMessagePaint();
        multiplePiePlot1.setOutlinePaint(paint32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot6 and obj24", multiplePiePlot6.equals(obj24) ? multiplePiePlot6.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj33 = multiplePiePlot32.clone();
        multiplePiePlot32.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier36 = null;
        multiplePiePlot32.setDrawingSupplier(drawingSupplier36);
        multiplePiePlot32.zoom(0.0d);
        org.jfree.chart.plot.Plot plot40 = multiplePiePlot32.getRootPlot();
        plot40.setBackgroundImageAlignment((int) (byte) 100);
        org.jfree.chart.JFreeChart jFreeChart43 = new org.jfree.chart.JFreeChart(plot40);
        jFreeChart43.setBackgroundImageAlignment(100);
        java.awt.Stroke stroke46 = jFreeChart43.getBorderStroke();
        org.jfree.chart.title.LegendTitle legendTitle47 = jFreeChart43.getLegend();
        jFreeChart8.addSubtitle((org.jfree.chart.title.Title) legendTitle47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot22 and obj33", multiplePiePlot22.equals(obj33) ? multiplePiePlot22.hashCode() == obj33.hashCode() : true);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getOutlinePaint();
        java.awt.Font font5 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = multiplePiePlot6.getDrawingSupplier();
        java.awt.Paint paint8 = multiplePiePlot6.getBackgroundPaint();
        java.awt.Paint paint9 = multiplePiePlot6.getOutlinePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        multiplePiePlot6.notifyListeners(plotChangeEvent10);
        boolean boolean12 = multiplePiePlot6.isSubplot();
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", font5, (org.jfree.chart.plot.Plot) multiplePiePlot6, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier2 and drawingSupplier7", drawingSupplier2.equals(drawingSupplier7) ? drawingSupplier2.hashCode() == drawingSupplier7.hashCode() : true);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        boolean boolean5 = multiplePiePlot0.isSubplot();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot();
        float float8 = multiplePiePlot7.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot7.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart10 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot7);
        jFreeChart10.fireChartChanged();
        java.lang.Object obj12 = jFreeChart10.clone();
        java.awt.Paint paint13 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart10.setBackgroundPaint(paint13);
        jFreeChart10.setBackgroundImageAlpha((float) 1L);
        multiplePiePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot7", obj1.equals(multiplePiePlot7) ? obj1.hashCode() == multiplePiePlot7.hashCode() : true);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot0.zoom((double) (byte) 0);
        boolean boolean12 = multiplePiePlot0.isSubplot();
        java.lang.Comparable comparable13 = multiplePiePlot0.getAggregatedItemsKey();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj15 = multiplePiePlot14.clone();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        multiplePiePlot14.setDataset(categoryDataset16);
        java.awt.Font font18 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot14.setNoDataMessageFont(font18);
        java.lang.String str20 = multiplePiePlot14.getPlotType();
        boolean boolean21 = multiplePiePlot14.isSubplot();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        multiplePiePlot14.datasetChanged(datasetChangeEvent22);
        java.awt.Paint paint24 = multiplePiePlot14.getNoDataMessagePaint();
        boolean boolean25 = multiplePiePlot0.equals((java.lang.Object) multiplePiePlot14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj15", obj1.equals(obj15) ? obj1.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        jFreeChart17.fireChartChanged();
        java.awt.Paint paint19 = jFreeChart17.getBorderPaint();
        jFreeChart4.setBackgroundPaint(paint19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot14", multiplePiePlot1.equals(multiplePiePlot14) ? multiplePiePlot1.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
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
        java.awt.Image image11 = multiplePiePlot0.getBackgroundImage();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot3 and obj10", multiplePiePlot3.equals(obj10) ? multiplePiePlot3.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Paint paint3 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Font font4 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot5.getParent();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot5.getParent();
        java.lang.Comparable comparable8 = multiplePiePlot5.getAggregatedItemsKey();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent9 = null;
        multiplePiePlot5.datasetChanged(datasetChangeEvent9);
        org.jfree.chart.JFreeChart jFreeChart12 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", font4, (org.jfree.chart.plot.Plot) multiplePiePlot5, true);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj16 = multiplePiePlot15.clone();
        multiplePiePlot15.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = null;
        multiplePiePlot15.setDrawingSupplier(drawingSupplier19);
        multiplePiePlot15.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot15.getPieChart();
        org.jfree.chart.title.Title title25 = jFreeChart23.getSubtitle((int) (byte) 0);
        multiplePiePlot13.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart23);
        org.jfree.data.category.CategoryDataset categoryDataset27 = multiplePiePlot13.getDataset();
        org.jfree.chart.JFreeChart jFreeChart28 = multiplePiePlot13.getPieChart();
        jFreeChart28.clearSubtitles();
        boolean boolean30 = jFreeChart28.isBorderVisible();
        jFreeChart28.setTitle("Other");
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = jFreeChart28.getPadding();
        multiplePiePlot5.setInsets(rectangleInsets33, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj16", multiplePiePlot1.equals(obj16) ? multiplePiePlot1.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = multiplePiePlot19.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder21 = multiplePiePlot19.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot();
        float float23 = multiplePiePlot22.getBackgroundAlpha();
        java.awt.Paint paint24 = multiplePiePlot22.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot22.setInsets(rectangleInsets25, false);
        multiplePiePlot19.setInsets(rectangleInsets25);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = multiplePiePlot19.getDrawingSupplier();
        multiplePiePlot19.setBackgroundAlpha(0.0f);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj2 and multiplePiePlot22", obj2.equals(multiplePiePlot22) ? obj2.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj15 = multiplePiePlot14.clone();
        multiplePiePlot14.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot14.setDrawingSupplier(drawingSupplier18);
        multiplePiePlot14.setLimit((double) 100L);
        java.awt.Font font22 = multiplePiePlot14.getNoDataMessageFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = multiplePiePlot14.getInsets();
        jFreeChart9.setPadding(rectangleInsets23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj15", obj1.equals(obj15) ? obj1.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        jFreeChart4.setTextAntiAlias(false);
        java.awt.Stroke stroke9 = jFreeChart4.getBorderStroke();
        boolean boolean10 = jFreeChart4.isBorderVisible();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj12 = multiplePiePlot11.clone();
        multiplePiePlot11.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier15);
        multiplePiePlot11.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot11.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = jFreeChart19.getPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = jFreeChart19.getPadding();
        jFreeChart19.setBackgroundImageAlignment(0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj25 = multiplePiePlot24.clone();
        multiplePiePlot24.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = null;
        multiplePiePlot24.setDrawingSupplier(drawingSupplier28);
        multiplePiePlot24.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart32 = multiplePiePlot24.getPieChart();
        jFreeChart32.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot();
        float float36 = multiplePiePlot35.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot37 = multiplePiePlot35.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart38 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot35);
        java.awt.Paint paint39 = jFreeChart38.getBackgroundPaint();
        java.awt.Stroke stroke40 = jFreeChart38.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle41 = jFreeChart38.getTitle();
        jFreeChart32.setTitle(textTitle41);
        jFreeChart19.removeSubtitle((org.jfree.chart.title.Title) textTitle41);
        jFreeChart4.setTitle(textTitle41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot35", multiplePiePlot1.equals(multiplePiePlot35) ? multiplePiePlot1.hashCode() == multiplePiePlot35.hashCode() : true);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj16 = multiplePiePlot15.clone();
        multiplePiePlot15.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = null;
        multiplePiePlot15.setDrawingSupplier(drawingSupplier19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = null;
        multiplePiePlot15.setDrawingSupplier(drawingSupplier21);
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot15.getPieChart();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj25 = multiplePiePlot24.clone();
        multiplePiePlot24.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = null;
        multiplePiePlot24.setDrawingSupplier(drawingSupplier28);
        multiplePiePlot24.setLimit((double) 100L);
        multiplePiePlot24.setBackgroundImageAlignment(15);
        org.jfree.chart.JFreeChart jFreeChart34 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot24);
        java.awt.Paint paint35 = multiplePiePlot24.getBackgroundPaint();
        jFreeChart23.setBorderPaint(paint35);
        multiplePiePlot0.setAggregatedItemsPaint(paint35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj25", obj3.equals(obj25) ? obj3.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
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
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot0.getRootPlot();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = multiplePiePlot16.getDrawingSupplier();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot();
        float float20 = multiplePiePlot19.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot19.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart22 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot19);
        jFreeChart22.fireChartChanged();
        java.lang.Object obj24 = jFreeChart22.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo27 = null;
        java.awt.image.BufferedImage bufferedImage28 = jFreeChart22.createBufferedImage((int) '#', 1, chartRenderingInfo27);
        boolean boolean29 = jFreeChart22.isNotify();
        java.awt.Paint paint30 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart22.setBorderPaint(paint30);
        multiplePiePlot16.setOutlinePaint(paint30);
        multiplePiePlot0.setBackgroundPaint(paint30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot0", obj3.equals(multiplePiePlot0) ? obj3.hashCode() == multiplePiePlot0.hashCode() : true);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        boolean boolean8 = multiplePiePlot0.equals((java.lang.Object) 1.0f);
        boolean boolean9 = multiplePiePlot0.isSubplot();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier14);
        multiplePiePlot10.setLimit((double) 100L);
        multiplePiePlot10.setBackgroundImageAlignment(15);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        multiplePiePlot10.setDataset(categoryDataset20);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent22 = null;
        multiplePiePlot10.axisChanged(axisChangeEvent22);
        multiplePiePlot10.setNoDataMessage("Multiple Pie Plot");
        boolean boolean26 = multiplePiePlot0.equals((java.lang.Object) "Multiple Pie Plot");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj11", obj1.equals(obj11) ? obj1.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        jFreeChart17.fireChartChanged();
        java.lang.Object obj19 = jFreeChart17.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo22 = null;
        java.awt.image.BufferedImage bufferedImage23 = jFreeChart17.createBufferedImage((int) '#', 1, chartRenderingInfo22);
        jFreeChart4.setBackgroundImage((java.awt.Image) bufferedImage23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot14", multiplePiePlot1.equals(multiplePiePlot14) ? multiplePiePlot1.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj22 = multiplePiePlot21.clone();
        multiplePiePlot21.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = null;
        multiplePiePlot21.setDrawingSupplier(drawingSupplier25);
        multiplePiePlot21.setForegroundAlpha(0.0f);
        multiplePiePlot21.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot21.zoom((double) (byte) 0);
        boolean boolean33 = multiplePiePlot21.isSubplot();
        java.awt.Font font34 = multiplePiePlot21.getNoDataMessageFont();
        plot19.setNoDataMessageFont(font34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj22", obj1.equals(obj22) ? obj1.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot();
        float float28 = multiplePiePlot27.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot29 = multiplePiePlot27.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart30 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot27);
        java.awt.Paint paint31 = jFreeChart30.getBackgroundPaint();
        java.awt.Stroke stroke32 = jFreeChart30.getBorderStroke();
        boolean boolean33 = jFreeChart30.isBorderVisible();
        org.jfree.chart.event.ChartProgressListener chartProgressListener34 = null;
        jFreeChart30.addProgressListener(chartProgressListener34);
        java.lang.Object obj36 = jFreeChart30.getTextAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle37 = jFreeChart30.getLegend();
        jFreeChart18.addLegend(legendTitle37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot15 and multiplePiePlot27", multiplePiePlot15.equals(multiplePiePlot27) ? multiplePiePlot15.hashCode() == multiplePiePlot27.hashCode() : true);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle8 = jFreeChart4.getLegend((int) (short) 0);
        boolean boolean9 = jFreeChart4.isNotify();
        int int10 = jFreeChart4.getBackgroundImageAlignment();
        java.awt.Font font12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier17);
        multiplePiePlot13.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot13.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart22 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot13);
        org.jfree.chart.JFreeChart jFreeChart24 = new org.jfree.chart.JFreeChart("", font12, (org.jfree.chart.plot.Plot) multiplePiePlot13, false);
        java.awt.Paint paint25 = jFreeChart24.getBorderPaint();
        org.jfree.chart.event.ChartProgressListener chartProgressListener26 = null;
        jFreeChart24.removeProgressListener(chartProgressListener26);
        java.util.List list28 = jFreeChart24.getSubtitles();
        boolean boolean29 = jFreeChart4.equals((java.lang.Object) list28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj14", multiplePiePlot1.equals(obj14) ? multiplePiePlot1.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        float float18 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot17.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot17);
        java.awt.Paint paint21 = jFreeChart20.getBackgroundPaint();
        multiplePiePlot0.setNoDataMessagePaint(paint21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot17", obj3.equals(multiplePiePlot17) ? obj3.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
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
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot19.getParent();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot();
        float float23 = multiplePiePlot22.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot22.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart25 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot22);
        jFreeChart25.fireChartChanged();
        boolean boolean27 = jFreeChart25.getAntiAlias();
        java.awt.Paint paint28 = jFreeChart25.getBorderPaint();
        multiplePiePlot19.setAggregatedItemsPaint(paint28);
        java.awt.Paint paint30 = multiplePiePlot19.getNoDataMessagePaint();
        boolean boolean31 = jFreeChart13.equals((java.lang.Object) multiplePiePlot19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot22", obj3.equals(multiplePiePlot22) ? obj3.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
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
        multiplePiePlot0.setBackgroundAlpha(0.0f);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier17);
        java.awt.Image image19 = multiplePiePlot13.getBackgroundImage();
        boolean boolean21 = multiplePiePlot13.equals((java.lang.Object) 1.0f);
        boolean boolean22 = multiplePiePlot13.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset23 = multiplePiePlot13.getDataset();
        multiplePiePlot13.setForegroundAlpha((float) 'a');
        java.awt.Stroke stroke26 = multiplePiePlot13.getOutlineStroke();
        multiplePiePlot0.setOutlineStroke(stroke26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot3 and obj14", multiplePiePlot3.equals(obj14) ? multiplePiePlot3.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier17);
        multiplePiePlot13.zoom(0.0d);
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot13.getRootPlot();
        plot21.setBackgroundImageAlignment((int) (byte) 100);
        org.jfree.chart.JFreeChart jFreeChart24 = new org.jfree.chart.JFreeChart(plot21);
        jFreeChart24.setBackgroundImageAlignment(100);
        java.awt.Stroke stroke27 = jFreeChart24.getBorderStroke();
        org.jfree.chart.title.LegendTitle legendTitle28 = jFreeChart24.getLegend();
        java.util.List list29 = jFreeChart24.getSubtitles();
        jFreeChart4.setSubtitles(list29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj14", multiplePiePlot1.equals(obj14) ? multiplePiePlot1.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        org.jfree.chart.LegendItemCollection legendItemCollection3 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj5 = multiplePiePlot4.clone();
        multiplePiePlot4.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot4.setNoDataMessagePaint(paint8);
        java.awt.Font font10 = multiplePiePlot4.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot4.getDrawingSupplier();
        multiplePiePlot0.setDrawingSupplier(drawingSupplier11);
        boolean boolean13 = multiplePiePlot0.isSubplot();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier1 and drawingSupplier11", drawingSupplier1.equals(drawingSupplier11) ? drawingSupplier1.hashCode() == drawingSupplier11.hashCode() : true);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
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
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        multiplePiePlot15.notifyListeners(plotChangeEvent16);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder19 = multiplePiePlot18.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot();
        float float22 = multiplePiePlot21.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot23 = multiplePiePlot21.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart24 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot21);
        java.awt.Paint paint25 = jFreeChart24.getBackgroundPaint();
        java.awt.Stroke stroke26 = jFreeChart24.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener27 = null;
        jFreeChart24.addProgressListener(chartProgressListener27);
        org.jfree.chart.event.ChartProgressListener chartProgressListener29 = null;
        jFreeChart24.removeProgressListener(chartProgressListener29);
        java.awt.Image image31 = jFreeChart24.getBackgroundImage();
        float float32 = jFreeChart24.getBackgroundImageAlpha();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo37 = null;
        java.awt.image.BufferedImage bufferedImage38 = jFreeChart24.createBufferedImage((int) ' ', 100, (double) 10L, 0.0d, chartRenderingInfo37);
        jFreeChart24.setBorderVisible(false);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo45 = null;
        java.awt.image.BufferedImage bufferedImage46 = jFreeChart24.createBufferedImage((int) (short) 10, (int) (byte) 10, 0.0d, (double) (byte) 10, chartRenderingInfo45);
        multiplePiePlot18.setBackgroundImage((java.awt.Image) bufferedImage46);
        multiplePiePlot15.setBackgroundImage((java.awt.Image) bufferedImage46);
        multiplePiePlot0.setBackgroundImage((java.awt.Image) bufferedImage46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot21", obj1.equals(multiplePiePlot21) ? obj1.hashCode() == multiplePiePlot21.hashCode() : true);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        float float16 = multiplePiePlot15.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot15.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart18 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot15);
        java.awt.Paint paint19 = jFreeChart18.getBackgroundPaint();
        java.awt.Stroke stroke20 = jFreeChart18.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener21 = null;
        jFreeChart18.addProgressListener(chartProgressListener21);
        org.jfree.chart.event.ChartProgressListener chartProgressListener23 = null;
        jFreeChart18.removeProgressListener(chartProgressListener23);
        jFreeChart18.setBackgroundImageAlpha((float) 1L);
        java.lang.Object obj27 = jFreeChart18.getTextAntiAlias();
        java.util.List list28 = jFreeChart18.getSubtitles();
        jFreeChart4.setSubtitles(list28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot15", multiplePiePlot1.equals(multiplePiePlot15) ? multiplePiePlot1.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo9 = null;
        java.awt.image.BufferedImage bufferedImage10 = jFreeChart4.createBufferedImage((int) '#', 1, chartRenderingInfo9);
        boolean boolean11 = jFreeChart4.getAntiAlias();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        jFreeChart16.fireChartChanged();
        boolean boolean18 = jFreeChart16.getAntiAlias();
        java.awt.Paint paint19 = jFreeChart16.getBorderPaint();
        java.lang.Object obj20 = jFreeChart16.clone();
        jFreeChart16.setAntiAlias(false);
        java.awt.RenderingHints renderingHints23 = jFreeChart16.getRenderingHints();
        jFreeChart4.setRenderingHints(renderingHints23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot13", multiplePiePlot1.equals(multiplePiePlot13) ? multiplePiePlot1.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        float float21 = multiplePiePlot20.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot22 = multiplePiePlot20.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart23 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot20);
        jFreeChart23.fireChartChanged();
        java.lang.Object obj25 = jFreeChart23.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo28 = null;
        java.awt.image.BufferedImage bufferedImage29 = jFreeChart23.createBufferedImage((int) '#', 1, chartRenderingInfo28);
        boolean boolean30 = jFreeChart23.isNotify();
        jFreeChart23.fireChartChanged();
        java.lang.Object obj32 = jFreeChart23.getTextAntiAlias();
        int int33 = jFreeChart23.getBackgroundImageAlignment();
        org.jfree.chart.title.TextTitle textTitle34 = jFreeChart23.getTitle();
        jFreeChart14.setTitle(textTitle34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj2 and multiplePiePlot20", obj2.equals(multiplePiePlot20) ? obj2.hashCode() == multiplePiePlot20.hashCode() : true);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setNoDataMessagePaint(paint5);
        float float7 = multiplePiePlot1.getBackgroundAlpha();
        multiplePiePlot1.setForegroundAlpha((float) 10L);
        org.jfree.chart.JFreeChart jFreeChart10 = new org.jfree.chart.JFreeChart("", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj12 = multiplePiePlot11.clone();
        multiplePiePlot11.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier15);
        multiplePiePlot11.setForegroundAlpha(0.0f);
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        int int21 = multiplePiePlot11.getBackgroundImageAlignment();
        java.awt.Paint paint22 = multiplePiePlot11.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot11.getPieChart();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj25 = multiplePiePlot24.clone();
        multiplePiePlot24.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = null;
        multiplePiePlot24.setDrawingSupplier(drawingSupplier28);
        multiplePiePlot24.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart32 = multiplePiePlot24.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset33 = multiplePiePlot24.getDataset();
        java.awt.Paint paint34 = multiplePiePlot24.getOutlinePaint();
        jFreeChart23.setBorderPaint(paint34);
        multiplePiePlot1.setNoDataMessagePaint(paint34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj2 and obj25", obj2.equals(obj25) ? obj2.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder1 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder3 = multiplePiePlot2.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot0.getLegendItems();
        java.lang.String str7 = multiplePiePlot0.getNoDataMessage();
        java.awt.Stroke stroke8 = multiplePiePlot0.getOutlineStroke();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        float float10 = multiplePiePlot9.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot9.getRootPlot();
        multiplePiePlot9.setBackgroundImageAlignment(0);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent14 = null;
        multiplePiePlot9.axisChanged(axisChangeEvent14);
        java.lang.String str16 = multiplePiePlot9.getPlotType();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj18 = multiplePiePlot17.clone();
        multiplePiePlot17.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset21 = multiplePiePlot17.getDataset();
        java.awt.Image image22 = null;
        multiplePiePlot17.setBackgroundImage(image22);
        java.awt.Paint paint24 = multiplePiePlot17.getNoDataMessagePaint();
        multiplePiePlot9.setAggregatedItemsPaint(paint24);
        multiplePiePlot0.setAggregatedItemsPaint(paint24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot2 and obj18", multiplePiePlot2.equals(obj18) ? multiplePiePlot2.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        float float16 = multiplePiePlot15.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot15.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart18 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot15);
        java.awt.Paint paint19 = jFreeChart18.getBackgroundPaint();
        java.awt.Stroke stroke20 = jFreeChart18.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle21 = jFreeChart18.getTitle();
        java.lang.Object obj22 = jFreeChart18.clone();
        java.awt.Stroke stroke23 = jFreeChart18.getBorderStroke();
        java.awt.Stroke stroke24 = jFreeChart18.getBorderStroke();
        jFreeChart9.setBorderStroke(stroke24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot15", obj1.equals(multiplePiePlot15) ? obj1.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
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
        java.awt.Font font28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj30 = multiplePiePlot29.clone();
        multiplePiePlot29.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier33 = null;
        multiplePiePlot29.setDrawingSupplier(drawingSupplier33);
        multiplePiePlot29.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart37 = multiplePiePlot29.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart38 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot29);
        org.jfree.chart.JFreeChart jFreeChart40 = new org.jfree.chart.JFreeChart("", font28, (org.jfree.chart.plot.Plot) multiplePiePlot29, false);
        java.awt.Paint paint41 = jFreeChart40.getBorderPaint();
        org.jfree.chart.event.ChartProgressListener chartProgressListener42 = null;
        jFreeChart40.removeProgressListener(chartProgressListener42);
        java.util.List list44 = jFreeChart40.getSubtitles();
        java.awt.Paint paint45 = jFreeChart40.getBorderPaint();
        boolean boolean46 = jFreeChart4.equals((java.lang.Object) paint45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj30", multiplePiePlot1.equals(obj30) ? multiplePiePlot1.hashCode() == obj30.hashCode() : true);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
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
        java.awt.Stroke stroke19 = jFreeChart4.getBorderStroke();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        float float21 = multiplePiePlot20.getBackgroundAlpha();
        java.awt.Paint paint22 = multiplePiePlot20.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot20.setInsets(rectangleInsets23, false);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj27 = multiplePiePlot26.clone();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        multiplePiePlot26.setDataset(categoryDataset28);
        java.awt.Font font30 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot26.setNoDataMessageFont(font30);
        java.lang.String str32 = multiplePiePlot26.getPlotType();
        boolean boolean33 = multiplePiePlot26.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot26.setInsets(rectangleInsets34, false);
        multiplePiePlot20.setInsets(rectangleInsets34, false);
        jFreeChart4.setPadding(rectangleInsets34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot20", multiplePiePlot1.equals(multiplePiePlot20) ? multiplePiePlot1.hashCode() == multiplePiePlot20.hashCode() : true);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        jFreeChart8.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier14);
        multiplePiePlot10.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot10.getPieChart();
        org.jfree.chart.title.Title title20 = jFreeChart18.getSubtitle((int) (byte) 0);
        java.lang.Object obj21 = jFreeChart18.clone();
        boolean boolean22 = jFreeChart18.isNotify();
        org.jfree.chart.title.LegendTitle legendTitle24 = jFreeChart18.getLegend((int) (byte) 0);
        jFreeChart8.addLegend(legendTitle24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart18 and obj21", jFreeChart18.equals(obj21) ? jFreeChart18.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot14.getParent();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj17 = multiplePiePlot16.clone();
        multiplePiePlot16.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = null;
        multiplePiePlot16.setDrawingSupplier(drawingSupplier20);
        multiplePiePlot16.setForegroundAlpha(0.0f);
        multiplePiePlot16.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        int int26 = multiplePiePlot16.getBackgroundImageAlignment();
        java.awt.Paint paint27 = multiplePiePlot16.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart28 = multiplePiePlot16.getPieChart();
        multiplePiePlot16.setBackgroundAlpha((float) (short) 10);
        boolean boolean31 = multiplePiePlot14.equals((java.lang.Object) multiplePiePlot16);
        java.awt.Paint paint32 = multiplePiePlot14.getOutlinePaint();
        jFreeChart8.setBackgroundPaint(paint32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot14 and obj17", multiplePiePlot14.equals(obj17) ? multiplePiePlot14.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        java.awt.Paint paint18 = jFreeChart17.getBackgroundPaint();
        java.awt.Stroke stroke19 = jFreeChart17.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle20 = jFreeChart17.getTitle();
        jFreeChart4.setTitle(textTitle20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot14", multiplePiePlot1.equals(multiplePiePlot14) ? multiplePiePlot1.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot0.getDatasetGroup();
        java.awt.Font font9 = multiplePiePlot0.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot10);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = jFreeChart11.getPadding();
        multiplePiePlot0.setInsets(rectangleInsets12, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot10", obj1.equals(multiplePiePlot10) ? obj1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        jFreeChart4.setTitle("hi!");
        jFreeChart4.setTitle("Multiple Pie Plot");
        java.util.List list11 = jFreeChart4.getSubtitles();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj13 = multiplePiePlot12.clone();
        multiplePiePlot12.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier16);
        java.awt.Image image18 = multiplePiePlot12.getBackgroundImage();
        boolean boolean20 = multiplePiePlot12.equals((java.lang.Object) 1.0f);
        java.awt.Stroke stroke21 = multiplePiePlot12.getOutlineStroke();
        java.awt.Paint paint22 = multiplePiePlot12.getBackgroundPaint();
        boolean boolean23 = jFreeChart4.equals((java.lang.Object) multiplePiePlot12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj13", multiplePiePlot1.equals(obj13) ? multiplePiePlot1.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        float float17 = multiplePiePlot16.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot16.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot16);
        jFreeChart19.fireChartChanged();
        boolean boolean21 = jFreeChart19.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle23 = jFreeChart19.getLegend((int) (short) 0);
        boolean boolean24 = jFreeChart19.isNotify();
        float float25 = jFreeChart19.getBackgroundImageAlpha();
        java.awt.Paint paint26 = jFreeChart19.getBorderPaint();
        plot8.setOutlinePaint(paint26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot16", obj1.equals(multiplePiePlot16) ? obj1.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
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
        jFreeChart4.addLegend(legendTitle31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot24", multiplePiePlot1.equals(multiplePiePlot24) ? multiplePiePlot1.hashCode() == multiplePiePlot24.hashCode() : true);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot20.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder22 = multiplePiePlot20.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot();
        float float24 = multiplePiePlot23.getBackgroundAlpha();
        java.awt.Paint paint25 = multiplePiePlot23.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot23.setInsets(rectangleInsets26, false);
        multiplePiePlot20.setInsets(rectangleInsets26);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = multiplePiePlot20.getDrawingSupplier();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = multiplePiePlot20.getDrawingSupplier();
        multiplePiePlot0.setDrawingSupplier(drawingSupplier31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and multiplePiePlot20", obj7.equals(multiplePiePlot20) ? obj7.hashCode() == multiplePiePlot20.hashCode() : true);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        java.awt.Paint paint18 = jFreeChart17.getBackgroundPaint();
        java.awt.Stroke stroke19 = jFreeChart17.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener20 = null;
        jFreeChart17.addProgressListener(chartProgressListener20);
        org.jfree.chart.event.ChartProgressListener chartProgressListener22 = null;
        jFreeChart17.removeProgressListener(chartProgressListener22);
        java.awt.Image image24 = jFreeChart17.getBackgroundImage();
        float float25 = jFreeChart17.getBackgroundImageAlpha();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo30 = null;
        java.awt.image.BufferedImage bufferedImage31 = jFreeChart17.createBufferedImage((int) ' ', 100, (double) 10L, 0.0d, chartRenderingInfo30);
        jFreeChart4.setBackgroundImage((java.awt.Image) bufferedImage31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot14", multiplePiePlot1.equals(multiplePiePlot14) ? multiplePiePlot1.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot0.zoom((double) (byte) 0);
        boolean boolean12 = multiplePiePlot0.isSubplot();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = multiplePiePlot13.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder15 = multiplePiePlot13.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        float float17 = multiplePiePlot16.getBackgroundAlpha();
        java.awt.Paint paint18 = multiplePiePlot16.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot16.setInsets(rectangleInsets19, false);
        multiplePiePlot13.setInsets(rectangleInsets19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = multiplePiePlot13.getDrawingSupplier();
        multiplePiePlot0.setDrawingSupplier(drawingSupplier23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot13", obj1.equals(multiplePiePlot13) ? obj1.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        float float16 = multiplePiePlot15.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot15.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        multiplePiePlot15.markerChanged(markerChangeEvent18);
        java.awt.Stroke stroke20 = multiplePiePlot15.getOutlineStroke();
        multiplePiePlot0.setParent((org.jfree.chart.plot.Plot) multiplePiePlot15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot15", obj1.equals(multiplePiePlot15) ? obj1.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.JFreeChart jFreeChart2 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        java.awt.Paint paint3 = multiplePiePlot0.getBackgroundPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        multiplePiePlot0.handleClick((int) 'a', (int) (byte) 0, plotRenderingInfo6);
        java.lang.Object obj8 = multiplePiePlot0.clone();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        float float10 = multiplePiePlot9.getBackgroundAlpha();
        java.awt.Paint paint11 = multiplePiePlot9.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot9.setInsets(rectangleInsets12, false);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj16 = multiplePiePlot15.clone();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        multiplePiePlot15.setDataset(categoryDataset17);
        java.awt.Font font19 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot15.setNoDataMessageFont(font19);
        java.lang.String str21 = multiplePiePlot15.getPlotType();
        boolean boolean22 = multiplePiePlot15.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot15.setInsets(rectangleInsets23, false);
        multiplePiePlot9.setInsets(rectangleInsets23, false);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        multiplePiePlot9.setDataset(categoryDataset28);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = multiplePiePlot9.getDrawingSupplier();
        multiplePiePlot0.setDrawingSupplier(drawingSupplier30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and multiplePiePlot9", obj8.equals(multiplePiePlot9) ? obj8.hashCode() == multiplePiePlot9.hashCode() : true);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot28 = multiplePiePlot27.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection29 = multiplePiePlot27.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        multiplePiePlot27.setDataset(categoryDataset30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = multiplePiePlot27.getDataset();
        boolean boolean33 = multiplePiePlot27.isOutlineVisible();
        org.jfree.chart.JFreeChart jFreeChart34 = multiplePiePlot27.getPieChart();
        java.lang.Object obj35 = jFreeChart34.clone();
        multiplePiePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot27", multiplePiePlot5.equals(multiplePiePlot27) ? multiplePiePlot5.hashCode() == multiplePiePlot27.hashCode() : true);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj18 = multiplePiePlot17.clone();
        multiplePiePlot17.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = null;
        multiplePiePlot17.setDrawingSupplier(drawingSupplier21);
        multiplePiePlot17.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart25 = multiplePiePlot17.getPieChart();
        org.jfree.chart.title.Title title27 = jFreeChart25.getSubtitle((int) (byte) 0);
        jFreeChart25.removeLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot();
        float float30 = multiplePiePlot29.getBackgroundAlpha();
        java.awt.Paint paint31 = multiplePiePlot29.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot29.setInsets(rectangleInsets32, false);
        jFreeChart25.setPadding(rectangleInsets32);
        java.awt.Paint paint36 = jFreeChart25.getBorderPaint();
        org.jfree.chart.title.LegendTitle legendTitle37 = jFreeChart25.getLegend();
        jFreeChart12.addSubtitle((org.jfree.chart.title.Title) legendTitle37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot29", multiplePiePlot9.equals(multiplePiePlot29) ? multiplePiePlot9.hashCode() == multiplePiePlot29.hashCode() : true);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        float float18 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot17.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot17);
        jFreeChart20.fireChartChanged();
        java.awt.Paint paint22 = jFreeChart20.getBorderPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = jFreeChart20.getPadding();
        multiplePiePlot0.setInsets(rectangleInsets23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot17", obj1.equals(multiplePiePlot17) ? obj1.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj16 = multiplePiePlot15.clone();
        multiplePiePlot15.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = null;
        multiplePiePlot15.setDrawingSupplier(drawingSupplier19);
        multiplePiePlot15.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot15.getPieChart();
        multiplePiePlot15.setForegroundAlpha((-1.0f));
        java.awt.Stroke stroke26 = multiplePiePlot15.getOutlineStroke();
        multiplePiePlot0.setOutlineStroke(stroke26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj4 and obj16", obj4.equals(obj16) ? obj4.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot();
        float float28 = multiplePiePlot27.getBackgroundAlpha();
        java.awt.Paint paint29 = multiplePiePlot27.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = multiplePiePlot27.getInsets();
        jFreeChart8.setPadding(rectangleInsets30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot12 and multiplePiePlot27", multiplePiePlot12.equals(multiplePiePlot27) ? multiplePiePlot12.hashCode() == multiplePiePlot27.hashCode() : true);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Font font3 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot4.getDrawingSupplier();
        java.awt.Paint paint6 = multiplePiePlot4.getBackgroundPaint();
        java.lang.Comparable comparable7 = multiplePiePlot4.getAggregatedItemsKey();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot4.getParent();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj10 = multiplePiePlot9.clone();
        multiplePiePlot9.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier13);
        multiplePiePlot9.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot9.getPieChart();
        org.jfree.chart.title.Title title19 = jFreeChart17.getSubtitle((int) (byte) 0);
        jFreeChart17.removeLegend();
        jFreeChart17.removeLegend();
        multiplePiePlot4.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart17);
        org.jfree.chart.LegendItemCollection legendItemCollection23 = multiplePiePlot4.getLegendItems();
        org.jfree.chart.JFreeChart jFreeChart25 = new org.jfree.chart.JFreeChart("Other", font3, (org.jfree.chart.plot.Plot) multiplePiePlot4, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj10", multiplePiePlot1.equals(obj10) ? multiplePiePlot1.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Paint paint2 = multiplePiePlot0.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot0.setInsets(rectangleInsets3, false);
        multiplePiePlot0.setNoDataMessage("hi!");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        float float10 = multiplePiePlot9.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot9.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart12 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot9);
        jFreeChart12.fireChartChanged();
        java.lang.Object obj14 = jFreeChart12.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo17 = null;
        java.awt.image.BufferedImage bufferedImage18 = jFreeChart12.createBufferedImage((int) '#', 1, chartRenderingInfo17);
        jFreeChart12.removeLegend();
        java.lang.Object obj20 = jFreeChart12.getTextAntiAlias();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo25 = null;
        java.awt.image.BufferedImage bufferedImage26 = jFreeChart12.createBufferedImage(1, (int) (short) 10, (double) 0.0f, 100.0d, chartRenderingInfo25);
        multiplePiePlot0.setBackgroundImage((java.awt.Image) bufferedImage26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart12 and obj14", jFreeChart12.equals(obj14) ? jFreeChart12.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        float float17 = multiplePiePlot16.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot16.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot16);
        java.awt.Paint paint20 = jFreeChart19.getBackgroundPaint();
        java.awt.Stroke stroke21 = jFreeChart19.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle22 = jFreeChart19.getTitle();
        java.lang.Object obj23 = jFreeChart19.clone();
        int int24 = jFreeChart19.getBackgroundImageAlignment();
        org.jfree.chart.title.Title title26 = jFreeChart19.getSubtitle(0);
        jFreeChart9.removeSubtitle(title26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot16", obj1.equals(multiplePiePlot16) ? obj1.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setBackgroundAlpha((float) 1L);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot4.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder6 = multiplePiePlot4.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder6);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj10 = multiplePiePlot9.clone();
        multiplePiePlot9.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint13 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot9.setNoDataMessagePaint(paint13);
        float float15 = multiplePiePlot9.getBackgroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("", (org.jfree.chart.plot.Plot) multiplePiePlot9);
        double double17 = multiplePiePlot9.getLimit();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = multiplePiePlot9.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and obj10", multiplePiePlot4.equals(obj10) ? multiplePiePlot4.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getRootPlot();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj10 = multiplePiePlot9.clone();
        multiplePiePlot9.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint13 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot9.setNoDataMessagePaint(paint13);
        multiplePiePlot0.setAggregatedItemsPaint(paint13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj10", obj1.equals(obj10) ? obj1.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        float float17 = multiplePiePlot16.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot16.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot16);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent20 = null;
        multiplePiePlot16.axisChanged(axisChangeEvent20);
        java.awt.Paint paint22 = multiplePiePlot16.getAggregatedItemsPaint();
        java.awt.Paint paint23 = multiplePiePlot16.getBackgroundPaint();
        jFreeChart9.setBackgroundPaint(paint23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot16", obj1.equals(multiplePiePlot16) ? obj1.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj3 = multiplePiePlot2.clone();
        multiplePiePlot2.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint6 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot2.setNoDataMessagePaint(paint6);
        java.awt.Font font8 = multiplePiePlot2.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        float float10 = multiplePiePlot9.getBackgroundAlpha();
        java.awt.Paint paint11 = multiplePiePlot9.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = multiplePiePlot9.getInsets();
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart("Other", font8, (org.jfree.chart.plot.Plot) multiplePiePlot9, true);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot16.notifyListeners(plotChangeEvent17);
        org.jfree.chart.LegendItemCollection legendItemCollection19 = multiplePiePlot16.getLegendItems();
        java.awt.Image image20 = multiplePiePlot16.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        multiplePiePlot16.setDataset(categoryDataset21);
        org.jfree.chart.JFreeChart jFreeChart24 = new org.jfree.chart.JFreeChart("", font8, (org.jfree.chart.plot.Plot) multiplePiePlot16, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot9", obj3.equals(multiplePiePlot9) ? obj3.hashCode() == multiplePiePlot9.hashCode() : true);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier17);
        multiplePiePlot13.setForegroundAlpha(0.0f);
        multiplePiePlot13.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot13.zoom((double) (byte) 0);
        java.awt.Paint paint25 = multiplePiePlot13.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart26 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        org.jfree.chart.title.LegendTitle legendTitle28 = jFreeChart26.getLegend(100);
        jFreeChart26.setBorderVisible(false);
        java.awt.Stroke stroke31 = jFreeChart26.getBorderStroke();
        jFreeChart4.setBorderStroke(stroke31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj14", multiplePiePlot1.equals(obj14) ? multiplePiePlot1.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier5);
        multiplePiePlot1.setLimit((double) 100L);
        org.jfree.data.general.DatasetGroup datasetGroup9 = multiplePiePlot1.getDatasetGroup();
        java.awt.Font font10 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj12 = multiplePiePlot11.clone();
        multiplePiePlot11.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier15);
        multiplePiePlot11.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot11.getPieChart();
        org.jfree.chart.title.Title title21 = jFreeChart19.getSubtitle((int) (byte) 0);
        org.jfree.chart.plot.Plot plot22 = jFreeChart19.getPlot();
        plot22.setBackgroundImageAlignment((int) (short) 100);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj27 = multiplePiePlot26.clone();
        multiplePiePlot26.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = null;
        multiplePiePlot26.setDrawingSupplier(drawingSupplier30);
        multiplePiePlot26.setForegroundAlpha(0.0f);
        multiplePiePlot26.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot26.zoom((double) (byte) 0);
        java.awt.Paint paint38 = multiplePiePlot26.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart39 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot26);
        java.awt.Paint paint40 = multiplePiePlot26.getBackgroundPaint();
        plot22.setBackgroundPaint(paint40);
        org.jfree.chart.JFreeChart jFreeChart43 = new org.jfree.chart.JFreeChart("", font10, plot22, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj2 and obj27", obj2.equals(obj27) ? obj2.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        float float9 = multiplePiePlot8.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot8.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot8);
        org.jfree.chart.title.LegendTitle legendTitle12 = jFreeChart11.getLegend();
        org.jfree.chart.title.LegendTitle legendTitle13 = jFreeChart11.getLegend();
        jFreeChart4.addSubtitle((org.jfree.chart.title.Title) legendTitle13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot8", multiplePiePlot1.equals(multiplePiePlot8) ? multiplePiePlot1.hashCode() == multiplePiePlot8.hashCode() : true);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
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
        multiplePiePlot0.setLimit((double) 10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and obj14", multiplePiePlot11.equals(obj14) ? multiplePiePlot11.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj13 = multiplePiePlot12.clone();
        multiplePiePlot12.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint16 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot12.setNoDataMessagePaint(paint16);
        multiplePiePlot0.setNoDataMessagePaint(paint16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj13", obj1.equals(obj13) ? obj1.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        multiplePiePlot0.setDataset(categoryDataset2);
        java.awt.Font font4 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot0.setNoDataMessageFont(font4);
        multiplePiePlot0.setForegroundAlpha(100.0f);
        float float8 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Paint paint9 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier14);
        multiplePiePlot10.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot10.getPieChart();
        org.jfree.chart.title.Title title20 = jFreeChart18.getSubtitle((int) (byte) 0);
        org.jfree.chart.plot.Plot plot21 = jFreeChart18.getPlot();
        plot21.setBackgroundImageAlignment((int) (short) 100);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot();
        float float26 = multiplePiePlot25.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot27 = multiplePiePlot25.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart28 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot25);
        jFreeChart28.fireChartChanged();
        boolean boolean30 = jFreeChart28.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle32 = jFreeChart28.getLegend((int) (short) 0);
        plot21.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart28);
        jFreeChart28.setBorderVisible(true);
        boolean boolean36 = jFreeChart28.getAntiAlias();
        jFreeChart28.removeLegend();
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot25", obj1.equals(multiplePiePlot25) ? obj1.hashCode() == multiplePiePlot25.hashCode() : true);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        int int9 = jFreeChart8.getSubtitleCount();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        float float12 = multiplePiePlot11.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot11.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot11);
        java.awt.Paint paint15 = jFreeChart14.getBackgroundPaint();
        java.awt.Stroke stroke16 = jFreeChart14.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle17 = jFreeChart14.getTitle();
        java.awt.Image image18 = jFreeChart14.getBackgroundImage();
        jFreeChart14.removeLegend();
        java.awt.Stroke stroke20 = jFreeChart14.getBorderStroke();
        jFreeChart8.setBorderStroke(stroke20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot11", obj1.equals(multiplePiePlot11) ? obj1.hashCode() == multiplePiePlot11.hashCode() : true);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
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
        jFreeChart21.setTextAntiAlias(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj8", multiplePiePlot1.equals(obj8) ? multiplePiePlot1.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        java.awt.Paint paint18 = jFreeChart17.getBackgroundPaint();
        java.awt.Stroke stroke19 = jFreeChart17.getBorderStroke();
        boolean boolean20 = jFreeChart17.isBorderVisible();
        org.jfree.chart.event.ChartProgressListener chartProgressListener21 = null;
        jFreeChart17.addProgressListener(chartProgressListener21);
        java.lang.Object obj23 = jFreeChart17.getTextAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle24 = jFreeChart17.getLegend();
        jFreeChart4.addSubtitle((org.jfree.chart.title.Title) legendTitle24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot14", multiplePiePlot1.equals(multiplePiePlot14) ? multiplePiePlot1.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = multiplePiePlot14.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder16 = multiplePiePlot14.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        float float18 = multiplePiePlot17.getBackgroundAlpha();
        java.awt.Paint paint19 = multiplePiePlot17.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot17.setInsets(rectangleInsets20, false);
        multiplePiePlot14.setInsets(rectangleInsets20);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = multiplePiePlot14.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = multiplePiePlot14.getInsets();
        jFreeChart4.setPadding(rectangleInsets25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot14", multiplePiePlot1.equals(multiplePiePlot14) ? multiplePiePlot1.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
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
        java.lang.Class<?> wildcardClass13 = jFreeChart4.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj12", obj6.equals(obj12) ? obj6.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier12);
        java.awt.Image image14 = multiplePiePlot8.getBackgroundImage();
        boolean boolean16 = multiplePiePlot8.equals((java.lang.Object) 1.0f);
        java.awt.Stroke stroke17 = multiplePiePlot8.getOutlineStroke();
        java.awt.Paint paint18 = multiplePiePlot8.getBackgroundPaint();
        boolean boolean19 = jFreeChart4.equals((java.lang.Object) paint18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj9", multiplePiePlot1.equals(obj9) ? multiplePiePlot1.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        float float21 = multiplePiePlot20.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot22 = multiplePiePlot20.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart23 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot20);
        jFreeChart23.fireChartChanged();
        java.lang.Object obj25 = jFreeChart23.clone();
        java.awt.Paint paint26 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart23.setBackgroundPaint(paint26);
        boolean boolean28 = jFreeChart23.isBorderVisible();
        jFreeChart23.setBackgroundImageAlignment(1);
        jFreeChart23.removeLegend();
        java.awt.image.BufferedImage bufferedImage34 = jFreeChart23.createBufferedImage((int) (short) 1, (int) ' ');
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo37 = null;
        java.awt.image.BufferedImage bufferedImage38 = jFreeChart23.createBufferedImage((int) '4', 15, chartRenderingInfo37);
        jFreeChart13.setBackgroundImage((java.awt.Image) bufferedImage38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot0 and multiplePiePlot20", multiplePiePlot0.equals(multiplePiePlot20) ? multiplePiePlot0.hashCode() == multiplePiePlot20.hashCode() : true);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint4 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setNoDataMessagePaint(paint4);
        java.awt.Font font6 = multiplePiePlot0.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = multiplePiePlot0.getDrawingSupplier();
        multiplePiePlot0.setNoDataMessage("Multiple Pie Plot");
        float float10 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj12 = multiplePiePlot11.clone();
        multiplePiePlot11.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint15 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot11.setNoDataMessagePaint(paint15);
        java.awt.Font font17 = multiplePiePlot11.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = multiplePiePlot11.getDrawingSupplier();
        multiplePiePlot0.setDrawingSupplier(drawingSupplier18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj12", obj1.equals(obj12) ? obj1.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Paint paint6 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setBackgroundPaint(paint6);
        org.jfree.chart.util.TableOrder tableOrder8 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj10 = multiplePiePlot9.clone();
        multiplePiePlot9.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier13);
        multiplePiePlot9.setLimit((double) 100L);
        java.awt.Font font17 = multiplePiePlot9.getNoDataMessageFont();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = multiplePiePlot9.getInsets();
        multiplePiePlot0.setInsets(rectangleInsets18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj10", obj1.equals(obj10) ? obj1.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot();
        float float34 = multiplePiePlot33.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot35 = multiplePiePlot33.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart36 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot33);
        jFreeChart36.fireChartChanged();
        java.lang.Object obj38 = jFreeChart36.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo41 = null;
        java.awt.image.BufferedImage bufferedImage42 = jFreeChart36.createBufferedImage((int) '#', 1, chartRenderingInfo41);
        jFreeChart36.removeLegend();
        java.lang.Object obj44 = jFreeChart36.getTextAntiAlias();
        java.awt.image.BufferedImage bufferedImage47 = jFreeChart36.createBufferedImage(10, 15);
        jFreeChart8.setBackgroundImage((java.awt.Image) bufferedImage47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj13 and multiplePiePlot33", obj13.equals(multiplePiePlot33) ? obj13.hashCode() == multiplePiePlot33.hashCode() : true);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot26 = multiplePiePlot25.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection27 = multiplePiePlot25.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        multiplePiePlot25.setDataset(categoryDataset28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = multiplePiePlot25.getDataset();
        boolean boolean31 = multiplePiePlot25.isOutlineVisible();
        org.jfree.chart.JFreeChart jFreeChart32 = multiplePiePlot25.getPieChart();
        org.jfree.chart.util.TableOrder tableOrder33 = multiplePiePlot25.getDataExtractOrder();
        boolean boolean34 = jFreeChart12.equals((java.lang.Object) multiplePiePlot25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart21 and jFreeChart32", jFreeChart21.equals(jFreeChart32) ? jFreeChart21.hashCode() == jFreeChart32.hashCode() : true);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier5);
        multiplePiePlot1.setForegroundAlpha(0.0f);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        java.lang.String str11 = multiplePiePlot1.getNoDataMessage();
        java.awt.Font font12 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot13.setInsets(rectangleInsets16);
        multiplePiePlot13.setOutlineVisible(true);
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart("", font12, (org.jfree.chart.plot.Plot) multiplePiePlot13, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj2 and obj14", obj2.equals(obj14) ? obj2.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot();
        float float20 = multiplePiePlot19.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot19.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart22 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot19);
        jFreeChart22.fireChartChanged();
        java.lang.Object obj24 = jFreeChart22.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo27 = null;
        java.awt.image.BufferedImage bufferedImage28 = jFreeChart22.createBufferedImage((int) '#', 1, chartRenderingInfo27);
        jFreeChart22.removeLegend();
        org.jfree.chart.title.LegendTitle legendTitle30 = jFreeChart22.getLegend();
        jFreeChart17.addLegend(legendTitle30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj2 and multiplePiePlot13", obj2.equals(multiplePiePlot13) ? obj2.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setNoDataMessagePaint(paint5);
        float float7 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart("", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        multiplePiePlot1.setForegroundAlpha(1.0f);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj12 = multiplePiePlot11.clone();
        multiplePiePlot11.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier15);
        multiplePiePlot11.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot11.getPieChart();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj21 = multiplePiePlot20.clone();
        multiplePiePlot20.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint24 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot20.setNoDataMessagePaint(paint24);
        java.awt.Font font26 = multiplePiePlot20.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = multiplePiePlot20.getDrawingSupplier();
        java.lang.String str28 = multiplePiePlot20.getNoDataMessage();
        org.jfree.chart.plot.Plot plot29 = multiplePiePlot20.getParent();
        org.jfree.data.general.DatasetGroup datasetGroup30 = multiplePiePlot20.getDatasetGroup();
        java.awt.Paint paint31 = multiplePiePlot20.getOutlinePaint();
        jFreeChart19.setBackgroundPaint(paint31);
        jFreeChart19.setBorderVisible(false);
        multiplePiePlot1.setPieChart(jFreeChart19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj2 and obj21", obj2.equals(obj21) ? obj2.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        multiplePiePlot0.setDataset(categoryDataset2);
        java.awt.Font font4 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot0.setNoDataMessageFont(font4);
        float float6 = multiplePiePlot0.getBackgroundImageAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj8 = multiplePiePlot7.clone();
        multiplePiePlot7.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot7.setDrawingSupplier(drawingSupplier11);
        multiplePiePlot7.zoom(0.0d);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        multiplePiePlot7.drawBackgroundImage(graphics2D15, rectangle2D16);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        multiplePiePlot7.drawBackgroundImage(graphics2D18, rectangle2D19);
        java.awt.Font font21 = multiplePiePlot7.getNoDataMessageFont();
        multiplePiePlot0.setNoDataMessageFont(font21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj8", obj1.equals(obj8) ? obj1.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
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
        java.lang.String str19 = multiplePiePlot0.getNoDataMessage();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj21 = multiplePiePlot20.clone();
        multiplePiePlot20.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = null;
        multiplePiePlot20.setDrawingSupplier(drawingSupplier24);
        multiplePiePlot20.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart28 = multiplePiePlot20.getPieChart();
        org.jfree.chart.title.Title title30 = jFreeChart28.getSubtitle((int) (byte) 0);
        org.jfree.chart.plot.Plot plot31 = jFreeChart28.getPlot();
        boolean boolean32 = multiplePiePlot0.equals((java.lang.Object) jFreeChart28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj21", obj7.equals(obj21) ? obj7.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        float float18 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot17.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot17);
        int int21 = jFreeChart20.getBackgroundImageAlignment();
        float float22 = jFreeChart20.getBackgroundImageAlpha();
        org.jfree.chart.title.TextTitle textTitle23 = jFreeChart20.getTitle();
        jFreeChart4.setTitle(textTitle23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot17", multiplePiePlot1.equals(multiplePiePlot17) ? multiplePiePlot1.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.awt.Paint paint3 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent4);
        java.lang.Object obj6 = multiplePiePlot0.clone();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        multiplePiePlot0.handleClick(10, 1, plotRenderingInfo9);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        java.awt.Paint paint16 = jFreeChart15.getBackgroundPaint();
        java.awt.Stroke stroke17 = jFreeChart15.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle18 = jFreeChart15.getTitle();
        java.awt.Image image19 = jFreeChart15.getBackgroundImage();
        java.awt.Paint paint20 = jFreeChart15.getBorderPaint();
        int int21 = jFreeChart15.getBackgroundImageAlignment();
        java.awt.image.BufferedImage bufferedImage24 = jFreeChart15.createBufferedImage(100, (int) 'a');
        multiplePiePlot0.setBackgroundImage((java.awt.Image) bufferedImage24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and multiplePiePlot12", obj6.equals(multiplePiePlot12) ? obj6.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj19 = multiplePiePlot18.clone();
        multiplePiePlot18.setBackgroundAlpha((float) (short) -1);
        java.awt.Font font22 = multiplePiePlot18.getNoDataMessageFont();
        org.jfree.chart.JFreeChart jFreeChart23 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot18);
        java.awt.Paint paint24 = multiplePiePlot18.getOutlinePaint();
        multiplePiePlot0.setAggregatedItemsPaint(paint24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj19", obj1.equals(obj19) ? obj1.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        java.awt.Paint paint7 = jFreeChart4.getBorderPaint();
        java.lang.Object obj8 = jFreeChart4.clone();
        java.awt.image.BufferedImage bufferedImage11 = jFreeChart4.createBufferedImage((int) ' ', 1);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        jFreeChart16.fireChartChanged();
        boolean boolean18 = jFreeChart16.getAntiAlias();
        java.awt.Paint paint19 = jFreeChart16.getBorderPaint();
        java.lang.Object obj20 = jFreeChart16.clone();
        jFreeChart16.setAntiAlias(false);
        java.awt.RenderingHints renderingHints23 = jFreeChart16.getRenderingHints();
        jFreeChart4.setRenderingHints(renderingHints23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot13", multiplePiePlot1.equals(multiplePiePlot13) ? multiplePiePlot1.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        float float19 = multiplePiePlot18.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot18.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot18);
        jFreeChart21.fireChartChanged();
        java.lang.Object obj23 = jFreeChart21.clone();
        java.awt.Paint paint24 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart21.setBackgroundPaint(paint24);
        boolean boolean26 = jFreeChart21.isBorderVisible();
        jFreeChart21.setBackgroundImageAlignment(1);
        jFreeChart21.removeLegend();
        java.awt.image.BufferedImage bufferedImage32 = jFreeChart21.createBufferedImage((int) (short) 1, (int) ' ');
        multiplePiePlot0.setBackgroundImage((java.awt.Image) bufferedImage32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot18", obj3.equals(multiplePiePlot18) ? obj3.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        boolean boolean8 = multiplePiePlot0.equals((java.lang.Object) 1.0f);
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.JFreeChart jFreeChart10 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj12 = multiplePiePlot11.clone();
        multiplePiePlot11.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier17);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot11.getPieChart();
        multiplePiePlot11.setNoDataMessage("Other");
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = multiplePiePlot11.getInsets();
        java.awt.Paint paint23 = multiplePiePlot11.getNoDataMessagePaint();
        jFreeChart10.setBorderPaint(paint23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj12", obj1.equals(obj12) ? obj1.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj13 = multiplePiePlot12.clone();
        multiplePiePlot12.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier16);
        multiplePiePlot12.setForegroundAlpha(0.0f);
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot12.zoom((double) (byte) 0);
        boolean boolean24 = multiplePiePlot12.isSubplot();
        multiplePiePlot12.setForegroundAlpha((float) (short) 0);
        multiplePiePlot0.setParent((org.jfree.chart.plot.Plot) multiplePiePlot12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj13", obj1.equals(obj13) ? obj1.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getRootPlot();
        plot8.zoom((double) 1.0f);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj12 = multiplePiePlot11.clone();
        multiplePiePlot11.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset15 = multiplePiePlot11.getDataset();
        java.awt.Image image16 = null;
        multiplePiePlot11.setBackgroundImage(image16);
        multiplePiePlot11.setNoDataMessage("hi!");
        org.jfree.data.category.CategoryDataset categoryDataset20 = multiplePiePlot11.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot11.getDrawingSupplier();
        plot8.setDrawingSupplier(drawingSupplier21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj12", obj1.equals(obj12) ? obj1.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
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
        org.jfree.data.category.CategoryDataset categoryDataset22 = multiplePiePlot0.getDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj24 = multiplePiePlot23.clone();
        multiplePiePlot23.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = null;
        multiplePiePlot23.setDrawingSupplier(drawingSupplier27);
        multiplePiePlot23.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart31 = multiplePiePlot23.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = jFreeChart31.getPadding();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot();
        float float35 = multiplePiePlot34.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot36 = multiplePiePlot34.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart37 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot34);
        jFreeChart37.fireChartChanged();
        boolean boolean39 = jFreeChart37.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle41 = jFreeChart37.getLegend((int) (short) 0);
        jFreeChart31.removeSubtitle((org.jfree.chart.title.Title) legendTitle41);
        java.awt.Stroke stroke43 = jFreeChart31.getBorderStroke();
        boolean boolean44 = multiplePiePlot0.equals((java.lang.Object) stroke43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and multiplePiePlot34", obj7.equals(multiplePiePlot34) ? obj7.hashCode() == multiplePiePlot34.hashCode() : true);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
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
        java.awt.Paint paint26 = multiplePiePlot0.getBackgroundPaint();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj25", obj7.equals(obj25) ? obj7.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
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
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot13.notifyListeners(plotChangeEvent14);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        float float18 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot17.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot17);
        java.awt.Paint paint21 = jFreeChart20.getBackgroundPaint();
        java.awt.Stroke stroke22 = jFreeChart20.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle23 = jFreeChart20.getTitle();
        java.awt.Image image24 = jFreeChart20.getBackgroundImage();
        java.awt.Paint paint25 = jFreeChart20.getBorderPaint();
        multiplePiePlot13.setAggregatedItemsPaint(paint25);
        java.awt.Font font27 = multiplePiePlot13.getNoDataMessageFont();
        float float28 = multiplePiePlot13.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        multiplePiePlot13.setDataset(categoryDataset29);
        java.awt.Paint paint31 = multiplePiePlot13.getBackgroundPaint();
        jFreeChart4.setBorderPaint(paint31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot17", multiplePiePlot1.equals(multiplePiePlot17) ? multiplePiePlot1.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        java.awt.Paint paint8 = jFreeChart4.getBorderPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj10 = multiplePiePlot9.clone();
        multiplePiePlot9.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier13);
        multiplePiePlot9.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot9.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = jFreeChart17.getPadding();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        float float21 = multiplePiePlot20.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot22 = multiplePiePlot20.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart23 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot20);
        jFreeChart23.fireChartChanged();
        boolean boolean25 = jFreeChart23.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle27 = jFreeChart23.getLegend((int) (short) 0);
        jFreeChart17.removeSubtitle((org.jfree.chart.title.Title) legendTitle27);
        jFreeChart4.removeSubtitle((org.jfree.chart.title.Title) legendTitle27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot20", multiplePiePlot1.equals(multiplePiePlot20) ? multiplePiePlot1.hashCode() == multiplePiePlot20.hashCode() : true);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.awt.Image image6 = jFreeChart4.getBackgroundImage();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj9 = multiplePiePlot8.clone();
        multiplePiePlot8.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier12);
        multiplePiePlot8.setForegroundAlpha(0.0f);
        multiplePiePlot8.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot8.zoom((double) (byte) 0);
        boolean boolean20 = multiplePiePlot8.isSubplot();
        multiplePiePlot8.zoom((double) 100.0f);
        org.jfree.chart.JFreeChart jFreeChart23 = new org.jfree.chart.JFreeChart("Other", (org.jfree.chart.plot.Plot) multiplePiePlot8);
        org.jfree.chart.title.TextTitle textTitle24 = jFreeChart23.getTitle();
        jFreeChart4.removeSubtitle((org.jfree.chart.title.Title) textTitle24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj9", multiplePiePlot1.equals(obj9) ? multiplePiePlot1.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot();
        float float31 = multiplePiePlot30.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot32 = multiplePiePlot30.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart33 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot30);
        java.awt.Paint paint34 = jFreeChart33.getBackgroundPaint();
        java.awt.Stroke stroke35 = jFreeChart33.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener36 = null;
        jFreeChart33.addProgressListener(chartProgressListener36);
        org.jfree.chart.event.ChartProgressListener chartProgressListener38 = null;
        jFreeChart33.removeProgressListener(chartProgressListener38);
        java.awt.Image image40 = jFreeChart33.getBackgroundImage();
        float float41 = jFreeChart33.getBackgroundImageAlpha();
        org.jfree.chart.title.LegendTitle legendTitle42 = jFreeChart33.getLegend();
        jFreeChart18.addSubtitle((org.jfree.chart.title.Title) legendTitle42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot15 and multiplePiePlot30", multiplePiePlot15.equals(multiplePiePlot30) ? multiplePiePlot15.hashCode() == multiplePiePlot30.hashCode() : true);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
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
        jFreeChart8.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot15.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection17 = multiplePiePlot15.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        multiplePiePlot15.setDataset(categoryDataset18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        org.jfree.chart.plot.Plot plot22 = multiplePiePlot21.getParent();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot();
        float float25 = multiplePiePlot24.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot26 = multiplePiePlot24.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart27 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot24);
        jFreeChart27.fireChartChanged();
        boolean boolean29 = jFreeChart27.getAntiAlias();
        java.awt.Paint paint30 = jFreeChart27.getBorderPaint();
        multiplePiePlot21.setAggregatedItemsPaint(paint30);
        multiplePiePlot15.setNoDataMessagePaint(paint30);
        float float33 = multiplePiePlot15.getBackgroundAlpha();
        boolean boolean34 = jFreeChart8.equals((java.lang.Object) float33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot15 and multiplePiePlot24", multiplePiePlot15.equals(multiplePiePlot24) ? multiplePiePlot15.hashCode() == multiplePiePlot24.hashCode() : true);
    }
}

