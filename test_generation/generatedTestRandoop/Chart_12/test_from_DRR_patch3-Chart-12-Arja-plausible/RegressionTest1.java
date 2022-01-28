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
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D15, rectangle2D16);
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
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
        multiplePiePlot1.setLimit(15.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(plot14);
        org.junit.Assert.assertNotNull(drawingSupplier20);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
        java.awt.Paint paint10 = multiplePiePlot7.getOutlinePaint();
        multiplePiePlot1.setBackgroundPaint(paint10);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
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
        org.jfree.data.general.DatasetGroup datasetGroup13 = multiplePiePlot1.getDatasetGroup();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        multiplePiePlot1.handleClick((int) (byte) 100, 1, plotRenderingInfo16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(datasetGroup13);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
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
        int int13 = multiplePiePlot1.getBackgroundImageAlignment();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        double double8 = multiplePiePlot1.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        multiplePiePlot1.setDataset(categoryDataset9);
        multiplePiePlot1.setForegroundAlpha(15.0f);
        boolean boolean13 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
        multiplePiePlot9.setNoDataMessage("Multiple Pie Plot");
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
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        double double8 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        multiplePiePlot1.setOutlineVisible(true);
        java.lang.Comparable comparable7 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier10);
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot9.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        plot12.markerChanged(markerChangeEvent13);
        float float15 = plot12.getBackgroundImageAlpha();
        plot12.setBackgroundImageAlpha(0.0f);
        java.awt.Image image18 = null;
        plot12.setBackgroundImage(image18);
        org.jfree.chart.plot.Plot plot20 = plot12.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = null;
        multiplePiePlot22.setDrawingSupplier(drawingSupplier23);
        float float25 = multiplePiePlot22.getBackgroundImageAlpha();
        java.awt.Paint paint26 = multiplePiePlot22.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        multiplePiePlot22.setDataset(categoryDataset27);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        java.lang.String str31 = multiplePiePlot30.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        multiplePiePlot30.markerChanged(markerChangeEvent32);
        java.awt.Paint paint34 = null;
        multiplePiePlot30.setBackgroundPaint(paint34);
        multiplePiePlot30.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font38 = multiplePiePlot30.getNoDataMessageFont();
        multiplePiePlot22.setNoDataMessageFont(font38);
        plot12.setNoDataMessageFont(font38);
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot42 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset41);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier43 = null;
        multiplePiePlot42.setDrawingSupplier(drawingSupplier43);
        double double45 = multiplePiePlot42.getLimit();
        multiplePiePlot42.setLimit((double) (short) 1);
        org.jfree.chart.JFreeChart jFreeChart48 = multiplePiePlot42.getPieChart();
        plot12.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart48);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart48);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + comparable7 + "' != '" + "Other" + "'", comparable7, "Other");
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.5f + "'", float25 == 0.5f);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(font38);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(jFreeChart48);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
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
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        boolean boolean14 = multiplePiePlot13.isSubplot();
        multiplePiePlot13.setForegroundAlpha((float) 0L);
        java.awt.Paint paint17 = multiplePiePlot13.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        multiplePiePlot13.setDataset(categoryDataset18);
        multiplePiePlot13.setLimit((double) 10.0f);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = null;
        multiplePiePlot23.setDrawingSupplier(drawingSupplier24);
        org.jfree.chart.plot.Plot plot26 = multiplePiePlot23.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = plot26.getInsets();
        multiplePiePlot13.setInsets(rectangleInsets27, true);
        multiplePiePlot1.setInsets(rectangleInsets27, true);
        java.awt.Paint paint32 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        multiplePiePlot1.handleClick((int) ' ', (int) (short) -1, plotRenderingInfo35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(plot26);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(paint32);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot1.getParent();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(plot9);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Paint paint8 = multiplePiePlot1.getOutlinePaint();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(legendItemCollection6);
        org.junit.Assert.assertNotNull(drawingSupplier7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        boolean boolean8 = multiplePiePlot1.isSubplot();
        float float9 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        double double8 = multiplePiePlot1.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier11);
        java.awt.Paint paint13 = multiplePiePlot10.getOutlinePaint();
        multiplePiePlot1.setNoDataMessagePaint(paint13);
        java.awt.Paint paint15 = multiplePiePlot1.getAggregatedItemsPaint();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.setLimit(10.0d);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = multiplePiePlot1.getDrawingSupplier();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(drawingSupplier9);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        org.jfree.chart.util.TableOrder tableOrder4 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setDataExtractOrder(tableOrder4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        multiplePiePlot6.setDrawingSupplier(drawingSupplier7);
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot6.getParent();
        double double10 = multiplePiePlot6.getLimit();
        float float11 = multiplePiePlot6.getBackgroundAlpha();
        java.awt.Paint paint12 = multiplePiePlot6.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundPaint(paint12);
        org.jfree.data.category.CategoryDataset categoryDataset14 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(plot9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(categoryDataset14);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        multiplePiePlot1.setLimit((double) (byte) 0);
        org.jfree.data.category.CategoryDataset categoryDataset8 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNull(categoryDataset8);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        double double5 = multiplePiePlot1.getLimit();
        org.jfree.chart.util.TableOrder tableOrder6 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(tableOrder6);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Paint paint4 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.util.TableOrder tableOrder7 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Paint paint8 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(tableOrder7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
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
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        multiplePiePlot4.setDataset(categoryDataset15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        multiplePiePlot13.markerChanged(markerChangeEvent15);
        java.awt.Paint paint17 = null;
        multiplePiePlot13.setBackgroundPaint(paint17);
        multiplePiePlot13.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.lang.String str23 = multiplePiePlot22.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot25 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset24);
        java.lang.String str26 = multiplePiePlot25.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent27 = null;
        multiplePiePlot25.markerChanged(markerChangeEvent27);
        java.awt.Paint paint29 = multiplePiePlot25.getAggregatedItemsPaint();
        multiplePiePlot22.setOutlinePaint(paint29);
        java.lang.String str31 = multiplePiePlot22.getPlotType();
        java.lang.String str32 = multiplePiePlot22.getNoDataMessage();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = multiplePiePlot22.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = multiplePiePlot22.getInsets();
        multiplePiePlot13.setInsets(rectangleInsets34, false);
        multiplePiePlot1.setInsets(rectangleInsets34);
        java.lang.String str38 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Multiple Pie Plot" + "'", str31, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNotNull(rectangleInsets34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Multiple Pie Plot" + "'", str38, "Multiple Pie Plot");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = multiplePiePlot1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        double double8 = multiplePiePlot1.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        multiplePiePlot1.setDataset(categoryDataset9);
        float float11 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        int int14 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Paint paint4 = multiplePiePlot1.getAggregatedItemsPaint();
        float float5 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = multiplePiePlot1.getDrawingSupplier();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(drawingSupplier9);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot4.getInsets();
        java.awt.Paint paint10 = multiplePiePlot4.getBackgroundPaint();
        float float11 = multiplePiePlot4.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(plot18);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getParent();
        int int7 = multiplePiePlot1.getBackgroundImageAlignment();
        int int8 = multiplePiePlot1.getBackgroundImageAlignment();
        multiplePiePlot1.setLimit((double) 15.0f);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = multiplePiePlot1.getDrawingSupplier();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(drawingSupplier15);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
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
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(image18);
        org.junit.Assert.assertNotNull(jFreeChart19);
        org.junit.Assert.assertNull(datasetGroup21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
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
        java.awt.Paint paint10 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(paint10);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        multiplePiePlot1.zoom((double) (short) 1);
        multiplePiePlot1.setForegroundAlpha((float) 15);
        double double11 = multiplePiePlot1.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = null;
        multiplePiePlot13.setDrawingSupplier(drawingSupplier14);
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot13.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        plot16.markerChanged(markerChangeEvent17);
        float float19 = plot16.getBackgroundImageAlpha();
        plot16.setBackgroundImageAlpha(0.0f);
        java.awt.Image image22 = null;
        plot16.setBackgroundImage(image22);
        org.jfree.chart.plot.Plot plot24 = plot16.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot26 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset25);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = null;
        multiplePiePlot26.setDrawingSupplier(drawingSupplier27);
        float float29 = multiplePiePlot26.getBackgroundImageAlpha();
        java.awt.Paint paint30 = multiplePiePlot26.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        multiplePiePlot26.setDataset(categoryDataset31);
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        java.lang.String str35 = multiplePiePlot34.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent36 = null;
        multiplePiePlot34.markerChanged(markerChangeEvent36);
        java.awt.Paint paint38 = null;
        multiplePiePlot34.setBackgroundPaint(paint38);
        multiplePiePlot34.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font42 = multiplePiePlot34.getNoDataMessageFont();
        multiplePiePlot26.setNoDataMessageFont(font42);
        plot16.setNoDataMessageFont(font42);
        multiplePiePlot1.setNoDataMessageFont(font42);
        java.awt.Image image46 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.5f + "'", float19 == 0.5f);
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.5f + "'", float29 == 0.5f);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(font42);
        org.junit.Assert.assertNull(image46);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        multiplePiePlot1.zoom(1.0d);
        java.awt.Image image8 = null;
        multiplePiePlot1.setBackgroundImage(image8);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.util.TableOrder tableOrder7 = multiplePiePlot1.getDataExtractOrder();
        int int8 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot1.getRootPlot();
        java.awt.Paint paint10 = plot9.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNull(plot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(tableOrder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent10);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
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
        java.awt.Font font14 = multiplePiePlot1.getNoDataMessageFont();
        org.jfree.data.general.DatasetGroup datasetGroup15 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(drawingSupplier13);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNull(datasetGroup15);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (byte) -1, (int) (short) 1, plotRenderingInfo7);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = multiplePiePlot1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 10);
        java.awt.Stroke stroke4 = multiplePiePlot1.getOutlineStroke();
        multiplePiePlot1.setOutlineVisible(false);
        org.junit.Assert.assertNotNull(stroke4);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Image image4 = null;
        multiplePiePlot1.setBackgroundImage(image4);
        java.awt.Paint paint6 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Class<?> wildcardClass7 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = plot4.getInsets();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        plot4.markerChanged(markerChangeEvent6);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
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
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot1.getPieChart();
        float float18 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(jFreeChart17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        multiplePiePlot1.handleClick(1, 1, plotRenderingInfo9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNull(plot5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Image image3 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = multiplePiePlot1.getDrawingSupplier();
        boolean boolean7 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.lang.String str10 = multiplePiePlot9.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        multiplePiePlot9.markerChanged(markerChangeEvent11);
        java.awt.Paint paint13 = multiplePiePlot9.getAggregatedItemsPaint();
        java.lang.Comparable comparable14 = multiplePiePlot9.getAggregatedItemsKey();
        multiplePiePlot9.setBackgroundImageAlpha((float) 0);
        java.awt.Font font17 = multiplePiePlot9.getNoDataMessageFont();
        java.awt.Paint paint18 = null;
        multiplePiePlot9.setOutlinePaint(paint18);
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
        java.awt.Paint paint42 = multiplePiePlot24.getAggregatedItemsPaint();
        org.jfree.chart.JFreeChart jFreeChart43 = multiplePiePlot24.getPieChart();
        multiplePiePlot9.setPieChart(jFreeChart43);
        multiplePiePlot1.setPieChart(jFreeChart43);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + "Other" + "'", comparable14, "Other");
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(rectangleInsets36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(tableOrder38);
        org.junit.Assert.assertNotNull(jFreeChart41);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(jFreeChart43);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
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
        java.awt.Paint paint19 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setNoDataMessagePaint(paint19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
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
        java.lang.Comparable comparable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setAggregatedItemsKey(comparable15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(jFreeChart6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(jFreeChart13);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
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
        java.awt.Image image13 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(image13);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
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
        java.awt.Paint paint17 = multiplePiePlot1.getOutlinePaint();
        float float18 = multiplePiePlot1.getForegroundAlpha();
        boolean boolean19 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        multiplePiePlot1.setForegroundAlpha((float) (byte) 10);
        double double7 = multiplePiePlot1.getLimit();
        org.jfree.chart.util.TableOrder tableOrder8 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier11);
        boolean boolean14 = multiplePiePlot10.equals((java.lang.Object) 1.0d);
        multiplePiePlot10.setBackgroundImageAlignment((int) (short) 0);
        java.awt.Paint paint17 = multiplePiePlot10.getBackgroundPaint();
        multiplePiePlot1.setNoDataMessagePaint(paint17);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(tableOrder8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(drawingSupplier18);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent2);
        java.awt.Stroke stroke4 = multiplePiePlot1.getOutlineStroke();
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
        java.awt.Image image14 = null;
        plot12.setBackgroundImage(image14);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        plot12.notifyListeners(plotChangeEvent16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        float float6 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
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
        int int23 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Multiple Pie Plot" + "'", str12, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Multiple Pie Plot" + "'", str22, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
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
        multiplePiePlot4.setBackgroundAlpha((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertEquals("'" + comparable14 + "' != '" + (short) 0 + "'", comparable14, (short) 0);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D4, rectangle2D5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
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
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        multiplePiePlot1.setDataset(categoryDataset16);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Multiple Pie Plot" + "'", str14, "Multiple Pie Plot");
        org.junit.Assert.assertNull(image15);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent9);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
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
        int int24 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(jFreeChart16);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.lang.String str7 = multiplePiePlot1.getPlotType();
        org.jfree.chart.JFreeChart jFreeChart8 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Multiple Pie Plot" + "'", str7, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(jFreeChart8);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
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
        java.awt.Stroke stroke16 = multiplePiePlot1.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        java.lang.String str19 = multiplePiePlot18.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        multiplePiePlot18.addChangeListener(plotChangeListener20);
        multiplePiePlot18.setForegroundAlpha((float) (byte) 10);
        double double24 = multiplePiePlot18.getLimit();
        java.awt.Paint paint25 = multiplePiePlot18.getAggregatedItemsPaint();
        multiplePiePlot1.setNoDataMessagePaint(paint25);
        float float27 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.5f + "'", float27 == 0.5f);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        double double8 = multiplePiePlot1.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        multiplePiePlot1.setDataset(categoryDataset9);
        multiplePiePlot1.setForegroundAlpha(15.0f);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D13, rectangle2D14);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setBackgroundImageAlpha((float) (byte) 0);
        boolean boolean3 = multiplePiePlot0.isSubplot();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
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
        float float11 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
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
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot4.setBackgroundImageAlpha((float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (byte) -1, (int) (short) 1, plotRenderingInfo7);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent9);
        java.lang.String str11 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot4.getDrawingSupplier();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(drawingSupplier11);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot1.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        java.lang.String str12 = multiplePiePlot11.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        multiplePiePlot11.addChangeListener(plotChangeListener13);
        java.lang.Object obj15 = multiplePiePlot11.clone();
        java.awt.Paint paint16 = multiplePiePlot11.getAggregatedItemsPaint();
        // The following exception was thrown during execution in test generation
        try {
            plot9.setNoDataMessagePaint(paint16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNull(plot9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = multiplePiePlot28.getInsets();
        multiplePiePlot10.setInsets(rectangleInsets33);
        java.awt.Stroke stroke35 = multiplePiePlot10.getOutlineStroke();
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
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNotNull(stroke35);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Paint paint4 = multiplePiePlot1.getOutlinePaint();
        multiplePiePlot1.setBackgroundAlpha((float) (-1));
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint8 = multiplePiePlot1.getNoDataMessagePaint();
        double double9 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Image image3 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.JFreeChart jFreeChart5 = multiplePiePlot1.getPieChart();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        java.awt.geom.Point2D point2D8 = null;
        org.jfree.chart.plot.PlotState plotState9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D6, rectangle2D7, point2D8, plotState9, plotRenderingInfo10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        multiplePiePlot1.setForegroundAlpha((float) (byte) 10);
        double double7 = multiplePiePlot1.getLimit();
        java.awt.Paint paint8 = multiplePiePlot1.getAggregatedItemsPaint();
        boolean boolean9 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
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
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + "Other" + "'", comparable12, "Other");
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
        float float12 = multiplePiePlot7.getBackgroundImageAlpha();
        multiplePiePlot7.setNoDataMessage("Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (byte) 1);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent23 = null;
        multiplePiePlot4.datasetChanged(datasetChangeEvent23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        double double5 = multiplePiePlot1.getLimit();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot1.getInsets();
        multiplePiePlot1.zoom((double) 0L);
        multiplePiePlot1.setBackgroundAlpha((float) (short) 0);
        int int12 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets17, true);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent20 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNotNull(rectangleInsets17);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
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
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        boolean boolean39 = multiplePiePlot38.isSubplot();
        multiplePiePlot38.setOutlineVisible(false);
        java.awt.Graphics2D graphics2D42 = null;
        java.awt.geom.Rectangle2D rectangle2D43 = null;
        multiplePiePlot38.drawBackgroundImage(graphics2D42, rectangle2D43);
        int int45 = multiplePiePlot38.getBackgroundImageAlignment();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot38);
        java.awt.Graphics2D graphics2D47 = null;
        java.awt.geom.Rectangle2D rectangle2D48 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D47, rectangle2D48);
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 15 + "'", int45 == 15);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
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
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getParent();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNull(plot12);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        org.jfree.chart.util.TableOrder tableOrder5 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.util.TableOrder tableOrder6 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent7 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent7);
        int int9 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(tableOrder5);
        org.junit.Assert.assertNull(tableOrder6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
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
        org.jfree.chart.plot.Plot plot16 = multiplePiePlot4.getRootPlot();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(plot16);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 0);
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot1.getParent();
        float float10 = multiplePiePlot1.getForegroundAlpha();
        multiplePiePlot1.setNoDataMessage("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNull(plot9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        float float6 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.general.DatasetGroup datasetGroup7 = multiplePiePlot1.getDatasetGroup();
        double double8 = multiplePiePlot1.getLimit();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent9);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Image image9 = multiplePiePlot1.getBackgroundImage();
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        java.awt.Paint paint11 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Stroke stroke12 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
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
        boolean boolean33 = multiplePiePlot32.isSubplot();
        multiplePiePlot32.setForegroundAlpha((float) 0L);
        java.awt.Paint paint36 = multiplePiePlot32.getNoDataMessagePaint();
        java.awt.Paint paint37 = multiplePiePlot32.getBackgroundPaint();
        java.awt.Paint paint38 = multiplePiePlot32.getAggregatedItemsPaint();
        java.awt.Image image39 = null;
        multiplePiePlot32.setBackgroundImage(image39);
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = multiplePiePlot32.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets42 = multiplePiePlot32.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets42);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + "Other" + "'", comparable22, "Other");
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(rectangleInsets41);
        org.junit.Assert.assertNotNull(rectangleInsets42);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Image image4 = null;
        multiplePiePlot1.setBackgroundImage(image4);
        java.awt.Paint paint6 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        multiplePiePlot1.setLimit(0.0d);
        java.awt.Paint paint8 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
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
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Multiple Pie Plot" + "'", str12, "Multiple Pie Plot");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        org.jfree.chart.util.TableOrder tableOrder5 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.util.TableOrder tableOrder6 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Image image7 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(tableOrder5);
        org.junit.Assert.assertNull(tableOrder6);
        org.junit.Assert.assertNull(image7);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.util.TableOrder tableOrder7 = multiplePiePlot1.getDataExtractOrder();
        int int8 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNull(plot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(tableOrder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(plot9);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent17);
        java.awt.Paint paint19 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(jFreeChart15);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
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
        java.awt.Paint paint12 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Stroke stroke13 = null;
        multiplePiePlot1.setOutlineStroke(stroke13);
        float float15 = multiplePiePlot1.getForegroundAlpha();
        multiplePiePlot1.setForegroundAlpha((float) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent14);
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
        java.awt.Paint paint28 = multiplePiePlot17.getOutlinePaint();
        java.awt.Stroke stroke29 = multiplePiePlot17.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + "Other" + "'", comparable22, "Other");
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke29);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
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
        org.jfree.chart.util.TableOrder tableOrder17 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.JFreeChart jFreeChart18 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setPieChart(jFreeChart18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'pieChart' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNull(tableOrder17);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        multiplePiePlot1.setForegroundAlpha((float) (byte) 10);
        double double7 = multiplePiePlot1.getLimit();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
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
        java.lang.String str17 = multiplePiePlot1.getNoDataMessage();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        multiplePiePlot1.drawOutline(graphics2D18, rectangle2D19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.lang.String str23 = multiplePiePlot22.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        multiplePiePlot22.addChangeListener(plotChangeListener24);
        multiplePiePlot22.setForegroundAlpha((float) (byte) 10);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        boolean boolean30 = multiplePiePlot29.isSubplot();
        multiplePiePlot29.setForegroundAlpha((float) 0L);
        java.awt.Paint paint33 = multiplePiePlot29.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        java.lang.String str36 = multiplePiePlot35.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener37 = null;
        multiplePiePlot35.addChangeListener(plotChangeListener37);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier39 = multiplePiePlot35.getDrawingSupplier();
        multiplePiePlot29.setDrawingSupplier(drawingSupplier39);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo43 = null;
        multiplePiePlot29.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo43);
        float float45 = multiplePiePlot29.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset46 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot47 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset46);
        multiplePiePlot47.setAggregatedItemsKey((java.lang.Comparable) 10);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent50 = null;
        multiplePiePlot47.markerChanged(markerChangeEvent50);
        multiplePiePlot47.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.awt.Image image54 = multiplePiePlot47.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset55 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot56 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset55);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier57 = null;
        multiplePiePlot56.setDrawingSupplier(drawingSupplier57);
        org.jfree.chart.plot.Plot plot59 = multiplePiePlot56.getParent();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent60 = null;
        multiplePiePlot56.datasetChanged(datasetChangeEvent60);
        multiplePiePlot56.setAggregatedItemsKey((java.lang.Comparable) (-1));
        float float64 = multiplePiePlot56.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart65 = multiplePiePlot56.getPieChart();
        multiplePiePlot47.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart65);
        multiplePiePlot29.setPieChart(jFreeChart65);
        multiplePiePlot22.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart65);
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart65);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(drawingSupplier39);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 1.0f + "'", float45 == 1.0f);
        org.junit.Assert.assertNull(image54);
        org.junit.Assert.assertNull(plot59);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + 0.5f + "'", float64 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart65);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
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
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        java.lang.String str20 = multiplePiePlot19.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        multiplePiePlot19.markerChanged(markerChangeEvent21);
        java.awt.Paint paint23 = null;
        multiplePiePlot19.setBackgroundPaint(paint23);
        multiplePiePlot19.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font27 = multiplePiePlot19.getNoDataMessageFont();
        java.awt.Stroke stroke28 = multiplePiePlot19.getOutlineStroke();
        multiplePiePlot4.setOutlineStroke(stroke28);
        float float30 = multiplePiePlot4.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Multiple Pie Plot" + "'", str17, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
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
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot1.getParent();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNull(plot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(tableOrder7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(plot11);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
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
        float float26 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(datasetGroup24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 100.0f + "'", float26 == 100.0f);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
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
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot1.getParent();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNull(plot7);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
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
        java.awt.Paint paint15 = multiplePiePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(tableOrder5);
        org.junit.Assert.assertNull(tableOrder6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(categoryDataset14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
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
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertNotNull(rectangleInsets16);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        multiplePiePlot1.setOutlineVisible(true);
        org.jfree.chart.plot.Plot plot7 = multiplePiePlot1.getParent();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(plot7);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        plot6.setBackgroundImageAlpha((float) 1);
        int int9 = plot6.getBackgroundImageAlignment();
        plot6.setOutlineVisible(false);
        org.jfree.chart.plot.Plot plot12 = plot6.getRootPlot();
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
        multiplePiePlot17.setBackgroundImageAlpha((float) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent27 = null;
        multiplePiePlot17.axisChanged(axisChangeEvent27);
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        multiplePiePlot17.drawBackgroundImage(graphics2D29, rectangle2D30);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier32 = multiplePiePlot17.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        java.lang.String str35 = multiplePiePlot34.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent36 = null;
        multiplePiePlot34.markerChanged(markerChangeEvent36);
        java.awt.Paint paint38 = multiplePiePlot34.getAggregatedItemsPaint();
        java.lang.Comparable comparable39 = multiplePiePlot34.getAggregatedItemsKey();
        java.awt.Image image40 = multiplePiePlot34.getBackgroundImage();
        multiplePiePlot34.setOutlineVisible(false);
        java.awt.Stroke stroke43 = multiplePiePlot34.getOutlineStroke();
        org.jfree.chart.JFreeChart jFreeChart44 = multiplePiePlot34.getPieChart();
        multiplePiePlot17.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart44);
        plot12.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart44);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(drawingSupplier32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertEquals("'" + comparable39 + "' != '" + "Other" + "'", comparable39, "Other");
        org.junit.Assert.assertNull(image40);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(jFreeChart44);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = plot20.isSubplot();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(tableOrder18);
        org.junit.Assert.assertNull(plot19);
        org.junit.Assert.assertNull(plot20);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
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
        java.lang.Comparable comparable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot7.setAggregatedItemsKey(comparable16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = multiplePiePlot1.getInsets();
        multiplePiePlot1.setLimit((double) (-1.0f));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(image10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo8);
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot1.getParent();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(plot10);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
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
        org.jfree.chart.plot.Plot plot18 = plot17.getRootPlot();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertNotNull(plot18);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot1.getLegendItems();
        java.lang.Object obj7 = multiplePiePlot1.clone();
        int int8 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNotNull(legendItemCollection6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.setOutlineVisible(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
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
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        float float3 = multiplePiePlot1.getForegroundAlpha();
        int int4 = multiplePiePlot1.getBackgroundImageAlignment();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 10L);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D7, rectangle2D8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.setLimit(10.0d);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        java.awt.Image image12 = multiplePiePlot10.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection13 = multiplePiePlot10.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = multiplePiePlot10.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets14, true);
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = multiplePiePlot1.getInsets();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(legendItemCollection13);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(rectangleInsets17);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.String str6 = multiplePiePlot1.getPlotType();
        int int7 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier13);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart16 = multiplePiePlot12.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        multiplePiePlot18.setForegroundAlpha((float) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot23 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset22);
        java.lang.String str24 = multiplePiePlot23.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener25 = null;
        multiplePiePlot23.addChangeListener(plotChangeListener25);
        java.awt.Image image27 = multiplePiePlot23.getBackgroundImage();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent28 = null;
        multiplePiePlot23.axisChanged(axisChangeEvent28);
        double double30 = multiplePiePlot23.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot32 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset31);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier33 = null;
        multiplePiePlot32.setDrawingSupplier(drawingSupplier33);
        java.awt.Paint paint35 = multiplePiePlot32.getOutlinePaint();
        multiplePiePlot23.setNoDataMessagePaint(paint35);
        multiplePiePlot18.setOutlinePaint(paint35);
        multiplePiePlot12.setAggregatedItemsPaint(paint35);
        multiplePiePlot1.setBackgroundPaint(paint35);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNotNull(jFreeChart16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(image27);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
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
        java.awt.Paint paint21 = multiplePiePlot4.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
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
        java.lang.Class<?> wildcardClass19 = paint17.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = multiplePiePlot1.getDrawingSupplier();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Multiple Pie Plot" + "'", str12, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Multiple Pie Plot" + "'", str22, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(drawingSupplier25);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
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
        java.lang.String str19 = multiplePiePlot18.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        multiplePiePlot18.markerChanged(markerChangeEvent20);
        float float22 = multiplePiePlot18.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        multiplePiePlot18.setDataset(categoryDataset23);
        boolean boolean25 = multiplePiePlot18.isOutlineVisible();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        java.lang.String str28 = multiplePiePlot27.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener29 = null;
        multiplePiePlot27.addChangeListener(plotChangeListener29);
        java.awt.Paint paint31 = multiplePiePlot27.getAggregatedItemsPaint();
        multiplePiePlot18.setOutlinePaint(paint31);
        multiplePiePlot1.setOutlinePaint(paint31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint15 = plot14.getNoDataMessagePaint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertNull(plot14);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Stroke stroke4 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getRootPlot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(plot5);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
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
        int int31 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Multiple Pie Plot" + "'", str24, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.5f + "'", float26 == 0.5f);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 15 + "'", int31 == 15);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
        java.awt.Image image17 = null;
        multiplePiePlot1.setBackgroundImage(image17);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
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
        org.jfree.data.general.DatasetGroup datasetGroup16 = multiplePiePlot4.getDatasetGroup();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent17 = null;
        multiplePiePlot4.axisChanged(axisChangeEvent17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(datasetGroup16);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint6 = multiplePiePlot1.getBackgroundPaint();
        boolean boolean7 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.zoom((double) 0.0f);
        java.lang.Comparable comparable10 = multiplePiePlot1.getAggregatedItemsKey();
        int int11 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + comparable10 + "' != '" + "Other" + "'", comparable10, "Other");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
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
        org.jfree.chart.plot.Plot plot11 = multiplePiePlot1.getRootPlot();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(categoryDataset10);
        org.junit.Assert.assertNotNull(plot11);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot4.getInsets();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot4.getParent();
        multiplePiePlot4.zoom((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNull(plot10);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = null;
        multiplePiePlot21.setDrawingSupplier(drawingSupplier22);
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot21.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        plot24.markerChanged(markerChangeEvent25);
        plot24.zoom(0.0d);
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = null;
        multiplePiePlot30.setDrawingSupplier(drawingSupplier31);
        org.jfree.chart.plot.Plot plot33 = multiplePiePlot30.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot30.setInsets(rectangleInsets34);
        multiplePiePlot30.zoom((double) 1.0f);
        java.lang.String str38 = multiplePiePlot30.getNoDataMessage();
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = multiplePiePlot30.getInsets();
        double double40 = multiplePiePlot30.getLimit();
        multiplePiePlot30.setAggregatedItemsKey((java.lang.Comparable) 0);
        plot24.setParent((org.jfree.chart.plot.Plot) multiplePiePlot30);
        java.awt.Paint paint44 = multiplePiePlot30.getAggregatedItemsPaint();
        multiplePiePlot1.setNoDataMessagePaint(paint44);
        org.jfree.data.category.CategoryDataset categoryDataset46 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot47 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset46);
        boolean boolean48 = multiplePiePlot47.isSubplot();
        java.awt.Paint paint49 = multiplePiePlot47.getBackgroundPaint();
        java.awt.Paint paint50 = multiplePiePlot47.getNoDataMessagePaint();
        multiplePiePlot47.setLimit((double) (byte) 1);
        java.lang.Object obj53 = null;
        boolean boolean54 = multiplePiePlot47.equals(obj53);
        java.awt.Paint paint55 = multiplePiePlot47.getBackgroundPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint55);
        java.awt.Paint paint57 = multiplePiePlot1.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.5f + "'", float19 == 0.5f);
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertNotNull(plot33);
        org.junit.Assert.assertNotNull(rectangleInsets34);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(rectangleInsets39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNotNull(paint57);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint6 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint7 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Object obj8 = multiplePiePlot1.clone();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
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
        java.lang.String str20 = multiplePiePlot4.getPlotType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Multiple Pie Plot" + "'", str20, "Multiple Pie Plot");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        multiplePiePlot16.handleClick((int) (byte) 1, (int) '#', plotRenderingInfo29);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNotNull(plot19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(rectangleInsets25);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNull(tableOrder12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setLimit((double) (byte) 1);
        java.lang.Object obj7 = null;
        boolean boolean8 = multiplePiePlot1.equals(obj7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setInsets(rectangleInsets9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        java.lang.String str8 = multiplePiePlot1.getNoDataMessage();
        boolean boolean9 = multiplePiePlot1.isOutlineVisible();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        java.awt.geom.Point2D point2D12 = null;
        org.jfree.chart.plot.PlotState plotState13 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D10, rectangle2D11, point2D12, plotState13, plotRenderingInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
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
        java.lang.Comparable comparable37 = multiplePiePlot11.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot39 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset38);
        java.lang.String str40 = multiplePiePlot39.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent41 = null;
        multiplePiePlot39.markerChanged(markerChangeEvent41);
        java.awt.Paint paint43 = multiplePiePlot39.getAggregatedItemsPaint();
        java.lang.Comparable comparable44 = multiplePiePlot39.getAggregatedItemsKey();
        multiplePiePlot39.setBackgroundImageAlpha((float) 0);
        java.awt.Font font47 = multiplePiePlot39.getNoDataMessageFont();
        double double48 = multiplePiePlot39.getLimit();
        java.awt.Font font49 = multiplePiePlot39.getNoDataMessageFont();
        multiplePiePlot11.setNoDataMessageFont(font49);
        org.jfree.chart.util.TableOrder tableOrder51 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot11.setDataExtractOrder(tableOrder51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + comparable37 + "' != '" + "Other" + "'", comparable37, "Other");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertEquals("'" + comparable44 + "' != '" + "Other" + "'", comparable44, "Other");
        org.junit.Assert.assertNotNull(font47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(font49);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        java.lang.String str17 = multiplePiePlot1.getNoDataMessage();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D18, rectangle2D19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
        java.lang.String str18 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
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
        float float14 = plot12.getForegroundAlpha();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        plot12.markerChanged(markerChangeEvent15);
        int int17 = plot12.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent62 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent62);
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
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
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
        java.awt.Paint paint27 = multiplePiePlot25.getBackgroundPaint();
        float float28 = multiplePiePlot25.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        java.lang.String str31 = multiplePiePlot30.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        multiplePiePlot30.markerChanged(markerChangeEvent32);
        java.awt.Paint paint34 = null;
        multiplePiePlot30.setBackgroundPaint(paint34);
        multiplePiePlot30.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font38 = multiplePiePlot30.getNoDataMessageFont();
        multiplePiePlot25.setNoDataMessageFont(font38);
        org.jfree.chart.plot.Plot plot40 = multiplePiePlot25.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot42 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset41);
        boolean boolean43 = multiplePiePlot42.isSubplot();
        java.awt.Paint paint44 = multiplePiePlot42.getBackgroundPaint();
        java.awt.Paint paint45 = multiplePiePlot42.getNoDataMessagePaint();
        java.awt.Paint paint46 = multiplePiePlot42.getNoDataMessagePaint();
        multiplePiePlot25.setOutlinePaint(paint46);
        multiplePiePlot1.setNoDataMessagePaint(paint46);
        float float49 = multiplePiePlot1.getForegroundAlpha();
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
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.0f + "'", float28 == 1.0f);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(font38);
        org.junit.Assert.assertNotNull(plot40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 1.0f + "'", float49 == 1.0f);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        org.jfree.chart.util.TableOrder tableOrder5 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.util.TableOrder tableOrder6 = multiplePiePlot1.getDataExtractOrder();
        multiplePiePlot1.setNoDataMessage("");
        java.lang.String str9 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(tableOrder5);
        org.junit.Assert.assertNull(tableOrder6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Multiple Pie Plot" + "'", str9, "Multiple Pie Plot");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        multiplePiePlot1.zoom((double) (short) 1);
        multiplePiePlot1.setForegroundAlpha((float) 15);
        multiplePiePlot1.setLimit((double) 10.0f);
        double double13 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
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
        java.lang.String str20 = multiplePiePlot19.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        multiplePiePlot19.markerChanged(markerChangeEvent21);
        java.awt.Paint paint23 = null;
        multiplePiePlot19.setBackgroundPaint(paint23);
        java.awt.Paint paint25 = multiplePiePlot19.getOutlinePaint();
        multiplePiePlot1.setNoDataMessagePaint(paint25);
        java.awt.Image image27 = multiplePiePlot1.getBackgroundImage();
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D28, rectangle2D29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNull(image27);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint6 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setBackgroundAlpha(10.0f);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0.5f);
        multiplePiePlot1.zoom(0.0d);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.lang.String str15 = multiplePiePlot14.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot14.addChangeListener(plotChangeListener16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = multiplePiePlot14.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = multiplePiePlot14.getInsets();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot14);
        java.awt.Paint paint21 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(drawingSupplier18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
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
        org.jfree.chart.util.TableOrder tableOrder30 = multiplePiePlot19.getDataExtractOrder();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(image23);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 1.0f + "'", float26 == 1.0f);
        org.junit.Assert.assertNull(tableOrder30);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        multiplePiePlot6.setDrawingSupplier(drawingSupplier7);
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot6.getParent();
        double double10 = multiplePiePlot6.getLimit();
        float float11 = multiplePiePlot6.getBackgroundAlpha();
        java.awt.Paint paint12 = multiplePiePlot6.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundPaint(paint12);
        multiplePiePlot1.setOutlineVisible(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(plot9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent16 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(tableOrder15);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        multiplePiePlot1.setOutlineVisible(true);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D7, rectangle2D8);
        multiplePiePlot1.setNoDataMessage("Other");
        float float12 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint13 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = multiplePiePlot1.getInsets();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent15 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(rectangleInsets14);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot16.setInsets(rectangleInsets27, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNotNull(plot19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(rectangleInsets25);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
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
        boolean boolean16 = multiplePiePlot1.equals((java.lang.Object) (byte) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent17 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent17);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D19, rectangle2D20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.util.TableOrder tableOrder4 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = null;
        multiplePiePlot6.setDrawingSupplier(drawingSupplier7);
        double double9 = multiplePiePlot6.getLimit();
        multiplePiePlot6.setLimit((double) (short) 1);
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot6.getPieChart();
        multiplePiePlot1.setPieChart(jFreeChart12);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent14 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent14);
        org.junit.Assert.assertNull(tableOrder4);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(jFreeChart12);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Font font11 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(drawingSupplier10);
        org.junit.Assert.assertNotNull(font11);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.lang.Object obj5 = multiplePiePlot1.clone();
        multiplePiePlot1.setOutlineVisible(false);
        java.lang.Class<?> wildcardClass8 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        multiplePiePlot0.setLimit(1.0d);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
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
        boolean boolean19 = multiplePiePlot4.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        org.jfree.data.category.CategoryDataset categoryDataset24 = multiplePiePlot1.getDataset();
        int int25 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        boolean boolean28 = multiplePiePlot27.isSubplot();
        multiplePiePlot27.setForegroundAlpha((float) 0L);
        java.awt.Paint paint31 = multiplePiePlot27.getNoDataMessagePaint();
        java.awt.Paint paint32 = multiplePiePlot27.getBackgroundPaint();
        multiplePiePlot27.setBackgroundAlpha(10.0f);
        java.awt.Stroke stroke35 = multiplePiePlot27.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(categoryDataset24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 15 + "'", int25 == 15);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(stroke35);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot5.drawOutline(graphics2D6, rectangle2D7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNull(plot5);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(legendItemCollection12);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent5);
        java.awt.Paint paint7 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent8);
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
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
        boolean boolean18 = multiplePiePlot1.isSubplot();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D19, rectangle2D20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(image17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
        java.awt.Paint paint18 = multiplePiePlot4.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.lang.String str21 = multiplePiePlot20.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        multiplePiePlot20.markerChanged(markerChangeEvent22);
        java.awt.Paint paint24 = null;
        multiplePiePlot20.setBackgroundPaint(paint24);
        multiplePiePlot20.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font28 = multiplePiePlot20.getNoDataMessageFont();
        java.awt.Paint paint29 = multiplePiePlot20.getAggregatedItemsPaint();
        multiplePiePlot4.setBackgroundPaint(paint29);
        java.lang.String str31 = multiplePiePlot4.getPlotType();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Multiple Pie Plot" + "'", str31, "Multiple Pie Plot");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = multiplePiePlot1.getInsets();
        multiplePiePlot1.setLimit((double) (short) 1);
        org.jfree.chart.util.TableOrder tableOrder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setDataExtractOrder(tableOrder9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNull(plot5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
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
        int int54 = multiplePiePlot1.getBackgroundImageAlignment();
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 15 + "'", int54 == 15);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        plot6.setBackgroundImageAlpha((float) 1);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier11);
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot10.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = plot13.getInsets();
        plot6.setInsets(rectangleInsets14);
        plot6.setForegroundAlpha((float) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNotNull(rectangleInsets14);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (short) 10, plotRenderingInfo8);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) "Multiple Pie Plot");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        java.awt.Paint paint10 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Paint paint11 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setBackgroundAlpha((float) 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(categoryDataset7);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D6, rectangle2D7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
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
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.5f + "'", float36 == 0.5f);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        org.jfree.chart.util.TableOrder tableOrder5 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.util.TableOrder tableOrder6 = multiplePiePlot1.getDataExtractOrder();
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D10, rectangle2D11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        boolean boolean15 = multiplePiePlot14.isSubplot();
        multiplePiePlot14.setForegroundAlpha((float) 0L);
        org.jfree.chart.util.TableOrder tableOrder18 = multiplePiePlot14.getDataExtractOrder();
        multiplePiePlot14.setLimit((double) (byte) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(tableOrder5);
        org.junit.Assert.assertNull(tableOrder6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(tableOrder18);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        org.jfree.chart.LegendItemCollection legendItemCollection14 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        boolean boolean18 = multiplePiePlot17.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        boolean boolean21 = multiplePiePlot20.isSubplot();
        multiplePiePlot20.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot17.setParent((org.jfree.chart.plot.Plot) multiplePiePlot20);
        java.awt.Stroke stroke25 = multiplePiePlot20.getOutlineStroke();
        multiplePiePlot20.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        multiplePiePlot20.setDataset(categoryDataset28);
        multiplePiePlot20.setForegroundAlpha((float) (byte) 0);
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot33 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset32);
        java.lang.String str34 = multiplePiePlot33.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent35 = null;
        multiplePiePlot33.markerChanged(markerChangeEvent35);
        java.awt.Paint paint37 = null;
        multiplePiePlot33.setBackgroundPaint(paint37);
        multiplePiePlot33.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font41 = multiplePiePlot33.getNoDataMessageFont();
        java.awt.Stroke stroke42 = multiplePiePlot33.getOutlineStroke();
        multiplePiePlot33.setBackgroundImageAlpha((float) (byte) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = multiplePiePlot33.getInsets();
        multiplePiePlot20.setInsets(rectangleInsets45, false);
        java.awt.Paint paint48 = multiplePiePlot20.getOutlinePaint();
        multiplePiePlot1.setBackgroundPaint(paint48);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertNull(drawingSupplier15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(font41);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(rectangleInsets45);
        org.junit.Assert.assertNotNull(paint48);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
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
        boolean boolean15 = multiplePiePlot1.isSubplot();
        boolean boolean16 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = multiplePiePlot28.getInsets();
        multiplePiePlot10.setInsets(rectangleInsets33);
        java.awt.Paint paint35 = multiplePiePlot10.getOutlinePaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent36 = null;
        multiplePiePlot10.datasetChanged(datasetChangeEvent36);
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
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Image image7 = multiplePiePlot1.getBackgroundImage();
        multiplePiePlot1.setOutlineVisible(false);
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
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNull(image7);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        java.lang.String str4 = multiplePiePlot1.getNoDataMessage();
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(image5);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
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
        // The following exception was thrown during execution in test generation
        try {
            plot20.zoom((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(tableOrder18);
        org.junit.Assert.assertNull(plot19);
        org.junit.Assert.assertNull(plot20);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        org.jfree.chart.LegendItemCollection legendItemCollection9 = multiplePiePlot1.getLegendItems();
        java.awt.Paint paint10 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(paint10);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent17);
        org.jfree.chart.JFreeChart jFreeChart19 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(jFreeChart15);
        org.junit.Assert.assertNotNull(jFreeChart19);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        multiplePiePlot7.notifyListeners(plotChangeEvent14);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent2);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 10);
        java.awt.Font font6 = multiplePiePlot1.getNoDataMessageFont();
        java.awt.Paint paint7 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        boolean boolean8 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        multiplePiePlot1.handleClick((int) '4', (int) (short) 10, plotRenderingInfo11);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        plot4.zoom(0.0d);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier11);
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot10.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot10.setInsets(rectangleInsets14);
        multiplePiePlot10.zoom((double) 1.0f);
        java.lang.String str18 = multiplePiePlot10.getNoDataMessage();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = multiplePiePlot10.getInsets();
        double double20 = multiplePiePlot10.getLimit();
        multiplePiePlot10.setAggregatedItemsKey((java.lang.Comparable) 0);
        plot4.setParent((org.jfree.chart.plot.Plot) multiplePiePlot10);
        boolean boolean24 = multiplePiePlot10.isOutlineVisible();
        org.jfree.chart.util.TableOrder tableOrder25 = multiplePiePlot10.getDataExtractOrder();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(tableOrder25);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        multiplePiePlot1.handleClick((int) (short) -1, (int) ' ', plotRenderingInfo20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(categoryDataset15);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
        java.awt.Paint paint6 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Image image7 = null;
        multiplePiePlot1.setBackgroundImage(image7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier11);
        boolean boolean14 = multiplePiePlot10.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot10.getRootPlot();
        plot15.setBackgroundImageAlpha((float) 1);
        java.awt.Stroke stroke18 = plot15.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke18);
        java.lang.Comparable comparable20 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.LegendItemCollection legendItemCollection21 = multiplePiePlot1.getLegendItems();
        java.lang.String str22 = multiplePiePlot1.getPlotType();
        org.jfree.chart.JFreeChart jFreeChart23 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + "Other" + "'", comparable20, "Other");
        org.junit.Assert.assertNotNull(legendItemCollection21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Multiple Pie Plot" + "'", str22, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(jFreeChart23);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
        java.awt.Paint paint10 = multiplePiePlot7.getOutlinePaint();
        multiplePiePlot1.setBackgroundPaint(paint10);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
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
        java.awt.Font font14 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNotNull(font14);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(legendItemCollection12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNull(tableOrder16);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick(1, (int) (byte) -1, plotRenderingInfo7);
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        java.awt.Paint paint12 = multiplePiePlot10.getBackgroundPaint();
        java.awt.Image image13 = multiplePiePlot10.getBackgroundImage();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot10.getParent();
        boolean boolean15 = multiplePiePlot10.isOutlineVisible();
        org.jfree.chart.util.TableOrder tableOrder16 = multiplePiePlot10.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = null;
        multiplePiePlot18.setDrawingSupplier(drawingSupplier19);
        float float21 = multiplePiePlot18.getBackgroundImageAlpha();
        java.awt.Paint paint22 = multiplePiePlot18.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        multiplePiePlot18.setDataset(categoryDataset23);
        boolean boolean25 = multiplePiePlot18.isSubplot();
        multiplePiePlot18.setBackgroundAlpha((float) ' ');
        boolean boolean28 = multiplePiePlot10.equals((java.lang.Object) multiplePiePlot18);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = multiplePiePlot10.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(image13);
        org.junit.Assert.assertNull(plot14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(tableOrder16);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(rectangleInsets29);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 10);
        org.jfree.data.general.DatasetGroup datasetGroup5 = multiplePiePlot1.getDatasetGroup();
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
        org.junit.Assert.assertNull(datasetGroup5);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 10);
        org.jfree.chart.JFreeChart jFreeChart4 = multiplePiePlot1.getPieChart();
        boolean boolean5 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertNotNull(jFreeChart4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
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
        java.awt.Paint paint12 = multiplePiePlot1.getOutlinePaint();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D13, rectangle2D14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
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
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + "Other" + "'", comparable12, "Other");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint6 = multiplePiePlot1.getBackgroundPaint();
        boolean boolean7 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.zoom((double) (byte) -1);
        multiplePiePlot1.setBackgroundAlpha((float) '4');
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.lang.String str15 = multiplePiePlot14.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        multiplePiePlot14.markerChanged(markerChangeEvent16);
        java.awt.Paint paint18 = null;
        multiplePiePlot14.setBackgroundPaint(paint18);
        multiplePiePlot14.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        org.jfree.chart.plot.Plot plot22 = multiplePiePlot14.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        java.lang.String str25 = multiplePiePlot24.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        multiplePiePlot24.markerChanged(markerChangeEvent26);
        java.awt.Paint paint28 = multiplePiePlot24.getAggregatedItemsPaint();
        java.lang.Comparable comparable29 = multiplePiePlot24.getAggregatedItemsKey();
        multiplePiePlot24.setBackgroundImageAlpha((float) 0);
        java.awt.Font font32 = multiplePiePlot24.getNoDataMessageFont();
        double double33 = multiplePiePlot24.getLimit();
        java.awt.Paint paint34 = multiplePiePlot24.getAggregatedItemsPaint();
        double double35 = multiplePiePlot24.getLimit();
        java.lang.String str36 = multiplePiePlot24.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        boolean boolean39 = multiplePiePlot38.isSubplot();
        java.awt.Paint paint40 = multiplePiePlot38.getBackgroundPaint();
        java.awt.Graphics2D graphics2D41 = null;
        java.awt.geom.Rectangle2D rectangle2D42 = null;
        multiplePiePlot38.drawBackgroundImage(graphics2D41, rectangle2D42);
        org.jfree.data.category.CategoryDataset categoryDataset44 = null;
        multiplePiePlot38.setDataset(categoryDataset44);
        java.awt.Paint paint46 = multiplePiePlot38.getNoDataMessagePaint();
        multiplePiePlot24.setAggregatedItemsPaint(paint46);
        multiplePiePlot14.setOutlinePaint(paint46);
        multiplePiePlot1.setOutlinePaint(paint46);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(plot22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertEquals("'" + comparable29 + "' != '" + "Other" + "'", comparable29, "Other");
        org.junit.Assert.assertNotNull(font32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Multiple Pie Plot" + "'", str36, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(paint46);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart5 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setForegroundAlpha(0.0f);
        java.awt.Stroke stroke8 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot1.getRootPlot();
        float float10 = plot9.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
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
        boolean boolean24 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.Plot plot25 = multiplePiePlot1.getParent();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(tableOrder22);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(plot25);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
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
        org.jfree.data.category.CategoryDataset categoryDataset11 = multiplePiePlot1.getDataset();
        multiplePiePlot1.setLimit((-1.0d));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNull(categoryDataset11);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        boolean boolean3 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint4 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 10);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent4);
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Multiple Pie Plot" + "'", str24, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.5f + "'", float26 == 0.5f);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(rectangleInsets43);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        boolean boolean20 = multiplePiePlot19.isSubplot();
        multiplePiePlot19.setForegroundAlpha((float) 0L);
        java.awt.Paint paint23 = multiplePiePlot19.getNoDataMessagePaint();
        java.awt.Paint paint24 = multiplePiePlot19.getBackgroundPaint();
        boolean boolean25 = multiplePiePlot19.isOutlineVisible();
        multiplePiePlot19.zoom((double) 0.0f);
        java.lang.Comparable comparable28 = multiplePiePlot19.getAggregatedItemsKey();
        java.awt.Paint paint29 = multiplePiePlot19.getBackgroundPaint();
        multiplePiePlot1.setOutlinePaint(paint29);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(image17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + comparable28 + "' != '" + "Other" + "'", comparable28, "Other");
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
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
        multiplePiePlot1.setBackgroundAlpha(15.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
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
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent24 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent24);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Multiple Pie Plot" + "'", str23, "Multiple Pie Plot");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.lang.String str4 = multiplePiePlot1.getPlotType();
        org.jfree.chart.JFreeChart jFreeChart5 = multiplePiePlot1.getPieChart();
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Multiple Pie Plot" + "'", str4, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        multiplePiePlot1.setLimit(0.0d);
        org.jfree.chart.LegendItemCollection legendItemCollection8 = multiplePiePlot1.getLegendItems();
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
        double double21 = multiplePiePlot10.getLimit();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = multiplePiePlot10.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets22, false);
        java.lang.Class<?> wildcardClass25 = rectangleInsets22.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(legendItemCollection8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + "Other" + "'", comparable15, "Other");
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
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
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(plot13);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        java.awt.Image image5 = null;
        multiplePiePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = multiplePiePlot1.getBackgroundPaint();
        java.lang.Class<?> wildcardClass8 = multiplePiePlot1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        multiplePiePlot1.setLimit(0.0d);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getParent();
        // The following exception was thrown during execution in test generation
        try {
            plot8.zoom((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(plot8);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
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
        // The following exception was thrown during execution in test generation
        try {
            float float26 = plot25.getBackgroundImageAlpha();
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
        org.junit.Assert.assertNull(plot25);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
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
        java.lang.Class<?> wildcardClass20 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
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
        java.lang.Class<?> wildcardClass13 = plot12.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        java.awt.Image image14 = null;
        plot12.setBackgroundImage(image14);
        plot12.setBackgroundAlpha((float) (-1L));
        plot12.setBackgroundImageAlignment((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot2 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset1);
        java.lang.String str3 = multiplePiePlot2.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        multiplePiePlot2.markerChanged(markerChangeEvent4);
        java.awt.Image image6 = multiplePiePlot2.getBackgroundImage();
        multiplePiePlot2.setLimit((double) '4');
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier11);
        java.awt.Paint paint13 = multiplePiePlot10.getOutlinePaint();
        multiplePiePlot10.setBackgroundAlpha((float) (-1));
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot17 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset16);
        java.lang.String str18 = multiplePiePlot17.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        multiplePiePlot17.addChangeListener(plotChangeListener19);
        multiplePiePlot17.setForegroundAlpha((float) (byte) 10);
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
        float float40 = multiplePiePlot24.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset41 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot42 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset41);
        multiplePiePlot42.setAggregatedItemsKey((java.lang.Comparable) 10);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent45 = null;
        multiplePiePlot42.markerChanged(markerChangeEvent45);
        multiplePiePlot42.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.awt.Image image49 = multiplePiePlot42.getBackgroundImage();
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
        multiplePiePlot42.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart60);
        multiplePiePlot24.setPieChart(jFreeChart60);
        multiplePiePlot17.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart60);
        multiplePiePlot10.setPieChart(jFreeChart60);
        multiplePiePlot2.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart60);
        multiplePiePlot0.setPieChart(jFreeChart60);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(drawingSupplier34);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 1.0f + "'", float40 == 1.0f);
        org.junit.Assert.assertNull(image49);
        org.junit.Assert.assertNull(plot54);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 0.5f + "'", float59 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart60);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
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
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint22 = plot21.getOutlinePaint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(drawingSupplier17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.5f + "'", float20 == 0.5f);
        org.junit.Assert.assertNull(plot21);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
        java.lang.Comparable comparable40 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(image24);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertEquals("'" + comparable40 + "' != '" + (-1) + "'", comparable40, (-1));
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        java.lang.Object obj9 = multiplePiePlot1.clone();
        boolean boolean10 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
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
        java.awt.Image image12 = multiplePiePlot1.getBackgroundImage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertNull(image12);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
        multiplePiePlot1.zoom((double) (short) 100);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        multiplePiePlot1.handleClick(0, 0, plotRenderingInfo17);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(datasetGroup12);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Image image6 = null;
        multiplePiePlot1.setBackgroundImage(image6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
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
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Multiple Pie Plot" + "'", str13, "Multiple Pie Plot");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        multiplePiePlot1.setLimit(0.0d);
        org.jfree.chart.LegendItemCollection legendItemCollection8 = multiplePiePlot1.getLegendItems();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        multiplePiePlot1.setDataset(categoryDataset9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(legendItemCollection8);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        multiplePiePlot1.handleClick((int) (short) 1, 1, plotRenderingInfo11);
        multiplePiePlot1.setBackgroundImageAlignment(15);
        java.awt.Paint paint15 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setNoDataMessagePaint(paint15);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = null;
        multiplePiePlot18.setDrawingSupplier(drawingSupplier19);
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot18.getRootPlot();
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot18.getPieChart();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot24 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset23);
        boolean boolean25 = multiplePiePlot24.isSubplot();
        multiplePiePlot24.setForegroundAlpha((float) 0L);
        org.jfree.data.category.CategoryDataset categoryDataset28 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot29 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset28);
        java.lang.String str30 = multiplePiePlot29.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener31 = null;
        multiplePiePlot29.addChangeListener(plotChangeListener31);
        java.awt.Image image33 = multiplePiePlot29.getBackgroundImage();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent34 = null;
        multiplePiePlot29.axisChanged(axisChangeEvent34);
        double double36 = multiplePiePlot29.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier39 = null;
        multiplePiePlot38.setDrawingSupplier(drawingSupplier39);
        java.awt.Paint paint41 = multiplePiePlot38.getOutlinePaint();
        multiplePiePlot29.setNoDataMessagePaint(paint41);
        multiplePiePlot24.setOutlinePaint(paint41);
        multiplePiePlot18.setAggregatedItemsPaint(paint41);
        multiplePiePlot1.setOutlinePaint(paint41);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(plot21);
        org.junit.Assert.assertNotNull(jFreeChart22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(image33);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(paint41);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
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
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 100);
        multiplePiePlot1.setBackgroundImageAlpha(0.0f);
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
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
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
        float float12 = multiplePiePlot7.getBackgroundImageAlpha();
        java.awt.Stroke stroke13 = multiplePiePlot7.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
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
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot14.setDrawingSupplier(drawingSupplier15);
        float float17 = multiplePiePlot14.getBackgroundImageAlpha();
        java.awt.Paint paint18 = multiplePiePlot14.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        multiplePiePlot14.setDataset(categoryDataset19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        java.lang.String str23 = multiplePiePlot22.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        multiplePiePlot22.markerChanged(markerChangeEvent24);
        java.awt.Paint paint26 = null;
        multiplePiePlot22.setBackgroundPaint(paint26);
        multiplePiePlot22.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font30 = multiplePiePlot22.getNoDataMessageFont();
        multiplePiePlot14.setNoDataMessageFont(font30);
        plot4.setNoDataMessageFont(font30);
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = plot4.getInsets();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier34 = plot4.getDrawingSupplier();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNull(drawingSupplier34);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1));
        org.jfree.data.category.CategoryDataset categoryDataset9 = multiplePiePlot1.getDataset();
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
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = multiplePiePlot22.getInsets();
        multiplePiePlot11.setInsets(rectangleInsets31, false);
        org.jfree.data.category.CategoryDataset categoryDataset34 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot35 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset34);
        boolean boolean36 = multiplePiePlot35.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset37 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot38 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset37);
        boolean boolean39 = multiplePiePlot38.isSubplot();
        multiplePiePlot38.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot35.setParent((org.jfree.chart.plot.Plot) multiplePiePlot38);
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = multiplePiePlot38.getInsets();
        org.jfree.chart.JFreeChart jFreeChart44 = multiplePiePlot38.getPieChart();
        multiplePiePlot11.setPieChart(jFreeChart44);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart44);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent47 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent47);
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertNull(categoryDataset9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + "Other" + "'", comparable16, "Other");
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(categoryDataset28);
        org.junit.Assert.assertNull(datasetGroup29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(rectangleInsets43);
        org.junit.Assert.assertNotNull(jFreeChart44);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
        // The following exception was thrown during execution in test generation
        try {
            plot13.setBackgroundImageAlignment((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNull(plot13);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        java.awt.Font font12 = multiplePiePlot1.getNoDataMessageFont();
        java.awt.Paint paint13 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.util.TableOrder tableOrder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setDataExtractOrder(tableOrder14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Paint paint4 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Image image7 = plot6.getBackgroundImage();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(image7);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Image image4 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = multiplePiePlot1.getInsets();
        java.awt.Font font7 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNull(plot5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(font7);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
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
        plot4.setBackgroundAlpha((float) 100L);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNull(drawingSupplier7);
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Image image3 = multiplePiePlot1.getBackgroundImage();
        java.lang.String str4 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        java.awt.Font font21 = multiplePiePlot4.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (short) 0 + "'", comparable17, (short) 0);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (short) 0 + "'", comparable20, (short) 0);
        org.junit.Assert.assertNotNull(font21);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
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
        org.jfree.chart.plot.Plot plot26 = multiplePiePlot1.getParent();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Multiple Pie Plot" + "'", str23, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Multiple Pie Plot" + "'", str25, "Multiple Pie Plot");
        org.junit.Assert.assertNull(plot26);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        java.awt.Paint paint7 = multiplePiePlot1.getOutlinePaint();
        float float8 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 1L);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier10);
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot9.getParent();
        boolean boolean13 = multiplePiePlot9.isSubplot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent14 = null;
        multiplePiePlot9.axisChanged(axisChangeEvent14);
        org.jfree.chart.util.TableOrder tableOrder16 = multiplePiePlot9.getDataExtractOrder();
        java.awt.Paint paint17 = multiplePiePlot9.getOutlinePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint17);
        java.lang.Comparable comparable19 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(plot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(tableOrder16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertEquals("'" + comparable19 + "' != '" + 1L + "'", comparable19, 1L);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
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
        java.awt.Font font17 = multiplePiePlot1.getNoDataMessageFont();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        java.awt.geom.Point2D point2D20 = null;
        org.jfree.chart.plot.PlotState plotState21 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D18, rectangle2D19, point2D20, plotState21, plotRenderingInfo22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(font17);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
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
        org.jfree.data.general.DatasetGroup datasetGroup27 = multiplePiePlot1.getDatasetGroup();
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
        org.junit.Assert.assertNull(datasetGroup27);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        multiplePiePlot1.setOutlineVisible(true);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D7, rectangle2D8);
        multiplePiePlot1.setNoDataMessage("Other");
        float float12 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot14.setDrawingSupplier(drawingSupplier15);
        org.jfree.chart.util.TableOrder tableOrder17 = multiplePiePlot14.getDataExtractOrder();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot19 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset18);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = null;
        multiplePiePlot19.setDrawingSupplier(drawingSupplier20);
        double double22 = multiplePiePlot19.getLimit();
        multiplePiePlot19.setLimit((double) (short) 1);
        org.jfree.chart.JFreeChart jFreeChart25 = multiplePiePlot19.getPieChart();
        multiplePiePlot14.setPieChart(jFreeChart25);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot14);
        java.lang.String str28 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        multiplePiePlot1.setDataset(categoryDataset29);
        float float31 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNull(tableOrder17);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(jFreeChart25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Other" + "'", str28, "Other");
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.5f + "'", float31 == 0.5f);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent8);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (byte) -1, (int) (short) 1, plotRenderingInfo7);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent9);
        org.jfree.chart.LegendItemCollection legendItemCollection11 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.JFreeChart jFreeChart12 = multiplePiePlot1.getPieChart();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertNotNull(jFreeChart12);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        multiplePiePlot1.handleClick((int) (short) 1, 1, plotRenderingInfo11);
        multiplePiePlot1.setBackgroundImageAlignment(15);
        java.awt.Paint paint15 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setNoDataMessagePaint(paint15);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        java.awt.geom.Point2D point2D19 = null;
        org.jfree.chart.plot.PlotState plotState20 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D17, rectangle2D18, point2D19, plotState20, plotRenderingInfo21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
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
        multiplePiePlot1.setBackgroundAlpha((float) (byte) -1);
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
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
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
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent15 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent15);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset7 = multiplePiePlot1.getDataset();
        java.awt.Font font8 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNotNull(font8);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
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
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 15.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Multiple Pie Plot" + "'", str23, "Multiple Pie Plot");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.util.TableOrder tableOrder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setDataExtractOrder(tableOrder11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertNotNull(plot10);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
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
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = multiplePiePlot10.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = multiplePiePlot10.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets22, false);
        org.jfree.chart.plot.Plot plot25 = multiplePiePlot1.getRootPlot();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Multiple Pie Plot" + "'", str19, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(plot25);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        multiplePiePlot1.setLimit((double) '4');
        java.lang.String str8 = multiplePiePlot1.getPlotType();
        double double9 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Multiple Pie Plot" + "'", str8, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
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
        java.awt.Paint paint12 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Stroke stroke13 = null;
        multiplePiePlot1.setOutlineStroke(stroke13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        multiplePiePlot1.setDataset(categoryDataset15);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        java.awt.Paint paint10 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        boolean boolean13 = multiplePiePlot12.isSubplot();
        java.awt.Paint paint14 = multiplePiePlot12.getBackgroundPaint();
        float float15 = multiplePiePlot12.getForegroundAlpha();
        java.awt.Image image16 = null;
        multiplePiePlot12.setBackgroundImage(image16);
        java.awt.Paint paint18 = multiplePiePlot12.getBackgroundPaint();
        multiplePiePlot1.setNoDataMessagePaint(paint18);
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot1.getParent();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(plot20);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + "Other" + "'", comparable15, "Other");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNull(categoryDataset19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(jFreeChart21);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
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
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha(100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(font18);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot4.getInsets();
        java.awt.Paint paint10 = multiplePiePlot4.getBackgroundPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent11);
        multiplePiePlot4.zoom((double) 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Image image3 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent5);
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        java.lang.String str9 = multiplePiePlot8.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        multiplePiePlot8.markerChanged(markerChangeEvent10);
        java.awt.Paint paint12 = multiplePiePlot8.getAggregatedItemsPaint();
        java.lang.Comparable comparable13 = multiplePiePlot8.getAggregatedItemsKey();
        multiplePiePlot8.setBackgroundImageAlpha((float) 0);
        java.awt.Font font16 = multiplePiePlot8.getNoDataMessageFont();
        double double17 = multiplePiePlot8.getLimit();
        java.awt.Font font18 = multiplePiePlot8.getNoDataMessageFont();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        multiplePiePlot8.setDataset(categoryDataset19);
        boolean boolean21 = multiplePiePlot1.equals((java.lang.Object) categoryDataset19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertEquals("'" + comparable13 + "' != '" + "Other" + "'", comparable13, "Other");
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        boolean boolean5 = multiplePiePlot1.isOutlineVisible();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D6, rectangle2D7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        org.jfree.data.category.CategoryDataset categoryDataset24 = multiplePiePlot1.getDataset();
        int int25 = multiplePiePlot1.getBackgroundImageAlignment();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(categoryDataset24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 15 + "'", int25 == 15);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
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
        double double15 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(tableOrder11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = multiplePiePlot4.getDrawingSupplier();
        java.lang.Class<?> wildcardClass20 = drawingSupplier19.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(drawingSupplier19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint6 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setBackgroundAlpha(10.0f);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0.5f);
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        multiplePiePlot1.removeChangeListener(plotChangeListener11);
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot1.getRootPlot();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(plot13);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        double double5 = multiplePiePlot1.getLimit();
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
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
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
        multiplePiePlot1.setBackgroundImageAlignment((int) '#');
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0f));
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
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = null;
        multiplePiePlot1.setBackgroundPaint(paint6);
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        multiplePiePlot9.setDrawingSupplier(drawingSupplier10);
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot9.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot9.setInsets(rectangleInsets13);
        multiplePiePlot9.zoom((double) 1.0f);
        org.jfree.chart.JFreeChart jFreeChart17 = multiplePiePlot9.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart17);
        multiplePiePlot1.setLimit((-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(jFreeChart17);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
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
        multiplePiePlot1.setDataset(categoryDataset15);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNull(tableOrder14);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        multiplePiePlot15.markerChanged(markerChangeEvent17);
        java.awt.Paint paint19 = null;
        multiplePiePlot15.setBackgroundPaint(paint19);
        org.jfree.data.category.CategoryDataset categoryDataset21 = multiplePiePlot15.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup22 = multiplePiePlot15.getDatasetGroup();
        java.awt.Paint paint23 = multiplePiePlot15.getOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = multiplePiePlot15.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets24, false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(categoryDataset21);
        org.junit.Assert.assertNull(datasetGroup22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleInsets24);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = multiplePiePlot1.getInsets();
        multiplePiePlot1.setForegroundAlpha((float) (byte) -1);
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
        org.junit.Assert.assertNotNull(rectangleInsets20);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
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
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha(15.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        plot6.setBackgroundImageAlpha((float) 1);
        java.awt.Stroke stroke9 = plot6.getOutlineStroke();
        plot6.setForegroundAlpha((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent7);
        java.lang.String str9 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        multiplePiePlot1.handleClick(0, (int) (byte) 1, plotRenderingInfo18);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(font15);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
        multiplePiePlot1.zoom((double) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(tableOrder13);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Stroke stroke4 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.plot.Plot plot5 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertNotNull(legendItemCollection6);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
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
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(plot21);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(plot26);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Image image4 = null;
        multiplePiePlot1.setBackgroundImage(image4);
        float float6 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
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
        multiplePiePlot4.zoom((double) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + (short) 0 + "'", comparable17, (short) 0);
        org.junit.Assert.assertEquals("'" + comparable20 + "' != '" + (short) 0 + "'", comparable20, (short) 0);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
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
        multiplePiePlot1.zoom((double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Multiple Pie Plot" + "'", str14, "Multiple Pie Plot");
        org.junit.Assert.assertNull(image15);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Paint paint4 = multiplePiePlot1.getOutlinePaint();
        multiplePiePlot1.zoom(100.0d);
        boolean boolean7 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        float float24 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(drawingSupplier19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        double double8 = multiplePiePlot1.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        multiplePiePlot1.setDataset(categoryDataset9);
        multiplePiePlot1.setForegroundAlpha(15.0f);
        java.lang.Object obj13 = multiplePiePlot1.clone();
        float float14 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        multiplePiePlot4.setDataset(categoryDataset20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        java.awt.Font font3 = multiplePiePlot1.getNoDataMessageFont();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        java.awt.geom.Point2D point2D6 = null;
        org.jfree.chart.plot.PlotState plotState7 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D4, rectangle2D5, point2D6, plotState7, plotRenderingInfo8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(font3);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets5);
        multiplePiePlot1.zoom((double) 1.0f);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1));
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        multiplePiePlot1.setLimit(0.0d);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = multiplePiePlot1.getInsets();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = multiplePiePlot1.getLegendItems();
        java.lang.Class<?> wildcardClass10 = legendItemCollection9.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        java.awt.Paint paint10 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        boolean boolean13 = multiplePiePlot12.isSubplot();
        java.awt.Paint paint14 = multiplePiePlot12.getBackgroundPaint();
        float float15 = multiplePiePlot12.getForegroundAlpha();
        java.awt.Image image16 = null;
        multiplePiePlot12.setBackgroundImage(image16);
        java.awt.Paint paint18 = multiplePiePlot12.getBackgroundPaint();
        multiplePiePlot1.setNoDataMessagePaint(paint18);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        boolean boolean5 = multiplePiePlot1.isOutlineVisible();
        java.lang.Object obj6 = multiplePiePlot1.clone();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 'a');
        double double9 = multiplePiePlot1.getLimit();
        java.lang.Object obj10 = multiplePiePlot1.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
        boolean boolean24 = multiplePiePlot10.isSubplot();
        boolean boolean25 = multiplePiePlot10.isSubplot();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        boolean boolean9 = multiplePiePlot1.isOutlineVisible();
        java.awt.Paint paint10 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.LegendItemCollection legendItemCollection12 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNotNull(legendItemCollection12);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
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
        org.jfree.data.general.DatasetGroup datasetGroup17 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(datasetGroup17);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint6 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setBackgroundAlpha(10.0f);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0.5f);
        java.awt.Paint paint11 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        boolean boolean14 = multiplePiePlot13.isSubplot();
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
        multiplePiePlot13.setOutlinePaint(paint24);
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        multiplePiePlot13.drawBackgroundImage(graphics2D26, rectangle2D27);
        org.jfree.chart.JFreeChart jFreeChart29 = multiplePiePlot13.getPieChart();
        multiplePiePlot1.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(categoryDataset22);
        org.junit.Assert.assertNull(datasetGroup23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(jFreeChart29);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Image image3 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = multiplePiePlot1.getDrawingSupplier();
        multiplePiePlot1.setBackgroundImageAlignment(97);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(drawingSupplier6);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
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
        org.jfree.chart.LegendItemCollection legendItemCollection14 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = multiplePiePlot1.getDrawingSupplier();
        multiplePiePlot1.setBackgroundAlpha((float) 0L);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertNull(drawingSupplier15);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        java.awt.Stroke stroke6 = multiplePiePlot1.getOutlineStroke();
        java.lang.Comparable comparable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setAggregatedItemsKey(comparable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
        boolean boolean26 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(drawingSupplier17);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1));
        float float9 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent10 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent10);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D12, rectangle2D13);
        java.awt.Paint paint15 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
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
        org.jfree.data.category.CategoryDataset categoryDataset11 = multiplePiePlot1.getDataset();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent12);
        org.jfree.chart.util.TableOrder tableOrder14 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setDataExtractOrder(tableOrder14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNull(categoryDataset11);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) false);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent10 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1));
        float float9 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent10);
        org.jfree.data.category.CategoryDataset categoryDataset12 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNull(categoryDataset12);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        multiplePiePlot1.setLimit(0.0d);
        double double8 = multiplePiePlot1.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        multiplePiePlot1.setDataset(categoryDataset9);
        multiplePiePlot1.setForegroundAlpha((float) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.zoom((double) (byte) -1);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        boolean boolean7 = multiplePiePlot6.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.lang.String str10 = multiplePiePlot9.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        multiplePiePlot9.markerChanged(markerChangeEvent11);
        java.awt.Paint paint13 = null;
        multiplePiePlot9.setBackgroundPaint(paint13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = multiplePiePlot9.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup16 = multiplePiePlot9.getDatasetGroup();
        java.awt.Paint paint17 = multiplePiePlot9.getOutlinePaint();
        multiplePiePlot6.setOutlinePaint(paint17);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        multiplePiePlot6.drawBackgroundImage(graphics2D19, rectangle2D20);
        org.jfree.chart.JFreeChart jFreeChart22 = multiplePiePlot6.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertNull(datasetGroup16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(jFreeChart22);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
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
        java.lang.String str18 = multiplePiePlot17.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        multiplePiePlot17.markerChanged(markerChangeEvent19);
        java.awt.Paint paint21 = multiplePiePlot17.getAggregatedItemsPaint();
        java.lang.Comparable comparable22 = multiplePiePlot17.getAggregatedItemsKey();
        multiplePiePlot17.setBackgroundImageAlpha((float) 0);
        java.awt.Font font25 = multiplePiePlot17.getNoDataMessageFont();
        double double26 = multiplePiePlot17.getLimit();
        java.awt.Paint paint27 = multiplePiePlot17.getAggregatedItemsPaint();
        multiplePiePlot1.setBackgroundPaint(paint27);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertEquals("'" + comparable22 + "' != '" + "Other" + "'", comparable22, "Other");
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
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
        plot9.setNoDataMessage("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(plot9);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        multiplePiePlot10.handleClick((int) '#', (int) (byte) 0, plotRenderingInfo24);
        org.jfree.chart.JFreeChart jFreeChart26 = multiplePiePlot10.getPieChart();
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart26);
        org.jfree.data.general.DatasetGroup datasetGroup28 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(drawingSupplier20);
        org.junit.Assert.assertNotNull(jFreeChart26);
        org.junit.Assert.assertNull(datasetGroup28);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
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
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent27 = null;
        plot12.datasetChanged(datasetChangeEvent27);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent29 = null;
        plot12.datasetChanged(datasetChangeEvent29);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNotNull(plot19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(rectangleInsets25);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        double double5 = multiplePiePlot1.getLimit();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot1.getInsets();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) true);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent10 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent10);
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets7);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
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
        multiplePiePlot1.setBackgroundImageAlignment((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(rectangleInsets24);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
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
        org.jfree.chart.JFreeChart jFreeChart28 = multiplePiePlot1.getPieChart();
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
        org.junit.Assert.assertNotNull(jFreeChart28);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        boolean boolean15 = multiplePiePlot14.isSubplot();
        boolean boolean16 = multiplePiePlot1.equals((java.lang.Object) boolean15);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        java.awt.geom.Point2D point2D8 = null;
        org.jfree.chart.plot.PlotState plotState9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D6, rectangle2D7, point2D8, plotState9, plotRenderingInfo10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
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
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 100);
        java.awt.Stroke stroke56 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent57 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent57);
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
        org.junit.Assert.assertNotNull(stroke56);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Paint paint4 = multiplePiePlot1.getOutlinePaint();
        multiplePiePlot1.setBackgroundAlpha((float) (-1));
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        java.awt.Paint paint8 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setOutlineVisible(true);
        java.awt.Paint paint11 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent28 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent28);
        org.jfree.chart.LegendItemCollection legendItemCollection30 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNotNull(plot23);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(legendItemCollection30);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        multiplePiePlot1.handleClick((int) (short) 1, 1, plotRenderingInfo11);
        multiplePiePlot1.setBackgroundImageAlignment(15);
        org.jfree.chart.LegendItemCollection legendItemCollection15 = multiplePiePlot1.getLegendItems();
        boolean boolean16 = multiplePiePlot1.isSubplot();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(legendItemCollection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
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
        multiplePiePlot1.setOutlineVisible(false);
        org.jfree.chart.LegendItemCollection legendItemCollection18 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent19);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(legendItemCollection18);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        boolean boolean8 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.zoom((double) 10);
        java.lang.Comparable comparable11 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        java.lang.String str13 = plot12.getNoDataMessage();
        plot12.zoom((-1.0d));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + "Other" + "'", comparable11, "Other");
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNotNull(legendItemCollection14);
        org.junit.Assert.assertNotNull(drawingSupplier15);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = null;
        multiplePiePlot18.setDrawingSupplier(drawingSupplier19);
        boolean boolean22 = multiplePiePlot18.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot23 = multiplePiePlot18.getRootPlot();
        plot23.setBackgroundImageAlpha((float) 1);
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot27 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset26);
        boolean boolean28 = multiplePiePlot27.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot30 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset29);
        boolean boolean31 = multiplePiePlot30.isSubplot();
        multiplePiePlot30.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot27.setParent((org.jfree.chart.plot.Plot) multiplePiePlot30);
        java.awt.Paint paint35 = multiplePiePlot30.getOutlinePaint();
        plot23.setOutlinePaint(paint35);
        multiplePiePlot1.setAggregatedItemsPaint(paint35);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(plot23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
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
        java.lang.Class<?> wildcardClass28 = multiplePiePlot1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint6 = multiplePiePlot1.getBackgroundPaint();
        multiplePiePlot1.setBackgroundAlpha(10.0f);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 0.5f);
        multiplePiePlot1.setNoDataMessage("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
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
        float float17 = multiplePiePlot1.getBackgroundAlpha();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D18, rectangle2D19);
        java.awt.Image image21 = null;
        multiplePiePlot1.setBackgroundImage(image21);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
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
        org.jfree.data.category.CategoryDataset categoryDataset16 = multiplePiePlot1.getDataset();
        java.awt.Paint paint17 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertNull(categoryDataset16);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot7 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset6);
        boolean boolean8 = multiplePiePlot7.isSubplot();
        multiplePiePlot7.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot4.setParent((org.jfree.chart.plot.Plot) multiplePiePlot7);
        java.awt.Stroke stroke12 = multiplePiePlot7.getOutlineStroke();
        multiplePiePlot7.setBackgroundAlpha(0.0f);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        multiplePiePlot7.setDataset(categoryDataset15);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        multiplePiePlot7.notifyListeners(plotChangeEvent17);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = multiplePiePlot7.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets19, true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(rectangleInsets19);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Paint paint2 = multiplePiePlot1.getOutlinePaint();
        boolean boolean3 = multiplePiePlot1.isSubplot();
        java.lang.String str4 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
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
        boolean boolean18 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        multiplePiePlot1.setDataset(categoryDataset19);
        org.jfree.chart.plot.Plot plot21 = multiplePiePlot1.getParent();
        org.jfree.data.category.CategoryDataset categoryDataset22 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(image17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(plot21);
        org.junit.Assert.assertNull(categoryDataset22);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
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
        org.jfree.chart.LegendItemCollection legendItemCollection23 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Multiple Pie Plot" + "'", str6, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(jFreeChart21);
        org.junit.Assert.assertNotNull(legendItemCollection23);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Image image3 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = multiplePiePlot1.getInsets();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = multiplePiePlot1.getDrawingSupplier();
        boolean boolean7 = multiplePiePlot1.isSubplot();
        boolean boolean8 = multiplePiePlot1.isOutlineVisible();
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(font9);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
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
        double double17 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(jFreeChart15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent5 = null;
        plot4.markerChanged(markerChangeEvent5);
        float float7 = plot4.getBackgroundImageAlpha();
        java.awt.Paint paint8 = plot4.getBackgroundPaint();
        plot4.setNoDataMessage("Multiple Pie Plot");
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
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
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        boolean boolean17 = multiplePiePlot16.isSubplot();
        java.awt.Paint paint18 = multiplePiePlot16.getBackgroundPaint();
        java.awt.Image image19 = multiplePiePlot16.getBackgroundImage();
        org.jfree.chart.plot.Plot plot20 = multiplePiePlot16.getParent();
        java.lang.Comparable comparable21 = multiplePiePlot16.getAggregatedItemsKey();
        java.awt.Paint paint22 = multiplePiePlot16.getOutlinePaint();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot16);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(tableOrder11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(image19);
        org.junit.Assert.assertNull(plot20);
        org.junit.Assert.assertEquals("'" + comparable21 + "' != '" + "Other" + "'", comparable21, "Other");
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.lang.String str4 = multiplePiePlot1.getPlotType();
        double double5 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Multiple Pie Plot" + "'", str4, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        java.awt.Image image7 = multiplePiePlot1.getBackgroundImage();
        multiplePiePlot1.setOutlineVisible(false);
        java.awt.Stroke stroke10 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.JFreeChart jFreeChart11 = multiplePiePlot1.getPieChart();
        java.lang.Class<?> wildcardClass12 = jFreeChart11.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint6 = multiplePiePlot1.getBackgroundPaint();
        java.lang.Object obj7 = null;
        boolean boolean8 = multiplePiePlot1.equals(obj7);
        multiplePiePlot1.setLimit((double) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
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
        java.awt.Image image21 = null;
        multiplePiePlot1.setBackgroundImage(image21);
        multiplePiePlot1.zoom(0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(drawingSupplier17);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        org.jfree.chart.util.TableOrder tableOrder5 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.util.TableOrder tableOrder6 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent7 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent7);
        multiplePiePlot1.setForegroundAlpha((float) (byte) 1);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = multiplePiePlot1.getInsets();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(tableOrder5);
        org.junit.Assert.assertNull(tableOrder6);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        multiplePiePlot1.zoom((double) 10L);
        org.jfree.data.general.DatasetGroup datasetGroup6 = multiplePiePlot1.getDatasetGroup();
        multiplePiePlot1.zoom((double) 10.0f);
        java.awt.Paint paint9 = multiplePiePlot1.getAggregatedItemsPaint();
        multiplePiePlot1.setNoDataMessage("Multiple Pie Plot");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent12);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot4.getInsets();
        java.awt.Paint paint10 = multiplePiePlot4.getBackgroundPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent11 = null;
        multiplePiePlot4.markerChanged(markerChangeEvent11);
        float float13 = multiplePiePlot4.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setLimit((double) (byte) 1);
        java.lang.Object obj7 = null;
        boolean boolean8 = multiplePiePlot1.equals(obj7);
        multiplePiePlot1.setBackgroundImageAlpha((float) 1L);
        org.jfree.chart.JFreeChart jFreeChart11 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setBackgroundImageAlignment((int) '#');
        boolean boolean14 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jFreeChart11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 10);
        java.lang.String str5 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Multiple Pie Plot" + "'", str5, "Multiple Pie Plot");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
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
        multiplePiePlot1.setBackgroundImageAlignment((int) '4');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(drawingSupplier17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Image image9 = multiplePiePlot1.getBackgroundImage();
        java.lang.String str10 = multiplePiePlot1.getPlotType();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent11 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent11);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D13, rectangle2D14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
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
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNotNull(jFreeChart16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(categoryDataset24);
        org.junit.Assert.assertNull(datasetGroup25);
        org.junit.Assert.assertNotNull(font32);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
        boolean boolean18 = multiplePiePlot1.isSubplot();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D19, rectangle2D20);
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D22, rectangle2D23);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(image17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
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
        multiplePiePlot1.setLimit(100.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Multiple Pie Plot" + "'", str17, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(rectangleInsets21);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D17, rectangle2D18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNotNull(drawingSupplier15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets5);
        multiplePiePlot1.zoom((double) 1.0f);
        org.jfree.chart.JFreeChart jFreeChart9 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setNoDataMessage("");
        org.jfree.data.general.DatasetGroup datasetGroup12 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset13 = multiplePiePlot1.getDataset();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        boolean boolean16 = multiplePiePlot15.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        multiplePiePlot18.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot15.setParent((org.jfree.chart.plot.Plot) multiplePiePlot18);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        multiplePiePlot15.handleClick((int) (short) -1, (-1), plotRenderingInfo25);
        org.jfree.chart.plot.Plot plot27 = multiplePiePlot15.getRootPlot();
        org.jfree.data.general.DatasetGroup datasetGroup28 = multiplePiePlot15.getDatasetGroup();
        float float29 = multiplePiePlot15.getForegroundAlpha();
        java.awt.Paint paint30 = multiplePiePlot15.getAggregatedItemsPaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint30);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertNull(datasetGroup12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(plot27);
        org.junit.Assert.assertNull(datasetGroup28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 1.0f + "'", float29 == 1.0f);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        java.lang.String str9 = multiplePiePlot1.getPlotType();
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot11 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset10);
        boolean boolean12 = multiplePiePlot11.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = null;
        multiplePiePlot14.setDrawingSupplier(drawingSupplier15);
        boolean boolean18 = multiplePiePlot14.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot19 = multiplePiePlot14.getRootPlot();
        plot19.setBackgroundImageAlpha((float) 1);
        java.awt.Stroke stroke22 = plot19.getOutlineStroke();
        java.awt.Stroke stroke23 = plot19.getOutlineStroke();
        multiplePiePlot11.setOutlineStroke(stroke23);
        multiplePiePlot1.setOutlineStroke(stroke23);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Multiple Pie Plot" + "'", str9, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(plot19);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
        org.jfree.data.general.DatasetGroup datasetGroup12 = multiplePiePlot1.getDatasetGroup();
        org.jfree.chart.plot.Plot plot13 = multiplePiePlot1.getParent();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertNull(datasetGroup12);
        org.junit.Assert.assertNull(plot13);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent26 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent26);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Multiple Pie Plot" + "'", str23, "Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Multiple Pie Plot" + "'", str25, "Multiple Pie Plot");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
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
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        boolean boolean14 = multiplePiePlot13.isSubplot();
        java.awt.Image image15 = multiplePiePlot13.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection16 = multiplePiePlot13.getLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = multiplePiePlot13.getInsets();
        plot4.setInsets(rectangleInsets17, false);
        boolean boolean20 = plot4.isSubplot();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(image15);
        org.junit.Assert.assertNotNull(legendItemCollection16);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        float float3 = multiplePiePlot1.getForegroundAlpha();
        int int4 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Stroke stroke5 = multiplePiePlot1.getOutlineStroke();
        java.awt.Paint paint6 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D7, rectangle2D8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
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
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D20, rectangle2D21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
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
        java.lang.String str21 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(tableOrder20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Multiple Pie Plot" + "'", str21, "Multiple Pie Plot");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        org.jfree.chart.util.TableOrder tableOrder8 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.util.TableOrder tableOrder9 = multiplePiePlot1.getDataExtractOrder();
        double double10 = multiplePiePlot1.getLimit();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent11);
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(tableOrder8);
        org.junit.Assert.assertNull(tableOrder9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        org.jfree.chart.util.TableOrder tableOrder8 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent9);
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(tableOrder8);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        boolean boolean7 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint8 = multiplePiePlot1.getOutlinePaint();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        java.awt.geom.Point2D point2D11 = null;
        org.jfree.chart.plot.PlotState plotState12 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D9, rectangle2D10, point2D11, plotState12, plotRenderingInfo13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = multiplePiePlot1.getDrawingSupplier();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(tableOrder11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(drawingSupplier13);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
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
        multiplePiePlot4.setLimit((double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
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
        boolean boolean21 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(tableOrder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        boolean boolean5 = multiplePiePlot1.isOutlineVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = multiplePiePlot1.getInsets();
        org.jfree.data.general.DatasetGroup datasetGroup7 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(datasetGroup7);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
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
        float float12 = multiplePiePlot1.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
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
        int int25 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Image image26 = null;
        multiplePiePlot1.setBackgroundImage(image26);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 15 + "'", int25 == 15);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        java.awt.Image image5 = null;
        multiplePiePlot1.setBackgroundImage(image5);
        java.awt.Paint paint7 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot9 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset8);
        java.lang.String str10 = multiplePiePlot9.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        multiplePiePlot9.addChangeListener(plotChangeListener11);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = multiplePiePlot9.getDrawingSupplier();
        java.awt.Paint paint14 = multiplePiePlot9.getNoDataMessagePaint();
        java.awt.Image image15 = null;
        multiplePiePlot9.setBackgroundImage(image15);
        multiplePiePlot9.setNoDataMessage("hi!");
        org.jfree.chart.LegendItemCollection legendItemCollection19 = multiplePiePlot9.getLegendItems();
        boolean boolean20 = multiplePiePlot1.equals((java.lang.Object) multiplePiePlot9);
        java.awt.Paint paint21 = multiplePiePlot1.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(drawingSupplier13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(legendItemCollection19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
        java.awt.Stroke stroke16 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = multiplePiePlot1.getDrawingSupplier();
        java.lang.Object obj18 = multiplePiePlot1.clone();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(drawingSupplier17);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        plot13.zoom(0.0d);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = plot13.getDrawingSupplier();
        plot13.setNoDataMessage("Multiple Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNotNull(drawingSupplier16);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
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
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent30 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent30);
        multiplePiePlot1.setBackgroundImageAlignment((int) ' ');
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
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setOutlineVisible(false);
        double double5 = multiplePiePlot1.getLimit();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot6 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset5);
        boolean boolean7 = multiplePiePlot6.isSubplot();
        boolean boolean8 = multiplePiePlot6.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        java.awt.Paint paint12 = multiplePiePlot10.getBackgroundPaint();
        java.awt.Paint paint13 = multiplePiePlot10.getNoDataMessagePaint();
        multiplePiePlot6.setOutlinePaint(paint13);
        multiplePiePlot1.setBackgroundPaint(paint13);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        double double5 = multiplePiePlot1.getLimit();
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        double double8 = multiplePiePlot1.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        multiplePiePlot1.setDataset(categoryDataset9);
        float float11 = multiplePiePlot1.getForegroundAlpha();
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent7);
        java.awt.Image image9 = null;
        multiplePiePlot1.setBackgroundImage(image9);
        java.awt.Paint paint11 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setLimit((double) 1L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        multiplePiePlot1.setLimit(0.0d);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = multiplePiePlot1.getInsets();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = multiplePiePlot1.getDrawingSupplier();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(drawingSupplier10);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
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
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D21, rectangle2D22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(drawingSupplier17);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        boolean boolean31 = plot30.isOutlineVisible();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
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
        org.jfree.chart.plot.Plot plot23 = multiplePiePlot20.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        plot23.markerChanged(markerChangeEvent24);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = plot23.getDrawingSupplier();
        java.awt.Paint paint27 = plot23.getNoDataMessagePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint27);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
        org.junit.Assert.assertNotNull(plot23);
        org.junit.Assert.assertNull(drawingSupplier26);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot0 = new org.jfree.chart.plot.MultiplePiePlot();
        java.awt.Paint paint1 = multiplePiePlot0.getOutlinePaint();
        multiplePiePlot0.zoom((double) 1L);
        multiplePiePlot0.setOutlineVisible(true);
        org.junit.Assert.assertNotNull(paint1);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        plot6.handleClick((int) (short) 100, (int) (byte) -1, plotRenderingInfo9);
        java.awt.Paint paint11 = plot6.getBackgroundPaint();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
        multiplePiePlot1.setLimit((double) 1);
        float float19 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint20 = multiplePiePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.5f + "'", float19 == 0.5f);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
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
        java.awt.Image image13 = null;
        multiplePiePlot1.setBackgroundImage(image13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot4.getInsets();
        java.awt.Paint paint10 = multiplePiePlot4.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        multiplePiePlot4.setDataset(categoryDataset11);
        org.jfree.data.general.DatasetGroup datasetGroup13 = multiplePiePlot4.getDatasetGroup();
        org.jfree.chart.plot.Plot plot14 = multiplePiePlot4.getRootPlot();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(datasetGroup13);
        org.junit.Assert.assertNotNull(plot14);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent15 = null;
        plot14.axisChanged(axisChangeEvent15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(plot14);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.lang.String str7 = multiplePiePlot1.getPlotType();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Multiple Pie Plot" + "'", str7, "Multiple Pie Plot");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
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
        java.awt.Paint paint17 = multiplePiePlot1.getOutlinePaint();
        int int18 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Paint paint4 = multiplePiePlot1.getAggregatedItemsPaint();
        float float5 = multiplePiePlot1.getBackgroundImageAlpha();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        java.awt.Paint paint8 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint9 = multiplePiePlot1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
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
        multiplePiePlot1.setLimit((double) (-1.0f));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Multiple Pie Plot" + "'", str12, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        multiplePiePlot1.zoom((double) 10L);
        java.awt.Shape shape6 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        boolean boolean7 = multiplePiePlot1.equals((java.lang.Object) shape6);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getParent();
        java.awt.Paint paint9 = multiplePiePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = multiplePiePlot1.getAggregatedItemsPaint();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setBackgroundImageAlpha((float) 0);
        boolean boolean9 = multiplePiePlot1.isOutlineVisible();
        java.awt.Paint paint10 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.util.TableOrder tableOrder12 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setDataExtractOrder(tableOrder12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(drawingSupplier11);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = multiplePiePlot1.getInsets();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(rectangleInsets17);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
        multiplePiePlot1.setBackgroundImageAlignment((int) '#');
        org.jfree.chart.util.TableOrder tableOrder15 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setDataExtractOrder(tableOrder15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(image10);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
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
        multiplePiePlot1.setOutlineVisible(true);
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot20 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset19);
        java.lang.String str21 = multiplePiePlot20.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent22 = null;
        multiplePiePlot20.markerChanged(markerChangeEvent22);
        java.awt.Paint paint24 = multiplePiePlot20.getAggregatedItemsPaint();
        java.lang.Comparable comparable25 = multiplePiePlot20.getAggregatedItemsKey();
        multiplePiePlot20.setBackgroundImageAlpha((float) 0);
        java.awt.Font font28 = multiplePiePlot20.getNoDataMessageFont();
        double double29 = multiplePiePlot20.getLimit();
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
        multiplePiePlot20.setInsets(rectangleInsets40, false);
        multiplePiePlot1.setInsets(rectangleInsets40);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertEquals("'" + comparable25 + "' != '" + "Other" + "'", comparable25, "Other");
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(categoryDataset37);
        org.junit.Assert.assertNull(datasetGroup38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(rectangleInsets40);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
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
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setBackgroundImageAlpha((float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNull(datasetGroup9);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNotNull(jFreeChart17);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
        java.awt.Paint paint18 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
        java.lang.Comparable comparable17 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertEquals("'" + comparable17 + "' != '" + "Other" + "'", comparable17, "Other");
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
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
        boolean boolean33 = multiplePiePlot29.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot34 = multiplePiePlot29.getRootPlot();
        org.jfree.data.category.CategoryDataset categoryDataset35 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot36 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset35);
        java.lang.String str37 = multiplePiePlot36.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener38 = null;
        multiplePiePlot36.addChangeListener(plotChangeListener38);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier40 = multiplePiePlot36.getDrawingSupplier();
        java.awt.Paint paint41 = multiplePiePlot36.getNoDataMessagePaint();
        multiplePiePlot29.setBackgroundPaint(paint41);
        multiplePiePlot1.setBackgroundPaint(paint41);
        org.jfree.chart.plot.Plot plot44 = multiplePiePlot1.getRootPlot();
        java.awt.Graphics2D graphics2D45 = null;
        java.awt.geom.Rectangle2D rectangle2D46 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D45, rectangle2D46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(plot34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(drawingSupplier40);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(plot44);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
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
        org.jfree.chart.util.TableOrder tableOrder20 = multiplePiePlot4.getDataExtractOrder();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(tableOrder20);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        org.jfree.chart.util.TableOrder tableOrder5 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.util.TableOrder tableOrder6 = multiplePiePlot1.getDataExtractOrder();
        multiplePiePlot1.setNoDataMessage("");
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
        java.awt.Paint paint22 = multiplePiePlot10.getNoDataMessagePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(tableOrder5);
        org.junit.Assert.assertNull(tableOrder6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        multiplePiePlot1.setDataset(categoryDataset23);
        org.jfree.chart.LegendItemCollection legendItemCollection25 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNull(plot15);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.5f + "'", float20 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart21);
        org.junit.Assert.assertNotNull(legendItemCollection25);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
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
        multiplePiePlot4.setOutlineVisible(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        float float5 = multiplePiePlot1.getBackgroundAlpha();
        multiplePiePlot1.setBackgroundImageAlpha((float) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent29 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent29);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertEquals("'" + comparable15 + "' != '" + "Other" + "'", comparable15, "Other");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.5f + "'", float20 == 0.5f);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 1.0f + "'", float26 == 1.0f);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        multiplePiePlot1.zoom((double) 10L);
        java.awt.Shape shape6 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        boolean boolean7 = multiplePiePlot1.equals((java.lang.Object) shape6);
        int int8 = multiplePiePlot1.getBackgroundImageAlignment();
        java.lang.Comparable comparable9 = multiplePiePlot1.getAggregatedItemsKey();
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertEquals("'" + comparable9 + "' != '" + "Other" + "'", comparable9, "Other");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint6 = multiplePiePlot1.getBackgroundPaint();
        boolean boolean7 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.zoom((double) (byte) -1);
        multiplePiePlot1.setBackgroundAlpha((float) '4');
        org.jfree.chart.plot.Plot plot12 = multiplePiePlot1.getRootPlot();
        java.awt.Image image13 = null;
        plot12.setBackgroundImage(image13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(plot12);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
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
        java.awt.Image image25 = null;
        multiplePiePlot1.setBackgroundImage(image25);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Multiple Pie Plot" + "'", str12, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Multiple Pie Plot" + "'", str22, "Multiple Pie Plot");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        java.lang.String str12 = multiplePiePlot1.getNoDataMessage();
        float float13 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNull(datasetGroup11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
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
        org.jfree.chart.util.TableOrder tableOrder15 = multiplePiePlot1.getDataExtractOrder();
        java.awt.Image image16 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = multiplePiePlot1.getDrawingSupplier();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNull(tableOrder15);
        org.junit.Assert.assertNull(image16);
        org.junit.Assert.assertNotNull(drawingSupplier17);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        double double5 = multiplePiePlot1.getLimit();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot1.getInsets();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) true);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets7);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Image image4 = null;
        multiplePiePlot1.setBackgroundImage(image4);
        java.awt.Image image6 = multiplePiePlot1.getBackgroundImage();
        float float7 = multiplePiePlot1.getBackgroundImageAlpha();
        float float8 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Image image4 = null;
        multiplePiePlot1.setBackgroundImage(image4);
        java.awt.Image image6 = multiplePiePlot1.getBackgroundImage();
        boolean boolean7 = multiplePiePlot1.isOutlineVisible();
        java.awt.Stroke stroke8 = multiplePiePlot1.getOutlineStroke();
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        boolean boolean5 = multiplePiePlot1.isSubplot();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        java.awt.geom.Point2D point2D8 = null;
        org.jfree.chart.plot.PlotState plotState9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.draw(graphics2D6, rectangle2D7, point2D8, plotState9, plotRenderingInfo10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
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
        boolean boolean15 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(tableOrder11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot17);
        double double35 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNull(datasetGroup11);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(rectangleInsets29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(tableOrder31);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
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
        plot4.setBackgroundAlpha((float) 10L);
        boolean boolean15 = plot4.isSubplot();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(legendItemCollection12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
        float float20 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent21 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNull(datasetGroup19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        double double4 = multiplePiePlot1.getLimit();
        multiplePiePlot1.setLimit((double) (short) 1);
        org.jfree.chart.JFreeChart jFreeChart7 = multiplePiePlot1.getPieChart();
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
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent2);
        java.awt.Stroke stroke4 = multiplePiePlot1.getOutlineStroke();
        boolean boolean5 = multiplePiePlot1.isSubplot();
        boolean boolean6 = multiplePiePlot1.isOutlineVisible();
        java.lang.String str7 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Multiple Pie Plot" + "'", str7, "Multiple Pie Plot");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
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
        boolean boolean18 = multiplePiePlot1.isSubplot();
        java.lang.String str19 = multiplePiePlot1.getPlotType();
        org.jfree.chart.util.TableOrder tableOrder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setDataExtractOrder(tableOrder20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(image17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Multiple Pie Plot" + "'", str19, "Multiple Pie Plot");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        double double5 = multiplePiePlot1.getLimit();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = multiplePiePlot1.getInsets();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) true);
        org.jfree.chart.plot.Plot plot10 = multiplePiePlot1.getParent();
        org.jfree.chart.util.TableOrder tableOrder11 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        multiplePiePlot1.handleClick((int) (short) 10, (int) (short) 0, plotRenderingInfo14);
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNull(plot10);
        org.junit.Assert.assertNull(tableOrder11);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Image image3 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent5);
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        boolean boolean8 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets5);
        float float7 = multiplePiePlot1.getForegroundAlpha();
        multiplePiePlot1.setBackgroundAlpha(0.0f);
        boolean boolean10 = multiplePiePlot1.isOutlineVisible();
        float float11 = multiplePiePlot1.getBackgroundAlpha();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot1.getDrawingSupplier();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertNull(drawingSupplier12);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = multiplePiePlot1.getInsets();
        java.lang.Class<?> wildcardClass7 = multiplePiePlot1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
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
        boolean boolean12 = multiplePiePlot4.isOutlineVisible();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot4.setBackgroundImageAlignment((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        multiplePiePlot1.handleClick(0, (int) (byte) 100, plotRenderingInfo23);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertNotNull(font19);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D4, rectangle2D5);
        multiplePiePlot1.zoom((double) '#');
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D9, rectangle2D10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
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
        java.awt.Stroke stroke27 = multiplePiePlot1.getOutlineStroke();
        boolean boolean28 = multiplePiePlot1.isSubplot();
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
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
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
        java.awt.Font font32 = plot30.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(jFreeChart5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(image16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(plot30);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(font32);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
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
        multiplePiePlot1.setForegroundAlpha(0.5f);
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNull(tableOrder8);
        org.junit.Assert.assertNull(tableOrder9);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.util.TableOrder tableOrder4 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
        org.junit.Assert.assertNull(tableOrder4);
        org.junit.Assert.assertNull(drawingSupplier5);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        multiplePiePlot1.zoom(1.0d);
        multiplePiePlot1.setLimit((double) 100L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
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
        boolean boolean13 = plot12.isSubplot();
        java.lang.Class<?> wildcardClass14 = plot12.getClass();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
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
        org.jfree.chart.util.TableOrder tableOrder16 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(tableOrder11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertNull(tableOrder16);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
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
        plot6.setNoDataMessage("Multiple Pie Plot");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        multiplePiePlot1.handleClick((int) (short) 1, (int) (byte) 100, plotRenderingInfo7);
        org.jfree.chart.plot.Plot plot9 = multiplePiePlot1.getRootPlot();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(plot9);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
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
        java.awt.Paint paint23 = multiplePiePlot13.getAggregatedItemsPaint();
        java.awt.Font font24 = multiplePiePlot13.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font24);
        org.jfree.chart.LegendItemCollection legendItemCollection26 = multiplePiePlot1.getLegendItems();
        java.awt.Paint paint27 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setBackgroundImageAlignment(0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertEquals("'" + comparable18 + "' != '" + "Other" + "'", comparable18, "Other");
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(legendItemCollection26);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
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
        org.jfree.data.category.CategoryDataset categoryDataset24 = multiplePiePlot1.getDataset();
        int int25 = multiplePiePlot1.getBackgroundImageAlignment();
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawOutline(graphics2D26, rectangle2D27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(categoryDataset24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 15 + "'", int25 == 15);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        multiplePiePlot1.handleClick(1, (int) (short) 1, plotRenderingInfo14);
        java.lang.String str16 = multiplePiePlot1.getPlotType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Multiple Pie Plot" + "'", str16, "Multiple Pie Plot");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        java.lang.Object obj12 = multiplePiePlot1.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(datasetGroup11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
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
        java.awt.Image image12 = null;
        multiplePiePlot1.setBackgroundImage(image12);
        int int14 = multiplePiePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        boolean boolean8 = multiplePiePlot1.isOutlineVisible();
        multiplePiePlot1.zoom((double) 10);
        java.lang.Comparable comparable11 = multiplePiePlot1.getAggregatedItemsKey();
        multiplePiePlot1.setNoDataMessage("Other");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + comparable11 + "' != '" + "Other" + "'", comparable11, "Other");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
        multiplePiePlot4.setNoDataMessage("Multiple Pie Plot");
        multiplePiePlot4.setBackgroundImageAlpha(0.0f);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(font9);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Paint paint5 = null;
        multiplePiePlot1.setBackgroundPaint(paint5);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Font font9 = multiplePiePlot1.getNoDataMessageFont();
        java.awt.Paint paint10 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent11 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent11);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        boolean boolean15 = multiplePiePlot14.isSubplot();
        multiplePiePlot14.setForegroundAlpha((float) 0L);
        java.awt.Paint paint18 = multiplePiePlot14.getNoDataMessagePaint();
        java.awt.Paint paint19 = multiplePiePlot14.getBackgroundPaint();
        multiplePiePlot14.setBackgroundAlpha(10.0f);
        multiplePiePlot14.setAggregatedItemsKey((java.lang.Comparable) 0.5f);
        java.awt.Font font24 = multiplePiePlot14.getNoDataMessageFont();
        multiplePiePlot1.setNoDataMessageFont(font24);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(font24);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        float float4 = multiplePiePlot1.getForegroundAlpha();
        float float5 = multiplePiePlot1.getForegroundAlpha();
        java.lang.Object obj6 = multiplePiePlot1.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = multiplePiePlot1.getDrawingSupplier();
        java.lang.Comparable comparable12 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.chart.util.TableOrder tableOrder13 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setDataExtractOrder(tableOrder13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertEquals("'" + comparable12 + "' != '" + "Other" + "'", comparable12, "Other");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
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
        java.awt.Paint paint12 = multiplePiePlot1.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(tableOrder5);
        org.junit.Assert.assertNull(tableOrder6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        multiplePiePlot1.zoom((double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = multiplePiePlot1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent2 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent2);
        multiplePiePlot1.setBackgroundImageAlignment((int) (short) 10);
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot4 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset3);
        boolean boolean5 = multiplePiePlot4.isSubplot();
        multiplePiePlot4.setAggregatedItemsKey((java.lang.Comparable) (short) 0);
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot4);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = multiplePiePlot4.getInsets();
        java.awt.Font font10 = multiplePiePlot4.getNoDataMessageFont();
        java.awt.Font font11 = multiplePiePlot4.getNoDataMessageFont();
        java.lang.Object obj12 = null;
        boolean boolean13 = multiplePiePlot4.equals(obj12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        float float6 = multiplePiePlot1.getBackgroundAlpha();
        multiplePiePlot1.setBackgroundAlpha((float) 1L);
        boolean boolean9 = multiplePiePlot1.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
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
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.drawBackground(graphics2D31, rectangle2D32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertNull(datasetGroup21);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(plot26);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        java.awt.Paint paint4 = multiplePiePlot1.getOutlinePaint();
        multiplePiePlot1.setBackgroundAlpha((float) (-1));
        java.lang.String str7 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.LegendItemCollection legendItemCollection8 = multiplePiePlot1.getLegendItems();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(legendItemCollection8);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
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
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        java.awt.Image image16 = null;
        multiplePiePlot15.setBackgroundImage(image16);
        multiplePiePlot15.zoom((double) 10L);
        org.jfree.data.general.DatasetGroup datasetGroup20 = multiplePiePlot15.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot22 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset21);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = null;
        multiplePiePlot22.setDrawingSupplier(drawingSupplier23);
        float float25 = multiplePiePlot22.getBackgroundImageAlpha();
        java.awt.Paint paint26 = multiplePiePlot22.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        multiplePiePlot22.setDataset(categoryDataset27);
        org.jfree.chart.plot.Plot plot29 = multiplePiePlot22.getRootPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = null;
        multiplePiePlot22.handleClick((int) (short) 1, 1, plotRenderingInfo32);
        multiplePiePlot22.setBackgroundImageAlignment(15);
        java.awt.Paint paint36 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot22.setNoDataMessagePaint(paint36);
        multiplePiePlot15.setBackgroundPaint(paint36);
        multiplePiePlot1.setNoDataMessagePaint(paint36);
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        multiplePiePlot1.setDataset(categoryDataset40);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNull(plot13);
        org.junit.Assert.assertNull(datasetGroup20);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.5f + "'", float25 == 0.5f);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(plot29);
        org.junit.Assert.assertNotNull(paint36);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
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
        org.jfree.data.general.DatasetGroup datasetGroup13 = multiplePiePlot1.getDatasetGroup();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        multiplePiePlot1.setDataset(categoryDataset14);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Multiple Pie Plot" + "'", str10, "Multiple Pie Plot");
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(datasetGroup13);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        multiplePiePlot1.setOutlineVisible(true);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D7, rectangle2D8);
        multiplePiePlot1.setNoDataMessage("Other");
        float float12 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint13 = multiplePiePlot1.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot15 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset14);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = null;
        multiplePiePlot15.setDrawingSupplier(drawingSupplier16);
        java.awt.Image image18 = null;
        multiplePiePlot15.setBackgroundImage(image18);
        java.awt.Paint paint20 = multiplePiePlot15.getAggregatedItemsPaint();
        multiplePiePlot1.setBackgroundPaint(paint20);
        java.lang.Class<?> wildcardClass22 = multiplePiePlot1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
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
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(image16);
        org.junit.Assert.assertNotNull(legendItemCollection17);
        org.junit.Assert.assertNotNull(drawingSupplier18);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        java.awt.Paint paint7 = plot6.getOutlinePaint();
        java.awt.Paint paint8 = plot6.getBackgroundPaint();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
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
        java.awt.Image image28 = null;
        multiplePiePlot1.setBackgroundImage(image28);
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
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
        multiplePiePlot1.setForegroundAlpha((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(tableOrder9);
        org.junit.Assert.assertNull(plot14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + comparable16 + "' != '" + "Other" + "'", comparable16, "Other");
        org.junit.Assert.assertNotNull(rectangleInsets17);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = null;
        multiplePiePlot10.setDrawingSupplier(drawingSupplier11);
        float float13 = multiplePiePlot10.getBackgroundImageAlpha();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        multiplePiePlot10.handleClick((int) (byte) -1, (int) (short) 1, plotRenderingInfo16);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent18 = null;
        multiplePiePlot10.notifyListeners(plotChangeEvent18);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot21 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset20);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier22 = null;
        multiplePiePlot21.setDrawingSupplier(drawingSupplier22);
        org.jfree.chart.plot.Plot plot24 = multiplePiePlot21.getParent();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent25 = null;
        multiplePiePlot21.datasetChanged(datasetChangeEvent25);
        multiplePiePlot21.setAggregatedItemsKey((java.lang.Comparable) (-1));
        float float29 = multiplePiePlot21.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart30 = multiplePiePlot21.getPieChart();
        multiplePiePlot10.setPieChart(jFreeChart30);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart30);
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot34 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset33);
        java.lang.String str35 = multiplePiePlot34.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent36 = null;
        multiplePiePlot34.markerChanged(markerChangeEvent36);
        java.awt.Paint paint38 = multiplePiePlot34.getAggregatedItemsPaint();
        java.lang.Comparable comparable39 = multiplePiePlot34.getAggregatedItemsKey();
        multiplePiePlot34.setBackgroundImageAlpha((float) 0);
        java.awt.Font font42 = multiplePiePlot34.getNoDataMessageFont();
        double double43 = multiplePiePlot34.getLimit();
        java.awt.Paint paint44 = multiplePiePlot34.getAggregatedItemsPaint();
        java.awt.Font font45 = multiplePiePlot34.getNoDataMessageFont();
        multiplePiePlot34.setLimit((double) (-1L));
        java.awt.Paint paint48 = null;
        multiplePiePlot34.setOutlinePaint(paint48);
        java.lang.String str50 = multiplePiePlot34.getNoDataMessage();
        java.awt.Stroke stroke51 = multiplePiePlot34.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke51);
        org.jfree.data.category.CategoryDataset categoryDataset53 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot54 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset53);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier55 = null;
        multiplePiePlot54.setDrawingSupplier(drawingSupplier55);
        boolean boolean58 = multiplePiePlot54.equals((java.lang.Object) 1.0d);
        org.jfree.chart.plot.Plot plot59 = multiplePiePlot54.getRootPlot();
        plot59.setBackgroundImageAlpha((float) 1);
        java.awt.Stroke stroke62 = plot59.getOutlineStroke();
        multiplePiePlot1.setOutlineStroke(stroke62);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(image4);
        org.junit.Assert.assertNull(plot5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNull(plot24);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.5f + "'", float29 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart30);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertEquals("'" + comparable39 + "' != '" + "Other" + "'", comparable39, "Other");
        org.junit.Assert.assertNotNull(font42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(font45);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(stroke51);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(plot59);
        org.junit.Assert.assertNotNull(stroke62);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
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
        java.awt.Stroke stroke18 = multiplePiePlot1.getOutlineStroke();
        org.jfree.chart.util.TableOrder tableOrder19 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.util.TableOrder tableOrder20 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setDataExtractOrder(tableOrder20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNull(tableOrder19);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        multiplePiePlot1.setInsets(rectangleInsets5);
        multiplePiePlot1.zoom((double) 1.0f);
        org.jfree.chart.JFreeChart jFreeChart9 = multiplePiePlot1.getPieChart();
        java.lang.String str10 = multiplePiePlot1.getNoDataMessage();
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot12 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset11);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = null;
        multiplePiePlot12.setDrawingSupplier(drawingSupplier13);
        org.jfree.chart.plot.Plot plot15 = multiplePiePlot12.getRootPlot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        plot15.markerChanged(markerChangeEvent16);
        float float18 = plot15.getBackgroundImageAlpha();
        plot15.setBackgroundImageAlpha(0.0f);
        java.awt.Image image21 = null;
        plot15.setBackgroundImage(image21);
        org.jfree.chart.plot.Plot plot23 = plot15.getRootPlot();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        plot23.notifyListeners(plotChangeEvent24);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        plot23.handleClick((int) ' ', 15, plotRenderingInfo28);
        multiplePiePlot1.setParent(plot23);
        float float31 = multiplePiePlot1.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertNotNull(plot23);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
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
        java.lang.String str19 = multiplePiePlot1.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryDataset16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(categoryDataset18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
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
        multiplePiePlot1.setLimit(0.0d);
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = multiplePiePlot1.getInsets();
        java.awt.Image image7 = multiplePiePlot1.getBackgroundImage();
        double double8 = multiplePiePlot1.getLimit();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot10 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset9);
        boolean boolean11 = multiplePiePlot10.isSubplot();
        java.awt.Paint paint12 = multiplePiePlot10.getBackgroundPaint();
        float float13 = multiplePiePlot10.getForegroundAlpha();
        boolean boolean14 = multiplePiePlot10.isOutlineVisible();
        java.awt.Paint paint15 = multiplePiePlot10.getNoDataMessagePaint();
        multiplePiePlot1.setAggregatedItemsPaint(paint15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.util.TableOrder tableOrder7 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.general.DatasetGroup datasetGroup8 = multiplePiePlot1.getDatasetGroup();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(tableOrder7);
        org.junit.Assert.assertNull(datasetGroup8);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = multiplePiePlot1.getDrawingSupplier();
        org.jfree.chart.plot.Plot plot3 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        multiplePiePlot1.handleClick(0, (int) (byte) 10, plotRenderingInfo6);
        org.junit.Assert.assertNotNull(drawingSupplier2);
        org.junit.Assert.assertNotNull(plot3);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
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
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        multiplePiePlot4.drawBackgroundImage(graphics2D11, rectangle2D12);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        multiplePiePlot4.drawBackgroundImage(graphics2D14, rectangle2D15);
        multiplePiePlot4.zoom(15.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        boolean boolean15 = multiplePiePlot1.isSubplot();
        org.jfree.chart.util.TableOrder tableOrder16 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot1.setDataExtractOrder(tableOrder16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        float float5 = multiplePiePlot1.getForegroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        boolean boolean8 = multiplePiePlot1.isOutlineVisible();
        java.awt.Paint paint9 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        multiplePiePlot1.removeChangeListener(plotChangeListener10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.awt.Image image2 = null;
        multiplePiePlot1.setBackgroundImage(image2);
        multiplePiePlot1.zoom((double) 10L);
        org.jfree.chart.plot.Plot plot6 = multiplePiePlot1.getParent();
        multiplePiePlot1.setAggregatedItemsKey((java.lang.Comparable) (-1L));
        org.junit.Assert.assertNull(plot6);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        org.jfree.data.general.DatasetGroup datasetGroup36 = multiplePiePlot16.getDatasetGroup();
        java.awt.Paint paint37 = multiplePiePlot16.getBackgroundPaint();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(legendItemCollection22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(drawingSupplier32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(datasetGroup36);
        org.junit.Assert.assertNotNull(paint37);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        multiplePiePlot1.markerChanged(markerChangeEvent3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        java.lang.Comparable comparable6 = multiplePiePlot1.getAggregatedItemsKey();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot8 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset7);
        boolean boolean9 = multiplePiePlot8.isSubplot();
        multiplePiePlot8.setForegroundAlpha((float) 0L);
        java.awt.Paint paint12 = multiplePiePlot8.getNoDataMessagePaint();
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        multiplePiePlot8.setDataset(categoryDataset13);
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot16 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset15);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier17 = null;
        multiplePiePlot16.setDrawingSupplier(drawingSupplier17);
        java.awt.Image image19 = null;
        multiplePiePlot16.setBackgroundImage(image19);
        java.awt.Paint paint21 = multiplePiePlot16.getAggregatedItemsPaint();
        multiplePiePlot8.setBackgroundPaint(paint21);
        multiplePiePlot1.setOutlinePaint(paint21);
        boolean boolean24 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint25 = multiplePiePlot1.getAggregatedItemsPaint();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
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
        java.awt.Paint paint14 = multiplePiePlot1.getNoDataMessagePaint();
        double double15 = multiplePiePlot1.getLimit();
        double double16 = multiplePiePlot1.getLimit();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertEquals("'" + comparable6 + "' != '" + "Other" + "'", comparable6, "Other");
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        multiplePiePlot1.setForegroundAlpha((float) (byte) 10);
        double double7 = multiplePiePlot1.getLimit();
        java.awt.Paint paint8 = multiplePiePlot1.getAggregatedItemsPaint();
        org.jfree.chart.util.TableOrder tableOrder9 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(tableOrder9);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
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
        org.jfree.data.category.CategoryDataset categoryDataset28 = multiplePiePlot1.getDataset();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(categoryDataset12);
        org.junit.Assert.assertNull(categoryDataset13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(plot22);
        org.junit.Assert.assertNull(categoryDataset28);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        org.jfree.chart.util.TableOrder tableOrder5 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.util.TableOrder tableOrder6 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent7 = null;
        multiplePiePlot1.datasetChanged(datasetChangeEvent7);
        multiplePiePlot1.setForegroundAlpha((float) (byte) 1);
        multiplePiePlot1.setLimit((double) 10L);
        org.jfree.data.category.CategoryDataset categoryDataset13 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot14 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset13);
        java.lang.String str15 = multiplePiePlot14.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        multiplePiePlot14.addChangeListener(plotChangeListener16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = multiplePiePlot14.getDrawingSupplier();
        java.awt.Paint paint19 = multiplePiePlot14.getNoDataMessagePaint();
        java.awt.Image image20 = null;
        multiplePiePlot14.setBackgroundImage(image20);
        multiplePiePlot14.setNoDataMessage("hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = multiplePiePlot14.getInsets();
        multiplePiePlot1.setInsets(rectangleInsets24);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(tableOrder5);
        org.junit.Assert.assertNull(tableOrder6);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(drawingSupplier18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets24);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setOutlineVisible(false);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.util.TableOrder tableOrder8 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(tableOrder8);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        float float4 = multiplePiePlot1.getBackgroundImageAlpha();
        java.awt.Paint paint5 = multiplePiePlot1.getBackgroundPaint();
        org.jfree.data.category.CategoryDataset categoryDataset6 = null;
        multiplePiePlot1.setDataset(categoryDataset6);
        org.jfree.chart.plot.Plot plot8 = multiplePiePlot1.getRootPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        multiplePiePlot1.handleClick((int) (short) 1, 1, plotRenderingInfo11);
        multiplePiePlot1.setBackgroundImageAlignment(15);
        java.awt.Paint paint15 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        multiplePiePlot1.setNoDataMessagePaint(paint15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = multiplePiePlot1.clone();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'object' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent16 = null;
        plot6.axisChanged(axisChangeEvent16);
        java.awt.Font font18 = plot6.getNoDataMessageFont();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(font18);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        boolean boolean5 = multiplePiePlot1.equals((java.lang.Object) 1.0d);
        java.awt.Paint paint6 = multiplePiePlot1.getOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = multiplePiePlot1.getLegendItems();
        boolean boolean8 = multiplePiePlot1.isOutlineVisible();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        multiplePiePlot1.drawBackgroundImage(graphics2D9, rectangle2D10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        multiplePiePlot1.setForegroundAlpha((float) 0L);
        java.awt.Paint paint5 = multiplePiePlot1.getNoDataMessagePaint();
        java.awt.Paint paint6 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint7 = multiplePiePlot1.getAggregatedItemsPaint();
        java.awt.Image image8 = null;
        multiplePiePlot1.setBackgroundImage(image8);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = multiplePiePlot1.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = multiplePiePlot1.getInsets();
        float float12 = multiplePiePlot1.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
        java.awt.Stroke stroke16 = multiplePiePlot1.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot18 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset17);
        boolean boolean19 = multiplePiePlot18.isSubplot();
        java.awt.Paint paint20 = multiplePiePlot18.getBackgroundPaint();
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        multiplePiePlot18.drawBackgroundImage(graphics2D21, rectangle2D22);
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        multiplePiePlot18.setDataset(categoryDataset24);
        org.jfree.data.category.CategoryDataset categoryDataset26 = multiplePiePlot18.getDataset();
        multiplePiePlot1.setParent((org.jfree.chart.plot.Plot) multiplePiePlot18);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(categoryDataset15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(categoryDataset26);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
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
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot13 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset12);
        java.lang.String str14 = multiplePiePlot13.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        multiplePiePlot13.markerChanged(markerChangeEvent15);
        java.awt.Paint paint17 = null;
        multiplePiePlot13.setBackgroundPaint(paint17);
        multiplePiePlot13.setAggregatedItemsKey((java.lang.Comparable) (-1.0d));
        java.awt.Image image21 = null;
        multiplePiePlot13.setBackgroundImage(image21);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent23 = null;
        multiplePiePlot13.axisChanged(axisChangeEvent23);
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
        float float42 = multiplePiePlot26.getBackgroundAlpha();
        org.jfree.data.category.CategoryDataset categoryDataset43 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot44 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset43);
        multiplePiePlot44.setAggregatedItemsKey((java.lang.Comparable) 10);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent47 = null;
        multiplePiePlot44.markerChanged(markerChangeEvent47);
        multiplePiePlot44.setAggregatedItemsKey((java.lang.Comparable) 1);
        java.awt.Image image51 = multiplePiePlot44.getBackgroundImage();
        org.jfree.data.category.CategoryDataset categoryDataset52 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot53 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset52);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier54 = null;
        multiplePiePlot53.setDrawingSupplier(drawingSupplier54);
        org.jfree.chart.plot.Plot plot56 = multiplePiePlot53.getParent();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent57 = null;
        multiplePiePlot53.datasetChanged(datasetChangeEvent57);
        multiplePiePlot53.setAggregatedItemsKey((java.lang.Comparable) (-1));
        float float61 = multiplePiePlot53.getBackgroundImageAlpha();
        org.jfree.chart.JFreeChart jFreeChart62 = multiplePiePlot53.getPieChart();
        multiplePiePlot44.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart62);
        multiplePiePlot26.setPieChart(jFreeChart62);
        multiplePiePlot13.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart62);
        multiplePiePlot1.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart62);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(drawingSupplier36);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 1.0f + "'", float42 == 1.0f);
        org.junit.Assert.assertNull(image51);
        org.junit.Assert.assertNull(plot56);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + 0.5f + "'", float61 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart62);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = multiplePiePlot1.getInsets();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        multiplePiePlot1.notifyListeners(plotChangeEvent21);
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
        org.junit.Assert.assertNotNull(rectangleInsets20);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
        int int13 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.util.TableOrder tableOrder14 = multiplePiePlot1.getDataExtractOrder();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertNull(tableOrder14);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Image image3 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.LegendItemCollection legendItemCollection4 = multiplePiePlot1.getLegendItems();
        org.jfree.chart.JFreeChart jFreeChart5 = multiplePiePlot1.getPieChart();
        java.awt.Image image6 = null;
        multiplePiePlot1.setBackgroundImage(image6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(legendItemCollection4);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
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
        java.awt.Stroke stroke12 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        multiplePiePlot1.setOutlineStroke(stroke12);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(legendItemCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(categoryDataset11);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        java.lang.String str2 = multiplePiePlot1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        multiplePiePlot1.addChangeListener(plotChangeListener3);
        java.awt.Image image5 = multiplePiePlot1.getBackgroundImage();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        double double8 = multiplePiePlot1.getLimit();
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
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = null;
        multiplePiePlot1.setDrawingSupplier(drawingSupplier2);
        org.jfree.chart.plot.Plot plot4 = multiplePiePlot1.getParent();
        boolean boolean5 = multiplePiePlot1.isSubplot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        multiplePiePlot1.axisChanged(axisChangeEvent6);
        org.jfree.chart.util.TableOrder tableOrder8 = multiplePiePlot1.getDataExtractOrder();
        org.jfree.chart.util.TableOrder tableOrder9 = multiplePiePlot1.getDataExtractOrder();
        multiplePiePlot1.setBackgroundImageAlpha((float) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = multiplePiePlot1.getDrawingSupplier();
        org.junit.Assert.assertNull(plot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(tableOrder8);
        org.junit.Assert.assertNull(tableOrder9);
        org.junit.Assert.assertNull(drawingSupplier12);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
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
        org.jfree.data.category.CategoryDataset categoryDataset24 = multiplePiePlot1.getDataset();
        int int25 = multiplePiePlot1.getBackgroundImageAlignment();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        multiplePiePlot1.handleClick(0, 97, plotRenderingInfo28);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(categoryDataset24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 15 + "'", int25 == 15);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.plot.MultiplePiePlot multiplePiePlot1 = new org.jfree.chart.plot.MultiplePiePlot(categoryDataset0);
        boolean boolean2 = multiplePiePlot1.isSubplot();
        java.awt.Paint paint3 = multiplePiePlot1.getBackgroundPaint();
        java.awt.Paint paint4 = multiplePiePlot1.getNoDataMessagePaint();
        multiplePiePlot1.setLimit((double) (byte) 1);
        java.lang.Object obj7 = null;
        boolean boolean8 = multiplePiePlot1.equals(obj7);
        multiplePiePlot1.setBackgroundImageAlpha((float) 1L);
        org.jfree.chart.JFreeChart jFreeChart11 = multiplePiePlot1.getPieChart();
        multiplePiePlot1.setBackgroundImageAlpha((float) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jFreeChart11);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
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
        // The following exception was thrown during execution in test generation
        try {
            multiplePiePlot4.setBackgroundImageAlpha((float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
        multiplePiePlot1.setLimit(0.0d);
        java.awt.Paint paint21 = multiplePiePlot1.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNotNull(paint21);
    }
}

