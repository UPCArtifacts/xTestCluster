import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        int int0 = org.jfree.chart.plot.Plot.MINIMUM_HEIGHT_TO_DRAW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        double double0 = org.jfree.chart.plot.PiePlot.MAX_INTERIOR_GAP;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.4d + "'", double0 == 0.4d);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        float float0 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_ALPHA;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        java.awt.Paint paint3 = null;
        piePlot3D0.setShadowPaint(paint3);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jfree.chart.axis.AxisLocation axisLocation0 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge2 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation0, plotOrientation1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jfree.chart.axis.AxisLocation axisLocation0 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge2 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(axisLocation0, plotOrientation1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setDarkerSides(false);
        org.jfree.chart.util.Rotation rotation3 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setDirection(rotation3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'direction' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setInteriorGap(100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (100.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setInteriorGap((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (100.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        int int0 = org.jfree.chart.plot.Plot.MINIMUM_WIDTH_TO_DRAW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot3D0.getURLGenerator();
        java.awt.Paint paint8 = piePlot3D0.getLabelOutlinePaint();
        int int9 = piePlot3D0.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot3D0.getDatasetGroup();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setLabelDistributor(abstractPieLabelDistributor9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'distributor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup8);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        float float0 = org.jfree.chart.plot.Plot.DEFAULT_FOREGROUND_ALPHA;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        plot8.zoom((double) 0.0f);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        java.awt.Font font4 = piePlot3D0.getNoDataMessageFont();
        java.awt.Paint paint5 = piePlot3D0.getOutlinePaint();
        java.lang.Class<?> wildcardClass6 = piePlot3D0.getClass();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean1 = piePlot3D0.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator2);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.drawBackground(graphics2D4, rectangle2D5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.lang.Number number0 = org.jfree.chart.plot.Plot.ZERO;
        org.junit.Assert.assertEquals("'" + number0 + "' != '" + 0 + "'", number0, 0);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        java.awt.Font font4 = piePlot3D0.getNoDataMessageFont();
        java.awt.Paint paint5 = piePlot3D0.getShadowPaint();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.drawBackground(graphics2D6, rectangle2D7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D6.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = piePlot3D6.getLabelPadding();
        java.awt.Font font10 = piePlot3D6.getNoDataMessageFont();
        piePlot3D0.setLabelFont(font10);
        piePlot3D0.setExplodePercent((java.lang.Comparable) 0.14d, (double) 1.0f);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D17.setLabelPadding(rectangleInsets18);
        java.awt.Paint paint20 = piePlot3D17.getLabelLinkPaint();
        java.awt.Paint paint21 = piePlot3D17.getShadowPaint();
        piePlot3D17.setShadowXOffset((double) 15);
        java.lang.String str24 = piePlot3D17.getPlotType();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState27 = piePlot3D0.initialise(graphics2D15, rectangle2D16, (org.jfree.chart.plot.PiePlot) piePlot3D17, (java.lang.Integer) 10, plotRenderingInfo26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Pie 3D Plot" + "'", str24, "Pie 3D Plot");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D5.setLabelPadding(rectangleInsets6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        piePlot3D5.handleClick((int) (short) 100, 0, plotRenderingInfo10);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = piePlot3D5.getURLGenerator();
        java.awt.Paint paint13 = piePlot3D5.getLabelOutlinePaint();
        piePlot3D0.setLabelShadowPaint(paint13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = piePlot3D0.getDatasetGroup();
        piePlot3D0.setCircular(true);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor18 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setLabelDistributor(abstractPieLabelDistributor18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'distributor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(pieURLGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup15);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        piePlot3D0.zoom((double) '#');
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setInteriorGap((double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (1.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        piePlot3D0.zoom((double) '#');
        java.awt.Font font10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D0.setLabelFont(font10);
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D12.setLabelPadding(rectangleInsets13);
        java.awt.Paint paint15 = piePlot3D12.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator16 = null;
        piePlot3D12.setLegendLabelToolTipGenerator(pieSectionLabelGenerator16);
        piePlot3D12.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot20 = piePlot3D12.getRootPlot();
        java.awt.Stroke stroke21 = piePlot3D12.getOutlineStroke();
        piePlot3D0.setLabelOutlineStroke(stroke21);
        java.awt.Paint paint24 = piePlot3D0.getSectionPaint((java.lang.Comparable) ' ');
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNull(paint24);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.awt.Stroke stroke0 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_OUTLINE_STROKE;
        org.junit.Assert.assertNotNull(stroke0);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot3D0.getDatasetGroup();
        piePlot3D0.setLabelLinkMargin((double) (byte) 0);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup8);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        piePlot3D0.setShadowXOffset(1.0d);
        java.awt.Paint paint10 = piePlot3D0.getLabelOutlinePaint();
        java.lang.Class<?> wildcardClass11 = piePlot3D0.getClass();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        double double0 = org.jfree.chart.plot.PiePlot.DEFAULT_START_ANGLE;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 90.0d + "'", double0 == 90.0d);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot3D0.addChangeListener(plotChangeListener4);
        java.awt.Paint paint6 = piePlot3D0.getShadowPaint();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = piePlot3D0.getToolTipGenerator();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.drawOutline(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(pieToolTipGenerator7);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        double double0 = org.jfree.chart.plot.PiePlot.DEFAULT_INTERIOR_GAP;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.08d + "'", double0 == 0.08d);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        piePlot3D0.setShadowXOffset(1.0d);
        java.awt.Paint paint10 = piePlot3D0.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D11.setSectionOutlinesVisible(true);
        piePlot3D11.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        piePlot3D11.drawBackgroundImage(graphics2D16, rectangle2D17);
        java.awt.Paint paint19 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D11.setNoDataMessagePaint(paint19);
        piePlot3D0.setShadowPaint(paint19);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = null;
        piePlot3D0.setURLGenerator(pieURLGenerator22);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        float float3 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot3D0.drawBackgroundImage(graphics2D4, rectangle2D5);
        float float7 = piePlot3D0.getBackgroundImageAlpha();
        org.jfree.chart.util.Rotation rotation8 = piePlot3D0.getDirection();
        double double10 = piePlot3D0.getExplodePercent((java.lang.Comparable) 100.0f);
        piePlot3D0.setIgnoreNullValues(true);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D15 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean16 = piePlot3D15.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator17 = null;
        piePlot3D15.setToolTipGenerator(pieToolTipGenerator17);
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D19.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke23 = piePlot3D19.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator24 = piePlot3D19.getLegendLabelGenerator();
        piePlot3D15.setLabelGenerator(pieSectionLabelGenerator24);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState28 = piePlot3D0.initialise(graphics2D13, rectangle2D14, (org.jfree.chart.plot.PiePlot) piePlot3D15, (java.lang.Integer) 100, plotRenderingInfo27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(rotation8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(stroke23);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator24);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        float float3 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot3D0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Font font7 = piePlot3D0.getLabelFont();
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D8.setLabelPadding(rectangleInsets9);
        java.awt.Paint paint11 = piePlot3D8.getLabelLinkPaint();
        java.awt.Paint paint12 = piePlot3D8.getShadowPaint();
        piePlot3D0.setBaseSectionOutlinePaint(paint12);
        double double14 = piePlot3D0.getMaximumLabelWidth();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.14d + "'", double14 == 0.14d);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot3D0.getInsets();
        java.awt.Paint paint6 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D0.setShadowPaint(paint6);
        piePlot3D0.setIgnoreZeroValues(true);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.drawOutline(graphics2D10, rectangle2D11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        double double0 = org.jfree.chart.plot.PiePlot.DEFAULT_MINIMUM_ARC_ANGLE_TO_DRAW;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0E-5d + "'", double0 == 1.0E-5d);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D6.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = piePlot3D6.getLabelPadding();
        java.awt.Font font10 = piePlot3D6.getNoDataMessageFont();
        piePlot3D0.setLabelFont(font10);
        piePlot3D0.setExplodePercent((java.lang.Comparable) 0.14d, (double) 1.0f);
        piePlot3D0.setDarkerSides(false);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(font10);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator3 = piePlot3D0.getToolTipGenerator();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieToolTipGenerator3);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        double double7 = piePlot3D0.getDepthFactor();
        double double8 = piePlot3D0.getInteriorGap();
        double double9 = piePlot3D0.getStartAngle();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12d + "'", double7 == 0.12d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 90.0d + "'", double9 == 90.0d);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot3D0.addChangeListener(plotChangeListener4);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator6);
        piePlot3D0.setBackgroundImageAlignment((int) (short) 10);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot3D0.getDatasetGroup();
        org.jfree.chart.plot.Plot plot9 = piePlot3D0.getParent();
        piePlot3D0.setDarkerSides(true);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNull(plot9);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot3D0.getInsets();
        java.awt.Image image6 = null;
        piePlot3D0.setBackgroundImage(image6);
        java.awt.Paint paint8 = piePlot3D0.getShadowPaint();
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setDarkerSides(false);
        boolean boolean3 = piePlot3D0.isOutlineVisible();
        boolean boolean4 = piePlot3D0.getIgnoreNullValues();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot3D0.getLegendLabelToolTipGenerator();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator6);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(pieSectionLabelGenerator5);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.data.general.PieDataset pieDataset3 = piePlot3D0.getDataset();
        java.lang.Object obj4 = null;
        boolean boolean5 = piePlot3D0.equals(obj4);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        java.awt.geom.Point2D point2D8 = null;
        org.jfree.chart.plot.PlotState plotState9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.draw(graphics2D6, rectangle2D7, point2D8, plotState9, plotRenderingInfo10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieDataset3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        org.jfree.chart.plot.Plot plot6 = piePlot3D0.getParent();
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D7.setLabelPadding(rectangleInsets8);
        java.awt.Paint paint10 = piePlot3D7.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener11 = null;
        piePlot3D7.addChangeListener(plotChangeListener11);
        java.awt.Paint paint13 = piePlot3D7.getShadowPaint();
        piePlot3D0.setBaseSectionPaint(paint13);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        double double7 = piePlot3D0.getDepthFactor();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.drawBackground(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12d + "'", double7 == 0.12d);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot3D0.getInsets();
        org.jfree.chart.plot.Plot plot6 = piePlot3D0.getRootPlot();
        org.jfree.chart.plot.Plot plot7 = piePlot3D0.getParent();
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D8.setLabelPadding(rectangleInsets9);
        float float11 = piePlot3D8.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        piePlot3D8.drawBackgroundImage(graphics2D12, rectangle2D13);
        java.awt.Stroke stroke16 = piePlot3D8.getSectionOutlineStroke((java.lang.Comparable) 0.5f);
        java.awt.Paint paint17 = piePlot3D8.getBaseSectionPaint();
        // The following exception was thrown during execution in test generation
        try {
            plot7.setOutlinePaint(paint17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNull(plot7);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
        org.junit.Assert.assertNull(stroke16);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.awt.Paint paint9 = piePlot3D0.getBaseSectionOutlinePaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        piePlot3D0.datasetChanged(datasetChangeEvent10);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        double double4 = piePlot3D0.getShadowYOffset();
        double double5 = piePlot3D0.getShadowXOffset();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        piePlot3D0.removeChangeListener(plotChangeListener8);
        java.awt.Stroke stroke11 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) 0.12d);
        org.junit.Assert.assertNull(stroke11);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.data.general.PieDataset pieDataset3 = piePlot3D0.getDataset();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.drawBackground(graphics2D4, rectangle2D5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieDataset3);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D5.setLabelPadding(rectangleInsets6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        piePlot3D5.handleClick((int) (short) 100, 0, plotRenderingInfo10);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = piePlot3D5.getURLGenerator();
        java.awt.Paint paint13 = piePlot3D5.getLabelOutlinePaint();
        piePlot3D0.setLabelShadowPaint(paint13);
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        piePlot3D0.addChangeListener(plotChangeListener15);
        piePlot3D0.setCircular(false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        piePlot3D0.handleClick(1, 0, plotRenderingInfo21);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(pieURLGenerator12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setDarkerSides(false);
        org.jfree.chart.plot.PiePlot3D piePlot3D3 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean4 = piePlot3D3.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator5 = null;
        piePlot3D3.setToolTipGenerator(pieToolTipGenerator5);
        java.awt.Paint paint7 = piePlot3D3.getShadowPaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = piePlot3D3.getDrawingSupplier();
        piePlot3D0.setDrawingSupplier(drawingSupplier8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        java.awt.Stroke stroke10 = piePlot3D0.getOutlineStroke();
        double double11 = piePlot3D0.getInteriorGap();
        boolean boolean12 = piePlot3D0.isOutlineVisible();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.08d + "'", double11 == 0.08d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D5.setLabelPadding(rectangleInsets6);
        piePlot3D0.setSimpleLabelOffset(rectangleInsets6);
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D9.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = piePlot3D9.getLabelPadding();
        piePlot3D9.setShadowXOffset(10.0d);
        piePlot3D9.setCircular(false);
        piePlot3D9.setLabelGap((double) (short) 1);
        java.awt.Paint paint19 = piePlot3D9.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke20 = piePlot3D9.getLabelLinkStroke();
        java.awt.Paint paint21 = piePlot3D9.getBaseSectionPaint();
        piePlot3D0.setBaseSectionPaint(paint21);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D5.setLabelPadding(rectangleInsets6);
        java.awt.Paint paint8 = piePlot3D5.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator9 = null;
        piePlot3D5.setLegendLabelToolTipGenerator(pieSectionLabelGenerator9);
        piePlot3D5.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot13 = piePlot3D5.getRootPlot();
        java.awt.Stroke stroke14 = piePlot3D5.getOutlineStroke();
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) (-1.0d), stroke14);
        java.awt.Paint paint17 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNull(paint17);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot3D0.getInsets();
        java.awt.Paint paint6 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D0.setShadowPaint(paint6);
        boolean boolean8 = piePlot3D0.getSimpleLabels();
        double double9 = piePlot3D0.getDepthFactor();
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setBackgroundImageAlpha((float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.12d + "'", double9 == 0.12d);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        float float3 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot3D0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint7 = piePlot3D0.getShadowPaint();
        java.awt.Font font8 = piePlot3D0.getLabelFont();
        piePlot3D0.setStartAngle(0.14d);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(font8);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D5.setLabelPadding(rectangleInsets6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        piePlot3D5.handleClick((int) (short) 100, 0, plotRenderingInfo10);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = piePlot3D5.getURLGenerator();
        java.awt.Paint paint13 = piePlot3D5.getLabelOutlinePaint();
        piePlot3D0.setLabelShadowPaint(paint13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = piePlot3D0.getDatasetGroup();
        piePlot3D0.setCircular(true);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator18 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator18);
        org.jfree.data.general.PieDataset pieDataset20 = null;
        piePlot3D0.setDataset(pieDataset20);
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean23 = piePlot3D22.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator24 = null;
        piePlot3D22.setToolTipGenerator(pieToolTipGenerator24);
        java.awt.Paint paint26 = piePlot3D22.getShadowPaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = piePlot3D22.getDrawingSupplier();
        piePlot3D0.setDrawingSupplier(drawingSupplier27);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(pieURLGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(drawingSupplier27);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        piePlot3D0.setPieIndex((int) ' ');
        float float10 = piePlot3D0.getBackgroundAlpha();
        double double11 = piePlot3D0.getShadowXOffset();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.0d + "'", double11 == 4.0d);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D6.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = piePlot3D6.getLabelPadding();
        java.awt.Font font10 = piePlot3D6.getNoDataMessageFont();
        piePlot3D0.setLabelFont(font10);
        piePlot3D0.setExplodePercent((java.lang.Comparable) 0.14d, (double) 1.0f);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.drawOutline(graphics2D15, rectangle2D16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(font10);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor6 = piePlot3D0.getLabelDistributor();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        java.awt.geom.Point2D point2D9 = null;
        org.jfree.chart.plot.PlotState plotState10 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.draw(graphics2D7, rectangle2D8, point2D9, plotState10, plotRenderingInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor6);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        java.awt.Font font4 = piePlot3D0.getNoDataMessageFont();
        java.awt.Paint paint5 = piePlot3D0.getOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D6.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = piePlot3D6.getLabelPadding();
        piePlot3D6.setShadowXOffset(10.0d);
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D12.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot3D12.getLabelPadding();
        java.awt.Font font16 = piePlot3D12.getNoDataMessageFont();
        piePlot3D6.setLabelFont(font16);
        piePlot3D0.setNoDataMessageFont(font16);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(font16);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean1 = piePlot3D0.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator2);
        boolean boolean4 = piePlot3D0.isOutlineVisible();
        piePlot3D0.setShadowXOffset((double) (-1));
        piePlot3D0.setLabelLinkMargin((double) 0.5f);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = piePlot3D0.getLabelPadding();
        piePlot3D0.setMinimumArcAngleToDraw((double) 15);
        piePlot3D0.setForegroundAlpha((float) 'a');
        org.junit.Assert.assertNotNull(rectangleInsets8);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle(4.0d);
        piePlot3D0.setInteriorGap(1.0E-5d);
        java.awt.Font font14 = piePlot3D0.getNoDataMessageFont();
        java.awt.Stroke stroke16 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) true);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNull(stroke16);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        java.awt.Paint paint7 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D0.setSectionPaint((java.lang.Comparable) 0.4d, paint7);
        boolean boolean9 = piePlot3D0.getDarkerSides();
        boolean boolean10 = piePlot3D0.getSectionOutlinesVisible();
        piePlot3D0.setStartAngle((double) 0L);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        piePlot3D0.setOutlineVisible(true);
        double double10 = piePlot3D0.getStartAngle();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator11 = null;
        piePlot3D0.setLegendLabelURLGenerator(pieURLGenerator11);
        org.jfree.data.general.DatasetGroup datasetGroup13 = piePlot3D0.getDatasetGroup();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 90.0d + "'", double10 == 90.0d);
        org.junit.Assert.assertNull(datasetGroup13);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot3D0.getURLGenerator();
        java.awt.Stroke stroke9 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) 0.4d, stroke9);
        org.jfree.chart.LegendItemCollection legendItemCollection11 = piePlot3D0.getLegendItems();
        java.awt.Paint paint13 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) 15);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertNull(paint13);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        piePlot3D0.setOutlineVisible(false);
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D7.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = piePlot3D7.getLabelPadding();
        piePlot3D7.setShadowXOffset(10.0d);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent13 = null;
        piePlot3D7.datasetChanged(datasetChangeEvent13);
        int int15 = piePlot3D7.getBackgroundImageAlignment();
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D16.setLabelPadding(rectangleInsets17);
        java.awt.Paint paint19 = piePlot3D16.getLabelLinkPaint();
        boolean boolean20 = piePlot3D16.getLabelLinksVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D21.setLabelPadding(rectangleInsets22);
        piePlot3D16.setSimpleLabelOffset(rectangleInsets22);
        piePlot3D7.setSimpleLabelOffset(rectangleInsets22);
        piePlot3D0.setLabelPadding(rectangleInsets22);
        org.jfree.data.general.PieDataset pieDataset27 = piePlot3D0.getDataset();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNull(pieDataset27);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        float float3 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot3D0.drawBackgroundImage(graphics2D4, rectangle2D5);
        float float7 = piePlot3D0.getBackgroundImageAlpha();
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D8.setLabelPadding(rectangleInsets9);
        java.awt.Paint paint11 = piePlot3D8.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        piePlot3D8.addChangeListener(plotChangeListener12);
        java.awt.Paint paint14 = piePlot3D8.getShadowPaint();
        piePlot3D0.setBaseSectionOutlinePaint(paint14);
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D16.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = piePlot3D16.getLabelPadding();
        piePlot3D16.setShadowXOffset(10.0d);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor22 = piePlot3D16.getLabelDistributor();
        piePlot3D0.setLabelDistributor(abstractPieLabelDistributor22);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor22);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot3D0.addChangeListener(plotChangeListener4);
        piePlot3D0.setBackgroundImageAlignment((int) (short) 10);
        java.awt.Paint paint9 = piePlot3D0.getSectionPaint((java.lang.Comparable) (short) -1);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(paint9);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        float float1 = piePlot3D0.getBackgroundImageAlpha();
        piePlot3D0.setMinimumArcAngleToDraw((double) (short) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        piePlot3D0.setSectionOutlinesVisible(true);
        double double10 = piePlot3D0.getShadowYOffset();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot3D0.addChangeListener(plotChangeListener4);
        piePlot3D0.setBackgroundImageAlignment((int) (short) 10);
        piePlot3D0.setCircular(false, true);
        piePlot3D0.setOutlineVisible(true);
        piePlot3D0.setStartAngle((double) 'a');
        java.awt.Stroke stroke15 = piePlot3D0.getLabelLinkStroke();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        piePlot3D0.setBackgroundAlpha((float) 0L);
        piePlot3D0.setNoDataMessage("");
        java.lang.Object obj8 = piePlot3D0.clone();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        org.jfree.chart.plot.Plot plot6 = piePlot3D0.getParent();
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D8.setLabelPadding(rectangleInsets9);
        java.awt.Paint paint11 = piePlot3D8.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator12 = null;
        piePlot3D8.setLegendLabelToolTipGenerator(pieSectionLabelGenerator12);
        piePlot3D8.setLabelLinkMargin(0.0d);
        piePlot3D8.setPieIndex((int) ' ');
        java.awt.Paint paint18 = piePlot3D8.getBaseSectionOutlinePaint();
        piePlot3D0.setSectionOutlinePaint((java.lang.Comparable) 'a', paint18);
        java.awt.Paint paint20 = piePlot3D0.getLabelShadowPaint();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        float float3 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot3D0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Stroke stroke8 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) 0.5f);
        java.awt.Paint paint9 = piePlot3D0.getBaseSectionPaint();
        boolean boolean10 = piePlot3D0.getSectionOutlinesVisible();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.data.general.PieDataset pieDataset3 = piePlot3D0.getDataset();
        java.awt.Paint paint5 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) (short) 100);
        piePlot3D0.setLabelLinksVisible(true);
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D8.setSectionOutlinesVisible(true);
        piePlot3D8.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        piePlot3D8.drawBackgroundImage(graphics2D13, rectangle2D14);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent16 = null;
        piePlot3D8.axisChanged(axisChangeEvent16);
        org.jfree.data.general.PieDataset pieDataset18 = piePlot3D8.getDataset();
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D20.setLabelPadding(rectangleInsets21);
        java.awt.Paint paint23 = piePlot3D20.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator24 = null;
        piePlot3D20.setLegendLabelToolTipGenerator(pieSectionLabelGenerator24);
        piePlot3D20.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot28 = piePlot3D20.getRootPlot();
        java.awt.Stroke stroke29 = piePlot3D20.getOutlineStroke();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator30 = piePlot3D20.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.Plot plot31 = piePlot3D20.getParent();
        java.awt.Paint paint32 = piePlot3D20.getLabelOutlinePaint();
        piePlot3D8.setSectionPaint((java.lang.Comparable) 4.0d, paint32);
        piePlot3D0.setBaseSectionPaint(paint32);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieDataset3);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNull(pieDataset18);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(plot28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNull(pieSectionLabelGenerator30);
        org.junit.Assert.assertNull(plot31);
        org.junit.Assert.assertNotNull(paint32);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        double double6 = piePlot3D0.getMaximumLabelWidth();
        java.awt.Paint paint7 = piePlot3D0.getLabelOutlinePaint();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.14d + "'", double6 == 0.14d);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        float float3 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot3D0.drawBackgroundImage(graphics2D4, rectangle2D5);
        float float7 = piePlot3D0.getBackgroundImageAlpha();
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D8.setLabelPadding(rectangleInsets9);
        java.awt.Paint paint11 = piePlot3D8.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        piePlot3D8.addChangeListener(plotChangeListener12);
        java.awt.Paint paint14 = piePlot3D8.getShadowPaint();
        piePlot3D0.setBaseSectionOutlinePaint(paint14);
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        piePlot3D0.removeChangeListener(plotChangeListener16);
        piePlot3D0.setForegroundAlpha((float) 1);
        boolean boolean20 = piePlot3D0.getIgnoreZeroValues();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        float float7 = piePlot3D0.getForegroundAlpha();
        java.awt.Paint paint8 = piePlot3D0.getBaseSectionOutlinePaint();
        double double10 = piePlot3D0.getExplodePercent((java.lang.Comparable) 0.5f);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.awt.Stroke stroke9 = piePlot3D0.getOutlineStroke();
        double double10 = piePlot3D0.getMaximumLabelWidth();
        int int11 = piePlot3D0.getPieIndex();
        double double12 = piePlot3D0.getStartAngle();
        java.lang.Class<?> wildcardClass13 = piePlot3D0.getClass();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 90.0d + "'", double12 == 90.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot3D0.addChangeListener(plotChangeListener4);
        java.awt.Paint paint6 = null;
        piePlot3D0.setBackgroundPaint(paint6);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = piePlot3D0.getLabelPadding();
        piePlot3D0.setMinimumArcAngleToDraw((double) 15);
        piePlot3D0.setOutlineVisible(false);
        piePlot3D0.setPieIndex((int) (byte) 1);
        java.awt.Image image15 = piePlot3D0.getBackgroundImage();
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNull(image15);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        piePlot3D0.setNoDataMessage("");
        org.junit.Assert.assertNotNull(rectangleInsets3);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean1 = piePlot3D0.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator2);
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = piePlot3D0.getDrawingSupplier();
        double double6 = piePlot3D0.getShadowYOffset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D5.setLabelPadding(rectangleInsets6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        piePlot3D5.handleClick((int) (short) 100, 0, plotRenderingInfo10);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = piePlot3D5.getURLGenerator();
        java.awt.Paint paint13 = piePlot3D5.getLabelOutlinePaint();
        piePlot3D0.setLabelShadowPaint(paint13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = piePlot3D0.getDatasetGroup();
        piePlot3D0.setCircular(true);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator18 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator18);
        org.jfree.data.general.PieDataset pieDataset20 = piePlot3D0.getDataset();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = piePlot3D0.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(pieURLGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNull(pieDataset20);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PiePlot3D piePlot3D3 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D3.setLabelPadding(rectangleInsets4);
        java.awt.Paint paint6 = piePlot3D3.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator7 = null;
        piePlot3D3.setLegendLabelToolTipGenerator(pieSectionLabelGenerator7);
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean11 = piePlot3D10.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator12 = null;
        piePlot3D10.setToolTipGenerator(pieToolTipGenerator12);
        java.awt.Paint paint14 = piePlot3D10.getShadowPaint();
        piePlot3D3.setSectionPaint((java.lang.Comparable) 100.0f, paint14);
        piePlot3D0.setBaseSectionOutlinePaint(paint14);
        java.awt.Paint paint17 = piePlot3D0.getOutlinePaint();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        piePlot3D0.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint6 = piePlot3D0.getLabelOutlinePaint();
        double double7 = piePlot3D0.getMinimumArcAngleToDraw();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-5d + "'", double7 == 1.0E-5d);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D0.setNoDataMessagePaint(paint8);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator10 = piePlot3D0.getLegendLabelURLGenerator();
        boolean boolean11 = piePlot3D0.isSubplot();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(pieURLGenerator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        double double7 = piePlot3D0.getDepthFactor();
        piePlot3D0.setMinimumArcAngleToDraw((double) '#');
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12d + "'", double7 == 0.12d);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        piePlot3D0.zoom((double) '#');
        java.awt.Font font10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D0.setLabelFont(font10);
        piePlot3D0.setExplodePercent((java.lang.Comparable) '4', (double) 10L);
        java.awt.Paint paint16 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) (short) 10);
        java.awt.Paint paint17 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setLabelPaint(paint17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNull(paint16);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        java.awt.Paint paint10 = piePlot3D0.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        piePlot3D0.handleClick((int) 'a', 10, plotRenderingInfo13);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        java.awt.geom.Point2D point2D17 = null;
        org.jfree.chart.plot.PlotState plotState18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.draw(graphics2D15, rectangle2D16, point2D17, plotState18, plotRenderingInfo19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getDepthFactor();
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D6.setLabelPadding(rectangleInsets7);
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean11 = piePlot3D10.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator12 = null;
        piePlot3D10.setToolTipGenerator(pieToolTipGenerator12);
        java.awt.Paint paint14 = piePlot3D10.getShadowPaint();
        piePlot3D6.setSectionPaint((java.lang.Comparable) (short) -1, paint14);
        piePlot3D0.setLabelPaint(paint14);
        java.awt.Paint paint17 = piePlot3D0.getOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D18.setLabelPadding(rectangleInsets19);
        java.awt.Paint paint21 = piePlot3D18.getLabelLinkPaint();
        boolean boolean22 = piePlot3D18.getLabelLinksVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D23 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D23.setLabelPadding(rectangleInsets24);
        piePlot3D18.setSimpleLabelOffset(rectangleInsets24);
        java.awt.Font font27 = piePlot3D18.getLabelFont();
        piePlot3D0.setNoDataMessageFont(font27);
        java.awt.Paint paint29 = piePlot3D0.getOutlinePaint();
        double double30 = piePlot3D0.getInteriorGap();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.12d + "'", double5 == 0.12d);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.08d + "'", double30 == 0.08d);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot3D0.getDatasetGroup();
        piePlot3D0.setBackgroundImageAlignment(1);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot3D0.getSimpleLabelOffset();
        piePlot3D0.setSectionOutlinesVisible(true);
        java.lang.Class<?> wildcardClass14 = piePlot3D0.getClass();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D0.setNoDataMessagePaint(paint8);
        java.awt.Paint paint10 = piePlot3D0.getLabelOutlinePaint();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot3D0.drawBackgroundImage(graphics2D11, rectangle2D12);
        java.awt.Paint paint15 = piePlot3D0.getSectionPaint((java.lang.Comparable) 0.0d);
        piePlot3D0.setBackgroundAlpha((float) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setBackgroundImageAlpha((float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(paint15);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D0.setNoDataMessagePaint(paint8);
        java.awt.Paint paint10 = piePlot3D0.getLabelOutlinePaint();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot3D0.drawBackgroundImage(graphics2D11, rectangle2D12);
        java.awt.Paint paint15 = piePlot3D0.getSectionPaint((java.lang.Comparable) 0.0d);
        java.awt.Paint paint17 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) (short) 1);
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D18.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot3D18.getLabelPadding();
        piePlot3D18.setShadowXOffset(10.0d);
        piePlot3D18.setCircular(false);
        piePlot3D18.setLabelGap((double) (short) 1);
        java.awt.Paint paint28 = piePlot3D18.getBaseSectionOutlinePaint();
        piePlot3D0.setLabelPaint(paint28);
        piePlot3D0.setSimpleLabels(false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D5.setLabelPadding(rectangleInsets6);
        java.awt.Paint paint8 = piePlot3D5.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator9 = null;
        piePlot3D5.setLegendLabelToolTipGenerator(pieSectionLabelGenerator9);
        piePlot3D5.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot13 = piePlot3D5.getRootPlot();
        java.awt.Stroke stroke14 = piePlot3D5.getOutlineStroke();
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) (-1.0d), stroke14);
        piePlot3D0.setSimpleLabels(true);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D20.setLabelPadding(rectangleInsets21);
        java.awt.Paint paint23 = piePlot3D20.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator24 = null;
        piePlot3D20.setLegendLabelToolTipGenerator(pieSectionLabelGenerator24);
        piePlot3D20.setLabelLinkMargin(0.0d);
        piePlot3D20.setShadowXOffset(1.0d);
        java.awt.Paint paint30 = piePlot3D20.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D31 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D31.setSectionOutlinesVisible(true);
        piePlot3D31.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D36 = null;
        java.awt.geom.Rectangle2D rectangle2D37 = null;
        piePlot3D31.drawBackgroundImage(graphics2D36, rectangle2D37);
        java.awt.Paint paint39 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D31.setNoDataMessagePaint(paint39);
        piePlot3D20.setShadowPaint(paint39);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState44 = piePlot3D0.initialise(graphics2D18, rectangle2D19, (org.jfree.chart.plot.PiePlot) piePlot3D20, (java.lang.Integer) 0, plotRenderingInfo43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(paint39);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.lang.Object obj5 = piePlot3D0.clone();
        java.awt.Paint paint6 = piePlot3D0.getBackgroundPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D7.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = piePlot3D7.getLabelPadding();
        java.awt.Font font11 = piePlot3D7.getNoDataMessageFont();
        piePlot3D0.setNoDataMessageFont(font11);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(font11);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        double double7 = piePlot3D0.getDepthFactor();
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D8.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot3D8.getLabelPadding();
        java.awt.Font font12 = piePlot3D8.getNoDataMessageFont();
        java.awt.Paint paint13 = piePlot3D8.getOutlinePaint();
        java.awt.Font font14 = piePlot3D8.getNoDataMessageFont();
        piePlot3D0.setLabelFont(font14);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = piePlot3D0.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12d + "'", double7 == 0.12d);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(font14);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        boolean boolean5 = piePlot3D0.isCircular();
        double double6 = piePlot3D0.getShadowYOffset();
        piePlot3D0.zoom(4.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setDarkerSides(false);
        boolean boolean3 = piePlot3D0.isOutlineVisible();
        java.lang.Class<?> wildcardClass4 = piePlot3D0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean1 = piePlot3D0.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator2);
        org.jfree.chart.plot.PiePlot3D piePlot3D4 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D4.setSectionOutlinesVisible(true);
        piePlot3D4.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        piePlot3D4.drawBackgroundImage(graphics2D9, rectangle2D10);
        java.awt.Paint paint12 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D4.setNoDataMessagePaint(paint12);
        java.awt.Stroke stroke14 = piePlot3D4.getLabelOutlineStroke();
        piePlot3D0.setLabelOutlineStroke(stroke14);
        boolean boolean16 = piePlot3D0.getIgnoreNullValues();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        piePlot3D0.handleClick(0, 0, plotRenderingInfo19);
        double double21 = piePlot3D0.getDepthFactor();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.12d + "'", double21 == 0.12d);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        float float3 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot3D0.drawBackgroundImage(graphics2D4, rectangle2D5);
        float float7 = piePlot3D0.getBackgroundImageAlpha();
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D8.setLabelPadding(rectangleInsets9);
        java.awt.Paint paint11 = piePlot3D8.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        piePlot3D8.addChangeListener(plotChangeListener12);
        java.awt.Paint paint14 = piePlot3D8.getShadowPaint();
        piePlot3D0.setBaseSectionOutlinePaint(paint14);
        java.lang.Comparable comparable16 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D17.setLabelPadding(rectangleInsets18);
        java.awt.Paint paint20 = piePlot3D17.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator21 = null;
        piePlot3D17.setLegendLabelToolTipGenerator(pieSectionLabelGenerator21);
        piePlot3D17.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot25 = piePlot3D17.getRootPlot();
        java.awt.Paint paint26 = piePlot3D17.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D28 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D28.setLabelPadding(rectangleInsets29);
        java.awt.Paint paint31 = piePlot3D28.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener32 = null;
        piePlot3D28.addChangeListener(plotChangeListener32);
        java.awt.Paint paint34 = piePlot3D28.getShadowPaint();
        piePlot3D17.setSectionOutlinePaint((java.lang.Comparable) (-1.0d), paint34);
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setSectionPaint(comparable16, paint34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(plot25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(rectangleInsets29);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        double double4 = piePlot3D0.getStartAngle();
        org.jfree.data.general.DatasetGroup datasetGroup5 = piePlot3D0.getDatasetGroup();
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D6.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = piePlot3D6.getLabelPadding();
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D6.setNoDataMessagePaint(paint10);
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D12.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot3D12.getLabelPadding();
        piePlot3D12.setShadowXOffset(10.0d);
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D18.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot3D18.getLabelPadding();
        java.awt.Font font22 = piePlot3D18.getNoDataMessageFont();
        piePlot3D12.setLabelFont(font22);
        java.awt.Paint paint24 = piePlot3D12.getLabelBackgroundPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = piePlot3D12.getInsets();
        piePlot3D6.setSimpleLabelOffset(rectangleInsets25);
        piePlot3D0.setInsets(rectangleInsets25, false);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 90.0d + "'", double4 == 90.0d);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(rectangleInsets25);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        float float3 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot3D0.drawBackgroundImage(graphics2D4, rectangle2D5);
        float float7 = piePlot3D0.getBackgroundImageAlpha();
        org.jfree.chart.util.Rotation rotation8 = piePlot3D0.getDirection();
        double double10 = piePlot3D0.getExplodePercent((java.lang.Comparable) 100.0f);
        piePlot3D0.setIgnoreNullValues(true);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = piePlot3D0.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(rotation8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.awt.Stroke stroke9 = piePlot3D0.getOutlineStroke();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent10 = null;
        piePlot3D0.axisChanged(axisChangeEvent10);
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D12.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot3D12.getLabelPadding();
        piePlot3D12.setShadowXOffset(10.0d);
        piePlot3D12.setCircular(false);
        piePlot3D12.setLabelGap((double) (short) 1);
        java.awt.Paint paint22 = piePlot3D12.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke23 = piePlot3D12.getLabelLinkStroke();
        java.awt.Paint paint24 = piePlot3D12.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D25.setLabelPadding(rectangleInsets26);
        java.awt.Paint paint28 = piePlot3D25.getLabelLinkPaint();
        boolean boolean29 = piePlot3D25.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = piePlot3D25.getInsets();
        java.awt.Paint paint31 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D25.setShadowPaint(paint31);
        piePlot3D12.setLabelPaint(paint31);
        piePlot3D0.setShadowPaint(paint31);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.data.general.PieDataset pieDataset3 = piePlot3D0.getDataset();
        java.awt.Paint paint5 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) (short) 100);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = piePlot3D0.getToolTipGenerator();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieDataset3);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNull(pieToolTipGenerator6);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D5.setLabelPadding(rectangleInsets6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        piePlot3D5.handleClick((int) (short) 100, 0, plotRenderingInfo10);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = piePlot3D5.getURLGenerator();
        java.awt.Paint paint13 = piePlot3D5.getLabelOutlinePaint();
        piePlot3D0.setLabelShadowPaint(paint13);
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        piePlot3D0.addChangeListener(plotChangeListener15);
        piePlot3D0.setCircular(false);
        java.lang.Comparable comparable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint20 = piePlot3D0.getSectionOutlinePaint(comparable19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(pieURLGenerator12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke4 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) false);
        float float5 = piePlot3D0.getForegroundAlpha();
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D6.setSectionOutlinesVisible(true);
        piePlot3D6.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot3D6.drawBackgroundImage(graphics2D11, rectangle2D12);
        piePlot3D6.zoom((double) '#');
        java.awt.Font font16 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D6.setLabelFont(font16);
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D18.setLabelPadding(rectangleInsets19);
        java.awt.Paint paint21 = piePlot3D18.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator22 = null;
        piePlot3D18.setLegendLabelToolTipGenerator(pieSectionLabelGenerator22);
        piePlot3D18.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot26 = piePlot3D18.getRootPlot();
        java.awt.Stroke stroke27 = piePlot3D18.getOutlineStroke();
        piePlot3D6.setLabelOutlineStroke(stroke27);
        piePlot3D0.setOutlineStroke(stroke27);
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(plot26);
        org.junit.Assert.assertNotNull(stroke27);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.awt.Stroke stroke9 = piePlot3D0.getOutlineStroke();
        double double10 = piePlot3D0.getMaximumLabelWidth();
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D11.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot3D11.getLabelPadding();
        piePlot3D11.setShadowXOffset(10.0d);
        piePlot3D11.setCircular(false);
        piePlot3D11.setLabelGap((double) (short) 1);
        java.awt.Paint paint21 = piePlot3D11.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D22.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = piePlot3D22.getLabelPadding();
        java.awt.Font font26 = piePlot3D22.getNoDataMessageFont();
        java.awt.Paint paint27 = piePlot3D22.getOutlinePaint();
        piePlot3D11.setLabelOutlinePaint(paint27);
        org.jfree.chart.plot.PiePlot3D piePlot3D29 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D29.setSectionOutlinesVisible(true);
        piePlot3D29.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        piePlot3D29.drawBackgroundImage(graphics2D34, rectangle2D35);
        java.awt.Paint paint37 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D29.setNoDataMessagePaint(paint37);
        double double39 = piePlot3D29.getShadowYOffset();
        java.awt.Stroke stroke40 = piePlot3D29.getBaseSectionOutlineStroke();
        piePlot3D11.setBaseSectionOutlineStroke(stroke40);
        java.awt.Paint paint42 = piePlot3D11.getLabelOutlinePaint();
        piePlot3D0.setLabelShadowPaint(paint42);
        boolean boolean45 = piePlot3D0.equals((java.lang.Object) '4');
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 4.0d + "'", double39 == 4.0d);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot3D0.getDatasetGroup();
        org.jfree.chart.plot.Plot plot9 = piePlot3D0.getParent();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator10 = piePlot3D0.getToolTipGenerator();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNull(plot9);
        org.junit.Assert.assertNull(pieToolTipGenerator10);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        java.awt.Paint paint10 = piePlot3D0.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke11 = piePlot3D0.getLabelLinkStroke();
        java.awt.Paint paint12 = piePlot3D0.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D13.setLabelPadding(rectangleInsets14);
        java.awt.Paint paint16 = piePlot3D13.getLabelLinkPaint();
        boolean boolean17 = piePlot3D13.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3D13.getInsets();
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D13.setShadowPaint(paint19);
        piePlot3D0.setLabelPaint(paint19);
        float float22 = piePlot3D0.getBackgroundAlpha();
        java.awt.Shape shape23 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot3D0.setLegendItemShape(shape23);
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D25.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = piePlot3D25.getLabelPadding();
        java.awt.Font font29 = piePlot3D25.getNoDataMessageFont();
        java.awt.Stroke stroke31 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D25.setSectionOutlineStroke((java.lang.Comparable) 0, stroke31);
        piePlot3D0.setLabelLinkStroke(stroke31);
        boolean boolean34 = piePlot3D0.isOutlineVisible();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot3D0.getURLGenerator();
        java.awt.Stroke stroke9 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke9);
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D11.setLabelPadding(rectangleInsets12);
        java.awt.Paint paint14 = piePlot3D11.getLabelLinkPaint();
        boolean boolean15 = piePlot3D11.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        piePlot3D11.notifyListeners(plotChangeEvent16);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3D11.getSimpleLabelOffset();
        piePlot3D0.setSimpleLabelOffset(rectangleInsets18);
        java.awt.Font font20 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D0.setNoDataMessageFont(font20);
        org.jfree.data.general.PieDataset pieDataset22 = piePlot3D0.getDataset();
        piePlot3D0.setIgnoreNullValues(true);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNull(pieDataset22);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        java.awt.Paint paint10 = piePlot3D0.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke11 = piePlot3D0.getLabelLinkStroke();
        java.awt.Paint paint12 = piePlot3D0.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D13.setLabelPadding(rectangleInsets14);
        java.awt.Paint paint16 = piePlot3D13.getLabelLinkPaint();
        boolean boolean17 = piePlot3D13.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3D13.getInsets();
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D13.setShadowPaint(paint19);
        piePlot3D0.setLabelPaint(paint19);
        java.awt.Image image22 = piePlot3D0.getBackgroundImage();
        java.awt.Paint paint24 = piePlot3D0.getSectionPaint((java.lang.Comparable) "hi!");
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(image22);
        org.junit.Assert.assertNull(paint24);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot3D0.addChangeListener(plotChangeListener4);
        piePlot3D0.setBackgroundImageAlignment((int) (short) 10);
        java.awt.Stroke stroke9 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) (-1.0f));
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setLabelPadding(rectangleInsets11);
        java.awt.Paint paint13 = piePlot3D10.getLabelLinkPaint();
        boolean boolean14 = piePlot3D10.getLabelLinksVisible();
        double double15 = piePlot3D10.getLabelLinkMargin();
        piePlot3D10.setBackgroundImageAlignment((int) 'a');
        piePlot3D10.setOutlineVisible(true);
        piePlot3D10.setShadowXOffset((double) (byte) 0);
        java.awt.Paint paint22 = piePlot3D10.getBackgroundPaint();
        piePlot3D0.setBaseSectionPaint(paint22);
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D25.setLabelPadding(rectangleInsets26);
        java.awt.Paint paint28 = piePlot3D25.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator29 = null;
        piePlot3D25.setLegendLabelToolTipGenerator(pieSectionLabelGenerator29);
        piePlot3D25.setLabelLinkMargin(0.0d);
        piePlot3D25.setShadowXOffset(1.0d);
        java.awt.Paint paint35 = piePlot3D25.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D36 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D36.setSectionOutlinesVisible(true);
        piePlot3D36.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D41 = null;
        java.awt.geom.Rectangle2D rectangle2D42 = null;
        piePlot3D36.drawBackgroundImage(graphics2D41, rectangle2D42);
        java.awt.Paint paint44 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D36.setNoDataMessagePaint(paint44);
        piePlot3D25.setShadowPaint(paint44);
        piePlot3D0.setSectionOutlinePaint((java.lang.Comparable) true, paint44);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.025d + "'", double15 == 0.025d);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint44);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot3D0.getDatasetGroup();
        java.awt.Image image9 = null;
        piePlot3D0.setBackgroundImage(image9);
        java.awt.Image image11 = null;
        piePlot3D0.setBackgroundImage(image11);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        piePlot3D0.drawBackgroundImage(graphics2D13, rectangle2D14);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup8);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        boolean boolean8 = piePlot3D0.isCircular();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = piePlot3D0.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D0.setNoDataMessagePaint(paint8);
        java.awt.Paint paint10 = piePlot3D0.getLabelOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset11 = piePlot3D0.getDataset();
        piePlot3D0.setShadowYOffset(0.0d);
        double double14 = piePlot3D0.getLabelGap();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(pieDataset11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.025d + "'", double14 == 0.025d);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        piePlot3D0.setOutlineVisible(false);
        java.awt.Paint paint7 = piePlot3D0.getLabelPaint();
        java.awt.Image image8 = null;
        piePlot3D0.setBackgroundImage(image8);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        piePlot3D0.axisChanged(axisChangeEvent8);
        org.jfree.data.general.PieDataset pieDataset10 = piePlot3D0.getDataset();
        piePlot3D0.setOutlineVisible(false);
        java.lang.Object obj13 = piePlot3D0.clone();
        org.junit.Assert.assertNull(pieDataset10);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        double double4 = piePlot3D0.getStartAngle();
        double double5 = piePlot3D0.getShadowYOffset();
        piePlot3D0.setLabelGap((double) 15);
        int int8 = piePlot3D0.getPieIndex();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 90.0d + "'", double4 == 90.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        piePlot3D0.removeChangeListener(plotChangeListener8);
        boolean boolean10 = piePlot3D0.isCircular();
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D11.setSectionOutlinesVisible(true);
        piePlot3D11.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        piePlot3D11.drawBackgroundImage(graphics2D16, rectangle2D17);
        piePlot3D11.zoom((double) '#');
        java.awt.Font font21 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D11.setLabelFont(font21);
        org.jfree.chart.plot.PiePlot3D piePlot3D24 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D24.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = piePlot3D24.getLabelPadding();
        piePlot3D24.setShadowXOffset(10.0d);
        piePlot3D24.setCircular(false);
        piePlot3D24.setLabelGap((double) (short) 1);
        java.awt.Paint paint34 = piePlot3D24.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke35 = piePlot3D24.getLabelLinkStroke();
        java.awt.Paint paint36 = piePlot3D24.getBaseSectionPaint();
        piePlot3D11.setSectionOutlinePaint((java.lang.Comparable) false, paint36);
        piePlot3D0.setBaseSectionOutlinePaint(paint36);
        piePlot3D0.setIgnoreZeroValues(false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(paint36);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        double double4 = piePlot3D0.getStartAngle();
        double double5 = piePlot3D0.getShadowYOffset();
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        piePlot3D0.addChangeListener(plotChangeListener6);
        boolean boolean8 = piePlot3D0.getSectionOutlinesVisible();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 90.0d + "'", double4 == 90.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        piePlot3D0.setOutlineVisible(false);
        java.awt.Paint paint7 = piePlot3D0.getOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D8.setLabelPadding(rectangleInsets9);
        java.awt.Paint paint11 = piePlot3D8.getLabelLinkPaint();
        boolean boolean12 = piePlot3D8.getLabelLinksVisible();
        double double13 = piePlot3D8.getLabelLinkMargin();
        piePlot3D8.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup16 = piePlot3D8.getDatasetGroup();
        piePlot3D8.setBackgroundImageAlignment(1);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = piePlot3D8.getSimpleLabelOffset();
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D20.setLabelPadding(rectangleInsets21);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        piePlot3D20.handleClick((int) (short) 100, 0, plotRenderingInfo25);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator27 = piePlot3D20.getURLGenerator();
        java.awt.Stroke stroke29 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D20.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke29);
        java.awt.Shape shape31 = piePlot3D20.getLegendItemShape();
        piePlot3D8.setLegendItemShape(shape31);
        piePlot3D0.setLegendItemShape(shape31);
        piePlot3D0.setShadowXOffset(0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.025d + "'", double13 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup16);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNull(pieURLGenerator27);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(shape31);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        piePlot3D0.setOutlineVisible(false);
        java.awt.Paint paint7 = piePlot3D0.getLabelPaint();
        boolean boolean8 = piePlot3D0.getLabelLinksVisible();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setDarkerSides(false);
        int int3 = piePlot3D0.getPieIndex();
        java.awt.Paint paint4 = piePlot3D0.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle(4.0d);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.drawOutline(graphics2D12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D5.setLabelPadding(rectangleInsets6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        piePlot3D5.handleClick((int) (short) 100, 0, plotRenderingInfo10);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = piePlot3D5.getURLGenerator();
        java.awt.Paint paint13 = piePlot3D5.getLabelOutlinePaint();
        piePlot3D0.setLabelShadowPaint(paint13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = piePlot3D0.getDatasetGroup();
        java.awt.Paint paint17 = piePlot3D0.getSectionPaint((java.lang.Comparable) (short) 10);
        double double18 = piePlot3D0.getShadowYOffset();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(pieURLGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        piePlot3D0.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint6 = piePlot3D0.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D7.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = piePlot3D7.getLabelPadding();
        java.awt.Font font11 = piePlot3D7.getNoDataMessageFont();
        java.awt.Paint paint12 = piePlot3D7.getOutlinePaint();
        java.awt.Font font13 = piePlot3D7.getNoDataMessageFont();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator14 = null;
        piePlot3D7.setURLGenerator(pieURLGenerator14);
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D17.setLabelPadding(rectangleInsets18);
        java.awt.Paint paint20 = piePlot3D17.getLabelLinkPaint();
        java.awt.Paint paint21 = piePlot3D17.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D22.setLabelPadding(rectangleInsets23);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        piePlot3D22.handleClick((int) (short) 100, 0, plotRenderingInfo27);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator29 = piePlot3D22.getURLGenerator();
        java.awt.Paint paint30 = piePlot3D22.getLabelOutlinePaint();
        piePlot3D17.setLabelShadowPaint(paint30);
        org.jfree.data.general.DatasetGroup datasetGroup32 = piePlot3D17.getDatasetGroup();
        piePlot3D17.setCircular(true);
        java.awt.Stroke stroke35 = piePlot3D17.getLabelOutlineStroke();
        piePlot3D7.setSectionOutlineStroke((java.lang.Comparable) 10.0f, stroke35);
        java.awt.Paint paint37 = piePlot3D7.getLabelBackgroundPaint();
        piePlot3D0.setLabelPaint(paint37);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent39 = null;
        piePlot3D0.axisChanged(axisChangeEvent39);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNull(pieURLGenerator29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNull(datasetGroup32);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(paint37);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        double double7 = piePlot3D0.getDepthFactor();
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D8.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot3D8.getLabelPadding();
        java.awt.Font font12 = piePlot3D8.getNoDataMessageFont();
        java.awt.Paint paint13 = piePlot3D8.getOutlinePaint();
        java.awt.Font font14 = piePlot3D8.getNoDataMessageFont();
        piePlot3D0.setLabelFont(font14);
        piePlot3D0.setMinimumArcAngleToDraw((double) (byte) 0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator18 = piePlot3D0.getURLGenerator();
        piePlot3D0.setIgnoreNullValues(false);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12d + "'", double7 == 0.12d);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNull(pieURLGenerator18);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        piePlot3D0.setOutlineVisible(false);
        java.awt.Paint paint7 = piePlot3D0.getLabelPaint();
        org.jfree.chart.util.Rotation rotation8 = piePlot3D0.getDirection();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D11.setLabelPadding(rectangleInsets12);
        java.awt.Paint paint14 = piePlot3D11.getLabelLinkPaint();
        boolean boolean15 = piePlot3D11.getLabelLinksVisible();
        double double16 = piePlot3D11.getLabelLinkMargin();
        piePlot3D11.setBackgroundImageAlignment((int) 'a');
        double double19 = piePlot3D11.getStartAngle();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState22 = piePlot3D0.initialise(graphics2D9, rectangle2D10, (org.jfree.chart.plot.PiePlot) piePlot3D11, (java.lang.Integer) 1, plotRenderingInfo21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(rotation8);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.025d + "'", double16 == 0.025d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 90.0d + "'", double19 == 90.0d);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot3D0.addChangeListener(plotChangeListener4);
        java.awt.Paint paint7 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) 0.5f);
        piePlot3D0.setShadowYOffset(0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(paint7);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D6.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = piePlot3D6.getLabelPadding();
        java.awt.Font font10 = piePlot3D6.getNoDataMessageFont();
        piePlot3D0.setLabelFont(font10);
        java.awt.Paint paint12 = piePlot3D0.getOutlinePaint();
        double double13 = piePlot3D0.getStartAngle();
        boolean boolean14 = piePlot3D0.isOutlineVisible();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 90.0d + "'", double13 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot3D0.getInsets();
        java.awt.Paint paint6 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D0.setShadowPaint(paint6);
        piePlot3D0.setIgnoreZeroValues(true);
        java.awt.Stroke stroke10 = piePlot3D0.getLabelLinkStroke();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = piePlot3D0.getDrawingSupplier();
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D12.setLabelPadding(rectangleInsets13);
        java.awt.Paint paint15 = piePlot3D12.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator16 = null;
        piePlot3D12.setLegendLabelToolTipGenerator(pieSectionLabelGenerator16);
        piePlot3D12.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot20 = piePlot3D12.getRootPlot();
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D21.setLabelPadding(rectangleInsets22);
        java.awt.Paint paint24 = piePlot3D21.getLabelLinkPaint();
        java.awt.Paint paint25 = piePlot3D21.getShadowPaint();
        piePlot3D12.setBaseSectionOutlinePaint(paint25);
        piePlot3D0.setLabelLinkPaint(paint25);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent28 = null;
        piePlot3D0.datasetChanged(datasetChangeEvent28);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        piePlot3D0.datasetChanged(datasetChangeEvent6);
        int int8 = piePlot3D0.getBackgroundImageAlignment();
        piePlot3D0.setBackgroundImageAlignment(0);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        java.awt.Font font4 = piePlot3D0.getNoDataMessageFont();
        java.awt.Paint paint5 = piePlot3D0.getOutlinePaint();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D8.setLabelPadding(rectangleInsets9);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        piePlot3D8.handleClick((int) (short) 100, 0, plotRenderingInfo13);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator15 = piePlot3D8.getURLGenerator();
        java.awt.Stroke stroke17 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D8.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke17);
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D19.setLabelPadding(rectangleInsets20);
        java.awt.Paint paint22 = piePlot3D19.getLabelLinkPaint();
        boolean boolean23 = piePlot3D19.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        piePlot3D19.notifyListeners(plotChangeEvent24);
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = piePlot3D19.getSimpleLabelOffset();
        piePlot3D8.setSimpleLabelOffset(rectangleInsets26);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent28 = null;
        piePlot3D8.axisChanged(axisChangeEvent28);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = piePlot3D8.getSimpleLabelOffset();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState33 = piePlot3D0.initialise(graphics2D6, rectangle2D7, (org.jfree.chart.plot.PiePlot) piePlot3D8, (java.lang.Integer) 0, plotRenderingInfo32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNull(pieURLGenerator15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNotNull(rectangleInsets30);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D5.setLabelPadding(rectangleInsets6);
        java.awt.Paint paint8 = piePlot3D5.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator9 = null;
        piePlot3D5.setLegendLabelToolTipGenerator(pieSectionLabelGenerator9);
        piePlot3D5.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot13 = piePlot3D5.getRootPlot();
        java.awt.Stroke stroke14 = piePlot3D5.getOutlineStroke();
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) (-1.0d), stroke14);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = null;
        piePlot3D0.setLegendLabelURLGenerator(pieURLGenerator16);
        int int18 = piePlot3D0.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        org.jfree.chart.event.PlotChangeListener plotChangeListener5 = null;
        piePlot3D0.removeChangeListener(plotChangeListener5);
        java.lang.Class<?> wildcardClass7 = piePlot3D0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        java.awt.Paint paint10 = piePlot3D0.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke11 = piePlot3D0.getLabelLinkStroke();
        double double12 = piePlot3D0.getMaximumLabelWidth();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = piePlot3D0.getLabelPadding();
        piePlot3D0.setBackgroundAlpha((float) 10L);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(rectangleInsets13);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        boolean boolean7 = piePlot3D0.getSectionOutlinesVisible();
        java.awt.Paint paint8 = piePlot3D0.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D9.setSectionOutlinesVisible(true);
        piePlot3D9.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        piePlot3D9.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = piePlot3D9.getLabelPadding();
        piePlot3D0.setInsets(rectangleInsets17);
        int int19 = piePlot3D0.getPieIndex();
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D20.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = piePlot3D20.getLabelPadding();
        piePlot3D20.setShadowXOffset(10.0d);
        piePlot3D20.setCircular(false);
        piePlot3D20.setLabelGap((double) (short) 1);
        java.awt.Paint paint30 = piePlot3D20.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke31 = piePlot3D20.getLabelLinkStroke();
        java.awt.Paint paint32 = piePlot3D20.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D33 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D33.setLabelPadding(rectangleInsets34);
        java.awt.Paint paint36 = piePlot3D33.getLabelLinkPaint();
        boolean boolean37 = piePlot3D33.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = piePlot3D33.getInsets();
        java.awt.Paint paint39 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D33.setShadowPaint(paint39);
        piePlot3D20.setLabelPaint(paint39);
        float float42 = piePlot3D20.getBackgroundAlpha();
        java.awt.Shape shape43 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot3D20.setLegendItemShape(shape43);
        piePlot3D0.setLegendItemShape(shape43);
        piePlot3D0.setDarkerSides(true);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(rectangleInsets34);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(rectangleInsets38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 1.0f + "'", float42 == 1.0f);
        org.junit.Assert.assertNotNull(shape43);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        float float3 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot3D0.drawBackgroundImage(graphics2D4, rectangle2D5);
        float float7 = piePlot3D0.getBackgroundImageAlpha();
        org.jfree.chart.util.Rotation rotation8 = piePlot3D0.getDirection();
        double double10 = piePlot3D0.getExplodePercent((java.lang.Comparable) 100.0f);
        java.awt.Paint paint11 = piePlot3D0.getLabelBackgroundPaint();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(rotation8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        piePlot3D0.axisChanged(axisChangeEvent8);
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D11.setLabelPadding(rectangleInsets12);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        piePlot3D11.handleClick((int) (short) 100, 0, plotRenderingInfo16);
        boolean boolean18 = piePlot3D11.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D19.setLabelPadding(rectangleInsets20);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        piePlot3D19.handleClick((int) (short) 100, 0, plotRenderingInfo24);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator26 = piePlot3D19.getURLGenerator();
        java.awt.Stroke stroke28 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D19.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke28);
        piePlot3D11.setLabelOutlineStroke(stroke28);
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) 0.025d, stroke28);
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setBackgroundImageAlpha((float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNull(pieURLGenerator26);
        org.junit.Assert.assertNotNull(stroke28);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = piePlot3D0.getLabelPadding();
        piePlot3D0.setMinimumArcAngleToDraw((double) 15);
        piePlot3D0.setCircular(false);
        org.junit.Assert.assertNotNull(rectangleInsets8);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.awt.Paint paint9 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_OUTLINE_PAINT;
        piePlot3D0.setBaseSectionOutlinePaint(paint9);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator11 = null;
        piePlot3D0.setLegendLabelURLGenerator(pieURLGenerator11);
        org.jfree.data.general.DatasetGroup datasetGroup13 = piePlot3D0.getDatasetGroup();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(datasetGroup13);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        float float7 = piePlot3D0.getForegroundAlpha();
        double double8 = piePlot3D0.getMaximumLabelWidth();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        java.awt.geom.Point2D point2D11 = null;
        org.jfree.chart.plot.PlotState plotState12 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.draw(graphics2D9, rectangle2D10, point2D11, plotState12, plotRenderingInfo13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        piePlot3D0.setOutlineVisible(false);
        java.awt.Paint paint8 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) 1L);
        piePlot3D0.setOutlineVisible(false);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(paint8);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        piePlot3D0.setPieIndex((int) ' ');
        piePlot3D0.setStartAngle((double) ' ');
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D(pieDataset12);
        java.awt.Paint paint14 = piePlot3D13.getBaseSectionPaint();
        piePlot3D0.setLabelBackgroundPaint(paint14);
        boolean boolean16 = piePlot3D0.getSimpleLabels();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        piePlot3D0.setPieIndex((int) ' ');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor10 = piePlot3D0.getLabelDistributor();
        org.jfree.chart.plot.Plot plot11 = piePlot3D0.getRootPlot();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertNotNull(plot11);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        piePlot3D0.axisChanged(axisChangeEvent8);
        org.jfree.data.general.PieDataset pieDataset10 = piePlot3D0.getDataset();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator11 = null;
        piePlot3D0.setURLGenerator(pieURLGenerator11);
        org.junit.Assert.assertNull(pieDataset10);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D9.setLabelPadding(rectangleInsets10);
        java.awt.Paint paint12 = piePlot3D9.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        piePlot3D9.addChangeListener(plotChangeListener13);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = piePlot3D9.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D16.setLabelPadding(rectangleInsets17);
        java.awt.Paint paint19 = piePlot3D16.getLabelLinkPaint();
        boolean boolean20 = piePlot3D16.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        piePlot3D16.notifyListeners(plotChangeEvent21);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = piePlot3D16.getSimpleLabelOffset();
        piePlot3D9.setLabelPadding(rectangleInsets23);
        piePlot3D0.setInsets(rectangleInsets23);
        java.lang.String str26 = piePlot3D0.getNoDataMessage();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(pieSectionLabelGenerator15);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        piePlot3D0.setStartAngle((double) 'a');
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator12 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator12);
        java.lang.Class<?> wildcardClass14 = piePlot3D0.getClass();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        double double4 = piePlot3D0.getStartAngle();
        double double5 = piePlot3D0.getShadowYOffset();
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D6.setLabelPadding(rectangleInsets7);
        float float9 = piePlot3D6.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        piePlot3D6.drawBackgroundImage(graphics2D10, rectangle2D11);
        java.awt.Paint paint13 = piePlot3D6.getShadowPaint();
        java.lang.Object obj14 = piePlot3D6.clone();
        java.lang.String str15 = piePlot3D6.getNoDataMessage();
        boolean boolean16 = piePlot3D0.equals((java.lang.Object) piePlot3D6);
        piePlot3D6.setMaximumLabelWidth((double) (-1));
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 90.0d + "'", double4 == 90.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setLabelLinksVisible(false);
        java.awt.Paint paint8 = piePlot3D0.getLabelPaint();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot3D0.addChangeListener(plotChangeListener4);
        piePlot3D0.setBackgroundImageAlignment((int) (short) 10);
        piePlot3D0.setCircular(false, true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = piePlot3D0.getDrawingSupplier();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D14.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = piePlot3D14.getLabelPadding();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState20 = piePlot3D0.initialise(graphics2D12, rectangle2D13, (org.jfree.chart.plot.PiePlot) piePlot3D14, (java.lang.Integer) 10, plotRenderingInfo19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNotNull(rectangleInsets17);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        piePlot3D0.setOutlineVisible(true);
        piePlot3D0.setShadowXOffset((double) (byte) 0);
        java.awt.Paint paint12 = piePlot3D0.getBackgroundPaint();
        piePlot3D0.setForegroundAlpha((float) (byte) 0);
        java.awt.Stroke stroke16 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) true);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(stroke16);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot3D0.getDatasetGroup();
        piePlot3D0.setBackgroundImageAlignment(1);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot3D0.getSimpleLabelOffset();
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D12.setLabelPadding(rectangleInsets13);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        piePlot3D12.handleClick((int) (short) 100, 0, plotRenderingInfo17);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator19 = piePlot3D12.getURLGenerator();
        java.awt.Stroke stroke21 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D12.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke21);
        java.awt.Shape shape23 = piePlot3D12.getLegendItemShape();
        piePlot3D0.setLegendItemShape(shape23);
        piePlot3D0.setLabelGap((double) 'a');
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = piePlot3D0.getLabelPadding();
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        piePlot3D0.drawBackgroundImage(graphics2D28, rectangle2D29);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNull(pieURLGenerator19);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(rectangleInsets27);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.awt.Stroke stroke9 = piePlot3D0.getOutlineStroke();
        double double10 = piePlot3D0.getMaximumLabelWidth();
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D11.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot3D11.getLabelPadding();
        piePlot3D11.setShadowXOffset(10.0d);
        piePlot3D11.setCircular(false);
        piePlot3D11.setLabelGap((double) (short) 1);
        java.awt.Paint paint21 = piePlot3D11.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D22.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = piePlot3D22.getLabelPadding();
        java.awt.Font font26 = piePlot3D22.getNoDataMessageFont();
        java.awt.Paint paint27 = piePlot3D22.getOutlinePaint();
        piePlot3D11.setLabelOutlinePaint(paint27);
        org.jfree.chart.plot.PiePlot3D piePlot3D29 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D29.setSectionOutlinesVisible(true);
        piePlot3D29.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        piePlot3D29.drawBackgroundImage(graphics2D34, rectangle2D35);
        java.awt.Paint paint37 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D29.setNoDataMessagePaint(paint37);
        double double39 = piePlot3D29.getShadowYOffset();
        java.awt.Stroke stroke40 = piePlot3D29.getBaseSectionOutlineStroke();
        piePlot3D11.setBaseSectionOutlineStroke(stroke40);
        java.awt.Paint paint42 = piePlot3D11.getLabelOutlinePaint();
        piePlot3D0.setLabelShadowPaint(paint42);
        org.jfree.chart.plot.PiePlot3D piePlot3D44 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D44.setLabelPadding(rectangleInsets45);
        java.awt.Paint paint47 = piePlot3D44.getLabelLinkPaint();
        java.awt.Paint paint48 = piePlot3D44.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D49 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets50 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D49.setLabelPadding(rectangleInsets50);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo54 = null;
        piePlot3D49.handleClick((int) (short) 100, 0, plotRenderingInfo54);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator56 = piePlot3D49.getURLGenerator();
        java.awt.Paint paint57 = piePlot3D49.getLabelOutlinePaint();
        piePlot3D44.setLabelShadowPaint(paint57);
        org.jfree.data.general.DatasetGroup datasetGroup59 = piePlot3D44.getDatasetGroup();
        piePlot3D44.setCircular(true);
        java.awt.Stroke stroke62 = piePlot3D44.getLabelOutlineStroke();
        piePlot3D44.setLabelLinkMargin((-1.0d));
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator65 = piePlot3D44.getLegendLabelGenerator();
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator65);
        java.awt.Image image67 = piePlot3D0.getBackgroundImage();
        org.jfree.chart.plot.Plot plot68 = piePlot3D0.getParent();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 4.0d + "'", double39 == 4.0d);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(rectangleInsets45);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNotNull(rectangleInsets50);
        org.junit.Assert.assertNull(pieURLGenerator56);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertNull(datasetGroup59);
        org.junit.Assert.assertNotNull(stroke62);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator65);
        org.junit.Assert.assertNull(image67);
        org.junit.Assert.assertNull(plot68);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        float float3 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot3D0.drawBackgroundImage(graphics2D4, rectangle2D5);
        float float7 = piePlot3D0.getBackgroundImageAlpha();
        org.jfree.chart.util.Rotation rotation8 = piePlot3D0.getDirection();
        java.awt.Paint paint9 = piePlot3D0.getBackgroundPaint();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator10 = piePlot3D0.getToolTipGenerator();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(rotation8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(pieToolTipGenerator10);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean1 = piePlot3D0.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = piePlot3D0.getToolTipGenerator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(pieToolTipGenerator2);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        double double4 = piePlot3D0.getShadowYOffset();
        boolean boolean5 = piePlot3D0.getIgnoreNullValues();
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D6.setLabelPadding(rectangleInsets7);
        java.awt.Paint paint9 = piePlot3D6.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator10 = null;
        piePlot3D6.setLegendLabelToolTipGenerator(pieSectionLabelGenerator10);
        piePlot3D6.setLabelLinkMargin(0.0d);
        piePlot3D6.setPieIndex((int) ' ');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor16 = piePlot3D6.getLabelDistributor();
        piePlot3D0.setLabelDistributor(abstractPieLabelDistributor16);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor16);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot3D0.getDatasetGroup();
        org.jfree.chart.plot.Plot plot9 = piePlot3D0.getParent();
        org.jfree.chart.plot.Plot plot10 = piePlot3D0.getRootPlot();
        boolean boolean11 = piePlot3D0.isSubplot();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNull(plot9);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getDepthFactor();
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D6.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = piePlot3D6.getLabelPadding();
        java.awt.Font font10 = piePlot3D6.getNoDataMessageFont();
        java.awt.Paint paint11 = piePlot3D6.getOutlinePaint();
        java.awt.Font font12 = piePlot3D6.getNoDataMessageFont();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = null;
        piePlot3D6.setURLGenerator(pieURLGenerator13);
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D16.setLabelPadding(rectangleInsets17);
        java.awt.Paint paint19 = piePlot3D16.getLabelLinkPaint();
        java.awt.Paint paint20 = piePlot3D16.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D21.setLabelPadding(rectangleInsets22);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        piePlot3D21.handleClick((int) (short) 100, 0, plotRenderingInfo26);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator28 = piePlot3D21.getURLGenerator();
        java.awt.Paint paint29 = piePlot3D21.getLabelOutlinePaint();
        piePlot3D16.setLabelShadowPaint(paint29);
        org.jfree.data.general.DatasetGroup datasetGroup31 = piePlot3D16.getDatasetGroup();
        piePlot3D16.setCircular(true);
        java.awt.Stroke stroke34 = piePlot3D16.getLabelOutlineStroke();
        piePlot3D6.setSectionOutlineStroke((java.lang.Comparable) 10.0f, stroke34);
        java.awt.Paint paint36 = piePlot3D6.getLabelBackgroundPaint();
        piePlot3D0.setBaseSectionOutlinePaint(paint36);
        java.awt.Paint paint38 = piePlot3D0.getLabelOutlinePaint();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.12d + "'", double5 == 0.12d);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNull(pieURLGenerator28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNull(datasetGroup31);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(paint38);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        piePlot3D0.setOutlineVisible(false);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        piePlot3D0.removeChangeListener(plotChangeListener7);
        org.jfree.data.general.DatasetGroup datasetGroup9 = piePlot3D0.getDatasetGroup();
        piePlot3D0.setCircular(true);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(datasetGroup9);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.awt.Stroke stroke9 = piePlot3D0.getOutlineStroke();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator10 = piePlot3D0.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.Plot plot11 = piePlot3D0.getParent();
        java.awt.Paint paint13 = null;
        piePlot3D0.setSectionOutlinePaint((java.lang.Comparable) 1, paint13);
        boolean boolean15 = piePlot3D0.getIgnoreZeroValues();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(pieSectionLabelGenerator10);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.data.general.PieDataset pieDataset3 = piePlot3D0.getDataset();
        boolean boolean4 = piePlot3D0.isCircular();
        boolean boolean5 = piePlot3D0.getSectionOutlinesVisible();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieDataset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        piePlot3D0.setBackgroundAlpha((float) 0L);
        piePlot3D0.setNoDataMessage("");
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setBackgroundImageAlpha((float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setDarkerSides(false);
        boolean boolean3 = piePlot3D0.isOutlineVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot3D0.handleClick((int) ' ', (int) (byte) 1, plotRenderingInfo6);
        java.awt.Paint paint8 = piePlot3D0.getOutlinePaint();
        java.awt.Paint paint9 = piePlot3D0.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D7.setLabelPadding(rectangleInsets8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        piePlot3D7.handleClick((int) (short) 100, 0, plotRenderingInfo12);
        boolean boolean14 = piePlot3D7.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D15 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D15.setLabelPadding(rectangleInsets16);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        piePlot3D15.handleClick((int) (short) 100, 0, plotRenderingInfo20);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = piePlot3D15.getURLGenerator();
        java.awt.Stroke stroke24 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D15.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke24);
        piePlot3D7.setLabelOutlineStroke(stroke24);
        piePlot3D0.setLabelLinkStroke(stroke24);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor28 = piePlot3D0.getLabelDistributor();
        org.jfree.chart.plot.PiePlot3D piePlot3D29 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D29.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke33 = piePlot3D29.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator34 = piePlot3D29.getLegendLabelGenerator();
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator34);
        java.awt.Image image36 = null;
        piePlot3D0.setBackgroundImage(image36);
        float float38 = piePlot3D0.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNull(pieURLGenerator22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor28);
        org.junit.Assert.assertNull(stroke33);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator34);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.5f + "'", float38 == 0.5f);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        float float3 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot3D0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint7 = piePlot3D0.getShadowPaint();
        piePlot3D0.setNoDataMessage("hi!");
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        java.awt.Paint paint10 = piePlot3D0.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke11 = piePlot3D0.getLabelLinkStroke();
        java.awt.Paint paint12 = piePlot3D0.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D13.setLabelPadding(rectangleInsets14);
        java.awt.Paint paint16 = piePlot3D13.getLabelLinkPaint();
        boolean boolean17 = piePlot3D13.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3D13.getInsets();
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D13.setShadowPaint(paint19);
        piePlot3D0.setLabelPaint(paint19);
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D22.setLabelPadding(rectangleInsets23);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        piePlot3D22.handleClick((int) (short) 100, 0, plotRenderingInfo27);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator29 = piePlot3D22.getURLGenerator();
        java.awt.Stroke stroke31 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D22.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke31);
        piePlot3D0.setOutlineStroke(stroke31);
        java.awt.Paint paint34 = null;
        piePlot3D0.setLabelBackgroundPaint(paint34);
        float float36 = piePlot3D0.getForegroundAlpha();
        java.awt.Paint paint38 = piePlot3D0.getSectionPaint((java.lang.Comparable) 1.0d);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNull(pieURLGenerator29);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 1.0f + "'", float36 == 1.0f);
        org.junit.Assert.assertNull(paint38);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean1 = piePlot3D0.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator2);
        org.jfree.chart.plot.PiePlot3D piePlot3D4 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D4.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke8 = piePlot3D4.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator9 = piePlot3D4.getLegendLabelGenerator();
        piePlot3D0.setLabelGenerator(pieSectionLabelGenerator9);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = piePlot3D0.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator9);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot3D0.getURLGenerator();
        java.awt.Paint paint8 = piePlot3D0.getLabelOutlinePaint();
        double double9 = piePlot3D0.getLabelLinkMargin();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator10 = piePlot3D0.getURLGenerator();
        java.awt.Paint paint12 = null;
        piePlot3D0.setSectionPaint((java.lang.Comparable) 10L, paint12);
        org.jfree.chart.util.Rotation rotation14 = piePlot3D0.getDirection();
        org.jfree.chart.plot.PiePlot3D piePlot3D15 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D15.setLabelPadding(rectangleInsets16);
        java.awt.Paint paint18 = piePlot3D15.getLabelLinkPaint();
        boolean boolean19 = piePlot3D15.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = piePlot3D15.getInsets();
        java.awt.Image image21 = null;
        piePlot3D15.setBackgroundImage(image21);
        float float23 = piePlot3D15.getBackgroundAlpha();
        org.jfree.chart.plot.PiePlot3D piePlot3D24 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D24.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = piePlot3D24.getLabelPadding();
        java.awt.Paint paint28 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D24.setNoDataMessagePaint(paint28);
        piePlot3D15.setLabelLinkPaint(paint28);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier31 = piePlot3D15.getDrawingSupplier();
        piePlot3D0.setDrawingSupplier(drawingSupplier31);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.025d + "'", double9 == 0.025d);
        org.junit.Assert.assertNull(pieURLGenerator10);
        org.junit.Assert.assertNotNull(rotation14);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(drawingSupplier31);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D0.setNoDataMessagePaint(paint8);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator10 = piePlot3D0.getLegendLabelURLGenerator();
        piePlot3D0.setBackgroundAlpha((float) 1L);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(pieURLGenerator10);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.awt.Stroke stroke9 = piePlot3D0.getOutlineStroke();
        double double10 = piePlot3D0.getMaximumLabelWidth();
        int int11 = piePlot3D0.getPieIndex();
        double double12 = piePlot3D0.getShadowYOffset();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PiePlot3D piePlot3D4 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean5 = piePlot3D4.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot3D4.setToolTipGenerator(pieToolTipGenerator6);
        java.awt.Paint paint8 = piePlot3D4.getShadowPaint();
        piePlot3D0.setSectionPaint((java.lang.Comparable) (short) -1, paint8);
        org.jfree.data.general.PieDataset pieDataset10 = piePlot3D0.getDataset();
        piePlot3D0.setExplodePercent((java.lang.Comparable) 0.0d, 100.0d);
        java.lang.Object obj14 = piePlot3D0.clone();
        org.jfree.chart.plot.PiePlot3D piePlot3D15 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D15.setLabelPadding(rectangleInsets16);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        piePlot3D15.handleClick((int) (short) 100, 0, plotRenderingInfo20);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = piePlot3D15.getURLGenerator();
        java.awt.Stroke stroke24 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D15.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke24);
        java.awt.Shape shape26 = piePlot3D15.getLegendItemShape();
        piePlot3D15.setOutlineVisible(false);
        java.awt.Stroke stroke29 = piePlot3D15.getBaseSectionOutlineStroke();
        piePlot3D0.setOutlineStroke(stroke29);
        piePlot3D0.setLabelLinksVisible(true);
        org.jfree.chart.plot.PiePlot3D piePlot3D33 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D33.setLabelPadding(rectangleInsets34);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo38 = null;
        piePlot3D33.handleClick((int) (short) 100, 0, plotRenderingInfo38);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator40 = piePlot3D33.getURLGenerator();
        java.awt.Paint paint41 = piePlot3D33.getLabelOutlinePaint();
        double double42 = piePlot3D33.getLabelLinkMargin();
        org.jfree.chart.plot.PiePlot3D piePlot3D43 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D43.setLabelPadding(rectangleInsets44);
        float float46 = piePlot3D43.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D47 = null;
        java.awt.geom.Rectangle2D rectangle2D48 = null;
        piePlot3D43.drawBackgroundImage(graphics2D47, rectangle2D48);
        java.awt.Stroke stroke51 = piePlot3D43.getSectionOutlineStroke((java.lang.Comparable) 0.5f);
        java.awt.Paint paint52 = piePlot3D43.getBaseSectionPaint();
        piePlot3D33.setBackgroundPaint(paint52);
        piePlot3D0.setLabelShadowPaint(paint52);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(pieDataset10);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNull(pieURLGenerator22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(rectangleInsets34);
        org.junit.Assert.assertNull(pieURLGenerator40);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.025d + "'", double42 == 0.025d);
        org.junit.Assert.assertNotNull(rectangleInsets44);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 0.5f + "'", float46 == 0.5f);
        org.junit.Assert.assertNull(stroke51);
        org.junit.Assert.assertNotNull(paint52);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D5.setLabelPadding(rectangleInsets6);
        piePlot3D0.setSimpleLabelOffset(rectangleInsets6);
        java.awt.Font font9 = piePlot3D0.getLabelFont();
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setLabelPadding(rectangleInsets11);
        java.awt.Paint paint13 = piePlot3D10.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener14 = null;
        piePlot3D10.addChangeListener(plotChangeListener14);
        java.awt.Paint paint16 = piePlot3D10.getShadowPaint();
        java.awt.Paint paint17 = piePlot3D10.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D18.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke22 = piePlot3D18.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator23 = piePlot3D18.getLegendLabelGenerator();
        piePlot3D10.setLegendLabelToolTipGenerator(pieSectionLabelGenerator23);
        java.awt.Paint paint25 = piePlot3D10.getLabelBackgroundPaint();
        piePlot3D0.setLabelOutlinePaint(paint25);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(stroke22);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator23);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        float float1 = piePlot3D0.getBackgroundImageAlpha();
        org.jfree.chart.plot.PiePlot3D piePlot3D2 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D2.setLabelPadding(rectangleInsets3);
        java.awt.Paint paint5 = piePlot3D2.getLabelLinkPaint();
        boolean boolean6 = piePlot3D2.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent7 = null;
        piePlot3D2.notifyListeners(plotChangeEvent7);
        double double9 = piePlot3D2.getDepthFactor();
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D10.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = piePlot3D10.getLabelPadding();
        java.awt.Font font14 = piePlot3D10.getNoDataMessageFont();
        java.awt.Paint paint15 = piePlot3D10.getOutlinePaint();
        java.awt.Font font16 = piePlot3D10.getNoDataMessageFont();
        piePlot3D2.setLabelFont(font16);
        java.awt.Paint paint18 = piePlot3D2.getBaseSectionPaint();
        piePlot3D0.setShadowPaint(paint18);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent20 = null;
        piePlot3D0.notifyListeners(plotChangeEvent20);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.12d + "'", double9 == 0.12d);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        piePlot3D0.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint6 = piePlot3D0.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D8.setLabelPadding(rectangleInsets9);
        java.awt.Paint paint11 = piePlot3D8.getLabelLinkPaint();
        boolean boolean12 = piePlot3D8.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent13 = null;
        piePlot3D8.notifyListeners(plotChangeEvent13);
        double double15 = piePlot3D8.getDepthFactor();
        double double16 = piePlot3D8.getInteriorGap();
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D17.setLabelPadding(rectangleInsets18);
        java.awt.Paint paint20 = piePlot3D17.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator21 = null;
        piePlot3D17.setLegendLabelToolTipGenerator(pieSectionLabelGenerator21);
        piePlot3D17.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot25 = piePlot3D17.getRootPlot();
        java.awt.Paint paint26 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_OUTLINE_PAINT;
        piePlot3D17.setBaseSectionOutlinePaint(paint26);
        piePlot3D8.setBaseSectionPaint(paint26);
        org.jfree.chart.LegendItemCollection legendItemCollection29 = piePlot3D8.getLegendItems();
        double double30 = piePlot3D8.getInteriorGap();
        org.jfree.chart.plot.PiePlot3D piePlot3D32 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D32.setDarkerSides(false);
        boolean boolean35 = piePlot3D32.isOutlineVisible();
        boolean boolean36 = piePlot3D32.getIgnoreNullValues();
        java.awt.Font font37 = piePlot3D32.getLabelFont();
        java.awt.Paint paint38 = piePlot3D32.getLabelOutlinePaint();
        piePlot3D8.setSectionOutlinePaint((java.lang.Comparable) 0.14d, paint38);
        piePlot3D0.setSectionOutlinePaint((java.lang.Comparable) 0.08d, paint38);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.12d + "'", double15 == 0.12d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.08d + "'", double16 == 0.08d);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(plot25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(legendItemCollection29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.08d + "'", double30 == 0.08d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(font37);
        org.junit.Assert.assertNotNull(paint38);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle(4.0d);
        java.lang.String str12 = piePlot3D0.getPlotType();
        org.jfree.chart.plot.Plot plot13 = piePlot3D0.getParent();
        java.lang.String str14 = piePlot3D0.getPlotType();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pie 3D Plot" + "'", str12, "Pie 3D Plot");
        org.junit.Assert.assertNull(plot13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Pie 3D Plot" + "'", str14, "Pie 3D Plot");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        boolean boolean5 = piePlot3D0.isCircular();
        double double6 = piePlot3D0.getShadowYOffset();
        piePlot3D0.setBackgroundImageAlignment(15);
        double double9 = piePlot3D0.getLabelGap();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.025d + "'", double9 == 0.025d);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        piePlot3D0.axisChanged(axisChangeEvent8);
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D11.setLabelPadding(rectangleInsets12);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        piePlot3D11.handleClick((int) (short) 100, 0, plotRenderingInfo16);
        boolean boolean18 = piePlot3D11.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D19.setLabelPadding(rectangleInsets20);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        piePlot3D19.handleClick((int) (short) 100, 0, plotRenderingInfo24);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator26 = piePlot3D19.getURLGenerator();
        java.awt.Stroke stroke28 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D19.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke28);
        piePlot3D11.setLabelOutlineStroke(stroke28);
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) 0.025d, stroke28);
        int int32 = piePlot3D0.getPieIndex();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator33 = piePlot3D0.getURLGenerator();
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNull(pieURLGenerator26);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(pieURLGenerator33);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D7.setLabelPadding(rectangleInsets8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        piePlot3D7.handleClick((int) (short) 100, 0, plotRenderingInfo12);
        boolean boolean14 = piePlot3D7.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D15 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D15.setLabelPadding(rectangleInsets16);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        piePlot3D15.handleClick((int) (short) 100, 0, plotRenderingInfo20);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = piePlot3D15.getURLGenerator();
        java.awt.Stroke stroke24 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D15.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke24);
        piePlot3D7.setLabelOutlineStroke(stroke24);
        piePlot3D0.setLabelLinkStroke(stroke24);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor28 = piePlot3D0.getLabelDistributor();
        org.jfree.chart.plot.PiePlot3D piePlot3D29 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D29.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke33 = piePlot3D29.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator34 = piePlot3D29.getLegendLabelGenerator();
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator34);
        java.awt.Image image36 = null;
        piePlot3D0.setBackgroundImage(image36);
        java.awt.Paint paint38 = piePlot3D0.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset39 = null;
        piePlot3D0.setDataset(pieDataset39);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNull(pieURLGenerator22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor28);
        org.junit.Assert.assertNull(stroke33);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator34);
        org.junit.Assert.assertNotNull(paint38);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot3D0.addChangeListener(plotChangeListener4);
        piePlot3D0.setBackgroundImageAlignment((int) (short) 10);
        piePlot3D0.setCircular(false, true);
        piePlot3D0.setOutlineVisible(true);
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D13.setSectionOutlinesVisible(true);
        piePlot3D13.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        piePlot3D13.drawBackgroundImage(graphics2D18, rectangle2D19);
        java.awt.Paint paint21 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D13.setNoDataMessagePaint(paint21);
        java.awt.Paint paint23 = piePlot3D13.getLabelOutlinePaint();
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        piePlot3D13.drawBackgroundImage(graphics2D24, rectangle2D25);
        java.awt.Paint paint28 = piePlot3D13.getSectionPaint((java.lang.Comparable) 0.0d);
        org.jfree.chart.plot.PiePlot3D piePlot3D29 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D29.setLabelPadding(rectangleInsets30);
        java.awt.Paint paint32 = piePlot3D29.getLabelLinkPaint();
        boolean boolean33 = piePlot3D29.getLabelLinksVisible();
        double double34 = piePlot3D29.getLabelLinkMargin();
        piePlot3D29.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup37 = piePlot3D29.getDatasetGroup();
        piePlot3D29.setBackgroundImageAlignment(1);
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = piePlot3D29.getSimpleLabelOffset();
        java.awt.Paint paint41 = piePlot3D29.getLabelLinkPaint();
        piePlot3D13.setBackgroundPaint(paint41);
        piePlot3D0.setBaseSectionPaint(paint41);
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setInteriorGap((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (-1.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(paint28);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.025d + "'", double34 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup37);
        org.junit.Assert.assertNotNull(rectangleInsets40);
        org.junit.Assert.assertNotNull(paint41);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        piePlot3D0.setOutlineVisible(true);
        int int9 = piePlot3D0.getPieIndex();
        double double10 = piePlot3D0.getLabelGap();
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D11.setLabelPadding(rectangleInsets12);
        java.awt.Paint paint14 = piePlot3D11.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = null;
        piePlot3D11.setLegendLabelToolTipGenerator(pieSectionLabelGenerator15);
        piePlot3D11.setLabelLinkMargin(0.0d);
        piePlot3D11.setShadowXOffset(1.0d);
        java.awt.Paint paint21 = piePlot3D11.getLabelOutlinePaint();
        piePlot3D0.setLabelShadowPaint(paint21);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.025d + "'", double10 == 0.025d);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        java.awt.Paint paint10 = piePlot3D0.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke11 = piePlot3D0.getLabelLinkStroke();
        java.awt.Paint paint12 = piePlot3D0.getBaseSectionPaint();
        boolean boolean13 = piePlot3D0.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator14 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator14);
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D16.setLabelPadding(rectangleInsets17);
        java.awt.Paint paint19 = piePlot3D16.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        piePlot3D16.addChangeListener(plotChangeListener20);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator22 = piePlot3D16.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot3D piePlot3D23 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D23.setLabelPadding(rectangleInsets24);
        java.awt.Paint paint26 = piePlot3D23.getLabelLinkPaint();
        boolean boolean27 = piePlot3D23.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent28 = null;
        piePlot3D23.notifyListeners(plotChangeEvent28);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = piePlot3D23.getSimpleLabelOffset();
        piePlot3D16.setLabelPadding(rectangleInsets30);
        piePlot3D0.setLabelPadding(rectangleInsets30);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(pieSectionLabelGenerator22);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(rectangleInsets30);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        java.awt.Stroke stroke6 = piePlot3D0.getLabelOutlineStroke();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        piePlot3D0.addChangeListener(plotChangeListener7);
        piePlot3D0.setSimpleLabels(true);
        piePlot3D0.setDepthFactor((double) 0.0f);
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D13.setLabelPadding(rectangleInsets14);
        java.awt.Paint paint16 = piePlot3D13.getLabelLinkPaint();
        java.awt.Paint paint17 = piePlot3D13.getShadowPaint();
        piePlot3D0.setBaseSectionPaint(paint17);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        boolean boolean5 = piePlot3D0.isCircular();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D0.getLegendLabelGenerator();
        piePlot3D0.setNoDataMessage("hi!");
        piePlot3D0.setSimpleLabels(true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        float float3 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot3D0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint7 = piePlot3D0.getShadowPaint();
        java.awt.Font font8 = piePlot3D0.getLabelFont();
        java.awt.Paint paint10 = piePlot3D0.getSectionPaint((java.lang.Comparable) 100L);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNull(paint10);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        piePlot3D0.removeChangeListener(plotChangeListener8);
        boolean boolean10 = piePlot3D0.isCircular();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D13.setLabelPadding(rectangleInsets14);
        java.awt.Paint paint16 = piePlot3D13.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator17 = null;
        piePlot3D13.setLegendLabelToolTipGenerator(pieSectionLabelGenerator17);
        piePlot3D13.setLabelLinkMargin(0.0d);
        piePlot3D13.setPieIndex((int) ' ');
        boolean boolean23 = piePlot3D13.isSubplot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState26 = piePlot3D0.initialise(graphics2D11, rectangle2D12, (org.jfree.chart.plot.PiePlot) piePlot3D13, (java.lang.Integer) 0, plotRenderingInfo25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean1 = piePlot3D0.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator2);
        boolean boolean4 = piePlot3D0.isOutlineVisible();
        java.lang.String str5 = piePlot3D0.getPlotType();
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D6.setLabelPadding(rectangleInsets7);
        java.awt.Paint paint9 = piePlot3D6.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator10 = null;
        piePlot3D6.setLegendLabelToolTipGenerator(pieSectionLabelGenerator10);
        piePlot3D6.setLabelLinkMargin(0.0d);
        piePlot3D6.setShadowXOffset(1.0d);
        java.awt.Paint paint16 = piePlot3D6.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D17.setSectionOutlinesVisible(true);
        piePlot3D17.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        piePlot3D17.drawBackgroundImage(graphics2D22, rectangle2D23);
        java.awt.Paint paint25 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D17.setNoDataMessagePaint(paint25);
        piePlot3D6.setShadowPaint(paint25);
        org.jfree.chart.plot.PiePlot3D piePlot3D28 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D28.setLabelPadding(rectangleInsets29);
        piePlot3D6.setInsets(rectangleInsets29);
        piePlot3D0.setLabelPadding(rectangleInsets29);
        java.awt.Paint paint33 = piePlot3D0.getBaseSectionPaint();
        java.lang.Object obj34 = piePlot3D0.clone();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie 3D Plot" + "'", str5, "Pie 3D Plot");
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(rectangleInsets29);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D5.setLabelPadding(rectangleInsets6);
        java.awt.Paint paint8 = piePlot3D5.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator9 = null;
        piePlot3D5.setLegendLabelToolTipGenerator(pieSectionLabelGenerator9);
        piePlot3D5.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot13 = piePlot3D5.getRootPlot();
        java.awt.Stroke stroke14 = piePlot3D5.getOutlineStroke();
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) (-1.0d), stroke14);
        boolean boolean16 = piePlot3D0.getSectionOutlinesVisible();
        java.awt.Paint paint17 = piePlot3D0.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PiePlot3D piePlot3D4 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean5 = piePlot3D4.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot3D4.setToolTipGenerator(pieToolTipGenerator6);
        java.awt.Paint paint8 = piePlot3D4.getShadowPaint();
        piePlot3D0.setSectionPaint((java.lang.Comparable) (short) -1, paint8);
        org.jfree.data.general.PieDataset pieDataset10 = piePlot3D0.getDataset();
        piePlot3D0.setExplodePercent((java.lang.Comparable) 0.0d, 100.0d);
        java.lang.Object obj14 = piePlot3D0.clone();
        org.jfree.chart.plot.PiePlot3D piePlot3D15 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D15.setLabelPadding(rectangleInsets16);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        piePlot3D15.handleClick((int) (short) 100, 0, plotRenderingInfo20);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = piePlot3D15.getURLGenerator();
        java.awt.Stroke stroke24 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D15.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke24);
        java.awt.Shape shape26 = piePlot3D15.getLegendItemShape();
        piePlot3D15.setOutlineVisible(false);
        java.awt.Stroke stroke29 = piePlot3D15.getBaseSectionOutlineStroke();
        piePlot3D0.setOutlineStroke(stroke29);
        piePlot3D0.setLabelLinksVisible(true);
        double double33 = piePlot3D0.getLabelLinkMargin();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(pieDataset10);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNull(pieURLGenerator22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.025d + "'", double33 == 0.025d);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot3D0.getInsets();
        org.jfree.chart.plot.Plot plot6 = piePlot3D0.getRootPlot();
        plot6.setBackgroundImageAlignment(15);
        float float9 = plot6.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot3D0.addChangeListener(plotChangeListener4);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D0.getLegendLabelToolTipGenerator();
        java.awt.Font font7 = piePlot3D0.getNoDataMessageFont();
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        piePlot3D0.removeChangeListener(plotChangeListener8);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(font7);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.awt.Stroke stroke9 = piePlot3D0.getOutlineStroke();
        double double10 = piePlot3D0.getMaximumLabelWidth();
        org.jfree.chart.plot.Plot plot11 = piePlot3D0.getParent();
        java.lang.Class<?> wildcardClass12 = piePlot3D0.getClass();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot3D0.getDatasetGroup();
        org.jfree.chart.plot.Plot plot9 = piePlot3D0.getParent();
        double double10 = piePlot3D0.getLabelLinkMargin();
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D11.setSectionOutlinesVisible(true);
        piePlot3D11.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        piePlot3D11.drawBackgroundImage(graphics2D16, rectangle2D17);
        piePlot3D11.zoom((double) '#');
        java.awt.Font font21 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D11.setLabelFont(font21);
        org.jfree.chart.plot.PiePlot3D piePlot3D24 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D24.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = piePlot3D24.getLabelPadding();
        piePlot3D24.setShadowXOffset(10.0d);
        piePlot3D24.setCircular(false);
        piePlot3D24.setLabelGap((double) (short) 1);
        java.awt.Paint paint34 = piePlot3D24.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke35 = piePlot3D24.getLabelLinkStroke();
        java.awt.Paint paint36 = piePlot3D24.getBaseSectionPaint();
        piePlot3D11.setSectionOutlinePaint((java.lang.Comparable) false, paint36);
        org.jfree.chart.plot.PiePlot3D piePlot3D38 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D38.setLabelPadding(rectangleInsets39);
        java.awt.Paint paint41 = piePlot3D38.getLabelLinkPaint();
        boolean boolean42 = piePlot3D38.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = piePlot3D38.getInsets();
        piePlot3D11.setSimpleLabelOffset(rectangleInsets43);
        piePlot3D0.setSimpleLabelOffset(rectangleInsets43);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNull(plot9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.025d + "'", double10 == 0.025d);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(rectangleInsets39);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(rectangleInsets43);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot3D0.addChangeListener(plotChangeListener4);
        double double6 = piePlot3D0.getInteriorGap();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D9.setLabelPadding(rectangleInsets10);
        float float12 = piePlot3D9.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        piePlot3D9.drawBackgroundImage(graphics2D13, rectangle2D14);
        java.awt.Font font16 = piePlot3D9.getLabelFont();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState19 = piePlot3D0.initialise(graphics2D7, rectangle2D8, (org.jfree.chart.plot.PiePlot) piePlot3D9, (java.lang.Integer) 15, plotRenderingInfo18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.08d + "'", double6 == 0.08d);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(font16);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        float float3 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot3D0.drawBackgroundImage(graphics2D4, rectangle2D5);
        piePlot3D0.setDepthFactor((double) '#');
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent9 = null;
        piePlot3D0.datasetChanged(datasetChangeEvent9);
        double double12 = piePlot3D0.getExplodePercent((java.lang.Comparable) 100L);
        piePlot3D0.setIgnoreNullValues(true);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = piePlot3D0.getSimpleLabelOffset();
        piePlot3D0.setIgnoreZeroValues(false);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        piePlot3D0.drawBackgroundImage(graphics2D10, rectangle2D11);
        double double13 = piePlot3D0.getShadowXOffset();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.0d + "'", double13 == 4.0d);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        java.awt.Font font4 = piePlot3D0.getNoDataMessageFont();
        java.awt.Paint paint5 = piePlot3D0.getOutlinePaint();
        int int6 = piePlot3D0.getBackgroundImageAlignment();
        java.lang.Class<?> wildcardClass7 = piePlot3D0.getClass();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean1 = piePlot3D0.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator2);
        org.jfree.chart.plot.PiePlot3D piePlot3D4 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D4.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke8 = piePlot3D4.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator9 = piePlot3D4.getLegendLabelGenerator();
        piePlot3D0.setLabelGenerator(pieSectionLabelGenerator9);
        java.awt.Stroke stroke11 = piePlot3D0.getOutlineStroke();
        piePlot3D0.setPieIndex((int) (short) 100);
        boolean boolean14 = piePlot3D0.isOutlineVisible();
        piePlot3D0.setCircular(false);
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D17.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = piePlot3D17.getLabelPadding();
        piePlot3D17.setShadowXOffset(10.0d);
        piePlot3D17.setCircular(false);
        piePlot3D17.setLabelGap((double) (short) 1);
        java.awt.Paint paint27 = piePlot3D17.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke28 = piePlot3D17.getLabelLinkStroke();
        java.awt.Paint paint29 = piePlot3D17.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D30 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D30.setLabelPadding(rectangleInsets31);
        java.awt.Paint paint33 = piePlot3D30.getLabelLinkPaint();
        boolean boolean34 = piePlot3D30.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = piePlot3D30.getInsets();
        java.awt.Paint paint36 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D30.setShadowPaint(paint36);
        piePlot3D17.setLabelPaint(paint36);
        java.awt.Image image39 = piePlot3D17.getBackgroundImage();
        piePlot3D17.setForegroundAlpha((float) ' ');
        java.awt.Paint paint42 = piePlot3D17.getBackgroundPaint();
        piePlot3D0.setNoDataMessagePaint(paint42);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(rectangleInsets35);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNull(image39);
        org.junit.Assert.assertNotNull(paint42);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.data.general.PieDataset pieDataset5 = null;
        piePlot3D0.setDataset(pieDataset5);
        double double7 = piePlot3D0.getDepthFactor();
        java.awt.Paint paint8 = piePlot3D0.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12d + "'", double7 == 0.12d);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        java.awt.Font font4 = piePlot3D0.getNoDataMessageFont();
        java.awt.Paint paint5 = piePlot3D0.getOutlinePaint();
        java.awt.Font font6 = piePlot3D0.getNoDataMessageFont();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = null;
        piePlot3D0.setURLGenerator(pieURLGenerator7);
        double double9 = piePlot3D0.getShadowXOffset();
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setLabelPadding(rectangleInsets11);
        java.awt.Paint paint13 = piePlot3D10.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator14 = null;
        piePlot3D10.setLegendLabelToolTipGenerator(pieSectionLabelGenerator14);
        piePlot3D10.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot18 = piePlot3D10.getRootPlot();
        java.awt.Stroke stroke19 = piePlot3D10.getOutlineStroke();
        piePlot3D10.setStartAngle((double) (byte) 0);
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D22.setLabelPadding(rectangleInsets23);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        piePlot3D22.handleClick((int) (short) 100, 0, plotRenderingInfo27);
        org.jfree.chart.plot.PiePlot3D piePlot3D29 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D29.setLabelPadding(rectangleInsets30);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo34 = null;
        piePlot3D29.handleClick((int) (short) 100, 0, plotRenderingInfo34);
        boolean boolean36 = piePlot3D29.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D37 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D37.setLabelPadding(rectangleInsets38);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        piePlot3D37.handleClick((int) (short) 100, 0, plotRenderingInfo42);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator44 = piePlot3D37.getURLGenerator();
        java.awt.Stroke stroke46 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D37.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke46);
        piePlot3D29.setLabelOutlineStroke(stroke46);
        piePlot3D22.setLabelLinkStroke(stroke46);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor50 = piePlot3D22.getLabelDistributor();
        org.jfree.chart.plot.PiePlot3D piePlot3D51 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D51.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke55 = piePlot3D51.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator56 = piePlot3D51.getLegendLabelGenerator();
        piePlot3D22.setLegendLabelToolTipGenerator(pieSectionLabelGenerator56);
        float float58 = piePlot3D22.getBackgroundAlpha();
        piePlot3D22.setIgnoreNullValues(false);
        java.awt.Paint paint61 = piePlot3D22.getLabelPaint();
        piePlot3D10.setNoDataMessagePaint(paint61);
        piePlot3D0.setLabelOutlinePaint(paint61);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(rectangleInsets38);
        org.junit.Assert.assertNull(pieURLGenerator44);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor50);
        org.junit.Assert.assertNull(stroke55);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator56);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + 1.0f + "'", float58 == 1.0f);
        org.junit.Assert.assertNotNull(paint61);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot3D0.getInsets();
        java.awt.Image image6 = null;
        piePlot3D0.setBackgroundImage(image6);
        double double8 = piePlot3D0.getShadowXOffset();
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D9.setSectionOutlinesVisible(true);
        piePlot3D9.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        piePlot3D9.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        piePlot3D9.removeChangeListener(plotChangeListener17);
        boolean boolean19 = piePlot3D9.isCircular();
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D20.setSectionOutlinesVisible(true);
        piePlot3D20.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        piePlot3D20.drawBackgroundImage(graphics2D25, rectangle2D26);
        piePlot3D20.zoom((double) '#');
        java.awt.Font font30 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D20.setLabelFont(font30);
        org.jfree.chart.plot.PiePlot3D piePlot3D33 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D33.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = piePlot3D33.getLabelPadding();
        piePlot3D33.setShadowXOffset(10.0d);
        piePlot3D33.setCircular(false);
        piePlot3D33.setLabelGap((double) (short) 1);
        java.awt.Paint paint43 = piePlot3D33.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke44 = piePlot3D33.getLabelLinkStroke();
        java.awt.Paint paint45 = piePlot3D33.getBaseSectionPaint();
        piePlot3D20.setSectionOutlinePaint((java.lang.Comparable) false, paint45);
        piePlot3D9.setBaseSectionOutlinePaint(paint45);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator48 = piePlot3D9.getLegendLabelGenerator();
        org.jfree.chart.plot.PiePlot3D piePlot3D49 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets50 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D49.setLabelPadding(rectangleInsets50);
        java.awt.Paint paint52 = piePlot3D49.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator53 = null;
        piePlot3D49.setLegendLabelToolTipGenerator(pieSectionLabelGenerator53);
        piePlot3D49.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot57 = piePlot3D49.getRootPlot();
        org.jfree.chart.plot.PiePlot3D piePlot3D58 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets59 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D58.setLabelPadding(rectangleInsets59);
        java.awt.Paint paint61 = piePlot3D58.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener62 = null;
        piePlot3D58.addChangeListener(plotChangeListener62);
        piePlot3D58.setBackgroundImageAlignment((int) (short) 10);
        piePlot3D58.setLabelLinksVisible(true);
        java.awt.Font font68 = piePlot3D58.getNoDataMessageFont();
        piePlot3D49.setLabelFont(font68);
        piePlot3D9.setNoDataMessageFont(font68);
        piePlot3D0.setLabelFont(font68);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertNotNull(rectangleInsets36);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator48);
        org.junit.Assert.assertNotNull(rectangleInsets50);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertNotNull(plot57);
        org.junit.Assert.assertNotNull(rectangleInsets59);
        org.junit.Assert.assertNotNull(paint61);
        org.junit.Assert.assertNotNull(font68);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.awt.Stroke stroke9 = piePlot3D0.getOutlineStroke();
        double double10 = piePlot3D0.getMaximumLabelWidth();
        int int11 = piePlot3D0.getPieIndex();
        double double12 = piePlot3D0.getStartAngle();
        piePlot3D0.setDepthFactor((double) (short) 0);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 90.0d + "'", double12 == 90.0d);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        boolean boolean2 = piePlot3D1.getLabelLinksVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D3 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D3.setLabelPadding(rectangleInsets4);
        java.awt.Paint paint6 = piePlot3D3.getLabelLinkPaint();
        boolean boolean7 = piePlot3D3.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        piePlot3D3.notifyListeners(plotChangeEvent8);
        double double10 = piePlot3D3.getDepthFactor();
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D11.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot3D11.getLabelPadding();
        java.awt.Font font15 = piePlot3D11.getNoDataMessageFont();
        java.awt.Paint paint16 = piePlot3D11.getOutlinePaint();
        java.awt.Font font17 = piePlot3D11.getNoDataMessageFont();
        piePlot3D3.setLabelFont(font17);
        java.awt.Paint paint19 = piePlot3D3.getBaseSectionPaint();
        boolean boolean20 = piePlot3D1.equals((java.lang.Object) piePlot3D3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        piePlot3D1.handleClick(10, (int) (byte) 100, plotRenderingInfo23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12d + "'", double10 == 0.12d);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot3D0.getDatasetGroup();
        piePlot3D0.setBackgroundImageAlignment(1);
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup8);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        piePlot3D0.setOutlineVisible(false);
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D7.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = piePlot3D7.getLabelPadding();
        piePlot3D7.setShadowXOffset(10.0d);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent13 = null;
        piePlot3D7.datasetChanged(datasetChangeEvent13);
        int int15 = piePlot3D7.getBackgroundImageAlignment();
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D16.setLabelPadding(rectangleInsets17);
        java.awt.Paint paint19 = piePlot3D16.getLabelLinkPaint();
        boolean boolean20 = piePlot3D16.getLabelLinksVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D21.setLabelPadding(rectangleInsets22);
        piePlot3D16.setSimpleLabelOffset(rectangleInsets22);
        piePlot3D7.setSimpleLabelOffset(rectangleInsets22);
        piePlot3D0.setLabelPadding(rectangleInsets22);
        org.jfree.chart.plot.PiePlot3D piePlot3D27 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D27.setSectionOutlinesVisible(true);
        piePlot3D27.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D32 = null;
        java.awt.geom.Rectangle2D rectangle2D33 = null;
        piePlot3D27.drawBackgroundImage(graphics2D32, rectangle2D33);
        java.awt.Paint paint35 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D27.setNoDataMessagePaint(paint35);
        piePlot3D0.setLabelPaint(paint35);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        boolean boolean7 = piePlot3D0.getSectionOutlinesVisible();
        java.awt.Paint paint8 = piePlot3D0.getBaseSectionPaint();
        piePlot3D0.setDepthFactor((double) 1);
        org.jfree.chart.LegendItemCollection legendItemCollection11 = piePlot3D0.getLegendItems();
        boolean boolean12 = piePlot3D0.getIgnoreNullValues();
        java.awt.Image image13 = piePlot3D0.getBackgroundImage();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(image13);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D9.setLabelPadding(rectangleInsets10);
        java.awt.Paint paint12 = piePlot3D9.getLabelLinkPaint();
        java.awt.Paint paint13 = piePlot3D9.getShadowPaint();
        piePlot3D0.setBaseSectionOutlinePaint(paint13);
        org.jfree.chart.plot.PiePlot3D piePlot3D15 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D15.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3D15.getLabelPadding();
        piePlot3D15.setShadowXOffset(10.0d);
        piePlot3D15.setCircular(false);
        piePlot3D15.setLabelGap((double) (short) 1);
        java.awt.Paint paint25 = piePlot3D15.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke26 = piePlot3D15.getLabelLinkStroke();
        double double27 = piePlot3D15.getMaximumLabelWidth();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = piePlot3D15.getLabelPadding();
        piePlot3D0.setInsets(rectangleInsets28, false);
        piePlot3D0.setBackgroundAlpha(100.0f);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.14d + "'", double27 == 0.14d);
        org.junit.Assert.assertNotNull(rectangleInsets28);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean1 = piePlot3D0.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator2);
        boolean boolean4 = piePlot3D0.isOutlineVisible();
        piePlot3D0.setShadowXOffset((double) (-1));
        float float7 = piePlot3D0.getBackgroundImageAlpha();
        piePlot3D0.setLabelLinksVisible(true);
        org.jfree.data.general.PieDataset pieDataset10 = piePlot3D0.getDataset();
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D12.setSectionOutlinesVisible(true);
        piePlot3D12.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        piePlot3D12.drawBackgroundImage(graphics2D17, rectangle2D18);
        piePlot3D12.zoom((double) '#');
        java.awt.Font font22 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D12.setLabelFont(font22);
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D25.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = piePlot3D25.getLabelPadding();
        piePlot3D25.setShadowXOffset(10.0d);
        piePlot3D25.setCircular(false);
        piePlot3D25.setLabelGap((double) (short) 1);
        java.awt.Paint paint35 = piePlot3D25.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke36 = piePlot3D25.getLabelLinkStroke();
        java.awt.Paint paint37 = piePlot3D25.getBaseSectionPaint();
        piePlot3D12.setSectionOutlinePaint((java.lang.Comparable) false, paint37);
        piePlot3D0.setSectionPaint((java.lang.Comparable) (short) 10, paint37);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator40 = null;
        piePlot3D0.setLegendLabelURLGenerator(pieURLGenerator40);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNull(pieDataset10);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(paint37);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        double double7 = piePlot3D0.getDepthFactor();
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D8.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot3D8.getLabelPadding();
        java.awt.Font font12 = piePlot3D8.getNoDataMessageFont();
        java.awt.Paint paint13 = piePlot3D8.getOutlinePaint();
        java.awt.Font font14 = piePlot3D8.getNoDataMessageFont();
        piePlot3D0.setLabelFont(font14);
        boolean boolean16 = piePlot3D0.isOutlineVisible();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12d + "'", double7 == 0.12d);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D7.setLabelPadding(rectangleInsets8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        piePlot3D7.handleClick((int) (short) 100, 0, plotRenderingInfo12);
        boolean boolean14 = piePlot3D7.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D15 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D15.setLabelPadding(rectangleInsets16);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        piePlot3D15.handleClick((int) (short) 100, 0, plotRenderingInfo20);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = piePlot3D15.getURLGenerator();
        java.awt.Stroke stroke24 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D15.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke24);
        piePlot3D7.setLabelOutlineStroke(stroke24);
        piePlot3D0.setLabelLinkStroke(stroke24);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor28 = piePlot3D0.getLabelDistributor();
        java.awt.Font font29 = piePlot3D0.getLabelFont();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNull(pieURLGenerator22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor28);
        org.junit.Assert.assertNotNull(font29);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        boolean boolean5 = piePlot3D0.isCircular();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D0.getLegendLabelGenerator();
        java.awt.Font font7 = piePlot3D0.getNoDataMessageFont();
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D8.setLabelPadding(rectangleInsets9);
        java.awt.Paint paint11 = piePlot3D8.getLabelLinkPaint();
        piePlot3D8.setBackgroundAlpha((float) 0L);
        piePlot3D8.setNoDataMessage("");
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D16.setLabelPadding(rectangleInsets17);
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean21 = piePlot3D20.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator22 = null;
        piePlot3D20.setToolTipGenerator(pieToolTipGenerator22);
        java.awt.Paint paint24 = piePlot3D20.getShadowPaint();
        piePlot3D16.setSectionPaint((java.lang.Comparable) (short) -1, paint24);
        org.jfree.chart.plot.PiePlot3D piePlot3D26 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D26.setLabelPadding(rectangleInsets27);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        piePlot3D26.handleClick((int) (short) 100, 0, plotRenderingInfo31);
        boolean boolean33 = piePlot3D26.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D34 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D34.setLabelPadding(rectangleInsets35);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = null;
        piePlot3D34.handleClick((int) (short) 100, 0, plotRenderingInfo39);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator41 = piePlot3D34.getURLGenerator();
        java.awt.Stroke stroke43 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D34.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke43);
        piePlot3D26.setLabelOutlineStroke(stroke43);
        piePlot3D16.setLabelLinkStroke(stroke43);
        piePlot3D8.setLabelOutlineStroke(stroke43);
        piePlot3D0.setBaseSectionOutlineStroke(stroke43);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(rectangleInsets35);
        org.junit.Assert.assertNull(pieURLGenerator41);
        org.junit.Assert.assertNotNull(stroke43);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        double double7 = piePlot3D0.getDepthFactor();
        int int8 = piePlot3D0.getPieIndex();
        org.jfree.chart.LegendItemCollection legendItemCollection9 = piePlot3D0.getLegendItems();
        piePlot3D0.setBackgroundAlpha(0.5f);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12d + "'", double7 == 0.12d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(legendItemCollection9);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        piePlot3D0.setIgnoreNullValues(true);
        piePlot3D0.setShadowYOffset((double) 0L);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        org.jfree.chart.plot.Plot plot6 = piePlot3D0.getParent();
        java.awt.Paint paint7 = piePlot3D0.getShadowPaint();
        piePlot3D0.setDepthFactor(0.0d);
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setLabelPadding(rectangleInsets11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        piePlot3D10.handleClick((int) (short) 100, 0, plotRenderingInfo15);
        boolean boolean17 = piePlot3D10.getSectionOutlinesVisible();
        java.awt.Paint paint18 = piePlot3D10.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D19.setSectionOutlinesVisible(true);
        piePlot3D19.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        piePlot3D19.drawBackgroundImage(graphics2D24, rectangle2D25);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = piePlot3D19.getLabelPadding();
        piePlot3D10.setInsets(rectangleInsets27);
        int int29 = piePlot3D10.getPieIndex();
        org.jfree.chart.plot.PiePlot3D piePlot3D30 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D30.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = piePlot3D30.getLabelPadding();
        piePlot3D30.setShadowXOffset(10.0d);
        piePlot3D30.setCircular(false);
        piePlot3D30.setLabelGap((double) (short) 1);
        java.awt.Paint paint40 = piePlot3D30.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke41 = piePlot3D30.getLabelLinkStroke();
        java.awt.Paint paint42 = piePlot3D30.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D43 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D43.setLabelPadding(rectangleInsets44);
        java.awt.Paint paint46 = piePlot3D43.getLabelLinkPaint();
        boolean boolean47 = piePlot3D43.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets48 = piePlot3D43.getInsets();
        java.awt.Paint paint49 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D43.setShadowPaint(paint49);
        piePlot3D30.setLabelPaint(paint49);
        float float52 = piePlot3D30.getBackgroundAlpha();
        java.awt.Shape shape53 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot3D30.setLegendItemShape(shape53);
        piePlot3D10.setLegendItemShape(shape53);
        piePlot3D0.setLegendItemShape(shape53);
        java.awt.Paint paint58 = piePlot3D0.getSectionPaint((java.lang.Comparable) 10.0d);
        java.awt.Paint paint60 = piePlot3D0.getSectionPaint((java.lang.Comparable) true);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(rectangleInsets44);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(rectangleInsets48);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 1.0f + "'", float52 == 1.0f);
        org.junit.Assert.assertNotNull(shape53);
        org.junit.Assert.assertNull(paint58);
        org.junit.Assert.assertNull(paint60);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D9.setLabelPadding(rectangleInsets10);
        java.awt.Paint paint12 = piePlot3D9.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        piePlot3D9.addChangeListener(plotChangeListener13);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = piePlot3D9.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D16.setLabelPadding(rectangleInsets17);
        java.awt.Paint paint19 = piePlot3D16.getLabelLinkPaint();
        boolean boolean20 = piePlot3D16.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        piePlot3D16.notifyListeners(plotChangeEvent21);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = piePlot3D16.getSimpleLabelOffset();
        piePlot3D9.setLabelPadding(rectangleInsets23);
        piePlot3D0.setInsets(rectangleInsets23);
        piePlot3D0.setBackgroundImageAlignment(0);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(pieSectionLabelGenerator15);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(rectangleInsets23);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        boolean boolean5 = piePlot3D0.isCircular();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D0.getLegendLabelGenerator();
        java.awt.Font font7 = piePlot3D0.getNoDataMessageFont();
        piePlot3D0.setPieIndex(100);
        piePlot3D0.setNoDataMessage("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(font7);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        float float7 = piePlot3D0.getForegroundAlpha();
        java.awt.Paint paint8 = piePlot3D0.getBaseSectionOutlinePaint();
        boolean boolean9 = piePlot3D0.getSimpleLabels();
        java.awt.Font font10 = piePlot3D0.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(font10);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        piePlot3D0.setOutlineVisible(false);
        java.awt.Paint paint8 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) 1L);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D(pieDataset9);
        java.awt.Paint paint11 = piePlot3D10.getBaseSectionPaint();
        piePlot3D0.setLabelShadowPaint(paint11);
        piePlot3D0.setOutlineVisible(true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator15 = piePlot3D0.getLegendLabelURLGenerator();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(pieURLGenerator15);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot3D0.getInsets();
        java.awt.Paint paint6 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D0.setShadowPaint(paint6);
        boolean boolean8 = piePlot3D0.getSimpleLabels();
        double double9 = piePlot3D0.getDepthFactor();
        double double10 = piePlot3D0.getDepthFactor();
        java.awt.Paint paint12 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) 15);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.12d + "'", double9 == 0.12d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12d + "'", double10 == 0.12d);
        org.junit.Assert.assertNull(paint12);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getDepthFactor();
        piePlot3D0.setIgnoreNullValues(true);
        piePlot3D0.setBackgroundImageAlignment((int) (short) 1);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.12d + "'", double5 == 0.12d);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.data.general.PieDataset pieDataset3 = piePlot3D0.getDataset();
        java.awt.Paint paint5 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) (short) 100);
        piePlot3D0.setLabelLinksVisible(true);
        float float8 = piePlot3D0.getBackgroundImageAlpha();
        piePlot3D0.setStartAngle(0.0d);
        int int11 = piePlot3D0.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieDataset3);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        float float3 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot3D0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Stroke stroke8 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) 0.5f);
        java.awt.Paint paint9 = piePlot3D0.getBaseSectionPaint();
        piePlot3D0.setCircular(true);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D5.setLabelPadding(rectangleInsets6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        piePlot3D5.handleClick((int) (short) 100, 0, plotRenderingInfo10);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = piePlot3D5.getURLGenerator();
        java.awt.Paint paint13 = piePlot3D5.getLabelOutlinePaint();
        piePlot3D0.setLabelShadowPaint(paint13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = piePlot3D0.getDatasetGroup();
        piePlot3D0.setCircular(true);
        java.awt.Stroke stroke18 = piePlot3D0.getLabelOutlineStroke();
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D19.setLabelPadding(rectangleInsets20);
        java.awt.Paint paint22 = piePlot3D19.getLabelLinkPaint();
        boolean boolean23 = piePlot3D19.getLabelLinksVisible();
        double double24 = piePlot3D19.getLabelLinkMargin();
        piePlot3D19.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup27 = piePlot3D19.getDatasetGroup();
        piePlot3D19.setBackgroundImageAlignment(1);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = piePlot3D19.getSimpleLabelOffset();
        piePlot3D19.setShadowXOffset((double) (-1.0f));
        java.awt.Font font33 = piePlot3D19.getNoDataMessageFont();
        piePlot3D0.setNoDataMessageFont(font33);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(pieURLGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.025d + "'", double24 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup27);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNotNull(font33);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.awt.Stroke stroke9 = piePlot3D0.getOutlineStroke();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator10 = piePlot3D0.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.Plot plot11 = piePlot3D0.getParent();
        java.awt.Paint paint12 = piePlot3D0.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D13.setLabelPadding(rectangleInsets14);
        java.awt.Paint paint16 = piePlot3D13.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        piePlot3D13.addChangeListener(plotChangeListener17);
        java.awt.Paint paint19 = piePlot3D13.getShadowPaint();
        java.awt.Paint paint20 = piePlot3D13.getLabelOutlinePaint();
        java.awt.Paint paint21 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_SHADOW_PAINT;
        piePlot3D13.setShadowPaint(paint21);
        piePlot3D0.setLabelBackgroundPaint(paint21);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(pieSectionLabelGenerator10);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.awt.Paint paint9 = piePlot3D0.getBaseSectionOutlinePaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        piePlot3D0.addChangeListener(plotChangeListener10);
        java.awt.Stroke stroke13 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) (byte) 1);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator14 = piePlot3D0.getLegendLabelToolTipGenerator();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        piePlot3D0.markerChanged(markerChangeEvent15);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(stroke13);
        org.junit.Assert.assertNull(pieSectionLabelGenerator14);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.awt.Stroke stroke9 = piePlot3D0.getOutlineStroke();
        double double10 = piePlot3D0.getMaximumLabelWidth();
        double double11 = piePlot3D0.getStartAngle();
        java.awt.Shape shape12 = piePlot3D0.getLegendItemShape();
        java.awt.Stroke stroke14 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) 15);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 90.0d + "'", double11 == 90.0d);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNull(stroke14);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        java.awt.Paint paint10 = piePlot3D0.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        piePlot3D0.handleClick((int) 'a', 10, plotRenderingInfo13);
        org.jfree.chart.plot.PiePlot3D piePlot3D15 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D15.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3D15.getLabelPadding();
        java.awt.Font font19 = piePlot3D15.getNoDataMessageFont();
        java.awt.Paint paint20 = piePlot3D15.getShadowPaint();
        piePlot3D0.setOutlinePaint(paint20);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.awt.Stroke stroke9 = piePlot3D0.getOutlineStroke();
        double double10 = piePlot3D0.getMaximumLabelWidth();
        double double11 = piePlot3D0.getStartAngle();
        java.awt.Shape shape12 = piePlot3D0.getLegendItemShape();
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D13.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = piePlot3D13.getLabelPadding();
        piePlot3D13.setShadowXOffset(10.0d);
        piePlot3D13.setCircular(false);
        piePlot3D13.setLabelGap((double) (short) 1);
        java.awt.Stroke stroke23 = piePlot3D13.getOutlineStroke();
        double double25 = piePlot3D13.getExplodePercent((java.lang.Comparable) 1.0d);
        org.jfree.chart.plot.PiePlot3D piePlot3D26 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D26.setLabelPadding(rectangleInsets27);
        java.awt.Paint paint29 = piePlot3D26.getLabelLinkPaint();
        boolean boolean30 = piePlot3D26.getLabelLinksVisible();
        double double31 = piePlot3D26.getDepthFactor();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator32 = piePlot3D26.getLabelGenerator();
        piePlot3D13.setLegendLabelGenerator(pieSectionLabelGenerator32);
        piePlot3D0.setLabelGenerator(pieSectionLabelGenerator32);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 90.0d + "'", double11 == 90.0d);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.12d + "'", double31 == 0.12d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator32);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot3D0.getURLGenerator();
        java.awt.Stroke stroke9 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke9);
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D11.setLabelPadding(rectangleInsets12);
        java.awt.Paint paint14 = piePlot3D11.getLabelLinkPaint();
        boolean boolean15 = piePlot3D11.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        piePlot3D11.notifyListeners(plotChangeEvent16);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3D11.getSimpleLabelOffset();
        piePlot3D0.setSimpleLabelOffset(rectangleInsets18);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent20 = null;
        piePlot3D0.axisChanged(axisChangeEvent20);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = piePlot3D0.getSimpleLabelOffset();
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        java.awt.geom.Point2D point2D25 = null;
        org.jfree.chart.plot.PlotState plotState26 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.draw(graphics2D23, rectangle2D24, point2D25, plotState26, plotRenderingInfo27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(rectangleInsets22);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot3D0.addChangeListener(plotChangeListener4);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D0.getLegendLabelToolTipGenerator();
        java.awt.Font font7 = piePlot3D0.getNoDataMessageFont();
        piePlot3D0.setLabelGap(0.14d);
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setLabelPadding(rectangleInsets11);
        java.awt.Paint paint13 = piePlot3D10.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator14 = null;
        piePlot3D10.setLegendLabelToolTipGenerator(pieSectionLabelGenerator14);
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean18 = piePlot3D17.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator19 = null;
        piePlot3D17.setToolTipGenerator(pieToolTipGenerator19);
        java.awt.Paint paint21 = piePlot3D17.getShadowPaint();
        piePlot3D10.setSectionPaint((java.lang.Comparable) 100.0f, paint21);
        piePlot3D0.setNoDataMessagePaint(paint21);
        java.lang.Object obj24 = piePlot3D0.clone();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(obj24);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        org.jfree.chart.plot.Plot plot6 = piePlot3D0.getParent();
        java.awt.Paint paint7 = piePlot3D0.getShadowPaint();
        piePlot3D0.setDepthFactor(0.0d);
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setLabelPadding(rectangleInsets11);
        java.awt.Paint paint13 = piePlot3D10.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator14 = null;
        piePlot3D10.setLegendLabelToolTipGenerator(pieSectionLabelGenerator14);
        piePlot3D10.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot18 = piePlot3D10.getRootPlot();
        java.awt.Stroke stroke19 = piePlot3D10.getOutlineStroke();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent20 = null;
        piePlot3D10.axisChanged(axisChangeEvent20);
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D22.setLabelPadding(rectangleInsets23);
        org.jfree.chart.plot.PiePlot3D piePlot3D26 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean27 = piePlot3D26.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator28 = null;
        piePlot3D26.setToolTipGenerator(pieToolTipGenerator28);
        java.awt.Paint paint30 = piePlot3D26.getShadowPaint();
        piePlot3D22.setSectionPaint((java.lang.Comparable) (short) -1, paint30);
        piePlot3D10.setLabelOutlinePaint(paint30);
        piePlot3D0.setLabelShadowPaint(paint30);
        org.jfree.chart.plot.PiePlot3D piePlot3D34 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D34.setLabelPadding(rectangleInsets35);
        java.awt.Paint paint37 = piePlot3D34.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener38 = null;
        piePlot3D34.addChangeListener(plotChangeListener38);
        piePlot3D34.setBackgroundImageAlignment((int) (short) 10);
        java.awt.Stroke stroke42 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D34.setOutlineStroke(stroke42);
        piePlot3D0.setLabelLinkStroke(stroke42);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(rectangleInsets35);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(stroke42);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PiePlot3D piePlot3D4 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean5 = piePlot3D4.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot3D4.setToolTipGenerator(pieToolTipGenerator6);
        java.awt.Paint paint8 = piePlot3D4.getShadowPaint();
        piePlot3D0.setSectionPaint((java.lang.Comparable) (short) -1, paint8);
        org.jfree.data.general.PieDataset pieDataset10 = piePlot3D0.getDataset();
        piePlot3D0.setExplodePercent((java.lang.Comparable) 0.0d, 100.0d);
        double double14 = piePlot3D0.getDepthFactor();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(pieDataset10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.12d + "'", double14 == 0.12d);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.data.general.PieDataset pieDataset3 = piePlot3D0.getDataset();
        java.lang.String str4 = piePlot3D0.getPlotType();
        org.jfree.chart.plot.Plot plot5 = piePlot3D0.getParent();
        // The following exception was thrown during execution in test generation
        try {
            plot5.setForegroundAlpha((float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieDataset3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Pie 3D Plot" + "'", str4, "Pie 3D Plot");
        org.junit.Assert.assertNull(plot5);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        org.jfree.chart.plot.PiePlot3D piePlot3D2 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D2.setLabelPadding(rectangleInsets3);
        java.awt.Paint paint5 = piePlot3D2.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = null;
        piePlot3D2.setLegendLabelToolTipGenerator(pieSectionLabelGenerator6);
        piePlot3D2.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot10 = piePlot3D2.getRootPlot();
        java.awt.Stroke stroke11 = piePlot3D2.getOutlineStroke();
        piePlot3D1.setLabelLinkStroke(stroke11);
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D14.setLabelPadding(rectangleInsets15);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        piePlot3D14.handleClick((int) (short) 100, 0, plotRenderingInfo19);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator21 = piePlot3D14.getURLGenerator();
        org.jfree.chart.plot.PiePlot3D piePlot3D23 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D23.setSectionOutlinesVisible(true);
        piePlot3D23.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        piePlot3D23.drawBackgroundImage(graphics2D28, rectangle2D29);
        java.awt.Paint paint31 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D23.setNoDataMessagePaint(paint31);
        java.awt.Paint paint33 = piePlot3D23.getLabelOutlinePaint();
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        piePlot3D23.drawBackgroundImage(graphics2D34, rectangle2D35);
        java.awt.Paint paint38 = piePlot3D23.getSectionPaint((java.lang.Comparable) 0.0d);
        java.awt.Paint paint40 = piePlot3D23.getSectionOutlinePaint((java.lang.Comparable) (short) 1);
        org.jfree.chart.plot.PiePlot3D piePlot3D41 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D41.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = piePlot3D41.getLabelPadding();
        piePlot3D41.setShadowXOffset(10.0d);
        piePlot3D41.setCircular(false);
        piePlot3D41.setLabelGap((double) (short) 1);
        java.awt.Paint paint51 = piePlot3D41.getBaseSectionOutlinePaint();
        piePlot3D23.setLabelPaint(paint51);
        piePlot3D14.setSectionPaint((java.lang.Comparable) (byte) 1, paint51);
        piePlot3D1.setSectionPaint((java.lang.Comparable) 10.0f, paint51);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNull(pieURLGenerator21);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNull(paint38);
        org.junit.Assert.assertNull(paint40);
        org.junit.Assert.assertNotNull(rectangleInsets44);
        org.junit.Assert.assertNotNull(paint51);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setDarkerSides(false);
        boolean boolean3 = piePlot3D0.isOutlineVisible();
        boolean boolean4 = piePlot3D0.getIgnoreNullValues();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot3D0.getLegendLabelToolTipGenerator();
        java.awt.Paint paint6 = piePlot3D0.getBackgroundPaint();
        int int7 = piePlot3D0.getPieIndex();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(pieSectionLabelGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D5.setLabelPadding(rectangleInsets6);
        piePlot3D0.setSimpleLabelOffset(rectangleInsets6);
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D9.setSectionOutlinesVisible(true);
        piePlot3D9.setStartAngle((double) (byte) -1);
        boolean boolean14 = piePlot3D9.isCircular();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = piePlot3D9.getLegendLabelGenerator();
        java.awt.Font font16 = piePlot3D9.getNoDataMessageFont();
        piePlot3D0.setLabelFont(font16);
        piePlot3D0.setBackgroundImageAlignment((int) (byte) 0);
        java.lang.Object obj20 = piePlot3D0.clone();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D5.setLabelPadding(rectangleInsets6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        piePlot3D5.handleClick((int) (short) 100, 0, plotRenderingInfo10);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = piePlot3D5.getURLGenerator();
        java.awt.Paint paint13 = piePlot3D5.getLabelOutlinePaint();
        piePlot3D0.setLabelShadowPaint(paint13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = piePlot3D0.getDatasetGroup();
        java.awt.Paint paint17 = piePlot3D0.getSectionPaint((java.lang.Comparable) (short) 10);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator18 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator18);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(pieURLGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNull(paint17);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        boolean boolean7 = piePlot3D0.getSectionOutlinesVisible();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.drawBackground(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot3D0.getDatasetGroup();
        java.awt.Image image9 = null;
        piePlot3D0.setBackgroundImage(image9);
        int int11 = piePlot3D0.getPieIndex();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setSimpleLabelOffset(rectangleInsets12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'offset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D7.setLabelPadding(rectangleInsets8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        piePlot3D7.handleClick((int) (short) 100, 0, plotRenderingInfo12);
        boolean boolean14 = piePlot3D7.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D15 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D15.setLabelPadding(rectangleInsets16);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        piePlot3D15.handleClick((int) (short) 100, 0, plotRenderingInfo20);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = piePlot3D15.getURLGenerator();
        java.awt.Stroke stroke24 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D15.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke24);
        piePlot3D7.setLabelOutlineStroke(stroke24);
        piePlot3D0.setLabelLinkStroke(stroke24);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor28 = piePlot3D0.getLabelDistributor();
        org.jfree.chart.plot.PiePlot3D piePlot3D29 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D29.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke33 = piePlot3D29.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator34 = piePlot3D29.getLegendLabelGenerator();
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator34);
        float float36 = piePlot3D0.getBackgroundAlpha();
        piePlot3D0.setIgnoreNullValues(false);
        java.awt.Paint paint39 = piePlot3D0.getLabelPaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier40 = piePlot3D0.getDrawingSupplier();
        piePlot3D0.setForegroundAlpha((float) '4');
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNull(pieURLGenerator22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor28);
        org.junit.Assert.assertNull(stroke33);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator34);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 1.0f + "'", float36 == 1.0f);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(drawingSupplier40);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D5.setLabelPadding(rectangleInsets6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        piePlot3D5.handleClick((int) (short) 100, 0, plotRenderingInfo10);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = piePlot3D5.getURLGenerator();
        java.awt.Paint paint13 = piePlot3D5.getLabelOutlinePaint();
        piePlot3D0.setLabelShadowPaint(paint13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = piePlot3D0.getDatasetGroup();
        java.awt.Stroke stroke16 = piePlot3D0.getBaseSectionOutlineStroke();
        java.awt.Paint paint18 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) 0.12d);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(pieURLGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(paint18);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor6 = piePlot3D0.getLabelDistributor();
        piePlot3D0.setNoDataMessage("hi!");
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D9.setLabelPadding(rectangleInsets10);
        java.awt.Paint paint12 = piePlot3D9.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        piePlot3D9.addChangeListener(plotChangeListener13);
        java.awt.Paint paint15 = piePlot3D9.getShadowPaint();
        java.awt.Paint paint16 = piePlot3D9.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D17.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke21 = piePlot3D17.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator22 = piePlot3D17.getLegendLabelGenerator();
        piePlot3D9.setLegendLabelToolTipGenerator(pieSectionLabelGenerator22);
        boolean boolean24 = piePlot3D0.equals((java.lang.Object) pieSectionLabelGenerator22);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator25 = null;
        piePlot3D0.setLegendLabelURLGenerator(pieURLGenerator25);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor6);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(stroke21);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        java.awt.Paint paint10 = piePlot3D0.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D11.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot3D11.getLabelPadding();
        java.awt.Font font15 = piePlot3D11.getNoDataMessageFont();
        java.awt.Paint paint16 = piePlot3D11.getOutlinePaint();
        piePlot3D0.setLabelOutlinePaint(paint16);
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D18.setSectionOutlinesVisible(true);
        piePlot3D18.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        piePlot3D18.drawBackgroundImage(graphics2D23, rectangle2D24);
        java.awt.Paint paint26 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D18.setNoDataMessagePaint(paint26);
        double double28 = piePlot3D18.getShadowYOffset();
        java.awt.Stroke stroke29 = piePlot3D18.getBaseSectionOutlineStroke();
        piePlot3D0.setBaseSectionOutlineStroke(stroke29);
        int int31 = piePlot3D0.getBackgroundImageAlignment();
        double double32 = piePlot3D0.getMinimumArcAngleToDraw();
        java.awt.Paint paint33 = piePlot3D0.getLabelBackgroundPaint();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.0d + "'", double28 == 4.0d);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 15 + "'", int31 == 15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0E-5d + "'", double32 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor6 = piePlot3D0.getLabelDistributor();
        piePlot3D0.zoom(10.0d);
        boolean boolean9 = piePlot3D0.getIgnoreNullValues();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        piePlot3D0.setPieIndex((int) ' ');
        piePlot3D0.setStartAngle((double) ' ');
        java.awt.Paint paint13 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) 100.0d);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(paint13);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean1 = piePlot3D0.getSimpleLabels();
        org.jfree.chart.plot.PiePlot3D piePlot3D2 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D2.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot3D2.getLabelPadding();
        piePlot3D0.setLabelPadding(rectangleInsets5);
        double double7 = piePlot3D0.getStartAngle();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        java.awt.Font font4 = piePlot3D0.getNoDataMessageFont();
        java.awt.Paint paint5 = piePlot3D0.getOutlinePaint();
        int int6 = piePlot3D0.getBackgroundImageAlignment();
        java.awt.Stroke stroke7 = piePlot3D0.getLabelOutlineStroke();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(stroke7);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        piePlot3D0.removeChangeListener(plotChangeListener8);
        double double10 = piePlot3D0.getMinimumArcAngleToDraw();
        org.jfree.chart.plot.Plot plot11 = piePlot3D0.getRootPlot();
        float float12 = piePlot3D0.getBackgroundAlpha();
        piePlot3D0.setIgnoreZeroValues(false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke4 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D5.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = piePlot3D5.getLabelPadding();
        piePlot3D5.setShadowXOffset(10.0d);
        piePlot3D5.setCircular(false);
        piePlot3D5.setLabelGap((double) (short) 1);
        java.awt.Paint paint15 = piePlot3D5.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke16 = piePlot3D5.getLabelLinkStroke();
        java.awt.Paint paint17 = piePlot3D5.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D18.setLabelPadding(rectangleInsets19);
        java.awt.Paint paint21 = piePlot3D18.getLabelLinkPaint();
        boolean boolean22 = piePlot3D18.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = piePlot3D18.getInsets();
        java.awt.Paint paint24 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D18.setShadowPaint(paint24);
        piePlot3D5.setLabelPaint(paint24);
        org.jfree.chart.plot.PiePlot3D piePlot3D27 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D27.setLabelPadding(rectangleInsets28);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = null;
        piePlot3D27.handleClick((int) (short) 100, 0, plotRenderingInfo32);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator34 = piePlot3D27.getURLGenerator();
        java.awt.Stroke stroke36 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D27.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke36);
        piePlot3D5.setOutlineStroke(stroke36);
        org.jfree.chart.plot.PiePlot3D piePlot3D39 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D39.setLabelPadding(rectangleInsets40);
        java.awt.Paint paint42 = piePlot3D39.getLabelLinkPaint();
        boolean boolean43 = piePlot3D39.getLabelLinksVisible();
        double double44 = piePlot3D39.getLabelLinkMargin();
        piePlot3D39.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup47 = piePlot3D39.getDatasetGroup();
        piePlot3D39.setBackgroundImageAlignment(1);
        java.awt.Paint paint50 = piePlot3D39.getLabelLinkPaint();
        piePlot3D5.setLabelShadowPaint(paint50);
        piePlot3D0.setLabelBackgroundPaint(paint50);
        org.jfree.chart.plot.Plot plot53 = piePlot3D0.getParent();
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNull(pieURLGenerator34);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(rectangleInsets40);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.025d + "'", double44 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup47);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNull(plot53);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot3D0.getURLGenerator();
        java.awt.Paint paint8 = piePlot3D0.getLabelOutlinePaint();
        double double9 = piePlot3D0.getLabelLinkMargin();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator10 = piePlot3D0.getURLGenerator();
        java.awt.Paint paint12 = null;
        piePlot3D0.setSectionPaint((java.lang.Comparable) 10L, paint12);
        double double14 = piePlot3D0.getStartAngle();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.025d + "'", double9 == 0.025d);
        org.junit.Assert.assertNull(pieURLGenerator10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 90.0d + "'", double14 == 90.0d);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot3D0.getURLGenerator();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor8 = piePlot3D0.getLabelDistributor();
        piePlot3D0.setLabelGap(1.0E-5d);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D13.setLabelPadding(rectangleInsets14);
        java.awt.Paint paint16 = piePlot3D13.getLabelLinkPaint();
        boolean boolean17 = piePlot3D13.getLabelLinksVisible();
        double double18 = piePlot3D13.getLabelLinkMargin();
        piePlot3D13.setBackgroundImageAlignment((int) 'a');
        double double21 = piePlot3D13.getStartAngle();
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D22.setLabelPadding(rectangleInsets23);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        piePlot3D22.handleClick((int) (short) 100, 0, plotRenderingInfo27);
        org.jfree.chart.plot.PiePlot3D piePlot3D29 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D29.setLabelPadding(rectangleInsets30);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo34 = null;
        piePlot3D29.handleClick((int) (short) 100, 0, plotRenderingInfo34);
        boolean boolean36 = piePlot3D29.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D37 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D37.setLabelPadding(rectangleInsets38);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        piePlot3D37.handleClick((int) (short) 100, 0, plotRenderingInfo42);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator44 = piePlot3D37.getURLGenerator();
        java.awt.Stroke stroke46 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D37.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke46);
        piePlot3D29.setLabelOutlineStroke(stroke46);
        piePlot3D22.setLabelLinkStroke(stroke46);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor50 = piePlot3D22.getLabelDistributor();
        org.jfree.chart.plot.PiePlot3D piePlot3D51 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D51.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke55 = piePlot3D51.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator56 = piePlot3D51.getLegendLabelGenerator();
        piePlot3D22.setLegendLabelToolTipGenerator(pieSectionLabelGenerator56);
        piePlot3D13.setLegendLabelToolTipGenerator(pieSectionLabelGenerator56);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo60 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState61 = piePlot3D0.initialise(graphics2D11, rectangle2D12, (org.jfree.chart.plot.PiePlot) piePlot3D13, (java.lang.Integer) 10, plotRenderingInfo60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor8);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.025d + "'", double18 == 0.025d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 90.0d + "'", double21 == 90.0d);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(rectangleInsets38);
        org.junit.Assert.assertNull(pieURLGenerator44);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor50);
        org.junit.Assert.assertNull(stroke55);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator56);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D0.setNoDataMessagePaint(paint8);
        java.awt.Paint paint10 = piePlot3D0.getLabelOutlinePaint();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot3D0.drawBackgroundImage(graphics2D11, rectangle2D12);
        java.awt.Paint paint15 = piePlot3D0.getSectionPaint((java.lang.Comparable) 0.0d);
        java.awt.Paint paint17 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) (short) 1);
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D18.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot3D18.getLabelPadding();
        piePlot3D18.setShadowXOffset(10.0d);
        piePlot3D18.setCircular(false);
        piePlot3D18.setLabelGap((double) (short) 1);
        java.awt.Paint paint28 = piePlot3D18.getBaseSectionOutlinePaint();
        piePlot3D0.setLabelPaint(paint28);
        float float30 = piePlot3D0.getBackgroundImageAlpha();
        piePlot3D0.setInteriorGap(0.14d);
        org.jfree.chart.plot.PiePlot3D piePlot3D33 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D33.setLabelPadding(rectangleInsets34);
        java.awt.Paint paint36 = piePlot3D33.getLabelLinkPaint();
        boolean boolean37 = piePlot3D33.getLabelLinksVisible();
        org.jfree.data.general.PieDataset pieDataset38 = null;
        piePlot3D33.setDataset(pieDataset38);
        double double40 = piePlot3D33.getDepthFactor();
        java.awt.Paint paint41 = piePlot3D33.getShadowPaint();
        piePlot3D0.setOutlinePaint(paint41);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.5f + "'", float30 == 0.5f);
        org.junit.Assert.assertNotNull(rectangleInsets34);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.12d + "'", double40 == 0.12d);
        org.junit.Assert.assertNotNull(paint41);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot3D0.getURLGenerator();
        java.awt.Paint paint8 = piePlot3D0.getLabelOutlinePaint();
        double double9 = piePlot3D0.getLabelLinkMargin();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator10 = piePlot3D0.getURLGenerator();
        java.awt.Paint paint12 = null;
        piePlot3D0.setSectionPaint((java.lang.Comparable) 10L, paint12);
        org.jfree.chart.util.Rotation rotation14 = piePlot3D0.getDirection();
        java.lang.String str15 = piePlot3D0.getNoDataMessage();
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D16.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = piePlot3D16.getLabelPadding();
        piePlot3D16.setShadowXOffset(10.0d);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        piePlot3D16.datasetChanged(datasetChangeEvent22);
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D25.setSectionOutlinesVisible(true);
        piePlot3D25.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        piePlot3D25.drawBackgroundImage(graphics2D30, rectangle2D31);
        piePlot3D25.zoom((double) '#');
        double double35 = piePlot3D25.getShadowXOffset();
        java.awt.Stroke stroke36 = piePlot3D25.getLabelOutlineStroke();
        piePlot3D16.setSectionOutlineStroke((java.lang.Comparable) 0.14d, stroke36);
        piePlot3D0.setBaseSectionOutlineStroke(stroke36);
        org.jfree.chart.plot.PiePlot3D piePlot3D39 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D39.setLabelPadding(rectangleInsets40);
        java.awt.Paint paint42 = piePlot3D39.getLabelLinkPaint();
        boolean boolean43 = piePlot3D39.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent44 = null;
        piePlot3D39.notifyListeners(plotChangeEvent44);
        double double46 = piePlot3D39.getDepthFactor();
        java.awt.Paint paint47 = piePlot3D39.getLabelLinkPaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent48 = null;
        piePlot3D39.axisChanged(axisChangeEvent48);
        java.awt.Paint paint50 = piePlot3D39.getLabelBackgroundPaint();
        piePlot3D0.setBaseSectionOutlinePaint(paint50);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.025d + "'", double9 == 0.025d);
        org.junit.Assert.assertNull(pieURLGenerator10);
        org.junit.Assert.assertNotNull(rotation14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 4.0d + "'", double35 == 4.0d);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(rectangleInsets40);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.12d + "'", double46 == 0.12d);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(paint50);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        double double7 = piePlot3D0.getDepthFactor();
        double double8 = piePlot3D0.getInteriorGap();
        double double9 = piePlot3D0.getInteriorGap();
        java.awt.Image image10 = null;
        piePlot3D0.setBackgroundImage(image10);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12d + "'", double7 == 0.12d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08d + "'", double9 == 0.08d);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        double double7 = piePlot3D0.getDepthFactor();
        double double8 = piePlot3D0.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset9 = piePlot3D0.getDataset();
        java.awt.Stroke stroke11 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12d + "'", double7 == 0.12d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNull(pieDataset9);
        org.junit.Assert.assertNull(stroke11);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.awt.Paint paint9 = piePlot3D0.getBaseSectionOutlinePaint();
        piePlot3D0.setStartAngle(0.4d);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.data.general.PieDataset pieDataset3 = piePlot3D0.getDataset();
        java.awt.Paint paint5 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) (short) 100);
        piePlot3D0.setLabelLinksVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = piePlot3D0.getInsets();
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D9.setLabelPadding(rectangleInsets10);
        float float12 = piePlot3D9.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        piePlot3D9.drawBackgroundImage(graphics2D13, rectangle2D14);
        java.awt.Paint paint16 = piePlot3D9.getShadowPaint();
        piePlot3D0.setShadowPaint(paint16);
        boolean boolean18 = piePlot3D0.getSimpleLabels();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieDataset3);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.5f + "'", float12 == 0.5f);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        java.awt.Paint paint10 = piePlot3D0.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke11 = piePlot3D0.getLabelLinkStroke();
        java.awt.Paint paint12 = piePlot3D0.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D13.setLabelPadding(rectangleInsets14);
        java.awt.Paint paint16 = piePlot3D13.getLabelLinkPaint();
        boolean boolean17 = piePlot3D13.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3D13.getInsets();
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D13.setShadowPaint(paint19);
        piePlot3D0.setLabelPaint(paint19);
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D22.setLabelPadding(rectangleInsets23);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        piePlot3D22.handleClick((int) (short) 100, 0, plotRenderingInfo27);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator29 = piePlot3D22.getURLGenerator();
        java.awt.Stroke stroke31 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D22.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke31);
        piePlot3D0.setOutlineStroke(stroke31);
        org.jfree.chart.plot.PiePlot3D piePlot3D34 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D34.setLabelPadding(rectangleInsets35);
        java.awt.Paint paint37 = piePlot3D34.getLabelLinkPaint();
        boolean boolean38 = piePlot3D34.getLabelLinksVisible();
        double double39 = piePlot3D34.getLabelLinkMargin();
        piePlot3D34.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup42 = piePlot3D34.getDatasetGroup();
        piePlot3D34.setBackgroundImageAlignment(1);
        java.awt.Paint paint45 = piePlot3D34.getLabelLinkPaint();
        piePlot3D0.setLabelShadowPaint(paint45);
        double double47 = piePlot3D0.getDepthFactor();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNull(pieURLGenerator29);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(rectangleInsets35);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.025d + "'", double39 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup42);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.12d + "'", double47 == 0.12d);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot3D0.getInsets();
        java.awt.Paint paint6 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D0.setShadowPaint(paint6);
        piePlot3D0.setIgnoreZeroValues(true);
        java.awt.Shape shape10 = piePlot3D0.getLegendItemShape();
        java.lang.Class<?> wildcardClass11 = shape10.getClass();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D0.setNoDataMessagePaint(paint8);
        java.awt.Paint paint10 = piePlot3D0.getLabelOutlinePaint();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot3D0.drawBackgroundImage(graphics2D11, rectangle2D12);
        java.awt.Paint paint15 = piePlot3D0.getSectionPaint((java.lang.Comparable) 0.0d);
        java.awt.Paint paint17 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) (short) 1);
        double double18 = piePlot3D0.getLabelGap();
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D19.setLabelPadding(rectangleInsets20);
        java.awt.Paint paint22 = piePlot3D19.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator23 = null;
        piePlot3D19.setLegendLabelToolTipGenerator(pieSectionLabelGenerator23);
        piePlot3D19.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot27 = piePlot3D19.getRootPlot();
        java.awt.Stroke stroke28 = piePlot3D19.getOutlineStroke();
        double double29 = piePlot3D19.getMaximumLabelWidth();
        int int30 = piePlot3D19.getPieIndex();
        java.awt.Paint paint31 = piePlot3D19.getNoDataMessagePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D32 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D32.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke36 = piePlot3D32.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator37 = piePlot3D32.getLegendLabelGenerator();
        piePlot3D19.setLabelGenerator(pieSectionLabelGenerator37);
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator37);
        java.lang.String str40 = piePlot3D0.getPlotType();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.025d + "'", double18 == 0.025d);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(plot27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.14d + "'", double29 == 0.14d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNull(stroke36);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Pie 3D Plot" + "'", str40, "Pie 3D Plot");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = piePlot3D0.getSimpleLabelOffset();
        piePlot3D0.setIgnoreZeroValues(false);
        piePlot3D0.setShadowXOffset((double) (-1L));
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets7);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        float float3 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot3D0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint7 = piePlot3D0.getShadowPaint();
        piePlot3D0.setIgnoreNullValues(true);
        boolean boolean10 = piePlot3D0.isCircular();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.plot.PiePlot3D piePlot3D3 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D3.setLabelPadding(rectangleInsets4);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        piePlot3D3.handleClick((int) (short) 100, 0, plotRenderingInfo8);
        boolean boolean10 = piePlot3D3.getSectionOutlinesVisible();
        java.awt.Paint paint11 = piePlot3D3.getBaseSectionPaint();
        java.awt.Paint paint12 = piePlot3D3.getLabelOutlinePaint();
        piePlot3D0.setBaseSectionOutlinePaint(paint12);
        double double14 = piePlot3D0.getShadowYOffset();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = piePlot3D0.getLabelGenerator();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator16 = piePlot3D0.getLegendLabelGenerator();
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator15);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator16);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot3D0.getInsets();
        java.awt.Paint paint6 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D0.setShadowPaint(paint6);
        piePlot3D0.setIgnoreZeroValues(true);
        java.awt.Stroke stroke10 = piePlot3D0.getLabelLinkStroke();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = piePlot3D0.getDrawingSupplier();
        java.awt.Image image12 = null;
        piePlot3D0.setBackgroundImage(image12);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(drawingSupplier11);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean1 = piePlot3D0.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator2);
        org.jfree.chart.plot.PiePlot3D piePlot3D4 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D4.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke8 = piePlot3D4.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator9 = piePlot3D4.getLegendLabelGenerator();
        piePlot3D0.setLabelGenerator(pieSectionLabelGenerator9);
        java.awt.Stroke stroke11 = piePlot3D0.getOutlineStroke();
        piePlot3D0.setPieIndex((int) (short) 100);
        boolean boolean14 = piePlot3D0.isOutlineVisible();
        piePlot3D0.setSectionOutlinesVisible(false);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        piePlot3D0.markerChanged(markerChangeEvent17);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean1 = piePlot3D0.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator2);
        org.jfree.chart.plot.PiePlot3D piePlot3D4 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D4.setSectionOutlinesVisible(true);
        piePlot3D4.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        piePlot3D4.drawBackgroundImage(graphics2D9, rectangle2D10);
        java.awt.Paint paint12 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D4.setNoDataMessagePaint(paint12);
        java.awt.Stroke stroke14 = piePlot3D4.getLabelOutlineStroke();
        piePlot3D0.setLabelOutlineStroke(stroke14);
        piePlot3D0.setPieIndex(15);
        java.awt.Stroke stroke18 = piePlot3D0.getLabelOutlineStroke();
        java.awt.Paint paint19 = piePlot3D0.getNoDataMessagePaint();
        java.lang.Comparable comparable20 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D21.setLabelPadding(rectangleInsets22);
        java.awt.Paint paint24 = piePlot3D21.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = null;
        piePlot3D21.setLegendLabelToolTipGenerator(pieSectionLabelGenerator25);
        piePlot3D21.setLabelLinkMargin(0.0d);
        piePlot3D21.setPieIndex((int) ' ');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor31 = piePlot3D21.getLabelDistributor();
        java.awt.Paint paint32 = piePlot3D21.getLabelShadowPaint();
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setSectionOutlinePaint(comparable20, paint32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor31);
        org.junit.Assert.assertNotNull(paint32);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D5.setLabelPadding(rectangleInsets6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        piePlot3D5.handleClick((int) (short) 100, 0, plotRenderingInfo10);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = piePlot3D5.getURLGenerator();
        java.awt.Paint paint13 = piePlot3D5.getLabelOutlinePaint();
        piePlot3D0.setLabelShadowPaint(paint13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = piePlot3D0.getDatasetGroup();
        piePlot3D0.setCircular(true);
        float float18 = piePlot3D0.getBackgroundImageAlpha();
        double double19 = piePlot3D0.getLabelGap();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(pieURLGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.025d + "'", double19 == 0.025d);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        java.awt.Stroke stroke8 = piePlot3D0.getLabelLinkStroke();
        double double9 = piePlot3D0.getMaximumLabelWidth();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14d + "'", double9 == 0.14d);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.data.general.PieDataset pieDataset3 = piePlot3D0.getDataset();
        boolean boolean4 = piePlot3D0.isCircular();
        java.lang.String str5 = piePlot3D0.getNoDataMessage();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieDataset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D9.setLabelPadding(rectangleInsets10);
        java.awt.Paint paint12 = piePlot3D9.getLabelLinkPaint();
        java.awt.Paint paint13 = piePlot3D9.getShadowPaint();
        piePlot3D0.setBaseSectionOutlinePaint(paint13);
        int int15 = piePlot3D0.getPieIndex();
        piePlot3D0.setNoDataMessage("");
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        piePlot3D0.setOutlineVisible(true);
        piePlot3D0.setShadowXOffset((double) (byte) 0);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator12 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator12);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setDarkerSides(false);
        boolean boolean3 = piePlot3D0.isOutlineVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot3D0.handleClick((int) ' ', (int) (byte) 1, plotRenderingInfo6);
        java.awt.Paint paint8 = piePlot3D0.getLabelPaint();
        java.awt.Paint paint10 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) 0L);
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D11.setLabelPadding(rectangleInsets12);
        java.awt.Paint paint14 = piePlot3D11.getLabelLinkPaint();
        java.awt.Paint paint15 = piePlot3D11.getShadowPaint();
        piePlot3D11.setShadowXOffset((double) 15);
        java.lang.String str18 = piePlot3D11.getPlotType();
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D11.setShadowPaint(paint19);
        piePlot3D0.setLabelOutlinePaint(paint19);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Pie 3D Plot" + "'", str18, "Pie 3D Plot");
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        boolean boolean7 = piePlot3D0.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D8.setLabelPadding(rectangleInsets9);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        piePlot3D8.handleClick((int) (short) 100, 0, plotRenderingInfo13);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator15 = piePlot3D8.getURLGenerator();
        java.awt.Stroke stroke17 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D8.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke17);
        piePlot3D0.setLabelOutlineStroke(stroke17);
        java.awt.Stroke stroke20 = piePlot3D0.getOutlineStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        piePlot3D0.markerChanged(markerChangeEvent21);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNull(pieURLGenerator15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke20);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        float float3 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot3D0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Font font7 = piePlot3D0.getLabelFont();
        piePlot3D0.setShadowYOffset((double) 10.0f);
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setLabelPadding(rectangleInsets11);
        float float13 = piePlot3D10.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        piePlot3D10.drawBackgroundImage(graphics2D14, rectangle2D15);
        float float17 = piePlot3D10.getBackgroundImageAlpha();
        org.jfree.chart.util.Rotation rotation18 = piePlot3D10.getDirection();
        piePlot3D0.setDirection(rotation18);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor20 = piePlot3D0.getLabelDistributor();
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        java.awt.geom.Point2D point2D23 = null;
        org.jfree.chart.plot.PlotState plotState24 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.draw(graphics2D21, rectangle2D22, point2D23, plotState24, plotRenderingInfo25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertNotNull(rotation18);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor20);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        piePlot3D0.setPieIndex((int) ' ');
        piePlot3D0.setStartAngle((double) ' ');
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.drawOutline(graphics2D12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D5.setLabelPadding(rectangleInsets6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        piePlot3D5.handleClick((int) (short) 100, 0, plotRenderingInfo10);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = piePlot3D5.getURLGenerator();
        java.awt.Paint paint13 = piePlot3D5.getLabelOutlinePaint();
        piePlot3D0.setLabelShadowPaint(paint13);
        java.awt.Stroke stroke15 = piePlot3D0.getOutlineStroke();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        piePlot3D0.notifyListeners(plotChangeEvent16);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(pieURLGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.data.general.PieDataset pieDataset3 = piePlot3D0.getDataset();
        java.awt.Paint paint5 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) (short) 100);
        piePlot3D0.setLabelLinksVisible(true);
        float float8 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Paint paint9 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D0.setBaseSectionOutlinePaint(paint9);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieDataset3);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.awt.Stroke stroke9 = piePlot3D0.getOutlineStroke();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator10 = piePlot3D0.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.Plot plot11 = piePlot3D0.getParent();
        double double12 = piePlot3D0.getInteriorGap();
        java.awt.Stroke stroke14 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) (-1L));
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(pieSectionLabelGenerator10);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.08d + "'", double12 == 0.08d);
        org.junit.Assert.assertNull(stroke14);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        piePlot3D0.zoom((double) '#');
        org.jfree.chart.plot.Plot plot10 = piePlot3D0.getRootPlot();
        piePlot3D0.setNoDataMessage("Pie 3D Plot");
        org.junit.Assert.assertNotNull(plot10);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setDarkerSides(false);
        boolean boolean3 = piePlot3D0.isOutlineVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot3D0.handleClick((int) ' ', (int) (byte) 1, plotRenderingInfo6);
        java.awt.Paint paint8 = piePlot3D0.getOutlinePaint();
        java.awt.Shape shape9 = piePlot3D0.getLegendItemShape();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean1 = piePlot3D0.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator2);
        org.jfree.chart.plot.PiePlot3D piePlot3D4 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D4.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke8 = piePlot3D4.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator9 = piePlot3D4.getLegendLabelGenerator();
        piePlot3D0.setLabelGenerator(pieSectionLabelGenerator9);
        java.awt.Stroke stroke11 = piePlot3D0.getOutlineStroke();
        piePlot3D0.setPieIndex((int) (short) 100);
        double double14 = piePlot3D0.getMinimumArcAngleToDraw();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.data.general.PieDataset pieDataset3 = piePlot3D0.getDataset();
        java.awt.Paint paint5 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) (short) 100);
        piePlot3D0.setLabelLinksVisible(true);
        java.awt.Font font8 = piePlot3D0.getLabelFont();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieDataset3);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(font8);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        piePlot3D0.setShadowXOffset(1.0d);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        piePlot3D0.handleClick((int) (byte) 1, 15, plotRenderingInfo12);
        java.awt.Paint paint15 = null;
        piePlot3D0.setSectionOutlinePaint((java.lang.Comparable) (byte) 1, paint15);
        piePlot3D0.setLabelGap((double) 10.0f);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D0.setNoDataMessagePaint(paint8);
        java.awt.Paint paint10 = piePlot3D0.getLabelOutlinePaint();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot3D0.drawBackgroundImage(graphics2D11, rectangle2D12);
        java.awt.Paint paint15 = piePlot3D0.getSectionPaint((java.lang.Comparable) 0.0d);
        java.awt.Paint paint17 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) (short) 1);
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D18.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot3D18.getLabelPadding();
        piePlot3D18.setShadowXOffset(10.0d);
        piePlot3D18.setCircular(false);
        piePlot3D18.setLabelGap((double) (short) 1);
        java.awt.Paint paint28 = piePlot3D18.getBaseSectionOutlinePaint();
        piePlot3D0.setLabelPaint(paint28);
        float float30 = piePlot3D0.getBackgroundImageAlpha();
        piePlot3D0.setInteriorGap(0.14d);
        piePlot3D0.setStartAngle((double) 100);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.5f + "'", float30 == 0.5f);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D5.setLabelPadding(rectangleInsets6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        piePlot3D5.handleClick((int) (short) 100, 0, plotRenderingInfo10);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = piePlot3D5.getURLGenerator();
        java.awt.Paint paint13 = piePlot3D5.getLabelOutlinePaint();
        piePlot3D0.setLabelShadowPaint(paint13);
        java.lang.Object obj15 = piePlot3D0.clone();
        boolean boolean16 = piePlot3D0.getSectionOutlinesVisible();
        boolean boolean17 = piePlot3D0.getLabelLinksVisible();
        piePlot3D0.setCircular(true, true);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(pieURLGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot3D0.addChangeListener(plotChangeListener4);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D0.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D7.setLabelPadding(rectangleInsets8);
        java.awt.Paint paint10 = piePlot3D7.getLabelLinkPaint();
        boolean boolean11 = piePlot3D7.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        piePlot3D7.notifyListeners(plotChangeEvent12);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot3D7.getSimpleLabelOffset();
        piePlot3D0.setLabelPadding(rectangleInsets14);
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D16.setLabelPadding(rectangleInsets17);
        java.awt.Paint paint19 = piePlot3D16.getLabelLinkPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D21.setLabelPadding(rectangleInsets22);
        java.awt.Paint paint24 = piePlot3D21.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = null;
        piePlot3D21.setLegendLabelToolTipGenerator(pieSectionLabelGenerator25);
        piePlot3D21.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot29 = piePlot3D21.getRootPlot();
        java.awt.Stroke stroke30 = piePlot3D21.getOutlineStroke();
        piePlot3D16.setSectionOutlineStroke((java.lang.Comparable) (-1.0d), stroke30);
        boolean boolean32 = piePlot3D16.getSectionOutlinesVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = piePlot3D16.getLabelPadding();
        piePlot3D0.setInsets(rectangleInsets33, true);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(plot29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(rectangleInsets33);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.awt.Stroke stroke9 = piePlot3D0.getOutlineStroke();
        double double10 = piePlot3D0.getMaximumLabelWidth();
        int int11 = piePlot3D0.getPieIndex();
        double double12 = piePlot3D0.getStartAngle();
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D13.setLabelPadding(rectangleInsets14);
        java.awt.Paint paint16 = piePlot3D13.getLabelLinkPaint();
        java.awt.Paint paint17 = piePlot3D13.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D18.setLabelPadding(rectangleInsets19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        piePlot3D18.handleClick((int) (short) 100, 0, plotRenderingInfo23);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator25 = piePlot3D18.getURLGenerator();
        java.awt.Paint paint26 = piePlot3D18.getLabelOutlinePaint();
        piePlot3D13.setLabelShadowPaint(paint26);
        org.jfree.data.general.DatasetGroup datasetGroup28 = piePlot3D13.getDatasetGroup();
        piePlot3D13.setCircular(true);
        java.awt.Stroke stroke31 = piePlot3D13.getLabelOutlineStroke();
        piePlot3D0.setOutlineStroke(stroke31);
        piePlot3D0.setMaximumLabelWidth((double) 0.0f);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 90.0d + "'", double12 == 90.0d);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNull(pieURLGenerator25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNull(datasetGroup28);
        org.junit.Assert.assertNotNull(stroke31);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.awt.Stroke stroke9 = piePlot3D0.getOutlineStroke();
        piePlot3D0.setSectionOutlinesVisible(false);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D14.setLabelPadding(rectangleInsets15);
        java.awt.Paint paint17 = piePlot3D14.getLabelLinkPaint();
        boolean boolean18 = piePlot3D14.getLabelLinksVisible();
        double double19 = piePlot3D14.getLabelLinkMargin();
        piePlot3D14.setBackgroundImageAlignment((int) 'a');
        piePlot3D14.setOutlineVisible(true);
        piePlot3D14.setShadowXOffset((double) (byte) 0);
        java.awt.Paint paint26 = piePlot3D14.getBackgroundPaint();
        piePlot3D14.setForegroundAlpha((float) (byte) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState31 = piePlot3D0.initialise(graphics2D12, rectangle2D13, (org.jfree.chart.plot.PiePlot) piePlot3D14, (java.lang.Integer) (-1), plotRenderingInfo30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.025d + "'", double19 == 0.025d);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        float float7 = piePlot3D0.getForegroundAlpha();
        org.jfree.data.general.PieDataset pieDataset8 = piePlot3D0.getDataset();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNull(pieDataset8);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        double double7 = piePlot3D0.getDepthFactor();
        java.awt.Paint paint8 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        piePlot3D0.axisChanged(axisChangeEvent9);
        java.awt.Paint paint11 = piePlot3D0.getLabelBackgroundPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D12.setLabelPadding(rectangleInsets13);
        java.awt.Paint paint15 = piePlot3D12.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator16 = null;
        piePlot3D12.setLegendLabelToolTipGenerator(pieSectionLabelGenerator16);
        piePlot3D12.setLabelLinkMargin(0.0d);
        piePlot3D12.setPieIndex((int) ' ');
        java.awt.Paint paint22 = piePlot3D12.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D23 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D23.setLabelPadding(rectangleInsets24);
        java.awt.Paint paint26 = piePlot3D23.getLabelLinkPaint();
        java.awt.Paint paint27 = piePlot3D23.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D28 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D28.setLabelPadding(rectangleInsets29);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        piePlot3D28.handleClick((int) (short) 100, 0, plotRenderingInfo33);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator35 = piePlot3D28.getURLGenerator();
        java.awt.Paint paint36 = piePlot3D28.getLabelOutlinePaint();
        piePlot3D23.setLabelShadowPaint(paint36);
        piePlot3D12.setLabelShadowPaint(paint36);
        piePlot3D0.setLabelShadowPaint(paint36);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12d + "'", double7 == 0.12d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(rectangleInsets29);
        org.junit.Assert.assertNull(pieURLGenerator35);
        org.junit.Assert.assertNotNull(paint36);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean1 = piePlot3D0.getSimpleLabels();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier2 = piePlot3D0.getDrawingSupplier();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent3 = null;
        piePlot3D0.markerChanged(markerChangeEvent3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(drawingSupplier2);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        float float3 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot3D0.drawBackgroundImage(graphics2D4, rectangle2D5);
        float float7 = piePlot3D0.getBackgroundImageAlpha();
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D8.setLabelPadding(rectangleInsets9);
        java.awt.Paint paint11 = piePlot3D8.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        piePlot3D8.addChangeListener(plotChangeListener12);
        java.awt.Paint paint14 = piePlot3D8.getShadowPaint();
        piePlot3D0.setBaseSectionOutlinePaint(paint14);
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        piePlot3D0.removeChangeListener(plotChangeListener16);
        piePlot3D0.setForegroundAlpha((float) 1);
        piePlot3D0.setShadowXOffset((double) 0L);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        java.awt.Paint paint10 = piePlot3D0.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke11 = piePlot3D0.getLabelLinkStroke();
        double double12 = piePlot3D0.getMaximumLabelWidth();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = piePlot3D0.getLabelPadding();
        org.jfree.data.general.DatasetGroup datasetGroup14 = piePlot3D0.getDatasetGroup();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNull(datasetGroup14);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot3D0.getDatasetGroup();
        piePlot3D0.setBackgroundImageAlignment(1);
        java.awt.Paint paint11 = piePlot3D0.getLabelLinkPaint();
        boolean boolean12 = piePlot3D0.getSectionOutlinesVisible();
        java.awt.Stroke stroke13 = piePlot3D0.getLabelOutlineStroke();
        int int14 = piePlot3D0.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setDarkerSides(false);
        boolean boolean3 = piePlot3D0.isOutlineVisible();
        boolean boolean4 = piePlot3D0.getIgnoreNullValues();
        java.awt.Font font5 = piePlot3D0.getLabelFont();
        java.lang.String str6 = piePlot3D0.getPlotType();
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setInteriorGap(4.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (4.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pie 3D Plot" + "'", str6, "Pie 3D Plot");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D7.setLabelPadding(rectangleInsets8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        piePlot3D7.handleClick((int) (short) 100, 0, plotRenderingInfo12);
        boolean boolean14 = piePlot3D7.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D15 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D15.setLabelPadding(rectangleInsets16);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        piePlot3D15.handleClick((int) (short) 100, 0, plotRenderingInfo20);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = piePlot3D15.getURLGenerator();
        java.awt.Stroke stroke24 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D15.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke24);
        piePlot3D7.setLabelOutlineStroke(stroke24);
        piePlot3D0.setLabelLinkStroke(stroke24);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor28 = piePlot3D0.getLabelDistributor();
        org.jfree.chart.plot.PiePlot3D piePlot3D29 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D29.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke33 = piePlot3D29.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator34 = piePlot3D29.getLegendLabelGenerator();
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator34);
        java.awt.Image image36 = null;
        piePlot3D0.setBackgroundImage(image36);
        org.jfree.chart.plot.PiePlot3D piePlot3D38 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D38.setLabelPadding(rectangleInsets39);
        java.awt.Paint paint41 = piePlot3D38.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator42 = null;
        piePlot3D38.setLegendLabelToolTipGenerator(pieSectionLabelGenerator42);
        piePlot3D38.setLabelLinkMargin(0.0d);
        piePlot3D38.setPieIndex((int) ' ');
        java.awt.Paint paint48 = piePlot3D38.getBaseSectionOutlinePaint();
        piePlot3D0.setLabelBackgroundPaint(paint48);
        java.awt.Image image50 = piePlot3D0.getBackgroundImage();
        boolean boolean51 = piePlot3D0.getDarkerSides();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNull(pieURLGenerator22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor28);
        org.junit.Assert.assertNull(stroke33);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator34);
        org.junit.Assert.assertNotNull(rectangleInsets39);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNull(image50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        java.awt.Shape shape5 = piePlot3D0.getLegendItemShape();
        piePlot3D0.setSimpleLabels(true);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        double double7 = piePlot3D0.getDepthFactor();
        java.awt.Paint paint8 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        piePlot3D0.axisChanged(axisChangeEvent9);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.drawOutline(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12d + "'", double7 == 0.12d);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setDarkerSides(false);
        boolean boolean3 = piePlot3D0.isOutlineVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        piePlot3D0.handleClick((int) ' ', (int) (byte) 1, plotRenderingInfo6);
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D8.setLabelPadding(rectangleInsets9);
        float float11 = piePlot3D8.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        piePlot3D8.drawBackgroundImage(graphics2D12, rectangle2D13);
        float float15 = piePlot3D8.getBackgroundImageAlpha();
        org.jfree.chart.util.Rotation rotation16 = piePlot3D8.getDirection();
        java.awt.Paint paint17 = piePlot3D8.getBackgroundPaint();
        piePlot3D0.setOutlinePaint(paint17);
        piePlot3D0.setForegroundAlpha((float) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertNotNull(rotation16);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D7.setLabelPadding(rectangleInsets8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        piePlot3D7.handleClick((int) (short) 100, 0, plotRenderingInfo12);
        boolean boolean14 = piePlot3D7.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D15 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D15.setLabelPadding(rectangleInsets16);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        piePlot3D15.handleClick((int) (short) 100, 0, plotRenderingInfo20);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = piePlot3D15.getURLGenerator();
        java.awt.Stroke stroke24 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D15.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke24);
        piePlot3D7.setLabelOutlineStroke(stroke24);
        piePlot3D0.setLabelLinkStroke(stroke24);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        piePlot3D0.handleClick(1, 1, plotRenderingInfo30);
        double double32 = piePlot3D0.getMaximumLabelWidth();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNull(pieURLGenerator22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.14d + "'", double32 == 0.14d);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D0.setNoDataMessagePaint(paint8);
        java.awt.Paint paint10 = piePlot3D0.getLabelOutlinePaint();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot3D0.drawBackgroundImage(graphics2D11, rectangle2D12);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor14 = piePlot3D0.getLabelDistributor();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator15 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator15);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor14);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot3D0.addChangeListener(plotChangeListener4);
        piePlot3D0.setBackgroundImageAlignment((int) (short) 10);
        piePlot3D0.setCircular(false, true);
        piePlot3D0.setOutlineVisible(true);
        piePlot3D0.setMaximumLabelWidth((double) (byte) 100);
        boolean boolean15 = piePlot3D0.getIgnoreNullValues();
        double double16 = piePlot3D0.getShadowYOffset();
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean18 = piePlot3D17.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator19 = null;
        piePlot3D17.setToolTipGenerator(pieToolTipGenerator19);
        boolean boolean21 = piePlot3D17.isOutlineVisible();
        piePlot3D17.setShadowXOffset((double) (-1));
        float float24 = piePlot3D17.getBackgroundImageAlpha();
        piePlot3D17.setLabelLinksVisible(true);
        org.jfree.data.general.PieDataset pieDataset27 = piePlot3D17.getDataset();
        org.jfree.chart.plot.PiePlot3D piePlot3D29 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D29.setSectionOutlinesVisible(true);
        piePlot3D29.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        piePlot3D29.drawBackgroundImage(graphics2D34, rectangle2D35);
        piePlot3D29.zoom((double) '#');
        java.awt.Font font39 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D29.setLabelFont(font39);
        org.jfree.chart.plot.PiePlot3D piePlot3D42 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D42.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = piePlot3D42.getLabelPadding();
        piePlot3D42.setShadowXOffset(10.0d);
        piePlot3D42.setCircular(false);
        piePlot3D42.setLabelGap((double) (short) 1);
        java.awt.Paint paint52 = piePlot3D42.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke53 = piePlot3D42.getLabelLinkStroke();
        java.awt.Paint paint54 = piePlot3D42.getBaseSectionPaint();
        piePlot3D29.setSectionOutlinePaint((java.lang.Comparable) false, paint54);
        piePlot3D17.setSectionPaint((java.lang.Comparable) (short) 10, paint54);
        piePlot3D0.setParent((org.jfree.chart.plot.Plot) piePlot3D17);
        float float58 = piePlot3D17.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.5f + "'", float24 == 0.5f);
        org.junit.Assert.assertNull(pieDataset27);
        org.junit.Assert.assertNotNull(font39);
        org.junit.Assert.assertNotNull(rectangleInsets45);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + 1.0f + "'", float58 == 1.0f);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        piePlot3D0.setShadowXOffset((double) 15);
        java.lang.String str7 = piePlot3D0.getPlotType();
        boolean boolean8 = piePlot3D0.getDarkerSides();
        piePlot3D0.setCircular(false, false);
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D12.setLabelPadding(rectangleInsets13);
        java.awt.Paint paint15 = piePlot3D12.getLabelLinkPaint();
        boolean boolean16 = piePlot3D12.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = piePlot3D12.getInsets();
        java.awt.Image image18 = null;
        piePlot3D12.setBackgroundImage(image18);
        float float20 = piePlot3D12.getBackgroundAlpha();
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D21.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = piePlot3D21.getLabelPadding();
        java.awt.Paint paint25 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D21.setNoDataMessagePaint(paint25);
        piePlot3D12.setLabelLinkPaint(paint25);
        piePlot3D0.setOutlinePaint(paint25);
        java.awt.Paint paint30 = piePlot3D0.getSectionPaint((java.lang.Comparable) '4');
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Pie 3D Plot" + "'", str7, "Pie 3D Plot");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNull(paint30);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        org.jfree.chart.plot.Plot plot6 = piePlot3D0.getParent();
        java.awt.Paint paint7 = piePlot3D0.getShadowPaint();
        piePlot3D0.setDepthFactor(0.0d);
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setLabelPadding(rectangleInsets11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        piePlot3D10.handleClick((int) (short) 100, 0, plotRenderingInfo15);
        boolean boolean17 = piePlot3D10.getSectionOutlinesVisible();
        java.awt.Paint paint18 = piePlot3D10.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D19.setSectionOutlinesVisible(true);
        piePlot3D19.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        piePlot3D19.drawBackgroundImage(graphics2D24, rectangle2D25);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = piePlot3D19.getLabelPadding();
        piePlot3D10.setInsets(rectangleInsets27);
        int int29 = piePlot3D10.getPieIndex();
        org.jfree.chart.plot.PiePlot3D piePlot3D30 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D30.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = piePlot3D30.getLabelPadding();
        piePlot3D30.setShadowXOffset(10.0d);
        piePlot3D30.setCircular(false);
        piePlot3D30.setLabelGap((double) (short) 1);
        java.awt.Paint paint40 = piePlot3D30.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke41 = piePlot3D30.getLabelLinkStroke();
        java.awt.Paint paint42 = piePlot3D30.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D43 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D43.setLabelPadding(rectangleInsets44);
        java.awt.Paint paint46 = piePlot3D43.getLabelLinkPaint();
        boolean boolean47 = piePlot3D43.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets48 = piePlot3D43.getInsets();
        java.awt.Paint paint49 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D43.setShadowPaint(paint49);
        piePlot3D30.setLabelPaint(paint49);
        float float52 = piePlot3D30.getBackgroundAlpha();
        java.awt.Shape shape53 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot3D30.setLegendItemShape(shape53);
        piePlot3D10.setLegendItemShape(shape53);
        piePlot3D0.setLegendItemShape(shape53);
        java.awt.Paint paint58 = piePlot3D0.getSectionPaint((java.lang.Comparable) 10.0d);
        java.awt.Paint paint59 = piePlot3D0.getBaseSectionPaint();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(rectangleInsets44);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(rectangleInsets48);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 1.0f + "'", float52 == 1.0f);
        org.junit.Assert.assertNotNull(shape53);
        org.junit.Assert.assertNull(paint58);
        org.junit.Assert.assertNotNull(paint59);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D0.setNoDataMessagePaint(paint8);
        java.awt.Paint paint10 = piePlot3D0.getLabelOutlinePaint();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot3D0.drawBackgroundImage(graphics2D11, rectangle2D12);
        java.awt.Paint paint15 = piePlot3D0.getSectionPaint((java.lang.Comparable) 0.0d);
        piePlot3D0.setLabelLinkMargin((double) 100L);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(paint15);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.data.general.PieDataset pieDataset3 = piePlot3D0.getDataset();
        java.lang.Object obj4 = null;
        boolean boolean5 = piePlot3D0.equals(obj4);
        boolean boolean6 = piePlot3D0.isOutlineVisible();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieDataset3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        java.awt.Font font4 = piePlot3D0.getNoDataMessageFont();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) 0, stroke6);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator8 = piePlot3D0.getToolTipGenerator();
        double double10 = piePlot3D0.getExplodePercent((java.lang.Comparable) 10L);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(pieToolTipGenerator8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        piePlot3D0.setOutlineVisible(true);
        piePlot3D0.setShadowXOffset((double) (byte) 0);
        java.awt.Paint paint12 = piePlot3D0.getBackgroundPaint();
        piePlot3D0.setForegroundAlpha((float) (byte) 0);
        java.lang.Class<?> wildcardClass15 = piePlot3D0.getClass();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        boolean boolean5 = piePlot3D0.isCircular();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D0.getLegendLabelGenerator();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.drawOutline(graphics2D7, rectangle2D8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        java.awt.Shape shape10 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setLegendItemShape(shape10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets3);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot3D0.getURLGenerator();
        java.awt.Stroke stroke9 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke9);
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D11.setLabelPadding(rectangleInsets12);
        java.awt.Paint paint14 = piePlot3D11.getLabelLinkPaint();
        boolean boolean15 = piePlot3D11.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        piePlot3D11.notifyListeners(plotChangeEvent16);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3D11.getSimpleLabelOffset();
        piePlot3D0.setSimpleLabelOffset(rectangleInsets18);
        java.awt.Paint paint21 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) (-1L));
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNull(paint21);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        piePlot3D0.setOutlineVisible(true);
        double double10 = piePlot3D0.getStartAngle();
        java.awt.Paint paint11 = piePlot3D0.getShadowPaint();
        piePlot3D0.setOutlineVisible(false);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 90.0d + "'", double10 == 90.0d);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D6.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = piePlot3D6.getLabelPadding();
        java.awt.Font font10 = piePlot3D6.getNoDataMessageFont();
        piePlot3D0.setLabelFont(font10);
        java.awt.Paint paint12 = piePlot3D0.getOutlinePaint();
        piePlot3D0.setIgnoreNullValues(false);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D0.getLegendLabelToolTipGenerator();
        java.lang.Object obj7 = piePlot3D0.clone();
        double double8 = piePlot3D0.getShadowYOffset();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot3D0.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot3D0.getSimpleLabelOffset();
        piePlot3D0.setExplodePercent((java.lang.Comparable) 90.0d, 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D0.setNoDataMessagePaint(paint8);
        java.awt.Paint paint10 = piePlot3D0.getLabelOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset11 = piePlot3D0.getDataset();
        piePlot3D0.setShadowYOffset(0.0d);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        piePlot3D0.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator17 = null;
        piePlot3D0.setLegendLabelURLGenerator(pieURLGenerator17);
        boolean boolean19 = piePlot3D0.isOutlineVisible();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(pieDataset11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot3D0.getDatasetGroup();
        piePlot3D0.setBackgroundImageAlignment(1);
        java.awt.Paint paint11 = piePlot3D0.getLabelLinkPaint();
        boolean boolean12 = piePlot3D0.getSectionOutlinesVisible();
        java.awt.Stroke stroke13 = piePlot3D0.getLabelOutlineStroke();
        piePlot3D0.setMinimumArcAngleToDraw((double) (byte) 1);
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D16.setLabelPadding(rectangleInsets17);
        float float19 = piePlot3D16.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        piePlot3D16.drawBackgroundImage(graphics2D20, rectangle2D21);
        float float23 = piePlot3D16.getBackgroundImageAlpha();
        org.jfree.chart.util.Rotation rotation24 = piePlot3D16.getDirection();
        double double26 = piePlot3D16.getExplodePercent((java.lang.Comparable) 100.0f);
        piePlot3D16.setIgnoreNullValues(true);
        java.awt.Paint paint29 = piePlot3D16.getLabelPaint();
        piePlot3D0.setOutlinePaint(paint29);
        boolean boolean31 = piePlot3D0.getSimpleLabels();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.5f + "'", float19 == 0.5f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.5f + "'", float23 == 0.5f);
        org.junit.Assert.assertNotNull(rotation24);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setDarkerSides(false);
        boolean boolean3 = piePlot3D0.isOutlineVisible();
        boolean boolean4 = piePlot3D0.getIgnoreNullValues();
        java.awt.Stroke stroke6 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) 0.025d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(stroke6);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot3D0.getInsets();
        java.awt.Paint paint6 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D0.setShadowPaint(paint6);
        boolean boolean8 = piePlot3D0.getSimpleLabels();
        double double9 = piePlot3D0.getDepthFactor();
        java.awt.Paint paint10 = piePlot3D0.getBaseSectionOutlinePaint();
        java.awt.Paint paint11 = null;
        piePlot3D0.setLabelOutlinePaint(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.12d + "'", double9 == 0.12d);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        double double7 = piePlot3D0.getDepthFactor();
        java.awt.Paint paint8 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        piePlot3D0.axisChanged(axisChangeEvent9);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator11 = null;
        piePlot3D0.setLabelGenerator(pieSectionLabelGenerator11);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12d + "'", double7 == 0.12d);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot3D0.getDatasetGroup();
        java.lang.Object obj9 = piePlot3D0.clone();
        float float10 = piePlot3D0.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        float float3 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot3D0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Stroke stroke8 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) 0.5f);
        org.jfree.chart.plot.Plot plot9 = piePlot3D0.getParent();
        piePlot3D0.setMinimumArcAngleToDraw((double) (short) 1);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertNull(plot9);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        piePlot3D0.axisChanged(axisChangeEvent8);
        org.jfree.data.general.PieDataset pieDataset10 = piePlot3D0.getDataset();
        piePlot3D0.setDarkerSides(true);
        org.junit.Assert.assertNull(pieDataset10);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot3D0.getInsets();
        java.awt.Image image6 = null;
        piePlot3D0.setBackgroundImage(image6);
        double double8 = piePlot3D0.getShadowXOffset();
        org.jfree.data.general.DatasetGroup datasetGroup9 = piePlot3D0.getDatasetGroup();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D12.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot3D12.getLabelPadding();
        piePlot3D12.setShadowXOffset(10.0d);
        piePlot3D12.setLabelLinksVisible(false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState22 = piePlot3D0.initialise(graphics2D10, rectangle2D11, (org.jfree.chart.plot.PiePlot) piePlot3D12, (java.lang.Integer) 15, plotRenderingInfo21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertNull(datasetGroup9);
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D7.setLabelPadding(rectangleInsets8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        piePlot3D7.handleClick((int) (short) 100, 0, plotRenderingInfo12);
        boolean boolean14 = piePlot3D7.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D15 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D15.setLabelPadding(rectangleInsets16);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        piePlot3D15.handleClick((int) (short) 100, 0, plotRenderingInfo20);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = piePlot3D15.getURLGenerator();
        java.awt.Stroke stroke24 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D15.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke24);
        piePlot3D7.setLabelOutlineStroke(stroke24);
        piePlot3D0.setLabelLinkStroke(stroke24);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor28 = piePlot3D0.getLabelDistributor();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNull(pieURLGenerator22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor28);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle(4.0d);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        piePlot3D0.drawBackgroundImage(graphics2D12, rectangle2D13);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot3D0.getInsets();
        java.awt.Paint paint6 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D0.setShadowPaint(paint6);
        boolean boolean8 = piePlot3D0.getSimpleLabels();
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D9.setLabelPadding(rectangleInsets10);
        java.awt.Paint paint12 = piePlot3D9.getLabelLinkPaint();
        boolean boolean13 = piePlot3D9.getLabelLinksVisible();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        piePlot3D9.setDataset(pieDataset14);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator16 = piePlot3D9.getLegendLabelGenerator();
        piePlot3D0.setLegendLabelGenerator(pieSectionLabelGenerator16);
        piePlot3D0.setNoDataMessage("");
        float float20 = piePlot3D0.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator16);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.5f + "'", float20 == 0.5f);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D0.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = piePlot3D0.getDrawingSupplier();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator8 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator8);
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setLabelPadding(rectangleInsets11);
        java.awt.Paint paint13 = piePlot3D10.getLabelLinkPaint();
        boolean boolean14 = piePlot3D10.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot3D10.getInsets();
        java.awt.Image image16 = null;
        piePlot3D10.setBackgroundImage(image16);
        float float18 = piePlot3D10.getBackgroundAlpha();
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D19.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = piePlot3D19.getLabelPadding();
        java.awt.Paint paint23 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D19.setNoDataMessagePaint(paint23);
        piePlot3D10.setLabelLinkPaint(paint23);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = piePlot3D10.getDrawingSupplier();
        piePlot3D0.setDrawingSupplier(drawingSupplier26);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(drawingSupplier7);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(drawingSupplier26);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot3D0.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setInsets(rectangleInsets6, true);
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D9.setLabelPadding(rectangleInsets10);
        java.awt.Paint paint12 = piePlot3D9.getLabelLinkPaint();
        boolean boolean13 = piePlot3D9.getLabelLinksVisible();
        piePlot3D9.setOutlineVisible(false);
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D16.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = piePlot3D16.getLabelPadding();
        piePlot3D16.setShadowXOffset(10.0d);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        piePlot3D16.datasetChanged(datasetChangeEvent22);
        int int24 = piePlot3D16.getBackgroundImageAlignment();
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D25.setLabelPadding(rectangleInsets26);
        java.awt.Paint paint28 = piePlot3D25.getLabelLinkPaint();
        boolean boolean29 = piePlot3D25.getLabelLinksVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D30 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D30.setLabelPadding(rectangleInsets31);
        piePlot3D25.setSimpleLabelOffset(rectangleInsets31);
        piePlot3D16.setSimpleLabelOffset(rectangleInsets31);
        piePlot3D9.setLabelPadding(rectangleInsets31);
        piePlot3D0.setLabelPadding(rectangleInsets31);
        piePlot3D0.setShadowYOffset((double) (byte) 10);
        org.jfree.chart.event.PlotChangeListener plotChangeListener39 = null;
        piePlot3D0.removeChangeListener(plotChangeListener39);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(rectangleInsets31);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        java.awt.Paint paint10 = piePlot3D0.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke11 = piePlot3D0.getLabelLinkStroke();
        double double12 = piePlot3D0.getMaximumLabelWidth();
        float float13 = piePlot3D0.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D8.setLabelPadding(rectangleInsets9);
        java.awt.Paint paint11 = piePlot3D8.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator12 = null;
        piePlot3D8.setLegendLabelToolTipGenerator(pieSectionLabelGenerator12);
        java.awt.Stroke stroke14 = piePlot3D8.getLabelOutlineStroke();
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        piePlot3D8.addChangeListener(plotChangeListener15);
        piePlot3D0.setParent((org.jfree.chart.plot.Plot) piePlot3D8);
        piePlot3D0.setLabelLinkMargin((double) '#');
        piePlot3D0.setOutlineVisible(true);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent22 = null;
        piePlot3D0.axisChanged(axisChangeEvent22);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        float float3 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot3D0.drawBackgroundImage(graphics2D4, rectangle2D5);
        float float7 = piePlot3D0.getBackgroundImageAlpha();
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D8.setLabelPadding(rectangleInsets9);
        java.awt.Paint paint11 = piePlot3D8.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        piePlot3D8.addChangeListener(plotChangeListener12);
        java.awt.Paint paint14 = piePlot3D8.getShadowPaint();
        piePlot3D0.setBaseSectionOutlinePaint(paint14);
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        piePlot3D0.removeChangeListener(plotChangeListener16);
        piePlot3D0.setForegroundAlpha((float) 1);
        piePlot3D0.setDepthFactor((double) 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot3D0.getDatasetGroup();
        piePlot3D0.setBackgroundImageAlignment(1);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot3D0.getSimpleLabelOffset();
        piePlot3D0.setSectionOutlinesVisible(true);
        float float14 = piePlot3D0.getForegroundAlpha();
        piePlot3D0.setExplodePercent((java.lang.Comparable) 100, (-1.0d));
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        piePlot3D0.setShadowXOffset(1.0d);
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D10.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = piePlot3D10.getLabelPadding();
        piePlot3D10.setShadowXOffset(10.0d);
        piePlot3D10.setCircular(false);
        piePlot3D10.setLabelGap((double) (short) 1);
        java.awt.Paint paint20 = piePlot3D10.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke21 = piePlot3D10.getLabelLinkStroke();
        java.awt.Paint paint22 = piePlot3D10.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D23 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D23.setLabelPadding(rectangleInsets24);
        java.awt.Paint paint26 = piePlot3D23.getLabelLinkPaint();
        boolean boolean27 = piePlot3D23.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = piePlot3D23.getInsets();
        java.awt.Paint paint29 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D23.setShadowPaint(paint29);
        piePlot3D10.setLabelPaint(paint29);
        org.jfree.chart.plot.PiePlot3D piePlot3D32 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D32.setLabelPadding(rectangleInsets33);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        piePlot3D32.handleClick((int) (short) 100, 0, plotRenderingInfo37);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator39 = piePlot3D32.getURLGenerator();
        java.awt.Stroke stroke41 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D32.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke41);
        piePlot3D10.setOutlineStroke(stroke41);
        piePlot3D0.setLabelOutlineStroke(stroke41);
        java.awt.Stroke stroke45 = piePlot3D0.getBaseSectionOutlineStroke();
        org.jfree.chart.plot.PiePlot3D piePlot3D46 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean47 = piePlot3D46.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator48 = null;
        piePlot3D46.setToolTipGenerator(pieToolTipGenerator48);
        java.awt.Paint paint50 = piePlot3D46.getOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D52 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean53 = piePlot3D52.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator54 = null;
        piePlot3D52.setToolTipGenerator(pieToolTipGenerator54);
        java.awt.Paint paint56 = piePlot3D52.getShadowPaint();
        piePlot3D52.setCircular(false, false);
        java.awt.Paint paint60 = piePlot3D52.getLabelOutlinePaint();
        piePlot3D46.setSectionPaint((java.lang.Comparable) (-1), paint60);
        piePlot3D0.setLabelOutlinePaint(paint60);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNull(pieURLGenerator39);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNotNull(paint60);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot3D0.getURLGenerator();
        java.awt.Stroke stroke9 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke9);
        java.awt.Shape shape11 = piePlot3D0.getLegendItemShape();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D14.setLabelPadding(rectangleInsets15);
        java.awt.Paint paint17 = piePlot3D14.getLabelLinkPaint();
        boolean boolean18 = piePlot3D14.getLabelLinksVisible();
        double double19 = piePlot3D14.getLabelLinkMargin();
        piePlot3D14.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup22 = piePlot3D14.getDatasetGroup();
        piePlot3D14.setBackgroundImageAlignment(1);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = piePlot3D14.getSimpleLabelOffset();
        org.jfree.chart.plot.PiePlot3D piePlot3D26 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D26.setLabelPadding(rectangleInsets27);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        piePlot3D26.handleClick((int) (short) 100, 0, plotRenderingInfo31);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator33 = piePlot3D26.getURLGenerator();
        java.awt.Stroke stroke35 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D26.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke35);
        java.awt.Shape shape37 = piePlot3D26.getLegendItemShape();
        piePlot3D14.setLegendItemShape(shape37);
        piePlot3D14.setLabelGap((double) 'a');
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = piePlot3D14.getLabelPadding();
        piePlot3D14.setShadowYOffset((double) (byte) 10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState46 = piePlot3D0.initialise(graphics2D12, rectangle2D13, (org.jfree.chart.plot.PiePlot) piePlot3D14, (java.lang.Integer) 100, plotRenderingInfo45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.025d + "'", double19 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup22);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNull(pieURLGenerator33);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertNotNull(rectangleInsets41);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D5.setLabelPadding(rectangleInsets6);
        java.awt.Paint paint8 = piePlot3D5.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator9 = null;
        piePlot3D5.setLegendLabelToolTipGenerator(pieSectionLabelGenerator9);
        piePlot3D5.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot13 = piePlot3D5.getRootPlot();
        java.awt.Stroke stroke14 = piePlot3D5.getOutlineStroke();
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) (-1.0d), stroke14);
        piePlot3D0.setSimpleLabels(true);
        int int18 = piePlot3D0.getBackgroundImageAlignment();
        double double19 = piePlot3D0.getMinimumArcAngleToDraw();
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D20.setLabelPadding(rectangleInsets21);
        org.jfree.data.general.PieDataset pieDataset23 = piePlot3D20.getDataset();
        java.lang.String str24 = piePlot3D20.getPlotType();
        org.jfree.chart.plot.Plot plot25 = piePlot3D20.getParent();
        java.awt.Stroke stroke26 = piePlot3D20.getLabelLinkStroke();
        piePlot3D0.setOutlineStroke(stroke26);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator28 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator28);
        org.jfree.chart.plot.Plot plot30 = piePlot3D0.getRootPlot();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0E-5d + "'", double19 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNull(pieDataset23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Pie 3D Plot" + "'", str24, "Pie 3D Plot");
        org.junit.Assert.assertNull(plot25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(plot30);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean1 = piePlot3D0.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator2);
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = piePlot3D0.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset6 = piePlot3D0.getDataset();
        double double7 = piePlot3D0.getMinimumArcAngleToDraw();
        java.awt.Stroke stroke9 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) 4.0d);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        piePlot3D0.datasetChanged(datasetChangeEvent10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(pieDataset6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-5d + "'", double7 == 1.0E-5d);
        org.junit.Assert.assertNull(stroke9);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        java.awt.Font font4 = piePlot3D0.getNoDataMessageFont();
        java.awt.Paint paint5 = piePlot3D0.getShadowPaint();
        double double6 = piePlot3D0.getStartAngle();
        piePlot3D0.setLabelLinksVisible(false);
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D9.setLabelPadding(rectangleInsets10);
        java.awt.Paint paint12 = piePlot3D9.getLabelLinkPaint();
        java.awt.Paint paint13 = piePlot3D9.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D14.setLabelPadding(rectangleInsets15);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        piePlot3D14.handleClick((int) (short) 100, 0, plotRenderingInfo19);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator21 = piePlot3D14.getURLGenerator();
        java.awt.Paint paint22 = piePlot3D14.getLabelOutlinePaint();
        piePlot3D9.setLabelShadowPaint(paint22);
        org.jfree.data.general.DatasetGroup datasetGroup24 = piePlot3D9.getDatasetGroup();
        double double25 = piePlot3D9.getMinimumArcAngleToDraw();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator26 = piePlot3D9.getLabelGenerator();
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator26);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 90.0d + "'", double6 == 90.0d);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNull(pieURLGenerator21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(datasetGroup24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0E-5d + "'", double25 == 1.0E-5d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator26);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot3D0.getURLGenerator();
        java.awt.Stroke stroke9 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke9);
        java.awt.Shape shape11 = piePlot3D0.getLegendItemShape();
        piePlot3D0.setOutlineVisible(false);
        java.awt.Stroke stroke14 = piePlot3D0.getBaseSectionOutlineStroke();
        org.jfree.chart.plot.PiePlot3D piePlot3D15 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D15.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3D15.getLabelPadding();
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D15.setNoDataMessagePaint(paint19);
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D21.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = piePlot3D21.getLabelPadding();
        piePlot3D21.setShadowXOffset(10.0d);
        org.jfree.chart.plot.PiePlot3D piePlot3D27 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D27.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = piePlot3D27.getLabelPadding();
        java.awt.Font font31 = piePlot3D27.getNoDataMessageFont();
        piePlot3D21.setLabelFont(font31);
        java.awt.Paint paint33 = piePlot3D21.getLabelBackgroundPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = piePlot3D21.getInsets();
        piePlot3D15.setSimpleLabelOffset(rectangleInsets34);
        piePlot3D0.setLabelPadding(rectangleInsets34);
        org.jfree.data.general.DatasetGroup datasetGroup37 = piePlot3D0.getDatasetGroup();
        piePlot3D0.setForegroundAlpha(100.0f);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNotNull(font31);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(rectangleInsets34);
        org.junit.Assert.assertNull(datasetGroup37);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        java.awt.Paint paint10 = piePlot3D0.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke11 = piePlot3D0.getLabelLinkStroke();
        java.awt.Paint paint12 = piePlot3D0.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D13.setLabelPadding(rectangleInsets14);
        java.awt.Paint paint16 = piePlot3D13.getLabelLinkPaint();
        boolean boolean17 = piePlot3D13.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3D13.getInsets();
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D13.setShadowPaint(paint19);
        piePlot3D0.setLabelPaint(paint19);
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D22.setLabelPadding(rectangleInsets23);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        piePlot3D22.handleClick((int) (short) 100, 0, plotRenderingInfo27);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator29 = piePlot3D22.getURLGenerator();
        java.awt.Stroke stroke31 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D22.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke31);
        piePlot3D0.setOutlineStroke(stroke31);
        java.awt.Paint paint34 = null;
        piePlot3D0.setLabelBackgroundPaint(paint34);
        float float36 = piePlot3D0.getForegroundAlpha();
        boolean boolean37 = piePlot3D0.getSectionOutlinesVisible();
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) 1L);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNull(pieURLGenerator29);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 1.0f + "'", float36 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        java.awt.Paint paint10 = piePlot3D0.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke11 = piePlot3D0.getLabelLinkStroke();
        double double12 = piePlot3D0.getMaximumLabelWidth();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = piePlot3D0.getLabelPadding();
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D14.setLabelPadding(rectangleInsets15);
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean19 = piePlot3D18.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator20 = null;
        piePlot3D18.setToolTipGenerator(pieToolTipGenerator20);
        java.awt.Paint paint22 = piePlot3D18.getShadowPaint();
        piePlot3D14.setSectionPaint((java.lang.Comparable) (short) -1, paint22);
        org.jfree.chart.plot.PiePlot3D piePlot3D24 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D24.setLabelPadding(rectangleInsets25);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        piePlot3D24.handleClick((int) (short) 100, 0, plotRenderingInfo29);
        boolean boolean31 = piePlot3D24.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D32 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D32.setLabelPadding(rectangleInsets33);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        piePlot3D32.handleClick((int) (short) 100, 0, plotRenderingInfo37);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator39 = piePlot3D32.getURLGenerator();
        java.awt.Stroke stroke41 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D32.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke41);
        piePlot3D24.setLabelOutlineStroke(stroke41);
        piePlot3D14.setLabelLinkStroke(stroke41);
        piePlot3D0.setOutlineStroke(stroke41);
        java.awt.Paint paint46 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot3D0.setLabelBackgroundPaint(paint46);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNull(pieURLGenerator39);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(paint46);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot3D0.addChangeListener(plotChangeListener4);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D0.getLegendLabelToolTipGenerator();
        java.awt.Font font7 = piePlot3D0.getNoDataMessageFont();
        java.awt.Stroke stroke8 = piePlot3D0.getLabelLinkStroke();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D7.setLabelPadding(rectangleInsets8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        piePlot3D7.handleClick((int) (short) 100, 0, plotRenderingInfo12);
        boolean boolean14 = piePlot3D7.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D15 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D15.setLabelPadding(rectangleInsets16);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        piePlot3D15.handleClick((int) (short) 100, 0, plotRenderingInfo20);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = piePlot3D15.getURLGenerator();
        java.awt.Stroke stroke24 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D15.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke24);
        piePlot3D7.setLabelOutlineStroke(stroke24);
        piePlot3D0.setLabelLinkStroke(stroke24);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor28 = piePlot3D0.getLabelDistributor();
        org.jfree.chart.plot.PiePlot3D piePlot3D29 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D29.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke33 = piePlot3D29.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator34 = piePlot3D29.getLegendLabelGenerator();
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator34);
        java.awt.Image image36 = null;
        piePlot3D0.setBackgroundImage(image36);
        java.awt.Paint paint38 = piePlot3D0.getLabelShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D39 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D39.setSectionOutlinesVisible(true);
        piePlot3D39.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D44 = null;
        java.awt.geom.Rectangle2D rectangle2D45 = null;
        piePlot3D39.drawBackgroundImage(graphics2D44, rectangle2D45);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent47 = null;
        piePlot3D39.axisChanged(axisChangeEvent47);
        org.jfree.data.general.PieDataset pieDataset49 = piePlot3D39.getDataset();
        org.jfree.chart.plot.PiePlot3D piePlot3D51 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets52 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D51.setLabelPadding(rectangleInsets52);
        java.awt.Paint paint54 = piePlot3D51.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator55 = null;
        piePlot3D51.setLegendLabelToolTipGenerator(pieSectionLabelGenerator55);
        piePlot3D51.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot59 = piePlot3D51.getRootPlot();
        java.awt.Stroke stroke60 = piePlot3D51.getOutlineStroke();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator61 = piePlot3D51.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.Plot plot62 = piePlot3D51.getParent();
        java.awt.Paint paint63 = piePlot3D51.getLabelOutlinePaint();
        piePlot3D39.setSectionPaint((java.lang.Comparable) 4.0d, paint63);
        piePlot3D0.setLabelShadowPaint(paint63);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNull(pieURLGenerator22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor28);
        org.junit.Assert.assertNull(stroke33);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator34);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNull(pieDataset49);
        org.junit.Assert.assertNotNull(rectangleInsets52);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertNotNull(plot59);
        org.junit.Assert.assertNotNull(stroke60);
        org.junit.Assert.assertNull(pieSectionLabelGenerator61);
        org.junit.Assert.assertNull(plot62);
        org.junit.Assert.assertNotNull(paint63);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        java.awt.Stroke stroke6 = piePlot3D0.getLabelOutlineStroke();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        piePlot3D0.addChangeListener(plotChangeListener7);
        java.awt.Shape shape9 = piePlot3D0.getLegendItemShape();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(shape9);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D8.setLabelPadding(rectangleInsets9);
        java.awt.Paint paint11 = piePlot3D8.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator12 = null;
        piePlot3D8.setLegendLabelToolTipGenerator(pieSectionLabelGenerator12);
        java.awt.Stroke stroke14 = piePlot3D8.getLabelOutlineStroke();
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        piePlot3D8.addChangeListener(plotChangeListener15);
        piePlot3D0.setParent((org.jfree.chart.plot.Plot) piePlot3D8);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        piePlot3D0.drawBackgroundImage(graphics2D18, rectangle2D19);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D5.setLabelPadding(rectangleInsets6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        piePlot3D5.handleClick((int) (short) 100, 0, plotRenderingInfo10);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = piePlot3D5.getURLGenerator();
        java.awt.Paint paint13 = piePlot3D5.getLabelOutlinePaint();
        piePlot3D0.setLabelShadowPaint(paint13);
        java.lang.Object obj15 = piePlot3D0.clone();
        int int16 = piePlot3D0.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(pieURLGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        piePlot3D0.zoom((double) '#');
        java.awt.Font font10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D0.setLabelFont(font10);
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D12.setLabelPadding(rectangleInsets13);
        java.awt.Paint paint15 = piePlot3D12.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator16 = null;
        piePlot3D12.setLegendLabelToolTipGenerator(pieSectionLabelGenerator16);
        piePlot3D12.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot20 = piePlot3D12.getRootPlot();
        java.awt.Stroke stroke21 = piePlot3D12.getOutlineStroke();
        piePlot3D0.setLabelOutlineStroke(stroke21);
        org.jfree.chart.plot.PiePlot3D piePlot3D23 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D23.setSectionOutlinesVisible(true);
        piePlot3D23.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        piePlot3D23.drawBackgroundImage(graphics2D28, rectangle2D29);
        java.awt.Paint paint31 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D23.setNoDataMessagePaint(paint31);
        java.awt.Paint paint33 = piePlot3D23.getLabelOutlinePaint();
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        piePlot3D23.drawBackgroundImage(graphics2D34, rectangle2D35);
        org.jfree.chart.plot.PiePlot3D piePlot3D37 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D37.setLabelPadding(rectangleInsets38);
        java.awt.Paint paint40 = piePlot3D37.getLabelLinkPaint();
        boolean boolean41 = piePlot3D37.getLabelLinksVisible();
        piePlot3D37.setOutlineVisible(false);
        java.awt.Paint paint45 = piePlot3D37.getSectionOutlinePaint((java.lang.Comparable) 1L);
        org.jfree.data.general.PieDataset pieDataset46 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D47 = new org.jfree.chart.plot.PiePlot3D(pieDataset46);
        java.awt.Paint paint48 = piePlot3D47.getBaseSectionPaint();
        piePlot3D37.setLabelShadowPaint(paint48);
        piePlot3D23.setNoDataMessagePaint(paint48);
        boolean boolean51 = piePlot3D0.equals((java.lang.Object) paint48);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(rectangleInsets38);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(paint45);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        double double7 = piePlot3D0.getDepthFactor();
        double double8 = piePlot3D0.getInteriorGap();
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D9.setLabelPadding(rectangleInsets10);
        java.awt.Paint paint12 = piePlot3D9.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = null;
        piePlot3D9.setLegendLabelToolTipGenerator(pieSectionLabelGenerator13);
        piePlot3D9.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot17 = piePlot3D9.getRootPlot();
        java.awt.Paint paint18 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_OUTLINE_PAINT;
        piePlot3D9.setBaseSectionOutlinePaint(paint18);
        piePlot3D0.setBaseSectionPaint(paint18);
        org.jfree.chart.LegendItemCollection legendItemCollection21 = piePlot3D0.getLegendItems();
        java.awt.Paint paint22 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D0.setLabelPaint(paint22);
        org.jfree.chart.plot.PiePlot3D piePlot3D24 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D24.setLabelPadding(rectangleInsets25);
        java.awt.Paint paint27 = piePlot3D24.getLabelLinkPaint();
        boolean boolean28 = piePlot3D24.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent29 = null;
        piePlot3D24.notifyListeners(plotChangeEvent29);
        piePlot3D24.setOutlineVisible(true);
        int int33 = piePlot3D24.getPieIndex();
        org.jfree.chart.plot.PiePlot3D piePlot3D34 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D34.setLabelPadding(rectangleInsets35);
        float float37 = piePlot3D34.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D38 = null;
        java.awt.geom.Rectangle2D rectangle2D39 = null;
        piePlot3D34.drawBackgroundImage(graphics2D38, rectangle2D39);
        org.jfree.chart.plot.PiePlot3D piePlot3D41 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D41.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = piePlot3D41.getLabelPadding();
        piePlot3D34.setSimpleLabelOffset(rectangleInsets44);
        piePlot3D24.setInsets(rectangleInsets44, false);
        piePlot3D0.setLabelPadding(rectangleInsets44);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12d + "'", double7 == 0.12d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(legendItemCollection21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets35);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.5f + "'", float37 == 0.5f);
        org.junit.Assert.assertNotNull(rectangleInsets44);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.awt.Stroke stroke9 = piePlot3D0.getOutlineStroke();
        piePlot3D0.setSectionOutlinesVisible(false);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent12 = null;
        piePlot3D0.axisChanged(axisChangeEvent12);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot3D0.addChangeListener(plotChangeListener4);
        piePlot3D0.setBackgroundImageAlignment((int) (short) 10);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D0.setOutlineStroke(stroke8);
        java.awt.Paint paint10 = piePlot3D0.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D11.setLabelPadding(rectangleInsets12);
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D14.setLabelPadding(rectangleInsets15);
        java.awt.Paint paint17 = piePlot3D14.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator18 = null;
        piePlot3D14.setLegendLabelToolTipGenerator(pieSectionLabelGenerator18);
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean22 = piePlot3D21.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator23 = null;
        piePlot3D21.setToolTipGenerator(pieToolTipGenerator23);
        java.awt.Paint paint25 = piePlot3D21.getShadowPaint();
        piePlot3D14.setSectionPaint((java.lang.Comparable) 100.0f, paint25);
        piePlot3D11.setBaseSectionOutlinePaint(paint25);
        piePlot3D0.setLabelPaint(paint25);
        java.awt.Paint paint30 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) 100L);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNull(paint30);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D5.setLabelPadding(rectangleInsets6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        piePlot3D5.handleClick((int) (short) 100, 0, plotRenderingInfo10);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = piePlot3D5.getURLGenerator();
        java.awt.Paint paint13 = piePlot3D5.getLabelOutlinePaint();
        piePlot3D0.setLabelShadowPaint(paint13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = piePlot3D0.getDatasetGroup();
        piePlot3D0.setCircular(true);
        java.awt.Stroke stroke18 = piePlot3D0.getLabelOutlineStroke();
        piePlot3D0.setLabelLinkMargin((-1.0d));
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator21 = piePlot3D0.getLegendLabelGenerator();
        double double22 = piePlot3D0.getLabelLinkMargin();
        boolean boolean23 = piePlot3D0.isSubplot();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(pieURLGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot3D0.getURLGenerator();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor8 = piePlot3D0.getLabelDistributor();
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D9.setSectionOutlinesVisible(true);
        piePlot3D9.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        piePlot3D9.drawBackgroundImage(graphics2D14, rectangle2D15);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D9.setNoDataMessagePaint(paint17);
        piePlot3D0.setLabelBackgroundPaint(paint17);
        java.awt.Paint paint20 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setLabelLinkPaint(paint20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor8);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setDarkerSides(false);
        boolean boolean3 = piePlot3D0.isOutlineVisible();
        boolean boolean4 = piePlot3D0.getIgnoreNullValues();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D5.setLabelPadding(rectangleInsets6);
        java.awt.Paint paint8 = piePlot3D5.getLabelLinkPaint();
        java.awt.Paint paint9 = piePlot3D5.getShadowPaint();
        java.awt.Shape shape10 = piePlot3D5.getLegendItemShape();
        piePlot3D0.setLegendItemShape(shape10);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D(pieDataset13);
        java.awt.Paint paint15 = piePlot3D14.getBaseSectionPaint();
        java.awt.Stroke stroke16 = piePlot3D14.getOutlineStroke();
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) (byte) 100, stroke16);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3D0.getSimpleLabelOffset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(rectangleInsets18);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        float float3 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot3D0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D7.setLabelPadding(rectangleInsets8);
        java.awt.Paint paint10 = piePlot3D7.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator11 = null;
        piePlot3D7.setLegendLabelToolTipGenerator(pieSectionLabelGenerator11);
        piePlot3D7.setLabelLinkMargin(0.0d);
        piePlot3D7.setPieIndex((int) ' ');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor17 = piePlot3D7.getLabelDistributor();
        java.awt.Paint paint18 = piePlot3D7.getLabelShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D19.setLabelPadding(rectangleInsets20);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        piePlot3D19.handleClick((int) (short) 100, 0, plotRenderingInfo24);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator26 = piePlot3D19.getURLGenerator();
        org.jfree.chart.util.Rotation rotation27 = piePlot3D19.getDirection();
        piePlot3D7.setDirection(rotation27);
        piePlot3D0.setDirection(rotation27);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNull(pieURLGenerator26);
        org.junit.Assert.assertNotNull(rotation27);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        piePlot3D0.zoom((double) '#');
        java.awt.Font font10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D0.setLabelFont(font10);
        piePlot3D0.setDepthFactor(4.0d);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        piePlot3D0.handleClick((-1), (int) '#', plotRenderingInfo16);
        org.junit.Assert.assertNotNull(font10);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        boolean boolean5 = piePlot3D0.isCircular();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D0.getLegendLabelGenerator();
        piePlot3D0.setStartAngle((double) (-1.0f));
        piePlot3D0.setCircular(true, false);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent12 = null;
        piePlot3D0.axisChanged(axisChangeEvent12);
        java.awt.Paint paint14 = piePlot3D0.getLabelBackgroundPaint();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        java.awt.Paint paint10 = piePlot3D0.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D11.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot3D11.getLabelPadding();
        java.awt.Font font15 = piePlot3D11.getNoDataMessageFont();
        java.awt.Paint paint16 = piePlot3D11.getOutlinePaint();
        piePlot3D0.setLabelOutlinePaint(paint16);
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D18.setSectionOutlinesVisible(true);
        piePlot3D18.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        piePlot3D18.drawBackgroundImage(graphics2D23, rectangle2D24);
        java.awt.Paint paint26 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D18.setNoDataMessagePaint(paint26);
        double double28 = piePlot3D18.getShadowYOffset();
        java.awt.Stroke stroke29 = piePlot3D18.getBaseSectionOutlineStroke();
        piePlot3D0.setBaseSectionOutlineStroke(stroke29);
        java.awt.Paint paint31 = piePlot3D0.getLabelOutlinePaint();
        java.lang.Object obj32 = piePlot3D0.clone();
        piePlot3D0.setOutlineVisible(true);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.0d + "'", double28 == 4.0d);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.awt.Stroke stroke9 = piePlot3D0.getOutlineStroke();
        double double10 = piePlot3D0.getMaximumLabelWidth();
        int int11 = piePlot3D0.getPieIndex();
        boolean boolean12 = piePlot3D0.isCircular();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D6.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = piePlot3D6.getLabelPadding();
        java.awt.Font font10 = piePlot3D6.getNoDataMessageFont();
        piePlot3D0.setLabelFont(font10);
        piePlot3D0.setExplodePercent((java.lang.Comparable) 0.14d, (double) 1.0f);
        java.awt.Stroke stroke16 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) 0L);
        double double17 = piePlot3D0.getStartAngle();
        piePlot3D0.setOutlineVisible(true);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNull(stroke16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 90.0d + "'", double17 == 90.0d);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        double double4 = piePlot3D0.getStartAngle();
        double double5 = piePlot3D0.getShadowYOffset();
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        piePlot3D0.addChangeListener(plotChangeListener6);
        piePlot3D0.setShadowYOffset((double) '#');
        piePlot3D0.setNoDataMessage("");
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 90.0d + "'", double4 == 90.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D0.setNoDataMessagePaint(paint8);
        java.awt.Stroke stroke10 = piePlot3D0.getLabelOutlineStroke();
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D11.setLabelPadding(rectangleInsets12);
        java.awt.Paint paint14 = piePlot3D11.getLabelLinkPaint();
        boolean boolean15 = piePlot3D11.getLabelLinksVisible();
        double double16 = piePlot3D11.getDepthFactor();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator17 = piePlot3D11.getLabelGenerator();
        piePlot3D0.setLabelGenerator(pieSectionLabelGenerator17);
        java.awt.Paint paint19 = piePlot3D0.getOutlinePaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener20 = null;
        piePlot3D0.addChangeListener(plotChangeListener20);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.12d + "'", double16 == 0.12d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator17);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot3D0.getURLGenerator();
        java.awt.Paint paint8 = piePlot3D0.getLabelOutlinePaint();
        double double9 = piePlot3D0.getLabelLinkMargin();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator10 = piePlot3D0.getURLGenerator();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = piePlot3D0.getDrawingSupplier();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator12 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator12);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.025d + "'", double9 == 0.025d);
        org.junit.Assert.assertNull(pieURLGenerator10);
        org.junit.Assert.assertNotNull(drawingSupplier11);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle(4.0d);
        java.lang.String str12 = piePlot3D0.getPlotType();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = piePlot3D0.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pie 3D Plot" + "'", str12, "Pie 3D Plot");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.data.general.PieDataset pieDataset8 = piePlot3D0.getDataset();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieDataset8);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        double double7 = piePlot3D0.getDepthFactor();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        piePlot3D0.drawBackgroundImage(graphics2D8, rectangle2D9);
        double double11 = piePlot3D0.getDepthFactor();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12d + "'", double7 == 0.12d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.12d + "'", double11 == 0.12d);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot3D0.getURLGenerator();
        java.awt.Stroke stroke9 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke9);
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D11.setLabelPadding(rectangleInsets12);
        java.awt.Paint paint14 = piePlot3D11.getLabelLinkPaint();
        boolean boolean15 = piePlot3D11.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        piePlot3D11.notifyListeners(plotChangeEvent16);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3D11.getSimpleLabelOffset();
        piePlot3D0.setSimpleLabelOffset(rectangleInsets18);
        java.awt.Font font20 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D0.setNoDataMessageFont(font20);
        java.awt.Paint paint23 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) 0.5f);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = piePlot3D0.getSimpleLabelOffset();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertNotNull(rectangleInsets24);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        boolean boolean5 = piePlot3D0.isCircular();
        double double6 = piePlot3D0.getShadowYOffset();
        piePlot3D0.setStartAngle(90.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        piePlot3D0.setOutlineVisible(true);
        piePlot3D0.setMinimumArcAngleToDraw((double) (short) 1);
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D12.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot3D12.getLabelPadding();
        piePlot3D12.setShadowXOffset(10.0d);
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D18.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot3D18.getLabelPadding();
        java.awt.Font font22 = piePlot3D18.getNoDataMessageFont();
        piePlot3D12.setLabelFont(font22);
        java.awt.Paint paint24 = piePlot3D12.getLabelBackgroundPaint();
        double double25 = piePlot3D12.getLabelLinkMargin();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = piePlot3D12.getInsets();
        piePlot3D0.setSimpleLabelOffset(rectangleInsets26);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.025d + "'", double25 == 0.025d);
        org.junit.Assert.assertNotNull(rectangleInsets26);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        piePlot3D0.setOutlineVisible(true);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator9 = piePlot3D0.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D10.setSectionOutlinesVisible(true);
        piePlot3D10.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        piePlot3D10.drawBackgroundImage(graphics2D15, rectangle2D16);
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D10.setNoDataMessagePaint(paint18);
        java.awt.Stroke stroke20 = piePlot3D10.getLabelOutlineStroke();
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D21.setLabelPadding(rectangleInsets22);
        java.awt.Paint paint24 = piePlot3D21.getLabelLinkPaint();
        boolean boolean25 = piePlot3D21.getLabelLinksVisible();
        double double26 = piePlot3D21.getDepthFactor();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator27 = piePlot3D21.getLabelGenerator();
        piePlot3D10.setLabelGenerator(pieSectionLabelGenerator27);
        org.jfree.chart.plot.PiePlot3D piePlot3D29 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D29.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = piePlot3D29.getLabelPadding();
        java.awt.Font font33 = piePlot3D29.getNoDataMessageFont();
        piePlot3D10.setNoDataMessageFont(font33);
        piePlot3D0.setLabelFont(font33);
        boolean boolean36 = piePlot3D0.getIgnoreZeroValues();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(pieSectionLabelGenerator9);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.12d + "'", double26 == 0.12d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator27);
        org.junit.Assert.assertNotNull(rectangleInsets32);
        org.junit.Assert.assertNotNull(font33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D0.setNoDataMessagePaint(paint8);
        java.awt.Paint paint10 = piePlot3D0.getLabelOutlinePaint();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot3D0.drawBackgroundImage(graphics2D11, rectangle2D12);
        java.awt.Paint paint15 = piePlot3D0.getSectionPaint((java.lang.Comparable) 0.0d);
        java.awt.Paint paint17 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) (short) 1);
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D18.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot3D18.getLabelPadding();
        piePlot3D18.setShadowXOffset(10.0d);
        piePlot3D18.setCircular(false);
        piePlot3D18.setLabelGap((double) (short) 1);
        java.awt.Paint paint28 = piePlot3D18.getBaseSectionOutlinePaint();
        piePlot3D0.setLabelPaint(paint28);
        float float30 = piePlot3D0.getBackgroundImageAlpha();
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setInteriorGap((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (10.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.5f + "'", float30 == 0.5f);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        piePlot3D0.setShadowXOffset((double) 15);
        java.lang.String str7 = piePlot3D0.getPlotType();
        piePlot3D0.setOutlineVisible(false);
        java.awt.Paint paint11 = piePlot3D0.getSectionPaint((java.lang.Comparable) 0.12d);
        boolean boolean12 = piePlot3D0.getIgnoreZeroValues();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Pie 3D Plot" + "'", str7, "Pie 3D Plot");
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Paint paint8 = piePlot3D0.getLabelShadowPaint();
        java.lang.String str9 = piePlot3D0.getPlotType();
        float float10 = piePlot3D0.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Pie 3D Plot" + "'", str9, "Pie 3D Plot");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        java.awt.Paint paint10 = piePlot3D0.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke11 = piePlot3D0.getLabelLinkStroke();
        java.awt.Paint paint12 = piePlot3D0.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D13.setLabelPadding(rectangleInsets14);
        java.awt.Paint paint16 = piePlot3D13.getLabelLinkPaint();
        boolean boolean17 = piePlot3D13.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3D13.getInsets();
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D13.setShadowPaint(paint19);
        piePlot3D0.setLabelPaint(paint19);
        java.awt.Image image22 = piePlot3D0.getBackgroundImage();
        java.awt.Paint paint23 = piePlot3D0.getLabelBackgroundPaint();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(image22);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        piePlot3D0.setForegroundAlpha(0.0f);
        org.junit.Assert.assertNotNull(rectangleInsets1);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D7.setLabelPadding(rectangleInsets8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        piePlot3D7.handleClick((int) (short) 100, 0, plotRenderingInfo12);
        boolean boolean14 = piePlot3D7.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D15 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D15.setLabelPadding(rectangleInsets16);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        piePlot3D15.handleClick((int) (short) 100, 0, plotRenderingInfo20);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = piePlot3D15.getURLGenerator();
        java.awt.Stroke stroke24 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D15.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke24);
        piePlot3D7.setLabelOutlineStroke(stroke24);
        piePlot3D0.setLabelLinkStroke(stroke24);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor28 = piePlot3D0.getLabelDistributor();
        org.jfree.chart.plot.PiePlot3D piePlot3D29 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D29.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke33 = piePlot3D29.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator34 = piePlot3D29.getLegendLabelGenerator();
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator34);
        float float36 = piePlot3D0.getBackgroundAlpha();
        piePlot3D0.setIgnoreNullValues(false);
        java.awt.Paint paint39 = piePlot3D0.getLabelPaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier40 = piePlot3D0.getDrawingSupplier();
        java.lang.String str41 = piePlot3D0.getPlotType();
        piePlot3D0.setPieIndex((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setBackgroundImageAlpha((float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNull(pieURLGenerator22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor28);
        org.junit.Assert.assertNull(stroke33);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator34);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 1.0f + "'", float36 == 1.0f);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(drawingSupplier40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Pie 3D Plot" + "'", str41, "Pie 3D Plot");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        float float3 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot3D0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Font font7 = piePlot3D0.getLabelFont();
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D8.setLabelPadding(rectangleInsets9);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        piePlot3D8.handleClick((int) (short) 100, 0, plotRenderingInfo13);
        boolean boolean15 = piePlot3D8.getSectionOutlinesVisible();
        java.awt.Paint paint16 = piePlot3D8.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D17.setSectionOutlinesVisible(true);
        piePlot3D17.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        piePlot3D17.drawBackgroundImage(graphics2D22, rectangle2D23);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = piePlot3D17.getLabelPadding();
        piePlot3D8.setInsets(rectangleInsets25);
        int int27 = piePlot3D8.getPieIndex();
        org.jfree.chart.plot.PiePlot3D piePlot3D28 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D28.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = piePlot3D28.getLabelPadding();
        piePlot3D28.setShadowXOffset(10.0d);
        piePlot3D28.setCircular(false);
        piePlot3D28.setLabelGap((double) (short) 1);
        java.awt.Paint paint38 = piePlot3D28.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke39 = piePlot3D28.getLabelLinkStroke();
        java.awt.Paint paint40 = piePlot3D28.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D41 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets42 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D41.setLabelPadding(rectangleInsets42);
        java.awt.Paint paint44 = piePlot3D41.getLabelLinkPaint();
        boolean boolean45 = piePlot3D41.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets46 = piePlot3D41.getInsets();
        java.awt.Paint paint47 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D41.setShadowPaint(paint47);
        piePlot3D28.setLabelPaint(paint47);
        float float50 = piePlot3D28.getBackgroundAlpha();
        java.awt.Shape shape51 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot3D28.setLegendItemShape(shape51);
        piePlot3D8.setLegendItemShape(shape51);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier54 = piePlot3D8.getDrawingSupplier();
        piePlot3D0.setDrawingSupplier(drawingSupplier54);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(rectangleInsets42);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(rectangleInsets46);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 1.0f + "'", float50 == 1.0f);
        org.junit.Assert.assertNotNull(shape51);
        org.junit.Assert.assertNotNull(drawingSupplier54);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot3D0.getURLGenerator();
        java.awt.Paint paint8 = piePlot3D0.getLabelOutlinePaint();
        double double9 = piePlot3D0.getLabelLinkMargin();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator10 = piePlot3D0.getURLGenerator();
        java.awt.Paint paint12 = null;
        piePlot3D0.setSectionPaint((java.lang.Comparable) 10L, paint12);
        org.jfree.chart.util.Rotation rotation14 = piePlot3D0.getDirection();
        java.lang.String str15 = piePlot3D0.getNoDataMessage();
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D16.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = piePlot3D16.getLabelPadding();
        piePlot3D16.setShadowXOffset(10.0d);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        piePlot3D16.datasetChanged(datasetChangeEvent22);
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D25.setSectionOutlinesVisible(true);
        piePlot3D25.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        piePlot3D25.drawBackgroundImage(graphics2D30, rectangle2D31);
        piePlot3D25.zoom((double) '#');
        double double35 = piePlot3D25.getShadowXOffset();
        java.awt.Stroke stroke36 = piePlot3D25.getLabelOutlineStroke();
        piePlot3D16.setSectionOutlineStroke((java.lang.Comparable) 0.14d, stroke36);
        piePlot3D0.setBaseSectionOutlineStroke(stroke36);
        java.awt.Stroke stroke39 = piePlot3D0.getLabelLinkStroke();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.025d + "'", double9 == 0.025d);
        org.junit.Assert.assertNull(pieURLGenerator10);
        org.junit.Assert.assertNotNull(rotation14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 4.0d + "'", double35 == 4.0d);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(stroke39);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.awt.Stroke stroke9 = piePlot3D0.getOutlineStroke();
        double double10 = piePlot3D0.getMaximumLabelWidth();
        double double11 = piePlot3D0.getStartAngle();
        org.jfree.chart.event.PlotChangeListener plotChangeListener12 = null;
        piePlot3D0.removeChangeListener(plotChangeListener12);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 90.0d + "'", double11 == 90.0d);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setLabelPadding(rectangleInsets11);
        java.awt.Paint paint13 = piePlot3D10.getLabelLinkPaint();
        boolean boolean14 = piePlot3D10.getLabelLinksVisible();
        piePlot3D10.setOutlineVisible(false);
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D17.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = piePlot3D17.getLabelPadding();
        piePlot3D17.setShadowXOffset(10.0d);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent23 = null;
        piePlot3D17.datasetChanged(datasetChangeEvent23);
        int int25 = piePlot3D17.getBackgroundImageAlignment();
        org.jfree.chart.plot.PiePlot3D piePlot3D26 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D26.setLabelPadding(rectangleInsets27);
        java.awt.Paint paint29 = piePlot3D26.getLabelLinkPaint();
        boolean boolean30 = piePlot3D26.getLabelLinksVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D31 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D31.setLabelPadding(rectangleInsets32);
        piePlot3D26.setSimpleLabelOffset(rectangleInsets32);
        piePlot3D17.setSimpleLabelOffset(rectangleInsets32);
        piePlot3D10.setLabelPadding(rectangleInsets32);
        piePlot3D0.setSimpleLabelOffset(rectangleInsets32);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 15 + "'", int25 == 15);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(rectangleInsets32);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setDarkerSides(false);
        double double3 = piePlot3D0.getMaximumLabelWidth();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.14d + "'", double3 == 0.14d);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        java.awt.Font font4 = piePlot3D0.getNoDataMessageFont();
        java.awt.Paint paint5 = piePlot3D0.getOutlinePaint();
        java.awt.Font font6 = piePlot3D0.getNoDataMessageFont();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = null;
        piePlot3D0.setURLGenerator(pieURLGenerator7);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = piePlot3D0.getSimpleLabelOffset();
        piePlot3D0.setLabelLinksVisible(true);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(rectangleInsets9);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.plot.PiePlot3D piePlot3D3 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D3.setLabelPadding(rectangleInsets4);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        piePlot3D3.handleClick((int) (short) 100, 0, plotRenderingInfo8);
        boolean boolean10 = piePlot3D3.getSectionOutlinesVisible();
        java.awt.Paint paint11 = piePlot3D3.getBaseSectionPaint();
        java.awt.Paint paint12 = piePlot3D3.getLabelOutlinePaint();
        piePlot3D0.setBaseSectionOutlinePaint(paint12);
        double double14 = piePlot3D0.getShadowYOffset();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = piePlot3D0.getLabelGenerator();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator16 = piePlot3D0.getLabelGenerator();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.drawBackground(graphics2D17, rectangle2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator15);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator16);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.awt.Stroke stroke9 = piePlot3D0.getOutlineStroke();
        double double10 = piePlot3D0.getMaximumLabelWidth();
        int int11 = piePlot3D0.getPieIndex();
        java.awt.Paint paint12 = piePlot3D0.getNoDataMessagePaint();
        double double13 = piePlot3D0.getShadowXOffset();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.0d + "'", double13 == 4.0d);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot3D0.getURLGenerator();
        java.awt.Paint paint8 = piePlot3D0.getLabelOutlinePaint();
        double double9 = piePlot3D0.getLabelLinkMargin();
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setLabelPadding(rectangleInsets11);
        float float13 = piePlot3D10.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        piePlot3D10.drawBackgroundImage(graphics2D14, rectangle2D15);
        java.awt.Stroke stroke18 = piePlot3D10.getSectionOutlineStroke((java.lang.Comparable) 0.5f);
        java.awt.Paint paint19 = piePlot3D10.getBaseSectionPaint();
        piePlot3D0.setBackgroundPaint(paint19);
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D21.setLabelPadding(rectangleInsets22);
        java.awt.Paint paint24 = piePlot3D21.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = null;
        piePlot3D21.setLegendLabelToolTipGenerator(pieSectionLabelGenerator25);
        piePlot3D21.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot29 = piePlot3D21.getRootPlot();
        org.jfree.chart.plot.PiePlot3D piePlot3D30 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D30.setLabelPadding(rectangleInsets31);
        java.awt.Paint paint33 = piePlot3D30.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener34 = null;
        piePlot3D30.addChangeListener(plotChangeListener34);
        piePlot3D30.setBackgroundImageAlignment((int) (short) 10);
        piePlot3D30.setLabelLinksVisible(true);
        java.awt.Font font40 = piePlot3D30.getNoDataMessageFont();
        piePlot3D21.setLabelFont(font40);
        piePlot3D0.setLabelFont(font40);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.025d + "'", double9 == 0.025d);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNull(stroke18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(plot29);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(font40);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D8.setLabelPadding(rectangleInsets9);
        org.jfree.data.general.PieDataset pieDataset11 = piePlot3D8.getDataset();
        piePlot3D8.setDarkerSides(true);
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D14.setLabelPadding(rectangleInsets15);
        java.awt.Paint paint17 = piePlot3D14.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator18 = null;
        piePlot3D14.setLegendLabelToolTipGenerator(pieSectionLabelGenerator18);
        piePlot3D14.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot22 = piePlot3D14.getRootPlot();
        java.awt.Stroke stroke23 = piePlot3D14.getOutlineStroke();
        double double24 = piePlot3D14.getMaximumLabelWidth();
        int int25 = piePlot3D14.getPieIndex();
        double double26 = piePlot3D14.getStartAngle();
        org.jfree.chart.plot.PiePlot3D piePlot3D27 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D27.setLabelPadding(rectangleInsets28);
        java.awt.Paint paint30 = piePlot3D27.getLabelLinkPaint();
        java.awt.Paint paint31 = piePlot3D27.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D32 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D32.setLabelPadding(rectangleInsets33);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        piePlot3D32.handleClick((int) (short) 100, 0, plotRenderingInfo37);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator39 = piePlot3D32.getURLGenerator();
        java.awt.Paint paint40 = piePlot3D32.getLabelOutlinePaint();
        piePlot3D27.setLabelShadowPaint(paint40);
        org.jfree.data.general.DatasetGroup datasetGroup42 = piePlot3D27.getDatasetGroup();
        piePlot3D27.setCircular(true);
        java.awt.Stroke stroke45 = piePlot3D27.getLabelOutlineStroke();
        piePlot3D14.setOutlineStroke(stroke45);
        piePlot3D8.setBaseSectionOutlineStroke(stroke45);
        piePlot3D0.setBaseSectionOutlineStroke(stroke45);
        double double49 = piePlot3D0.getDepthFactor();
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNull(pieDataset11);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(plot22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.14d + "'", double24 == 0.14d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 90.0d + "'", double26 == 90.0d);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNull(pieURLGenerator39);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNull(datasetGroup42);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.12d + "'", double49 == 0.12d);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot3D0.getURLGenerator();
        java.awt.Stroke stroke9 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke9);
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D11.setLabelPadding(rectangleInsets12);
        java.awt.Paint paint14 = piePlot3D11.getLabelLinkPaint();
        boolean boolean15 = piePlot3D11.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        piePlot3D11.notifyListeners(plotChangeEvent16);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3D11.getSimpleLabelOffset();
        piePlot3D0.setSimpleLabelOffset(rectangleInsets18);
        java.awt.Font font20 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D0.setNoDataMessageFont(font20);
        org.jfree.data.general.PieDataset pieDataset22 = piePlot3D0.getDataset();
        boolean boolean23 = piePlot3D0.getSimpleLabels();
        java.awt.Paint paint24 = piePlot3D0.getLabelOutlinePaint();
        piePlot3D0.setMinimumArcAngleToDraw((double) (short) 10);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNull(pieDataset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D9.setLabelPadding(rectangleInsets10);
        java.awt.Paint paint12 = piePlot3D9.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        piePlot3D9.addChangeListener(plotChangeListener13);
        piePlot3D9.setBackgroundImageAlignment((int) (short) 10);
        piePlot3D9.setLabelLinksVisible(true);
        java.awt.Font font19 = piePlot3D9.getNoDataMessageFont();
        piePlot3D0.setLabelFont(font19);
        double double22 = piePlot3D0.getExplodePercent((java.lang.Comparable) 100.0d);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = piePlot3D0.getSimpleLabelOffset();
        piePlot3D0.setIgnoreZeroValues(false);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        piePlot3D0.drawBackgroundImage(graphics2D10, rectangle2D11);
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D13.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = piePlot3D13.getLabelPadding();
        piePlot3D13.setShadowXOffset(10.0d);
        piePlot3D13.setCircular(false);
        piePlot3D13.setLabelGap((double) (short) 1);
        java.awt.Paint paint23 = piePlot3D13.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke24 = piePlot3D13.getLabelLinkStroke();
        java.awt.Paint paint25 = piePlot3D13.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D26 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D26.setLabelPadding(rectangleInsets27);
        java.awt.Paint paint29 = piePlot3D26.getLabelLinkPaint();
        boolean boolean30 = piePlot3D26.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = piePlot3D26.getInsets();
        java.awt.Paint paint32 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D26.setShadowPaint(paint32);
        piePlot3D13.setLabelPaint(paint32);
        org.jfree.chart.plot.PiePlot3D piePlot3D35 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D35.setLabelPadding(rectangleInsets36);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo40 = null;
        piePlot3D35.handleClick((int) (short) 100, 0, plotRenderingInfo40);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator42 = piePlot3D35.getURLGenerator();
        java.awt.Stroke stroke44 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D35.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke44);
        piePlot3D13.setOutlineStroke(stroke44);
        org.jfree.chart.plot.PiePlot3D piePlot3D47 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets48 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D47.setLabelPadding(rectangleInsets48);
        java.awt.Paint paint50 = piePlot3D47.getLabelLinkPaint();
        boolean boolean51 = piePlot3D47.getLabelLinksVisible();
        double double52 = piePlot3D47.getLabelLinkMargin();
        piePlot3D47.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup55 = piePlot3D47.getDatasetGroup();
        piePlot3D47.setBackgroundImageAlignment(1);
        java.awt.Paint paint58 = piePlot3D47.getLabelLinkPaint();
        piePlot3D13.setLabelShadowPaint(paint58);
        java.awt.Paint paint60 = piePlot3D13.getLabelPaint();
        piePlot3D0.setLabelLinkPaint(paint60);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(rectangleInsets36);
        org.junit.Assert.assertNull(pieURLGenerator42);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNotNull(rectangleInsets48);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.025d + "'", double52 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup55);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertNotNull(paint60);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot3D0.getDatasetGroup();
        float float9 = piePlot3D0.getBackgroundImageAlpha();
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D10.setSectionOutlinesVisible(true);
        piePlot3D10.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        piePlot3D10.drawBackgroundImage(graphics2D15, rectangle2D16);
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D10.setNoDataMessagePaint(paint18);
        java.awt.Stroke stroke20 = piePlot3D10.getLabelOutlineStroke();
        piePlot3D0.setLabelLinkStroke(stroke20);
        java.lang.Class<?> wildcardClass22 = piePlot3D0.getClass();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot3D0.getURLGenerator();
        java.awt.Stroke stroke9 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke9);
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D11.setLabelPadding(rectangleInsets12);
        java.awt.Paint paint14 = piePlot3D11.getLabelLinkPaint();
        boolean boolean15 = piePlot3D11.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        piePlot3D11.notifyListeners(plotChangeEvent16);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3D11.getSimpleLabelOffset();
        piePlot3D0.setSimpleLabelOffset(rectangleInsets18);
        java.awt.Font font20 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D0.setNoDataMessageFont(font20);
        java.awt.Paint paint23 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) 0.5f);
        boolean boolean24 = piePlot3D0.getIgnoreNullValues();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        java.awt.Paint paint10 = piePlot3D0.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke11 = piePlot3D0.getLabelLinkStroke();
        java.awt.Paint paint12 = piePlot3D0.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D13.setLabelPadding(rectangleInsets14);
        java.awt.Paint paint16 = piePlot3D13.getLabelLinkPaint();
        boolean boolean17 = piePlot3D13.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3D13.getInsets();
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D13.setShadowPaint(paint19);
        piePlot3D0.setLabelPaint(paint19);
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D22.setLabelPadding(rectangleInsets23);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        piePlot3D22.handleClick((int) (short) 100, 0, plotRenderingInfo27);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator29 = piePlot3D22.getURLGenerator();
        java.awt.Stroke stroke31 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D22.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke31);
        piePlot3D0.setOutlineStroke(stroke31);
        piePlot3D0.setBackgroundImageAlignment((int) (short) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent36 = null;
        piePlot3D0.axisChanged(axisChangeEvent36);
        boolean boolean38 = piePlot3D0.isCircular();
        piePlot3D0.setBackgroundImageAlignment((int) (short) 10);
        java.awt.Graphics2D graphics2D41 = null;
        java.awt.geom.Rectangle2D rectangle2D42 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.drawBackground(graphics2D41, rectangle2D42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNull(pieURLGenerator29);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        float float7 = piePlot3D0.getForegroundAlpha();
        java.awt.Paint paint8 = piePlot3D0.getBaseSectionOutlinePaint();
        float float9 = piePlot3D0.getForegroundAlpha();
        java.awt.Image image10 = piePlot3D0.getBackgroundImage();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNull(image10);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        piePlot3D0.setOutlineVisible(false);
        java.awt.Paint paint8 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) 1L);
        piePlot3D0.setShadowYOffset((double) (byte) 100);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.drawBackground(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(paint8);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        java.awt.Paint paint10 = piePlot3D0.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D11.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot3D11.getLabelPadding();
        java.awt.Font font15 = piePlot3D11.getNoDataMessageFont();
        java.awt.Paint paint16 = piePlot3D11.getOutlinePaint();
        piePlot3D0.setLabelOutlinePaint(paint16);
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D18.setSectionOutlinesVisible(true);
        piePlot3D18.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        piePlot3D18.drawBackgroundImage(graphics2D23, rectangle2D24);
        java.awt.Paint paint26 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D18.setNoDataMessagePaint(paint26);
        double double28 = piePlot3D18.getShadowYOffset();
        java.awt.Stroke stroke29 = piePlot3D18.getBaseSectionOutlineStroke();
        piePlot3D0.setBaseSectionOutlineStroke(stroke29);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator31 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator31);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.0d + "'", double28 == 4.0d);
        org.junit.Assert.assertNotNull(stroke29);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot3D0.getDatasetGroup();
        piePlot3D0.setBackgroundImageAlignment(1);
        java.awt.Paint paint11 = piePlot3D0.getLabelLinkPaint();
        boolean boolean12 = piePlot3D0.getSectionOutlinesVisible();
        java.awt.Stroke stroke13 = piePlot3D0.getLabelOutlineStroke();
        piePlot3D0.setMinimumArcAngleToDraw((double) (byte) 1);
        java.awt.Paint paint16 = piePlot3D0.getLabelShadowPaint();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        double double4 = piePlot3D0.getStartAngle();
        piePlot3D0.setDarkerSides(false);
        piePlot3D0.setLabelLinksVisible(false);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 90.0d + "'", double4 == 90.0d);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot3D0.getURLGenerator();
        java.awt.Stroke stroke9 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke9);
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D11.setLabelPadding(rectangleInsets12);
        java.awt.Paint paint14 = piePlot3D11.getLabelLinkPaint();
        boolean boolean15 = piePlot3D11.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        piePlot3D11.notifyListeners(plotChangeEvent16);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3D11.getSimpleLabelOffset();
        piePlot3D0.setSimpleLabelOffset(rectangleInsets18);
        java.awt.Font font20 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D0.setNoDataMessageFont(font20);
        org.jfree.data.general.PieDataset pieDataset22 = piePlot3D0.getDataset();
        boolean boolean23 = piePlot3D0.getSimpleLabels();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator24 = piePlot3D0.getURLGenerator();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNull(pieDataset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(pieURLGenerator24);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        piePlot3D0.setOutlineVisible(false);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        piePlot3D0.removeChangeListener(plotChangeListener7);
        org.jfree.data.general.DatasetGroup datasetGroup9 = piePlot3D0.getDatasetGroup();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        piePlot3D0.drawOutline(graphics2D10, rectangle2D11);
        double double13 = piePlot3D0.getLabelGap();
        boolean boolean14 = piePlot3D0.getSimpleLabels();
        boolean boolean15 = piePlot3D0.isSubplot();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(datasetGroup9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.025d + "'", double13 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot3D0.addChangeListener(plotChangeListener4);
        java.awt.Paint paint6 = piePlot3D0.getShadowPaint();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = piePlot3D0.getToolTipGenerator();
        double double8 = piePlot3D0.getMaximumLabelWidth();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(pieToolTipGenerator7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        java.awt.Paint paint10 = piePlot3D0.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke11 = piePlot3D0.getLabelLinkStroke();
        java.awt.Paint paint12 = piePlot3D0.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D13.setLabelPadding(rectangleInsets14);
        java.awt.Paint paint16 = piePlot3D13.getLabelLinkPaint();
        boolean boolean17 = piePlot3D13.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3D13.getInsets();
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D13.setShadowPaint(paint19);
        piePlot3D0.setLabelPaint(paint19);
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D22.setLabelPadding(rectangleInsets23);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        piePlot3D22.handleClick((int) (short) 100, 0, plotRenderingInfo27);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator29 = piePlot3D22.getURLGenerator();
        java.awt.Stroke stroke31 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D22.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke31);
        piePlot3D0.setOutlineStroke(stroke31);
        java.awt.Paint paint34 = null;
        piePlot3D0.setLabelBackgroundPaint(paint34);
        double double36 = piePlot3D0.getDepthFactor();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNull(pieURLGenerator29);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.12d + "'", double36 == 0.12d);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        piePlot3D0.setLabelLinkMargin(0.025d);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D5.setLabelPadding(rectangleInsets6);
        java.awt.Paint paint8 = piePlot3D5.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator9 = null;
        piePlot3D5.setLegendLabelToolTipGenerator(pieSectionLabelGenerator9);
        piePlot3D5.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot13 = piePlot3D5.getRootPlot();
        java.awt.Stroke stroke14 = piePlot3D5.getOutlineStroke();
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) (-1.0d), stroke14);
        piePlot3D0.setSimpleLabels(true);
        java.lang.Object obj18 = piePlot3D0.clone();
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setInteriorGap(100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (100.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.data.general.PieDataset pieDataset3 = piePlot3D0.getDataset();
        java.awt.Paint paint5 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) (short) 100);
        piePlot3D0.setLabelLinksVisible(true);
        boolean boolean8 = piePlot3D0.getDarkerSides();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieDataset3);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        double double4 = piePlot3D0.getStartAngle();
        org.jfree.data.general.DatasetGroup datasetGroup5 = piePlot3D0.getDatasetGroup();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = piePlot3D0.getToolTipGenerator();
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D7.setLabelPadding(rectangleInsets8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        piePlot3D7.handleClick((int) (short) 100, 0, plotRenderingInfo12);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator14 = piePlot3D7.getURLGenerator();
        java.awt.Stroke stroke16 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D7.setSectionOutlineStroke((java.lang.Comparable) 0.4d, stroke16);
        piePlot3D0.setBaseSectionOutlineStroke(stroke16);
        piePlot3D0.setIgnoreNullValues(true);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 90.0d + "'", double4 == 90.0d);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertNull(pieToolTipGenerator6);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNull(pieURLGenerator14);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot3D0.getURLGenerator();
        java.awt.Stroke stroke9 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke9);
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D11.setLabelPadding(rectangleInsets12);
        java.awt.Paint paint14 = piePlot3D11.getLabelLinkPaint();
        boolean boolean15 = piePlot3D11.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        piePlot3D11.notifyListeners(plotChangeEvent16);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3D11.getSimpleLabelOffset();
        piePlot3D0.setSimpleLabelOffset(rectangleInsets18);
        java.awt.Font font20 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D0.setNoDataMessageFont(font20);
        org.jfree.data.general.PieDataset pieDataset22 = piePlot3D0.getDataset();
        boolean boolean23 = piePlot3D0.getSimpleLabels();
        java.awt.Paint paint24 = piePlot3D0.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D25.setSectionOutlinesVisible(true);
        piePlot3D25.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        piePlot3D25.drawBackgroundImage(graphics2D30, rectangle2D31);
        java.awt.Paint paint33 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D25.setNoDataMessagePaint(paint33);
        java.awt.Paint paint35 = piePlot3D25.getLabelOutlinePaint();
        java.awt.Graphics2D graphics2D36 = null;
        java.awt.geom.Rectangle2D rectangle2D37 = null;
        piePlot3D25.drawBackgroundImage(graphics2D36, rectangle2D37);
        java.awt.Paint paint40 = piePlot3D25.getSectionPaint((java.lang.Comparable) 0.0d);
        java.awt.Paint paint42 = piePlot3D25.getSectionOutlinePaint((java.lang.Comparable) (short) 1);
        double double43 = piePlot3D25.getLabelGap();
        org.jfree.chart.plot.PiePlot3D piePlot3D44 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D44.setLabelPadding(rectangleInsets45);
        java.awt.Paint paint47 = piePlot3D44.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator48 = null;
        piePlot3D44.setLegendLabelToolTipGenerator(pieSectionLabelGenerator48);
        piePlot3D44.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot52 = piePlot3D44.getRootPlot();
        java.awt.Stroke stroke53 = piePlot3D44.getOutlineStroke();
        double double54 = piePlot3D44.getMaximumLabelWidth();
        int int55 = piePlot3D44.getPieIndex();
        java.awt.Paint paint56 = piePlot3D44.getNoDataMessagePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D57 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D57.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke61 = piePlot3D57.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator62 = piePlot3D57.getLegendLabelGenerator();
        piePlot3D44.setLabelGenerator(pieSectionLabelGenerator62);
        piePlot3D25.setLegendLabelToolTipGenerator(pieSectionLabelGenerator62);
        piePlot3D0.setLegendLabelGenerator(pieSectionLabelGenerator62);
        boolean boolean66 = piePlot3D0.getSimpleLabels();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNull(pieDataset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNull(paint40);
        org.junit.Assert.assertNull(paint42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.025d + "'", double43 == 0.025d);
        org.junit.Assert.assertNotNull(rectangleInsets45);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(plot52);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.14d + "'", double54 == 0.14d);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNull(stroke61);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot3D0.getDatasetGroup();
        piePlot3D0.setSimpleLabels(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot3D0.getSimpleLabelOffset();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot3D0.getURLGenerator();
        java.awt.Stroke stroke9 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke9);
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D11.setLabelPadding(rectangleInsets12);
        java.awt.Paint paint14 = piePlot3D11.getLabelLinkPaint();
        boolean boolean15 = piePlot3D11.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        piePlot3D11.notifyListeners(plotChangeEvent16);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3D11.getSimpleLabelOffset();
        piePlot3D0.setSimpleLabelOffset(rectangleInsets18);
        java.awt.Font font20 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D0.setNoDataMessageFont(font20);
        org.jfree.data.general.PieDataset pieDataset22 = piePlot3D0.getDataset();
        boolean boolean23 = piePlot3D0.getSimpleLabels();
        java.awt.Paint paint24 = piePlot3D0.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D25.setSectionOutlinesVisible(true);
        piePlot3D25.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        piePlot3D25.drawBackgroundImage(graphics2D30, rectangle2D31);
        java.awt.Paint paint33 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D25.setNoDataMessagePaint(paint33);
        java.awt.Paint paint35 = piePlot3D25.getLabelOutlinePaint();
        java.awt.Graphics2D graphics2D36 = null;
        java.awt.geom.Rectangle2D rectangle2D37 = null;
        piePlot3D25.drawBackgroundImage(graphics2D36, rectangle2D37);
        java.awt.Paint paint40 = piePlot3D25.getSectionPaint((java.lang.Comparable) 0.0d);
        java.awt.Paint paint42 = piePlot3D25.getSectionOutlinePaint((java.lang.Comparable) (short) 1);
        double double43 = piePlot3D25.getLabelGap();
        org.jfree.chart.plot.PiePlot3D piePlot3D44 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D44.setLabelPadding(rectangleInsets45);
        java.awt.Paint paint47 = piePlot3D44.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator48 = null;
        piePlot3D44.setLegendLabelToolTipGenerator(pieSectionLabelGenerator48);
        piePlot3D44.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot52 = piePlot3D44.getRootPlot();
        java.awt.Stroke stroke53 = piePlot3D44.getOutlineStroke();
        double double54 = piePlot3D44.getMaximumLabelWidth();
        int int55 = piePlot3D44.getPieIndex();
        java.awt.Paint paint56 = piePlot3D44.getNoDataMessagePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D57 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D57.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke61 = piePlot3D57.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator62 = piePlot3D57.getLegendLabelGenerator();
        piePlot3D44.setLabelGenerator(pieSectionLabelGenerator62);
        piePlot3D25.setLegendLabelToolTipGenerator(pieSectionLabelGenerator62);
        piePlot3D0.setLegendLabelGenerator(pieSectionLabelGenerator62);
        // The following exception was thrown during execution in test generation
        try {
            double double66 = piePlot3D0.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNull(pieDataset22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNull(paint40);
        org.junit.Assert.assertNull(paint42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.025d + "'", double43 == 0.025d);
        org.junit.Assert.assertNotNull(rectangleInsets45);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(plot52);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.14d + "'", double54 == 0.14d);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNull(stroke61);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator62);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.awt.Stroke stroke9 = piePlot3D0.getOutlineStroke();
        double double10 = piePlot3D0.getMaximumLabelWidth();
        int int11 = piePlot3D0.getPieIndex();
        double double12 = piePlot3D0.getStartAngle();
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D13.setLabelPadding(rectangleInsets14);
        java.awt.Paint paint16 = piePlot3D13.getLabelLinkPaint();
        java.awt.Paint paint17 = piePlot3D13.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D18.setLabelPadding(rectangleInsets19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        piePlot3D18.handleClick((int) (short) 100, 0, plotRenderingInfo23);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator25 = piePlot3D18.getURLGenerator();
        java.awt.Paint paint26 = piePlot3D18.getLabelOutlinePaint();
        piePlot3D13.setLabelShadowPaint(paint26);
        org.jfree.data.general.DatasetGroup datasetGroup28 = piePlot3D13.getDatasetGroup();
        piePlot3D13.setCircular(true);
        java.awt.Stroke stroke31 = piePlot3D13.getLabelOutlineStroke();
        piePlot3D0.setOutlineStroke(stroke31);
        org.jfree.chart.plot.PiePlot3D piePlot3D33 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D33.setLabelPadding(rectangleInsets34);
        java.awt.Paint paint36 = piePlot3D33.getLabelLinkPaint();
        boolean boolean37 = piePlot3D33.getLabelLinksVisible();
        piePlot3D33.setOutlineVisible(false);
        java.awt.Stroke stroke40 = piePlot3D33.getLabelOutlineStroke();
        piePlot3D0.setLabelLinkStroke(stroke40);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 90.0d + "'", double12 == 90.0d);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNull(pieURLGenerator25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNull(datasetGroup28);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(rectangleInsets34);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(stroke40);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot3D0.getInsets();
        java.awt.Paint paint6 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D0.setShadowPaint(paint6);
        piePlot3D0.setIgnoreZeroValues(true);
        java.awt.Stroke stroke10 = piePlot3D0.getBaseSectionOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setInteriorGap((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (-1.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        piePlot3D0.removeChangeListener(plotChangeListener8);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.drawOutline(graphics2D10, rectangle2D11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets3);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        boolean boolean2 = piePlot3D1.getLabelLinksVisible();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = null;
        piePlot3D1.setURLGenerator(pieURLGenerator3);
        piePlot3D1.setMinimumArcAngleToDraw(0.08d);
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D7.setLabelPadding(rectangleInsets8);
        java.awt.Paint paint10 = piePlot3D7.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator11 = null;
        piePlot3D7.setLegendLabelToolTipGenerator(pieSectionLabelGenerator11);
        piePlot3D7.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot15 = piePlot3D7.getRootPlot();
        java.awt.Stroke stroke16 = piePlot3D7.getOutlineStroke();
        double double17 = piePlot3D7.getMaximumLabelWidth();
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D18.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot3D18.getLabelPadding();
        piePlot3D18.setShadowXOffset(10.0d);
        piePlot3D18.setCircular(false);
        piePlot3D18.setLabelGap((double) (short) 1);
        java.awt.Paint paint28 = piePlot3D18.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D29 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D29.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = piePlot3D29.getLabelPadding();
        java.awt.Font font33 = piePlot3D29.getNoDataMessageFont();
        java.awt.Paint paint34 = piePlot3D29.getOutlinePaint();
        piePlot3D18.setLabelOutlinePaint(paint34);
        org.jfree.chart.plot.PiePlot3D piePlot3D36 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D36.setSectionOutlinesVisible(true);
        piePlot3D36.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D41 = null;
        java.awt.geom.Rectangle2D rectangle2D42 = null;
        piePlot3D36.drawBackgroundImage(graphics2D41, rectangle2D42);
        java.awt.Paint paint44 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D36.setNoDataMessagePaint(paint44);
        double double46 = piePlot3D36.getShadowYOffset();
        java.awt.Stroke stroke47 = piePlot3D36.getBaseSectionOutlineStroke();
        piePlot3D18.setBaseSectionOutlineStroke(stroke47);
        java.awt.Paint paint49 = piePlot3D18.getLabelOutlinePaint();
        piePlot3D7.setLabelShadowPaint(paint49);
        org.jfree.chart.plot.PiePlot3D piePlot3D51 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets52 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D51.setLabelPadding(rectangleInsets52);
        java.awt.Paint paint54 = piePlot3D51.getLabelLinkPaint();
        java.awt.Paint paint55 = piePlot3D51.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D56 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets57 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D56.setLabelPadding(rectangleInsets57);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo61 = null;
        piePlot3D56.handleClick((int) (short) 100, 0, plotRenderingInfo61);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator63 = piePlot3D56.getURLGenerator();
        java.awt.Paint paint64 = piePlot3D56.getLabelOutlinePaint();
        piePlot3D51.setLabelShadowPaint(paint64);
        org.jfree.data.general.DatasetGroup datasetGroup66 = piePlot3D51.getDatasetGroup();
        piePlot3D51.setCircular(true);
        java.awt.Stroke stroke69 = piePlot3D51.getLabelOutlineStroke();
        piePlot3D51.setLabelLinkMargin((-1.0d));
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator72 = piePlot3D51.getLegendLabelGenerator();
        piePlot3D7.setLegendLabelToolTipGenerator(pieSectionLabelGenerator72);
        piePlot3D1.setLegendLabelGenerator(pieSectionLabelGenerator72);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.14d + "'", double17 == 0.14d);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(rectangleInsets32);
        org.junit.Assert.assertNotNull(font33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 4.0d + "'", double46 == 4.0d);
        org.junit.Assert.assertNotNull(stroke47);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(rectangleInsets52);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNotNull(rectangleInsets57);
        org.junit.Assert.assertNull(pieURLGenerator63);
        org.junit.Assert.assertNotNull(paint64);
        org.junit.Assert.assertNull(datasetGroup66);
        org.junit.Assert.assertNotNull(stroke69);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator72);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        java.awt.Paint paint10 = piePlot3D0.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D11.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot3D11.getLabelPadding();
        java.awt.Font font15 = piePlot3D11.getNoDataMessageFont();
        java.awt.Paint paint16 = piePlot3D11.getOutlinePaint();
        piePlot3D0.setLabelOutlinePaint(paint16);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        piePlot3D0.handleClick((int) '#', (int) '#', plotRenderingInfo20);
        piePlot3D0.setShadowXOffset((double) 0);
        boolean boolean24 = piePlot3D0.isCircular();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        org.jfree.chart.plot.Plot plot6 = piePlot3D0.getParent();
        java.awt.Paint paint7 = piePlot3D0.getShadowPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = piePlot3D0.getInsets();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(rectangleInsets8);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D5.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = piePlot3D5.getLabelPadding();
        piePlot3D5.setShadowXOffset(10.0d);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent11 = null;
        piePlot3D5.datasetChanged(datasetChangeEvent11);
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D14.setSectionOutlinesVisible(true);
        piePlot3D14.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        piePlot3D14.drawBackgroundImage(graphics2D19, rectangle2D20);
        piePlot3D14.zoom((double) '#');
        double double24 = piePlot3D14.getShadowXOffset();
        java.awt.Stroke stroke25 = piePlot3D14.getLabelOutlineStroke();
        piePlot3D5.setSectionOutlineStroke((java.lang.Comparable) 0.14d, stroke25);
        piePlot3D0.setOutlineStroke(stroke25);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertNotNull(stroke25);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        piePlot3D0.removeChangeListener(plotChangeListener8);
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setLabelPadding(rectangleInsets11);
        org.jfree.data.general.PieDataset pieDataset13 = piePlot3D10.getDataset();
        boolean boolean14 = piePlot3D10.isCircular();
        java.awt.Stroke stroke15 = piePlot3D10.getOutlineStroke();
        piePlot3D0.setLabelLinkStroke(stroke15);
        java.lang.Class<?> wildcardClass17 = stroke15.getClass();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNull(pieDataset13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        java.awt.Font font4 = piePlot3D0.getNoDataMessageFont();
        int int5 = piePlot3D0.getPieIndex();
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D6.setSectionOutlinesVisible(true);
        piePlot3D6.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot3D6.drawBackgroundImage(graphics2D11, rectangle2D12);
        java.awt.Paint paint14 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D6.setNoDataMessagePaint(paint14);
        java.awt.Paint paint16 = piePlot3D6.getLabelOutlinePaint();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        piePlot3D6.drawBackgroundImage(graphics2D17, rectangle2D18);
        java.awt.Paint paint21 = piePlot3D6.getSectionPaint((java.lang.Comparable) 0.0d);
        java.awt.Paint paint23 = piePlot3D6.getSectionOutlinePaint((java.lang.Comparable) (short) 1);
        java.awt.Paint paint24 = piePlot3D6.getNoDataMessagePaint();
        piePlot3D0.setBackgroundPaint(paint24);
        boolean boolean26 = piePlot3D0.getIgnoreNullValues();
        org.jfree.chart.util.Rotation rotation27 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setDirection(rotation27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'direction' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D5.setLabelPadding(rectangleInsets6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        piePlot3D5.handleClick((int) (short) 100, 0, plotRenderingInfo10);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = piePlot3D5.getURLGenerator();
        java.awt.Paint paint13 = piePlot3D5.getLabelOutlinePaint();
        piePlot3D0.setLabelShadowPaint(paint13);
        java.lang.Object obj15 = piePlot3D0.clone();
        boolean boolean16 = piePlot3D0.getSectionOutlinesVisible();
        piePlot3D0.setStartAngle((double) (short) 0);
        double double19 = piePlot3D0.getMinimumArcAngleToDraw();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(pieURLGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0E-5d + "'", double19 == 1.0E-5d);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot3D0.getURLGenerator();
        java.awt.Stroke stroke9 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke9);
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D11.setLabelPadding(rectangleInsets12);
        java.awt.Paint paint14 = piePlot3D11.getLabelLinkPaint();
        boolean boolean15 = piePlot3D11.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        piePlot3D11.notifyListeners(plotChangeEvent16);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3D11.getSimpleLabelOffset();
        piePlot3D0.setSimpleLabelOffset(rectangleInsets18);
        java.awt.Font font20 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D0.setNoDataMessageFont(font20);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = null;
        piePlot3D0.setURLGenerator(pieURLGenerator22);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(font20);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        java.awt.Font font4 = piePlot3D0.getNoDataMessageFont();
        java.awt.Paint paint5 = piePlot3D0.getShadowPaint();
        piePlot3D0.setStartAngle((double) (-1.0f));
        double double8 = piePlot3D0.getStartAngle();
        piePlot3D0.setDarkerSides(true);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getDepthFactor();
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D6.setLabelPadding(rectangleInsets7);
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean11 = piePlot3D10.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator12 = null;
        piePlot3D10.setToolTipGenerator(pieToolTipGenerator12);
        java.awt.Paint paint14 = piePlot3D10.getShadowPaint();
        piePlot3D6.setSectionPaint((java.lang.Comparable) (short) -1, paint14);
        piePlot3D0.setLabelPaint(paint14);
        java.awt.Paint paint17 = piePlot3D0.getOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D18.setLabelPadding(rectangleInsets19);
        java.awt.Paint paint21 = piePlot3D18.getLabelLinkPaint();
        boolean boolean22 = piePlot3D18.getLabelLinksVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D23 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D23.setLabelPadding(rectangleInsets24);
        piePlot3D18.setSimpleLabelOffset(rectangleInsets24);
        java.awt.Font font27 = piePlot3D18.getLabelFont();
        piePlot3D0.setNoDataMessageFont(font27);
        java.awt.Paint paint29 = piePlot3D0.getOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D30 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D30.setLabelPadding(rectangleInsets31);
        java.awt.Paint paint33 = piePlot3D30.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator34 = null;
        piePlot3D30.setLegendLabelToolTipGenerator(pieSectionLabelGenerator34);
        piePlot3D30.setLabelLinkMargin(0.0d);
        piePlot3D30.setShadowXOffset(1.0d);
        java.awt.Paint paint40 = piePlot3D30.getLabelOutlinePaint();
        piePlot3D0.setShadowPaint(paint40);
        java.awt.Graphics2D graphics2D42 = null;
        java.awt.geom.Rectangle2D rectangle2D43 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D44 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D44.setLabelPadding(rectangleInsets45);
        java.awt.Paint paint47 = piePlot3D44.getLabelLinkPaint();
        piePlot3D44.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint50 = piePlot3D44.getLabelOutlinePaint();
        int int51 = piePlot3D44.getPieIndex();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo53 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState54 = piePlot3D0.initialise(graphics2D42, rectangle2D43, (org.jfree.chart.plot.PiePlot) piePlot3D44, (java.lang.Integer) 0, plotRenderingInfo53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.12d + "'", double5 == 0.12d);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(rectangleInsets45);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean1 = piePlot3D0.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator2);
        org.jfree.chart.plot.PiePlot3D piePlot3D4 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D4.setSectionOutlinesVisible(true);
        piePlot3D4.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        piePlot3D4.drawBackgroundImage(graphics2D9, rectangle2D10);
        java.awt.Paint paint12 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D4.setNoDataMessagePaint(paint12);
        java.awt.Stroke stroke14 = piePlot3D4.getLabelOutlineStroke();
        piePlot3D0.setLabelOutlineStroke(stroke14);
        boolean boolean16 = piePlot3D0.getIgnoreNullValues();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        piePlot3D0.handleClick(0, 0, plotRenderingInfo19);
        java.awt.Stroke stroke21 = null;
        piePlot3D0.setOutlineStroke(stroke21);
        piePlot3D0.setIgnoreZeroValues(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setDarkerSides(false);
        boolean boolean3 = piePlot3D0.isOutlineVisible();
        boolean boolean4 = piePlot3D0.getIgnoreNullValues();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot3D0.getLegendLabelToolTipGenerator();
        java.awt.Paint paint6 = piePlot3D0.getBackgroundPaint();
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setBackgroundImageAlpha(10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(pieSectionLabelGenerator5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        piePlot3D0.setOutlineVisible(false);
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        piePlot3D0.removeChangeListener(plotChangeListener7);
        java.awt.Stroke stroke9 = piePlot3D0.getOutlineStroke();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.awt.Stroke stroke9 = piePlot3D0.getOutlineStroke();
        double double10 = piePlot3D0.getMaximumLabelWidth();
        int int11 = piePlot3D0.getPieIndex();
        java.awt.Paint paint12 = piePlot3D0.getNoDataMessagePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D13.setLabelPadding(rectangleInsets14);
        java.awt.Paint paint16 = piePlot3D13.getLabelLinkPaint();
        boolean boolean17 = piePlot3D13.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent18 = null;
        piePlot3D13.notifyListeners(plotChangeEvent18);
        piePlot3D13.setOutlineVisible(true);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator22 = piePlot3D13.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot3D piePlot3D23 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D23.setSectionOutlinesVisible(true);
        piePlot3D23.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        piePlot3D23.drawBackgroundImage(graphics2D28, rectangle2D29);
        java.awt.Paint paint31 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D23.setNoDataMessagePaint(paint31);
        java.awt.Stroke stroke33 = piePlot3D23.getLabelOutlineStroke();
        org.jfree.chart.plot.PiePlot3D piePlot3D34 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D34.setLabelPadding(rectangleInsets35);
        java.awt.Paint paint37 = piePlot3D34.getLabelLinkPaint();
        boolean boolean38 = piePlot3D34.getLabelLinksVisible();
        double double39 = piePlot3D34.getDepthFactor();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator40 = piePlot3D34.getLabelGenerator();
        piePlot3D23.setLabelGenerator(pieSectionLabelGenerator40);
        org.jfree.chart.plot.PiePlot3D piePlot3D42 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D42.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = piePlot3D42.getLabelPadding();
        java.awt.Font font46 = piePlot3D42.getNoDataMessageFont();
        piePlot3D23.setNoDataMessageFont(font46);
        piePlot3D13.setLabelFont(font46);
        piePlot3D0.setNoDataMessageFont(font46);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(pieSectionLabelGenerator22);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(rectangleInsets35);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.12d + "'", double39 == 0.12d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator40);
        org.junit.Assert.assertNotNull(rectangleInsets45);
        org.junit.Assert.assertNotNull(font46);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D5.setLabelPadding(rectangleInsets6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        piePlot3D5.handleClick((int) (short) 100, 0, plotRenderingInfo10);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = piePlot3D5.getURLGenerator();
        java.awt.Paint paint13 = piePlot3D5.getLabelOutlinePaint();
        piePlot3D0.setLabelShadowPaint(paint13);
        java.lang.Object obj15 = piePlot3D0.clone();
        boolean boolean16 = piePlot3D0.getSectionOutlinesVisible();
        java.awt.Paint paint17 = piePlot3D0.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D18.setLabelPadding(rectangleInsets19);
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean23 = piePlot3D22.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator24 = null;
        piePlot3D22.setToolTipGenerator(pieToolTipGenerator24);
        java.awt.Paint paint26 = piePlot3D22.getShadowPaint();
        piePlot3D18.setSectionPaint((java.lang.Comparable) (short) -1, paint26);
        org.jfree.data.general.PieDataset pieDataset28 = piePlot3D18.getDataset();
        piePlot3D18.setExplodePercent((java.lang.Comparable) 0.0d, 100.0d);
        double double32 = piePlot3D18.getLabelGap();
        java.awt.Paint paint33 = piePlot3D18.getLabelPaint();
        piePlot3D0.setShadowPaint(paint33);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(pieURLGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNull(pieDataset28);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.025d + "'", double32 == 0.025d);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        java.awt.Font font4 = piePlot3D0.getNoDataMessageFont();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) 0, stroke6);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator8 = piePlot3D0.getToolTipGenerator();
        java.awt.Paint paint9 = piePlot3D0.getBackgroundPaint();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(pieToolTipGenerator8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D0.setNoDataMessagePaint(paint8);
        java.awt.Paint paint10 = piePlot3D0.getLabelOutlinePaint();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot3D0.drawBackgroundImage(graphics2D11, rectangle2D12);
        java.awt.Paint paint15 = piePlot3D0.getSectionPaint((java.lang.Comparable) 0.0d);
        java.awt.Paint paint17 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) (short) 1);
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D18.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot3D18.getLabelPadding();
        piePlot3D18.setShadowXOffset(10.0d);
        piePlot3D18.setCircular(false);
        piePlot3D18.setLabelGap((double) (short) 1);
        java.awt.Paint paint28 = piePlot3D18.getBaseSectionOutlinePaint();
        piePlot3D0.setLabelPaint(paint28);
        float float30 = piePlot3D0.getBackgroundImageAlpha();
        org.jfree.chart.plot.PiePlot3D piePlot3D31 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D31.setLabelPadding(rectangleInsets32);
        java.awt.Paint paint34 = piePlot3D31.getLabelLinkPaint();
        boolean boolean35 = piePlot3D31.getLabelLinksVisible();
        piePlot3D31.setOutlineVisible(false);
        java.awt.Paint paint38 = piePlot3D31.getLabelPaint();
        org.jfree.chart.util.Rotation rotation39 = piePlot3D31.getDirection();
        piePlot3D0.setDirection(rotation39);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.5f + "'", float30 == 0.5f);
        org.junit.Assert.assertNotNull(rectangleInsets32);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(rotation39);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        java.awt.Paint paint10 = piePlot3D0.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke11 = piePlot3D0.getLabelLinkStroke();
        double double12 = piePlot3D0.getMaximumLabelWidth();
        int int13 = piePlot3D0.getPieIndex();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean1 = piePlot3D0.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator2);
        org.jfree.chart.plot.PiePlot3D piePlot3D4 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D4.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke8 = piePlot3D4.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator9 = piePlot3D4.getLegendLabelGenerator();
        piePlot3D0.setLabelGenerator(pieSectionLabelGenerator9);
        java.awt.Stroke stroke11 = piePlot3D0.getOutlineStroke();
        piePlot3D0.setPieIndex((int) (short) 100);
        boolean boolean14 = piePlot3D0.isOutlineVisible();
        piePlot3D0.setSectionOutlinesVisible(false);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.drawBackground(graphics2D17, rectangle2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot3D0.addChangeListener(plotChangeListener4);
        java.awt.Paint paint6 = piePlot3D0.getShadowPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor7 = piePlot3D0.getLabelDistributor();
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D8.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot3D8.getLabelPadding();
        java.awt.Font font12 = piePlot3D8.getNoDataMessageFont();
        java.awt.Paint paint13 = piePlot3D8.getShadowPaint();
        piePlot3D0.setLabelLinkPaint(paint13);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor7);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setDarkerSides(false);
        boolean boolean3 = piePlot3D0.isOutlineVisible();
        boolean boolean4 = piePlot3D0.getIgnoreNullValues();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D5.setLabelPadding(rectangleInsets6);
        java.awt.Paint paint8 = piePlot3D5.getLabelLinkPaint();
        java.awt.Paint paint9 = piePlot3D5.getShadowPaint();
        java.awt.Shape shape10 = piePlot3D5.getLegendItemShape();
        piePlot3D0.setLegendItemShape(shape10);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D(pieDataset13);
        java.awt.Paint paint15 = piePlot3D14.getBaseSectionPaint();
        java.awt.Stroke stroke16 = piePlot3D14.getOutlineStroke();
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) (byte) 100, stroke16);
        java.awt.Font font18 = piePlot3D0.getNoDataMessageFont();
        java.awt.Paint paint19 = piePlot3D0.getLabelLinkPaint();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot3D0.getInsets();
        org.jfree.chart.plot.Plot plot6 = piePlot3D0.getRootPlot();
        piePlot3D0.setExplodePercent((java.lang.Comparable) 4.0d, 10.0d);
        boolean boolean10 = piePlot3D0.getLabelLinksVisible();
        double double11 = piePlot3D0.getMaximumLabelWidth();
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D12.setSectionOutlinesVisible(true);
        piePlot3D12.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        piePlot3D12.drawBackgroundImage(graphics2D17, rectangle2D18);
        java.awt.Paint paint20 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D12.setNoDataMessagePaint(paint20);
        java.awt.Paint paint22 = piePlot3D12.getLabelOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset23 = piePlot3D12.getDataset();
        org.jfree.chart.plot.PiePlot3D piePlot3D24 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D24.setLabelPadding(rectangleInsets25);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        piePlot3D24.handleClick((int) (short) 100, 0, plotRenderingInfo29);
        boolean boolean31 = piePlot3D24.getSectionOutlinesVisible();
        java.awt.Paint paint32 = piePlot3D24.getBaseSectionPaint();
        piePlot3D12.setBackgroundPaint(paint32);
        piePlot3D0.setLabelBackgroundPaint(paint32);
        org.jfree.chart.plot.PiePlot3D piePlot3D35 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D35.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = piePlot3D35.getLabelPadding();
        java.awt.Font font39 = piePlot3D35.getNoDataMessageFont();
        java.awt.Paint paint40 = piePlot3D35.getOutlinePaint();
        java.awt.Font font41 = piePlot3D35.getNoDataMessageFont();
        piePlot3D0.setLabelFont(font41);
        java.awt.Graphics2D graphics2D43 = null;
        java.awt.geom.Rectangle2D rectangle2D44 = null;
        java.awt.geom.Point2D point2D45 = null;
        org.jfree.chart.plot.PlotState plotState46 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo47 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.draw(graphics2D43, rectangle2D44, point2D45, plotState46, plotRenderingInfo47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.14d + "'", double11 == 0.14d);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(pieDataset23);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(rectangleInsets38);
        org.junit.Assert.assertNotNull(font39);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(font41);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.awt.Stroke stroke9 = piePlot3D0.getOutlineStroke();
        double double10 = piePlot3D0.getMaximumLabelWidth();
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D11.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot3D11.getLabelPadding();
        piePlot3D11.setShadowXOffset(10.0d);
        piePlot3D11.setCircular(false);
        piePlot3D11.setLabelGap((double) (short) 1);
        java.awt.Paint paint21 = piePlot3D11.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D22.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = piePlot3D22.getLabelPadding();
        java.awt.Font font26 = piePlot3D22.getNoDataMessageFont();
        java.awt.Paint paint27 = piePlot3D22.getOutlinePaint();
        piePlot3D11.setLabelOutlinePaint(paint27);
        org.jfree.chart.plot.PiePlot3D piePlot3D29 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D29.setSectionOutlinesVisible(true);
        piePlot3D29.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        piePlot3D29.drawBackgroundImage(graphics2D34, rectangle2D35);
        java.awt.Paint paint37 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D29.setNoDataMessagePaint(paint37);
        double double39 = piePlot3D29.getShadowYOffset();
        java.awt.Stroke stroke40 = piePlot3D29.getBaseSectionOutlineStroke();
        piePlot3D11.setBaseSectionOutlineStroke(stroke40);
        java.awt.Paint paint42 = piePlot3D11.getLabelOutlinePaint();
        piePlot3D0.setLabelShadowPaint(paint42);
        org.jfree.chart.plot.PiePlot3D piePlot3D44 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D44.setLabelPadding(rectangleInsets45);
        java.awt.Paint paint47 = piePlot3D44.getLabelLinkPaint();
        java.awt.Paint paint48 = piePlot3D44.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D49 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets50 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D49.setLabelPadding(rectangleInsets50);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo54 = null;
        piePlot3D49.handleClick((int) (short) 100, 0, plotRenderingInfo54);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator56 = piePlot3D49.getURLGenerator();
        java.awt.Paint paint57 = piePlot3D49.getLabelOutlinePaint();
        piePlot3D44.setLabelShadowPaint(paint57);
        org.jfree.data.general.DatasetGroup datasetGroup59 = piePlot3D44.getDatasetGroup();
        piePlot3D44.setCircular(true);
        java.awt.Stroke stroke62 = piePlot3D44.getLabelOutlineStroke();
        piePlot3D44.setLabelLinkMargin((-1.0d));
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator65 = piePlot3D44.getLegendLabelGenerator();
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator65);
        java.awt.Paint paint67 = piePlot3D0.getLabelLinkPaint();
        piePlot3D0.setSectionOutlinesVisible(false);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 4.0d + "'", double39 == 4.0d);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(rectangleInsets45);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNotNull(rectangleInsets50);
        org.junit.Assert.assertNull(pieURLGenerator56);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertNull(datasetGroup59);
        org.junit.Assert.assertNotNull(stroke62);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator65);
        org.junit.Assert.assertNotNull(paint67);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot3D0.getInsets();
        java.awt.Paint paint6 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D0.setShadowPaint(paint6);
        boolean boolean8 = piePlot3D0.getSimpleLabels();
        double double9 = piePlot3D0.getDepthFactor();
        double double10 = piePlot3D0.getDepthFactor();
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D12.setLabelPadding(rectangleInsets13);
        java.awt.Paint paint15 = piePlot3D12.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator16 = null;
        piePlot3D12.setLegendLabelToolTipGenerator(pieSectionLabelGenerator16);
        piePlot3D12.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot20 = piePlot3D12.getRootPlot();
        java.awt.Stroke stroke21 = piePlot3D12.getOutlineStroke();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator22 = piePlot3D12.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.Plot plot23 = piePlot3D12.getParent();
        java.awt.Paint paint24 = piePlot3D12.getLabelOutlinePaint();
        piePlot3D0.setSectionPaint((java.lang.Comparable) 'a', paint24);
        java.awt.Font font26 = piePlot3D0.getLabelFont();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor27 = piePlot3D0.getLabelDistributor();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.12d + "'", double9 == 0.12d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12d + "'", double10 == 0.12d);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNull(pieSectionLabelGenerator22);
        org.junit.Assert.assertNull(plot23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor27);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        double double7 = piePlot3D0.getDepthFactor();
        int int8 = piePlot3D0.getPieIndex();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        piePlot3D0.notifyListeners(plotChangeEvent9);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot3D0.drawBackgroundImage(graphics2D11, rectangle2D12);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.drawOutline(graphics2D14, rectangle2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12d + "'", double7 == 0.12d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle(4.0d);
        piePlot3D0.setInteriorGap(1.0E-5d);
        java.awt.Font font14 = piePlot3D0.getNoDataMessageFont();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator15 = piePlot3D0.getToolTipGenerator();
        double double16 = piePlot3D0.getShadowXOffset();
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D17.setSectionOutlinesVisible(true);
        piePlot3D17.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        piePlot3D17.drawBackgroundImage(graphics2D22, rectangle2D23);
        java.awt.Paint paint25 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D17.setNoDataMessagePaint(paint25);
        boolean boolean27 = piePlot3D17.isSubplot();
        piePlot3D0.setParent((org.jfree.chart.plot.Plot) piePlot3D17);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent29 = null;
        piePlot3D0.datasetChanged(datasetChangeEvent29);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNull(pieToolTipGenerator15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke4 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot3D0.getLegendLabelGenerator();
        piePlot3D0.setLabelGap(0.12d);
        piePlot3D0.setMaximumLabelWidth((double) (short) 10);
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator5);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D7.setLabelPadding(rectangleInsets8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        piePlot3D7.handleClick((int) (short) 100, 0, plotRenderingInfo12);
        boolean boolean14 = piePlot3D7.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D15 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D15.setLabelPadding(rectangleInsets16);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        piePlot3D15.handleClick((int) (short) 100, 0, plotRenderingInfo20);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = piePlot3D15.getURLGenerator();
        java.awt.Stroke stroke24 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D15.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke24);
        piePlot3D7.setLabelOutlineStroke(stroke24);
        piePlot3D0.setLabelLinkStroke(stroke24);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor28 = piePlot3D0.getLabelDistributor();
        org.jfree.chart.plot.PiePlot3D piePlot3D29 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D29.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke33 = piePlot3D29.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator34 = piePlot3D29.getLegendLabelGenerator();
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator34);
        float float36 = piePlot3D0.getBackgroundAlpha();
        piePlot3D0.setIgnoreNullValues(false);
        java.awt.Paint paint39 = piePlot3D0.getLabelPaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier40 = piePlot3D0.getDrawingSupplier();
        java.lang.String str41 = piePlot3D0.getPlotType();
        piePlot3D0.setPieIndex((int) (short) -1);
        double double44 = piePlot3D0.getLabelLinkMargin();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent45 = null;
        piePlot3D0.notifyListeners(plotChangeEvent45);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNull(pieURLGenerator22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor28);
        org.junit.Assert.assertNull(stroke33);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator34);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 1.0f + "'", float36 == 1.0f);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(drawingSupplier40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Pie 3D Plot" + "'", str41, "Pie 3D Plot");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.025d + "'", double44 == 0.025d);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        double double4 = piePlot3D0.getShadowYOffset();
        boolean boolean5 = piePlot3D0.getIgnoreNullValues();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent6 = null;
        piePlot3D0.markerChanged(markerChangeEvent6);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        piePlot3D0.axisChanged(axisChangeEvent8);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        boolean boolean5 = piePlot3D0.isCircular();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D0.getLegendLabelGenerator();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        piePlot3D0.handleClick(1, (int) '4', plotRenderingInfo9);
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D11.setLabelPadding(rectangleInsets12);
        org.jfree.chart.plot.PiePlot3D piePlot3D15 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean16 = piePlot3D15.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator17 = null;
        piePlot3D15.setToolTipGenerator(pieToolTipGenerator17);
        java.awt.Paint paint19 = piePlot3D15.getShadowPaint();
        piePlot3D11.setSectionPaint((java.lang.Comparable) (short) -1, paint19);
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D21.setLabelPadding(rectangleInsets22);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        piePlot3D21.handleClick((int) (short) 100, 0, plotRenderingInfo26);
        boolean boolean28 = piePlot3D21.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D29 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D29.setLabelPadding(rectangleInsets30);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo34 = null;
        piePlot3D29.handleClick((int) (short) 100, 0, plotRenderingInfo34);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator36 = piePlot3D29.getURLGenerator();
        java.awt.Stroke stroke38 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D29.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke38);
        piePlot3D21.setLabelOutlineStroke(stroke38);
        piePlot3D11.setLabelLinkStroke(stroke38);
        java.awt.Stroke stroke42 = piePlot3D11.getBaseSectionOutlineStroke();
        piePlot3D0.setLabelOutlineStroke(stroke42);
        float float44 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Paint paint45 = piePlot3D0.getLabelPaint();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNull(pieURLGenerator36);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.5f + "'", float44 == 0.5f);
        org.junit.Assert.assertNotNull(paint45);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getDepthFactor();
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D6.setLabelPadding(rectangleInsets7);
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean11 = piePlot3D10.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator12 = null;
        piePlot3D10.setToolTipGenerator(pieToolTipGenerator12);
        java.awt.Paint paint14 = piePlot3D10.getShadowPaint();
        piePlot3D6.setSectionPaint((java.lang.Comparable) (short) -1, paint14);
        piePlot3D0.setLabelPaint(paint14);
        java.awt.Paint paint17 = piePlot3D0.getOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D18.setLabelPadding(rectangleInsets19);
        java.awt.Paint paint21 = piePlot3D18.getLabelLinkPaint();
        boolean boolean22 = piePlot3D18.getLabelLinksVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D23 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D23.setLabelPadding(rectangleInsets24);
        piePlot3D18.setSimpleLabelOffset(rectangleInsets24);
        java.awt.Font font27 = piePlot3D18.getLabelFont();
        piePlot3D0.setNoDataMessageFont(font27);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent29 = null;
        piePlot3D0.notifyListeners(plotChangeEvent29);
        piePlot3D0.setCircular(false, true);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.12d + "'", double5 == 0.12d);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(font27);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        java.awt.Paint paint10 = piePlot3D0.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke11 = piePlot3D0.getLabelLinkStroke();
        java.awt.Paint paint12 = piePlot3D0.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D13.setLabelPadding(rectangleInsets14);
        java.awt.Paint paint16 = piePlot3D13.getLabelLinkPaint();
        boolean boolean17 = piePlot3D13.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3D13.getInsets();
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D13.setShadowPaint(paint19);
        piePlot3D0.setLabelPaint(paint19);
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D22.setLabelPadding(rectangleInsets23);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        piePlot3D22.handleClick((int) (short) 100, 0, plotRenderingInfo27);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator29 = piePlot3D22.getURLGenerator();
        java.awt.Stroke stroke31 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D22.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke31);
        piePlot3D0.setOutlineStroke(stroke31);
        java.awt.Paint paint34 = null;
        piePlot3D0.setLabelBackgroundPaint(paint34);
        float float36 = piePlot3D0.getForegroundAlpha();
        boolean boolean37 = piePlot3D0.getSectionOutlinesVisible();
        piePlot3D0.setCircular(false);
        org.jfree.chart.plot.PiePlot3D piePlot3D40 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D40.setLabelPadding(rectangleInsets41);
        java.awt.Paint paint43 = piePlot3D40.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener44 = null;
        piePlot3D40.addChangeListener(plotChangeListener44);
        java.awt.Paint paint46 = piePlot3D40.getShadowPaint();
        java.awt.Paint paint47 = piePlot3D40.getLabelOutlinePaint();
        java.awt.Paint paint48 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_SHADOW_PAINT;
        piePlot3D40.setShadowPaint(paint48);
        piePlot3D0.setOutlinePaint(paint48);
        java.awt.Paint paint51 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_OUTLINE_PAINT;
        piePlot3D0.setOutlinePaint(paint51);
        org.jfree.chart.plot.PiePlot3D piePlot3D53 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets54 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D53.setLabelPadding(rectangleInsets54);
        java.awt.Paint paint56 = piePlot3D53.getLabelLinkPaint();
        java.awt.Paint paint57 = piePlot3D53.getShadowPaint();
        piePlot3D53.setShadowXOffset((double) 15);
        org.jfree.chart.plot.PiePlot3D piePlot3D60 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets61 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D60.setLabelPadding(rectangleInsets61);
        java.awt.Paint paint63 = piePlot3D60.getLabelLinkPaint();
        boolean boolean64 = piePlot3D60.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets65 = piePlot3D60.getInsets();
        java.awt.Image image66 = null;
        piePlot3D60.setBackgroundImage(image66);
        java.awt.Paint paint68 = piePlot3D60.getShadowPaint();
        piePlot3D53.setLabelLinkPaint(paint68);
        piePlot3D0.setShadowPaint(paint68);
        java.awt.Stroke stroke72 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) '#');
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNull(pieURLGenerator29);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 1.0f + "'", float36 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(rectangleInsets41);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(rectangleInsets54);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertNotNull(rectangleInsets61);
        org.junit.Assert.assertNotNull(paint63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(rectangleInsets65);
        org.junit.Assert.assertNotNull(paint68);
        org.junit.Assert.assertNull(stroke72);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot3D0.getDatasetGroup();
        piePlot3D0.setBackgroundImageAlignment(1);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot3D0.getSimpleLabelOffset();
        float float12 = piePlot3D0.getForegroundAlpha();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot3D0.getDatasetGroup();
        java.awt.Image image9 = piePlot3D0.getBackgroundImage();
        piePlot3D0.setPieIndex(10);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNull(image9);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        piePlot3D0.removeChangeListener(plotChangeListener8);
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D11.setLabelPadding(rectangleInsets12);
        java.awt.Paint paint14 = piePlot3D11.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = null;
        piePlot3D11.setLegendLabelToolTipGenerator(pieSectionLabelGenerator15);
        piePlot3D11.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot19 = piePlot3D11.getRootPlot();
        java.awt.Stroke stroke20 = piePlot3D11.getOutlineStroke();
        double double21 = piePlot3D11.getMaximumLabelWidth();
        int int22 = piePlot3D11.getPieIndex();
        double double23 = piePlot3D11.getStartAngle();
        org.jfree.chart.plot.PiePlot3D piePlot3D24 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D24.setLabelPadding(rectangleInsets25);
        java.awt.Paint paint27 = piePlot3D24.getLabelLinkPaint();
        java.awt.Paint paint28 = piePlot3D24.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D29 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D29.setLabelPadding(rectangleInsets30);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo34 = null;
        piePlot3D29.handleClick((int) (short) 100, 0, plotRenderingInfo34);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator36 = piePlot3D29.getURLGenerator();
        java.awt.Paint paint37 = piePlot3D29.getLabelOutlinePaint();
        piePlot3D24.setLabelShadowPaint(paint37);
        org.jfree.data.general.DatasetGroup datasetGroup39 = piePlot3D24.getDatasetGroup();
        piePlot3D24.setCircular(true);
        java.awt.Stroke stroke42 = piePlot3D24.getLabelOutlineStroke();
        piePlot3D11.setOutlineStroke(stroke42);
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) 1L, stroke42);
        org.jfree.chart.plot.PiePlot3D piePlot3D46 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D46.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke50 = piePlot3D46.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator51 = piePlot3D46.getLegendLabelGenerator();
        piePlot3D46.setLabelGap(0.12d);
        java.awt.Stroke stroke54 = piePlot3D46.getOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) (byte) -1, stroke54);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to java.lang.Byte");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(plot19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.14d + "'", double21 == 0.14d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 90.0d + "'", double23 == 90.0d);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertNull(pieURLGenerator36);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNull(datasetGroup39);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNull(stroke50);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator51);
        org.junit.Assert.assertNotNull(stroke54);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D5.setLabelPadding(rectangleInsets6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        piePlot3D5.handleClick((int) (short) 100, 0, plotRenderingInfo10);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = piePlot3D5.getURLGenerator();
        java.awt.Paint paint13 = piePlot3D5.getLabelOutlinePaint();
        piePlot3D0.setLabelShadowPaint(paint13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = piePlot3D0.getDatasetGroup();
        java.awt.Stroke stroke16 = piePlot3D0.getBaseSectionOutlineStroke();
        java.awt.Paint paint18 = piePlot3D0.getSectionPaint((java.lang.Comparable) '#');
        piePlot3D0.setShadowXOffset((double) 100);
        piePlot3D0.setMaximumLabelWidth((double) 0L);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(pieURLGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(paint18);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        piePlot3D0.zoom((double) '#');
        java.lang.String str10 = piePlot3D0.getNoDataMessage();
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        piePlot3D0.setOutlineVisible(true);
        int int9 = piePlot3D0.getPieIndex();
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setLabelPadding(rectangleInsets11);
        float float13 = piePlot3D10.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        piePlot3D10.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D17.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = piePlot3D17.getLabelPadding();
        piePlot3D10.setSimpleLabelOffset(rectangleInsets20);
        piePlot3D0.setInsets(rectangleInsets20, false);
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.drawBackground(graphics2D24, rectangle2D25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNotNull(rectangleInsets20);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        double double7 = piePlot3D0.getDepthFactor();
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D8.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot3D8.getLabelPadding();
        java.awt.Font font12 = piePlot3D8.getNoDataMessageFont();
        java.awt.Paint paint13 = piePlot3D8.getOutlinePaint();
        java.awt.Font font14 = piePlot3D8.getNoDataMessageFont();
        piePlot3D0.setLabelFont(font14);
        piePlot3D0.setMinimumArcAngleToDraw((double) (byte) 0);
        java.awt.Paint paint19 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) 0);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12d + "'", double7 == 0.12d);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNull(paint19);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        double double7 = piePlot3D0.getDepthFactor();
        double double8 = piePlot3D0.getInteriorGap();
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D9.setLabelPadding(rectangleInsets10);
        java.awt.Paint paint12 = piePlot3D9.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = null;
        piePlot3D9.setLegendLabelToolTipGenerator(pieSectionLabelGenerator13);
        piePlot3D9.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot17 = piePlot3D9.getRootPlot();
        java.awt.Paint paint18 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_OUTLINE_PAINT;
        piePlot3D9.setBaseSectionOutlinePaint(paint18);
        piePlot3D0.setBaseSectionPaint(paint18);
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        piePlot3D0.removeChangeListener(plotChangeListener21);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setLabelPadding(rectangleInsets23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'padding' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12d + "'", double7 == 0.12d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        piePlot3D0.setOutlineVisible(true);
        piePlot3D0.setMinimumArcAngleToDraw((double) (short) 1);
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D12.setLabelPadding(rectangleInsets13);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        piePlot3D12.handleClick((int) (short) 100, 0, plotRenderingInfo17);
        boolean boolean19 = piePlot3D12.getSectionOutlinesVisible();
        java.awt.Paint paint20 = piePlot3D12.getBaseSectionPaint();
        java.awt.Paint paint21 = piePlot3D12.getLabelOutlinePaint();
        piePlot3D0.setLabelBackgroundPaint(paint21);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        java.awt.Paint paint10 = piePlot3D0.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke11 = piePlot3D0.getLabelLinkStroke();
        double double12 = piePlot3D0.getMaximumLabelWidth();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = piePlot3D0.getLabelPadding();
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D14.setLabelPadding(rectangleInsets15);
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean19 = piePlot3D18.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator20 = null;
        piePlot3D18.setToolTipGenerator(pieToolTipGenerator20);
        java.awt.Paint paint22 = piePlot3D18.getShadowPaint();
        piePlot3D14.setSectionPaint((java.lang.Comparable) (short) -1, paint22);
        org.jfree.chart.plot.PiePlot3D piePlot3D24 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D24.setLabelPadding(rectangleInsets25);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        piePlot3D24.handleClick((int) (short) 100, 0, plotRenderingInfo29);
        boolean boolean31 = piePlot3D24.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D32 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D32.setLabelPadding(rectangleInsets33);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        piePlot3D32.handleClick((int) (short) 100, 0, plotRenderingInfo37);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator39 = piePlot3D32.getURLGenerator();
        java.awt.Stroke stroke41 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D32.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke41);
        piePlot3D24.setLabelOutlineStroke(stroke41);
        piePlot3D14.setLabelLinkStroke(stroke41);
        piePlot3D0.setOutlineStroke(stroke41);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator46 = piePlot3D0.getLegendLabelToolTipGenerator();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNull(pieURLGenerator39);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNull(pieSectionLabelGenerator46);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        boolean boolean2 = piePlot3D1.getLabelLinksVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D3 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D3.setLabelPadding(rectangleInsets4);
        java.awt.Paint paint6 = piePlot3D3.getLabelLinkPaint();
        boolean boolean7 = piePlot3D3.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        piePlot3D3.notifyListeners(plotChangeEvent8);
        double double10 = piePlot3D3.getDepthFactor();
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D11.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot3D11.getLabelPadding();
        java.awt.Font font15 = piePlot3D11.getNoDataMessageFont();
        java.awt.Paint paint16 = piePlot3D11.getOutlinePaint();
        java.awt.Font font17 = piePlot3D11.getNoDataMessageFont();
        piePlot3D3.setLabelFont(font17);
        java.awt.Paint paint19 = piePlot3D3.getBaseSectionPaint();
        boolean boolean20 = piePlot3D1.equals((java.lang.Object) piePlot3D3);
        int int21 = piePlot3D1.getPieIndex();
        org.jfree.chart.plot.PiePlot3D piePlot3D23 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D23.setLabelPadding(rectangleInsets24);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        piePlot3D23.handleClick((int) (short) 100, 0, plotRenderingInfo28);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator30 = piePlot3D23.getURLGenerator();
        java.awt.Stroke stroke32 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D23.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke32);
        org.jfree.chart.plot.PiePlot3D piePlot3D34 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D34.setLabelPadding(rectangleInsets35);
        java.awt.Paint paint37 = piePlot3D34.getLabelLinkPaint();
        boolean boolean38 = piePlot3D34.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent39 = null;
        piePlot3D34.notifyListeners(plotChangeEvent39);
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = piePlot3D34.getSimpleLabelOffset();
        piePlot3D23.setSimpleLabelOffset(rectangleInsets41);
        java.awt.Font font43 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D23.setNoDataMessageFont(font43);
        org.jfree.data.general.PieDataset pieDataset45 = piePlot3D23.getDataset();
        boolean boolean46 = piePlot3D23.getSimpleLabels();
        java.awt.Paint paint47 = piePlot3D23.getLabelOutlinePaint();
        piePlot3D1.setSectionOutlinePaint((java.lang.Comparable) 100.0d, paint47);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.12d + "'", double10 == 0.12d);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNull(pieURLGenerator30);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(rectangleInsets35);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(rectangleInsets41);
        org.junit.Assert.assertNotNull(font43);
        org.junit.Assert.assertNull(pieDataset45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(paint47);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        piePlot3D0.setPieIndex((int) ' ');
        piePlot3D0.setStartAngle((double) ' ');
        java.awt.Paint paint12 = piePlot3D0.getShadowPaint();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D0.setNoDataMessagePaint(paint8);
        java.awt.Paint paint10 = piePlot3D0.getLabelOutlinePaint();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot3D0.drawBackgroundImage(graphics2D11, rectangle2D12);
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D14.setLabelPadding(rectangleInsets15);
        java.awt.Paint paint17 = piePlot3D14.getLabelLinkPaint();
        boolean boolean18 = piePlot3D14.getLabelLinksVisible();
        piePlot3D14.setOutlineVisible(false);
        java.awt.Paint paint22 = piePlot3D14.getSectionOutlinePaint((java.lang.Comparable) 1L);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D24 = new org.jfree.chart.plot.PiePlot3D(pieDataset23);
        java.awt.Paint paint25 = piePlot3D24.getBaseSectionPaint();
        piePlot3D14.setLabelShadowPaint(paint25);
        piePlot3D0.setNoDataMessagePaint(paint25);
        org.jfree.chart.plot.PiePlot3D piePlot3D28 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D28.setLabelPadding(rectangleInsets29);
        java.awt.Paint paint31 = piePlot3D28.getLabelLinkPaint();
        java.awt.Paint paint32 = piePlot3D28.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D33 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D33.setLabelPadding(rectangleInsets34);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo38 = null;
        piePlot3D33.handleClick((int) (short) 100, 0, plotRenderingInfo38);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator40 = piePlot3D33.getURLGenerator();
        java.awt.Paint paint41 = piePlot3D33.getLabelOutlinePaint();
        piePlot3D28.setLabelShadowPaint(paint41);
        piePlot3D0.setShadowPaint(paint41);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(rectangleInsets29);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(rectangleInsets34);
        org.junit.Assert.assertNull(pieURLGenerator40);
        org.junit.Assert.assertNotNull(paint41);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        piePlot3D0.setShadowXOffset((double) 15);
        java.lang.String str7 = piePlot3D0.getPlotType();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator8 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator8);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent10 = null;
        piePlot3D0.datasetChanged(datasetChangeEvent10);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = null;
        piePlot3D0.setLegendLabelURLGenerator(pieURLGenerator12);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Pie 3D Plot" + "'", str7, "Pie 3D Plot");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot3D0.getURLGenerator();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor8 = piePlot3D0.getLabelDistributor();
        piePlot3D0.setExplodePercent((java.lang.Comparable) 0L, 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor8);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D0.setNoDataMessagePaint(paint8);
        java.awt.Stroke stroke10 = piePlot3D0.getLabelOutlineStroke();
        int int11 = piePlot3D0.getPieIndex();
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D13.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = piePlot3D13.getLabelPadding();
        java.awt.Font font17 = piePlot3D13.getNoDataMessageFont();
        java.awt.Paint paint18 = piePlot3D13.getOutlinePaint();
        int int19 = piePlot3D13.getBackgroundImageAlignment();
        java.awt.Stroke stroke20 = piePlot3D13.getBaseSectionOutlineStroke();
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) 1.0E-5d, stroke20);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertNotNull(stroke20);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D7.setLabelPadding(rectangleInsets8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        piePlot3D7.handleClick((int) (short) 100, 0, plotRenderingInfo12);
        boolean boolean14 = piePlot3D7.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D15 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D15.setLabelPadding(rectangleInsets16);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        piePlot3D15.handleClick((int) (short) 100, 0, plotRenderingInfo20);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = piePlot3D15.getURLGenerator();
        java.awt.Stroke stroke24 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D15.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke24);
        piePlot3D7.setLabelOutlineStroke(stroke24);
        piePlot3D0.setLabelLinkStroke(stroke24);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        piePlot3D0.handleClick(1, 1, plotRenderingInfo30);
        java.awt.Paint paint32 = piePlot3D0.getLabelOutlinePaint();
        piePlot3D0.setOutlineVisible(false);
        piePlot3D0.setCircular(false);
        piePlot3D0.setMinimumArcAngleToDraw(0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNull(pieURLGenerator22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(paint32);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        boolean boolean7 = piePlot3D0.getSectionOutlinesVisible();
        java.awt.Paint paint8 = piePlot3D0.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D9.setSectionOutlinesVisible(true);
        piePlot3D9.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        piePlot3D9.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = piePlot3D9.getLabelPadding();
        piePlot3D0.setInsets(rectangleInsets17);
        int int19 = piePlot3D0.getPieIndex();
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D20.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = piePlot3D20.getLabelPadding();
        piePlot3D20.setShadowXOffset(10.0d);
        piePlot3D20.setCircular(false);
        piePlot3D20.setLabelGap((double) (short) 1);
        java.awt.Paint paint30 = piePlot3D20.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke31 = piePlot3D20.getLabelLinkStroke();
        java.awt.Paint paint32 = piePlot3D20.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D33 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D33.setLabelPadding(rectangleInsets34);
        java.awt.Paint paint36 = piePlot3D33.getLabelLinkPaint();
        boolean boolean37 = piePlot3D33.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = piePlot3D33.getInsets();
        java.awt.Paint paint39 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D33.setShadowPaint(paint39);
        piePlot3D20.setLabelPaint(paint39);
        float float42 = piePlot3D20.getBackgroundAlpha();
        java.awt.Shape shape43 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot3D20.setLegendItemShape(shape43);
        piePlot3D0.setLegendItemShape(shape43);
        java.awt.Graphics2D graphics2D46 = null;
        java.awt.geom.Rectangle2D rectangle2D47 = null;
        piePlot3D0.drawBackgroundImage(graphics2D46, rectangle2D47);
        org.jfree.chart.plot.PiePlot3D piePlot3D49 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets50 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D49.setLabelPadding(rectangleInsets50);
        java.awt.Paint paint52 = piePlot3D49.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator53 = null;
        piePlot3D49.setLegendLabelToolTipGenerator(pieSectionLabelGenerator53);
        piePlot3D49.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot57 = piePlot3D49.getRootPlot();
        java.awt.Stroke stroke58 = piePlot3D49.getOutlineStroke();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator59 = piePlot3D49.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.Plot plot60 = piePlot3D49.getParent();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator61 = piePlot3D49.getLegendLabelGenerator();
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator61);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(rectangleInsets34);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(rectangleInsets38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 1.0f + "'", float42 == 1.0f);
        org.junit.Assert.assertNotNull(shape43);
        org.junit.Assert.assertNotNull(rectangleInsets50);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertNotNull(plot57);
        org.junit.Assert.assertNotNull(stroke58);
        org.junit.Assert.assertNull(pieSectionLabelGenerator59);
        org.junit.Assert.assertNull(plot60);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator61);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D0.setNoDataMessagePaint(paint8);
        java.awt.Paint paint10 = piePlot3D0.getLabelOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset11 = piePlot3D0.getDataset();
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D12.setLabelPadding(rectangleInsets13);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        piePlot3D12.handleClick((int) (short) 100, 0, plotRenderingInfo17);
        boolean boolean19 = piePlot3D12.getSectionOutlinesVisible();
        java.awt.Paint paint20 = piePlot3D12.getBaseSectionPaint();
        piePlot3D0.setBackgroundPaint(paint20);
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.drawOutline(graphics2D22, rectangle2D23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(pieDataset11);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot3D0.getDatasetGroup();
        piePlot3D0.setBackgroundImageAlignment(1);
        java.awt.Paint paint11 = piePlot3D0.getLabelLinkPaint();
        boolean boolean12 = piePlot3D0.getSectionOutlinesVisible();
        java.awt.Stroke stroke13 = piePlot3D0.getLabelOutlineStroke();
        piePlot3D0.setMinimumArcAngleToDraw((double) (byte) 1);
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D16.setLabelPadding(rectangleInsets17);
        float float19 = piePlot3D16.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        piePlot3D16.drawBackgroundImage(graphics2D20, rectangle2D21);
        float float23 = piePlot3D16.getBackgroundImageAlpha();
        org.jfree.chart.util.Rotation rotation24 = piePlot3D16.getDirection();
        double double26 = piePlot3D16.getExplodePercent((java.lang.Comparable) 100.0f);
        piePlot3D16.setIgnoreNullValues(true);
        java.awt.Paint paint29 = piePlot3D16.getLabelPaint();
        piePlot3D0.setOutlinePaint(paint29);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator31 = piePlot3D0.getURLGenerator();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.5f + "'", float19 == 0.5f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.5f + "'", float23 == 0.5f);
        org.junit.Assert.assertNotNull(rotation24);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNull(pieURLGenerator31);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        double double7 = piePlot3D0.getDepthFactor();
        boolean boolean8 = piePlot3D0.getSimpleLabels();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12d + "'", double7 == 0.12d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        boolean boolean5 = piePlot3D0.isCircular();
        double double6 = piePlot3D0.getShadowYOffset();
        piePlot3D0.setBackgroundImageAlignment(15);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = piePlot3D0.getSimpleLabelOffset();
        boolean boolean11 = piePlot3D0.equals((java.lang.Object) '4');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getDepthFactor();
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D6.setLabelPadding(rectangleInsets7);
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean11 = piePlot3D10.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator12 = null;
        piePlot3D10.setToolTipGenerator(pieToolTipGenerator12);
        java.awt.Paint paint14 = piePlot3D10.getShadowPaint();
        piePlot3D6.setSectionPaint((java.lang.Comparable) (short) -1, paint14);
        piePlot3D0.setLabelPaint(paint14);
        java.awt.Paint paint17 = piePlot3D0.getOutlinePaint();
        java.awt.Stroke stroke18 = piePlot3D0.getBaseSectionOutlineStroke();
        piePlot3D0.setShadowXOffset(1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.12d + "'", double5 == 0.12d);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PiePlot3D piePlot3D4 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean5 = piePlot3D4.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot3D4.setToolTipGenerator(pieToolTipGenerator6);
        java.awt.Paint paint8 = piePlot3D4.getShadowPaint();
        piePlot3D0.setSectionPaint((java.lang.Comparable) (short) -1, paint8);
        org.jfree.data.general.PieDataset pieDataset10 = piePlot3D0.getDataset();
        piePlot3D0.setExplodePercent((java.lang.Comparable) 0.0d, 100.0d);
        double double14 = piePlot3D0.getLabelGap();
        java.awt.Paint paint15 = piePlot3D0.getLabelOutlinePaint();
        java.lang.Object obj16 = piePlot3D0.clone();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(pieDataset10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.025d + "'", double14 == 0.025d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        java.awt.Font font4 = piePlot3D0.getNoDataMessageFont();
        java.awt.Paint paint5 = piePlot3D0.getOutlinePaint();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator6);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        piePlot3D0.removeChangeListener(plotChangeListener8);
        java.awt.Stroke stroke11 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) "");
        piePlot3D0.setLabelLinksVisible(false);
        org.junit.Assert.assertNull(stroke11);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D0.setNoDataMessagePaint(paint8);
        java.awt.Stroke stroke10 = piePlot3D0.getLabelOutlineStroke();
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D11.setLabelPadding(rectangleInsets12);
        java.awt.Paint paint14 = piePlot3D11.getLabelLinkPaint();
        boolean boolean15 = piePlot3D11.getLabelLinksVisible();
        double double16 = piePlot3D11.getDepthFactor();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator17 = piePlot3D11.getLabelGenerator();
        piePlot3D0.setLabelGenerator(pieSectionLabelGenerator17);
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D19.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = piePlot3D19.getLabelPadding();
        java.awt.Font font23 = piePlot3D19.getNoDataMessageFont();
        piePlot3D0.setNoDataMessageFont(font23);
        org.jfree.chart.event.PlotChangeListener plotChangeListener25 = null;
        piePlot3D0.removeChangeListener(plotChangeListener25);
        piePlot3D0.setLabelLinksVisible(false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.12d + "'", double16 == 0.12d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator17);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(font23);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D5.setLabelPadding(rectangleInsets6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        piePlot3D5.handleClick((int) (short) 100, 0, plotRenderingInfo10);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = piePlot3D5.getURLGenerator();
        java.awt.Paint paint13 = piePlot3D5.getLabelOutlinePaint();
        piePlot3D0.setLabelShadowPaint(paint13);
        java.awt.Stroke stroke15 = piePlot3D0.getOutlineStroke();
        piePlot3D0.setStartAngle(10.0d);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3D0.getInsets();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(pieURLGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(rectangleInsets18);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getDepthFactor();
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D6.setLabelPadding(rectangleInsets7);
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean11 = piePlot3D10.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator12 = null;
        piePlot3D10.setToolTipGenerator(pieToolTipGenerator12);
        java.awt.Paint paint14 = piePlot3D10.getShadowPaint();
        piePlot3D6.setSectionPaint((java.lang.Comparable) (short) -1, paint14);
        piePlot3D0.setLabelPaint(paint14);
        java.awt.Paint paint17 = piePlot3D0.getOutlinePaint();
        java.lang.String str18 = piePlot3D0.getPlotType();
        java.awt.Paint paint19 = piePlot3D0.getBaseSectionPaint();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor20 = piePlot3D0.getLabelDistributor();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.12d + "'", double5 == 0.12d);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Pie 3D Plot" + "'", str18, "Pie 3D Plot");
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor20);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        piePlot3D0.setOutlineVisible(false);
        java.awt.Paint paint8 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) 1L);
        java.awt.Stroke stroke9 = piePlot3D0.getLabelOutlineStroke();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        piePlot3D0.markerChanged(markerChangeEvent10);
        java.awt.Paint paint12 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setLabelPaint(paint12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot3D0.getURLGenerator();
        java.awt.Stroke stroke8 = piePlot3D0.getBaseSectionOutlineStroke();
        java.lang.Comparable comparable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint10 = piePlot3D0.getSectionOutlinePaint(comparable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D0.setNoDataMessagePaint(paint8);
        java.awt.Stroke stroke10 = piePlot3D0.getLabelOutlineStroke();
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D11.setLabelPadding(rectangleInsets12);
        java.awt.Paint paint14 = piePlot3D11.getLabelLinkPaint();
        boolean boolean15 = piePlot3D11.getLabelLinksVisible();
        double double16 = piePlot3D11.getDepthFactor();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator17 = piePlot3D11.getLabelGenerator();
        piePlot3D0.setLabelGenerator(pieSectionLabelGenerator17);
        java.awt.Stroke stroke20 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) 100.0f);
        org.jfree.data.general.DatasetGroup datasetGroup21 = piePlot3D0.getDatasetGroup();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.12d + "'", double16 == 0.12d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator17);
        org.junit.Assert.assertNull(stroke20);
        org.junit.Assert.assertNull(datasetGroup21);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D6.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = piePlot3D6.getLabelPadding();
        java.awt.Font font10 = piePlot3D6.getNoDataMessageFont();
        piePlot3D0.setLabelFont(font10);
        java.awt.Paint paint12 = piePlot3D0.getLabelBackgroundPaint();
        double double13 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setNoDataMessage("hi!");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent16 = null;
        piePlot3D0.markerChanged(markerChangeEvent16);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.025d + "'", double13 == 0.025d);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.awt.Stroke stroke9 = piePlot3D0.getOutlineStroke();
        piePlot3D0.setStartAngle((double) (byte) 0);
        java.awt.Stroke stroke13 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) "");
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(stroke13);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        float float7 = piePlot3D0.getForegroundAlpha();
        java.awt.Paint paint8 = piePlot3D0.getBaseSectionOutlinePaint();
        boolean boolean9 = piePlot3D0.getSimpleLabels();
        java.awt.Font font10 = piePlot3D0.getLabelFont();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(font10);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PiePlot3D piePlot3D4 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean5 = piePlot3D4.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot3D4.setToolTipGenerator(pieToolTipGenerator6);
        java.awt.Paint paint8 = piePlot3D4.getShadowPaint();
        piePlot3D0.setSectionPaint((java.lang.Comparable) (short) -1, paint8);
        org.jfree.data.general.PieDataset pieDataset10 = piePlot3D0.getDataset();
        piePlot3D0.setExplodePercent((java.lang.Comparable) 0.0d, 100.0d);
        java.lang.Object obj14 = piePlot3D0.clone();
        org.jfree.chart.plot.PiePlot3D piePlot3D15 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D15.setLabelPadding(rectangleInsets16);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        piePlot3D15.handleClick((int) (short) 100, 0, plotRenderingInfo20);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = piePlot3D15.getURLGenerator();
        java.awt.Stroke stroke24 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D15.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke24);
        java.awt.Shape shape26 = piePlot3D15.getLegendItemShape();
        piePlot3D15.setOutlineVisible(false);
        java.awt.Stroke stroke29 = piePlot3D15.getBaseSectionOutlineStroke();
        piePlot3D0.setOutlineStroke(stroke29);
        double double31 = piePlot3D0.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset32 = null;
        piePlot3D0.setDataset(pieDataset32);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(pieDataset10);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNull(pieURLGenerator22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.08d + "'", double31 == 0.08d);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D0.setNoDataMessagePaint(paint8);
        java.awt.Stroke stroke10 = piePlot3D0.getLabelOutlineStroke();
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D11.setLabelPadding(rectangleInsets12);
        java.awt.Paint paint14 = piePlot3D11.getLabelLinkPaint();
        boolean boolean15 = piePlot3D11.getLabelLinksVisible();
        double double16 = piePlot3D11.getDepthFactor();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator17 = piePlot3D11.getLabelGenerator();
        piePlot3D0.setLabelGenerator(pieSectionLabelGenerator17);
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D19.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = piePlot3D19.getLabelPadding();
        java.awt.Font font23 = piePlot3D19.getNoDataMessageFont();
        piePlot3D0.setNoDataMessageFont(font23);
        org.jfree.chart.event.PlotChangeListener plotChangeListener25 = null;
        piePlot3D0.removeChangeListener(plotChangeListener25);
        piePlot3D0.setOutlineVisible(false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.12d + "'", double16 == 0.12d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator17);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(font23);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot3D0.getURLGenerator();
        java.awt.Paint paint8 = piePlot3D0.getLabelOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        piePlot3D0.setDataset(pieDataset9);
        piePlot3D0.setForegroundAlpha(10.0f);
        boolean boolean13 = piePlot3D0.isOutlineVisible();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        piePlot3D0.setOutlineVisible(true);
        int int9 = piePlot3D0.getPieIndex();
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setLabelPadding(rectangleInsets11);
        java.awt.Paint paint13 = piePlot3D10.getLabelLinkPaint();
        boolean boolean14 = piePlot3D10.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        piePlot3D10.notifyListeners(plotChangeEvent15);
        piePlot3D10.setOutlineVisible(true);
        java.awt.Stroke stroke19 = piePlot3D10.getLabelOutlineStroke();
        piePlot3D0.setBaseSectionOutlineStroke(stroke19);
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.drawOutline(graphics2D21, rectangle2D22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        double double7 = piePlot3D0.getDepthFactor();
        double double8 = piePlot3D0.getInteriorGap();
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D9.setLabelPadding(rectangleInsets10);
        java.awt.Paint paint12 = piePlot3D9.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = null;
        piePlot3D9.setLegendLabelToolTipGenerator(pieSectionLabelGenerator13);
        piePlot3D9.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot17 = piePlot3D9.getRootPlot();
        java.awt.Paint paint18 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_OUTLINE_PAINT;
        piePlot3D9.setBaseSectionOutlinePaint(paint18);
        piePlot3D0.setBaseSectionPaint(paint18);
        org.jfree.chart.LegendItemCollection legendItemCollection21 = piePlot3D0.getLegendItems();
        double double22 = piePlot3D0.getInteriorGap();
        double double23 = piePlot3D0.getLabelGap();
        // The following exception was thrown during execution in test generation
        try {
            double double24 = piePlot3D0.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12d + "'", double7 == 0.12d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(legendItemCollection21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.08d + "'", double22 == 0.08d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.025d + "'", double23 == 0.025d);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Paint paint8 = piePlot3D0.getLabelShadowPaint();
        double double9 = piePlot3D0.getShadowXOffset();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D5.setLabelPadding(rectangleInsets6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        piePlot3D5.handleClick((int) (short) 100, 0, plotRenderingInfo10);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = piePlot3D5.getURLGenerator();
        java.awt.Paint paint13 = piePlot3D5.getLabelOutlinePaint();
        piePlot3D0.setLabelShadowPaint(paint13);
        org.jfree.data.general.DatasetGroup datasetGroup15 = piePlot3D0.getDatasetGroup();
        piePlot3D0.setCircular(true);
        java.awt.Stroke stroke18 = piePlot3D0.getLabelOutlineStroke();
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D19.setLabelPadding(rectangleInsets20);
        java.awt.Paint paint22 = piePlot3D19.getLabelLinkPaint();
        boolean boolean23 = piePlot3D19.getLabelLinksVisible();
        double double24 = piePlot3D19.getLabelLinkMargin();
        java.awt.Paint paint26 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D19.setSectionPaint((java.lang.Comparable) 0.4d, paint26);
        piePlot3D0.setLabelPaint(paint26);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(pieURLGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.025d + "'", double24 == 0.025d);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot3D0.getDatasetGroup();
        java.awt.Image image9 = piePlot3D0.getBackgroundImage();
        piePlot3D0.setBackgroundImageAlignment((int) (byte) 100);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = piePlot3D0.getLabelDistributor();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = piePlot3D0.getDrawingSupplier();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNull(image9);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertNotNull(drawingSupplier13);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        java.awt.Font font4 = piePlot3D0.getNoDataMessageFont();
        java.awt.Paint paint5 = piePlot3D0.getShadowPaint();
        piePlot3D0.setStartAngle((double) (-1.0f));
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = piePlot3D0.getLabelPadding();
        org.jfree.chart.LegendItemCollection legendItemCollection10 = piePlot3D0.getLegendItems();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(legendItemCollection10);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot3D0.addChangeListener(plotChangeListener4);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D0.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D7.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = piePlot3D7.getLabelPadding();
        java.awt.Font font11 = piePlot3D7.getNoDataMessageFont();
        int int12 = piePlot3D7.getPieIndex();
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D13.setSectionOutlinesVisible(true);
        piePlot3D13.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        piePlot3D13.drawBackgroundImage(graphics2D18, rectangle2D19);
        java.awt.Paint paint21 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D13.setNoDataMessagePaint(paint21);
        java.awt.Paint paint23 = piePlot3D13.getLabelOutlinePaint();
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        piePlot3D13.drawBackgroundImage(graphics2D24, rectangle2D25);
        java.awt.Paint paint28 = piePlot3D13.getSectionPaint((java.lang.Comparable) 0.0d);
        java.awt.Paint paint30 = piePlot3D13.getSectionOutlinePaint((java.lang.Comparable) (short) 1);
        java.awt.Paint paint31 = piePlot3D13.getNoDataMessagePaint();
        piePlot3D7.setBackgroundPaint(paint31);
        piePlot3D0.setLabelBackgroundPaint(paint31);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(paint28);
        org.junit.Assert.assertNull(paint30);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.data.general.PieDataset pieDataset3 = piePlot3D0.getDataset();
        java.awt.Paint paint5 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) (short) 100);
        piePlot3D0.setLabelLinksVisible(true);
        piePlot3D0.setStartAngle((double) (-1));
        java.lang.Comparable comparable10 = null;
        java.awt.Stroke stroke11 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setSectionOutlineStroke(comparable10, stroke11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieDataset3);
        org.junit.Assert.assertNull(paint5);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.awt.Paint paint9 = piePlot3D0.getBaseSectionOutlinePaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        piePlot3D0.addChangeListener(plotChangeListener10);
        java.awt.Paint paint12 = piePlot3D0.getLabelPaint();
        java.awt.Paint paint13 = piePlot3D0.getLabelShadowPaint();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        piePlot3D0.setIgnoreNullValues(true);
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D7.setLabelPadding(rectangleInsets8);
        java.awt.Paint paint10 = piePlot3D7.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator11 = null;
        piePlot3D7.setLegendLabelToolTipGenerator(pieSectionLabelGenerator11);
        piePlot3D7.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot15 = piePlot3D7.getRootPlot();
        java.awt.Stroke stroke16 = piePlot3D7.getOutlineStroke();
        piePlot3D7.setStartAngle((double) (byte) 0);
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D19.setLabelPadding(rectangleInsets20);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        piePlot3D19.handleClick((int) (short) 100, 0, plotRenderingInfo24);
        org.jfree.chart.plot.PiePlot3D piePlot3D26 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D26.setLabelPadding(rectangleInsets27);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        piePlot3D26.handleClick((int) (short) 100, 0, plotRenderingInfo31);
        boolean boolean33 = piePlot3D26.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D34 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D34.setLabelPadding(rectangleInsets35);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = null;
        piePlot3D34.handleClick((int) (short) 100, 0, plotRenderingInfo39);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator41 = piePlot3D34.getURLGenerator();
        java.awt.Stroke stroke43 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D34.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke43);
        piePlot3D26.setLabelOutlineStroke(stroke43);
        piePlot3D19.setLabelLinkStroke(stroke43);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor47 = piePlot3D19.getLabelDistributor();
        org.jfree.chart.plot.PiePlot3D piePlot3D48 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D48.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke52 = piePlot3D48.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator53 = piePlot3D48.getLegendLabelGenerator();
        piePlot3D19.setLegendLabelToolTipGenerator(pieSectionLabelGenerator53);
        float float55 = piePlot3D19.getBackgroundAlpha();
        piePlot3D19.setIgnoreNullValues(false);
        java.awt.Paint paint58 = piePlot3D19.getLabelPaint();
        piePlot3D7.setNoDataMessagePaint(paint58);
        float float60 = piePlot3D7.getBackgroundImageAlpha();
        java.awt.Font font61 = piePlot3D7.getNoDataMessageFont();
        piePlot3D0.setNoDataMessageFont(font61);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(rectangleInsets35);
        org.junit.Assert.assertNull(pieURLGenerator41);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor47);
        org.junit.Assert.assertNull(stroke52);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator53);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 1.0f + "'", float55 == 1.0f);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 0.5f + "'", float60 == 0.5f);
        org.junit.Assert.assertNotNull(font61);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        org.jfree.chart.plot.Plot plot6 = piePlot3D0.getParent();
        java.awt.Paint paint7 = piePlot3D0.getShadowPaint();
        piePlot3D0.setDepthFactor(0.0d);
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setLabelPadding(rectangleInsets11);
        java.awt.Paint paint13 = piePlot3D10.getLabelLinkPaint();
        boolean boolean14 = piePlot3D10.getLabelLinksVisible();
        double double15 = piePlot3D10.getLabelLinkMargin();
        piePlot3D10.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup18 = piePlot3D10.getDatasetGroup();
        piePlot3D10.setBackgroundImageAlignment(1);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot3D10.getSimpleLabelOffset();
        java.awt.Paint paint22 = piePlot3D10.getLabelLinkPaint();
        piePlot3D0.setShadowPaint(paint22);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.025d + "'", double15 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup18);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        piePlot3D0.setOutlineVisible(false);
        java.awt.Paint paint7 = piePlot3D0.getLabelPaint();
        org.jfree.chart.util.Rotation rotation8 = piePlot3D0.getDirection();
        piePlot3D0.setNoDataMessage("");
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(rotation8);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        java.awt.Font font4 = piePlot3D0.getNoDataMessageFont();
        java.awt.Paint paint5 = piePlot3D0.getShadowPaint();
        piePlot3D0.setStartAngle((double) (-1.0f));
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        org.jfree.chart.plot.Plot plot9 = plot8.getRootPlot();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(plot9);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        piePlot3D0.setPieIndex((int) ' ');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor10 = piePlot3D0.getLabelDistributor();
        java.awt.Paint paint11 = piePlot3D0.getLabelShadowPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator12 = piePlot3D0.getLabelGenerator();
        org.jfree.data.general.PieDataset pieDataset13 = piePlot3D0.getDataset();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator12);
        org.junit.Assert.assertNull(pieDataset13);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        piePlot3D0.setShadowXOffset(1.0d);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        piePlot3D0.handleClick((int) (byte) 1, 15, plotRenderingInfo12);
        java.awt.Paint paint15 = null;
        piePlot3D0.setSectionOutlinePaint((java.lang.Comparable) (byte) 1, paint15);
        piePlot3D0.setCircular(true, false);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        piePlot3D0.setShadowXOffset(1.0d);
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D10.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = piePlot3D10.getLabelPadding();
        piePlot3D10.setShadowXOffset(10.0d);
        piePlot3D10.setCircular(false);
        piePlot3D10.setLabelGap((double) (short) 1);
        java.awt.Paint paint20 = piePlot3D10.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke21 = piePlot3D10.getLabelLinkStroke();
        java.awt.Paint paint22 = piePlot3D10.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D23 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D23.setLabelPadding(rectangleInsets24);
        java.awt.Paint paint26 = piePlot3D23.getLabelLinkPaint();
        boolean boolean27 = piePlot3D23.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = piePlot3D23.getInsets();
        java.awt.Paint paint29 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D23.setShadowPaint(paint29);
        piePlot3D10.setLabelPaint(paint29);
        org.jfree.chart.plot.PiePlot3D piePlot3D32 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D32.setLabelPadding(rectangleInsets33);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        piePlot3D32.handleClick((int) (short) 100, 0, plotRenderingInfo37);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator39 = piePlot3D32.getURLGenerator();
        java.awt.Stroke stroke41 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D32.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke41);
        piePlot3D10.setOutlineStroke(stroke41);
        piePlot3D0.setLabelOutlineStroke(stroke41);
        java.awt.Stroke stroke45 = piePlot3D0.getBaseSectionOutlineStroke();
        java.awt.Paint paint46 = null;
        piePlot3D0.setShadowPaint(paint46);
        piePlot3D0.setIgnoreNullValues(true);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNull(pieURLGenerator39);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(stroke45);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean1 = piePlot3D0.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator2);
        org.jfree.chart.plot.PiePlot3D piePlot3D4 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D4.setSectionOutlinesVisible(true);
        piePlot3D4.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        piePlot3D4.drawBackgroundImage(graphics2D9, rectangle2D10);
        java.awt.Paint paint12 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D4.setNoDataMessagePaint(paint12);
        java.awt.Stroke stroke14 = piePlot3D4.getLabelOutlineStroke();
        piePlot3D0.setLabelOutlineStroke(stroke14);
        piePlot3D0.setPieIndex(15);
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D18.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot3D18.getLabelPadding();
        piePlot3D18.setShadowXOffset(10.0d);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent24 = null;
        piePlot3D18.datasetChanged(datasetChangeEvent24);
        org.jfree.chart.plot.PiePlot3D piePlot3D27 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D27.setSectionOutlinesVisible(true);
        piePlot3D27.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D32 = null;
        java.awt.geom.Rectangle2D rectangle2D33 = null;
        piePlot3D27.drawBackgroundImage(graphics2D32, rectangle2D33);
        piePlot3D27.zoom((double) '#');
        double double37 = piePlot3D27.getShadowXOffset();
        java.awt.Stroke stroke38 = piePlot3D27.getLabelOutlineStroke();
        piePlot3D18.setSectionOutlineStroke((java.lang.Comparable) 0.14d, stroke38);
        piePlot3D0.setLabelLinkStroke(stroke38);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 4.0d + "'", double37 == 4.0d);
        org.junit.Assert.assertNotNull(stroke38);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        double double7 = piePlot3D0.getDepthFactor();
        java.awt.Paint paint8 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        piePlot3D0.axisChanged(axisChangeEvent9);
        java.lang.String str11 = piePlot3D0.getPlotType();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = piePlot3D0.getLabelPadding();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12d + "'", double7 == 0.12d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pie 3D Plot" + "'", str11, "Pie 3D Plot");
        org.junit.Assert.assertNotNull(rectangleInsets12);
    }
}

