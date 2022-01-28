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
        java.awt.Stroke stroke22 = multiplePiePlot17.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot14", multiplePiePlot5.equals(multiplePiePlot14) ? multiplePiePlot5.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Image image10 = null;
        multiplePiePlot9.setBackgroundImage(image10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        multiplePiePlot13.addChangeListener(plotChangeListener15);
        java.awt.Image image17 = multiplePiePlot13.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot13.getPieChart();
        multiplePiePlot9.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = multiplePiePlot9.getDataset();
        java.awt.Paint paint21 = multiplePiePlot9.getAggregatedItemsPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart6 and jFreeChart18", jFreeChart6.equals(jFreeChart18) ? jFreeChart6.hashCode() == jFreeChart18.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Image image10 = null;
        multiplePiePlot9.setBackgroundImage(image10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        multiplePiePlot13.addChangeListener(plotChangeListener15);
        java.awt.Image image17 = multiplePiePlot13.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot13.getPieChart();
        multiplePiePlot9.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart18);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot13", multiplePiePlot9.equals(multiplePiePlot13) ? multiplePiePlot9.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
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
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.lang.String str15 = multiplePiePlot14.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        multiplePiePlot14.markerChanged(markerChangeEvent16);
        java.awt.Paint paint18 = multiplePiePlot14.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.lang.String str21 = multiplePiePlot20.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        multiplePiePlot20.addChangeListener(plotChangeListener22);
        java.awt.Image image24 = multiplePiePlot20.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart25 = multiplePiePlot20.getPieChart();
        multiplePiePlot14.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart25);
        multiplePiePlot1.setPieChart(jFreeChart25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot14 and multiplePiePlot20", multiplePiePlot14.equals(multiplePiePlot20) ? multiplePiePlot14.hashCode() == multiplePiePlot20.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        java.lang.String str7 = multiplePiePlot6.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        multiplePiePlot6.addChangeListener(plotChangeListener8);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = multiplePiePlot6.getDrawingSupplier();
        plot4.setDrawingSupplier(drawingSupplier10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on plot4 and multiplePiePlot6", plot4.equals(multiplePiePlot6) ? plot4.hashCode() == multiplePiePlot6.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.lang.String str11 = multiplePiePlot10.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot10.markerChanged(markerChangeEvent12);
        java.awt.Paint paint14 = multiplePiePlot10.getAggregatedItemsPaint();
        multiplePiePlot4.setAggregatedItemsPaint(paint14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot10", multiplePiePlot1.equals(multiplePiePlot10) ? multiplePiePlot1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot4.getInsets();
        float float10 = multiplePiePlot4.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.lang.String str13 = multiplePiePlot12.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener14 = null;
        multiplePiePlot12.addChangeListener(plotChangeListener14);
        boolean boolean16 = multiplePiePlot12.isSubplot();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot12.getRootPlot();
        multiplePiePlot4.setParent((org.jfree.chart.plot.Plot) multiplePiePlot12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot12", multiplePiePlot1.equals(multiplePiePlot12) ? multiplePiePlot1.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot7.markerChanged(markerChangeEvent9);
        java.awt.Paint paint11 = multiplePiePlot7.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        multiplePiePlot13.addChangeListener(plotChangeListener15);
        java.awt.Image image17 = multiplePiePlot13.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot13.getPieChart();
        multiplePiePlot7.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart18);
        multiplePiePlot1.setPieChart(jFreeChart18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot13", multiplePiePlot7.equals(multiplePiePlot13) ? multiplePiePlot7.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Image image10 = null;
        multiplePiePlot9.setBackgroundImage(image10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        multiplePiePlot13.addChangeListener(plotChangeListener15);
        java.awt.Image image17 = multiplePiePlot13.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot13.getPieChart();
        multiplePiePlot9.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart18);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot13", multiplePiePlot9.equals(multiplePiePlot13) ? multiplePiePlot9.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
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
        java.awt.Image image11 = null;
        multiplePiePlot10.setBackgroundImage(image11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.lang.String str15 = multiplePiePlot14.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot14.addChangeListener(plotChangeListener16);
        java.awt.Image image18 = multiplePiePlot14.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot14.getPieChart();
        multiplePiePlot10.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart19);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot10 and multiplePiePlot14", multiplePiePlot10.equals(multiplePiePlot14) ? multiplePiePlot10.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
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
        int int12 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot3 and multiplePiePlot1", multiplePiePlot3.equals(multiplePiePlot1) ? multiplePiePlot3.hashCode() == multiplePiePlot1.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
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
        org.jfree.chart.JFreeChart jFreeChart11 = multiplePiePlot1.getPieChart();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent12 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart8 and jFreeChart11", jFreeChart8.equals(jFreeChart11) ? jFreeChart8.hashCode() == jFreeChart11.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.awt.Image image5 = null;
        multiplePiePlot4.setBackgroundImage(image5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        multiplePiePlot8.addChangeListener(plotChangeListener10);
        java.awt.Image image12 = multiplePiePlot8.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart13 = multiplePiePlot8.getPieChart();
        multiplePiePlot4.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart13);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot8", multiplePiePlot4.equals(multiplePiePlot8) ? multiplePiePlot4.hashCode() == multiplePiePlot8.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
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
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        boolean boolean18 = multiplePiePlot17.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        boolean boolean21 = multiplePiePlot20.isSubplot();
        multiplePiePlot20.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot17.setParent((org.jfree.chart.plot.Plot) multiplePiePlot20);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = multiplePiePlot17.getDrawingSupplier();
        boolean boolean26 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier12 and drawingSupplier25", drawingSupplier12.equals(drawingSupplier25) ? drawingSupplier12.hashCode() == drawingSupplier25.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier14);
        boolean boolean17 = multiplePiePlot13.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot13.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.lang.String str21 = multiplePiePlot20.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        multiplePiePlot20.addChangeListener(plotChangeListener22);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = multiplePiePlot20.getDrawingSupplier();
        java.awt.Paint paint25 = multiplePiePlot20.getNoDataMessagePaint();
        multiplePiePlot13.setBackgroundPaint(paint25);
        multiplePiePlot4.setAggregatedItemsPaint(paint25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot20", multiplePiePlot1.equals(multiplePiePlot20) ? multiplePiePlot1.hashCode() == multiplePiePlot20.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Image image10 = null;
        multiplePiePlot9.setBackgroundImage(image10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        multiplePiePlot13.addChangeListener(plotChangeListener15);
        java.awt.Image image17 = multiplePiePlot13.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot13.getPieChart();
        multiplePiePlot9.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart18);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = multiplePiePlot9.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot13", multiplePiePlot9.equals(multiplePiePlot13) ? multiplePiePlot9.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
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
        org.jfree.data.category.CategoryDataset categoryDataset15 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        boolean boolean18 = multiplePiePlot17.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        boolean boolean21 = multiplePiePlot20.isSubplot();
        multiplePiePlot20.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot17.setParent((org.jfree.chart.plot.Plot) multiplePiePlot20);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = multiplePiePlot20.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot17", multiplePiePlot7.equals(multiplePiePlot17) ? multiplePiePlot7.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
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
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot11", multiplePiePlot7.equals(multiplePiePlot11) ? multiplePiePlot7.hashCode() == multiplePiePlot11.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        multiplePiePlot1.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.awt.Image image9 = null;
        multiplePiePlot8.setBackgroundImage(image9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.lang.String str13 = multiplePiePlot12.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener14 = null;
        multiplePiePlot12.addChangeListener(plotChangeListener14);
        java.awt.Image image16 = multiplePiePlot12.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot12.getPieChart();
        multiplePiePlot8.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart17);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot8 and multiplePiePlot12", multiplePiePlot8.equals(multiplePiePlot12) ? multiplePiePlot8.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent2);
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
        java.awt.Paint paint18 = multiplePiePlot5.getBackgroundPaint();
        multiplePiePlot1.setBackgroundPaint(paint18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot11", multiplePiePlot5.equals(multiplePiePlot11) ? multiplePiePlot5.hashCode() == multiplePiePlot11.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Image image4 = null;
        multiplePiePlot1.setBackgroundImage(image4);
        java.awt.Image image6 = multiplePiePlot1.getBackgroundImage();
        float float7 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.lang.String str10 = multiplePiePlot9.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        multiplePiePlot9.addChangeListener(plotChangeListener11);
        java.awt.Image image13 = multiplePiePlot9.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart14 = multiplePiePlot9.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = multiplePiePlot9.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        boolean boolean18 = multiplePiePlot17.isSubplot();
        java.awt.Paint paint19 = multiplePiePlot17.getBackgroundPaint();
        multiplePiePlot9.setAggregatedItemsPaint(paint19);
        multiplePiePlot1.setNoDataMessagePaint(paint19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot17", multiplePiePlot9.equals(multiplePiePlot17) ? multiplePiePlot9.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
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
        java.awt.Image image15 = null;
        multiplePiePlot14.setBackgroundImage(image15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        java.lang.String str19 = multiplePiePlot18.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        multiplePiePlot18.addChangeListener(plotChangeListener20);
        java.awt.Image image22 = multiplePiePlot18.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot18.getPieChart();
        multiplePiePlot14.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart23);
        multiplePiePlot1.setPieChart(jFreeChart23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot14", multiplePiePlot5.equals(multiplePiePlot14) ? multiplePiePlot5.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
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
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        java.lang.String str28 = multiplePiePlot27.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener29 = null;
        multiplePiePlot27.addChangeListener(plotChangeListener29);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = multiplePiePlot27.getDrawingSupplier();
        plot21.setDrawingSupplier(drawingSupplier31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot27", multiplePiePlot4.equals(multiplePiePlot27) ? multiplePiePlot4.hashCode() == multiplePiePlot27.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
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
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        java.lang.String str30 = multiplePiePlot29.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener31 = null;
        multiplePiePlot29.addChangeListener(plotChangeListener31);
        java.awt.Image image33 = multiplePiePlot29.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart34 = multiplePiePlot29.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = multiplePiePlot29.getInsets();
        multiplePiePlot27.setInsets(rectangleInsets35);
        org.jfree.chart.JFreeChart jFreeChart37 = multiplePiePlot27.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot27", multiplePiePlot4.equals(multiplePiePlot27) ? multiplePiePlot4.hashCode() == multiplePiePlot27.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        boolean boolean9 = multiplePiePlot8.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        boolean boolean12 = multiplePiePlot11.isSubplot();
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot8.setParent((org.jfree.chart.plot.Plot) multiplePiePlot11);
        java.awt.Stroke stroke16 = multiplePiePlot11.getOutlineStroke();
        multiplePiePlot6.setOutlineStroke(stroke16);
        multiplePiePlot1.setOutlineStroke(stroke16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot6 and multiplePiePlot8", multiplePiePlot6.equals(multiplePiePlot8) ? multiplePiePlot6.hashCode() == multiplePiePlot8.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.awt.Image image11 = null;
        multiplePiePlot10.setBackgroundImage(image11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.lang.String str15 = multiplePiePlot14.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot14.addChangeListener(plotChangeListener16);
        java.awt.Image image18 = multiplePiePlot14.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot14.getPieChart();
        multiplePiePlot10.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart19);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot10 and multiplePiePlot14", multiplePiePlot10.equals(multiplePiePlot14) ? multiplePiePlot10.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
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
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = null;
        multiplePiePlot18.setDrawingSupplier(drawingSupplier19);
        java.awt.Image image21 = null;
        multiplePiePlot18.setBackgroundImage(image21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.lang.String str25 = multiplePiePlot24.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener26 = null;
        multiplePiePlot24.addChangeListener(plotChangeListener26);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = multiplePiePlot24.getDrawingSupplier();
        multiplePiePlot18.setDrawingSupplier(drawingSupplier28);
        multiplePiePlot1.setDrawingSupplier(drawingSupplier28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot8 and multiplePiePlot18", multiplePiePlot8.equals(multiplePiePlot18) ? multiplePiePlot8.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
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
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot11.markerChanged(markerChangeEvent13);
        java.awt.Paint paint15 = multiplePiePlot11.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.lang.String str18 = multiplePiePlot17.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        multiplePiePlot17.addChangeListener(plotChangeListener19);
        java.awt.Image image21 = multiplePiePlot17.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot17.getPieChart();
        multiplePiePlot11.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart22);
        multiplePiePlot1.setPieChart(jFreeChart22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and multiplePiePlot17", multiplePiePlot11.equals(multiplePiePlot17) ? multiplePiePlot11.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.lang.Object obj5 = multiplePiePlot1.clone();
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
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and multiplePiePlot7", obj5.equals(multiplePiePlot7) ? obj5.hashCode() == multiplePiePlot7.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
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
        java.awt.Paint paint23 = multiplePiePlot1.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        java.lang.String str26 = multiplePiePlot25.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        multiplePiePlot25.markerChanged(markerChangeEvent27);
        java.awt.Paint paint29 = multiplePiePlot25.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        java.lang.String str32 = multiplePiePlot31.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener33 = null;
        multiplePiePlot31.addChangeListener(plotChangeListener33);
        java.awt.Image image35 = multiplePiePlot31.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart36 = multiplePiePlot31.getPieChart();
        multiplePiePlot25.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart36);
        multiplePiePlot1.setPieChart(jFreeChart36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot25", multiplePiePlot5.equals(multiplePiePlot25) ? multiplePiePlot5.hashCode() == multiplePiePlot25.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        java.lang.String str7 = multiplePiePlot6.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.lang.String str10 = multiplePiePlot9.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        multiplePiePlot9.markerChanged(markerChangeEvent11);
        java.awt.Paint paint13 = multiplePiePlot9.getAggregatedItemsPaint();
        multiplePiePlot6.setOutlinePaint(paint13);
        multiplePiePlot1.setBackgroundPaint(paint13);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        boolean boolean18 = multiplePiePlot17.isSubplot();
        java.awt.Paint paint19 = multiplePiePlot17.getBackgroundPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot17", multiplePiePlot9.equals(multiplePiePlot17) ? multiplePiePlot9.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        multiplePiePlot8.markerChanged(markerChangeEvent10);
        java.awt.Image image12 = multiplePiePlot8.getBackgroundImage();
        java.lang.Comparable comparable13 = multiplePiePlot8.getAggregatedItemsKey();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot8.markerChanged(markerChangeEvent14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.lang.String str18 = multiplePiePlot17.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        multiplePiePlot17.addChangeListener(plotChangeListener19);
        java.awt.Image image21 = multiplePiePlot17.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot17.getPieChart();
        multiplePiePlot8.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart22);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot8 and multiplePiePlot17", multiplePiePlot8.equals(multiplePiePlot17) ? multiplePiePlot8.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
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
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        boolean boolean25 = multiplePiePlot24.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        boolean boolean28 = multiplePiePlot27.isSubplot();
        multiplePiePlot27.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot24.setParent((org.jfree.chart.plot.Plot) multiplePiePlot27);
        java.awt.Paint paint32 = multiplePiePlot27.getOutlinePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot24", multiplePiePlot5.equals(multiplePiePlot24) ? multiplePiePlot5.hashCode() == multiplePiePlot24.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
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
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot16.setDrawingSupplier(drawingSupplier17);
        boolean boolean20 = multiplePiePlot16.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint21 = multiplePiePlot16.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection22 = multiplePiePlot16.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        boolean boolean25 = multiplePiePlot24.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        boolean boolean28 = multiplePiePlot27.isSubplot();
        multiplePiePlot27.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot24.setParent((org.jfree.chart.plot.Plot) multiplePiePlot27);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier32 = multiplePiePlot24.getDrawingSupplier();
        multiplePiePlot16.setDrawingSupplier(drawingSupplier32);
        java.lang.String str34 = multiplePiePlot16.getNoDataMessage();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot16);
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot37 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset36);
        boolean boolean38 = multiplePiePlot37.isSubplot();
        java.awt.Paint paint39 = multiplePiePlot37.getBackgroundPaint();
        multiplePiePlot1.setOutlinePaint(paint39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot16 and multiplePiePlot24", multiplePiePlot16.equals(multiplePiePlot24) ? multiplePiePlot16.hashCode() == multiplePiePlot24.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        boolean boolean7 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        multiplePiePlot1.setOutlinePaint(paint8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        multiplePiePlot13.addChangeListener(plotChangeListener15);
        java.awt.Image image17 = multiplePiePlot13.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot13.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = multiplePiePlot13.getInsets();
        multiplePiePlot11.setInsets(rectangleInsets19);
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot11.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot11", multiplePiePlot1.equals(multiplePiePlot11) ? multiplePiePlot1.hashCode() == multiplePiePlot11.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
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
        java.awt.Image image11 = null;
        multiplePiePlot10.setBackgroundImage(image11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.lang.String str15 = multiplePiePlot14.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot14.addChangeListener(plotChangeListener16);
        java.awt.Image image18 = multiplePiePlot14.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot14.getPieChart();
        multiplePiePlot10.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart19);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot10 and multiplePiePlot14", multiplePiePlot10.equals(multiplePiePlot14) ? multiplePiePlot10.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.lang.String str17 = multiplePiePlot16.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        multiplePiePlot16.markerChanged(markerChangeEvent18);
        java.awt.Paint paint20 = multiplePiePlot16.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.lang.String str23 = multiplePiePlot22.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        multiplePiePlot22.addChangeListener(plotChangeListener24);
        java.awt.Image image26 = multiplePiePlot22.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart27 = multiplePiePlot22.getPieChart();
        multiplePiePlot16.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart27);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot16 and multiplePiePlot22", multiplePiePlot16.equals(multiplePiePlot22) ? multiplePiePlot16.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot3 and multiplePiePlot1", multiplePiePlot3.equals(multiplePiePlot1) ? multiplePiePlot3.hashCode() == multiplePiePlot1.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getParent();
        int int7 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Image image10 = null;
        multiplePiePlot9.setBackgroundImage(image10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        multiplePiePlot13.addChangeListener(plotChangeListener15);
        java.awt.Image image17 = multiplePiePlot13.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot13.getPieChart();
        multiplePiePlot9.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart18);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot13", multiplePiePlot9.equals(multiplePiePlot13) ? multiplePiePlot9.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
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
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        multiplePiePlot1.setDataset(categoryDataset13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        boolean boolean17 = multiplePiePlot16.isSubplot();
        java.awt.Paint paint18 = multiplePiePlot16.getBackgroundPaint();
        java.awt.Paint paint19 = multiplePiePlot16.getNoDataMessagePaint();
        java.awt.Paint paint20 = multiplePiePlot16.getNoDataMessagePaint();
        multiplePiePlot1.setOutlinePaint(paint20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot16", multiplePiePlot7.equals(multiplePiePlot16) ? multiplePiePlot7.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = null;
        multiplePiePlot8.setDrawingSupplier(drawingSupplier9);
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot8.getParent();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent12 = null;
        multiplePiePlot8.datasetChanged(datasetChangeEvent12);
        multiplePiePlot8.setAggregatedItemsKey((java.lang.Comparable) (-1));
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        boolean boolean18 = multiplePiePlot17.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        boolean boolean21 = multiplePiePlot20.isSubplot();
        multiplePiePlot20.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot17.setParent((org.jfree.chart.plot.Plot) multiplePiePlot20);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = multiplePiePlot20.getInsets();
        multiplePiePlot8.setInsets(rectangleInsets25, false);
        multiplePiePlot1.setInsets(rectangleInsets25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot17", multiplePiePlot1.equals(multiplePiePlot17) ? multiplePiePlot1.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
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
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        java.lang.String str28 = multiplePiePlot27.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        multiplePiePlot27.markerChanged(markerChangeEvent29);
        java.awt.Paint paint31 = multiplePiePlot27.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        java.lang.String str34 = multiplePiePlot33.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener35 = null;
        multiplePiePlot33.addChangeListener(plotChangeListener35);
        java.awt.Image image37 = multiplePiePlot33.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart38 = multiplePiePlot33.getPieChart();
        multiplePiePlot27.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart38);
        java.awt.Paint paint40 = multiplePiePlot27.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset41 = multiplePiePlot27.getDataset();
        java.awt.Stroke stroke42 = multiplePiePlot27.getOutlineStroke();
        plot21.setOutlineStroke(stroke42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot27", multiplePiePlot4.equals(multiplePiePlot27) ? multiplePiePlot4.hashCode() == multiplePiePlot27.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
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
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent12 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot3 and multiplePiePlot1", multiplePiePlot3.equals(multiplePiePlot1) ? multiplePiePlot3.hashCode() == multiplePiePlot1.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        double double5 = multiplePiePlot1.getLimit();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot1.getInsets();
        org.jfree.chart.util.TableOrder tableOrder8 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.lang.String str11 = multiplePiePlot10.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot10.markerChanged(markerChangeEvent12);
        java.awt.Paint paint14 = multiplePiePlot10.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.lang.String str17 = multiplePiePlot16.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        multiplePiePlot16.addChangeListener(plotChangeListener18);
        java.awt.Image image20 = multiplePiePlot16.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot16.getPieChart();
        multiplePiePlot10.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart21);
        java.awt.Paint paint23 = multiplePiePlot10.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset24 = multiplePiePlot10.getDataset();
        java.awt.Stroke stroke25 = multiplePiePlot10.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot10 and multiplePiePlot16", multiplePiePlot10.equals(multiplePiePlot16) ? multiplePiePlot10.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
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
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        multiplePiePlot13.addChangeListener(plotChangeListener15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = multiplePiePlot13.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = multiplePiePlot13.getInsets();
        plot11.setInsets(rectangleInsets18, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on plot11 and multiplePiePlot3", plot11.equals(multiplePiePlot3) ? plot11.hashCode() == multiplePiePlot3.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot11.markerChanged(markerChangeEvent13);
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
        multiplePiePlot11.setBackgroundPaint(paint23);
        multiplePiePlot1.setBackgroundPaint(paint23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and multiplePiePlot19", multiplePiePlot11.equals(multiplePiePlot19) ? multiplePiePlot11.hashCode() == multiplePiePlot19.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
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
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.awt.Image image14 = null;
        multiplePiePlot13.setBackgroundImage(image14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.lang.String str18 = multiplePiePlot17.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        multiplePiePlot17.addChangeListener(plotChangeListener19);
        java.awt.Image image21 = multiplePiePlot17.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot17.getPieChart();
        multiplePiePlot13.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = multiplePiePlot13.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = multiplePiePlot13.getDrawingSupplier();
        java.awt.Font font26 = multiplePiePlot13.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot13", multiplePiePlot5.equals(multiplePiePlot13) ? multiplePiePlot5.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Image image4 = null;
        multiplePiePlot1.setBackgroundImage(image4);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        float float13 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.awt.Image image16 = null;
        multiplePiePlot15.setBackgroundImage(image16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        boolean boolean20 = multiplePiePlot19.isSubplot();
        java.awt.Paint paint21 = multiplePiePlot19.getBackgroundPaint();
        float float22 = multiplePiePlot19.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.lang.String str25 = multiplePiePlot24.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        multiplePiePlot24.markerChanged(markerChangeEvent26);
        java.awt.Paint paint28 = null;
        multiplePiePlot24.setBackgroundPaint(paint28);
        multiplePiePlot24.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font32 = multiplePiePlot24.getNoDataMessageFont();
        multiplePiePlot19.setNoDataMessageFont(font32);
        multiplePiePlot15.setNoDataMessageFont(font32);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent35 = null;
        multiplePiePlot15.notifyListeners(plotChangeEvent35);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot19", multiplePiePlot7.equals(multiplePiePlot19) ? multiplePiePlot7.hashCode() == multiplePiePlot19.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
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
        java.awt.Paint paint13 = multiplePiePlot4.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        boolean boolean16 = multiplePiePlot15.isSubplot();
        java.awt.Paint paint17 = multiplePiePlot15.getBackgroundPaint();
        java.awt.Paint paint18 = multiplePiePlot15.getNoDataMessagePaint();
        java.awt.Paint paint19 = multiplePiePlot15.getNoDataMessagePaint();
        multiplePiePlot4.setNoDataMessagePaint(paint19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot15", multiplePiePlot1.equals(multiplePiePlot15) ? multiplePiePlot1.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        multiplePiePlot8.addChangeListener(plotChangeListener10);
        java.awt.Image image12 = multiplePiePlot8.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart13 = multiplePiePlot8.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart13);
        org.jfree.chart.JFreeChart jFreeChart15 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart15 and jFreeChart13", jFreeChart15.equals(jFreeChart13) ? jFreeChart15.hashCode() == jFreeChart13.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
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
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        boolean boolean18 = multiplePiePlot17.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        boolean boolean21 = multiplePiePlot20.isSubplot();
        multiplePiePlot20.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot17.setParent((org.jfree.chart.plot.Plot) multiplePiePlot20);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = multiplePiePlot20.getInsets();
        multiplePiePlot20.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.util.TableOrder tableOrder28 = multiplePiePlot20.getDataExtractOrder();
        java.awt.Paint paint29 = multiplePiePlot20.getBackgroundPaint();
        multiplePiePlot1.setNoDataMessagePaint(paint29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot8 and multiplePiePlot17", multiplePiePlot8.equals(multiplePiePlot17) ? multiplePiePlot8.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        boolean boolean7 = plot6.isOutlineVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        plot6.handleClick((int) (short) 10, 1, plotRenderingInfo10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        plot6.handleClick((int) (byte) 10, 0, plotRenderingInfo14);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent16 = null;
        plot6.datasetChanged(datasetChangeEvent16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.lang.String str20 = multiplePiePlot19.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        multiplePiePlot19.addChangeListener(plotChangeListener21);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = multiplePiePlot19.getDrawingSupplier();
        java.awt.Paint paint24 = multiplePiePlot19.getNoDataMessagePaint();
        java.awt.Image image25 = null;
        multiplePiePlot19.setBackgroundImage(image25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        java.lang.String str29 = multiplePiePlot28.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        java.lang.String str32 = multiplePiePlot31.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent33 = null;
        multiplePiePlot31.markerChanged(markerChangeEvent33);
        java.awt.Paint paint35 = multiplePiePlot31.getAggregatedItemsPaint();
        multiplePiePlot28.setOutlinePaint(paint35);
        java.lang.String str37 = multiplePiePlot28.getPlotType();
        java.lang.String str38 = multiplePiePlot28.getNoDataMessage();
        float float39 = multiplePiePlot28.getBackgroundImageAlpha();
        int int40 = multiplePiePlot28.getBackgroundImageAlignment();
        java.awt.Paint paint41 = multiplePiePlot28.getNoDataMessagePaint();
        multiplePiePlot19.setOutlinePaint(paint41);
        plot6.setOutlinePaint(paint41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on plot6 and multiplePiePlot19", plot6.equals(multiplePiePlot19) ? plot6.hashCode() == multiplePiePlot19.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
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
        org.jfree.data.general.DatasetGroup datasetGroup26 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        boolean boolean29 = multiplePiePlot28.isSubplot();
        java.awt.Paint paint30 = multiplePiePlot28.getBackgroundPaint();
        java.awt.Stroke stroke31 = multiplePiePlot28.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot28", multiplePiePlot4.equals(multiplePiePlot28) ? multiplePiePlot4.hashCode() == multiplePiePlot28.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        boolean boolean7 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint8 = multiplePiePlot1.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.lang.String str11 = multiplePiePlot10.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        multiplePiePlot10.addChangeListener(plotChangeListener12);
        java.awt.Image image14 = multiplePiePlot10.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart15 = multiplePiePlot10.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = multiplePiePlot10.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot10", multiplePiePlot1.equals(multiplePiePlot10) ? multiplePiePlot1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
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
        org.jfree.data.category.CategoryDataset categoryDataset15 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        boolean boolean18 = multiplePiePlot17.isSubplot();
        java.awt.Paint paint19 = multiplePiePlot17.getBackgroundPaint();
        multiplePiePlot1.setNoDataMessagePaint(paint19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot17", multiplePiePlot7.equals(multiplePiePlot17) ? multiplePiePlot7.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
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
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot16.setDrawingSupplier(drawingSupplier17);
        boolean boolean20 = multiplePiePlot16.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint21 = multiplePiePlot16.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection22 = multiplePiePlot16.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        boolean boolean25 = multiplePiePlot24.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        boolean boolean28 = multiplePiePlot27.isSubplot();
        multiplePiePlot27.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot24.setParent((org.jfree.chart.plot.Plot) multiplePiePlot27);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier32 = multiplePiePlot24.getDrawingSupplier();
        multiplePiePlot16.setDrawingSupplier(drawingSupplier32);
        java.lang.String str34 = multiplePiePlot16.getNoDataMessage();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot16);
        int int36 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot16 and multiplePiePlot24", multiplePiePlot16.equals(multiplePiePlot24) ? multiplePiePlot16.hashCode() == multiplePiePlot24.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
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
        org.jfree.data.general.DatasetGroup datasetGroup26 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        java.lang.String str29 = multiplePiePlot28.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = null;
        multiplePiePlot28.markerChanged(markerChangeEvent30);
        java.awt.Paint paint32 = null;
        multiplePiePlot28.setBackgroundPaint(paint32);
        java.lang.Object obj34 = multiplePiePlot28.clone();
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        java.lang.String str37 = multiplePiePlot36.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener38 = null;
        multiplePiePlot36.addChangeListener(plotChangeListener38);
        java.awt.Image image40 = multiplePiePlot36.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart41 = multiplePiePlot36.getPieChart();
        multiplePiePlot28.setPieChart(jFreeChart41);
        multiplePiePlot1.setPieChart(jFreeChart41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot36", multiplePiePlot4.equals(multiplePiePlot36) ? multiplePiePlot4.hashCode() == multiplePiePlot36.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
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
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        java.lang.String str19 = multiplePiePlot18.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        multiplePiePlot18.addChangeListener(plotChangeListener20);
        java.awt.Image image22 = multiplePiePlot18.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot18.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        java.lang.String str26 = multiplePiePlot25.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        multiplePiePlot25.addChangeListener(plotChangeListener27);
        java.awt.Image image29 = multiplePiePlot25.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart30 = multiplePiePlot25.getPieChart();
        multiplePiePlot18.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart30);
        multiplePiePlot4.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot18", multiplePiePlot1.equals(multiplePiePlot18) ? multiplePiePlot1.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
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
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.awt.Image image20 = null;
        multiplePiePlot19.setBackgroundImage(image20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        java.lang.String str24 = multiplePiePlot23.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener25 = null;
        multiplePiePlot23.addChangeListener(plotChangeListener25);
        java.awt.Image image27 = multiplePiePlot23.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart28 = multiplePiePlot23.getPieChart();
        multiplePiePlot19.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = multiplePiePlot19.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = multiplePiePlot19.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot19", multiplePiePlot4.equals(multiplePiePlot19) ? multiplePiePlot4.hashCode() == multiplePiePlot19.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
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
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.awt.Image image17 = null;
        multiplePiePlot16.setBackgroundImage(image17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.lang.String str21 = multiplePiePlot20.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        multiplePiePlot20.addChangeListener(plotChangeListener22);
        java.awt.Image image24 = multiplePiePlot20.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart25 = multiplePiePlot20.getPieChart();
        multiplePiePlot16.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = multiplePiePlot16.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = multiplePiePlot16.getDrawingSupplier();
        java.awt.Font font29 = multiplePiePlot16.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot16", multiplePiePlot7.equals(multiplePiePlot16) ? multiplePiePlot7.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.setBackgroundImageAlpha(0.0f);
        java.awt.Stroke stroke10 = multiplePiePlot1.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.lang.String str13 = multiplePiePlot12.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot12.markerChanged(markerChangeEvent14);
        java.awt.Paint paint16 = null;
        multiplePiePlot12.setBackgroundPaint(paint16);
        java.lang.Object obj18 = multiplePiePlot12.clone();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.lang.String str21 = multiplePiePlot20.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        multiplePiePlot20.addChangeListener(plotChangeListener22);
        java.awt.Image image24 = multiplePiePlot20.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart25 = multiplePiePlot20.getPieChart();
        multiplePiePlot12.setPieChart(jFreeChart25);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot12 and obj18", multiplePiePlot12.equals(obj18) ? multiplePiePlot12.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint6 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        boolean boolean10 = multiplePiePlot9.isSubplot();
        multiplePiePlot9.setForegroundAlpha((float) 0L);
        java.awt.Paint paint13 = multiplePiePlot9.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.lang.String str16 = multiplePiePlot15.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        multiplePiePlot15.addChangeListener(plotChangeListener17);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = multiplePiePlot15.getDrawingSupplier();
        multiplePiePlot9.setDrawingSupplier(drawingSupplier19);
        plot7.setDrawingSupplier(drawingSupplier19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on plot7 and multiplePiePlot9", plot7.equals(multiplePiePlot9) ? plot7.hashCode() == multiplePiePlot9.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Image image4 = null;
        multiplePiePlot1.setBackgroundImage(image4);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        multiplePiePlot7.addChangeListener(plotChangeListener9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot7.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.lang.String str15 = multiplePiePlot14.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot14.addChangeListener(plotChangeListener16);
        java.awt.Image image18 = multiplePiePlot14.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot14.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = multiplePiePlot14.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        boolean boolean23 = multiplePiePlot22.isSubplot();
        java.awt.Paint paint24 = multiplePiePlot22.getBackgroundPaint();
        multiplePiePlot14.setAggregatedItemsPaint(paint24);
        multiplePiePlot1.setBackgroundPaint(paint24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot14", multiplePiePlot7.equals(multiplePiePlot14) ? multiplePiePlot7.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot14.setDrawingSupplier(drawingSupplier15);
        boolean boolean18 = multiplePiePlot14.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot14.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        java.lang.String str22 = multiplePiePlot21.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        multiplePiePlot21.addChangeListener(plotChangeListener23);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = multiplePiePlot21.getDrawingSupplier();
        java.awt.Paint paint26 = multiplePiePlot21.getNoDataMessagePaint();
        multiplePiePlot14.setBackgroundPaint(paint26);
        java.awt.Font font28 = multiplePiePlot14.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot21", multiplePiePlot4.equals(multiplePiePlot21) ? multiplePiePlot4.hashCode() == multiplePiePlot21.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
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
        org.jfree.data.category.CategoryDataset categoryDataset15 = multiplePiePlot1.getDataset();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        multiplePiePlot18.setForegroundAlpha((float) 0L);
        java.awt.Paint paint22 = multiplePiePlot18.getNoDataMessagePaint();
        java.awt.Paint paint23 = multiplePiePlot18.getBackgroundPaint();
        java.awt.Paint paint24 = multiplePiePlot18.getAggregatedItemsPaint();
        java.lang.Object obj25 = multiplePiePlot18.clone();
        java.awt.Font font26 = multiplePiePlot18.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot18 and obj25", multiplePiePlot18.equals(obj25) ? multiplePiePlot18.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
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
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        multiplePiePlot1.setDataset(categoryDataset13);
        multiplePiePlot1.setOutlineVisible(true);
        int int17 = multiplePiePlot1.getBackgroundImageAlignment();
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
        multiplePiePlot19.setForegroundAlpha(0.0f);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot22", multiplePiePlot7.equals(multiplePiePlot22) ? multiplePiePlot7.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
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
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot16.setDrawingSupplier(drawingSupplier17);
        boolean boolean20 = multiplePiePlot16.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint21 = multiplePiePlot16.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection22 = multiplePiePlot16.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        boolean boolean25 = multiplePiePlot24.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        boolean boolean28 = multiplePiePlot27.isSubplot();
        multiplePiePlot27.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot24.setParent((org.jfree.chart.plot.Plot) multiplePiePlot27);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier32 = multiplePiePlot24.getDrawingSupplier();
        multiplePiePlot16.setDrawingSupplier(drawingSupplier32);
        java.lang.String str34 = multiplePiePlot16.getNoDataMessage();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot16);
        java.lang.String str36 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot16 and multiplePiePlot24", multiplePiePlot16.equals(multiplePiePlot24) ? multiplePiePlot16.hashCode() == multiplePiePlot24.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.awt.Image image10 = null;
        multiplePiePlot9.setBackgroundImage(image10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        multiplePiePlot13.addChangeListener(plotChangeListener15);
        java.awt.Image image17 = multiplePiePlot13.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot13.getPieChart();
        multiplePiePlot9.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart18);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = multiplePiePlot9.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot13", multiplePiePlot9.equals(multiplePiePlot13) ? multiplePiePlot9.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
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
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        multiplePiePlot1.setDataset(categoryDataset12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot3 and multiplePiePlot1", multiplePiePlot3.equals(multiplePiePlot1) ? multiplePiePlot3.hashCode() == multiplePiePlot1.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
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
        int int13 = multiplePiePlot1.getBackgroundImageAlignment();
        java.lang.Object obj14 = multiplePiePlot1.clone();
        multiplePiePlot1.setForegroundAlpha((float) (byte) 1);
        java.awt.Paint paint17 = multiplePiePlot1.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        boolean boolean20 = multiplePiePlot19.isSubplot();
        java.awt.Paint paint21 = multiplePiePlot19.getBackgroundPaint();
        java.awt.Stroke stroke22 = multiplePiePlot19.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot19", multiplePiePlot4.equals(multiplePiePlot19) ? multiplePiePlot4.hashCode() == multiplePiePlot19.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot4.getInsets();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot4.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.lang.String str13 = multiplePiePlot12.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener14 = null;
        multiplePiePlot12.addChangeListener(plotChangeListener14);
        boolean boolean16 = multiplePiePlot12.isSubplot();
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = plot17.getDrawingSupplier();
        multiplePiePlot4.setDrawingSupplier(drawingSupplier18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot12", multiplePiePlot1.equals(multiplePiePlot12) ? multiplePiePlot1.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
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
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        multiplePiePlot13.markerChanged(markerChangeEvent15);
        java.awt.Image image17 = multiplePiePlot13.getBackgroundImage();
        java.lang.Comparable comparable18 = multiplePiePlot13.getAggregatedItemsKey();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        multiplePiePlot13.markerChanged(markerChangeEvent19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.lang.String str23 = multiplePiePlot22.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        multiplePiePlot22.addChangeListener(plotChangeListener24);
        java.awt.Image image26 = multiplePiePlot22.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart27 = multiplePiePlot22.getPieChart();
        multiplePiePlot13.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart27);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot13 and multiplePiePlot22", multiplePiePlot13.equals(multiplePiePlot22) ? multiplePiePlot13.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
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
        java.lang.Comparable comparable12 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot3 and multiplePiePlot1", multiplePiePlot3.equals(multiplePiePlot1) ? multiplePiePlot3.hashCode() == multiplePiePlot1.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.awt.Paint paint1 = multiplePiePlot0.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset2);
        java.awt.Image image4 = null;
        multiplePiePlot3.setBackgroundImage(image4);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        boolean boolean8 = multiplePiePlot7.isSubplot();
        java.awt.Paint paint9 = multiplePiePlot7.getBackgroundPaint();
        float float10 = multiplePiePlot7.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.lang.String str13 = multiplePiePlot12.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot12.markerChanged(markerChangeEvent14);
        java.awt.Paint paint16 = null;
        multiplePiePlot12.setBackgroundPaint(paint16);
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font20 = multiplePiePlot12.getNoDataMessageFont();
        multiplePiePlot7.setNoDataMessageFont(font20);
        multiplePiePlot3.setNoDataMessageFont(font20);
        boolean boolean23 = multiplePiePlot3.isSubplot();
        org.jfree.chart.util.TableOrder tableOrder24 = multiplePiePlot3.getDataExtractOrder();
        java.awt.Paint paint25 = multiplePiePlot3.getOutlinePaint();
        multiplePiePlot0.setAggregatedItemsPaint(paint25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot3 and multiplePiePlot7", multiplePiePlot3.equals(multiplePiePlot7) ? multiplePiePlot3.hashCode() == multiplePiePlot7.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
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
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        java.lang.String str19 = multiplePiePlot18.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        multiplePiePlot18.addChangeListener(plotChangeListener20);
        java.awt.Image image22 = multiplePiePlot18.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot18.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = multiplePiePlot18.getInsets();
        multiplePiePlot16.setInsets(rectangleInsets24);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = multiplePiePlot16.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot16 and multiplePiePlot18", multiplePiePlot16.equals(multiplePiePlot18) ? multiplePiePlot16.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot4.getInsets();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot4.getPieChart();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        multiplePiePlot4.drawBackgroundImage(graphics2D11, rectangle2D12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.awt.Image image16 = null;
        multiplePiePlot15.setBackgroundImage(image16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.lang.String str20 = multiplePiePlot19.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        multiplePiePlot19.addChangeListener(plotChangeListener21);
        java.awt.Image image23 = multiplePiePlot19.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot19.getPieChart();
        multiplePiePlot15.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart24);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = multiplePiePlot15.getDrawingSupplier();
        multiplePiePlot4.setDrawingSupplier(drawingSupplier26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot15", multiplePiePlot1.equals(multiplePiePlot15) ? multiplePiePlot1.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
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
        java.awt.Image image12 = null;
        multiplePiePlot11.setBackgroundImage(image12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        boolean boolean16 = multiplePiePlot15.isSubplot();
        java.awt.Paint paint17 = multiplePiePlot15.getBackgroundPaint();
        float float18 = multiplePiePlot15.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.lang.String str21 = multiplePiePlot20.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        multiplePiePlot20.markerChanged(markerChangeEvent22);
        java.awt.Paint paint24 = null;
        multiplePiePlot20.setBackgroundPaint(paint24);
        multiplePiePlot20.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font28 = multiplePiePlot20.getNoDataMessageFont();
        multiplePiePlot15.setNoDataMessageFont(font28);
        multiplePiePlot11.setNoDataMessageFont(font28);
        boolean boolean31 = multiplePiePlot11.isSubplot();
        org.jfree.chart.util.TableOrder tableOrder32 = multiplePiePlot11.getDataExtractOrder();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = multiplePiePlot11.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets33, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and multiplePiePlot15", multiplePiePlot11.equals(multiplePiePlot15) ? multiplePiePlot11.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Image image3 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.lang.String str13 = multiplePiePlot12.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener14 = null;
        multiplePiePlot12.addChangeListener(plotChangeListener14);
        java.awt.Image image16 = multiplePiePlot12.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot12.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = multiplePiePlot12.getInsets();
        multiplePiePlot10.setInsets(rectangleInsets18);
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot10.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot10 and multiplePiePlot12", multiplePiePlot10.equals(multiplePiePlot12) ? multiplePiePlot10.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
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
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        boolean boolean16 = multiplePiePlot15.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        multiplePiePlot18.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot15.setParent((org.jfree.chart.plot.Plot) multiplePiePlot18);
        java.awt.Paint paint23 = multiplePiePlot18.getOutlinePaint();
        multiplePiePlot1.setNoDataMessagePaint(paint23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot15", multiplePiePlot4.equals(multiplePiePlot15) ? multiplePiePlot4.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
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
        java.lang.Comparable comparable14 = multiplePiePlot4.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        boolean boolean17 = multiplePiePlot16.isSubplot();
        multiplePiePlot16.setForegroundAlpha((float) 0L);
        java.awt.Paint paint20 = multiplePiePlot16.getNoDataMessagePaint();
        java.awt.Paint paint21 = multiplePiePlot16.getBackgroundPaint();
        boolean boolean22 = multiplePiePlot16.isOutlineVisible();
        multiplePiePlot16.zoom((double) 0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        boolean boolean27 = multiplePiePlot26.isSubplot();
        multiplePiePlot26.setForegroundAlpha((float) 0L);
        java.awt.Paint paint30 = multiplePiePlot26.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        java.lang.String str33 = multiplePiePlot32.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener34 = null;
        multiplePiePlot32.addChangeListener(plotChangeListener34);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier36 = multiplePiePlot32.getDrawingSupplier();
        multiplePiePlot26.setDrawingSupplier(drawingSupplier36);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo40 = null;
        multiplePiePlot26.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo40);
        org.jfree.chart.JFreeChart jFreeChart42 = multiplePiePlot26.getPieChart();
        multiplePiePlot16.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart42);
        multiplePiePlot4.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot32", multiplePiePlot1.equals(multiplePiePlot32) ? multiplePiePlot1.hashCode() == multiplePiePlot32.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.lang.Object obj5 = multiplePiePlot1.clone();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D6, rectangle2D7);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        multiplePiePlot1.handleClick((int) (short) 1, 0, plotRenderingInfo11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        multiplePiePlot1.setDataset(categoryDataset13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.awt.Image image17 = null;
        multiplePiePlot16.setBackgroundImage(image17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.lang.String str21 = multiplePiePlot20.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        multiplePiePlot20.addChangeListener(plotChangeListener22);
        java.awt.Image image24 = multiplePiePlot20.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart25 = multiplePiePlot20.getPieChart();
        multiplePiePlot16.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart25);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent27 = null;
        multiplePiePlot16.datasetChanged(datasetChangeEvent27);
        org.jfree.chart.JFreeChart jFreeChart29 = multiplePiePlot16.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and multiplePiePlot16", obj5.equals(multiplePiePlot16) ? obj5.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
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
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        multiplePiePlot4.drawBackgroundImage(graphics2D14, rectangle2D15);
        java.lang.String str17 = multiplePiePlot4.getPlotType();
        float float18 = multiplePiePlot4.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        boolean boolean21 = multiplePiePlot20.isSubplot();
        java.awt.Paint paint22 = multiplePiePlot20.getBackgroundPaint();
        java.awt.Paint paint23 = multiplePiePlot20.getNoDataMessagePaint();
        multiplePiePlot20.setLimit((double) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = null;
        multiplePiePlot27.setDrawingSupplier(drawingSupplier28);
        boolean boolean31 = multiplePiePlot27.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot32 = multiplePiePlot27.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        java.lang.String str35 = multiplePiePlot34.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener36 = null;
        multiplePiePlot34.addChangeListener(plotChangeListener36);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier38 = multiplePiePlot34.getDrawingSupplier();
        java.awt.Paint paint39 = multiplePiePlot34.getNoDataMessagePaint();
        multiplePiePlot27.setBackgroundPaint(paint39);
        multiplePiePlot20.setBackgroundPaint(paint39);
        boolean boolean42 = multiplePiePlot4.equals((java.lang.Object) paint39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot34", multiplePiePlot1.equals(multiplePiePlot34) ? multiplePiePlot1.hashCode() == multiplePiePlot34.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        multiplePiePlot1.setNoDataMessage("");
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot11.markerChanged(markerChangeEvent13);
        java.awt.Paint paint15 = multiplePiePlot11.getAggregatedItemsPaint();
        multiplePiePlot8.setOutlinePaint(paint15);
        java.lang.String str17 = multiplePiePlot8.getPlotType();
        java.lang.String str18 = multiplePiePlot8.getNoDataMessage();
        float float19 = multiplePiePlot8.getBackgroundImageAlpha();
        int int20 = multiplePiePlot8.getBackgroundImageAlignment();
        java.lang.Object obj21 = multiplePiePlot8.clone();
        multiplePiePlot8.setForegroundAlpha((float) (byte) 1);
        java.awt.Paint paint24 = multiplePiePlot8.getOutlinePaint();
        boolean boolean25 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot8);
        java.awt.Paint paint26 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot8 and obj21", multiplePiePlot8.equals(obj21) ? multiplePiePlot8.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Stroke stroke9 = multiplePiePlot4.getOutlineStroke();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot();
        java.awt.Paint paint11 = multiplePiePlot10.getOutlinePaint();
        multiplePiePlot4.setNoDataMessagePaint(paint11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot10", multiplePiePlot1.equals(multiplePiePlot10) ? multiplePiePlot1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
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
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot16.setDrawingSupplier(drawingSupplier17);
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot16.getRootPlot();
        java.awt.Paint paint20 = multiplePiePlot16.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.lang.String str23 = multiplePiePlot22.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        multiplePiePlot22.markerChanged(markerChangeEvent24);
        java.awt.Paint paint26 = null;
        multiplePiePlot22.setBackgroundPaint(paint26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = multiplePiePlot22.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup29 = multiplePiePlot22.getDatasetGroup();
        java.awt.Paint paint30 = multiplePiePlot22.getOutlinePaint();
        multiplePiePlot16.setBackgroundPaint(paint30);
        multiplePiePlot1.setOutlinePaint(paint30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        boolean boolean35 = multiplePiePlot34.isSubplot();
        multiplePiePlot34.setForegroundAlpha((float) 0L);
        java.awt.Paint paint38 = multiplePiePlot34.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot40 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset39);
        java.lang.String str41 = multiplePiePlot40.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener42 = null;
        multiplePiePlot40.addChangeListener(plotChangeListener42);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier44 = multiplePiePlot40.getDrawingSupplier();
        multiplePiePlot34.setDrawingSupplier(drawingSupplier44);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo48 = null;
        multiplePiePlot34.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo48);
        java.awt.Paint paint50 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot34.setBackgroundPaint(paint50);
        multiplePiePlot1.setAggregatedItemsPaint(paint50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot40", multiplePiePlot7.equals(multiplePiePlot40) ? multiplePiePlot7.hashCode() == multiplePiePlot40.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
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
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.lang.String str16 = multiplePiePlot15.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        multiplePiePlot15.addChangeListener(plotChangeListener17);
        java.awt.Image image19 = multiplePiePlot15.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot15.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot15", multiplePiePlot5.equals(multiplePiePlot15) ? multiplePiePlot5.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.lang.String str10 = multiplePiePlot9.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        multiplePiePlot9.markerChanged(markerChangeEvent11);
        java.awt.Paint paint13 = null;
        multiplePiePlot9.setBackgroundPaint(paint13);
        multiplePiePlot9.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font17 = multiplePiePlot9.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font17);
        float float19 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        java.lang.String str22 = multiplePiePlot21.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        multiplePiePlot21.markerChanged(markerChangeEvent23);
        java.awt.Paint paint25 = multiplePiePlot21.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        java.lang.String str28 = multiplePiePlot27.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener29 = null;
        multiplePiePlot27.addChangeListener(plotChangeListener29);
        java.awt.Image image31 = multiplePiePlot27.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart32 = multiplePiePlot27.getPieChart();
        multiplePiePlot21.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart32);
        java.awt.Paint paint34 = multiplePiePlot21.getBackgroundPaint();
        int int35 = multiplePiePlot21.getBackgroundImageAlignment();
        java.awt.Paint paint36 = multiplePiePlot21.getNoDataMessagePaint();
        multiplePiePlot1.setNoDataMessagePaint(paint36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot21 and multiplePiePlot27", multiplePiePlot21.equals(multiplePiePlot27) ? multiplePiePlot21.hashCode() == multiplePiePlot27.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
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
        int int15 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        boolean boolean22 = multiplePiePlot21.isSubplot();
        multiplePiePlot21.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot18.setParent((org.jfree.chart.plot.Plot) multiplePiePlot21);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        multiplePiePlot18.handleClick((int) (short) -1, (-1), plotRenderingInfo28);
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot18.getRootPlot();
        org.jfree.data.general.DatasetGroup datasetGroup31 = multiplePiePlot18.getDatasetGroup();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot18);
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        java.awt.Image image35 = null;
        multiplePiePlot34.setBackgroundImage(image35);
        java.awt.Paint paint37 = multiplePiePlot34.getNoDataMessagePaint();
        multiplePiePlot18.setAggregatedItemsPaint(paint37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot7", multiplePiePlot1.equals(multiplePiePlot7) ? multiplePiePlot1.hashCode() == multiplePiePlot7.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
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
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        boolean boolean16 = multiplePiePlot15.isSubplot();
        java.awt.Paint paint17 = multiplePiePlot15.getBackgroundPaint();
        java.awt.Paint paint18 = multiplePiePlot15.getNoDataMessagePaint();
        multiplePiePlot15.setLimit((double) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = null;
        multiplePiePlot22.setDrawingSupplier(drawingSupplier23);
        boolean boolean26 = multiplePiePlot22.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot27 = multiplePiePlot22.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        java.lang.String str30 = multiplePiePlot29.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener31 = null;
        multiplePiePlot29.addChangeListener(plotChangeListener31);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier33 = multiplePiePlot29.getDrawingSupplier();
        java.awt.Paint paint34 = multiplePiePlot29.getNoDataMessagePaint();
        multiplePiePlot22.setBackgroundPaint(paint34);
        multiplePiePlot15.setBackgroundPaint(paint34);
        multiplePiePlot4.setAggregatedItemsPaint(paint34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot29", multiplePiePlot1.equals(multiplePiePlot29) ? multiplePiePlot1.hashCode() == multiplePiePlot29.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
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
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        boolean boolean22 = multiplePiePlot21.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        boolean boolean25 = multiplePiePlot24.isSubplot();
        multiplePiePlot24.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot21.setParent((org.jfree.chart.plot.Plot) multiplePiePlot24);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = null;
        multiplePiePlot30.setDrawingSupplier(drawingSupplier31);
        boolean boolean34 = multiplePiePlot30.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint35 = multiplePiePlot30.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection36 = multiplePiePlot30.getLegendItems();
        boolean boolean37 = multiplePiePlot30.isOutlineVisible();
        multiplePiePlot30.zoom((double) 10);
        org.jfree.chart.util.TableOrder tableOrder40 = multiplePiePlot30.getDataExtractOrder();
        java.awt.Paint paint41 = multiplePiePlot30.getAggregatedItemsPaint();
        multiplePiePlot30.setBackgroundAlpha((float) ' ');
        org.jfree.chart.JFreeChart jFreeChart44 = multiplePiePlot30.getPieChart();
        multiplePiePlot24.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart44);
        multiplePiePlot1.setPieChart(jFreeChart44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot21", multiplePiePlot7.equals(multiplePiePlot21) ? multiplePiePlot7.hashCode() == multiplePiePlot21.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        java.lang.String str7 = multiplePiePlot6.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.lang.String str10 = multiplePiePlot9.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        multiplePiePlot9.markerChanged(markerChangeEvent11);
        java.awt.Paint paint13 = multiplePiePlot9.getAggregatedItemsPaint();
        multiplePiePlot6.setOutlinePaint(paint13);
        java.lang.String str15 = multiplePiePlot6.getPlotType();
        java.lang.String str16 = multiplePiePlot6.getNoDataMessage();
        float float17 = multiplePiePlot6.getBackgroundImageAlpha();
        int int18 = multiplePiePlot6.getBackgroundImageAlignment();
        java.lang.Object obj19 = multiplePiePlot6.clone();
        multiplePiePlot6.setForegroundAlpha((float) (byte) 1);
        java.awt.Paint paint22 = multiplePiePlot6.getOutlinePaint();
        multiplePiePlot1.setNoDataMessagePaint(paint22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot6 and obj19", multiplePiePlot6.equals(obj19) ? multiplePiePlot6.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
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
        multiplePiePlot15.zoom((double) (short) -1);
        org.jfree.data.general.DatasetGroup datasetGroup33 = multiplePiePlot15.getDatasetGroup();
        java.awt.Stroke stroke34 = multiplePiePlot15.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot21", multiplePiePlot5.equals(multiplePiePlot21) ? multiplePiePlot5.hashCode() == multiplePiePlot21.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        multiplePiePlot1.setLimit(0.0d);
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
        java.lang.String str19 = multiplePiePlot9.getNoDataMessage();
        float float20 = multiplePiePlot9.getBackgroundImageAlpha();
        int int21 = multiplePiePlot9.getBackgroundImageAlignment();
        java.lang.Object obj22 = multiplePiePlot9.clone();
        java.awt.Paint paint23 = multiplePiePlot9.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and obj22", multiplePiePlot9.equals(obj22) ? multiplePiePlot9.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        boolean boolean7 = multiplePiePlot6.isSubplot();
        multiplePiePlot6.setForegroundAlpha((float) 0L);
        java.awt.Paint paint10 = multiplePiePlot6.getNoDataMessagePaint();
        java.awt.Paint paint11 = multiplePiePlot6.getBackgroundPaint();
        boolean boolean12 = multiplePiePlot6.isOutlineVisible();
        multiplePiePlot6.zoom((double) 0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        boolean boolean17 = multiplePiePlot16.isSubplot();
        multiplePiePlot16.setForegroundAlpha((float) 0L);
        java.awt.Paint paint20 = multiplePiePlot16.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.lang.String str23 = multiplePiePlot22.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        multiplePiePlot22.addChangeListener(plotChangeListener24);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = multiplePiePlot22.getDrawingSupplier();
        multiplePiePlot16.setDrawingSupplier(drawingSupplier26);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        multiplePiePlot16.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo30);
        org.jfree.chart.JFreeChart jFreeChart32 = multiplePiePlot16.getPieChart();
        multiplePiePlot6.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart32);
        multiplePiePlot1.setPieChart(jFreeChart32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot6 and multiplePiePlot16", multiplePiePlot6.equals(multiplePiePlot16) ? multiplePiePlot6.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
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
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        boolean boolean27 = multiplePiePlot26.isSubplot();
        java.awt.Paint paint28 = multiplePiePlot26.getBackgroundPaint();
        java.awt.Paint paint29 = multiplePiePlot26.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundPaint(paint29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot26", multiplePiePlot9.equals(multiplePiePlot26) ? multiplePiePlot9.hashCode() == multiplePiePlot26.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
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
        org.jfree.data.category.CategoryDataset categoryDataset56 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot57 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset56);
        java.lang.String str58 = multiplePiePlot57.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener59 = null;
        multiplePiePlot57.addChangeListener(plotChangeListener59);
        java.awt.Image image61 = multiplePiePlot57.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart62 = multiplePiePlot57.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot48 and multiplePiePlot57", multiplePiePlot48.equals(multiplePiePlot57) ? multiplePiePlot48.hashCode() == multiplePiePlot57.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        java.awt.Paint paint12 = multiplePiePlot10.getBackgroundPaint();
        java.awt.Image image13 = multiplePiePlot10.getBackgroundImage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot10.markerChanged(markerChangeEvent14);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = multiplePiePlot10.getDrawingSupplier();
        plot8.setDrawingSupplier(drawingSupplier16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on plot8 and multiplePiePlot10", plot8.equals(multiplePiePlot10) ? plot8.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        multiplePiePlot4.handleClick(1, (int) (short) -1, plotRenderingInfo18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        boolean boolean22 = multiplePiePlot21.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        boolean boolean25 = multiplePiePlot24.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        boolean boolean28 = multiplePiePlot27.isSubplot();
        multiplePiePlot27.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot24.setParent((org.jfree.chart.plot.Plot) multiplePiePlot27);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = multiplePiePlot27.getInsets();
        multiplePiePlot21.setInsets(rectangleInsets32);
        multiplePiePlot4.setInsets(rectangleInsets32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot21", multiplePiePlot1.equals(multiplePiePlot21) ? multiplePiePlot1.hashCode() == multiplePiePlot21.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
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
        multiplePiePlot1.setLimit((double) 15);
        double double17 = multiplePiePlot1.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.awt.Image image20 = null;
        multiplePiePlot19.setBackgroundImage(image20);
        multiplePiePlot19.zoom((double) 10L);
        org.jfree.data.general.DatasetGroup datasetGroup24 = multiplePiePlot19.getDatasetGroup();
        org.jfree.chart.JFreeChart jFreeChart25 = multiplePiePlot19.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot19", multiplePiePlot5.equals(multiplePiePlot19) ? multiplePiePlot5.hashCode() == multiplePiePlot19.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        java.awt.Paint paint9 = multiplePiePlot4.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot11.markerChanged(markerChangeEvent13);
        java.awt.Paint paint15 = null;
        multiplePiePlot11.setBackgroundPaint(paint15);
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
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
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = multiplePiePlot20.getInsets();
        multiplePiePlot11.setInsets(rectangleInsets32, false);
        multiplePiePlot4.setInsets(rectangleInsets32, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot23", multiplePiePlot1.equals(multiplePiePlot23) ? multiplePiePlot1.hashCode() == multiplePiePlot23.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
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
        int int15 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        boolean boolean22 = multiplePiePlot21.isSubplot();
        multiplePiePlot21.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot18.setParent((org.jfree.chart.plot.Plot) multiplePiePlot21);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        multiplePiePlot18.handleClick((int) (short) -1, (-1), plotRenderingInfo28);
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot18.getRootPlot();
        org.jfree.data.general.DatasetGroup datasetGroup31 = multiplePiePlot18.getDatasetGroup();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot18);
        multiplePiePlot1.setForegroundAlpha((-1.0f));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot18", multiplePiePlot7.equals(multiplePiePlot18) ? multiplePiePlot7.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        plot4.zoom(0.0d);
        org.jfree.chart.plot.Plot plot9 = plot4.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        multiplePiePlot11.addChangeListener(plotChangeListener13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = multiplePiePlot11.getDrawingSupplier();
        plot4.setDrawingSupplier(drawingSupplier15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on plot4 and multiplePiePlot11", plot4.equals(multiplePiePlot11) ? plot4.hashCode() == multiplePiePlot11.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        multiplePiePlot1.setLimit(0.0d);
        org.jfree.chart.LegendItemCollection legendItemCollection8 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.lang.String str13 = multiplePiePlot12.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener14 = null;
        multiplePiePlot12.addChangeListener(plotChangeListener14);
        java.awt.Image image16 = multiplePiePlot12.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot12.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = multiplePiePlot12.getInsets();
        multiplePiePlot10.setInsets(rectangleInsets18);
        multiplePiePlot1.setInsets(rectangleInsets18, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot10 and multiplePiePlot12", multiplePiePlot10.equals(multiplePiePlot12) ? multiplePiePlot10.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
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
        java.awt.Paint paint15 = null;
        multiplePiePlot1.setBackgroundPaint(paint15);
        multiplePiePlot1.setBackgroundAlpha((float) 1);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.awt.Image image21 = null;
        multiplePiePlot20.setBackgroundImage(image21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.lang.String str25 = multiplePiePlot24.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener26 = null;
        multiplePiePlot24.addChangeListener(plotChangeListener26);
        java.awt.Image image28 = multiplePiePlot24.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart29 = multiplePiePlot24.getPieChart();
        multiplePiePlot20.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart29);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot20", multiplePiePlot5.equals(multiplePiePlot20) ? multiplePiePlot5.hashCode() == multiplePiePlot20.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = plot11.getDrawingSupplier();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on plot11 and multiplePiePlot3", plot11.equals(multiplePiePlot3) ? plot11.hashCode() == multiplePiePlot3.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
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
        java.awt.Stroke stroke26 = multiplePiePlot1.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        java.awt.Image image29 = null;
        multiplePiePlot28.setBackgroundImage(image29);
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        java.lang.String str33 = multiplePiePlot32.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener34 = null;
        multiplePiePlot32.addChangeListener(plotChangeListener34);
        java.awt.Image image36 = multiplePiePlot32.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart37 = multiplePiePlot32.getPieChart();
        multiplePiePlot28.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart37);
        org.jfree.data.category.CategoryDataset categoryDataset39 = multiplePiePlot28.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier40 = multiplePiePlot28.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot28 and multiplePiePlot32", multiplePiePlot28.equals(multiplePiePlot32) ? multiplePiePlot28.hashCode() == multiplePiePlot32.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
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
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        java.lang.String str24 = multiplePiePlot23.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        multiplePiePlot23.markerChanged(markerChangeEvent25);
        float float27 = multiplePiePlot23.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        java.lang.String str30 = multiplePiePlot29.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        multiplePiePlot29.markerChanged(markerChangeEvent31);
        java.awt.Paint paint33 = multiplePiePlot29.getAggregatedItemsPaint();
        java.lang.Comparable comparable34 = multiplePiePlot29.getAggregatedItemsKey();
        multiplePiePlot29.setBackgroundImageAlpha((float) 0);
        java.awt.Font font37 = multiplePiePlot29.getNoDataMessageFont();
        double double38 = multiplePiePlot29.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot40 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset39);
        java.lang.String str41 = multiplePiePlot40.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent42 = null;
        multiplePiePlot40.markerChanged(markerChangeEvent42);
        java.awt.Paint paint44 = null;
        multiplePiePlot40.setBackgroundPaint(paint44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = multiplePiePlot40.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup47 = multiplePiePlot40.getDatasetGroup();
        java.awt.Paint paint48 = multiplePiePlot40.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets49 = multiplePiePlot40.getInsets();
        multiplePiePlot29.setInsets(rectangleInsets49, false);
        org.jfree.data.category.CategoryDataset categoryDataset52 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot53 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset52);
        boolean boolean54 = multiplePiePlot53.isSubplot();
        java.awt.Paint paint55 = multiplePiePlot53.getBackgroundPaint();
        float float56 = multiplePiePlot53.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset57 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot58 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset57);
        java.lang.String str59 = multiplePiePlot58.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent60 = null;
        multiplePiePlot58.markerChanged(markerChangeEvent60);
        java.awt.Paint paint62 = null;
        multiplePiePlot58.setBackgroundPaint(paint62);
        multiplePiePlot58.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font66 = multiplePiePlot58.getNoDataMessageFont();
        multiplePiePlot53.setNoDataMessageFont(font66);
        org.jfree.chart.plot.Plot plot68 = multiplePiePlot53.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset69 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot70 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset69);
        boolean boolean71 = multiplePiePlot70.isSubplot();
        java.awt.Paint paint72 = multiplePiePlot70.getBackgroundPaint();
        java.awt.Paint paint73 = multiplePiePlot70.getNoDataMessagePaint();
        java.awt.Paint paint74 = multiplePiePlot70.getNoDataMessagePaint();
        multiplePiePlot53.setOutlinePaint(paint74);
        multiplePiePlot29.setNoDataMessagePaint(paint74);
        multiplePiePlot23.setAggregatedItemsPaint(paint74);
        multiplePiePlot1.setOutlinePaint(paint74);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot70", multiplePiePlot4.equals(multiplePiePlot70) ? multiplePiePlot4.hashCode() == multiplePiePlot70.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
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
        boolean boolean23 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        java.awt.Image image26 = null;
        multiplePiePlot25.setBackgroundImage(image26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        boolean boolean30 = multiplePiePlot29.isSubplot();
        java.awt.Paint paint31 = multiplePiePlot29.getBackgroundPaint();
        float float32 = multiplePiePlot29.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        java.lang.String str35 = multiplePiePlot34.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent36 = null;
        multiplePiePlot34.markerChanged(markerChangeEvent36);
        java.awt.Paint paint38 = null;
        multiplePiePlot34.setBackgroundPaint(paint38);
        multiplePiePlot34.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font42 = multiplePiePlot34.getNoDataMessageFont();
        multiplePiePlot29.setNoDataMessageFont(font42);
        multiplePiePlot25.setNoDataMessageFont(font42);
        boolean boolean45 = multiplePiePlot25.isSubplot();
        org.jfree.chart.util.TableOrder tableOrder46 = multiplePiePlot25.getDataExtractOrder();
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = multiplePiePlot25.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets47, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot15 and multiplePiePlot25", multiplePiePlot15.equals(multiplePiePlot25) ? multiplePiePlot15.hashCode() == multiplePiePlot25.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        boolean boolean3 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = null;
        multiplePiePlot5.setDrawingSupplier(drawingSupplier6);
        boolean boolean9 = multiplePiePlot5.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint10 = multiplePiePlot5.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection11 = multiplePiePlot5.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        boolean boolean14 = multiplePiePlot13.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        boolean boolean17 = multiplePiePlot16.isSubplot();
        multiplePiePlot16.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot13.setParent((org.jfree.chart.plot.Plot) multiplePiePlot16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot13.getDrawingSupplier();
        multiplePiePlot5.setDrawingSupplier(drawingSupplier21);
        multiplePiePlot1.setDrawingSupplier(drawingSupplier21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot13", multiplePiePlot5.equals(multiplePiePlot13) ? multiplePiePlot5.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setOutlineVisible(false);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D5, rectangle2D6);
        int int8 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.awt.Image image11 = null;
        multiplePiePlot10.setBackgroundImage(image11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.lang.String str15 = multiplePiePlot14.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot14.addChangeListener(plotChangeListener16);
        java.awt.Image image18 = multiplePiePlot14.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot14.getPieChart();
        multiplePiePlot10.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart19);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot10 and multiplePiePlot14", multiplePiePlot10.equals(multiplePiePlot14) ? multiplePiePlot10.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Image image3 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.awt.Image image8 = null;
        multiplePiePlot7.setBackgroundImage(image8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        boolean boolean12 = multiplePiePlot11.isSubplot();
        java.awt.Paint paint13 = multiplePiePlot11.getBackgroundPaint();
        float float14 = multiplePiePlot11.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.lang.String str17 = multiplePiePlot16.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        multiplePiePlot16.markerChanged(markerChangeEvent18);
        java.awt.Paint paint20 = null;
        multiplePiePlot16.setBackgroundPaint(paint20);
        multiplePiePlot16.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font24 = multiplePiePlot16.getNoDataMessageFont();
        multiplePiePlot11.setNoDataMessageFont(font24);
        multiplePiePlot7.setNoDataMessageFont(font24);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent27 = null;
        multiplePiePlot7.notifyListeners(plotChangeEvent27);
        boolean boolean29 = multiplePiePlot1.equals((java.lang.Object) plotChangeEvent27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot11", multiplePiePlot7.equals(multiplePiePlot11) ? multiplePiePlot7.hashCode() == multiplePiePlot11.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
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
        int int15 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        boolean boolean22 = multiplePiePlot21.isSubplot();
        multiplePiePlot21.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot18.setParent((org.jfree.chart.plot.Plot) multiplePiePlot21);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        multiplePiePlot18.handleClick((int) (short) -1, (-1), plotRenderingInfo28);
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot18.getRootPlot();
        org.jfree.data.general.DatasetGroup datasetGroup31 = multiplePiePlot18.getDatasetGroup();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot18);
        java.lang.String str33 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot18", multiplePiePlot7.equals(multiplePiePlot18) ? multiplePiePlot7.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
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
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        boolean boolean29 = multiplePiePlot28.isSubplot();
        java.awt.Paint paint30 = multiplePiePlot28.getBackgroundPaint();
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        multiplePiePlot28.drawBackgroundImage(graphics2D31, rectangle2D32);
        java.awt.Stroke stroke34 = multiplePiePlot28.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot18 and multiplePiePlot28", multiplePiePlot18.equals(multiplePiePlot28) ? multiplePiePlot18.hashCode() == multiplePiePlot28.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Paint paint7 = plot6.getOutlinePaint();
        boolean boolean8 = plot6.isOutlineVisible();
        java.lang.Object obj9 = plot6.clone();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        plot6.notifyListeners(plotChangeEvent10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on plot6 and obj9", plot6.equals(obj9) ? plot6.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        java.awt.Image image7 = null;
        multiplePiePlot6.setBackgroundImage(image7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.lang.String str11 = multiplePiePlot10.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        multiplePiePlot10.addChangeListener(plotChangeListener12);
        java.awt.Image image14 = multiplePiePlot10.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart15 = multiplePiePlot10.getPieChart();
        multiplePiePlot6.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = multiplePiePlot6.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset18 = multiplePiePlot6.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.lang.String str21 = multiplePiePlot20.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        multiplePiePlot20.markerChanged(markerChangeEvent22);
        java.awt.Paint paint24 = null;
        multiplePiePlot20.setBackgroundPaint(paint24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = multiplePiePlot20.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup27 = multiplePiePlot20.getDatasetGroup();
        java.awt.Paint paint28 = multiplePiePlot20.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = multiplePiePlot20.getInsets();
        multiplePiePlot6.setInsets(rectangleInsets29);
        java.awt.Paint paint31 = multiplePiePlot6.getNoDataMessagePaint();
        multiplePiePlot1.setNoDataMessagePaint(paint31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot6 and multiplePiePlot10", multiplePiePlot6.equals(multiplePiePlot10) ? multiplePiePlot6.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
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
        org.jfree.chart.JFreeChart jFreeChart11 = multiplePiePlot1.getPieChart();
        java.awt.Font font12 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart8 and jFreeChart11", jFreeChart8.equals(jFreeChart11) ? jFreeChart8.hashCode() == jFreeChart11.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
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
        java.awt.Paint paint20 = multiplePiePlot18.getBackgroundPaint();
        float float21 = multiplePiePlot18.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        java.lang.String str24 = multiplePiePlot23.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        multiplePiePlot23.markerChanged(markerChangeEvent25);
        java.awt.Paint paint27 = null;
        multiplePiePlot23.setBackgroundPaint(paint27);
        multiplePiePlot23.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font31 = multiplePiePlot23.getNoDataMessageFont();
        multiplePiePlot18.setNoDataMessageFont(font31);
        org.jfree.chart.plot.Plot plot33 = multiplePiePlot18.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        boolean boolean36 = multiplePiePlot35.isSubplot();
        java.awt.Paint paint37 = multiplePiePlot35.getBackgroundPaint();
        java.awt.Paint paint38 = multiplePiePlot35.getNoDataMessagePaint();
        java.awt.Paint paint39 = multiplePiePlot35.getNoDataMessagePaint();
        multiplePiePlot18.setOutlinePaint(paint39);
        org.jfree.chart.JFreeChart jFreeChart41 = multiplePiePlot18.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot6 and multiplePiePlot23", multiplePiePlot6.equals(multiplePiePlot23) ? multiplePiePlot6.hashCode() == multiplePiePlot23.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        java.lang.Object obj7 = multiplePiePlot1.clone();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.lang.String str10 = multiplePiePlot9.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        multiplePiePlot9.addChangeListener(plotChangeListener11);
        java.awt.Image image13 = multiplePiePlot9.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart14 = multiplePiePlot9.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        boolean boolean18 = multiplePiePlot17.isSubplot();
        java.awt.Paint paint19 = multiplePiePlot17.getBackgroundPaint();
        java.lang.String str20 = multiplePiePlot17.getPlotType();
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot17.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot17", multiplePiePlot9.equals(multiplePiePlot17) ? multiplePiePlot9.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 10);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent4);
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot7.markerChanged(markerChangeEvent9);
        java.awt.Image image11 = multiplePiePlot7.getBackgroundImage();
        java.lang.Comparable comparable12 = multiplePiePlot7.getAggregatedItemsKey();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot7.markerChanged(markerChangeEvent13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.lang.String str17 = multiplePiePlot16.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        multiplePiePlot16.addChangeListener(plotChangeListener18);
        java.awt.Image image20 = multiplePiePlot16.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot16.getPieChart();
        multiplePiePlot7.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart21);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot16", multiplePiePlot7.equals(multiplePiePlot16) ? multiplePiePlot7.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Image image9 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        boolean boolean12 = multiplePiePlot11.isSubplot();
        java.awt.Image image13 = multiplePiePlot11.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection14 = multiplePiePlot11.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = multiplePiePlot11.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        boolean boolean18 = multiplePiePlot17.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        boolean boolean21 = multiplePiePlot20.isSubplot();
        multiplePiePlot20.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot17.setParent((org.jfree.chart.plot.Plot) multiplePiePlot20);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = multiplePiePlot17.getDrawingSupplier();
        multiplePiePlot11.setDrawingSupplier(drawingSupplier25);
        multiplePiePlot1.setDrawingSupplier(drawingSupplier25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and multiplePiePlot17", multiplePiePlot11.equals(multiplePiePlot17) ? multiplePiePlot11.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
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
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.awt.Image image16 = null;
        multiplePiePlot15.setBackgroundImage(image16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        boolean boolean20 = multiplePiePlot19.isSubplot();
        java.awt.Paint paint21 = multiplePiePlot19.getBackgroundPaint();
        float float22 = multiplePiePlot19.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.lang.String str25 = multiplePiePlot24.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        multiplePiePlot24.markerChanged(markerChangeEvent26);
        java.awt.Paint paint28 = null;
        multiplePiePlot24.setBackgroundPaint(paint28);
        multiplePiePlot24.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font32 = multiplePiePlot24.getNoDataMessageFont();
        multiplePiePlot19.setNoDataMessageFont(font32);
        multiplePiePlot15.setNoDataMessageFont(font32);
        multiplePiePlot1.setNoDataMessageFont(font32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot15", multiplePiePlot4.equals(multiplePiePlot15) ? multiplePiePlot4.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
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
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        boolean boolean16 = multiplePiePlot15.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        multiplePiePlot18.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot15.setParent((org.jfree.chart.plot.Plot) multiplePiePlot18);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = multiplePiePlot18.getInsets();
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot18.getPieChart();
        multiplePiePlot4.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot15", multiplePiePlot1.equals(multiplePiePlot15) ? multiplePiePlot1.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.util.TableOrder tableOrder7 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection8 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.lang.String str11 = multiplePiePlot10.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        multiplePiePlot10.addChangeListener(plotChangeListener12);
        java.awt.Image image14 = multiplePiePlot10.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart15 = multiplePiePlot10.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.lang.String str18 = multiplePiePlot17.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        multiplePiePlot17.addChangeListener(plotChangeListener19);
        java.awt.Image image21 = multiplePiePlot17.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot17.getPieChart();
        multiplePiePlot10.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart22);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot10 and multiplePiePlot17", multiplePiePlot10.equals(multiplePiePlot17) ? multiplePiePlot10.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
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
        org.jfree.data.general.DatasetGroup datasetGroup26 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        boolean boolean29 = multiplePiePlot28.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        boolean boolean32 = multiplePiePlot31.isSubplot();
        multiplePiePlot31.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot28.setParent((org.jfree.chart.plot.Plot) multiplePiePlot31);
        java.awt.Stroke stroke36 = multiplePiePlot31.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot28", multiplePiePlot4.equals(multiplePiePlot28) ? multiplePiePlot4.hashCode() == multiplePiePlot28.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent14 = null;
        multiplePiePlot4.axisChanged(axisChangeEvent14);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent16 = null;
        multiplePiePlot4.datasetChanged(datasetChangeEvent16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        boolean boolean20 = multiplePiePlot19.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        boolean boolean23 = multiplePiePlot22.isSubplot();
        multiplePiePlot22.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot19.setParent((org.jfree.chart.plot.Plot) multiplePiePlot22);
        java.awt.Stroke stroke27 = multiplePiePlot22.getOutlineStroke();
        multiplePiePlot22.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        multiplePiePlot22.setDataset(categoryDataset30);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent32 = null;
        multiplePiePlot22.notifyListeners(plotChangeEvent32);
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = multiplePiePlot22.getInsets();
        java.awt.Stroke stroke35 = multiplePiePlot22.getOutlineStroke();
        java.awt.Paint paint36 = multiplePiePlot22.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        java.lang.String str39 = multiplePiePlot38.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent40 = null;
        multiplePiePlot38.markerChanged(markerChangeEvent40);
        java.awt.Paint paint42 = null;
        multiplePiePlot38.setBackgroundPaint(paint42);
        multiplePiePlot38.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font46 = multiplePiePlot38.getNoDataMessageFont();
        java.awt.Paint paint47 = multiplePiePlot38.getAggregatedItemsPaint();
        multiplePiePlot22.setBackgroundPaint(paint47);
        multiplePiePlot4.setBackgroundPaint(paint47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot19", multiplePiePlot1.equals(multiplePiePlot19) ? multiplePiePlot1.hashCode() == multiplePiePlot19.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
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
        int int15 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        boolean boolean22 = multiplePiePlot21.isSubplot();
        multiplePiePlot21.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot18.setParent((org.jfree.chart.plot.Plot) multiplePiePlot21);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        multiplePiePlot18.handleClick((int) (short) -1, (-1), plotRenderingInfo28);
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot18.getRootPlot();
        org.jfree.data.general.DatasetGroup datasetGroup31 = multiplePiePlot18.getDatasetGroup();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot18);
        multiplePiePlot18.setOutlineVisible(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot7", multiplePiePlot1.equals(multiplePiePlot7) ? multiplePiePlot1.hashCode() == multiplePiePlot7.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
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
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.awt.Image image14 = null;
        multiplePiePlot13.setBackgroundImage(image14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.lang.String str18 = multiplePiePlot17.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        multiplePiePlot17.addChangeListener(plotChangeListener19);
        java.awt.Image image21 = multiplePiePlot17.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot17.getPieChart();
        multiplePiePlot13.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = multiplePiePlot13.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset25 = multiplePiePlot13.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection26 = multiplePiePlot13.getLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = multiplePiePlot13.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        java.lang.String str30 = multiplePiePlot29.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        multiplePiePlot29.markerChanged(markerChangeEvent31);
        java.awt.Paint paint33 = multiplePiePlot29.getAggregatedItemsPaint();
        java.lang.Comparable comparable34 = multiplePiePlot29.getAggregatedItemsKey();
        multiplePiePlot29.setBackgroundImageAlpha((float) 0);
        java.awt.Font font37 = multiplePiePlot29.getNoDataMessageFont();
        double double38 = multiplePiePlot29.getLimit();
        java.awt.Paint paint39 = multiplePiePlot29.getAggregatedItemsPaint();
        double double40 = multiplePiePlot29.getLimit();
        java.awt.Paint paint41 = multiplePiePlot29.getNoDataMessagePaint();
        multiplePiePlot13.setBackgroundPaint(paint41);
        multiplePiePlot1.setBackgroundPaint(paint41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier9 and drawingSupplier27", drawingSupplier9.equals(drawingSupplier27) ? drawingSupplier9.hashCode() == drawingSupplier27.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.lang.Object obj5 = multiplePiePlot1.clone();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot7.markerChanged(markerChangeEvent9);
        float float11 = multiplePiePlot7.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot7.getRootPlot();
        boolean boolean13 = multiplePiePlot7.isSubplot();
        java.awt.Paint paint14 = multiplePiePlot7.getOutlinePaint();
        java.awt.Paint paint15 = multiplePiePlot7.getOutlinePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and multiplePiePlot7", obj5.equals(multiplePiePlot7) ? obj5.hashCode() == multiplePiePlot7.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
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
        int int15 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        boolean boolean22 = multiplePiePlot21.isSubplot();
        multiplePiePlot21.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot18.setParent((org.jfree.chart.plot.Plot) multiplePiePlot21);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        multiplePiePlot18.handleClick((int) (short) -1, (-1), plotRenderingInfo28);
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot18.getRootPlot();
        org.jfree.data.general.DatasetGroup datasetGroup31 = multiplePiePlot18.getDatasetGroup();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot18);
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        boolean boolean35 = multiplePiePlot34.isSubplot();
        java.awt.Paint paint36 = multiplePiePlot34.getBackgroundPaint();
        float float37 = multiplePiePlot34.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot39 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset38);
        java.lang.String str40 = multiplePiePlot39.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent41 = null;
        multiplePiePlot39.markerChanged(markerChangeEvent41);
        java.awt.Paint paint43 = null;
        multiplePiePlot39.setBackgroundPaint(paint43);
        multiplePiePlot39.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font47 = multiplePiePlot39.getNoDataMessageFont();
        multiplePiePlot34.setNoDataMessageFont(font47);
        java.awt.Paint paint49 = multiplePiePlot34.getNoDataMessagePaint();
        java.awt.Font font50 = multiplePiePlot34.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot18", multiplePiePlot7.equals(multiplePiePlot18) ? multiplePiePlot7.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo8);
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
        java.lang.String str20 = multiplePiePlot11.getPlotType();
        java.lang.String str21 = multiplePiePlot11.getNoDataMessage();
        float float22 = multiplePiePlot11.getBackgroundImageAlpha();
        int int23 = multiplePiePlot11.getBackgroundImageAlignment();
        java.lang.Object obj24 = multiplePiePlot11.clone();
        java.awt.Paint paint25 = multiplePiePlot11.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart26 = multiplePiePlot11.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and obj24", multiplePiePlot11.equals(obj24) ? multiplePiePlot11.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
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
        java.lang.String str15 = multiplePiePlot4.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot17.setDrawingSupplier(drawingSupplier18);
        java.awt.Image image20 = null;
        multiplePiePlot17.setBackgroundImage(image20);
        java.awt.Image image22 = multiplePiePlot17.getBackgroundImage();
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
        multiplePiePlot17.setDrawingSupplier(drawingSupplier34);
        java.awt.Font font37 = multiplePiePlot17.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot38 = multiplePiePlot17.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot40 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset39);
        multiplePiePlot40.setAggregatedItemsKey((java.lang.Comparable) 10);
        org.jfree.chart.JFreeChart jFreeChart43 = multiplePiePlot40.getPieChart();
        multiplePiePlot17.setPieChart(jFreeChart43);
        multiplePiePlot4.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot17", multiplePiePlot1.equals(multiplePiePlot17) ? multiplePiePlot1.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
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
        float float15 = multiplePiePlot4.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        boolean boolean18 = multiplePiePlot17.isSubplot();
        java.awt.Paint paint19 = multiplePiePlot17.getBackgroundPaint();
        java.awt.Image image20 = multiplePiePlot17.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        boolean boolean23 = multiplePiePlot22.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        boolean boolean26 = multiplePiePlot25.isSubplot();
        multiplePiePlot25.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot22.setParent((org.jfree.chart.plot.Plot) multiplePiePlot25);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = multiplePiePlot25.getInsets();
        org.jfree.chart.JFreeChart jFreeChart31 = multiplePiePlot25.getPieChart();
        multiplePiePlot17.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart31);
        multiplePiePlot4.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot17", multiplePiePlot1.equals(multiplePiePlot17) ? multiplePiePlot1.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint8 = multiplePiePlot1.getBackgroundPaint();
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
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot10.setInsets(rectangleInsets19, true);
        multiplePiePlot1.setInsets(rectangleInsets19);
        java.awt.Paint paint23 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = null;
        multiplePiePlot25.setDrawingSupplier(drawingSupplier26);
        java.awt.Paint paint28 = multiplePiePlot25.getOutlinePaint();
        multiplePiePlot25.setBackgroundAlpha((float) (-1));
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        java.lang.String str33 = multiplePiePlot32.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener34 = null;
        multiplePiePlot32.addChangeListener(plotChangeListener34);
        multiplePiePlot32.setForegroundAlpha((float) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot39 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset38);
        boolean boolean40 = multiplePiePlot39.isSubplot();
        multiplePiePlot39.setForegroundAlpha((float) 0L);
        java.awt.Paint paint43 = multiplePiePlot39.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset44 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot45 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset44);
        java.lang.String str46 = multiplePiePlot45.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener47 = null;
        multiplePiePlot45.addChangeListener(plotChangeListener47);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier49 = multiplePiePlot45.getDrawingSupplier();
        multiplePiePlot39.setDrawingSupplier(drawingSupplier49);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo53 = null;
        multiplePiePlot39.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo53);
        float float55 = multiplePiePlot39.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset56 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot57 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset56);
        multiplePiePlot57.setAggregatedItemsKey((java.lang.Comparable) 10);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent60 = null;
        multiplePiePlot57.markerChanged(markerChangeEvent60);
        multiplePiePlot57.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.awt.Image image64 = multiplePiePlot57.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset65 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot66 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset65);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier67 = null;
        multiplePiePlot66.setDrawingSupplier(drawingSupplier67);
        org.jfree.chart.plot.Plot plot69 = multiplePiePlot66.getParent();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent70 = null;
        multiplePiePlot66.datasetChanged(datasetChangeEvent70);
        multiplePiePlot66.setAggregatedItemsKey((java.lang.Comparable) (-1));
        float float74 = multiplePiePlot66.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart75 = multiplePiePlot66.getPieChart();
        multiplePiePlot57.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart75);
        multiplePiePlot39.setPieChart(jFreeChart75);
        multiplePiePlot32.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart75);
        multiplePiePlot25.setPieChart(jFreeChart75);
        multiplePiePlot1.setPieChart(jFreeChart75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot13 and multiplePiePlot45", multiplePiePlot13.equals(multiplePiePlot45) ? multiplePiePlot13.hashCode() == multiplePiePlot45.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Paint paint7 = plot6.getOutlinePaint();
        boolean boolean8 = plot6.isOutlineVisible();
        java.lang.Object obj9 = plot6.clone();
        plot6.setForegroundAlpha((float) 1L);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on plot6 and obj9", plot6.equals(obj9) ? plot6.hashCode() == obj9.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
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
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent11 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.lang.String str15 = multiplePiePlot14.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        multiplePiePlot14.markerChanged(markerChangeEvent16);
        java.awt.Paint paint18 = multiplePiePlot14.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.lang.String str21 = multiplePiePlot20.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        multiplePiePlot20.addChangeListener(plotChangeListener22);
        java.awt.Image image24 = multiplePiePlot20.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart25 = multiplePiePlot20.getPieChart();
        multiplePiePlot14.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart25);
        java.lang.String str27 = multiplePiePlot14.getPlotType();
        float float28 = multiplePiePlot14.getForegroundAlpha();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = multiplePiePlot14.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot14", multiplePiePlot4.equals(multiplePiePlot14) ? multiplePiePlot4.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Image image3 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent7);
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
        java.lang.String str20 = multiplePiePlot10.getNoDataMessage();
        multiplePiePlot10.setForegroundAlpha(0.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = multiplePiePlot10.getInsets();
        java.lang.Object obj24 = multiplePiePlot10.clone();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = multiplePiePlot10.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot10 and obj24", multiplePiePlot10.equals(obj24) ? multiplePiePlot10.hashCode() == obj24.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        multiplePiePlot1.setNoDataMessage("");
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot11.markerChanged(markerChangeEvent13);
        java.awt.Paint paint15 = multiplePiePlot11.getAggregatedItemsPaint();
        multiplePiePlot8.setOutlinePaint(paint15);
        java.lang.String str17 = multiplePiePlot8.getPlotType();
        java.lang.String str18 = multiplePiePlot8.getNoDataMessage();
        float float19 = multiplePiePlot8.getBackgroundImageAlpha();
        int int20 = multiplePiePlot8.getBackgroundImageAlignment();
        java.lang.Object obj21 = multiplePiePlot8.clone();
        multiplePiePlot8.setForegroundAlpha((float) (byte) 1);
        java.awt.Paint paint24 = multiplePiePlot8.getOutlinePaint();
        boolean boolean25 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot8);
        java.awt.Paint paint26 = multiplePiePlot1.getOutlinePaint();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot8 and obj21", multiplePiePlot8.equals(obj21) ? multiplePiePlot8.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
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
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        boolean boolean23 = multiplePiePlot22.isSubplot();
        java.awt.Paint paint24 = multiplePiePlot22.getBackgroundPaint();
        float float25 = multiplePiePlot22.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        java.lang.String str28 = multiplePiePlot27.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        multiplePiePlot27.markerChanged(markerChangeEvent29);
        java.awt.Paint paint31 = null;
        multiplePiePlot27.setBackgroundPaint(paint31);
        multiplePiePlot27.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font35 = multiplePiePlot27.getNoDataMessageFont();
        multiplePiePlot22.setNoDataMessageFont(font35);
        multiplePiePlot4.setNoDataMessageFont(font35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot22", multiplePiePlot1.equals(multiplePiePlot22) ? multiplePiePlot1.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.awt.Image image14 = null;
        multiplePiePlot13.setBackgroundImage(image14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.lang.String str18 = multiplePiePlot17.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        multiplePiePlot17.addChangeListener(plotChangeListener19);
        java.awt.Image image21 = multiplePiePlot17.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot17.getPieChart();
        multiplePiePlot13.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = multiplePiePlot13.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset25 = multiplePiePlot13.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        java.lang.String str28 = multiplePiePlot27.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        multiplePiePlot27.markerChanged(markerChangeEvent29);
        java.awt.Paint paint31 = null;
        multiplePiePlot27.setBackgroundPaint(paint31);
        org.jfree.data.category.CategoryDataset categoryDataset33 = multiplePiePlot27.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup34 = multiplePiePlot27.getDatasetGroup();
        java.awt.Paint paint35 = multiplePiePlot27.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = multiplePiePlot27.getInsets();
        multiplePiePlot13.setInsets(rectangleInsets36);
        multiplePiePlot1.setInsets(rectangleInsets36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot13 and multiplePiePlot17", multiplePiePlot13.equals(multiplePiePlot17) ? multiplePiePlot13.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        float float3 = multiplePiePlot1.getForegroundAlpha();
        int int4 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Stroke stroke5 = multiplePiePlot1.getOutlineStroke();
        java.awt.Paint paint6 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        multiplePiePlot8.addChangeListener(plotChangeListener10);
        boolean boolean12 = multiplePiePlot8.isSubplot();
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot8.getRootPlot();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = plot13.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        boolean boolean18 = multiplePiePlot17.isSubplot();
        java.awt.Image image19 = multiplePiePlot17.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection20 = multiplePiePlot17.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = multiplePiePlot17.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        boolean boolean24 = multiplePiePlot23.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        boolean boolean27 = multiplePiePlot26.isSubplot();
        multiplePiePlot26.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot23.setParent((org.jfree.chart.plot.Plot) multiplePiePlot26);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = multiplePiePlot23.getDrawingSupplier();
        multiplePiePlot17.setDrawingSupplier(drawingSupplier31);
        java.awt.Paint paint33 = multiplePiePlot17.getAggregatedItemsPaint();
        multiplePiePlot1.setBackgroundPaint(paint33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot8 and multiplePiePlot17", multiplePiePlot8.equals(multiplePiePlot17) ? multiplePiePlot8.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
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
        org.jfree.chart.JFreeChart jFreeChart11 = multiplePiePlot1.getPieChart();
        java.lang.String str12 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart8 and jFreeChart11", jFreeChart8.equals(jFreeChart11) ? jFreeChart8.hashCode() == jFreeChart11.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Paint paint6 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Image image7 = null;
        multiplePiePlot1.setBackgroundImage(image7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        boolean boolean12 = multiplePiePlot11.isSubplot();
        multiplePiePlot11.setForegroundAlpha((float) 0L);
        java.awt.Paint paint15 = multiplePiePlot11.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.lang.String str18 = multiplePiePlot17.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        multiplePiePlot17.addChangeListener(plotChangeListener19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot17.getDrawingSupplier();
        multiplePiePlot11.setDrawingSupplier(drawingSupplier21);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        multiplePiePlot11.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo25);
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot11.setBackgroundPaint(paint27);
        org.jfree.chart.plot.Plot plot29 = multiplePiePlot11.getRootPlot();
        boolean boolean30 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier5 and drawingSupplier21", drawingSupplier5.equals(drawingSupplier21) ? drawingSupplier5.hashCode() == drawingSupplier21.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (byte) -1, (int) (short) 1, plotRenderingInfo7);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier13);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot12.getParent();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent16 = null;
        multiplePiePlot12.datasetChanged(datasetChangeEvent16);
        multiplePiePlot12.setAggregatedItemsKey((java.lang.Comparable) (-1));
        float float20 = multiplePiePlot12.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot12.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart21);
        multiplePiePlot1.setForegroundAlpha((float) (byte) 0);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        boolean boolean27 = multiplePiePlot26.isSubplot();
        multiplePiePlot26.setForegroundAlpha((float) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier32 = null;
        multiplePiePlot31.setDrawingSupplier(drawingSupplier32);
        float float34 = multiplePiePlot31.getBackgroundImageAlpha();
        java.awt.Paint paint35 = multiplePiePlot31.getBackgroundPaint();
        multiplePiePlot26.setAggregatedItemsPaint(paint35);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier37 = multiplePiePlot26.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier37);
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot40 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset39);
        boolean boolean41 = multiplePiePlot40.isSubplot();
        multiplePiePlot40.setForegroundAlpha((float) 0L);
        java.awt.Paint paint44 = multiplePiePlot40.getNoDataMessagePaint();
        java.awt.Paint paint45 = multiplePiePlot40.getBackgroundPaint();
        boolean boolean46 = multiplePiePlot40.isOutlineVisible();
        multiplePiePlot40.zoom((double) 0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset49 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot50 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset49);
        boolean boolean51 = multiplePiePlot50.isSubplot();
        multiplePiePlot50.setForegroundAlpha((float) 0L);
        java.awt.Paint paint54 = multiplePiePlot50.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset55 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot56 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset55);
        java.lang.String str57 = multiplePiePlot56.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener58 = null;
        multiplePiePlot56.addChangeListener(plotChangeListener58);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier60 = multiplePiePlot56.getDrawingSupplier();
        multiplePiePlot50.setDrawingSupplier(drawingSupplier60);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo64 = null;
        multiplePiePlot50.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo64);
        org.jfree.chart.JFreeChart jFreeChart66 = multiplePiePlot50.getPieChart();
        multiplePiePlot40.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart66);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot26 and multiplePiePlot40", multiplePiePlot26.equals(multiplePiePlot40) ? multiplePiePlot26.hashCode() == multiplePiePlot40.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
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
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        boolean boolean17 = multiplePiePlot16.isSubplot();
        multiplePiePlot16.setForegroundAlpha((float) 0L);
        java.awt.Paint paint20 = multiplePiePlot16.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.lang.String str23 = multiplePiePlot22.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        multiplePiePlot22.addChangeListener(plotChangeListener24);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = multiplePiePlot22.getDrawingSupplier();
        multiplePiePlot16.setDrawingSupplier(drawingSupplier26);
        multiplePiePlot1.setDrawingSupplier(drawingSupplier26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot22", multiplePiePlot5.equals(multiplePiePlot22) ? multiplePiePlot5.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        multiplePiePlot8.addChangeListener(plotChangeListener10);
        java.awt.Image image12 = multiplePiePlot8.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart13 = multiplePiePlot8.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart13);
        multiplePiePlot1.setOutlineVisible(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart6 and jFreeChart13", jFreeChart6.equals(jFreeChart13) ? jFreeChart6.hashCode() == jFreeChart13.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent7);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) -1);
        java.lang.Object obj11 = multiplePiePlot1.clone();
        multiplePiePlot1.setBackgroundAlpha(1.0f);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj11", multiplePiePlot1.equals(obj11) ? multiplePiePlot1.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
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
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        java.lang.String str28 = multiplePiePlot27.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        multiplePiePlot27.markerChanged(markerChangeEvent29);
        java.awt.Paint paint31 = null;
        multiplePiePlot27.setBackgroundPaint(paint31);
        multiplePiePlot27.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
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
        java.lang.String str45 = multiplePiePlot36.getPlotType();
        java.lang.String str46 = multiplePiePlot36.getNoDataMessage();
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = multiplePiePlot36.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets48 = multiplePiePlot36.getInsets();
        multiplePiePlot27.setInsets(rectangleInsets48, false);
        multiplePiePlot1.setInsets(rectangleInsets48, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot39", multiplePiePlot4.equals(multiplePiePlot39) ? multiplePiePlot4.hashCode() == multiplePiePlot39.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
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
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        boolean boolean25 = multiplePiePlot24.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        boolean boolean28 = multiplePiePlot27.isSubplot();
        multiplePiePlot27.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot24.setParent((org.jfree.chart.plot.Plot) multiplePiePlot27);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = multiplePiePlot27.getInsets();
        org.jfree.chart.JFreeChart jFreeChart33 = multiplePiePlot27.getPieChart();
        multiplePiePlot4.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot24", multiplePiePlot1.equals(multiplePiePlot24) ? multiplePiePlot1.hashCode() == multiplePiePlot24.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset1);
        boolean boolean3 = multiplePiePlot2.isSubplot();
        java.awt.Image image4 = multiplePiePlot2.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = multiplePiePlot2.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = multiplePiePlot2.getInsets();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = multiplePiePlot2.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        multiplePiePlot2.addChangeListener(plotChangeListener8);
        multiplePiePlot0.setParent((org.jfree.chart.plot.Plot) multiplePiePlot2);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        boolean boolean13 = multiplePiePlot12.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        boolean boolean16 = multiplePiePlot15.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        multiplePiePlot18.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot15.setParent((org.jfree.chart.plot.Plot) multiplePiePlot18);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = multiplePiePlot18.getInsets();
        multiplePiePlot12.setInsets(rectangleInsets23);
        multiplePiePlot2.setInsets(rectangleInsets23, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot0 and multiplePiePlot12", multiplePiePlot0.equals(multiplePiePlot12) ? multiplePiePlot0.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        multiplePiePlot1.handleClick((int) (short) 0, 15, plotRenderingInfo16);
        java.lang.Object obj18 = multiplePiePlot1.clone();
        org.jfree.data.general.DatasetGroup datasetGroup19 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and obj18", multiplePiePlot5.equals(obj18) ? multiplePiePlot5.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint6 = multiplePiePlot1.getBackgroundPaint();
        boolean boolean7 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.zoom((double) (byte) -1);
        org.jfree.chart.util.TableOrder tableOrder10 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.lang.String str15 = multiplePiePlot14.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot14.addChangeListener(plotChangeListener16);
        java.awt.Image image18 = multiplePiePlot14.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot14.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = multiplePiePlot14.getInsets();
        multiplePiePlot12.setInsets(rectangleInsets20);
        multiplePiePlot1.setInsets(rectangleInsets20, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot12 and multiplePiePlot14", multiplePiePlot12.equals(multiplePiePlot14) ? multiplePiePlot12.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
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
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        boolean boolean20 = multiplePiePlot19.isSubplot();
        java.awt.Paint paint21 = multiplePiePlot19.getBackgroundPaint();
        java.awt.Image image22 = multiplePiePlot19.getBackgroundImage();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent23 = null;
        multiplePiePlot19.notifyListeners(plotChangeEvent23);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        java.lang.String str27 = multiplePiePlot26.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        java.lang.String str30 = multiplePiePlot29.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        multiplePiePlot29.markerChanged(markerChangeEvent31);
        java.awt.Paint paint33 = multiplePiePlot29.getAggregatedItemsPaint();
        multiplePiePlot26.setOutlinePaint(paint33);
        java.lang.String str35 = multiplePiePlot26.getPlotType();
        java.lang.String str36 = multiplePiePlot26.getNoDataMessage();
        multiplePiePlot26.setForegroundAlpha(0.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = multiplePiePlot26.getInsets();
        multiplePiePlot19.setInsets(rectangleInsets39);
        java.awt.Font font41 = multiplePiePlot19.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot19", multiplePiePlot5.equals(multiplePiePlot19) ? multiplePiePlot5.hashCode() == multiplePiePlot19.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
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
        org.jfree.chart.util.TableOrder tableOrder14 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        boolean boolean17 = multiplePiePlot16.isSubplot();
        java.awt.Image image18 = multiplePiePlot16.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection19 = multiplePiePlot16.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = multiplePiePlot16.getInsets();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot16.getDrawingSupplier();
        boolean boolean22 = multiplePiePlot16.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.lang.String str25 = multiplePiePlot24.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        multiplePiePlot24.markerChanged(markerChangeEvent26);
        java.awt.Paint paint28 = multiplePiePlot24.getAggregatedItemsPaint();
        java.lang.Comparable comparable29 = multiplePiePlot24.getAggregatedItemsKey();
        multiplePiePlot24.setBackgroundImageAlpha((float) 0);
        java.awt.Font font32 = multiplePiePlot24.getNoDataMessageFont();
        java.awt.Paint paint33 = null;
        multiplePiePlot24.setOutlinePaint(paint33);
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        boolean boolean37 = multiplePiePlot36.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot39 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset38);
        boolean boolean40 = multiplePiePlot39.isSubplot();
        multiplePiePlot39.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot36.setParent((org.jfree.chart.plot.Plot) multiplePiePlot39);
        java.awt.Stroke stroke44 = multiplePiePlot39.getOutlineStroke();
        multiplePiePlot39.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset47 = null;
        multiplePiePlot39.setDataset(categoryDataset47);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent49 = null;
        multiplePiePlot39.notifyListeners(plotChangeEvent49);
        org.jfree.chart.util.RectangleInsets rectangleInsets51 = multiplePiePlot39.getInsets();
        boolean boolean52 = multiplePiePlot39.isSubplot();
        org.jfree.chart.util.TableOrder tableOrder53 = multiplePiePlot39.getDataExtractOrder();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent54 = null;
        multiplePiePlot39.markerChanged(markerChangeEvent54);
        org.jfree.chart.JFreeChart jFreeChart56 = multiplePiePlot39.getPieChart();
        java.awt.Paint paint57 = multiplePiePlot39.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart58 = multiplePiePlot39.getPieChart();
        multiplePiePlot24.setPieChart(jFreeChart58);
        multiplePiePlot16.setPieChart(jFreeChart58);
        multiplePiePlot1.setPieChart(jFreeChart58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot16", multiplePiePlot5.equals(multiplePiePlot16) ? multiplePiePlot5.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
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
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        java.awt.Image image32 = null;
        multiplePiePlot31.setBackgroundImage(image32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        java.lang.String str36 = multiplePiePlot35.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener37 = null;
        multiplePiePlot35.addChangeListener(plotChangeListener37);
        java.awt.Image image39 = multiplePiePlot35.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart40 = multiplePiePlot35.getPieChart();
        multiplePiePlot31.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart40);
        java.lang.String str42 = multiplePiePlot31.getNoDataMessage();
        java.awt.Font font43 = multiplePiePlot31.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot18 and multiplePiePlot31", multiplePiePlot18.equals(multiplePiePlot31) ? multiplePiePlot18.hashCode() == multiplePiePlot31.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
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
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.awt.Image image14 = null;
        multiplePiePlot13.setBackgroundImage(image14);
        java.awt.Paint paint16 = multiplePiePlot13.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundPaint(paint16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.lang.String str20 = multiplePiePlot19.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        multiplePiePlot19.markerChanged(markerChangeEvent21);
        java.awt.Paint paint23 = multiplePiePlot19.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        java.lang.String str26 = multiplePiePlot25.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        multiplePiePlot25.addChangeListener(plotChangeListener27);
        java.awt.Image image29 = multiplePiePlot25.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart30 = multiplePiePlot25.getPieChart();
        multiplePiePlot19.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart30);
        java.awt.Paint paint32 = multiplePiePlot19.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset33 = multiplePiePlot19.getDataset();
        java.awt.Stroke stroke34 = multiplePiePlot19.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        java.lang.String str37 = multiplePiePlot36.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener38 = null;
        multiplePiePlot36.addChangeListener(plotChangeListener38);
        multiplePiePlot36.setForegroundAlpha((float) (byte) 10);
        double double42 = multiplePiePlot36.getLimit();
        java.awt.Paint paint43 = multiplePiePlot36.getAggregatedItemsPaint();
        multiplePiePlot19.setNoDataMessagePaint(paint43);
        multiplePiePlot1.setOutlinePaint(paint43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot13 and multiplePiePlot25", multiplePiePlot13.equals(multiplePiePlot25) ? multiplePiePlot13.hashCode() == multiplePiePlot25.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent2);
        java.awt.Stroke stroke4 = multiplePiePlot1.getOutlineStroke();
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot7.markerChanged(markerChangeEvent9);
        java.awt.Paint paint11 = multiplePiePlot7.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        multiplePiePlot13.addChangeListener(plotChangeListener15);
        java.awt.Image image17 = multiplePiePlot13.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot13.getPieChart();
        multiplePiePlot7.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart18);
        java.awt.Paint paint20 = multiplePiePlot7.getBackgroundPaint();
        multiplePiePlot1.setNoDataMessagePaint(paint20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot13", multiplePiePlot7.equals(multiplePiePlot13) ? multiplePiePlot7.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        multiplePiePlot1.setBackgroundAlpha((-1.0f));
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        boolean boolean10 = multiplePiePlot9.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        boolean boolean13 = multiplePiePlot12.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        boolean boolean16 = multiplePiePlot15.isSubplot();
        multiplePiePlot15.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot12.setParent((org.jfree.chart.plot.Plot) multiplePiePlot15);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = multiplePiePlot15.getInsets();
        multiplePiePlot9.setInsets(rectangleInsets20);
        multiplePiePlot1.setInsets(rectangleInsets20, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot12", multiplePiePlot9.equals(multiplePiePlot12) ? multiplePiePlot9.hashCode() == multiplePiePlot12.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
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
        multiplePiePlot1.setOutlineVisible(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        multiplePiePlot1.handleClick((int) (byte) 10, (int) (byte) -1, plotRenderingInfo28);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        boolean boolean32 = multiplePiePlot31.isSubplot();
        java.awt.Paint paint33 = multiplePiePlot31.getBackgroundPaint();
        java.awt.Image image34 = multiplePiePlot31.getBackgroundImage();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent35 = null;
        multiplePiePlot31.notifyListeners(plotChangeEvent35);
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        java.lang.String str39 = multiplePiePlot38.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot41 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset40);
        java.lang.String str42 = multiplePiePlot41.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent43 = null;
        multiplePiePlot41.markerChanged(markerChangeEvent43);
        java.awt.Paint paint45 = multiplePiePlot41.getAggregatedItemsPaint();
        multiplePiePlot38.setOutlinePaint(paint45);
        java.lang.String str47 = multiplePiePlot38.getPlotType();
        java.lang.String str48 = multiplePiePlot38.getNoDataMessage();
        multiplePiePlot38.setForegroundAlpha(0.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets51 = multiplePiePlot38.getInsets();
        multiplePiePlot31.setInsets(rectangleInsets51);
        boolean boolean53 = multiplePiePlot1.equals((java.lang.Object) rectangleInsets51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot15 and multiplePiePlot31", multiplePiePlot15.equals(multiplePiePlot31) ? multiplePiePlot15.hashCode() == multiplePiePlot31.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
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
        multiplePiePlot1.setNoDataMessage("");
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.awt.Image image16 = null;
        multiplePiePlot15.setBackgroundImage(image16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.lang.String str20 = multiplePiePlot19.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        multiplePiePlot19.addChangeListener(plotChangeListener21);
        java.awt.Image image23 = multiplePiePlot19.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot19.getPieChart();
        multiplePiePlot15.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart24);
        java.lang.String str26 = multiplePiePlot15.getNoDataMessage();
        java.awt.Font font27 = multiplePiePlot15.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot15 and multiplePiePlot19", multiplePiePlot15.equals(multiplePiePlot19) ? multiplePiePlot15.hashCode() == multiplePiePlot19.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
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
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = null;
        multiplePiePlot28.setDrawingSupplier(drawingSupplier29);
        boolean boolean32 = multiplePiePlot28.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint33 = multiplePiePlot28.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection34 = multiplePiePlot28.getLegendItems();
        boolean boolean35 = multiplePiePlot28.isOutlineVisible();
        multiplePiePlot28.zoom((double) 10);
        org.jfree.chart.util.TableOrder tableOrder38 = multiplePiePlot28.getDataExtractOrder();
        java.awt.Paint paint39 = multiplePiePlot28.getAggregatedItemsPaint();
        multiplePiePlot28.setBackgroundAlpha((float) ' ');
        org.jfree.chart.JFreeChart jFreeChart42 = multiplePiePlot28.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart42);
        java.awt.Paint paint44 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.JFreeChart jFreeChart45 = multiplePiePlot1.getPieChart();
        int int46 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart42 and jFreeChart45", jFreeChart42.equals(jFreeChart45) ? jFreeChart42.hashCode() == jFreeChart45.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        boolean boolean14 = multiplePiePlot13.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        boolean boolean17 = multiplePiePlot16.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        boolean boolean20 = multiplePiePlot19.isSubplot();
        multiplePiePlot19.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot16.setParent((org.jfree.chart.plot.Plot) multiplePiePlot19);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = multiplePiePlot19.getInsets();
        multiplePiePlot13.setInsets(rectangleInsets24);
        multiplePiePlot1.setInsets(rectangleInsets24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot13 and multiplePiePlot16", multiplePiePlot13.equals(multiplePiePlot16) ? multiplePiePlot13.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
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
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        multiplePiePlot18.setForegroundAlpha((float) 0L);
        java.awt.Paint paint22 = multiplePiePlot18.getNoDataMessagePaint();
        java.awt.Paint paint23 = multiplePiePlot18.getBackgroundPaint();
        java.awt.Paint paint24 = multiplePiePlot18.getAggregatedItemsPaint();
        java.lang.Object obj25 = multiplePiePlot18.clone();
        java.awt.Font font26 = multiplePiePlot18.getNoDataMessageFont();
        multiplePiePlot4.setNoDataMessageFont(font26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot18 and obj25", multiplePiePlot18.equals(obj25) ? multiplePiePlot18.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
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
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D13, rectangle2D14);
        double double16 = multiplePiePlot1.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        java.lang.String str19 = multiplePiePlot18.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        multiplePiePlot18.markerChanged(markerChangeEvent20);
        java.awt.Paint paint22 = multiplePiePlot18.getAggregatedItemsPaint();
        java.lang.String str23 = multiplePiePlot18.getPlotType();
        multiplePiePlot18.zoom((double) 0.5f);
        multiplePiePlot18.setForegroundAlpha(1.0f);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        boolean boolean30 = multiplePiePlot29.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        boolean boolean33 = multiplePiePlot32.isSubplot();
        multiplePiePlot32.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot29.setParent((org.jfree.chart.plot.Plot) multiplePiePlot32);
        java.awt.Stroke stroke37 = multiplePiePlot32.getOutlineStroke();
        multiplePiePlot32.setBackgroundAlpha(0.0f);
        multiplePiePlot32.setBackgroundImageAlpha((float) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot43 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset42);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier44 = null;
        multiplePiePlot43.setDrawingSupplier(drawingSupplier44);
        double double46 = multiplePiePlot43.getLimit();
        multiplePiePlot43.setLimit((double) (short) 1);
        org.jfree.chart.JFreeChart jFreeChart49 = multiplePiePlot43.getPieChart();
        multiplePiePlot32.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart49);
        multiplePiePlot18.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart49);
        multiplePiePlot1.setPieChart(jFreeChart49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot18", multiplePiePlot5.equals(multiplePiePlot18) ? multiplePiePlot5.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
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
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) -1);
        java.awt.Stroke stroke15 = multiplePiePlot1.getOutlineStroke();
        boolean boolean16 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        java.awt.Image image19 = null;
        multiplePiePlot18.setBackgroundImage(image19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.lang.String str23 = multiplePiePlot22.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        multiplePiePlot22.addChangeListener(plotChangeListener24);
        java.awt.Image image26 = multiplePiePlot22.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart27 = multiplePiePlot22.getPieChart();
        multiplePiePlot18.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart27);
        org.jfree.data.category.CategoryDataset categoryDataset29 = multiplePiePlot18.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset30 = multiplePiePlot18.getDataset();
        org.jfree.chart.LegendItemCollection legendItemCollection31 = multiplePiePlot18.getLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier32 = multiplePiePlot18.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot18", multiplePiePlot4.equals(multiplePiePlot18) ? multiplePiePlot4.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
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
        java.awt.Paint paint15 = multiplePiePlot1.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot17.setDrawingSupplier(drawingSupplier18);
        boolean boolean21 = multiplePiePlot17.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot22 = multiplePiePlot17.getRootPlot();
        multiplePiePlot17.zoom((double) (short) 1);
        multiplePiePlot17.setForegroundAlpha((float) 15);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot17);
        boolean boolean28 = multiplePiePlot17.isOutlineVisible();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot5", multiplePiePlot1.equals(multiplePiePlot5) ? multiplePiePlot1.hashCode() == multiplePiePlot5.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        boolean boolean8 = multiplePiePlot7.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot7.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        java.awt.Stroke stroke15 = multiplePiePlot10.getOutlineStroke();
        multiplePiePlot10.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        multiplePiePlot10.setDataset(categoryDataset18);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent20 = null;
        multiplePiePlot10.notifyListeners(plotChangeEvent20);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.lang.String str25 = multiplePiePlot24.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        multiplePiePlot24.markerChanged(markerChangeEvent26);
        float float28 = multiplePiePlot24.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        multiplePiePlot24.setDataset(categoryDataset29);
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        multiplePiePlot24.setDataset(categoryDataset31);
        multiplePiePlot10.setParent((org.jfree.chart.plot.Plot) multiplePiePlot24);
        org.jfree.chart.util.TableOrder tableOrder34 = multiplePiePlot10.getDataExtractOrder();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot24", multiplePiePlot7.equals(multiplePiePlot24) ? multiplePiePlot7.hashCode() == multiplePiePlot24.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
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
        int int15 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        boolean boolean22 = multiplePiePlot21.isSubplot();
        multiplePiePlot21.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot18.setParent((org.jfree.chart.plot.Plot) multiplePiePlot21);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        multiplePiePlot18.handleClick((int) (short) -1, (-1), plotRenderingInfo28);
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot18.getRootPlot();
        org.jfree.data.general.DatasetGroup datasetGroup31 = multiplePiePlot18.getDatasetGroup();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot18);
        float float33 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot18", multiplePiePlot7.equals(multiplePiePlot18) ? multiplePiePlot7.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
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
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0.0d);
        float float20 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        boolean boolean23 = multiplePiePlot22.isSubplot();
        java.awt.Image image24 = multiplePiePlot22.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection25 = multiplePiePlot22.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = multiplePiePlot22.getInsets();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = multiplePiePlot22.getDrawingSupplier();
        boolean boolean28 = multiplePiePlot22.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        java.lang.String str31 = multiplePiePlot30.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        multiplePiePlot30.markerChanged(markerChangeEvent32);
        java.awt.Paint paint34 = multiplePiePlot30.getAggregatedItemsPaint();
        java.lang.Comparable comparable35 = multiplePiePlot30.getAggregatedItemsKey();
        multiplePiePlot30.setBackgroundImageAlpha((float) 0);
        java.awt.Font font38 = multiplePiePlot30.getNoDataMessageFont();
        java.awt.Paint paint39 = null;
        multiplePiePlot30.setOutlinePaint(paint39);
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot42 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset41);
        boolean boolean43 = multiplePiePlot42.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset44 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot45 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset44);
        boolean boolean46 = multiplePiePlot45.isSubplot();
        multiplePiePlot45.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot42.setParent((org.jfree.chart.plot.Plot) multiplePiePlot45);
        java.awt.Stroke stroke50 = multiplePiePlot45.getOutlineStroke();
        multiplePiePlot45.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset53 = null;
        multiplePiePlot45.setDataset(categoryDataset53);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent55 = null;
        multiplePiePlot45.notifyListeners(plotChangeEvent55);
        org.jfree.chart.util.RectangleInsets rectangleInsets57 = multiplePiePlot45.getInsets();
        boolean boolean58 = multiplePiePlot45.isSubplot();
        org.jfree.chart.util.TableOrder tableOrder59 = multiplePiePlot45.getDataExtractOrder();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent60 = null;
        multiplePiePlot45.markerChanged(markerChangeEvent60);
        org.jfree.chart.JFreeChart jFreeChart62 = multiplePiePlot45.getPieChart();
        java.awt.Paint paint63 = multiplePiePlot45.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart64 = multiplePiePlot45.getPieChart();
        multiplePiePlot30.setPieChart(jFreeChart64);
        multiplePiePlot22.setPieChart(jFreeChart64);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot6 and multiplePiePlot22", multiplePiePlot6.equals(multiplePiePlot22) ? multiplePiePlot6.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        float float7 = plot4.getBackgroundImageAlpha();
        plot4.setBackgroundImageAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        boolean boolean12 = multiplePiePlot11.isSubplot();
        java.awt.Paint paint13 = multiplePiePlot11.getBackgroundPaint();
        java.awt.Image image14 = multiplePiePlot11.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        boolean boolean17 = multiplePiePlot16.isSubplot();
        java.awt.Paint paint18 = multiplePiePlot16.getBackgroundPaint();
        java.awt.Image image19 = multiplePiePlot16.getBackgroundImage();
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot16.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = multiplePiePlot16.getInsets();
        multiplePiePlot11.setInsets(rectangleInsets21);
        plot4.setInsets(rectangleInsets21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and multiplePiePlot16", multiplePiePlot11.equals(multiplePiePlot16) ? multiplePiePlot11.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = multiplePiePlot1.getInsets();
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent17 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        boolean boolean21 = multiplePiePlot20.isSubplot();
        java.awt.Paint paint22 = multiplePiePlot20.getBackgroundPaint();
        java.awt.Image image23 = multiplePiePlot20.getBackgroundImage();
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot20.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = multiplePiePlot20.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets25, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot20", multiplePiePlot4.equals(multiplePiePlot20) ? multiplePiePlot4.hashCode() == multiplePiePlot20.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        boolean boolean10 = multiplePiePlot9.isSubplot();
        java.awt.Paint paint11 = multiplePiePlot9.getBackgroundPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.lang.String str15 = multiplePiePlot14.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot14.addChangeListener(plotChangeListener16);
        java.awt.Image image18 = multiplePiePlot14.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot14.getPieChart();
        multiplePiePlot14.setBackgroundImageAlpha(1.0f);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = multiplePiePlot14.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart6 and jFreeChart19", jFreeChart6.equals(jFreeChart19) ? jFreeChart6.hashCode() == jFreeChart19.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        multiplePiePlot17.markerChanged(markerChangeEvent19);
        java.awt.Paint paint21 = multiplePiePlot17.getAggregatedItemsPaint();
        java.lang.Comparable comparable22 = multiplePiePlot17.getAggregatedItemsKey();
        multiplePiePlot17.setBackgroundImageAlpha((float) 0);
        java.awt.Font font25 = multiplePiePlot17.getNoDataMessageFont();
        double double26 = multiplePiePlot17.getLimit();
        java.awt.Paint paint27 = multiplePiePlot17.getAggregatedItemsPaint();
        java.awt.Font font28 = multiplePiePlot17.getNoDataMessageFont();
        multiplePiePlot17.setLimit((double) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier33 = null;
        multiplePiePlot32.setDrawingSupplier(drawingSupplier33);
        org.jfree.chart.plot.Plot plot35 = multiplePiePlot32.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent36 = null;
        plot35.markerChanged(markerChangeEvent36);
        float float38 = plot35.getBackgroundImageAlpha();
        java.awt.Paint paint39 = plot35.getBackgroundPaint();
        multiplePiePlot17.setNoDataMessagePaint(paint39);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent41 = null;
        multiplePiePlot17.axisChanged(axisChangeEvent41);
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot44 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset43);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier45 = null;
        multiplePiePlot44.setDrawingSupplier(drawingSupplier45);
        boolean boolean48 = multiplePiePlot44.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint49 = multiplePiePlot44.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection50 = multiplePiePlot44.getLegendItems();
        boolean boolean51 = multiplePiePlot44.isOutlineVisible();
        multiplePiePlot44.zoom((double) 10);
        org.jfree.chart.util.TableOrder tableOrder54 = multiplePiePlot44.getDataExtractOrder();
        java.awt.Paint paint55 = multiplePiePlot44.getAggregatedItemsPaint();
        multiplePiePlot44.setBackgroundAlpha((float) ' ');
        org.jfree.chart.JFreeChart jFreeChart58 = multiplePiePlot44.getPieChart();
        multiplePiePlot17.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart58);
        multiplePiePlot1.setPieChart(jFreeChart58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection7 and legendItemCollection50", legendItemCollection7.equals(legendItemCollection50) ? legendItemCollection7.hashCode() == legendItemCollection50.hashCode() : true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
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
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        boolean boolean18 = multiplePiePlot17.isSubplot();
        multiplePiePlot17.setForegroundAlpha((float) 0L);
        java.awt.Paint paint21 = multiplePiePlot17.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        java.lang.String str24 = multiplePiePlot23.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener25 = null;
        multiplePiePlot23.addChangeListener(plotChangeListener25);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = multiplePiePlot23.getDrawingSupplier();
        multiplePiePlot17.setDrawingSupplier(drawingSupplier27);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        multiplePiePlot17.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo31);
        org.jfree.chart.JFreeChart jFreeChart33 = multiplePiePlot17.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart33);
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        java.lang.String str37 = multiplePiePlot36.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent38 = null;
        multiplePiePlot36.markerChanged(markerChangeEvent38);
        float float40 = multiplePiePlot36.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        multiplePiePlot36.setDataset(categoryDataset41);
        boolean boolean43 = multiplePiePlot36.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset44 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot45 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset44);
        java.lang.String str46 = multiplePiePlot45.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener47 = null;
        multiplePiePlot45.addChangeListener(plotChangeListener47);
        java.awt.Paint paint49 = multiplePiePlot45.getAggregatedItemsPaint();
        multiplePiePlot36.setOutlinePaint(paint49);
        multiplePiePlot1.setNoDataMessagePaint(paint49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot23 and multiplePiePlot45", multiplePiePlot23.equals(multiplePiePlot45) ? multiplePiePlot23.hashCode() == multiplePiePlot45.hashCode() : true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
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
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.awt.Image image18 = null;
        multiplePiePlot17.setBackgroundImage(image18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        java.lang.String str22 = multiplePiePlot21.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        multiplePiePlot21.addChangeListener(plotChangeListener23);
        java.awt.Image image25 = multiplePiePlot21.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart26 = multiplePiePlot21.getPieChart();
        multiplePiePlot17.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = multiplePiePlot17.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset29 = multiplePiePlot17.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        java.lang.String str32 = multiplePiePlot31.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent33 = null;
        multiplePiePlot31.markerChanged(markerChangeEvent33);
        java.awt.Paint paint35 = null;
        multiplePiePlot31.setBackgroundPaint(paint35);
        org.jfree.data.category.CategoryDataset categoryDataset37 = multiplePiePlot31.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup38 = multiplePiePlot31.getDatasetGroup();
        java.awt.Paint paint39 = multiplePiePlot31.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = multiplePiePlot31.getInsets();
        multiplePiePlot17.setInsets(rectangleInsets40);
        java.awt.Paint paint42 = multiplePiePlot17.getNoDataMessagePaint();
        boolean boolean43 = multiplePiePlot1.equals((java.lang.Object) paint42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot17", multiplePiePlot4.equals(multiplePiePlot17) ? multiplePiePlot4.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
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
        multiplePiePlot12.setForegroundAlpha((float) 97);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj5", multiplePiePlot1.equals(obj5) ? multiplePiePlot1.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        boolean boolean7 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint8 = multiplePiePlot1.getOutlinePaint();
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
        org.jfree.chart.plot.Plot plot22 = multiplePiePlot10.getParent();
        multiplePiePlot1.setParent(plot22);
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot1.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        java.lang.String str27 = multiplePiePlot26.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent28 = null;
        multiplePiePlot26.markerChanged(markerChangeEvent28);
        java.awt.Paint paint30 = multiplePiePlot26.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        java.lang.String str33 = multiplePiePlot32.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener34 = null;
        multiplePiePlot32.addChangeListener(plotChangeListener34);
        java.awt.Image image36 = multiplePiePlot32.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart37 = multiplePiePlot32.getPieChart();
        multiplePiePlot26.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart37);
        multiplePiePlot1.setPieChart(jFreeChart37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot26", multiplePiePlot1.equals(multiplePiePlot26) ? multiplePiePlot1.hashCode() == multiplePiePlot26.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
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
        java.awt.Image image22 = null;
        multiplePiePlot4.setBackgroundImage(image22);
        multiplePiePlot4.zoom((double) 0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        java.awt.Image image28 = null;
        multiplePiePlot27.setBackgroundImage(image28);
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
        multiplePiePlot27.setNoDataMessageFont(font44);
        multiplePiePlot27.setLimit((double) 100.0f);
        org.jfree.data.category.CategoryDataset categoryDataset49 = null;
        multiplePiePlot27.setDataset(categoryDataset49);
        org.jfree.chart.LegendItemCollection legendItemCollection51 = multiplePiePlot27.getLegendItems();
        boolean boolean52 = multiplePiePlot4.equals((java.lang.Object) legendItemCollection51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot31", multiplePiePlot1.equals(multiplePiePlot31) ? multiplePiePlot1.hashCode() == multiplePiePlot31.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
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
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.lang.String str21 = multiplePiePlot20.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        multiplePiePlot20.addChangeListener(plotChangeListener22);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = multiplePiePlot20.getDrawingSupplier();
        java.awt.Paint paint25 = multiplePiePlot20.getNoDataMessagePaint();
        java.awt.Image image26 = null;
        multiplePiePlot20.setBackgroundImage(image26);
        multiplePiePlot20.setNoDataMessage("hi!");
        org.jfree.chart.LegendItemCollection legendItemCollection30 = multiplePiePlot20.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        java.lang.String str33 = multiplePiePlot32.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent34 = null;
        multiplePiePlot32.markerChanged(markerChangeEvent34);
        java.awt.Paint paint36 = multiplePiePlot32.getAggregatedItemsPaint();
        java.lang.Comparable comparable37 = multiplePiePlot32.getAggregatedItemsKey();
        multiplePiePlot32.setBackgroundImageAlpha((float) 0);
        java.awt.Font font40 = multiplePiePlot32.getNoDataMessageFont();
        double double41 = multiplePiePlot32.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot43 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset42);
        java.lang.String str44 = multiplePiePlot43.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent45 = null;
        multiplePiePlot43.markerChanged(markerChangeEvent45);
        java.awt.Paint paint47 = null;
        multiplePiePlot43.setBackgroundPaint(paint47);
        org.jfree.data.category.CategoryDataset categoryDataset49 = multiplePiePlot43.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup50 = multiplePiePlot43.getDatasetGroup();
        java.awt.Paint paint51 = multiplePiePlot43.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets52 = multiplePiePlot43.getInsets();
        multiplePiePlot32.setInsets(rectangleInsets52, false);
        org.jfree.data.category.CategoryDataset categoryDataset55 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot56 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset55);
        boolean boolean57 = multiplePiePlot56.isSubplot();
        java.awt.Paint paint58 = multiplePiePlot56.getBackgroundPaint();
        float float59 = multiplePiePlot56.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset60 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot61 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset60);
        java.lang.String str62 = multiplePiePlot61.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent63 = null;
        multiplePiePlot61.markerChanged(markerChangeEvent63);
        java.awt.Paint paint65 = null;
        multiplePiePlot61.setBackgroundPaint(paint65);
        multiplePiePlot61.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font69 = multiplePiePlot61.getNoDataMessageFont();
        multiplePiePlot56.setNoDataMessageFont(font69);
        org.jfree.chart.plot.Plot plot71 = multiplePiePlot56.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset72 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot73 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset72);
        boolean boolean74 = multiplePiePlot73.isSubplot();
        java.awt.Paint paint75 = multiplePiePlot73.getBackgroundPaint();
        java.awt.Paint paint76 = multiplePiePlot73.getNoDataMessagePaint();
        java.awt.Paint paint77 = multiplePiePlot73.getNoDataMessagePaint();
        multiplePiePlot56.setOutlinePaint(paint77);
        multiplePiePlot32.setNoDataMessagePaint(paint77);
        multiplePiePlot20.setBackgroundPaint(paint77);
        multiplePiePlot1.setNoDataMessagePaint(paint77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot43", multiplePiePlot7.equals(multiplePiePlot43) ? multiplePiePlot7.hashCode() == multiplePiePlot43.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
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
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.lang.String str20 = multiplePiePlot19.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        multiplePiePlot19.markerChanged(markerChangeEvent21);
        java.awt.Image image23 = multiplePiePlot19.getBackgroundImage();
        multiplePiePlot19.setLimit((double) '4');
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = null;
        multiplePiePlot27.setDrawingSupplier(drawingSupplier28);
        java.awt.Paint paint30 = multiplePiePlot27.getOutlinePaint();
        multiplePiePlot27.setBackgroundAlpha((float) (-1));
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        java.lang.String str35 = multiplePiePlot34.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener36 = null;
        multiplePiePlot34.addChangeListener(plotChangeListener36);
        multiplePiePlot34.setForegroundAlpha((float) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot41 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset40);
        boolean boolean42 = multiplePiePlot41.isSubplot();
        multiplePiePlot41.setForegroundAlpha((float) 0L);
        java.awt.Paint paint45 = multiplePiePlot41.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset46 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot47 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset46);
        java.lang.String str48 = multiplePiePlot47.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener49 = null;
        multiplePiePlot47.addChangeListener(plotChangeListener49);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier51 = multiplePiePlot47.getDrawingSupplier();
        multiplePiePlot41.setDrawingSupplier(drawingSupplier51);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo55 = null;
        multiplePiePlot41.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo55);
        float float57 = multiplePiePlot41.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset58 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot59 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset58);
        multiplePiePlot59.setAggregatedItemsKey((java.lang.Comparable) 10);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent62 = null;
        multiplePiePlot59.markerChanged(markerChangeEvent62);
        multiplePiePlot59.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.awt.Image image66 = multiplePiePlot59.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset67 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot68 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset67);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier69 = null;
        multiplePiePlot68.setDrawingSupplier(drawingSupplier69);
        org.jfree.chart.plot.Plot plot71 = multiplePiePlot68.getParent();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent72 = null;
        multiplePiePlot68.datasetChanged(datasetChangeEvent72);
        multiplePiePlot68.setAggregatedItemsKey((java.lang.Comparable) (-1));
        float float76 = multiplePiePlot68.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart77 = multiplePiePlot68.getPieChart();
        multiplePiePlot59.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart77);
        multiplePiePlot41.setPieChart(jFreeChart77);
        multiplePiePlot34.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart77);
        multiplePiePlot27.setPieChart(jFreeChart77);
        multiplePiePlot19.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart77);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot8 and multiplePiePlot47", multiplePiePlot8.equals(multiplePiePlot47) ? multiplePiePlot8.hashCode() == multiplePiePlot47.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
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
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot11.markerChanged(markerChangeEvent13);
        java.awt.Paint paint15 = multiplePiePlot11.getAggregatedItemsPaint();
        java.lang.Comparable comparable16 = multiplePiePlot11.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        java.lang.String str19 = multiplePiePlot18.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        multiplePiePlot18.addChangeListener(plotChangeListener20);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = multiplePiePlot18.getDrawingSupplier();
        java.awt.Paint paint23 = multiplePiePlot18.getNoDataMessagePaint();
        multiplePiePlot11.setAggregatedItemsPaint(paint23);
        java.lang.String str25 = multiplePiePlot11.getPlotType();
        boolean boolean26 = multiplePiePlot11.isSubplot();
        java.awt.Paint paint27 = multiplePiePlot11.getAggregatedItemsPaint();
        multiplePiePlot1.setBackgroundPaint(paint27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier9 and drawingSupplier22", drawingSupplier9.equals(drawingSupplier22) ? drawingSupplier9.hashCode() == drawingSupplier22.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setBackgroundImageAlpha((float) (byte) 0);
        float float3 = multiplePiePlot0.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        java.awt.Image image6 = null;
        multiplePiePlot5.setBackgroundImage(image6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.lang.String str10 = multiplePiePlot9.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        multiplePiePlot9.addChangeListener(plotChangeListener11);
        java.awt.Image image13 = multiplePiePlot9.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart14 = multiplePiePlot9.getPieChart();
        multiplePiePlot5.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart14);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent16 = null;
        multiplePiePlot5.datasetChanged(datasetChangeEvent16);
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot5.getPieChart();
        multiplePiePlot0.setPieChart(jFreeChart18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot9", multiplePiePlot5.equals(multiplePiePlot9) ? multiplePiePlot5.hashCode() == multiplePiePlot9.hashCode() : true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        multiplePiePlot8.addChangeListener(plotChangeListener10);
        java.awt.Image image12 = multiplePiePlot8.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart13 = multiplePiePlot8.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart13);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = multiplePiePlot1.getInsets();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart6 and jFreeChart13", jFreeChart6.equals(jFreeChart13) ? jFreeChart6.hashCode() == jFreeChart13.hashCode() : true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
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
        org.jfree.data.category.CategoryDataset categoryDataset15 = multiplePiePlot1.getDataset();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = multiplePiePlot1.getInsets();
        multiplePiePlot1.zoom(15.0d);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.awt.Image image21 = null;
        multiplePiePlot20.setBackgroundImage(image21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.lang.String str25 = multiplePiePlot24.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener26 = null;
        multiplePiePlot24.addChangeListener(plotChangeListener26);
        java.awt.Image image28 = multiplePiePlot24.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart29 = multiplePiePlot24.getPieChart();
        multiplePiePlot20.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart29);
        org.jfree.data.category.CategoryDataset categoryDataset31 = multiplePiePlot20.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset32 = multiplePiePlot20.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        java.lang.String str35 = multiplePiePlot34.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent36 = null;
        multiplePiePlot34.markerChanged(markerChangeEvent36);
        java.awt.Paint paint38 = null;
        multiplePiePlot34.setBackgroundPaint(paint38);
        org.jfree.data.category.CategoryDataset categoryDataset40 = multiplePiePlot34.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup41 = multiplePiePlot34.getDatasetGroup();
        java.awt.Paint paint42 = multiplePiePlot34.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = multiplePiePlot34.getInsets();
        multiplePiePlot20.setInsets(rectangleInsets43);
        multiplePiePlot1.setInsets(rectangleInsets43, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot20", multiplePiePlot7.equals(multiplePiePlot20) ? multiplePiePlot7.hashCode() == multiplePiePlot20.hashCode() : true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
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
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        java.lang.String str22 = multiplePiePlot21.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        multiplePiePlot21.markerChanged(markerChangeEvent23);
        float float25 = multiplePiePlot21.getForegroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = multiplePiePlot21.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets26, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot21", multiplePiePlot7.equals(multiplePiePlot21) ? multiplePiePlot7.hashCode() == multiplePiePlot21.hashCode() : true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        multiplePiePlot1.setNoDataMessage("");
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot11.markerChanged(markerChangeEvent13);
        java.awt.Paint paint15 = multiplePiePlot11.getAggregatedItemsPaint();
        multiplePiePlot8.setOutlinePaint(paint15);
        java.lang.String str17 = multiplePiePlot8.getPlotType();
        java.lang.String str18 = multiplePiePlot8.getNoDataMessage();
        float float19 = multiplePiePlot8.getBackgroundImageAlpha();
        int int20 = multiplePiePlot8.getBackgroundImageAlignment();
        java.lang.Object obj21 = multiplePiePlot8.clone();
        multiplePiePlot8.setForegroundAlpha((float) (byte) 1);
        java.awt.Paint paint24 = multiplePiePlot8.getOutlinePaint();
        boolean boolean25 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot8);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        java.lang.String str28 = multiplePiePlot27.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        multiplePiePlot27.markerChanged(markerChangeEvent29);
        java.awt.Paint paint31 = null;
        multiplePiePlot27.setBackgroundPaint(paint31);
        multiplePiePlot27.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font35 = multiplePiePlot27.getNoDataMessageFont();
        java.awt.Paint paint36 = multiplePiePlot27.getAggregatedItemsPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot8 and obj21", multiplePiePlot8.equals(obj21) ? multiplePiePlot8.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
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
        java.awt.Paint paint13 = multiplePiePlot4.getBackgroundPaint();
        java.awt.Paint paint14 = multiplePiePlot4.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = multiplePiePlot16.getDrawingSupplier();
        multiplePiePlot4.setDrawingSupplier(drawingSupplier17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot16", multiplePiePlot1.equals(multiplePiePlot16) ? multiplePiePlot1.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
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
        boolean boolean12 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        boolean boolean15 = multiplePiePlot14.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        boolean boolean18 = multiplePiePlot17.isSubplot();
        multiplePiePlot17.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot14.setParent((org.jfree.chart.plot.Plot) multiplePiePlot17);
        java.awt.Stroke stroke22 = multiplePiePlot17.getOutlineStroke();
        multiplePiePlot17.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        multiplePiePlot17.setDataset(categoryDataset25);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent27 = null;
        multiplePiePlot17.notifyListeners(plotChangeEvent27);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = multiplePiePlot17.getInsets();
        boolean boolean30 = multiplePiePlot17.isSubplot();
        org.jfree.chart.util.TableOrder tableOrder31 = multiplePiePlot17.getDataExtractOrder();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        multiplePiePlot17.markerChanged(markerChangeEvent32);
        org.jfree.chart.JFreeChart jFreeChart34 = multiplePiePlot17.getPieChart();
        java.awt.Paint paint35 = multiplePiePlot17.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart36 = multiplePiePlot17.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot14", multiplePiePlot4.equals(multiplePiePlot14) ? multiplePiePlot4.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = multiplePiePlot1.getInsets();
        java.lang.Object obj15 = multiplePiePlot1.clone();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.lang.String str18 = multiplePiePlot17.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        multiplePiePlot17.markerChanged(markerChangeEvent19);
        java.awt.Image image21 = multiplePiePlot17.getBackgroundImage();
        multiplePiePlot17.setLimit((double) '4');
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = null;
        multiplePiePlot25.setDrawingSupplier(drawingSupplier26);
        java.awt.Paint paint28 = multiplePiePlot25.getOutlinePaint();
        multiplePiePlot25.setBackgroundAlpha((float) (-1));
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        java.lang.String str33 = multiplePiePlot32.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener34 = null;
        multiplePiePlot32.addChangeListener(plotChangeListener34);
        multiplePiePlot32.setForegroundAlpha((float) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot39 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset38);
        boolean boolean40 = multiplePiePlot39.isSubplot();
        multiplePiePlot39.setForegroundAlpha((float) 0L);
        java.awt.Paint paint43 = multiplePiePlot39.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset44 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot45 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset44);
        java.lang.String str46 = multiplePiePlot45.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener47 = null;
        multiplePiePlot45.addChangeListener(plotChangeListener47);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier49 = multiplePiePlot45.getDrawingSupplier();
        multiplePiePlot39.setDrawingSupplier(drawingSupplier49);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo53 = null;
        multiplePiePlot39.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo53);
        float float55 = multiplePiePlot39.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset56 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot57 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset56);
        multiplePiePlot57.setAggregatedItemsKey((java.lang.Comparable) 10);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent60 = null;
        multiplePiePlot57.markerChanged(markerChangeEvent60);
        multiplePiePlot57.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.awt.Image image64 = multiplePiePlot57.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset65 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot66 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset65);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier67 = null;
        multiplePiePlot66.setDrawingSupplier(drawingSupplier67);
        org.jfree.chart.plot.Plot plot69 = multiplePiePlot66.getParent();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent70 = null;
        multiplePiePlot66.datasetChanged(datasetChangeEvent70);
        multiplePiePlot66.setAggregatedItemsKey((java.lang.Comparable) (-1));
        float float74 = multiplePiePlot66.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart75 = multiplePiePlot66.getPieChart();
        multiplePiePlot57.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart75);
        multiplePiePlot39.setPieChart(jFreeChart75);
        multiplePiePlot32.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart75);
        multiplePiePlot25.setPieChart(jFreeChart75);
        multiplePiePlot17.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart75);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot45", multiplePiePlot4.equals(multiplePiePlot45) ? multiplePiePlot4.hashCode() == multiplePiePlot45.hashCode() : true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
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
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        boolean boolean20 = multiplePiePlot19.isSubplot();
        java.awt.Paint paint21 = multiplePiePlot19.getBackgroundPaint();
        float float22 = multiplePiePlot19.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.lang.String str25 = multiplePiePlot24.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        multiplePiePlot24.markerChanged(markerChangeEvent26);
        java.awt.Paint paint28 = null;
        multiplePiePlot24.setBackgroundPaint(paint28);
        multiplePiePlot24.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font32 = multiplePiePlot24.getNoDataMessageFont();
        multiplePiePlot19.setNoDataMessageFont(font32);
        float float34 = multiplePiePlot19.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        java.lang.String str37 = multiplePiePlot36.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent38 = null;
        multiplePiePlot36.markerChanged(markerChangeEvent38);
        float float40 = multiplePiePlot36.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        multiplePiePlot36.setDataset(categoryDataset41);
        boolean boolean43 = multiplePiePlot36.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset44 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot45 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset44);
        java.lang.String str46 = multiplePiePlot45.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener47 = null;
        multiplePiePlot45.addChangeListener(plotChangeListener47);
        java.awt.Paint paint49 = multiplePiePlot45.getAggregatedItemsPaint();
        multiplePiePlot36.setOutlinePaint(paint49);
        multiplePiePlot19.setOutlinePaint(paint49);
        multiplePiePlot1.setOutlinePaint(paint49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot45", multiplePiePlot4.equals(multiplePiePlot45) ? multiplePiePlot4.hashCode() == multiplePiePlot45.hashCode() : true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
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
        org.jfree.data.category.CategoryDataset categoryDataset15 = multiplePiePlot1.getDataset();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        java.lang.String str19 = multiplePiePlot18.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        java.lang.String str22 = multiplePiePlot21.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        multiplePiePlot21.markerChanged(markerChangeEvent23);
        java.awt.Paint paint25 = multiplePiePlot21.getAggregatedItemsPaint();
        multiplePiePlot18.setOutlinePaint(paint25);
        java.lang.String str27 = multiplePiePlot18.getPlotType();
        java.lang.String str28 = multiplePiePlot18.getNoDataMessage();
        java.lang.Comparable comparable29 = multiplePiePlot18.getAggregatedItemsKey();
        multiplePiePlot18.setAggregatedItemsKey((java.lang.Comparable) (byte) -1);
        java.awt.Stroke stroke32 = multiplePiePlot18.getOutlineStroke();
        boolean boolean33 = multiplePiePlot18.isSubplot();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot21", multiplePiePlot7.equals(multiplePiePlot21) ? multiplePiePlot7.hashCode() == multiplePiePlot21.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        java.lang.String str8 = multiplePiePlot7.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot7.markerChanged(markerChangeEvent9);
        java.awt.Paint paint11 = multiplePiePlot7.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        multiplePiePlot13.addChangeListener(plotChangeListener15);
        java.awt.Image image17 = multiplePiePlot13.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot13.getPieChart();
        multiplePiePlot7.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart18);
        java.lang.String str20 = multiplePiePlot7.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = null;
        multiplePiePlot22.setDrawingSupplier(drawingSupplier23);
        org.jfree.chart.plot.Plot plot25 = multiplePiePlot22.getRootPlot();
        java.awt.Paint paint26 = multiplePiePlot22.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        java.lang.String str29 = multiplePiePlot28.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = null;
        multiplePiePlot28.markerChanged(markerChangeEvent30);
        java.awt.Paint paint32 = null;
        multiplePiePlot28.setBackgroundPaint(paint32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = multiplePiePlot28.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup35 = multiplePiePlot28.getDatasetGroup();
        java.awt.Paint paint36 = multiplePiePlot28.getOutlinePaint();
        multiplePiePlot22.setBackgroundPaint(paint36);
        multiplePiePlot7.setOutlinePaint(paint36);
        multiplePiePlot1.setBackgroundPaint(paint36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot13", multiplePiePlot7.equals(multiplePiePlot13) ? multiplePiePlot7.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
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
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D24, rectangle2D25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        java.lang.String str29 = multiplePiePlot28.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener30 = null;
        multiplePiePlot28.addChangeListener(plotChangeListener30);
        java.awt.Image image32 = multiplePiePlot28.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        boolean boolean35 = multiplePiePlot34.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot37 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset36);
        boolean boolean38 = multiplePiePlot37.isSubplot();
        multiplePiePlot37.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot34.setParent((org.jfree.chart.plot.Plot) multiplePiePlot37);
        java.awt.Stroke stroke42 = multiplePiePlot37.getOutlineStroke();
        multiplePiePlot28.setOutlineStroke(stroke42);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot18 and multiplePiePlot34", multiplePiePlot18.equals(multiplePiePlot34) ? multiplePiePlot18.hashCode() == multiplePiePlot34.hashCode() : true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Paint paint7 = multiplePiePlot1.getOutlinePaint();
        boolean boolean8 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.lang.String str11 = multiplePiePlot10.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot10.markerChanged(markerChangeEvent12);
        java.awt.Paint paint14 = multiplePiePlot10.getAggregatedItemsPaint();
        java.lang.String str15 = multiplePiePlot10.getPlotType();
        multiplePiePlot10.zoom((double) 0.5f);
        multiplePiePlot10.setForegroundAlpha(1.0f);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        java.lang.String str22 = multiplePiePlot21.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        multiplePiePlot21.markerChanged(markerChangeEvent23);
        java.awt.Paint paint25 = null;
        multiplePiePlot21.setBackgroundPaint(paint25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = multiplePiePlot21.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup28 = multiplePiePlot21.getDatasetGroup();
        java.awt.Paint paint29 = multiplePiePlot21.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = multiplePiePlot21.getInsets();
        org.jfree.data.general.DatasetGroup datasetGroup31 = multiplePiePlot21.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        boolean boolean34 = multiplePiePlot33.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        boolean boolean37 = multiplePiePlot36.isSubplot();
        multiplePiePlot36.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot33.setParent((org.jfree.chart.plot.Plot) multiplePiePlot36);
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = multiplePiePlot36.getInsets();
        multiplePiePlot36.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.util.TableOrder tableOrder44 = multiplePiePlot36.getDataExtractOrder();
        java.awt.Paint paint45 = multiplePiePlot36.getBackgroundPaint();
        org.jfree.chart.JFreeChart jFreeChart46 = multiplePiePlot36.getPieChart();
        multiplePiePlot21.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart46);
        multiplePiePlot10.setPieChart(jFreeChart46);
        multiplePiePlot1.setPieChart(jFreeChart46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot10 and multiplePiePlot33", multiplePiePlot10.equals(multiplePiePlot33) ? multiplePiePlot10.hashCode() == multiplePiePlot33.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier11);
        boolean boolean14 = multiplePiePlot10.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint15 = multiplePiePlot10.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot10.getLegendItems();
        boolean boolean17 = multiplePiePlot10.isOutlineVisible();
        multiplePiePlot10.zoom((double) 10);
        org.jfree.chart.util.TableOrder tableOrder20 = multiplePiePlot10.getDataExtractOrder();
        java.awt.Paint paint21 = multiplePiePlot10.getAggregatedItemsPaint();
        multiplePiePlot10.setBackgroundAlpha((float) ' ');
        org.jfree.chart.JFreeChart jFreeChart24 = multiplePiePlot10.getPieChart();
        multiplePiePlot4.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        java.lang.String str28 = multiplePiePlot27.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        java.lang.String str31 = multiplePiePlot30.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        multiplePiePlot30.markerChanged(markerChangeEvent32);
        java.awt.Paint paint34 = multiplePiePlot30.getAggregatedItemsPaint();
        multiplePiePlot27.setOutlinePaint(paint34);
        java.lang.String str36 = multiplePiePlot27.getPlotType();
        java.lang.String str37 = multiplePiePlot27.getNoDataMessage();
        multiplePiePlot27.setForegroundAlpha(0.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = multiplePiePlot27.getInsets();
        multiplePiePlot4.setInsets(rectangleInsets40, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot30", multiplePiePlot1.equals(multiplePiePlot30) ? multiplePiePlot1.hashCode() == multiplePiePlot30.hashCode() : true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = multiplePiePlot1.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = multiplePiePlot1.getInsets();
        float float14 = multiplePiePlot1.getForegroundAlpha();
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
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot16.setInsets(rectangleInsets25, true);
        multiplePiePlot1.setInsets(rectangleInsets25, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot19", multiplePiePlot4.equals(multiplePiePlot19) ? multiplePiePlot4.hashCode() == multiplePiePlot19.hashCode() : true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Image image7 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        boolean boolean10 = multiplePiePlot9.isSubplot();
        java.awt.Image image11 = multiplePiePlot9.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection12 = multiplePiePlot9.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = multiplePiePlot9.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        boolean boolean16 = multiplePiePlot15.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        multiplePiePlot18.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot15.setParent((org.jfree.chart.plot.Plot) multiplePiePlot18);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = multiplePiePlot15.getDrawingSupplier();
        multiplePiePlot9.setDrawingSupplier(drawingSupplier23);
        java.awt.Paint paint25 = multiplePiePlot9.getAggregatedItemsPaint();
        multiplePiePlot1.setNoDataMessagePaint(paint25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot15", multiplePiePlot9.equals(multiplePiePlot15) ? multiplePiePlot9.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
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
        boolean boolean10 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.awt.Image image15 = null;
        multiplePiePlot14.setBackgroundImage(image15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        java.lang.String str19 = multiplePiePlot18.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        multiplePiePlot18.addChangeListener(plotChangeListener20);
        java.awt.Image image22 = multiplePiePlot18.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot18.getPieChart();
        multiplePiePlot14.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart23);
        org.jfree.data.category.CategoryDataset categoryDataset25 = multiplePiePlot14.getDataset();
        multiplePiePlot14.setBackgroundImageAlpha((float) 0);
        multiplePiePlot14.setBackgroundImageAlignment(100);
        float float30 = multiplePiePlot14.getForegroundAlpha();
        multiplePiePlot14.setNoDataMessage("");
        multiplePiePlot14.zoom(1.0d);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot18", multiplePiePlot4.equals(multiplePiePlot18) ? multiplePiePlot4.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
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
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D12, rectangle2D13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot3 and multiplePiePlot1", multiplePiePlot3.equals(multiplePiePlot1) ? multiplePiePlot3.hashCode() == multiplePiePlot1.hashCode() : true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier10);
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot9.getParent();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent13 = null;
        multiplePiePlot9.datasetChanged(datasetChangeEvent13);
        multiplePiePlot9.setAggregatedItemsKey((java.lang.Comparable) (-1));
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        boolean boolean22 = multiplePiePlot21.isSubplot();
        multiplePiePlot21.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot18.setParent((org.jfree.chart.plot.Plot) multiplePiePlot21);
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = multiplePiePlot21.getInsets();
        multiplePiePlot9.setInsets(rectangleInsets26, false);
        multiplePiePlot1.setInsets(rectangleInsets26, true);
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        java.lang.String str33 = multiplePiePlot32.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener34 = null;
        multiplePiePlot32.addChangeListener(plotChangeListener34);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier36 = multiplePiePlot32.getDrawingSupplier();
        java.awt.Paint paint37 = multiplePiePlot32.getNoDataMessagePaint();
        java.awt.Image image38 = null;
        multiplePiePlot32.setBackgroundImage(image38);
        java.awt.Paint paint40 = multiplePiePlot32.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot18 and multiplePiePlot32", multiplePiePlot18.equals(multiplePiePlot32) ? multiplePiePlot18.hashCode() == multiplePiePlot32.hashCode() : true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
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
        org.jfree.chart.LegendItemCollection legendItemCollection25 = multiplePiePlot15.getLegendItems();
        java.lang.String str26 = multiplePiePlot15.getPlotType();
        multiplePiePlot15.setBackgroundImageAlignment((int) 'a');
        java.lang.String str29 = multiplePiePlot15.getNoDataMessage();
        java.awt.Stroke stroke30 = multiplePiePlot15.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot18", multiplePiePlot4.equals(multiplePiePlot18) ? multiplePiePlot4.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
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
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        java.lang.String str22 = multiplePiePlot21.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.lang.String str25 = multiplePiePlot24.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        multiplePiePlot24.markerChanged(markerChangeEvent26);
        java.awt.Paint paint28 = multiplePiePlot24.getAggregatedItemsPaint();
        multiplePiePlot21.setOutlinePaint(paint28);
        java.lang.String str30 = multiplePiePlot21.getPlotType();
        java.lang.String str31 = multiplePiePlot21.getNoDataMessage();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = multiplePiePlot21.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = multiplePiePlot21.getInsets();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot24", multiplePiePlot7.equals(multiplePiePlot24) ? multiplePiePlot7.hashCode() == multiplePiePlot24.hashCode() : true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        boolean boolean26 = multiplePiePlot25.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        java.lang.String str29 = multiplePiePlot28.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = null;
        multiplePiePlot28.markerChanged(markerChangeEvent30);
        java.awt.Paint paint32 = null;
        multiplePiePlot28.setBackgroundPaint(paint32);
        org.jfree.data.category.CategoryDataset categoryDataset34 = multiplePiePlot28.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup35 = multiplePiePlot28.getDatasetGroup();
        java.awt.Paint paint36 = multiplePiePlot28.getOutlinePaint();
        multiplePiePlot25.setOutlinePaint(paint36);
        java.awt.Graphics2D graphics2D38 = null;
        java.awt.geom.Rectangle2D rectangle2D39 = null;
        multiplePiePlot25.drawBackgroundImage(graphics2D38, rectangle2D39);
        org.jfree.chart.JFreeChart jFreeChart41 = multiplePiePlot25.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot25", multiplePiePlot5.equals(multiplePiePlot25) ? multiplePiePlot5.hashCode() == multiplePiePlot25.hashCode() : true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
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
        java.awt.Stroke stroke21 = null;
        multiplePiePlot1.setOutlineStroke(stroke21);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        boolean boolean27 = multiplePiePlot26.isSubplot();
        multiplePiePlot26.setForegroundAlpha((float) 0L);
        multiplePiePlot26.setOutlineVisible(true);
        java.lang.Comparable comparable32 = multiplePiePlot26.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier35 = null;
        multiplePiePlot34.setDrawingSupplier(drawingSupplier35);
        org.jfree.chart.plot.Plot plot37 = multiplePiePlot34.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent38 = null;
        plot37.markerChanged(markerChangeEvent38);
        float float40 = plot37.getBackgroundImageAlpha();
        plot37.setBackgroundImageAlpha(0.0f);
        java.awt.Image image43 = null;
        plot37.setBackgroundImage(image43);
        org.jfree.chart.plot.Plot plot45 = plot37.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset46 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot47 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset46);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier48 = null;
        multiplePiePlot47.setDrawingSupplier(drawingSupplier48);
        float float50 = multiplePiePlot47.getBackgroundImageAlpha();
        java.awt.Paint paint51 = multiplePiePlot47.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset52 = null;
        multiplePiePlot47.setDataset(categoryDataset52);
        org.jfree.data.category.CategoryDataset categoryDataset54 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot55 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset54);
        java.lang.String str56 = multiplePiePlot55.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent57 = null;
        multiplePiePlot55.markerChanged(markerChangeEvent57);
        java.awt.Paint paint59 = null;
        multiplePiePlot55.setBackgroundPaint(paint59);
        multiplePiePlot55.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font63 = multiplePiePlot55.getNoDataMessageFont();
        multiplePiePlot47.setNoDataMessageFont(font63);
        plot37.setNoDataMessageFont(font63);
        org.jfree.data.category.CategoryDataset categoryDataset66 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot67 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset66);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier68 = null;
        multiplePiePlot67.setDrawingSupplier(drawingSupplier68);
        double double70 = multiplePiePlot67.getLimit();
        multiplePiePlot67.setLimit((double) (short) 1);
        org.jfree.chart.JFreeChart jFreeChart73 = multiplePiePlot67.getPieChart();
        plot37.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart73);
        multiplePiePlot26.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart73);
        multiplePiePlot1.setPieChart(jFreeChart73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot8 and multiplePiePlot26", multiplePiePlot8.equals(multiplePiePlot26) ? multiplePiePlot8.hashCode() == multiplePiePlot26.hashCode() : true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent10 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent10);
        org.jfree.chart.LegendItemCollection legendItemCollection12 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot14.setDrawingSupplier(drawingSupplier15);
        java.awt.Image image17 = null;
        multiplePiePlot14.setBackgroundImage(image17);
        java.awt.Image image19 = multiplePiePlot14.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        boolean boolean22 = multiplePiePlot21.isSubplot();
        multiplePiePlot21.setForegroundAlpha((float) 0L);
        java.awt.Paint paint25 = multiplePiePlot21.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        java.lang.String str28 = multiplePiePlot27.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener29 = null;
        multiplePiePlot27.addChangeListener(plotChangeListener29);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = multiplePiePlot27.getDrawingSupplier();
        multiplePiePlot21.setDrawingSupplier(drawingSupplier31);
        multiplePiePlot14.setDrawingSupplier(drawingSupplier31);
        java.awt.Font font34 = multiplePiePlot14.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot35 = multiplePiePlot14.getParent();
        java.lang.Comparable comparable36 = multiplePiePlot14.getAggregatedItemsKey();
        boolean boolean37 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection7 and legendItemCollection12", legendItemCollection7.equals(legendItemCollection12) ? legendItemCollection7.hashCode() == legendItemCollection12.hashCode() : true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
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
        multiplePiePlot4.setOutlineVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        boolean boolean18 = multiplePiePlot17.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        boolean boolean21 = multiplePiePlot20.isSubplot();
        multiplePiePlot20.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot17.setParent((org.jfree.chart.plot.Plot) multiplePiePlot20);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = multiplePiePlot20.getInsets();
        java.awt.Paint paint26 = multiplePiePlot20.getAggregatedItemsPaint();
        multiplePiePlot4.setAggregatedItemsPaint(paint26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot17", multiplePiePlot1.equals(multiplePiePlot17) ? multiplePiePlot1.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot18.setBackgroundImageAlpha((float) (byte) 0);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        boolean boolean23 = multiplePiePlot22.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        boolean boolean26 = multiplePiePlot25.isSubplot();
        multiplePiePlot25.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot22.setParent((org.jfree.chart.plot.Plot) multiplePiePlot25);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = multiplePiePlot25.getInsets();
        multiplePiePlot25.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Font font33 = multiplePiePlot25.getNoDataMessageFont();
        multiplePiePlot18.setNoDataMessageFont(font33);
        multiplePiePlot1.setNoDataMessageFont(font33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot22", multiplePiePlot1.equals(multiplePiePlot22) ? multiplePiePlot1.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Image image3 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset4 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot5 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset4);
        boolean boolean6 = multiplePiePlot5.isSubplot();
        multiplePiePlot5.setForegroundAlpha((float) 0L);
        java.awt.Paint paint9 = multiplePiePlot5.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        multiplePiePlot11.addChangeListener(plotChangeListener13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = multiplePiePlot11.getDrawingSupplier();
        multiplePiePlot5.setDrawingSupplier(drawingSupplier15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        multiplePiePlot5.setDataset(categoryDataset17);
        boolean boolean19 = multiplePiePlot1.equals((java.lang.Object) categoryDataset17);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        boolean boolean22 = multiplePiePlot21.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        boolean boolean25 = multiplePiePlot24.isSubplot();
        multiplePiePlot24.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot21.setParent((org.jfree.chart.plot.Plot) multiplePiePlot24);
        java.awt.Stroke stroke29 = multiplePiePlot24.getOutlineStroke();
        multiplePiePlot24.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        multiplePiePlot24.setDataset(categoryDataset32);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent34 = null;
        multiplePiePlot24.notifyListeners(plotChangeEvent34);
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = multiplePiePlot24.getInsets();
        boolean boolean37 = multiplePiePlot24.isSubplot();
        org.jfree.chart.util.TableOrder tableOrder38 = multiplePiePlot24.getDataExtractOrder();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent39 = null;
        multiplePiePlot24.markerChanged(markerChangeEvent39);
        org.jfree.chart.JFreeChart jFreeChart41 = multiplePiePlot24.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and multiplePiePlot21", multiplePiePlot11.equals(multiplePiePlot21) ? multiplePiePlot11.hashCode() == multiplePiePlot21.hashCode() : true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        boolean boolean5 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 10);
        java.awt.Paint paint8 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.awt.Image image11 = null;
        multiplePiePlot10.setBackgroundImage(image11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.lang.String str15 = multiplePiePlot14.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot14.addChangeListener(plotChangeListener16);
        java.awt.Image image18 = multiplePiePlot14.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot14.getPieChart();
        multiplePiePlot10.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart19);
        org.jfree.data.general.DatasetGroup datasetGroup21 = multiplePiePlot10.getDatasetGroup();
        java.lang.Class<?> wildcardClass22 = multiplePiePlot10.getClass();
        boolean boolean23 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot10);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        multiplePiePlot1.setDataset(categoryDataset24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot10 and multiplePiePlot14", multiplePiePlot10.equals(multiplePiePlot14) ? multiplePiePlot10.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
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
        java.lang.String str22 = multiplePiePlot11.getNoDataMessage();
        java.awt.Font font23 = multiplePiePlot11.getNoDataMessageFont();
        plot6.setNoDataMessageFont(font23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on plot6 and multiplePiePlot11", plot6.equals(multiplePiePlot11) ? plot6.hashCode() == multiplePiePlot11.hashCode() : true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Image image3 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = multiplePiePlot1.getDrawingSupplier();
        float float7 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint8 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        multiplePiePlot10.setForegroundAlpha((float) 0L);
        java.awt.Paint paint14 = multiplePiePlot10.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.lang.String str17 = multiplePiePlot16.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        multiplePiePlot16.addChangeListener(plotChangeListener18);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = multiplePiePlot16.getDrawingSupplier();
        multiplePiePlot10.setDrawingSupplier(drawingSupplier20);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        multiplePiePlot10.setDataset(categoryDataset22);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = multiplePiePlot10.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier6 and drawingSupplier24", drawingSupplier6.equals(drawingSupplier24) ? drawingSupplier6.hashCode() == drawingSupplier24.hashCode() : true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        boolean boolean7 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.awt.Image image11 = null;
        multiplePiePlot10.setBackgroundImage(image11);
        multiplePiePlot10.zoom((double) 10L);
        org.jfree.data.general.DatasetGroup datasetGroup15 = multiplePiePlot10.getDatasetGroup();
        org.jfree.chart.JFreeChart jFreeChart16 = multiplePiePlot10.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        java.lang.String str19 = multiplePiePlot18.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        multiplePiePlot18.markerChanged(markerChangeEvent20);
        java.awt.Paint paint22 = null;
        multiplePiePlot18.setBackgroundPaint(paint22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = multiplePiePlot18.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup25 = multiplePiePlot18.getDatasetGroup();
        multiplePiePlot18.setAggregatedItemsKey((java.lang.Comparable) (short) 10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        multiplePiePlot18.handleClick((int) '#', 1, plotRenderingInfo30);
        java.awt.Font font32 = multiplePiePlot18.getNoDataMessageFont();
        multiplePiePlot10.setNoDataMessageFont(font32);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        java.awt.Image image35 = null;
        multiplePiePlot1.setBackgroundImage(image35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot10", multiplePiePlot1.equals(multiplePiePlot10) ? multiplePiePlot1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        plot6.setBackgroundImageAlpha((float) 1);
        int int9 = plot6.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        boolean boolean12 = multiplePiePlot11.isSubplot();
        multiplePiePlot11.setForegroundAlpha((float) 0L);
        java.awt.Paint paint15 = multiplePiePlot11.getNoDataMessagePaint();
        java.awt.Paint paint16 = multiplePiePlot11.getBackgroundPaint();
        boolean boolean17 = multiplePiePlot11.isOutlineVisible();
        multiplePiePlot11.zoom((double) 0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        boolean boolean22 = multiplePiePlot21.isSubplot();
        multiplePiePlot21.setForegroundAlpha((float) 0L);
        java.awt.Paint paint25 = multiplePiePlot21.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        java.lang.String str28 = multiplePiePlot27.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener29 = null;
        multiplePiePlot27.addChangeListener(plotChangeListener29);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = multiplePiePlot27.getDrawingSupplier();
        multiplePiePlot21.setDrawingSupplier(drawingSupplier31);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        multiplePiePlot21.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo35);
        org.jfree.chart.JFreeChart jFreeChart37 = multiplePiePlot21.getPieChart();
        multiplePiePlot11.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart37);
        plot6.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and multiplePiePlot21", multiplePiePlot11.equals(multiplePiePlot21) ? multiplePiePlot11.hashCode() == multiplePiePlot21.hashCode() : true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Paint paint4 = multiplePiePlot1.getAggregatedItemsPaint();
        float float5 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        float float8 = multiplePiePlot1.getBackgroundAlpha();
        double double9 = multiplePiePlot1.getLimit();
        java.awt.Paint paint10 = multiplePiePlot1.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Image image13 = null;
        multiplePiePlot12.setBackgroundImage(image13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.lang.String str17 = multiplePiePlot16.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        multiplePiePlot16.addChangeListener(plotChangeListener18);
        java.awt.Image image20 = multiplePiePlot16.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot16.getPieChart();
        multiplePiePlot12.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart21);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent23 = null;
        multiplePiePlot12.datasetChanged(datasetChangeEvent23);
        org.jfree.chart.JFreeChart jFreeChart25 = multiplePiePlot12.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot12 and multiplePiePlot16", multiplePiePlot12.equals(multiplePiePlot16) ? multiplePiePlot12.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
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
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = null;
        multiplePiePlot28.setDrawingSupplier(drawingSupplier29);
        boolean boolean32 = multiplePiePlot28.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint33 = multiplePiePlot28.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection34 = multiplePiePlot28.getLegendItems();
        boolean boolean35 = multiplePiePlot28.isOutlineVisible();
        multiplePiePlot28.zoom((double) 10);
        org.jfree.chart.util.TableOrder tableOrder38 = multiplePiePlot28.getDataExtractOrder();
        java.awt.Paint paint39 = multiplePiePlot28.getAggregatedItemsPaint();
        multiplePiePlot28.setBackgroundAlpha((float) ' ');
        org.jfree.chart.JFreeChart jFreeChart42 = multiplePiePlot28.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart42);
        java.awt.Paint paint44 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.JFreeChart jFreeChart45 = multiplePiePlot1.getPieChart();
        java.awt.Image image46 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart42 and jFreeChart45", jFreeChart42.equals(jFreeChart45) ? jFreeChart42.hashCode() == jFreeChart45.hashCode() : true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
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
        boolean boolean12 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        boolean boolean15 = multiplePiePlot14.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        boolean boolean18 = multiplePiePlot17.isSubplot();
        multiplePiePlot17.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot14.setParent((org.jfree.chart.plot.Plot) multiplePiePlot17);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = multiplePiePlot17.getInsets();
        multiplePiePlot17.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.chart.util.TableOrder tableOrder25 = multiplePiePlot17.getDataExtractOrder();
        java.awt.Paint paint26 = multiplePiePlot17.getBackgroundPaint();
        java.awt.Paint paint27 = multiplePiePlot17.getNoDataMessagePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot14", multiplePiePlot4.equals(multiplePiePlot14) ? multiplePiePlot4.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        boolean boolean8 = multiplePiePlot7.isSubplot();
        multiplePiePlot7.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot4.setParent((org.jfree.chart.plot.Plot) multiplePiePlot7);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = multiplePiePlot7.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets12);
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
        org.jfree.chart.LegendItemCollection legendItemCollection25 = multiplePiePlot15.getLegendItems();
        java.lang.String str26 = multiplePiePlot15.getPlotType();
        multiplePiePlot15.setBackgroundImageAlignment((int) 'a');
        java.lang.String str29 = multiplePiePlot15.getNoDataMessage();
        boolean boolean30 = multiplePiePlot15.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        multiplePiePlot15.setDataset(categoryDataset31);
        java.awt.Paint paint33 = multiplePiePlot15.getBackgroundPaint();
        multiplePiePlot1.setNoDataMessagePaint(paint33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot18", multiplePiePlot4.equals(multiplePiePlot18) ? multiplePiePlot4.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 10);
        org.jfree.chart.JFreeChart jFreeChart4 = multiplePiePlot1.getPieChart();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
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
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent18 = null;
        multiplePiePlot7.datasetChanged(datasetChangeEvent18);
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot7.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart4 and jFreeChart16", jFreeChart4.equals(jFreeChart16) ? jFreeChart4.hashCode() == jFreeChart16.hashCode() : true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.awt.Paint paint1 = multiplePiePlot0.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset2 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot3 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset2);
        java.lang.String str4 = multiplePiePlot3.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        multiplePiePlot3.markerChanged(markerChangeEvent5);
        java.awt.Paint paint7 = multiplePiePlot3.getAggregatedItemsPaint();
        java.lang.Comparable comparable8 = multiplePiePlot3.getAggregatedItemsKey();
        multiplePiePlot3.setBackgroundImageAlpha((float) 0);
        java.awt.Font font11 = multiplePiePlot3.getNoDataMessageFont();
        double double12 = multiplePiePlot3.getLimit();
        java.awt.Paint paint13 = multiplePiePlot3.getAggregatedItemsPaint();
        double double14 = multiplePiePlot3.getLimit();
        java.awt.Paint paint15 = multiplePiePlot3.getNoDataMessagePaint();
        multiplePiePlot0.setAggregatedItemsPaint(paint15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = null;
        multiplePiePlot18.setDrawingSupplier(drawingSupplier19);
        java.awt.Image image21 = null;
        multiplePiePlot18.setBackgroundImage(image21);
        java.awt.Image image23 = multiplePiePlot18.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        boolean boolean26 = multiplePiePlot25.isSubplot();
        multiplePiePlot25.setForegroundAlpha((float) 0L);
        java.awt.Paint paint29 = multiplePiePlot25.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        java.lang.String str32 = multiplePiePlot31.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener33 = null;
        multiplePiePlot31.addChangeListener(plotChangeListener33);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier35 = multiplePiePlot31.getDrawingSupplier();
        multiplePiePlot25.setDrawingSupplier(drawingSupplier35);
        multiplePiePlot18.setDrawingSupplier(drawingSupplier35);
        multiplePiePlot0.setDrawingSupplier(drawingSupplier35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot18 and multiplePiePlot31", multiplePiePlot18.equals(multiplePiePlot31) ? multiplePiePlot18.hashCode() == multiplePiePlot31.hashCode() : true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
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
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        boolean boolean20 = multiplePiePlot19.isSubplot();
        multiplePiePlot19.setForegroundAlpha((float) 0L);
        java.awt.Paint paint23 = multiplePiePlot19.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        java.lang.String str26 = multiplePiePlot25.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        multiplePiePlot25.addChangeListener(plotChangeListener27);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = multiplePiePlot25.getDrawingSupplier();
        multiplePiePlot19.setDrawingSupplier(drawingSupplier29);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        multiplePiePlot19.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo33);
        java.awt.Paint paint35 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot19.setBackgroundPaint(paint35);
        multiplePiePlot1.setOutlinePaint(paint35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot8 and multiplePiePlot25", multiplePiePlot8.equals(multiplePiePlot25) ? multiplePiePlot8.hashCode() == multiplePiePlot25.hashCode() : true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        java.lang.Object obj7 = multiplePiePlot1.clone();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.lang.String str10 = multiplePiePlot9.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        multiplePiePlot9.addChangeListener(plotChangeListener11);
        java.awt.Image image13 = multiplePiePlot9.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart14 = multiplePiePlot9.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.lang.String str18 = multiplePiePlot17.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        multiplePiePlot17.markerChanged(markerChangeEvent19);
        java.awt.Paint paint21 = multiplePiePlot17.getAggregatedItemsPaint();
        java.lang.Comparable comparable22 = multiplePiePlot17.getAggregatedItemsKey();
        multiplePiePlot17.setBackgroundImageAlpha((float) 0);
        java.awt.Font font25 = multiplePiePlot17.getNoDataMessageFont();
        double double26 = multiplePiePlot17.getLimit();
        java.awt.Font font27 = multiplePiePlot17.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        java.lang.String str30 = multiplePiePlot29.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        multiplePiePlot29.markerChanged(markerChangeEvent31);
        java.awt.Paint paint33 = multiplePiePlot29.getAggregatedItemsPaint();
        java.lang.Comparable comparable34 = multiplePiePlot29.getAggregatedItemsKey();
        multiplePiePlot29.setBackgroundImageAlpha((float) 0);
        java.awt.Font font37 = multiplePiePlot29.getNoDataMessageFont();
        double double38 = multiplePiePlot29.getLimit();
        java.awt.Paint paint39 = multiplePiePlot29.getAggregatedItemsPaint();
        java.awt.Font font40 = multiplePiePlot29.getNoDataMessageFont();
        multiplePiePlot17.setNoDataMessageFont(font40);
        multiplePiePlot1.setNoDataMessageFont(font40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot17 and multiplePiePlot29", multiplePiePlot17.equals(multiplePiePlot29) ? multiplePiePlot17.hashCode() == multiplePiePlot29.hashCode() : true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
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
        multiplePiePlot4.setBackgroundImageAlignment(0);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        multiplePiePlot4.drawBackgroundImage(graphics2D17, rectangle2D18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        boolean boolean22 = multiplePiePlot21.isSubplot();
        multiplePiePlot21.setForegroundAlpha((float) 0L);
        java.awt.Paint paint25 = multiplePiePlot21.getNoDataMessagePaint();
        java.awt.Paint paint26 = multiplePiePlot21.getBackgroundPaint();
        boolean boolean27 = multiplePiePlot21.isOutlineVisible();
        multiplePiePlot21.zoom((double) 0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        boolean boolean32 = multiplePiePlot31.isSubplot();
        multiplePiePlot31.setForegroundAlpha((float) 0L);
        java.awt.Paint paint35 = multiplePiePlot31.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot37 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset36);
        java.lang.String str38 = multiplePiePlot37.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener39 = null;
        multiplePiePlot37.addChangeListener(plotChangeListener39);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier41 = multiplePiePlot37.getDrawingSupplier();
        multiplePiePlot31.setDrawingSupplier(drawingSupplier41);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo45 = null;
        multiplePiePlot31.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo45);
        org.jfree.chart.JFreeChart jFreeChart47 = multiplePiePlot31.getPieChart();
        multiplePiePlot21.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart47);
        multiplePiePlot4.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot37", multiplePiePlot1.equals(multiplePiePlot37) ? multiplePiePlot1.hashCode() == multiplePiePlot37.hashCode() : true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
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
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.lang.String str18 = multiplePiePlot17.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        multiplePiePlot17.addChangeListener(plotChangeListener19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot17.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = multiplePiePlot17.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets22, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot17", multiplePiePlot5.equals(multiplePiePlot17) ? multiplePiePlot5.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
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
        int int13 = multiplePiePlot1.getBackgroundImageAlignment();
        java.lang.Object obj14 = multiplePiePlot1.clone();
        multiplePiePlot1.setForegroundAlpha((float) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        boolean boolean22 = multiplePiePlot21.isSubplot();
        multiplePiePlot21.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot18.setParent((org.jfree.chart.plot.Plot) multiplePiePlot21);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        multiplePiePlot18.handleClick((int) (short) -1, (-1), plotRenderingInfo28);
        java.awt.Paint paint30 = multiplePiePlot18.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundPaint(paint30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot18", multiplePiePlot4.equals(multiplePiePlot18) ? multiplePiePlot4.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
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
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1.0f);
        float float18 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset19 = multiplePiePlot1.getDataset();
        java.lang.String str20 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.lang.String str23 = multiplePiePlot22.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        multiplePiePlot22.markerChanged(markerChangeEvent24);
        float float26 = multiplePiePlot22.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        multiplePiePlot22.setDataset(categoryDataset27);
        boolean boolean29 = multiplePiePlot22.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        java.lang.String str32 = multiplePiePlot31.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener33 = null;
        multiplePiePlot31.addChangeListener(plotChangeListener33);
        java.awt.Paint paint35 = multiplePiePlot31.getAggregatedItemsPaint();
        multiplePiePlot22.setOutlinePaint(paint35);
        multiplePiePlot1.setNoDataMessagePaint(paint35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot31", multiplePiePlot5.equals(multiplePiePlot31) ? multiplePiePlot5.hashCode() == multiplePiePlot31.hashCode() : true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Stroke stroke4 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        boolean boolean8 = multiplePiePlot7.isSubplot();
        java.awt.Paint paint9 = multiplePiePlot7.getBackgroundPaint();
        float float10 = multiplePiePlot7.getForegroundAlpha();
        java.awt.Image image11 = null;
        multiplePiePlot7.setBackgroundImage(image11);
        java.awt.Paint paint13 = multiplePiePlot7.getBackgroundPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot7", multiplePiePlot1.equals(multiplePiePlot7) ? multiplePiePlot1.hashCode() == multiplePiePlot7.hashCode() : true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
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
        multiplePiePlot1.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        java.lang.String str28 = multiplePiePlot27.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        multiplePiePlot27.markerChanged(markerChangeEvent29);
        float float31 = multiplePiePlot27.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        multiplePiePlot27.setDataset(categoryDataset32);
        boolean boolean34 = multiplePiePlot27.isOutlineVisible();
        java.awt.Paint paint35 = multiplePiePlot27.getAggregatedItemsPaint();
        multiplePiePlot1.setBackgroundPaint(paint35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot15 and multiplePiePlot27", multiplePiePlot15.equals(multiplePiePlot27) ? multiplePiePlot15.hashCode() == multiplePiePlot27.hashCode() : true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
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
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        boolean boolean15 = multiplePiePlot14.isSubplot();
        multiplePiePlot14.setForegroundAlpha((float) 0L);
        java.awt.Paint paint18 = multiplePiePlot14.getNoDataMessagePaint();
        java.awt.Paint paint19 = multiplePiePlot14.getBackgroundPaint();
        boolean boolean20 = multiplePiePlot14.isOutlineVisible();
        multiplePiePlot14.zoom((double) 0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        boolean boolean25 = multiplePiePlot24.isSubplot();
        java.awt.Paint paint26 = multiplePiePlot24.getBackgroundPaint();
        java.awt.Paint paint27 = multiplePiePlot24.getNoDataMessagePaint();
        multiplePiePlot24.setLimit((double) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier32 = null;
        multiplePiePlot31.setDrawingSupplier(drawingSupplier32);
        boolean boolean35 = multiplePiePlot31.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot36 = multiplePiePlot31.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        java.lang.String str39 = multiplePiePlot38.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener40 = null;
        multiplePiePlot38.addChangeListener(plotChangeListener40);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier42 = multiplePiePlot38.getDrawingSupplier();
        java.awt.Paint paint43 = multiplePiePlot38.getNoDataMessagePaint();
        multiplePiePlot31.setBackgroundPaint(paint43);
        multiplePiePlot24.setBackgroundPaint(paint43);
        java.awt.Image image46 = multiplePiePlot24.getBackgroundImage();
        multiplePiePlot24.setOutlineVisible(true);
        multiplePiePlot14.setParent((org.jfree.chart.plot.Plot) multiplePiePlot24);
        java.lang.Comparable comparable50 = multiplePiePlot24.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset51 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot52 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset51);
        java.lang.String str53 = multiplePiePlot52.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent54 = null;
        multiplePiePlot52.markerChanged(markerChangeEvent54);
        java.awt.Paint paint56 = multiplePiePlot52.getAggregatedItemsPaint();
        java.lang.Comparable comparable57 = multiplePiePlot52.getAggregatedItemsKey();
        multiplePiePlot52.setBackgroundImageAlpha((float) 0);
        java.awt.Font font60 = multiplePiePlot52.getNoDataMessageFont();
        double double61 = multiplePiePlot52.getLimit();
        java.awt.Font font62 = multiplePiePlot52.getNoDataMessageFont();
        multiplePiePlot24.setNoDataMessageFont(font62);
        multiplePiePlot1.setNoDataMessageFont(font62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot38", multiplePiePlot5.equals(multiplePiePlot38) ? multiplePiePlot5.hashCode() == multiplePiePlot38.hashCode() : true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = multiplePiePlot1.getInsets();
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent17 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.lang.String str21 = multiplePiePlot20.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        boolean boolean24 = multiplePiePlot23.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        boolean boolean27 = multiplePiePlot26.isSubplot();
        multiplePiePlot26.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot23.setParent((org.jfree.chart.plot.Plot) multiplePiePlot26);
        java.awt.Stroke stroke31 = multiplePiePlot26.getOutlineStroke();
        multiplePiePlot26.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        multiplePiePlot26.setDataset(categoryDataset34);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent36 = null;
        multiplePiePlot26.notifyListeners(plotChangeEvent36);
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = multiplePiePlot26.getInsets();
        multiplePiePlot20.setInsets(rectangleInsets38, true);
        multiplePiePlot1.setInsets(rectangleInsets38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot20", multiplePiePlot4.equals(multiplePiePlot20) ? multiplePiePlot4.hashCode() == multiplePiePlot20.hashCode() : true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
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
        float float36 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier39 = null;
        multiplePiePlot38.setDrawingSupplier(drawingSupplier39);
        boolean boolean42 = multiplePiePlot38.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint43 = multiplePiePlot38.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection44 = multiplePiePlot38.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot46 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset45);
        boolean boolean47 = multiplePiePlot46.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset48 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot49 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset48);
        boolean boolean50 = multiplePiePlot49.isSubplot();
        multiplePiePlot49.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot46.setParent((org.jfree.chart.plot.Plot) multiplePiePlot49);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier54 = multiplePiePlot46.getDrawingSupplier();
        multiplePiePlot38.setDrawingSupplier(drawingSupplier54);
        multiplePiePlot1.setDrawingSupplier(drawingSupplier54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection6 and legendItemCollection44", legendItemCollection6.equals(legendItemCollection44) ? legendItemCollection6.hashCode() == legendItemCollection44.hashCode() : true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
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
        org.jfree.chart.util.TableOrder tableOrder16 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        java.lang.String str19 = multiplePiePlot18.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        multiplePiePlot18.addChangeListener(plotChangeListener20);
        java.awt.Image image22 = multiplePiePlot18.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot18.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot18", multiplePiePlot9.equals(multiplePiePlot18) ? multiplePiePlot9.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
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
        multiplePiePlot1.setBackgroundAlpha((float) 100);
        org.jfree.data.general.DatasetGroup datasetGroup24 = multiplePiePlot1.getDatasetGroup();
        java.lang.Object obj25 = multiplePiePlot1.clone();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        boolean boolean28 = multiplePiePlot27.isSubplot();
        java.awt.Paint paint29 = multiplePiePlot27.getBackgroundPaint();
        float float30 = multiplePiePlot27.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        java.lang.String str33 = multiplePiePlot32.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent34 = null;
        multiplePiePlot32.markerChanged(markerChangeEvent34);
        java.awt.Paint paint36 = null;
        multiplePiePlot32.setBackgroundPaint(paint36);
        multiplePiePlot32.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font40 = multiplePiePlot32.getNoDataMessageFont();
        multiplePiePlot27.setNoDataMessageFont(font40);
        java.awt.Paint paint42 = multiplePiePlot27.getNoDataMessagePaint();
        org.jfree.chart.JFreeChart jFreeChart43 = multiplePiePlot27.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot27", multiplePiePlot5.equals(multiplePiePlot27) ? multiplePiePlot5.hashCode() == multiplePiePlot27.hashCode() : true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
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
        boolean boolean23 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        java.lang.String str26 = multiplePiePlot25.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        multiplePiePlot25.markerChanged(markerChangeEvent27);
        java.awt.Paint paint29 = multiplePiePlot25.getAggregatedItemsPaint();
        java.lang.Comparable comparable30 = multiplePiePlot25.getAggregatedItemsKey();
        multiplePiePlot25.setBackgroundImageAlpha((float) 0);
        java.awt.Font font33 = multiplePiePlot25.getNoDataMessageFont();
        double double34 = multiplePiePlot25.getLimit();
        java.awt.Paint paint35 = multiplePiePlot25.getAggregatedItemsPaint();
        double double36 = multiplePiePlot25.getLimit();
        java.lang.String str37 = multiplePiePlot25.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot39 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset38);
        boolean boolean40 = multiplePiePlot39.isSubplot();
        java.awt.Paint paint41 = multiplePiePlot39.getBackgroundPaint();
        java.awt.Graphics2D graphics2D42 = null;
        java.awt.geom.Rectangle2D rectangle2D43 = null;
        multiplePiePlot39.drawBackgroundImage(graphics2D42, rectangle2D43);
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        multiplePiePlot39.setDataset(categoryDataset45);
        java.awt.Paint paint47 = multiplePiePlot39.getNoDataMessagePaint();
        multiplePiePlot25.setAggregatedItemsPaint(paint47);
        multiplePiePlot1.setAggregatedItemsPaint(paint47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot39", multiplePiePlot5.equals(multiplePiePlot39) ? multiplePiePlot5.hashCode() == multiplePiePlot39.hashCode() : true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        multiplePiePlot1.handleClick((int) (short) 0, 15, plotRenderingInfo16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        boolean boolean20 = multiplePiePlot19.isSubplot();
        java.awt.Paint paint21 = multiplePiePlot19.getBackgroundPaint();
        java.awt.Paint paint22 = multiplePiePlot19.getNoDataMessagePaint();
        multiplePiePlot19.setLimit((double) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = null;
        multiplePiePlot26.setDrawingSupplier(drawingSupplier27);
        boolean boolean30 = multiplePiePlot26.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot31 = multiplePiePlot26.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        java.lang.String str34 = multiplePiePlot33.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener35 = null;
        multiplePiePlot33.addChangeListener(plotChangeListener35);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier37 = multiplePiePlot33.getDrawingSupplier();
        java.awt.Paint paint38 = multiplePiePlot33.getNoDataMessagePaint();
        multiplePiePlot26.setBackgroundPaint(paint38);
        multiplePiePlot19.setBackgroundPaint(paint38);
        multiplePiePlot1.setAggregatedItemsPaint(paint38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot33", multiplePiePlot5.equals(multiplePiePlot33) ? multiplePiePlot5.hashCode() == multiplePiePlot33.hashCode() : true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
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
        multiplePiePlot1.setBackgroundImageAlignment(100);
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
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot42", multiplePiePlot5.equals(multiplePiePlot42) ? multiplePiePlot5.hashCode() == multiplePiePlot42.hashCode() : true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        multiplePiePlot8.addChangeListener(plotChangeListener10);
        java.awt.Image image12 = multiplePiePlot8.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart13 = multiplePiePlot8.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart13);
        java.lang.Object obj15 = multiplePiePlot1.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart6 and jFreeChart13", jFreeChart6.equals(jFreeChart13) ? jFreeChart6.hashCode() == jFreeChart13.hashCode() : true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
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
        int int13 = multiplePiePlot1.getBackgroundImageAlignment();
        java.lang.Object obj14 = multiplePiePlot1.clone();
        multiplePiePlot1.setForegroundAlpha((float) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = null;
        multiplePiePlot18.setDrawingSupplier(drawingSupplier19);
        java.awt.Paint paint21 = multiplePiePlot18.getOutlinePaint();
        multiplePiePlot18.setBackgroundAlpha((float) (-1));
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        java.lang.String str26 = multiplePiePlot25.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        multiplePiePlot25.addChangeListener(plotChangeListener27);
        multiplePiePlot25.setForegroundAlpha((float) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        boolean boolean33 = multiplePiePlot32.isSubplot();
        multiplePiePlot32.setForegroundAlpha((float) 0L);
        java.awt.Paint paint36 = multiplePiePlot32.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        java.lang.String str39 = multiplePiePlot38.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener40 = null;
        multiplePiePlot38.addChangeListener(plotChangeListener40);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier42 = multiplePiePlot38.getDrawingSupplier();
        multiplePiePlot32.setDrawingSupplier(drawingSupplier42);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo46 = null;
        multiplePiePlot32.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo46);
        float float48 = multiplePiePlot32.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset49 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot50 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset49);
        multiplePiePlot50.setAggregatedItemsKey((java.lang.Comparable) 10);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent53 = null;
        multiplePiePlot50.markerChanged(markerChangeEvent53);
        multiplePiePlot50.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.awt.Image image57 = multiplePiePlot50.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset58 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot59 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset58);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier60 = null;
        multiplePiePlot59.setDrawingSupplier(drawingSupplier60);
        org.jfree.chart.plot.Plot plot62 = multiplePiePlot59.getParent();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent63 = null;
        multiplePiePlot59.datasetChanged(datasetChangeEvent63);
        multiplePiePlot59.setAggregatedItemsKey((java.lang.Comparable) (-1));
        float float67 = multiplePiePlot59.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart68 = multiplePiePlot59.getPieChart();
        multiplePiePlot50.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart68);
        multiplePiePlot32.setPieChart(jFreeChart68);
        multiplePiePlot25.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart68);
        multiplePiePlot18.setPieChart(jFreeChart68);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart68);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot38", multiplePiePlot4.equals(multiplePiePlot38) ? multiplePiePlot4.hashCode() == multiplePiePlot38.hashCode() : true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        boolean boolean7 = plot6.isOutlineVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        plot6.handleClick((int) (short) 10, 1, plotRenderingInfo10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        plot6.handleClick((int) (byte) 10, 0, plotRenderingInfo14);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent16 = null;
        plot6.datasetChanged(datasetChangeEvent16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.lang.String str20 = multiplePiePlot19.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        multiplePiePlot19.markerChanged(markerChangeEvent21);
        java.awt.Image image23 = multiplePiePlot19.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        multiplePiePlot19.setDataset(categoryDataset24);
        float float26 = multiplePiePlot19.getForegroundAlpha();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent27 = null;
        multiplePiePlot19.datasetChanged(datasetChangeEvent27);
        plot6.setParent((org.jfree.chart.plot.Plot) multiplePiePlot19);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot31 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset30);
        boolean boolean32 = multiplePiePlot31.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        boolean boolean35 = multiplePiePlot34.isSubplot();
        multiplePiePlot34.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot31.setParent((org.jfree.chart.plot.Plot) multiplePiePlot34);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo41 = null;
        multiplePiePlot31.handleClick((int) (short) -1, (-1), plotRenderingInfo41);
        org.jfree.chart.plot.Plot plot43 = multiplePiePlot31.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent44 = null;
        multiplePiePlot31.markerChanged(markerChangeEvent44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot47 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset46);
        java.lang.String str48 = multiplePiePlot47.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent49 = null;
        multiplePiePlot47.markerChanged(markerChangeEvent49);
        java.awt.Paint paint51 = multiplePiePlot47.getAggregatedItemsPaint();
        java.lang.Comparable comparable52 = multiplePiePlot47.getAggregatedItemsKey();
        multiplePiePlot47.setBackgroundImageAlpha((float) 0);
        java.awt.Font font55 = multiplePiePlot47.getNoDataMessageFont();
        double double56 = multiplePiePlot47.getLimit();
        java.awt.Paint paint57 = multiplePiePlot47.getAggregatedItemsPaint();
        java.awt.Paint paint58 = multiplePiePlot47.getOutlinePaint();
        java.awt.Stroke stroke59 = multiplePiePlot47.getOutlineStroke();
        multiplePiePlot31.setOutlineStroke(stroke59);
        multiplePiePlot19.setOutlineStroke(stroke59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot31", multiplePiePlot1.equals(multiplePiePlot31) ? multiplePiePlot1.hashCode() == multiplePiePlot31.hashCode() : true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
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
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        boolean boolean34 = multiplePiePlot33.isSubplot();
        java.awt.Paint paint35 = multiplePiePlot33.getBackgroundPaint();
        float float36 = multiplePiePlot33.getForegroundAlpha();
        java.awt.Image image37 = null;
        multiplePiePlot33.setBackgroundImage(image37);
        java.awt.Paint paint39 = multiplePiePlot33.getBackgroundPaint();
        multiplePiePlot4.setBackgroundPaint(paint39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot33", multiplePiePlot1.equals(multiplePiePlot33) ? multiplePiePlot1.hashCode() == multiplePiePlot33.hashCode() : true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
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
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.lang.String str17 = multiplePiePlot16.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        multiplePiePlot16.markerChanged(markerChangeEvent18);
        java.awt.Paint paint20 = multiplePiePlot16.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.lang.String str23 = multiplePiePlot22.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        multiplePiePlot22.addChangeListener(plotChangeListener24);
        java.awt.Image image26 = multiplePiePlot22.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart27 = multiplePiePlot22.getPieChart();
        multiplePiePlot16.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart27);
        java.lang.String str29 = multiplePiePlot16.getPlotType();
        float float30 = multiplePiePlot16.getForegroundAlpha();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = multiplePiePlot16.getDrawingSupplier();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        multiplePiePlot16.markerChanged(markerChangeEvent32);
        multiplePiePlot16.setForegroundAlpha((float) 'a');
        java.awt.Paint paint36 = multiplePiePlot16.getAggregatedItemsPaint();
        boolean boolean37 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot22", multiplePiePlot7.equals(multiplePiePlot22) ? multiplePiePlot7.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
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
        multiplePiePlot1.setOutlineVisible(false);
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
        org.jfree.chart.LegendItemCollection legendItemCollection24 = multiplePiePlot14.getLegendItems();
        java.lang.String str25 = multiplePiePlot14.getPlotType();
        multiplePiePlot14.setBackgroundImageAlignment((int) 'a');
        java.lang.String str28 = multiplePiePlot14.getNoDataMessage();
        boolean boolean29 = multiplePiePlot14.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        multiplePiePlot14.setDataset(categoryDataset30);
        java.awt.Paint paint32 = multiplePiePlot14.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        multiplePiePlot14.setDataset(categoryDataset33);
        java.lang.String str35 = multiplePiePlot14.getPlotType();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent36 = null;
        multiplePiePlot14.markerChanged(markerChangeEvent36);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier38 = multiplePiePlot14.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection9 and legendItemCollection24", legendItemCollection9.equals(legendItemCollection24) ? legendItemCollection9.hashCode() == legendItemCollection24.hashCode() : true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
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
        float float36 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot40 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset39);
        java.lang.String str41 = multiplePiePlot40.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener42 = null;
        multiplePiePlot40.addChangeListener(plotChangeListener42);
        java.awt.Image image44 = multiplePiePlot40.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart45 = multiplePiePlot40.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets46 = multiplePiePlot40.getInsets();
        multiplePiePlot38.setInsets(rectangleInsets46);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier48 = multiplePiePlot38.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot29 and multiplePiePlot38", multiplePiePlot29.equals(multiplePiePlot38) ? multiplePiePlot29.hashCode() == multiplePiePlot38.hashCode() : true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
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
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot1.getRootPlot();
        java.awt.Paint paint18 = plot17.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.awt.Image image21 = null;
        multiplePiePlot20.setBackgroundImage(image21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        boolean boolean25 = multiplePiePlot24.isSubplot();
        java.awt.Paint paint26 = multiplePiePlot24.getBackgroundPaint();
        float float27 = multiplePiePlot24.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        java.lang.String str30 = multiplePiePlot29.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        multiplePiePlot29.markerChanged(markerChangeEvent31);
        java.awt.Paint paint33 = null;
        multiplePiePlot29.setBackgroundPaint(paint33);
        multiplePiePlot29.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font37 = multiplePiePlot29.getNoDataMessageFont();
        multiplePiePlot24.setNoDataMessageFont(font37);
        multiplePiePlot20.setNoDataMessageFont(font37);
        plot17.setNoDataMessageFont(font37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot8 and multiplePiePlot20", multiplePiePlot8.equals(multiplePiePlot20) ? multiplePiePlot8.hashCode() == multiplePiePlot20.hashCode() : true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
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
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.lang.String str18 = multiplePiePlot17.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        multiplePiePlot17.markerChanged(markerChangeEvent19);
        java.awt.Paint paint21 = multiplePiePlot17.getAggregatedItemsPaint();
        java.lang.Comparable comparable22 = multiplePiePlot17.getAggregatedItemsKey();
        multiplePiePlot17.setBackgroundImageAlpha((float) 0);
        java.awt.Font font25 = multiplePiePlot17.getNoDataMessageFont();
        double double26 = multiplePiePlot17.getLimit();
        java.awt.Paint paint27 = multiplePiePlot17.getAggregatedItemsPaint();
        double double28 = multiplePiePlot17.getLimit();
        java.awt.Paint paint29 = multiplePiePlot17.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundPaint(paint29);
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        java.lang.String str33 = multiplePiePlot32.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent34 = null;
        multiplePiePlot32.markerChanged(markerChangeEvent34);
        java.awt.Paint paint36 = multiplePiePlot32.getAggregatedItemsPaint();
        java.lang.Comparable comparable37 = multiplePiePlot32.getAggregatedItemsKey();
        multiplePiePlot32.setBackgroundImageAlpha((float) 0);
        java.awt.Font font40 = multiplePiePlot32.getNoDataMessageFont();
        double double41 = multiplePiePlot32.getLimit();
        java.awt.Font font42 = multiplePiePlot32.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot44 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset43);
        java.lang.String str45 = multiplePiePlot44.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent46 = null;
        multiplePiePlot44.markerChanged(markerChangeEvent46);
        java.awt.Paint paint48 = multiplePiePlot44.getAggregatedItemsPaint();
        java.lang.Comparable comparable49 = multiplePiePlot44.getAggregatedItemsKey();
        multiplePiePlot44.setBackgroundImageAlpha((float) 0);
        java.awt.Font font52 = multiplePiePlot44.getNoDataMessageFont();
        double double53 = multiplePiePlot44.getLimit();
        java.awt.Paint paint54 = multiplePiePlot44.getAggregatedItemsPaint();
        java.awt.Font font55 = multiplePiePlot44.getNoDataMessageFont();
        multiplePiePlot32.setNoDataMessageFont(font55);
        org.jfree.chart.LegendItemCollection legendItemCollection57 = multiplePiePlot32.getLegendItems();
        java.awt.Paint paint58 = multiplePiePlot32.getNoDataMessagePaint();
        multiplePiePlot1.setOutlinePaint(paint58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection14 and legendItemCollection57", legendItemCollection14.equals(legendItemCollection57) ? legendItemCollection14.hashCode() == legendItemCollection57.hashCode() : true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        boolean boolean8 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1.0f);
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier14);
        boolean boolean17 = multiplePiePlot13.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint18 = multiplePiePlot13.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection19 = multiplePiePlot13.getLegendItems();
        multiplePiePlot13.setBackgroundImageAlpha(0.0f);
        java.awt.Stroke stroke22 = multiplePiePlot13.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection7 and legendItemCollection19", legendItemCollection7.equals(legendItemCollection19) ? legendItemCollection7.hashCode() == legendItemCollection19.hashCode() : true);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = multiplePiePlot1.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        boolean boolean18 = multiplePiePlot17.isSubplot();
        java.awt.Paint paint19 = multiplePiePlot17.getBackgroundPaint();
        float float20 = multiplePiePlot17.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.lang.String str23 = multiplePiePlot22.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        multiplePiePlot22.markerChanged(markerChangeEvent24);
        java.awt.Paint paint26 = null;
        multiplePiePlot22.setBackgroundPaint(paint26);
        multiplePiePlot22.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font30 = multiplePiePlot22.getNoDataMessageFont();
        multiplePiePlot17.setNoDataMessageFont(font30);
        org.jfree.chart.plot.Plot plot32 = multiplePiePlot17.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        boolean boolean35 = multiplePiePlot34.isSubplot();
        java.awt.Paint paint36 = multiplePiePlot34.getBackgroundPaint();
        java.awt.Paint paint37 = multiplePiePlot34.getNoDataMessagePaint();
        java.awt.Paint paint38 = multiplePiePlot34.getNoDataMessagePaint();
        multiplePiePlot17.setOutlinePaint(paint38);
        org.jfree.chart.JFreeChart jFreeChart40 = multiplePiePlot17.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot34", multiplePiePlot4.equals(multiplePiePlot34) ? multiplePiePlot4.hashCode() == multiplePiePlot34.hashCode() : true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Paint paint4 = multiplePiePlot1.getAggregatedItemsPaint();
        float float5 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        float float8 = multiplePiePlot1.getBackgroundAlpha();
        double double9 = multiplePiePlot1.getLimit();
        java.awt.Paint paint10 = multiplePiePlot1.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        boolean boolean13 = multiplePiePlot12.isSubplot();
        java.awt.Paint paint14 = multiplePiePlot12.getBackgroundPaint();
        java.awt.Image image15 = multiplePiePlot12.getBackgroundImage();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        multiplePiePlot12.notifyListeners(plotChangeEvent16);
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
        multiplePiePlot19.setForegroundAlpha(0.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = multiplePiePlot19.getInsets();
        multiplePiePlot12.setInsets(rectangleInsets32);
        multiplePiePlot1.setInsets(rectangleInsets32, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot12 and multiplePiePlot22", multiplePiePlot12.equals(multiplePiePlot22) ? multiplePiePlot12.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.util.TableOrder tableOrder10 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        boolean boolean13 = multiplePiePlot12.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.lang.String str16 = multiplePiePlot15.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        multiplePiePlot15.markerChanged(markerChangeEvent17);
        java.awt.Paint paint19 = null;
        multiplePiePlot15.setBackgroundPaint(paint19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = multiplePiePlot15.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup22 = multiplePiePlot15.getDatasetGroup();
        java.awt.Paint paint23 = multiplePiePlot15.getOutlinePaint();
        multiplePiePlot12.setOutlinePaint(paint23);
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        multiplePiePlot12.drawBackgroundImage(graphics2D25, rectangle2D26);
        org.jfree.chart.JFreeChart jFreeChart28 = multiplePiePlot12.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        java.lang.String str31 = multiplePiePlot30.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener32 = null;
        multiplePiePlot30.addChangeListener(plotChangeListener32);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier34 = multiplePiePlot30.getDrawingSupplier();
        java.awt.Paint paint35 = multiplePiePlot30.getNoDataMessagePaint();
        java.awt.Image image36 = null;
        multiplePiePlot30.setBackgroundImage(image36);
        multiplePiePlot30.setNoDataMessage("hi!");
        org.jfree.chart.LegendItemCollection legendItemCollection40 = multiplePiePlot30.getLegendItems();
        multiplePiePlot30.setLimit(10.0d);
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot44 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset43);
        java.lang.String str45 = multiplePiePlot44.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent46 = null;
        multiplePiePlot44.markerChanged(markerChangeEvent46);
        java.awt.Paint paint48 = multiplePiePlot44.getAggregatedItemsPaint();
        java.lang.Comparable comparable49 = multiplePiePlot44.getAggregatedItemsKey();
        multiplePiePlot44.setBackgroundImageAlpha((float) 0);
        java.awt.Font font52 = multiplePiePlot44.getNoDataMessageFont();
        double double53 = multiplePiePlot44.getLimit();
        java.awt.Paint paint54 = multiplePiePlot44.getAggregatedItemsPaint();
        double double55 = multiplePiePlot44.getLimit();
        org.jfree.chart.util.RectangleInsets rectangleInsets56 = multiplePiePlot44.getInsets();
        multiplePiePlot30.setInsets(rectangleInsets56, true);
        multiplePiePlot12.setInsets(rectangleInsets56, false);
        multiplePiePlot1.setInsets(rectangleInsets56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection7 and legendItemCollection40", legendItemCollection7.equals(legendItemCollection40) ? legendItemCollection7.hashCode() == legendItemCollection40.hashCode() : true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
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
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        java.lang.String str22 = multiplePiePlot21.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        multiplePiePlot21.addChangeListener(plotChangeListener23);
        java.awt.Image image25 = multiplePiePlot21.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart26 = multiplePiePlot21.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = multiplePiePlot21.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets27, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot21", multiplePiePlot5.equals(multiplePiePlot21) ? multiplePiePlot5.hashCode() == multiplePiePlot21.hashCode() : true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
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
        boolean boolean13 = multiplePiePlot12.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        boolean boolean16 = multiplePiePlot15.isSubplot();
        multiplePiePlot15.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot12.setParent((org.jfree.chart.plot.Plot) multiplePiePlot15);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = multiplePiePlot15.getInsets();
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot15.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart21);
        java.lang.Object obj23 = multiplePiePlot1.clone();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent24 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot12 and obj23", multiplePiePlot12.equals(obj23) ? multiplePiePlot12.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
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
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = null;
        multiplePiePlot20.setDrawingSupplier(drawingSupplier21);
        java.awt.Image image23 = null;
        multiplePiePlot20.setBackgroundImage(image23);
        java.awt.Image image25 = multiplePiePlot20.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        boolean boolean28 = multiplePiePlot27.isSubplot();
        multiplePiePlot27.setForegroundAlpha((float) 0L);
        java.awt.Paint paint31 = multiplePiePlot27.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        java.lang.String str34 = multiplePiePlot33.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener35 = null;
        multiplePiePlot33.addChangeListener(plotChangeListener35);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier37 = multiplePiePlot33.getDrawingSupplier();
        multiplePiePlot27.setDrawingSupplier(drawingSupplier37);
        multiplePiePlot20.setDrawingSupplier(drawingSupplier37);
        java.awt.Font font40 = multiplePiePlot20.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot41 = multiplePiePlot20.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot43 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset42);
        multiplePiePlot43.setAggregatedItemsKey((java.lang.Comparable) 10);
        org.jfree.chart.JFreeChart jFreeChart46 = multiplePiePlot43.getPieChart();
        multiplePiePlot20.setPieChart(jFreeChart46);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot20 and multiplePiePlot33", multiplePiePlot20.equals(multiplePiePlot33) ? multiplePiePlot20.hashCode() == multiplePiePlot33.hashCode() : true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Image image4 = null;
        multiplePiePlot1.setBackgroundImage(image4);
        java.awt.Image image6 = multiplePiePlot1.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.lang.String str11 = multiplePiePlot10.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        multiplePiePlot10.addChangeListener(plotChangeListener12);
        java.awt.Image image14 = multiplePiePlot10.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart15 = multiplePiePlot10.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = multiplePiePlot10.getInsets();
        multiplePiePlot8.setInsets(rectangleInsets16);
        org.jfree.chart.JFreeChart jFreeChart18 = multiplePiePlot8.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot8 and multiplePiePlot10", multiplePiePlot8.equals(multiplePiePlot10) ? multiplePiePlot8.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
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
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        java.lang.String str27 = multiplePiePlot26.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent28 = null;
        multiplePiePlot26.markerChanged(markerChangeEvent28);
        java.awt.Paint paint30 = multiplePiePlot26.getAggregatedItemsPaint();
        multiplePiePlot23.setOutlinePaint(paint30);
        java.lang.String str32 = multiplePiePlot23.getPlotType();
        java.lang.String str33 = multiplePiePlot23.getNoDataMessage();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = multiplePiePlot23.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot26", multiplePiePlot5.equals(multiplePiePlot26) ? multiplePiePlot5.hashCode() == multiplePiePlot26.hashCode() : true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
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
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot37 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset36);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier38 = null;
        multiplePiePlot37.setDrawingSupplier(drawingSupplier38);
        float float40 = multiplePiePlot37.getBackgroundImageAlpha();
        java.awt.Paint paint41 = multiplePiePlot37.getBackgroundPaint();
        multiplePiePlot37.setAggregatedItemsKey((java.lang.Comparable) 1L);
        int int44 = multiplePiePlot37.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot46 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset45);
        boolean boolean47 = multiplePiePlot46.isSubplot();
        java.awt.Paint paint48 = multiplePiePlot46.getBackgroundPaint();
        java.awt.Image image49 = multiplePiePlot46.getBackgroundImage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent50 = null;
        multiplePiePlot46.markerChanged(markerChangeEvent50);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier52 = multiplePiePlot46.getDrawingSupplier();
        multiplePiePlot37.setDrawingSupplier(drawingSupplier52);
        multiplePiePlot1.setDrawingSupplier(drawingSupplier52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot29 and multiplePiePlot46", multiplePiePlot29.equals(multiplePiePlot46) ? multiplePiePlot29.hashCode() == multiplePiePlot46.hashCode() : true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
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
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint17);
        boolean boolean19 = multiplePiePlot1.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        boolean boolean22 = multiplePiePlot21.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        boolean boolean25 = multiplePiePlot24.isSubplot();
        multiplePiePlot24.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot21.setParent((org.jfree.chart.plot.Plot) multiplePiePlot24);
        java.awt.Stroke stroke29 = multiplePiePlot24.getOutlineStroke();
        multiplePiePlot24.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        multiplePiePlot24.setDataset(categoryDataset32);
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        multiplePiePlot24.drawBackgroundImage(graphics2D34, rectangle2D35);
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
        multiplePiePlot24.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart47);
        multiplePiePlot1.setPieChart(jFreeChart47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot21", multiplePiePlot7.equals(multiplePiePlot21) ? multiplePiePlot7.hashCode() == multiplePiePlot21.hashCode() : true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
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
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.zoom((double) 100L);
        java.awt.Font font20 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.lang.String str23 = multiplePiePlot22.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        multiplePiePlot22.addChangeListener(plotChangeListener24);
        java.awt.Image image26 = multiplePiePlot22.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart27 = multiplePiePlot22.getPieChart();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = multiplePiePlot22.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets28, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot22", multiplePiePlot7.equals(multiplePiePlot22) ? multiplePiePlot7.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
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
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        multiplePiePlot4.drawBackgroundImage(graphics2D14, rectangle2D15);
        multiplePiePlot4.setBackgroundAlpha((float) (byte) -1);
        multiplePiePlot4.setBackgroundImageAlignment(1);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        boolean boolean23 = multiplePiePlot22.isSubplot();
        java.awt.Paint paint24 = multiplePiePlot22.getBackgroundPaint();
        multiplePiePlot4.setNoDataMessagePaint(paint24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot22", multiplePiePlot1.equals(multiplePiePlot22) ? multiplePiePlot1.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        boolean boolean7 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        java.awt.Image image11 = null;
        multiplePiePlot10.setBackgroundImage(image11);
        multiplePiePlot10.zoom((double) 10L);
        org.jfree.data.general.DatasetGroup datasetGroup15 = multiplePiePlot10.getDatasetGroup();
        org.jfree.chart.JFreeChart jFreeChart16 = multiplePiePlot10.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        java.lang.String str19 = multiplePiePlot18.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        multiplePiePlot18.markerChanged(markerChangeEvent20);
        java.awt.Paint paint22 = null;
        multiplePiePlot18.setBackgroundPaint(paint22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = multiplePiePlot18.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup25 = multiplePiePlot18.getDatasetGroup();
        multiplePiePlot18.setAggregatedItemsKey((java.lang.Comparable) (short) 10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        multiplePiePlot18.handleClick((int) '#', 1, plotRenderingInfo30);
        java.awt.Font font32 = multiplePiePlot18.getNoDataMessageFont();
        multiplePiePlot10.setNoDataMessageFont(font32);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        org.jfree.data.category.CategoryDataset categoryDataset35 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot10", multiplePiePlot1.equals(multiplePiePlot10) ? multiplePiePlot1.hashCode() == multiplePiePlot10.hashCode() : true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
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
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        multiplePiePlot1.setDataset(categoryDataset13);
        multiplePiePlot1.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        boolean boolean22 = multiplePiePlot21.isSubplot();
        multiplePiePlot21.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot18.setParent((org.jfree.chart.plot.Plot) multiplePiePlot21);
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = multiplePiePlot21.getInsets();
        org.jfree.chart.JFreeChart jFreeChart27 = multiplePiePlot21.getPieChart();
        org.jfree.chart.JFreeChart jFreeChart28 = multiplePiePlot21.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot18", multiplePiePlot7.equals(multiplePiePlot18) ? multiplePiePlot7.hashCode() == multiplePiePlot18.hashCode() : true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1));
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        boolean boolean14 = multiplePiePlot13.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        boolean boolean17 = multiplePiePlot16.isSubplot();
        multiplePiePlot16.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot13.setParent((org.jfree.chart.plot.Plot) multiplePiePlot16);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = multiplePiePlot16.getInsets();
        multiplePiePlot10.setInsets(rectangleInsets21);
        java.awt.Paint paint23 = multiplePiePlot10.getNoDataMessagePaint();
        multiplePiePlot1.setNoDataMessagePaint(paint23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot10 and multiplePiePlot13", multiplePiePlot10.equals(multiplePiePlot13) ? multiplePiePlot10.hashCode() == multiplePiePlot13.hashCode() : true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        boolean boolean26 = multiplePiePlot25.isSubplot();
        java.awt.Paint paint27 = multiplePiePlot25.getBackgroundPaint();
        java.awt.Paint paint28 = multiplePiePlot25.getNoDataMessagePaint();
        float float29 = multiplePiePlot25.getBackgroundAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot25);
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        java.lang.String str33 = multiplePiePlot32.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent34 = null;
        multiplePiePlot32.markerChanged(markerChangeEvent34);
        java.awt.Paint paint36 = multiplePiePlot32.getAggregatedItemsPaint();
        java.lang.Comparable comparable37 = multiplePiePlot32.getAggregatedItemsKey();
        multiplePiePlot32.setBackgroundImageAlpha((float) 0);
        java.awt.Font font40 = multiplePiePlot32.getNoDataMessageFont();
        double double41 = multiplePiePlot32.getLimit();
        java.awt.Font font42 = multiplePiePlot32.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        multiplePiePlot32.setDataset(categoryDataset43);
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot46 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset45);
        boolean boolean47 = multiplePiePlot46.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset48 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot49 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset48);
        java.lang.String str50 = multiplePiePlot49.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent51 = null;
        multiplePiePlot49.markerChanged(markerChangeEvent51);
        java.awt.Paint paint53 = null;
        multiplePiePlot49.setBackgroundPaint(paint53);
        org.jfree.data.category.CategoryDataset categoryDataset55 = multiplePiePlot49.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup56 = multiplePiePlot49.getDatasetGroup();
        java.awt.Paint paint57 = multiplePiePlot49.getOutlinePaint();
        multiplePiePlot46.setOutlinePaint(paint57);
        java.awt.Graphics2D graphics2D59 = null;
        java.awt.geom.Rectangle2D rectangle2D60 = null;
        multiplePiePlot46.drawBackgroundImage(graphics2D59, rectangle2D60);
        org.jfree.chart.JFreeChart jFreeChart62 = multiplePiePlot46.getPieChart();
        multiplePiePlot32.setPieChart(jFreeChart62);
        multiplePiePlot25.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot5", multiplePiePlot1.equals(multiplePiePlot5) ? multiplePiePlot1.hashCode() == multiplePiePlot5.hashCode() : true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = multiplePiePlot1.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        boolean boolean26 = multiplePiePlot25.isSubplot();
        java.awt.Paint paint27 = multiplePiePlot25.getBackgroundPaint();
        java.awt.Paint paint28 = multiplePiePlot25.getNoDataMessagePaint();
        float float29 = multiplePiePlot25.getBackgroundAlpha();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot25);
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier33 = null;
        multiplePiePlot32.setDrawingSupplier(drawingSupplier33);
        boolean boolean36 = multiplePiePlot32.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot37 = multiplePiePlot32.getRootPlot();
        multiplePiePlot32.zoom((double) (short) 1);
        multiplePiePlot32.setForegroundAlpha((float) 15);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo44 = null;
        multiplePiePlot32.handleClick((int) (short) 100, 15, plotRenderingInfo44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot47 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset46);
        boolean boolean48 = multiplePiePlot47.isSubplot();
        multiplePiePlot47.setForegroundAlpha((float) 0L);
        java.awt.Paint paint51 = multiplePiePlot47.getNoDataMessagePaint();
        java.awt.Paint paint52 = multiplePiePlot47.getBackgroundPaint();
        multiplePiePlot47.setBackgroundAlpha(10.0f);
        multiplePiePlot47.setAggregatedItemsKey((java.lang.Comparable) 0.5f);
        java.awt.Paint paint57 = multiplePiePlot47.getNoDataMessagePaint();
        multiplePiePlot32.setNoDataMessagePaint(paint57);
        multiplePiePlot25.setParent((org.jfree.chart.plot.Plot) multiplePiePlot32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot5", multiplePiePlot1.equals(multiplePiePlot5) ? multiplePiePlot1.hashCode() == multiplePiePlot5.hashCode() : true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1));
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        boolean boolean14 = multiplePiePlot13.isSubplot();
        multiplePiePlot13.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot10.setParent((org.jfree.chart.plot.Plot) multiplePiePlot13);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = multiplePiePlot13.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets18, false);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        boolean boolean23 = multiplePiePlot22.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        boolean boolean26 = multiplePiePlot25.isSubplot();
        multiplePiePlot25.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot22.setParent((org.jfree.chart.plot.Plot) multiplePiePlot25);
        java.awt.Paint paint30 = multiplePiePlot25.getOutlinePaint();
        java.awt.Paint paint31 = multiplePiePlot25.getNoDataMessagePaint();
        multiplePiePlot1.setOutlinePaint(paint31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot10 and multiplePiePlot22", multiplePiePlot10.equals(multiplePiePlot22) ? multiplePiePlot10.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
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
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = null;
        multiplePiePlot30.setDrawingSupplier(drawingSupplier31);
        boolean boolean34 = multiplePiePlot30.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot35 = multiplePiePlot30.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot37 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset36);
        java.lang.String str38 = multiplePiePlot37.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener39 = null;
        multiplePiePlot37.addChangeListener(plotChangeListener39);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier41 = multiplePiePlot37.getDrawingSupplier();
        java.awt.Paint paint42 = multiplePiePlot37.getNoDataMessagePaint();
        multiplePiePlot30.setBackgroundPaint(paint42);
        java.awt.Paint paint44 = null;
        multiplePiePlot30.setOutlinePaint(paint44);
        multiplePiePlot30.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset48 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot49 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset48);
        java.lang.String str50 = multiplePiePlot49.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent51 = null;
        multiplePiePlot49.markerChanged(markerChangeEvent51);
        java.awt.Paint paint53 = multiplePiePlot49.getAggregatedItemsPaint();
        java.lang.Comparable comparable54 = multiplePiePlot49.getAggregatedItemsKey();
        multiplePiePlot49.setBackgroundImageAlpha((float) 0);
        java.awt.Font font57 = multiplePiePlot49.getNoDataMessageFont();
        double double58 = multiplePiePlot49.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset59 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot60 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset59);
        java.lang.String str61 = multiplePiePlot60.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent62 = null;
        multiplePiePlot60.markerChanged(markerChangeEvent62);
        java.awt.Paint paint64 = null;
        multiplePiePlot60.setBackgroundPaint(paint64);
        org.jfree.data.category.CategoryDataset categoryDataset66 = multiplePiePlot60.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup67 = multiplePiePlot60.getDatasetGroup();
        java.awt.Paint paint68 = multiplePiePlot60.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets69 = multiplePiePlot60.getInsets();
        multiplePiePlot49.setInsets(rectangleInsets69, false);
        multiplePiePlot30.setInsets(rectangleInsets69);
        multiplePiePlot1.setInsets(rectangleInsets69, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and multiplePiePlot37", obj5.equals(multiplePiePlot37) ? obj5.hashCode() == multiplePiePlot37.hashCode() : true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
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
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        boolean boolean15 = multiplePiePlot14.isSubplot();
        multiplePiePlot14.setForegroundAlpha((float) 0L);
        java.awt.Paint paint18 = multiplePiePlot14.getNoDataMessagePaint();
        java.awt.Paint paint19 = multiplePiePlot14.getBackgroundPaint();
        boolean boolean20 = multiplePiePlot14.isOutlineVisible();
        multiplePiePlot14.zoom((double) 0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent25 = null;
        multiplePiePlot24.notifyListeners(plotChangeEvent25);
        java.awt.Stroke stroke27 = multiplePiePlot24.getOutlineStroke();
        java.awt.Font font28 = multiplePiePlot24.getNoDataMessageFont();
        multiplePiePlot14.setNoDataMessageFont(font28);
        multiplePiePlot1.setNoDataMessageFont(font28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot24", multiplePiePlot4.equals(multiplePiePlot24) ? multiplePiePlot4.hashCode() == multiplePiePlot24.hashCode() : true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        float float7 = plot4.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier10);
        java.awt.Image image12 = null;
        multiplePiePlot9.setBackgroundImage(image12);
        java.awt.Image image14 = multiplePiePlot9.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        boolean boolean17 = multiplePiePlot16.isSubplot();
        multiplePiePlot16.setForegroundAlpha((float) 0L);
        java.awt.Paint paint20 = multiplePiePlot16.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.lang.String str23 = multiplePiePlot22.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        multiplePiePlot22.addChangeListener(plotChangeListener24);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = multiplePiePlot22.getDrawingSupplier();
        multiplePiePlot16.setDrawingSupplier(drawingSupplier26);
        multiplePiePlot9.setDrawingSupplier(drawingSupplier26);
        plot4.setDrawingSupplier(drawingSupplier26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on plot4 and multiplePiePlot9", plot4.equals(multiplePiePlot9) ? plot4.hashCode() == multiplePiePlot9.hashCode() : true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
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
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        boolean boolean16 = multiplePiePlot15.isSubplot();
        float float17 = multiplePiePlot15.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.lang.String str20 = multiplePiePlot19.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        multiplePiePlot19.markerChanged(markerChangeEvent21);
        java.awt.Paint paint23 = multiplePiePlot19.getAggregatedItemsPaint();
        java.lang.Comparable comparable24 = multiplePiePlot19.getAggregatedItemsKey();
        multiplePiePlot19.setBackgroundImageAlpha((float) 0);
        java.awt.Image image27 = null;
        multiplePiePlot19.setBackgroundImage(image27);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        java.lang.String str31 = multiplePiePlot30.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        multiplePiePlot30.markerChanged(markerChangeEvent32);
        java.awt.Image image34 = multiplePiePlot30.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection35 = multiplePiePlot30.getLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier36 = multiplePiePlot30.getDrawingSupplier();
        multiplePiePlot19.setDrawingSupplier(drawingSupplier36);
        multiplePiePlot15.setDrawingSupplier(drawingSupplier36);
        multiplePiePlot1.setDrawingSupplier(drawingSupplier36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot15 and multiplePiePlot30", multiplePiePlot15.equals(multiplePiePlot30) ? multiplePiePlot15.hashCode() == multiplePiePlot30.hashCode() : true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        java.awt.Image image9 = null;
        multiplePiePlot1.setBackgroundImage(image9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.lang.String str13 = multiplePiePlot12.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot12.markerChanged(markerChangeEvent14);
        java.awt.Image image16 = multiplePiePlot12.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection17 = multiplePiePlot12.getLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = multiplePiePlot12.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier18);
        multiplePiePlot1.setLimit((double) (short) 10);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = null;
        multiplePiePlot23.setDrawingSupplier(drawingSupplier24);
        org.jfree.chart.plot.Plot plot26 = multiplePiePlot23.getParent();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent27 = null;
        multiplePiePlot23.datasetChanged(datasetChangeEvent27);
        multiplePiePlot23.setAggregatedItemsKey((java.lang.Comparable) (-1));
        org.jfree.data.category.CategoryDataset categoryDataset31 = multiplePiePlot23.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        java.lang.String str34 = multiplePiePlot33.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent35 = null;
        multiplePiePlot33.markerChanged(markerChangeEvent35);
        java.awt.Paint paint37 = multiplePiePlot33.getAggregatedItemsPaint();
        java.lang.Comparable comparable38 = multiplePiePlot33.getAggregatedItemsKey();
        multiplePiePlot33.setBackgroundImageAlpha((float) 0);
        java.awt.Font font41 = multiplePiePlot33.getNoDataMessageFont();
        double double42 = multiplePiePlot33.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot44 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset43);
        java.lang.String str45 = multiplePiePlot44.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent46 = null;
        multiplePiePlot44.markerChanged(markerChangeEvent46);
        java.awt.Paint paint48 = null;
        multiplePiePlot44.setBackgroundPaint(paint48);
        org.jfree.data.category.CategoryDataset categoryDataset50 = multiplePiePlot44.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup51 = multiplePiePlot44.getDatasetGroup();
        java.awt.Paint paint52 = multiplePiePlot44.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets53 = multiplePiePlot44.getInsets();
        multiplePiePlot33.setInsets(rectangleInsets53, false);
        org.jfree.data.category.CategoryDataset categoryDataset56 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot57 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset56);
        boolean boolean58 = multiplePiePlot57.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset59 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot60 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset59);
        boolean boolean61 = multiplePiePlot60.isSubplot();
        multiplePiePlot60.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot57.setParent((org.jfree.chart.plot.Plot) multiplePiePlot60);
        org.jfree.chart.util.RectangleInsets rectangleInsets65 = multiplePiePlot60.getInsets();
        org.jfree.chart.JFreeChart jFreeChart66 = multiplePiePlot60.getPieChart();
        multiplePiePlot33.setPieChart(jFreeChart66);
        multiplePiePlot23.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart66);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot12 and multiplePiePlot57", multiplePiePlot12.equals(multiplePiePlot57) ? multiplePiePlot12.hashCode() == multiplePiePlot57.hashCode() : true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot4.getInsets();
        float float10 = multiplePiePlot4.getBackgroundImageAlpha();
        java.lang.Comparable comparable11 = multiplePiePlot4.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        multiplePiePlot13.addChangeListener(plotChangeListener15);
        boolean boolean17 = multiplePiePlot13.isSubplot();
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot13.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        boolean boolean21 = multiplePiePlot20.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        java.lang.String str24 = multiplePiePlot23.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        multiplePiePlot23.markerChanged(markerChangeEvent25);
        java.awt.Paint paint27 = null;
        multiplePiePlot23.setBackgroundPaint(paint27);
        org.jfree.data.category.CategoryDataset categoryDataset29 = multiplePiePlot23.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup30 = multiplePiePlot23.getDatasetGroup();
        java.awt.Paint paint31 = multiplePiePlot23.getOutlinePaint();
        multiplePiePlot20.setOutlinePaint(paint31);
        plot18.setNoDataMessagePaint(paint31);
        multiplePiePlot4.setBackgroundPaint(paint31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot20", multiplePiePlot1.equals(multiplePiePlot20) ? multiplePiePlot1.hashCode() == multiplePiePlot20.hashCode() : true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
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
        int int13 = multiplePiePlot1.getBackgroundImageAlignment();
        java.lang.Object obj14 = multiplePiePlot1.clone();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        java.lang.String str17 = multiplePiePlot16.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        multiplePiePlot16.markerChanged(markerChangeEvent18);
        java.awt.Paint paint20 = null;
        multiplePiePlot16.setBackgroundPaint(paint20);
        multiplePiePlot16.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        java.lang.String str26 = multiplePiePlot25.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        java.lang.String str29 = multiplePiePlot28.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = null;
        multiplePiePlot28.markerChanged(markerChangeEvent30);
        java.awt.Paint paint32 = multiplePiePlot28.getAggregatedItemsPaint();
        multiplePiePlot25.setOutlinePaint(paint32);
        java.lang.String str34 = multiplePiePlot25.getPlotType();
        java.lang.String str35 = multiplePiePlot25.getNoDataMessage();
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = multiplePiePlot25.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = multiplePiePlot25.getInsets();
        multiplePiePlot16.setInsets(rectangleInsets37, false);
        multiplePiePlot1.setInsets(rectangleInsets37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot28", multiplePiePlot4.equals(multiplePiePlot28) ? multiplePiePlot4.hashCode() == multiplePiePlot28.hashCode() : true);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D21, rectangle2D22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        java.lang.String str26 = multiplePiePlot25.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        multiplePiePlot25.addChangeListener(plotChangeListener27);
        boolean boolean29 = multiplePiePlot25.isSubplot();
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot25.getRootPlot();
        multiplePiePlot1.setParent(plot30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and plot30", multiplePiePlot4.equals(plot30) ? multiplePiePlot4.hashCode() == plot30.hashCode() : true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
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
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        multiplePiePlot1.setDataset(categoryDataset13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = multiplePiePlot1.getDrawingSupplier();
        float float16 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        java.lang.String str19 = multiplePiePlot18.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        java.lang.String str22 = multiplePiePlot21.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        multiplePiePlot21.markerChanged(markerChangeEvent23);
        java.awt.Paint paint25 = multiplePiePlot21.getAggregatedItemsPaint();
        multiplePiePlot18.setOutlinePaint(paint25);
        java.lang.String str27 = multiplePiePlot18.getPlotType();
        java.lang.String str28 = multiplePiePlot18.getNoDataMessage();
        float float29 = multiplePiePlot18.getBackgroundImageAlpha();
        int int30 = multiplePiePlot18.getBackgroundImageAlignment();
        float float31 = multiplePiePlot18.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent32 = null;
        multiplePiePlot18.notifyListeners(plotChangeEvent32);
        java.lang.Object obj34 = multiplePiePlot18.clone();
        org.jfree.chart.JFreeChart jFreeChart35 = multiplePiePlot18.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot21", multiplePiePlot7.equals(multiplePiePlot21) ? multiplePiePlot7.hashCode() == multiplePiePlot21.hashCode() : true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
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
        boolean boolean18 = multiplePiePlot17.isSubplot();
        java.awt.Paint paint19 = multiplePiePlot17.getBackgroundPaint();
        float float20 = multiplePiePlot17.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.lang.String str23 = multiplePiePlot22.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        multiplePiePlot22.markerChanged(markerChangeEvent24);
        java.awt.Paint paint26 = null;
        multiplePiePlot22.setBackgroundPaint(paint26);
        multiplePiePlot22.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font30 = multiplePiePlot22.getNoDataMessageFont();
        multiplePiePlot17.setNoDataMessageFont(font30);
        org.jfree.chart.plot.Plot plot32 = multiplePiePlot17.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        boolean boolean35 = multiplePiePlot34.isSubplot();
        java.awt.Paint paint36 = multiplePiePlot34.getBackgroundPaint();
        java.awt.Paint paint37 = multiplePiePlot34.getNoDataMessagePaint();
        java.awt.Paint paint38 = multiplePiePlot34.getNoDataMessagePaint();
        multiplePiePlot17.setOutlinePaint(paint38);
        org.jfree.chart.JFreeChart jFreeChart40 = multiplePiePlot17.getPieChart();
        multiplePiePlot4.setPieChart(jFreeChart40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot34", multiplePiePlot1.equals(multiplePiePlot34) ? multiplePiePlot1.hashCode() == multiplePiePlot34.hashCode() : true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        java.lang.String str7 = multiplePiePlot6.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        multiplePiePlot6.addChangeListener(plotChangeListener8);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = multiplePiePlot6.getDrawingSupplier();
        java.awt.Paint paint11 = multiplePiePlot6.getNoDataMessagePaint();
        java.awt.Image image12 = null;
        multiplePiePlot6.setBackgroundImage(image12);
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
        multiplePiePlot6.setOutlinePaint(paint28);
        multiplePiePlot1.setAggregatedItemsPaint(paint28);
        java.awt.Paint paint31 = multiplePiePlot1.getNoDataMessagePaint();
        float float32 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        java.awt.Image image35 = null;
        multiplePiePlot34.setBackgroundImage(image35);
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        java.lang.String str39 = multiplePiePlot38.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener40 = null;
        multiplePiePlot38.addChangeListener(plotChangeListener40);
        java.awt.Image image42 = multiplePiePlot38.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart43 = multiplePiePlot38.getPieChart();
        multiplePiePlot34.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart43);
        org.jfree.data.category.CategoryDataset categoryDataset45 = multiplePiePlot34.getDataset();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier46 = multiplePiePlot34.getDrawingSupplier();
        java.awt.Font font47 = multiplePiePlot34.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on drawingSupplier10 and drawingSupplier46", drawingSupplier10.equals(drawingSupplier46) ? drawingSupplier10.hashCode() == drawingSupplier46.hashCode() : true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
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
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        boolean boolean15 = multiplePiePlot14.isSubplot();
        java.awt.Image image16 = multiplePiePlot14.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection17 = multiplePiePlot14.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = multiplePiePlot14.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        boolean boolean21 = multiplePiePlot20.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        boolean boolean24 = multiplePiePlot23.isSubplot();
        multiplePiePlot23.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot20.setParent((org.jfree.chart.plot.Plot) multiplePiePlot23);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier28 = multiplePiePlot20.getDrawingSupplier();
        multiplePiePlot14.setDrawingSupplier(drawingSupplier28);
        java.lang.String str30 = multiplePiePlot14.getNoDataMessage();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = multiplePiePlot14.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets31, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot14", multiplePiePlot4.equals(multiplePiePlot14) ? multiplePiePlot4.hashCode() == multiplePiePlot14.hashCode() : true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Image image3 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.JFreeChart jFreeChart5 = multiplePiePlot1.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        boolean boolean8 = multiplePiePlot7.isSubplot();
        java.awt.Image image9 = multiplePiePlot7.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection10 = multiplePiePlot7.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = multiplePiePlot7.getInsets();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        boolean boolean14 = multiplePiePlot13.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        boolean boolean17 = multiplePiePlot16.isSubplot();
        multiplePiePlot16.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot13.setParent((org.jfree.chart.plot.Plot) multiplePiePlot16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = multiplePiePlot13.getDrawingSupplier();
        multiplePiePlot7.setDrawingSupplier(drawingSupplier21);
        multiplePiePlot1.setDrawingSupplier(drawingSupplier21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection4 and legendItemCollection10", legendItemCollection4.equals(legendItemCollection10) ? legendItemCollection4.hashCode() == legendItemCollection10.hashCode() : true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
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
        org.jfree.chart.JFreeChart jFreeChart14 = multiplePiePlot1.getPieChart();
        java.awt.Font font15 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart10 and jFreeChart14", jFreeChart10.equals(jFreeChart14) ? jFreeChart10.hashCode() == jFreeChart14.hashCode() : true);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1L);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        boolean boolean10 = multiplePiePlot9.isSubplot();
        multiplePiePlot9.setForegroundAlpha((float) 0L);
        org.jfree.chart.util.TableOrder tableOrder13 = multiplePiePlot9.getDataExtractOrder();
        org.jfree.chart.util.TableOrder tableOrder14 = multiplePiePlot9.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset15 = multiplePiePlot9.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        boolean boolean18 = multiplePiePlot17.isSubplot();
        multiplePiePlot17.setForegroundAlpha((float) 0L);
        java.awt.Paint paint21 = multiplePiePlot17.getNoDataMessagePaint();
        java.awt.Paint paint22 = multiplePiePlot17.getBackgroundPaint();
        java.awt.Paint paint23 = multiplePiePlot17.getAggregatedItemsPaint();
        java.awt.Image image24 = null;
        multiplePiePlot17.setBackgroundImage(image24);
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = multiplePiePlot17.getInsets();
        multiplePiePlot9.setInsets(rectangleInsets26);
        java.awt.Paint paint28 = multiplePiePlot9.getNoDataMessagePaint();
        multiplePiePlot1.setOutlinePaint(paint28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot17", multiplePiePlot9.equals(multiplePiePlot17) ? multiplePiePlot9.hashCode() == multiplePiePlot17.hashCode() : true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
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
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        boolean boolean14 = multiplePiePlot13.isSubplot();
        java.awt.Paint paint15 = multiplePiePlot13.getBackgroundPaint();
        java.lang.String str16 = multiplePiePlot13.getPlotType();
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot13.getPieChart();
        plot11.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on plot11 and multiplePiePlot3", plot11.equals(multiplePiePlot3) ? plot11.hashCode() == multiplePiePlot3.hashCode() : true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
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
        org.jfree.chart.JFreeChart jFreeChart14 = multiplePiePlot1.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        boolean boolean17 = multiplePiePlot16.isSubplot();
        java.awt.Paint paint18 = multiplePiePlot16.getBackgroundPaint();
        java.awt.Image image19 = multiplePiePlot16.getBackgroundImage();
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot16.getParent();
        boolean boolean21 = multiplePiePlot16.isOutlineVisible();
        org.jfree.chart.util.TableOrder tableOrder22 = multiplePiePlot16.getDataExtractOrder();
        org.jfree.chart.LegendItemCollection legendItemCollection23 = multiplePiePlot16.getLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = multiplePiePlot16.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot16", multiplePiePlot5.equals(multiplePiePlot16) ? multiplePiePlot5.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 10);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent4);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier10);
        boolean boolean13 = multiplePiePlot9.equals((java.lang.Object) 1.0d);
        multiplePiePlot9.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint16 = multiplePiePlot9.getBackgroundPaint();
        multiplePiePlot1.setBackgroundPaint(paint16);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        boolean boolean20 = multiplePiePlot19.isSubplot();
        java.awt.Paint paint21 = multiplePiePlot19.getBackgroundPaint();
        float float22 = multiplePiePlot19.getForegroundAlpha();
        boolean boolean23 = multiplePiePlot19.isOutlineVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = multiplePiePlot19.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets24, false);
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
        multiplePiePlot31.setDataset(categoryDataset39);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent41 = null;
        multiplePiePlot31.notifyListeners(plotChangeEvent41);
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = multiplePiePlot31.getInsets();
        java.awt.Stroke stroke44 = multiplePiePlot31.getOutlineStroke();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent45 = null;
        multiplePiePlot31.datasetChanged(datasetChangeEvent45);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent47 = null;
        multiplePiePlot31.axisChanged(axisChangeEvent47);
        java.awt.Image image49 = null;
        multiplePiePlot31.setBackgroundImage(image49);
        multiplePiePlot31.zoom((double) 0.0f);
        boolean boolean53 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot19 and multiplePiePlot28", multiplePiePlot19.equals(multiplePiePlot28) ? multiplePiePlot19.hashCode() == multiplePiePlot28.hashCode() : true);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
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
        org.jfree.chart.JFreeChart jFreeChart15 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setForegroundAlpha(15.0f);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        boolean boolean20 = multiplePiePlot19.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        boolean boolean23 = multiplePiePlot22.isSubplot();
        multiplePiePlot22.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot19.setParent((org.jfree.chart.plot.Plot) multiplePiePlot22);
        java.awt.Stroke stroke27 = multiplePiePlot22.getOutlineStroke();
        multiplePiePlot22.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        multiplePiePlot22.setDataset(categoryDataset30);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent32 = null;
        multiplePiePlot22.notifyListeners(plotChangeEvent32);
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = multiplePiePlot22.getInsets();
        boolean boolean35 = multiplePiePlot22.isSubplot();
        org.jfree.chart.util.TableOrder tableOrder36 = multiplePiePlot22.getDataExtractOrder();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent37 = null;
        multiplePiePlot22.markerChanged(markerChangeEvent37);
        org.jfree.chart.JFreeChart jFreeChart39 = multiplePiePlot22.getPieChart();
        java.awt.Paint paint40 = multiplePiePlot22.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart41 = multiplePiePlot22.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart15 and jFreeChart41", jFreeChart15.equals(jFreeChart41) ? jFreeChart15.hashCode() == jFreeChart41.hashCode() : true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
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
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        boolean boolean26 = multiplePiePlot25.isSubplot();
        java.awt.Paint paint27 = multiplePiePlot25.getBackgroundPaint();
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        multiplePiePlot25.drawBackgroundImage(graphics2D28, rectangle2D29);
        java.lang.String str31 = multiplePiePlot25.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        java.lang.String str34 = multiplePiePlot33.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent35 = null;
        multiplePiePlot33.markerChanged(markerChangeEvent35);
        java.awt.Paint paint37 = null;
        multiplePiePlot33.setBackgroundPaint(paint37);
        org.jfree.data.category.CategoryDataset categoryDataset39 = multiplePiePlot33.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup40 = multiplePiePlot33.getDatasetGroup();
        java.awt.Paint paint41 = multiplePiePlot33.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets42 = multiplePiePlot33.getInsets();
        multiplePiePlot25.setInsets(rectangleInsets42);
        multiplePiePlot1.setInsets(rectangleInsets42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot25", multiplePiePlot9.equals(multiplePiePlot25) ? multiplePiePlot9.hashCode() == multiplePiePlot25.hashCode() : true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
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
        java.lang.Object obj22 = multiplePiePlot1.clone();
        multiplePiePlot1.zoom((double) (byte) 0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and obj22", multiplePiePlot9.equals(obj22) ? multiplePiePlot9.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
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
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setBackgroundPaint(paint17);
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        java.lang.String str22 = multiplePiePlot21.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        multiplePiePlot21.markerChanged(markerChangeEvent23);
        float float25 = multiplePiePlot21.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot26 = multiplePiePlot21.getRootPlot();
        boolean boolean27 = plot26.isOutlineVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        plot26.handleClick((int) (short) 10, 1, plotRenderingInfo30);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo34 = null;
        plot26.handleClick((int) (byte) 10, 0, plotRenderingInfo34);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent36 = null;
        plot26.datasetChanged(datasetChangeEvent36);
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot39 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset38);
        java.lang.String str40 = multiplePiePlot39.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent41 = null;
        multiplePiePlot39.markerChanged(markerChangeEvent41);
        java.awt.Image image43 = multiplePiePlot39.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset44 = null;
        multiplePiePlot39.setDataset(categoryDataset44);
        float float46 = multiplePiePlot39.getForegroundAlpha();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent47 = null;
        multiplePiePlot39.datasetChanged(datasetChangeEvent47);
        plot26.setParent((org.jfree.chart.plot.Plot) multiplePiePlot39);
        multiplePiePlot1.setParent(plot26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and plot26", multiplePiePlot7.equals(plot26) ? multiplePiePlot7.hashCode() == plot26.hashCode() : true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
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
        java.awt.Stroke stroke21 = null;
        multiplePiePlot1.setOutlineStroke(stroke21);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.lang.String str25 = multiplePiePlot24.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        multiplePiePlot24.markerChanged(markerChangeEvent26);
        java.awt.Paint paint28 = multiplePiePlot24.getAggregatedItemsPaint();
        java.lang.String str29 = multiplePiePlot24.getPlotType();
        multiplePiePlot24.zoom((double) 0.5f);
        multiplePiePlot24.setForegroundAlpha(1.0f);
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        boolean boolean36 = multiplePiePlot35.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        boolean boolean39 = multiplePiePlot38.isSubplot();
        multiplePiePlot38.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot35.setParent((org.jfree.chart.plot.Plot) multiplePiePlot38);
        java.awt.Stroke stroke43 = multiplePiePlot38.getOutlineStroke();
        multiplePiePlot38.setBackgroundAlpha(0.0f);
        multiplePiePlot38.setBackgroundImageAlpha((float) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset48 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot49 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset48);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier50 = null;
        multiplePiePlot49.setDrawingSupplier(drawingSupplier50);
        double double52 = multiplePiePlot49.getLimit();
        multiplePiePlot49.setLimit((double) (short) 1);
        org.jfree.chart.JFreeChart jFreeChart55 = multiplePiePlot49.getPieChart();
        multiplePiePlot38.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart55);
        multiplePiePlot24.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart55);
        multiplePiePlot1.setPieChart(jFreeChart55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot14 and multiplePiePlot24", multiplePiePlot14.equals(multiplePiePlot24) ? multiplePiePlot14.hashCode() == multiplePiePlot24.hashCode() : true);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        multiplePiePlot1.handleClick((int) (short) 0, 15, plotRenderingInfo16);
        java.lang.Object obj18 = multiplePiePlot1.clone();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent19 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and obj18", multiplePiePlot5.equals(obj18) ? multiplePiePlot5.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
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
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        boolean boolean16 = multiplePiePlot15.isSubplot();
        multiplePiePlot15.setForegroundAlpha((float) 0L);
        org.jfree.chart.util.TableOrder tableOrder19 = multiplePiePlot15.getDataExtractOrder();
        multiplePiePlot15.setLimit((double) (byte) 0);
        multiplePiePlot4.setParent((org.jfree.chart.plot.Plot) multiplePiePlot15);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        boolean boolean25 = multiplePiePlot24.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        boolean boolean28 = multiplePiePlot27.isSubplot();
        multiplePiePlot27.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot24.setParent((org.jfree.chart.plot.Plot) multiplePiePlot27);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = multiplePiePlot27.getInsets();
        org.jfree.chart.JFreeChart jFreeChart33 = multiplePiePlot27.getPieChart();
        multiplePiePlot15.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot24", multiplePiePlot1.equals(multiplePiePlot24) ? multiplePiePlot1.hashCode() == multiplePiePlot24.hashCode() : true);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
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
        java.lang.Object obj18 = multiplePiePlot1.clone();
        float float19 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and obj18", multiplePiePlot7.equals(obj18) ? multiplePiePlot7.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
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
        multiplePiePlot1.setBackgroundImageAlignment((int) (byte) 0);
        multiplePiePlot1.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = null;
        multiplePiePlot23.setDrawingSupplier(drawingSupplier24);
        boolean boolean27 = multiplePiePlot23.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot28 = multiplePiePlot23.getRootPlot();
        multiplePiePlot23.zoom((double) (short) 1);
        multiplePiePlot23.setForegroundAlpha((float) 15);
        multiplePiePlot23.zoom((double) 1);
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        boolean boolean37 = multiplePiePlot36.isSubplot();
        multiplePiePlot36.setForegroundAlpha((float) 0L);
        java.awt.Paint paint40 = multiplePiePlot36.getNoDataMessagePaint();
        java.awt.Paint paint41 = multiplePiePlot36.getBackgroundPaint();
        multiplePiePlot36.setBackgroundAlpha(10.0f);
        org.jfree.chart.LegendItemCollection legendItemCollection44 = multiplePiePlot36.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot46 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset45);
        boolean boolean47 = multiplePiePlot46.isSubplot();
        multiplePiePlot46.setForegroundAlpha((float) 0L);
        java.awt.Paint paint50 = multiplePiePlot46.getNoDataMessagePaint();
        java.awt.Paint paint51 = multiplePiePlot46.getBackgroundPaint();
        boolean boolean52 = multiplePiePlot46.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset53 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot54 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset53);
        java.lang.String str55 = multiplePiePlot54.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent56 = null;
        multiplePiePlot54.markerChanged(markerChangeEvent56);
        java.awt.Paint paint58 = multiplePiePlot54.getAggregatedItemsPaint();
        java.lang.Comparable comparable59 = multiplePiePlot54.getAggregatedItemsKey();
        java.awt.Image image60 = multiplePiePlot54.getBackgroundImage();
        multiplePiePlot54.setOutlineVisible(false);
        java.awt.Stroke stroke63 = multiplePiePlot54.getOutlineStroke();
        org.jfree.chart.JFreeChart jFreeChart64 = multiplePiePlot54.getPieChart();
        multiplePiePlot46.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart64);
        multiplePiePlot36.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart64);
        multiplePiePlot23.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart64);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart64);
        org.jfree.data.category.CategoryDataset categoryDataset69 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot70 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset69);
        boolean boolean71 = multiplePiePlot70.isSubplot();
        java.awt.Image image72 = multiplePiePlot70.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection73 = multiplePiePlot70.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets74 = multiplePiePlot70.getInsets();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier75 = multiplePiePlot70.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection44 and legendItemCollection73", legendItemCollection44.equals(legendItemCollection73) ? legendItemCollection44.hashCode() == legendItemCollection73.hashCode() : true);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
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
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D13, rectangle2D14);
        boolean boolean16 = multiplePiePlot1.isSubplot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent17 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent17);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.awt.Image image21 = null;
        multiplePiePlot20.setBackgroundImage(image21);
        multiplePiePlot20.zoom((double) 10L);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        boolean boolean27 = multiplePiePlot26.isSubplot();
        multiplePiePlot26.setForegroundAlpha((float) 0L);
        java.awt.Paint paint30 = multiplePiePlot26.getNoDataMessagePaint();
        java.awt.Paint paint31 = multiplePiePlot26.getBackgroundPaint();
        boolean boolean32 = multiplePiePlot20.equals((java.lang.Object) paint31);
        org.jfree.chart.JFreeChart jFreeChart33 = multiplePiePlot20.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot20", multiplePiePlot5.equals(multiplePiePlot20) ? multiplePiePlot5.hashCode() == multiplePiePlot20.hashCode() : true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
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
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        boolean boolean25 = multiplePiePlot24.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        boolean boolean28 = multiplePiePlot27.isSubplot();
        multiplePiePlot27.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot24.setParent((org.jfree.chart.plot.Plot) multiplePiePlot27);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = multiplePiePlot27.getInsets();
        java.awt.Font font33 = multiplePiePlot27.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot24", multiplePiePlot9.equals(multiplePiePlot24) ? multiplePiePlot9.hashCode() == multiplePiePlot24.hashCode() : true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        boolean boolean8 = multiplePiePlot7.isSubplot();
        multiplePiePlot7.setForegroundAlpha((float) 0L);
        java.awt.Paint paint11 = multiplePiePlot7.getNoDataMessagePaint();
        java.awt.Paint paint12 = multiplePiePlot7.getBackgroundPaint();
        boolean boolean13 = multiplePiePlot7.isOutlineVisible();
        multiplePiePlot7.zoom((double) 0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent18 = null;
        multiplePiePlot17.notifyListeners(plotChangeEvent18);
        java.awt.Stroke stroke20 = multiplePiePlot17.getOutlineStroke();
        java.awt.Font font21 = multiplePiePlot17.getNoDataMessageFont();
        multiplePiePlot7.setNoDataMessageFont(font21);
        multiplePiePlot1.setNoDataMessageFont(font21);
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
        multiplePiePlot28.setBackgroundImageAlpha((float) (short) 1);
        java.awt.Graphics2D graphics2D38 = null;
        java.awt.geom.Rectangle2D rectangle2D39 = null;
        multiplePiePlot28.drawBackgroundImage(graphics2D38, rectangle2D39);
        java.awt.Stroke stroke41 = multiplePiePlot28.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot17 and multiplePiePlot25", multiplePiePlot17.equals(multiplePiePlot25) ? multiplePiePlot17.hashCode() == multiplePiePlot25.hashCode() : true);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
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
        org.jfree.chart.LegendItemCollection legendItemCollection26 = multiplePiePlot1.getLegendItems();
        java.awt.Paint paint27 = multiplePiePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection7 and legendItemCollection26", legendItemCollection7.equals(legendItemCollection26) ? legendItemCollection7.hashCode() == legendItemCollection26.hashCode() : true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
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
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        java.lang.String str19 = multiplePiePlot18.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        multiplePiePlot18.markerChanged(markerChangeEvent20);
        java.awt.Paint paint22 = multiplePiePlot18.getAggregatedItemsPaint();
        java.lang.String str23 = multiplePiePlot18.getPlotType();
        multiplePiePlot18.zoom((double) 0.5f);
        multiplePiePlot18.setForegroundAlpha(1.0f);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        boolean boolean30 = multiplePiePlot29.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        boolean boolean33 = multiplePiePlot32.isSubplot();
        multiplePiePlot32.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot29.setParent((org.jfree.chart.plot.Plot) multiplePiePlot32);
        java.awt.Stroke stroke37 = multiplePiePlot32.getOutlineStroke();
        multiplePiePlot32.setBackgroundAlpha(0.0f);
        multiplePiePlot32.setBackgroundImageAlpha((float) (short) 1);
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot43 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset42);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier44 = null;
        multiplePiePlot43.setDrawingSupplier(drawingSupplier44);
        double double46 = multiplePiePlot43.getLimit();
        multiplePiePlot43.setLimit((double) (short) 1);
        org.jfree.chart.JFreeChart jFreeChart49 = multiplePiePlot43.getPieChart();
        multiplePiePlot32.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart49);
        multiplePiePlot18.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart49);
        plot16.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on plot16 and multiplePiePlot5", plot16.equals(multiplePiePlot5) ? plot16.hashCode() == multiplePiePlot5.hashCode() : true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        java.lang.String str5 = multiplePiePlot4.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent6);
        java.awt.Paint paint8 = null;
        multiplePiePlot4.setBackgroundPaint(paint8);
        org.jfree.data.category.CategoryDataset categoryDataset10 = multiplePiePlot4.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup11 = multiplePiePlot4.getDatasetGroup();
        java.awt.Paint paint12 = multiplePiePlot4.getOutlinePaint();
        multiplePiePlot1.setOutlinePaint(paint12);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot1.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.lang.String str20 = multiplePiePlot19.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        multiplePiePlot19.addChangeListener(plotChangeListener21);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = multiplePiePlot19.getDrawingSupplier();
        java.awt.Paint paint24 = multiplePiePlot19.getNoDataMessagePaint();
        java.awt.Image image25 = null;
        multiplePiePlot19.setBackgroundImage(image25);
        multiplePiePlot19.setNoDataMessage("hi!");
        org.jfree.chart.LegendItemCollection legendItemCollection29 = multiplePiePlot19.getLegendItems();
        multiplePiePlot19.setLimit(10.0d);
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        java.lang.String str34 = multiplePiePlot33.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent35 = null;
        multiplePiePlot33.markerChanged(markerChangeEvent35);
        java.awt.Paint paint37 = multiplePiePlot33.getAggregatedItemsPaint();
        java.lang.Comparable comparable38 = multiplePiePlot33.getAggregatedItemsKey();
        multiplePiePlot33.setBackgroundImageAlpha((float) 0);
        java.awt.Font font41 = multiplePiePlot33.getNoDataMessageFont();
        double double42 = multiplePiePlot33.getLimit();
        java.awt.Paint paint43 = multiplePiePlot33.getAggregatedItemsPaint();
        double double44 = multiplePiePlot33.getLimit();
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = multiplePiePlot33.getInsets();
        multiplePiePlot19.setInsets(rectangleInsets45, true);
        multiplePiePlot1.setInsets(rectangleInsets45, false);
        org.jfree.data.category.CategoryDataset categoryDataset50 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot51 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset50);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier52 = null;
        multiplePiePlot51.setDrawingSupplier(drawingSupplier52);
        org.jfree.chart.plot.Plot plot54 = multiplePiePlot51.getParent();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent55 = null;
        multiplePiePlot51.datasetChanged(datasetChangeEvent55);
        multiplePiePlot51.setAggregatedItemsKey((java.lang.Comparable) (-1));
        float float59 = multiplePiePlot51.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart60 = multiplePiePlot51.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart60);
        java.awt.Image image62 = null;
        multiplePiePlot1.setBackgroundImage(image62);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart17 and jFreeChart60", jFreeChart17.equals(jFreeChart60) ? jFreeChart17.hashCode() == jFreeChart60.hashCode() : true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent22 = null;
        multiplePiePlot4.notifyListeners(plotChangeEvent22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = multiplePiePlot25.getDrawingSupplier();
        boolean boolean27 = multiplePiePlot4.equals((java.lang.Object) drawingSupplier26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot25", multiplePiePlot1.equals(multiplePiePlot25) ? multiplePiePlot1.hashCode() == multiplePiePlot25.hashCode() : true);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
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
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        multiplePiePlot4.drawBackgroundImage(graphics2D14, rectangle2D15);
        multiplePiePlot4.setBackgroundAlpha((float) (byte) -1);
        java.awt.Paint paint19 = multiplePiePlot4.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        java.lang.String str22 = multiplePiePlot21.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        multiplePiePlot21.markerChanged(markerChangeEvent23);
        java.awt.Image image25 = multiplePiePlot21.getBackgroundImage();
        java.lang.Comparable comparable26 = multiplePiePlot21.getAggregatedItemsKey();
        multiplePiePlot21.setAggregatedItemsKey((java.lang.Comparable) 1);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = null;
        multiplePiePlot30.setDrawingSupplier(drawingSupplier31);
        boolean boolean34 = multiplePiePlot30.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot35 = multiplePiePlot30.getRootPlot();
        plot35.setBackgroundImageAlpha((float) 1);
        int int38 = plot35.getBackgroundImageAlignment();
        java.awt.Font font39 = plot35.getNoDataMessageFont();
        multiplePiePlot21.setNoDataMessageFont(font39);
        java.awt.Paint paint41 = multiplePiePlot21.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset42 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot43 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset42);
        java.lang.String str44 = multiplePiePlot43.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot46 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset45);
        java.lang.String str47 = multiplePiePlot46.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent48 = null;
        multiplePiePlot46.markerChanged(markerChangeEvent48);
        java.awt.Paint paint50 = multiplePiePlot46.getAggregatedItemsPaint();
        multiplePiePlot43.setOutlinePaint(paint50);
        java.awt.Image image52 = multiplePiePlot43.getBackgroundImage();
        org.jfree.chart.util.RectangleInsets rectangleInsets53 = multiplePiePlot43.getInsets();
        multiplePiePlot21.setInsets(rectangleInsets53);
        multiplePiePlot4.setInsets(rectangleInsets53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot46", multiplePiePlot1.equals(multiplePiePlot46) ? multiplePiePlot1.hashCode() == multiplePiePlot46.hashCode() : true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart6 = multiplePiePlot1.getPieChart();
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier10);
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot9.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart13 = multiplePiePlot9.getPieChart();
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
        multiplePiePlot9.setAggregatedItemsPaint(paint32);
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        multiplePiePlot9.setDataset(categoryDataset36);
        org.jfree.chart.plot.Plot plot38 = multiplePiePlot9.getRootPlot();
        java.awt.Paint paint39 = plot38.getOutlinePaint();
        java.awt.Font font40 = plot38.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart6 and jFreeChart13", jFreeChart6.equals(jFreeChart13) ? jFreeChart6.hashCode() == jFreeChart13.hashCode() : true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        multiplePiePlot1.handleClick((int) (short) 0, 15, plotRenderingInfo16);
        org.jfree.chart.plot.Plot plot18 = multiplePiePlot1.getRootPlot();
        java.awt.Paint paint19 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot5 and multiplePiePlot1", multiplePiePlot5.equals(multiplePiePlot1) ? multiplePiePlot5.hashCode() == multiplePiePlot1.hashCode() : true);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        multiplePiePlot1.setForegroundAlpha((float) (byte) 10);
        double double7 = multiplePiePlot1.getLimit();
        java.awt.Paint paint8 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.util.TableOrder tableOrder9 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        boolean boolean12 = multiplePiePlot11.isSubplot();
        multiplePiePlot11.setForegroundAlpha((float) 0L);
        org.jfree.chart.util.TableOrder tableOrder15 = multiplePiePlot11.getDataExtractOrder();
        org.jfree.chart.util.TableOrder tableOrder16 = multiplePiePlot11.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset17 = multiplePiePlot11.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        boolean boolean20 = multiplePiePlot19.isSubplot();
        multiplePiePlot19.setForegroundAlpha((float) 0L);
        java.awt.Paint paint23 = multiplePiePlot19.getNoDataMessagePaint();
        java.awt.Paint paint24 = multiplePiePlot19.getBackgroundPaint();
        java.awt.Paint paint25 = multiplePiePlot19.getAggregatedItemsPaint();
        java.awt.Image image26 = null;
        multiplePiePlot19.setBackgroundImage(image26);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = multiplePiePlot19.getInsets();
        multiplePiePlot11.setInsets(rectangleInsets28);
        multiplePiePlot1.setInsets(rectangleInsets28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and multiplePiePlot19", multiplePiePlot11.equals(multiplePiePlot19) ? multiplePiePlot11.hashCode() == multiplePiePlot19.hashCode() : true);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
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
        org.jfree.chart.JFreeChart jFreeChart15 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setForegroundAlpha(15.0f);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        boolean boolean20 = multiplePiePlot19.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.lang.String str23 = multiplePiePlot22.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        multiplePiePlot22.markerChanged(markerChangeEvent24);
        java.awt.Paint paint26 = null;
        multiplePiePlot22.setBackgroundPaint(paint26);
        org.jfree.data.category.CategoryDataset categoryDataset28 = multiplePiePlot22.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup29 = multiplePiePlot22.getDatasetGroup();
        java.awt.Paint paint30 = multiplePiePlot22.getOutlinePaint();
        multiplePiePlot19.setOutlinePaint(paint30);
        java.awt.Graphics2D graphics2D32 = null;
        java.awt.geom.Rectangle2D rectangle2D33 = null;
        multiplePiePlot19.drawBackgroundImage(graphics2D32, rectangle2D33);
        org.jfree.chart.JFreeChart jFreeChart35 = multiplePiePlot19.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot37 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset36);
        java.lang.String str38 = multiplePiePlot37.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener39 = null;
        multiplePiePlot37.addChangeListener(plotChangeListener39);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier41 = multiplePiePlot37.getDrawingSupplier();
        java.awt.Paint paint42 = multiplePiePlot37.getNoDataMessagePaint();
        java.awt.Image image43 = null;
        multiplePiePlot37.setBackgroundImage(image43);
        multiplePiePlot37.setNoDataMessage("hi!");
        org.jfree.chart.LegendItemCollection legendItemCollection47 = multiplePiePlot37.getLegendItems();
        multiplePiePlot37.setLimit(10.0d);
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
        double double62 = multiplePiePlot51.getLimit();
        org.jfree.chart.util.RectangleInsets rectangleInsets63 = multiplePiePlot51.getInsets();
        multiplePiePlot37.setInsets(rectangleInsets63, true);
        multiplePiePlot19.setInsets(rectangleInsets63, false);
        multiplePiePlot1.setInsets(rectangleInsets63, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection7 and legendItemCollection47", legendItemCollection7.equals(legendItemCollection47) ? legendItemCollection7.hashCode() == legendItemCollection47.hashCode() : true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        java.lang.String str7 = multiplePiePlot6.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        multiplePiePlot6.addChangeListener(plotChangeListener8);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = multiplePiePlot6.getDrawingSupplier();
        java.awt.Paint paint11 = multiplePiePlot6.getNoDataMessagePaint();
        java.awt.Image image12 = null;
        multiplePiePlot6.setBackgroundImage(image12);
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
        multiplePiePlot6.setOutlinePaint(paint28);
        multiplePiePlot1.setAggregatedItemsPaint(paint28);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent31 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent31);
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        boolean boolean35 = multiplePiePlot34.isSubplot();
        multiplePiePlot34.setForegroundAlpha((float) 0L);
        java.awt.Paint paint38 = multiplePiePlot34.getNoDataMessagePaint();
        java.awt.Paint paint39 = multiplePiePlot34.getBackgroundPaint();
        java.awt.Paint paint40 = multiplePiePlot34.getAggregatedItemsPaint();
        java.awt.Image image41 = null;
        multiplePiePlot34.setBackgroundImage(image41);
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = multiplePiePlot34.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets43);
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot46 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset45);
        java.awt.Image image47 = null;
        multiplePiePlot46.setBackgroundImage(image47);
        org.jfree.data.category.CategoryDataset categoryDataset49 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot50 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset49);
        java.lang.String str51 = multiplePiePlot50.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener52 = null;
        multiplePiePlot50.addChangeListener(plotChangeListener52);
        java.awt.Image image54 = multiplePiePlot50.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart55 = multiplePiePlot50.getPieChart();
        multiplePiePlot46.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart55);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot18 and multiplePiePlot46", multiplePiePlot18.equals(multiplePiePlot46) ? multiplePiePlot18.hashCode() == multiplePiePlot46.hashCode() : true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
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
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        java.awt.Image image37 = null;
        multiplePiePlot36.setBackgroundImage(image37);
        org.jfree.data.category.CategoryDataset categoryDataset39 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot40 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset39);
        java.lang.String str41 = multiplePiePlot40.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener42 = null;
        multiplePiePlot40.addChangeListener(plotChangeListener42);
        java.awt.Image image44 = multiplePiePlot40.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart45 = multiplePiePlot40.getPieChart();
        multiplePiePlot36.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart45);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier47 = multiplePiePlot36.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart5 and jFreeChart45", jFreeChart5.equals(jFreeChart45) ? jFreeChart5.hashCode() == jFreeChart45.hashCode() : true);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent7);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) -1);
        java.lang.Object obj11 = multiplePiePlot1.clone();
        float float12 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj11", multiplePiePlot1.equals(obj11) ? multiplePiePlot1.hashCode() == obj11.hashCode() : true);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        boolean boolean8 = multiplePiePlot7.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot7.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        java.awt.Stroke stroke15 = multiplePiePlot10.getOutlineStroke();
        multiplePiePlot10.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        multiplePiePlot10.setDataset(categoryDataset18);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent20 = null;
        multiplePiePlot10.notifyListeners(plotChangeEvent20);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.awt.Image image25 = null;
        multiplePiePlot24.setBackgroundImage(image25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        java.lang.String str29 = multiplePiePlot28.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener30 = null;
        multiplePiePlot28.addChangeListener(plotChangeListener30);
        java.awt.Image image32 = multiplePiePlot28.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart33 = multiplePiePlot28.getPieChart();
        multiplePiePlot24.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart33);
        org.jfree.data.category.CategoryDataset categoryDataset35 = multiplePiePlot24.getDataset();
        multiplePiePlot24.setBackgroundImageAlpha((float) 0);
        multiplePiePlot24.setBackgroundImageAlignment(100);
        float float40 = multiplePiePlot24.getForegroundAlpha();
        multiplePiePlot24.setNoDataMessage("");
        boolean boolean43 = multiplePiePlot10.equals((java.lang.Object) multiplePiePlot24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot28", multiplePiePlot7.equals(multiplePiePlot28) ? multiplePiePlot7.hashCode() == multiplePiePlot28.hashCode() : true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
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
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        multiplePiePlot4.drawBackgroundImage(graphics2D14, rectangle2D15);
        multiplePiePlot4.setBackgroundAlpha((float) (byte) -1);
        org.jfree.data.general.DatasetGroup datasetGroup19 = multiplePiePlot4.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        java.lang.String str22 = multiplePiePlot21.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.lang.String str25 = multiplePiePlot24.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        multiplePiePlot24.markerChanged(markerChangeEvent26);
        java.awt.Paint paint28 = multiplePiePlot24.getAggregatedItemsPaint();
        multiplePiePlot21.setOutlinePaint(paint28);
        java.lang.String str30 = multiplePiePlot21.getPlotType();
        java.lang.String str31 = multiplePiePlot21.getNoDataMessage();
        java.lang.Comparable comparable32 = multiplePiePlot21.getAggregatedItemsKey();
        multiplePiePlot21.setAggregatedItemsKey((java.lang.Comparable) (byte) -1);
        java.awt.Stroke stroke35 = multiplePiePlot21.getOutlineStroke();
        multiplePiePlot4.setOutlineStroke(stroke35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot24", multiplePiePlot1.equals(multiplePiePlot24) ? multiplePiePlot1.hashCode() == multiplePiePlot24.hashCode() : true);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
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
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier33 = null;
        multiplePiePlot32.setDrawingSupplier(drawingSupplier33);
        boolean boolean36 = multiplePiePlot32.equals((java.lang.Object) 1.0d);
        multiplePiePlot32.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint39 = multiplePiePlot32.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot41 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset40);
        java.lang.String str42 = multiplePiePlot41.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot44 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset43);
        java.lang.String str45 = multiplePiePlot44.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent46 = null;
        multiplePiePlot44.markerChanged(markerChangeEvent46);
        java.awt.Paint paint48 = multiplePiePlot44.getAggregatedItemsPaint();
        multiplePiePlot41.setOutlinePaint(paint48);
        org.jfree.chart.util.RectangleInsets rectangleInsets50 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot41.setInsets(rectangleInsets50, true);
        multiplePiePlot32.setInsets(rectangleInsets50);
        multiplePiePlot1.setInsets(rectangleInsets50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot44", multiplePiePlot7.equals(multiplePiePlot44) ? multiplePiePlot7.hashCode() == multiplePiePlot44.hashCode() : true);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
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
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        multiplePiePlot12.drawBackgroundImage(graphics2D25, rectangle2D26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and obj5", multiplePiePlot1.equals(obj5) ? multiplePiePlot1.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
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
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        boolean boolean23 = multiplePiePlot22.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        boolean boolean26 = multiplePiePlot25.isSubplot();
        multiplePiePlot25.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot22.setParent((org.jfree.chart.plot.Plot) multiplePiePlot25);
        java.awt.Stroke stroke30 = multiplePiePlot25.getOutlineStroke();
        multiplePiePlot25.setBackgroundAlpha(0.0f);
        multiplePiePlot25.setBackgroundImageAlpha((float) (short) 1);
        java.awt.Graphics2D graphics2D35 = null;
        java.awt.geom.Rectangle2D rectangle2D36 = null;
        multiplePiePlot25.drawBackgroundImage(graphics2D35, rectangle2D36);
        java.awt.Stroke stroke38 = multiplePiePlot25.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot22", multiplePiePlot4.equals(multiplePiePlot22) ? multiplePiePlot4.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
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
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D24, rectangle2D25);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = null;
        multiplePiePlot28.setDrawingSupplier(drawingSupplier29);
        java.awt.Image image31 = null;
        multiplePiePlot28.setBackgroundImage(image31);
        java.awt.Image image33 = multiplePiePlot28.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        boolean boolean36 = multiplePiePlot35.isSubplot();
        multiplePiePlot35.setForegroundAlpha((float) 0L);
        java.awt.Paint paint39 = multiplePiePlot35.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot41 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset40);
        java.lang.String str42 = multiplePiePlot41.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener43 = null;
        multiplePiePlot41.addChangeListener(plotChangeListener43);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier45 = multiplePiePlot41.getDrawingSupplier();
        multiplePiePlot35.setDrawingSupplier(drawingSupplier45);
        multiplePiePlot28.setDrawingSupplier(drawingSupplier45);
        java.awt.Font font48 = multiplePiePlot28.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot49 = multiplePiePlot28.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset50 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot51 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset50);
        multiplePiePlot51.setAggregatedItemsKey((java.lang.Comparable) 10);
        org.jfree.chart.JFreeChart jFreeChart54 = multiplePiePlot51.getPieChart();
        multiplePiePlot28.setPieChart(jFreeChart54);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot18 and multiplePiePlot28", multiplePiePlot18.equals(multiplePiePlot28) ? multiplePiePlot18.hashCode() == multiplePiePlot28.hashCode() : true);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
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
        org.jfree.chart.plot.Plot plot26 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        java.awt.Image image29 = null;
        multiplePiePlot28.setBackgroundImage(image29);
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        java.lang.String str33 = multiplePiePlot32.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener34 = null;
        multiplePiePlot32.addChangeListener(plotChangeListener34);
        java.awt.Image image36 = multiplePiePlot32.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart37 = multiplePiePlot32.getPieChart();
        multiplePiePlot28.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart37);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent39 = null;
        multiplePiePlot28.datasetChanged(datasetChangeEvent39);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo43 = null;
        multiplePiePlot28.handleClick((int) (short) 0, 15, plotRenderingInfo43);
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot46 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset45);
        java.lang.String str47 = multiplePiePlot46.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent48 = null;
        multiplePiePlot46.markerChanged(markerChangeEvent48);
        java.awt.Paint paint50 = null;
        multiplePiePlot46.setBackgroundPaint(paint50);
        java.awt.Paint paint52 = multiplePiePlot46.getOutlinePaint();
        multiplePiePlot28.setNoDataMessagePaint(paint52);
        multiplePiePlot1.setNoDataMessagePaint(paint52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot32", multiplePiePlot4.equals(multiplePiePlot32) ? multiplePiePlot4.hashCode() == multiplePiePlot32.hashCode() : true);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
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
        org.jfree.data.category.CategoryDataset categoryDataset56 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot57 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset56);
        java.awt.Image image58 = null;
        multiplePiePlot57.setBackgroundImage(image58);
        java.awt.Paint paint60 = multiplePiePlot57.getNoDataMessagePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot42 and multiplePiePlot57", multiplePiePlot42.equals(multiplePiePlot57) ? multiplePiePlot42.hashCode() == multiplePiePlot57.hashCode() : true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
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
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        boolean boolean16 = multiplePiePlot15.isSubplot();
        java.awt.Paint paint17 = multiplePiePlot15.getBackgroundPaint();
        float float18 = multiplePiePlot15.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.lang.String str21 = multiplePiePlot20.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        multiplePiePlot20.markerChanged(markerChangeEvent22);
        java.awt.Paint paint24 = null;
        multiplePiePlot20.setBackgroundPaint(paint24);
        multiplePiePlot20.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font28 = multiplePiePlot20.getNoDataMessageFont();
        multiplePiePlot15.setNoDataMessageFont(font28);
        org.jfree.chart.plot.Plot plot30 = multiplePiePlot15.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        boolean boolean33 = multiplePiePlot32.isSubplot();
        java.awt.Paint paint34 = multiplePiePlot32.getBackgroundPaint();
        java.awt.Paint paint35 = multiplePiePlot32.getNoDataMessagePaint();
        java.awt.Paint paint36 = multiplePiePlot32.getNoDataMessagePaint();
        multiplePiePlot15.setOutlinePaint(paint36);
        org.jfree.chart.JFreeChart jFreeChart38 = multiplePiePlot15.getPieChart();
        java.awt.Paint paint39 = null;
        multiplePiePlot15.setBackgroundPaint(paint39);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent41 = null;
        multiplePiePlot15.axisChanged(axisChangeEvent41);
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = multiplePiePlot15.getInsets();
        org.jfree.chart.plot.Plot plot44 = multiplePiePlot15.getRootPlot();
        plot12.setParent(plot44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot32", multiplePiePlot1.equals(multiplePiePlot32) ? multiplePiePlot1.hashCode() == multiplePiePlot32.hashCode() : true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
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
        boolean boolean13 = multiplePiePlot12.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        boolean boolean16 = multiplePiePlot15.isSubplot();
        multiplePiePlot15.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot12.setParent((org.jfree.chart.plot.Plot) multiplePiePlot15);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = multiplePiePlot15.getInsets();
        org.jfree.chart.JFreeChart jFreeChart21 = multiplePiePlot15.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart21);
        java.lang.Object obj23 = multiplePiePlot1.clone();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        boolean boolean26 = multiplePiePlot25.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        boolean boolean29 = multiplePiePlot28.isSubplot();
        multiplePiePlot28.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot25.setParent((org.jfree.chart.plot.Plot) multiplePiePlot28);
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = multiplePiePlot28.getInsets();
        multiplePiePlot28.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Font font36 = multiplePiePlot28.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        java.lang.String str39 = multiplePiePlot38.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent40 = null;
        multiplePiePlot38.markerChanged(markerChangeEvent40);
        java.awt.Paint paint42 = multiplePiePlot38.getAggregatedItemsPaint();
        java.lang.Comparable comparable43 = multiplePiePlot38.getAggregatedItemsKey();
        multiplePiePlot38.setBackgroundImageAlpha((float) 0);
        java.awt.Font font46 = multiplePiePlot38.getNoDataMessageFont();
        double double47 = multiplePiePlot38.getLimit();
        java.awt.Paint paint48 = multiplePiePlot38.getAggregatedItemsPaint();
        java.awt.Font font49 = multiplePiePlot38.getNoDataMessageFont();
        multiplePiePlot38.setLimit((double) (-1L));
        java.awt.Paint paint52 = null;
        multiplePiePlot38.setOutlinePaint(paint52);
        java.lang.String str54 = multiplePiePlot38.getNoDataMessage();
        java.awt.Stroke stroke55 = multiplePiePlot38.getOutlineStroke();
        multiplePiePlot28.setOutlineStroke(stroke55);
        multiplePiePlot1.setOutlineStroke(stroke55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot12 and obj23", multiplePiePlot12.equals(obj23) ? multiplePiePlot12.hashCode() == obj23.hashCode() : true);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
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
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent14 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent14);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        boolean boolean18 = multiplePiePlot17.isSubplot();
        java.awt.Paint paint19 = multiplePiePlot17.getBackgroundPaint();
        java.awt.Image image20 = multiplePiePlot17.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        boolean boolean23 = multiplePiePlot22.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        boolean boolean26 = multiplePiePlot25.isSubplot();
        multiplePiePlot25.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot22.setParent((org.jfree.chart.plot.Plot) multiplePiePlot25);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = multiplePiePlot25.getInsets();
        org.jfree.chart.JFreeChart jFreeChart31 = multiplePiePlot25.getPieChart();
        multiplePiePlot17.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart31);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent33 = null;
        multiplePiePlot17.notifyListeners(plotChangeEvent33);
        org.jfree.chart.JFreeChart jFreeChart35 = multiplePiePlot17.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot17 and multiplePiePlot22", multiplePiePlot17.equals(multiplePiePlot22) ? multiplePiePlot17.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.lang.String str10 = multiplePiePlot9.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        multiplePiePlot9.markerChanged(markerChangeEvent11);
        java.awt.Paint paint13 = multiplePiePlot9.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.lang.String str16 = multiplePiePlot15.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        multiplePiePlot15.addChangeListener(plotChangeListener17);
        java.awt.Image image19 = multiplePiePlot15.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart20 = multiplePiePlot15.getPieChart();
        multiplePiePlot9.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart20);
        java.awt.Paint paint22 = multiplePiePlot9.getBackgroundPaint();
        int int23 = multiplePiePlot9.getBackgroundImageAlignment();
        java.awt.Paint paint24 = multiplePiePlot9.getNoDataMessagePaint();
        multiplePiePlot1.setOutlinePaint(paint24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot15", multiplePiePlot9.equals(multiplePiePlot15) ? multiplePiePlot9.hashCode() == multiplePiePlot15.hashCode() : true);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        java.awt.Image image13 = null;
        multiplePiePlot12.setBackgroundImage(image13);
        multiplePiePlot12.zoom((double) 10L);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        multiplePiePlot18.setForegroundAlpha((float) 0L);
        java.awt.Paint paint22 = multiplePiePlot18.getNoDataMessagePaint();
        java.awt.Paint paint23 = multiplePiePlot18.getBackgroundPaint();
        boolean boolean24 = multiplePiePlot12.equals((java.lang.Object) paint23);
        multiplePiePlot1.setOutlinePaint(paint23);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        boolean boolean28 = multiplePiePlot27.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        boolean boolean31 = multiplePiePlot30.isSubplot();
        multiplePiePlot30.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot27.setParent((org.jfree.chart.plot.Plot) multiplePiePlot30);
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier37 = null;
        multiplePiePlot36.setDrawingSupplier(drawingSupplier37);
        boolean boolean40 = multiplePiePlot36.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint41 = multiplePiePlot36.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection42 = multiplePiePlot36.getLegendItems();
        boolean boolean43 = multiplePiePlot36.isOutlineVisible();
        multiplePiePlot36.zoom((double) 10);
        org.jfree.chart.util.TableOrder tableOrder46 = multiplePiePlot36.getDataExtractOrder();
        java.awt.Paint paint47 = multiplePiePlot36.getAggregatedItemsPaint();
        multiplePiePlot36.setBackgroundAlpha((float) ' ');
        org.jfree.chart.JFreeChart jFreeChart50 = multiplePiePlot36.getPieChart();
        multiplePiePlot30.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart50);
        multiplePiePlot1.setPieChart(jFreeChart50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot12 and multiplePiePlot27", multiplePiePlot12.equals(multiplePiePlot27) ? multiplePiePlot12.hashCode() == multiplePiePlot27.hashCode() : true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
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
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = null;
        multiplePiePlot17.setDrawingSupplier(drawingSupplier18);
        float float20 = multiplePiePlot17.getBackgroundImageAlpha();
        java.awt.Paint paint21 = multiplePiePlot17.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        multiplePiePlot17.setDataset(categoryDataset22);
        multiplePiePlot17.setForegroundAlpha((float) (short) -1);
        float float26 = multiplePiePlot17.getBackgroundAlpha();
        java.awt.Paint paint27 = multiplePiePlot17.getOutlinePaint();
        multiplePiePlot1.setNoDataMessagePaint(paint27);
        org.jfree.chart.JFreeChart jFreeChart29 = multiplePiePlot1.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        multiplePiePlot1.setDataset(categoryDataset30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart10 and jFreeChart29", jFreeChart10.equals(jFreeChart29) ? jFreeChart10.hashCode() == jFreeChart29.hashCode() : true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        boolean boolean5 = multiplePiePlot1.isOutlineVisible();
        java.lang.Object obj6 = multiplePiePlot1.clone();
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        java.awt.Paint paint12 = multiplePiePlot10.getBackgroundPaint();
        float float13 = multiplePiePlot10.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.lang.String str16 = multiplePiePlot15.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        multiplePiePlot15.markerChanged(markerChangeEvent17);
        java.awt.Paint paint19 = null;
        multiplePiePlot15.setBackgroundPaint(paint19);
        multiplePiePlot15.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font23 = multiplePiePlot15.getNoDataMessageFont();
        multiplePiePlot10.setNoDataMessageFont(font23);
        org.jfree.chart.plot.Plot plot25 = multiplePiePlot10.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        boolean boolean28 = multiplePiePlot27.isSubplot();
        java.awt.Paint paint29 = multiplePiePlot27.getBackgroundPaint();
        java.awt.Paint paint30 = multiplePiePlot27.getNoDataMessagePaint();
        java.awt.Paint paint31 = multiplePiePlot27.getNoDataMessagePaint();
        multiplePiePlot10.setOutlinePaint(paint31);
        org.jfree.chart.JFreeChart jFreeChart33 = multiplePiePlot10.getPieChart();
        java.awt.Paint paint34 = null;
        multiplePiePlot10.setBackgroundPaint(paint34);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent36 = null;
        multiplePiePlot10.axisChanged(axisChangeEvent36);
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = multiplePiePlot10.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and multiplePiePlot1", obj6.equals(multiplePiePlot1) ? obj6.hashCode() == multiplePiePlot1.hashCode() : true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        boolean boolean9 = multiplePiePlot8.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        boolean boolean12 = multiplePiePlot11.isSubplot();
        multiplePiePlot11.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot8.setParent((org.jfree.chart.plot.Plot) multiplePiePlot11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        multiplePiePlot8.handleClick((int) (short) -1, (-1), plotRenderingInfo18);
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot8.getRootPlot();
        org.jfree.data.general.DatasetGroup datasetGroup21 = multiplePiePlot8.getDatasetGroup();
        multiplePiePlot8.setBackgroundAlpha((float) 10);
        java.awt.Stroke stroke24 = multiplePiePlot8.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke24);
        org.jfree.chart.plot.Plot plot26 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        boolean boolean29 = multiplePiePlot28.isSubplot();
        multiplePiePlot28.setForegroundAlpha((float) 0L);
        org.jfree.chart.util.TableOrder tableOrder32 = multiplePiePlot28.getDataExtractOrder();
        org.jfree.chart.util.TableOrder tableOrder33 = multiplePiePlot28.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset34 = multiplePiePlot28.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        boolean boolean37 = multiplePiePlot36.isSubplot();
        multiplePiePlot36.setForegroundAlpha((float) 0L);
        java.awt.Paint paint40 = multiplePiePlot36.getNoDataMessagePaint();
        java.awt.Paint paint41 = multiplePiePlot36.getBackgroundPaint();
        java.awt.Paint paint42 = multiplePiePlot36.getAggregatedItemsPaint();
        java.awt.Image image43 = null;
        multiplePiePlot36.setBackgroundImage(image43);
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = multiplePiePlot36.getInsets();
        multiplePiePlot28.setInsets(rectangleInsets45);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier47 = multiplePiePlot28.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot28 and multiplePiePlot36", multiplePiePlot28.equals(multiplePiePlot36) ? multiplePiePlot28.hashCode() == multiplePiePlot36.hashCode() : true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent14 = null;
        multiplePiePlot4.axisChanged(axisChangeEvent14);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        multiplePiePlot4.drawBackgroundImage(graphics2D16, rectangle2D17);
        java.awt.Paint paint19 = multiplePiePlot4.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        java.lang.String str22 = multiplePiePlot21.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener23 = null;
        multiplePiePlot21.addChangeListener(plotChangeListener23);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = multiplePiePlot21.getDrawingSupplier();
        java.awt.Paint paint26 = multiplePiePlot21.getNoDataMessagePaint();
        java.awt.Image image27 = null;
        multiplePiePlot21.setBackgroundImage(image27);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        java.lang.String str31 = multiplePiePlot30.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        java.lang.String str34 = multiplePiePlot33.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent35 = null;
        multiplePiePlot33.markerChanged(markerChangeEvent35);
        java.awt.Paint paint37 = multiplePiePlot33.getAggregatedItemsPaint();
        multiplePiePlot30.setOutlinePaint(paint37);
        java.lang.String str39 = multiplePiePlot30.getPlotType();
        java.lang.String str40 = multiplePiePlot30.getNoDataMessage();
        float float41 = multiplePiePlot30.getBackgroundImageAlpha();
        int int42 = multiplePiePlot30.getBackgroundImageAlignment();
        java.awt.Paint paint43 = multiplePiePlot30.getNoDataMessagePaint();
        multiplePiePlot21.setOutlinePaint(paint43);
        multiplePiePlot4.setBackgroundPaint(paint43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot33", multiplePiePlot1.equals(multiplePiePlot33) ? multiplePiePlot1.hashCode() == multiplePiePlot33.hashCode() : true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        multiplePiePlot11.markerChanged(markerChangeEvent13);
        java.awt.Paint paint15 = multiplePiePlot11.getAggregatedItemsPaint();
        multiplePiePlot8.setOutlinePaint(paint15);
        java.lang.String str17 = multiplePiePlot8.getPlotType();
        java.lang.String str18 = multiplePiePlot8.getNoDataMessage();
        multiplePiePlot8.setForegroundAlpha(0.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = multiplePiePlot8.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets21);
        java.awt.Font font23 = multiplePiePlot1.getNoDataMessageFont();
        java.lang.String str24 = multiplePiePlot1.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        java.lang.String str27 = multiplePiePlot26.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        java.lang.String str30 = multiplePiePlot29.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        multiplePiePlot29.markerChanged(markerChangeEvent31);
        java.awt.Paint paint33 = multiplePiePlot29.getAggregatedItemsPaint();
        multiplePiePlot26.setOutlinePaint(paint33);
        java.lang.String str35 = multiplePiePlot26.getPlotType();
        java.lang.String str36 = multiplePiePlot26.getNoDataMessage();
        float float37 = multiplePiePlot26.getBackgroundImageAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent38 = null;
        multiplePiePlot26.axisChanged(axisChangeEvent38);
        boolean boolean40 = multiplePiePlot1.equals((java.lang.Object) axisChangeEvent38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot11 and multiplePiePlot29", multiplePiePlot11.equals(multiplePiePlot29) ? multiplePiePlot11.hashCode() == multiplePiePlot29.hashCode() : true);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
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
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        multiplePiePlot1.setDataset(categoryDataset23);
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        java.lang.String str27 = multiplePiePlot26.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        java.lang.String str30 = multiplePiePlot29.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        multiplePiePlot29.markerChanged(markerChangeEvent31);
        java.awt.Paint paint33 = multiplePiePlot29.getAggregatedItemsPaint();
        multiplePiePlot26.setOutlinePaint(paint33);
        java.lang.String str35 = multiplePiePlot26.getPlotType();
        java.lang.String str36 = multiplePiePlot26.getNoDataMessage();
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = multiplePiePlot26.getInsets();
        org.jfree.chart.plot.Plot plot38 = multiplePiePlot26.getParent();
        multiplePiePlot26.setBackgroundImageAlignment((int) (byte) 1);
        java.awt.Paint paint41 = multiplePiePlot26.getAggregatedItemsPaint();
        multiplePiePlot1.setOutlinePaint(paint41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot29", multiplePiePlot9.equals(multiplePiePlot29) ? multiplePiePlot9.hashCode() == multiplePiePlot29.hashCode() : true);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
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
        org.jfree.chart.plot.Plot plot17 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.lang.String str20 = multiplePiePlot19.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        multiplePiePlot19.addChangeListener(plotChangeListener21);
        java.awt.Image image23 = multiplePiePlot19.getBackgroundImage();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = multiplePiePlot19.getDrawingSupplier();
        plot17.setDrawingSupplier(drawingSupplier24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot8 and multiplePiePlot19", multiplePiePlot8.equals(multiplePiePlot19) ? multiplePiePlot8.hashCode() == multiplePiePlot19.hashCode() : true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
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
        java.lang.String str22 = multiplePiePlot1.getPlotType();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent23 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent23);
        org.jfree.data.category.CategoryDataset categoryDataset25 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        java.awt.Image image28 = null;
        multiplePiePlot27.setBackgroundImage(image28);
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
        multiplePiePlot27.setNoDataMessageFont(font44);
        multiplePiePlot27.setLimit((double) 100.0f);
        multiplePiePlot27.setAggregatedItemsKey((java.lang.Comparable) "hi!");
        multiplePiePlot27.setOutlineVisible(false);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent53 = null;
        multiplePiePlot27.markerChanged(markerChangeEvent53);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot4 and multiplePiePlot31", multiplePiePlot4.equals(multiplePiePlot31) ? multiplePiePlot4.hashCode() == multiplePiePlot31.hashCode() : true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
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
        org.jfree.data.category.CategoryDataset categoryDataset45 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot46 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset45);
        java.lang.String str47 = multiplePiePlot46.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset48 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot49 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset48);
        java.lang.String str50 = multiplePiePlot49.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent51 = null;
        multiplePiePlot49.markerChanged(markerChangeEvent51);
        java.awt.Paint paint53 = multiplePiePlot49.getAggregatedItemsPaint();
        multiplePiePlot46.setOutlinePaint(paint53);
        java.lang.String str55 = multiplePiePlot46.getPlotType();
        org.jfree.chart.LegendItemCollection legendItemCollection56 = multiplePiePlot46.getLegendItems();
        java.lang.String str57 = multiplePiePlot46.getPlotType();
        multiplePiePlot46.setBackgroundImageAlignment((int) 'a');
        java.awt.Image image60 = multiplePiePlot46.getBackgroundImage();
        java.lang.String str61 = multiplePiePlot46.getPlotType();
        org.jfree.data.general.DatasetGroup datasetGroup62 = multiplePiePlot46.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset63 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot64 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset63);
        java.lang.String str65 = multiplePiePlot64.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent66 = null;
        multiplePiePlot64.markerChanged(markerChangeEvent66);
        java.awt.Paint paint68 = multiplePiePlot64.getAggregatedItemsPaint();
        java.lang.Comparable comparable69 = multiplePiePlot64.getAggregatedItemsKey();
        multiplePiePlot64.setBackgroundImageAlpha((float) 0);
        java.awt.Font font72 = multiplePiePlot64.getNoDataMessageFont();
        double double73 = multiplePiePlot64.getLimit();
        java.awt.Font font74 = multiplePiePlot64.getNoDataMessageFont();
        multiplePiePlot64.setBackgroundAlpha((float) 'a');
        java.awt.Stroke stroke77 = multiplePiePlot64.getOutlineStroke();
        multiplePiePlot46.setOutlineStroke(stroke77);
        multiplePiePlot28.setOutlineStroke(stroke77);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot25 and multiplePiePlot49", multiplePiePlot25.equals(multiplePiePlot49) ? multiplePiePlot25.hashCode() == multiplePiePlot49.hashCode() : true);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        boolean boolean5 = multiplePiePlot1.isOutlineVisible();
        java.lang.Object obj6 = multiplePiePlot1.clone();
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.setBackgroundImageAlignment(15);
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
        java.awt.Font font22 = multiplePiePlot11.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot23 = multiplePiePlot11.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        java.awt.Image image26 = null;
        multiplePiePlot25.setBackgroundImage(image26);
        multiplePiePlot25.zoom((double) 10L);
        org.jfree.data.general.DatasetGroup datasetGroup30 = multiplePiePlot25.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier33 = null;
        multiplePiePlot32.setDrawingSupplier(drawingSupplier33);
        float float35 = multiplePiePlot32.getBackgroundImageAlpha();
        java.awt.Paint paint36 = multiplePiePlot32.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        multiplePiePlot32.setDataset(categoryDataset37);
        org.jfree.chart.plot.Plot plot39 = multiplePiePlot32.getRootPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        multiplePiePlot32.handleClick((int) (short) 1, 1, plotRenderingInfo42);
        multiplePiePlot32.setBackgroundImageAlignment(15);
        java.awt.Paint paint46 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot32.setNoDataMessagePaint(paint46);
        multiplePiePlot25.setBackgroundPaint(paint46);
        multiplePiePlot11.setNoDataMessagePaint(paint46);
        multiplePiePlot1.setOutlinePaint(paint46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj6 and multiplePiePlot25", obj6.equals(multiplePiePlot25) ? obj6.hashCode() == multiplePiePlot25.hashCode() : true);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
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
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot16.setDrawingSupplier(drawingSupplier17);
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot16.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot16.setInsets(rectangleInsets20);
        multiplePiePlot16.zoom((double) 1.0f);
        java.lang.String str24 = multiplePiePlot16.getNoDataMessage();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = multiplePiePlot16.getInsets();
        plot12.setParent((org.jfree.chart.plot.Plot) multiplePiePlot16);
        multiplePiePlot16.setForegroundAlpha(10.0f);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        boolean boolean31 = multiplePiePlot30.isSubplot();
        java.awt.Paint paint32 = multiplePiePlot30.getBackgroundPaint();
        float float33 = multiplePiePlot30.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        java.lang.String str36 = multiplePiePlot35.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent37 = null;
        multiplePiePlot35.markerChanged(markerChangeEvent37);
        java.awt.Paint paint39 = null;
        multiplePiePlot35.setBackgroundPaint(paint39);
        multiplePiePlot35.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font43 = multiplePiePlot35.getNoDataMessageFont();
        multiplePiePlot30.setNoDataMessageFont(font43);
        float float45 = multiplePiePlot30.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset46 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot47 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset46);
        boolean boolean48 = multiplePiePlot47.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset49 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot50 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset49);
        boolean boolean51 = multiplePiePlot50.isSubplot();
        multiplePiePlot50.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot47.setParent((org.jfree.chart.plot.Plot) multiplePiePlot50);
        org.jfree.chart.util.RectangleInsets rectangleInsets55 = multiplePiePlot50.getInsets();
        java.awt.Font font56 = multiplePiePlot50.getNoDataMessageFont();
        java.awt.Font font57 = multiplePiePlot50.getNoDataMessageFont();
        multiplePiePlot30.setNoDataMessageFont(font57);
        multiplePiePlot16.setNoDataMessageFont(font57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot30 and multiplePiePlot47", multiplePiePlot30.equals(multiplePiePlot47) ? multiplePiePlot30.hashCode() == multiplePiePlot47.hashCode() : true);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot4.getInsets();
        org.jfree.chart.JFreeChart jFreeChart10 = multiplePiePlot4.getPieChart();
        boolean boolean11 = multiplePiePlot4.isOutlineVisible();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        multiplePiePlot4.drawBackgroundImage(graphics2D12, rectangle2D13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = multiplePiePlot16.getDrawingSupplier();
        java.awt.Stroke stroke18 = multiplePiePlot16.getOutlineStroke();
        multiplePiePlot4.setOutlineStroke(stroke18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot16", multiplePiePlot1.equals(multiplePiePlot16) ? multiplePiePlot1.hashCode() == multiplePiePlot16.hashCode() : true);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
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
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        multiplePiePlot4.drawBackgroundImage(graphics2D14, rectangle2D15);
        multiplePiePlot4.setBackgroundAlpha((float) (byte) -1);
        multiplePiePlot4.setBackgroundAlpha((float) (-1L));
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        boolean boolean23 = multiplePiePlot22.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        boolean boolean26 = multiplePiePlot25.isSubplot();
        multiplePiePlot25.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot22.setParent((org.jfree.chart.plot.Plot) multiplePiePlot25);
        java.awt.Stroke stroke30 = multiplePiePlot25.getOutlineStroke();
        multiplePiePlot25.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        multiplePiePlot25.setDataset(categoryDataset33);
        java.awt.Graphics2D graphics2D35 = null;
        java.awt.geom.Rectangle2D rectangle2D36 = null;
        multiplePiePlot25.drawBackgroundImage(graphics2D35, rectangle2D36);
        multiplePiePlot25.setBackgroundAlpha((float) (byte) -1);
        multiplePiePlot25.setBackgroundAlpha((float) (-1L));
        java.awt.Paint paint42 = multiplePiePlot25.getOutlinePaint();
        boolean boolean43 = multiplePiePlot4.equals((java.lang.Object) multiplePiePlot25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot1 and multiplePiePlot22", multiplePiePlot1.equals(multiplePiePlot22) ? multiplePiePlot1.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
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
        org.jfree.chart.JFreeChart jFreeChart16 = multiplePiePlot1.getPieChart();
        java.awt.Paint paint17 = multiplePiePlot1.getOutlinePaint();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on jFreeChart10 and jFreeChart16", jFreeChart10.equals(jFreeChart16) ? jFreeChart10.hashCode() == jFreeChart16.hashCode() : true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
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
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        boolean boolean23 = multiplePiePlot22.isSubplot();
        multiplePiePlot22.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot19.setParent((org.jfree.chart.plot.Plot) multiplePiePlot22);
        java.awt.Stroke stroke27 = multiplePiePlot22.getOutlineStroke();
        multiplePiePlot22.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset30 = null;
        multiplePiePlot22.setDataset(categoryDataset30);
        java.awt.Graphics2D graphics2D32 = null;
        java.awt.geom.Rectangle2D rectangle2D33 = null;
        multiplePiePlot22.drawBackgroundImage(graphics2D32, rectangle2D33);
        java.lang.String str35 = multiplePiePlot22.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot37 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset36);
        java.lang.String str38 = multiplePiePlot37.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent39 = null;
        multiplePiePlot37.markerChanged(markerChangeEvent39);
        java.awt.Paint paint41 = null;
        multiplePiePlot37.setBackgroundPaint(paint41);
        multiplePiePlot37.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font45 = multiplePiePlot37.getNoDataMessageFont();
        java.awt.Stroke stroke46 = multiplePiePlot37.getOutlineStroke();
        multiplePiePlot22.setOutlineStroke(stroke46);
        multiplePiePlot1.setOutlineStroke(stroke46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot7 and multiplePiePlot19", multiplePiePlot7.equals(multiplePiePlot19) ? multiplePiePlot7.hashCode() == multiplePiePlot19.hashCode() : true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.setBackgroundImageAlpha(0.0f);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent10 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent10);
        org.jfree.chart.LegendItemCollection legendItemCollection12 = multiplePiePlot1.getLegendItems();
        multiplePiePlot1.zoom(1.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on legendItemCollection7 and legendItemCollection12", legendItemCollection7.equals(legendItemCollection12) ? legendItemCollection7.hashCode() == legendItemCollection12.hashCode() : true);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
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
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot1.getRootPlot();
        int int14 = plot13.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on plot13 and obj5", plot13.equals(obj5) ? plot13.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        java.awt.Paint paint7 = multiplePiePlot1.getOutlinePaint();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.lang.String str10 = multiplePiePlot9.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        multiplePiePlot9.markerChanged(markerChangeEvent11);
        float float13 = multiplePiePlot9.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot9.getRootPlot();
        boolean boolean15 = multiplePiePlot9.isSubplot();
        java.awt.Paint paint16 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        multiplePiePlot9.setOutlinePaint(paint16);
        double double18 = multiplePiePlot9.getLimit();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = multiplePiePlot9.getDrawingSupplier();
        multiplePiePlot1.setDrawingSupplier(drawingSupplier19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.awt.Image image23 = null;
        multiplePiePlot22.setBackgroundImage(image23);
        multiplePiePlot22.zoom((double) 10L);
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot28 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset27);
        boolean boolean29 = multiplePiePlot28.isSubplot();
        multiplePiePlot28.setForegroundAlpha((float) 0L);
        java.awt.Paint paint32 = multiplePiePlot28.getNoDataMessagePaint();
        java.awt.Paint paint33 = multiplePiePlot28.getBackgroundPaint();
        boolean boolean34 = multiplePiePlot22.equals((java.lang.Object) paint33);
        org.jfree.chart.JFreeChart jFreeChart35 = multiplePiePlot22.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot9 and multiplePiePlot22", multiplePiePlot9.equals(multiplePiePlot22) ? multiplePiePlot9.hashCode() == multiplePiePlot22.hashCode() : true);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
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
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        java.awt.Image image19 = null;
        multiplePiePlot18.setBackgroundImage(image19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.lang.String str23 = multiplePiePlot22.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        multiplePiePlot22.addChangeListener(plotChangeListener24);
        java.awt.Image image26 = multiplePiePlot22.getBackgroundImage();
        org.jfree.chart.JFreeChart jFreeChart27 = multiplePiePlot22.getPieChart();
        multiplePiePlot18.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart27);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent29 = null;
        multiplePiePlot18.datasetChanged(datasetChangeEvent29);
        org.jfree.chart.JFreeChart jFreeChart31 = multiplePiePlot18.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on multiplePiePlot18 and multiplePiePlot22", multiplePiePlot18.equals(multiplePiePlot22) ? multiplePiePlot18.hashCode() == multiplePiePlot22.hashCode() : true);
    }
}

