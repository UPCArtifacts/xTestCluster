import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot();
        float float20 = multiplePiePlot19.getBackgroundAlpha();
        java.awt.Paint paint21 = multiplePiePlot19.getNoDataMessagePaint();
        jFreeChart18.setBorderPaint(paint21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj2 and multiplePiePlot19", obj2.equals(multiplePiePlot19) ? obj2.hashCode() == multiplePiePlot19.hashCode() : true);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
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
        multiplePiePlot0.setBackgroundImageAlignment(100);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection2 and legendItemCollection28", legendItemCollection2.equals(legendItemCollection28) ? legendItemCollection2.hashCode() == legendItemCollection28.hashCode() : true);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj9 = multiplePiePlot8.clone();
        multiplePiePlot8.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier12);
        multiplePiePlot8.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        multiplePiePlot8.setAggregatedItemsKey((java.lang.Comparable) "");
        multiplePiePlot0.setParent((org.jfree.chart.plot.Plot) multiplePiePlot8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj9", obj1.equals(obj9) ? obj1.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getParent();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder5 = multiplePiePlot4.getDataExtractOrder();
        float float6 = multiplePiePlot4.getBackgroundImageAlpha();
        java.awt.Paint paint7 = multiplePiePlot4.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart8 = new org.jfree.chart.JFreeChart("", (org.jfree.chart.plot.Plot) multiplePiePlot4);
        boolean boolean9 = multiplePiePlot0.equals((java.lang.Object) jFreeChart8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot4", obj1.equals(multiplePiePlot4) ? obj1.hashCode() == multiplePiePlot4.hashCode() : true);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
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
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot18.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot18);
        jFreeChart21.fireChartChanged();
        java.lang.Object obj23 = jFreeChart21.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo26 = null;
        java.awt.image.BufferedImage bufferedImage27 = jFreeChart21.createBufferedImage((int) '#', 1, chartRenderingInfo26);
        boolean boolean28 = jFreeChart21.isNotify();
        jFreeChart21.fireChartChanged();
        java.lang.Object obj30 = jFreeChart21.getTextAntiAlias();
        int int31 = jFreeChart21.getBackgroundImageAlignment();
        org.jfree.chart.title.TextTitle textTitle32 = jFreeChart21.getTitle();
        jFreeChart15.removeSubtitle((org.jfree.chart.title.Title) textTitle32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot18", obj3.equals(multiplePiePlot18) ? obj3.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot15.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection17 = multiplePiePlot15.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        multiplePiePlot15.setDataset(categoryDataset18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = multiplePiePlot15.getDataset();
        boolean boolean21 = multiplePiePlot15.isOutlineVisible();
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot15.getPieChart();
        org.jfree.chart.event.ChartProgressListener chartProgressListener23 = null;
        jFreeChart22.removeProgressListener(chartProgressListener23);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot();
        float float27 = multiplePiePlot26.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot28 = multiplePiePlot26.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart29 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot26);
        jFreeChart29.fireChartChanged();
        jFreeChart29.fireChartChanged();
        jFreeChart29.setTitle("hi!");
        org.jfree.chart.title.TextTitle textTitle34 = jFreeChart29.getTitle();
        jFreeChart22.setTitle(textTitle34);
        jFreeChart4.setTitle(textTitle34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot26", multiplePiePlot1.equals(multiplePiePlot26) ? multiplePiePlot1.hashCode() == multiplePiePlot26.hashCode() : true);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart1 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = jFreeChart1.getPadding();
        java.util.List list3 = jFreeChart1.getSubtitles();
        org.jfree.chart.title.Title title5 = jFreeChart1.getSubtitle(0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj7 = multiplePiePlot6.clone();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        multiplePiePlot6.setDataset(categoryDataset8);
        java.awt.Font font10 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot6.setNoDataMessageFont(font10);
        multiplePiePlot6.setForegroundAlpha(100.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = multiplePiePlot6.getInsets();
        boolean boolean15 = multiplePiePlot6.isSubplot();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        float float17 = multiplePiePlot16.getBackgroundAlpha();
        java.awt.Paint paint18 = multiplePiePlot16.getNoDataMessagePaint();
        multiplePiePlot16.setForegroundAlpha((float) (-1L));
        java.awt.Paint paint21 = multiplePiePlot16.getOutlinePaint();
        java.awt.Font font22 = multiplePiePlot16.getNoDataMessageFont();
        java.awt.Paint paint23 = multiplePiePlot16.getOutlinePaint();
        multiplePiePlot6.setBackgroundPaint(paint23);
        jFreeChart1.setBorderPaint(paint23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot0 and obj7", multiplePiePlot0.equals(obj7) ? multiplePiePlot0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot();
        float float25 = multiplePiePlot24.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot26 = multiplePiePlot24.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart27 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot24);
        java.awt.Paint paint28 = jFreeChart27.getBackgroundPaint();
        java.awt.Stroke stroke29 = jFreeChart27.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle30 = jFreeChart27.getTitle();
        jFreeChart8.setTitle(textTitle30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot12 and multiplePiePlot24", multiplePiePlot12.equals(multiplePiePlot24) ? multiplePiePlot12.hashCode() == multiplePiePlot24.hashCode() : true);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj16 = multiplePiePlot15.clone();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        multiplePiePlot15.setDataset(categoryDataset17);
        java.awt.Font font19 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot15.setNoDataMessageFont(font19);
        boolean boolean21 = multiplePiePlot15.isSubplot();
        boolean boolean22 = jFreeChart4.equals((java.lang.Object) multiplePiePlot15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj16", multiplePiePlot1.equals(obj16) ? multiplePiePlot1.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
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
        jFreeChart15.setBackgroundImageAlpha((float) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot0 and obj7", multiplePiePlot0.equals(obj7) ? multiplePiePlot0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
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
        java.lang.Object obj18 = multiplePiePlot17.clone();
        multiplePiePlot17.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = null;
        multiplePiePlot17.setDrawingSupplier(drawingSupplier21);
        multiplePiePlot17.setForegroundAlpha(0.0f);
        multiplePiePlot17.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot17.zoom((double) (byte) 0);
        boolean boolean29 = multiplePiePlot17.isSubplot();
        multiplePiePlot17.zoom((double) 100.0f);
        org.jfree.chart.JFreeChart jFreeChart32 = new org.jfree.chart.JFreeChart("Other", (org.jfree.chart.plot.Plot) multiplePiePlot17);
        org.jfree.chart.title.TextTitle textTitle33 = jFreeChart32.getTitle();
        jFreeChart4.setTitle(textTitle33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj18", multiplePiePlot1.equals(obj18) ? multiplePiePlot1.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier17);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot11.getPieChart();
        jFreeChart19.setNotify(false);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj23 = multiplePiePlot22.clone();
        multiplePiePlot22.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = null;
        multiplePiePlot22.setDrawingSupplier(drawingSupplier26);
        multiplePiePlot22.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart30 = multiplePiePlot22.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = jFreeChart30.getPadding();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot();
        float float34 = multiplePiePlot33.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot35 = multiplePiePlot33.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart36 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot33);
        jFreeChart36.fireChartChanged();
        boolean boolean38 = jFreeChart36.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle40 = jFreeChart36.getLegend((int) (short) 0);
        jFreeChart30.removeSubtitle((org.jfree.chart.title.Title) legendTitle40);
        jFreeChart19.removeSubtitle((org.jfree.chart.title.Title) legendTitle40);
        jFreeChart4.addSubtitle((org.jfree.chart.title.Title) legendTitle40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot33", multiplePiePlot1.equals(multiplePiePlot33) ? multiplePiePlot1.hashCode() == multiplePiePlot33.hashCode() : true);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
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
        boolean boolean12 = multiplePiePlot0.isOutlineVisible();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = multiplePiePlot13.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder15 = multiplePiePlot13.getDataExtractOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot13.getLegendItems();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot13);
        org.jfree.chart.util.TableOrder tableOrder18 = multiplePiePlot13.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot13", obj1.equals(multiplePiePlot13) ? obj1.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        java.awt.Paint paint8 = jFreeChart4.getBorderPaint();
        int int9 = jFreeChart4.getSubtitleCount();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        float float12 = multiplePiePlot11.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot11.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot11);
        org.jfree.chart.title.LegendTitle legendTitle15 = jFreeChart14.getLegend();
        org.jfree.chart.title.LegendTitle legendTitle16 = jFreeChart14.getLegend();
        jFreeChart4.removeSubtitle((org.jfree.chart.title.Title) legendTitle16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot11", multiplePiePlot1.equals(multiplePiePlot11) ? multiplePiePlot1.hashCode() == multiplePiePlot11.hashCode() : true);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
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
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        multiplePiePlot20.notifyListeners(plotChangeEvent21);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder24 = multiplePiePlot23.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot();
        float float27 = multiplePiePlot26.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot28 = multiplePiePlot26.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart29 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot26);
        java.awt.Paint paint30 = jFreeChart29.getBackgroundPaint();
        java.awt.Stroke stroke31 = jFreeChart29.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener32 = null;
        jFreeChart29.addProgressListener(chartProgressListener32);
        org.jfree.chart.event.ChartProgressListener chartProgressListener34 = null;
        jFreeChart29.removeProgressListener(chartProgressListener34);
        java.awt.Image image36 = jFreeChart29.getBackgroundImage();
        float float37 = jFreeChart29.getBackgroundImageAlpha();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo42 = null;
        java.awt.image.BufferedImage bufferedImage43 = jFreeChart29.createBufferedImage((int) ' ', 100, (double) 10L, 0.0d, chartRenderingInfo42);
        jFreeChart29.setBorderVisible(false);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo50 = null;
        java.awt.image.BufferedImage bufferedImage51 = jFreeChart29.createBufferedImage((int) (short) 10, (int) (byte) 10, 0.0d, (double) (byte) 10, chartRenderingInfo50);
        multiplePiePlot23.setBackgroundImage((java.awt.Image) bufferedImage51);
        multiplePiePlot20.setBackgroundImage((java.awt.Image) bufferedImage51);
        jFreeChart13.setBackgroundImage((java.awt.Image) bufferedImage51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot26", obj3.equals(multiplePiePlot26) ? obj3.hashCode() == multiplePiePlot26.hashCode() : true);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        float float12 = multiplePiePlot11.getBackgroundAlpha();
        float float13 = multiplePiePlot11.getBackgroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = multiplePiePlot11.getInsets();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj16 = multiplePiePlot15.clone();
        multiplePiePlot15.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = null;
        multiplePiePlot15.setDrawingSupplier(drawingSupplier19);
        multiplePiePlot15.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent23 = null;
        multiplePiePlot15.axisChanged(axisChangeEvent23);
        boolean boolean25 = multiplePiePlot11.equals((java.lang.Object) multiplePiePlot15);
        java.awt.Paint paint26 = multiplePiePlot11.getOutlinePaint();
        jFreeChart4.setBorderPaint(paint26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot11", multiplePiePlot1.equals(multiplePiePlot11) ? multiplePiePlot1.hashCode() == multiplePiePlot11.hashCode() : true);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj13 = multiplePiePlot12.clone();
        multiplePiePlot12.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier16);
        multiplePiePlot12.setLimit((double) 100L);
        multiplePiePlot12.setBackgroundImageAlignment(15);
        org.jfree.chart.JFreeChart jFreeChart22 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot12);
        java.awt.Paint paint23 = multiplePiePlot12.getBackgroundPaint();
        multiplePiePlot0.setBackgroundPaint(paint23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj13", obj1.equals(obj13) ? obj1.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot13.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection15 = multiplePiePlot13.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        multiplePiePlot13.setDataset(categoryDataset16);
        multiplePiePlot13.setLimit((double) 0);
        java.awt.Paint paint20 = multiplePiePlot13.getAggregatedItemsPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent21 = null;
        multiplePiePlot13.datasetChanged(datasetChangeEvent21);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj24 = multiplePiePlot23.clone();
        multiplePiePlot23.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = null;
        multiplePiePlot23.setDrawingSupplier(drawingSupplier27);
        multiplePiePlot23.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart31 = multiplePiePlot23.getPieChart();
        org.jfree.chart.title.Title title33 = jFreeChart31.getSubtitle((int) (byte) 0);
        jFreeChart31.removeLegend();
        org.jfree.chart.title.LegendTitle legendTitle35 = jFreeChart31.getLegend();
        multiplePiePlot13.setPieChart(jFreeChart31);
        org.jfree.chart.JFreeChart jFreeChart37 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot13);
        java.awt.Paint paint38 = multiplePiePlot13.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = multiplePiePlot13.getInsets();
        jFreeChart4.setPadding(rectangleInsets39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot13", multiplePiePlot1.equals(multiplePiePlot13) ? multiplePiePlot1.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        jFreeChart4.setTextAntiAlias(false);
        java.awt.Stroke stroke9 = jFreeChart4.getBorderStroke();
        boolean boolean10 = jFreeChart4.isBorderVisible();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        java.awt.Paint paint16 = jFreeChart15.getBackgroundPaint();
        java.awt.Stroke stroke17 = jFreeChart15.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle18 = jFreeChart15.getTitle();
        java.awt.Image image19 = jFreeChart15.getBackgroundImage();
        java.awt.Paint paint20 = jFreeChart15.getBorderPaint();
        boolean boolean21 = jFreeChart15.isNotify();
        java.awt.Stroke stroke22 = jFreeChart15.getBorderStroke();
        java.awt.Paint paint23 = jFreeChart15.getBackgroundPaint();
        jFreeChart4.setBorderPaint(paint23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot12", multiplePiePlot1.equals(multiplePiePlot12) ? multiplePiePlot1.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart1 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = jFreeChart1.getPadding();
        java.util.List list3 = jFreeChart1.getSubtitles();
        org.jfree.chart.plot.Plot plot4 = jFreeChart1.getPlot();
        org.jfree.chart.JFreeChart jFreeChart5 = new org.jfree.chart.JFreeChart(plot4);
        java.awt.Paint paint6 = null;
        plot4.setOutlinePaint(paint6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart1 and jFreeChart5", jFreeChart1.equals(jFreeChart5) ? jFreeChart1.hashCode() == jFreeChart5.hashCode() : true);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        jFreeChart16.fireChartChanged();
        java.lang.Object obj18 = jFreeChart16.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo21 = null;
        java.awt.image.BufferedImage bufferedImage22 = jFreeChart16.createBufferedImage((int) '#', 1, chartRenderingInfo21);
        jFreeChart16.removeLegend();
        org.jfree.chart.title.TextTitle textTitle24 = jFreeChart16.getTitle();
        jFreeChart4.removeSubtitle((org.jfree.chart.title.Title) textTitle24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot13", multiplePiePlot1.equals(multiplePiePlot13) ? multiplePiePlot1.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        java.lang.String str8 = multiplePiePlot0.getNoDataMessage();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        float float11 = multiplePiePlot10.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot10.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot10);
        jFreeChart13.fireChartChanged();
        boolean boolean15 = jFreeChart13.getAntiAlias();
        java.awt.Paint paint16 = jFreeChart13.getBorderPaint();
        java.lang.Object obj17 = jFreeChart13.clone();
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot10", obj1.equals(multiplePiePlot10) ? obj1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
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
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot7);
        float float17 = jFreeChart16.getBackgroundImageAlpha();
        org.jfree.chart.title.Title title19 = jFreeChart16.getSubtitle((int) (short) 0);
        java.awt.Paint paint20 = jFreeChart16.getBorderPaint();
        multiplePiePlot0.setOutlinePaint(paint20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj8", obj1.equals(obj8) ? obj1.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart4.setBackgroundPaint(paint7);
        jFreeChart4.setTextAntiAlias(false);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent16 = null;
        multiplePiePlot12.axisChanged(axisChangeEvent16);
        java.awt.Paint paint18 = multiplePiePlot12.getAggregatedItemsPaint();
        multiplePiePlot12.setNoDataMessage("Multiple Pie Plot");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj22 = multiplePiePlot21.clone();
        multiplePiePlot21.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = null;
        multiplePiePlot21.setDrawingSupplier(drawingSupplier25);
        multiplePiePlot21.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart29 = multiplePiePlot21.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart30 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot21);
        java.awt.Paint paint31 = jFreeChart30.getBackgroundPaint();
        multiplePiePlot12.setOutlinePaint(paint31);
        jFreeChart4.setBackgroundPaint(paint31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj22", multiplePiePlot1.equals(obj22) ? multiplePiePlot1.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        float float16 = multiplePiePlot15.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot15.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart18 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot15);
        jFreeChart18.fireChartChanged();
        boolean boolean20 = jFreeChart18.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle22 = jFreeChart18.getLegend((int) (short) 0);
        boolean boolean23 = jFreeChart18.isNotify();
        java.util.List list24 = jFreeChart18.getSubtitles();
        java.util.List list25 = jFreeChart18.getSubtitles();
        jFreeChart4.setSubtitles(list25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot15", multiplePiePlot1.equals(multiplePiePlot15) ? multiplePiePlot1.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
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
        java.awt.Paint paint13 = jFreeChart12.getBackgroundPaint();
        java.awt.Stroke stroke14 = jFreeChart12.getBorderStroke();
        boolean boolean15 = jFreeChart12.isBorderVisible();
        org.jfree.chart.event.ChartProgressListener chartProgressListener16 = null;
        jFreeChart12.addProgressListener(chartProgressListener16);
        jFreeChart12.setAntiAlias(true);
        jFreeChart12.setBackgroundImageAlignment(100);
        java.awt.Stroke stroke22 = jFreeChart12.getBorderStroke();
        jFreeChart4.setBorderStroke(stroke22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot9", multiplePiePlot1.equals(multiplePiePlot9) ? multiplePiePlot1.hashCode() == multiplePiePlot9.hashCode() : true);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
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
        java.awt.Font font16 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        float float19 = multiplePiePlot18.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot18.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot18);
        multiplePiePlot18.setForegroundAlpha((float) (byte) 0);
        java.awt.Paint paint24 = multiplePiePlot18.getOutlinePaint();
        org.jfree.chart.JFreeChart jFreeChart26 = new org.jfree.chart.JFreeChart("hi!", font16, (org.jfree.chart.plot.Plot) multiplePiePlot18, true);
        jFreeChart26.setNotify(true);
        org.jfree.chart.title.TextTitle textTitle29 = jFreeChart26.getTitle();
        jFreeChart4.removeSubtitle((org.jfree.chart.title.Title) textTitle29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart21 and jFreeChart26", jFreeChart21.equals(jFreeChart26) ? jFreeChart21.hashCode() == jFreeChart26.hashCode() : true);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
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
        jFreeChart18.clearSubtitles();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot0 and obj11", multiplePiePlot0.equals(obj11) ? multiplePiePlot0.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.lang.String str6 = multiplePiePlot0.getNoDataMessage();
        boolean boolean7 = multiplePiePlot0.isOutlineVisible();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj9 = multiplePiePlot8.clone();
        multiplePiePlot8.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier12);
        multiplePiePlot8.setLimit((double) 100L);
        java.awt.Font font16 = multiplePiePlot8.getNoDataMessageFont();
        multiplePiePlot0.setNoDataMessageFont(font16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj9", obj1.equals(obj9) ? obj1.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
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
        jFreeChart21.setBackgroundImageAlignment(0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj8", multiplePiePlot1.equals(obj8) ? multiplePiePlot1.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot();
        float float29 = multiplePiePlot28.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot28.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart31 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot28);
        jFreeChart31.fireChartChanged();
        boolean boolean33 = jFreeChart31.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle35 = jFreeChart31.getLegend((int) (short) 0);
        boolean boolean36 = jFreeChart31.isNotify();
        java.util.List list37 = jFreeChart31.getSubtitles();
        java.util.List list38 = jFreeChart31.getSubtitles();
        org.jfree.chart.title.TextTitle textTitle39 = jFreeChart31.getTitle();
        jFreeChart8.addSubtitle((org.jfree.chart.title.Title) textTitle39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot12 and multiplePiePlot28", multiplePiePlot12.equals(multiplePiePlot28) ? multiplePiePlot12.hashCode() == multiplePiePlot28.hashCode() : true);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        jFreeChart16.fireChartChanged();
        boolean boolean18 = jFreeChart16.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle20 = jFreeChart16.getLegend((int) (short) 0);
        boolean boolean21 = jFreeChart16.isNotify();
        float float22 = jFreeChart16.getBackgroundImageAlpha();
        int int23 = jFreeChart16.getSubtitleCount();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo26 = null;
        java.awt.image.BufferedImage bufferedImage27 = jFreeChart16.createBufferedImage((int) (short) 1, 1, chartRenderingInfo26);
        multiplePiePlot0.setBackgroundImage((java.awt.Image) bufferedImage27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot13", obj1.equals(multiplePiePlot13) ? obj1.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier17);
        multiplePiePlot13.zoom(0.0d);
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot13.getRootPlot();
        plot21.setBackgroundImageAlignment((int) (byte) 100);
        org.jfree.chart.JFreeChart jFreeChart24 = new org.jfree.chart.JFreeChart(plot21);
        java.awt.Paint paint25 = plot21.getBackgroundPaint();
        multiplePiePlot0.setBackgroundPaint(paint25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj14", obj1.equals(obj14) ? obj1.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
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
        multiplePiePlot0.setLimit((double) ' ');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection14 and legendItemCollection15", legendItemCollection14.equals(legendItemCollection15) ? legendItemCollection14.hashCode() == legendItemCollection15.hashCode() : true);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        float float15 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = multiplePiePlot13.getInsets();
        jFreeChart9.setPadding(rectangleInsets16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot13", obj1.equals(multiplePiePlot13) ? obj1.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj21 = multiplePiePlot20.clone();
        multiplePiePlot20.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = null;
        multiplePiePlot20.setDrawingSupplier(drawingSupplier24);
        multiplePiePlot20.setForegroundAlpha(0.0f);
        multiplePiePlot20.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot20.zoom((double) (byte) 0);
        java.awt.Paint paint32 = multiplePiePlot20.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart33 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot20);
        org.jfree.chart.title.LegendTitle legendTitle35 = jFreeChart33.getLegend(100);
        jFreeChart33.setBorderVisible(false);
        java.awt.Stroke stroke38 = jFreeChart33.getBorderStroke();
        java.awt.RenderingHints renderingHints39 = jFreeChart33.getRenderingHints();
        jFreeChart4.setRenderingHints(renderingHints39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj21", multiplePiePlot1.equals(obj21) ? multiplePiePlot1.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot0.getDatasetGroup();
        java.lang.String str9 = multiplePiePlot0.getNoDataMessage();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = multiplePiePlot0.getInsets();
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
        java.awt.Paint paint25 = multiplePiePlot23.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot23.setInsets(rectangleInsets26, false);
        jFreeChart19.setPadding(rectangleInsets26);
        multiplePiePlot0.setInsets(rectangleInsets26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot23", obj1.equals(multiplePiePlot23) ? obj1.hashCode() == multiplePiePlot23.hashCode() : true);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        jFreeChart15.fireChartChanged();
        boolean boolean17 = jFreeChart15.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle19 = jFreeChart15.getLegend((int) (short) 0);
        boolean boolean20 = jFreeChart15.isNotify();
        java.util.List list21 = jFreeChart15.getSubtitles();
        jFreeChart4.setSubtitles(list21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot12", multiplePiePlot1.equals(multiplePiePlot12) ? multiplePiePlot1.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder31 = multiplePiePlot30.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder33 = multiplePiePlot32.getDataExtractOrder();
        multiplePiePlot30.setDataExtractOrder(tableOrder33);
        org.jfree.data.category.CategoryDataset categoryDataset35 = multiplePiePlot30.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection36 = multiplePiePlot30.getLegendItems();
        java.lang.String str37 = multiplePiePlot30.getNoDataMessage();
        java.awt.Stroke stroke38 = multiplePiePlot30.getOutlineStroke();
        jFreeChart24.setBorderStroke(stroke38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot30", obj1.equals(multiplePiePlot30) ? obj1.hashCode() == multiplePiePlot30.hashCode() : true);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj24 = multiplePiePlot23.clone();
        multiplePiePlot23.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot23.setNoDataMessagePaint(paint27);
        java.awt.Font font29 = multiplePiePlot23.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = multiplePiePlot23.getDrawingSupplier();
        java.lang.String str31 = multiplePiePlot23.getNoDataMessage();
        org.jfree.chart.plot.Plot plot32 = multiplePiePlot23.getParent();
        org.jfree.data.general.DatasetGroup datasetGroup33 = multiplePiePlot23.getDatasetGroup();
        java.awt.Paint paint34 = multiplePiePlot23.getOutlinePaint();
        multiplePiePlot0.setAggregatedItemsPaint(paint34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier1 and drawingSupplier30", drawingSupplier1.equals(drawingSupplier30) ? drawingSupplier1.hashCode() == drawingSupplier30.hashCode() : true);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot29 = multiplePiePlot28.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection30 = multiplePiePlot28.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        multiplePiePlot28.setDataset(categoryDataset31);
        org.jfree.data.category.CategoryDataset categoryDataset33 = multiplePiePlot28.getDataset();
        boolean boolean34 = multiplePiePlot28.isOutlineVisible();
        org.jfree.chart.JFreeChart jFreeChart35 = multiplePiePlot28.getPieChart();
        org.jfree.chart.event.ChartProgressListener chartProgressListener36 = null;
        jFreeChart35.removeProgressListener(chartProgressListener36);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot39 = new org.jfree.chart.plot.MultiplePiePlot();
        float float40 = multiplePiePlot39.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot41 = multiplePiePlot39.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart42 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot39);
        jFreeChart42.fireChartChanged();
        jFreeChart42.fireChartChanged();
        jFreeChart42.setTitle("hi!");
        org.jfree.chart.title.TextTitle textTitle47 = jFreeChart42.getTitle();
        jFreeChart35.setTitle(textTitle47);
        jFreeChart18.removeSubtitle((org.jfree.chart.title.Title) textTitle47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot15 and multiplePiePlot39", multiplePiePlot15.equals(multiplePiePlot39) ? multiplePiePlot15.hashCode() == multiplePiePlot39.hashCode() : true);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        float float8 = multiplePiePlot0.getForegroundAlpha();
        java.awt.Image image9 = multiplePiePlot0.getBackgroundImage();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        float float11 = multiplePiePlot10.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot10.getRootPlot();
        java.awt.Paint paint13 = multiplePiePlot10.getOutlinePaint();
        multiplePiePlot0.setBackgroundPaint(paint13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot10", obj1.equals(multiplePiePlot10) ? obj1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        java.awt.Paint paint7 = jFreeChart4.getBorderPaint();
        java.lang.Object obj8 = jFreeChart4.clone();
        java.lang.Object obj9 = jFreeChart4.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = jFreeChart4.getPadding();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and obj9", obj8.equals(obj9) ? obj8.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier17);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier19);
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot13.getPieChart();
        java.awt.Image image22 = jFreeChart21.getBackgroundImage();
        java.awt.Stroke stroke23 = jFreeChart21.getBorderStroke();
        org.jfree.chart.title.LegendTitle legendTitle24 = jFreeChart21.getLegend();
        jFreeChart4.addSubtitle((org.jfree.chart.title.Title) legendTitle24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj14", multiplePiePlot1.equals(obj14) ? multiplePiePlot1.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
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
        java.awt.Stroke stroke16 = multiplePiePlot0.getOutlineStroke();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot0", obj3.equals(multiplePiePlot0) ? obj3.hashCode() == multiplePiePlot0.hashCode() : true);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        jFreeChart17.fireChartChanged();
        java.lang.Object obj19 = jFreeChart17.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo22 = null;
        java.awt.image.BufferedImage bufferedImage23 = jFreeChart17.createBufferedImage((int) '#', 1, chartRenderingInfo22);
        org.jfree.chart.title.LegendTitle legendTitle24 = jFreeChart17.getLegend();
        jFreeChart4.addLegend(legendTitle24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot14", multiplePiePlot1.equals(multiplePiePlot14) ? multiplePiePlot1.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot18.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection20 = multiplePiePlot18.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        multiplePiePlot18.setDataset(categoryDataset21);
        multiplePiePlot18.zoom(0.0d);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot();
        float float27 = multiplePiePlot26.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot28 = multiplePiePlot26.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart29 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot26);
        jFreeChart29.fireChartChanged();
        boolean boolean31 = jFreeChart29.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle33 = jFreeChart29.getLegend((int) (short) 0);
        boolean boolean34 = jFreeChart29.isNotify();
        float float35 = jFreeChart29.getBackgroundImageAlpha();
        int int36 = jFreeChart29.getSubtitleCount();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo39 = null;
        java.awt.image.BufferedImage bufferedImage40 = jFreeChart29.createBufferedImage((int) (short) 1, 1, chartRenderingInfo39);
        multiplePiePlot18.setBackgroundImage((java.awt.Image) bufferedImage40);
        multiplePiePlot0.setBackgroundImage((java.awt.Image) bufferedImage40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot26", obj1.equals(multiplePiePlot26) ? obj1.hashCode() == multiplePiePlot26.hashCode() : true);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint4 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setNoDataMessagePaint(paint4);
        multiplePiePlot0.setForegroundAlpha(10.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = multiplePiePlot0.getInsets();
        multiplePiePlot0.setOutlineVisible(true);
        int int11 = multiplePiePlot0.getBackgroundImageAlignment();
        java.awt.Paint paint12 = multiplePiePlot0.getNoDataMessagePaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder14 = multiplePiePlot13.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder16 = multiplePiePlot15.getDataExtractOrder();
        multiplePiePlot13.setDataExtractOrder(tableOrder16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = multiplePiePlot13.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection19 = multiplePiePlot13.getLegendItems();
        multiplePiePlot13.setBackgroundAlpha(0.0f);
        java.lang.String str22 = multiplePiePlot13.getPlotType();
        multiplePiePlot0.setParent((org.jfree.chart.plot.Plot) multiplePiePlot13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot15", obj1.equals(multiplePiePlot15) ? obj1.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder1 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder3 = multiplePiePlot2.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot0.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = multiplePiePlot0.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset9 = multiplePiePlot0.getDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset14 = multiplePiePlot10.getDataset();
        java.awt.Image image15 = null;
        multiplePiePlot10.setBackgroundImage(image15);
        multiplePiePlot10.setNoDataMessage("hi!");
        org.jfree.data.category.CategoryDataset categoryDataset19 = multiplePiePlot10.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = multiplePiePlot10.getDrawingSupplier();
        multiplePiePlot0.setDrawingSupplier(drawingSupplier20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot2 and obj11", multiplePiePlot2.equals(obj11) ? multiplePiePlot2.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.title.LegendTitle legendTitle5 = jFreeChart4.getLegend();
        org.jfree.chart.title.LegendTitle legendTitle6 = jFreeChart4.getLegend();
        boolean boolean7 = jFreeChart4.getAntiAlias();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        float float10 = multiplePiePlot9.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot9.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart12 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot9);
        java.awt.Paint paint13 = jFreeChart12.getBackgroundPaint();
        java.awt.Stroke stroke14 = jFreeChart12.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle15 = jFreeChart12.getTitle();
        java.lang.Object obj16 = jFreeChart12.clone();
        java.awt.RenderingHints renderingHints17 = jFreeChart12.getRenderingHints();
        jFreeChart4.setRenderingHints(renderingHints17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot9", multiplePiePlot1.equals(multiplePiePlot9) ? multiplePiePlot1.hashCode() == multiplePiePlot9.hashCode() : true);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot1.getDataset();
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart7 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        float float10 = multiplePiePlot9.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot9.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart12 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot9);
        jFreeChart12.fireChartChanged();
        java.lang.Object obj14 = jFreeChart12.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo17 = null;
        java.awt.image.BufferedImage bufferedImage18 = jFreeChart12.createBufferedImage((int) '#', 1, chartRenderingInfo17);
        jFreeChart12.fireChartChanged();
        org.jfree.chart.plot.Plot plot20 = jFreeChart12.getPlot();
        java.awt.Paint paint21 = jFreeChart12.getBackgroundPaint();
        jFreeChart7.setBorderPaint(paint21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj2 and multiplePiePlot9", obj2.equals(multiplePiePlot9) ? obj2.hashCode() == multiplePiePlot9.hashCode() : true);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
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
        jFreeChart15.fireChartChanged();
        java.lang.Object obj17 = jFreeChart15.clone();
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart15.setBackgroundPaint(paint18);
        org.jfree.chart.event.ChartProgressListener chartProgressListener20 = null;
        jFreeChart15.addProgressListener(chartProgressListener20);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo25 = null;
        java.awt.image.BufferedImage bufferedImage26 = jFreeChart15.createBufferedImage((int) '#', 1, (int) (byte) 10, chartRenderingInfo25);
        jFreeChart4.setBackgroundImage((java.awt.Image) bufferedImage26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot12", multiplePiePlot1.equals(multiplePiePlot12) ? multiplePiePlot1.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj20 = multiplePiePlot19.clone();
        multiplePiePlot19.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = null;
        multiplePiePlot19.setDrawingSupplier(drawingSupplier23);
        multiplePiePlot19.zoom(0.0d);
        org.jfree.chart.plot.Plot plot27 = multiplePiePlot19.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = multiplePiePlot19.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot8 and obj20", multiplePiePlot8.equals(obj20) ? multiplePiePlot8.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder1 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder3 = multiplePiePlot2.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot0.getLegendItems();
        multiplePiePlot0.setBackgroundAlpha(0.0f);
        java.lang.String str9 = multiplePiePlot0.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot11.notifyListeners(plotChangeEvent12);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        float float16 = multiplePiePlot15.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot15.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart18 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot15);
        java.awt.Paint paint19 = jFreeChart18.getBackgroundPaint();
        java.awt.Stroke stroke20 = jFreeChart18.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle21 = jFreeChart18.getTitle();
        java.awt.Image image22 = jFreeChart18.getBackgroundImage();
        java.awt.Paint paint23 = jFreeChart18.getBorderPaint();
        multiplePiePlot11.setAggregatedItemsPaint(paint23);
        multiplePiePlot0.setNoDataMessagePaint(paint23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot2 and multiplePiePlot15", multiplePiePlot2.equals(multiplePiePlot15) ? multiplePiePlot2.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart1 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = jFreeChart1.getPadding();
        jFreeChart1.removeLegend();
        jFreeChart1.setTitle("Multiple Pie Plot");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj7 = multiplePiePlot6.clone();
        multiplePiePlot6.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot6.setDrawingSupplier(drawingSupplier10);
        multiplePiePlot6.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart14 = multiplePiePlot6.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = jFreeChart14.getPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = jFreeChart14.getPadding();
        jFreeChart14.setAntiAlias(false);
        java.awt.Stroke stroke19 = jFreeChart14.getBorderStroke();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot20.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection22 = multiplePiePlot20.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        multiplePiePlot20.setDataset(categoryDataset23);
        multiplePiePlot20.zoom(0.0d);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot();
        float float29 = multiplePiePlot28.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot28.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart31 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot28);
        jFreeChart31.fireChartChanged();
        boolean boolean33 = jFreeChart31.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle35 = jFreeChart31.getLegend((int) (short) 0);
        boolean boolean36 = jFreeChart31.isNotify();
        float float37 = jFreeChart31.getBackgroundImageAlpha();
        int int38 = jFreeChart31.getSubtitleCount();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo41 = null;
        java.awt.image.BufferedImage bufferedImage42 = jFreeChart31.createBufferedImage((int) (short) 1, 1, chartRenderingInfo41);
        multiplePiePlot20.setBackgroundImage((java.awt.Image) bufferedImage42);
        jFreeChart14.setBackgroundImage((java.awt.Image) bufferedImage42);
        jFreeChart1.setBackgroundImage((java.awt.Image) bufferedImage42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot0 and multiplePiePlot28", multiplePiePlot0.equals(multiplePiePlot28) ? multiplePiePlot0.hashCode() == multiplePiePlot28.hashCode() : true);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot10.getDrawingSupplier();
        multiplePiePlot0.setDrawingSupplier(drawingSupplier11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot10", obj1.equals(multiplePiePlot10) ? obj1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot0.markerChanged(markerChangeEvent3);
        java.awt.Stroke stroke5 = multiplePiePlot0.getOutlineStroke();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj7 = multiplePiePlot6.clone();
        multiplePiePlot6.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint10 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot6.setNoDataMessagePaint(paint10);
        float float12 = multiplePiePlot6.getBackgroundAlpha();
        multiplePiePlot6.setForegroundAlpha((float) 10L);
        java.awt.Paint paint15 = multiplePiePlot6.getNoDataMessagePaint();
        boolean boolean16 = multiplePiePlot0.equals((java.lang.Object) paint15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot0 and obj7", multiplePiePlot0.equals(obj7) ? multiplePiePlot0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.awt.Paint paint3 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent4);
        java.lang.Object obj6 = multiplePiePlot0.clone();
        java.awt.Paint paint7 = multiplePiePlot0.getOutlinePaint();
        boolean boolean8 = multiplePiePlot0.isSubplot();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = multiplePiePlot9.getDrawingSupplier();
        java.awt.Paint paint11 = multiplePiePlot9.getBackgroundPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj13 = multiplePiePlot12.clone();
        multiplePiePlot12.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier16);
        multiplePiePlot12.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot12.getPieChart();
        org.jfree.chart.title.Title title22 = jFreeChart20.getSubtitle((int) (byte) 0);
        multiplePiePlot9.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart20);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        multiplePiePlot9.handleClick((int) '4', 0, plotRenderingInfo26);
        boolean boolean28 = multiplePiePlot9.isSubplot();
        java.awt.Stroke stroke29 = multiplePiePlot9.getOutlineStroke();
        multiplePiePlot0.setParent((org.jfree.chart.plot.Plot) multiplePiePlot9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier1 and drawingSupplier10", drawingSupplier1.equals(drawingSupplier10) ? drawingSupplier1.hashCode() == drawingSupplier10.hashCode() : true);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        java.awt.Paint paint7 = jFreeChart4.getBorderPaint();
        java.lang.Object obj8 = jFreeChart4.clone();
        java.lang.Object obj9 = jFreeChart4.clone();
        java.lang.Object obj10 = jFreeChart4.getTextAntiAlias();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and obj9", obj8.equals(obj9) ? obj8.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        float float16 = multiplePiePlot15.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot15.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart18 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot15);
        java.awt.Paint paint19 = jFreeChart18.getBackgroundPaint();
        java.awt.Stroke stroke20 = jFreeChart18.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle21 = jFreeChart18.getTitle();
        java.awt.Image image22 = jFreeChart18.getBackgroundImage();
        java.awt.Paint paint23 = jFreeChart18.getBorderPaint();
        multiplePiePlot0.setBackgroundPaint(paint23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot15", obj1.equals(multiplePiePlot15) ? obj1.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = multiplePiePlot0.getDrawingSupplier();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart9 and jFreeChart13", jFreeChart9.equals(jFreeChart13) ? jFreeChart9.hashCode() == jFreeChart13.hashCode() : true);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj15 = multiplePiePlot14.clone();
        multiplePiePlot14.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot14.setDrawingSupplier(drawingSupplier18);
        multiplePiePlot14.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot14.getPieChart();
        org.jfree.chart.title.Title title24 = jFreeChart22.getSubtitle((int) (byte) 0);
        org.jfree.chart.plot.Plot plot25 = jFreeChart22.getPlot();
        plot25.setBackgroundImageAlignment((int) (short) 100);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot();
        float float30 = multiplePiePlot29.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot31 = multiplePiePlot29.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart32 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot29);
        jFreeChart32.fireChartChanged();
        boolean boolean34 = jFreeChart32.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle36 = jFreeChart32.getLegend((int) (short) 0);
        plot25.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart32);
        jFreeChart32.setBorderVisible(true);
        jFreeChart32.setTextAntiAlias(false);
        java.util.List list42 = jFreeChart32.getSubtitles();
        jFreeChart4.setSubtitles(list42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot29", multiplePiePlot1.equals(multiplePiePlot29) ? multiplePiePlot1.hashCode() == multiplePiePlot29.hashCode() : true);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj19 = multiplePiePlot18.clone();
        multiplePiePlot18.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = null;
        multiplePiePlot18.setDrawingSupplier(drawingSupplier22);
        multiplePiePlot18.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart26 = multiplePiePlot18.getPieChart();
        org.jfree.chart.title.Title title28 = jFreeChart26.getSubtitle((int) (byte) 0);
        org.jfree.chart.plot.Plot plot29 = jFreeChart26.getPlot();
        plot29.setBackgroundImageAlignment((int) (short) 100);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot();
        float float34 = multiplePiePlot33.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot35 = multiplePiePlot33.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart36 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot33);
        jFreeChart36.fireChartChanged();
        boolean boolean38 = jFreeChart36.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle40 = jFreeChart36.getLegend((int) (short) 0);
        plot29.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart36);
        jFreeChart36.setBorderVisible(true);
        jFreeChart36.setTextAntiAlias(false);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and multiplePiePlot33", obj5.equals(multiplePiePlot33) ? obj5.hashCode() == multiplePiePlot33.hashCode() : true);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot0.markerChanged(markerChangeEvent13);
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
        multiplePiePlot0.setBackgroundPaint(paint35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj25", obj1.equals(obj25) ? obj1.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        java.awt.Image image7 = jFreeChart4.getBackgroundImage();
        jFreeChart4.removeLegend();
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
        jFreeChart4.addSubtitle((org.jfree.chart.title.Title) legendTitle29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot21", multiplePiePlot1.equals(multiplePiePlot21) ? multiplePiePlot1.hashCode() == multiplePiePlot21.hashCode() : true);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj18 = multiplePiePlot17.clone();
        multiplePiePlot17.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = null;
        multiplePiePlot17.setDrawingSupplier(drawingSupplier21);
        multiplePiePlot17.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart25 = multiplePiePlot17.getPieChart();
        org.jfree.chart.title.Title title27 = jFreeChart25.getSubtitle((int) (byte) 0);
        jFreeChart4.removeSubtitle(title27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj18", multiplePiePlot1.equals(obj18) ? multiplePiePlot1.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        java.awt.Image image5 = null;
        multiplePiePlot0.setBackgroundImage(image5);
        multiplePiePlot0.setNoDataMessage("hi!");
        org.jfree.chart.util.TableOrder tableOrder9 = multiplePiePlot0.getDataExtractOrder();
        multiplePiePlot0.setForegroundAlpha((float) 'a');
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        jFreeChart16.fireChartChanged();
        boolean boolean18 = jFreeChart16.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle20 = jFreeChart16.getLegend((int) (short) 0);
        boolean boolean21 = jFreeChart16.isNotify();
        float float22 = jFreeChart16.getBackgroundImageAlpha();
        int int23 = jFreeChart16.getSubtitleCount();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo26 = null;
        java.awt.image.BufferedImage bufferedImage27 = jFreeChart16.createBufferedImage((int) (short) 1, 1, chartRenderingInfo26);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = jFreeChart16.getPadding();
        multiplePiePlot0.setInsets(rectangleInsets28, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot13", obj1.equals(multiplePiePlot13) ? obj1.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        java.awt.Paint paint16 = multiplePiePlot14.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot14.setInsets(rectangleInsets17, false);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj21 = multiplePiePlot20.clone();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        multiplePiePlot20.setDataset(categoryDataset22);
        java.awt.Font font24 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot20.setNoDataMessageFont(font24);
        java.lang.String str26 = multiplePiePlot20.getPlotType();
        boolean boolean27 = multiplePiePlot20.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot20.setInsets(rectangleInsets28, false);
        multiplePiePlot14.setInsets(rectangleInsets28, false);
        jFreeChart13.setPadding(rectangleInsets28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot4", multiplePiePlot1.equals(multiplePiePlot4) ? multiplePiePlot1.hashCode() == multiplePiePlot4.hashCode() : true);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getRootPlot();
        java.awt.Paint paint3 = plot2.getBackgroundPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj5 = multiplePiePlot4.clone();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot4.setDataset(categoryDataset6);
        java.awt.Font font8 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot4.setNoDataMessageFont(font8);
        java.lang.String str10 = multiplePiePlot4.getPlotType();
        boolean boolean11 = multiplePiePlot4.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot4.setInsets(rectangleInsets12, false);
        java.awt.Font font15 = multiplePiePlot4.getNoDataMessageFont();
        plot2.setNoDataMessageFont(font15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on plot2 and multiplePiePlot4", plot2.equals(multiplePiePlot4) ? plot2.hashCode() == multiplePiePlot4.hashCode() : true);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot14.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot14.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        multiplePiePlot14.setDataset(categoryDataset17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot20.getParent();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot();
        float float24 = multiplePiePlot23.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot25 = multiplePiePlot23.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart26 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot23);
        jFreeChart26.fireChartChanged();
        boolean boolean28 = jFreeChart26.getAntiAlias();
        java.awt.Paint paint29 = jFreeChart26.getBorderPaint();
        multiplePiePlot20.setAggregatedItemsPaint(paint29);
        multiplePiePlot14.setNoDataMessagePaint(paint29);
        org.jfree.chart.JFreeChart jFreeChart32 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = multiplePiePlot14.getInsets();
        multiplePiePlot0.setInsets(rectangleInsets33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot3 and multiplePiePlot14", multiplePiePlot3.equals(multiplePiePlot14) ? multiplePiePlot3.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        float float17 = multiplePiePlot16.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot16.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot16);
        jFreeChart19.fireChartChanged();
        java.lang.Object obj21 = jFreeChart19.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo24 = null;
        java.awt.image.BufferedImage bufferedImage25 = jFreeChart19.createBufferedImage((int) '#', 1, chartRenderingInfo24);
        jFreeChart19.removeLegend();
        org.jfree.chart.title.TextTitle textTitle27 = jFreeChart19.getTitle();
        jFreeChart9.setTitle(textTitle27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot16", obj1.equals(multiplePiePlot16) ? obj1.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj19 = multiplePiePlot18.clone();
        multiplePiePlot18.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = null;
        multiplePiePlot18.setDrawingSupplier(drawingSupplier22);
        multiplePiePlot18.zoom(0.0d);
        org.jfree.chart.plot.Plot plot26 = multiplePiePlot18.getRootPlot();
        plot26.setBackgroundImageAlignment((int) (byte) 100);
        org.jfree.chart.JFreeChart jFreeChart29 = new org.jfree.chart.JFreeChart(plot26);
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        plot26.drawBackgroundImage(graphics2D30, rectangle2D31);
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = plot26.getInsets();
        jFreeChart4.setPadding(rectangleInsets33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj19", multiplePiePlot1.equals(obj19) ? multiplePiePlot1.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot0.getParent();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset14 = multiplePiePlot10.getDataset();
        java.awt.Image image15 = null;
        multiplePiePlot10.setBackgroundImage(image15);
        java.awt.Paint paint17 = multiplePiePlot10.getNoDataMessagePaint();
        multiplePiePlot0.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj11", obj1.equals(obj11) ? obj1.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.zoom(0.0d);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot0.getRootPlot();
        float float9 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot10.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot10.setInsets(rectangleInsets13);
        multiplePiePlot0.setInsets(rectangleInsets13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot10", obj1.equals(multiplePiePlot10) ? obj1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier17);
        multiplePiePlot13.setForegroundAlpha(0.0f);
        multiplePiePlot13.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        int int23 = multiplePiePlot13.getBackgroundImageAlignment();
        java.awt.Paint paint24 = multiplePiePlot13.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart25 = multiplePiePlot13.getPieChart();
        java.awt.Paint paint26 = jFreeChart25.getBorderPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot();
        float float29 = multiplePiePlot28.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot28.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart31 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot28);
        int int32 = jFreeChart31.getBackgroundImageAlignment();
        float float33 = jFreeChart31.getBackgroundImageAlpha();
        org.jfree.chart.title.TextTitle textTitle34 = jFreeChart31.getTitle();
        jFreeChart25.setTitle(textTitle34);
        jFreeChart4.removeSubtitle((org.jfree.chart.title.Title) textTitle34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot28", multiplePiePlot1.equals(multiplePiePlot28) ? multiplePiePlot1.hashCode() == multiplePiePlot28.hashCode() : true);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj22 = multiplePiePlot21.clone();
        multiplePiePlot21.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = null;
        multiplePiePlot21.setDrawingSupplier(drawingSupplier25);
        multiplePiePlot21.zoom(0.0d);
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        multiplePiePlot21.drawBackgroundImage(graphics2D29, rectangle2D30);
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        multiplePiePlot21.setDataset(categoryDataset32);
        java.awt.Paint paint34 = multiplePiePlot21.getBackgroundPaint();
        multiplePiePlot0.setAggregatedItemsPaint(paint34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj22", obj5.equals(obj22) ? obj5.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
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
        org.jfree.chart.util.TableOrder tableOrder26 = multiplePiePlot0.getDataExtractOrder();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj25", obj7.equals(obj25) ? obj7.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
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
        java.awt.Font font29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj31 = multiplePiePlot30.clone();
        multiplePiePlot30.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier34 = null;
        multiplePiePlot30.setDrawingSupplier(drawingSupplier34);
        multiplePiePlot30.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart38 = multiplePiePlot30.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart39 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot30);
        org.jfree.chart.JFreeChart jFreeChart41 = new org.jfree.chart.JFreeChart("", font29, (org.jfree.chart.plot.Plot) multiplePiePlot30, false);
        java.awt.Paint paint42 = jFreeChart41.getBorderPaint();
        org.jfree.chart.event.ChartProgressListener chartProgressListener43 = null;
        jFreeChart41.removeProgressListener(chartProgressListener43);
        java.util.List list45 = jFreeChart41.getSubtitles();
        jFreeChart23.setSubtitles(list45);
        jFreeChart23.setBackgroundImageAlignment((int) (byte) -1);
        jFreeChart23.setTitle("Other");
        jFreeChart23.setBorderVisible(true);
        jFreeChart23.setTitle("");
        boolean boolean55 = jFreeChart4.equals((java.lang.Object) "");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj31", multiplePiePlot1.equals(obj31) ? multiplePiePlot1.hashCode() == obj31.hashCode() : true);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
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
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo33 = null;
        java.awt.image.BufferedImage bufferedImage34 = jFreeChart20.createBufferedImage((int) ' ', 100, (double) 10L, 0.0d, chartRenderingInfo33);
        jFreeChart20.setBorderVisible(false);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo41 = null;
        java.awt.image.BufferedImage bufferedImage42 = jFreeChart20.createBufferedImage((int) (short) 10, (int) (byte) 10, 0.0d, (double) (byte) 10, chartRenderingInfo41);
        boolean boolean43 = jFreeChart20.getAntiAlias();
        java.awt.Paint paint44 = jFreeChart20.getBorderPaint();
        jFreeChart4.setBackgroundPaint(paint44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot17", multiplePiePlot1.equals(multiplePiePlot17) ? multiplePiePlot1.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getParent();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot3.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = multiplePiePlot3.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot3.setDataset(categoryDataset6);
        multiplePiePlot3.setLimit((double) 0);
        java.awt.Paint paint10 = multiplePiePlot3.getAggregatedItemsPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent11 = null;
        multiplePiePlot3.datasetChanged(datasetChangeEvent11);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier17);
        multiplePiePlot13.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot13.getPieChart();
        org.jfree.chart.title.Title title23 = jFreeChart21.getSubtitle((int) (byte) 0);
        jFreeChart21.removeLegend();
        org.jfree.chart.title.LegendTitle legendTitle25 = jFreeChart21.getLegend();
        multiplePiePlot3.setPieChart(jFreeChart21);
        org.jfree.chart.JFreeChart jFreeChart27 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot3);
        java.awt.Paint paint28 = multiplePiePlot3.getNoDataMessagePaint();
        multiplePiePlot0.setNoDataMessagePaint(paint28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot3 and obj14", multiplePiePlot3.equals(obj14) ? multiplePiePlot3.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder1 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder3 = multiplePiePlot2.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot0.getInsets();
        boolean boolean8 = multiplePiePlot0.isSubplot();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        float float10 = multiplePiePlot9.getBackgroundAlpha();
        float float11 = multiplePiePlot9.getBackgroundAlpha();
        java.awt.Stroke stroke12 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot9.setOutlineStroke(stroke12);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent14);
        java.awt.Paint paint16 = multiplePiePlot9.getOutlinePaint();
        multiplePiePlot0.setNoDataMessagePaint(paint16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot2 and multiplePiePlot9", multiplePiePlot2.equals(multiplePiePlot9) ? multiplePiePlot2.hashCode() == multiplePiePlot9.hashCode() : true);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
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
        java.lang.Object obj29 = jFreeChart27.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo32 = null;
        java.awt.image.BufferedImage bufferedImage33 = jFreeChart27.createBufferedImage((int) '#', 1, chartRenderingInfo32);
        org.jfree.chart.title.LegendTitle legendTitle34 = jFreeChart27.getLegend();
        java.awt.RenderingHints renderingHints35 = jFreeChart27.getRenderingHints();
        jFreeChart8.setRenderingHints(renderingHints35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot12 and multiplePiePlot24", multiplePiePlot12.equals(multiplePiePlot24) ? multiplePiePlot12.hashCode() == multiplePiePlot24.hashCode() : true);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        float float15 = multiplePiePlot14.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot14.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot14);
        java.awt.Paint paint18 = jFreeChart17.getBackgroundPaint();
        java.awt.Stroke stroke19 = jFreeChart17.getBorderStroke();
        boolean boolean20 = jFreeChart17.isBorderVisible();
        org.jfree.chart.event.ChartProgressListener chartProgressListener21 = null;
        jFreeChart17.addProgressListener(chartProgressListener21);
        jFreeChart17.setAntiAlias(true);
        org.jfree.chart.title.LegendTitle legendTitle25 = jFreeChart17.getLegend();
        jFreeChart4.addSubtitle((org.jfree.chart.title.Title) legendTitle25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot14", multiplePiePlot1.equals(multiplePiePlot14) ? multiplePiePlot1.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        float float16 = multiplePiePlot15.getBackgroundAlpha();
        float float17 = multiplePiePlot15.getBackgroundAlpha();
        java.awt.Stroke stroke18 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot15.setOutlineStroke(stroke18);
        plot14.setOutlineStroke(stroke18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on plot14 and multiplePiePlot15", plot14.equals(multiplePiePlot15) ? plot14.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.lang.String str6 = multiplePiePlot0.getNoDataMessage();
        boolean boolean7 = multiplePiePlot0.isOutlineVisible();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj9 = multiplePiePlot8.clone();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        multiplePiePlot8.setDataset(categoryDataset10);
        java.awt.Font font12 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot8.setNoDataMessageFont(font12);
        java.lang.String str14 = multiplePiePlot8.getPlotType();
        boolean boolean15 = multiplePiePlot8.isSubplot();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot8.setInsets(rectangleInsets16, false);
        multiplePiePlot0.setInsets(rectangleInsets16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj9", obj1.equals(obj9) ? obj1.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        multiplePiePlot0.setBackgroundImageAlignment(15);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent10);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = multiplePiePlot12.getDrawingSupplier();
        multiplePiePlot0.setDrawingSupplier(drawingSupplier13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot12", obj1.equals(multiplePiePlot12) ? obj1.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        org.jfree.chart.event.ChartProgressListener chartProgressListener8 = null;
        jFreeChart4.addProgressListener(chartProgressListener8);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        float float12 = multiplePiePlot11.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot11.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot11);
        jFreeChart14.fireChartChanged();
        java.lang.Object obj16 = jFreeChart14.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo19 = null;
        java.awt.image.BufferedImage bufferedImage20 = jFreeChart14.createBufferedImage((int) '#', 1, chartRenderingInfo19);
        org.jfree.chart.title.LegendTitle legendTitle21 = jFreeChart14.getLegend();
        java.awt.RenderingHints renderingHints22 = jFreeChart14.getRenderingHints();
        jFreeChart4.setRenderingHints(renderingHints22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot11", multiplePiePlot1.equals(multiplePiePlot11) ? multiplePiePlot1.hashCode() == multiplePiePlot11.hashCode() : true);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj18 = multiplePiePlot17.clone();
        multiplePiePlot17.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = null;
        multiplePiePlot17.setDrawingSupplier(drawingSupplier21);
        multiplePiePlot17.setForegroundAlpha(0.0f);
        multiplePiePlot17.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot17.zoom((double) (byte) 0);
        boolean boolean29 = multiplePiePlot17.isSubplot();
        java.awt.Stroke stroke30 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot17.setOutlineStroke(stroke30);
        jFreeChart4.setBorderStroke(stroke30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj18", multiplePiePlot1.equals(obj18) ? multiplePiePlot1.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj36 = multiplePiePlot35.clone();
        multiplePiePlot35.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier39 = null;
        multiplePiePlot35.setDrawingSupplier(drawingSupplier39);
        multiplePiePlot35.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart43 = multiplePiePlot35.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart44 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot35);
        java.awt.Paint paint45 = jFreeChart44.getBackgroundPaint();
        jFreeChart8.setBackgroundPaint(paint45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot22 and obj36", multiplePiePlot22.equals(obj36) ? multiplePiePlot22.hashCode() == obj36.hashCode() : true);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Image image6 = multiplePiePlot0.getBackgroundImage();
        boolean boolean8 = multiplePiePlot0.equals((java.lang.Object) 1.0f);
        java.awt.Stroke stroke9 = multiplePiePlot0.getOutlineStroke();
        java.awt.Paint paint10 = multiplePiePlot0.getBackgroundPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot11.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = multiplePiePlot11.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot11.setDataset(categoryDataset14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = multiplePiePlot11.getDataset();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj18 = multiplePiePlot17.clone();
        multiplePiePlot17.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = null;
        multiplePiePlot17.setDrawingSupplier(drawingSupplier21);
        java.awt.Image image23 = multiplePiePlot17.getBackgroundImage();
        boolean boolean25 = multiplePiePlot17.equals((java.lang.Object) 1.0f);
        org.jfree.chart.JFreeChart jFreeChart26 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot17);
        multiplePiePlot11.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart26);
        java.awt.Paint paint28 = multiplePiePlot11.getAggregatedItemsPaint();
        multiplePiePlot0.setParent((org.jfree.chart.plot.Plot) multiplePiePlot11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj18", obj1.equals(obj18) ? obj1.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        float float17 = multiplePiePlot16.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot16.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot16);
        jFreeChart19.fireChartChanged();
        java.lang.Object obj21 = jFreeChart19.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo24 = null;
        java.awt.image.BufferedImage bufferedImage25 = jFreeChart19.createBufferedImage((int) '#', 1, chartRenderingInfo24);
        org.jfree.chart.title.LegendTitle legendTitle26 = jFreeChart19.getLegend();
        jFreeChart8.addLegend(legendTitle26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart19 and obj21", jFreeChart19.equals(obj21) ? jFreeChart19.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        jFreeChart4.setTitle("hi!");
        jFreeChart4.setTitle("Multiple Pie Plot");
        org.jfree.chart.title.LegendTitle legendTitle11 = jFreeChart4.getLegend();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj13 = multiplePiePlot12.clone();
        multiplePiePlot12.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier18);
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot12.getPieChart();
        jFreeChart20.setNotify(false);
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
        jFreeChart20.removeSubtitle((org.jfree.chart.title.Title) legendTitle41);
        java.awt.RenderingHints renderingHints44 = jFreeChart20.getRenderingHints();
        org.jfree.chart.title.LegendTitle legendTitle46 = jFreeChart20.getLegend(10);
        java.lang.Object obj47 = jFreeChart20.clone();
        boolean boolean48 = jFreeChart4.equals((java.lang.Object) jFreeChart20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot34", multiplePiePlot1.equals(multiplePiePlot34) ? multiplePiePlot1.hashCode() == multiplePiePlot34.hashCode() : true);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = multiplePiePlot18.getDrawingSupplier();
        java.awt.Paint paint20 = multiplePiePlot18.getBackgroundPaint();
        java.lang.Comparable comparable21 = multiplePiePlot18.getAggregatedItemsKey();
        org.jfree.chart.plot.Plot plot22 = multiplePiePlot18.getParent();
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot18.getPieChart();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo26 = null;
        java.awt.image.BufferedImage bufferedImage27 = jFreeChart23.createBufferedImage((int) (byte) 10, (int) (byte) 100, chartRenderingInfo26);
        multiplePiePlot0.setBackgroundImage((java.awt.Image) bufferedImage27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot18", obj1.equals(multiplePiePlot18) ? obj1.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.title.LegendTitle legendTitle5 = jFreeChart4.getLegend();
        org.jfree.chart.title.LegendTitle legendTitle6 = jFreeChart4.getLegend();
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
        org.jfree.chart.title.Title title22 = jFreeChart11.getSubtitle((int) (short) 0);
        jFreeChart4.addSubtitle(title22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot8", multiplePiePlot1.equals(multiplePiePlot8) ? multiplePiePlot1.hashCode() == multiplePiePlot8.hashCode() : true);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
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
        java.awt.Font font16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj18 = multiplePiePlot17.clone();
        multiplePiePlot17.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = null;
        multiplePiePlot17.setDrawingSupplier(drawingSupplier21);
        multiplePiePlot17.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart25 = multiplePiePlot17.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart26 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot17);
        org.jfree.chart.JFreeChart jFreeChart28 = new org.jfree.chart.JFreeChart("", font16, (org.jfree.chart.plot.Plot) multiplePiePlot17, false);
        boolean boolean29 = jFreeChart28.isBorderVisible();
        jFreeChart28.setBorderVisible(false);
        jFreeChart28.setBackgroundImageAlignment((-1));
        jFreeChart28.removeLegend();
        java.awt.RenderingHints renderingHints35 = jFreeChart28.getRenderingHints();
        jFreeChart4.setRenderingHints(renderingHints35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj18", multiplePiePlot1.equals(obj18) ? multiplePiePlot1.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
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
        multiplePiePlot9.setLimit((double) 100L);
        multiplePiePlot9.setBackgroundImageAlignment(15);
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot9);
        java.awt.Paint paint20 = multiplePiePlot9.getBackgroundPaint();
        jFreeChart8.setBorderPaint(paint20);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj24 = multiplePiePlot23.clone();
        multiplePiePlot23.setBackgroundAlpha((float) (short) -1);
        java.awt.Font font27 = multiplePiePlot23.getNoDataMessageFont();
        org.jfree.chart.JFreeChart jFreeChart28 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot23);
        java.awt.Paint paint29 = multiplePiePlot23.getOutlinePaint();
        jFreeChart8.setBorderPaint(paint29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj10 and obj24", obj10.equals(obj24) ? obj10.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = multiplePiePlot19.getDrawingSupplier();
        java.awt.Paint paint21 = multiplePiePlot19.getBackgroundPaint();
        java.lang.Comparable comparable22 = multiplePiePlot19.getAggregatedItemsKey();
        org.jfree.chart.plot.Plot plot23 = multiplePiePlot19.getParent();
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot19.getPieChart();
        java.awt.Paint paint25 = multiplePiePlot19.getBackgroundPaint();
        multiplePiePlot0.setOutlinePaint(paint25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj8 and multiplePiePlot19", obj8.equals(multiplePiePlot19) ? obj8.hashCode() == multiplePiePlot19.hashCode() : true);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj19 = multiplePiePlot18.clone();
        multiplePiePlot18.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset22 = multiplePiePlot18.getDataset();
        java.awt.Image image23 = null;
        multiplePiePlot18.setBackgroundImage(image23);
        multiplePiePlot18.setNoDataMessage("hi!");
        multiplePiePlot18.setForegroundAlpha((float) ' ');
        java.awt.Stroke stroke29 = multiplePiePlot18.getOutlineStroke();
        jFreeChart13.setBorderStroke(stroke29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj19", obj3.equals(obj19) ? obj3.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
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
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot17.getParent();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot();
        float float20 = multiplePiePlot19.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot19.getRootPlot();
        multiplePiePlot19.setBackgroundImageAlignment(0);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent24 = null;
        multiplePiePlot19.axisChanged(axisChangeEvent24);
        java.lang.String str26 = multiplePiePlot19.getPlotType();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj28 = multiplePiePlot27.clone();
        multiplePiePlot27.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset31 = multiplePiePlot27.getDataset();
        java.awt.Image image32 = null;
        multiplePiePlot27.setBackgroundImage(image32);
        java.awt.Paint paint34 = multiplePiePlot27.getNoDataMessagePaint();
        multiplePiePlot19.setAggregatedItemsPaint(paint34);
        multiplePiePlot17.setAggregatedItemsPaint(paint34);
        jFreeChart4.setBackgroundPaint(paint34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj28", multiplePiePlot1.equals(obj28) ? multiplePiePlot1.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
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
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        multiplePiePlot0.setDataset(categoryDataset20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot0", obj3.equals(multiplePiePlot0) ? obj3.hashCode() == multiplePiePlot0.hashCode() : true);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot();
        float float23 = multiplePiePlot22.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot22.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart25 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot22);
        jFreeChart25.fireChartChanged();
        java.lang.Object obj27 = jFreeChart25.clone();
        jFreeChart25.setTextAntiAlias(false);
        java.awt.Stroke stroke30 = jFreeChart25.getBorderStroke();
        jFreeChart4.setBorderStroke(stroke30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot22", multiplePiePlot1.equals(multiplePiePlot22) ? multiplePiePlot1.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot();
        float float34 = multiplePiePlot33.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot35 = multiplePiePlot33.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart36 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot33);
        org.jfree.chart.title.LegendTitle legendTitle37 = jFreeChart36.getLegend();
        org.jfree.chart.title.LegendTitle legendTitle38 = jFreeChart36.getLegend();
        jFreeChart8.addLegend(legendTitle38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj17 and multiplePiePlot33", obj17.equals(multiplePiePlot33) ? obj17.hashCode() == multiplePiePlot33.hashCode() : true);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot();
        float float31 = multiplePiePlot30.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot32 = multiplePiePlot30.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart33 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot30);
        jFreeChart33.fireChartChanged();
        java.lang.Object obj35 = jFreeChart33.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = jFreeChart33.getPadding();
        plot28.setInsets(rectangleInsets36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart33 and obj35", jFreeChart33.equals(obj35) ? jFreeChart33.hashCode() == obj35.hashCode() : true);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj2 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        java.lang.String str9 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.JFreeChart jFreeChart10 = new org.jfree.chart.JFreeChart("", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        org.jfree.chart.plot.Plot plot11 = jFreeChart10.getPlot();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj13 = multiplePiePlot12.clone();
        multiplePiePlot12.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier16);
        multiplePiePlot12.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot12.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = jFreeChart20.getPadding();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot();
        float float24 = multiplePiePlot23.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot25 = multiplePiePlot23.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart26 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot23);
        jFreeChart26.fireChartChanged();
        java.lang.Object obj28 = jFreeChart26.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo31 = null;
        java.awt.image.BufferedImage bufferedImage32 = jFreeChart26.createBufferedImage((int) '#', 1, chartRenderingInfo31);
        boolean boolean33 = jFreeChart26.isNotify();
        java.awt.Paint paint34 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart26.setBorderPaint(paint34);
        jFreeChart20.setBorderPaint(paint34);
        plot11.setNoDataMessagePaint(paint34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj2 and multiplePiePlot23", obj2.equals(multiplePiePlot23) ? obj2.hashCode() == multiplePiePlot23.hashCode() : true);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        java.awt.Paint paint17 = jFreeChart16.getBackgroundPaint();
        java.awt.Stroke stroke18 = jFreeChart16.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle19 = jFreeChart16.getTitle();
        java.awt.Image image20 = jFreeChart16.getBackgroundImage();
        jFreeChart16.removeLegend();
        org.jfree.chart.event.ChartProgressListener chartProgressListener22 = null;
        jFreeChart16.removeProgressListener(chartProgressListener22);
        boolean boolean24 = jFreeChart16.isNotify();
        java.awt.Stroke stroke25 = jFreeChart16.getBorderStroke();
        jFreeChart4.setBorderStroke(stroke25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot13", multiplePiePlot1.equals(multiplePiePlot13) ? multiplePiePlot1.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
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
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        multiplePiePlot17.setBackgroundAlpha((float) 1L);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot20.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder22 = multiplePiePlot20.getDataExtractOrder();
        multiplePiePlot17.setDataExtractOrder(tableOrder22);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = multiplePiePlot17.getInsets();
        jFreeChart4.setPadding(rectangleInsets24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot17", multiplePiePlot1.equals(multiplePiePlot17) ? multiplePiePlot1.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
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
        java.awt.Paint paint18 = jFreeChart17.getBackgroundPaint();
        java.awt.Stroke stroke19 = jFreeChart17.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle20 = jFreeChart17.getTitle();
        java.lang.Object obj21 = jFreeChart17.clone();
        java.awt.Stroke stroke22 = jFreeChart17.getBorderStroke();
        java.awt.Stroke stroke23 = jFreeChart17.getBorderStroke();
        boolean boolean24 = jFreeChart17.getAntiAlias();
        int int25 = jFreeChart17.getBackgroundImageAlignment();
        java.lang.Object obj26 = jFreeChart17.getTextAntiAlias();
        java.awt.Paint paint27 = jFreeChart17.getBorderPaint();
        multiplePiePlot0.setAggregatedItemsPaint(paint27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot14", obj1.equals(multiplePiePlot14) ? obj1.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        float float16 = multiplePiePlot15.getBackgroundAlpha();
        java.awt.Paint paint17 = multiplePiePlot15.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = multiplePiePlot15.getInsets();
        org.jfree.chart.util.TableOrder tableOrder19 = multiplePiePlot15.getDataExtractOrder();
        multiplePiePlot1.setDataExtractOrder(tableOrder19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot15", multiplePiePlot5.equals(multiplePiePlot15) ? multiplePiePlot5.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj20 = multiplePiePlot19.clone();
        multiplePiePlot19.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = null;
        multiplePiePlot19.setDrawingSupplier(drawingSupplier23);
        multiplePiePlot19.setLimit((double) 100L);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent27 = null;
        multiplePiePlot19.notifyListeners(plotChangeEvent27);
        java.awt.Image image29 = multiplePiePlot19.getBackgroundImage();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = multiplePiePlot19.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj2 and obj20", obj2.equals(obj20) ? obj2.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        java.awt.Paint paint2 = multiplePiePlot0.getNoDataMessagePaint();
        multiplePiePlot0.setForegroundAlpha((float) (-1));
        java.lang.String str5 = multiplePiePlot0.getNoDataMessage();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder7 = multiplePiePlot6.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder9 = multiplePiePlot8.getDataExtractOrder();
        multiplePiePlot6.setDataExtractOrder(tableOrder9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = multiplePiePlot6.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection12 = multiplePiePlot6.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = multiplePiePlot6.getInsets();
        multiplePiePlot0.setInsets(rectangleInsets13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot6 and multiplePiePlot8", multiplePiePlot6.equals(multiplePiePlot8) ? multiplePiePlot6.hashCode() == multiplePiePlot8.hashCode() : true);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj13 = multiplePiePlot12.clone();
        multiplePiePlot12.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier16);
        multiplePiePlot12.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot12.getPieChart();
        org.jfree.chart.title.Title title22 = jFreeChart20.getSubtitle((int) (byte) 0);
        java.lang.Object obj23 = jFreeChart20.clone();
        boolean boolean24 = jFreeChart20.isNotify();
        org.jfree.chart.title.LegendTitle legendTitle26 = jFreeChart20.getLegend((int) (byte) 0);
        jFreeChart4.addLegend(legendTitle26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj13", multiplePiePlot1.equals(obj13) ? multiplePiePlot1.hashCode() == obj13.hashCode() : true);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
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
        jFreeChart19.setBackgroundImageAlignment(100);
        java.awt.Stroke stroke29 = jFreeChart19.getBorderStroke();
        boolean boolean30 = jFreeChart4.equals((java.lang.Object) jFreeChart19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot16", multiplePiePlot1.equals(multiplePiePlot16) ? multiplePiePlot1.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        multiplePiePlot0.zoom((double) ' ');
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        float float9 = multiplePiePlot8.getBackgroundAlpha();
        java.awt.Paint paint10 = multiplePiePlot8.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot8);
        float float12 = multiplePiePlot8.getForegroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot13.setNoDataMessagePaint(paint17);
        java.awt.Font font19 = multiplePiePlot13.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = multiplePiePlot13.getDrawingSupplier();
        multiplePiePlot8.setDrawingSupplier(drawingSupplier20);
        multiplePiePlot0.setDrawingSupplier(drawingSupplier20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot8", obj1.equals(multiplePiePlot8) ? obj1.hashCode() == multiplePiePlot8.hashCode() : true);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot33 = multiplePiePlot32.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection34 = multiplePiePlot32.getLegendItems();
        java.lang.Comparable comparable35 = multiplePiePlot32.getAggregatedItemsKey();
        org.jfree.chart.plot.Plot plot36 = multiplePiePlot32.getRootPlot();
        java.awt.Font font37 = plot36.getNoDataMessageFont();
        multiplePiePlot0.setNoDataMessageFont(font37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection2 and legendItemCollection34", legendItemCollection2.equals(legendItemCollection34) ? legendItemCollection2.hashCode() == legendItemCollection34.hashCode() : true);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart1 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = jFreeChart1.getPadding();
        java.util.List list3 = jFreeChart1.getSubtitles();
        org.jfree.chart.plot.Plot plot4 = jFreeChart1.getPlot();
        org.jfree.chart.JFreeChart jFreeChart5 = new org.jfree.chart.JFreeChart(plot4);
        java.awt.Font font7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj9 = multiplePiePlot8.clone();
        multiplePiePlot8.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier12);
        multiplePiePlot8.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart16 = multiplePiePlot8.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot8);
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart("", font7, (org.jfree.chart.plot.Plot) multiplePiePlot8, false);
        java.awt.Paint paint20 = jFreeChart19.getBorderPaint();
        org.jfree.chart.event.ChartProgressListener chartProgressListener21 = null;
        jFreeChart19.removeProgressListener(chartProgressListener21);
        int int23 = jFreeChart19.getSubtitleCount();
        org.jfree.chart.event.ChartProgressListener chartProgressListener24 = null;
        jFreeChart19.addProgressListener(chartProgressListener24);
        float float26 = jFreeChart19.getBackgroundImageAlpha();
        java.awt.RenderingHints renderingHints27 = jFreeChart19.getRenderingHints();
        jFreeChart5.setRenderingHints(renderingHints27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot0 and obj9", multiplePiePlot0.equals(obj9) ? multiplePiePlot0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        float float11 = multiplePiePlot10.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot10.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart13 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot10);
        jFreeChart13.fireChartChanged();
        java.lang.Object obj15 = jFreeChart13.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo18 = null;
        java.awt.image.BufferedImage bufferedImage19 = jFreeChart13.createBufferedImage((int) '#', 1, chartRenderingInfo18);
        jFreeChart13.removeLegend();
        org.jfree.chart.title.TextTitle textTitle21 = jFreeChart13.getTitle();
        jFreeChart8.setTitle(textTitle21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart13 and obj15", jFreeChart13.equals(obj15) ? jFreeChart13.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj23 = multiplePiePlot22.clone();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        multiplePiePlot22.setDataset(categoryDataset24);
        java.awt.Font font26 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot22.setNoDataMessageFont(font26);
        java.lang.String str28 = multiplePiePlot22.getPlotType();
        boolean boolean29 = multiplePiePlot22.isSubplot();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent30 = null;
        multiplePiePlot22.datasetChanged(datasetChangeEvent30);
        java.awt.Paint paint32 = multiplePiePlot22.getNoDataMessagePaint();
        jFreeChart14.setBorderPaint(paint32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj2 and obj23", obj2.equals(obj23) ? obj2.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
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
        multiplePiePlot2.setForegroundAlpha((float) (byte) 0);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj19 = multiplePiePlot18.clone();
        multiplePiePlot18.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = null;
        multiplePiePlot18.setDrawingSupplier(drawingSupplier22);
        multiplePiePlot18.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart26 = multiplePiePlot18.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart27 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot18);
        float float28 = jFreeChart27.getBackgroundImageAlpha();
        java.awt.Paint paint29 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        jFreeChart27.setBorderPaint(paint29);
        jFreeChart27.setNotify(false);
        org.jfree.chart.event.ChartProgressListener chartProgressListener33 = null;
        jFreeChart27.removeProgressListener(chartProgressListener33);
        java.awt.Stroke stroke35 = jFreeChart27.getBorderStroke();
        org.jfree.chart.plot.Plot plot36 = jFreeChart27.getPlot();
        multiplePiePlot2.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj19", obj3.equals(obj19) ? obj3.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.JFreeChart jFreeChart3 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.lang.Object obj4 = jFreeChart3.getTextAntiAlias();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        float float7 = multiplePiePlot6.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot6.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart9 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot6);
        java.awt.Paint paint10 = jFreeChart9.getBackgroundPaint();
        java.awt.Stroke stroke11 = jFreeChart9.getBorderStroke();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo14 = null;
        java.awt.image.BufferedImage bufferedImage15 = jFreeChart9.createBufferedImage(1, (int) '#', chartRenderingInfo14);
        jFreeChart3.setBackgroundImage((java.awt.Image) bufferedImage15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot6", multiplePiePlot1.equals(multiplePiePlot6) ? multiplePiePlot1.hashCode() == multiplePiePlot6.hashCode() : true);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
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
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        float float14 = multiplePiePlot12.getBackgroundAlpha();
        java.awt.Stroke stroke15 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot12.setOutlineStroke(stroke15);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj18 = multiplePiePlot17.clone();
        multiplePiePlot17.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = null;
        multiplePiePlot17.setDrawingSupplier(drawingSupplier21);
        java.awt.Paint paint23 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot17.setBackgroundPaint(paint23);
        multiplePiePlot12.setBackgroundPaint(paint23);
        jFreeChart11.setBorderPaint(paint23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj18", obj1.equals(obj18) ? obj1.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
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
        java.awt.Font font21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj23 = multiplePiePlot22.clone();
        multiplePiePlot22.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = null;
        multiplePiePlot22.setDrawingSupplier(drawingSupplier26);
        multiplePiePlot22.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart30 = multiplePiePlot22.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart31 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot22);
        org.jfree.chart.JFreeChart jFreeChart33 = new org.jfree.chart.JFreeChart("", font21, (org.jfree.chart.plot.Plot) multiplePiePlot22, false);
        java.lang.Comparable comparable34 = multiplePiePlot22.getAggregatedItemsKey();
        java.awt.Font font35 = multiplePiePlot22.getNoDataMessageFont();
        multiplePiePlot0.setNoDataMessageFont(font35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj23", obj1.equals(obj23) ? obj1.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        java.awt.Font font2 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot();
        float float5 = multiplePiePlot4.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot4.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart7 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot4);
        multiplePiePlot4.setForegroundAlpha((float) (byte) 0);
        java.awt.Paint paint10 = multiplePiePlot4.getOutlinePaint();
        org.jfree.chart.JFreeChart jFreeChart12 = new org.jfree.chart.JFreeChart("hi!", font2, (org.jfree.chart.plot.Plot) multiplePiePlot4, true);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = multiplePiePlot13.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder15 = multiplePiePlot13.getDataExtractOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot13.getLegendItems();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot13);
        org.jfree.chart.util.TableOrder tableOrder18 = multiplePiePlot13.getDataExtractOrder();
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart("", font2, (org.jfree.chart.plot.Plot) multiplePiePlot13, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart7 and jFreeChart12", jFreeChart7.equals(jFreeChart12) ? jFreeChart7.hashCode() == jFreeChart12.hashCode() : true);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        java.awt.Font font1 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot();
        float float4 = multiplePiePlot3.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot3.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart6 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot3);
        multiplePiePlot3.setForegroundAlpha((float) (byte) 0);
        java.awt.Paint paint9 = multiplePiePlot3.getOutlinePaint();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart("hi!", font1, (org.jfree.chart.plot.Plot) multiplePiePlot3, true);
        org.jfree.chart.LegendItemCollection legendItemCollection12 = multiplePiePlot3.getLegendItems();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart6 and jFreeChart11", jFreeChart6.equals(jFreeChart11) ? jFreeChart6.hashCode() == jFreeChart11.hashCode() : true);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
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
        multiplePiePlot0.setBackgroundImageAlpha(0.5f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot0", obj3.equals(multiplePiePlot0) ? obj3.hashCode() == multiplePiePlot0.hashCode() : true);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        multiplePiePlot0.setLimit((double) 0);
        multiplePiePlot0.setBackgroundAlpha((float) (-1));
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        multiplePiePlot0.setDataset(categoryDataset9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        multiplePiePlot12.setBackgroundAlpha((float) 1L);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = multiplePiePlot15.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder17 = multiplePiePlot15.getDataExtractOrder();
        multiplePiePlot12.setDataExtractOrder(tableOrder17);
        multiplePiePlot0.setDataExtractOrder(tableOrder17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot12 and multiplePiePlot15", multiplePiePlot12.equals(multiplePiePlot15) ? multiplePiePlot12.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier17);
        java.awt.Image image19 = multiplePiePlot13.getBackgroundImage();
        boolean boolean21 = multiplePiePlot13.equals((java.lang.Object) 1.0f);
        java.awt.Stroke stroke22 = multiplePiePlot13.getOutlineStroke();
        java.awt.Paint paint23 = multiplePiePlot13.getBackgroundPaint();
        jFreeChart4.setBorderPaint(paint23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj14", multiplePiePlot1.equals(obj14) ? multiplePiePlot1.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        float float1 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getRootPlot();
        multiplePiePlot0.setBackgroundImageAlignment(0);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent5 = null;
        multiplePiePlot0.axisChanged(axisChangeEvent5);
        multiplePiePlot0.setNoDataMessage("Other");
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
        multiplePiePlot0.setNoDataMessagePaint(paint21);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot();
        float float25 = multiplePiePlot24.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot26 = multiplePiePlot24.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart27 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot24);
        jFreeChart27.fireChartChanged();
        java.lang.Object obj29 = jFreeChart27.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo32 = null;
        java.awt.image.BufferedImage bufferedImage33 = jFreeChart27.createBufferedImage((int) '#', 1, chartRenderingInfo32);
        boolean boolean34 = jFreeChart27.isNotify();
        java.awt.Paint paint35 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart27.setBorderPaint(paint35);
        jFreeChart27.clearSubtitles();
        int int38 = jFreeChart27.getBackgroundImageAlignment();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot39 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj40 = multiplePiePlot39.clone();
        multiplePiePlot39.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier43 = null;
        multiplePiePlot39.setDrawingSupplier(drawingSupplier43);
        multiplePiePlot39.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart47 = multiplePiePlot39.getPieChart();
        java.awt.Image image48 = null;
        multiplePiePlot39.setBackgroundImage(image48);
        org.jfree.chart.JFreeChart jFreeChart50 = multiplePiePlot39.getPieChart();
        java.awt.Image image51 = jFreeChart50.getBackgroundImage();
        jFreeChart50.clearSubtitles();
        java.awt.RenderingHints renderingHints53 = jFreeChart50.getRenderingHints();
        jFreeChart27.setRenderingHints(renderingHints53);
        multiplePiePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot13 and multiplePiePlot24", multiplePiePlot13.equals(multiplePiePlot24) ? multiplePiePlot13.hashCode() == multiplePiePlot24.hashCode() : true);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        java.awt.Paint paint6 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setBackgroundPaint(paint6);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj9 = multiplePiePlot8.clone();
        multiplePiePlot8.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier12);
        multiplePiePlot8.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart16 = multiplePiePlot8.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint18 = jFreeChart17.getBackgroundPaint();
        java.awt.Paint paint19 = jFreeChart17.getBackgroundPaint();
        int int20 = jFreeChart17.getBackgroundImageAlignment();
        jFreeChart17.setAntiAlias(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = jFreeChart17.getPadding();
        multiplePiePlot0.setInsets(rectangleInsets23, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj9", obj1.equals(obj9) ? obj1.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = multiplePiePlot14.getDrawingSupplier();
        java.awt.Paint paint16 = multiplePiePlot14.getBackgroundPaint();
        jFreeChart13.setBorderPaint(paint16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot14", obj3.equals(multiplePiePlot14) ? obj3.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj19 = multiplePiePlot18.clone();
        multiplePiePlot18.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = null;
        multiplePiePlot18.setDrawingSupplier(drawingSupplier22);
        multiplePiePlot18.setForegroundAlpha(0.0f);
        multiplePiePlot18.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot18.zoom((double) (byte) 0);
        java.awt.Paint paint30 = multiplePiePlot18.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart31 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot18);
        org.jfree.chart.title.LegendTitle legendTitle33 = jFreeChart31.getLegend(100);
        jFreeChart31.setBorderVisible(false);
        java.awt.Stroke stroke36 = jFreeChart31.getBorderStroke();
        java.awt.RenderingHints renderingHints37 = jFreeChart31.getRenderingHints();
        java.awt.Stroke stroke38 = jFreeChart31.getBorderStroke();
        jFreeChart15.setBorderStroke(stroke38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj2 and obj19", obj2.equals(obj19) ? obj2.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = multiplePiePlot13.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder15 = multiplePiePlot13.getDataExtractOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot13.getLegendItems();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot13);
        org.jfree.chart.util.TableOrder tableOrder18 = multiplePiePlot13.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        float float21 = multiplePiePlot20.getBackgroundAlpha();
        java.awt.Paint paint22 = multiplePiePlot20.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart23 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot20);
        float float24 = multiplePiePlot20.getForegroundAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent25 = null;
        multiplePiePlot20.axisChanged(axisChangeEvent25);
        multiplePiePlot20.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        org.jfree.chart.plot.Plot plot31 = multiplePiePlot30.getParent();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot();
        float float34 = multiplePiePlot33.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot35 = multiplePiePlot33.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart36 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot33);
        jFreeChart36.fireChartChanged();
        boolean boolean38 = jFreeChart36.getAntiAlias();
        java.awt.Paint paint39 = jFreeChart36.getBorderPaint();
        multiplePiePlot30.setAggregatedItemsPaint(paint39);
        java.awt.Paint paint41 = multiplePiePlot30.getNoDataMessagePaint();
        multiplePiePlot20.setBackgroundPaint(paint41);
        boolean boolean43 = multiplePiePlot13.equals((java.lang.Object) multiplePiePlot20);
        org.jfree.chart.JFreeChart jFreeChart45 = new org.jfree.chart.JFreeChart("Other", font12, (org.jfree.chart.plot.Plot) multiplePiePlot20, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot13 and multiplePiePlot33", multiplePiePlot13.equals(multiplePiePlot33) ? multiplePiePlot13.hashCode() == multiplePiePlot33.hashCode() : true);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setLimit((double) 100L);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = multiplePiePlot0.getDrawingSupplier();
        java.lang.String str9 = multiplePiePlot0.getPlotType();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        float float12 = multiplePiePlot11.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot11.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot11);
        jFreeChart14.fireChartChanged();
        jFreeChart14.fireChartChanged();
        jFreeChart14.fireChartChanged();
        boolean boolean18 = jFreeChart14.isNotify();
        java.awt.Image image19 = jFreeChart14.getBackgroundImage();
        java.lang.Object obj20 = jFreeChart14.clone();
        multiplePiePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot11", obj1.equals(multiplePiePlot11) ? obj1.hashCode() == multiplePiePlot11.hashCode() : true);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier6);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        multiplePiePlot0.setForegroundAlpha((float) 0L);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        jFreeChart15.fireChartChanged();
        java.lang.Object obj17 = jFreeChart15.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo20 = null;
        java.awt.image.BufferedImage bufferedImage21 = jFreeChart15.createBufferedImage((int) '#', 1, chartRenderingInfo20);
        boolean boolean22 = jFreeChart15.isNotify();
        java.awt.Stroke stroke23 = jFreeChart15.getBorderStroke();
        multiplePiePlot0.setOutlineStroke(stroke23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot12", obj1.equals(multiplePiePlot12) ? obj1.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder14 = multiplePiePlot13.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        float float17 = multiplePiePlot16.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot16.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot16);
        java.awt.Paint paint20 = jFreeChart19.getBackgroundPaint();
        java.awt.Stroke stroke21 = jFreeChart19.getBorderStroke();
        org.jfree.chart.event.ChartProgressListener chartProgressListener22 = null;
        jFreeChart19.addProgressListener(chartProgressListener22);
        org.jfree.chart.event.ChartProgressListener chartProgressListener24 = null;
        jFreeChart19.removeProgressListener(chartProgressListener24);
        java.awt.Image image26 = jFreeChart19.getBackgroundImage();
        float float27 = jFreeChart19.getBackgroundImageAlpha();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo32 = null;
        java.awt.image.BufferedImage bufferedImage33 = jFreeChart19.createBufferedImage((int) ' ', 100, (double) 10L, 0.0d, chartRenderingInfo32);
        jFreeChart19.setBorderVisible(false);
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo40 = null;
        java.awt.image.BufferedImage bufferedImage41 = jFreeChart19.createBufferedImage((int) (short) 10, (int) (byte) 10, 0.0d, (double) (byte) 10, chartRenderingInfo40);
        multiplePiePlot13.setBackgroundImage((java.awt.Image) bufferedImage41);
        org.jfree.chart.plot.Plot plot43 = multiplePiePlot13.getParent();
        java.awt.Paint paint44 = multiplePiePlot13.getOutlinePaint();
        jFreeChart4.setBackgroundPaint(paint44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot16", multiplePiePlot1.equals(multiplePiePlot16) ? multiplePiePlot1.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj20 = multiplePiePlot19.clone();
        multiplePiePlot19.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = null;
        multiplePiePlot19.setDrawingSupplier(drawingSupplier23);
        multiplePiePlot19.zoom(0.0d);
        org.jfree.chart.plot.Plot plot27 = multiplePiePlot19.getRootPlot();
        plot27.setBackgroundImageAlignment((int) (byte) 100);
        org.jfree.chart.JFreeChart jFreeChart30 = new org.jfree.chart.JFreeChart(plot27);
        jFreeChart30.setBackgroundImageAlignment(100);
        java.awt.Stroke stroke33 = jFreeChart30.getBorderStroke();
        org.jfree.chart.title.LegendTitle legendTitle34 = jFreeChart30.getLegend();
        java.util.List list35 = jFreeChart30.getSubtitles();
        jFreeChart4.setSubtitles(list35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj20", multiplePiePlot1.equals(obj20) ? multiplePiePlot1.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        float float16 = multiplePiePlot15.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot15.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart18 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot15);
        java.awt.Paint paint19 = jFreeChart18.getBackgroundPaint();
        java.awt.Stroke stroke20 = jFreeChart18.getBorderStroke();
        boolean boolean21 = jFreeChart18.isBorderVisible();
        org.jfree.chart.event.ChartProgressListener chartProgressListener22 = null;
        jFreeChart18.addProgressListener(chartProgressListener22);
        jFreeChart18.setAntiAlias(true);
        org.jfree.chart.title.LegendTitle legendTitle26 = jFreeChart18.getLegend();
        jFreeChart4.removeSubtitle((org.jfree.chart.title.Title) legendTitle26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot15", multiplePiePlot1.equals(multiplePiePlot15) ? multiplePiePlot1.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot();
        float float24 = multiplePiePlot23.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot25 = multiplePiePlot23.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart26 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot23);
        jFreeChart26.fireChartChanged();
        boolean boolean28 = jFreeChart26.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle30 = jFreeChart26.getLegend((int) (short) 0);
        java.awt.Image image31 = jFreeChart26.getBackgroundImage();
        java.lang.Object obj32 = jFreeChart26.getTextAntiAlias();
        org.jfree.chart.title.TextTitle textTitle33 = jFreeChart26.getTitle();
        jFreeChart4.addSubtitle((org.jfree.chart.title.Title) textTitle33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot23", multiplePiePlot1.equals(multiplePiePlot23) ? multiplePiePlot1.hashCode() == multiplePiePlot23.hashCode() : true);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
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
        jFreeChart23.setBackgroundImageAlpha((float) 1L);
        java.lang.Object obj32 = jFreeChart23.getTextAntiAlias();
        java.util.List list33 = jFreeChart23.getSubtitles();
        jFreeChart4.setSubtitles(list33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot20", multiplePiePlot1.equals(multiplePiePlot20) ? multiplePiePlot1.hashCode() == multiplePiePlot20.hashCode() : true);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = multiplePiePlot22.getDrawingSupplier();
        java.awt.Paint paint24 = multiplePiePlot22.getBackgroundPaint();
        java.awt.Paint paint25 = multiplePiePlot22.getOutlinePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent26 = null;
        multiplePiePlot22.notifyListeners(plotChangeEvent26);
        boolean boolean28 = multiplePiePlot22.isSubplot();
        java.awt.Stroke stroke29 = multiplePiePlot22.getOutlineStroke();
        jFreeChart8.setBorderStroke(stroke29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot12 and multiplePiePlot22", multiplePiePlot12.equals(multiplePiePlot22) ? multiplePiePlot12.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj18 = multiplePiePlot17.clone();
        multiplePiePlot17.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = null;
        multiplePiePlot17.setDrawingSupplier(drawingSupplier21);
        multiplePiePlot17.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart25 = multiplePiePlot17.getPieChart();
        org.jfree.chart.title.Title title27 = jFreeChart25.getSubtitle((int) (byte) 0);
        java.lang.Object obj28 = jFreeChart25.clone();
        boolean boolean29 = jFreeChart25.isNotify();
        multiplePiePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj18", obj6.equals(obj18) ? obj6.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = plot13.getInsets();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart6 and jFreeChart11", jFreeChart6.equals(jFreeChart11) ? jFreeChart6.hashCode() == jFreeChart11.hashCode() : true);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        int int5 = jFreeChart4.getBackgroundImageAlignment();
        java.awt.image.BufferedImage bufferedImage8 = jFreeChart4.createBufferedImage((int) 'a', (int) (byte) 10);
        java.awt.Font font10 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        multiplePiePlot12.setForegroundAlpha((float) (byte) 0);
        java.awt.Paint paint18 = multiplePiePlot12.getOutlinePaint();
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart("hi!", font10, (org.jfree.chart.plot.Plot) multiplePiePlot12, true);
        org.jfree.chart.title.LegendTitle legendTitle21 = jFreeChart20.getLegend();
        jFreeChart4.addLegend(legendTitle21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart15 and jFreeChart20", jFreeChart15.equals(jFreeChart20) ? jFreeChart15.hashCode() == jFreeChart20.hashCode() : true);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
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
        org.jfree.chart.title.Title title30 = jFreeChart19.getSubtitle((int) (short) 0);
        jFreeChart9.addSubtitle(0, title30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot16", obj1.equals(multiplePiePlot16) ? obj1.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
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
        multiplePiePlot0.setOutlineVisible(false);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        float float21 = multiplePiePlot20.getBackgroundAlpha();
        java.awt.Font font22 = multiplePiePlot20.getNoDataMessageFont();
        float float23 = multiplePiePlot20.getForegroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot();
        float float26 = multiplePiePlot25.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot27 = multiplePiePlot25.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart28 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot25);
        jFreeChart28.fireChartChanged();
        jFreeChart28.fireChartChanged();
        jFreeChart28.fireChartChanged();
        boolean boolean32 = jFreeChart28.isNotify();
        java.awt.Image image33 = jFreeChart28.getBackgroundImage();
        java.lang.Object obj34 = jFreeChart28.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo37 = null;
        java.awt.image.BufferedImage bufferedImage38 = jFreeChart28.createBufferedImage((int) ' ', (int) 'a', chartRenderingInfo37);
        boolean boolean39 = multiplePiePlot20.equals((java.lang.Object) jFreeChart28);
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot20", multiplePiePlot9.equals(multiplePiePlot20) ? multiplePiePlot9.hashCode() == multiplePiePlot20.hashCode() : true);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = multiplePiePlot21.getDrawingSupplier();
        java.awt.Paint paint23 = multiplePiePlot21.getBackgroundPaint();
        java.awt.Paint paint24 = multiplePiePlot21.getOutlinePaint();
        multiplePiePlot21.setOutlineVisible(true);
        boolean boolean27 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot21);
        boolean boolean28 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot21", multiplePiePlot9.equals(multiplePiePlot21) ? multiplePiePlot9.hashCode() == multiplePiePlot21.hashCode() : true);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.awt.Paint paint3 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent4);
        java.lang.Object obj6 = multiplePiePlot0.clone();
        java.awt.Paint paint7 = multiplePiePlot0.getOutlinePaint();
        java.awt.Paint paint8 = multiplePiePlot0.getNoDataMessagePaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj10 = multiplePiePlot9.clone();
        multiplePiePlot9.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier13);
        java.awt.Image image15 = multiplePiePlot9.getBackgroundImage();
        boolean boolean17 = multiplePiePlot9.equals((java.lang.Object) 1.0f);
        java.awt.Stroke stroke18 = multiplePiePlot9.getOutlineStroke();
        java.awt.Paint paint19 = multiplePiePlot9.getBackgroundPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot();
        float float22 = multiplePiePlot21.getBackgroundAlpha();
        multiplePiePlot21.setAggregatedItemsKey((java.lang.Comparable) 10.0f);
        java.awt.Paint paint25 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot21.setNoDataMessagePaint(paint25);
        org.jfree.chart.JFreeChart jFreeChart27 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot21);
        java.awt.Paint paint28 = multiplePiePlot21.getBackgroundPaint();
        multiplePiePlot9.setOutlinePaint(paint28);
        org.jfree.chart.JFreeChart jFreeChart30 = multiplePiePlot9.getPieChart();
        multiplePiePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj10", obj6.equals(obj10) ? obj6.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        jFreeChart4.removeLegend();
        jFreeChart4.setBackgroundImageAlignment(15);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj12 = multiplePiePlot11.clone();
        multiplePiePlot11.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot11.setDrawingSupplier(drawingSupplier15);
        multiplePiePlot11.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot11.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot11);
        java.awt.Paint paint21 = jFreeChart20.getBackgroundPaint();
        java.awt.Paint paint22 = jFreeChart20.getBackgroundPaint();
        int int23 = jFreeChart20.getBackgroundImageAlignment();
        jFreeChart20.setAntiAlias(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = jFreeChart20.getPadding();
        jFreeChart4.setPadding(rectangleInsets26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj12", multiplePiePlot1.equals(obj12) ? multiplePiePlot1.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        boolean boolean6 = multiplePiePlot0.isOutlineVisible();
        org.jfree.chart.JFreeChart jFreeChart7 = multiplePiePlot0.getPieChart();
        org.jfree.chart.util.TableOrder tableOrder8 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot9.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection11 = multiplePiePlot9.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot9.setDataset(categoryDataset12);
        multiplePiePlot9.setLimit((double) 0);
        java.awt.Paint paint16 = multiplePiePlot9.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart17 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot9);
        java.awt.Font font18 = multiplePiePlot9.getNoDataMessageFont();
        java.awt.Paint paint19 = multiplePiePlot9.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = multiplePiePlot9.getInsets();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot();
        float float23 = multiplePiePlot22.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot22.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart25 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot22);
        jFreeChart25.fireChartChanged();
        boolean boolean27 = jFreeChart25.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle29 = jFreeChart25.getLegend((int) (short) 0);
        java.awt.Image image30 = jFreeChart25.getBackgroundImage();
        java.lang.Object obj31 = jFreeChart25.getTextAntiAlias();
        org.jfree.chart.event.ChartProgressListener chartProgressListener32 = null;
        jFreeChart25.addProgressListener(chartProgressListener32);
        jFreeChart25.setBackgroundImageAlpha((float) (byte) 100);
        java.awt.Paint paint36 = jFreeChart25.getBorderPaint();
        multiplePiePlot9.setOutlinePaint(paint36);
        multiplePiePlot0.setNoDataMessagePaint(paint36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection2 and legendItemCollection11", legendItemCollection2.equals(legendItemCollection11) ? legendItemCollection2.hashCode() == legendItemCollection11.hashCode() : true);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot();
        float float20 = multiplePiePlot19.getBackgroundAlpha();
        java.awt.Paint paint21 = multiplePiePlot19.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart22 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot19);
        float float23 = multiplePiePlot19.getForegroundAlpha();
        java.awt.Paint paint24 = multiplePiePlot19.getAggregatedItemsPaint();
        float float25 = multiplePiePlot19.getForegroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = multiplePiePlot19.getInsets();
        multiplePiePlot0.setInsets(rectangleInsets26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot19", obj1.equals(multiplePiePlot19) ? obj1.hashCode() == multiplePiePlot19.hashCode() : true);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle7 = jFreeChart4.getTitle();
        java.awt.Image image8 = jFreeChart4.getBackgroundImage();
        java.awt.Paint paint9 = jFreeChart4.getBorderPaint();
        org.jfree.chart.plot.Plot plot10 = jFreeChart4.getPlot();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        jFreeChart15.fireChartChanged();
        boolean boolean17 = jFreeChart15.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle19 = jFreeChart15.getLegend((int) (short) 0);
        boolean boolean20 = jFreeChart15.isNotify();
        float float21 = jFreeChart15.getBackgroundImageAlpha();
        java.awt.Paint paint22 = jFreeChart15.getBorderPaint();
        jFreeChart4.setBorderPaint(paint22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot12", multiplePiePlot1.equals(multiplePiePlot12) ? multiplePiePlot1.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj27 = multiplePiePlot26.clone();
        multiplePiePlot26.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier30 = null;
        multiplePiePlot26.setDrawingSupplier(drawingSupplier30);
        multiplePiePlot26.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart34 = multiplePiePlot26.getPieChart();
        jFreeChart34.removeLegend();
        java.awt.Paint paint36 = jFreeChart34.getBorderPaint();
        jFreeChart34.setBackgroundImageAlpha((-1.0f));
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot39 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj40 = multiplePiePlot39.clone();
        multiplePiePlot39.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier43 = null;
        multiplePiePlot39.setDrawingSupplier(drawingSupplier43);
        multiplePiePlot39.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart47 = multiplePiePlot39.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets48 = jFreeChart47.getPadding();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot50 = new org.jfree.chart.plot.MultiplePiePlot();
        float float51 = multiplePiePlot50.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot52 = multiplePiePlot50.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart53 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot50);
        jFreeChart53.fireChartChanged();
        boolean boolean55 = jFreeChart53.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle57 = jFreeChart53.getLegend((int) (short) 0);
        jFreeChart47.removeSubtitle((org.jfree.chart.title.Title) legendTitle57);
        jFreeChart34.addLegend(legendTitle57);
        jFreeChart15.addSubtitle((org.jfree.chart.title.Title) legendTitle57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot12 and multiplePiePlot50", multiplePiePlot12.equals(multiplePiePlot50) ? multiplePiePlot12.hashCode() == multiplePiePlot50.hashCode() : true);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        boolean boolean8 = jFreeChart4.isNotify();
        java.awt.Image image9 = jFreeChart4.getBackgroundImage();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        float float12 = multiplePiePlot11.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot11.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart14 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot11);
        java.awt.Paint paint15 = jFreeChart14.getBackgroundPaint();
        java.awt.Stroke stroke16 = jFreeChart14.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle17 = jFreeChart14.getTitle();
        java.lang.Object obj18 = jFreeChart14.clone();
        java.awt.RenderingHints renderingHints19 = jFreeChart14.getRenderingHints();
        jFreeChart4.setRenderingHints(renderingHints19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot11", multiplePiePlot1.equals(multiplePiePlot11) ? multiplePiePlot1.hashCode() == multiplePiePlot11.hashCode() : true);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj17 = multiplePiePlot16.clone();
        multiplePiePlot16.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = null;
        multiplePiePlot16.setDrawingSupplier(drawingSupplier20);
        multiplePiePlot16.setForegroundAlpha(0.0f);
        multiplePiePlot16.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot16.zoom((double) (byte) 0);
        boolean boolean28 = multiplePiePlot16.isSubplot();
        multiplePiePlot16.zoom((double) 100.0f);
        boolean boolean31 = multiplePiePlot16.isOutlineVisible();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot();
        float float33 = multiplePiePlot32.getBackgroundAlpha();
        java.awt.Paint paint34 = multiplePiePlot32.getNoDataMessagePaint();
        multiplePiePlot32.setForegroundAlpha((float) (-1L));
        java.awt.Paint paint37 = multiplePiePlot32.getOutlinePaint();
        java.awt.Font font38 = multiplePiePlot32.getNoDataMessageFont();
        multiplePiePlot16.setNoDataMessageFont(font38);
        java.awt.Paint paint40 = multiplePiePlot16.getBackgroundPaint();
        plot15.setOutlinePaint(paint40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj17", obj1.equals(obj17) ? obj1.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
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
        multiplePiePlot0.setOutlineVisible(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart10 and jFreeChart15", jFreeChart10.equals(jFreeChart15) ? jFreeChart10.hashCode() == jFreeChart15.hashCode() : true);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
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
        java.awt.Paint paint25 = multiplePiePlot23.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot23.setInsets(rectangleInsets26, false);
        jFreeChart19.setPadding(rectangleInsets26);
        java.awt.Paint paint30 = jFreeChart19.getBorderPaint();
        org.jfree.chart.title.LegendTitle legendTitle31 = jFreeChart19.getLegend();
        jFreeChart10.removeSubtitle((org.jfree.chart.title.Title) legendTitle31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot0 and multiplePiePlot23", multiplePiePlot0.equals(multiplePiePlot23) ? multiplePiePlot0.hashCode() == multiplePiePlot23.hashCode() : true);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj26 = multiplePiePlot25.clone();
        multiplePiePlot25.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = null;
        multiplePiePlot25.setDrawingSupplier(drawingSupplier29);
        multiplePiePlot25.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart33 = multiplePiePlot25.getPieChart();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj35 = multiplePiePlot34.clone();
        multiplePiePlot34.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint38 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot34.setNoDataMessagePaint(paint38);
        java.awt.Font font40 = multiplePiePlot34.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier41 = multiplePiePlot34.getDrawingSupplier();
        java.lang.String str42 = multiplePiePlot34.getNoDataMessage();
        org.jfree.chart.plot.Plot plot43 = multiplePiePlot34.getParent();
        org.jfree.data.general.DatasetGroup datasetGroup44 = multiplePiePlot34.getDatasetGroup();
        java.awt.Paint paint45 = multiplePiePlot34.getOutlinePaint();
        jFreeChart33.setBackgroundPaint(paint45);
        jFreeChart8.setBorderPaint(paint45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot12 and obj35", multiplePiePlot12.equals(obj35) ? multiplePiePlot12.hashCode() == obj35.hashCode() : true);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent19 = null;
        plot18.axisChanged(axisChangeEvent19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on plot18 and multiplePiePlot9", plot18.equals(multiplePiePlot9) ? plot18.hashCode() == multiplePiePlot9.hashCode() : true);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot();
        float float27 = multiplePiePlot26.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot28 = multiplePiePlot26.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart29 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot26);
        jFreeChart29.fireChartChanged();
        java.lang.Object obj31 = jFreeChart29.clone();
        java.awt.Paint paint32 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        jFreeChart29.setBackgroundPaint(paint32);
        org.jfree.chart.event.ChartProgressListener chartProgressListener34 = null;
        jFreeChart29.addProgressListener(chartProgressListener34);
        jFreeChart29.setNotify(false);
        org.jfree.chart.event.ChartProgressListener chartProgressListener38 = null;
        jFreeChart29.removeProgressListener(chartProgressListener38);
        java.lang.Object obj40 = jFreeChart29.getTextAntiAlias();
        jFreeChart29.setTextAntiAlias(true);
        java.lang.Object obj43 = jFreeChart29.clone();
        jFreeChart29.setTitle("hi!");
        java.awt.Stroke stroke46 = jFreeChart29.getBorderStroke();
        jFreeChart8.setBorderStroke(stroke46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot12 and multiplePiePlot26", multiplePiePlot12.equals(multiplePiePlot26) ? multiplePiePlot12.hashCode() == multiplePiePlot26.hashCode() : true);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
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
        java.awt.Font font17 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot();
        float float20 = multiplePiePlot19.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot19.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart22 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot19);
        multiplePiePlot19.setForegroundAlpha((float) (byte) 0);
        java.awt.Paint paint25 = multiplePiePlot19.getOutlinePaint();
        org.jfree.chart.JFreeChart jFreeChart27 = new org.jfree.chart.JFreeChart("hi!", font17, (org.jfree.chart.plot.Plot) multiplePiePlot19, true);
        jFreeChart27.setNotify(true);
        org.jfree.chart.title.TextTitle textTitle30 = jFreeChart27.getTitle();
        jFreeChart4.setTitle(textTitle30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart22 and jFreeChart27", jFreeChart22.equals(jFreeChart27) ? jFreeChart22.hashCode() == jFreeChart27.hashCode() : true);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle8 = jFreeChart4.getLegend((int) (short) 0);
        java.awt.Image image9 = jFreeChart4.getBackgroundImage();
        java.lang.Object obj10 = jFreeChart4.getTextAntiAlias();
        org.jfree.chart.title.TextTitle textTitle11 = jFreeChart4.getTitle();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        float float14 = multiplePiePlot13.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot13);
        int int17 = jFreeChart16.getBackgroundImageAlignment();
        float float18 = jFreeChart16.getBackgroundImageAlpha();
        org.jfree.chart.title.TextTitle textTitle19 = jFreeChart16.getTitle();
        jFreeChart4.removeSubtitle((org.jfree.chart.title.Title) textTitle19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot13", multiplePiePlot1.equals(multiplePiePlot13) ? multiplePiePlot1.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot();
        float float22 = multiplePiePlot21.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot23 = multiplePiePlot21.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart24 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot21);
        jFreeChart24.fireChartChanged();
        java.lang.Object obj26 = jFreeChart24.clone();
        int int27 = jFreeChart24.getSubtitleCount();
        jFreeChart24.setBorderVisible(true);
        java.awt.Paint paint30 = jFreeChart24.getBorderPaint();
        org.jfree.chart.title.LegendTitle legendTitle31 = jFreeChart24.getLegend();
        jFreeChart4.removeSubtitle((org.jfree.chart.title.Title) legendTitle31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot21", multiplePiePlot1.equals(multiplePiePlot21) ? multiplePiePlot1.hashCode() == multiplePiePlot21.hashCode() : true);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
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
        java.lang.Object obj17 = multiplePiePlot16.clone();
        multiplePiePlot16.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = null;
        multiplePiePlot16.setDrawingSupplier(drawingSupplier20);
        multiplePiePlot16.zoom(0.0d);
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        multiplePiePlot16.drawBackgroundImage(graphics2D24, rectangle2D25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        multiplePiePlot16.setDataset(categoryDataset27);
        java.awt.Paint paint29 = multiplePiePlot16.getBackgroundPaint();
        boolean boolean30 = multiplePiePlot0.equals((java.lang.Object) paint29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj17", obj3.equals(obj17) ? obj3.hashCode() == obj17.hashCode() : true);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj15 = multiplePiePlot14.clone();
        multiplePiePlot14.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot14.setDrawingSupplier(drawingSupplier18);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = null;
        multiplePiePlot14.setDrawingSupplier(drawingSupplier20);
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot14.getPieChart();
        jFreeChart22.setNotify(false);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj26 = multiplePiePlot25.clone();
        multiplePiePlot25.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = null;
        multiplePiePlot25.setDrawingSupplier(drawingSupplier29);
        multiplePiePlot25.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart33 = multiplePiePlot25.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = jFreeChart33.getPadding();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot();
        float float37 = multiplePiePlot36.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot38 = multiplePiePlot36.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart39 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot36);
        jFreeChart39.fireChartChanged();
        boolean boolean41 = jFreeChart39.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle43 = jFreeChart39.getLegend((int) (short) 0);
        jFreeChart33.removeSubtitle((org.jfree.chart.title.Title) legendTitle43);
        jFreeChart22.removeSubtitle((org.jfree.chart.title.Title) legendTitle43);
        jFreeChart4.addSubtitle((org.jfree.chart.title.Title) legendTitle43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot36", multiplePiePlot1.equals(multiplePiePlot36) ? multiplePiePlot1.hashCode() == multiplePiePlot36.hashCode() : true);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        jFreeChart4.fireChartChanged();
        boolean boolean8 = jFreeChart4.isNotify();
        java.awt.Image image9 = jFreeChart4.getBackgroundImage();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier14);
        multiplePiePlot10.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot10.getPieChart();
        org.jfree.chart.title.Title title20 = jFreeChart18.getSubtitle((int) (byte) 0);
        jFreeChart4.addSubtitle(title20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj11", multiplePiePlot1.equals(obj11) ? multiplePiePlot1.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        boolean boolean6 = jFreeChart4.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle8 = jFreeChart4.getLegend((int) (short) 0);
        java.awt.Image image9 = jFreeChart4.getBackgroundImage();
        java.lang.Object obj10 = jFreeChart4.getTextAntiAlias();
        org.jfree.chart.event.ChartProgressListener chartProgressListener11 = null;
        jFreeChart4.addProgressListener(chartProgressListener11);
        jFreeChart4.setBackgroundImageAlpha((float) (byte) 100);
        java.awt.Paint paint15 = jFreeChart4.getBorderPaint();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot16.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection18 = multiplePiePlot16.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        multiplePiePlot16.setDataset(categoryDataset19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        org.jfree.chart.plot.Plot plot23 = multiplePiePlot22.getParent();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot();
        float float26 = multiplePiePlot25.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot27 = multiplePiePlot25.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart28 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot25);
        jFreeChart28.fireChartChanged();
        boolean boolean30 = jFreeChart28.getAntiAlias();
        java.awt.Paint paint31 = jFreeChart28.getBorderPaint();
        multiplePiePlot22.setAggregatedItemsPaint(paint31);
        multiplePiePlot16.setNoDataMessagePaint(paint31);
        jFreeChart4.setBackgroundPaint(paint31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot16", multiplePiePlot1.equals(multiplePiePlot16) ? multiplePiePlot1.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart1 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot0);
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = jFreeChart1.getPadding();
        jFreeChart1.removeLegend();
        jFreeChart1.setTitle("Multiple Pie Plot");
        jFreeChart1.setBackgroundImageAlignment((int) '4');
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj9 = multiplePiePlot8.clone();
        multiplePiePlot8.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot8.getDataset();
        java.awt.Image image13 = null;
        multiplePiePlot8.setBackgroundImage(image13);
        java.awt.Font font15 = multiplePiePlot8.getNoDataMessageFont();
        java.awt.Font font16 = multiplePiePlot8.getNoDataMessageFont();
        boolean boolean17 = multiplePiePlot8.isSubplot();
        java.awt.Paint paint18 = multiplePiePlot8.getOutlinePaint();
        jFreeChart1.setBorderPaint(paint18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot0 and obj9", multiplePiePlot0.equals(obj9) ? multiplePiePlot0.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot0.setInsets(rectangleInsets3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        multiplePiePlot0.setDataset(categoryDataset5);
        java.lang.String str7 = multiplePiePlot0.getPlotType();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        multiplePiePlot0.handleClick((int) (short) 100, (int) (short) 100, plotRenderingInfo10);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj13 = multiplePiePlot12.clone();
        multiplePiePlot12.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier16);
        multiplePiePlot12.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot12.getPieChart();
        org.jfree.chart.title.Title title22 = jFreeChart20.getSubtitle((int) (byte) 0);
        org.jfree.chart.plot.Plot plot23 = jFreeChart20.getPlot();
        plot23.setBackgroundImageAlignment((int) (short) 100);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot();
        float float28 = multiplePiePlot27.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot29 = multiplePiePlot27.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart30 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot27);
        jFreeChart30.fireChartChanged();
        boolean boolean32 = jFreeChart30.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle34 = jFreeChart30.getLegend((int) (short) 0);
        plot23.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart30);
        jFreeChart30.setBorderVisible(true);
        jFreeChart30.setTextAntiAlias(false);
        java.util.List list40 = jFreeChart30.getSubtitles();
        multiplePiePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot27", obj1.equals(multiplePiePlot27) ? obj1.hashCode() == multiplePiePlot27.hashCode() : true);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        multiplePiePlot0.setDataset(categoryDataset2);
        java.awt.Font font4 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot0.setNoDataMessageFont(font4);
        boolean boolean6 = multiplePiePlot0.isSubplot();
        java.lang.String str7 = multiplePiePlot0.getNoDataMessage();
        java.lang.String str8 = multiplePiePlot0.getNoDataMessage();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj10 = multiplePiePlot9.clone();
        multiplePiePlot9.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier13);
        java.awt.Paint paint15 = org.jfree.chart.JFreeChart.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot9.setBackgroundPaint(paint15);
        multiplePiePlot0.setAggregatedItemsPaint(paint15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj10", obj1.equals(obj10) ? obj1.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
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
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        java.awt.Paint paint5 = jFreeChart4.getBackgroundPaint();
        java.awt.Stroke stroke6 = jFreeChart4.getBorderStroke();
        boolean boolean7 = jFreeChart4.isBorderVisible();
        jFreeChart4.removeLegend();
        jFreeChart4.setBackgroundImageAlignment(15);
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
        jFreeChart15.setBackgroundImageAlpha((float) 1L);
        java.lang.Object obj24 = jFreeChart15.getTextAntiAlias();
        java.util.List list25 = jFreeChart15.getSubtitles();
        jFreeChart4.setSubtitles(list25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot12", multiplePiePlot1.equals(multiplePiePlot12) ? multiplePiePlot1.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        float float19 = multiplePiePlot18.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot18.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot18);
        jFreeChart21.fireChartChanged();
        java.lang.Object obj23 = jFreeChart21.clone();
        jFreeChart21.setBackgroundImageAlpha((float) (byte) 0);
        org.jfree.chart.event.ChartProgressListener chartProgressListener26 = null;
        jFreeChart21.removeProgressListener(chartProgressListener26);
        java.awt.Stroke stroke28 = jFreeChart21.getBorderStroke();
        int int29 = jFreeChart21.getBackgroundImageAlignment();
        java.awt.Paint paint30 = jFreeChart21.getBorderPaint();
        multiplePiePlot0.setOutlinePaint(paint30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot18", obj3.equals(multiplePiePlot18) ? obj3.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder1 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder3 = multiplePiePlot2.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot0.getLegendItems();
        multiplePiePlot0.setBackgroundAlpha(0.0f);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        float float10 = multiplePiePlot9.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot9.getRootPlot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot9.notifyListeners(plotChangeEvent12);
        org.jfree.chart.util.TableOrder tableOrder14 = multiplePiePlot9.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot2 and multiplePiePlot9", multiplePiePlot2.equals(multiplePiePlot9) ? multiplePiePlot2.hashCode() == multiplePiePlot9.hashCode() : true);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
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
        java.awt.Font font20 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot();
        float float23 = multiplePiePlot22.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot22.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart25 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot22);
        multiplePiePlot22.setForegroundAlpha((float) (byte) 0);
        java.awt.Paint paint28 = multiplePiePlot22.getOutlinePaint();
        org.jfree.chart.JFreeChart jFreeChart30 = new org.jfree.chart.JFreeChart("hi!", font20, (org.jfree.chart.plot.Plot) multiplePiePlot22, true);
        jFreeChart30.setNotify(true);
        org.jfree.chart.title.TextTitle textTitle33 = jFreeChart30.getTitle();
        jFreeChart4.addSubtitle((org.jfree.chart.title.Title) textTitle33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart25 and jFreeChart30", jFreeChart25.equals(jFreeChart30) ? jFreeChart25.hashCode() == jFreeChart30.hashCode() : true);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        float float18 = multiplePiePlot17.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot17.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart20 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot17);
        jFreeChart20.fireChartChanged();
        jFreeChart20.fireChartChanged();
        jFreeChart20.setTitle("hi!");
        org.jfree.chart.title.TextTitle textTitle25 = jFreeChart20.getTitle();
        jFreeChart4.setTitle(textTitle25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot17", multiplePiePlot1.equals(multiplePiePlot17) ? multiplePiePlot1.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
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
        org.jfree.chart.title.TextTitle textTitle22 = jFreeChart19.getTitle();
        java.lang.Object obj23 = jFreeChart19.clone();
        org.jfree.chart.event.ChartProgressListener chartProgressListener24 = null;
        jFreeChart19.addProgressListener(chartProgressListener24);
        jFreeChart19.setBackgroundImageAlpha((float) (byte) -1);
        jFreeChart19.setTextAntiAlias(false);
        jFreeChart19.setNotify(false);
        org.jfree.chart.title.LegendTitle legendTitle32 = jFreeChart19.getLegend();
        jFreeChart4.addLegend(legendTitle32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot16", multiplePiePlot1.equals(multiplePiePlot16) ? multiplePiePlot1.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        java.awt.Paint paint4 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot0.setNoDataMessagePaint(paint4);
        java.awt.Font font6 = multiplePiePlot0.getNoDataMessageFont();
        multiplePiePlot0.setBackgroundImageAlpha((float) (byte) 0);
        float float9 = multiplePiePlot0.getBackgroundImageAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj11 = multiplePiePlot10.clone();
        multiplePiePlot10.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset14 = multiplePiePlot10.getDataset();
        java.awt.Image image15 = null;
        multiplePiePlot10.setBackgroundImage(image15);
        multiplePiePlot10.setNoDataMessage("hi!");
        org.jfree.chart.util.TableOrder tableOrder19 = multiplePiePlot10.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj11", obj1.equals(obj11) ? obj1.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder1 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder3 = multiplePiePlot2.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = multiplePiePlot0.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot0.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot0.getInsets();
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        java.lang.Object obj10 = multiplePiePlot0.clone();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        java.awt.Paint paint16 = jFreeChart15.getBackgroundPaint();
        java.awt.Stroke stroke17 = jFreeChart15.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle18 = jFreeChart15.getTitle();
        java.lang.Object obj19 = jFreeChart15.clone();
        java.awt.Stroke stroke20 = jFreeChart15.getBorderStroke();
        java.awt.Stroke stroke21 = jFreeChart15.getBorderStroke();
        boolean boolean22 = jFreeChart15.getAntiAlias();
        int int23 = jFreeChart15.getBackgroundImageAlignment();
        java.lang.Object obj24 = jFreeChart15.getTextAntiAlias();
        java.awt.Paint paint25 = jFreeChart15.getBorderPaint();
        multiplePiePlot0.setOutlinePaint(paint25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot2 and multiplePiePlot12", multiplePiePlot2.equals(multiplePiePlot12) ? multiplePiePlot2.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder17 = multiplePiePlot16.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder19 = multiplePiePlot18.getDataExtractOrder();
        multiplePiePlot16.setDataExtractOrder(tableOrder19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = multiplePiePlot16.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection22 = multiplePiePlot16.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = multiplePiePlot16.getInsets();
        java.awt.Paint paint24 = multiplePiePlot16.getBackgroundPaint();
        java.awt.Stroke stroke25 = multiplePiePlot16.getOutlineStroke();
        boolean boolean26 = multiplePiePlot2.equals((java.lang.Object) multiplePiePlot16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and multiplePiePlot18", obj3.equals(multiplePiePlot18) ? obj3.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        float float2 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart4 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot1);
        jFreeChart4.fireChartChanged();
        java.lang.Object obj6 = jFreeChart4.clone();
        int int7 = jFreeChart4.getSubtitleCount();
        float float8 = jFreeChart4.getBackgroundImageAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj10 = multiplePiePlot9.clone();
        multiplePiePlot9.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier13);
        multiplePiePlot9.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot9.getPieChart();
        jFreeChart17.removeLegend();
        java.awt.Paint paint19 = jFreeChart17.getBorderPaint();
        jFreeChart4.setBackgroundPaint(paint19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj10", multiplePiePlot1.equals(obj10) ? multiplePiePlot1.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
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
        org.jfree.chart.event.ChartProgressListener chartProgressListener13 = null;
        jFreeChart12.removeProgressListener(chartProgressListener13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot5", multiplePiePlot1.equals(multiplePiePlot5) ? multiplePiePlot1.hashCode() == multiplePiePlot5.hashCode() : true);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
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
        java.awt.Font font18 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        float float21 = multiplePiePlot20.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot22 = multiplePiePlot20.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart23 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot20);
        multiplePiePlot20.setForegroundAlpha((float) (byte) 0);
        java.awt.Paint paint26 = multiplePiePlot20.getOutlinePaint();
        org.jfree.chart.JFreeChart jFreeChart28 = new org.jfree.chart.JFreeChart("hi!", font18, (org.jfree.chart.plot.Plot) multiplePiePlot20, true);
        jFreeChart28.setNotify(true);
        org.jfree.chart.title.TextTitle textTitle31 = jFreeChart28.getTitle();
        boolean boolean32 = multiplePiePlot0.equals((java.lang.Object) textTitle31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart23 and jFreeChart28", jFreeChart23.equals(jFreeChart28) ? jFreeChart23.hashCode() == jFreeChart28.hashCode() : true);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        java.awt.Paint paint2 = multiplePiePlot0.getBackgroundPaint();
        java.awt.Paint paint3 = multiplePiePlot0.getOutlinePaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        multiplePiePlot0.notifyListeners(plotChangeEvent4);
        java.lang.Object obj6 = multiplePiePlot0.clone();
        java.awt.Paint paint7 = multiplePiePlot0.getOutlinePaint();
        boolean boolean8 = multiplePiePlot0.isSubplot();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj10 = multiplePiePlot9.clone();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        multiplePiePlot9.setDataset(categoryDataset11);
        java.awt.Font font13 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot9.setNoDataMessageFont(font13);
        multiplePiePlot0.setNoDataMessageFont(font13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and obj10", obj6.equals(obj10) ? obj6.hashCode() == obj10.hashCode() : true);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) (byte) 0);
        multiplePiePlot0.setAggregatedItemsKey((java.lang.Comparable) "");
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj12 = multiplePiePlot11.clone();
        multiplePiePlot11.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset15 = multiplePiePlot11.getDataset();
        java.awt.Image image16 = null;
        multiplePiePlot11.setBackgroundImage(image16);
        multiplePiePlot11.setNoDataMessage("hi!");
        org.jfree.data.category.CategoryDataset categoryDataset20 = multiplePiePlot11.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset21 = multiplePiePlot11.getDataset();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent22 = null;
        multiplePiePlot11.axisChanged(axisChangeEvent22);
        java.awt.Image image24 = multiplePiePlot11.getBackgroundImage();
        org.jfree.chart.plot.Plot plot25 = multiplePiePlot11.getRootPlot();
        boolean boolean26 = multiplePiePlot0.equals((java.lang.Object) multiplePiePlot11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj12", obj1.equals(obj12) ? obj1.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        org.jfree.chart.plot.Plot plot2 = multiplePiePlot0.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot0.setInsets(rectangleInsets3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        multiplePiePlot0.setDataset(categoryDataset5);
        java.lang.String str7 = multiplePiePlot0.getPlotType();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot8.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection10 = multiplePiePlot8.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        multiplePiePlot8.setDataset(categoryDataset11);
        multiplePiePlot8.setLimit((double) 0);
        java.awt.Paint paint15 = multiplePiePlot8.getAggregatedItemsPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent16 = null;
        multiplePiePlot8.datasetChanged(datasetChangeEvent16);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj19 = multiplePiePlot18.clone();
        multiplePiePlot18.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = null;
        multiplePiePlot18.setDrawingSupplier(drawingSupplier22);
        multiplePiePlot18.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart26 = multiplePiePlot18.getPieChart();
        org.jfree.chart.title.Title title28 = jFreeChart26.getSubtitle((int) (byte) 0);
        jFreeChart26.removeLegend();
        org.jfree.chart.title.LegendTitle legendTitle30 = jFreeChart26.getLegend();
        multiplePiePlot8.setPieChart(jFreeChart26);
        org.jfree.chart.JFreeChart jFreeChart32 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot8);
        java.awt.Paint paint33 = multiplePiePlot8.getNoDataMessagePaint();
        multiplePiePlot0.setAggregatedItemsPaint(paint33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot8", obj1.equals(multiplePiePlot8) ? obj1.hashCode() == multiplePiePlot8.hashCode() : true);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj22 = multiplePiePlot21.clone();
        multiplePiePlot21.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = null;
        multiplePiePlot21.setDrawingSupplier(drawingSupplier25);
        multiplePiePlot21.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart29 = multiplePiePlot21.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = jFreeChart29.getPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = jFreeChart29.getPadding();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj33 = multiplePiePlot32.clone();
        multiplePiePlot32.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier36 = null;
        multiplePiePlot32.setDrawingSupplier(drawingSupplier36);
        multiplePiePlot32.setForegroundAlpha(0.0f);
        multiplePiePlot32.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        int int42 = multiplePiePlot32.getBackgroundImageAlignment();
        java.awt.Paint paint43 = multiplePiePlot32.getAggregatedItemsPaint();
        java.awt.Paint paint44 = multiplePiePlot32.getBackgroundPaint();
        jFreeChart29.setBorderPaint(paint44);
        org.jfree.chart.util.RectangleInsets rectangleInsets46 = jFreeChart29.getPadding();
        multiplePiePlot0.setInsets(rectangleInsets46, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj7 and obj33", obj7.equals(obj33) ? obj7.hashCode() == obj33.hashCode() : true);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot0.setDrawingSupplier(drawingSupplier6);
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot0.getPieChart();
        multiplePiePlot0.setForegroundAlpha((float) 0L);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj12 = multiplePiePlot11.clone();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        multiplePiePlot11.setDataset(categoryDataset13);
        java.awt.Font font15 = org.jfree.chart.JFreeChart.DEFAULT_TITLE_FONT;
        multiplePiePlot11.setNoDataMessageFont(font15);
        multiplePiePlot11.setForegroundAlpha(100.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = multiplePiePlot11.getInsets();
        boolean boolean20 = multiplePiePlot11.isSubplot();
        float float21 = multiplePiePlot11.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        multiplePiePlot11.setDataset(categoryDataset22);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = multiplePiePlot11.getDrawingSupplier();
        multiplePiePlot0.setDrawingSupplier(drawingSupplier24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj12", obj1.equals(obj12) ? obj1.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
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
        java.awt.Stroke stroke32 = jFreeChart17.getBorderStroke();
        multiplePiePlot0.setOutlineStroke(stroke32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot14", obj1.equals(multiplePiePlot14) ? obj1.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot27 = multiplePiePlot26.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection28 = multiplePiePlot26.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        multiplePiePlot26.setDataset(categoryDataset29);
        org.jfree.data.category.CategoryDataset categoryDataset31 = multiplePiePlot26.getDataset();
        boolean boolean32 = multiplePiePlot26.isOutlineVisible();
        org.jfree.chart.JFreeChart jFreeChart33 = multiplePiePlot26.getPieChart();
        org.jfree.chart.util.TableOrder tableOrder34 = multiplePiePlot26.getDataExtractOrder();
        multiplePiePlot0.setDataExtractOrder(tableOrder34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot26", multiplePiePlot5.equals(multiplePiePlot26) ? multiplePiePlot5.hashCode() == multiplePiePlot26.hashCode() : true);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Font font3 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot();
        float float5 = multiplePiePlot4.getBackgroundAlpha();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj7 = multiplePiePlot6.clone();
        multiplePiePlot6.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot6.setDrawingSupplier(drawingSupplier10);
        multiplePiePlot6.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart14 = multiplePiePlot6.getPieChart();
        org.jfree.chart.title.Title title16 = jFreeChart14.getSubtitle((int) (byte) 0);
        multiplePiePlot4.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart14);
        org.jfree.data.general.DatasetGroup datasetGroup18 = multiplePiePlot4.getDatasetGroup();
        double double19 = multiplePiePlot4.getLimit();
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart("hi!", font3, (org.jfree.chart.plot.Plot) multiplePiePlot4, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj7", multiplePiePlot1.equals(obj7) ? multiplePiePlot1.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        jFreeChart15.fireChartChanged();
        java.lang.Object obj17 = jFreeChart15.clone();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo20 = null;
        java.awt.image.BufferedImage bufferedImage21 = jFreeChart15.createBufferedImage((int) '#', 1, chartRenderingInfo20);
        jFreeChart15.fireChartChanged();
        org.jfree.chart.event.ChartProgressListener chartProgressListener23 = null;
        jFreeChart15.addProgressListener(chartProgressListener23);
        java.awt.Paint paint25 = jFreeChart15.getBackgroundPaint();
        multiplePiePlot0.setAggregatedItemsPaint(paint25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot12", obj1.equals(multiplePiePlot12) ? obj1.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot1 = multiplePiePlot0.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection2 = multiplePiePlot0.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        multiplePiePlot0.setDataset(categoryDataset3);
        multiplePiePlot0.setLimit((double) 0);
        multiplePiePlot0.setBackgroundAlpha((float) (-1));
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot9.getParent();
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
        multiplePiePlot11.setBackgroundAlpha((float) (short) 10);
        boolean boolean26 = multiplePiePlot9.equals((java.lang.Object) multiplePiePlot11);
        java.awt.Paint paint27 = multiplePiePlot9.getOutlinePaint();
        multiplePiePlot9.zoom((double) 0L);
        boolean boolean30 = multiplePiePlot0.equals((java.lang.Object) 0L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and obj12", multiplePiePlot9.equals(obj12) ? multiplePiePlot9.hashCode() == obj12.hashCode() : true);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot40 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.JFreeChart jFreeChart41 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot40);
        org.jfree.chart.util.RectangleInsets rectangleInsets42 = jFreeChart41.getPadding();
        java.util.List list43 = jFreeChart41.getSubtitles();
        jFreeChart8.setSubtitles(list43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot24 and multiplePiePlot40", multiplePiePlot24.equals(multiplePiePlot40) ? multiplePiePlot24.hashCode() == multiplePiePlot40.hashCode() : true);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot16.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection18 = multiplePiePlot16.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        multiplePiePlot16.setDataset(categoryDataset19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        org.jfree.chart.plot.Plot plot23 = multiplePiePlot22.getParent();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot();
        float float26 = multiplePiePlot25.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot27 = multiplePiePlot25.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart28 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot25);
        jFreeChart28.fireChartChanged();
        boolean boolean30 = jFreeChart28.getAntiAlias();
        java.awt.Paint paint31 = jFreeChart28.getBorderPaint();
        multiplePiePlot22.setAggregatedItemsPaint(paint31);
        multiplePiePlot16.setNoDataMessagePaint(paint31);
        jFreeChart4.setBorderPaint(paint31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot16", multiplePiePlot1.equals(multiplePiePlot16) ? multiplePiePlot1.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
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
        org.jfree.data.general.DatasetGroup datasetGroup17 = multiplePiePlot0.getDatasetGroup();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj16", obj3.equals(obj16) ? obj3.hashCode() == obj16.hashCode() : true);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot();
        float float16 = multiplePiePlot15.getBackgroundAlpha();
        java.awt.Paint paint17 = multiplePiePlot15.getNoDataMessagePaint();
        multiplePiePlot15.setForegroundAlpha((float) (-1L));
        java.awt.Paint paint20 = multiplePiePlot15.getOutlinePaint();
        multiplePiePlot15.setForegroundAlpha((float) (byte) 10);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot();
        float float25 = multiplePiePlot24.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot26 = multiplePiePlot24.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart27 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot24);
        java.awt.Paint paint28 = jFreeChart27.getBackgroundPaint();
        boolean boolean29 = jFreeChart27.isBorderVisible();
        boolean boolean30 = jFreeChart27.getAntiAlias();
        multiplePiePlot15.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart27);
        org.jfree.chart.title.TextTitle textTitle32 = jFreeChart27.getTitle();
        jFreeChart9.removeSubtitle((org.jfree.chart.title.Title) textTitle32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot24", obj1.equals(multiplePiePlot24) ? obj1.hashCode() == multiplePiePlot24.hashCode() : true);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot0.markerChanged(markerChangeEvent13);
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot43 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj44 = multiplePiePlot43.clone();
        multiplePiePlot43.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier47 = null;
        multiplePiePlot43.setDrawingSupplier(drawingSupplier47);
        multiplePiePlot43.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart51 = multiplePiePlot43.getPieChart();
        java.awt.Image image52 = null;
        multiplePiePlot43.setBackgroundImage(image52);
        org.jfree.chart.JFreeChart jFreeChart54 = multiplePiePlot43.getPieChart();
        java.awt.Image image55 = jFreeChart54.getBackgroundImage();
        jFreeChart54.clearSubtitles();
        java.awt.Stroke stroke57 = jFreeChart54.getBorderStroke();
        jFreeChart33.setBorderStroke(stroke57);
        multiplePiePlot0.setOutlineStroke(stroke57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot30", obj1.equals(multiplePiePlot30) ? obj1.hashCode() == multiplePiePlot30.hashCode() : true);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier17);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier19);
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot13.getPieChart();
        jFreeChart21.setNotify(false);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj25 = multiplePiePlot24.clone();
        multiplePiePlot24.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = null;
        multiplePiePlot24.setDrawingSupplier(drawingSupplier28);
        multiplePiePlot24.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart32 = multiplePiePlot24.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = jFreeChart32.getPadding();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot();
        float float36 = multiplePiePlot35.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot37 = multiplePiePlot35.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart38 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot35);
        jFreeChart38.fireChartChanged();
        boolean boolean40 = jFreeChart38.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle42 = jFreeChart38.getLegend((int) (short) 0);
        jFreeChart32.removeSubtitle((org.jfree.chart.title.Title) legendTitle42);
        jFreeChart21.removeSubtitle((org.jfree.chart.title.Title) legendTitle42);
        jFreeChart4.addSubtitle((org.jfree.chart.title.Title) legendTitle42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot35", multiplePiePlot1.equals(multiplePiePlot35) ? multiplePiePlot1.hashCode() == multiplePiePlot35.hashCode() : true);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier1 = multiplePiePlot0.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder2 = multiplePiePlot0.getDataExtractOrder();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent3 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent3);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        multiplePiePlot0.datasetChanged(datasetChangeEvent5);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot();
        float float9 = multiplePiePlot8.getBackgroundAlpha();
        java.awt.Paint paint10 = multiplePiePlot8.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart11 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot8);
        float float12 = multiplePiePlot8.getForegroundAlpha();
        java.awt.Paint paint13 = multiplePiePlot8.getAggregatedItemsPaint();
        float float14 = multiplePiePlot8.getForegroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = multiplePiePlot8.getInsets();
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
        multiplePiePlot8.setBackgroundImage((java.awt.Image) bufferedImage44);
        multiplePiePlot0.setBackgroundImage((java.awt.Image) bufferedImage44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot8 and multiplePiePlot16", multiplePiePlot8.equals(multiplePiePlot16) ? multiplePiePlot8.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
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
        org.jfree.data.general.DatasetGroup datasetGroup15 = multiplePiePlot4.getDatasetGroup();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot0 and obj5", multiplePiePlot0.equals(obj5) ? multiplePiePlot0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj15 = multiplePiePlot14.clone();
        multiplePiePlot14.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot14.setDrawingSupplier(drawingSupplier18);
        multiplePiePlot14.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot14.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart23 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot14);
        java.awt.Paint paint24 = jFreeChart23.getBackgroundPaint();
        java.awt.Paint paint25 = jFreeChart23.getBackgroundPaint();
        int int26 = jFreeChart23.getBackgroundImageAlignment();
        jFreeChart23.setAntiAlias(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = jFreeChart23.getPadding();
        plot8.setInsets(rectangleInsets29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj15", obj1.equals(obj15) ? obj1.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
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
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
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
        jFreeChart16.fireChartChanged();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder19 = multiplePiePlot18.getDataExtractOrder();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.util.TableOrder tableOrder21 = multiplePiePlot20.getDataExtractOrder();
        multiplePiePlot18.setDataExtractOrder(tableOrder21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = multiplePiePlot18.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection24 = multiplePiePlot18.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        multiplePiePlot18.setDataset(categoryDataset25);
        multiplePiePlot18.setLimit((double) (short) 1);
        java.awt.Paint paint29 = multiplePiePlot18.getOutlinePaint();
        jFreeChart16.setBackgroundPaint(paint29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj2 and multiplePiePlot20", obj2.equals(multiplePiePlot20) ? obj2.hashCode() == multiplePiePlot20.hashCode() : true);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj1 = multiplePiePlot0.clone();
        multiplePiePlot0.setBackgroundAlpha((float) (short) -1);
        org.jfree.data.category.CategoryDataset categoryDataset4 = multiplePiePlot0.getDataset();
        multiplePiePlot0.zoom((double) ' ');
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj8 = multiplePiePlot7.clone();
        multiplePiePlot7.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot7.setDrawingSupplier(drawingSupplier11);
        java.awt.Image image13 = multiplePiePlot7.getBackgroundImage();
        boolean boolean15 = multiplePiePlot7.equals((java.lang.Object) 1.0f);
        org.jfree.chart.JFreeChart jFreeChart16 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot) multiplePiePlot7);
        multiplePiePlot7.setNoDataMessage("");
        multiplePiePlot7.setNoDataMessage("hi!");
        multiplePiePlot7.setAggregatedItemsKey((java.lang.Comparable) false);
        java.awt.Paint paint23 = multiplePiePlot7.getOutlinePaint();
        multiplePiePlot0.setOutlinePaint(paint23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and obj8", obj1.equals(obj8) ? obj1.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
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
        java.lang.Object obj22 = jFreeChart21.getTextAntiAlias();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj8", multiplePiePlot1.equals(obj8) ? multiplePiePlot1.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
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
        jFreeChart4.setBackgroundImageAlpha((float) (byte) 1);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier17);
        multiplePiePlot13.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot13.getPieChart();
        org.jfree.chart.title.Title title23 = jFreeChart21.getSubtitle((int) (byte) 0);
        org.jfree.chart.plot.Plot plot24 = jFreeChart21.getPlot();
        plot24.setBackgroundImageAlignment((int) (short) 100);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot();
        float float29 = multiplePiePlot28.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot28.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart31 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot28);
        jFreeChart31.fireChartChanged();
        boolean boolean33 = jFreeChart31.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle35 = jFreeChart31.getLegend((int) (short) 0);
        plot24.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart31);
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = jFreeChart31.getPadding();
        jFreeChart4.setPadding(rectangleInsets37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot28", multiplePiePlot1.equals(multiplePiePlot28) ? multiplePiePlot1.hashCode() == multiplePiePlot28.hashCode() : true);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test706");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        float float19 = multiplePiePlot18.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot18.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart21 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot18);
        java.awt.Paint paint22 = jFreeChart21.getBackgroundPaint();
        java.awt.Stroke stroke23 = jFreeChart21.getBorderStroke();
        boolean boolean24 = jFreeChart21.isBorderVisible();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj26 = multiplePiePlot25.clone();
        multiplePiePlot25.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = null;
        multiplePiePlot25.setDrawingSupplier(drawingSupplier29);
        multiplePiePlot25.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart33 = multiplePiePlot25.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = jFreeChart33.getPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = jFreeChart33.getPadding();
        jFreeChart33.setAntiAlias(false);
        java.awt.Stroke stroke38 = jFreeChart33.getBorderStroke();
        jFreeChart21.setBorderStroke(stroke38);
        plot15.setOutlineStroke(stroke38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and multiplePiePlot18", obj1.equals(multiplePiePlot18) ? obj1.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test707");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj14 = multiplePiePlot13.clone();
        multiplePiePlot13.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier17);
        multiplePiePlot13.setForegroundAlpha(0.0f);
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot13.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = jFreeChart21.getPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = jFreeChart21.getPadding();
        jFreeChart21.setAntiAlias(false);
        java.awt.Stroke stroke26 = jFreeChart21.getBorderStroke();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.chart.plot.Plot plot28 = multiplePiePlot27.getParent();
        org.jfree.chart.LegendItemCollection legendItemCollection29 = multiplePiePlot27.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        multiplePiePlot27.setDataset(categoryDataset30);
        multiplePiePlot27.zoom(0.0d);
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot();
        float float36 = multiplePiePlot35.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot37 = multiplePiePlot35.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart38 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot35);
        jFreeChart38.fireChartChanged();
        boolean boolean40 = jFreeChart38.getAntiAlias();
        org.jfree.chart.title.LegendTitle legendTitle42 = jFreeChart38.getLegend((int) (short) 0);
        boolean boolean43 = jFreeChart38.isNotify();
        float float44 = jFreeChart38.getBackgroundImageAlpha();
        int int45 = jFreeChart38.getSubtitleCount();
        org.jfree.chart.ChartRenderingInfo chartRenderingInfo48 = null;
        java.awt.image.BufferedImage bufferedImage49 = jFreeChart38.createBufferedImage((int) (short) 1, 1, chartRenderingInfo48);
        multiplePiePlot27.setBackgroundImage((java.awt.Image) bufferedImage49);
        jFreeChart21.setBackgroundImage((java.awt.Image) bufferedImage49);
        jFreeChart4.setBackgroundImage((java.awt.Image) bufferedImage49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot35", multiplePiePlot1.equals(multiplePiePlot35) ? multiplePiePlot1.hashCode() == multiplePiePlot35.hashCode() : true);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test708");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot();
        float float13 = multiplePiePlot12.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart15 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot12);
        jFreeChart15.fireChartChanged();
        jFreeChart15.fireChartChanged();
        jFreeChart15.setTitle("hi!");
        org.jfree.chart.title.TextTitle textTitle20 = jFreeChart15.getTitle();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = jFreeChart15.getPadding();
        jFreeChart4.setPadding(rectangleInsets21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot12", multiplePiePlot1.equals(multiplePiePlot12) ? multiplePiePlot1.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test709");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj18 = multiplePiePlot17.clone();
        multiplePiePlot17.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = null;
        multiplePiePlot17.setDrawingSupplier(drawingSupplier21);
        multiplePiePlot17.setForegroundAlpha(0.0f);
        multiplePiePlot17.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        multiplePiePlot17.zoom((double) (byte) 0);
        java.awt.Paint paint29 = multiplePiePlot17.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart30 = new org.jfree.chart.JFreeChart("Multiple Pie Plot", (org.jfree.chart.plot.Plot) multiplePiePlot17);
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = multiplePiePlot17.getInsets();
        jFreeChart15.setPadding(rectangleInsets31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and obj18", obj3.equals(obj18) ? obj3.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test710");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot();
        float float17 = multiplePiePlot16.getBackgroundAlpha();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot16.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart19 = new org.jfree.chart.JFreeChart("hi!", (org.jfree.chart.plot.Plot) multiplePiePlot16);
        java.awt.Paint paint20 = jFreeChart19.getBackgroundPaint();
        java.awt.Stroke stroke21 = jFreeChart19.getBorderStroke();
        org.jfree.chart.title.TextTitle textTitle22 = jFreeChart19.getTitle();
        java.lang.Object obj23 = jFreeChart19.clone();
        java.awt.Stroke stroke24 = jFreeChart19.getBorderStroke();
        java.awt.Stroke stroke25 = jFreeChart19.getBorderStroke();
        int int26 = jFreeChart19.getBackgroundImageAlignment();
        org.jfree.chart.event.ChartProgressListener chartProgressListener27 = null;
        jFreeChart19.addProgressListener(chartProgressListener27);
        org.jfree.chart.title.TextTitle textTitle29 = jFreeChart19.getTitle();
        jFreeChart4.setTitle(textTitle29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot16", multiplePiePlot1.equals(multiplePiePlot16) ? multiplePiePlot1.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test711");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot();
        java.lang.Object obj29 = multiplePiePlot28.clone();
        multiplePiePlot28.setBackgroundAlpha((float) (short) -1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier32 = null;
        multiplePiePlot28.setDrawingSupplier(drawingSupplier32);
        multiplePiePlot28.zoom(0.0d);
        java.awt.Paint paint36 = multiplePiePlot28.getBackgroundPaint();
        multiplePiePlot0.setNoDataMessagePaint(paint36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and obj29", multiplePiePlot5.equals(obj29) ? multiplePiePlot5.hashCode() == obj29.hashCode() : true);
    }
}

