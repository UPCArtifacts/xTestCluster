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
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = piePlot3D0.getSimpleLabelOffset();
        java.awt.Paint paint9 = piePlot3D0.getSectionPaint((java.lang.Comparable) (short) 0);
        java.awt.Paint paint10 = piePlot3D0.getBaseSectionOutlinePaint();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        java.awt.Paint paint2 = piePlot3D1.getBaseSectionPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = null;
        piePlot3D1.setURLGenerator(pieURLGenerator3);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D1.notifyListeners(plotChangeEvent5);
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D1.setInteriorGap(90.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (90.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        piePlot3D0.datasetChanged(datasetChangeEvent6);
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D9.setSectionOutlinesVisible(true);
        piePlot3D9.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        piePlot3D9.drawBackgroundImage(graphics2D14, rectangle2D15);
        piePlot3D9.zoom((double) '#');
        double double19 = piePlot3D9.getShadowXOffset();
        java.awt.Stroke stroke20 = piePlot3D9.getLabelOutlineStroke();
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) 0.14d, stroke20);
        double double22 = piePlot3D0.getLabelGap();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent23 = null;
        piePlot3D0.datasetChanged(datasetChangeEvent23);
        boolean boolean25 = piePlot3D0.getDarkerSides();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4.0d + "'", double19 == 4.0d);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.025d + "'", double22 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D31 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D31.setSectionOutlinesVisible(true);
        piePlot3D31.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D36 = null;
        java.awt.geom.Rectangle2D rectangle2D37 = null;
        piePlot3D31.drawBackgroundImage(graphics2D36, rectangle2D37);
        org.jfree.chart.event.PlotChangeListener plotChangeListener39 = null;
        piePlot3D31.removeChangeListener(plotChangeListener39);
        boolean boolean41 = piePlot3D31.isCircular();
        org.jfree.chart.plot.PiePlot3D piePlot3D42 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D42.setSectionOutlinesVisible(true);
        piePlot3D42.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D47 = null;
        java.awt.geom.Rectangle2D rectangle2D48 = null;
        piePlot3D42.drawBackgroundImage(graphics2D47, rectangle2D48);
        piePlot3D42.zoom((double) '#');
        java.awt.Font font52 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D42.setLabelFont(font52);
        org.jfree.chart.plot.PiePlot3D piePlot3D55 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D55.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets58 = piePlot3D55.getLabelPadding();
        piePlot3D55.setShadowXOffset(10.0d);
        piePlot3D55.setCircular(false);
        piePlot3D55.setLabelGap((double) (short) 1);
        java.awt.Paint paint65 = piePlot3D55.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke66 = piePlot3D55.getLabelLinkStroke();
        java.awt.Paint paint67 = piePlot3D55.getBaseSectionPaint();
        piePlot3D42.setSectionOutlinePaint((java.lang.Comparable) false, paint67);
        piePlot3D31.setBaseSectionOutlinePaint(paint67);
        org.jfree.chart.plot.PiePlot3D piePlot3D70 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets71 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D70.setLabelPadding(rectangleInsets71);
        java.awt.Paint paint73 = piePlot3D70.getLabelLinkPaint();
        boolean boolean74 = piePlot3D70.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent75 = null;
        piePlot3D70.notifyListeners(plotChangeEvent75);
        double double77 = piePlot3D70.getDepthFactor();
        org.jfree.chart.plot.PiePlot3D piePlot3D78 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D78.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets81 = piePlot3D78.getLabelPadding();
        java.awt.Font font82 = piePlot3D78.getNoDataMessageFont();
        java.awt.Paint paint83 = piePlot3D78.getOutlinePaint();
        java.awt.Font font84 = piePlot3D78.getNoDataMessageFont();
        piePlot3D70.setLabelFont(font84);
        java.awt.Paint paint86 = piePlot3D70.getBaseSectionPaint();
        piePlot3D31.setLabelOutlinePaint(paint86);
        piePlot3D0.setBaseSectionOutlinePaint(paint86);
        java.awt.Paint paint90 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) 100.0d);
        java.lang.String str91 = piePlot3D0.getNoDataMessage();
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(font52);
        org.junit.Assert.assertNotNull(rectangleInsets58);
        org.junit.Assert.assertNotNull(paint65);
        org.junit.Assert.assertNotNull(stroke66);
        org.junit.Assert.assertNotNull(paint67);
        org.junit.Assert.assertNotNull(rectangleInsets71);
        org.junit.Assert.assertNotNull(paint73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.12d + "'", double77 == 0.12d);
        org.junit.Assert.assertNotNull(rectangleInsets81);
        org.junit.Assert.assertNotNull(font82);
        org.junit.Assert.assertNotNull(paint83);
        org.junit.Assert.assertNotNull(font84);
        org.junit.Assert.assertNotNull(paint86);
        org.junit.Assert.assertNull(paint90);
        org.junit.Assert.assertNull(str91);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke4 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) false);
        java.awt.Paint paint5 = piePlot3D0.getBackgroundPaint();
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        java.awt.Paint paint46 = piePlot3D0.getBackgroundPaint();
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
        org.junit.Assert.assertNotNull(paint46);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D8.setSectionOutlinesVisible(true);
        piePlot3D8.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        piePlot3D8.drawBackgroundImage(graphics2D13, rectangle2D14);
        piePlot3D8.zoom((double) '#');
        java.awt.Font font18 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D8.setLabelFont(font18);
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D21.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = piePlot3D21.getLabelPadding();
        piePlot3D21.setShadowXOffset(10.0d);
        piePlot3D21.setCircular(false);
        piePlot3D21.setLabelGap((double) (short) 1);
        java.awt.Paint paint31 = piePlot3D21.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke32 = piePlot3D21.getLabelLinkStroke();
        java.awt.Paint paint33 = piePlot3D21.getBaseSectionPaint();
        piePlot3D8.setSectionOutlinePaint((java.lang.Comparable) false, paint33);
        org.jfree.chart.plot.PiePlot3D piePlot3D35 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D35.setLabelPadding(rectangleInsets36);
        java.awt.Paint paint38 = piePlot3D35.getLabelLinkPaint();
        boolean boolean39 = piePlot3D35.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = piePlot3D35.getInsets();
        piePlot3D8.setSimpleLabelOffset(rectangleInsets40);
        java.awt.Stroke stroke42 = piePlot3D8.getLabelOutlineStroke();
        piePlot3D0.setLabelOutlineStroke(stroke42);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(rectangleInsets36);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(rectangleInsets40);
        org.junit.Assert.assertNotNull(stroke42);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D11.setLabelPadding(rectangleInsets12);
        java.awt.Paint paint14 = piePlot3D11.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = null;
        piePlot3D11.setLegendLabelToolTipGenerator(pieSectionLabelGenerator15);
        piePlot3D11.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot19 = piePlot3D11.getRootPlot();
        java.awt.Stroke stroke20 = piePlot3D11.getOutlineStroke();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent21 = null;
        piePlot3D11.axisChanged(axisChangeEvent21);
        org.jfree.chart.plot.PiePlot3D piePlot3D23 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D23.setLabelPadding(rectangleInsets24);
        java.awt.Paint paint26 = piePlot3D23.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator27 = null;
        piePlot3D23.setLegendLabelToolTipGenerator(pieSectionLabelGenerator27);
        piePlot3D23.setLabelLinkMargin(0.0d);
        piePlot3D23.setShadowXOffset(1.0d);
        java.awt.Paint paint33 = piePlot3D23.getLabelOutlinePaint();
        piePlot3D11.setLabelBackgroundPaint(paint33);
        piePlot3D0.setLabelBackgroundPaint(paint33);
        piePlot3D0.setMaximumLabelWidth((double) (-1L));
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator38 = piePlot3D0.getLegendLabelURLGenerator();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(plot19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNull(pieURLGenerator38);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        java.awt.Paint paint24 = piePlot3D0.getBaseSectionPaint();
        double double25 = piePlot3D0.getLabelLinkMargin();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.025d + "'", double15 == 0.025d);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.025d + "'", double25 == 0.025d);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        java.awt.Font font4 = piePlot3D0.getNoDataMessageFont();
        java.awt.Paint paint5 = piePlot3D0.getShadowPaint();
        piePlot3D0.setStartAngle((double) (-1.0f));
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D9.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = piePlot3D9.getLabelPadding();
        piePlot3D9.setShadowXOffset(10.0d);
        piePlot3D9.setCircular(false);
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        piePlot3D9.removeChangeListener(plotChangeListener17);
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean20 = piePlot3D19.getSimpleLabels();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = piePlot3D19.getDrawingSupplier();
        piePlot3D9.setDrawingSupplier(drawingSupplier21);
        piePlot3D0.setDrawingSupplier(drawingSupplier21);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator24 = piePlot3D0.getLegendLabelGenerator();
        java.awt.Stroke stroke25 = piePlot3D0.getBaseSectionOutlineStroke();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(drawingSupplier21);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator24);
        org.junit.Assert.assertNotNull(stroke25);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        piePlot3D0.setLabelGap(0.0d);
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
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        piePlot3D0.setBackgroundImageAlignment(1);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNull(pieToolTipGenerator15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        float float3 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot3D0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint7 = piePlot3D0.getShadowPaint();
        java.awt.Font font8 = piePlot3D0.getLabelFont();
        boolean boolean9 = piePlot3D0.getLabelLinksVisible();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot3D0.addChangeListener(plotChangeListener4);
        java.awt.Paint paint6 = piePlot3D0.getShadowPaint();
        java.awt.Paint paint7 = piePlot3D0.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D8.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke12 = piePlot3D8.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = piePlot3D8.getLegendLabelGenerator();
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = piePlot3D0.getDrawingSupplier();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(stroke12);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator13);
        org.junit.Assert.assertNotNull(drawingSupplier15);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        piePlot3D0.setMinimumArcAngleToDraw(10.0d);
        piePlot3D0.setShadowYOffset(4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(font10);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D12.setLabelPadding(rectangleInsets13);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        piePlot3D12.handleClick((int) (short) 100, 0, plotRenderingInfo17);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator19 = piePlot3D12.getURLGenerator();
        org.jfree.chart.util.Rotation rotation20 = piePlot3D12.getDirection();
        piePlot3D0.setDirection(rotation20);
        java.awt.Stroke stroke22 = piePlot3D0.getLabelOutlineStroke();
        boolean boolean23 = piePlot3D0.isCircular();
        java.awt.Paint paint24 = piePlot3D0.getLabelPaint();
        piePlot3D0.setIgnoreZeroValues(true);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNull(pieURLGenerator19);
        org.junit.Assert.assertNotNull(rotation20);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        piePlot3D0.setPieIndex((int) ' ');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor10 = piePlot3D0.getLabelDistributor();
        piePlot3D0.setIgnoreNullValues(false);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        org.jfree.chart.plot.Plot plot14 = piePlot3D0.getRootPlot();
        org.jfree.chart.plot.PiePlot3D piePlot3D15 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D15.setLabelPadding(rectangleInsets16);
        java.awt.Paint paint18 = piePlot3D15.getLabelLinkPaint();
        java.awt.Paint paint19 = piePlot3D15.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D20.setLabelPadding(rectangleInsets21);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        piePlot3D20.handleClick((int) (short) 100, 0, plotRenderingInfo25);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator27 = piePlot3D20.getURLGenerator();
        java.awt.Paint paint28 = piePlot3D20.getLabelOutlinePaint();
        piePlot3D15.setLabelShadowPaint(paint28);
        org.jfree.data.general.DatasetGroup datasetGroup30 = piePlot3D15.getDatasetGroup();
        double double31 = piePlot3D15.getMinimumArcAngleToDraw();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator32 = piePlot3D15.getLabelGenerator();
        piePlot3D0.setLegendLabelGenerator(pieSectionLabelGenerator32);
        org.jfree.chart.plot.PiePlot3D piePlot3D34 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D34.setLabelPadding(rectangleInsets35);
        java.awt.Paint paint37 = piePlot3D34.getLabelLinkPaint();
        boolean boolean38 = piePlot3D34.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = piePlot3D34.getInsets();
        java.awt.Paint paint40 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D34.setShadowPaint(paint40);
        piePlot3D34.setIgnoreZeroValues(true);
        java.awt.Shape shape44 = piePlot3D34.getLegendItemShape();
        piePlot3D0.setLegendItemShape(shape44);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNull(pieURLGenerator27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNull(datasetGroup30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0E-5d + "'", double31 == 1.0E-5d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator32);
        org.junit.Assert.assertNotNull(rectangleInsets35);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(rectangleInsets39);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(shape44);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D12.setLabelPadding(rectangleInsets13);
        java.awt.Paint paint15 = piePlot3D12.getLabelLinkPaint();
        boolean boolean16 = piePlot3D12.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = piePlot3D12.getInsets();
        java.awt.Image image18 = null;
        piePlot3D12.setBackgroundImage(image18);
        java.awt.Paint paint20 = piePlot3D12.getShadowPaint();
        java.awt.Paint paint21 = piePlot3D12.getBaseSectionPaint();
        piePlot3D0.setLabelBackgroundPaint(paint21);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 90.0d + "'", double10 == 90.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        boolean boolean5 = piePlot3D0.isCircular();
        double double6 = piePlot3D0.getShadowYOffset();
        piePlot3D0.setBackgroundImageAlignment(15);
        piePlot3D0.setPieIndex(0);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor11 = piePlot3D0.getLabelDistributor();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor11);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        org.jfree.data.general.PieDataset pieDataset40 = piePlot3D0.getDataset();
        boolean boolean41 = piePlot3D0.getSimpleLabels();
        boolean boolean42 = piePlot3D0.getIgnoreNullValues();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNull(pieDataset10);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNull(pieDataset40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        java.awt.Font font4 = piePlot3D0.getNoDataMessageFont();
        java.awt.Paint paint5 = piePlot3D0.getOutlinePaint();
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
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent20 = null;
        piePlot3D0.axisChanged(axisChangeEvent20);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot3D0.addChangeListener(plotChangeListener4);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D0.getLegendLabelToolTipGenerator();
        boolean boolean7 = piePlot3D0.getIgnoreZeroValues();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot3D0.addChangeListener(plotChangeListener4);
        java.awt.Paint paint7 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) 0.5f);
        java.lang.String str8 = piePlot3D0.getNoDataMessage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator9 = piePlot3D0.getLegendLabelURLGenerator();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(pieURLGenerator9);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D12.setLabelPadding(rectangleInsets13);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        piePlot3D12.handleClick((int) (short) 100, 0, plotRenderingInfo17);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator19 = piePlot3D12.getURLGenerator();
        org.jfree.chart.util.Rotation rotation20 = piePlot3D12.getDirection();
        piePlot3D0.setDirection(rotation20);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator22 = piePlot3D0.getToolTipGenerator();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNull(pieURLGenerator19);
        org.junit.Assert.assertNotNull(rotation20);
        org.junit.Assert.assertNull(pieToolTipGenerator22);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot3D0.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot3D0.getSimpleLabelOffset();
        piePlot3D0.setExplodePercent((java.lang.Comparable) "", (double) 'a');
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D10.setDarkerSides(false);
        boolean boolean13 = piePlot3D10.isOutlineVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        piePlot3D10.handleClick((int) ' ', (int) (byte) 1, plotRenderingInfo16);
        java.awt.Paint paint18 = piePlot3D10.getOutlinePaint();
        piePlot3D0.setNoDataMessagePaint(paint18);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        piePlot3D0.setForegroundAlpha((float) (byte) -1);
        piePlot3D0.setLabelGap((double) 0.5f);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        piePlot3D0.setStartAngle((double) 0);
        double double46 = piePlot3D0.getMaximumLabelWidth();
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
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.14d + "'", double46 == 0.14d);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        java.awt.Paint paint38 = piePlot3D0.getLabelShadowPaint();
        float float39 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Paint paint40 = piePlot3D0.getLabelOutlinePaint();
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
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.5f + "'", float39 == 0.5f);
        org.junit.Assert.assertNotNull(paint40);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        piePlot3D0.setCircular(true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNotNull(plot11);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        double double34 = piePlot3D0.getExplodePercent((java.lang.Comparable) 10L);
        org.jfree.chart.plot.Plot plot35 = piePlot3D0.getParent();
        float float36 = piePlot3D0.getForegroundAlpha();
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
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNull(plot35);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 1.0f + "'", float36 == 1.0f);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        piePlot3D0.drawBackgroundImage(graphics2D12, rectangle2D13);
        java.awt.Paint paint15 = piePlot3D0.getLabelBackgroundPaint();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        float float18 = piePlot3D0.getForegroundAlpha();
        boolean boolean19 = piePlot3D0.isSubplot();
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D20.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = piePlot3D20.getLabelPadding();
        piePlot3D20.setShadowXOffset(10.0d);
        piePlot3D20.setCircular(false);
        piePlot3D20.setLabelGap((double) (short) 1);
        piePlot3D0.setParent((org.jfree.chart.plot.Plot) piePlot3D20);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(pieURLGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 1.0f + "'", float18 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(rectangleInsets23);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D18.setLabelPadding(rectangleInsets19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        piePlot3D18.handleClick((int) (short) 100, 0, plotRenderingInfo23);
        boolean boolean25 = piePlot3D18.getSectionOutlinesVisible();
        java.awt.Paint paint26 = piePlot3D18.getBaseSectionPaint();
        java.awt.Paint paint27 = piePlot3D18.getLabelOutlinePaint();
        boolean boolean28 = piePlot3D0.equals((java.lang.Object) piePlot3D18);
        piePlot3D0.setCircular(false);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator20 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator20);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertNotNull(rotation18);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        java.awt.Paint paint16 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) 0.08d);
        double double17 = piePlot3D0.getInteriorGap();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(paint16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.08d + "'", double17 == 0.08d);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        java.awt.Shape shape34 = piePlot3D0.getLegendItemShape();
        org.jfree.chart.plot.PiePlot3D piePlot3D35 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D35.setLabelPadding(rectangleInsets36);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo40 = null;
        piePlot3D35.handleClick((int) (short) 100, 0, plotRenderingInfo40);
        float float42 = piePlot3D35.getForegroundAlpha();
        java.awt.Paint paint43 = piePlot3D35.getBaseSectionOutlinePaint();
        java.awt.Paint paint44 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot3D35.setOutlinePaint(paint44);
        org.jfree.chart.plot.PiePlot3D piePlot3D46 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D46.setLabelPadding(rectangleInsets47);
        java.awt.Paint paint49 = piePlot3D46.getLabelLinkPaint();
        boolean boolean50 = piePlot3D46.getLabelLinksVisible();
        double double51 = piePlot3D46.getLabelLinkMargin();
        piePlot3D46.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup54 = piePlot3D46.getDatasetGroup();
        java.awt.Image image55 = piePlot3D46.getBackgroundImage();
        piePlot3D46.setBackgroundImageAlignment((int) (byte) 100);
        java.awt.Paint paint58 = piePlot3D46.getBaseSectionPaint();
        piePlot3D35.setBaseSectionPaint(paint58);
        piePlot3D0.setBaseSectionOutlinePaint(paint58);
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
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertNotNull(rectangleInsets36);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 1.0f + "'", float42 == 1.0f);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(rectangleInsets47);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.025d + "'", double51 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup54);
        org.junit.Assert.assertNull(image55);
        org.junit.Assert.assertNotNull(paint58);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        piePlot3D13.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke17 = piePlot3D13.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator18 = piePlot3D13.getLegendLabelGenerator();
        piePlot3D0.setLabelGenerator(pieSectionLabelGenerator18);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent20 = null;
        piePlot3D0.datasetChanged(datasetChangeEvent20);
        java.lang.String str22 = piePlot3D0.getNoDataMessage();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(stroke17);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator18);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean1 = piePlot3D0.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator2);
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = piePlot3D0.getDrawingSupplier();
        java.awt.Paint paint6 = piePlot3D0.getNoDataMessagePaint();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = piePlot3D0.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        piePlot3D0.axisChanged(axisChangeEvent8);
        org.jfree.data.general.PieDataset pieDataset10 = piePlot3D0.getDataset();
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
        piePlot3D0.setSectionPaint((java.lang.Comparable) 4.0d, paint24);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator26 = null;
        piePlot3D0.setLegendLabelURLGenerator(pieURLGenerator26);
        org.junit.Assert.assertNull(pieDataset10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNull(pieSectionLabelGenerator22);
        org.junit.Assert.assertNull(plot23);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = piePlot3D0.getInsets();
        java.lang.Class<?> wildcardClass14 = piePlot3D0.getClass();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot3D0.getInsets();
        java.awt.Image image6 = null;
        piePlot3D0.setBackgroundImage(image6);
        piePlot3D0.setCircular(false, true);
        double double11 = piePlot3D0.getLabelLinkMargin();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setDarkerSides(false);
        boolean boolean3 = piePlot3D0.isOutlineVisible();
        boolean boolean4 = piePlot3D0.getIgnoreNullValues();
        java.awt.Font font5 = piePlot3D0.getLabelFont();
        java.lang.String str6 = piePlot3D0.getPlotType();
        piePlot3D0.zoom((-1.0d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Pie 3D Plot" + "'", str6, "Pie 3D Plot");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        piePlot3D0.axisChanged(axisChangeEvent8);
        org.jfree.data.general.PieDataset pieDataset10 = piePlot3D0.getDataset();
        java.awt.Stroke stroke11 = piePlot3D0.getOutlineStroke();
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D12.setLabelPadding(rectangleInsets13);
        java.awt.Paint paint15 = piePlot3D12.getLabelLinkPaint();
        boolean boolean16 = piePlot3D12.getLabelLinksVisible();
        double double17 = piePlot3D12.getLabelLinkMargin();
        piePlot3D12.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup20 = piePlot3D12.getDatasetGroup();
        piePlot3D12.setBackgroundImageAlignment(1);
        java.awt.Paint paint23 = piePlot3D12.getLabelLinkPaint();
        boolean boolean24 = piePlot3D12.getSectionOutlinesVisible();
        java.awt.Stroke stroke25 = piePlot3D12.getLabelOutlineStroke();
        java.awt.Stroke stroke26 = piePlot3D12.getBaseSectionOutlineStroke();
        org.jfree.chart.plot.PiePlot3D piePlot3D27 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D27.setLabelPadding(rectangleInsets28);
        java.awt.Paint paint30 = piePlot3D27.getLabelLinkPaint();
        boolean boolean31 = piePlot3D27.getLabelLinksVisible();
        double double32 = piePlot3D27.getDepthFactor();
        org.jfree.chart.plot.PiePlot3D piePlot3D33 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D33.setLabelPadding(rectangleInsets34);
        org.jfree.chart.plot.PiePlot3D piePlot3D37 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean38 = piePlot3D37.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator39 = null;
        piePlot3D37.setToolTipGenerator(pieToolTipGenerator39);
        java.awt.Paint paint41 = piePlot3D37.getShadowPaint();
        piePlot3D33.setSectionPaint((java.lang.Comparable) (short) -1, paint41);
        piePlot3D27.setLabelPaint(paint41);
        java.awt.Paint paint44 = piePlot3D27.getOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D45 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets46 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D45.setLabelPadding(rectangleInsets46);
        java.awt.Paint paint48 = piePlot3D45.getLabelLinkPaint();
        boolean boolean49 = piePlot3D45.getLabelLinksVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D50 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets51 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D50.setLabelPadding(rectangleInsets51);
        piePlot3D45.setSimpleLabelOffset(rectangleInsets51);
        java.awt.Font font54 = piePlot3D45.getLabelFont();
        piePlot3D27.setNoDataMessageFont(font54);
        java.awt.Paint paint56 = piePlot3D27.getOutlinePaint();
        piePlot3D12.setLabelOutlinePaint(paint56);
        piePlot3D0.setLabelOutlinePaint(paint56);
        org.junit.Assert.assertNull(pieDataset10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.025d + "'", double17 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.12d + "'", double32 == 0.12d);
        org.junit.Assert.assertNotNull(rectangleInsets34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(rectangleInsets46);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(rectangleInsets51);
        org.junit.Assert.assertNotNull(font54);
        org.junit.Assert.assertNotNull(paint56);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        piePlot3D0.setShadowXOffset((double) (short) 100);
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
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D27.setLabelPadding(rectangleInsets28);
        java.awt.Paint paint30 = piePlot3D27.getLabelLinkPaint();
        boolean boolean31 = piePlot3D27.getLabelLinksVisible();
        double double32 = piePlot3D27.getLabelLinkMargin();
        piePlot3D27.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup35 = piePlot3D27.getDatasetGroup();
        java.awt.Image image36 = null;
        piePlot3D27.setBackgroundImage(image36);
        java.awt.Image image38 = null;
        piePlot3D27.setBackgroundImage(image38);
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
        piePlot3D27.setNoDataMessagePaint(paint48);
        piePlot3D0.setBaseSectionPaint(paint48);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.025d + "'", double32 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup35);
        org.junit.Assert.assertNotNull(rectangleInsets41);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(paint48);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        org.jfree.data.general.PieDataset pieDataset22 = piePlot3D0.getDataset();
        piePlot3D0.setForegroundAlpha((float) (-1L));
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D25.setLabelPadding(rectangleInsets26);
        java.awt.Paint paint28 = piePlot3D25.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator29 = null;
        piePlot3D25.setLegendLabelToolTipGenerator(pieSectionLabelGenerator29);
        piePlot3D25.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot33 = piePlot3D25.getRootPlot();
        java.awt.Stroke stroke34 = piePlot3D25.getOutlineStroke();
        double double35 = piePlot3D25.getMaximumLabelWidth();
        int int36 = piePlot3D25.getPieIndex();
        java.awt.Paint paint37 = piePlot3D25.getNoDataMessagePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D38 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D38.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke42 = piePlot3D38.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator43 = piePlot3D38.getLegendLabelGenerator();
        piePlot3D25.setLabelGenerator(pieSectionLabelGenerator43);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator45 = piePlot3D25.getLabelGenerator();
        boolean boolean46 = piePlot3D0.equals((java.lang.Object) pieSectionLabelGenerator45);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(pieDataset22);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(plot33);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.14d + "'", double35 == 0.14d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNull(stroke42);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator43);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        boolean boolean11 = piePlot3D0.getIgnoreZeroValues();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12d + "'", double7 == 0.12d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        double double12 = piePlot3D0.getMaximumLabelWidth();
        java.awt.Paint paint13 = piePlot3D0.getLabelOutlinePaint();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator14 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator14);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean1 = piePlot3D0.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator2);
        java.awt.Paint paint4 = piePlot3D0.getOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean7 = piePlot3D6.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator8 = null;
        piePlot3D6.setToolTipGenerator(pieToolTipGenerator8);
        java.awt.Paint paint10 = piePlot3D6.getShadowPaint();
        piePlot3D6.setCircular(false, false);
        java.awt.Paint paint14 = piePlot3D6.getLabelOutlinePaint();
        piePlot3D0.setSectionPaint((java.lang.Comparable) (-1), paint14);
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D16.setLabelPadding(rectangleInsets17);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        piePlot3D16.handleClick((int) (short) 100, 0, plotRenderingInfo21);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator23 = piePlot3D16.getURLGenerator();
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
        org.jfree.chart.plot.PiePlot3D piePlot3D43 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D43.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets46 = piePlot3D43.getLabelPadding();
        piePlot3D43.setShadowXOffset(10.0d);
        piePlot3D43.setCircular(false);
        piePlot3D43.setLabelGap((double) (short) 1);
        java.awt.Paint paint53 = piePlot3D43.getBaseSectionOutlinePaint();
        piePlot3D25.setLabelPaint(paint53);
        piePlot3D16.setSectionPaint((java.lang.Comparable) (byte) 1, paint53);
        org.jfree.data.general.PieDataset pieDataset56 = null;
        piePlot3D16.setDataset(pieDataset56);
        java.awt.Paint paint59 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot3D16.setSectionPaint((java.lang.Comparable) "Pie 3D Plot", paint59);
        piePlot3D0.setLabelPaint(paint59);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNull(pieURLGenerator23);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNull(paint40);
        org.junit.Assert.assertNull(paint42);
        org.junit.Assert.assertNotNull(rectangleInsets46);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertNotNull(paint59);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        piePlot3D0.setIgnoreNullValues(true);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(pieDataset10);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean1 = piePlot3D0.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator2);
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = piePlot3D0.getDrawingSupplier();
        java.awt.Paint paint6 = piePlot3D0.getNoDataMessagePaint();
        double double7 = piePlot3D0.getMaximumLabelWidth();
        piePlot3D0.setShadowYOffset((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14d + "'", double7 == 0.14d);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        piePlot3D0.setLabelLinksVisible(false);
        java.awt.Paint paint24 = piePlot3D0.getOutlinePaint();
        double double25 = piePlot3D0.getLabelLinkMargin();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(pieDataset11);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.025d + "'", double25 == 0.025d);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        piePlot3D0.setMaximumLabelWidth((double) (-1.0f));
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor8);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        java.awt.Font font4 = piePlot3D0.getNoDataMessageFont();
        java.awt.Image image5 = piePlot3D0.getBackgroundImage();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = piePlot3D0.getToolTipGenerator();
        org.jfree.chart.plot.Plot plot7 = piePlot3D0.getRootPlot();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertNull(pieToolTipGenerator6);
        org.junit.Assert.assertNotNull(plot7);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot3D0.addChangeListener(plotChangeListener4);
        piePlot3D0.setBackgroundImageAlignment((int) (short) 10);
        piePlot3D0.setLabelLinksVisible(true);
        java.awt.Font font10 = piePlot3D0.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot11 = piePlot3D0.getParent();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot11.datasetChanged(datasetChangeEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNull(plot11);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator34 = piePlot3D0.getLegendLabelGenerator();
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
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator34);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        org.jfree.chart.plot.Plot plot45 = null;
        piePlot3D0.setParent(plot45);
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
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot3D0.getDatasetGroup();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent9 = null;
        piePlot3D0.notifyListeners(plotChangeEvent9);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup8);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
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
        boolean boolean10 = piePlot3D0.getLabelLinksVisible();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12d + "'", double7 == 0.12d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08d + "'", double9 == 0.08d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        org.jfree.chart.plot.Plot plot16 = piePlot3D0.getRootPlot();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(plot16);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        piePlot3D0.datasetChanged(datasetChangeEvent6);
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D9.setSectionOutlinesVisible(true);
        piePlot3D9.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        piePlot3D9.drawBackgroundImage(graphics2D14, rectangle2D15);
        piePlot3D9.zoom((double) '#');
        double double19 = piePlot3D9.getShadowXOffset();
        java.awt.Stroke stroke20 = piePlot3D9.getLabelOutlineStroke();
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) 0.14d, stroke20);
        double double22 = piePlot3D0.getLabelGap();
        java.awt.Paint paint23 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot3D0.setLabelLinkPaint(paint23);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4.0d + "'", double19 == 4.0d);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.025d + "'", double22 == 0.025d);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        boolean boolean19 = piePlot3D0.isCircular();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 90.0d + "'", double4 == 90.0d);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertNull(pieToolTipGenerator6);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNull(pieURLGenerator14);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot3D0.getLabelPadding();
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D22.setLabelPadding(rectangleInsets23);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        piePlot3D22.handleClick((int) (short) 100, 0, plotRenderingInfo27);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator29 = piePlot3D22.getURLGenerator();
        java.awt.Stroke stroke31 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D22.setSectionOutlineStroke((java.lang.Comparable) 0.4d, stroke31);
        piePlot3D22.setIgnoreNullValues(true);
        org.jfree.chart.plot.PiePlot3D piePlot3D35 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D35.setSectionOutlinesVisible(true);
        piePlot3D35.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D40 = null;
        java.awt.geom.Rectangle2D rectangle2D41 = null;
        piePlot3D35.drawBackgroundImage(graphics2D40, rectangle2D41);
        java.awt.Paint paint43 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D35.setNoDataMessagePaint(paint43);
        java.awt.Paint paint45 = piePlot3D35.getLabelOutlinePaint();
        java.awt.Graphics2D graphics2D46 = null;
        java.awt.geom.Rectangle2D rectangle2D47 = null;
        piePlot3D35.drawBackgroundImage(graphics2D46, rectangle2D47);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor49 = piePlot3D35.getLabelDistributor();
        piePlot3D22.setLabelDistributor(abstractPieLabelDistributor49);
        piePlot3D0.setLabelDistributor(abstractPieLabelDistributor49);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNull(pieURLGenerator29);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor49);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        java.awt.Paint paint2 = piePlot3D1.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D3 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D3.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke7 = piePlot3D3.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator8 = piePlot3D3.getLegendLabelGenerator();
        piePlot3D1.setLegendLabelGenerator(pieSectionLabelGenerator8);
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D10.setDarkerSides(false);
        boolean boolean13 = piePlot3D10.isOutlineVisible();
        piePlot3D1.setParent((org.jfree.chart.plot.Plot) piePlot3D10);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = piePlot3D10.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        java.awt.Paint paint16 = piePlot3D0.getLabelOutlinePaint();
        piePlot3D0.setDepthFactor((double) 10.0f);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        double double27 = piePlot3D0.getMinimumArcAngleToDraw();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0E-5d + "'", double27 == 1.0E-5d);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        boolean boolean40 = piePlot3D0.getIgnoreNullValues();
        java.awt.Paint paint41 = piePlot3D0.getLabelShadowPaint();
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(paint41);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setDarkerSides(false);
        boolean boolean3 = piePlot3D0.isOutlineVisible();
        boolean boolean4 = piePlot3D0.getIgnoreNullValues();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot3D0.getLegendLabelToolTipGenerator();
        java.awt.Paint paint6 = piePlot3D0.getBackgroundPaint();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        piePlot3D0.drawBackgroundImage(graphics2D7, rectangle2D8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(pieSectionLabelGenerator5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        double double4 = piePlot3D0.getStartAngle();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor5 = piePlot3D0.getLabelDistributor();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 90.0d + "'", double4 == 90.0d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor5);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        java.awt.Stroke stroke10 = piePlot3D0.getOutlineStroke();
        double double11 = piePlot3D0.getInteriorGap();
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D12.setSectionOutlinesVisible(true);
        piePlot3D12.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        piePlot3D12.drawBackgroundImage(graphics2D17, rectangle2D18);
        piePlot3D12.zoom((double) '#');
        java.awt.Font font22 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D12.setLabelFont(font22);
        org.jfree.chart.plot.PiePlot3D piePlot3D24 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D24.setLabelPadding(rectangleInsets25);
        java.awt.Paint paint27 = piePlot3D24.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator28 = null;
        piePlot3D24.setLegendLabelToolTipGenerator(pieSectionLabelGenerator28);
        piePlot3D24.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot32 = piePlot3D24.getRootPlot();
        java.awt.Stroke stroke33 = piePlot3D24.getOutlineStroke();
        piePlot3D12.setLabelOutlineStroke(stroke33);
        java.awt.Paint paint35 = piePlot3D12.getBaseSectionPaint();
        piePlot3D0.setBackgroundPaint(paint35);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.08d + "'", double11 == 0.08d);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(plot32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        java.awt.Paint paint34 = piePlot3D0.getNoDataMessagePaint();
        java.awt.Font font35 = piePlot3D0.getLabelFont();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator36 = piePlot3D0.getToolTipGenerator();
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
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(font35);
        org.junit.Assert.assertNull(pieToolTipGenerator36);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D12.setLabelPadding(rectangleInsets13);
        java.awt.Paint paint15 = piePlot3D12.getLabelLinkPaint();
        boolean boolean16 = piePlot3D12.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = piePlot3D12.getInsets();
        java.awt.Paint paint18 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D12.setShadowPaint(paint18);
        piePlot3D12.setIgnoreZeroValues(true);
        java.awt.Stroke stroke22 = piePlot3D12.getLabelLinkStroke();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = piePlot3D12.getDrawingSupplier();
        org.jfree.chart.plot.PiePlot3D piePlot3D24 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D24.setLabelPadding(rectangleInsets25);
        java.awt.Paint paint27 = piePlot3D24.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator28 = null;
        piePlot3D24.setLegendLabelToolTipGenerator(pieSectionLabelGenerator28);
        piePlot3D24.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot32 = piePlot3D24.getRootPlot();
        org.jfree.chart.plot.PiePlot3D piePlot3D33 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D33.setLabelPadding(rectangleInsets34);
        java.awt.Paint paint36 = piePlot3D33.getLabelLinkPaint();
        java.awt.Paint paint37 = piePlot3D33.getShadowPaint();
        piePlot3D24.setBaseSectionOutlinePaint(paint37);
        piePlot3D12.setLabelLinkPaint(paint37);
        piePlot3D0.setBaseSectionPaint(paint37);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Pie 3D Plot" + "'", str7, "Pie 3D Plot");
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(drawingSupplier23);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(plot32);
        org.junit.Assert.assertNotNull(rectangleInsets34);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(paint37);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        boolean boolean5 = piePlot3D0.isCircular();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D0.getLegendLabelGenerator();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        piePlot3D0.handleClick(1, (int) '4', plotRenderingInfo9);
        java.awt.Paint paint11 = piePlot3D0.getShadowPaint();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
        boolean boolean40 = piePlot3D0.getIgnoreNullValues();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator41 = piePlot3D0.getToolTipGenerator();
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(pieToolTipGenerator41);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        piePlot3D0.removeChangeListener(plotChangeListener8);
        java.awt.Stroke stroke11 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) "");
        java.awt.Paint paint12 = piePlot3D0.getLabelPaint();
        java.awt.Paint paint13 = piePlot3D0.getLabelLinkPaint();
        int int14 = piePlot3D0.getPieIndex();
        org.junit.Assert.assertNull(stroke11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.data.general.PieDataset pieDataset3 = piePlot3D0.getDataset();
        boolean boolean4 = piePlot3D0.isCircular();
        java.awt.Stroke stroke5 = piePlot3D0.getOutlineStroke();
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D6.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = piePlot3D6.getLabelPadding();
        piePlot3D6.setShadowXOffset(10.0d);
        piePlot3D6.setCircular(false);
        piePlot3D6.setLabelGap((double) (short) 1);
        java.awt.Stroke stroke16 = piePlot3D6.getOutlineStroke();
        piePlot3D0.setBaseSectionOutlineStroke(stroke16);
        java.lang.String str18 = piePlot3D0.getPlotType();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator19 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator19);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieDataset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Pie 3D Plot" + "'", str18, "Pie 3D Plot");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        java.awt.Font font4 = piePlot3D0.getNoDataMessageFont();
        java.awt.Paint paint5 = piePlot3D0.getOutlinePaint();
        java.awt.Font font6 = piePlot3D0.getNoDataMessageFont();
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D7.setLabelPadding(rectangleInsets8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        piePlot3D7.handleClick((int) (short) 100, 0, plotRenderingInfo12);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator14 = piePlot3D7.getURLGenerator();
        java.awt.Stroke stroke16 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D7.setSectionOutlineStroke((java.lang.Comparable) 0.4d, stroke16);
        piePlot3D7.setIgnoreNullValues(true);
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D20.setSectionOutlinesVisible(true);
        piePlot3D20.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        piePlot3D20.drawBackgroundImage(graphics2D25, rectangle2D26);
        java.awt.Paint paint28 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D20.setNoDataMessagePaint(paint28);
        java.awt.Paint paint30 = piePlot3D20.getLabelOutlinePaint();
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        piePlot3D20.drawBackgroundImage(graphics2D31, rectangle2D32);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor34 = piePlot3D20.getLabelDistributor();
        piePlot3D7.setLabelDistributor(abstractPieLabelDistributor34);
        piePlot3D0.setLabelDistributor(abstractPieLabelDistributor34);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNull(pieURLGenerator14);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor34);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.data.general.PieDataset pieDataset3 = piePlot3D0.getDataset();
        piePlot3D0.setDarkerSides(true);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.drawBackground(graphics2D6, rectangle2D7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieDataset3);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setInteriorGap((double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (35.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = piePlot3D0.getSimpleLabelOffset();
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D9.setLabelPadding(rectangleInsets10);
        java.awt.Paint paint12 = piePlot3D9.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = null;
        piePlot3D9.setLegendLabelToolTipGenerator(pieSectionLabelGenerator13);
        piePlot3D9.setLabelLinkMargin(0.0d);
        piePlot3D9.setPieIndex((int) ' ');
        java.awt.Paint paint19 = piePlot3D9.getBaseSectionOutlinePaint();
        piePlot3D0.setSectionPaint((java.lang.Comparable) '4', paint19);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot3D0.getSimpleLabelOffset();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator22 = piePlot3D0.getLegendLabelGenerator();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator22);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        java.awt.Paint paint44 = piePlot3D0.getBaseSectionOutlinePaint();
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
        org.junit.Assert.assertNotNull(paint44);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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
        java.awt.Paint paint14 = piePlot3D11.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = null;
        piePlot3D11.setLegendLabelToolTipGenerator(pieSectionLabelGenerator15);
        piePlot3D11.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot19 = piePlot3D11.getRootPlot();
        java.awt.Paint paint20 = piePlot3D11.getBaseSectionOutlinePaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        piePlot3D11.addChangeListener(plotChangeListener21);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent23 = null;
        piePlot3D11.axisChanged(axisChangeEvent23);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = piePlot3D11.getLegendLabelGenerator();
        java.awt.Font font26 = piePlot3D11.getNoDataMessageFont();
        piePlot3D0.setNoDataMessageFont(font26);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator28 = piePlot3D0.getToolTipGenerator();
        org.jfree.chart.plot.PiePlot3D piePlot3D29 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D29.setSectionOutlinesVisible(true);
        piePlot3D29.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        piePlot3D29.drawBackgroundImage(graphics2D34, rectangle2D35);
        java.awt.Paint paint37 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D29.setNoDataMessagePaint(paint37);
        piePlot3D0.setBaseSectionOutlinePaint(paint37);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(plot19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator25);
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertNull(pieToolTipGenerator28);
        org.junit.Assert.assertNotNull(paint37);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        java.awt.Font font4 = piePlot3D0.getNoDataMessageFont();
        java.awt.Paint paint5 = piePlot3D0.getShadowPaint();
        piePlot3D0.setStartAngle((double) (-1.0f));
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = piePlot3D0.getLabelPadding();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        piePlot3D0.handleClick((int) '4', (int) (short) 0, plotRenderingInfo12);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.data.general.PieDataset pieDataset3 = piePlot3D0.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup4 = piePlot3D0.getDatasetGroup();
        piePlot3D0.setDarkerSides(false);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieDataset3);
        org.junit.Assert.assertNull(datasetGroup4);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        piePlot3D0.setStartAngle((double) 'a');
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator12 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator12);
        piePlot3D0.setShadowXOffset(0.0d);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator16 = piePlot3D0.getLegendLabelGenerator();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator16);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        piePlot3D0.setShadowXOffset((double) 15);
        java.lang.String str7 = piePlot3D0.getPlotType();
        java.awt.Paint paint8 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D0.setShadowPaint(paint8);
        java.awt.Stroke stroke10 = piePlot3D0.getOutlineStroke();
        java.awt.Paint paint11 = piePlot3D0.getLabelBackgroundPaint();
        boolean boolean12 = piePlot3D0.getDarkerSides();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Pie 3D Plot" + "'", str7, "Pie 3D Plot");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        piePlot3D0.setOutlineVisible(false);
        java.awt.Paint paint7 = piePlot3D0.getNoDataMessagePaint();
        int int8 = piePlot3D0.getPieIndex();
        java.awt.Font font9 = piePlot3D0.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(font9);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        boolean boolean46 = piePlot3D0.isCircular();
        java.awt.Paint paint47 = piePlot3D0.getNoDataMessagePaint();
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(paint47);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.data.general.PieDataset pieDataset3 = piePlot3D0.getDataset();
        org.jfree.chart.plot.PiePlot3D piePlot3D4 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D4.setLabelPadding(rectangleInsets5);
        java.awt.Paint paint7 = piePlot3D4.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator8 = null;
        piePlot3D4.setLegendLabelToolTipGenerator(pieSectionLabelGenerator8);
        piePlot3D4.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot12 = piePlot3D4.getRootPlot();
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D13.setLabelPadding(rectangleInsets14);
        java.awt.Paint paint16 = piePlot3D13.getLabelLinkPaint();
        java.awt.Paint paint17 = piePlot3D13.getShadowPaint();
        piePlot3D4.setBaseSectionOutlinePaint(paint17);
        java.awt.Font font19 = piePlot3D4.getLabelFont();
        java.awt.Stroke stroke20 = piePlot3D4.getOutlineStroke();
        piePlot3D0.setLabelOutlineStroke(stroke20);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieDataset3);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(stroke20);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
        float float14 = piePlot3D0.getBackgroundAlpha();
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        java.awt.Paint paint19 = null;
        piePlot3D0.setShadowPaint(paint19);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.025d + "'", double18 == 0.025d);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        piePlot3D0.setPieIndex(100);
        piePlot3D0.setDarkerSides(true);
        org.jfree.data.general.DatasetGroup datasetGroup23 = piePlot3D0.getDatasetGroup();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(pieURLGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup23);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        piePlot3D0.datasetChanged(datasetChangeEvent6);
        int int8 = piePlot3D0.getBackgroundImageAlignment();
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D9.setLabelPadding(rectangleInsets10);
        java.awt.Paint paint12 = piePlot3D9.getLabelLinkPaint();
        boolean boolean13 = piePlot3D9.getLabelLinksVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D14.setLabelPadding(rectangleInsets15);
        piePlot3D9.setSimpleLabelOffset(rectangleInsets15);
        piePlot3D0.setSimpleLabelOffset(rectangleInsets15);
        piePlot3D0.zoom((-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            double double21 = piePlot3D0.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        double double4 = piePlot3D0.getStartAngle();
        double double5 = piePlot3D0.getShadowYOffset();
        piePlot3D0.setStartAngle((double) 10.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = piePlot3D0.getLabelPadding();
        float float9 = piePlot3D0.getForegroundAlpha();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 90.0d + "'", double4 == 90.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setDarkerSides(false);
        boolean boolean3 = piePlot3D0.isOutlineVisible();
        boolean boolean4 = piePlot3D0.getIgnoreNullValues();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot3D0.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean7 = piePlot3D6.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator8 = null;
        piePlot3D6.setToolTipGenerator(pieToolTipGenerator8);
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D10.setSectionOutlinesVisible(true);
        piePlot3D10.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        piePlot3D10.drawBackgroundImage(graphics2D15, rectangle2D16);
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D10.setNoDataMessagePaint(paint18);
        java.awt.Stroke stroke20 = piePlot3D10.getLabelOutlineStroke();
        piePlot3D6.setLabelOutlineStroke(stroke20);
        piePlot3D0.setLabelOutlineStroke(stroke20);
        java.awt.Paint paint23 = piePlot3D0.getLabelPaint();
        piePlot3D0.setBackgroundImageAlignment((int) (byte) 1);
        boolean boolean26 = piePlot3D0.getSimpleLabels();
        // The following exception was thrown during execution in test generation
        try {
            double double27 = piePlot3D0.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(pieSectionLabelGenerator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        piePlot3D0.setOutlineVisible(true);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator9 = piePlot3D0.getLegendLabelToolTipGenerator();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator10 = piePlot3D0.getLegendLabelGenerator();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(pieSectionLabelGenerator9);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator10);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D12.setLabelPadding(rectangleInsets13);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        piePlot3D12.handleClick((int) (short) 100, 0, plotRenderingInfo17);
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D19.setLabelPadding(rectangleInsets20);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        piePlot3D19.handleClick((int) (short) 100, 0, plotRenderingInfo24);
        boolean boolean26 = piePlot3D19.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D27 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D27.setLabelPadding(rectangleInsets28);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = null;
        piePlot3D27.handleClick((int) (short) 100, 0, plotRenderingInfo32);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator34 = piePlot3D27.getURLGenerator();
        java.awt.Stroke stroke36 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D27.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke36);
        piePlot3D19.setLabelOutlineStroke(stroke36);
        piePlot3D12.setLabelLinkStroke(stroke36);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor40 = piePlot3D12.getLabelDistributor();
        org.jfree.chart.plot.PiePlot3D piePlot3D41 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D41.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke45 = piePlot3D41.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator46 = piePlot3D41.getLegendLabelGenerator();
        piePlot3D12.setLegendLabelToolTipGenerator(pieSectionLabelGenerator46);
        float float48 = piePlot3D12.getBackgroundAlpha();
        piePlot3D12.setIgnoreNullValues(false);
        java.awt.Paint paint51 = piePlot3D12.getLabelPaint();
        piePlot3D0.setNoDataMessagePaint(paint51);
        float float53 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Font font54 = piePlot3D0.getNoDataMessageFont();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent55 = null;
        piePlot3D0.notifyListeners(plotChangeEvent55);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNull(pieURLGenerator34);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor40);
        org.junit.Assert.assertNull(stroke45);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator46);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 1.0f + "'", float48 == 1.0f);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 0.5f + "'", float53 == 0.5f);
        org.junit.Assert.assertNotNull(font54);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        float float3 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot3D0.drawBackgroundImage(graphics2D4, rectangle2D5);
        piePlot3D0.setDepthFactor((double) '#');
        float float9 = piePlot3D0.getBackgroundAlpha();
        java.awt.Paint paint10 = piePlot3D0.getBackgroundPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D11.setSectionOutlinesVisible(true);
        piePlot3D11.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        piePlot3D11.drawBackgroundImage(graphics2D16, rectangle2D17);
        piePlot3D11.zoom((double) '#');
        java.awt.Font font21 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D11.setLabelFont(font21);
        piePlot3D11.setDepthFactor(4.0d);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = piePlot3D11.getLabelGenerator();
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator25);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator25);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        float float3 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot3D0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint7 = piePlot3D0.getShadowPaint();
        java.lang.Object obj8 = piePlot3D0.clone();
        java.lang.String str9 = piePlot3D0.getNoDataMessage();
        java.awt.Stroke stroke10 = null;
        piePlot3D0.setLabelOutlineStroke(stroke10);
        org.jfree.chart.plot.Plot plot12 = piePlot3D0.getParent();
        piePlot3D0.setMinimumArcAngleToDraw(100.0d);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(plot12);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        double double7 = piePlot3D0.getDepthFactor();
        int int8 = piePlot3D0.getPieIndex();
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D9.setLabelPadding(rectangleInsets10);
        java.awt.Paint paint12 = piePlot3D9.getLabelLinkPaint();
        boolean boolean13 = piePlot3D9.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent14 = null;
        piePlot3D9.notifyListeners(plotChangeEvent14);
        double double16 = piePlot3D9.getDepthFactor();
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D17.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = piePlot3D17.getLabelPadding();
        java.awt.Font font21 = piePlot3D17.getNoDataMessageFont();
        java.awt.Paint paint22 = piePlot3D17.getOutlinePaint();
        java.awt.Font font23 = piePlot3D17.getNoDataMessageFont();
        piePlot3D9.setLabelFont(font23);
        piePlot3D0.setLabelFont(font23);
        piePlot3D0.setMaximumLabelWidth(0.08d);
        piePlot3D0.setCircular(true, true);
        java.awt.Paint paint32 = piePlot3D0.getSectionPaint((java.lang.Comparable) (-1L));
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12d + "'", double7 == 0.12d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.12d + "'", double16 == 0.12d);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNull(paint32);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        float float7 = piePlot3D0.getForegroundAlpha();
        java.awt.Paint paint8 = piePlot3D0.getBaseSectionOutlinePaint();
        java.lang.Object obj9 = piePlot3D0.clone();
        java.awt.Stroke stroke10 = piePlot3D0.getLabelOutlineStroke();
        java.awt.Paint paint11 = piePlot3D0.getOutlinePaint();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent20 = null;
        piePlot3D0.markerChanged(markerChangeEvent20);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = piePlot3D0.getLegendLabelURLGenerator();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNull(pieURLGenerator22);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot3D0.addChangeListener(plotChangeListener4);
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D6.setLabelPadding(rectangleInsets7);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        piePlot3D6.handleClick((int) (short) 100, 0, plotRenderingInfo11);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = piePlot3D6.getURLGenerator();
        java.awt.Stroke stroke15 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D6.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke15);
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D17.setLabelPadding(rectangleInsets18);
        java.awt.Paint paint20 = piePlot3D17.getLabelLinkPaint();
        boolean boolean21 = piePlot3D17.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent22 = null;
        piePlot3D17.notifyListeners(plotChangeEvent22);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = piePlot3D17.getSimpleLabelOffset();
        piePlot3D6.setSimpleLabelOffset(rectangleInsets24);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent26 = null;
        piePlot3D6.axisChanged(axisChangeEvent26);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = piePlot3D6.getSimpleLabelOffset();
        piePlot3D0.setInsets(rectangleInsets28);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNull(pieURLGenerator13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(rectangleInsets28);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot3D0.getURLGenerator();
        java.awt.Paint paint8 = piePlot3D0.getLabelOutlinePaint();
        double double9 = piePlot3D0.getLabelLinkMargin();
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
        org.jfree.chart.plot.PiePlot3D piePlot3D44 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D44.setLabelPadding(rectangleInsets45);
        java.awt.Paint paint47 = piePlot3D44.getLabelLinkPaint();
        boolean boolean48 = piePlot3D44.getLabelLinksVisible();
        double double49 = piePlot3D44.getLabelLinkMargin();
        piePlot3D44.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup52 = piePlot3D44.getDatasetGroup();
        piePlot3D44.setBackgroundImageAlignment(1);
        java.awt.Paint paint55 = piePlot3D44.getLabelLinkPaint();
        piePlot3D10.setLabelShadowPaint(paint55);
        java.awt.Paint paint57 = piePlot3D10.getLabelPaint();
        piePlot3D0.setBackgroundPaint(paint57);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.025d + "'", double9 == 0.025d);
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
        org.junit.Assert.assertNotNull(rectangleInsets45);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.025d + "'", double49 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup52);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNotNull(paint57);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator11 = null;
        piePlot3D0.setURLGenerator(pieURLGenerator11);
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D13.setLabelPadding(rectangleInsets14);
        java.awt.Paint paint16 = piePlot3D13.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator17 = null;
        piePlot3D13.setLegendLabelToolTipGenerator(pieSectionLabelGenerator17);
        piePlot3D13.setLabelLinkMargin(0.0d);
        piePlot3D13.setShadowXOffset(1.0d);
        org.jfree.chart.plot.PiePlot3D piePlot3D23 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D23.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = piePlot3D23.getLabelPadding();
        piePlot3D23.setShadowXOffset(10.0d);
        piePlot3D23.setCircular(false);
        piePlot3D23.setLabelGap((double) (short) 1);
        java.awt.Paint paint33 = piePlot3D23.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke34 = piePlot3D23.getLabelLinkStroke();
        java.awt.Paint paint35 = piePlot3D23.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D36 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D36.setLabelPadding(rectangleInsets37);
        java.awt.Paint paint39 = piePlot3D36.getLabelLinkPaint();
        boolean boolean40 = piePlot3D36.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = piePlot3D36.getInsets();
        java.awt.Paint paint42 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D36.setShadowPaint(paint42);
        piePlot3D23.setLabelPaint(paint42);
        org.jfree.chart.plot.PiePlot3D piePlot3D45 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets46 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D45.setLabelPadding(rectangleInsets46);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo50 = null;
        piePlot3D45.handleClick((int) (short) 100, 0, plotRenderingInfo50);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator52 = piePlot3D45.getURLGenerator();
        java.awt.Stroke stroke54 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D45.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke54);
        piePlot3D23.setOutlineStroke(stroke54);
        piePlot3D13.setLabelOutlineStroke(stroke54);
        piePlot3D0.setBaseSectionOutlineStroke(stroke54);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(pieDataset10);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(rectangleInsets37);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(rectangleInsets41);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(rectangleInsets46);
        org.junit.Assert.assertNull(pieURLGenerator52);
        org.junit.Assert.assertNotNull(stroke54);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        piePlot3D0.setPieIndex(10);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator30 = null;
        piePlot3D0.setLegendLabelURLGenerator(pieURLGenerator30);
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
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = piePlot3D0.getSimpleLabelOffset();
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D9.setLabelPadding(rectangleInsets10);
        java.awt.Paint paint12 = piePlot3D9.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = null;
        piePlot3D9.setLegendLabelToolTipGenerator(pieSectionLabelGenerator13);
        piePlot3D9.setLabelLinkMargin(0.0d);
        piePlot3D9.setPieIndex((int) ' ');
        java.awt.Paint paint19 = piePlot3D9.getBaseSectionOutlinePaint();
        piePlot3D0.setSectionPaint((java.lang.Comparable) '4', paint19);
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D21.setLabelPadding(rectangleInsets22);
        java.awt.Paint paint24 = piePlot3D21.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = null;
        piePlot3D21.setLegendLabelToolTipGenerator(pieSectionLabelGenerator25);
        piePlot3D21.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot29 = piePlot3D21.getRootPlot();
        java.awt.Paint paint30 = piePlot3D21.getBaseSectionOutlinePaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener31 = null;
        piePlot3D21.addChangeListener(plotChangeListener31);
        java.awt.Paint paint33 = piePlot3D21.getLabelPaint();
        piePlot3D0.setNoDataMessagePaint(paint33);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(plot29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        java.awt.Paint paint30 = piePlot3D0.getBaseSectionPaint();
        java.awt.Font font31 = piePlot3D0.getLabelFont();
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
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(font31);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        double double4 = piePlot3D0.getStartAngle();
        double double5 = piePlot3D0.getShadowYOffset();
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        piePlot3D0.addChangeListener(plotChangeListener6);
        piePlot3D0.setLabelGap(0.14d);
        boolean boolean10 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.plot.Plot plot11 = piePlot3D0.getRootPlot();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 90.0d + "'", double4 == 90.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(plot11);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        org.jfree.chart.plot.Plot plot6 = piePlot3D0.getParent();
        java.awt.Paint paint7 = piePlot3D0.getShadowPaint();
        piePlot3D0.setDepthFactor(0.0d);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        piePlot3D0.notifyListeners(plotChangeEvent10);
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D12.setLabelPadding(rectangleInsets13);
        java.awt.Paint paint15 = piePlot3D12.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator16 = null;
        piePlot3D12.setLegendLabelToolTipGenerator(pieSectionLabelGenerator16);
        piePlot3D12.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot20 = piePlot3D12.getRootPlot();
        java.awt.Paint paint21 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_OUTLINE_PAINT;
        piePlot3D12.setBaseSectionOutlinePaint(paint21);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator23 = null;
        piePlot3D12.setLegendLabelURLGenerator(pieURLGenerator23);
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D25.setLabelPadding(rectangleInsets26);
        java.awt.Paint paint28 = piePlot3D25.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator29 = null;
        piePlot3D25.setLegendLabelToolTipGenerator(pieSectionLabelGenerator29);
        piePlot3D25.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot33 = piePlot3D25.getRootPlot();
        java.awt.Stroke stroke34 = piePlot3D25.getOutlineStroke();
        piePlot3D25.setStartAngle((double) (byte) 0);
        org.jfree.chart.plot.PiePlot3D piePlot3D37 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D37.setLabelPadding(rectangleInsets38);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        piePlot3D37.handleClick((int) (short) 100, 0, plotRenderingInfo42);
        org.jfree.chart.plot.PiePlot3D piePlot3D44 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D44.setLabelPadding(rectangleInsets45);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo49 = null;
        piePlot3D44.handleClick((int) (short) 100, 0, plotRenderingInfo49);
        boolean boolean51 = piePlot3D44.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D52 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets53 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D52.setLabelPadding(rectangleInsets53);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo57 = null;
        piePlot3D52.handleClick((int) (short) 100, 0, plotRenderingInfo57);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator59 = piePlot3D52.getURLGenerator();
        java.awt.Stroke stroke61 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D52.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke61);
        piePlot3D44.setLabelOutlineStroke(stroke61);
        piePlot3D37.setLabelLinkStroke(stroke61);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor65 = piePlot3D37.getLabelDistributor();
        org.jfree.chart.plot.PiePlot3D piePlot3D66 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D66.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke70 = piePlot3D66.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator71 = piePlot3D66.getLegendLabelGenerator();
        piePlot3D37.setLegendLabelToolTipGenerator(pieSectionLabelGenerator71);
        float float73 = piePlot3D37.getBackgroundAlpha();
        piePlot3D37.setIgnoreNullValues(false);
        java.awt.Paint paint76 = piePlot3D37.getLabelPaint();
        piePlot3D25.setNoDataMessagePaint(paint76);
        piePlot3D12.setLabelLinkPaint(paint76);
        java.awt.Font font79 = piePlot3D12.getLabelFont();
        piePlot3D0.setNoDataMessageFont(font79);
        java.awt.Stroke stroke81 = piePlot3D0.getLabelLinkStroke();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(plot33);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(rectangleInsets38);
        org.junit.Assert.assertNotNull(rectangleInsets45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(rectangleInsets53);
        org.junit.Assert.assertNull(pieURLGenerator59);
        org.junit.Assert.assertNotNull(stroke61);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor65);
        org.junit.Assert.assertNull(stroke70);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator71);
        org.junit.Assert.assertTrue("'" + float73 + "' != '" + 1.0f + "'", float73 == 1.0f);
        org.junit.Assert.assertNotNull(paint76);
        org.junit.Assert.assertNotNull(font79);
        org.junit.Assert.assertNotNull(stroke81);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = piePlot3D0.getSimpleLabelOffset();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(pieURLGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rectangleInsets19);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        piePlot3D0.zoom((double) '#');
        java.awt.Font font10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D0.setLabelFont(font10);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator12 = piePlot3D0.getToolTipGenerator();
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
        piePlot3D0.setLabelOutlineStroke(stroke44);
        org.jfree.chart.plot.PiePlot3D piePlot3D48 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets49 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D48.setLabelPadding(rectangleInsets49);
        float float51 = piePlot3D48.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D52 = null;
        java.awt.geom.Rectangle2D rectangle2D53 = null;
        piePlot3D48.drawBackgroundImage(graphics2D52, rectangle2D53);
        java.awt.Font font55 = piePlot3D48.getLabelFont();
        piePlot3D48.setShadowYOffset((double) 10.0f);
        org.jfree.chart.plot.PiePlot3D piePlot3D58 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets59 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D58.setLabelPadding(rectangleInsets59);
        float float61 = piePlot3D58.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D62 = null;
        java.awt.geom.Rectangle2D rectangle2D63 = null;
        piePlot3D58.drawBackgroundImage(graphics2D62, rectangle2D63);
        float float65 = piePlot3D58.getBackgroundImageAlpha();
        org.jfree.chart.util.Rotation rotation66 = piePlot3D58.getDirection();
        piePlot3D48.setDirection(rotation66);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor68 = piePlot3D48.getLabelDistributor();
        piePlot3D0.setLabelDistributor(abstractPieLabelDistributor68);
        java.awt.Stroke stroke71 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) (byte) 10);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNull(pieToolTipGenerator12);
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
        org.junit.Assert.assertNotNull(rectangleInsets49);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 0.5f + "'", float51 == 0.5f);
        org.junit.Assert.assertNotNull(font55);
        org.junit.Assert.assertNotNull(rectangleInsets59);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + 0.5f + "'", float61 == 0.5f);
        org.junit.Assert.assertTrue("'" + float65 + "' != '" + 0.5f + "'", float65 == 0.5f);
        org.junit.Assert.assertNotNull(rotation66);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor68);
        org.junit.Assert.assertNull(stroke71);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
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
        java.awt.Image image11 = piePlot3D0.getBackgroundImage();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = piePlot3D0.getLabelDistributor();
        java.awt.Paint paint13 = piePlot3D0.getLabelShadowPaint();
        java.awt.Paint paint15 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) 0.4d);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(paint15);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        piePlot3D0.handleClick((int) '#', 0, plotRenderingInfo16);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        float float7 = piePlot3D0.getForegroundAlpha();
        java.awt.Paint paint8 = piePlot3D0.getBaseSectionOutlinePaint();
        java.awt.Paint paint9 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot3D0.setOutlinePaint(paint9);
        java.awt.Paint paint11 = piePlot3D0.getOutlinePaint();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator12 = piePlot3D0.getToolTipGenerator();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = null;
        piePlot3D0.setURLGenerator(pieURLGenerator13);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(pieToolTipGenerator12);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        piePlot3D0.setPieIndex((int) ' ');
        piePlot3D0.zoom((double) (short) 0);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator11 = null;
        piePlot3D0.setURLGenerator(pieURLGenerator11);
        piePlot3D0.zoom((double) 1L);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(pieDataset10);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean12 = piePlot3D11.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator13 = null;
        piePlot3D11.setToolTipGenerator(pieToolTipGenerator13);
        org.jfree.chart.plot.PiePlot3D piePlot3D15 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D15.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke19 = piePlot3D15.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator20 = piePlot3D15.getLegendLabelGenerator();
        piePlot3D11.setLabelGenerator(pieSectionLabelGenerator20);
        boolean boolean22 = piePlot3D0.equals((java.lang.Object) piePlot3D11);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(pieSectionLabelGenerator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(stroke19);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = piePlot3D0.getSimpleLabelOffset();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.5f + "'", float30 == 0.5f);
        org.junit.Assert.assertNotNull(rectangleInsets31);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D22.setLabelPadding(rectangleInsets23);
        piePlot3D0.setInsets(rectangleInsets23);
        piePlot3D0.setSimpleLabels(false);
        piePlot3D0.zoom((double) (byte) -1);
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        piePlot3D0.drawBackgroundImage(graphics2D30, rectangle2D31);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets23);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        java.awt.geom.Point2D point2D10 = null;
        org.jfree.chart.plot.PlotState plotState11 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.draw(graphics2D8, rectangle2D9, point2D10, plotState11, plotRenderingInfo12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = null;
        piePlot3D0.setURLGenerator(pieURLGenerator4);
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D6.setLabelPadding(rectangleInsets7);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        piePlot3D6.handleClick((int) (short) 100, 0, plotRenderingInfo11);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = piePlot3D6.getURLGenerator();
        java.awt.Stroke stroke15 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D6.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke15);
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D17.setLabelPadding(rectangleInsets18);
        java.awt.Paint paint20 = piePlot3D17.getLabelLinkPaint();
        boolean boolean21 = piePlot3D17.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent22 = null;
        piePlot3D17.notifyListeners(plotChangeEvent22);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = piePlot3D17.getSimpleLabelOffset();
        piePlot3D6.setSimpleLabelOffset(rectangleInsets24);
        java.awt.Font font26 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D6.setNoDataMessageFont(font26);
        org.jfree.data.general.PieDataset pieDataset28 = piePlot3D6.getDataset();
        boolean boolean29 = piePlot3D6.getSimpleLabels();
        java.awt.Paint paint30 = piePlot3D6.getLabelOutlinePaint();
        piePlot3D0.setLabelOutlinePaint(paint30);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNull(pieURLGenerator13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertNull(pieDataset28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D13.setLabelPadding(rectangleInsets14);
        java.awt.Paint paint16 = piePlot3D13.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator17 = null;
        piePlot3D13.setLegendLabelToolTipGenerator(pieSectionLabelGenerator17);
        piePlot3D13.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot21 = piePlot3D13.getRootPlot();
        java.awt.Stroke stroke22 = piePlot3D13.getOutlineStroke();
        piePlot3D13.setStartAngle((double) (byte) 0);
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D25.setLabelPadding(rectangleInsets26);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        piePlot3D25.handleClick((int) (short) 100, 0, plotRenderingInfo30);
        org.jfree.chart.plot.PiePlot3D piePlot3D32 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D32.setLabelPadding(rectangleInsets33);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        piePlot3D32.handleClick((int) (short) 100, 0, plotRenderingInfo37);
        boolean boolean39 = piePlot3D32.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D40 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D40.setLabelPadding(rectangleInsets41);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo45 = null;
        piePlot3D40.handleClick((int) (short) 100, 0, plotRenderingInfo45);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator47 = piePlot3D40.getURLGenerator();
        java.awt.Stroke stroke49 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D40.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke49);
        piePlot3D32.setLabelOutlineStroke(stroke49);
        piePlot3D25.setLabelLinkStroke(stroke49);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor53 = piePlot3D25.getLabelDistributor();
        org.jfree.chart.plot.PiePlot3D piePlot3D54 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D54.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke58 = piePlot3D54.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator59 = piePlot3D54.getLegendLabelGenerator();
        piePlot3D25.setLegendLabelToolTipGenerator(pieSectionLabelGenerator59);
        float float61 = piePlot3D25.getBackgroundAlpha();
        piePlot3D25.setIgnoreNullValues(false);
        java.awt.Paint paint64 = piePlot3D25.getLabelPaint();
        piePlot3D13.setNoDataMessagePaint(paint64);
        piePlot3D0.setLabelLinkPaint(paint64);
        java.awt.Graphics2D graphics2D67 = null;
        java.awt.geom.Rectangle2D rectangle2D68 = null;
        piePlot3D0.drawBackgroundImage(graphics2D67, rectangle2D68);
        org.jfree.chart.plot.PiePlot3D piePlot3D70 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets71 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D70.setLabelPadding(rectangleInsets71);
        java.awt.Paint paint73 = piePlot3D70.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator74 = null;
        piePlot3D70.setLegendLabelToolTipGenerator(pieSectionLabelGenerator74);
        piePlot3D70.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot78 = piePlot3D70.getRootPlot();
        java.awt.Paint paint79 = piePlot3D70.getBaseSectionOutlinePaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener80 = null;
        piePlot3D70.addChangeListener(plotChangeListener80);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent82 = null;
        piePlot3D70.axisChanged(axisChangeEvent82);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator84 = piePlot3D70.getLegendLabelGenerator();
        piePlot3D0.setLegendLabelGenerator(pieSectionLabelGenerator84);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(plot21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(rectangleInsets41);
        org.junit.Assert.assertNull(pieURLGenerator47);
        org.junit.Assert.assertNotNull(stroke49);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor53);
        org.junit.Assert.assertNull(stroke58);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator59);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + 1.0f + "'", float61 == 1.0f);
        org.junit.Assert.assertNotNull(paint64);
        org.junit.Assert.assertNotNull(rectangleInsets71);
        org.junit.Assert.assertNotNull(paint73);
        org.junit.Assert.assertNotNull(plot78);
        org.junit.Assert.assertNotNull(paint79);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator84);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setDarkerSides(false);
        boolean boolean3 = piePlot3D0.isOutlineVisible();
        boolean boolean4 = piePlot3D0.getIgnoreNullValues();
        java.awt.Font font5 = piePlot3D0.getLabelFont();
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D6.setLabelPadding(rectangleInsets7);
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean11 = piePlot3D10.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator12 = null;
        piePlot3D10.setToolTipGenerator(pieToolTipGenerator12);
        java.awt.Paint paint14 = piePlot3D10.getShadowPaint();
        piePlot3D6.setSectionPaint((java.lang.Comparable) (short) -1, paint14);
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D16.setLabelPadding(rectangleInsets17);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        piePlot3D16.handleClick((int) (short) 100, 0, plotRenderingInfo21);
        boolean boolean23 = piePlot3D16.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D24 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D24.setLabelPadding(rectangleInsets25);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        piePlot3D24.handleClick((int) (short) 100, 0, plotRenderingInfo29);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator31 = piePlot3D24.getURLGenerator();
        java.awt.Stroke stroke33 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D24.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke33);
        piePlot3D16.setLabelOutlineStroke(stroke33);
        piePlot3D6.setLabelLinkStroke(stroke33);
        piePlot3D0.setOutlineStroke(stroke33);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNull(pieURLGenerator31);
        org.junit.Assert.assertNotNull(stroke33);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        org.jfree.chart.plot.Plot plot6 = piePlot3D0.getParent();
        java.awt.Paint paint7 = piePlot3D0.getShadowPaint();
        piePlot3D0.setDepthFactor(0.0d);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        piePlot3D0.notifyListeners(plotChangeEvent10);
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D14.setLabelPadding(rectangleInsets15);
        java.awt.Paint paint17 = piePlot3D14.getLabelLinkPaint();
        boolean boolean18 = piePlot3D14.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        piePlot3D14.notifyListeners(plotChangeEvent19);
        double double21 = piePlot3D14.getDepthFactor();
        double double22 = piePlot3D14.getInteriorGap();
        double double23 = piePlot3D14.getInteriorGap();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        piePlot3D14.markerChanged(markerChangeEvent24);
        java.awt.Paint paint26 = piePlot3D14.getNoDataMessagePaint();
        java.awt.Paint paint27 = piePlot3D14.getLabelOutlinePaint();
        piePlot3D0.setLabelOutlinePaint(paint27);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.12d + "'", double21 == 0.12d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.08d + "'", double22 == 0.08d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.08d + "'", double23 == 0.08d);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = piePlot3D0.getLabelPadding();
        org.jfree.chart.plot.PiePlot3D piePlot3D24 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D24.setLabelPadding(rectangleInsets25);
        java.awt.Paint paint27 = piePlot3D24.getLabelLinkPaint();
        boolean boolean28 = piePlot3D24.getLabelLinksVisible();
        double double29 = piePlot3D24.getDepthFactor();
        org.jfree.chart.plot.PiePlot3D piePlot3D30 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D30.setLabelPadding(rectangleInsets31);
        org.jfree.chart.plot.PiePlot3D piePlot3D34 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean35 = piePlot3D34.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator36 = null;
        piePlot3D34.setToolTipGenerator(pieToolTipGenerator36);
        java.awt.Paint paint38 = piePlot3D34.getShadowPaint();
        piePlot3D30.setSectionPaint((java.lang.Comparable) (short) -1, paint38);
        piePlot3D24.setLabelPaint(paint38);
        java.awt.Paint paint41 = piePlot3D24.getOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D42 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D42.setLabelPadding(rectangleInsets43);
        java.awt.Paint paint45 = piePlot3D42.getLabelLinkPaint();
        boolean boolean46 = piePlot3D42.getLabelLinksVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D47 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets48 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D47.setLabelPadding(rectangleInsets48);
        piePlot3D42.setSimpleLabelOffset(rectangleInsets48);
        java.awt.Font font51 = piePlot3D42.getLabelFont();
        piePlot3D24.setNoDataMessageFont(font51);
        java.awt.Paint paint53 = piePlot3D24.getOutlinePaint();
        java.awt.Paint paint54 = piePlot3D24.getLabelShadowPaint();
        piePlot3D0.setLabelLinkPaint(paint54);
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
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.12d + "'", double29 == 0.12d);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(rectangleInsets43);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(rectangleInsets48);
        org.junit.Assert.assertNotNull(font51);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertNotNull(paint54);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
        java.awt.Paint paint25 = piePlot3D0.getOutlinePaint();
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
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        piePlot3D0.setShadowXOffset((double) 15);
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D7.setLabelPadding(rectangleInsets8);
        java.awt.Paint paint10 = piePlot3D7.getLabelLinkPaint();
        boolean boolean11 = piePlot3D7.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = piePlot3D7.getInsets();
        java.awt.Image image13 = null;
        piePlot3D7.setBackgroundImage(image13);
        java.awt.Paint paint15 = piePlot3D7.getShadowPaint();
        piePlot3D0.setLabelLinkPaint(paint15);
        piePlot3D0.setPieIndex((-1));
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator19 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator19);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
        piePlot3D0.setSimpleLabels(true);
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
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot3D0.getInsets();
        java.awt.Image image6 = null;
        piePlot3D0.setBackgroundImage(image6);
        float float8 = piePlot3D0.getBackgroundAlpha();
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D9.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = piePlot3D9.getLabelPadding();
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D9.setNoDataMessagePaint(paint13);
        piePlot3D0.setLabelLinkPaint(paint13);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = piePlot3D0.getDrawingSupplier();
        piePlot3D0.setInteriorGap(0.0d);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator19 = piePlot3D0.getLabelGenerator();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(drawingSupplier16);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator19);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot3D0.getInsets();
        java.awt.Image image6 = null;
        piePlot3D0.setBackgroundImage(image6);
        float float8 = piePlot3D0.getBackgroundAlpha();
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D9.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = piePlot3D9.getLabelPadding();
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D9.setNoDataMessagePaint(paint13);
        piePlot3D0.setLabelLinkPaint(paint13);
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D16.setLabelPadding(rectangleInsets17);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        piePlot3D16.handleClick((int) (short) 100, 0, plotRenderingInfo21);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator23 = piePlot3D16.getURLGenerator();
        java.awt.Stroke stroke25 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D16.setSectionOutlineStroke((java.lang.Comparable) 0.4d, stroke25);
        piePlot3D0.setLabelLinkStroke(stroke25);
        boolean boolean28 = piePlot3D0.isCircular();
        org.jfree.chart.LegendItemCollection legendItemCollection29 = piePlot3D0.getLegendItems();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNull(pieURLGenerator23);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(legendItemCollection29);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
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
        piePlot3D10.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        piePlot3D10.drawBackgroundImage(graphics2D15, rectangle2D16);
        piePlot3D10.zoom((double) '#');
        java.awt.Font font20 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D10.setLabelFont(font20);
        piePlot3D10.setDepthFactor(4.0d);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator24 = piePlot3D10.getLabelGenerator();
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D25.setSectionOutlinesVisible(true);
        piePlot3D25.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        piePlot3D25.drawBackgroundImage(graphics2D30, rectangle2D31);
        piePlot3D25.zoom((double) '#');
        java.awt.Font font35 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D25.setLabelFont(font35);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator37 = piePlot3D25.getToolTipGenerator();
        org.jfree.chart.plot.PiePlot3D piePlot3D38 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D38.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = piePlot3D38.getLabelPadding();
        piePlot3D38.setShadowXOffset(10.0d);
        piePlot3D38.setCircular(false);
        piePlot3D38.setLabelGap((double) (short) 1);
        java.awt.Paint paint48 = piePlot3D38.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke49 = piePlot3D38.getLabelLinkStroke();
        java.awt.Paint paint50 = piePlot3D38.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D51 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets52 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D51.setLabelPadding(rectangleInsets52);
        java.awt.Paint paint54 = piePlot3D51.getLabelLinkPaint();
        boolean boolean55 = piePlot3D51.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets56 = piePlot3D51.getInsets();
        java.awt.Paint paint57 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D51.setShadowPaint(paint57);
        piePlot3D38.setLabelPaint(paint57);
        org.jfree.chart.plot.PiePlot3D piePlot3D60 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets61 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D60.setLabelPadding(rectangleInsets61);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo65 = null;
        piePlot3D60.handleClick((int) (short) 100, 0, plotRenderingInfo65);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator67 = piePlot3D60.getURLGenerator();
        java.awt.Stroke stroke69 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D60.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke69);
        piePlot3D38.setOutlineStroke(stroke69);
        piePlot3D25.setLabelOutlineStroke(stroke69);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator73 = piePlot3D25.getURLGenerator();
        java.awt.Paint paint74 = piePlot3D25.getNoDataMessagePaint();
        piePlot3D10.setLabelLinkPaint(paint74);
        piePlot3D0.setLabelLinkPaint(paint74);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator24);
        org.junit.Assert.assertNotNull(font35);
        org.junit.Assert.assertNull(pieToolTipGenerator37);
        org.junit.Assert.assertNotNull(rectangleInsets41);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNotNull(stroke49);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNotNull(rectangleInsets52);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(rectangleInsets56);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertNotNull(rectangleInsets61);
        org.junit.Assert.assertNull(pieURLGenerator67);
        org.junit.Assert.assertNotNull(stroke69);
        org.junit.Assert.assertNull(pieURLGenerator73);
        org.junit.Assert.assertNotNull(paint74);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        java.awt.Paint paint11 = piePlot3D0.getSectionPaint((java.lang.Comparable) 0.4d);
        double double12 = piePlot3D0.getLabelLinkMargin();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12d + "'", double7 == 0.12d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08d + "'", double9 == 0.08d);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.025d + "'", double12 == 0.025d);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        double double8 = piePlot3D0.getStartAngle();
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D9.setLabelPadding(rectangleInsets10);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        piePlot3D9.handleClick((int) (short) 100, 0, plotRenderingInfo14);
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D16.setLabelPadding(rectangleInsets17);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        piePlot3D16.handleClick((int) (short) 100, 0, plotRenderingInfo21);
        boolean boolean23 = piePlot3D16.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D24 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D24.setLabelPadding(rectangleInsets25);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        piePlot3D24.handleClick((int) (short) 100, 0, plotRenderingInfo29);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator31 = piePlot3D24.getURLGenerator();
        java.awt.Stroke stroke33 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D24.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke33);
        piePlot3D16.setLabelOutlineStroke(stroke33);
        piePlot3D9.setLabelLinkStroke(stroke33);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor37 = piePlot3D9.getLabelDistributor();
        org.jfree.chart.plot.PiePlot3D piePlot3D38 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D38.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke42 = piePlot3D38.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator43 = piePlot3D38.getLegendLabelGenerator();
        piePlot3D9.setLegendLabelToolTipGenerator(pieSectionLabelGenerator43);
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator43);
        piePlot3D0.setStartAngle((double) 10);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNull(pieURLGenerator31);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor37);
        org.junit.Assert.assertNull(stroke42);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator43);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        piePlot3D6.setLabelGap((double) (byte) -1);
        java.awt.Paint paint20 = piePlot3D6.getSectionPaint((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 90.0d + "'", double4 == 90.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(paint20);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D6.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = piePlot3D6.getLabelPadding();
        java.awt.Font font10 = piePlot3D6.getNoDataMessageFont();
        piePlot3D0.setLabelFont(font10);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator12 = piePlot3D0.getToolTipGenerator();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNull(pieToolTipGenerator12);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        piePlot3D0.setPieIndex((int) (short) 0);
        piePlot3D0.setLabelGap((double) (-1.0f));
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.025d + "'", double9 == 0.025d);
        org.junit.Assert.assertNull(pieURLGenerator10);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
        double double17 = piePlot3D0.getDepthFactor();
        java.awt.Shape shape18 = piePlot3D0.getLegendItemShape();
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D19.setLabelPadding(rectangleInsets20);
        java.awt.Paint paint22 = piePlot3D19.getLabelLinkPaint();
        double double23 = piePlot3D19.getShadowYOffset();
        boolean boolean24 = piePlot3D19.getIgnoreNullValues();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        piePlot3D19.markerChanged(markerChangeEvent25);
        boolean boolean27 = piePlot3D19.getDarkerSides();
        java.awt.Paint paint28 = piePlot3D19.getLabelShadowPaint();
        piePlot3D0.setShadowPaint(paint28);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.12d + "'", double17 == 0.12d);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 4.0d + "'", double23 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        java.awt.Paint paint10 = piePlot3D0.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke11 = piePlot3D0.getLabelLinkStroke();
        double double12 = piePlot3D0.getMaximumLabelWidth();
        piePlot3D0.setLabelLinksVisible(false);
        piePlot3D0.zoom(0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        org.jfree.chart.plot.Plot plot10 = piePlot3D0.getParent();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12d + "'", double7 == 0.12d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(legendItemCollection9);
        org.junit.Assert.assertNull(plot10);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot3D0.addChangeListener(plotChangeListener4);
        java.awt.Paint paint6 = piePlot3D0.getShadowPaint();
        java.awt.Paint paint7 = piePlot3D0.getLabelOutlinePaint();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setLabelPadding(rectangleInsets11);
        java.awt.Paint paint13 = piePlot3D10.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator14 = null;
        piePlot3D10.setLegendLabelToolTipGenerator(pieSectionLabelGenerator14);
        piePlot3D10.setLabelLinkMargin(0.0d);
        piePlot3D10.setPieIndex((int) ' ');
        double double20 = piePlot3D10.getDepthFactor();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState23 = piePlot3D0.initialise(graphics2D8, rectangle2D9, (org.jfree.chart.plot.PiePlot) piePlot3D10, (java.lang.Integer) (-1), plotRenderingInfo22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.12d + "'", double20 == 0.12d);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot3D0.addChangeListener(plotChangeListener4);
        piePlot3D0.setBackgroundImageAlignment((int) (short) 10);
        piePlot3D0.setCircular(false, true);
        org.jfree.data.general.PieDataset pieDataset11 = piePlot3D0.getDataset();
        java.awt.Stroke stroke13 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) 100);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieDataset11);
        org.junit.Assert.assertNull(stroke13);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
        org.jfree.chart.util.Rotation rotation10 = piePlot3D0.getDirection();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(rotation10);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        piePlot3D0.setOutlineVisible(false);
        java.awt.Paint paint8 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) 1L);
        java.awt.Image image9 = null;
        piePlot3D0.setBackgroundImage(image9);
        piePlot3D0.setBackgroundImageAlignment((int) (short) 100);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(paint8);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        piePlot3D0.setNoDataMessagePaint(paint21);
        double double24 = piePlot3D0.getShadowXOffset();
        boolean boolean25 = piePlot3D0.isCircular();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        piePlot3D0.setShadowXOffset(1.0d);
        java.awt.Paint paint10 = piePlot3D0.getBackgroundPaint();
        java.awt.Font font11 = piePlot3D0.getNoDataMessageFont();
        int int12 = piePlot3D0.getPieIndex();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.awt.Stroke stroke9 = piePlot3D0.getOutlineStroke();
        java.lang.String str10 = piePlot3D0.getPlotType();
        boolean boolean11 = piePlot3D0.getSectionOutlinesVisible();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Pie 3D Plot" + "'", str10, "Pie 3D Plot");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean1 = piePlot3D0.getSimpleLabels();
        java.awt.Shape shape2 = piePlot3D0.getLegendItemShape();
        org.jfree.chart.plot.PiePlot3D piePlot3D3 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D3.setLabelPadding(rectangleInsets4);
        java.awt.Paint paint6 = piePlot3D3.getLabelLinkPaint();
        boolean boolean7 = piePlot3D3.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        piePlot3D3.notifyListeners(plotChangeEvent8);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = piePlot3D3.getSimpleLabelOffset();
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D12.setLabelPadding(rectangleInsets13);
        java.awt.Paint paint15 = piePlot3D12.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator16 = null;
        piePlot3D12.setLegendLabelToolTipGenerator(pieSectionLabelGenerator16);
        piePlot3D12.setLabelLinkMargin(0.0d);
        piePlot3D12.setPieIndex((int) ' ');
        java.awt.Paint paint22 = piePlot3D12.getBaseSectionOutlinePaint();
        piePlot3D3.setSectionPaint((java.lang.Comparable) '4', paint22);
        piePlot3D0.setShadowPaint(paint22);
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        piePlot3D0.drawBackgroundImage(graphics2D25, rectangle2D26);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.drawBackground(graphics2D6, rectangle2D7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        piePlot3D0.removeChangeListener(plotChangeListener8);
        boolean boolean10 = piePlot3D0.isCircular();
        boolean boolean11 = piePlot3D0.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        piePlot3D0.zoom((double) '#');
        java.awt.Font font10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D0.setLabelFont(font10);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator12 = piePlot3D0.getToolTipGenerator();
        org.jfree.chart.plot.Plot plot13 = piePlot3D0.getParent();
        org.jfree.chart.util.Rotation rotation14 = piePlot3D0.getDirection();
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNull(pieToolTipGenerator12);
        org.junit.Assert.assertNull(plot13);
        org.junit.Assert.assertNotNull(rotation14);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        java.awt.Paint paint10 = piePlot3D0.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke11 = piePlot3D0.getLabelLinkStroke();
        double double12 = piePlot3D0.getMaximumLabelWidth();
        double double14 = piePlot3D0.getExplodePercent((java.lang.Comparable) (byte) 10);
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        piePlot3D0.addChangeListener(plotChangeListener15);
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D17.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = piePlot3D17.getLabelPadding();
        piePlot3D17.setShadowXOffset(10.0d);
        org.jfree.chart.plot.PiePlot3D piePlot3D23 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D23.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = piePlot3D23.getLabelPadding();
        java.awt.Font font27 = piePlot3D23.getNoDataMessageFont();
        piePlot3D17.setLabelFont(font27);
        java.awt.Paint paint29 = piePlot3D17.getLabelBackgroundPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = piePlot3D17.getInsets();
        piePlot3D0.setLabelPadding(rectangleInsets30);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(rectangleInsets30);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.data.general.PieDataset pieDataset3 = piePlot3D0.getDataset();
        boolean boolean4 = piePlot3D0.isCircular();
        double double5 = piePlot3D0.getLabelLinkMargin();
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D6.setLabelPadding(rectangleInsets7);
        java.awt.Paint paint9 = piePlot3D6.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator10 = null;
        piePlot3D6.setLegendLabelToolTipGenerator(pieSectionLabelGenerator10);
        piePlot3D6.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot14 = piePlot3D6.getRootPlot();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor15 = piePlot3D6.getLabelDistributor();
        piePlot3D0.setLabelDistributor(abstractPieLabelDistributor15);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieDataset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor15);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        float float7 = piePlot3D0.getForegroundAlpha();
        java.awt.Paint paint8 = piePlot3D0.getBaseSectionOutlinePaint();
        java.lang.Object obj9 = piePlot3D0.clone();
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setLabelPadding(rectangleInsets11);
        java.awt.Paint paint13 = piePlot3D10.getLabelLinkPaint();
        boolean boolean14 = piePlot3D10.getLabelLinksVisible();
        double double15 = piePlot3D10.getLabelLinkMargin();
        piePlot3D10.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup18 = piePlot3D10.getDatasetGroup();
        piePlot3D10.setBackgroundImageAlignment(1);
        java.awt.Paint paint21 = piePlot3D10.getLabelLinkPaint();
        boolean boolean22 = piePlot3D10.getSectionOutlinesVisible();
        java.awt.Stroke stroke23 = piePlot3D10.getLabelOutlineStroke();
        piePlot3D10.setMinimumArcAngleToDraw((double) (byte) 1);
        org.jfree.chart.plot.PiePlot3D piePlot3D26 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D26.setLabelPadding(rectangleInsets27);
        float float29 = piePlot3D26.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        piePlot3D26.drawBackgroundImage(graphics2D30, rectangle2D31);
        float float33 = piePlot3D26.getBackgroundImageAlpha();
        org.jfree.chart.util.Rotation rotation34 = piePlot3D26.getDirection();
        double double36 = piePlot3D26.getExplodePercent((java.lang.Comparable) 100.0f);
        piePlot3D26.setIgnoreNullValues(true);
        java.awt.Paint paint39 = piePlot3D26.getLabelPaint();
        piePlot3D10.setOutlinePaint(paint39);
        org.jfree.chart.plot.PiePlot3D piePlot3D41 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D41.setSectionOutlinesVisible(true);
        piePlot3D41.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D46 = null;
        java.awt.geom.Rectangle2D rectangle2D47 = null;
        piePlot3D41.drawBackgroundImage(graphics2D46, rectangle2D47);
        org.jfree.chart.event.PlotChangeListener plotChangeListener49 = null;
        piePlot3D41.removeChangeListener(plotChangeListener49);
        boolean boolean51 = piePlot3D41.isCircular();
        org.jfree.chart.plot.PiePlot3D piePlot3D52 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D52.setSectionOutlinesVisible(true);
        piePlot3D52.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D57 = null;
        java.awt.geom.Rectangle2D rectangle2D58 = null;
        piePlot3D52.drawBackgroundImage(graphics2D57, rectangle2D58);
        piePlot3D52.zoom((double) '#');
        java.awt.Font font62 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D52.setLabelFont(font62);
        org.jfree.chart.plot.PiePlot3D piePlot3D65 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D65.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets68 = piePlot3D65.getLabelPadding();
        piePlot3D65.setShadowXOffset(10.0d);
        piePlot3D65.setCircular(false);
        piePlot3D65.setLabelGap((double) (short) 1);
        java.awt.Paint paint75 = piePlot3D65.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke76 = piePlot3D65.getLabelLinkStroke();
        java.awt.Paint paint77 = piePlot3D65.getBaseSectionPaint();
        piePlot3D52.setSectionOutlinePaint((java.lang.Comparable) false, paint77);
        piePlot3D41.setBaseSectionOutlinePaint(paint77);
        org.jfree.chart.plot.PiePlot3D piePlot3D80 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets81 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D80.setLabelPadding(rectangleInsets81);
        java.awt.Paint paint83 = piePlot3D80.getLabelLinkPaint();
        boolean boolean84 = piePlot3D80.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent85 = null;
        piePlot3D80.notifyListeners(plotChangeEvent85);
        double double87 = piePlot3D80.getDepthFactor();
        org.jfree.chart.plot.PiePlot3D piePlot3D88 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D88.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets91 = piePlot3D88.getLabelPadding();
        java.awt.Font font92 = piePlot3D88.getNoDataMessageFont();
        java.awt.Paint paint93 = piePlot3D88.getOutlinePaint();
        java.awt.Font font94 = piePlot3D88.getNoDataMessageFont();
        piePlot3D80.setLabelFont(font94);
        java.awt.Paint paint96 = piePlot3D80.getBaseSectionPaint();
        piePlot3D41.setLabelOutlinePaint(paint96);
        piePlot3D10.setBaseSectionOutlinePaint(paint96);
        piePlot3D0.setOutlinePaint(paint96);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.025d + "'", double15 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.5f + "'", float29 == 0.5f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.5f + "'", float33 == 0.5f);
        org.junit.Assert.assertNotNull(rotation34);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(font62);
        org.junit.Assert.assertNotNull(rectangleInsets68);
        org.junit.Assert.assertNotNull(paint75);
        org.junit.Assert.assertNotNull(stroke76);
        org.junit.Assert.assertNotNull(paint77);
        org.junit.Assert.assertNotNull(rectangleInsets81);
        org.junit.Assert.assertNotNull(paint83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.12d + "'", double87 == 0.12d);
        org.junit.Assert.assertNotNull(rectangleInsets91);
        org.junit.Assert.assertNotNull(font92);
        org.junit.Assert.assertNotNull(paint93);
        org.junit.Assert.assertNotNull(font94);
        org.junit.Assert.assertNotNull(paint96);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        float float7 = piePlot3D0.getForegroundAlpha();
        java.awt.Paint paint8 = piePlot3D0.getBaseSectionOutlinePaint();
        boolean boolean9 = piePlot3D0.getSimpleLabels();
        double double10 = piePlot3D0.getShadowYOffset();
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D11.setLabelPadding(rectangleInsets12);
        java.awt.Paint paint14 = piePlot3D11.getLabelLinkPaint();
        boolean boolean15 = piePlot3D11.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = null;
        piePlot3D11.notifyListeners(plotChangeEvent16);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3D11.getSimpleLabelOffset();
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D20.setLabelPadding(rectangleInsets21);
        java.awt.Paint paint23 = piePlot3D20.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator24 = null;
        piePlot3D20.setLegendLabelToolTipGenerator(pieSectionLabelGenerator24);
        piePlot3D20.setLabelLinkMargin(0.0d);
        piePlot3D20.setPieIndex((int) ' ');
        java.awt.Paint paint30 = piePlot3D20.getBaseSectionOutlinePaint();
        piePlot3D11.setSectionPaint((java.lang.Comparable) '4', paint30);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = piePlot3D11.getSimpleLabelOffset();
        piePlot3D0.setInsets(rectangleInsets32, false);
        boolean boolean35 = piePlot3D0.getIgnoreZeroValues();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(rectangleInsets32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        piePlot3D0.axisChanged(axisChangeEvent8);
        org.jfree.data.general.PieDataset pieDataset10 = piePlot3D0.getDataset();
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
        piePlot3D0.setSectionPaint((java.lang.Comparable) 4.0d, paint24);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent26 = null;
        piePlot3D0.notifyListeners(plotChangeEvent26);
        org.junit.Assert.assertNull(pieDataset10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNull(pieSectionLabelGenerator22);
        org.junit.Assert.assertNull(plot23);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
        boolean boolean12 = piePlot3D0.getSimpleLabels();
        java.awt.Paint paint13 = piePlot3D0.getBaseSectionPaint();
        java.lang.String str14 = piePlot3D0.getNoDataMessage();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot3D0.getSimpleLabelOffset();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.lang.Object obj5 = piePlot3D0.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot3D0.getSimpleLabelOffset();
        piePlot3D0.setBackgroundImageAlignment((int) (byte) 10);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
        double double15 = piePlot3D0.getExplodePercent((java.lang.Comparable) 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pie 3D Plot" + "'", str12, "Pie 3D Plot");
        org.junit.Assert.assertNull(plot13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot3D0.getInsets();
        java.awt.Paint paint6 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D0.setShadowPaint(paint6);
        piePlot3D0.setIgnoreZeroValues(true);
        org.jfree.chart.event.PlotChangeListener plotChangeListener10 = null;
        piePlot3D0.addChangeListener(plotChangeListener10);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = piePlot3D0.getMaximumExplodePercent();
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
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
        double double20 = piePlot3D0.getShadowXOffset();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        piePlot3D0.zoom((double) '#');
        java.awt.Font font10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D0.setLabelFont(font10);
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D13.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = piePlot3D13.getLabelPadding();
        piePlot3D13.setShadowXOffset(10.0d);
        piePlot3D13.setCircular(false);
        piePlot3D13.setLabelGap((double) (short) 1);
        java.awt.Paint paint23 = piePlot3D13.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke24 = piePlot3D13.getLabelLinkStroke();
        java.awt.Paint paint25 = piePlot3D13.getBaseSectionPaint();
        piePlot3D0.setSectionOutlinePaint((java.lang.Comparable) false, paint25);
        org.jfree.chart.plot.PiePlot3D piePlot3D27 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D27.setSectionOutlinesVisible(true);
        piePlot3D27.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D32 = null;
        java.awt.geom.Rectangle2D rectangle2D33 = null;
        piePlot3D27.drawBackgroundImage(graphics2D32, rectangle2D33);
        java.awt.Paint paint35 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D27.setNoDataMessagePaint(paint35);
        java.awt.Stroke stroke37 = piePlot3D27.getLabelOutlineStroke();
        java.lang.String str38 = piePlot3D27.getPlotType();
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = piePlot3D27.getLabelPadding();
        piePlot3D0.setInsets(rectangleInsets39, false);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Pie 3D Plot" + "'", str38, "Pie 3D Plot");
        org.junit.Assert.assertNotNull(rectangleInsets39);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D10.setSectionOutlinesVisible(true);
        piePlot3D10.setStartAngle((double) (byte) -1);
        boolean boolean15 = piePlot3D10.isCircular();
        double double16 = piePlot3D10.getShadowYOffset();
        piePlot3D10.setBackgroundImageAlignment(15);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = piePlot3D10.getSimpleLabelOffset();
        piePlot3D0.setInsets(rectangleInsets19, false);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets19);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.lang.Object obj5 = piePlot3D0.clone();
        java.awt.Shape shape6 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        piePlot3D0.setLegendItemShape(shape6);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator8 = null;
        piePlot3D0.setLabelGenerator(pieSectionLabelGenerator8);
        boolean boolean10 = piePlot3D0.isOutlineVisible();
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        piePlot3D0.setBackgroundAlpha((float) 10);
        java.awt.Paint paint30 = piePlot3D0.getBackgroundPaint();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D18.setLabelPadding(rectangleInsets19);
        java.awt.Paint paint21 = piePlot3D18.getLabelLinkPaint();
        boolean boolean22 = piePlot3D18.getLabelLinksVisible();
        piePlot3D18.setOutlineVisible(false);
        java.awt.Paint paint25 = piePlot3D18.getNoDataMessagePaint();
        piePlot3D0.setSectionOutlinePaint((java.lang.Comparable) 0.025d, paint25);
        org.jfree.chart.plot.PiePlot3D piePlot3D27 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D27.setLabelPadding(rectangleInsets28);
        java.awt.Paint paint30 = piePlot3D27.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator31 = null;
        piePlot3D27.setLegendLabelToolTipGenerator(pieSectionLabelGenerator31);
        java.awt.Stroke stroke33 = piePlot3D27.getLabelOutlineStroke();
        org.jfree.chart.event.PlotChangeListener plotChangeListener34 = null;
        piePlot3D27.addChangeListener(plotChangeListener34);
        piePlot3D27.setSimpleLabels(true);
        piePlot3D27.setDepthFactor((double) 0.0f);
        org.jfree.chart.util.Rotation rotation40 = piePlot3D27.getDirection();
        piePlot3D0.setDirection(rotation40);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(rotation40);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
        java.awt.Stroke stroke30 = piePlot3D0.getLabelOutlineStroke();
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
        org.junit.Assert.assertNotNull(stroke30);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        boolean boolean8 = piePlot3D0.isCircular();
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D9.setLabelPadding(rectangleInsets10);
        java.awt.Paint paint12 = piePlot3D9.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = null;
        piePlot3D9.setLegendLabelToolTipGenerator(pieSectionLabelGenerator13);
        piePlot3D9.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot17 = piePlot3D9.getRootPlot();
        java.awt.Paint paint18 = piePlot3D9.getBaseSectionOutlinePaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        piePlot3D9.addChangeListener(plotChangeListener19);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent21 = null;
        piePlot3D9.axisChanged(axisChangeEvent21);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator23 = piePlot3D9.getLegendLabelGenerator();
        java.awt.Font font24 = piePlot3D9.getNoDataMessageFont();
        piePlot3D0.setLabelFont(font24);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator23);
        org.junit.Assert.assertNotNull(font24);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.data.general.PieDataset pieDataset3 = piePlot3D0.getDataset();
        org.jfree.data.general.DatasetGroup datasetGroup4 = piePlot3D0.getDatasetGroup();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        piePlot3D0.datasetChanged(datasetChangeEvent5);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieDataset3);
        org.junit.Assert.assertNull(datasetGroup4);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Paint paint8 = piePlot3D0.getLabelShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D9.setLabelPadding(rectangleInsets10);
        java.awt.Paint paint12 = piePlot3D9.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = null;
        piePlot3D9.setLegendLabelToolTipGenerator(pieSectionLabelGenerator13);
        double double15 = piePlot3D9.getMaximumLabelWidth();
        boolean boolean16 = piePlot3D0.equals((java.lang.Object) piePlot3D9);
        piePlot3D9.setNoDataMessage("hi!");
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        piePlot3D0.zoom((double) '#');
        java.awt.Font font10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D0.setLabelFont(font10);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator12 = piePlot3D0.getToolTipGenerator();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = piePlot3D0.getLegendLabelURLGenerator();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator14 = piePlot3D0.getLegendLabelToolTipGenerator();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D17.setLabelPadding(rectangleInsets18);
        java.awt.Paint paint20 = piePlot3D17.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator21 = null;
        piePlot3D17.setLegendLabelToolTipGenerator(pieSectionLabelGenerator21);
        piePlot3D17.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot25 = piePlot3D17.getRootPlot();
        java.awt.Stroke stroke26 = piePlot3D17.getOutlineStroke();
        java.awt.Font font27 = piePlot3D17.getLabelFont();
        piePlot3D17.setLabelLinksVisible(false);
        java.awt.Paint paint30 = piePlot3D17.getLabelOutlinePaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState33 = piePlot3D0.initialise(graphics2D15, rectangle2D16, (org.jfree.chart.plot.PiePlot) piePlot3D17, (java.lang.Integer) (-1), plotRenderingInfo32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNull(pieToolTipGenerator12);
        org.junit.Assert.assertNull(pieURLGenerator13);
        org.junit.Assert.assertNull(pieSectionLabelGenerator14);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(plot25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setDarkerSides(false);
        piePlot3D0.setDarkerSides(true);
        java.awt.Paint paint5 = piePlot3D0.getBaseSectionPaint();
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        piePlot3D0.setPieIndex(0);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12d + "'", double7 == 0.12d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNull(pieDataset9);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        java.awt.Font font4 = piePlot3D0.getNoDataMessageFont();
        java.awt.Image image5 = piePlot3D0.getBackgroundImage();
        int int6 = piePlot3D0.getPieIndex();
        boolean boolean7 = piePlot3D0.getDarkerSides();
        double double8 = piePlot3D0.getInteriorGap();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNull(image5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot3D0.getURLGenerator();
        org.jfree.chart.util.Rotation rotation8 = piePlot3D0.getDirection();
        piePlot3D0.setBackgroundImageAlignment(0);
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
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(rotation8);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Stroke stroke3 = piePlot3D0.getOutlineStroke();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLabelGenerator(pieSectionLabelGenerator4);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(stroke3);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
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
        java.awt.Paint paint13 = piePlot3D0.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D14.setLabelPadding(rectangleInsets15);
        org.jfree.data.general.PieDataset pieDataset17 = piePlot3D14.getDataset();
        java.lang.Object obj18 = null;
        boolean boolean19 = piePlot3D14.equals(obj18);
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = piePlot3D14.getInsets();
        java.awt.Paint paint21 = piePlot3D14.getBackgroundPaint();
        piePlot3D0.setLabelLinkPaint(paint21);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 90.0d + "'", double10 == 90.0d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNull(pieDataset17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        java.awt.Paint paint34 = piePlot3D0.getBaseSectionPaint();
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
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
        piePlot3D0.setSectionOutlinesVisible(false);
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D14.setLabelPadding(rectangleInsets15);
        org.jfree.data.general.PieDataset pieDataset17 = piePlot3D14.getDataset();
        java.lang.String str18 = piePlot3D14.getPlotType();
        piePlot3D0.setParent((org.jfree.chart.plot.Plot) piePlot3D14);
        boolean boolean20 = piePlot3D0.getDarkerSides();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNull(pieDataset17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Pie 3D Plot" + "'", str18, "Pie 3D Plot");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.data.general.PieDataset pieDataset3 = piePlot3D0.getDataset();
        java.awt.Paint paint5 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) (short) 100);
        piePlot3D0.setLabelLinksVisible(true);
        piePlot3D0.setStartAngle((double) (-1));
        java.awt.Stroke stroke10 = piePlot3D0.getBaseSectionOutlineStroke();
        double double11 = piePlot3D0.getInteriorGap();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieDataset3);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.08d + "'", double11 == 0.08d);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = piePlot3D0.getSimpleLabelOffset();
        java.awt.Paint paint9 = piePlot3D0.getSectionPaint((java.lang.Comparable) (short) 0);
        java.lang.Object obj10 = piePlot3D0.clone();
        java.awt.Paint paint11 = piePlot3D0.getNoDataMessagePaint();
        java.awt.Image image12 = null;
        piePlot3D0.setBackgroundImage(image12);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        double double7 = piePlot3D0.getDepthFactor();
        double double8 = piePlot3D0.getInteriorGap();
        double double9 = piePlot3D0.getLabelGap();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12d + "'", double7 == 0.12d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.025d + "'", double9 == 0.025d);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        float float1 = piePlot3D0.getBackgroundImageAlpha();
        org.jfree.chart.plot.PiePlot3D piePlot3D2 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D2.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot3D2.getLabelPadding();
        piePlot3D0.setLabelPadding(rectangleInsets5);
        piePlot3D0.setShadowXOffset((double) 0L);
        piePlot3D0.setNoDataMessage("");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertNotNull(rectangleInsets5);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
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
        java.awt.Paint paint29 = piePlot3D17.getLabelOutlinePaint();
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNull(pieToolTipGenerator15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        piePlot3D0.markerChanged(markerChangeEvent14);
        piePlot3D0.setOutlineVisible(true);
        java.awt.Stroke stroke18 = piePlot3D0.getBaseSectionOutlineStroke();
        java.awt.Shape shape19 = piePlot3D0.getLegendItemShape();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator20 = null;
        piePlot3D0.setLegendLabelURLGenerator(pieURLGenerator20);
        piePlot3D0.setNoDataMessage("hi!");
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(shape19);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D0.setNoDataMessagePaint(paint8);
        java.awt.Stroke stroke10 = piePlot3D0.getLabelOutlineStroke();
        java.lang.String str11 = piePlot3D0.getPlotType();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = piePlot3D0.getLabelPadding();
        java.awt.Stroke stroke13 = piePlot3D0.getLabelLinkStroke();
        java.awt.Paint paint15 = piePlot3D0.getSectionPaint((java.lang.Comparable) (short) -1);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Pie 3D Plot" + "'", str11, "Pie 3D Plot");
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNull(paint15);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D0.setNoDataMessagePaint(paint8);
        java.awt.Paint paint10 = piePlot3D0.getLabelOutlinePaint();
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
        piePlot3D0.setBaseSectionOutlineStroke(stroke28);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent32 = null;
        piePlot3D0.datasetChanged(datasetChangeEvent32);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNull(pieURLGenerator26);
        org.junit.Assert.assertNotNull(stroke28);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        piePlot3D0.setOutlineVisible(true);
        piePlot3D0.setIgnoreNullValues(true);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        org.jfree.data.general.PieDataset pieDataset22 = piePlot3D0.getDataset();
        piePlot3D0.setForegroundAlpha((float) (-1L));
        java.awt.Shape shape25 = piePlot3D0.getLegendItemShape();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(pieDataset22);
        org.junit.Assert.assertNotNull(shape25);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        piePlot3D0.setShadowXOffset((double) 15);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot3D0.axisChanged(axisChangeEvent7);
        java.awt.Font font9 = piePlot3D0.getLabelFont();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(font9);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        java.awt.Font font4 = piePlot3D0.getNoDataMessageFont();
        java.awt.Paint paint5 = piePlot3D0.getShadowPaint();
        piePlot3D0.setPieIndex((int) (byte) 1);
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D8.setLabelPadding(rectangleInsets9);
        java.awt.Paint paint11 = piePlot3D8.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator12 = null;
        piePlot3D8.setLegendLabelToolTipGenerator(pieSectionLabelGenerator12);
        piePlot3D8.setLabelLinkMargin(0.0d);
        piePlot3D8.setShadowXOffset(1.0d);
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D18.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot3D18.getLabelPadding();
        piePlot3D18.setShadowXOffset(10.0d);
        piePlot3D18.setCircular(false);
        piePlot3D18.setLabelGap((double) (short) 1);
        java.awt.Paint paint28 = piePlot3D18.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke29 = piePlot3D18.getLabelLinkStroke();
        java.awt.Paint paint30 = piePlot3D18.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D31 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D31.setLabelPadding(rectangleInsets32);
        java.awt.Paint paint34 = piePlot3D31.getLabelLinkPaint();
        boolean boolean35 = piePlot3D31.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = piePlot3D31.getInsets();
        java.awt.Paint paint37 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D31.setShadowPaint(paint37);
        piePlot3D18.setLabelPaint(paint37);
        org.jfree.chart.plot.PiePlot3D piePlot3D40 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D40.setLabelPadding(rectangleInsets41);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo45 = null;
        piePlot3D40.handleClick((int) (short) 100, 0, plotRenderingInfo45);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator47 = piePlot3D40.getURLGenerator();
        java.awt.Stroke stroke49 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D40.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke49);
        piePlot3D18.setOutlineStroke(stroke49);
        piePlot3D8.setLabelOutlineStroke(stroke49);
        java.awt.Stroke stroke53 = piePlot3D8.getBaseSectionOutlineStroke();
        piePlot3D0.setLabelLinkStroke(stroke53);
        piePlot3D0.setBackgroundImageAlignment((int) (byte) 1);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(rectangleInsets32);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(rectangleInsets36);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(rectangleInsets41);
        org.junit.Assert.assertNull(pieURLGenerator47);
        org.junit.Assert.assertNotNull(stroke49);
        org.junit.Assert.assertNotNull(stroke53);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        boolean boolean22 = piePlot3D0.isOutlineVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D23 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D23.setLabelPadding(rectangleInsets24);
        java.awt.Paint paint26 = piePlot3D23.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator27 = null;
        piePlot3D23.setLegendLabelToolTipGenerator(pieSectionLabelGenerator27);
        piePlot3D23.setLabelLinkMargin(0.0d);
        piePlot3D23.setPieIndex((int) ' ');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor33 = piePlot3D23.getLabelDistributor();
        java.awt.Paint paint34 = piePlot3D23.getLabelShadowPaint();
        piePlot3D0.setLabelOutlinePaint(paint34);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor33);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        // The following exception was thrown during execution in test generation
        try {
            double double12 = piePlot3D0.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Pie 3D Plot" + "'", str7, "Pie 3D Plot");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
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
        double double15 = piePlot3D0.getInteriorGap();
        org.jfree.data.general.DatasetGroup datasetGroup16 = piePlot3D0.getDatasetGroup();
        java.awt.Paint paint17 = piePlot3D0.getOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D18.setLabelPadding(rectangleInsets19);
        java.awt.Paint paint21 = piePlot3D18.getLabelLinkPaint();
        boolean boolean22 = piePlot3D18.getLabelLinksVisible();
        piePlot3D18.setOutlineVisible(false);
        java.awt.Paint paint25 = piePlot3D18.getNoDataMessagePaint();
        org.jfree.chart.util.Rotation rotation26 = piePlot3D18.getDirection();
        piePlot3D0.setDirection(rotation26);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.08d + "'", double15 == 0.08d);
        org.junit.Assert.assertNull(datasetGroup16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(rotation26);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        piePlot3D0.drawBackgroundImage(graphics2D12, rectangle2D13);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator15 = piePlot3D0.getURLGenerator();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(pieURLGenerator15);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        boolean boolean2 = piePlot3D1.getLabelLinksVisible();
        boolean boolean3 = piePlot3D1.getLabelLinksVisible();
        double double4 = piePlot3D1.getMaximumLabelWidth();
        boolean boolean5 = piePlot3D1.getSectionOutlinesVisible();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.14d + "'", double4 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
        java.awt.Paint paint11 = piePlot3D0.getSectionPaint((java.lang.Comparable) 0.4d);
        java.awt.Paint paint12 = piePlot3D0.getNoDataMessagePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = null;
        piePlot3D0.setDrawingSupplier(drawingSupplier13);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12d + "'", double7 == 0.12d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08d + "'", double9 == 0.08d);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        piePlot3D0.datasetChanged(datasetChangeEvent6);
        piePlot3D0.setDarkerSides(true);
        org.junit.Assert.assertNotNull(rectangleInsets3);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        java.awt.Stroke stroke10 = piePlot3D0.getOutlineStroke();
        java.awt.Paint paint11 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setBaseSectionPaint(paint11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        org.jfree.data.general.DatasetGroup datasetGroup22 = piePlot3D0.getDatasetGroup();
        double double23 = piePlot3D0.getLabelLinkMargin();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(pieURLGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNull(datasetGroup22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.025d + "'", double23 == 0.025d);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D46 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D46.setLabelPadding(rectangleInsets47);
        java.awt.Paint paint49 = piePlot3D46.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener50 = null;
        piePlot3D46.addChangeListener(plotChangeListener50);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator52 = piePlot3D46.getLegendLabelToolTipGenerator();
        java.awt.Font font53 = piePlot3D46.getNoDataMessageFont();
        boolean boolean54 = piePlot3D46.isSubplot();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor55 = piePlot3D46.getLabelDistributor();
        piePlot3D0.setLabelDistributor(abstractPieLabelDistributor55);
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
        org.junit.Assert.assertNotNull(rectangleInsets47);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNull(pieSectionLabelGenerator52);
        org.junit.Assert.assertNotNull(font53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor55);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
        java.awt.Paint paint18 = piePlot3D0.getNoDataMessagePaint();
        java.awt.Image image19 = null;
        piePlot3D0.setBackgroundImage(image19);
        piePlot3D0.setLabelLinksVisible(true);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
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
        double double16 = piePlot3D0.getMinimumArcAngleToDraw();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator17 = piePlot3D0.getLabelGenerator();
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D19.setLabelPadding(rectangleInsets20);
        java.awt.Paint paint22 = piePlot3D19.getLabelLinkPaint();
        boolean boolean23 = piePlot3D19.getLabelLinksVisible();
        piePlot3D19.setOutlineVisible(false);
        java.awt.Paint paint26 = piePlot3D19.getNoDataMessagePaint();
        piePlot3D0.setSectionPaint((java.lang.Comparable) 1.0d, paint26);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(pieURLGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-5d + "'", double16 == 1.0E-5d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator17);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke4 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot3D0.getLegendLabelGenerator();
        piePlot3D0.setLabelGap(0.12d);
        java.awt.Stroke stroke8 = piePlot3D0.getOutlineStroke();
        boolean boolean9 = piePlot3D0.getDarkerSides();
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator5);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent6 = null;
        piePlot3D0.datasetChanged(datasetChangeEvent6);
        int int8 = piePlot3D0.getBackgroundImageAlignment();
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D9.setLabelPadding(rectangleInsets10);
        java.awt.Paint paint12 = piePlot3D9.getLabelLinkPaint();
        boolean boolean13 = piePlot3D9.getLabelLinksVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D14.setLabelPadding(rectangleInsets15);
        piePlot3D9.setSimpleLabelOffset(rectangleInsets15);
        piePlot3D0.setSimpleLabelOffset(rectangleInsets15);
        piePlot3D0.zoom((-1.0d));
        double double22 = piePlot3D0.getExplodePercent((java.lang.Comparable) 15);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        java.awt.Paint paint33 = piePlot3D0.getLabelBackgroundPaint();
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
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        piePlot3D0.setOutlineVisible(true);
        double double10 = piePlot3D0.getStartAngle();
        piePlot3D0.setLabelGap((double) (-1L));
        boolean boolean13 = piePlot3D0.getIgnoreNullValues();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 90.0d + "'", double10 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        double double14 = piePlot3D0.getExplodePercent((java.lang.Comparable) "hi!");
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot3D0.getLabelPadding();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator16 = piePlot3D0.getLegendLabelToolTipGenerator();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNull(pieSectionLabelGenerator16);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        piePlot3D0.setDarkerSides(false);
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
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        java.awt.Paint paint7 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D0.setSectionPaint((java.lang.Comparable) 0.4d, paint7);
        boolean boolean9 = piePlot3D0.getDarkerSides();
        double double11 = piePlot3D0.getExplodePercent((java.lang.Comparable) (-1L));
        piePlot3D0.setCircular(true);
        piePlot3D0.setBackgroundAlpha((float) 10);
        java.awt.Paint paint16 = piePlot3D0.getOutlinePaint();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        piePlot3D0.setInteriorGap(0.025d);
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setInteriorGap(4.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (4.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(paint15);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
        org.jfree.chart.plot.Plot plot23 = piePlot3D0.getRootPlot();
        piePlot3D0.setSimpleLabels(false);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(plot23);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        float float7 = piePlot3D0.getForegroundAlpha();
        java.awt.Paint paint8 = piePlot3D0.getBaseSectionOutlinePaint();
        java.awt.Paint paint9 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot3D0.setOutlinePaint(paint9);
        java.awt.Paint paint11 = piePlot3D0.getOutlinePaint();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator12 = piePlot3D0.getToolTipGenerator();
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        piePlot3D0.removeChangeListener(plotChangeListener13);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(pieToolTipGenerator12);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        org.jfree.data.general.DatasetGroup datasetGroup22 = piePlot3D0.getDatasetGroup();
        piePlot3D0.setMaximumLabelWidth(1.0d);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(datasetGroup22);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        piePlot3D0.setOutlineVisible(false);
        java.awt.Paint paint7 = piePlot3D0.getNoDataMessagePaint();
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setBackgroundImageAlpha((-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        java.awt.Paint paint2 = piePlot3D1.getBaseSectionPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator3 = piePlot3D1.getLabelGenerator();
        piePlot3D1.setExplodePercent((java.lang.Comparable) 100.0d, (double) (-1L));
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator3);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
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
        piePlot3D0.setStartAngle((double) 10L);
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D25.setLabelPadding(rectangleInsets26);
        java.awt.Paint paint28 = piePlot3D25.getLabelLinkPaint();
        boolean boolean29 = piePlot3D25.getLabelLinksVisible();
        piePlot3D25.setOutlineVisible(false);
        java.awt.Paint paint33 = piePlot3D25.getSectionOutlinePaint((java.lang.Comparable) 1L);
        java.awt.Image image34 = null;
        piePlot3D25.setBackgroundImage(image34);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier36 = piePlot3D25.getDrawingSupplier();
        piePlot3D0.setDrawingSupplier(drawingSupplier36);
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
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(paint33);
        org.junit.Assert.assertNotNull(drawingSupplier36);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        java.awt.Paint paint21 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) 100L);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0E-5d + "'", double19 == 1.0E-5d);
        org.junit.Assert.assertNull(paint21);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        piePlot3D6.setLabelGap((double) (byte) -1);
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        java.awt.geom.Point2D point2D21 = null;
        org.jfree.chart.plot.PlotState plotState22 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D6.draw(graphics2D19, rectangle2D20, point2D21, plotState22, plotRenderingInfo23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
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
        piePlot3D0.setLabelLinksVisible(false);
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
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D8.drawOutline(graphics2D18, rectangle2D19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D8.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot3D8.getLabelPadding();
        java.awt.Font font12 = piePlot3D8.getNoDataMessageFont();
        java.awt.Paint paint13 = piePlot3D8.getOutlinePaint();
        java.awt.Font font14 = piePlot3D8.getNoDataMessageFont();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator15 = null;
        piePlot3D8.setURLGenerator(pieURLGenerator15);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator17 = piePlot3D8.getLabelGenerator();
        piePlot3D0.setLegendLabelGenerator(pieSectionLabelGenerator17);
        float float19 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Paint paint20 = piePlot3D0.getLabelOutlinePaint();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.5f + "'", float19 == 0.5f);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
        piePlot3D0.setSectionOutlinesVisible(false);
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D14.setLabelPadding(rectangleInsets15);
        org.jfree.data.general.PieDataset pieDataset17 = piePlot3D14.getDataset();
        java.lang.String str18 = piePlot3D14.getPlotType();
        piePlot3D0.setParent((org.jfree.chart.plot.Plot) piePlot3D14);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator20 = null;
        piePlot3D14.setURLGenerator(pieURLGenerator20);
        piePlot3D14.setCircular(true);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNull(pieDataset17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Pie 3D Plot" + "'", str18, "Pie 3D Plot");
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
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
        piePlot3D0.setSectionOutlinesVisible(false);
        org.jfree.chart.plot.Plot plot14 = piePlot3D0.getRootPlot();
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D(pieDataset15);
        java.awt.Paint paint17 = piePlot3D16.getBaseSectionPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator18 = piePlot3D16.getLabelGenerator();
        piePlot3D0.setLegendLabelGenerator(pieSectionLabelGenerator18);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator18);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D20.setSectionOutlinesVisible(true);
        piePlot3D20.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        piePlot3D20.drawBackgroundImage(graphics2D25, rectangle2D26);
        piePlot3D20.zoom((double) '#');
        java.awt.Font font30 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D20.setLabelFont(font30);
        piePlot3D20.setExplodePercent((java.lang.Comparable) '4', (double) 10L);
        boolean boolean35 = piePlot3D20.getIgnoreNullValues();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState38 = piePlot3D0.initialise(graphics2D18, rectangle2D19, (org.jfree.chart.plot.PiePlot) piePlot3D20, (java.lang.Integer) 15, plotRenderingInfo37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D12.setLabelPadding(rectangleInsets13);
        java.awt.Paint paint15 = piePlot3D12.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        piePlot3D12.addChangeListener(plotChangeListener16);
        piePlot3D12.setBackgroundImageAlignment((int) (short) 10);
        java.awt.Stroke stroke20 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D12.setOutlineStroke(stroke20);
        java.awt.Paint paint22 = piePlot3D12.getBaseSectionPaint();
        piePlot3D12.setIgnoreZeroValues(false);
        java.awt.Font font25 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D12.setLabelFont(font25);
        piePlot3D0.setNoDataMessageFont(font25);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(pieSectionLabelGenerator10);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(font25);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.data.general.PieDataset pieDataset3 = piePlot3D0.getDataset();
        boolean boolean4 = piePlot3D0.isCircular();
        java.awt.Image image5 = null;
        piePlot3D0.setBackgroundImage(image5);
        java.lang.Object obj7 = piePlot3D0.clone();
        boolean boolean8 = piePlot3D0.isSubplot();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieDataset3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        double double15 = piePlot3D0.getDepthFactor();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(pieSectionLabelGenerator10);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.12d + "'", double15 == 0.12d);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D13.setSectionOutlinesVisible(true);
        piePlot3D13.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        piePlot3D13.drawBackgroundImage(graphics2D18, rectangle2D19);
        java.awt.Paint paint21 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D13.setNoDataMessagePaint(paint21);
        java.awt.Stroke stroke23 = piePlot3D13.getLabelOutlineStroke();
        org.jfree.chart.plot.PiePlot3D piePlot3D24 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D24.setLabelPadding(rectangleInsets25);
        java.awt.Paint paint27 = piePlot3D24.getLabelLinkPaint();
        boolean boolean28 = piePlot3D24.getLabelLinksVisible();
        double double29 = piePlot3D24.getDepthFactor();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator30 = piePlot3D24.getLabelGenerator();
        piePlot3D13.setLabelGenerator(pieSectionLabelGenerator30);
        java.awt.Paint paint32 = piePlot3D13.getOutlinePaint();
        piePlot3D0.setLabelOutlinePaint(paint32);
        java.awt.Paint paint35 = null;
        piePlot3D0.setSectionOutlinePaint((java.lang.Comparable) 100L, paint35);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(rotation8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.12d + "'", double29 == 0.12d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator30);
        org.junit.Assert.assertNotNull(paint32);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        piePlot3D0.removeChangeListener(plotChangeListener8);
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D10.setSectionOutlinesVisible(true);
        piePlot3D10.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        piePlot3D10.drawBackgroundImage(graphics2D15, rectangle2D16);
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        piePlot3D10.removeChangeListener(plotChangeListener18);
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D21.setLabelPadding(rectangleInsets22);
        java.awt.Paint paint24 = piePlot3D21.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = null;
        piePlot3D21.setLegendLabelToolTipGenerator(pieSectionLabelGenerator25);
        piePlot3D21.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot29 = piePlot3D21.getRootPlot();
        java.awt.Stroke stroke30 = piePlot3D21.getOutlineStroke();
        double double31 = piePlot3D21.getMaximumLabelWidth();
        int int32 = piePlot3D21.getPieIndex();
        double double33 = piePlot3D21.getStartAngle();
        org.jfree.chart.plot.PiePlot3D piePlot3D34 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D34.setLabelPadding(rectangleInsets35);
        java.awt.Paint paint37 = piePlot3D34.getLabelLinkPaint();
        java.awt.Paint paint38 = piePlot3D34.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D39 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D39.setLabelPadding(rectangleInsets40);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo44 = null;
        piePlot3D39.handleClick((int) (short) 100, 0, plotRenderingInfo44);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator46 = piePlot3D39.getURLGenerator();
        java.awt.Paint paint47 = piePlot3D39.getLabelOutlinePaint();
        piePlot3D34.setLabelShadowPaint(paint47);
        org.jfree.data.general.DatasetGroup datasetGroup49 = piePlot3D34.getDatasetGroup();
        piePlot3D34.setCircular(true);
        java.awt.Stroke stroke52 = piePlot3D34.getLabelOutlineStroke();
        piePlot3D21.setOutlineStroke(stroke52);
        piePlot3D10.setSectionOutlineStroke((java.lang.Comparable) 1L, stroke52);
        piePlot3D0.setOutlineStroke(stroke52);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier56 = piePlot3D0.getDrawingSupplier();
        java.awt.Paint paint57 = piePlot3D0.getOutlinePaint();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(plot29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.14d + "'", double31 == 0.14d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 90.0d + "'", double33 == 90.0d);
        org.junit.Assert.assertNotNull(rectangleInsets35);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(rectangleInsets40);
        org.junit.Assert.assertNull(pieURLGenerator46);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNull(datasetGroup49);
        org.junit.Assert.assertNotNull(stroke52);
        org.junit.Assert.assertNotNull(drawingSupplier56);
        org.junit.Assert.assertNotNull(paint57);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        java.awt.Font font4 = piePlot3D0.getNoDataMessageFont();
        java.awt.Paint paint5 = piePlot3D0.getShadowPaint();
        piePlot3D0.setStartAngle((double) (-1.0f));
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.lang.String str9 = piePlot3D0.getPlotType();
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setLabelPadding(rectangleInsets11);
        java.awt.Paint paint13 = piePlot3D10.getLabelLinkPaint();
        boolean boolean14 = piePlot3D10.getLabelLinksVisible();
        piePlot3D10.setOutlineVisible(false);
        java.awt.Paint paint17 = piePlot3D10.getOutlinePaint();
        piePlot3D0.setBackgroundPaint(paint17);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Pie 3D Plot" + "'", str9, "Pie 3D Plot");
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo40 = null;
        piePlot3D0.handleClick(100, 10, plotRenderingInfo40);
        piePlot3D0.setLabelLinkMargin(0.12d);
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
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        float float3 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot3D0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Stroke stroke8 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) 0.5f);
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D9.setSectionOutlinesVisible(true);
        piePlot3D9.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        piePlot3D9.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent17 = null;
        piePlot3D9.axisChanged(axisChangeEvent17);
        org.jfree.data.general.PieDataset pieDataset19 = piePlot3D9.getDataset();
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D21.setLabelPadding(rectangleInsets22);
        java.awt.Paint paint24 = piePlot3D21.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = null;
        piePlot3D21.setLegendLabelToolTipGenerator(pieSectionLabelGenerator25);
        piePlot3D21.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot29 = piePlot3D21.getRootPlot();
        java.awt.Stroke stroke30 = piePlot3D21.getOutlineStroke();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator31 = piePlot3D21.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.Plot plot32 = piePlot3D21.getParent();
        java.awt.Paint paint33 = piePlot3D21.getLabelOutlinePaint();
        piePlot3D9.setSectionPaint((java.lang.Comparable) 4.0d, paint33);
        piePlot3D0.setShadowPaint(paint33);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertNull(pieDataset19);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(plot29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNull(pieSectionLabelGenerator31);
        org.junit.Assert.assertNull(plot32);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D21.setLabelPadding(rectangleInsets22);
        java.awt.Paint paint24 = piePlot3D21.getLabelLinkPaint();
        boolean boolean25 = piePlot3D21.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = piePlot3D21.getInsets();
        java.awt.Paint paint27 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D21.setShadowPaint(paint27);
        piePlot3D21.setIgnoreZeroValues(true);
        java.awt.Stroke stroke31 = piePlot3D21.getLabelLinkStroke();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier32 = piePlot3D21.getDrawingSupplier();
        org.jfree.chart.plot.PiePlot3D piePlot3D33 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D33.setLabelPadding(rectangleInsets34);
        java.awt.Paint paint36 = piePlot3D33.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator37 = null;
        piePlot3D33.setLegendLabelToolTipGenerator(pieSectionLabelGenerator37);
        piePlot3D33.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot41 = piePlot3D33.getRootPlot();
        org.jfree.chart.plot.PiePlot3D piePlot3D42 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D42.setLabelPadding(rectangleInsets43);
        java.awt.Paint paint45 = piePlot3D42.getLabelLinkPaint();
        java.awt.Paint paint46 = piePlot3D42.getShadowPaint();
        piePlot3D33.setBaseSectionOutlinePaint(paint46);
        piePlot3D21.setLabelLinkPaint(paint46);
        piePlot3D21.setPieIndex(10);
        java.awt.Paint paint51 = piePlot3D21.getLabelOutlinePaint();
        piePlot3D0.setBackgroundPaint(paint51);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNull(pieURLGenerator15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(drawingSupplier32);
        org.junit.Assert.assertNotNull(rectangleInsets34);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(plot41);
        org.junit.Assert.assertNotNull(rectangleInsets43);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(paint51);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
        piePlot3D0.setDarkerSides(false);
        double double26 = piePlot3D0.getDepthFactor();
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.12d + "'", double26 == 0.12d);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.event.PlotChangeListener plotChangeListener8 = null;
        piePlot3D0.removeChangeListener(plotChangeListener8);
        boolean boolean10 = piePlot3D0.isCircular();
        org.jfree.chart.plot.Plot plot11 = piePlot3D0.getParent();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(plot11);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PiePlot3D piePlot3D3 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D3.setLabelPadding(rectangleInsets4);
        java.awt.Paint paint6 = piePlot3D3.getLabelLinkPaint();
        boolean boolean7 = piePlot3D3.getLabelLinksVisible();
        piePlot3D3.setOutlineVisible(false);
        java.awt.Paint paint10 = piePlot3D3.getOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D11.setLabelPadding(rectangleInsets12);
        java.awt.Paint paint14 = piePlot3D11.getLabelLinkPaint();
        boolean boolean15 = piePlot3D11.getLabelLinksVisible();
        double double16 = piePlot3D11.getLabelLinkMargin();
        piePlot3D11.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup19 = piePlot3D11.getDatasetGroup();
        piePlot3D11.setBackgroundImageAlignment(1);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = piePlot3D11.getSimpleLabelOffset();
        org.jfree.chart.plot.PiePlot3D piePlot3D23 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D23.setLabelPadding(rectangleInsets24);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        piePlot3D23.handleClick((int) (short) 100, 0, plotRenderingInfo28);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator30 = piePlot3D23.getURLGenerator();
        java.awt.Stroke stroke32 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D23.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke32);
        java.awt.Shape shape34 = piePlot3D23.getLegendItemShape();
        piePlot3D11.setLegendItemShape(shape34);
        piePlot3D3.setLegendItemShape(shape34);
        piePlot3D0.setLegendItemShape(shape34);
        java.awt.Image image38 = piePlot3D0.getBackgroundImage();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.025d + "'", double16 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup19);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNull(pieURLGenerator30);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertNull(image38);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D21.setLabelPadding(rectangleInsets22);
        java.awt.Paint paint24 = piePlot3D21.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener25 = null;
        piePlot3D21.addChangeListener(plotChangeListener25);
        java.awt.Paint paint27 = piePlot3D21.getShadowPaint();
        piePlot3D21.setDepthFactor((double) 1L);
        java.awt.Stroke stroke30 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D21.setBaseSectionOutlineStroke(stroke30);
        java.awt.Paint paint32 = piePlot3D21.getLabelPaint();
        piePlot3D0.setLabelBackgroundPaint(paint32);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(paint32);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        double double24 = piePlot3D0.getLabelLinkMargin();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.025d + "'", double24 == 0.025d);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        java.awt.Font font4 = piePlot3D0.getNoDataMessageFont();
        piePlot3D0.setCircular(true);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot3D0.axisChanged(axisChangeEvent7);
        piePlot3D0.setBackgroundImageAlignment(100);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(font4);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D13.setSectionOutlinesVisible(true);
        piePlot3D13.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        piePlot3D13.drawBackgroundImage(graphics2D18, rectangle2D19);
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        piePlot3D13.removeChangeListener(plotChangeListener21);
        java.awt.Stroke stroke24 = piePlot3D13.getSectionOutlineStroke((java.lang.Comparable) "");
        java.awt.Paint paint25 = piePlot3D13.getLabelBackgroundPaint();
        piePlot3D0.setBackgroundPaint(paint25);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(legendItemCollection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(stroke24);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean1 = piePlot3D0.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator2);
        boolean boolean4 = piePlot3D0.isOutlineVisible();
        java.lang.String str5 = piePlot3D0.getPlotType();
        org.jfree.data.general.DatasetGroup datasetGroup6 = piePlot3D0.getDatasetGroup();
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D7.setLabelPadding(rectangleInsets8);
        float float10 = piePlot3D7.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot3D7.drawBackgroundImage(graphics2D11, rectangle2D12);
        float float14 = piePlot3D7.getBackgroundImageAlpha();
        org.jfree.chart.util.Rotation rotation15 = piePlot3D7.getDirection();
        java.awt.Paint paint16 = piePlot3D7.getBackgroundPaint();
        piePlot3D0.setBackgroundPaint(paint16);
        java.awt.Paint paint18 = piePlot3D0.getShadowPaint();
        piePlot3D0.setIgnoreNullValues(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie 3D Plot" + "'", str5, "Pie 3D Plot");
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.5f + "'", float14 == 0.5f);
        org.junit.Assert.assertNotNull(rotation15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = piePlot3D0.getToolTipGenerator();
        double double8 = piePlot3D0.getLabelLinkMargin();
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D9.setLabelPadding(rectangleInsets10);
        java.awt.Paint paint12 = piePlot3D9.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = null;
        piePlot3D9.setLegendLabelToolTipGenerator(pieSectionLabelGenerator13);
        java.awt.Stroke stroke15 = piePlot3D9.getLabelOutlineStroke();
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        piePlot3D9.addChangeListener(plotChangeListener16);
        piePlot3D9.setSimpleLabels(true);
        piePlot3D9.setDepthFactor((double) 0.0f);
        org.jfree.chart.util.Rotation rotation22 = piePlot3D9.getDirection();
        piePlot3D9.setMaximumLabelWidth((double) (byte) -1);
        piePlot3D0.setParent((org.jfree.chart.plot.Plot) piePlot3D9);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieToolTipGenerator7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.025d + "'", double8 == 0.025d);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(rotation22);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        piePlot3D0.setPieIndex((int) ' ');
        boolean boolean10 = piePlot3D0.getDarkerSides();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
        boolean boolean18 = piePlot3D0.getSectionOutlinesVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        piePlot3D0.notifyListeners(plotChangeEvent19);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.12d + "'", double7 == 0.12d);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D5.setSectionOutlinesVisible(true);
        piePlot3D5.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        piePlot3D5.drawBackgroundImage(graphics2D10, rectangle2D11);
        java.awt.Paint paint13 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D5.setNoDataMessagePaint(paint13);
        java.awt.Paint paint15 = piePlot3D5.getLabelOutlinePaint();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        piePlot3D5.drawBackgroundImage(graphics2D16, rectangle2D17);
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D19.setLabelPadding(rectangleInsets20);
        java.awt.Paint paint22 = piePlot3D19.getLabelLinkPaint();
        boolean boolean23 = piePlot3D19.getLabelLinksVisible();
        piePlot3D19.setOutlineVisible(false);
        java.awt.Paint paint27 = piePlot3D19.getSectionOutlinePaint((java.lang.Comparable) 1L);
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D29 = new org.jfree.chart.plot.PiePlot3D(pieDataset28);
        java.awt.Paint paint30 = piePlot3D29.getBaseSectionPaint();
        piePlot3D19.setLabelShadowPaint(paint30);
        piePlot3D5.setNoDataMessagePaint(paint30);
        piePlot3D0.setOutlinePaint(paint30);
        java.lang.String str34 = piePlot3D0.getPlotType();
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(paint27);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Pie 3D Plot" + "'", str34, "Pie 3D Plot");
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = piePlot3D0.getSimpleLabelOffset();
        java.awt.Paint paint9 = piePlot3D0.getSectionPaint((java.lang.Comparable) (short) 0);
        java.lang.Object obj10 = piePlot3D0.clone();
        java.awt.Paint paint11 = piePlot3D0.getNoDataMessagePaint();
        java.awt.Paint paint12 = piePlot3D0.getLabelShadowPaint();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
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
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator12 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator12);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(pieDataset11);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot3D0.getInsets();
        org.jfree.chart.plot.Plot plot6 = piePlot3D0.getRootPlot();
        piePlot3D0.setExplodePercent((java.lang.Comparable) 4.0d, 10.0d);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = piePlot3D0.getDrawingSupplier();
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D11.setLabelPadding(rectangleInsets12);
        java.awt.Paint paint14 = piePlot3D11.getLabelLinkPaint();
        java.awt.Paint paint15 = piePlot3D11.getBackgroundPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D16.setLabelPadding(rectangleInsets17);
        java.awt.Paint paint19 = piePlot3D16.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator20 = null;
        piePlot3D16.setLegendLabelToolTipGenerator(pieSectionLabelGenerator20);
        org.jfree.chart.plot.Plot plot22 = piePlot3D16.getParent();
        org.jfree.chart.plot.PiePlot3D piePlot3D24 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D24.setLabelPadding(rectangleInsets25);
        java.awt.Paint paint27 = piePlot3D24.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator28 = null;
        piePlot3D24.setLegendLabelToolTipGenerator(pieSectionLabelGenerator28);
        piePlot3D24.setLabelLinkMargin(0.0d);
        piePlot3D24.setPieIndex((int) ' ');
        java.awt.Paint paint34 = piePlot3D24.getBaseSectionOutlinePaint();
        piePlot3D16.setSectionOutlinePaint((java.lang.Comparable) 'a', paint34);
        piePlot3D11.setNoDataMessagePaint(paint34);
        piePlot3D0.setLabelLinkPaint(paint34);
        java.awt.Stroke stroke38 = piePlot3D0.getLabelOutlineStroke();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(plot22);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(stroke38);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        piePlot3D0.setStartAngle((double) 'a');
        java.lang.Object obj12 = piePlot3D0.clone();
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        piePlot3D0.addChangeListener(plotChangeListener13);
        int int15 = piePlot3D0.getPieIndex();
        org.jfree.data.general.PieDataset pieDataset16 = piePlot3D0.getDataset();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(pieDataset16);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        java.awt.Paint paint11 = piePlot3D0.getNoDataMessagePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D12.setLabelPadding(rectangleInsets13);
        java.awt.Paint paint15 = piePlot3D12.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator16 = null;
        piePlot3D12.setLegendLabelToolTipGenerator(pieSectionLabelGenerator16);
        org.jfree.chart.plot.Plot plot18 = piePlot3D12.getParent();
        java.awt.Paint paint19 = piePlot3D12.getShadowPaint();
        piePlot3D12.setDepthFactor(0.0d);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent22 = null;
        piePlot3D12.notifyListeners(plotChangeEvent22);
        piePlot3D0.setParent((org.jfree.chart.plot.Plot) piePlot3D12);
        java.awt.Shape shape25 = piePlot3D0.getLegendItemShape();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(plot18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(shape25);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
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
        double double26 = piePlot3D0.getShadowYOffset();
        piePlot3D0.setExplodePercent((java.lang.Comparable) 0.4d, (double) 'a');
        org.jfree.chart.plot.PiePlot3D piePlot3D30 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D30.setLabelPadding(rectangleInsets31);
        java.awt.Paint paint33 = piePlot3D30.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator34 = null;
        piePlot3D30.setLegendLabelToolTipGenerator(pieSectionLabelGenerator34);
        piePlot3D30.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot38 = piePlot3D30.getRootPlot();
        org.jfree.chart.plot.PiePlot3D piePlot3D39 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D39.setLabelPadding(rectangleInsets40);
        java.awt.Paint paint42 = piePlot3D39.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener43 = null;
        piePlot3D39.addChangeListener(plotChangeListener43);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator45 = piePlot3D39.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot3D piePlot3D46 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D46.setLabelPadding(rectangleInsets47);
        java.awt.Paint paint49 = piePlot3D46.getLabelLinkPaint();
        boolean boolean50 = piePlot3D46.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent51 = null;
        piePlot3D46.notifyListeners(plotChangeEvent51);
        org.jfree.chart.util.RectangleInsets rectangleInsets53 = piePlot3D46.getSimpleLabelOffset();
        piePlot3D39.setLabelPadding(rectangleInsets53);
        piePlot3D30.setInsets(rectangleInsets53);
        piePlot3D0.setInsets(rectangleInsets53);
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.0d + "'", double26 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(plot38);
        org.junit.Assert.assertNotNull(rectangleInsets40);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNull(pieSectionLabelGenerator45);
        org.junit.Assert.assertNotNull(rectangleInsets47);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(rectangleInsets53);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        java.awt.Shape shape22 = piePlot3D0.getLegendItemShape();
        piePlot3D0.setSectionOutlinesVisible(false);
        boolean boolean25 = piePlot3D0.isCircular();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        java.awt.Image image11 = piePlot3D0.getBackgroundImage();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = piePlot3D0.getLabelDistributor();
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D13.setSectionOutlinesVisible(true);
        piePlot3D13.setStartAngle((double) (byte) -1);
        boolean boolean18 = piePlot3D13.isCircular();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator19 = piePlot3D13.getLegendLabelGenerator();
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D20.setLabelPadding(rectangleInsets21);
        java.awt.Paint paint23 = piePlot3D20.getLabelLinkPaint();
        boolean boolean24 = piePlot3D20.getLabelLinksVisible();
        double double25 = piePlot3D20.getLabelLinkMargin();
        piePlot3D20.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup28 = piePlot3D20.getDatasetGroup();
        java.awt.Image image29 = null;
        piePlot3D20.setBackgroundImage(image29);
        java.awt.Image image31 = null;
        piePlot3D20.setBackgroundImage(image31);
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = piePlot3D20.getLabelPadding();
        piePlot3D13.setInsets(rectangleInsets33);
        piePlot3D0.setLabelPadding(rectangleInsets33);
        org.jfree.chart.plot.PiePlot3D piePlot3D36 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D36.setLabelPadding(rectangleInsets37);
        java.awt.Paint paint39 = piePlot3D36.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator40 = null;
        piePlot3D36.setLegendLabelToolTipGenerator(pieSectionLabelGenerator40);
        piePlot3D36.setLabelLinkMargin(0.0d);
        piePlot3D36.setPieIndex((int) ' ');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor46 = piePlot3D36.getLabelDistributor();
        org.jfree.chart.plot.PiePlot3D piePlot3D47 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets48 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D47.setLabelPadding(rectangleInsets48);
        java.awt.Paint paint50 = piePlot3D47.getLabelLinkPaint();
        boolean boolean51 = piePlot3D47.getLabelLinksVisible();
        double double52 = piePlot3D47.getDepthFactor();
        org.jfree.chart.plot.PiePlot3D piePlot3D53 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D53.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets56 = piePlot3D53.getLabelPadding();
        java.awt.Font font57 = piePlot3D53.getNoDataMessageFont();
        java.awt.Paint paint58 = piePlot3D53.getOutlinePaint();
        java.awt.Font font59 = piePlot3D53.getNoDataMessageFont();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator60 = null;
        piePlot3D53.setURLGenerator(pieURLGenerator60);
        org.jfree.chart.plot.PiePlot3D piePlot3D63 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets64 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D63.setLabelPadding(rectangleInsets64);
        java.awt.Paint paint66 = piePlot3D63.getLabelLinkPaint();
        java.awt.Paint paint67 = piePlot3D63.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D68 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets69 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D68.setLabelPadding(rectangleInsets69);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo73 = null;
        piePlot3D68.handleClick((int) (short) 100, 0, plotRenderingInfo73);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator75 = piePlot3D68.getURLGenerator();
        java.awt.Paint paint76 = piePlot3D68.getLabelOutlinePaint();
        piePlot3D63.setLabelShadowPaint(paint76);
        org.jfree.data.general.DatasetGroup datasetGroup78 = piePlot3D63.getDatasetGroup();
        piePlot3D63.setCircular(true);
        java.awt.Stroke stroke81 = piePlot3D63.getLabelOutlineStroke();
        piePlot3D53.setSectionOutlineStroke((java.lang.Comparable) 10.0f, stroke81);
        java.awt.Paint paint83 = piePlot3D53.getLabelBackgroundPaint();
        piePlot3D47.setBaseSectionOutlinePaint(paint83);
        piePlot3D36.setBaseSectionPaint(paint83);
        piePlot3D0.setLabelLinkPaint(paint83);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(image11);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator19);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.025d + "'", double25 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup28);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNotNull(rectangleInsets37);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor46);
        org.junit.Assert.assertNotNull(rectangleInsets48);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.12d + "'", double52 == 0.12d);
        org.junit.Assert.assertNotNull(rectangleInsets56);
        org.junit.Assert.assertNotNull(font57);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertNotNull(font59);
        org.junit.Assert.assertNotNull(rectangleInsets64);
        org.junit.Assert.assertNotNull(paint66);
        org.junit.Assert.assertNotNull(paint67);
        org.junit.Assert.assertNotNull(rectangleInsets69);
        org.junit.Assert.assertNull(pieURLGenerator75);
        org.junit.Assert.assertNotNull(paint76);
        org.junit.Assert.assertNull(datasetGroup78);
        org.junit.Assert.assertNotNull(stroke81);
        org.junit.Assert.assertNotNull(paint83);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot3D0.getURLGenerator();
        java.awt.Shape shape8 = piePlot3D0.getLegendItemShape();
        java.awt.Paint paint9 = piePlot3D0.getLabelBackgroundPaint();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot3D0.getInsets();
        java.awt.Image image6 = null;
        piePlot3D0.setBackgroundImage(image6);
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D8.setLabelPadding(rectangleInsets9);
        java.awt.Paint paint11 = piePlot3D8.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator12 = null;
        piePlot3D8.setLegendLabelToolTipGenerator(pieSectionLabelGenerator12);
        piePlot3D8.setLabelLinkMargin(0.0d);
        piePlot3D8.setPieIndex((int) ' ');
        java.awt.Paint paint18 = piePlot3D8.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D19.setLabelPadding(rectangleInsets20);
        java.awt.Paint paint22 = piePlot3D19.getLabelLinkPaint();
        java.awt.Paint paint23 = piePlot3D19.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D24 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D24.setLabelPadding(rectangleInsets25);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        piePlot3D24.handleClick((int) (short) 100, 0, plotRenderingInfo29);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator31 = piePlot3D24.getURLGenerator();
        java.awt.Paint paint32 = piePlot3D24.getLabelOutlinePaint();
        piePlot3D19.setLabelShadowPaint(paint32);
        piePlot3D8.setLabelShadowPaint(paint32);
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = piePlot3D8.getInsets();
        piePlot3D0.setInsets(rectangleInsets35);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNull(pieURLGenerator31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(rectangleInsets35);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        float float4 = piePlot3D0.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        float float3 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot3D0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Stroke stroke8 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) 0.5f);
        java.awt.Paint paint9 = piePlot3D0.getBaseSectionPaint();
        piePlot3D0.setIgnoreNullValues(true);
        double double13 = piePlot3D0.getExplodePercent((java.lang.Comparable) (short) 1);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
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
        java.lang.String str17 = piePlot3D6.getPlotType();
        org.jfree.chart.event.PlotChangeListener plotChangeListener18 = null;
        piePlot3D6.removeChangeListener(plotChangeListener18);
        java.lang.String str20 = piePlot3D6.getNoDataMessage();
        piePlot3D6.setDarkerSides(false);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 90.0d + "'", double4 == 90.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Pie 3D Plot" + "'", str17, "Pie 3D Plot");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D22.setLabelPadding(rectangleInsets23);
        java.awt.Paint paint25 = piePlot3D22.getLabelLinkPaint();
        boolean boolean26 = piePlot3D22.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent27 = null;
        piePlot3D22.notifyListeners(plotChangeEvent27);
        double double29 = piePlot3D22.getDepthFactor();
        double double30 = piePlot3D22.getInteriorGap();
        org.jfree.chart.plot.PiePlot3D piePlot3D31 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D31.setLabelPadding(rectangleInsets32);
        java.awt.Paint paint34 = piePlot3D31.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator35 = null;
        piePlot3D31.setLegendLabelToolTipGenerator(pieSectionLabelGenerator35);
        piePlot3D31.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot39 = piePlot3D31.getRootPlot();
        java.awt.Paint paint40 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_OUTLINE_PAINT;
        piePlot3D31.setBaseSectionOutlinePaint(paint40);
        piePlot3D22.setBaseSectionPaint(paint40);
        org.jfree.chart.LegendItemCollection legendItemCollection43 = piePlot3D22.getLegendItems();
        double double44 = piePlot3D22.getInteriorGap();
        org.jfree.chart.plot.PiePlot3D piePlot3D46 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D46.setDarkerSides(false);
        boolean boolean49 = piePlot3D46.isOutlineVisible();
        boolean boolean50 = piePlot3D46.getIgnoreNullValues();
        java.awt.Font font51 = piePlot3D46.getLabelFont();
        java.awt.Paint paint52 = piePlot3D46.getLabelOutlinePaint();
        piePlot3D22.setSectionOutlinePaint((java.lang.Comparable) 0.14d, paint52);
        piePlot3D0.setNoDataMessagePaint(paint52);
        double double55 = piePlot3D0.getStartAngle();
        piePlot3D0.setBackgroundImageAlignment((int) (byte) 1);
        java.awt.Graphics2D graphics2D58 = null;
        java.awt.geom.Rectangle2D rectangle2D59 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.drawBackground(graphics2D58, rectangle2D59);
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
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.12d + "'", double29 == 0.12d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.08d + "'", double30 == 0.08d);
        org.junit.Assert.assertNotNull(rectangleInsets32);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(plot39);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(legendItemCollection43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.08d + "'", double44 == 0.08d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(font51);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 90.0d + "'", double55 == 90.0d);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        float float7 = piePlot3D0.getForegroundAlpha();
        java.awt.Paint paint8 = piePlot3D0.getBaseSectionOutlinePaint();
        java.awt.Paint paint9 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot3D0.setOutlinePaint(paint9);
        java.awt.Paint paint11 = piePlot3D0.getOutlinePaint();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator12 = piePlot3D0.getToolTipGenerator();
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D13.setSectionOutlinesVisible(true);
        piePlot3D13.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        piePlot3D13.drawBackgroundImage(graphics2D18, rectangle2D19);
        piePlot3D13.zoom((double) '#');
        java.awt.Font font23 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D13.setLabelFont(font23);
        piePlot3D13.setExplodePercent((java.lang.Comparable) '4', (double) 10L);
        java.awt.Stroke stroke28 = piePlot3D13.getBaseSectionOutlineStroke();
        piePlot3D0.setLabelOutlineStroke(stroke28);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(pieToolTipGenerator12);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNotNull(stroke28);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        java.awt.Paint paint2 = piePlot3D1.getBaseSectionPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator3 = piePlot3D1.getLabelGenerator();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = piePlot3D1.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D5.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = piePlot3D5.getLabelPadding();
        java.awt.Font font9 = piePlot3D5.getNoDataMessageFont();
        java.awt.Paint paint10 = piePlot3D5.getOutlinePaint();
        int int11 = piePlot3D5.getBackgroundImageAlignment();
        java.awt.Stroke stroke12 = piePlot3D5.getBaseSectionOutlineStroke();
        piePlot3D1.setBaseSectionOutlineStroke(stroke12);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator3);
        org.junit.Assert.assertNull(pieSectionLabelGenerator4);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        java.awt.Paint paint20 = piePlot3D0.getLabelOutlinePaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        piePlot3D0.handleClick((int) (byte) 10, (int) (byte) 0, plotRenderingInfo23);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        java.awt.Font font4 = piePlot3D0.getNoDataMessageFont();
        java.awt.Paint paint5 = piePlot3D0.getShadowPaint();
        java.awt.Font font6 = piePlot3D0.getLabelFont();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font6);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
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
        java.awt.Paint paint18 = piePlot3D8.getShadowPaint();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        double double4 = piePlot3D0.getStartAngle();
        double double5 = piePlot3D0.getShadowYOffset();
        piePlot3D0.setStartAngle((double) 10.0f);
        java.awt.Paint paint8 = piePlot3D0.getLabelPaint();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 90.0d + "'", double4 == 90.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot3D0.getInsets();
        java.awt.Image image6 = null;
        piePlot3D0.setBackgroundImage(image6);
        float float8 = piePlot3D0.getBackgroundAlpha();
        piePlot3D0.setForegroundAlpha(1.0f);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean1 = piePlot3D0.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator2);
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = piePlot3D0.getDrawingSupplier();
        org.jfree.data.general.PieDataset pieDataset6 = piePlot3D0.getDataset();
        double double7 = piePlot3D0.getMinimumArcAngleToDraw();
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D8.setSectionOutlinesVisible(true);
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D11.setLabelPadding(rectangleInsets12);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        piePlot3D11.handleClick((int) (short) 100, 0, plotRenderingInfo16);
        boolean boolean18 = piePlot3D11.getSectionOutlinesVisible();
        java.awt.Paint paint19 = piePlot3D11.getBaseSectionPaint();
        java.awt.Paint paint20 = piePlot3D11.getLabelOutlinePaint();
        piePlot3D8.setBaseSectionOutlinePaint(paint20);
        double double22 = piePlot3D8.getShadowYOffset();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator23 = piePlot3D8.getLabelGenerator();
        piePlot3D0.setLegendLabelGenerator(pieSectionLabelGenerator23);
        org.jfree.chart.plot.Plot plot25 = piePlot3D0.getRootPlot();
        org.jfree.chart.event.PlotChangeListener plotChangeListener26 = null;
        plot25.addChangeListener(plotChangeListener26);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNull(pieDataset6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-5d + "'", double7 == 1.0E-5d);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator23);
        org.junit.Assert.assertNotNull(plot25);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
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
        boolean boolean15 = piePlot3D0.getIgnoreNullValues();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        piePlot3D0.setDataset(pieDataset16);
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D18.setLabelPadding(rectangleInsets19);
        java.awt.Paint paint21 = piePlot3D18.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator22 = null;
        piePlot3D18.setLegendLabelToolTipGenerator(pieSectionLabelGenerator22);
        piePlot3D18.setLabelLinkMargin(0.0d);
        piePlot3D18.setPieIndex((int) ' ');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor28 = piePlot3D18.getLabelDistributor();
        java.awt.Paint paint29 = piePlot3D18.getLabelShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D30 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D30.setLabelPadding(rectangleInsets31);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        piePlot3D30.handleClick((int) (short) 100, 0, plotRenderingInfo35);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator37 = piePlot3D30.getURLGenerator();
        org.jfree.chart.util.Rotation rotation38 = piePlot3D30.getDirection();
        piePlot3D18.setDirection(rotation38);
        java.awt.Stroke stroke40 = piePlot3D18.getLabelOutlineStroke();
        java.awt.Paint paint41 = piePlot3D18.getLabelPaint();
        piePlot3D0.setLabelLinkPaint(paint41);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNull(pieURLGenerator37);
        org.junit.Assert.assertNotNull(rotation38);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(paint41);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D12.setLabelPadding(rectangleInsets13);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        piePlot3D12.handleClick((int) (short) 100, 0, plotRenderingInfo17);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator19 = piePlot3D12.getURLGenerator();
        org.jfree.chart.util.Rotation rotation20 = piePlot3D12.getDirection();
        piePlot3D0.setDirection(rotation20);
        java.awt.Stroke stroke22 = piePlot3D0.getLabelOutlineStroke();
        boolean boolean23 = piePlot3D0.isCircular();
        java.awt.Paint paint24 = piePlot3D0.getLabelPaint();
        boolean boolean25 = piePlot3D0.isCircular();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNull(pieURLGenerator19);
        org.junit.Assert.assertNotNull(rotation20);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PiePlot3D piePlot3D4 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean5 = piePlot3D4.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot3D4.setToolTipGenerator(pieToolTipGenerator6);
        java.awt.Paint paint8 = piePlot3D4.getShadowPaint();
        piePlot3D0.setSectionPaint((java.lang.Comparable) (short) -1, paint8);
        piePlot3D0.setExplodePercent((java.lang.Comparable) (short) 10, 1.0d);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator13 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator13);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
        java.awt.Paint paint14 = piePlot3D0.getBackgroundPaint();
        piePlot3D0.setInteriorGap(0.08d);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot3D0.addChangeListener(plotChangeListener4);
        piePlot3D0.setBackgroundImageAlignment((int) (short) 10);
        piePlot3D0.setCircular(false, true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = piePlot3D0.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = piePlot3D0.getInsets();
        org.jfree.chart.plot.Plot plot13 = piePlot3D0.getRootPlot();
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D14.setLabelPadding(rectangleInsets15);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        piePlot3D14.handleClick((int) (short) 100, 0, plotRenderingInfo19);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator21 = piePlot3D14.getURLGenerator();
        java.awt.Stroke stroke23 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D14.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke23);
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D25.setLabelPadding(rectangleInsets26);
        java.awt.Paint paint28 = piePlot3D25.getLabelLinkPaint();
        boolean boolean29 = piePlot3D25.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent30 = null;
        piePlot3D25.notifyListeners(plotChangeEvent30);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = piePlot3D25.getSimpleLabelOffset();
        piePlot3D14.setSimpleLabelOffset(rectangleInsets32);
        plot13.setInsets(rectangleInsets32, false);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(plot13);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNull(pieURLGenerator21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(rectangleInsets32);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        double double4 = piePlot3D0.getStartAngle();
        double double5 = piePlot3D0.getShadowYOffset();
        piePlot3D0.setStartAngle((double) 10.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = piePlot3D0.getLabelPadding();
        piePlot3D0.setLabelLinkMargin((double) (-1.0f));
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 90.0d + "'", double4 == 90.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets8);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.awt.Stroke stroke9 = piePlot3D0.getOutlineStroke();
        java.awt.Paint paint10 = piePlot3D0.getLabelShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D11.setSectionOutlinesVisible(true);
        piePlot3D11.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        piePlot3D11.drawBackgroundImage(graphics2D16, rectangle2D17);
        org.jfree.chart.event.PlotChangeListener plotChangeListener19 = null;
        piePlot3D11.removeChangeListener(plotChangeListener19);
        double double21 = piePlot3D11.getMinimumArcAngleToDraw();
        java.awt.Paint paint22 = piePlot3D11.getShadowPaint();
        piePlot3D0.setBaseSectionOutlinePaint(paint22);
        java.awt.Stroke stroke25 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) 1.0d);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0E-5d + "'", double21 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(stroke25);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D16.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = piePlot3D16.getLabelPadding();
        piePlot3D16.setShadowXOffset(10.0d);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        piePlot3D16.datasetChanged(datasetChangeEvent22);
        int int24 = piePlot3D16.getBackgroundImageAlignment();
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D25.setSectionOutlinesVisible(true);
        piePlot3D25.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        piePlot3D25.drawBackgroundImage(graphics2D30, rectangle2D31);
        java.awt.Paint paint33 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D25.setNoDataMessagePaint(paint33);
        java.awt.Paint paint35 = piePlot3D25.getLabelOutlinePaint();
        piePlot3D16.setBackgroundPaint(paint35);
        piePlot3D0.setShadowPaint(paint35);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D39 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D39.setLabelPadding(rectangleInsets40);
        java.awt.Paint paint42 = piePlot3D39.getLabelLinkPaint();
        boolean boolean43 = piePlot3D39.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent44 = null;
        piePlot3D39.notifyListeners(plotChangeEvent44);
        double double46 = piePlot3D39.getDepthFactor();
        org.jfree.chart.plot.PiePlot3D piePlot3D47 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D47.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets50 = piePlot3D47.getLabelPadding();
        java.awt.Font font51 = piePlot3D47.getNoDataMessageFont();
        java.awt.Paint paint52 = piePlot3D47.getOutlinePaint();
        java.awt.Font font53 = piePlot3D47.getNoDataMessageFont();
        piePlot3D39.setLabelFont(font53);
        java.awt.Paint paint55 = piePlot3D39.getBaseSectionPaint();
        piePlot3D0.setLabelOutlinePaint(paint55);
        piePlot3D0.setMaximumLabelWidth(0.12d);
        org.jfree.data.general.DatasetGroup datasetGroup59 = piePlot3D0.getDatasetGroup();
        java.awt.Paint paint60 = piePlot3D0.getLabelBackgroundPaint();
        java.awt.Paint paint61 = piePlot3D0.getLabelOutlinePaint();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(rectangleInsets40);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.12d + "'", double46 == 0.12d);
        org.junit.Assert.assertNotNull(rectangleInsets50);
        org.junit.Assert.assertNotNull(font51);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertNotNull(font53);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNull(datasetGroup59);
        org.junit.Assert.assertNotNull(paint60);
        org.junit.Assert.assertNotNull(paint61);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D12.setLabelPadding(rectangleInsets13);
        java.awt.Paint paint15 = piePlot3D12.getLabelLinkPaint();
        boolean boolean16 = piePlot3D12.getLabelLinksVisible();
        double double17 = piePlot3D12.getLabelLinkMargin();
        piePlot3D12.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup20 = piePlot3D12.getDatasetGroup();
        piePlot3D12.setBackgroundImageAlignment(1);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = piePlot3D12.getSimpleLabelOffset();
        piePlot3D12.setShadowXOffset((double) (-1.0f));
        java.awt.Font font26 = piePlot3D12.getNoDataMessageFont();
        piePlot3D0.setLabelFont(font26);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(pieSectionLabelGenerator10);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.025d + "'", double17 == 0.025d);
        org.junit.Assert.assertNull(datasetGroup20);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNotNull(font26);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
        piePlot3D13.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke17 = piePlot3D13.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator18 = piePlot3D13.getLegendLabelGenerator();
        piePlot3D0.setLabelGenerator(pieSectionLabelGenerator18);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator20 = piePlot3D0.getLabelGenerator();
        piePlot3D0.zoom(0.4d);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator23 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator23);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(stroke17);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator18);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator20);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = piePlot3D0.getInsets();
        java.awt.Paint paint23 = piePlot3D0.getLabelLinkPaint();
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(pieDataset11);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        float float3 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot3D0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Font font7 = piePlot3D0.getLabelFont();
        piePlot3D0.setPieIndex((int) (byte) 100);
        piePlot3D0.setLabelGap((double) 100.0f);
        float float12 = piePlot3D0.getForegroundAlpha();
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        float float3 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot3D0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Stroke stroke8 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) 0.5f);
        org.jfree.chart.plot.Plot plot9 = piePlot3D0.getParent();
        double double10 = piePlot3D0.getStartAngle();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setInsets(rectangleInsets11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertNull(plot9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 90.0d + "'", double10 == 90.0d);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        float float3 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot3D0.drawBackgroundImage(graphics2D4, rectangle2D5);
        float float7 = piePlot3D0.getBackgroundImageAlpha();
        org.jfree.chart.util.Rotation rotation8 = piePlot3D0.getDirection();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot3D0.getDrawingSupplier();
        piePlot3D0.setBackgroundAlpha((float) (byte) 10);
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(rotation8);
        org.junit.Assert.assertNotNull(drawingSupplier9);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        java.awt.Font font4 = piePlot3D0.getNoDataMessageFont();
        piePlot3D0.setCircular(true);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot3D0.axisChanged(axisChangeEvent7);
        org.jfree.data.general.DatasetGroup datasetGroup9 = piePlot3D0.getDatasetGroup();
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(font4);
        org.junit.Assert.assertNull(datasetGroup9);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
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
        java.awt.Paint paint29 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D0.setBaseSectionOutlinePaint(paint29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangleInsets1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(paint25);
    }
}

