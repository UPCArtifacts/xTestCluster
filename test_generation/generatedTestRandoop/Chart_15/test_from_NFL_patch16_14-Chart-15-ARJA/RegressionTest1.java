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
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart3D("Pie Plot", "Pie Plot", "", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("", "", "", xYDataset3, true, true, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        java.awt.Paint paint3 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setNoDataMessagePaint(paint3);
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        piePlot5.setDataset(pieDataset6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot5.getURLGenerator();
        org.jfree.chart.plot.Plot plot9 = piePlot5.getRootPlot();
        java.awt.Stroke stroke10 = piePlot5.getLabelOutlineStroke();
        piePlot0.setLabelLinkStroke(stroke10);
        java.awt.Stroke stroke12 = piePlot0.getOutlineStroke();
        java.awt.Shape shape13 = piePlot0.getLegendItemShape();
        double double14 = piePlot0.getStartAngle();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 90.0d + "'", double14 == 90.0d);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.zoom(0.4d);
        java.awt.Stroke stroke5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) false, stroke5);
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        double double9 = piePlot8.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor10 = piePlot8.getLabelDistributor();
        java.awt.Paint paint11 = piePlot8.getLabelOutlinePaint();
        piePlot1.setSectionPaint((java.lang.Comparable) 1.0E-5d, paint11);
        java.awt.Paint paint13 = piePlot1.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot();
        double double16 = piePlot15.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor17 = piePlot15.getLabelDistributor();
        double double18 = piePlot15.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        piePlot15.drawBackgroundImage(graphics2D19, rectangle2D20);
        java.awt.Paint paint23 = piePlot15.getSectionPaint((java.lang.Comparable) false);
        piePlot15.setShadowYOffset((double) (short) 1);
        java.awt.Stroke stroke26 = piePlot15.getLabelLinkStroke();
        java.awt.Stroke stroke27 = piePlot15.getLabelLinkStroke();
        // The following exception was thrown during execution in test generation
        try {
            piePlot1.setSectionOutlineStroke((java.lang.Comparable) 0.14d, stroke27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to java.lang.Double");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14d + "'", double9 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.14d + "'", double16 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-5d + "'", double18 == 1.0E-5d);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(stroke27);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", pieDataset1, pieDataset2, (int) (short) 1, true, true, true, locale7, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor5 = piePlot0.getLabelDistributor();
        boolean boolean6 = piePlot0.isSubplot();
        piePlot0.setPieIndex(0);
        piePlot0.setExplodePercent((java.lang.Comparable) 0.4d, 1.0E-5d);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = piePlot0.getLabelDistributor();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("Pie Plot", "", "", categoryDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        double double5 = piePlot0.getLabelGap();
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        double double7 = piePlot6.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor8 = piePlot6.getLabelDistributor();
        double double9 = piePlot6.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        piePlot6.drawBackgroundImage(graphics2D10, rectangle2D11);
        java.awt.Paint paint14 = piePlot6.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font15 = piePlot6.getLabelFont();
        piePlot6.setSimpleLabels(false);
        java.awt.Paint paint18 = piePlot6.getLabelPaint();
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot6.setLabelOutlinePaint(paint19);
        piePlot6.setStartAngle((double) 100L);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator23 = piePlot6.getToolTipGenerator();
        java.awt.Paint paint24 = piePlot6.getLabelBackgroundPaint();
        piePlot0.setLabelLinkPaint(paint24);
        java.awt.Shape shape26 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setLegendItemShape(shape26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14d + "'", double7 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-5d + "'", double9 == 1.0E-5d);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(pieToolTipGenerator23);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("Pie Plot", pieDataset1, pieDataset2, (int) (byte) 0, false, false, false, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        double double6 = piePlot0.getMinimumArcAngleToDraw();
        piePlot0.setNoDataMessage("Pie Plot");
        java.awt.Paint paint9 = piePlot0.getNoDataMessagePaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator10 = null;
        piePlot0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-5d + "'", double6 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        double double5 = piePlot0.getLabelGap();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelGenerator();
        boolean boolean7 = piePlot0.getSimpleLabels();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("Pie Plot", "hi!", "hi!", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createRingChart("", pieDataset1, true, false, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str9 = piePlot0.getNoDataMessage();
        java.awt.Paint paint10 = piePlot0.getLabelOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot0.getLabelPadding();
        boolean boolean12 = piePlot0.getSimpleLabels();
        piePlot0.setBackgroundAlpha((float) 10);
        java.awt.Paint paint15 = piePlot0.getLabelBackgroundPaint();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        piePlot0.setDataset(pieDataset16);
        java.lang.Class<?> wildcardClass18 = piePlot0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        piePlot0.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelToolTipGenerator();
        boolean boolean7 = piePlot0.getSimpleLabels();
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        double double9 = piePlot8.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor10 = piePlot8.getLabelDistributor();
        double double11 = piePlot8.getMinimumArcAngleToDraw();
        java.awt.Paint paint12 = piePlot8.getBaseSectionOutlinePaint();
        double double13 = piePlot8.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot8.getSimpleLabelOffset();
        double double15 = piePlot8.getLabelLinkMargin();
        double double16 = piePlot8.getStartAngle();
        piePlot0.setParent((org.jfree.chart.plot.Plot) piePlot8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        piePlot0.handleClick((int) (byte) 100, (int) '4', plotRenderingInfo20);
        piePlot0.setOutlineVisible(false);
        double double24 = piePlot0.getInteriorGap();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14d + "'", double9 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-5d + "'", double11 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.0d + "'", double13 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.025d + "'", double15 == 0.025d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 90.0d + "'", double16 == 90.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.08d + "'", double24 == 0.08d);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart("", pieDataset1, false, true, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("hi!", "Pie Plot", "hi!", xYDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        boolean boolean6 = piePlot0.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double8 = piePlot7.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor9 = piePlot7.getLabelDistributor();
        double double10 = piePlot7.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot7.drawBackgroundImage(graphics2D11, rectangle2D12);
        java.awt.Paint paint15 = piePlot7.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font16 = piePlot7.getLabelFont();
        piePlot0.setNoDataMessageFont(font16);
        boolean boolean18 = piePlot0.isOutlineVisible();
        double double19 = piePlot0.getLabelGap();
        org.jfree.chart.plot.Plot plot20 = piePlot0.getRootPlot();
        piePlot0.setCircular(true, false);
        int int24 = piePlot0.getBackgroundImageAlignment();
        boolean boolean25 = piePlot0.getLabelLinksVisible();
        piePlot0.setShadowYOffset((double) ' ');
        org.jfree.data.general.PieDataset pieDataset28 = null;
        piePlot0.setDataset(pieDataset28);
        piePlot0.setLabelLinksVisible(true);
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset33 = null;
        piePlot32.setDataset(pieDataset33);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator35 = piePlot32.getURLGenerator();
        org.jfree.chart.plot.Plot plot36 = piePlot32.getRootPlot();
        java.awt.Stroke stroke37 = piePlot32.getLabelOutlineStroke();
        java.awt.Shape shape38 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot32.setLegendItemShape(shape38);
        piePlot0.setLegendItemShape(shape38);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.025d + "'", double19 == 0.025d);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(pieURLGenerator35);
        org.junit.Assert.assertNotNull(plot36);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(shape38);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.util.TableOrder tableOrder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createMultiplePieChart("", categoryDataset1, tableOrder2, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font9 = piePlot0.getLabelFont();
        piePlot0.setSimpleLabels(false);
        java.awt.Paint paint12 = piePlot0.getLabelPaint();
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setLabelOutlinePaint(paint13);
        piePlot0.setStartAngle((double) 100L);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator17 = piePlot0.getURLGenerator();
        java.awt.Paint paint18 = piePlot0.getLabelLinkPaint();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator19 = piePlot0.getToolTipGenerator();
        java.awt.Stroke stroke21 = piePlot0.getSectionOutlineStroke((java.lang.Comparable) 15);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(pieURLGenerator17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(pieToolTipGenerator19);
        org.junit.Assert.assertNull(stroke21);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("", "hi!", "", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        java.awt.Paint paint3 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setNoDataMessagePaint(paint3);
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        piePlot5.setDataset(pieDataset6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot5.getURLGenerator();
        org.jfree.chart.plot.Plot plot9 = piePlot5.getRootPlot();
        java.awt.Stroke stroke10 = piePlot5.getLabelOutlineStroke();
        piePlot0.setLabelLinkStroke(stroke10);
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset13 = null;
        piePlot12.setDataset(pieDataset13);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator15 = piePlot12.getURLGenerator();
        org.jfree.chart.plot.Plot plot16 = piePlot12.getRootPlot();
        java.awt.Stroke stroke17 = piePlot12.getLabelOutlineStroke();
        java.awt.Shape shape18 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot12.setLegendItemShape(shape18);
        piePlot0.setLegendItemShape(shape18);
        org.jfree.data.xy.XYDataset xYDataset24 = null;
        org.jfree.chart.JFreeChart jFreeChart28 = org.jfree.chart.ChartFactory.createTimeSeriesChart("Pie Plot", "Pie Plot", "hi!", xYDataset24, false, true, true);
        piePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart28);
        piePlot0.setSimpleLabels(true);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator32 = piePlot0.getLegendLabelToolTipGenerator();
        double double33 = piePlot0.getLabelLinkMargin();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(pieURLGenerator15);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(jFreeChart28);
        org.junit.Assert.assertNull(pieSectionLabelGenerator32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.025d + "'", double33 == 0.025d);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        double double6 = piePlot5.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup7 = piePlot5.getDatasetGroup();
        piePlot5.setOutlineVisible(true);
        boolean boolean11 = piePlot5.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot();
        double double13 = piePlot12.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor14 = piePlot12.getLabelDistributor();
        double double15 = piePlot12.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        piePlot12.drawBackgroundImage(graphics2D16, rectangle2D17);
        java.awt.Paint paint20 = piePlot12.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font21 = piePlot12.getLabelFont();
        piePlot5.setNoDataMessageFont(font21);
        boolean boolean23 = piePlot5.isOutlineVisible();
        double double24 = piePlot5.getLabelGap();
        java.awt.Paint paint25 = piePlot5.getLabelLinkPaint();
        piePlot0.setSectionPaint((java.lang.Comparable) 0.0d, paint25);
        boolean boolean27 = piePlot0.getIgnoreZeroValues();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.14d + "'", double6 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.14d + "'", double13 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.025d + "'", double24 == 0.025d);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font9 = piePlot0.getLabelFont();
        piePlot0.setSimpleLabels(false);
        java.awt.Paint paint12 = piePlot0.getLabelPaint();
        java.awt.Stroke stroke14 = piePlot0.getSectionOutlineStroke((java.lang.Comparable) 52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(stroke14);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str9 = piePlot0.getNoDataMessage();
        java.awt.Paint paint10 = piePlot0.getLabelOutlinePaint();
        java.awt.Stroke stroke11 = piePlot0.getLabelOutlineStroke();
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot();
        double double13 = piePlot12.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup14 = piePlot12.getDatasetGroup();
        java.awt.Paint paint15 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot12.setNoDataMessagePaint(paint15);
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset18 = null;
        piePlot17.setDataset(pieDataset18);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator20 = piePlot17.getURLGenerator();
        org.jfree.chart.plot.Plot plot21 = piePlot17.getRootPlot();
        java.awt.Stroke stroke22 = piePlot17.getLabelOutlineStroke();
        piePlot12.setLabelLinkStroke(stroke22);
        java.awt.Stroke stroke24 = piePlot12.getOutlineStroke();
        java.awt.Shape shape25 = piePlot12.getLegendItemShape();
        piePlot12.setInteriorGap((double) 0.0f);
        boolean boolean28 = piePlot12.isOutlineVisible();
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot();
        piePlot29.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint32 = piePlot29.getLabelLinkPaint();
        piePlot12.setBaseSectionPaint(paint32);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent34 = null;
        piePlot12.axisChanged(axisChangeEvent34);
        boolean boolean36 = piePlot0.equals((java.lang.Object) piePlot12);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.14d + "'", double13 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(pieURLGenerator20);
        org.junit.Assert.assertNotNull(plot21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        org.jfree.data.xy.XYDataset xYDataset5 = null;
        org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createPolarChart("", xYDataset5, false, false, true);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart9);
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot11.getMaximumLabelWidth();
        piePlot11.setForegroundAlpha((float) (short) 0);
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot();
        double double16 = piePlot15.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor17 = piePlot15.getLabelDistributor();
        double double18 = piePlot15.getMinimumArcAngleToDraw();
        java.awt.Paint paint19 = piePlot15.getBaseSectionOutlinePaint();
        double double20 = piePlot15.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot15.getSimpleLabelOffset();
        piePlot11.setInsets(rectangleInsets21);
        piePlot0.setInsets(rectangleInsets21, false);
        boolean boolean25 = piePlot0.isCircular();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator26 = piePlot0.getLegendLabelToolTipGenerator();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.14d + "'", double16 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-5d + "'", double18 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(pieSectionLabelGenerator26);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        org.jfree.chart.plot.PiePlot piePlot3 = new org.jfree.chart.plot.PiePlot();
        double double4 = piePlot3.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor5 = piePlot3.getLabelDistributor();
        double double6 = piePlot3.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        piePlot3.drawBackgroundImage(graphics2D7, rectangle2D8);
        java.awt.Paint paint11 = piePlot3.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str12 = piePlot3.getNoDataMessage();
        java.awt.Paint paint13 = piePlot3.getLabelOutlinePaint();
        java.awt.Stroke stroke14 = piePlot3.getLabelOutlineStroke();
        piePlot0.setLabelLinkStroke(stroke14);
        java.awt.Paint paint16 = piePlot0.getLabelLinkPaint();
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setBackgroundImageAlpha((float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.14d + "'", double4 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-5d + "'", double6 == 1.0E-5d);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font9 = piePlot0.getLabelFont();
        piePlot0.setSimpleLabels(false);
        java.awt.Paint paint12 = piePlot0.getLabelPaint();
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setLabelOutlinePaint(paint13);
        piePlot0.setStartAngle((double) 100L);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator17 = piePlot0.getToolTipGenerator();
        piePlot0.setSimpleLabels(false);
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator21 = piePlot20.getLegendLabelGenerator();
        piePlot0.setLabelGenerator(pieSectionLabelGenerator21);
        boolean boolean23 = piePlot0.isSubplot();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(pieToolTipGenerator17);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        java.awt.Stroke stroke2 = piePlot0.getBaseSectionOutlineStroke();
        piePlot0.setBackgroundAlpha(100.0f);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = piePlot0.getLegendItems();
        boolean boolean6 = piePlot0.isCircular();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        boolean boolean4 = piePlot0.isOutlineVisible();
        java.awt.Stroke stroke5 = piePlot0.getLabelOutlineStroke();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot0.setToolTipGenerator(pieToolTipGenerator6);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(stroke5);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        java.awt.Paint paint3 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setNoDataMessagePaint(paint3);
        double double6 = piePlot0.getExplodePercent((java.lang.Comparable) (-1));
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double9 = piePlot7.getExplodePercent((java.lang.Comparable) 0);
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        piePlot10.setDataset(pieDataset11);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = piePlot10.getURLGenerator();
        org.jfree.chart.plot.Plot plot14 = piePlot10.getRootPlot();
        java.awt.Stroke stroke15 = piePlot10.getLabelOutlineStroke();
        java.awt.Shape shape16 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot10.setLegendItemShape(shape16);
        java.awt.Stroke stroke18 = piePlot10.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot();
        double double20 = piePlot19.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor21 = piePlot19.getLabelDistributor();
        double double22 = piePlot19.getMinimumArcAngleToDraw();
        java.awt.Paint paint23 = piePlot19.getBaseSectionOutlinePaint();
        double double24 = piePlot19.getShadowYOffset();
        piePlot19.setBackgroundImageAlignment((int) (byte) -1);
        double double27 = piePlot19.getInteriorGap();
        java.awt.Font font28 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot19.setNoDataMessageFont(font28);
        piePlot10.setLabelFont(font28);
        piePlot7.setLabelFont(font28);
        piePlot0.setNoDataMessageFont(font28);
        piePlot0.zoom((double) 0);
        java.awt.Paint paint36 = piePlot0.getSectionPaint((java.lang.Comparable) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(pieURLGenerator13);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.14d + "'", double20 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0E-5d + "'", double22 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.08d + "'", double27 == 0.08d);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertNull(paint36);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setInteriorGap((double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (1.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        boolean boolean5 = piePlot0.isSubplot();
        piePlot0.setCircular(false);
        java.awt.Paint paint9 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot0.setSectionOutlinePaint((java.lang.Comparable) "", paint9);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator11 = null;
        piePlot0.setLabelGenerator(pieSectionLabelGenerator11);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        piePlot0.setOutlineVisible(true);
        piePlot0.setLabelLinkMargin((double) (short) -1);
        piePlot0.setForegroundAlpha(1.0f);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator8 = piePlot0.getLabelGenerator();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator8);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("", "hi!", "hi!", categoryDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font9 = piePlot0.getLabelFont();
        piePlot0.setSimpleLabels(false);
        java.awt.Paint paint12 = piePlot0.getLabelPaint();
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setLabelOutlinePaint(paint13);
        piePlot0.setStartAngle((double) 100L);
        java.awt.Paint paint17 = piePlot0.getLabelShadowPaint();
        java.lang.String str18 = piePlot0.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart3D("Pie Plot", "", "hi!", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        double double6 = piePlot0.getMinimumArcAngleToDraw();
        piePlot0.setNoDataMessage("Pie Plot");
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator9 = piePlot0.getURLGenerator();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-5d + "'", double6 == 1.0E-5d);
        org.junit.Assert.assertNull(pieURLGenerator9);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        piePlot0.setDataset(pieDataset3);
        int int5 = piePlot0.getPieIndex();
        java.awt.Paint paint6 = piePlot0.getLabelLinkPaint();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot0.setBackgroundPaint(paint7);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator9 = null;
        piePlot0.setURLGenerator(pieURLGenerator9);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart3D("hi!", "hi!", "", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        double double5 = piePlot4.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor6 = piePlot4.getLabelDistributor();
        double double7 = piePlot4.getMinimumArcAngleToDraw();
        java.awt.Paint paint8 = piePlot4.getBaseSectionOutlinePaint();
        double double9 = piePlot4.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = piePlot4.getSimpleLabelOffset();
        piePlot0.setInsets(rectangleInsets10);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        java.awt.geom.Point2D point2D14 = null;
        org.jfree.chart.plot.PlotState plotState15 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.draw(graphics2D12, rectangle2D13, point2D14, plotState15, plotRenderingInfo16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-5d + "'", double7 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets10);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot0.setToolTipGenerator(pieToolTipGenerator2);
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset7 = null;
        org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "hi!", "", boxAndWhiskerXYDataset7, false);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart9);
        java.awt.Paint paint11 = piePlot0.getLabelPaint();
        java.lang.Class<?> wildcardClass12 = paint11.getClass();
        org.junit.Assert.assertNull(datasetGroup1);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart3D("", "hi!", "Pie Plot", categoryDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        java.awt.Paint paint3 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setNoDataMessagePaint(paint3);
        double double6 = piePlot0.getExplodePercent((java.lang.Comparable) (-1));
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double9 = piePlot7.getExplodePercent((java.lang.Comparable) 0);
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        piePlot10.setDataset(pieDataset11);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = piePlot10.getURLGenerator();
        org.jfree.chart.plot.Plot plot14 = piePlot10.getRootPlot();
        java.awt.Stroke stroke15 = piePlot10.getLabelOutlineStroke();
        java.awt.Shape shape16 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot10.setLegendItemShape(shape16);
        java.awt.Stroke stroke18 = piePlot10.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot();
        double double20 = piePlot19.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor21 = piePlot19.getLabelDistributor();
        double double22 = piePlot19.getMinimumArcAngleToDraw();
        java.awt.Paint paint23 = piePlot19.getBaseSectionOutlinePaint();
        double double24 = piePlot19.getShadowYOffset();
        piePlot19.setBackgroundImageAlignment((int) (byte) -1);
        double double27 = piePlot19.getInteriorGap();
        java.awt.Font font28 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot19.setNoDataMessageFont(font28);
        piePlot10.setLabelFont(font28);
        piePlot7.setLabelFont(font28);
        piePlot0.setNoDataMessageFont(font28);
        java.awt.Stroke stroke34 = piePlot0.getSectionOutlineStroke((java.lang.Comparable) 52.0d);
        piePlot0.setShadowXOffset(0.4d);
        // The following exception was thrown during execution in test generation
        try {
            double double37 = piePlot0.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(pieURLGenerator13);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.14d + "'", double20 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0E-5d + "'", double22 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.08d + "'", double27 == 0.08d);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertNull(stroke34);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str9 = piePlot0.getNoDataMessage();
        java.awt.Paint paint10 = piePlot0.getLabelOutlinePaint();
        java.awt.Stroke stroke11 = piePlot0.getLabelOutlineStroke();
        java.lang.String str12 = piePlot0.getPlotType();
        piePlot0.setShadowXOffset((double) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot0.getInsets();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = null;
        piePlot0.setLegendLabelURLGenerator(pieURLGenerator16);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pie Plot" + "'", str12, "Pie Plot");
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        piePlot0.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelToolTipGenerator();
        boolean boolean7 = piePlot0.getSimpleLabels();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot0.getURLGenerator();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(pieURLGenerator8);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font9 = piePlot0.getLabelFont();
        piePlot0.setSimpleLabels(false);
        java.awt.Paint paint12 = piePlot0.getLabelPaint();
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setLabelOutlinePaint(paint13);
        piePlot0.setStartAngle((double) 100L);
        java.awt.Paint paint17 = piePlot0.getLabelShadowPaint();
        java.awt.Image image18 = null;
        piePlot0.setBackgroundImage(image18);
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot();
        double double21 = piePlot20.getMaximumLabelWidth();
        piePlot20.setForegroundAlpha(100.0f);
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot();
        double double25 = piePlot24.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor26 = piePlot24.getLabelDistributor();
        double double27 = piePlot24.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        piePlot24.drawBackgroundImage(graphics2D28, rectangle2D29);
        java.awt.Paint paint32 = piePlot24.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str33 = piePlot24.getNoDataMessage();
        java.awt.Paint paint34 = piePlot24.getLabelOutlinePaint();
        piePlot20.setBaseSectionOutlinePaint(paint34);
        boolean boolean36 = piePlot0.equals((java.lang.Object) piePlot20);
        boolean boolean37 = piePlot20.isCircular();
        java.lang.Comparable comparable38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Stroke stroke39 = piePlot20.getSectionOutlineStroke(comparable38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.14d + "'", double21 == 0.14d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.14d + "'", double25 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0E-5d + "'", double27 == 1.0E-5d);
        org.junit.Assert.assertNull(paint32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createCandlestickChart("hi!", "", "", oHLCDataset3, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        double double6 = piePlot0.getMinimumArcAngleToDraw();
        piePlot0.setNoDataMessage("Pie Plot");
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot();
        double double10 = piePlot9.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor11 = piePlot9.getLabelDistributor();
        double double12 = piePlot9.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        piePlot9.drawBackgroundImage(graphics2D13, rectangle2D14);
        java.awt.Paint paint17 = piePlot9.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str18 = piePlot9.getNoDataMessage();
        java.awt.Paint paint19 = piePlot9.getLabelOutlinePaint();
        java.awt.Stroke stroke20 = piePlot9.getLabelOutlineStroke();
        java.lang.String str21 = piePlot9.getPlotType();
        piePlot9.setShadowXOffset((double) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = piePlot9.getInsets();
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot();
        double double26 = piePlot25.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor27 = piePlot25.getLabelDistributor();
        java.awt.Paint paint28 = piePlot25.getLabelOutlinePaint();
        org.jfree.data.xy.XYDataset xYDataset30 = null;
        org.jfree.chart.JFreeChart jFreeChart34 = org.jfree.chart.ChartFactory.createPolarChart("", xYDataset30, false, false, true);
        piePlot25.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart34);
        piePlot9.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart34);
        piePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart34);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-5d + "'", double6 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Pie Plot" + "'", str21, "Pie Plot");
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.14d + "'", double26 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(jFreeChart34);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart("Pie Plot", pieDataset1, true, true, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.lang.String str3 = piePlot0.getPlotType();
        double double5 = piePlot0.getExplodePercent((java.lang.Comparable) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart3D("Pie Plot", "", "hi!", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot5 = piePlot0.getRootPlot();
        piePlot0.setOutlineVisible(false);
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        double double9 = piePlot8.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor10 = piePlot8.getLabelDistributor();
        double double11 = piePlot8.getMinimumArcAngleToDraw();
        java.awt.Paint paint12 = piePlot8.getBaseSectionOutlinePaint();
        double double13 = piePlot8.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot8.getSimpleLabelOffset();
        java.awt.Stroke stroke15 = piePlot8.getLabelLinkStroke();
        piePlot0.setLabelOutlineStroke(stroke15);
        java.awt.Paint paint17 = piePlot0.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14d + "'", double9 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-5d + "'", double11 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.0d + "'", double13 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        boolean boolean6 = piePlot0.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double8 = piePlot7.getMaximumLabelWidth();
        piePlot7.setForegroundAlpha(100.0f);
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot11.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor13 = piePlot11.getLabelDistributor();
        double double14 = piePlot11.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        piePlot11.drawBackgroundImage(graphics2D15, rectangle2D16);
        java.awt.Paint paint19 = piePlot11.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str20 = piePlot11.getNoDataMessage();
        java.awt.Paint paint21 = piePlot11.getLabelOutlinePaint();
        piePlot7.setBaseSectionOutlinePaint(paint21);
        piePlot0.setParent((org.jfree.chart.plot.Plot) piePlot7);
        int int24 = piePlot0.getPieIndex();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        double double4 = piePlot0.getShadowXOffset();
        piePlot0.setForegroundAlpha((float) 1L);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = piePlot0.getToolTipGenerator();
        boolean boolean8 = piePlot0.getIgnoreZeroValues();
        java.awt.Paint paint10 = piePlot0.getSectionPaint((java.lang.Comparable) (-1.0d));
        boolean boolean11 = piePlot0.isCircular();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
        org.junit.Assert.assertNull(pieToolTipGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        piePlot0.setBackgroundImageAlignment((int) (byte) -1);
        double double8 = piePlot0.getMinimumArcAngleToDraw();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepAreaChart("hi!", "Pie Plot", "hi!", xYDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("", "", "", intervalCategoryDataset3, false, false, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelToolTipGenerator();
        piePlot0.setCircular(false, true);
        float float5 = piePlot0.getBackgroundAlpha();
        org.junit.Assert.assertNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("Pie Plot", pieDataset1, pieDataset2, (int) '#', true, true, false, locale7, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.jfree.data.xy.XYDataset xYDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPolarChart("Pie Plot", xYDataset1, true, true, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        org.jfree.data.xy.XYDataset xYDataset5 = null;
        org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createPolarChart("", xYDataset5, false, false, true);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart9);
        org.jfree.data.general.PieDataset pieDataset11 = piePlot0.getDataset();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertNull(pieDataset11);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        java.awt.Paint paint6 = piePlot0.getLabelPaint();
        java.lang.Class<?> wildcardClass7 = paint6.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        java.awt.Paint paint6 = piePlot0.getLabelPaint();
        java.awt.Paint paint7 = piePlot0.getLabelPaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = piePlot0.getDrawingSupplier();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        piePlot0.addChangeListener(plotChangeListener9);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint3 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot0.setLabelShadowPaint(paint3);
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        piePlot5.setDataset(pieDataset6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot5.getURLGenerator();
        org.jfree.chart.plot.Plot plot9 = piePlot5.getRootPlot();
        java.awt.Stroke stroke10 = piePlot5.getLabelOutlineStroke();
        java.awt.Shape shape11 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot5.setLegendItemShape(shape11);
        boolean boolean13 = piePlot0.equals((java.lang.Object) piePlot5);
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setInteriorGap((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (100.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        piePlot0.setForegroundAlpha(100.0f);
        piePlot0.zoom(0.0d);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = piePlot0.getDrawingSupplier();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(drawingSupplier6);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart3D("hi!", "", "", categoryDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double2 = piePlot0.getExplodePercent((java.lang.Comparable) 0);
        org.jfree.chart.plot.PiePlot piePlot3 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset4 = null;
        piePlot3.setDataset(pieDataset4);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot3.getURLGenerator();
        org.jfree.chart.plot.Plot plot7 = piePlot3.getRootPlot();
        java.awt.Stroke stroke8 = piePlot3.getLabelOutlineStroke();
        java.awt.Shape shape9 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot3.setLegendItemShape(shape9);
        java.awt.Stroke stroke11 = piePlot3.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot();
        double double13 = piePlot12.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor14 = piePlot12.getLabelDistributor();
        double double15 = piePlot12.getMinimumArcAngleToDraw();
        java.awt.Paint paint16 = piePlot12.getBaseSectionOutlinePaint();
        double double17 = piePlot12.getShadowYOffset();
        piePlot12.setBackgroundImageAlignment((int) (byte) -1);
        double double20 = piePlot12.getInteriorGap();
        java.awt.Font font21 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot12.setNoDataMessageFont(font21);
        piePlot3.setLabelFont(font21);
        piePlot0.setLabelFont(font21);
        piePlot0.setSectionOutlinesVisible(false);
        int int27 = piePlot0.getBackgroundImageAlignment();
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup31 = piePlot30.getDatasetGroup();
        java.lang.String str32 = piePlot30.getPlotType();
        org.jfree.data.general.PieDataset pieDataset33 = piePlot30.getDataset();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState36 = piePlot0.initialise(graphics2D28, rectangle2D29, piePlot30, (java.lang.Integer) 1, plotRenderingInfo35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.14d + "'", double13 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.0d + "'", double17 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.08d + "'", double20 == 0.08d);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertNull(datasetGroup31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Pie Plot" + "'", str32, "Pie Plot");
        org.junit.Assert.assertNull(pieDataset33);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        java.awt.Stroke stroke2 = piePlot0.getBaseSectionOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        piePlot0.setDataset(pieDataset3);
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot6 = piePlot5.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor7 = piePlot5.getLabelDistributor();
        java.awt.Paint paint8 = piePlot5.getLabelOutlinePaint();
        boolean boolean9 = piePlot5.isOutlineVisible();
        java.awt.Paint paint10 = piePlot5.getNoDataMessagePaint();
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset12 = null;
        piePlot11.setDataset(pieDataset12);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator14 = piePlot11.getURLGenerator();
        float float15 = piePlot11.getForegroundAlpha();
        java.awt.Stroke stroke16 = piePlot11.getBaseSectionOutlineStroke();
        java.awt.Stroke stroke17 = piePlot11.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot();
        double double19 = piePlot18.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor20 = piePlot18.getLabelDistributor();
        double double21 = piePlot18.getMinimumArcAngleToDraw();
        java.awt.Paint paint22 = piePlot18.getBaseSectionOutlinePaint();
        double double23 = piePlot18.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = piePlot18.getSimpleLabelOffset();
        piePlot11.setLabelPadding(rectangleInsets24);
        piePlot5.setInsets(rectangleInsets24);
        piePlot0.setSimpleLabelOffset(rectangleInsets24);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(pieURLGenerator14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.14d + "'", double19 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0E-5d + "'", double21 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 4.0d + "'", double23 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets24);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
        float float3 = piePlot0.getForegroundAlpha();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot0.getLegendLabelToolTipGenerator();
        java.awt.Stroke stroke6 = piePlot0.getLabelOutlineStroke();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(pieSectionLabelGenerator5);
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        piePlot0.setExplodePercent((java.lang.Comparable) (-1), (double) (byte) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        piePlot0.axisChanged(axisChangeEvent8);
        piePlot0.setLabelLinkMargin((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYAreaChart("", "Pie Plot", "", xYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        java.awt.Paint paint3 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setNoDataMessagePaint(paint3);
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        piePlot5.setDataset(pieDataset6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot5.getURLGenerator();
        org.jfree.chart.plot.Plot plot9 = piePlot5.getRootPlot();
        java.awt.Stroke stroke10 = piePlot5.getLabelOutlineStroke();
        piePlot0.setLabelLinkStroke(stroke10);
        java.awt.Stroke stroke12 = piePlot0.getOutlineStroke();
        piePlot0.setSimpleLabels(false);
        double double15 = piePlot0.getMaximumLabelWidth();
        piePlot0.setLabelLinkMargin((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        float float4 = piePlot0.getForegroundAlpha();
        java.awt.Stroke stroke5 = piePlot0.getBaseSectionOutlineStroke();
        java.awt.Stroke stroke6 = piePlot0.getLabelLinkStroke();
        float float7 = piePlot0.getBackgroundImageAlpha();
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator9 = piePlot8.getLegendLabelGenerator();
        piePlot0.setLegendLabelGenerator(pieSectionLabelGenerator9);
        java.awt.Image image11 = piePlot0.getBackgroundImage();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator9);
        org.junit.Assert.assertNull(image11);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Image image4 = null;
        piePlot0.setBackgroundImage(image4);
        double double6 = piePlot0.getInteriorGap();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08d + "'", double6 == 0.08d);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        java.awt.Paint paint3 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setNoDataMessagePaint(paint3);
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        piePlot5.setDataset(pieDataset6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot5.getURLGenerator();
        org.jfree.chart.plot.Plot plot9 = piePlot5.getRootPlot();
        java.awt.Stroke stroke10 = piePlot5.getLabelOutlineStroke();
        piePlot0.setLabelLinkStroke(stroke10);
        piePlot0.setSimpleLabels(true);
        java.awt.Paint paint14 = piePlot0.getShadowPaint();
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot();
        piePlot15.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint18 = piePlot15.getLabelLinkPaint();
        piePlot0.setLabelBackgroundPaint(paint18);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor20 = piePlot0.getLabelDistributor();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor20);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.jfree.data.statistics.BoxAndWhiskerCategoryDataset boxAndWhiskerCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("hi!", "Pie Plot", "hi!", boxAndWhiskerCategoryDataset3, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYAreaChart("", "hi!", "", xYDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("", "hi!", "hi!", xYDataset3, true, true, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Stroke stroke3 = piePlot0.getOutlineStroke();
        piePlot0.setBackgroundImageAlignment((-1));
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(stroke3);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = piePlot0.getDrawingSupplier();
        double double6 = piePlot0.getLabelGap();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        piePlot0.setDataset(pieDataset7);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.025d + "'", double6 == 0.025d);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createRingChart("Pie Plot", pieDataset1, true, true, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = piePlot0.getDrawingSupplier();
        double double6 = piePlot0.getShadowXOffset();
        double double7 = piePlot0.getLabelLinkMargin();
        double double8 = piePlot0.getLabelGap();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        piePlot0.notifyListeners(plotChangeEvent9);
        boolean boolean11 = piePlot0.getLabelLinksVisible();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.025d + "'", double7 == 0.025d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.025d + "'", double8 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart3D("Pie Plot", "Pie Plot", "Pie Plot", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart3D("hi!", "", "Pie Plot", categoryDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.lang.String str3 = piePlot0.getPlotType();
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset5 = null;
        piePlot4.setDataset(pieDataset5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot4.getURLGenerator();
        float float8 = piePlot4.getForegroundAlpha();
        java.awt.Stroke stroke9 = piePlot4.getBaseSectionOutlineStroke();
        java.awt.Stroke stroke10 = piePlot4.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot11.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor13 = piePlot11.getLabelDistributor();
        double double14 = piePlot11.getMinimumArcAngleToDraw();
        java.awt.Paint paint15 = piePlot11.getBaseSectionOutlinePaint();
        double double16 = piePlot11.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = piePlot11.getSimpleLabelOffset();
        piePlot4.setLabelPadding(rectangleInsets17);
        piePlot0.setSimpleLabelOffset(rectangleInsets17);
        piePlot0.setMaximumLabelWidth((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets17);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        piePlot0.setBackgroundImageAlignment((int) (byte) -1);
        double double8 = piePlot0.getInteriorGap();
        java.awt.Font font9 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot0.setNoDataMessageFont(font9);
        java.awt.Paint paint11 = piePlot0.getLabelShadowPaint();
        java.awt.Image image12 = null;
        piePlot0.setBackgroundImage(image12);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent14 = null;
        piePlot0.axisChanged(axisChangeEvent14);
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot17 = piePlot16.getParent();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator18 = null;
        piePlot16.setToolTipGenerator(pieToolTipGenerator18);
        double double20 = piePlot16.getShadowYOffset();
        piePlot0.setParent((org.jfree.chart.plot.Plot) piePlot16);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(plot17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint3 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot0.setLabelShadowPaint(paint3);
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        piePlot5.setDataset(pieDataset6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot5.getURLGenerator();
        org.jfree.chart.plot.Plot plot9 = piePlot5.getRootPlot();
        java.awt.Stroke stroke10 = piePlot5.getLabelOutlineStroke();
        java.awt.Shape shape11 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot5.setLegendItemShape(shape11);
        boolean boolean13 = piePlot0.equals((java.lang.Object) piePlot5);
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot();
        double double15 = piePlot14.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor16 = piePlot14.getLabelDistributor();
        double double17 = piePlot14.getMinimumArcAngleToDraw();
        java.awt.Paint paint18 = piePlot14.getBaseSectionOutlinePaint();
        piePlot5.setBackgroundPaint(paint18);
        piePlot5.setLabelLinkMargin((double) 0);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-5d + "'", double17 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
        float float3 = piePlot0.getForegroundAlpha();
        piePlot0.setShadowYOffset((double) '#');
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelToolTipGenerator();
        piePlot0.setCircular(false, true);
        piePlot0.setLabelLinksVisible(true);
        boolean boolean7 = piePlot0.isOutlineVisible();
        java.awt.Paint paint8 = piePlot0.getLabelShadowPaint();
        org.junit.Assert.assertNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        piePlot0.setStartAngle((double) (byte) 10);
        piePlot0.setIgnoreZeroValues(true);
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setBackgroundImageAlpha((float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        boolean boolean4 = piePlot0.isOutlineVisible();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator5 = piePlot0.getToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup7 = piePlot6.getDatasetGroup();
        piePlot6.setBackgroundImageAlignment((int) 'a');
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot11.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor13 = piePlot11.getLabelDistributor();
        double double14 = piePlot11.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        piePlot11.drawBackgroundImage(graphics2D15, rectangle2D16);
        java.awt.Paint paint19 = piePlot11.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str20 = piePlot11.getNoDataMessage();
        java.awt.Paint paint21 = piePlot11.getLabelOutlinePaint();
        piePlot6.setSectionPaint((java.lang.Comparable) 1.0d, paint21);
        piePlot0.setLabelBackgroundPaint(paint21);
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.JFreeChart jFreeChart29 = org.jfree.chart.ChartFactory.createPieChart3D("Pie Plot", pieDataset25, false, true, true);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart29);
        java.awt.Paint paint31 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setLabelPaint(paint31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(pieToolTipGenerator5);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(jFreeChart29);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        piePlot0.setForegroundAlpha((float) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot0.setInsets(rectangleInsets4);
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        double double7 = piePlot6.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor8 = piePlot6.getLabelDistributor();
        double double9 = piePlot6.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        piePlot6.drawBackgroundImage(graphics2D10, rectangle2D11);
        java.awt.Paint paint14 = piePlot6.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font15 = piePlot6.getLabelFont();
        piePlot6.setSimpleLabels(false);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor18 = piePlot6.getLabelDistributor();
        piePlot0.setLabelDistributor(abstractPieLabelDistributor18);
        piePlot0.setInteriorGap((double) 0L);
        int int22 = piePlot0.getBackgroundImageAlignment();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator23 = null;
        piePlot0.setURLGenerator(pieURLGenerator23);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14d + "'", double7 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-5d + "'", double9 == 1.0E-5d);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("Pie Plot", pieDataset1, pieDataset2, (int) '#', true, false, false, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font9 = piePlot0.getLabelFont();
        piePlot0.setSimpleLabels(false);
        java.awt.Paint paint12 = piePlot0.getLabelPaint();
        piePlot0.setBackgroundImageAlignment((int) '#');
        java.awt.Image image15 = null;
        piePlot0.setBackgroundImage(image15);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("Pie Plot", pieDataset1, pieDataset2, (int) (byte) 10, false, true, false, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        java.awt.Stroke stroke2 = piePlot0.getBaseSectionOutlineStroke();
        piePlot0.setBackgroundAlpha(100.0f);
        float float5 = piePlot0.getForegroundAlpha();
        double double6 = piePlot0.getMaximumLabelWidth();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.14d + "'", double6 == 0.14d);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font9 = piePlot0.getLabelFont();
        piePlot0.setSimpleLabels(false);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = piePlot0.getLabelDistributor();
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        piePlot13.setDataset(pieDataset14);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = piePlot13.getURLGenerator();
        float float17 = piePlot13.getForegroundAlpha();
        java.awt.Stroke stroke18 = piePlot13.getBaseSectionOutlineStroke();
        piePlot0.setBaseSectionOutlineStroke(stroke18);
        org.jfree.chart.LegendItemCollection legendItemCollection20 = piePlot0.getLegendItems();
        piePlot0.setLabelLinksVisible(true);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertNull(pieURLGenerator16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNull(legendItemCollection20);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font9 = piePlot0.getLabelFont();
        piePlot0.setSimpleLabels(false);
        java.awt.Paint paint12 = piePlot0.getLabelPaint();
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setLabelOutlinePaint(paint13);
        piePlot0.setStartAngle((double) 100L);
        java.awt.Paint paint18 = piePlot0.getSectionOutlinePaint((java.lang.Comparable) (-1L));
        piePlot0.setExplodePercent((java.lang.Comparable) (short) 100, (double) '#');
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        double double23 = piePlot22.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup24 = piePlot22.getDatasetGroup();
        piePlot22.setOutlineVisible(true);
        boolean boolean27 = piePlot22.getSectionOutlinesVisible();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator28 = piePlot22.getLegendLabelGenerator();
        piePlot0.setLabelGenerator(pieSectionLabelGenerator28);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent30 = null;
        piePlot0.markerChanged(markerChangeEvent30);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(paint18);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.14d + "'", double23 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator28);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.jfree.data.xy.XYDataset xYDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPolarChart("Pie Plot", xYDataset1, false, false, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        java.awt.Stroke stroke5 = piePlot0.getLabelOutlineStroke();
        java.awt.Shape shape6 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot0.setLegendItemShape(shape6);
        java.awt.Stroke stroke8 = piePlot0.getLabelLinkStroke();
        java.awt.Font font9 = piePlot0.getNoDataMessageFont();
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator12 = piePlot11.getLegendLabelGenerator();
        double double13 = piePlot11.getMaximumLabelWidth();
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot();
        double double15 = piePlot14.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor16 = piePlot14.getLabelDistributor();
        double double17 = piePlot14.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        piePlot14.drawBackgroundImage(graphics2D18, rectangle2D19);
        java.awt.Paint paint22 = piePlot14.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font23 = piePlot14.getLabelFont();
        piePlot14.setSimpleLabels(false);
        java.awt.Paint paint26 = piePlot14.getLabelPaint();
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset28 = null;
        piePlot27.setDataset(pieDataset28);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator30 = piePlot27.getURLGenerator();
        piePlot27.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator33 = piePlot27.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot();
        double double35 = piePlot34.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor36 = piePlot34.getLabelDistributor();
        double double37 = piePlot34.getMinimumArcAngleToDraw();
        boolean boolean38 = piePlot34.getIgnoreZeroValues();
        boolean boolean39 = piePlot34.isSubplot();
        piePlot34.setCircular(false);
        java.awt.Paint paint43 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot34.setSectionOutlinePaint((java.lang.Comparable) "", paint43);
        piePlot27.setNoDataMessagePaint(paint43);
        piePlot14.setLabelBackgroundPaint(paint43);
        piePlot11.setShadowPaint(paint43);
        piePlot0.setSectionPaint((java.lang.Comparable) 1L, paint43);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.14d + "'", double13 == 0.14d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-5d + "'", double17 == 1.0E-5d);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNull(pieURLGenerator30);
        org.junit.Assert.assertNull(pieSectionLabelGenerator33);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.14d + "'", double35 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0E-5d + "'", double37 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(paint43);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        java.awt.Paint paint3 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setNoDataMessagePaint(paint3);
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        piePlot5.setDataset(pieDataset6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot5.getURLGenerator();
        org.jfree.chart.plot.Plot plot9 = piePlot5.getRootPlot();
        java.awt.Stroke stroke10 = piePlot5.getLabelOutlineStroke();
        piePlot0.setLabelLinkStroke(stroke10);
        org.jfree.chart.util.Rotation rotation12 = piePlot0.getDirection();
        org.jfree.chart.util.Rotation rotation13 = piePlot0.getDirection();
        java.awt.Image image14 = piePlot0.getBackgroundImage();
        java.awt.Paint paint15 = piePlot0.getLabelLinkPaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rotation12);
        org.junit.Assert.assertNotNull(rotation13);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        piePlot0.setBackgroundImageAlignment((int) (byte) -1);
        double double8 = piePlot0.getInteriorGap();
        java.awt.Paint paint9 = piePlot0.getShadowPaint();
        piePlot0.setIgnoreZeroValues(false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("hi!", "hi!", "", categoryDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        piePlot0.setBackgroundAlpha((float) (byte) 0);
        piePlot0.setStartAngle(100.0d);
        java.awt.Paint paint7 = piePlot0.getShadowPaint();
        boolean boolean8 = piePlot0.getIgnoreZeroValues();
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        piePlot0.setBackgroundImageAlignment((int) (byte) -1);
        piePlot0.setBackgroundImageAlpha((float) (short) 1);
        java.awt.Paint paint11 = piePlot0.getSectionOutlinePaint((java.lang.Comparable) 10.0d);
        piePlot0.setForegroundAlpha((float) 'a');
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator14 = piePlot0.getLegendLabelToolTipGenerator();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(pieSectionLabelGenerator14);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("hi!", "", "Pie Plot", categoryDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        boolean boolean4 = piePlot0.isOutlineVisible();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator5 = piePlot0.getToolTipGenerator();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLabelGenerator();
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double8 = piePlot7.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor9 = piePlot7.getLabelDistributor();
        double double10 = piePlot7.getMinimumArcAngleToDraw();
        java.awt.Paint paint11 = piePlot7.getBaseSectionOutlinePaint();
        java.awt.Paint paint12 = piePlot7.getBaseSectionPaint();
        java.awt.Paint paint13 = piePlot7.getShadowPaint();
        piePlot0.setBaseSectionOutlinePaint(paint13);
        java.awt.Stroke stroke15 = piePlot0.getLabelLinkStroke();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(pieToolTipGenerator5);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        java.util.Locale locale4 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart3D("", pieDataset1, false, false, locale4);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        double double6 = piePlot0.getMinimumArcAngleToDraw();
        piePlot0.setNoDataMessage("Pie Plot");
        java.awt.Paint paint9 = piePlot0.getNoDataMessagePaint();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot();
        double double13 = piePlot12.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup14 = piePlot12.getDatasetGroup();
        java.awt.Paint paint15 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot12.setNoDataMessagePaint(paint15);
        double double18 = piePlot12.getExplodePercent((java.lang.Comparable) (-1));
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot();
        double double21 = piePlot19.getExplodePercent((java.lang.Comparable) 0);
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset23 = null;
        piePlot22.setDataset(pieDataset23);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator25 = piePlot22.getURLGenerator();
        org.jfree.chart.plot.Plot plot26 = piePlot22.getRootPlot();
        java.awt.Stroke stroke27 = piePlot22.getLabelOutlineStroke();
        java.awt.Shape shape28 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot22.setLegendItemShape(shape28);
        java.awt.Stroke stroke30 = piePlot22.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot();
        double double32 = piePlot31.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor33 = piePlot31.getLabelDistributor();
        double double34 = piePlot31.getMinimumArcAngleToDraw();
        java.awt.Paint paint35 = piePlot31.getBaseSectionOutlinePaint();
        double double36 = piePlot31.getShadowYOffset();
        piePlot31.setBackgroundImageAlignment((int) (byte) -1);
        double double39 = piePlot31.getInteriorGap();
        java.awt.Font font40 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot31.setNoDataMessageFont(font40);
        piePlot22.setLabelFont(font40);
        piePlot19.setLabelFont(font40);
        piePlot12.setNoDataMessageFont(font40);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo46 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState47 = piePlot0.initialise(graphics2D10, rectangle2D11, piePlot12, (java.lang.Integer) 1, plotRenderingInfo46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-5d + "'", double6 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.14d + "'", double13 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNull(pieURLGenerator25);
        org.junit.Assert.assertNotNull(plot26);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.14d + "'", double32 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0E-5d + "'", double34 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 4.0d + "'", double36 == 4.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.08d + "'", double39 == 0.08d);
        org.junit.Assert.assertNotNull(font40);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        java.awt.Paint paint6 = piePlot0.getShadowPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator7 = piePlot0.getLegendLabelGenerator();
        java.awt.Paint paint8 = piePlot0.getLabelPaint();
        java.awt.Paint paint9 = piePlot0.getLabelPaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("hi!", "", "", categoryDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Stroke stroke7 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot0.setLabelLinkStroke(stroke7);
        boolean boolean9 = piePlot0.isOutlineVisible();
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot11 = piePlot10.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = piePlot10.getLabelDistributor();
        piePlot0.setParent((org.jfree.chart.plot.Plot) piePlot10);
        org.jfree.chart.plot.Plot plot14 = piePlot0.getRootPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        piePlot0.handleClick((int) '#', (int) (byte) 1, plotRenderingInfo17);
        org.jfree.data.general.DatasetGroup datasetGroup19 = piePlot0.getDatasetGroup();
        piePlot0.setLabelLinksVisible(true);
        org.jfree.data.general.PieDataset pieDataset22 = null;
        piePlot0.setDataset(pieDataset22);
        piePlot0.setBackgroundImageAlignment(10);
        java.lang.String str26 = piePlot0.getPlotType();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNull(datasetGroup19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Pie Plot" + "'", str26, "Pie Plot");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        double double6 = piePlot5.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup7 = piePlot5.getDatasetGroup();
        piePlot5.setOutlineVisible(true);
        boolean boolean11 = piePlot5.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot();
        double double13 = piePlot12.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor14 = piePlot12.getLabelDistributor();
        double double15 = piePlot12.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        piePlot12.drawBackgroundImage(graphics2D16, rectangle2D17);
        java.awt.Paint paint20 = piePlot12.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font21 = piePlot12.getLabelFont();
        piePlot5.setNoDataMessageFont(font21);
        boolean boolean23 = piePlot5.isOutlineVisible();
        double double24 = piePlot5.getLabelGap();
        java.awt.Paint paint25 = piePlot5.getLabelLinkPaint();
        piePlot0.setSectionPaint((java.lang.Comparable) 0.0d, paint25);
        double double27 = piePlot0.getLabelGap();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.14d + "'", double6 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.14d + "'", double13 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.025d + "'", double24 == 0.025d);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.025d + "'", double27 == 0.025d);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart3D("", "Pie Plot", "Pie Plot", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("hi!", "", "", xYDataset3, true, true, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        piePlot0.setBackgroundImageAlignment((int) 'a');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot0.getLabelDistributor();
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        piePlot5.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint8 = piePlot5.getLabelLinkPaint();
        piePlot0.setOutlinePaint(paint8);
        piePlot0.setIgnoreZeroValues(false);
        org.junit.Assert.assertNull(datasetGroup1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        piePlot0.setBackgroundImageAlignment((int) (byte) -1);
        double double8 = piePlot0.getInteriorGap();
        java.awt.Font font9 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot0.setNoDataMessageFont(font9);
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset12 = null;
        piePlot11.setDataset(pieDataset12);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator14 = piePlot11.getURLGenerator();
        piePlot11.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator17 = piePlot11.getLegendLabelToolTipGenerator();
        boolean boolean18 = piePlot11.getSimpleLabels();
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot();
        double double20 = piePlot19.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor21 = piePlot19.getLabelDistributor();
        double double22 = piePlot19.getMinimumArcAngleToDraw();
        java.awt.Paint paint23 = piePlot19.getBaseSectionOutlinePaint();
        double double24 = piePlot19.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = piePlot19.getSimpleLabelOffset();
        double double26 = piePlot19.getLabelLinkMargin();
        double double27 = piePlot19.getStartAngle();
        piePlot11.setParent((org.jfree.chart.plot.Plot) piePlot19);
        piePlot0.setParent((org.jfree.chart.plot.Plot) piePlot11);
        java.awt.Paint paint30 = piePlot0.getLabelBackgroundPaint();
        double double32 = piePlot0.getExplodePercent((java.lang.Comparable) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNull(pieURLGenerator14);
        org.junit.Assert.assertNull(pieSectionLabelGenerator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.14d + "'", double20 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0E-5d + "'", double22 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.025d + "'", double26 == 0.025d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 90.0d + "'", double27 == 90.0d);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str9 = piePlot0.getNoDataMessage();
        piePlot0.setNoDataMessage("hi!");
        java.awt.Stroke stroke12 = piePlot0.getOutlineStroke();
        int int13 = piePlot0.getPieIndex();
        piePlot0.setPieIndex((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedAreaChart("Pie Plot", "Pie Plot", "", categoryDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        piePlot0.setSectionOutlinesVisible(true);
        piePlot0.setIgnoreNullValues(false);
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        double double9 = piePlot8.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor10 = piePlot8.getLabelDistributor();
        double double11 = piePlot8.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        piePlot8.drawBackgroundImage(graphics2D12, rectangle2D13);
        java.awt.Paint paint16 = piePlot8.getSectionPaint((java.lang.Comparable) false);
        double double17 = piePlot8.getShadowXOffset();
        org.jfree.data.general.DatasetGroup datasetGroup18 = piePlot8.getDatasetGroup();
        org.jfree.chart.util.Rotation rotation19 = piePlot8.getDirection();
        piePlot0.setDirection(rotation19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14d + "'", double9 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-5d + "'", double11 == 1.0E-5d);
        org.junit.Assert.assertNull(paint16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.0d + "'", double17 == 4.0d);
        org.junit.Assert.assertNull(datasetGroup18);
        org.junit.Assert.assertNotNull(rotation19);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        piePlot0.setOutlineVisible(true);
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        double double5 = piePlot4.getMaximumLabelWidth();
        piePlot4.setForegroundAlpha((float) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot4.setInsets(rectangleInsets8);
        piePlot0.setLabelPadding(rectangleInsets8);
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot11.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor13 = piePlot11.getLabelDistributor();
        double double14 = piePlot11.getMinimumArcAngleToDraw();
        java.awt.Paint paint15 = piePlot11.getBaseSectionOutlinePaint();
        piePlot0.setLabelPaint(paint15);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        boolean boolean5 = piePlot0.getSectionOutlinesVisible();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelGenerator();
        boolean boolean7 = piePlot0.getSectionOutlinesVisible();
        org.jfree.data.general.PieDataset pieDataset8 = piePlot0.getDataset();
        java.awt.Stroke stroke10 = piePlot0.getSectionOutlineStroke((java.lang.Comparable) 0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(pieDataset8);
        org.junit.Assert.assertNull(stroke10);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        piePlot0.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelToolTipGenerator();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        java.awt.geom.Point2D point2D9 = null;
        org.jfree.chart.plot.PlotState plotState10 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.draw(graphics2D7, rectangle2D8, point2D9, plotState10, plotRenderingInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNull(pieSectionLabelGenerator6);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYAreaChart("hi!", "hi!", "hi!", xYDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedAreaChart("hi!", "hi!", "Pie Plot", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        piePlot0.setOutlineVisible(false);
        org.jfree.data.general.DatasetGroup datasetGroup7 = piePlot0.getDatasetGroup();
        boolean boolean8 = piePlot0.getIgnoreZeroValues();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        java.awt.geom.Point2D point2D11 = null;
        org.jfree.chart.plot.PlotState plotState12 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.draw(graphics2D9, rectangle2D10, point2D11, plotState12, plotRenderingInfo13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        piePlot0.setBackgroundImageAlignment((int) (byte) -1);
        double double8 = piePlot0.getInteriorGap();
        java.awt.Font font9 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot0.setNoDataMessageFont(font9);
        java.awt.Paint paint11 = piePlot0.getLabelShadowPaint();
        piePlot0.setShadowXOffset((double) (-1));
        double double14 = piePlot0.getShadowXOffset();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot5 = piePlot0.getRootPlot();
        piePlot0.setOutlineVisible(false);
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        double double9 = piePlot8.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor10 = piePlot8.getLabelDistributor();
        double double11 = piePlot8.getMinimumArcAngleToDraw();
        java.awt.Paint paint12 = piePlot8.getBaseSectionOutlinePaint();
        double double13 = piePlot8.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot8.getSimpleLabelOffset();
        java.awt.Stroke stroke15 = piePlot8.getLabelLinkStroke();
        piePlot0.setLabelOutlineStroke(stroke15);
        org.jfree.chart.plot.Plot plot17 = piePlot0.getParent();
        org.jfree.data.general.DatasetGroup datasetGroup18 = piePlot0.getDatasetGroup();
        java.awt.Paint paint19 = piePlot0.getLabelBackgroundPaint();
        double double20 = piePlot0.getInteriorGap();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14d + "'", double9 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-5d + "'", double11 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.0d + "'", double13 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(plot17);
        org.junit.Assert.assertNull(datasetGroup18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.08d + "'", double20 == 0.08d);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint3 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot0.setLabelShadowPaint(paint3);
        float float5 = piePlot0.getForegroundAlpha();
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot8 = piePlot7.getParent();
        boolean boolean9 = piePlot7.isCircular();
        java.awt.Paint paint10 = piePlot7.getLabelBackgroundPaint();
        piePlot0.setSectionOutlinePaint((java.lang.Comparable) 0.0d, paint10);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNull(plot8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("Pie Plot", "", "Pie Plot", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
        piePlot0.setCircular(true);
        org.jfree.chart.plot.Plot plot5 = piePlot0.getRootPlot();
        java.lang.Object obj6 = piePlot0.clone();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        java.awt.Stroke stroke5 = piePlot0.getLabelOutlineStroke();
        java.awt.Shape shape6 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot0.setLegendItemShape(shape6);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        piePlot0.markerChanged(markerChangeEvent8);
        java.awt.Paint paint10 = piePlot0.getLabelLinkPaint();
        java.awt.Paint paint11 = piePlot0.getNoDataMessagePaint();
        double double12 = piePlot0.getLabelGap();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.025d + "'", double12 == 0.025d);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        plot4.zoom((double) (-1.0f));
        org.jfree.chart.plot.Plot plot7 = plot4.getParent();
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        double double9 = piePlot8.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor10 = piePlot8.getLabelDistributor();
        double double11 = piePlot8.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        piePlot8.drawBackgroundImage(graphics2D12, rectangle2D13);
        java.awt.Paint paint16 = piePlot8.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font17 = piePlot8.getLabelFont();
        piePlot8.setSimpleLabels(false);
        java.awt.Paint paint20 = piePlot8.getLabelPaint();
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset22 = null;
        piePlot21.setDataset(pieDataset22);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator24 = piePlot21.getURLGenerator();
        piePlot21.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator27 = piePlot21.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot();
        double double29 = piePlot28.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor30 = piePlot28.getLabelDistributor();
        double double31 = piePlot28.getMinimumArcAngleToDraw();
        boolean boolean32 = piePlot28.getIgnoreZeroValues();
        boolean boolean33 = piePlot28.isSubplot();
        piePlot28.setCircular(false);
        java.awt.Paint paint37 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot28.setSectionOutlinePaint((java.lang.Comparable) "", paint37);
        piePlot21.setNoDataMessagePaint(paint37);
        piePlot8.setLabelBackgroundPaint(paint37);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor41 = piePlot8.getLabelDistributor();
        piePlot8.setExplodePercent((java.lang.Comparable) 0.4d, (double) (short) 1);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent45 = null;
        piePlot8.datasetChanged(datasetChangeEvent45);
        java.awt.Paint paint47 = piePlot8.getBackgroundPaint();
        plot4.setOutlinePaint(paint47);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNull(plot7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14d + "'", double9 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-5d + "'", double11 == 1.0E-5d);
        org.junit.Assert.assertNull(paint16);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(pieURLGenerator24);
        org.junit.Assert.assertNull(pieSectionLabelGenerator27);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.14d + "'", double29 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0E-5d + "'", double31 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor41);
        org.junit.Assert.assertNotNull(paint47);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Stroke stroke3 = piePlot0.getOutlineStroke();
        piePlot0.setPieIndex(100);
        int int6 = piePlot0.getBackgroundImageAlignment();
        java.awt.Stroke stroke7 = piePlot0.getLabelOutlineStroke();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator8 = piePlot0.getLabelGenerator();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = piePlot0.getLegendItems();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator8);
        org.junit.Assert.assertNull(legendItemCollection9);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        piePlot0.setSectionOutlinesVisible(true);
        piePlot0.setIgnoreNullValues(false);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        java.awt.geom.Point2D point2D10 = null;
        org.jfree.chart.plot.PlotState plotState11 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.draw(graphics2D8, rectangle2D9, point2D10, plotState11, plotRenderingInfo12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font9 = piePlot0.getLabelFont();
        piePlot0.setSimpleLabels(false);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = piePlot0.getLabelDistributor();
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        piePlot13.setDataset(pieDataset14);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = piePlot13.getURLGenerator();
        float float17 = piePlot13.getForegroundAlpha();
        java.awt.Stroke stroke18 = piePlot13.getBaseSectionOutlineStroke();
        piePlot0.setBaseSectionOutlineStroke(stroke18);
        org.jfree.chart.LegendItemCollection legendItemCollection20 = piePlot0.getLegendItems();
        double double21 = piePlot0.getLabelLinkMargin();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertNull(pieURLGenerator16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNull(legendItemCollection20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.025d + "'", double21 == 0.025d);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        double double4 = piePlot0.getShadowXOffset();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot0.getLabelGenerator();
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setInteriorGap((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (-1.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator5);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Stroke stroke7 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot0.setLabelLinkStroke(stroke7);
        boolean boolean9 = piePlot0.isOutlineVisible();
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot11 = piePlot10.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = piePlot10.getLabelDistributor();
        piePlot0.setParent((org.jfree.chart.plot.Plot) piePlot10);
        org.jfree.chart.plot.Plot plot14 = piePlot0.getRootPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        piePlot0.handleClick((int) '#', (int) (byte) 1, plotRenderingInfo17);
        double double19 = piePlot0.getInteriorGap();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.08d + "'", double19 == 0.08d);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.lang.String str3 = piePlot0.getPlotType();
        org.jfree.data.general.DatasetGroup datasetGroup4 = piePlot0.getDatasetGroup();
        java.awt.Paint paint5 = piePlot0.getOutlinePaint();
        java.awt.Stroke stroke6 = piePlot0.getBaseSectionOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = piePlot0.getLabelPadding();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Paint paint7 = piePlot0.getNoDataMessagePaint();
        java.awt.Stroke stroke9 = piePlot0.getSectionOutlineStroke((java.lang.Comparable) 52.0d);
        org.jfree.chart.util.Rotation rotation10 = piePlot0.getDirection();
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot11.getMaximumLabelWidth();
        piePlot11.setForegroundAlpha((float) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot11.setInsets(rectangleInsets15);
        piePlot0.setInsets(rectangleInsets15, false);
        java.awt.Paint paint20 = piePlot0.getSectionOutlinePaint((java.lang.Comparable) 90.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(stroke9);
        org.junit.Assert.assertNotNull(rotation10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNull(paint20);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font9 = piePlot0.getLabelFont();
        piePlot0.setSimpleLabels(false);
        java.awt.Paint paint12 = piePlot0.getLabelPaint();
        piePlot0.setIgnoreNullValues(true);
        piePlot0.setForegroundAlpha((float) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        java.awt.Shape shape2 = piePlot0.getLegendItemShape();
        double double3 = piePlot0.getMaximumLabelWidth();
        double double4 = piePlot0.getStartAngle();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.14d + "'", double3 == 0.14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 90.0d + "'", double4 == 90.0d);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        boolean boolean6 = piePlot0.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double8 = piePlot7.getMaximumLabelWidth();
        piePlot7.setForegroundAlpha(100.0f);
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot11.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor13 = piePlot11.getLabelDistributor();
        double double14 = piePlot11.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        piePlot11.drawBackgroundImage(graphics2D15, rectangle2D16);
        java.awt.Paint paint19 = piePlot11.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str20 = piePlot11.getNoDataMessage();
        java.awt.Paint paint21 = piePlot11.getLabelOutlinePaint();
        piePlot7.setBaseSectionOutlinePaint(paint21);
        piePlot0.setParent((org.jfree.chart.plot.Plot) piePlot7);
        float float24 = piePlot0.getBackgroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = piePlot0.getInsets();
        piePlot0.setSimpleLabels(false);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent28 = null;
        piePlot0.datasetChanged(datasetChangeEvent28);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 1.0f + "'", float24 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets25);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        piePlot0.setOutlineVisible(true);
        piePlot0.setLabelLinkMargin((double) (short) -1);
        piePlot0.setForegroundAlpha(1.0f);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator8 = piePlot0.getLegendLabelGenerator();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator8);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str9 = piePlot0.getNoDataMessage();
        piePlot0.setNoDataMessage("hi!");
        java.awt.Stroke stroke12 = piePlot0.getOutlineStroke();
        java.awt.Shape shape13 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot0.setLegendItemShape(shape13);
        piePlot0.setLabelLinksVisible(false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart3D("", "hi!", "", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint3 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot0.setLabelShadowPaint(paint3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        piePlot0.handleClick((int) ' ', (int) (short) -1, plotRenderingInfo7);
        double double9 = piePlot0.getLabelGap();
        piePlot0.setLabelLinkMargin((double) 100);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.025d + "'", double9 == 0.025d);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart("Pie Plot", pieDataset1, true, true, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getShadowYOffset();
        org.jfree.chart.plot.PiePlot piePlot3 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup4 = piePlot3.getDatasetGroup();
        java.lang.String str5 = piePlot3.getPlotType();
        java.awt.Stroke stroke6 = piePlot3.getBaseSectionOutlineStroke();
        piePlot0.setParent((org.jfree.chart.plot.Plot) piePlot3);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str9 = piePlot0.getNoDataMessage();
        java.awt.Paint paint10 = piePlot0.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot11.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor13 = piePlot11.getLabelDistributor();
        double double14 = piePlot11.getMinimumArcAngleToDraw();
        java.awt.Paint paint15 = piePlot11.getBaseSectionOutlinePaint();
        double double16 = piePlot11.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = piePlot11.getSimpleLabelOffset();
        piePlot11.setIgnoreNullValues(false);
        piePlot0.setParent((org.jfree.chart.plot.Plot) piePlot11);
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup22 = piePlot21.getDatasetGroup();
        piePlot21.setBackgroundImageAlignment((int) 'a');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor25 = piePlot21.getLabelDistributor();
        piePlot11.setLabelDistributor(abstractPieLabelDistributor25);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNull(datasetGroup22);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor25);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        piePlot0.setDataset(pieDataset3);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator5 = null;
        piePlot0.setLegendLabelURLGenerator(pieURLGenerator5);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = piePlot0.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Stroke stroke7 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot0.setLabelLinkStroke(stroke7);
        boolean boolean9 = piePlot0.isOutlineVisible();
        boolean boolean10 = piePlot0.getSectionOutlinesVisible();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator11 = null;
        piePlot0.setURLGenerator(pieURLGenerator11);
        double double13 = piePlot0.getLabelLinkMargin();
        piePlot0.setLabelGap((double) 1L);
        float float16 = piePlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.025d + "'", double13 == 0.025d);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        double double4 = piePlot0.getShadowXOffset();
        piePlot0.setForegroundAlpha((float) 1L);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = piePlot0.getToolTipGenerator();
        piePlot0.setBackgroundAlpha(0.0f);
        boolean boolean10 = piePlot0.getSectionOutlinesVisible();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
        org.junit.Assert.assertNull(pieToolTipGenerator7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        piePlot0.setBackgroundImageAlignment((int) 'a');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot0.getLabelDistributor();
        boolean boolean5 = piePlot0.getSectionOutlinesVisible();
        org.junit.Assert.assertNull(datasetGroup1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getNoDataMessagePaint();
        double double4 = piePlot0.getInteriorGap();
        java.awt.Stroke stroke5 = piePlot0.getBaseSectionOutlineStroke();
        java.awt.Stroke stroke6 = piePlot0.getLabelLinkStroke();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08d + "'", double4 == 0.08d);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        java.awt.Stroke stroke5 = piePlot0.getLabelOutlineStroke();
        java.awt.Shape shape6 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot0.setLegendItemShape(shape6);
        java.awt.Stroke stroke8 = piePlot0.getLabelLinkStroke();
        java.awt.Font font9 = piePlot0.getNoDataMessageFont();
        piePlot0.setMinimumArcAngleToDraw((double) (byte) 0);
        boolean boolean12 = piePlot0.getSectionOutlinesVisible();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent13 = null;
        piePlot0.datasetChanged(datasetChangeEvent13);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        java.awt.Paint paint3 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setNoDataMessagePaint(paint3);
        double double6 = piePlot0.getExplodePercent((java.lang.Comparable) (-1));
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double8 = piePlot7.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor9 = piePlot7.getLabelDistributor();
        double double10 = piePlot7.getMinimumArcAngleToDraw();
        java.awt.Paint paint11 = piePlot7.getBaseSectionOutlinePaint();
        java.awt.Paint paint12 = piePlot7.getBaseSectionPaint();
        piePlot7.setCircular(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = piePlot7.getDrawingSupplier();
        piePlot0.setDrawingSupplier(drawingSupplier15);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(drawingSupplier15);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.lang.String str3 = piePlot0.getPlotType();
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset5 = null;
        piePlot4.setDataset(pieDataset5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot4.getURLGenerator();
        float float8 = piePlot4.getForegroundAlpha();
        java.awt.Stroke stroke9 = piePlot4.getBaseSectionOutlineStroke();
        java.awt.Stroke stroke10 = piePlot4.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot11.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor13 = piePlot11.getLabelDistributor();
        double double14 = piePlot11.getMinimumArcAngleToDraw();
        java.awt.Paint paint15 = piePlot11.getBaseSectionOutlinePaint();
        double double16 = piePlot11.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = piePlot11.getSimpleLabelOffset();
        piePlot4.setLabelPadding(rectangleInsets17);
        piePlot0.setSimpleLabelOffset(rectangleInsets17);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator20 = piePlot0.getLegendLabelGenerator();
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawOutline(graphics2D21, rectangle2D22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator20);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        boolean boolean6 = piePlot0.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double8 = piePlot7.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor9 = piePlot7.getLabelDistributor();
        double double10 = piePlot7.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot7.drawBackgroundImage(graphics2D11, rectangle2D12);
        java.awt.Paint paint15 = piePlot7.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font16 = piePlot7.getLabelFont();
        piePlot0.setNoDataMessageFont(font16);
        boolean boolean18 = piePlot0.isOutlineVisible();
        double double19 = piePlot0.getLabelGap();
        org.jfree.chart.plot.Plot plot20 = piePlot0.getRootPlot();
        piePlot0.setCircular(true, false);
        int int24 = piePlot0.getBackgroundImageAlignment();
        java.awt.Stroke stroke25 = piePlot0.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.025d + "'", double19 == 0.025d);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertNotNull(stroke25);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        float float9 = piePlot0.getForegroundAlpha();
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot11 = piePlot10.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = piePlot10.getLabelDistributor();
        java.awt.Paint paint13 = piePlot10.getLabelOutlinePaint();
        boolean boolean14 = piePlot10.isOutlineVisible();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator15 = piePlot10.getToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup17 = piePlot16.getDatasetGroup();
        piePlot16.setBackgroundImageAlignment((int) 'a');
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot();
        double double22 = piePlot21.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor23 = piePlot21.getLabelDistributor();
        double double24 = piePlot21.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        piePlot21.drawBackgroundImage(graphics2D25, rectangle2D26);
        java.awt.Paint paint29 = piePlot21.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str30 = piePlot21.getNoDataMessage();
        java.awt.Paint paint31 = piePlot21.getLabelOutlinePaint();
        piePlot16.setSectionPaint((java.lang.Comparable) 1.0d, paint31);
        piePlot10.setLabelBackgroundPaint(paint31);
        piePlot0.setOutlinePaint(paint31);
        double double35 = piePlot0.getMinimumArcAngleToDraw();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(pieToolTipGenerator15);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.14d + "'", double22 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0E-5d + "'", double24 == 1.0E-5d);
        org.junit.Assert.assertNull(paint29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0E-5d + "'", double35 == 1.0E-5d);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("Pie Plot", "", "hi!", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        piePlot0.setShadowYOffset((double) (short) 1);
        java.awt.Stroke stroke11 = piePlot0.getLabelLinkStroke();
        java.awt.Stroke stroke12 = piePlot0.getLabelLinkStroke();
        piePlot0.setSectionOutlinesVisible(true);
        piePlot0.setSectionOutlinesVisible(false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot5 = piePlot0.getRootPlot();
        piePlot0.setOutlineVisible(false);
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        double double9 = piePlot8.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor10 = piePlot8.getLabelDistributor();
        double double11 = piePlot8.getMinimumArcAngleToDraw();
        java.awt.Paint paint12 = piePlot8.getBaseSectionOutlinePaint();
        double double13 = piePlot8.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot8.getSimpleLabelOffset();
        java.awt.Stroke stroke15 = piePlot8.getLabelLinkStroke();
        piePlot0.setLabelOutlineStroke(stroke15);
        org.jfree.chart.plot.Plot plot17 = piePlot0.getParent();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator18 = piePlot0.getLabelGenerator();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        java.awt.geom.Point2D point2D21 = null;
        org.jfree.chart.plot.PlotState plotState22 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.draw(graphics2D19, rectangle2D20, point2D21, plotState22, plotRenderingInfo23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14d + "'", double9 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-5d + "'", double11 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.0d + "'", double13 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(plot17);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator18);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font9 = piePlot0.getLabelFont();
        piePlot0.setSimpleLabels(false);
        java.awt.Paint paint12 = piePlot0.getLabelPaint();
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setLabelOutlinePaint(paint13);
        piePlot0.setStartAngle((double) 100L);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator17 = piePlot0.getToolTipGenerator();
        piePlot0.setSimpleLabels(false);
        java.awt.Paint paint21 = piePlot0.getSectionOutlinePaint((java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(pieToolTipGenerator17);
        org.junit.Assert.assertNull(paint21);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.util.TableOrder tableOrder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createMultiplePieChart("", categoryDataset1, tableOrder2, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        piePlot0.setDataset(pieDataset3);
        int int5 = piePlot0.getPieIndex();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelGenerator();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = piePlot0.getDrawingSupplier();
        piePlot0.setNoDataMessage("hi!");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(drawingSupplier7);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.lang.String str3 = piePlot0.getPlotType();
        org.jfree.data.general.DatasetGroup datasetGroup4 = piePlot0.getDatasetGroup();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        java.awt.geom.Point2D point2D7 = null;
        org.jfree.chart.plot.PlotState plotState8 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.draw(graphics2D5, rectangle2D6, point2D7, plotState8, plotRenderingInfo9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertNull(datasetGroup4);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        java.awt.Paint paint3 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setNoDataMessagePaint(paint3);
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        piePlot5.setDataset(pieDataset6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot5.getURLGenerator();
        org.jfree.chart.plot.Plot plot9 = piePlot5.getRootPlot();
        java.awt.Stroke stroke10 = piePlot5.getLabelOutlineStroke();
        piePlot0.setLabelLinkStroke(stroke10);
        java.awt.Stroke stroke12 = piePlot0.getOutlineStroke();
        piePlot0.setSimpleLabels(false);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator15 = null;
        piePlot0.setLegendLabelURLGenerator(pieURLGenerator15);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str9 = piePlot0.getNoDataMessage();
        java.awt.Paint paint10 = piePlot0.getLabelOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot0.getLabelPadding();
        boolean boolean12 = piePlot0.getSimpleLabels();
        piePlot0.setBackgroundAlpha((float) 10);
        java.awt.Paint paint15 = piePlot0.getLabelBackgroundPaint();
        java.awt.Paint paint16 = piePlot0.getLabelOutlinePaint();
        double double18 = piePlot0.getExplodePercent((java.lang.Comparable) 100L);
        piePlot0.setShadowYOffset((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("", "", "hi!", xYDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str9 = piePlot0.getNoDataMessage();
        java.awt.Paint paint10 = piePlot0.getLabelOutlinePaint();
        java.awt.Stroke stroke11 = piePlot0.getLabelOutlineStroke();
        java.awt.Paint paint12 = piePlot0.getLabelOutlinePaint();
        int int13 = piePlot0.getPieIndex();
        java.awt.Paint paint14 = piePlot0.getLabelLinkPaint();
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot();
        double double16 = piePlot15.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor17 = piePlot15.getLabelDistributor();
        double double18 = piePlot15.getMinimumArcAngleToDraw();
        java.awt.Paint paint19 = piePlot15.getBaseSectionOutlinePaint();
        double double20 = piePlot15.getShadowYOffset();
        piePlot15.setBackgroundImageAlignment((int) (byte) -1);
        double double23 = piePlot15.getInteriorGap();
        java.awt.Image image24 = null;
        piePlot15.setBackgroundImage(image24);
        java.awt.Stroke stroke26 = piePlot15.getLabelLinkStroke();
        piePlot0.setLabelOutlineStroke(stroke26);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.14d + "'", double16 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-5d + "'", double18 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.08d + "'", double23 == 0.08d);
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Paint paint7 = piePlot0.getNoDataMessagePaint();
        piePlot0.setMinimumArcAngleToDraw((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart("", pieDataset1, true, false, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        boolean boolean4 = piePlot0.isOutlineVisible();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator5 = piePlot0.getToolTipGenerator();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        piePlot7.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint10 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot7.setLabelShadowPaint(paint10);
        piePlot0.setLabelPaint(paint10);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(pieToolTipGenerator5);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        double double9 = piePlot0.getShadowXOffset();
        org.jfree.data.general.DatasetGroup datasetGroup10 = piePlot0.getDatasetGroup();
        org.jfree.chart.util.Rotation rotation11 = piePlot0.getDirection();
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot();
        double double13 = piePlot12.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor14 = piePlot12.getLabelDistributor();
        double double15 = piePlot12.getMinimumArcAngleToDraw();
        java.awt.Paint paint16 = piePlot12.getBaseSectionOutlinePaint();
        double double17 = piePlot12.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot12.getSimpleLabelOffset();
        piePlot12.setIgnoreNullValues(false);
        java.awt.Font font21 = piePlot12.getLabelFont();
        piePlot0.setLabelFont(font21);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNull(datasetGroup10);
        org.junit.Assert.assertNotNull(rotation11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.14d + "'", double13 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.0d + "'", double17 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(font21);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createCandlestickChart("hi!", "", "", oHLCDataset3, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("Pie Plot", "Pie Plot", "hi!", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        boolean boolean2 = piePlot0.isCircular();
        java.lang.String str3 = piePlot0.getPlotType();
        boolean boolean4 = piePlot0.isSubplot();
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        double double6 = piePlot5.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor7 = piePlot5.getLabelDistributor();
        double double8 = piePlot5.getMinimumArcAngleToDraw();
        java.awt.Paint paint9 = piePlot5.getBaseSectionOutlinePaint();
        piePlot5.setIgnoreNullValues(false);
        java.awt.Stroke stroke12 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot5.setLabelLinkStroke(stroke12);
        boolean boolean14 = piePlot5.isOutlineVisible();
        boolean boolean15 = piePlot5.getSectionOutlinesVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = piePlot5.getLabelPadding();
        piePlot0.setLabelPadding(rectangleInsets16);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.14d + "'", double6 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(rectangleInsets16);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepAreaChart("", "", "Pie Plot", xYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("", "Pie Plot", "hi!", tableXYDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getShadowYOffset();
        piePlot0.setIgnoreNullValues(false);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        java.util.Locale locale9 = null;
        org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart3D("hi!", pieDataset6, true, false, locale9);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        piePlot0.setLabelLinksVisible(false);
        boolean boolean14 = piePlot0.getIgnoreNullValues();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        piePlot0.setForegroundAlpha((float) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot0.setInsets(rectangleInsets4);
        double double6 = piePlot0.getLabelGap();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.025d + "'", double6 == 0.025d);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("hi!", "Pie Plot", "", xYDataset3, true, true, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreNullValues();
        boolean boolean5 = piePlot0.getIgnoreNullValues();
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        piePlot6.setDataset(pieDataset7);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator9 = piePlot6.getURLGenerator();
        piePlot6.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator12 = piePlot6.getLegendLabelToolTipGenerator();
        boolean boolean13 = piePlot6.getSimpleLabels();
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot();
        double double15 = piePlot14.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor16 = piePlot14.getLabelDistributor();
        double double17 = piePlot14.getMinimumArcAngleToDraw();
        java.awt.Paint paint18 = piePlot14.getBaseSectionOutlinePaint();
        double double19 = piePlot14.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = piePlot14.getSimpleLabelOffset();
        double double21 = piePlot14.getLabelLinkMargin();
        double double22 = piePlot14.getStartAngle();
        piePlot6.setParent((org.jfree.chart.plot.Plot) piePlot14);
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.JFreeChart jFreeChart29 = org.jfree.chart.ChartFactory.createRingChart("Pie Plot", pieDataset25, true, false, false);
        piePlot6.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart29);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart29);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(pieURLGenerator9);
        org.junit.Assert.assertNull(pieSectionLabelGenerator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-5d + "'", double17 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4.0d + "'", double19 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.025d + "'", double21 == 0.025d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 90.0d + "'", double22 == 90.0d);
        org.junit.Assert.assertNotNull(jFreeChart29);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Stroke stroke3 = piePlot0.getOutlineStroke();
        piePlot0.setPieIndex(100);
        piePlot0.setLabelLinkMargin((double) (short) 100);
        double double8 = piePlot0.getStartAngle();
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot();
        double double10 = piePlot9.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor11 = piePlot9.getLabelDistributor();
        double double12 = piePlot9.getMinimumArcAngleToDraw();
        java.awt.Paint paint13 = piePlot9.getBaseSectionOutlinePaint();
        double double14 = piePlot9.getShadowYOffset();
        piePlot9.setBackgroundImageAlignment((int) (byte) -1);
        double double17 = piePlot9.getInteriorGap();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent18 = null;
        piePlot9.axisChanged(axisChangeEvent18);
        boolean boolean20 = piePlot0.equals((java.lang.Object) piePlot9);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.08d + "'", double17 == 0.08d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint3 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot0.setLabelShadowPaint(paint3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        piePlot0.handleClick((int) ' ', (int) (short) -1, plotRenderingInfo7);
        double double9 = piePlot0.getLabelGap();
        piePlot0.setCircular(true);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.025d + "'", double9 == 0.025d);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double2 = piePlot0.getExplodePercent((java.lang.Comparable) 0);
        org.jfree.chart.plot.PiePlot piePlot3 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset4 = null;
        piePlot3.setDataset(pieDataset4);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot3.getURLGenerator();
        org.jfree.chart.plot.Plot plot7 = piePlot3.getRootPlot();
        java.awt.Stroke stroke8 = piePlot3.getLabelOutlineStroke();
        java.awt.Shape shape9 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot3.setLegendItemShape(shape9);
        java.awt.Stroke stroke11 = piePlot3.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot();
        double double13 = piePlot12.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor14 = piePlot12.getLabelDistributor();
        double double15 = piePlot12.getMinimumArcAngleToDraw();
        java.awt.Paint paint16 = piePlot12.getBaseSectionOutlinePaint();
        double double17 = piePlot12.getShadowYOffset();
        piePlot12.setBackgroundImageAlignment((int) (byte) -1);
        double double20 = piePlot12.getInteriorGap();
        java.awt.Font font21 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot12.setNoDataMessageFont(font21);
        piePlot3.setLabelFont(font21);
        piePlot0.setLabelFont(font21);
        piePlot0.setSectionOutlinesVisible(false);
        int int27 = piePlot0.getBackgroundImageAlignment();
        double double28 = piePlot0.getLabelGap();
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup30 = piePlot29.getDatasetGroup();
        piePlot29.setBackgroundImageAlignment((int) 'a');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor33 = piePlot29.getLabelDistributor();
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot();
        piePlot34.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint37 = piePlot34.getLabelLinkPaint();
        piePlot29.setOutlinePaint(paint37);
        piePlot0.setShadowPaint(paint37);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertNotNull(plot7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.14d + "'", double13 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.0d + "'", double17 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.08d + "'", double20 == 0.08d);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.025d + "'", double28 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup30);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor33);
        org.junit.Assert.assertNotNull(paint37);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Stroke stroke7 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot0.setLabelLinkStroke(stroke7);
        boolean boolean9 = piePlot0.isOutlineVisible();
        boolean boolean10 = piePlot0.getSectionOutlinesVisible();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator11 = null;
        piePlot0.setURLGenerator(pieURLGenerator11);
        double double13 = piePlot0.getLabelLinkMargin();
        piePlot0.setLabelGap((double) 1L);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator16 = piePlot0.getToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset19 = null;
        piePlot18.setDataset(pieDataset19);
        int int21 = piePlot18.getPieIndex();
        double double22 = piePlot18.getShadowXOffset();
        java.awt.Stroke stroke23 = piePlot18.getOutlineStroke();
        piePlot0.setSectionOutlineStroke((java.lang.Comparable) 1.0E-5d, stroke23);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.025d + "'", double13 == 0.025d);
        org.junit.Assert.assertNull(pieToolTipGenerator16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("hi!", "", "hi!", xYDataset3, true, false, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("hi!", "", "", tableXYDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setIgnoreNullValues(false);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = null;
        piePlot0.setLegendLabelURLGenerator(pieURLGenerator3);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawBackground(graphics2D5, rectangle2D6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        org.jfree.data.xy.XYDataset xYDataset5 = null;
        org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createPolarChart("", xYDataset5, false, false, true);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart9);
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot11.getMaximumLabelWidth();
        piePlot11.setForegroundAlpha((float) (short) 0);
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot();
        double double16 = piePlot15.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor17 = piePlot15.getLabelDistributor();
        double double18 = piePlot15.getMinimumArcAngleToDraw();
        java.awt.Paint paint19 = piePlot15.getBaseSectionOutlinePaint();
        double double20 = piePlot15.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot15.getSimpleLabelOffset();
        piePlot11.setInsets(rectangleInsets21);
        piePlot0.setInsets(rectangleInsets21, false);
        boolean boolean25 = piePlot0.isCircular();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent26 = null;
        piePlot0.axisChanged(axisChangeEvent26);
        java.awt.Paint paint28 = piePlot0.getLabelShadowPaint();
        piePlot0.setLabelLinksVisible(false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.14d + "'", double16 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-5d + "'", double18 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", pieDataset1, pieDataset2, (int) 'a', false, true, true, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createHighLowChart("", "hi!", "Pie Plot", oHLCDataset3, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("hi!", "Pie Plot", "Pie Plot", windDataset3, false, false, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        piePlot0.setSectionOutlinesVisible(true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = null;
        piePlot0.setURLGenerator(pieURLGenerator6);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator8 = piePlot0.getLabelGenerator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator8);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font9 = piePlot0.getLabelFont();
        piePlot0.setSimpleLabels(false);
        java.awt.Paint paint12 = piePlot0.getLabelPaint();
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setLabelOutlinePaint(paint13);
        piePlot0.setStartAngle((double) 100L);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator17 = piePlot0.getToolTipGenerator();
        piePlot0.setSimpleLabels(false);
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot();
        double double22 = piePlot21.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor23 = piePlot21.getLabelDistributor();
        double double24 = piePlot21.getMinimumArcAngleToDraw();
        java.awt.Paint paint25 = piePlot21.getBaseSectionOutlinePaint();
        double double26 = piePlot21.getShadowYOffset();
        java.awt.Stroke stroke27 = piePlot21.getOutlineStroke();
        piePlot0.setSectionOutlineStroke((java.lang.Comparable) (byte) 100, stroke27);
        org.jfree.data.general.DatasetGroup datasetGroup29 = piePlot0.getDatasetGroup();
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup31 = piePlot30.getDatasetGroup();
        piePlot30.setBackgroundImageAlignment((int) 'a');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor34 = piePlot30.getLabelDistributor();
        org.jfree.chart.plot.PiePlot piePlot35 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset36 = null;
        piePlot35.setDataset(pieDataset36);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator38 = piePlot35.getURLGenerator();
        piePlot35.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator41 = piePlot35.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot();
        double double43 = piePlot42.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor44 = piePlot42.getLabelDistributor();
        double double45 = piePlot42.getMinimumArcAngleToDraw();
        boolean boolean46 = piePlot42.getIgnoreZeroValues();
        boolean boolean47 = piePlot42.isSubplot();
        piePlot42.setCircular(false);
        java.awt.Paint paint51 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot42.setSectionOutlinePaint((java.lang.Comparable) "", paint51);
        piePlot35.setNoDataMessagePaint(paint51);
        piePlot30.setBaseSectionOutlinePaint(paint51);
        piePlot0.setLabelBackgroundPaint(paint51);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(pieToolTipGenerator17);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.14d + "'", double22 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0E-5d + "'", double24 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.0d + "'", double26 == 4.0d);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNull(datasetGroup29);
        org.junit.Assert.assertNull(datasetGroup31);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor34);
        org.junit.Assert.assertNull(pieURLGenerator38);
        org.junit.Assert.assertNull(pieSectionLabelGenerator41);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.14d + "'", double43 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0E-5d + "'", double45 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(paint51);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot0.setToolTipGenerator(pieToolTipGenerator2);
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset7 = null;
        org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "hi!", "", boxAndWhiskerXYDataset7, false);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart9);
        java.awt.Paint paint11 = piePlot0.getNoDataMessagePaint();
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot();
        double double13 = piePlot12.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor14 = piePlot12.getLabelDistributor();
        double double15 = piePlot12.getMinimumArcAngleToDraw();
        java.awt.Paint paint16 = piePlot12.getBaseSectionOutlinePaint();
        double double17 = piePlot12.getShadowYOffset();
        piePlot12.setBackgroundImageAlignment((int) (byte) -1);
        double double20 = piePlot12.getInteriorGap();
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot();
        double double22 = piePlot21.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor23 = piePlot21.getLabelDistributor();
        double double24 = piePlot21.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        piePlot21.drawBackgroundImage(graphics2D25, rectangle2D26);
        java.awt.Paint paint29 = piePlot21.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font30 = piePlot21.getLabelFont();
        piePlot12.setLabelFont(font30);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator32 = piePlot12.getLabelGenerator();
        piePlot0.setLegendLabelGenerator(pieSectionLabelGenerator32);
        org.junit.Assert.assertNull(datasetGroup1);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.14d + "'", double13 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.0d + "'", double17 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.08d + "'", double20 == 0.08d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.14d + "'", double22 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0E-5d + "'", double24 == 1.0E-5d);
        org.junit.Assert.assertNull(paint29);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator32);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        piePlot0.setBackgroundImageAlignment((int) (byte) -1);
        double double8 = piePlot0.getInteriorGap();
        java.awt.Font font9 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot0.setNoDataMessageFont(font9);
        java.awt.Paint paint11 = piePlot0.getLabelShadowPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent12 = null;
        piePlot0.markerChanged(markerChangeEvent12);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        piePlot0.markerChanged(markerChangeEvent14);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawBackground(graphics2D16, rectangle2D17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double2 = piePlot0.getExplodePercent((java.lang.Comparable) 0);
        piePlot0.setIgnoreZeroValues(false);
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        double double6 = piePlot5.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor7 = piePlot5.getLabelDistributor();
        java.awt.Paint paint8 = piePlot5.getLabelOutlinePaint();
        org.jfree.data.xy.XYDataset xYDataset10 = null;
        org.jfree.chart.JFreeChart jFreeChart14 = org.jfree.chart.ChartFactory.createPolarChart("", xYDataset10, false, false, true);
        piePlot5.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart14);
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot();
        double double17 = piePlot16.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor18 = piePlot16.getLabelDistributor();
        double double19 = piePlot16.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        piePlot16.drawBackgroundImage(graphics2D20, rectangle2D21);
        java.awt.Paint paint24 = piePlot16.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font25 = piePlot16.getLabelFont();
        piePlot16.setSimpleLabels(false);
        java.awt.Paint paint28 = piePlot16.getLabelPaint();
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset30 = null;
        piePlot29.setDataset(pieDataset30);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator32 = piePlot29.getURLGenerator();
        piePlot29.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator35 = piePlot29.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot();
        double double37 = piePlot36.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor38 = piePlot36.getLabelDistributor();
        double double39 = piePlot36.getMinimumArcAngleToDraw();
        boolean boolean40 = piePlot36.getIgnoreZeroValues();
        boolean boolean41 = piePlot36.isSubplot();
        piePlot36.setCircular(false);
        java.awt.Paint paint45 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot36.setSectionOutlinePaint((java.lang.Comparable) "", paint45);
        piePlot29.setNoDataMessagePaint(paint45);
        piePlot16.setLabelBackgroundPaint(paint45);
        piePlot5.setLabelLinkPaint(paint45);
        piePlot0.setLabelPaint(paint45);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.14d + "'", double6 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(jFreeChart14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.14d + "'", double17 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0E-5d + "'", double19 == 1.0E-5d);
        org.junit.Assert.assertNull(paint24);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNull(pieURLGenerator32);
        org.junit.Assert.assertNull(pieSectionLabelGenerator35);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.14d + "'", double37 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0E-5d + "'", double39 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(paint45);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str9 = piePlot0.getNoDataMessage();
        java.awt.Paint paint10 = piePlot0.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot11.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor13 = piePlot11.getLabelDistributor();
        double double14 = piePlot11.getMinimumArcAngleToDraw();
        java.awt.Paint paint15 = piePlot11.getBaseSectionOutlinePaint();
        double double16 = piePlot11.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = piePlot11.getSimpleLabelOffset();
        piePlot11.setIgnoreNullValues(false);
        piePlot0.setParent((org.jfree.chart.plot.Plot) piePlot11);
        piePlot0.setPieIndex(0);
        piePlot0.setIgnoreNullValues(false);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator25 = null;
        piePlot0.setLegendLabelURLGenerator(pieURLGenerator25);
        double double27 = piePlot0.getLabelLinkMargin();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.025d + "'", double27 == 0.025d);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelToolTipGenerator();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawBackground(graphics2D2, rectangle2D3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pieSectionLabelGenerator1);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        java.awt.Paint paint4 = piePlot0.getShadowPaint();
        int int5 = piePlot0.getPieIndex();
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        piePlot0.addChangeListener(plotChangeListener6);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        piePlot0.setOutlineVisible(true);
        piePlot0.setLabelLinkMargin((double) (short) -1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        piePlot0.handleClick((int) '4', (int) (short) 1, plotRenderingInfo8);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
        double double3 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        double double5 = piePlot4.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup6 = piePlot4.getDatasetGroup();
        piePlot4.setOutlineVisible(true);
        boolean boolean10 = piePlot4.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot11.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor13 = piePlot11.getLabelDistributor();
        double double14 = piePlot11.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        piePlot11.drawBackgroundImage(graphics2D15, rectangle2D16);
        java.awt.Paint paint19 = piePlot11.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font20 = piePlot11.getLabelFont();
        piePlot4.setNoDataMessageFont(font20);
        boolean boolean22 = piePlot4.isOutlineVisible();
        double double23 = piePlot4.getLabelGap();
        java.awt.Paint paint24 = piePlot4.getLabelLinkPaint();
        java.awt.Paint paint25 = piePlot4.getNoDataMessagePaint();
        piePlot0.setShadowPaint(paint25);
        double double27 = piePlot0.getLabelLinkMargin();
        piePlot0.setMinimumArcAngleToDraw((double) '4');
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.14d + "'", double3 == 0.14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.025d + "'", double23 == 0.025d);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.025d + "'", double27 == 0.025d);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.lang.String str3 = piePlot0.getPlotType();
        org.jfree.data.general.DatasetGroup datasetGroup4 = piePlot0.getDatasetGroup();
        piePlot0.setIgnoreNullValues(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setInsets(rectangleInsets7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertNull(datasetGroup4);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createRingChart("hi!", pieDataset1, false, true, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        double double5 = piePlot0.getLabelGap();
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        double double7 = piePlot6.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor8 = piePlot6.getLabelDistributor();
        double double9 = piePlot6.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        piePlot6.drawBackgroundImage(graphics2D10, rectangle2D11);
        java.awt.Paint paint14 = piePlot6.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font15 = piePlot6.getLabelFont();
        piePlot6.setSimpleLabels(false);
        java.awt.Paint paint18 = piePlot6.getLabelPaint();
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot6.setLabelOutlinePaint(paint19);
        piePlot6.setStartAngle((double) 100L);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator23 = piePlot6.getToolTipGenerator();
        java.awt.Paint paint24 = piePlot6.getLabelBackgroundPaint();
        piePlot0.setLabelLinkPaint(paint24);
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot();
        double double27 = piePlot26.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup28 = piePlot26.getDatasetGroup();
        java.awt.Paint paint29 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot26.setNoDataMessagePaint(paint29);
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset32 = null;
        piePlot31.setDataset(pieDataset32);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator34 = piePlot31.getURLGenerator();
        org.jfree.chart.plot.Plot plot35 = piePlot31.getRootPlot();
        java.awt.Stroke stroke36 = piePlot31.getLabelOutlineStroke();
        piePlot26.setLabelLinkStroke(stroke36);
        java.awt.Stroke stroke38 = piePlot26.getOutlineStroke();
        java.awt.Shape shape39 = piePlot26.getLegendItemShape();
        piePlot26.setInteriorGap((double) 0.0f);
        boolean boolean42 = piePlot26.isOutlineVisible();
        java.awt.Stroke stroke43 = piePlot26.getLabelLinkStroke();
        boolean boolean44 = piePlot0.equals((java.lang.Object) stroke43);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14d + "'", double7 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-5d + "'", double9 == 1.0E-5d);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(pieToolTipGenerator23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.14d + "'", double27 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNull(pieURLGenerator34);
        org.junit.Assert.assertNotNull(plot35);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot0.getSimpleLabelOffset();
        java.awt.Stroke stroke7 = piePlot0.getLabelLinkStroke();
        java.awt.Image image8 = null;
        piePlot0.setBackgroundImage(image8);
        java.awt.Stroke stroke10 = piePlot0.getBaseSectionOutlineStroke();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        boolean boolean6 = piePlot0.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double8 = piePlot7.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor9 = piePlot7.getLabelDistributor();
        double double10 = piePlot7.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot7.drawBackgroundImage(graphics2D11, rectangle2D12);
        java.awt.Paint paint15 = piePlot7.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font16 = piePlot7.getLabelFont();
        piePlot0.setNoDataMessageFont(font16);
        boolean boolean18 = piePlot0.isOutlineVisible();
        double double19 = piePlot0.getLabelGap();
        org.jfree.chart.plot.Plot plot20 = piePlot0.getRootPlot();
        piePlot0.setCircular(true, false);
        int int24 = piePlot0.getBackgroundImageAlignment();
        boolean boolean25 = piePlot0.getLabelLinksVisible();
        piePlot0.setShadowYOffset((double) ' ');
        java.awt.Paint paint28 = piePlot0.getLabelOutlinePaint();
        piePlot0.setExplodePercent((java.lang.Comparable) 0.5f, (double) 1.0f);
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot();
        double double33 = piePlot32.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor34 = piePlot32.getLabelDistributor();
        double double35 = piePlot32.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D36 = null;
        java.awt.geom.Rectangle2D rectangle2D37 = null;
        piePlot32.drawBackgroundImage(graphics2D36, rectangle2D37);
        java.awt.Paint paint40 = piePlot32.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font41 = piePlot32.getLabelFont();
        piePlot32.setSimpleLabels(false);
        java.awt.Paint paint44 = piePlot32.getLabelPaint();
        java.awt.Paint paint45 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot32.setLabelOutlinePaint(paint45);
        piePlot32.setStartAngle((double) 100L);
        java.awt.Paint paint50 = piePlot32.getSectionOutlinePaint((java.lang.Comparable) (-1L));
        piePlot32.setExplodePercent((java.lang.Comparable) (short) 100, (double) '#');
        java.awt.Paint paint54 = piePlot32.getLabelPaint();
        piePlot0.setBackgroundPaint(paint54);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.025d + "'", double19 == 0.025d);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.14d + "'", double33 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0E-5d + "'", double35 == 1.0E-5d);
        org.junit.Assert.assertNull(paint40);
        org.junit.Assert.assertNotNull(font41);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNull(paint50);
        org.junit.Assert.assertNotNull(paint54);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedAreaChart("hi!", "hi!", "", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        piePlot0.setStartAngle((double) (byte) 10);
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double8 = piePlot7.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor9 = piePlot7.getLabelDistributor();
        double double10 = piePlot7.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot7.drawBackgroundImage(graphics2D11, rectangle2D12);
        java.awt.Paint paint15 = piePlot7.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font16 = piePlot7.getLabelFont();
        piePlot7.setSimpleLabels(false);
        piePlot7.setMinimumArcAngleToDraw((double) 100);
        boolean boolean21 = piePlot7.isOutlineVisible();
        java.awt.Paint paint22 = piePlot7.getBaseSectionOutlinePaint();
        piePlot0.setSectionOutlinePaint((java.lang.Comparable) 4.0d, paint22);
        java.awt.Paint paint24 = piePlot0.getBackgroundPaint();
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot();
        double double26 = piePlot25.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup27 = piePlot25.getDatasetGroup();
        piePlot25.setOutlineVisible(true);
        boolean boolean31 = piePlot25.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot();
        double double33 = piePlot32.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor34 = piePlot32.getLabelDistributor();
        double double35 = piePlot32.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D36 = null;
        java.awt.geom.Rectangle2D rectangle2D37 = null;
        piePlot32.drawBackgroundImage(graphics2D36, rectangle2D37);
        java.awt.Paint paint40 = piePlot32.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font41 = piePlot32.getLabelFont();
        piePlot25.setNoDataMessageFont(font41);
        boolean boolean43 = piePlot25.isOutlineVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = piePlot25.getInsets();
        java.awt.Stroke stroke45 = piePlot25.getLabelOutlineStroke();
        piePlot0.setBaseSectionOutlineStroke(stroke45);
        double double47 = piePlot0.getLabelGap();
        piePlot0.setPieIndex((int) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.14d + "'", double26 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.14d + "'", double33 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0E-5d + "'", double35 == 1.0E-5d);
        org.junit.Assert.assertNull(paint40);
        org.junit.Assert.assertNotNull(font41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(rectangleInsets44);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.025d + "'", double47 == 0.025d);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("", "Pie Plot", "hi!", categoryDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        piePlot0.setBackgroundImageAlignment((int) 'a');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot0.getLabelDistributor();
        double double6 = piePlot0.getExplodePercent((java.lang.Comparable) 90.0d);
        java.lang.String str7 = piePlot0.getPlotType();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        piePlot0.notifyListeners(plotChangeEvent8);
        org.junit.Assert.assertNull(datasetGroup1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Pie Plot" + "'", str7, "Pie Plot");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        java.lang.String str2 = piePlot0.getPlotType();
        java.awt.Stroke stroke3 = piePlot0.getBaseSectionOutlineStroke();
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset5 = null;
        piePlot4.setDataset(pieDataset5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot4.getURLGenerator();
        piePlot4.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator10 = piePlot4.getLegendLabelToolTipGenerator();
        boolean boolean11 = piePlot4.getSimpleLabels();
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot();
        double double13 = piePlot12.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor14 = piePlot12.getLabelDistributor();
        double double15 = piePlot12.getMinimumArcAngleToDraw();
        java.awt.Paint paint16 = piePlot12.getBaseSectionOutlinePaint();
        double double17 = piePlot12.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot12.getSimpleLabelOffset();
        double double19 = piePlot12.getLabelLinkMargin();
        double double20 = piePlot12.getStartAngle();
        piePlot4.setParent((org.jfree.chart.plot.Plot) piePlot12);
        java.awt.Paint paint22 = piePlot12.getLabelShadowPaint();
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot();
        double double24 = piePlot23.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor25 = piePlot23.getLabelDistributor();
        double double26 = piePlot23.getMinimumArcAngleToDraw();
        boolean boolean27 = piePlot23.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot28 = piePlot23.getRootPlot();
        piePlot23.setOutlineVisible(false);
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot();
        double double32 = piePlot31.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor33 = piePlot31.getLabelDistributor();
        double double34 = piePlot31.getMinimumArcAngleToDraw();
        java.awt.Paint paint35 = piePlot31.getBaseSectionOutlinePaint();
        double double36 = piePlot31.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = piePlot31.getSimpleLabelOffset();
        java.awt.Stroke stroke38 = piePlot31.getLabelLinkStroke();
        piePlot23.setLabelOutlineStroke(stroke38);
        org.jfree.chart.plot.Plot plot40 = piePlot23.getParent();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator41 = piePlot23.getLabelGenerator();
        piePlot12.setLegendLabelGenerator(pieSectionLabelGenerator41);
        boolean boolean43 = piePlot0.equals((java.lang.Object) piePlot12);
        org.junit.Assert.assertNull(datasetGroup1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Pie Plot" + "'", str2, "Pie Plot");
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNull(pieSectionLabelGenerator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.14d + "'", double13 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.0d + "'", double17 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.025d + "'", double19 == 0.025d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 90.0d + "'", double20 == 90.0d);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.14d + "'", double24 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0E-5d + "'", double26 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(plot28);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.14d + "'", double32 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0E-5d + "'", double34 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 4.0d + "'", double36 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets37);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNull(plot40);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        java.awt.Paint paint6 = piePlot0.getShadowPaint();
        org.jfree.chart.plot.Plot plot7 = piePlot0.getParent();
        boolean boolean8 = piePlot0.isSubplot();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(plot7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        piePlot0.setExplodePercent((java.lang.Comparable) (-1), (double) (byte) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        piePlot0.axisChanged(axisChangeEvent8);
        double double10 = piePlot0.getMaximumLabelWidth();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        java.awt.Paint paint3 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setNoDataMessagePaint(paint3);
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        piePlot5.setDataset(pieDataset6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot5.getURLGenerator();
        org.jfree.chart.plot.Plot plot9 = piePlot5.getRootPlot();
        java.awt.Stroke stroke10 = piePlot5.getLabelOutlineStroke();
        piePlot0.setLabelLinkStroke(stroke10);
        piePlot0.setSimpleLabels(true);
        java.awt.Paint paint14 = piePlot0.getShadowPaint();
        double double15 = piePlot0.getShadowXOffset();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", pieDataset1, pieDataset2, 100, true, false, true, locale7, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        piePlot0.setShadowYOffset((double) (short) 1);
        java.awt.Stroke stroke11 = piePlot0.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset13 = null;
        piePlot12.setDataset(pieDataset13);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator15 = piePlot12.getURLGenerator();
        piePlot12.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator18 = piePlot12.getLegendLabelToolTipGenerator();
        boolean boolean19 = piePlot12.getSimpleLabels();
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot();
        double double21 = piePlot20.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor22 = piePlot20.getLabelDistributor();
        double double23 = piePlot20.getMinimumArcAngleToDraw();
        java.awt.Paint paint24 = piePlot20.getBaseSectionOutlinePaint();
        double double25 = piePlot20.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = piePlot20.getSimpleLabelOffset();
        double double27 = piePlot20.getLabelLinkMargin();
        double double28 = piePlot20.getStartAngle();
        piePlot12.setParent((org.jfree.chart.plot.Plot) piePlot20);
        boolean boolean30 = piePlot12.getIgnoreZeroValues();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = piePlot12.getInsets();
        org.jfree.data.xy.OHLCDataset oHLCDataset35 = null;
        org.jfree.chart.JFreeChart jFreeChart37 = org.jfree.chart.ChartFactory.createHighLowChart("hi!", "hi!", "", oHLCDataset35, true);
        piePlot12.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart37);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier39 = piePlot12.getDrawingSupplier();
        piePlot0.setParent((org.jfree.chart.plot.Plot) piePlot12);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(pieURLGenerator15);
        org.junit.Assert.assertNull(pieSectionLabelGenerator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.14d + "'", double21 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0E-5d + "'", double23 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.0d + "'", double25 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.025d + "'", double27 == 0.025d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 90.0d + "'", double28 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(jFreeChart37);
        org.junit.Assert.assertNotNull(drawingSupplier39);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createRingChart("", pieDataset1, false, true, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.lang.String str3 = piePlot0.getPlotType();
        org.jfree.data.general.DatasetGroup datasetGroup4 = piePlot0.getDatasetGroup();
        java.awt.Paint paint5 = piePlot0.getOutlinePaint();
        double double6 = piePlot0.getMaximumLabelWidth();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.14d + "'", double6 == 0.14d);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font9 = piePlot0.getLabelFont();
        piePlot0.setSimpleLabels(false);
        piePlot0.setMinimumArcAngleToDraw((double) 100);
        org.jfree.data.general.DatasetGroup datasetGroup14 = piePlot0.getDatasetGroup();
        double double15 = piePlot0.getShadowYOffset();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("", "", false, "Pie Plot", intervalXYDataset4, plotOrientation5, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double2 = piePlot0.getExplodePercent((java.lang.Comparable) 0);
        piePlot0.setIgnoreZeroValues(false);
        piePlot0.zoom((double) 1L);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator7 = piePlot0.getLabelGenerator();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator7);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("Pie Plot", "hi!", "Pie Plot", intervalCategoryDataset3, true, true, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.jfree.data.xy.XYDataset xYDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPolarChart("", xYDataset1, true, true, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        double double4 = piePlot0.getShadowXOffset();
        piePlot0.zoom((double) 1.0f);
        java.awt.Shape shape7 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        piePlot0.setLegendItemShape(shape7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createHistogram("Pie Plot", "", "hi!", intervalXYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot5 = piePlot0.getRootPlot();
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        double double7 = piePlot6.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor8 = piePlot6.getLabelDistributor();
        double double9 = piePlot6.getMinimumArcAngleToDraw();
        java.awt.Paint paint10 = piePlot6.getBaseSectionOutlinePaint();
        double double11 = piePlot6.getShadowYOffset();
        piePlot6.setBackgroundImageAlignment((int) (byte) -1);
        java.awt.Paint paint14 = piePlot6.getLabelPaint();
        piePlot0.setShadowPaint(paint14);
        java.awt.Paint paint16 = piePlot0.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot();
        double double18 = piePlot17.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor19 = piePlot17.getLabelDistributor();
        double double20 = piePlot17.getMinimumArcAngleToDraw();
        java.awt.Paint paint21 = piePlot17.getBaseSectionOutlinePaint();
        java.awt.Paint paint22 = piePlot17.getBaseSectionPaint();
        java.awt.Paint paint23 = piePlot17.getShadowPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator24 = piePlot17.getLegendLabelGenerator();
        piePlot0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator24);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14d + "'", double7 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-5d + "'", double9 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.0d + "'", double11 == 4.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.14d + "'", double18 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E-5d + "'", double20 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator24);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        piePlot0.setBackgroundImageAlignment((int) (byte) -1);
        java.awt.Paint paint8 = piePlot0.getLabelPaint();
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot();
        double double10 = piePlot9.getMaximumLabelWidth();
        piePlot9.setForegroundAlpha((float) (short) 0);
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        double double14 = piePlot13.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor15 = piePlot13.getLabelDistributor();
        double double16 = piePlot13.getMinimumArcAngleToDraw();
        java.awt.Paint paint17 = piePlot13.getBaseSectionOutlinePaint();
        double double18 = piePlot13.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = piePlot13.getSimpleLabelOffset();
        piePlot9.setInsets(rectangleInsets19);
        piePlot0.setLabelPadding(rectangleInsets19);
        java.awt.Paint paint22 = piePlot0.getLabelShadowPaint();
        float float23 = piePlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.14d + "'", double14 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-5d + "'", double16 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.5f + "'", float23 == 0.5f);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("", "", "Pie Plot", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        java.awt.Paint paint3 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setNoDataMessagePaint(paint3);
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        piePlot5.setDataset(pieDataset6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot5.getURLGenerator();
        org.jfree.chart.plot.Plot plot9 = piePlot5.getRootPlot();
        java.awt.Stroke stroke10 = piePlot5.getLabelOutlineStroke();
        piePlot0.setLabelLinkStroke(stroke10);
        org.jfree.chart.util.Rotation rotation12 = piePlot0.getDirection();
        org.jfree.chart.util.Rotation rotation13 = piePlot0.getDirection();
        org.jfree.data.general.DatasetGroup datasetGroup14 = piePlot0.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rotation12);
        org.junit.Assert.assertNotNull(rotation13);
        org.junit.Assert.assertNull(datasetGroup14);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("", "", "Pie Plot", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font9 = piePlot0.getLabelFont();
        piePlot0.setSimpleLabels(false);
        java.awt.Paint paint12 = piePlot0.getLabelPaint();
        piePlot0.setIgnoreNullValues(true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator15 = piePlot0.getLegendLabelURLGenerator();
        java.awt.Paint paint17 = piePlot0.getSectionOutlinePaint((java.lang.Comparable) 100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(pieURLGenerator15);
        org.junit.Assert.assertNull(paint17);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        double double5 = piePlot0.getLabelGap();
        double double6 = piePlot0.getStartAngle();
        double double7 = piePlot0.getShadowYOffset();
        piePlot0.setCircular(false, false);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 90.0d + "'", double6 == 90.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str9 = piePlot0.getNoDataMessage();
        java.awt.Paint paint10 = piePlot0.getLabelOutlinePaint();
        java.awt.Stroke stroke11 = piePlot0.getLabelOutlineStroke();
        java.lang.String str12 = piePlot0.getPlotType();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = piePlot0.getDrawingSupplier();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pie Plot" + "'", str12, "Pie Plot");
        org.junit.Assert.assertNotNull(drawingSupplier13);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.util.TableOrder tableOrder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createMultiplePieChart("hi!", categoryDataset1, tableOrder2, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        double double5 = piePlot0.getLabelGap();
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        double double7 = piePlot6.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor8 = piePlot6.getLabelDistributor();
        double double9 = piePlot6.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        piePlot6.drawBackgroundImage(graphics2D10, rectangle2D11);
        java.awt.Paint paint14 = piePlot6.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font15 = piePlot6.getLabelFont();
        piePlot6.setSimpleLabels(false);
        java.awt.Paint paint18 = piePlot6.getLabelPaint();
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot6.setLabelOutlinePaint(paint19);
        piePlot6.setStartAngle((double) 100L);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator23 = piePlot6.getToolTipGenerator();
        java.awt.Paint paint24 = piePlot6.getLabelBackgroundPaint();
        piePlot0.setLabelLinkPaint(paint24);
        org.jfree.chart.plot.Plot plot26 = piePlot0.getParent();
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setInteriorGap(100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (100.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14d + "'", double7 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-5d + "'", double9 == 1.0E-5d);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(pieToolTipGenerator23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNull(plot26);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        java.awt.Stroke stroke2 = piePlot0.getBaseSectionOutlineStroke();
        org.jfree.chart.plot.PiePlot piePlot3 = new org.jfree.chart.plot.PiePlot();
        double double4 = piePlot3.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor5 = piePlot3.getLabelDistributor();
        double double6 = piePlot3.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        piePlot3.drawBackgroundImage(graphics2D7, rectangle2D8);
        java.awt.Paint paint11 = piePlot3.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font12 = piePlot3.getLabelFont();
        piePlot3.setSimpleLabels(false);
        java.awt.Paint paint15 = piePlot3.getLabelPaint();
        piePlot3.setBackgroundImageAlignment((int) '#');
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3.getInsets();
        piePlot0.setInsets(rectangleInsets18, true);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.14d + "'", double4 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-5d + "'", double6 == 1.0E-5d);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(rectangleInsets18);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        piePlot0.setBackgroundAlpha((float) (byte) 0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot0.getLegendLabelGenerator();
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        piePlot7.setDataset(pieDataset8);
        int int10 = piePlot7.getPieIndex();
        double double11 = piePlot7.getShadowXOffset();
        java.awt.Stroke stroke12 = piePlot7.getOutlineStroke();
        piePlot0.setSectionOutlineStroke((java.lang.Comparable) 1L, stroke12);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.0d + "'", double11 == 4.0d);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        java.awt.Paint paint3 = piePlot0.getLabelPaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
        float float3 = piePlot0.getForegroundAlpha();
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        double double5 = piePlot4.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor6 = piePlot4.getLabelDistributor();
        double double7 = piePlot4.getMinimumArcAngleToDraw();
        java.awt.Paint paint8 = piePlot4.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot4.getDrawingSupplier();
        double double10 = piePlot4.getShadowXOffset();
        java.awt.Paint paint11 = piePlot4.getLabelLinkPaint();
        java.awt.Paint paint12 = piePlot4.getLabelLinkPaint();
        piePlot0.setLabelOutlinePaint(paint12);
        piePlot0.setOutlineVisible(false);
        java.awt.Paint paint16 = piePlot0.getNoDataMessagePaint();
        piePlot0.setLabelLinksVisible(true);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-5d + "'", double7 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Stroke stroke7 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot0.setLabelLinkStroke(stroke7);
        boolean boolean9 = piePlot0.isOutlineVisible();
        piePlot0.zoom((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", pieDataset1, pieDataset2, 0, false, false, true, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart("Pie Plot", pieDataset1, false, false, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        java.awt.Paint paint2 = piePlot0.getLabelPaint();
        java.awt.Image image3 = piePlot0.getBackgroundImage();
        java.awt.Stroke stroke5 = piePlot0.getSectionOutlineStroke((java.lang.Comparable) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNull(stroke5);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("", "Pie Plot", "hi!", xYDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart3D("hi!", "Pie Plot", "hi!", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedAreaChart("", "hi!", "Pie Plot", categoryDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Stroke stroke7 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot0.setLabelLinkStroke(stroke7);
        boolean boolean9 = piePlot0.isOutlineVisible();
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot11 = piePlot10.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = piePlot10.getLabelDistributor();
        piePlot0.setParent((org.jfree.chart.plot.Plot) piePlot10);
        boolean boolean14 = piePlot0.getSimpleLabels();
        piePlot0.setForegroundAlpha((float) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        piePlot0.setBackgroundImageAlignment((int) (byte) -1);
        double double8 = piePlot0.getInteriorGap();
        java.awt.Font font9 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot0.setNoDataMessageFont(font9);
        java.awt.Paint paint11 = piePlot0.getLabelShadowPaint();
        double double12 = piePlot0.getShadowYOffset();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        piePlot6.setDataset(pieDataset7);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator9 = piePlot6.getURLGenerator();
        piePlot6.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator12 = piePlot6.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        double double14 = piePlot13.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor15 = piePlot13.getLabelDistributor();
        double double16 = piePlot13.getMinimumArcAngleToDraw();
        boolean boolean17 = piePlot13.getIgnoreZeroValues();
        boolean boolean18 = piePlot13.isSubplot();
        piePlot13.setCircular(false);
        java.awt.Paint paint22 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot13.setSectionOutlinePaint((java.lang.Comparable) "", paint22);
        piePlot6.setNoDataMessagePaint(paint22);
        piePlot0.setSectionPaint((java.lang.Comparable) 52.0d, paint22);
        boolean boolean26 = piePlot0.getLabelLinksVisible();
        boolean boolean27 = piePlot0.isSubplot();
        float float28 = piePlot0.getForegroundAlpha();
        java.awt.Paint paint29 = piePlot0.getBackgroundPaint();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNull(pieURLGenerator9);
        org.junit.Assert.assertNull(pieSectionLabelGenerator12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.14d + "'", double14 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-5d + "'", double16 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.0f + "'", float28 == 1.0f);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        boolean boolean6 = piePlot0.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double8 = piePlot7.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor9 = piePlot7.getLabelDistributor();
        double double10 = piePlot7.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot7.drawBackgroundImage(graphics2D11, rectangle2D12);
        java.awt.Paint paint15 = piePlot7.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font16 = piePlot7.getLabelFont();
        piePlot7.setSimpleLabels(false);
        java.awt.Paint paint19 = piePlot7.getLabelPaint();
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset21 = null;
        piePlot20.setDataset(pieDataset21);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator23 = piePlot20.getURLGenerator();
        piePlot20.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator26 = piePlot20.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot();
        double double28 = piePlot27.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor29 = piePlot27.getLabelDistributor();
        double double30 = piePlot27.getMinimumArcAngleToDraw();
        boolean boolean31 = piePlot27.getIgnoreZeroValues();
        boolean boolean32 = piePlot27.isSubplot();
        piePlot27.setCircular(false);
        java.awt.Paint paint36 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot27.setSectionOutlinePaint((java.lang.Comparable) "", paint36);
        piePlot20.setNoDataMessagePaint(paint36);
        piePlot7.setLabelBackgroundPaint(paint36);
        piePlot0.setBaseSectionPaint(paint36);
        java.awt.Paint paint41 = piePlot0.getBaseSectionOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset42 = piePlot0.getDataset();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(pieURLGenerator23);
        org.junit.Assert.assertNull(pieSectionLabelGenerator26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.14d + "'", double28 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0E-5d + "'", double30 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNull(pieDataset42);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("hi!", "", "", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("Pie Plot", "hi!", "hi!", xYDataset3, true, true, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot0.setToolTipGenerator(pieToolTipGenerator2);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot0.getLabelDistributor();
        java.awt.Paint paint6 = piePlot0.getSectionPaint((java.lang.Comparable) 'a');
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
        org.junit.Assert.assertNull(paint6);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        java.awt.Paint paint2 = piePlot0.getLabelPaint();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot0.notifyListeners(plotChangeEvent3);
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot5.getLegendLabelToolTipGenerator();
        piePlot5.setCircular(false, true);
        java.awt.Font font10 = piePlot5.getLabelFont();
        piePlot0.setNoDataMessageFont(font10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(font10);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedAreaChart("hi!", "Pie Plot", "Pie Plot", categoryDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreNullValues();
        org.jfree.data.general.PieDataset pieDataset5 = null;
        piePlot0.setDataset(pieDataset5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot0.getURLGenerator();
        java.awt.Stroke stroke8 = piePlot0.getLabelOutlineStroke();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator9 = piePlot0.getLegendLabelURLGenerator();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNull(pieURLGenerator9);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        org.jfree.chart.plot.Plot plot2 = piePlot0.getParent();
        org.jfree.chart.plot.PiePlot piePlot3 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset4 = null;
        piePlot3.setDataset(pieDataset4);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot3.getURLGenerator();
        float float7 = piePlot3.getForegroundAlpha();
        java.awt.Stroke stroke8 = piePlot3.getBaseSectionOutlineStroke();
        java.awt.Stroke stroke9 = piePlot3.getLabelLinkStroke();
        float float10 = piePlot3.getBackgroundImageAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot3.getSimpleLabelOffset();
        piePlot0.setLabelPadding(rectangleInsets11);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        double double6 = piePlot0.getMinimumArcAngleToDraw();
        piePlot0.setNoDataMessage("Pie Plot");
        double double9 = piePlot0.getLabelGap();
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        double double11 = piePlot10.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup12 = piePlot10.getDatasetGroup();
        piePlot10.setOutlineVisible(true);
        boolean boolean16 = piePlot10.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot();
        double double18 = piePlot17.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor19 = piePlot17.getLabelDistributor();
        double double20 = piePlot17.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        piePlot17.drawBackgroundImage(graphics2D21, rectangle2D22);
        java.awt.Paint paint25 = piePlot17.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font26 = piePlot17.getLabelFont();
        piePlot10.setNoDataMessageFont(font26);
        boolean boolean28 = piePlot10.isOutlineVisible();
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot();
        double double30 = piePlot29.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor31 = piePlot29.getLabelDistributor();
        double double32 = piePlot29.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D33 = null;
        java.awt.geom.Rectangle2D rectangle2D34 = null;
        piePlot29.drawBackgroundImage(graphics2D33, rectangle2D34);
        java.awt.Paint paint37 = piePlot29.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font38 = piePlot29.getLabelFont();
        piePlot29.setSimpleLabels(false);
        piePlot29.setMinimumArcAngleToDraw((double) 100);
        boolean boolean43 = piePlot29.isOutlineVisible();
        java.awt.Paint paint44 = piePlot29.getBaseSectionOutlinePaint();
        piePlot10.setLabelLinkPaint(paint44);
        piePlot0.setLabelShadowPaint(paint44);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-5d + "'", double6 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.025d + "'", double9 == 0.025d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.14d + "'", double11 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.14d + "'", double18 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E-5d + "'", double20 == 1.0E-5d);
        org.junit.Assert.assertNull(paint25);
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.14d + "'", double30 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0E-5d + "'", double32 == 1.0E-5d);
        org.junit.Assert.assertNull(paint37);
        org.junit.Assert.assertNotNull(font38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(paint44);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("", "", "", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("", "", "", windDataset3, false, true, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
        float float3 = piePlot0.getForegroundAlpha();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator5 = null;
        piePlot0.setLegendLabelURLGenerator(pieURLGenerator5);
        piePlot0.setShadowXOffset((double) 0);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.zoom(0.4d);
        java.awt.Stroke stroke5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) false, stroke5);
        piePlot1.setOutlineVisible(false);
        double double9 = piePlot1.getShadowXOffset();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        double double4 = piePlot0.getShadowXOffset();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot0.getLabelGenerator();
        java.awt.Paint paint7 = piePlot0.getSectionPaint((java.lang.Comparable) 100.0d);
        java.lang.Comparable comparable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setExplodePercent(comparable8, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator5);
        org.junit.Assert.assertNull(paint7);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        piePlot0.setMinimumArcAngleToDraw((double) 100.0f);
        java.awt.Image image6 = piePlot0.getBackgroundImage();
        double double7 = piePlot0.getLabelGap();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.025d + "'", double7 == 0.025d);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.util.TableOrder tableOrder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createMultiplePieChart("", categoryDataset1, tableOrder2, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        org.jfree.data.xy.XYDataset xYDataset5 = null;
        org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createPolarChart("", xYDataset5, false, false, true);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart9);
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot11.getMaximumLabelWidth();
        piePlot11.setForegroundAlpha((float) (short) 0);
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot();
        double double16 = piePlot15.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor17 = piePlot15.getLabelDistributor();
        double double18 = piePlot15.getMinimumArcAngleToDraw();
        java.awt.Paint paint19 = piePlot15.getBaseSectionOutlinePaint();
        double double20 = piePlot15.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot15.getSimpleLabelOffset();
        piePlot11.setInsets(rectangleInsets21);
        piePlot0.setInsets(rectangleInsets21, false);
        boolean boolean25 = piePlot0.isCircular();
        piePlot0.setStartAngle((double) (short) 100);
        piePlot0.setForegroundAlpha((float) (byte) 0);
        java.lang.String str30 = piePlot0.getNoDataMessage();
        float float31 = piePlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.14d + "'", double16 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-5d + "'", double18 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.5f + "'", float31 == 0.5f);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreNullValues();
        org.jfree.data.general.PieDataset pieDataset5 = null;
        piePlot0.setDataset(pieDataset5);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        piePlot0.drawBackgroundImage(graphics2D7, rectangle2D8);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font9 = piePlot0.getLabelFont();
        piePlot0.setSimpleLabels(false);
        piePlot0.setMinimumArcAngleToDraw((double) 100);
        org.jfree.data.general.PieDataset pieDataset14 = null;
        piePlot0.setDataset(pieDataset14);
        double double16 = piePlot0.getMinimumArcAngleToDraw();
        java.lang.Object obj17 = piePlot0.clone();
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot();
        double double19 = piePlot18.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor20 = piePlot18.getLabelDistributor();
        double double21 = piePlot18.getMinimumArcAngleToDraw();
        java.awt.Paint paint22 = piePlot18.getBaseSectionOutlinePaint();
        piePlot18.setIgnoreNullValues(false);
        java.awt.Stroke stroke25 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot18.setLabelLinkStroke(stroke25);
        boolean boolean27 = piePlot18.isOutlineVisible();
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot29 = piePlot28.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor30 = piePlot28.getLabelDistributor();
        piePlot18.setParent((org.jfree.chart.plot.Plot) piePlot28);
        org.jfree.chart.plot.Plot plot32 = piePlot18.getRootPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        piePlot18.handleClick((int) '#', (int) (byte) 1, plotRenderingInfo35);
        piePlot18.setForegroundAlpha(10.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = piePlot18.getSimpleLabelOffset();
        piePlot0.setInsets(rectangleInsets39, true);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.14d + "'", double19 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0E-5d + "'", double21 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(plot29);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor30);
        org.junit.Assert.assertNotNull(plot32);
        org.junit.Assert.assertNotNull(rectangleInsets39);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.jfree.data.xy.XYZDataset xYZDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBubbleChart("hi!", "hi!", "", xYZDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.util.TableOrder tableOrder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createMultiplePieChart("hi!", categoryDataset1, tableOrder2, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        org.jfree.data.statistics.BoxAndWhiskerCategoryDataset boxAndWhiskerCategoryDataset5 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "", "", boxAndWhiskerCategoryDataset5, false);
        piePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart7);
        int int9 = piePlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        piePlot0.setBackgroundImageAlignment((int) (byte) -1);
        double double8 = piePlot0.getInteriorGap();
        java.awt.Font font9 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot0.setNoDataMessageFont(font9);
        java.awt.Paint paint11 = piePlot0.getLabelShadowPaint();
        piePlot0.setShadowXOffset((double) (-1));
        piePlot0.setSimpleLabels(true);
        piePlot0.setNoDataMessage("hi!");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
        float float3 = piePlot0.getForegroundAlpha();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator5 = null;
        piePlot0.setToolTipGenerator(pieToolTipGenerator5);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("Pie Plot", "", "Pie Plot", tableXYDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font9 = piePlot0.getLabelFont();
        piePlot0.setSimpleLabels(false);
        java.awt.Paint paint12 = piePlot0.getLabelPaint();
        piePlot0.setIgnoreNullValues(true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator15 = null;
        piePlot0.setLegendLabelURLGenerator(pieURLGenerator15);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font9 = piePlot0.getLabelFont();
        piePlot0.setSimpleLabels(false);
        java.awt.Paint paint12 = piePlot0.getLabelPaint();
        piePlot0.setBackgroundImageAlignment((int) '#');
        piePlot0.setBackgroundAlpha((float) ' ');
        java.awt.Paint paint17 = piePlot0.getBaseSectionOutlinePaint();
        boolean boolean18 = piePlot0.isSubplot();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        piePlot0.setBackgroundImageAlignment((int) (byte) -1);
        piePlot0.setLabelGap((double) (byte) 10);
        piePlot0.setInteriorGap((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        piePlot0.setBackgroundImageAlignment((int) (byte) -1);
        double double8 = piePlot0.getInteriorGap();
        java.awt.Image image9 = null;
        piePlot0.setBackgroundImage(image9);
        java.awt.Stroke stroke11 = piePlot0.getLabelLinkStroke();
        piePlot0.setBackgroundImageAlpha(0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        piePlot0.setDataset(pieDataset3);
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        double double6 = piePlot5.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor7 = piePlot5.getLabelDistributor();
        double double8 = piePlot5.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        piePlot5.drawBackgroundImage(graphics2D9, rectangle2D10);
        java.awt.Paint paint13 = piePlot5.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font14 = piePlot5.getLabelFont();
        piePlot5.setSimpleLabels(false);
        java.awt.Paint paint17 = piePlot5.getLabelPaint();
        java.awt.Paint paint18 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot5.setLabelOutlinePaint(paint18);
        piePlot5.setStartAngle((double) 100L);
        java.awt.Paint paint23 = piePlot5.getSectionOutlinePaint((java.lang.Comparable) (-1L));
        piePlot5.setExplodePercent((java.lang.Comparable) (short) 100, (double) '#');
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot();
        double double28 = piePlot27.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup29 = piePlot27.getDatasetGroup();
        piePlot27.setOutlineVisible(true);
        boolean boolean32 = piePlot27.getSectionOutlinesVisible();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator33 = piePlot27.getLegendLabelGenerator();
        piePlot5.setLabelGenerator(pieSectionLabelGenerator33);
        piePlot0.setLabelGenerator(pieSectionLabelGenerator33);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.14d + "'", double6 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.14d + "'", double28 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator33);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("Pie Plot", "", "hi!", xYDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        piePlot0.setBackgroundImageAlignment((int) 'a');
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = piePlot0.getInsets();
        boolean boolean5 = piePlot0.getLabelLinksVisible();
        java.awt.Paint paint6 = piePlot0.getNoDataMessagePaint();
        org.junit.Assert.assertNull(datasetGroup1);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent2 = null;
        piePlot0.datasetChanged(datasetChangeEvent2);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        piePlot0.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelToolTipGenerator();
        boolean boolean7 = piePlot0.getSimpleLabels();
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        double double9 = piePlot8.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor10 = piePlot8.getLabelDistributor();
        double double11 = piePlot8.getMinimumArcAngleToDraw();
        java.awt.Paint paint12 = piePlot8.getBaseSectionOutlinePaint();
        double double13 = piePlot8.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot8.getSimpleLabelOffset();
        double double15 = piePlot8.getLabelLinkMargin();
        double double16 = piePlot8.getStartAngle();
        piePlot0.setParent((org.jfree.chart.plot.Plot) piePlot8);
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot19 = piePlot18.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor20 = piePlot18.getLabelDistributor();
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot();
        double double22 = piePlot21.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor23 = piePlot21.getLabelDistributor();
        double double24 = piePlot21.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        piePlot21.drawBackgroundImage(graphics2D25, rectangle2D26);
        java.awt.Paint paint29 = piePlot21.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font30 = piePlot21.getLabelFont();
        piePlot21.setSimpleLabels(false);
        java.awt.Paint paint33 = piePlot21.getLabelPaint();
        piePlot21.setBackgroundImageAlignment((int) '#');
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = piePlot21.getInsets();
        piePlot18.setLabelPadding(rectangleInsets36);
        piePlot8.setSimpleLabelOffset(rectangleInsets36);
        org.jfree.chart.LegendItemCollection legendItemCollection39 = piePlot8.getLegendItems();
        org.jfree.data.general.DatasetGroup datasetGroup40 = piePlot8.getDatasetGroup();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14d + "'", double9 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-5d + "'", double11 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.0d + "'", double13 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.025d + "'", double15 == 0.025d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 90.0d + "'", double16 == 90.0d);
        org.junit.Assert.assertNull(plot19);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.14d + "'", double22 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0E-5d + "'", double24 == 1.0E-5d);
        org.junit.Assert.assertNull(paint29);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(rectangleInsets36);
        org.junit.Assert.assertNull(legendItemCollection39);
        org.junit.Assert.assertNull(datasetGroup40);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        boolean boolean5 = piePlot0.getLabelLinksVisible();
        java.awt.Font font6 = piePlot0.getNoDataMessageFont();
        piePlot0.setBackgroundAlpha((float) 15);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(font6);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        java.awt.Stroke stroke5 = piePlot0.getLabelOutlineStroke();
        java.awt.Shape shape6 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot0.setLegendItemShape(shape6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot0.getLegendLabelURLGenerator();
        java.awt.Paint paint9 = piePlot0.getShadowPaint();
        float float10 = piePlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getNoDataMessagePaint();
        java.awt.Paint paint4 = piePlot0.getLabelPaint();
        java.awt.Paint paint5 = piePlot0.getLabelPaint();
        org.jfree.chart.plot.Plot plot6 = piePlot0.getParent();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(plot6);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot0.setToolTipGenerator(pieToolTipGenerator2);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot0.getLabelDistributor();
        java.awt.Paint paint6 = piePlot0.getSectionOutlinePaint((java.lang.Comparable) true);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
        org.junit.Assert.assertNull(paint6);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        org.jfree.chart.plot.Plot plot2 = piePlot0.getParent();
        boolean boolean3 = piePlot0.isCircular();
        java.awt.Font font4 = piePlot0.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(font4);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        java.awt.Paint paint5 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_SHADOW_PAINT;
        piePlot0.setLabelLinkPaint(paint5);
        double double7 = piePlot0.getInteriorGap();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08d + "'", double7 == 0.08d);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str9 = piePlot0.getNoDataMessage();
        java.awt.Paint paint10 = piePlot0.getLabelOutlinePaint();
        org.jfree.data.general.DatasetGroup datasetGroup11 = piePlot0.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(datasetGroup11);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart3D("hi!", "Pie Plot", "hi!", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        piePlot0.setBackgroundImageAlignment((int) 'a');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot0.getLabelDistributor();
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        piePlot5.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint8 = piePlot5.getLabelLinkPaint();
        piePlot0.setOutlinePaint(paint8);
        java.awt.Stroke stroke10 = piePlot0.getBaseSectionOutlineStroke();
        org.junit.Assert.assertNull(datasetGroup1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        java.awt.Paint paint6 = piePlot0.getShadowPaint();
        boolean boolean7 = piePlot0.getIgnoreZeroValues();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot0.getURLGenerator();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(pieURLGenerator8);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Stroke stroke7 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot0.setLabelLinkStroke(stroke7);
        piePlot0.setBackgroundImageAlpha(1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepAreaChart("", "Pie Plot", "", xYDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setIgnoreNullValues(false);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = null;
        piePlot0.setLegendLabelURLGenerator(pieURLGenerator3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        piePlot0.handleClick((int) '#', (int) (byte) 10, plotRenderingInfo7);
        int int9 = piePlot0.getBackgroundImageAlignment();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot(pieDataset10);
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        double double14 = piePlot13.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor15 = piePlot13.getLabelDistributor();
        double double16 = piePlot13.getMinimumArcAngleToDraw();
        java.awt.Paint paint17 = piePlot13.getBaseSectionOutlinePaint();
        double double18 = piePlot13.getShadowYOffset();
        piePlot13.setBackgroundImageAlignment((int) (byte) -1);
        double double21 = piePlot13.getInteriorGap();
        java.awt.Image image22 = null;
        piePlot13.setBackgroundImage(image22);
        java.awt.Stroke stroke24 = piePlot13.getLabelLinkStroke();
        piePlot11.setSectionOutlineStroke((java.lang.Comparable) 0.0f, stroke24);
        piePlot0.setBaseSectionOutlineStroke(stroke24);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.14d + "'", double14 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-5d + "'", double16 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.08d + "'", double21 == 0.08d);
        org.junit.Assert.assertNotNull(stroke24);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent3 = null;
        piePlot0.datasetChanged(datasetChangeEvent3);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawOutline(graphics2D5, rectangle2D6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        java.awt.Paint paint3 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setNoDataMessagePaint(paint3);
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        double double6 = piePlot5.getMaximumLabelWidth();
        piePlot5.setForegroundAlpha((float) (short) 0);
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot();
        double double10 = piePlot9.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor11 = piePlot9.getLabelDistributor();
        double double12 = piePlot9.getMinimumArcAngleToDraw();
        java.awt.Paint paint13 = piePlot9.getBaseSectionOutlinePaint();
        double double14 = piePlot9.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot9.getSimpleLabelOffset();
        piePlot5.setInsets(rectangleInsets15);
        piePlot0.setSimpleLabelOffset(rectangleInsets15);
        double double18 = piePlot0.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = piePlot0.getLabelPadding();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.14d + "'", double6 == 0.14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-5d + "'", double18 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets19);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        double double9 = piePlot0.getShadowXOffset();
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot11.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor13 = piePlot11.getLabelDistributor();
        double double14 = piePlot11.getMinimumArcAngleToDraw();
        java.awt.Paint paint15 = piePlot11.getBaseSectionOutlinePaint();
        double double16 = piePlot11.getShadowYOffset();
        piePlot11.setBackgroundImageAlignment((int) (byte) -1);
        double double19 = piePlot11.getInteriorGap();
        java.awt.Font font20 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot11.setNoDataMessageFont(font20);
        java.awt.Paint paint22 = piePlot11.getLabelShadowPaint();
        piePlot0.setSectionOutlinePaint((java.lang.Comparable) 0L, paint22);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.08d + "'", double19 == 0.08d);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        float float7 = piePlot0.getBackgroundAlpha();
        double double8 = piePlot0.getShadowYOffset();
        java.awt.Paint paint10 = piePlot0.getSectionPaint((java.lang.Comparable) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertNull(paint10);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("hi!", "", true, "Pie Plot", intervalXYDataset4, plotOrientation5, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("Pie Plot", "", "", xYDataset3, true, true, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.lang.String str3 = piePlot0.getPlotType();
        org.jfree.data.general.DatasetGroup datasetGroup4 = piePlot0.getDatasetGroup();
        java.awt.Paint paint5 = piePlot0.getOutlinePaint();
        java.awt.Stroke stroke6 = piePlot0.getBaseSectionOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        piePlot0.setDataset(pieDataset7);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createCandlestickChart("", "Pie Plot", "", oHLCDataset3, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart3D("", "Pie Plot", "hi!", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        float float4 = piePlot0.getForegroundAlpha();
        java.awt.Stroke stroke5 = piePlot0.getBaseSectionOutlineStroke();
        java.awt.Stroke stroke6 = piePlot0.getLabelLinkStroke();
        float float7 = piePlot0.getBackgroundImageAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = piePlot0.getSimpleLabelOffset();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        piePlot0.axisChanged(axisChangeEvent9);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(rectangleInsets8);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
        double double3 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        double double5 = piePlot4.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup6 = piePlot4.getDatasetGroup();
        piePlot4.setOutlineVisible(true);
        boolean boolean10 = piePlot4.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot11.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor13 = piePlot11.getLabelDistributor();
        double double14 = piePlot11.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        piePlot11.drawBackgroundImage(graphics2D15, rectangle2D16);
        java.awt.Paint paint19 = piePlot11.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font20 = piePlot11.getLabelFont();
        piePlot4.setNoDataMessageFont(font20);
        boolean boolean22 = piePlot4.isOutlineVisible();
        double double23 = piePlot4.getLabelGap();
        java.awt.Paint paint24 = piePlot4.getLabelLinkPaint();
        java.awt.Paint paint25 = piePlot4.getNoDataMessagePaint();
        piePlot0.setShadowPaint(paint25);
        double double27 = piePlot0.getLabelLinkMargin();
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset29 = null;
        piePlot28.setDataset(pieDataset29);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator31 = piePlot28.getURLGenerator();
        org.jfree.chart.plot.Plot plot32 = piePlot28.getRootPlot();
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset35 = null;
        piePlot34.setDataset(pieDataset35);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator37 = piePlot34.getURLGenerator();
        piePlot34.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator40 = piePlot34.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot();
        double double42 = piePlot41.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor43 = piePlot41.getLabelDistributor();
        double double44 = piePlot41.getMinimumArcAngleToDraw();
        boolean boolean45 = piePlot41.getIgnoreZeroValues();
        boolean boolean46 = piePlot41.isSubplot();
        piePlot41.setCircular(false);
        java.awt.Paint paint50 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot41.setSectionOutlinePaint((java.lang.Comparable) "", paint50);
        piePlot34.setNoDataMessagePaint(paint50);
        piePlot28.setSectionPaint((java.lang.Comparable) 52.0d, paint50);
        piePlot0.setLabelPaint(paint50);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.14d + "'", double3 == 0.14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.025d + "'", double23 == 0.025d);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.025d + "'", double27 == 0.025d);
        org.junit.Assert.assertNull(pieURLGenerator31);
        org.junit.Assert.assertNotNull(plot32);
        org.junit.Assert.assertNull(pieURLGenerator37);
        org.junit.Assert.assertNull(pieSectionLabelGenerator40);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.14d + "'", double42 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0E-5d + "'", double44 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(paint50);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.lang.String str3 = piePlot0.getPlotType();
        org.jfree.data.general.DatasetGroup datasetGroup4 = piePlot0.getDatasetGroup();
        java.awt.Paint paint5 = piePlot0.getOutlinePaint();
        piePlot0.setMaximumLabelWidth((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font9 = piePlot0.getLabelFont();
        piePlot0.setSimpleLabels(false);
        java.awt.Paint paint12 = piePlot0.getLabelPaint();
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setLabelOutlinePaint(paint13);
        piePlot0.setStartAngle((double) 100L);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator17 = piePlot0.getToolTipGenerator();
        double double19 = piePlot0.getExplodePercent((java.lang.Comparable) 0.0f);
        org.jfree.data.general.DatasetGroup datasetGroup20 = piePlot0.getDatasetGroup();
        double double22 = piePlot0.getExplodePercent((java.lang.Comparable) 100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(pieToolTipGenerator17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNull(datasetGroup20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        java.awt.Paint paint3 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setNoDataMessagePaint(paint3);
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        double double6 = piePlot5.getMaximumLabelWidth();
        piePlot5.setForegroundAlpha((float) (short) 0);
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot();
        double double10 = piePlot9.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor11 = piePlot9.getLabelDistributor();
        double double12 = piePlot9.getMinimumArcAngleToDraw();
        java.awt.Paint paint13 = piePlot9.getBaseSectionOutlinePaint();
        double double14 = piePlot9.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot9.getSimpleLabelOffset();
        piePlot5.setInsets(rectangleInsets15);
        piePlot0.setSimpleLabelOffset(rectangleInsets15);
        double double18 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Image image19 = piePlot0.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.14d + "'", double6 == 0.14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-5d + "'", double18 == 1.0E-5d);
        org.junit.Assert.assertNull(image19);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        boolean boolean6 = piePlot0.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double8 = piePlot7.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor9 = piePlot7.getLabelDistributor();
        double double10 = piePlot7.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot7.drawBackgroundImage(graphics2D11, rectangle2D12);
        java.awt.Paint paint15 = piePlot7.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font16 = piePlot7.getLabelFont();
        piePlot0.setNoDataMessageFont(font16);
        boolean boolean18 = piePlot0.isOutlineVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = piePlot0.getInsets();
        java.awt.Stroke stroke20 = piePlot0.getLabelOutlineStroke();
        piePlot0.setSectionOutlinesVisible(true);
        piePlot0.setSimpleLabels(false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(stroke20);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
        float float3 = piePlot0.getForegroundAlpha();
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        double double5 = piePlot4.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor6 = piePlot4.getLabelDistributor();
        double double7 = piePlot4.getMinimumArcAngleToDraw();
        java.awt.Paint paint8 = piePlot4.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot4.getDrawingSupplier();
        double double10 = piePlot4.getShadowXOffset();
        java.awt.Paint paint11 = piePlot4.getLabelLinkPaint();
        java.awt.Paint paint12 = piePlot4.getLabelLinkPaint();
        piePlot0.setLabelOutlinePaint(paint12);
        piePlot0.setOutlineVisible(false);
        java.lang.Class<?> wildcardClass16 = piePlot0.getClass();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-5d + "'", double7 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createCandlestickChart("", "hi!", "hi!", oHLCDataset3, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart3D("", pieDataset1, false, false, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        boolean boolean4 = piePlot0.isOutlineVisible();
        java.awt.Paint paint5 = piePlot0.getNoDataMessagePaint();
        java.awt.Stroke stroke6 = piePlot0.getLabelOutlineStroke();
        boolean boolean7 = piePlot0.isCircular();
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        double double9 = piePlot8.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor10 = piePlot8.getLabelDistributor();
        double double11 = piePlot8.getMinimumArcAngleToDraw();
        java.awt.Paint paint12 = piePlot8.getBaseSectionOutlinePaint();
        double double13 = piePlot8.getShadowYOffset();
        piePlot8.setBackgroundImageAlignment((int) (byte) -1);
        java.awt.Paint paint16 = piePlot8.getLabelPaint();
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot();
        double double18 = piePlot17.getMaximumLabelWidth();
        piePlot17.setForegroundAlpha((float) (short) 0);
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot();
        double double22 = piePlot21.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor23 = piePlot21.getLabelDistributor();
        double double24 = piePlot21.getMinimumArcAngleToDraw();
        java.awt.Paint paint25 = piePlot21.getBaseSectionOutlinePaint();
        double double26 = piePlot21.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = piePlot21.getSimpleLabelOffset();
        piePlot17.setInsets(rectangleInsets27);
        piePlot8.setLabelPadding(rectangleInsets27);
        piePlot0.setLabelPadding(rectangleInsets27);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14d + "'", double9 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-5d + "'", double11 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.0d + "'", double13 == 4.0d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.14d + "'", double18 == 0.14d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.14d + "'", double22 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0E-5d + "'", double24 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.0d + "'", double26 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets27);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("hi!", "hi!", "hi!", boxAndWhiskerXYDataset3, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        boolean boolean6 = piePlot0.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double8 = piePlot7.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor9 = piePlot7.getLabelDistributor();
        double double10 = piePlot7.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot7.drawBackgroundImage(graphics2D11, rectangle2D12);
        java.awt.Paint paint15 = piePlot7.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font16 = piePlot7.getLabelFont();
        piePlot7.setSimpleLabels(false);
        java.awt.Paint paint19 = piePlot7.getLabelPaint();
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset21 = null;
        piePlot20.setDataset(pieDataset21);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator23 = piePlot20.getURLGenerator();
        piePlot20.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator26 = piePlot20.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot();
        double double28 = piePlot27.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor29 = piePlot27.getLabelDistributor();
        double double30 = piePlot27.getMinimumArcAngleToDraw();
        boolean boolean31 = piePlot27.getIgnoreZeroValues();
        boolean boolean32 = piePlot27.isSubplot();
        piePlot27.setCircular(false);
        java.awt.Paint paint36 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot27.setSectionOutlinePaint((java.lang.Comparable) "", paint36);
        piePlot20.setNoDataMessagePaint(paint36);
        piePlot7.setLabelBackgroundPaint(paint36);
        piePlot0.setBaseSectionPaint(paint36);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator41 = piePlot0.getLabelGenerator();
        java.awt.Stroke stroke42 = piePlot0.getBaseSectionOutlineStroke();
        org.jfree.chart.plot.Plot plot43 = piePlot0.getRootPlot();
        float float44 = piePlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(pieURLGenerator23);
        org.junit.Assert.assertNull(pieSectionLabelGenerator26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.14d + "'", double28 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0E-5d + "'", double30 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator41);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(plot43);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.5f + "'", float44 == 0.5f);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Stroke stroke7 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot0.setLabelLinkStroke(stroke7);
        boolean boolean9 = piePlot0.isOutlineVisible();
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot11 = piePlot10.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = piePlot10.getLabelDistributor();
        piePlot0.setParent((org.jfree.chart.plot.Plot) piePlot10);
        org.jfree.data.general.PieDataset pieDataset14 = null;
        piePlot10.setDataset(pieDataset14);
        java.awt.Stroke stroke16 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot10.setOutlineStroke(stroke16);
        piePlot10.setNoDataMessage("hi!");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor5 = piePlot0.getLabelDistributor();
        org.jfree.chart.plot.Plot plot6 = piePlot0.getRootPlot();
        piePlot0.setIgnoreZeroValues(true);
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot10 = piePlot9.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor11 = piePlot9.getLabelDistributor();
        java.awt.Paint paint12 = piePlot9.getLabelOutlinePaint();
        piePlot0.setOutlinePaint(paint12);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(plot10);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        java.awt.Paint paint3 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setNoDataMessagePaint(paint3);
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        piePlot5.setDataset(pieDataset6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot5.getURLGenerator();
        org.jfree.chart.plot.Plot plot9 = piePlot5.getRootPlot();
        java.awt.Stroke stroke10 = piePlot5.getLabelOutlineStroke();
        piePlot0.setLabelLinkStroke(stroke10);
        org.jfree.chart.util.Rotation rotation12 = piePlot0.getDirection();
        int int13 = piePlot0.getPieIndex();
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot();
        double double15 = piePlot14.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor16 = piePlot14.getLabelDistributor();
        double double17 = piePlot14.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        piePlot14.drawBackgroundImage(graphics2D18, rectangle2D19);
        java.awt.Paint paint22 = piePlot14.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font23 = piePlot14.getLabelFont();
        piePlot14.setSimpleLabels(false);
        java.awt.Paint paint26 = piePlot14.getLabelPaint();
        java.awt.Paint paint27 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot14.setLabelOutlinePaint(paint27);
        piePlot14.setStartAngle((double) 100L);
        java.awt.Paint paint31 = piePlot14.getLabelShadowPaint();
        piePlot0.setBackgroundPaint(paint31);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rotation12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-5d + "'", double17 == 1.0E-5d);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        piePlot0.setBackgroundAlpha((float) (byte) 0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot0.getLegendLabelGenerator();
        java.awt.Stroke stroke6 = piePlot0.getLabelOutlineStroke();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator7 = piePlot0.getLabelGenerator();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator7);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("", "hi!", "", windDataset3, true, true, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor5 = piePlot0.getLabelDistributor();
        org.jfree.data.general.PieDataset pieDataset6 = piePlot0.getDataset();
        piePlot0.setShadowYOffset((double) ' ');
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor5);
        org.junit.Assert.assertNull(pieDataset6);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        piePlot0.setBackgroundImageAlignment((int) (byte) -1);
        double double8 = piePlot0.getInteriorGap();
        java.awt.Image image9 = null;
        piePlot0.setBackgroundImage(image9);
        java.awt.Stroke stroke11 = piePlot0.getLabelLinkStroke();
        java.awt.Stroke stroke12 = piePlot0.getBaseSectionOutlineStroke();
        java.awt.Paint paint13 = piePlot0.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str9 = piePlot0.getNoDataMessage();
        java.awt.Paint paint10 = piePlot0.getLabelOutlinePaint();
        java.awt.Paint paint11 = piePlot0.getNoDataMessagePaint();
        java.awt.Image image12 = piePlot0.getBackgroundImage();
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        double double14 = piePlot13.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor15 = piePlot13.getLabelDistributor();
        double double16 = piePlot13.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        piePlot13.drawBackgroundImage(graphics2D17, rectangle2D18);
        java.awt.Paint paint21 = piePlot13.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str22 = piePlot13.getNoDataMessage();
        piePlot13.setNoDataMessage("hi!");
        java.awt.Stroke stroke25 = piePlot13.getOutlineStroke();
        java.awt.Shape shape26 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot13.setLegendItemShape(shape26);
        piePlot0.setLegendItemShape(shape26);
        piePlot0.setLabelGap(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.14d + "'", double14 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-5d + "'", double16 == 1.0E-5d);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(shape26);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str9 = piePlot0.getNoDataMessage();
        piePlot0.setNoDataMessage("hi!");
        piePlot0.setIgnoreZeroValues(false);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator14 = piePlot0.getLegendLabelURLGenerator();
        double double15 = piePlot0.getShadowYOffset();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(pieURLGenerator14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
        float float3 = piePlot0.getForegroundAlpha();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        java.lang.String str5 = piePlot0.getPlotType();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.jfree.data.statistics.BoxAndWhiskerCategoryDataset boxAndWhiskerCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("hi!", "", "Pie Plot", boxAndWhiskerCategoryDataset3, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("hi!", "", "Pie Plot", tableXYDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        org.jfree.data.general.DatasetGroup datasetGroup5 = piePlot0.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(datasetGroup5);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.jfree.data.xy.XYZDataset xYZDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBubbleChart("", "", "", xYZDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        boolean boolean5 = piePlot0.getSectionOutlinesVisible();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelGenerator();
        piePlot0.setLabelLinksVisible(false);
        piePlot0.setCircular(true, false);
        java.lang.Class<?> wildcardClass12 = piePlot0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepAreaChart("Pie Plot", "hi!", "hi!", xYDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        boolean boolean5 = piePlot0.isSubplot();
        piePlot0.setCircular(false);
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset11 = null;
        org.jfree.chart.JFreeChart jFreeChart13 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "hi!", "", boxAndWhiskerXYDataset11, false);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart13);
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        piePlot15.setDataset(pieDataset16);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator18 = piePlot15.getURLGenerator();
        float float19 = piePlot15.getForegroundAlpha();
        java.awt.Stroke stroke20 = piePlot15.getBaseSectionOutlineStroke();
        java.awt.Stroke stroke21 = piePlot15.getLabelLinkStroke();
        piePlot0.setBaseSectionOutlineStroke(stroke21);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator23 = piePlot0.getLegendLabelToolTipGenerator();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jFreeChart13);
        org.junit.Assert.assertNull(pieURLGenerator18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNull(pieSectionLabelGenerator23);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("Pie Plot", "hi!", "", intervalCategoryDataset3, false, false, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("Pie Plot", "", "hi!", intervalCategoryDataset3, true, false, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("", "Pie Plot", "", xYDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        java.util.Locale locale4 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart3D("hi!", pieDataset1, false, false, locale4);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font9 = piePlot0.getLabelFont();
        piePlot0.setSimpleLabels(false);
        java.awt.Paint paint12 = piePlot0.getLabelPaint();
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setLabelOutlinePaint(paint13);
        piePlot0.setStartAngle((double) 100L);
        java.awt.Paint paint18 = piePlot0.getSectionOutlinePaint((java.lang.Comparable) (-1L));
        piePlot0.setExplodePercent((java.lang.Comparable) (short) 100, (double) '#');
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        double double23 = piePlot22.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup24 = piePlot22.getDatasetGroup();
        piePlot22.setOutlineVisible(true);
        boolean boolean27 = piePlot22.getSectionOutlinesVisible();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator28 = piePlot22.getLegendLabelGenerator();
        piePlot0.setLabelGenerator(pieSectionLabelGenerator28);
        piePlot0.setMinimumArcAngleToDraw((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(paint18);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.14d + "'", double23 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator28);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        java.awt.Paint paint3 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setNoDataMessagePaint(paint3);
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        piePlot5.setDataset(pieDataset6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot5.getURLGenerator();
        org.jfree.chart.plot.Plot plot9 = piePlot5.getRootPlot();
        java.awt.Stroke stroke10 = piePlot5.getLabelOutlineStroke();
        piePlot0.setLabelLinkStroke(stroke10);
        org.jfree.chart.util.Rotation rotation12 = piePlot0.getDirection();
        int int13 = piePlot0.getPieIndex();
        piePlot0.setIgnoreZeroValues(false);
        piePlot0.setCircular(true);
        piePlot0.setLabelLinkMargin((double) (byte) 100);
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        double double23 = piePlot22.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor24 = piePlot22.getLabelDistributor();
        double double25 = piePlot22.getMinimumArcAngleToDraw();
        java.awt.Paint paint26 = piePlot22.getBaseSectionOutlinePaint();
        double double27 = piePlot22.getShadowYOffset();
        piePlot22.setBackgroundImageAlignment((int) (byte) -1);
        double double30 = piePlot22.getInteriorGap();
        java.awt.Font font31 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot22.setNoDataMessageFont(font31);
        java.awt.Paint paint33 = piePlot22.getLabelShadowPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent34 = null;
        piePlot22.markerChanged(markerChangeEvent34);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent36 = null;
        piePlot22.markerChanged(markerChangeEvent36);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState40 = piePlot0.initialise(graphics2D20, rectangle2D21, piePlot22, (java.lang.Integer) 0, plotRenderingInfo39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rotation12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.14d + "'", double23 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0E-5d + "'", double25 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 4.0d + "'", double27 == 4.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.08d + "'", double30 == 0.08d);
        org.junit.Assert.assertNotNull(font31);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("", "", "", xYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.jfree.data.xy.XYZDataset xYZDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBubbleChart("hi!", "hi!", "", xYZDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart("Pie Plot", pieDataset1, false, true, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        double double5 = piePlot4.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup6 = piePlot4.getDatasetGroup();
        piePlot4.setOutlineVisible(true);
        boolean boolean10 = piePlot4.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot11.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor13 = piePlot11.getLabelDistributor();
        double double14 = piePlot11.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        piePlot11.drawBackgroundImage(graphics2D15, rectangle2D16);
        java.awt.Paint paint19 = piePlot11.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font20 = piePlot11.getLabelFont();
        piePlot4.setNoDataMessageFont(font20);
        boolean boolean22 = piePlot4.isOutlineVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = piePlot4.getInsets();
        piePlot0.setInsets(rectangleInsets23);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator25 = null;
        piePlot0.setURLGenerator(pieURLGenerator25);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(rectangleInsets23);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
        float float3 = piePlot0.getForegroundAlpha();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        piePlot0.setSimpleLabels(false);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        piePlot0.setOutlineVisible(false);
        piePlot0.setSectionOutlinesVisible(true);
        int int9 = piePlot0.getBackgroundImageAlignment();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = null;
        piePlot0.setDrawingSupplier(drawingSupplier10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("hi!", "", false, "", intervalXYDataset4, plotOrientation5, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.zoom(0.4d);
        java.awt.Stroke stroke5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) false, stroke5);
        boolean boolean7 = piePlot1.getIgnoreNullValues();
        double double8 = piePlot1.getLabelLinkMargin();
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot();
        double double10 = piePlot9.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor11 = piePlot9.getLabelDistributor();
        double double12 = piePlot9.getMinimumArcAngleToDraw();
        java.awt.Paint paint13 = piePlot9.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = piePlot9.getDrawingSupplier();
        double double15 = piePlot9.getShadowXOffset();
        java.awt.Paint paint16 = piePlot9.getLabelLinkPaint();
        org.jfree.chart.util.Rotation rotation17 = piePlot9.getDirection();
        piePlot1.setDirection(rotation17);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.025d + "'", double8 == 0.025d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(rotation17);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.lang.String str3 = piePlot0.getPlotType();
        org.jfree.data.general.DatasetGroup datasetGroup4 = piePlot0.getDatasetGroup();
        piePlot0.setCircular(false);
        org.jfree.data.general.DatasetGroup datasetGroup7 = piePlot0.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNull(datasetGroup7);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart3D("hi!", "Pie Plot", "hi!", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        float float7 = piePlot0.getBackgroundAlpha();
        double double8 = piePlot0.getShadowYOffset();
        boolean boolean9 = piePlot0.getSimpleLabels();
        double double10 = piePlot0.getMaximumLabelWidth();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart("Pie Plot", pieDataset1, false, false, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str9 = piePlot0.getNoDataMessage();
        java.awt.Paint paint10 = piePlot0.getLabelOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot0.getLabelPadding();
        boolean boolean12 = piePlot0.getSimpleLabels();
        piePlot0.setBackgroundAlpha((float) 10);
        java.awt.Paint paint15 = piePlot0.getLabelBackgroundPaint();
        java.awt.Image image16 = piePlot0.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(image16);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot0.getSimpleLabelOffset();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        piePlot0.handleClick((int) (short) 0, 0, plotRenderingInfo9);
        java.awt.Stroke stroke12 = piePlot0.getSectionOutlineStroke((java.lang.Comparable) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(stroke12);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot5 = piePlot0.getRootPlot();
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        double double7 = piePlot6.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor8 = piePlot6.getLabelDistributor();
        double double9 = piePlot6.getMinimumArcAngleToDraw();
        java.awt.Paint paint10 = piePlot6.getBaseSectionOutlinePaint();
        double double11 = piePlot6.getShadowYOffset();
        piePlot6.setBackgroundImageAlignment((int) (byte) -1);
        java.awt.Paint paint14 = piePlot6.getLabelPaint();
        piePlot0.setShadowPaint(paint14);
        java.awt.Paint paint16 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot20 = piePlot19.getParent();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState23 = piePlot0.initialise(graphics2D17, rectangle2D18, piePlot19, (java.lang.Integer) 1, plotRenderingInfo22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14d + "'", double7 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-5d + "'", double9 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.0d + "'", double11 == 4.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(plot20);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("", "Pie Plot", "hi!", xYDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.lang.String str3 = piePlot0.getPlotType();
        org.jfree.data.general.DatasetGroup datasetGroup4 = piePlot0.getDatasetGroup();
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        piePlot5.setDataset(pieDataset6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot5.getURLGenerator();
        org.jfree.chart.plot.Plot plot9 = piePlot5.getRootPlot();
        double double10 = piePlot5.getLabelGap();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator11 = piePlot5.getLegendLabelGenerator();
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        double double14 = piePlot13.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor15 = piePlot13.getLabelDistributor();
        double double16 = piePlot13.getMinimumArcAngleToDraw();
        java.awt.Paint paint17 = piePlot13.getBaseSectionOutlinePaint();
        piePlot13.setIgnoreNullValues(false);
        java.awt.Paint paint20 = piePlot13.getNoDataMessagePaint();
        piePlot5.setSectionPaint((java.lang.Comparable) 100L, paint20);
        piePlot0.setLabelShadowPaint(paint20);
        java.awt.Stroke stroke23 = piePlot0.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.025d + "'", double10 == 0.025d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.14d + "'", double14 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-5d + "'", double16 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
        float float3 = piePlot0.getBackgroundImageAlpha();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot0.handleClick((int) '4', 1, plotRenderingInfo6);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        boolean boolean6 = piePlot0.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double8 = piePlot7.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor9 = piePlot7.getLabelDistributor();
        double double10 = piePlot7.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot7.drawBackgroundImage(graphics2D11, rectangle2D12);
        java.awt.Paint paint15 = piePlot7.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font16 = piePlot7.getLabelFont();
        piePlot0.setNoDataMessageFont(font16);
        boolean boolean18 = piePlot0.isOutlineVisible();
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot();
        double double20 = piePlot19.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor21 = piePlot19.getLabelDistributor();
        double double22 = piePlot19.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        piePlot19.drawBackgroundImage(graphics2D23, rectangle2D24);
        java.awt.Paint paint27 = piePlot19.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font28 = piePlot19.getLabelFont();
        piePlot19.setSimpleLabels(false);
        piePlot19.setMinimumArcAngleToDraw((double) 100);
        boolean boolean33 = piePlot19.isOutlineVisible();
        java.awt.Paint paint34 = piePlot19.getBaseSectionOutlinePaint();
        piePlot0.setLabelLinkPaint(paint34);
        piePlot0.setIgnoreNullValues(true);
        piePlot0.zoom(10.0d);
        org.jfree.chart.plot.PiePlot piePlot40 = new org.jfree.chart.plot.PiePlot();
        double double41 = piePlot40.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor42 = piePlot40.getLabelDistributor();
        double double43 = piePlot40.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D44 = null;
        java.awt.geom.Rectangle2D rectangle2D45 = null;
        piePlot40.drawBackgroundImage(graphics2D44, rectangle2D45);
        java.awt.Paint paint48 = piePlot40.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font49 = piePlot40.getLabelFont();
        piePlot40.setSimpleLabels(false);
        java.awt.Paint paint52 = piePlot40.getLabelPaint();
        java.awt.Paint paint53 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot40.setLabelOutlinePaint(paint53);
        piePlot40.setStartAngle((double) 100L);
        java.awt.Paint paint57 = piePlot40.getLabelShadowPaint();
        piePlot0.setShadowPaint(paint57);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.14d + "'", double20 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0E-5d + "'", double22 == 1.0E-5d);
        org.junit.Assert.assertNull(paint27);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.14d + "'", double41 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0E-5d + "'", double43 == 1.0E-5d);
        org.junit.Assert.assertNull(paint48);
        org.junit.Assert.assertNotNull(font49);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertNotNull(paint57);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        java.awt.Paint paint6 = piePlot0.getLabelPaint();
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) (byte) 0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator9 = null;
        piePlot0.setURLGenerator(pieURLGenerator9);
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot11.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor13 = piePlot11.getLabelDistributor();
        java.awt.Paint paint14 = piePlot11.getLabelOutlinePaint();
        piePlot11.setStartAngle((double) (byte) 10);
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot();
        double double19 = piePlot18.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor20 = piePlot18.getLabelDistributor();
        double double21 = piePlot18.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        piePlot18.drawBackgroundImage(graphics2D22, rectangle2D23);
        java.awt.Paint paint26 = piePlot18.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font27 = piePlot18.getLabelFont();
        piePlot18.setSimpleLabels(false);
        piePlot18.setMinimumArcAngleToDraw((double) 100);
        boolean boolean32 = piePlot18.isOutlineVisible();
        java.awt.Paint paint33 = piePlot18.getBaseSectionOutlinePaint();
        piePlot11.setSectionOutlinePaint((java.lang.Comparable) 4.0d, paint33);
        piePlot0.setBaseSectionPaint(paint33);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.14d + "'", double19 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0E-5d + "'", double21 == 1.0E-5d);
        org.junit.Assert.assertNull(paint26);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot0.setToolTipGenerator(pieToolTipGenerator2);
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset7 = null;
        org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "hi!", "", boxAndWhiskerXYDataset7, false);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart9);
        java.awt.Paint paint11 = piePlot0.getLabelPaint();
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot();
        double double13 = piePlot12.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup14 = piePlot12.getDatasetGroup();
        piePlot12.setOutlineVisible(true);
        boolean boolean18 = piePlot12.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot();
        double double20 = piePlot19.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor21 = piePlot19.getLabelDistributor();
        double double22 = piePlot19.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        piePlot19.drawBackgroundImage(graphics2D23, rectangle2D24);
        java.awt.Paint paint27 = piePlot19.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font28 = piePlot19.getLabelFont();
        piePlot19.setSimpleLabels(false);
        java.awt.Paint paint31 = piePlot19.getLabelPaint();
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset33 = null;
        piePlot32.setDataset(pieDataset33);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator35 = piePlot32.getURLGenerator();
        piePlot32.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator38 = piePlot32.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot39 = new org.jfree.chart.plot.PiePlot();
        double double40 = piePlot39.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor41 = piePlot39.getLabelDistributor();
        double double42 = piePlot39.getMinimumArcAngleToDraw();
        boolean boolean43 = piePlot39.getIgnoreZeroValues();
        boolean boolean44 = piePlot39.isSubplot();
        piePlot39.setCircular(false);
        java.awt.Paint paint48 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot39.setSectionOutlinePaint((java.lang.Comparable) "", paint48);
        piePlot32.setNoDataMessagePaint(paint48);
        piePlot19.setLabelBackgroundPaint(paint48);
        piePlot12.setBaseSectionPaint(paint48);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator53 = piePlot12.getLabelGenerator();
        piePlot0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator53);
        java.awt.Graphics2D graphics2D55 = null;
        java.awt.geom.Rectangle2D rectangle2D56 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawOutline(graphics2D55, rectangle2D56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(datasetGroup1);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.14d + "'", double13 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.14d + "'", double20 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0E-5d + "'", double22 == 1.0E-5d);
        org.junit.Assert.assertNull(paint27);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNull(pieURLGenerator35);
        org.junit.Assert.assertNull(pieSectionLabelGenerator38);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.14d + "'", double40 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0E-5d + "'", double42 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator53);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        java.awt.Paint paint2 = piePlot0.getLabelPaint();
        java.awt.Image image3 = piePlot0.getBackgroundImage();
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        double double5 = piePlot4.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor6 = piePlot4.getLabelDistributor();
        java.lang.String str7 = piePlot4.getPlotType();
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot4.getDatasetGroup();
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        piePlot9.setDataset(pieDataset10);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = piePlot9.getURLGenerator();
        org.jfree.chart.plot.Plot plot13 = piePlot9.getRootPlot();
        double double14 = piePlot9.getLabelGap();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = piePlot9.getLegendLabelGenerator();
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot();
        double double18 = piePlot17.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor19 = piePlot17.getLabelDistributor();
        double double20 = piePlot17.getMinimumArcAngleToDraw();
        java.awt.Paint paint21 = piePlot17.getBaseSectionOutlinePaint();
        piePlot17.setIgnoreNullValues(false);
        java.awt.Paint paint24 = piePlot17.getNoDataMessagePaint();
        piePlot9.setSectionPaint((java.lang.Comparable) 100L, paint24);
        piePlot4.setLabelShadowPaint(paint24);
        piePlot0.setBaseSectionOutlinePaint(paint24);
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot();
        double double29 = piePlot28.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor30 = piePlot28.getLabelDistributor();
        double double31 = piePlot28.getMinimumArcAngleToDraw();
        java.awt.Paint paint32 = piePlot28.getBaseSectionOutlinePaint();
        double double33 = piePlot28.getShadowYOffset();
        piePlot28.setBackgroundImageAlignment((int) (byte) -1);
        double double36 = piePlot28.getInteriorGap();
        java.awt.Font font37 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot28.setNoDataMessageFont(font37);
        java.awt.Paint paint39 = piePlot28.getLabelShadowPaint();
        java.awt.Font font40 = piePlot28.getLabelFont();
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset42 = null;
        piePlot41.setDataset(pieDataset42);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator44 = piePlot41.getURLGenerator();
        org.jfree.chart.plot.Plot plot45 = piePlot41.getRootPlot();
        org.jfree.chart.plot.PiePlot piePlot47 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset48 = null;
        piePlot47.setDataset(pieDataset48);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator50 = piePlot47.getURLGenerator();
        piePlot47.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator53 = piePlot47.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot54 = new org.jfree.chart.plot.PiePlot();
        double double55 = piePlot54.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor56 = piePlot54.getLabelDistributor();
        double double57 = piePlot54.getMinimumArcAngleToDraw();
        boolean boolean58 = piePlot54.getIgnoreZeroValues();
        boolean boolean59 = piePlot54.isSubplot();
        piePlot54.setCircular(false);
        java.awt.Paint paint63 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot54.setSectionOutlinePaint((java.lang.Comparable) "", paint63);
        piePlot47.setNoDataMessagePaint(paint63);
        piePlot41.setSectionPaint((java.lang.Comparable) 52.0d, paint63);
        piePlot28.setLabelPaint(paint63);
        piePlot0.setShadowPaint(paint63);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Pie Plot" + "'", str7, "Pie Plot");
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNull(pieURLGenerator12);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.025d + "'", double14 == 0.025d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.14d + "'", double18 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E-5d + "'", double20 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.14d + "'", double29 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0E-5d + "'", double31 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 4.0d + "'", double33 == 4.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.08d + "'", double36 == 0.08d);
        org.junit.Assert.assertNotNull(font37);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(font40);
        org.junit.Assert.assertNull(pieURLGenerator44);
        org.junit.Assert.assertNotNull(plot45);
        org.junit.Assert.assertNull(pieURLGenerator50);
        org.junit.Assert.assertNull(pieSectionLabelGenerator53);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.14d + "'", double55 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 1.0E-5d + "'", double57 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(paint63);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font9 = piePlot0.getLabelFont();
        piePlot0.setSimpleLabels(false);
        java.awt.Paint paint12 = piePlot0.getLabelPaint();
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setLabelOutlinePaint(paint13);
        piePlot0.setStartAngle((double) 100L);
        java.awt.Paint paint17 = piePlot0.getLabelShadowPaint();
        piePlot0.setBackgroundImageAlignment(100);
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot();
        double double22 = piePlot21.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor23 = piePlot21.getLabelDistributor();
        double double24 = piePlot21.getMinimumArcAngleToDraw();
        java.awt.Paint paint25 = piePlot21.getBaseSectionOutlinePaint();
        double double26 = piePlot21.getShadowYOffset();
        piePlot21.setBackgroundImageAlignment((int) (byte) -1);
        double double29 = piePlot21.getInteriorGap();
        java.awt.Font font30 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot21.setNoDataMessageFont(font30);
        java.awt.Paint paint32 = piePlot21.getLabelShadowPaint();
        java.awt.Font font33 = piePlot21.getLabelFont();
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset35 = null;
        piePlot34.setDataset(pieDataset35);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator37 = piePlot34.getURLGenerator();
        org.jfree.chart.plot.Plot plot38 = piePlot34.getRootPlot();
        org.jfree.chart.plot.PiePlot piePlot40 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset41 = null;
        piePlot40.setDataset(pieDataset41);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator43 = piePlot40.getURLGenerator();
        piePlot40.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator46 = piePlot40.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot47 = new org.jfree.chart.plot.PiePlot();
        double double48 = piePlot47.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor49 = piePlot47.getLabelDistributor();
        double double50 = piePlot47.getMinimumArcAngleToDraw();
        boolean boolean51 = piePlot47.getIgnoreZeroValues();
        boolean boolean52 = piePlot47.isSubplot();
        piePlot47.setCircular(false);
        java.awt.Paint paint56 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot47.setSectionOutlinePaint((java.lang.Comparable) "", paint56);
        piePlot40.setNoDataMessagePaint(paint56);
        piePlot34.setSectionPaint((java.lang.Comparable) 52.0d, paint56);
        piePlot21.setLabelPaint(paint56);
        piePlot0.setSectionPaint((java.lang.Comparable) 100.0d, paint56);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.14d + "'", double22 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0E-5d + "'", double24 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.0d + "'", double26 == 4.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.08d + "'", double29 == 0.08d);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(font33);
        org.junit.Assert.assertNull(pieURLGenerator37);
        org.junit.Assert.assertNotNull(plot38);
        org.junit.Assert.assertNull(pieURLGenerator43);
        org.junit.Assert.assertNull(pieSectionLabelGenerator46);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.14d + "'", double48 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 1.0E-5d + "'", double50 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(paint56);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        boolean boolean6 = piePlot0.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double8 = piePlot7.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor9 = piePlot7.getLabelDistributor();
        double double10 = piePlot7.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot7.drawBackgroundImage(graphics2D11, rectangle2D12);
        java.awt.Paint paint15 = piePlot7.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font16 = piePlot7.getLabelFont();
        piePlot0.setNoDataMessageFont(font16);
        boolean boolean18 = piePlot0.isOutlineVisible();
        double double19 = piePlot0.getLabelGap();
        org.jfree.chart.plot.Plot plot20 = piePlot0.getParent();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.025d + "'", double19 == 0.025d);
        org.junit.Assert.assertNull(plot20);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        piePlot0.setOutlineVisible(true);
        piePlot0.setLabelLinkMargin((double) (short) -1);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        piePlot0.markerChanged(markerChangeEvent6);
        piePlot0.setLabelLinkMargin(0.08d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font9 = piePlot0.getLabelFont();
        piePlot0.setSimpleLabels(false);
        piePlot0.setMinimumArcAngleToDraw((double) 100);
        org.jfree.data.general.DatasetGroup datasetGroup14 = piePlot0.getDatasetGroup();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot0.getSimpleLabelOffset();
        java.awt.Paint paint16 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot0.setLabelPaint(paint16);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        java.awt.Stroke stroke5 = piePlot0.getLabelOutlineStroke();
        java.awt.Shape shape6 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot0.setLegendItemShape(shape6);
        java.awt.Stroke stroke8 = piePlot0.getLabelLinkStroke();
        java.awt.Stroke stroke9 = piePlot0.getOutlineStroke();
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        double double11 = piePlot10.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup12 = piePlot10.getDatasetGroup();
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot10.setNoDataMessagePaint(paint13);
        double double16 = piePlot10.getExplodePercent((java.lang.Comparable) (-1));
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot();
        double double18 = piePlot17.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor19 = piePlot17.getLabelDistributor();
        double double20 = piePlot17.getMinimumArcAngleToDraw();
        java.awt.Paint paint21 = piePlot17.getBaseSectionOutlinePaint();
        java.awt.Paint paint22 = piePlot17.getBaseSectionPaint();
        piePlot10.setLabelShadowPaint(paint22);
        piePlot0.setBaseSectionPaint(paint22);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.14d + "'", double11 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.14d + "'", double18 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E-5d + "'", double20 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str9 = piePlot0.getNoDataMessage();
        java.awt.Paint paint10 = piePlot0.getLabelOutlinePaint();
        java.awt.Paint paint11 = piePlot0.getNoDataMessagePaint();
        java.awt.Image image12 = piePlot0.getBackgroundImage();
        double double13 = piePlot0.getLabelLinkMargin();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.025d + "'", double13 == 0.025d);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        piePlot0.setBackgroundAlpha((float) (byte) 0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot0.getLegendLabelGenerator();
        java.awt.Stroke stroke7 = piePlot0.getSectionOutlineStroke((java.lang.Comparable) '#');
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator5);
        org.junit.Assert.assertNull(stroke7);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        java.awt.Paint paint3 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setNoDataMessagePaint(paint3);
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        piePlot5.setDataset(pieDataset6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot5.getURLGenerator();
        org.jfree.chart.plot.Plot plot9 = piePlot5.getRootPlot();
        java.awt.Stroke stroke10 = piePlot5.getLabelOutlineStroke();
        piePlot0.setLabelLinkStroke(stroke10);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawBackground(graphics2D12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("Pie Plot", pieDataset1, pieDataset2, (int) (short) -1, true, true, true, locale7, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "Pie Plot", "", boxAndWhiskerXYDataset3, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        piePlot0.setOutlineVisible(false);
        org.jfree.data.general.DatasetGroup datasetGroup7 = piePlot0.getDatasetGroup();
        boolean boolean8 = piePlot0.getIgnoreZeroValues();
        java.awt.Font font9 = piePlot0.getNoDataMessageFont();
        java.awt.Paint paint10 = piePlot0.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str9 = piePlot0.getNoDataMessage();
        java.awt.Paint paint10 = piePlot0.getLabelOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot0.getLabelPadding();
        boolean boolean12 = piePlot0.getSimpleLabels();
        piePlot0.setBackgroundAlpha((float) 10);
        java.awt.Paint paint15 = piePlot0.getLabelBackgroundPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        piePlot0.handleClick(0, (int) (byte) 1, plotRenderingInfo18);
        piePlot0.setIgnoreNullValues(false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        boolean boolean5 = piePlot0.getLabelLinksVisible();
        boolean boolean6 = piePlot0.isSubplot();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("Pie Plot", "", "hi!", xYDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Stroke stroke7 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot0.setLabelLinkStroke(stroke7);
        boolean boolean9 = piePlot0.isOutlineVisible();
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot11 = piePlot10.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = piePlot10.getLabelDistributor();
        piePlot0.setParent((org.jfree.chart.plot.Plot) piePlot10);
        org.jfree.data.general.PieDataset pieDataset14 = null;
        piePlot10.setDataset(pieDataset14);
        int int16 = piePlot10.getPieIndex();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot0.setToolTipGenerator(pieToolTipGenerator2);
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset7 = null;
        org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "hi!", "", boxAndWhiskerXYDataset7, false);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart9);
        java.awt.Font font11 = piePlot0.getLabelFont();
        java.awt.Stroke stroke12 = piePlot0.getLabelOutlineStroke();
        org.junit.Assert.assertNull(datasetGroup1);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str9 = piePlot0.getNoDataMessage();
        java.awt.Paint paint10 = piePlot0.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot11.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor13 = piePlot11.getLabelDistributor();
        double double14 = piePlot11.getMinimumArcAngleToDraw();
        java.awt.Paint paint15 = piePlot11.getBaseSectionOutlinePaint();
        double double16 = piePlot11.getShadowYOffset();
        piePlot11.setOutlineVisible(true);
        java.awt.Paint paint19 = piePlot11.getLabelPaint();
        piePlot0.setNoDataMessagePaint(paint19);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Stroke stroke7 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot0.setLabelLinkStroke(stroke7);
        boolean boolean9 = piePlot0.isOutlineVisible();
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot11 = piePlot10.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = piePlot10.getLabelDistributor();
        piePlot0.setParent((org.jfree.chart.plot.Plot) piePlot10);
        piePlot0.setLabelLinksVisible(true);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        boolean boolean6 = piePlot0.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double8 = piePlot7.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor9 = piePlot7.getLabelDistributor();
        double double10 = piePlot7.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot7.drawBackgroundImage(graphics2D11, rectangle2D12);
        java.awt.Paint paint15 = piePlot7.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font16 = piePlot7.getLabelFont();
        piePlot0.setNoDataMessageFont(font16);
        boolean boolean18 = piePlot0.isOutlineVisible();
        double double19 = piePlot0.getLabelGap();
        org.jfree.chart.plot.Plot plot20 = piePlot0.getRootPlot();
        piePlot0.setCircular(true, false);
        int int24 = piePlot0.getBackgroundImageAlignment();
        boolean boolean25 = piePlot0.getLabelLinksVisible();
        piePlot0.setShadowYOffset((double) ' ');
        double double28 = piePlot0.getMaximumLabelWidth();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.025d + "'", double19 == 0.025d);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.14d + "'", double28 == 0.14d);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.jfree.data.xy.XYZDataset xYZDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBubbleChart("hi!", "hi!", "hi!", xYZDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot0.setToolTipGenerator(pieToolTipGenerator2);
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset7 = null;
        org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "hi!", "", boxAndWhiskerXYDataset7, false);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart9);
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator12 = piePlot11.getLegendLabelToolTipGenerator();
        piePlot11.setCircular(false, true);
        java.awt.Font font16 = piePlot11.getLabelFont();
        piePlot0.setLabelFont(font16);
        org.junit.Assert.assertNull(datasetGroup1);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertNull(pieSectionLabelGenerator12);
        org.junit.Assert.assertNotNull(font16);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        java.awt.Stroke stroke3 = piePlot0.getLabelLinkStroke();
        double double4 = piePlot0.getInteriorGap();
        java.awt.Stroke stroke6 = piePlot0.getSectionOutlineStroke((java.lang.Comparable) (short) 100);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08d + "'", double4 == 0.08d);
        org.junit.Assert.assertNull(stroke6);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        double double4 = piePlot0.getShadowXOffset();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot0.getLabelGenerator();
        java.awt.Paint paint7 = piePlot0.getSectionOutlinePaint((java.lang.Comparable) '4');
        piePlot0.setOutlineVisible(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator5);
        org.junit.Assert.assertNull(paint7);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart("Pie Plot", pieDataset1, true, false, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        boolean boolean6 = piePlot0.equals((java.lang.Object) true);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) 10);
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot();
        double double10 = piePlot9.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor11 = piePlot9.getLabelDistributor();
        double double12 = piePlot9.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        piePlot9.drawBackgroundImage(graphics2D13, rectangle2D14);
        java.awt.Paint paint17 = piePlot9.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str18 = piePlot9.getNoDataMessage();
        java.awt.Paint paint19 = piePlot9.getLabelOutlinePaint();
        java.awt.Paint paint20 = piePlot9.getNoDataMessagePaint();
        java.awt.Image image21 = piePlot9.getBackgroundImage();
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        double double23 = piePlot22.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor24 = piePlot22.getLabelDistributor();
        double double25 = piePlot22.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        piePlot22.drawBackgroundImage(graphics2D26, rectangle2D27);
        java.awt.Paint paint30 = piePlot22.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str31 = piePlot22.getNoDataMessage();
        piePlot22.setNoDataMessage("hi!");
        java.awt.Stroke stroke34 = piePlot22.getOutlineStroke();
        java.awt.Shape shape35 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot22.setLegendItemShape(shape35);
        piePlot9.setLegendItemShape(shape35);
        piePlot0.setLegendItemShape(shape35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(image21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.14d + "'", double23 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0E-5d + "'", double25 == 1.0E-5d);
        org.junit.Assert.assertNull(paint30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(shape35);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = null;
        piePlot0.setLabelGenerator(pieSectionLabelGenerator5);
        piePlot0.setCircular(false, false);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        boolean boolean2 = piePlot0.isCircular();
        java.awt.Paint paint3 = piePlot0.getLabelBackgroundPaint();
        double double4 = piePlot0.getInteriorGap();
        java.awt.Font font5 = piePlot0.getLabelFont();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08d + "'", double4 == 0.08d);
        org.junit.Assert.assertNotNull(font5);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        boolean boolean5 = piePlot0.isSubplot();
        piePlot0.setCircular(false);
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset11 = null;
        org.jfree.chart.JFreeChart jFreeChart13 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "hi!", "", boxAndWhiskerXYDataset11, false);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart13);
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        piePlot15.setDataset(pieDataset16);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator18 = piePlot15.getURLGenerator();
        float float19 = piePlot15.getForegroundAlpha();
        java.awt.Stroke stroke20 = piePlot15.getBaseSectionOutlineStroke();
        java.awt.Stroke stroke21 = piePlot15.getLabelLinkStroke();
        piePlot0.setBaseSectionOutlineStroke(stroke21);
        java.awt.Image image23 = null;
        piePlot0.setBackgroundImage(image23);
        double double25 = piePlot0.getShadowYOffset();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jFreeChart13);
        org.junit.Assert.assertNull(pieURLGenerator18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.0d + "'", double25 == 4.0d);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor5 = piePlot0.getLabelDistributor();
        org.jfree.chart.plot.Plot plot6 = piePlot0.getRootPlot();
        piePlot0.setMaximumLabelWidth((double) (short) 0);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor5);
        org.junit.Assert.assertNotNull(plot6);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.jfree.data.xy.XYZDataset xYZDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBubbleChart("Pie Plot", "hi!", "hi!", xYZDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Stroke stroke7 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot0.setLabelLinkStroke(stroke7);
        boolean boolean9 = piePlot0.isOutlineVisible();
        boolean boolean10 = piePlot0.getSectionOutlinesVisible();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator11 = null;
        piePlot0.setURLGenerator(pieURLGenerator11);
        double double13 = piePlot0.getLabelLinkMargin();
        piePlot0.setLabelGap((double) 1L);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator16 = piePlot0.getToolTipGenerator();
        int int17 = piePlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.025d + "'", double13 == 0.025d);
        org.junit.Assert.assertNull(pieToolTipGenerator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        piePlot0.setShadowYOffset((double) (short) 1);
        java.awt.Stroke stroke11 = piePlot0.getLabelLinkStroke();
        java.awt.Stroke stroke12 = piePlot0.getLabelLinkStroke();
        float float13 = piePlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str9 = piePlot0.getNoDataMessage();
        java.awt.Paint paint10 = piePlot0.getLabelOutlinePaint();
        java.awt.Stroke stroke11 = piePlot0.getLabelOutlineStroke();
        java.lang.String str12 = piePlot0.getPlotType();
        piePlot0.setShadowXOffset((double) (short) 0);
        piePlot0.setShadowXOffset((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pie Plot" + "'", str12, "Pie Plot");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        boolean boolean5 = piePlot0.isSubplot();
        java.lang.String str6 = piePlot0.getPlotType();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pie Plot" + "'", str6, "Pie Plot");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.lang.String str3 = piePlot0.getPlotType();
        org.jfree.data.general.DatasetGroup datasetGroup4 = piePlot0.getDatasetGroup();
        java.awt.Paint paint5 = piePlot0.getOutlinePaint();
        java.awt.Stroke stroke6 = piePlot0.getBaseSectionOutlineStroke();
        java.lang.Class<?> wildcardClass7 = stroke6.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Stroke stroke3 = piePlot0.getOutlineStroke();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = null;
        piePlot0.setLegendLabelURLGenerator(pieURLGenerator4);
        piePlot0.setPieIndex((int) '4');
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        double double9 = piePlot8.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor10 = piePlot8.getLabelDistributor();
        double double11 = piePlot8.getMinimumArcAngleToDraw();
        boolean boolean12 = piePlot8.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot13 = piePlot8.getRootPlot();
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot();
        double double15 = piePlot14.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor16 = piePlot14.getLabelDistributor();
        double double17 = piePlot14.getMinimumArcAngleToDraw();
        java.awt.Paint paint18 = piePlot14.getBaseSectionOutlinePaint();
        double double19 = piePlot14.getShadowYOffset();
        piePlot14.setBackgroundImageAlignment((int) (byte) -1);
        java.awt.Paint paint22 = piePlot14.getLabelPaint();
        piePlot8.setShadowPaint(paint22);
        java.awt.Paint paint24 = piePlot8.getLabelShadowPaint();
        java.awt.Paint paint25 = piePlot8.getLabelBackgroundPaint();
        piePlot0.setShadowPaint(paint25);
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot();
        double double28 = piePlot27.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor29 = piePlot27.getLabelDistributor();
        double double30 = piePlot27.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        piePlot27.drawBackgroundImage(graphics2D31, rectangle2D32);
        java.awt.Paint paint35 = piePlot27.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font36 = piePlot27.getLabelFont();
        piePlot27.setSimpleLabels(false);
        java.awt.Paint paint39 = piePlot27.getLabelPaint();
        piePlot27.setBackgroundImageAlignment((int) '#');
        org.jfree.chart.util.RectangleInsets rectangleInsets42 = piePlot27.getInsets();
        piePlot0.setSimpleLabelOffset(rectangleInsets42);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14d + "'", double9 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-5d + "'", double11 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-5d + "'", double17 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4.0d + "'", double19 == 4.0d);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.14d + "'", double28 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0E-5d + "'", double30 == 1.0E-5d);
        org.junit.Assert.assertNull(paint35);
        org.junit.Assert.assertNotNull(font36);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(rectangleInsets42);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font9 = piePlot0.getLabelFont();
        piePlot0.setSimpleLabels(false);
        java.awt.Paint paint12 = piePlot0.getLabelPaint();
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setLabelOutlinePaint(paint13);
        piePlot0.setStartAngle((double) 100L);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator17 = piePlot0.getURLGenerator();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        piePlot0.drawBackgroundImage(graphics2D18, rectangle2D19);
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator22 = piePlot21.getLegendLabelGenerator();
        piePlot21.setOutlineVisible(true);
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot();
        double double26 = piePlot25.getMaximumLabelWidth();
        piePlot25.setForegroundAlpha((float) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot25.setInsets(rectangleInsets29);
        piePlot21.setLabelPadding(rectangleInsets29);
        piePlot0.setSimpleLabelOffset(rectangleInsets29);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        piePlot0.handleClick((-1), (int) ' ', plotRenderingInfo35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(pieURLGenerator17);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator22);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.14d + "'", double26 == 0.14d);
        org.junit.Assert.assertNotNull(rectangleInsets29);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("Pie Plot", "", "Pie Plot", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelToolTipGenerator();
        piePlot0.setCircular(false, true);
        piePlot0.setLabelLinksVisible(true);
        double double7 = piePlot0.getInteriorGap();
        java.awt.Paint paint9 = piePlot0.getSectionOutlinePaint((java.lang.Comparable) '4');
        org.junit.Assert.assertNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08d + "'", double7 == 0.08d);
        org.junit.Assert.assertNull(paint9);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str9 = piePlot0.getNoDataMessage();
        java.awt.Paint paint10 = piePlot0.getLabelOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot0.getLabelPadding();
        boolean boolean12 = piePlot0.getSimpleLabels();
        piePlot0.setBackgroundAlpha((float) 10);
        java.awt.Paint paint15 = piePlot0.getLabelBackgroundPaint();
        java.awt.Paint paint16 = piePlot0.getLabelOutlinePaint();
        double double18 = piePlot0.getExplodePercent((java.lang.Comparable) 100L);
        java.awt.Paint paint19 = piePlot0.getLabelShadowPaint();
        java.awt.Paint paint20 = piePlot0.getBaseSectionPaint();
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setInteriorGap((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (10.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        boolean boolean6 = piePlot0.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double8 = piePlot7.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor9 = piePlot7.getLabelDistributor();
        double double10 = piePlot7.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot7.drawBackgroundImage(graphics2D11, rectangle2D12);
        java.awt.Paint paint15 = piePlot7.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font16 = piePlot7.getLabelFont();
        piePlot0.setNoDataMessageFont(font16);
        boolean boolean18 = piePlot0.isOutlineVisible();
        double double19 = piePlot0.getLabelGap();
        org.jfree.chart.plot.Plot plot20 = piePlot0.getRootPlot();
        piePlot0.setCircular(true, false);
        int int24 = piePlot0.getBackgroundImageAlignment();
        java.awt.Paint paint25 = piePlot0.getBaseSectionOutlinePaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.025d + "'", double19 == 0.025d);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        java.awt.Paint paint4 = piePlot0.getShadowPaint();
        int int5 = piePlot0.getPieIndex();
        java.awt.Paint paint6 = piePlot0.getLabelBackgroundPaint();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        java.awt.Stroke stroke5 = piePlot0.getLabelOutlineStroke();
        java.awt.Shape shape6 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot0.setLegendItemShape(shape6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot0.getLegendLabelURLGenerator();
        java.awt.Paint paint9 = piePlot0.getShadowPaint();
        java.awt.Paint paint10 = piePlot0.getNoDataMessagePaint();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createHighLowChart("", "Pie Plot", "Pie Plot", oHLCDataset3, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createHighLowChart("", "", "Pie Plot", oHLCDataset3, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("Pie Plot", "Pie Plot", "Pie Plot", xYDataset3, false, false, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        java.awt.Stroke stroke4 = piePlot0.getLabelLinkStroke();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(stroke4);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font9 = piePlot0.getLabelFont();
        piePlot0.setSimpleLabels(false);
        java.awt.Paint paint12 = piePlot0.getLabelPaint();
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setLabelOutlinePaint(paint13);
        piePlot0.setStartAngle((double) 100L);
        java.awt.Paint paint17 = piePlot0.getLabelShadowPaint();
        java.awt.Image image18 = null;
        piePlot0.setBackgroundImage(image18);
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot();
        double double21 = piePlot20.getMaximumLabelWidth();
        piePlot20.setForegroundAlpha(100.0f);
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot();
        double double25 = piePlot24.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor26 = piePlot24.getLabelDistributor();
        double double27 = piePlot24.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        piePlot24.drawBackgroundImage(graphics2D28, rectangle2D29);
        java.awt.Paint paint32 = piePlot24.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str33 = piePlot24.getNoDataMessage();
        java.awt.Paint paint34 = piePlot24.getLabelOutlinePaint();
        piePlot20.setBaseSectionOutlinePaint(paint34);
        boolean boolean36 = piePlot0.equals((java.lang.Object) piePlot20);
        piePlot0.setBackgroundImageAlignment((-1));
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = piePlot0.getInsets();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.14d + "'", double21 == 0.14d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.14d + "'", double25 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0E-5d + "'", double27 == 1.0E-5d);
        org.junit.Assert.assertNull(paint32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(rectangleInsets39);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        java.awt.Paint paint3 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setNoDataMessagePaint(paint3);
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        piePlot5.setDataset(pieDataset6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot5.getURLGenerator();
        org.jfree.chart.plot.Plot plot9 = piePlot5.getRootPlot();
        java.awt.Stroke stroke10 = piePlot5.getLabelOutlineStroke();
        piePlot0.setLabelLinkStroke(stroke10);
        java.awt.Stroke stroke12 = piePlot0.getOutlineStroke();
        piePlot0.setInteriorGap((double) (short) 0);
        java.awt.Image image15 = piePlot0.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(image15);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        java.awt.Paint paint3 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setNoDataMessagePaint(paint3);
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        piePlot5.setDataset(pieDataset6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot5.getURLGenerator();
        org.jfree.chart.plot.Plot plot9 = piePlot5.getRootPlot();
        java.awt.Stroke stroke10 = piePlot5.getLabelOutlineStroke();
        piePlot0.setLabelLinkStroke(stroke10);
        org.jfree.chart.util.Rotation rotation12 = piePlot0.getDirection();
        int int13 = piePlot0.getPieIndex();
        java.awt.Paint paint14 = piePlot0.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rotation12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart("hi!", pieDataset1, true, true, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.lang.String str3 = piePlot0.getPlotType();
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset5 = null;
        piePlot4.setDataset(pieDataset5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot4.getURLGenerator();
        float float8 = piePlot4.getForegroundAlpha();
        java.awt.Stroke stroke9 = piePlot4.getBaseSectionOutlineStroke();
        java.awt.Stroke stroke10 = piePlot4.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot11.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor13 = piePlot11.getLabelDistributor();
        double double14 = piePlot11.getMinimumArcAngleToDraw();
        java.awt.Paint paint15 = piePlot11.getBaseSectionOutlinePaint();
        double double16 = piePlot11.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = piePlot11.getSimpleLabelOffset();
        piePlot4.setLabelPadding(rectangleInsets17);
        piePlot0.setSimpleLabelOffset(rectangleInsets17);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator20 = piePlot0.getLegendLabelGenerator();
        org.jfree.data.general.DatasetGroup datasetGroup21 = piePlot0.getDatasetGroup();
        java.awt.Paint paint22 = piePlot0.getBaseSectionOutlinePaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator20);
        org.junit.Assert.assertNull(datasetGroup21);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        double double5 = piePlot0.getLabelGap();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelGenerator();
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        piePlot7.setDataset(pieDataset8);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator10 = piePlot7.getURLGenerator();
        piePlot7.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = piePlot7.getLegendLabelToolTipGenerator();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator14 = null;
        piePlot7.setURLGenerator(pieURLGenerator14);
        boolean boolean16 = piePlot0.equals((java.lang.Object) piePlot7);
        double double17 = piePlot7.getShadowXOffset();
        double double18 = piePlot7.getMaximumLabelWidth();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNull(pieURLGenerator10);
        org.junit.Assert.assertNull(pieSectionLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.0d + "'", double17 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.14d + "'", double18 == 0.14d);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreNullValues();
        boolean boolean5 = piePlot0.getIgnoreNullValues();
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        double double7 = piePlot6.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot6.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        piePlot6.setDataset(pieDataset9);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot6.setInsets(rectangleInsets11, false);
        piePlot0.setLabelPadding(rectangleInsets11);
        piePlot0.setShadowXOffset(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14d + "'", double7 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        java.awt.Paint paint2 = piePlot0.getLabelBackgroundPaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(paint2);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("Pie Plot", "hi!", "", categoryDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        piePlot0.setOutlineVisible(true);
        piePlot0.setLabelLinkMargin((double) (short) -1);
        piePlot0.setForegroundAlpha(1.0f);
        double double8 = piePlot0.getLabelGap();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.025d + "'", double8 == 0.025d);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("hi!", "Pie Plot", "Pie Plot", tableXYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot0.setToolTipGenerator(pieToolTipGenerator2);
        double double4 = piePlot0.getShadowYOffset();
        org.junit.Assert.assertNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.data.general.DatasetGroup datasetGroup7 = piePlot0.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(datasetGroup7);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("", "hi!", "Pie Plot", xYDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("", "hi!", "", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelToolTipGenerator();
        piePlot0.setCircular(false, true);
        java.awt.Font font5 = piePlot0.getLabelFont();
        java.awt.Paint paint6 = piePlot0.getOutlinePaint();
        org.junit.Assert.assertNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        java.awt.Paint paint6 = piePlot0.getShadowPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator7 = piePlot0.getLegendLabelGenerator();
        piePlot0.setPieIndex((int) ' ');
        double double10 = piePlot0.getShadowXOffset();
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        piePlot11.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint14 = piePlot11.getLabelLinkPaint();
        piePlot0.setShadowPaint(paint14);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        double double5 = piePlot0.getLabelGap();
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        double double7 = piePlot6.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor8 = piePlot6.getLabelDistributor();
        double double9 = piePlot6.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        piePlot6.drawBackgroundImage(graphics2D10, rectangle2D11);
        java.awt.Paint paint14 = piePlot6.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font15 = piePlot6.getLabelFont();
        piePlot6.setSimpleLabels(false);
        java.awt.Paint paint18 = piePlot6.getLabelPaint();
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot6.setLabelOutlinePaint(paint19);
        piePlot6.setStartAngle((double) 100L);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator23 = piePlot6.getToolTipGenerator();
        java.awt.Paint paint24 = piePlot6.getLabelBackgroundPaint();
        piePlot0.setLabelLinkPaint(paint24);
        java.awt.Stroke stroke26 = piePlot0.getLabelLinkStroke();
        piePlot0.setExplodePercent((java.lang.Comparable) (-1.0f), (double) 1.0f);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14d + "'", double7 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-5d + "'", double9 == 1.0E-5d);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(pieToolTipGenerator23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot0.getSimpleLabelOffset();
        java.awt.Stroke stroke7 = piePlot0.getLabelLinkStroke();
        java.awt.Image image8 = null;
        piePlot0.setBackgroundImage(image8);
        boolean boolean10 = piePlot0.isCircular();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        piePlot0.setBackgroundImageAlignment((int) 'a');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot0.getLabelDistributor();
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        piePlot5.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint8 = piePlot5.getLabelLinkPaint();
        piePlot0.setOutlinePaint(paint8);
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        double double11 = piePlot10.getMaximumLabelWidth();
        piePlot10.setForegroundAlpha((float) (short) 0);
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot();
        double double15 = piePlot14.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor16 = piePlot14.getLabelDistributor();
        double double17 = piePlot14.getMinimumArcAngleToDraw();
        java.awt.Paint paint18 = piePlot14.getBaseSectionOutlinePaint();
        double double19 = piePlot14.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = piePlot14.getSimpleLabelOffset();
        piePlot10.setInsets(rectangleInsets20);
        piePlot0.setInsets(rectangleInsets20);
        java.awt.Paint paint23 = piePlot0.getNoDataMessagePaint();
        org.junit.Assert.assertNull(datasetGroup1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.14d + "'", double11 == 0.14d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-5d + "'", double17 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4.0d + "'", double19 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        boolean boolean6 = piePlot0.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double8 = piePlot7.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor9 = piePlot7.getLabelDistributor();
        double double10 = piePlot7.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot7.drawBackgroundImage(graphics2D11, rectangle2D12);
        java.awt.Paint paint15 = piePlot7.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font16 = piePlot7.getLabelFont();
        piePlot0.setNoDataMessageFont(font16);
        boolean boolean18 = piePlot0.isOutlineVisible();
        double double19 = piePlot0.getLabelGap();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent20 = null;
        piePlot0.axisChanged(axisChangeEvent20);
        piePlot0.setIgnoreNullValues(false);
        org.jfree.chart.util.Rotation rotation24 = piePlot0.getDirection();
        java.lang.String str25 = piePlot0.getPlotType();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.025d + "'", double19 == 0.025d);
        org.junit.Assert.assertNotNull(rotation24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Pie Plot" + "'", str25, "Pie Plot");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        piePlot0.setMinimumArcAngleToDraw((double) 100.0f);
        java.awt.Image image6 = piePlot0.getBackgroundImage();
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        piePlot7.setDataset(pieDataset8);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator10 = piePlot7.getURLGenerator();
        float float11 = piePlot7.getForegroundAlpha();
        java.awt.Stroke stroke12 = piePlot7.getBaseSectionOutlineStroke();
        piePlot0.setOutlineStroke(stroke12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertNull(pieURLGenerator10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.jfree.data.xy.XYDataset xYDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPolarChart("Pie Plot", xYDataset1, true, false, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str9 = piePlot0.getNoDataMessage();
        java.awt.Paint paint10 = piePlot0.getLabelOutlinePaint();
        java.awt.Stroke stroke11 = piePlot0.getLabelOutlineStroke();
        java.lang.String str12 = piePlot0.getPlotType();
        piePlot0.setShadowXOffset((double) (short) 0);
        piePlot0.zoom(0.0d);
        boolean boolean17 = piePlot0.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pie Plot" + "'", str12, "Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        piePlot0.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelToolTipGenerator();
        boolean boolean7 = piePlot0.getSimpleLabels();
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        double double9 = piePlot8.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor10 = piePlot8.getLabelDistributor();
        double double11 = piePlot8.getMinimumArcAngleToDraw();
        java.awt.Paint paint12 = piePlot8.getBaseSectionOutlinePaint();
        double double13 = piePlot8.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot8.getSimpleLabelOffset();
        double double15 = piePlot8.getLabelLinkMargin();
        double double16 = piePlot8.getStartAngle();
        piePlot0.setParent((org.jfree.chart.plot.Plot) piePlot8);
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset19 = null;
        piePlot18.setDataset(pieDataset19);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator21 = piePlot18.getURLGenerator();
        org.jfree.chart.plot.Plot plot22 = piePlot18.getRootPlot();
        double double23 = piePlot18.getLabelGap();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator24 = piePlot18.getLegendLabelGenerator();
        piePlot8.setLegendLabelToolTipGenerator(pieSectionLabelGenerator24);
        double double26 = piePlot8.getLabelLinkMargin();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14d + "'", double9 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-5d + "'", double11 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.0d + "'", double13 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.025d + "'", double15 == 0.025d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 90.0d + "'", double16 == 90.0d);
        org.junit.Assert.assertNull(pieURLGenerator21);
        org.junit.Assert.assertNotNull(plot22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.025d + "'", double23 == 0.025d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator24);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.025d + "'", double26 == 0.025d);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("", "Pie Plot", "Pie Plot", xYDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("", "", true, "hi!", intervalXYDataset4, plotOrientation5, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart("", pieDataset1, false, false, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot0.getSimpleLabelOffset();
        double double7 = piePlot0.getLabelLinkMargin();
        java.lang.String str8 = piePlot0.getNoDataMessage();
        double double9 = piePlot0.getLabelLinkMargin();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.025d + "'", double7 == 0.025d);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.025d + "'", double9 == 0.025d);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        double double4 = piePlot0.getShadowXOffset();
        java.lang.Object obj5 = piePlot0.clone();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = null;
        piePlot0.setURLGenerator(pieURLGenerator6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
        float float3 = piePlot0.getForegroundAlpha();
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        double double5 = piePlot4.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor6 = piePlot4.getLabelDistributor();
        double double7 = piePlot4.getMinimumArcAngleToDraw();
        java.awt.Paint paint8 = piePlot4.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot4.getDrawingSupplier();
        double double10 = piePlot4.getShadowXOffset();
        java.awt.Paint paint11 = piePlot4.getLabelLinkPaint();
        java.awt.Paint paint12 = piePlot4.getLabelLinkPaint();
        piePlot0.setLabelOutlinePaint(paint12);
        piePlot0.setLabelGap((double) 0.5f);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-5d + "'", double7 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Paint paint7 = piePlot0.getNoDataMessagePaint();
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot9 = piePlot8.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor10 = piePlot8.getLabelDistributor();
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot11.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor13 = piePlot11.getLabelDistributor();
        double double14 = piePlot11.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        piePlot11.drawBackgroundImage(graphics2D15, rectangle2D16);
        java.awt.Paint paint19 = piePlot11.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font20 = piePlot11.getLabelFont();
        piePlot11.setSimpleLabels(false);
        java.awt.Paint paint23 = piePlot11.getLabelPaint();
        java.awt.Paint paint24 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot11.setLabelOutlinePaint(paint24);
        piePlot8.setLabelShadowPaint(paint24);
        piePlot0.setBaseSectionOutlinePaint(paint24);
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot();
        double double29 = piePlot28.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor30 = piePlot28.getLabelDistributor();
        double double31 = piePlot28.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D32 = null;
        java.awt.geom.Rectangle2D rectangle2D33 = null;
        piePlot28.drawBackgroundImage(graphics2D32, rectangle2D33);
        java.awt.Paint paint36 = piePlot28.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font37 = piePlot28.getLabelFont();
        piePlot28.setSimpleLabels(false);
        java.awt.Paint paint40 = piePlot28.getLabelPaint();
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset42 = null;
        piePlot41.setDataset(pieDataset42);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator44 = piePlot41.getURLGenerator();
        piePlot41.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator47 = piePlot41.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot48 = new org.jfree.chart.plot.PiePlot();
        double double49 = piePlot48.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor50 = piePlot48.getLabelDistributor();
        double double51 = piePlot48.getMinimumArcAngleToDraw();
        boolean boolean52 = piePlot48.getIgnoreZeroValues();
        boolean boolean53 = piePlot48.isSubplot();
        piePlot48.setCircular(false);
        java.awt.Paint paint57 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot48.setSectionOutlinePaint((java.lang.Comparable) "", paint57);
        piePlot41.setNoDataMessagePaint(paint57);
        piePlot28.setLabelBackgroundPaint(paint57);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor61 = piePlot28.getLabelDistributor();
        piePlot28.setExplodePercent((java.lang.Comparable) 0.4d, (double) (short) 1);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent65 = null;
        piePlot28.datasetChanged(datasetChangeEvent65);
        java.awt.Paint paint67 = piePlot28.getBackgroundPaint();
        piePlot0.setShadowPaint(paint67);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(plot9);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.14d + "'", double29 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0E-5d + "'", double31 == 1.0E-5d);
        org.junit.Assert.assertNull(paint36);
        org.junit.Assert.assertNotNull(font37);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNull(pieURLGenerator44);
        org.junit.Assert.assertNull(pieSectionLabelGenerator47);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.14d + "'", double49 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0E-5d + "'", double51 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor61);
        org.junit.Assert.assertNotNull(paint67);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        boolean boolean2 = piePlot0.getSectionOutlinesVisible();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator3 = piePlot0.getLegendLabelToolTipGenerator();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = null;
        piePlot0.setURLGenerator(pieURLGenerator4);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(pieSectionLabelGenerator3);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.lang.String str3 = piePlot0.getPlotType();
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset5 = null;
        piePlot4.setDataset(pieDataset5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot4.getURLGenerator();
        float float8 = piePlot4.getForegroundAlpha();
        java.awt.Stroke stroke9 = piePlot4.getBaseSectionOutlineStroke();
        java.awt.Stroke stroke10 = piePlot4.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot11.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor13 = piePlot11.getLabelDistributor();
        double double14 = piePlot11.getMinimumArcAngleToDraw();
        java.awt.Paint paint15 = piePlot11.getBaseSectionOutlinePaint();
        double double16 = piePlot11.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = piePlot11.getSimpleLabelOffset();
        piePlot4.setLabelPadding(rectangleInsets17);
        piePlot0.setSimpleLabelOffset(rectangleInsets17);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator20 = piePlot0.getLegendLabelGenerator();
        org.jfree.data.general.DatasetGroup datasetGroup21 = piePlot0.getDatasetGroup();
        boolean boolean22 = piePlot0.getSimpleLabels();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator20);
        org.junit.Assert.assertNull(datasetGroup21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("hi!", "", "", xYDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        piePlot0.setStartAngle((double) (byte) 10);
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double8 = piePlot7.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor9 = piePlot7.getLabelDistributor();
        double double10 = piePlot7.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot7.drawBackgroundImage(graphics2D11, rectangle2D12);
        java.awt.Paint paint15 = piePlot7.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font16 = piePlot7.getLabelFont();
        piePlot7.setSimpleLabels(false);
        piePlot7.setMinimumArcAngleToDraw((double) 100);
        boolean boolean21 = piePlot7.isOutlineVisible();
        java.awt.Paint paint22 = piePlot7.getBaseSectionOutlinePaint();
        piePlot0.setSectionOutlinePaint((java.lang.Comparable) 4.0d, paint22);
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        piePlot0.removeChangeListener(plotChangeListener24);
        int int26 = piePlot0.getPieIndex();
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot();
        double double28 = piePlot27.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor29 = piePlot27.getLabelDistributor();
        double double30 = piePlot27.getMinimumArcAngleToDraw();
        java.awt.Image image31 = null;
        piePlot27.setBackgroundImage(image31);
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot();
        double double34 = piePlot33.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor35 = piePlot33.getLabelDistributor();
        double double36 = piePlot33.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D37 = null;
        java.awt.geom.Rectangle2D rectangle2D38 = null;
        piePlot33.drawBackgroundImage(graphics2D37, rectangle2D38);
        java.awt.Paint paint41 = piePlot33.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str42 = piePlot33.getNoDataMessage();
        piePlot33.setNoDataMessage("hi!");
        piePlot33.setIgnoreZeroValues(false);
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = piePlot33.getLabelPadding();
        piePlot27.setSimpleLabelOffset(rectangleInsets47);
        piePlot0.setLabelPadding(rectangleInsets47);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.14d + "'", double28 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0E-5d + "'", double30 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.14d + "'", double34 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0E-5d + "'", double36 == 1.0E-5d);
        org.junit.Assert.assertNull(paint41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(rectangleInsets47);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("", "", "", intervalCategoryDataset3, true, true, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str9 = piePlot0.getNoDataMessage();
        java.awt.Paint paint10 = piePlot0.getLabelOutlinePaint();
        java.awt.Stroke stroke11 = piePlot0.getLabelOutlineStroke();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent12 = null;
        piePlot0.datasetChanged(datasetChangeEvent12);
        piePlot0.setForegroundAlpha((-1.0f));
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = null;
        piePlot0.setURLGenerator(pieURLGenerator16);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
        piePlot0.setCircular(true);
        piePlot0.setCircular(true, true);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent8 = null;
        piePlot0.datasetChanged(datasetChangeEvent8);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("Pie Plot", "", "hi!", xYDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        java.awt.Stroke stroke5 = piePlot0.getLabelOutlineStroke();
        java.awt.Shape shape6 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot0.setLegendItemShape(shape6);
        java.awt.Stroke stroke8 = piePlot0.getLabelLinkStroke();
        java.awt.Font font9 = piePlot0.getNoDataMessageFont();
        piePlot0.setMinimumArcAngleToDraw((double) (byte) 0);
        boolean boolean12 = piePlot0.getSectionOutlinesVisible();
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setInteriorGap(52.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (52.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint3 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot0.setLabelShadowPaint(paint3);
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        piePlot5.setDataset(pieDataset6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot5.getURLGenerator();
        org.jfree.chart.plot.Plot plot9 = piePlot5.getRootPlot();
        java.awt.Stroke stroke10 = piePlot5.getLabelOutlineStroke();
        java.awt.Shape shape11 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot5.setLegendItemShape(shape11);
        boolean boolean13 = piePlot0.equals((java.lang.Object) piePlot5);
        double double14 = piePlot0.getStartAngle();
        double double15 = piePlot0.getMinimumArcAngleToDraw();
        piePlot0.setBackgroundAlpha((float) '#');
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 90.0d + "'", double14 == 90.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot0.getSimpleLabelOffset();
        java.awt.Stroke stroke7 = null;
        piePlot0.setLabelOutlineStroke(stroke7);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets6);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint3 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot0.setLabelShadowPaint(paint3);
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        piePlot5.setDataset(pieDataset6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot5.getURLGenerator();
        org.jfree.chart.plot.Plot plot9 = piePlot5.getRootPlot();
        java.awt.Stroke stroke10 = piePlot5.getLabelOutlineStroke();
        java.awt.Shape shape11 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot5.setLegendItemShape(shape11);
        boolean boolean13 = piePlot0.equals((java.lang.Object) piePlot5);
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot15 = piePlot14.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor16 = piePlot14.getLabelDistributor();
        piePlot14.setCircular(false);
        piePlot5.setParent((org.jfree.chart.plot.Plot) piePlot14);
        org.jfree.chart.util.Rotation rotation20 = piePlot5.getDirection();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(plot15);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor16);
        org.junit.Assert.assertNotNull(rotation20);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str9 = piePlot0.getNoDataMessage();
        java.awt.Paint paint10 = piePlot0.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot11.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor13 = piePlot11.getLabelDistributor();
        double double14 = piePlot11.getMinimumArcAngleToDraw();
        java.awt.Paint paint15 = piePlot11.getBaseSectionOutlinePaint();
        double double16 = piePlot11.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = piePlot11.getSimpleLabelOffset();
        piePlot11.setIgnoreNullValues(false);
        piePlot0.setParent((org.jfree.chart.plot.Plot) piePlot11);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator21 = null;
        piePlot11.setLegendLabelURLGenerator(pieURLGenerator21);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets17);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str9 = piePlot0.getNoDataMessage();
        java.awt.Paint paint10 = piePlot0.getLabelOutlinePaint();
        java.awt.Stroke stroke11 = piePlot0.getLabelOutlineStroke();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent12 = null;
        piePlot0.datasetChanged(datasetChangeEvent12);
        piePlot0.setForegroundAlpha((-1.0f));
        java.lang.Object obj16 = piePlot0.clone();
        org.jfree.chart.plot.Plot plot17 = piePlot0.getParent();
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot();
        double double19 = piePlot18.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor20 = piePlot18.getLabelDistributor();
        double double21 = piePlot18.getMinimumArcAngleToDraw();
        java.awt.Paint paint22 = piePlot18.getBaseSectionOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection23 = piePlot18.getLegendItems();
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot();
        double double25 = piePlot24.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor26 = piePlot24.getLabelDistributor();
        double double27 = piePlot24.getMinimumArcAngleToDraw();
        boolean boolean28 = piePlot24.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot29 = piePlot24.getRootPlot();
        piePlot24.setOutlineVisible(false);
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot();
        double double33 = piePlot32.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor34 = piePlot32.getLabelDistributor();
        double double35 = piePlot32.getMinimumArcAngleToDraw();
        java.awt.Paint paint36 = piePlot32.getBaseSectionOutlinePaint();
        double double37 = piePlot32.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = piePlot32.getSimpleLabelOffset();
        java.awt.Stroke stroke39 = piePlot32.getLabelLinkStroke();
        piePlot24.setLabelOutlineStroke(stroke39);
        org.jfree.chart.plot.Plot plot41 = piePlot24.getParent();
        org.jfree.data.general.DatasetGroup datasetGroup42 = piePlot24.getDatasetGroup();
        java.awt.Paint paint43 = piePlot24.getLabelBackgroundPaint();
        piePlot18.setBaseSectionPaint(paint43);
        piePlot0.setLabelOutlinePaint(paint43);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(plot17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.14d + "'", double19 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0E-5d + "'", double21 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(legendItemCollection23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.14d + "'", double25 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0E-5d + "'", double27 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(plot29);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.14d + "'", double33 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0E-5d + "'", double35 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 4.0d + "'", double37 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets38);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNull(plot41);
        org.junit.Assert.assertNull(datasetGroup42);
        org.junit.Assert.assertNotNull(paint43);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font9 = piePlot0.getLabelFont();
        piePlot0.setSimpleLabels(false);
        java.awt.Paint paint12 = piePlot0.getLabelPaint();
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setLabelOutlinePaint(paint13);
        piePlot0.setStartAngle((double) 100L);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator17 = piePlot0.getURLGenerator();
        java.awt.Paint paint18 = piePlot0.getLabelLinkPaint();
        double double19 = piePlot0.getLabelLinkMargin();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator20 = piePlot0.getURLGenerator();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(pieURLGenerator17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.025d + "'", double19 == 0.025d);
        org.junit.Assert.assertNull(pieURLGenerator20);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        java.awt.Paint paint6 = piePlot0.getLabelPaint();
        java.awt.Paint paint7 = piePlot0.getLabelPaint();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        piePlot0.drawBackgroundImage(graphics2D8, rectangle2D9);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        boolean boolean7 = piePlot0.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        piePlot8.setDataset(pieDataset9);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator11 = piePlot8.getURLGenerator();
        org.jfree.chart.plot.Plot plot12 = piePlot8.getRootPlot();
        double double13 = piePlot8.getLabelGap();
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot();
        double double15 = piePlot14.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor16 = piePlot14.getLabelDistributor();
        double double17 = piePlot14.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        piePlot14.drawBackgroundImage(graphics2D18, rectangle2D19);
        java.awt.Paint paint22 = piePlot14.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str23 = piePlot14.getNoDataMessage();
        java.awt.Paint paint24 = piePlot14.getLabelOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = piePlot14.getLabelPadding();
        piePlot8.setSimpleLabelOffset(rectangleInsets25);
        piePlot0.setLabelPadding(rectangleInsets25);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(pieURLGenerator11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.025d + "'", double13 == 0.025d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-5d + "'", double17 == 1.0E-5d);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(rectangleInsets25);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedAreaChart("Pie Plot", "", "Pie Plot", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str9 = piePlot0.getNoDataMessage();
        java.awt.Paint paint10 = piePlot0.getLabelOutlinePaint();
        java.awt.Stroke stroke11 = piePlot0.getLabelOutlineStroke();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent12 = null;
        piePlot0.datasetChanged(datasetChangeEvent12);
        piePlot0.setForegroundAlpha((-1.0f));
        java.lang.Object obj16 = piePlot0.clone();
        double double17 = piePlot0.getLabelGap();
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot();
        double double19 = piePlot18.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup20 = piePlot18.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset21 = null;
        piePlot18.setDataset(pieDataset21);
        int int23 = piePlot18.getPieIndex();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator24 = piePlot18.getLegendLabelGenerator();
        piePlot0.setLabelGenerator(pieSectionLabelGenerator24);
        org.jfree.chart.LegendItemCollection legendItemCollection26 = piePlot0.getLegendItems();
        org.jfree.data.general.PieDataset pieDataset27 = null;
        piePlot0.setDataset(pieDataset27);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.025d + "'", double17 == 0.025d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.14d + "'", double19 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator24);
        org.junit.Assert.assertNull(legendItemCollection26);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        boolean boolean4 = piePlot0.isOutlineVisible();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator5 = piePlot0.getToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup7 = piePlot6.getDatasetGroup();
        piePlot6.setBackgroundImageAlignment((int) 'a');
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot11.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor13 = piePlot11.getLabelDistributor();
        double double14 = piePlot11.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        piePlot11.drawBackgroundImage(graphics2D15, rectangle2D16);
        java.awt.Paint paint19 = piePlot11.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str20 = piePlot11.getNoDataMessage();
        java.awt.Paint paint21 = piePlot11.getLabelOutlinePaint();
        piePlot6.setSectionPaint((java.lang.Comparable) 1.0d, paint21);
        piePlot0.setLabelBackgroundPaint(paint21);
        org.jfree.data.general.PieDataset pieDataset25 = null;
        org.jfree.chart.JFreeChart jFreeChart29 = org.jfree.chart.ChartFactory.createPieChart3D("Pie Plot", pieDataset25, false, true, true);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart29);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = piePlot0.getDrawingSupplier();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(pieToolTipGenerator5);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(jFreeChart29);
        org.junit.Assert.assertNotNull(drawingSupplier31);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
        double double3 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        double double5 = piePlot4.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup6 = piePlot4.getDatasetGroup();
        piePlot4.setOutlineVisible(true);
        boolean boolean10 = piePlot4.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot11.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor13 = piePlot11.getLabelDistributor();
        double double14 = piePlot11.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        piePlot11.drawBackgroundImage(graphics2D15, rectangle2D16);
        java.awt.Paint paint19 = piePlot11.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font20 = piePlot11.getLabelFont();
        piePlot4.setNoDataMessageFont(font20);
        boolean boolean22 = piePlot4.isOutlineVisible();
        double double23 = piePlot4.getLabelGap();
        java.awt.Paint paint24 = piePlot4.getLabelLinkPaint();
        java.awt.Paint paint25 = piePlot4.getNoDataMessagePaint();
        piePlot0.setShadowPaint(paint25);
        double double27 = piePlot0.getLabelLinkMargin();
        java.awt.Paint paint28 = piePlot0.getShadowPaint();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.14d + "'", double3 == 0.14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.025d + "'", double23 == 0.025d);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.025d + "'", double27 == 0.025d);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("", "", "", tableXYDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        java.awt.Paint paint6 = piePlot0.getShadowPaint();
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double8 = piePlot7.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor9 = piePlot7.getLabelDistributor();
        double double10 = piePlot7.getMinimumArcAngleToDraw();
        java.awt.Paint paint11 = piePlot7.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = piePlot7.getDrawingSupplier();
        double double13 = piePlot7.getShadowXOffset();
        java.awt.Paint paint14 = piePlot7.getLabelLinkPaint();
        java.awt.Shape shape15 = piePlot7.getLegendItemShape();
        piePlot0.setLegendItemShape(shape15);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(drawingSupplier12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.0d + "'", double13 == 4.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(shape15);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot0.setToolTipGenerator(pieToolTipGenerator2);
        double double4 = piePlot0.getInteriorGap();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08d + "'", double4 == 0.08d);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        boolean boolean4 = piePlot0.isOutlineVisible();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator5 = piePlot0.getToolTipGenerator();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot0.getURLGenerator();
        java.awt.Image image7 = piePlot0.getBackgroundImage();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(pieToolTipGenerator5);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertNull(image7);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        boolean boolean6 = piePlot0.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double8 = piePlot7.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor9 = piePlot7.getLabelDistributor();
        double double10 = piePlot7.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot7.drawBackgroundImage(graphics2D11, rectangle2D12);
        java.awt.Paint paint15 = piePlot7.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font16 = piePlot7.getLabelFont();
        piePlot0.setNoDataMessageFont(font16);
        boolean boolean18 = piePlot0.isOutlineVisible();
        double double19 = piePlot0.getLabelGap();
        java.awt.Paint paint20 = piePlot0.getLabelLinkPaint();
        java.awt.Paint paint21 = piePlot0.getNoDataMessagePaint();
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset25 = null;
        org.jfree.chart.JFreeChart jFreeChart27 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("hi!", "", "Pie Plot", boxAndWhiskerXYDataset25, false);
        boolean boolean28 = piePlot0.equals((java.lang.Object) jFreeChart27);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.025d + "'", double19 == 0.025d);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(jFreeChart27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedAreaChart("", "", "Pie Plot", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        piePlot0.setBackgroundImageAlignment((int) (byte) -1);
        piePlot0.setBackgroundImageAlpha((float) (short) 1);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator10 = null;
        piePlot0.setToolTipGenerator(pieToolTipGenerator10);
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setInteriorGap((double) 0.5f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (0.5) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart3D("hi!", "", "", categoryDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("hi!", "hi!", "", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("Pie Plot", "", "Pie Plot", categoryDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        piePlot0.setMaximumLabelWidth(0.08d);
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot11.getMaximumLabelWidth();
        piePlot11.setForegroundAlpha(100.0f);
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot();
        double double16 = piePlot15.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor17 = piePlot15.getLabelDistributor();
        double double18 = piePlot15.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        piePlot15.drawBackgroundImage(graphics2D19, rectangle2D20);
        java.awt.Paint paint23 = piePlot15.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str24 = piePlot15.getNoDataMessage();
        java.awt.Paint paint25 = piePlot15.getLabelOutlinePaint();
        piePlot11.setBaseSectionOutlinePaint(paint25);
        piePlot0.setShadowPaint(paint25);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.14d + "'", double16 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-5d + "'", double18 == 1.0E-5d);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Paint paint7 = piePlot0.getNoDataMessagePaint();
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot0.setLabelPaint(paint8);
        boolean boolean10 = piePlot0.getSectionOutlinesVisible();
        piePlot0.setStartAngle((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font9 = piePlot0.getLabelFont();
        piePlot0.setSimpleLabels(false);
        piePlot0.setMinimumArcAngleToDraw((double) 100);
        org.jfree.data.general.PieDataset pieDataset14 = null;
        piePlot0.setDataset(pieDataset14);
        double double16 = piePlot0.getMinimumArcAngleToDraw();
        java.lang.Object obj17 = piePlot0.clone();
        piePlot0.setShadowYOffset((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
        float float3 = piePlot0.getForegroundAlpha();
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        double double5 = piePlot4.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor6 = piePlot4.getLabelDistributor();
        double double7 = piePlot4.getMinimumArcAngleToDraw();
        java.awt.Paint paint8 = piePlot4.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot4.getDrawingSupplier();
        double double10 = piePlot4.getShadowXOffset();
        java.awt.Paint paint11 = piePlot4.getLabelLinkPaint();
        java.awt.Paint paint12 = piePlot4.getLabelLinkPaint();
        piePlot0.setLabelOutlinePaint(paint12);
        piePlot0.setOutlineVisible(false);
        java.awt.Paint paint16 = piePlot0.getNoDataMessagePaint();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        piePlot0.drawOutline(graphics2D17, rectangle2D18);
        java.awt.Stroke stroke20 = piePlot0.getBaseSectionOutlineStroke();
        double double21 = piePlot0.getShadowXOffset();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-5d + "'", double7 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.0d + "'", double21 == 4.0d);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        piePlot0.setBackgroundImageAlignment((int) (byte) -1);
        double double8 = piePlot0.getInteriorGap();
        java.awt.Font font9 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot0.setNoDataMessageFont(font9);
        java.awt.Stroke stroke12 = piePlot0.getSectionOutlineStroke((java.lang.Comparable) (byte) -1);
        java.awt.Paint paint14 = piePlot0.getSectionOutlinePaint((java.lang.Comparable) "");
        boolean boolean15 = piePlot0.getSectionOutlinesVisible();
        piePlot0.setLabelGap((double) 10);
        piePlot0.setStartAngle((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNull(stroke12);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        float float4 = piePlot0.getForegroundAlpha();
        java.awt.Stroke stroke5 = piePlot0.getBaseSectionOutlineStroke();
        java.awt.Stroke stroke6 = piePlot0.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        piePlot7.setDataset(pieDataset8);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator10 = piePlot7.getURLGenerator();
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset12 = null;
        piePlot11.setDataset(pieDataset12);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator14 = piePlot11.getURLGenerator();
        piePlot11.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator17 = piePlot11.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot();
        double double19 = piePlot18.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor20 = piePlot18.getLabelDistributor();
        double double21 = piePlot18.getMinimumArcAngleToDraw();
        boolean boolean22 = piePlot18.getIgnoreZeroValues();
        boolean boolean23 = piePlot18.isSubplot();
        piePlot18.setCircular(false);
        java.awt.Paint paint27 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot18.setSectionOutlinePaint((java.lang.Comparable) "", paint27);
        piePlot11.setNoDataMessagePaint(paint27);
        piePlot7.setLabelShadowPaint(paint27);
        piePlot0.setBackgroundPaint(paint27);
        piePlot0.setSectionOutlinesVisible(false);
        piePlot0.setForegroundAlpha((float) (byte) 10);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(pieURLGenerator10);
        org.junit.Assert.assertNull(pieURLGenerator14);
        org.junit.Assert.assertNull(pieSectionLabelGenerator17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.14d + "'", double19 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0E-5d + "'", double21 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("Pie Plot", "hi!", "hi!", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        piePlot0.setForegroundAlpha(100.0f);
        piePlot0.zoom(0.0d);
        double double6 = piePlot0.getMaximumLabelWidth();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.14d + "'", double6 == 0.14d);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        piePlot0.setOutlineVisible(true);
        piePlot0.setOutlineVisible(false);
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        piePlot6.setDataset(pieDataset7);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator9 = piePlot6.getURLGenerator();
        org.jfree.chart.plot.Plot plot10 = piePlot6.getRootPlot();
        boolean boolean11 = piePlot6.getLabelLinksVisible();
        java.awt.Font font12 = piePlot6.getNoDataMessageFont();
        piePlot0.setLabelFont(font12);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertNull(pieURLGenerator9);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(font12);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        org.jfree.chart.plot.Plot plot2 = piePlot0.getParent();
        boolean boolean3 = piePlot0.isCircular();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = piePlot0.getDrawingSupplier();
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup6 = piePlot5.getDatasetGroup();
        piePlot5.setBackgroundImageAlignment((int) 'a');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor9 = piePlot5.getLabelDistributor();
        piePlot0.setLabelDistributor(abstractPieLabelDistributor9);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        piePlot0.handleClick(0, 10, plotRenderingInfo13);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(drawingSupplier4);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        piePlot0.setBackgroundImageAlignment((int) (byte) -1);
        double double8 = piePlot0.getInteriorGap();
        java.awt.Font font9 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot0.setNoDataMessageFont(font9);
        java.awt.Paint paint11 = piePlot0.getLabelShadowPaint();
        java.awt.Image image12 = null;
        piePlot0.setBackgroundImage(image12);
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot();
        piePlot15.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot15.setLabelShadowPaint(paint18);
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset21 = null;
        piePlot20.setDataset(pieDataset21);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator23 = piePlot20.getURLGenerator();
        org.jfree.chart.plot.Plot plot24 = piePlot20.getRootPlot();
        java.awt.Stroke stroke25 = piePlot20.getLabelOutlineStroke();
        java.awt.Shape shape26 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot20.setLegendItemShape(shape26);
        boolean boolean28 = piePlot15.equals((java.lang.Object) piePlot20);
        double double29 = piePlot15.getStartAngle();
        double double30 = piePlot15.getMinimumArcAngleToDraw();
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset32 = null;
        piePlot31.setDataset(pieDataset32);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator34 = piePlot31.getURLGenerator();
        float float35 = piePlot31.getForegroundAlpha();
        java.awt.Stroke stroke36 = piePlot31.getBaseSectionOutlineStroke();
        piePlot15.setLabelOutlineStroke(stroke36);
        piePlot0.setSectionOutlineStroke((java.lang.Comparable) (-1.0d), stroke36);
        piePlot0.setCircular(true);
        piePlot0.setIgnoreNullValues(true);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(pieURLGenerator23);
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 90.0d + "'", double29 == 90.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 52.0d + "'", double30 == 52.0d);
        org.junit.Assert.assertNull(pieURLGenerator34);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 1.0f + "'", float35 == 1.0f);
        org.junit.Assert.assertNotNull(stroke36);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Stroke stroke7 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot0.setLabelLinkStroke(stroke7);
        boolean boolean9 = piePlot0.isOutlineVisible();
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot11 = piePlot10.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = piePlot10.getLabelDistributor();
        piePlot0.setParent((org.jfree.chart.plot.Plot) piePlot10);
        java.awt.Stroke stroke15 = null;
        piePlot10.setSectionOutlineStroke((java.lang.Comparable) 1, stroke15);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator17 = null;
        piePlot10.setURLGenerator(pieURLGenerator17);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent19 = null;
        piePlot10.markerChanged(markerChangeEvent19);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.lang.String str5 = piePlot0.getPlotType();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        piePlot0.setDataset(pieDataset3);
        piePlot0.setPieIndex((int) '4');
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawOutline(graphics2D7, rectangle2D8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        java.awt.Paint paint4 = piePlot0.getShadowPaint();
        int int5 = piePlot0.getPieIndex();
        piePlot0.setLabelLinkMargin((double) 10);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        java.awt.Paint paint6 = piePlot0.getLabelLinkPaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("", "Pie Plot", "Pie Plot", categoryDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
        float float3 = piePlot0.getForegroundAlpha();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        java.awt.Paint paint6 = piePlot0.getSectionOutlinePaint((java.lang.Comparable) 1.0f);
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot0.setLabelOutlinePaint(paint7);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        plot4.zoom((double) (-1.0f));
        java.awt.Paint paint7 = plot4.getBackgroundPaint();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        float float9 = piePlot0.getForegroundAlpha();
        double double10 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Stroke stroke11 = piePlot0.getLabelOutlineStroke();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        piePlot0.setBackgroundImageAlignment((int) (byte) -1);
        piePlot0.setBackgroundImageAlpha((float) (short) 1);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator10 = null;
        piePlot0.setToolTipGenerator(pieToolTipGenerator10);
        org.jfree.data.general.PieDataset pieDataset12 = piePlot0.getDataset();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNull(pieDataset12);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        piePlot0.setCircular(true);
        piePlot0.setForegroundAlpha((float) (short) 100);
        boolean boolean10 = piePlot0.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator11 = piePlot0.getToolTipGenerator();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(pieToolTipGenerator11);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        double double5 = piePlot0.getLabelGap();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelGenerator();
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        piePlot7.setDataset(pieDataset8);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator10 = piePlot7.getURLGenerator();
        piePlot7.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = piePlot7.getLegendLabelToolTipGenerator();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator14 = null;
        piePlot7.setURLGenerator(pieURLGenerator14);
        boolean boolean16 = piePlot0.equals((java.lang.Object) piePlot7);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot();
        double double20 = piePlot19.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor21 = piePlot19.getLabelDistributor();
        double double22 = piePlot19.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        piePlot19.drawBackgroundImage(graphics2D23, rectangle2D24);
        java.awt.Paint paint27 = piePlot19.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str28 = piePlot19.getNoDataMessage();
        piePlot19.setNoDataMessage("hi!");
        java.awt.Stroke stroke31 = piePlot19.getOutlineStroke();
        java.awt.Shape shape32 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot19.setLegendItemShape(shape32);
        piePlot19.setBackgroundImageAlignment(0);
        piePlot19.setShadowXOffset((double) 15);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState40 = piePlot7.initialise(graphics2D17, rectangle2D18, piePlot19, (java.lang.Integer) 100, plotRenderingInfo39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNull(pieURLGenerator10);
        org.junit.Assert.assertNull(pieSectionLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.14d + "'", double20 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0E-5d + "'", double22 == 1.0E-5d);
        org.junit.Assert.assertNull(paint27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(shape32);
    }
}

