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
        org.jfree.chart.plot.PiePlot3D piePlot3D15 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D15.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3D15.getLabelPadding();
        piePlot3D15.setShadowXOffset(10.0d);
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D21.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = piePlot3D21.getLabelPadding();
        java.awt.Font font25 = piePlot3D21.getNoDataMessageFont();
        piePlot3D15.setLabelFont(font25);
        java.awt.Paint paint27 = piePlot3D15.getLabelBackgroundPaint();
        piePlot3D0.setBaseSectionOutlinePaint(paint27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D6 and piePlot3D21", piePlot3D6.equals(piePlot3D21) ? piePlot3D6.hashCode() == piePlot3D21.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D26 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D26.setSectionOutlinesVisible(true);
        piePlot3D26.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        piePlot3D26.drawBackgroundImage(graphics2D31, rectangle2D32);
        java.awt.Paint paint34 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D26.setNoDataMessagePaint(paint34);
        boolean boolean36 = piePlot3D0.equals((java.lang.Object) paint34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D11 and piePlot3D26", piePlot3D11.equals(piePlot3D26) ? piePlot3D11.hashCode() == piePlot3D26.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getRootPlot();
        java.awt.Paint paint9 = piePlot3D0.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean11 = piePlot3D10.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator12 = null;
        piePlot3D10.setToolTipGenerator(pieToolTipGenerator12);
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D14.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke18 = piePlot3D14.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator19 = piePlot3D14.getLegendLabelGenerator();
        piePlot3D10.setLabelGenerator(pieSectionLabelGenerator19);
        piePlot3D0.setLegendLabelGenerator(pieSectionLabelGenerator19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D10 and piePlot3D14", piePlot3D10.equals(piePlot3D14) ? piePlot3D10.hashCode() == piePlot3D14.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setDarkerSides(false);
        boolean boolean3 = piePlot3D0.isOutlineVisible();
        boolean boolean4 = piePlot3D0.getIgnoreNullValues();
        org.jfree.data.general.PieDataset pieDataset5 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D(pieDataset5);
        java.awt.Paint paint7 = piePlot3D6.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D8.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke12 = piePlot3D8.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = piePlot3D8.getLegendLabelGenerator();
        piePlot3D6.setLegendLabelGenerator(pieSectionLabelGenerator13);
        piePlot3D0.setLabelGenerator(pieSectionLabelGenerator13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D6 and piePlot3D8", piePlot3D6.equals(piePlot3D8) ? piePlot3D6.hashCode() == piePlot3D8.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot3D0.getInsets();
        org.jfree.chart.plot.Plot plot6 = piePlot3D0.getRootPlot();
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D7.setLabelPadding(rectangleInsets8);
        java.awt.Paint paint10 = piePlot3D7.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator11 = null;
        piePlot3D7.setLegendLabelToolTipGenerator(pieSectionLabelGenerator11);
        piePlot3D7.setLabelLinkMargin(0.0d);
        piePlot3D7.setShadowXOffset(1.0d);
        java.awt.Paint paint17 = piePlot3D7.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D18.setSectionOutlinesVisible(true);
        piePlot3D18.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        piePlot3D18.drawBackgroundImage(graphics2D23, rectangle2D24);
        java.awt.Paint paint26 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D18.setNoDataMessagePaint(paint26);
        piePlot3D7.setShadowPaint(paint26);
        org.jfree.chart.plot.PiePlot3D piePlot3D29 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D29.setLabelPadding(rectangleInsets30);
        piePlot3D7.setInsets(rectangleInsets30);
        piePlot3D0.setLabelPadding(rectangleInsets30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D0 and piePlot3D29", piePlot3D0.equals(piePlot3D29) ? piePlot3D0.hashCode() == piePlot3D29.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D18.setLabelPadding(rectangleInsets19);
        java.awt.Paint paint21 = piePlot3D18.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator22 = null;
        piePlot3D18.setLegendLabelToolTipGenerator(pieSectionLabelGenerator22);
        java.awt.Stroke stroke24 = piePlot3D18.getLabelOutlineStroke();
        piePlot3D0.setBaseSectionOutlineStroke(stroke24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D5 and piePlot3D18", piePlot3D5.equals(piePlot3D18) ? piePlot3D5.hashCode() == piePlot3D18.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.data.general.PieDataset pieDataset4 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D(pieDataset4);
        java.awt.Paint paint6 = piePlot3D5.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D7.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke11 = piePlot3D7.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator12 = piePlot3D7.getLegendLabelGenerator();
        piePlot3D5.setLegendLabelGenerator(pieSectionLabelGenerator12);
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D5 and piePlot3D7", piePlot3D5.equals(piePlot3D7) ? piePlot3D5.hashCode() == piePlot3D7.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
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
        piePlot3D0.setLabelDistributor(abstractPieLabelDistributor47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D19 and piePlot3D26", piePlot3D19.equals(piePlot3D26) ? piePlot3D19.hashCode() == piePlot3D26.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D14.setSectionOutlinesVisible(true);
        piePlot3D14.setStartAngle((double) (byte) -1);
        java.lang.Object obj19 = piePlot3D14.clone();
        java.awt.Paint paint20 = piePlot3D14.getBackgroundPaint();
        piePlot3D0.setLabelOutlinePaint(paint20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D14 and obj19", piePlot3D14.equals(obj19) ? piePlot3D14.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D13.setLabelPadding(rectangleInsets14);
        java.awt.Paint paint16 = piePlot3D13.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator17 = null;
        piePlot3D13.setLegendLabelToolTipGenerator(pieSectionLabelGenerator17);
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean21 = piePlot3D20.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator22 = null;
        piePlot3D20.setToolTipGenerator(pieToolTipGenerator22);
        java.awt.Paint paint24 = piePlot3D20.getShadowPaint();
        piePlot3D13.setSectionPaint((java.lang.Comparable) 100.0f, paint24);
        piePlot3D10.setBaseSectionOutlinePaint(paint24);
        piePlot3D0.setShadowPaint(paint24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D5 and piePlot3D10", piePlot3D5.equals(piePlot3D10) ? piePlot3D5.hashCode() == piePlot3D10.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D12.setLabelPadding(rectangleInsets13);
        java.awt.Paint paint15 = piePlot3D12.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator16 = null;
        piePlot3D12.setLegendLabelToolTipGenerator(pieSectionLabelGenerator16);
        piePlot3D12.setLabelLinkMargin(0.0d);
        piePlot3D12.setShadowXOffset(1.0d);
        java.awt.Paint paint22 = piePlot3D12.getLabelOutlinePaint();
        piePlot3D0.setLabelBackgroundPaint(paint22);
        org.jfree.chart.plot.PiePlot3D piePlot3D24 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean25 = piePlot3D24.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator26 = null;
        piePlot3D24.setToolTipGenerator(pieToolTipGenerator26);
        org.jfree.chart.plot.PiePlot3D piePlot3D28 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D28.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke32 = piePlot3D28.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator33 = piePlot3D28.getLegendLabelGenerator();
        piePlot3D24.setLabelGenerator(pieSectionLabelGenerator33);
        piePlot3D0.setLabelGenerator(pieSectionLabelGenerator33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D24 and piePlot3D28", piePlot3D24.equals(piePlot3D28) ? piePlot3D24.hashCode() == piePlot3D28.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D11.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot3D11.getLabelPadding();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent15 = null;
        piePlot3D11.datasetChanged(datasetChangeEvent15);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator17 = piePlot3D11.getLabelGenerator();
        piePlot3D0.setLabelGenerator(pieSectionLabelGenerator17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D4 and piePlot3D11", piePlot3D4.equals(piePlot3D11) ? piePlot3D4.hashCode() == piePlot3D11.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        java.awt.Stroke stroke10 = piePlot3D0.getOutlineStroke();
        double double11 = piePlot3D0.getInteriorGap();
        boolean boolean12 = piePlot3D0.isOutlineVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D13.setLabelPadding(rectangleInsets14);
        java.awt.Paint paint16 = piePlot3D13.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator17 = null;
        piePlot3D13.setLegendLabelToolTipGenerator(pieSectionLabelGenerator17);
        org.jfree.chart.plot.Plot plot19 = piePlot3D13.getParent();
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D20.setLabelPadding(rectangleInsets21);
        java.awt.Paint paint23 = piePlot3D20.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        piePlot3D20.addChangeListener(plotChangeListener24);
        java.awt.Paint paint26 = piePlot3D20.getShadowPaint();
        piePlot3D13.setBaseSectionPaint(paint26);
        piePlot3D0.setShadowPaint(paint26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D13 and piePlot3D20", piePlot3D13.equals(piePlot3D20) ? piePlot3D13.hashCode() == piePlot3D20.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D16.setSectionOutlinesVisible(true);
        piePlot3D16.setStartAngle((double) (byte) -1);
        java.lang.Object obj21 = piePlot3D16.clone();
        java.awt.Paint paint22 = piePlot3D16.getBackgroundPaint();
        piePlot3D0.setLabelLinkPaint(paint22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D16 and obj21", piePlot3D16.equals(obj21) ? piePlot3D16.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
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
        org.jfree.chart.util.Rotation rotation21 = piePlot3D3.getDirection();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D1 and piePlot3D11", piePlot3D1.equals(piePlot3D11) ? piePlot3D1.hashCode() == piePlot3D11.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean8 = piePlot3D7.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator9 = null;
        piePlot3D7.setToolTipGenerator(pieToolTipGenerator9);
        java.awt.Paint paint11 = piePlot3D7.getShadowPaint();
        piePlot3D0.setSectionPaint((java.lang.Comparable) 100.0f, paint11);
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D13.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = piePlot3D13.getLabelPadding();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent17 = null;
        piePlot3D13.datasetChanged(datasetChangeEvent17);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator19 = piePlot3D13.getLabelGenerator();
        piePlot3D0.setLegendLabelGenerator(pieSectionLabelGenerator19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D7 and piePlot3D13", piePlot3D7.equals(piePlot3D13) ? piePlot3D7.hashCode() == piePlot3D13.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D0.setNoDataMessagePaint(paint8);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator10 = piePlot3D0.getLegendLabelURLGenerator();
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
        org.jfree.chart.plot.PiePlot3D piePlot3D31 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D31.setLabelPadding(rectangleInsets32);
        float float34 = piePlot3D31.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D35 = null;
        java.awt.geom.Rectangle2D rectangle2D36 = null;
        piePlot3D31.drawBackgroundImage(graphics2D35, rectangle2D36);
        float float38 = piePlot3D31.getBackgroundImageAlpha();
        org.jfree.chart.util.Rotation rotation39 = piePlot3D31.getDirection();
        piePlot3D11.setDirection(rotation39);
        piePlot3D0.setDirection(rotation39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D11 and piePlot3D31", piePlot3D11.equals(piePlot3D31) ? piePlot3D11.hashCode() == piePlot3D31.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean2 = piePlot3D1.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator3 = null;
        piePlot3D1.setToolTipGenerator(pieToolTipGenerator3);
        org.jfree.chart.plot.PiePlot3D piePlot3D5 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D5.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke9 = piePlot3D5.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator10 = piePlot3D5.getLegendLabelGenerator();
        piePlot3D1.setLabelGenerator(pieSectionLabelGenerator10);
        java.awt.Stroke stroke12 = piePlot3D1.getOutlineStroke();
        piePlot3D0.setLabelOutlineStroke(stroke12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D1 and piePlot3D5", piePlot3D1.equals(piePlot3D5) ? piePlot3D1.hashCode() == piePlot3D5.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D14.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = piePlot3D14.getLabelPadding();
        piePlot3D14.setShadowXOffset(10.0d);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor20 = piePlot3D14.getLabelDistributor();
        piePlot3D14.setNoDataMessage("hi!");
        org.jfree.chart.plot.PiePlot3D piePlot3D23 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D23.setLabelPadding(rectangleInsets24);
        java.awt.Paint paint26 = piePlot3D23.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener27 = null;
        piePlot3D23.addChangeListener(plotChangeListener27);
        java.awt.Paint paint29 = piePlot3D23.getShadowPaint();
        java.awt.Paint paint30 = piePlot3D23.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D31 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D31.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke35 = piePlot3D31.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator36 = piePlot3D31.getLegendLabelGenerator();
        piePlot3D23.setLegendLabelToolTipGenerator(pieSectionLabelGenerator36);
        boolean boolean38 = piePlot3D14.equals((java.lang.Object) pieSectionLabelGenerator36);
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D6 and piePlot3D31", piePlot3D6.equals(piePlot3D31) ? piePlot3D6.hashCode() == piePlot3D31.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        java.awt.Font font4 = piePlot3D0.getNoDataMessageFont();
        java.awt.Paint paint5 = piePlot3D0.getOutlinePaint();
        java.awt.Font font6 = piePlot3D0.getNoDataMessageFont();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = null;
        piePlot3D0.setURLGenerator(pieURLGenerator7);
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setLabelPadding(rectangleInsets11);
        java.awt.Paint paint13 = piePlot3D10.getLabelLinkPaint();
        java.awt.Paint paint14 = piePlot3D10.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D15 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D15.setLabelPadding(rectangleInsets16);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        piePlot3D15.handleClick((int) (short) 100, 0, plotRenderingInfo20);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = piePlot3D15.getURLGenerator();
        java.awt.Paint paint23 = piePlot3D15.getLabelOutlinePaint();
        piePlot3D10.setLabelShadowPaint(paint23);
        org.jfree.data.general.DatasetGroup datasetGroup25 = piePlot3D10.getDatasetGroup();
        piePlot3D10.setCircular(true);
        java.awt.Stroke stroke28 = piePlot3D10.getLabelOutlineStroke();
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) 10.0f, stroke28);
        java.awt.Paint paint30 = piePlot3D0.getLabelBackgroundPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D31 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D31.setLabelPadding(rectangleInsets32);
        float float34 = piePlot3D31.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D35 = null;
        java.awt.geom.Rectangle2D rectangle2D36 = null;
        piePlot3D31.drawBackgroundImage(graphics2D35, rectangle2D36);
        java.awt.Font font38 = piePlot3D31.getLabelFont();
        piePlot3D0.setLabelFont(font38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D15 and piePlot3D31", piePlot3D15.equals(piePlot3D31) ? piePlot3D15.hashCode() == piePlot3D31.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setDarkerSides(false);
        java.lang.Object obj3 = piePlot3D0.clone();
        org.jfree.chart.plot.PiePlot3D piePlot3D4 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D4.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = piePlot3D4.getLabelPadding();
        piePlot3D4.setShadowXOffset(10.0d);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor10 = piePlot3D4.getLabelDistributor();
        piePlot3D4.setNoDataMessage("hi!");
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D13.setLabelPadding(rectangleInsets14);
        java.awt.Paint paint16 = piePlot3D13.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        piePlot3D13.addChangeListener(plotChangeListener17);
        java.awt.Paint paint19 = piePlot3D13.getShadowPaint();
        java.awt.Paint paint20 = piePlot3D13.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D21.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke25 = piePlot3D21.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator26 = piePlot3D21.getLegendLabelGenerator();
        piePlot3D13.setLegendLabelToolTipGenerator(pieSectionLabelGenerator26);
        boolean boolean28 = piePlot3D4.equals((java.lang.Object) pieSectionLabelGenerator26);
        piePlot3D0.setLabelGenerator(pieSectionLabelGenerator26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj3 and piePlot3D21", obj3.equals(piePlot3D21) ? obj3.hashCode() == piePlot3D21.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        boolean boolean5 = piePlot3D0.isCircular();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D0.getLegendLabelGenerator();
        java.awt.Font font7 = piePlot3D0.getNoDataMessageFont();
        piePlot3D0.setPieIndex(100);
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D10.setDarkerSides(false);
        boolean boolean13 = piePlot3D10.isOutlineVisible();
        boolean boolean14 = piePlot3D10.getIgnoreNullValues();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = piePlot3D10.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean17 = piePlot3D16.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator18 = null;
        piePlot3D16.setToolTipGenerator(pieToolTipGenerator18);
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D20.setSectionOutlinesVisible(true);
        piePlot3D20.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        piePlot3D20.drawBackgroundImage(graphics2D25, rectangle2D26);
        java.awt.Paint paint28 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D20.setNoDataMessagePaint(paint28);
        java.awt.Stroke stroke30 = piePlot3D20.getLabelOutlineStroke();
        piePlot3D16.setLabelOutlineStroke(stroke30);
        piePlot3D10.setLabelOutlineStroke(stroke30);
        piePlot3D0.setBaseSectionOutlineStroke(stroke30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D10 and piePlot3D16", piePlot3D10.equals(piePlot3D16) ? piePlot3D10.hashCode() == piePlot3D16.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        double double7 = piePlot3D0.getDepthFactor();
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D8.setLabelPadding(rectangleInsets9);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        piePlot3D8.handleClick((int) (short) 100, 0, plotRenderingInfo13);
        boolean boolean15 = piePlot3D8.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D16.setLabelPadding(rectangleInsets17);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo21 = null;
        piePlot3D16.handleClick((int) (short) 100, 0, plotRenderingInfo21);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator23 = piePlot3D16.getURLGenerator();
        java.awt.Stroke stroke25 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D16.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke25);
        piePlot3D8.setLabelOutlineStroke(stroke25);
        org.jfree.chart.plot.PiePlot3D piePlot3D28 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D28.setLabelPadding(rectangleInsets29);
        float float31 = piePlot3D28.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D32 = null;
        java.awt.geom.Rectangle2D rectangle2D33 = null;
        piePlot3D28.drawBackgroundImage(graphics2D32, rectangle2D33);
        float float35 = piePlot3D28.getBackgroundImageAlpha();
        org.jfree.chart.util.Rotation rotation36 = piePlot3D28.getDirection();
        piePlot3D8.setDirection(rotation36);
        piePlot3D0.setDirection(rotation36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D8 and piePlot3D28", piePlot3D8.equals(piePlot3D28) ? piePlot3D8.hashCode() == piePlot3D28.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
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
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D5 and piePlot3D34", piePlot3D5.equals(piePlot3D34) ? piePlot3D5.hashCode() == piePlot3D34.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D24 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D24.setLabelPadding(rectangleInsets25);
        java.awt.Paint paint27 = piePlot3D24.getLabelLinkPaint();
        boolean boolean28 = piePlot3D24.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = piePlot3D24.getInsets();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D24.setInsets(rectangleInsets30, true);
        piePlot3D0.setSimpleLabelOffset(rectangleInsets30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D8 and piePlot3D24", piePlot3D8.equals(piePlot3D24) ? piePlot3D8.hashCode() == piePlot3D24.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D13.setLabelPadding(rectangleInsets14);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        piePlot3D13.handleClick((int) (short) 100, 0, plotRenderingInfo18);
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D20.setLabelPadding(rectangleInsets21);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        piePlot3D20.handleClick((int) (short) 100, 0, plotRenderingInfo25);
        boolean boolean27 = piePlot3D20.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D28 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D28.setLabelPadding(rectangleInsets29);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        piePlot3D28.handleClick((int) (short) 100, 0, plotRenderingInfo33);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator35 = piePlot3D28.getURLGenerator();
        java.awt.Stroke stroke37 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D28.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke37);
        piePlot3D20.setLabelOutlineStroke(stroke37);
        piePlot3D13.setLabelLinkStroke(stroke37);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor41 = piePlot3D13.getLabelDistributor();
        piePlot3D0.setLabelDistributor(abstractPieLabelDistributor41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D13 and piePlot3D20", piePlot3D13.equals(piePlot3D20) ? piePlot3D13.hashCode() == piePlot3D20.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
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
        java.awt.Stroke stroke21 = piePlot3D3.getBaseSectionOutlineStroke();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D1 and piePlot3D11", piePlot3D1.equals(piePlot3D11) ? piePlot3D1.hashCode() == piePlot3D11.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        org.jfree.chart.event.PlotChangeListener plotChangeListener5 = null;
        piePlot3D0.removeChangeListener(plotChangeListener5);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D(pieDataset7);
        java.awt.Paint paint9 = piePlot3D8.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D10.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke14 = piePlot3D10.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = piePlot3D10.getLegendLabelGenerator();
        piePlot3D8.setLegendLabelGenerator(pieSectionLabelGenerator15);
        piePlot3D0.setLabelGenerator(pieSectionLabelGenerator15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D8 and piePlot3D10", piePlot3D8.equals(piePlot3D10) ? piePlot3D8.hashCode() == piePlot3D10.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D31 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D31.setLabelPadding(rectangleInsets32);
        java.awt.Paint paint34 = piePlot3D31.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator35 = null;
        piePlot3D31.setLegendLabelToolTipGenerator(pieSectionLabelGenerator35);
        double double37 = piePlot3D31.getMaximumLabelWidth();
        java.awt.Paint paint38 = piePlot3D31.getLabelOutlinePaint();
        piePlot3D0.setLabelShadowPaint(paint38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D9 and piePlot3D31", piePlot3D9.equals(piePlot3D31) ? piePlot3D9.hashCode() == piePlot3D31.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.data.general.PieDataset pieDataset3 = piePlot3D0.getDataset();
        java.lang.String str4 = piePlot3D0.getPlotType();
        org.jfree.chart.plot.Plot plot5 = piePlot3D0.getParent();
        piePlot3D0.setStartAngle((double) 100);
        java.awt.Paint paint8 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent9 = null;
        piePlot3D0.axisChanged(axisChangeEvent9);
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
        org.jfree.chart.plot.PiePlot3D piePlot3D31 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D31.setLabelPadding(rectangleInsets32);
        float float34 = piePlot3D31.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D35 = null;
        java.awt.geom.Rectangle2D rectangle2D36 = null;
        piePlot3D31.drawBackgroundImage(graphics2D35, rectangle2D36);
        float float38 = piePlot3D31.getBackgroundImageAlpha();
        org.jfree.chart.util.Rotation rotation39 = piePlot3D31.getDirection();
        piePlot3D11.setDirection(rotation39);
        piePlot3D0.setDirection(rotation39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D11 and piePlot3D31", piePlot3D11.equals(piePlot3D31) ? piePlot3D11.hashCode() == piePlot3D31.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = piePlot3D0.getLabelPadding();
        piePlot3D0.setMinimumArcAngleToDraw((double) 15);
        piePlot3D0.setForegroundAlpha((float) 'a');
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D13.setSectionOutlinesVisible(true);
        piePlot3D13.setStartAngle((double) (byte) -1);
        java.lang.Object obj18 = piePlot3D13.clone();
        java.awt.Paint paint19 = piePlot3D13.getBackgroundPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D20.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = piePlot3D20.getLabelPadding();
        java.awt.Font font24 = piePlot3D20.getNoDataMessageFont();
        piePlot3D13.setNoDataMessageFont(font24);
        piePlot3D0.setLabelFont(font24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D13 and obj18", piePlot3D13.equals(obj18) ? piePlot3D13.hashCode() == obj18.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
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
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = piePlot3D10.getLabelGenerator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D1 and piePlot3D3", piePlot3D1.equals(piePlot3D3) ? piePlot3D1.hashCode() == piePlot3D3.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = piePlot3D0.getInsets();
        org.jfree.chart.plot.Plot plot6 = piePlot3D0.getRootPlot();
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D7.setSectionOutlinesVisible(true);
        piePlot3D7.setStartAngle((double) (byte) -1);
        boolean boolean12 = piePlot3D7.isCircular();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = piePlot3D7.getLegendLabelGenerator();
        java.awt.Font font14 = piePlot3D7.getNoDataMessageFont();
        org.jfree.chart.plot.PiePlot3D piePlot3D15 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D15.setLabelPadding(rectangleInsets16);
        java.awt.Paint paint18 = piePlot3D15.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator19 = null;
        piePlot3D15.setLegendLabelToolTipGenerator(pieSectionLabelGenerator19);
        piePlot3D15.setLabelLinkMargin(0.0d);
        piePlot3D15.setShadowXOffset(1.0d);
        java.awt.Paint paint25 = piePlot3D15.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D26 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D26.setSectionOutlinesVisible(true);
        piePlot3D26.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        piePlot3D26.drawBackgroundImage(graphics2D31, rectangle2D32);
        java.awt.Paint paint34 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D26.setNoDataMessagePaint(paint34);
        piePlot3D15.setShadowPaint(paint34);
        org.jfree.chart.plot.PiePlot3D piePlot3D37 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D37.setLabelPadding(rectangleInsets38);
        piePlot3D15.setInsets(rectangleInsets38);
        piePlot3D7.setInsets(rectangleInsets38);
        piePlot3D0.setInsets(rectangleInsets38, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D0 and piePlot3D37", piePlot3D0.equals(piePlot3D37) ? piePlot3D0.hashCode() == piePlot3D37.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D11.setSectionOutlinesVisible(true);
        piePlot3D11.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        piePlot3D11.drawBackgroundImage(graphics2D16, rectangle2D17);
        java.awt.Paint paint19 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D11.setNoDataMessagePaint(paint19);
        java.awt.Paint paint21 = piePlot3D11.getLabelOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset22 = piePlot3D11.getDataset();
        org.jfree.chart.plot.PiePlot3D piePlot3D23 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D23.setSectionOutlinesVisible(true);
        org.jfree.chart.plot.PiePlot3D piePlot3D26 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D26.setSectionOutlinesVisible(true);
        piePlot3D26.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        piePlot3D26.drawBackgroundImage(graphics2D31, rectangle2D32);
        java.awt.Paint paint34 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D26.setNoDataMessagePaint(paint34);
        java.awt.Stroke stroke36 = piePlot3D26.getLabelOutlineStroke();
        piePlot3D23.setBaseSectionOutlineStroke(stroke36);
        piePlot3D11.setOutlineStroke(stroke36);
        piePlot3D0.setLabelOutlineStroke(stroke36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D11 and piePlot3D26", piePlot3D11.equals(piePlot3D26) ? piePlot3D11.hashCode() == piePlot3D26.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D22.setLabelPadding(rectangleInsets23);
        float float25 = piePlot3D22.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        piePlot3D22.drawBackgroundImage(graphics2D26, rectangle2D27);
        org.jfree.chart.plot.PiePlot3D piePlot3D29 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D29.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = piePlot3D29.getLabelPadding();
        piePlot3D22.setSimpleLabelOffset(rectangleInsets32);
        boolean boolean34 = piePlot3D0.equals((java.lang.Object) piePlot3D22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D11 and piePlot3D29", piePlot3D11.equals(piePlot3D29) ? piePlot3D11.hashCode() == piePlot3D29.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
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
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D30 = new org.jfree.chart.plot.PiePlot3D(pieDataset29);
        java.awt.Paint paint31 = piePlot3D30.getBaseSectionPaint();
        java.awt.Stroke stroke32 = piePlot3D30.getOutlineStroke();
        java.awt.Shape shape33 = piePlot3D30.getLegendItemShape();
        piePlot3D0.setLegendItemShape(shape33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D21 and piePlot3D30", piePlot3D21.equals(piePlot3D30) ? piePlot3D21.hashCode() == piePlot3D30.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot3D0.addChangeListener(plotChangeListener4);
        double double6 = piePlot3D0.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D(pieDataset7);
        java.awt.Paint paint9 = piePlot3D8.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D10.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke14 = piePlot3D10.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = piePlot3D10.getLegendLabelGenerator();
        piePlot3D8.setLegendLabelGenerator(pieSectionLabelGenerator15);
        piePlot3D0.setLegendLabelGenerator(pieSectionLabelGenerator15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D8 and piePlot3D10", piePlot3D8.equals(piePlot3D10) ? piePlot3D8.hashCode() == piePlot3D10.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D20.setLabelPadding(rectangleInsets21);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        piePlot3D20.handleClick((int) (short) 100, 0, plotRenderingInfo25);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator27 = piePlot3D20.getURLGenerator();
        java.awt.Stroke stroke29 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D20.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke29);
        org.jfree.chart.plot.PiePlot3D piePlot3D31 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D31.setLabelPadding(rectangleInsets32);
        java.awt.Paint paint34 = piePlot3D31.getLabelLinkPaint();
        boolean boolean35 = piePlot3D31.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent36 = null;
        piePlot3D31.notifyListeners(plotChangeEvent36);
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = piePlot3D31.getSimpleLabelOffset();
        piePlot3D20.setSimpleLabelOffset(rectangleInsets38);
        java.awt.Font font40 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D20.setNoDataMessageFont(font40);
        org.jfree.data.general.PieDataset pieDataset42 = piePlot3D20.getDataset();
        boolean boolean43 = piePlot3D20.getSimpleLabels();
        java.awt.Paint paint44 = piePlot3D20.getLabelOutlinePaint();
        piePlot3D0.setLabelLinkPaint(paint44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D11 and piePlot3D31", piePlot3D11.equals(piePlot3D31) ? piePlot3D11.hashCode() == piePlot3D31.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
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
        double double35 = piePlot3D0.getLabelLinkMargin();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D28 and obj34", piePlot3D28.equals(obj34) ? piePlot3D28.hashCode() == obj34.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D26 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D26.setLabelPadding(rectangleInsets27);
        java.awt.Paint paint29 = piePlot3D26.getLabelLinkPaint();
        boolean boolean30 = piePlot3D26.getLabelLinksVisible();
        double double31 = piePlot3D26.getDepthFactor();
        org.jfree.chart.plot.PiePlot3D piePlot3D32 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D32.setLabelPadding(rectangleInsets33);
        org.jfree.chart.plot.PiePlot3D piePlot3D36 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean37 = piePlot3D36.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator38 = null;
        piePlot3D36.setToolTipGenerator(pieToolTipGenerator38);
        java.awt.Paint paint40 = piePlot3D36.getShadowPaint();
        piePlot3D32.setSectionPaint((java.lang.Comparable) (short) -1, paint40);
        piePlot3D26.setLabelPaint(paint40);
        java.awt.Paint paint43 = piePlot3D26.getOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D44 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D44.setLabelPadding(rectangleInsets45);
        java.awt.Paint paint47 = piePlot3D44.getLabelLinkPaint();
        boolean boolean48 = piePlot3D44.getLabelLinksVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D49 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets50 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D49.setLabelPadding(rectangleInsets50);
        piePlot3D44.setSimpleLabelOffset(rectangleInsets50);
        java.awt.Font font53 = piePlot3D44.getLabelFont();
        piePlot3D26.setNoDataMessageFont(font53);
        piePlot3D0.setLabelFont(font53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D17 and piePlot3D36", piePlot3D17.equals(piePlot3D36) ? piePlot3D17.hashCode() == piePlot3D36.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        piePlot3D0.handleClick((int) 'a', (-1), plotRenderingInfo17);
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D20.setLabelPadding(rectangleInsets21);
        java.awt.Paint paint23 = piePlot3D20.getLabelLinkPaint();
        boolean boolean24 = piePlot3D20.getLabelLinksVisible();
        double double25 = piePlot3D20.getDepthFactor();
        org.jfree.chart.plot.PiePlot3D piePlot3D26 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D26.setLabelPadding(rectangleInsets27);
        org.jfree.chart.plot.PiePlot3D piePlot3D30 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean31 = piePlot3D30.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator32 = null;
        piePlot3D30.setToolTipGenerator(pieToolTipGenerator32);
        java.awt.Paint paint34 = piePlot3D30.getShadowPaint();
        piePlot3D26.setSectionPaint((java.lang.Comparable) (short) -1, paint34);
        piePlot3D20.setLabelPaint(paint34);
        java.awt.Paint paint37 = piePlot3D20.getOutlinePaint();
        java.awt.Stroke stroke38 = piePlot3D20.getBaseSectionOutlineStroke();
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) 0.0d, stroke38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D8 and piePlot3D30", piePlot3D8.equals(piePlot3D30) ? piePlot3D8.hashCode() == piePlot3D30.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D31 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D31.setLabelPadding(rectangleInsets32);
        java.awt.Paint paint34 = piePlot3D31.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator35 = null;
        piePlot3D31.setLegendLabelToolTipGenerator(pieSectionLabelGenerator35);
        piePlot3D31.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot39 = piePlot3D31.getRootPlot();
        java.awt.Stroke stroke40 = piePlot3D31.getOutlineStroke();
        double double41 = piePlot3D31.getMaximumLabelWidth();
        org.jfree.chart.plot.PiePlot3D piePlot3D42 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D42.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = piePlot3D42.getLabelPadding();
        piePlot3D42.setShadowXOffset(10.0d);
        piePlot3D42.setCircular(false);
        piePlot3D42.setLabelGap((double) (short) 1);
        java.awt.Paint paint52 = piePlot3D42.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D53 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D53.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets56 = piePlot3D53.getLabelPadding();
        java.awt.Font font57 = piePlot3D53.getNoDataMessageFont();
        java.awt.Paint paint58 = piePlot3D53.getOutlinePaint();
        piePlot3D42.setLabelOutlinePaint(paint58);
        org.jfree.chart.plot.PiePlot3D piePlot3D60 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D60.setSectionOutlinesVisible(true);
        piePlot3D60.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D65 = null;
        java.awt.geom.Rectangle2D rectangle2D66 = null;
        piePlot3D60.drawBackgroundImage(graphics2D65, rectangle2D66);
        java.awt.Paint paint68 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D60.setNoDataMessagePaint(paint68);
        double double70 = piePlot3D60.getShadowYOffset();
        java.awt.Stroke stroke71 = piePlot3D60.getBaseSectionOutlineStroke();
        piePlot3D42.setBaseSectionOutlineStroke(stroke71);
        java.awt.Paint paint73 = piePlot3D42.getLabelOutlinePaint();
        piePlot3D31.setLabelShadowPaint(paint73);
        org.jfree.chart.plot.PiePlot3D piePlot3D75 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets76 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D75.setLabelPadding(rectangleInsets76);
        java.awt.Paint paint78 = piePlot3D75.getLabelLinkPaint();
        java.awt.Paint paint79 = piePlot3D75.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D80 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets81 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D80.setLabelPadding(rectangleInsets81);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo85 = null;
        piePlot3D80.handleClick((int) (short) 100, 0, plotRenderingInfo85);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator87 = piePlot3D80.getURLGenerator();
        java.awt.Paint paint88 = piePlot3D80.getLabelOutlinePaint();
        piePlot3D75.setLabelShadowPaint(paint88);
        org.jfree.data.general.DatasetGroup datasetGroup90 = piePlot3D75.getDatasetGroup();
        piePlot3D75.setCircular(true);
        java.awt.Stroke stroke93 = piePlot3D75.getLabelOutlineStroke();
        piePlot3D75.setLabelLinkMargin((-1.0d));
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator96 = piePlot3D75.getLegendLabelGenerator();
        piePlot3D31.setLegendLabelToolTipGenerator(pieSectionLabelGenerator96);
        piePlot3D0.setLegendLabelGenerator(pieSectionLabelGenerator96);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D4 and piePlot3D53", piePlot3D4.equals(piePlot3D53) ? piePlot3D4.hashCode() == piePlot3D53.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D44 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D44.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = piePlot3D44.getLabelPadding();
        java.awt.Font font48 = piePlot3D44.getNoDataMessageFont();
        java.awt.Paint paint49 = piePlot3D44.getOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D50 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D50.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets53 = piePlot3D50.getLabelPadding();
        piePlot3D50.setShadowXOffset(10.0d);
        org.jfree.chart.plot.PiePlot3D piePlot3D56 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D56.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets59 = piePlot3D56.getLabelPadding();
        java.awt.Font font60 = piePlot3D56.getNoDataMessageFont();
        piePlot3D50.setLabelFont(font60);
        piePlot3D44.setNoDataMessageFont(font60);
        piePlot3D0.setNoDataMessageFont(font60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D29 and piePlot3D44", piePlot3D29.equals(piePlot3D44) ? piePlot3D29.hashCode() == piePlot3D44.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D18.setLabelPadding(rectangleInsets19);
        java.awt.Paint paint21 = piePlot3D18.getLabelLinkPaint();
        java.awt.Paint paint22 = piePlot3D18.getShadowPaint();
        java.awt.Shape shape23 = piePlot3D18.getLegendItemShape();
        piePlot3D0.setLegendItemShape(shape23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D8 and piePlot3D18", piePlot3D8.equals(piePlot3D18) ? piePlot3D8.hashCode() == piePlot3D18.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D12.setLabelPadding(rectangleInsets13);
        java.awt.Paint paint15 = piePlot3D12.getLabelLinkPaint();
        boolean boolean16 = piePlot3D12.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        piePlot3D12.notifyListeners(plotChangeEvent17);
        double double19 = piePlot3D12.getDepthFactor();
        double double20 = piePlot3D12.getInteriorGap();
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D21.setLabelPadding(rectangleInsets22);
        java.awt.Paint paint24 = piePlot3D21.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = null;
        piePlot3D21.setLegendLabelToolTipGenerator(pieSectionLabelGenerator25);
        piePlot3D21.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot29 = piePlot3D21.getRootPlot();
        java.awt.Paint paint30 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_OUTLINE_PAINT;
        piePlot3D21.setBaseSectionOutlinePaint(paint30);
        piePlot3D12.setBaseSectionPaint(paint30);
        org.jfree.chart.LegendItemCollection legendItemCollection33 = piePlot3D12.getLegendItems();
        double double34 = piePlot3D12.getInteriorGap();
        org.jfree.chart.plot.PiePlot3D piePlot3D36 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D36.setDarkerSides(false);
        boolean boolean39 = piePlot3D36.isOutlineVisible();
        boolean boolean40 = piePlot3D36.getIgnoreNullValues();
        java.awt.Font font41 = piePlot3D36.getLabelFont();
        java.awt.Paint paint42 = piePlot3D36.getLabelOutlinePaint();
        piePlot3D12.setSectionOutlinePaint((java.lang.Comparable) 0.14d, paint42);
        piePlot3D0.setBaseSectionOutlinePaint(paint42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D0 and piePlot3D21", piePlot3D0.equals(piePlot3D21) ? piePlot3D0.hashCode() == piePlot3D21.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D41 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets42 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D41.setLabelPadding(rectangleInsets42);
        java.awt.Paint paint44 = piePlot3D41.getLabelLinkPaint();
        java.awt.Paint paint45 = piePlot3D41.getShadowPaint();
        piePlot3D41.setShadowXOffset((double) 15);
        java.lang.String str48 = piePlot3D41.getPlotType();
        boolean boolean49 = piePlot3D41.getDarkerSides();
        piePlot3D41.setCircular(false, false);
        org.jfree.chart.plot.PiePlot3D piePlot3D53 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets54 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D53.setLabelPadding(rectangleInsets54);
        java.awt.Paint paint56 = piePlot3D53.getLabelLinkPaint();
        boolean boolean57 = piePlot3D53.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets58 = piePlot3D53.getInsets();
        java.awt.Image image59 = null;
        piePlot3D53.setBackgroundImage(image59);
        float float61 = piePlot3D53.getBackgroundAlpha();
        org.jfree.chart.plot.PiePlot3D piePlot3D62 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D62.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets65 = piePlot3D62.getLabelPadding();
        java.awt.Paint paint66 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D62.setNoDataMessagePaint(paint66);
        piePlot3D53.setLabelLinkPaint(paint66);
        piePlot3D41.setOutlinePaint(paint66);
        java.awt.Paint paint71 = piePlot3D41.getSectionPaint((java.lang.Comparable) '4');
        piePlot3D0.setParent((org.jfree.chart.plot.Plot) piePlot3D41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D7 and piePlot3D53", piePlot3D7.equals(piePlot3D53) ? piePlot3D7.hashCode() == piePlot3D53.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D19.setLabelPadding(rectangleInsets20);
        java.awt.Paint paint22 = piePlot3D19.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator23 = null;
        piePlot3D19.setLegendLabelToolTipGenerator(pieSectionLabelGenerator23);
        piePlot3D19.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot27 = piePlot3D19.getRootPlot();
        org.jfree.chart.plot.PiePlot3D piePlot3D28 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D28.setLabelPadding(rectangleInsets29);
        java.awt.Paint paint31 = piePlot3D28.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener32 = null;
        piePlot3D28.addChangeListener(plotChangeListener32);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator34 = piePlot3D28.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot3D piePlot3D35 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D35.setLabelPadding(rectangleInsets36);
        java.awt.Paint paint38 = piePlot3D35.getLabelLinkPaint();
        boolean boolean39 = piePlot3D35.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent40 = null;
        piePlot3D35.notifyListeners(plotChangeEvent40);
        org.jfree.chart.util.RectangleInsets rectangleInsets42 = piePlot3D35.getSimpleLabelOffset();
        piePlot3D28.setLabelPadding(rectangleInsets42);
        piePlot3D19.setInsets(rectangleInsets42);
        piePlot3D0.setInsets(rectangleInsets42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D5 and piePlot3D35", piePlot3D5.equals(piePlot3D35) ? piePlot3D5.hashCode() == piePlot3D35.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D33 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D33.setLabelPadding(rectangleInsets34);
        org.jfree.chart.plot.PiePlot3D piePlot3D37 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean38 = piePlot3D37.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator39 = null;
        piePlot3D37.setToolTipGenerator(pieToolTipGenerator39);
        java.awt.Paint paint41 = piePlot3D37.getShadowPaint();
        piePlot3D33.setSectionPaint((java.lang.Comparable) (short) -1, paint41);
        org.jfree.data.general.PieDataset pieDataset43 = piePlot3D33.getDataset();
        piePlot3D33.setExplodePercent((java.lang.Comparable) 0.0d, 100.0d);
        java.lang.Object obj47 = piePlot3D33.clone();
        org.jfree.chart.plot.PiePlot3D piePlot3D48 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets49 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D48.setLabelPadding(rectangleInsets49);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo53 = null;
        piePlot3D48.handleClick((int) (short) 100, 0, plotRenderingInfo53);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator55 = piePlot3D48.getURLGenerator();
        java.awt.Stroke stroke57 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D48.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke57);
        java.awt.Shape shape59 = piePlot3D48.getLegendItemShape();
        piePlot3D48.setOutlineVisible(false);
        java.awt.Stroke stroke62 = piePlot3D48.getBaseSectionOutlineStroke();
        piePlot3D33.setOutlineStroke(stroke62);
        piePlot3D33.setLabelLinksVisible(true);
        org.jfree.chart.plot.PiePlot3D piePlot3D66 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets67 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D66.setLabelPadding(rectangleInsets67);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo71 = null;
        piePlot3D66.handleClick((int) (short) 100, 0, plotRenderingInfo71);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator73 = piePlot3D66.getURLGenerator();
        java.awt.Paint paint74 = piePlot3D66.getLabelOutlinePaint();
        double double75 = piePlot3D66.getLabelLinkMargin();
        org.jfree.chart.plot.PiePlot3D piePlot3D76 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets77 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D76.setLabelPadding(rectangleInsets77);
        float float79 = piePlot3D76.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D80 = null;
        java.awt.geom.Rectangle2D rectangle2D81 = null;
        piePlot3D76.drawBackgroundImage(graphics2D80, rectangle2D81);
        java.awt.Stroke stroke84 = piePlot3D76.getSectionOutlineStroke((java.lang.Comparable) 0.5f);
        java.awt.Paint paint85 = piePlot3D76.getBaseSectionPaint();
        piePlot3D66.setBackgroundPaint(paint85);
        piePlot3D33.setLabelShadowPaint(paint85);
        piePlot3D0.setShadowPaint(paint85);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D11 and piePlot3D37", piePlot3D11.equals(piePlot3D37) ? piePlot3D11.hashCode() == piePlot3D37.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D18.setLabelPadding(rectangleInsets19);
        java.awt.Paint paint21 = piePlot3D18.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator22 = null;
        piePlot3D18.setLegendLabelToolTipGenerator(pieSectionLabelGenerator22);
        piePlot3D18.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot26 = piePlot3D18.getRootPlot();
        org.jfree.chart.plot.PiePlot3D piePlot3D27 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D27.setLabelPadding(rectangleInsets28);
        java.awt.Paint paint30 = piePlot3D27.getLabelLinkPaint();
        java.awt.Paint paint31 = piePlot3D27.getShadowPaint();
        piePlot3D18.setBaseSectionOutlinePaint(paint31);
        java.awt.Font font33 = piePlot3D18.getLabelFont();
        piePlot3D0.setLabelFont(font33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D5 and piePlot3D27", piePlot3D5.equals(piePlot3D27) ? piePlot3D5.hashCode() == piePlot3D27.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D31 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D31.setLabelPadding(rectangleInsets32);
        java.awt.Paint paint34 = piePlot3D31.getLabelLinkPaint();
        boolean boolean35 = piePlot3D31.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent36 = null;
        piePlot3D31.notifyListeners(plotChangeEvent36);
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = piePlot3D31.getSimpleLabelOffset();
        piePlot3D0.setInsets(rectangleInsets38, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D9 and piePlot3D31", piePlot3D9.equals(piePlot3D31) ? piePlot3D9.hashCode() == piePlot3D31.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D31 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D31.setLabelPadding(rectangleInsets32);
        java.awt.Paint paint34 = piePlot3D31.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator35 = null;
        piePlot3D31.setLegendLabelToolTipGenerator(pieSectionLabelGenerator35);
        double double37 = piePlot3D31.getMaximumLabelWidth();
        java.awt.Paint paint38 = piePlot3D31.getLabelOutlinePaint();
        piePlot3D0.setNoDataMessagePaint(paint38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D11 and piePlot3D31", piePlot3D11.equals(piePlot3D31) ? piePlot3D11.hashCode() == piePlot3D31.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
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
        float float13 = piePlot3D10.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        piePlot3D10.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D17.setLabelPadding(rectangleInsets18);
        java.awt.Paint paint20 = piePlot3D17.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator21 = null;
        piePlot3D17.setLegendLabelToolTipGenerator(pieSectionLabelGenerator21);
        piePlot3D17.setLabelLinkMargin(0.0d);
        piePlot3D17.setPieIndex((int) ' ');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor27 = piePlot3D17.getLabelDistributor();
        java.awt.Paint paint28 = piePlot3D17.getLabelShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D29 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D29.setLabelPadding(rectangleInsets30);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo34 = null;
        piePlot3D29.handleClick((int) (short) 100, 0, plotRenderingInfo34);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator36 = piePlot3D29.getURLGenerator();
        org.jfree.chart.util.Rotation rotation37 = piePlot3D29.getDirection();
        piePlot3D17.setDirection(rotation37);
        piePlot3D10.setDirection(rotation37);
        piePlot3D0.setDirection(rotation37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D10 and piePlot3D29", piePlot3D10.equals(piePlot3D29) ? piePlot3D10.hashCode() == piePlot3D29.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D30 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D30.setLabelPadding(rectangleInsets31);
        org.jfree.data.general.PieDataset pieDataset33 = piePlot3D30.getDataset();
        boolean boolean34 = piePlot3D30.isCircular();
        java.awt.Stroke stroke35 = piePlot3D30.getOutlineStroke();
        piePlot3D0.setOutlineStroke(stroke35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D21 and piePlot3D30", piePlot3D21.equals(piePlot3D30) ? piePlot3D21.hashCode() == piePlot3D30.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D20.setLabelPadding(rectangleInsets21);
        java.awt.Paint paint23 = piePlot3D20.getLabelLinkPaint();
        boolean boolean24 = piePlot3D20.getLabelLinksVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D25.setLabelPadding(rectangleInsets26);
        piePlot3D20.setSimpleLabelOffset(rectangleInsets26);
        piePlot3D0.setLabelPadding(rectangleInsets26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D11 and piePlot3D25", piePlot3D11.equals(piePlot3D25) ? piePlot3D11.hashCode() == piePlot3D25.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D24 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D24.setLabelPadding(rectangleInsets25);
        java.awt.Paint paint27 = piePlot3D24.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator28 = null;
        piePlot3D24.setLegendLabelToolTipGenerator(pieSectionLabelGenerator28);
        piePlot3D24.setLabelLinkMargin(0.0d);
        piePlot3D24.setShadowXOffset(1.0d);
        java.awt.Paint paint34 = piePlot3D24.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D35 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D35.setSectionOutlinesVisible(true);
        piePlot3D35.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D40 = null;
        java.awt.geom.Rectangle2D rectangle2D41 = null;
        piePlot3D35.drawBackgroundImage(graphics2D40, rectangle2D41);
        java.awt.Paint paint43 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D35.setNoDataMessagePaint(paint43);
        piePlot3D24.setShadowPaint(paint43);
        org.jfree.chart.plot.PiePlot3D piePlot3D46 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D46.setLabelPadding(rectangleInsets47);
        piePlot3D24.setInsets(rectangleInsets47);
        piePlot3D0.setSimpleLabelOffset(rectangleInsets47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D10 and piePlot3D35", piePlot3D10.equals(piePlot3D35) ? piePlot3D10.hashCode() == piePlot3D35.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
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
        org.jfree.chart.plot.Plot plot46 = piePlot3D38.getRootPlot();
        java.awt.Paint paint47 = piePlot3D38.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D49 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets50 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D49.setLabelPadding(rectangleInsets50);
        java.awt.Paint paint52 = piePlot3D49.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener53 = null;
        piePlot3D49.addChangeListener(plotChangeListener53);
        java.awt.Paint paint55 = piePlot3D49.getShadowPaint();
        piePlot3D38.setSectionOutlinePaint((java.lang.Comparable) (-1.0d), paint55);
        piePlot3D0.setBaseSectionPaint(paint55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D7 and piePlot3D49", piePlot3D7.equals(piePlot3D49) ? piePlot3D7.hashCode() == piePlot3D49.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D64 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets65 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D64.setLabelPadding(rectangleInsets65);
        java.awt.Paint paint67 = piePlot3D64.getLabelLinkPaint();
        boolean boolean68 = piePlot3D64.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets69 = piePlot3D64.getInsets();
        java.awt.Paint paint70 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D64.setShadowPaint(paint70);
        piePlot3D64.setIgnoreZeroValues(true);
        java.awt.Shape shape74 = piePlot3D64.getLegendItemShape();
        double double75 = piePlot3D64.getMaximumLabelWidth();
        org.jfree.chart.plot.PiePlot3D piePlot3D76 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D76.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets79 = piePlot3D76.getLabelPadding();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent80 = null;
        piePlot3D76.datasetChanged(datasetChangeEvent80);
        org.jfree.chart.plot.PiePlot3D piePlot3D82 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets83 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D82.setLabelPadding(rectangleInsets83);
        java.awt.Paint paint85 = piePlot3D82.getLabelLinkPaint();
        boolean boolean86 = piePlot3D82.getLabelLinksVisible();
        piePlot3D82.setOutlineVisible(false);
        java.awt.Paint paint90 = piePlot3D82.getSectionOutlinePaint((java.lang.Comparable) 1L);
        org.jfree.data.general.PieDataset pieDataset91 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D92 = new org.jfree.chart.plot.PiePlot3D(pieDataset91);
        java.awt.Paint paint93 = piePlot3D92.getBaseSectionPaint();
        piePlot3D82.setLabelShadowPaint(paint93);
        piePlot3D76.setLabelShadowPaint(paint93);
        piePlot3D64.setNoDataMessagePaint(paint93);
        piePlot3D0.setLabelShadowPaint(paint93);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D51 and piePlot3D92", piePlot3D51.equals(piePlot3D92) ? piePlot3D51.hashCode() == piePlot3D92.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
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
        java.lang.String str27 = piePlot3D0.getPlotType();
        org.jfree.chart.plot.PiePlot3D piePlot3D28 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D28.setLabelPadding(rectangleInsets29);
        float float31 = piePlot3D28.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D32 = null;
        java.awt.geom.Rectangle2D rectangle2D33 = null;
        piePlot3D28.drawBackgroundImage(graphics2D32, rectangle2D33);
        org.jfree.chart.plot.PiePlot3D piePlot3D35 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D35.setLabelPadding(rectangleInsets36);
        java.awt.Paint paint38 = piePlot3D35.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator39 = null;
        piePlot3D35.setLegendLabelToolTipGenerator(pieSectionLabelGenerator39);
        piePlot3D35.setLabelLinkMargin(0.0d);
        piePlot3D35.setPieIndex((int) ' ');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor45 = piePlot3D35.getLabelDistributor();
        java.awt.Paint paint46 = piePlot3D35.getLabelShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D47 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets48 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D47.setLabelPadding(rectangleInsets48);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo52 = null;
        piePlot3D47.handleClick((int) (short) 100, 0, plotRenderingInfo52);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator54 = piePlot3D47.getURLGenerator();
        org.jfree.chart.util.Rotation rotation55 = piePlot3D47.getDirection();
        piePlot3D35.setDirection(rotation55);
        piePlot3D28.setDirection(rotation55);
        piePlot3D0.setDirection(rotation55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D28 and piePlot3D47", piePlot3D28.equals(piePlot3D47) ? piePlot3D28.hashCode() == piePlot3D47.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        double double4 = piePlot3D0.getStartAngle();
        org.jfree.data.general.DatasetGroup datasetGroup5 = piePlot3D0.getDatasetGroup();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = piePlot3D0.getMaximumExplodePercent();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        piePlot3D0.handleClick((int) (short) 100, 0, plotRenderingInfo5);
        float float7 = piePlot3D0.getForegroundAlpha();
        java.awt.Paint paint8 = piePlot3D0.getBaseSectionOutlinePaint();
        java.lang.Object obj9 = piePlot3D0.clone();
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean11 = piePlot3D10.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator12 = null;
        piePlot3D10.setToolTipGenerator(pieToolTipGenerator12);
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D14.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke18 = piePlot3D14.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator19 = piePlot3D14.getLegendLabelGenerator();
        piePlot3D10.setLabelGenerator(pieSectionLabelGenerator19);
        java.awt.Stroke stroke21 = piePlot3D10.getOutlineStroke();
        piePlot3D0.setBaseSectionOutlineStroke(stroke21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D10 and piePlot3D14", piePlot3D10.equals(piePlot3D14) ? piePlot3D10.hashCode() == piePlot3D14.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        piePlot3D0.setShadowXOffset(10.0d);
        piePlot3D0.setCircular(false);
        piePlot3D0.setLabelGap((double) (short) 1);
        java.awt.Stroke stroke10 = piePlot3D0.getOutlineStroke();
        double double12 = piePlot3D0.getExplodePercent((java.lang.Comparable) 1.0d);
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D13.setLabelPadding(rectangleInsets14);
        java.awt.Paint paint16 = piePlot3D13.getLabelLinkPaint();
        boolean boolean17 = piePlot3D13.getLabelLinksVisible();
        double double18 = piePlot3D13.getDepthFactor();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator19 = piePlot3D13.getLabelGenerator();
        piePlot3D0.setLegendLabelGenerator(pieSectionLabelGenerator19);
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D22.setLabelPadding(rectangleInsets23);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        piePlot3D22.handleClick((int) (short) 100, 0, plotRenderingInfo27);
        boolean boolean29 = piePlot3D22.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D30 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D30.setLabelPadding(rectangleInsets31);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        piePlot3D30.handleClick((int) (short) 100, 0, plotRenderingInfo35);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator37 = piePlot3D30.getURLGenerator();
        java.awt.Stroke stroke39 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D30.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke39);
        piePlot3D22.setLabelOutlineStroke(stroke39);
        java.awt.Stroke stroke42 = piePlot3D22.getOutlineStroke();
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) 1.0E-5d, stroke42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D13 and piePlot3D22", piePlot3D13.equals(piePlot3D22) ? piePlot3D13.hashCode() == piePlot3D22.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
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
        boolean boolean22 = piePlot3D0.getDarkerSides();
        org.jfree.chart.plot.PiePlot3D piePlot3D23 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D23.setLabelPadding(rectangleInsets24);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        piePlot3D23.handleClick((int) (short) 100, 0, plotRenderingInfo28);
        float float30 = piePlot3D23.getForegroundAlpha();
        java.awt.Paint paint31 = piePlot3D23.getBaseSectionOutlinePaint();
        boolean boolean32 = piePlot3D23.getSimpleLabels();
        java.awt.Font font33 = piePlot3D23.getNoDataMessageFont();
        piePlot3D0.setNoDataMessageFont(font33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D5 and piePlot3D23", piePlot3D5.equals(piePlot3D23) ? piePlot3D5.hashCode() == piePlot3D23.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D21.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = piePlot3D21.getLabelPadding();
        java.awt.Paint paint25 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D21.setNoDataMessagePaint(paint25);
        org.jfree.chart.plot.PiePlot3D piePlot3D27 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D27.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = piePlot3D27.getLabelPadding();
        piePlot3D27.setShadowXOffset(10.0d);
        org.jfree.chart.plot.PiePlot3D piePlot3D33 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D33.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = piePlot3D33.getLabelPadding();
        java.awt.Font font37 = piePlot3D33.getNoDataMessageFont();
        piePlot3D27.setLabelFont(font37);
        java.awt.Paint paint39 = piePlot3D27.getLabelBackgroundPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = piePlot3D27.getInsets();
        piePlot3D21.setSimpleLabelOffset(rectangleInsets40);
        piePlot3D0.setSimpleLabelOffset(rectangleInsets40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D10 and piePlot3D33", piePlot3D10.equals(piePlot3D33) ? piePlot3D10.hashCode() == piePlot3D33.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D16.setSectionOutlinesVisible(true);
        piePlot3D16.setStartAngle((double) (byte) -1);
        java.lang.Object obj21 = piePlot3D16.clone();
        java.awt.Paint paint22 = piePlot3D16.getBackgroundPaint();
        piePlot3D0.setLabelOutlinePaint(paint22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D16 and obj21", piePlot3D16.equals(obj21) ? piePlot3D16.hashCode() == obj21.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D11.setLabelPadding(rectangleInsets12);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        piePlot3D11.handleClick((int) (short) 100, 0, plotRenderingInfo16);
        boolean boolean18 = piePlot3D11.getSectionOutlinesVisible();
        java.awt.Paint paint19 = piePlot3D11.getBaseSectionPaint();
        java.awt.Paint paint20 = piePlot3D11.getLabelOutlinePaint();
        piePlot3D0.setLabelOutlinePaint(paint20);
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D22.setLabelPadding(rectangleInsets23);
        java.awt.Paint paint25 = piePlot3D22.getLabelLinkPaint();
        java.awt.Paint paint26 = piePlot3D22.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D27 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D27.setLabelPadding(rectangleInsets28);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo32 = null;
        piePlot3D27.handleClick((int) (short) 100, 0, plotRenderingInfo32);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator34 = piePlot3D27.getURLGenerator();
        java.awt.Paint paint35 = piePlot3D27.getLabelOutlinePaint();
        piePlot3D22.setLabelShadowPaint(paint35);
        org.jfree.data.general.DatasetGroup datasetGroup37 = piePlot3D22.getDatasetGroup();
        piePlot3D22.setCircular(true);
        java.awt.Stroke stroke40 = piePlot3D22.getLabelOutlineStroke();
        piePlot3D22.setLabelLinkMargin((-1.0d));
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator43 = piePlot3D22.getLegendLabelGenerator();
        boolean boolean44 = piePlot3D0.equals((java.lang.Object) pieSectionLabelGenerator43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D11 and piePlot3D27", piePlot3D11.equals(piePlot3D27) ? piePlot3D11.hashCode() == piePlot3D27.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D11.setSectionOutlinesVisible(true);
        piePlot3D11.setStartAngle((double) (byte) -1);
        boolean boolean16 = piePlot3D11.isCircular();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator17 = piePlot3D11.getLegendLabelGenerator();
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator17);
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D19.setLabelPadding(rectangleInsets20);
        java.awt.Paint paint22 = piePlot3D19.getLabelLinkPaint();
        boolean boolean23 = piePlot3D19.getLabelLinksVisible();
        double double24 = piePlot3D19.getLabelLinkMargin();
        piePlot3D19.setBackgroundImageAlignment((int) 'a');
        double double27 = piePlot3D19.getStartAngle();
        org.jfree.chart.plot.PiePlot3D piePlot3D28 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D28.setLabelPadding(rectangleInsets29);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        piePlot3D28.handleClick((int) (short) 100, 0, plotRenderingInfo33);
        org.jfree.chart.plot.PiePlot3D piePlot3D35 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D35.setLabelPadding(rectangleInsets36);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo40 = null;
        piePlot3D35.handleClick((int) (short) 100, 0, plotRenderingInfo40);
        boolean boolean42 = piePlot3D35.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D43 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D43.setLabelPadding(rectangleInsets44);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo48 = null;
        piePlot3D43.handleClick((int) (short) 100, 0, plotRenderingInfo48);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator50 = piePlot3D43.getURLGenerator();
        java.awt.Stroke stroke52 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D43.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke52);
        piePlot3D35.setLabelOutlineStroke(stroke52);
        piePlot3D28.setLabelLinkStroke(stroke52);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor56 = piePlot3D28.getLabelDistributor();
        org.jfree.chart.plot.PiePlot3D piePlot3D57 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D57.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke61 = piePlot3D57.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator62 = piePlot3D57.getLegendLabelGenerator();
        piePlot3D28.setLegendLabelToolTipGenerator(pieSectionLabelGenerator62);
        piePlot3D19.setLegendLabelToolTipGenerator(pieSectionLabelGenerator62);
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator62);
        org.jfree.chart.util.RectangleInsets rectangleInsets66 = piePlot3D0.getInsets();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator17 and pieSectionLabelGenerator62", pieSectionLabelGenerator17.equals(pieSectionLabelGenerator62) ? pieSectionLabelGenerator17.hashCode() == pieSectionLabelGenerator62.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener4 = null;
        piePlot3D0.addChangeListener(plotChangeListener4);
        double double6 = piePlot3D0.getDepthFactor();
        piePlot3D0.setDarkerSides(true);
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D9.setLabelPadding(rectangleInsets10);
        java.awt.Paint paint12 = piePlot3D9.getLabelLinkPaint();
        boolean boolean13 = piePlot3D9.getLabelLinksVisible();
        double double14 = piePlot3D9.getDepthFactor();
        org.jfree.chart.plot.PiePlot3D piePlot3D15 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D15.setLabelPadding(rectangleInsets16);
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean20 = piePlot3D19.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator21 = null;
        piePlot3D19.setToolTipGenerator(pieToolTipGenerator21);
        java.awt.Paint paint23 = piePlot3D19.getShadowPaint();
        piePlot3D15.setSectionPaint((java.lang.Comparable) (short) -1, paint23);
        piePlot3D9.setLabelPaint(paint23);
        java.awt.Paint paint26 = piePlot3D9.getOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D27 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D27.setLabelPadding(rectangleInsets28);
        java.awt.Paint paint30 = piePlot3D27.getLabelLinkPaint();
        boolean boolean31 = piePlot3D27.getLabelLinksVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D32 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D32.setLabelPadding(rectangleInsets33);
        piePlot3D27.setSimpleLabelOffset(rectangleInsets33);
        java.awt.Font font36 = piePlot3D27.getLabelFont();
        piePlot3D9.setNoDataMessageFont(font36);
        piePlot3D0.setNoDataMessageFont(font36);
        org.jfree.chart.plot.PiePlot3D piePlot3D39 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D39.setLabelPadding(rectangleInsets40);
        java.awt.Paint paint42 = piePlot3D39.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener43 = null;
        piePlot3D39.addChangeListener(plotChangeListener43);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator45 = piePlot3D39.getLegendLabelToolTipGenerator();
        java.awt.Font font46 = piePlot3D39.getNoDataMessageFont();
        boolean boolean47 = piePlot3D39.isSubplot();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor48 = piePlot3D39.getLabelDistributor();
        piePlot3D0.setLabelDistributor(abstractPieLabelDistributor48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D32 and piePlot3D39", piePlot3D32.equals(piePlot3D39) ? piePlot3D32.hashCode() == piePlot3D39.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent5 = null;
        piePlot3D0.notifyListeners(plotChangeEvent5);
        java.lang.String str7 = piePlot3D0.getPlotType();
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D8.setLabelPadding(rectangleInsets9);
        java.awt.Paint paint11 = piePlot3D8.getLabelLinkPaint();
        boolean boolean12 = piePlot3D8.getLabelLinksVisible();
        double double13 = piePlot3D8.getLabelLinkMargin();
        piePlot3D8.setBackgroundImageAlignment((int) 'a');
        double double16 = piePlot3D8.getStartAngle();
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D17.setLabelPadding(rectangleInsets18);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        piePlot3D17.handleClick((int) (short) 100, 0, plotRenderingInfo22);
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
        piePlot3D17.setLabelLinkStroke(stroke41);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor45 = piePlot3D17.getLabelDistributor();
        org.jfree.chart.plot.PiePlot3D piePlot3D46 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D46.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke50 = piePlot3D46.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator51 = piePlot3D46.getLegendLabelGenerator();
        piePlot3D17.setLegendLabelToolTipGenerator(pieSectionLabelGenerator51);
        piePlot3D8.setLegendLabelToolTipGenerator(pieSectionLabelGenerator51);
        piePlot3D0.setLabelGenerator(pieSectionLabelGenerator51);
        org.jfree.chart.plot.PiePlot3D piePlot3D55 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D55.setSectionOutlinesVisible(true);
        piePlot3D55.setStartAngle((double) (byte) -1);
        java.lang.Object obj60 = piePlot3D55.clone();
        java.awt.Shape shape61 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        piePlot3D55.setLegendItemShape(shape61);
        java.awt.Paint paint63 = piePlot3D55.getOutlinePaint();
        piePlot3D0.setLabelOutlinePaint(paint63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D55 and obj60", piePlot3D55.equals(obj60) ? piePlot3D55.hashCode() == obj60.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
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
        org.jfree.chart.event.PlotChangeListener plotChangeListener39 = null;
        piePlot3D24.addChangeListener(plotChangeListener39);
        piePlot3D24.setCircular(false);
        piePlot3D24.setPieIndex(100);
        org.jfree.chart.plot.PiePlot3D piePlot3D45 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D45.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets48 = piePlot3D45.getLabelPadding();
        piePlot3D45.setShadowXOffset(10.0d);
        piePlot3D45.setCircular(false);
        piePlot3D45.setLabelGap((double) (short) 1);
        java.awt.Paint paint55 = piePlot3D45.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke56 = piePlot3D45.getLabelLinkStroke();
        java.awt.Paint paint57 = piePlot3D45.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D58 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets59 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D58.setLabelPadding(rectangleInsets59);
        java.awt.Paint paint61 = piePlot3D58.getLabelLinkPaint();
        boolean boolean62 = piePlot3D58.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets63 = piePlot3D58.getInsets();
        java.awt.Paint paint64 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D58.setShadowPaint(paint64);
        piePlot3D45.setLabelPaint(paint64);
        float float67 = piePlot3D45.getBackgroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets68 = piePlot3D45.getLabelPadding();
        piePlot3D24.setSimpleLabelOffset(rectangleInsets68);
        piePlot3D0.setParent((org.jfree.chart.plot.Plot) piePlot3D24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D13 and piePlot3D58", piePlot3D13.equals(piePlot3D58) ? piePlot3D13.hashCode() == piePlot3D58.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot3D0.getLabelPadding();
        java.awt.Font font4 = piePlot3D0.getNoDataMessageFont();
        java.awt.Paint paint5 = piePlot3D0.getShadowPaint();
        double double6 = piePlot3D0.getStartAngle();
        piePlot3D0.setLabelLinksVisible(false);
        float float9 = piePlot3D0.getForegroundAlpha();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = piePlot3D0.getMaximumExplodePercent();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
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
        org.jfree.data.general.PieDataset pieDataset12 = piePlot3D9.getDataset();
        java.lang.String str13 = piePlot3D9.getPlotType();
        org.jfree.chart.plot.Plot plot14 = piePlot3D9.getParent();
        java.awt.Stroke stroke15 = piePlot3D9.getLabelLinkStroke();
        piePlot3D0.setLabelLinkStroke(stroke15);
        org.jfree.data.general.PieDataset pieDataset17 = piePlot3D0.getDataset();
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D18.setSectionOutlinesVisible(true);
        piePlot3D18.setStartAngle((double) (byte) -1);
        boolean boolean23 = piePlot3D18.isCircular();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator24 = piePlot3D18.getLegendLabelGenerator();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        piePlot3D18.handleClick(1, (int) '4', plotRenderingInfo27);
        org.jfree.chart.plot.PiePlot3D piePlot3D29 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D29.setLabelPadding(rectangleInsets30);
        org.jfree.chart.plot.PiePlot3D piePlot3D33 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean34 = piePlot3D33.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator35 = null;
        piePlot3D33.setToolTipGenerator(pieToolTipGenerator35);
        java.awt.Paint paint37 = piePlot3D33.getShadowPaint();
        piePlot3D29.setSectionPaint((java.lang.Comparable) (short) -1, paint37);
        org.jfree.chart.plot.PiePlot3D piePlot3D39 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D39.setLabelPadding(rectangleInsets40);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo44 = null;
        piePlot3D39.handleClick((int) (short) 100, 0, plotRenderingInfo44);
        boolean boolean46 = piePlot3D39.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D47 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets48 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D47.setLabelPadding(rectangleInsets48);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo52 = null;
        piePlot3D47.handleClick((int) (short) 100, 0, plotRenderingInfo52);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator54 = piePlot3D47.getURLGenerator();
        java.awt.Stroke stroke56 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D47.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke56);
        piePlot3D39.setLabelOutlineStroke(stroke56);
        piePlot3D29.setLabelLinkStroke(stroke56);
        java.awt.Stroke stroke60 = piePlot3D29.getBaseSectionOutlineStroke();
        piePlot3D18.setLabelOutlineStroke(stroke60);
        piePlot3D0.setBaseSectionOutlineStroke(stroke60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D9 and piePlot3D39", piePlot3D9.equals(piePlot3D39) ? piePlot3D9.hashCode() == piePlot3D39.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.data.general.PieDataset pieDataset3 = piePlot3D0.getDataset();
        piePlot3D0.setDarkerSides(true);
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D6.setLabelPadding(rectangleInsets7);
        java.awt.Paint paint9 = piePlot3D6.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator10 = null;
        piePlot3D6.setLegendLabelToolTipGenerator(pieSectionLabelGenerator10);
        piePlot3D6.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot14 = piePlot3D6.getRootPlot();
        java.awt.Stroke stroke15 = piePlot3D6.getOutlineStroke();
        double double16 = piePlot3D6.getMaximumLabelWidth();
        int int17 = piePlot3D6.getPieIndex();
        double double18 = piePlot3D6.getStartAngle();
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
        org.jfree.data.general.DatasetGroup datasetGroup34 = piePlot3D19.getDatasetGroup();
        piePlot3D19.setCircular(true);
        java.awt.Stroke stroke37 = piePlot3D19.getLabelOutlineStroke();
        piePlot3D6.setOutlineStroke(stroke37);
        piePlot3D0.setBaseSectionOutlineStroke(stroke37);
        org.jfree.chart.plot.PiePlot3D piePlot3D41 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D41.setSectionOutlinesVisible(true);
        piePlot3D41.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D46 = null;
        java.awt.geom.Rectangle2D rectangle2D47 = null;
        piePlot3D41.drawBackgroundImage(graphics2D46, rectangle2D47);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent49 = null;
        piePlot3D41.axisChanged(axisChangeEvent49);
        org.jfree.chart.plot.PiePlot3D piePlot3D51 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets52 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D51.setLabelPadding(rectangleInsets52);
        java.awt.Paint paint54 = piePlot3D51.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator55 = null;
        piePlot3D51.setLegendLabelToolTipGenerator(pieSectionLabelGenerator55);
        piePlot3D51.setLabelLinkMargin(0.0d);
        piePlot3D51.setPieIndex((int) ' ');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor61 = piePlot3D51.getLabelDistributor();
        java.awt.Paint paint62 = piePlot3D51.getLabelShadowPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator63 = piePlot3D51.getLabelGenerator();
        org.jfree.chart.plot.PiePlot3D piePlot3D65 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets66 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D65.setLabelPadding(rectangleInsets66);
        java.awt.Paint paint68 = piePlot3D65.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator69 = null;
        piePlot3D65.setLegendLabelToolTipGenerator(pieSectionLabelGenerator69);
        piePlot3D65.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot73 = piePlot3D65.getRootPlot();
        java.awt.Stroke stroke74 = piePlot3D65.getOutlineStroke();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator75 = piePlot3D65.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.Plot plot76 = piePlot3D65.getParent();
        java.awt.Paint paint77 = piePlot3D65.getLabelOutlinePaint();
        piePlot3D51.setSectionPaint((java.lang.Comparable) "", paint77);
        java.awt.Paint paint79 = piePlot3D51.getBackgroundPaint();
        piePlot3D41.setBackgroundPaint(paint79);
        piePlot3D0.setSectionOutlinePaint((java.lang.Comparable) "hi!", paint79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D6 and piePlot3D65", piePlot3D6.equals(piePlot3D65) ? piePlot3D6.hashCode() == piePlot3D65.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
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
        java.awt.Paint paint12 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D13.setLabelPadding(rectangleInsets14);
        java.awt.Paint paint16 = piePlot3D13.getLabelLinkPaint();
        double double17 = piePlot3D13.getShadowYOffset();
        boolean boolean18 = piePlot3D13.getSimpleLabels();
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D19.setLabelPadding(rectangleInsets20);
        float float22 = piePlot3D19.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        piePlot3D19.drawBackgroundImage(graphics2D23, rectangle2D24);
        float float26 = piePlot3D19.getBackgroundImageAlpha();
        org.jfree.chart.util.Rotation rotation27 = piePlot3D19.getDirection();
        piePlot3D13.setDirection(rotation27);
        piePlot3D0.setDirection(rotation27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D13 and piePlot3D19", piePlot3D13.equals(piePlot3D19) ? piePlot3D13.hashCode() == piePlot3D19.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D31 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D31.setSectionOutlinesVisible(true);
        piePlot3D31.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D36 = null;
        java.awt.geom.Rectangle2D rectangle2D37 = null;
        piePlot3D31.drawBackgroundImage(graphics2D36, rectangle2D37);
        java.awt.Paint paint39 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D31.setNoDataMessagePaint(paint39);
        java.awt.Paint paint41 = piePlot3D31.getLabelOutlinePaint();
        java.awt.Graphics2D graphics2D42 = null;
        java.awt.geom.Rectangle2D rectangle2D43 = null;
        piePlot3D31.drawBackgroundImage(graphics2D42, rectangle2D43);
        org.jfree.chart.plot.PiePlot3D piePlot3D45 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets46 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D45.setLabelPadding(rectangleInsets46);
        java.awt.Paint paint48 = piePlot3D45.getLabelLinkPaint();
        boolean boolean49 = piePlot3D45.getLabelLinksVisible();
        piePlot3D45.setOutlineVisible(false);
        java.awt.Paint paint53 = piePlot3D45.getSectionOutlinePaint((java.lang.Comparable) 1L);
        org.jfree.data.general.PieDataset pieDataset54 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D55 = new org.jfree.chart.plot.PiePlot3D(pieDataset54);
        java.awt.Paint paint56 = piePlot3D55.getBaseSectionPaint();
        piePlot3D45.setLabelShadowPaint(paint56);
        piePlot3D31.setNoDataMessagePaint(paint56);
        piePlot3D0.setOutlinePaint(paint56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D21 and piePlot3D55", piePlot3D21.equals(piePlot3D55) ? piePlot3D21.hashCode() == piePlot3D55.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = null;
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator4);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D0.getLegendLabelToolTipGenerator();
        piePlot3D0.setMinimumArcAngleToDraw((double) (short) 10);
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setLabelPadding(rectangleInsets11);
        java.awt.Paint paint13 = piePlot3D10.getLabelLinkPaint();
        boolean boolean14 = piePlot3D10.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        piePlot3D10.notifyListeners(plotChangeEvent15);
        double double17 = piePlot3D10.getDepthFactor();
        java.awt.Paint paint18 = piePlot3D10.getLabelLinkPaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent19 = null;
        piePlot3D10.axisChanged(axisChangeEvent19);
        java.awt.Paint paint21 = piePlot3D10.getLabelBackgroundPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D22.setLabelPadding(rectangleInsets23);
        java.awt.Paint paint25 = piePlot3D22.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator26 = null;
        piePlot3D22.setLegendLabelToolTipGenerator(pieSectionLabelGenerator26);
        piePlot3D22.setLabelLinkMargin(0.0d);
        piePlot3D22.setPieIndex((int) ' ');
        java.awt.Paint paint32 = piePlot3D22.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D33 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D33.setLabelPadding(rectangleInsets34);
        java.awt.Paint paint36 = piePlot3D33.getLabelLinkPaint();
        java.awt.Paint paint37 = piePlot3D33.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D38 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D38.setLabelPadding(rectangleInsets39);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo43 = null;
        piePlot3D38.handleClick((int) (short) 100, 0, plotRenderingInfo43);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator45 = piePlot3D38.getURLGenerator();
        java.awt.Paint paint46 = piePlot3D38.getLabelOutlinePaint();
        piePlot3D33.setLabelShadowPaint(paint46);
        piePlot3D22.setLabelShadowPaint(paint46);
        piePlot3D10.setLabelShadowPaint(paint46);
        piePlot3D0.setSectionOutlinePaint((java.lang.Comparable) (-1), paint46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D10 and piePlot3D33", piePlot3D10.equals(piePlot3D33) ? piePlot3D10.hashCode() == piePlot3D33.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D35.setLabelPadding(rectangleInsets36);
        org.jfree.chart.plot.PiePlot3D piePlot3D39 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean40 = piePlot3D39.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator41 = null;
        piePlot3D39.setToolTipGenerator(pieToolTipGenerator41);
        java.awt.Paint paint43 = piePlot3D39.getShadowPaint();
        piePlot3D35.setSectionPaint((java.lang.Comparable) (short) -1, paint43);
        org.jfree.data.general.PieDataset pieDataset45 = piePlot3D35.getDataset();
        piePlot3D35.setExplodePercent((java.lang.Comparable) 0.0d, 100.0d);
        java.lang.Object obj49 = piePlot3D35.clone();
        org.jfree.chart.plot.PiePlot3D piePlot3D50 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets51 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D50.setLabelPadding(rectangleInsets51);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo55 = null;
        piePlot3D50.handleClick((int) (short) 100, 0, plotRenderingInfo55);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator57 = piePlot3D50.getURLGenerator();
        java.awt.Stroke stroke59 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D50.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke59);
        java.awt.Shape shape61 = piePlot3D50.getLegendItemShape();
        piePlot3D50.setOutlineVisible(false);
        java.awt.Stroke stroke64 = piePlot3D50.getBaseSectionOutlineStroke();
        piePlot3D35.setOutlineStroke(stroke64);
        piePlot3D35.setLabelLinksVisible(true);
        org.jfree.chart.plot.PiePlot3D piePlot3D68 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets69 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D68.setLabelPadding(rectangleInsets69);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo73 = null;
        piePlot3D68.handleClick((int) (short) 100, 0, plotRenderingInfo73);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator75 = piePlot3D68.getURLGenerator();
        java.awt.Paint paint76 = piePlot3D68.getLabelOutlinePaint();
        double double77 = piePlot3D68.getLabelLinkMargin();
        org.jfree.chart.plot.PiePlot3D piePlot3D78 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets79 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D78.setLabelPadding(rectangleInsets79);
        float float81 = piePlot3D78.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D82 = null;
        java.awt.geom.Rectangle2D rectangle2D83 = null;
        piePlot3D78.drawBackgroundImage(graphics2D82, rectangle2D83);
        java.awt.Stroke stroke86 = piePlot3D78.getSectionOutlineStroke((java.lang.Comparable) 0.5f);
        java.awt.Paint paint87 = piePlot3D78.getBaseSectionPaint();
        piePlot3D68.setBackgroundPaint(paint87);
        piePlot3D35.setLabelShadowPaint(paint87);
        piePlot3D0.setLabelOutlinePaint(paint87);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D24 and piePlot3D78", piePlot3D24.equals(piePlot3D78) ? piePlot3D24.hashCode() == piePlot3D78.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
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
        boolean boolean28 = piePlot3D0.isSubplot();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        piePlot3D0.markerChanged(markerChangeEvent29);
        org.jfree.chart.plot.PiePlot3D piePlot3D31 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D31.setLabelPadding(rectangleInsets32);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo36 = null;
        piePlot3D31.handleClick((int) (short) 100, 0, plotRenderingInfo36);
        float float38 = piePlot3D31.getForegroundAlpha();
        java.awt.Paint paint39 = piePlot3D31.getBaseSectionOutlinePaint();
        java.awt.Paint paint40 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot3D31.setOutlinePaint(paint40);
        java.awt.Paint paint42 = piePlot3D31.getOutlinePaint();
        piePlot3D0.setLabelBackgroundPaint(paint42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D22 and piePlot3D31", piePlot3D22.equals(piePlot3D31) ? piePlot3D22.hashCode() == piePlot3D31.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        piePlot3D0.drawBackgroundImage(graphics2D5, rectangle2D6);
        java.awt.Paint paint8 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D0.setNoDataMessagePaint(paint8);
        java.awt.Paint paint10 = piePlot3D0.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean13 = piePlot3D12.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator14 = null;
        piePlot3D12.setToolTipGenerator(pieToolTipGenerator14);
        java.awt.Paint paint16 = piePlot3D12.getShadowPaint();
        piePlot3D12.setCircular(false, false);
        java.awt.Paint paint20 = piePlot3D12.getLabelOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D(pieDataset21);
        java.awt.Paint paint23 = piePlot3D22.getBaseSectionPaint();
        java.awt.Stroke stroke24 = piePlot3D22.getOutlineStroke();
        piePlot3D12.setLabelOutlineStroke(stroke24);
        piePlot3D0.setSectionOutlineStroke((java.lang.Comparable) 10.0d, stroke24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D12 and piePlot3D22", piePlot3D12.equals(piePlot3D22) ? piePlot3D12.hashCode() == piePlot3D22.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D20.setLabelPadding(rectangleInsets21);
        java.awt.Paint paint23 = piePlot3D20.getLabelLinkPaint();
        java.awt.Paint paint24 = piePlot3D20.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D25.setLabelPadding(rectangleInsets26);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        piePlot3D25.handleClick((int) (short) 100, 0, plotRenderingInfo30);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator32 = piePlot3D25.getURLGenerator();
        java.awt.Paint paint33 = piePlot3D25.getLabelOutlinePaint();
        piePlot3D20.setLabelShadowPaint(paint33);
        org.jfree.data.general.DatasetGroup datasetGroup35 = piePlot3D20.getDatasetGroup();
        java.awt.Stroke stroke36 = piePlot3D20.getBaseSectionOutlineStroke();
        org.jfree.chart.plot.PiePlot3D piePlot3D37 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D37.setLabelPadding(rectangleInsets38);
        java.awt.Paint paint40 = piePlot3D37.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener41 = null;
        piePlot3D37.addChangeListener(plotChangeListener41);
        piePlot3D37.setBackgroundImageAlignment((int) (short) 10);
        piePlot3D37.setLabelLinksVisible(true);
        java.awt.Font font47 = piePlot3D37.getNoDataMessageFont();
        org.jfree.chart.plot.Plot plot48 = piePlot3D37.getParent();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator49 = piePlot3D37.getLegendLabelGenerator();
        piePlot3D20.setLabelGenerator(pieSectionLabelGenerator49);
        org.jfree.chart.util.RectangleInsets rectangleInsets51 = piePlot3D20.getSimpleLabelOffset();
        piePlot3D0.setInsets(rectangleInsets51, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D11 and piePlot3D25", piePlot3D11.equals(piePlot3D25) ? piePlot3D11.hashCode() == piePlot3D25.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D35 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D35.setSectionOutlinesVisible(true);
        piePlot3D35.setStartAngle((double) (byte) -1);
        java.lang.Object obj40 = piePlot3D35.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = piePlot3D35.getSimpleLabelOffset();
        piePlot3D0.setLabelPadding(rectangleInsets41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D35 and obj40", piePlot3D35.equals(obj40) ? piePlot3D35.hashCode() == obj40.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D59 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D59.setSectionOutlinesVisible(true);
        piePlot3D59.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D64 = null;
        java.awt.geom.Rectangle2D rectangle2D65 = null;
        piePlot3D59.drawBackgroundImage(graphics2D64, rectangle2D65);
        java.awt.Paint paint67 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D59.setNoDataMessagePaint(paint67);
        java.awt.Stroke stroke69 = piePlot3D59.getLabelOutlineStroke();
        org.jfree.chart.plot.PiePlot3D piePlot3D70 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets71 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D70.setLabelPadding(rectangleInsets71);
        java.awt.Paint paint73 = piePlot3D70.getLabelLinkPaint();
        boolean boolean74 = piePlot3D70.getLabelLinksVisible();
        double double75 = piePlot3D70.getDepthFactor();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator76 = piePlot3D70.getLabelGenerator();
        piePlot3D59.setLabelGenerator(pieSectionLabelGenerator76);
        org.jfree.chart.plot.PiePlot3D piePlot3D78 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D78.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets81 = piePlot3D78.getLabelPadding();
        java.awt.Font font82 = piePlot3D78.getNoDataMessageFont();
        piePlot3D59.setNoDataMessageFont(font82);
        java.awt.Font font84 = piePlot3D59.getLabelFont();
        piePlot3D0.setNoDataMessageFont(font84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D47 and piePlot3D78", piePlot3D47.equals(piePlot3D78) ? piePlot3D47.hashCode() == piePlot3D78.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator23 = null;
        piePlot3D0.setLegendLabelURLGenerator(pieURLGenerator23);
        piePlot3D0.zoom((double) 100);
        piePlot3D0.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.PiePlot3D piePlot3D29 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D29.setLabelPadding(rectangleInsets30);
        java.awt.Paint paint32 = piePlot3D29.getLabelLinkPaint();
        boolean boolean33 = piePlot3D29.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = piePlot3D29.getInsets();
        org.jfree.chart.plot.Plot plot35 = piePlot3D29.getRootPlot();
        piePlot3D29.setExplodePercent((java.lang.Comparable) 4.0d, 10.0d);
        boolean boolean39 = piePlot3D29.getLabelLinksVisible();
        double double40 = piePlot3D29.getMaximumLabelWidth();
        org.jfree.chart.plot.PiePlot3D piePlot3D41 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D41.setSectionOutlinesVisible(true);
        piePlot3D41.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D46 = null;
        java.awt.geom.Rectangle2D rectangle2D47 = null;
        piePlot3D41.drawBackgroundImage(graphics2D46, rectangle2D47);
        java.awt.Paint paint49 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D41.setNoDataMessagePaint(paint49);
        java.awt.Paint paint51 = piePlot3D41.getLabelOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset52 = piePlot3D41.getDataset();
        org.jfree.chart.plot.PiePlot3D piePlot3D53 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets54 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D53.setLabelPadding(rectangleInsets54);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo58 = null;
        piePlot3D53.handleClick((int) (short) 100, 0, plotRenderingInfo58);
        boolean boolean60 = piePlot3D53.getSectionOutlinesVisible();
        java.awt.Paint paint61 = piePlot3D53.getBaseSectionPaint();
        piePlot3D41.setBackgroundPaint(paint61);
        piePlot3D29.setLabelBackgroundPaint(paint61);
        java.awt.Paint paint64 = piePlot3D29.getOutlinePaint();
        piePlot3D0.setLabelLinkPaint(paint64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D5 and piePlot3D53", piePlot3D5.equals(piePlot3D53) ? piePlot3D5.hashCode() == piePlot3D53.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D25.setLabelPadding(rectangleInsets26);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        piePlot3D25.handleClick((int) (short) 100, 0, plotRenderingInfo30);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator32 = piePlot3D25.getURLGenerator();
        java.awt.Stroke stroke34 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D25.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke34);
        org.jfree.chart.plot.PiePlot3D piePlot3D36 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D36.setLabelPadding(rectangleInsets37);
        java.awt.Paint paint39 = piePlot3D36.getLabelLinkPaint();
        boolean boolean40 = piePlot3D36.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent41 = null;
        piePlot3D36.notifyListeners(plotChangeEvent41);
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = piePlot3D36.getSimpleLabelOffset();
        piePlot3D25.setSimpleLabelOffset(rectangleInsets43);
        java.awt.Font font45 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D25.setNoDataMessageFont(font45);
        org.jfree.data.general.PieDataset pieDataset47 = piePlot3D25.getDataset();
        boolean boolean48 = piePlot3D25.getSimpleLabels();
        java.awt.Paint paint49 = piePlot3D25.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D50 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D50.setSectionOutlinesVisible(true);
        piePlot3D50.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D55 = null;
        java.awt.geom.Rectangle2D rectangle2D56 = null;
        piePlot3D50.drawBackgroundImage(graphics2D55, rectangle2D56);
        java.awt.Paint paint58 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D50.setNoDataMessagePaint(paint58);
        java.awt.Paint paint60 = piePlot3D50.getLabelOutlinePaint();
        java.awt.Graphics2D graphics2D61 = null;
        java.awt.geom.Rectangle2D rectangle2D62 = null;
        piePlot3D50.drawBackgroundImage(graphics2D61, rectangle2D62);
        java.awt.Paint paint65 = piePlot3D50.getSectionPaint((java.lang.Comparable) 0.0d);
        java.awt.Paint paint67 = piePlot3D50.getSectionOutlinePaint((java.lang.Comparable) (short) 1);
        double double68 = piePlot3D50.getLabelGap();
        org.jfree.chart.plot.PiePlot3D piePlot3D69 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets70 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D69.setLabelPadding(rectangleInsets70);
        java.awt.Paint paint72 = piePlot3D69.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator73 = null;
        piePlot3D69.setLegendLabelToolTipGenerator(pieSectionLabelGenerator73);
        piePlot3D69.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot77 = piePlot3D69.getRootPlot();
        java.awt.Stroke stroke78 = piePlot3D69.getOutlineStroke();
        double double79 = piePlot3D69.getMaximumLabelWidth();
        int int80 = piePlot3D69.getPieIndex();
        java.awt.Paint paint81 = piePlot3D69.getNoDataMessagePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D82 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D82.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke86 = piePlot3D82.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator87 = piePlot3D82.getLegendLabelGenerator();
        piePlot3D69.setLabelGenerator(pieSectionLabelGenerator87);
        piePlot3D50.setLegendLabelToolTipGenerator(pieSectionLabelGenerator87);
        piePlot3D25.setLegendLabelGenerator(pieSectionLabelGenerator87);
        piePlot3D0.setLegendLabelGenerator(pieSectionLabelGenerator87);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D11 and piePlot3D82", piePlot3D11.equals(piePlot3D82) ? piePlot3D11.hashCode() == piePlot3D82.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
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
        boolean boolean22 = piePlot3D0.getDarkerSides();
        piePlot3D0.setLabelLinksVisible(true);
        boolean boolean25 = piePlot3D0.getDarkerSides();
        double double26 = piePlot3D0.getMaximumLabelWidth();
        org.jfree.chart.plot.PiePlot3D piePlot3D27 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D27.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = piePlot3D27.getLabelPadding();
        java.awt.Font font31 = piePlot3D27.getNoDataMessageFont();
        java.awt.Paint paint32 = piePlot3D27.getOutlinePaint();
        java.awt.Font font33 = piePlot3D27.getNoDataMessageFont();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator34 = null;
        piePlot3D27.setURLGenerator(pieURLGenerator34);
        org.jfree.chart.plot.PiePlot3D piePlot3D37 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D37.setLabelPadding(rectangleInsets38);
        java.awt.Paint paint40 = piePlot3D37.getLabelLinkPaint();
        java.awt.Paint paint41 = piePlot3D37.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D42 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D42.setLabelPadding(rectangleInsets43);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo47 = null;
        piePlot3D42.handleClick((int) (short) 100, 0, plotRenderingInfo47);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator49 = piePlot3D42.getURLGenerator();
        java.awt.Paint paint50 = piePlot3D42.getLabelOutlinePaint();
        piePlot3D37.setLabelShadowPaint(paint50);
        org.jfree.data.general.DatasetGroup datasetGroup52 = piePlot3D37.getDatasetGroup();
        piePlot3D37.setCircular(true);
        java.awt.Stroke stroke55 = piePlot3D37.getLabelOutlineStroke();
        piePlot3D27.setSectionOutlineStroke((java.lang.Comparable) 10.0f, stroke55);
        piePlot3D0.setLabelOutlineStroke(stroke55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D5 and piePlot3D42", piePlot3D5.equals(piePlot3D42) ? piePlot3D5.hashCode() == piePlot3D42.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        org.jfree.chart.plot.PiePlot3D piePlot3D4 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean5 = piePlot3D4.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator6 = null;
        piePlot3D4.setToolTipGenerator(pieToolTipGenerator6);
        java.awt.Paint paint8 = piePlot3D4.getShadowPaint();
        piePlot3D0.setSectionPaint((java.lang.Comparable) (short) -1, paint8);
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setLabelPadding(rectangleInsets11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        piePlot3D10.handleClick((int) (short) 100, 0, plotRenderingInfo15);
        boolean boolean17 = piePlot3D10.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D18.setLabelPadding(rectangleInsets19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        piePlot3D18.handleClick((int) (short) 100, 0, plotRenderingInfo23);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator25 = piePlot3D18.getURLGenerator();
        java.awt.Stroke stroke27 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D18.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke27);
        piePlot3D10.setLabelOutlineStroke(stroke27);
        piePlot3D0.setLabelLinkStroke(stroke27);
        org.jfree.chart.plot.PiePlot3D piePlot3D31 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D31.setLabelPadding(rectangleInsets32);
        java.awt.Paint paint34 = piePlot3D31.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator35 = null;
        piePlot3D31.setLegendLabelToolTipGenerator(pieSectionLabelGenerator35);
        piePlot3D31.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot39 = piePlot3D31.getRootPlot();
        org.jfree.chart.plot.PiePlot3D piePlot3D40 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D40.setLabelPadding(rectangleInsets41);
        java.awt.Paint paint43 = piePlot3D40.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener44 = null;
        piePlot3D40.addChangeListener(plotChangeListener44);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator46 = piePlot3D40.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot3D piePlot3D47 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets48 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D47.setLabelPadding(rectangleInsets48);
        java.awt.Paint paint50 = piePlot3D47.getLabelLinkPaint();
        boolean boolean51 = piePlot3D47.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent52 = null;
        piePlot3D47.notifyListeners(plotChangeEvent52);
        org.jfree.chart.util.RectangleInsets rectangleInsets54 = piePlot3D47.getSimpleLabelOffset();
        piePlot3D40.setLabelPadding(rectangleInsets54);
        piePlot3D31.setInsets(rectangleInsets54);
        piePlot3D0.setInsets(rectangleInsets54, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D10 and piePlot3D47", piePlot3D10.equals(piePlot3D47) ? piePlot3D10.hashCode() == piePlot3D47.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
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
        piePlot3D12.setSectionOutlinesVisible(true);
        piePlot3D12.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        piePlot3D12.drawBackgroundImage(graphics2D17, rectangle2D18);
        piePlot3D12.zoom((double) '#');
        java.awt.Font font22 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D12.setLabelFont(font22);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator24 = piePlot3D12.getToolTipGenerator();
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D25.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = piePlot3D25.getLabelPadding();
        piePlot3D25.setShadowXOffset(10.0d);
        piePlot3D25.setCircular(false);
        piePlot3D25.setLabelGap((double) (short) 1);
        java.awt.Paint paint35 = piePlot3D25.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke36 = piePlot3D25.getLabelLinkStroke();
        java.awt.Paint paint37 = piePlot3D25.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D38 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D38.setLabelPadding(rectangleInsets39);
        java.awt.Paint paint41 = piePlot3D38.getLabelLinkPaint();
        boolean boolean42 = piePlot3D38.getLabelLinksVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = piePlot3D38.getInsets();
        java.awt.Paint paint44 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D38.setShadowPaint(paint44);
        piePlot3D25.setLabelPaint(paint44);
        org.jfree.chart.plot.PiePlot3D piePlot3D47 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets48 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D47.setLabelPadding(rectangleInsets48);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo52 = null;
        piePlot3D47.handleClick((int) (short) 100, 0, plotRenderingInfo52);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator54 = piePlot3D47.getURLGenerator();
        java.awt.Stroke stroke56 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D47.setSectionOutlineStroke((java.lang.Comparable) 0.5f, stroke56);
        piePlot3D25.setOutlineStroke(stroke56);
        piePlot3D12.setLabelOutlineStroke(stroke56);
        org.jfree.chart.plot.PiePlot3D piePlot3D60 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets61 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D60.setLabelPadding(rectangleInsets61);
        float float63 = piePlot3D60.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D64 = null;
        java.awt.geom.Rectangle2D rectangle2D65 = null;
        piePlot3D60.drawBackgroundImage(graphics2D64, rectangle2D65);
        java.awt.Font font67 = piePlot3D60.getLabelFont();
        piePlot3D60.setShadowYOffset((double) 10.0f);
        org.jfree.chart.plot.PiePlot3D piePlot3D70 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets71 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D70.setLabelPadding(rectangleInsets71);
        float float73 = piePlot3D70.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D74 = null;
        java.awt.geom.Rectangle2D rectangle2D75 = null;
        piePlot3D70.drawBackgroundImage(graphics2D74, rectangle2D75);
        float float77 = piePlot3D70.getBackgroundImageAlpha();
        org.jfree.chart.util.Rotation rotation78 = piePlot3D70.getDirection();
        piePlot3D60.setDirection(rotation78);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor80 = piePlot3D60.getLabelDistributor();
        piePlot3D12.setLabelDistributor(abstractPieLabelDistributor80);
        piePlot3D0.setLabelDistributor(abstractPieLabelDistributor80);
        org.jfree.chart.plot.PiePlot3D piePlot3D83 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets84 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D83.setLabelPadding(rectangleInsets84);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo88 = null;
        piePlot3D83.handleClick((int) (short) 100, 0, plotRenderingInfo88);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator90 = piePlot3D83.getURLGenerator();
        java.awt.Paint paint91 = piePlot3D83.getLabelOutlinePaint();
        piePlot3D0.setLabelOutlinePaint(paint91);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D70 and piePlot3D83", piePlot3D70.equals(piePlot3D83) ? piePlot3D70.hashCode() == piePlot3D83.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
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
        double double17 = piePlot3D0.getShadowXOffset();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator15 and pieSectionLabelGenerator16", pieSectionLabelGenerator15.equals(pieSectionLabelGenerator16) ? pieSectionLabelGenerator15.hashCode() == pieSectionLabelGenerator16.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D22.setLabelPadding(rectangleInsets23);
        java.awt.Paint paint25 = piePlot3D22.getLabelLinkPaint();
        boolean boolean26 = piePlot3D22.getLabelLinksVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D27 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D27.setLabelPadding(rectangleInsets28);
        piePlot3D22.setSimpleLabelOffset(rectangleInsets28);
        org.jfree.chart.plot.PiePlot3D piePlot3D31 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D31.setSectionOutlinesVisible(true);
        piePlot3D31.setStartAngle((double) (byte) -1);
        boolean boolean36 = piePlot3D31.isCircular();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator37 = piePlot3D31.getLegendLabelGenerator();
        java.awt.Font font38 = piePlot3D31.getNoDataMessageFont();
        piePlot3D22.setLabelFont(font38);
        piePlot3D0.setLabelFont(font38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D8 and piePlot3D27", piePlot3D8.equals(piePlot3D27) ? piePlot3D8.hashCode() == piePlot3D27.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.lang.Object obj5 = piePlot3D0.clone();
        java.awt.Paint paint6 = piePlot3D0.getLabelOutlinePaint();
        java.lang.Object obj7 = piePlot3D0.clone();
        org.jfree.chart.plot.Plot plot8 = piePlot3D0.getParent();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj7", obj5.equals(obj7) ? obj5.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D15 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D15.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3D15.getLabelPadding();
        java.awt.Font font19 = piePlot3D15.getNoDataMessageFont();
        java.awt.Paint paint20 = piePlot3D15.getShadowPaint();
        double double21 = piePlot3D15.getStartAngle();
        piePlot3D15.setLabelLinksVisible(false);
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
        double double40 = piePlot3D24.getMinimumArcAngleToDraw();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator41 = piePlot3D24.getLabelGenerator();
        piePlot3D15.setLegendLabelToolTipGenerator(pieSectionLabelGenerator41);
        piePlot3D0.setLegendLabelGenerator(pieSectionLabelGenerator41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D8 and piePlot3D29", piePlot3D8.equals(piePlot3D29) ? piePlot3D8.hashCode() == piePlot3D29.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D45 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets46 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D45.setLabelPadding(rectangleInsets46);
        java.awt.Paint paint48 = piePlot3D45.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator49 = null;
        piePlot3D45.setLegendLabelToolTipGenerator(pieSectionLabelGenerator49);
        piePlot3D45.setLabelLinkMargin(0.0d);
        org.jfree.chart.plot.Plot plot53 = piePlot3D45.getRootPlot();
        java.awt.Stroke stroke54 = piePlot3D45.getOutlineStroke();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent55 = null;
        piePlot3D45.axisChanged(axisChangeEvent55);
        org.jfree.chart.plot.PiePlot3D piePlot3D57 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets58 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D57.setLabelPadding(rectangleInsets58);
        org.jfree.chart.plot.PiePlot3D piePlot3D61 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean62 = piePlot3D61.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator63 = null;
        piePlot3D61.setToolTipGenerator(pieToolTipGenerator63);
        java.awt.Paint paint65 = piePlot3D61.getShadowPaint();
        piePlot3D57.setSectionPaint((java.lang.Comparable) (short) -1, paint65);
        piePlot3D45.setLabelOutlinePaint(paint65);
        double double68 = piePlot3D45.getShadowXOffset();
        org.jfree.chart.plot.PiePlot3D piePlot3D69 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets70 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D69.setLabelPadding(rectangleInsets70);
        java.awt.Paint paint72 = piePlot3D69.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator73 = null;
        piePlot3D69.setLegendLabelToolTipGenerator(pieSectionLabelGenerator73);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator75 = piePlot3D69.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier76 = piePlot3D69.getDrawingSupplier();
        piePlot3D45.setDrawingSupplier(drawingSupplier76);
        piePlot3D0.setDrawingSupplier(drawingSupplier76);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D10 and piePlot3D45", piePlot3D10.equals(piePlot3D45) ? piePlot3D10.hashCode() == piePlot3D45.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
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
        double double16 = piePlot3D0.getStartAngle();
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D17.setLabelPadding(rectangleInsets18);
        java.awt.Paint paint20 = piePlot3D17.getLabelLinkPaint();
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        piePlot3D17.addChangeListener(plotChangeListener21);
        java.awt.Paint paint23 = piePlot3D17.getShadowPaint();
        java.awt.Paint paint24 = piePlot3D17.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D25.setSectionOutlinesVisible(true);
        java.awt.Stroke stroke29 = piePlot3D25.getSectionOutlineStroke((java.lang.Comparable) false);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator30 = piePlot3D25.getLegendLabelGenerator();
        piePlot3D17.setLegendLabelToolTipGenerator(pieSectionLabelGenerator30);
        piePlot3D0.setLabelGenerator(pieSectionLabelGenerator30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D13 and piePlot3D25", piePlot3D13.equals(piePlot3D25) ? piePlot3D13.hashCode() == piePlot3D25.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D21.setLabelPadding(rectangleInsets22);
        java.awt.Paint paint24 = piePlot3D21.getLabelLinkPaint();
        boolean boolean25 = piePlot3D21.getLabelLinksVisible();
        double double26 = piePlot3D21.getDepthFactor();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator27 = piePlot3D21.getLabelGenerator();
        piePlot3D0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D8 and piePlot3D21", piePlot3D8.equals(piePlot3D21) ? piePlot3D8.hashCode() == piePlot3D21.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
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
        java.lang.String str27 = piePlot3D0.getPlotType();
        piePlot3D0.setLabelLinkMargin(90.0d);
        java.awt.Paint paint31 = piePlot3D0.getSectionOutlinePaint((java.lang.Comparable) (short) 100);
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
        org.jfree.chart.plot.PiePlot3D piePlot3D52 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets53 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D52.setLabelPadding(rectangleInsets53);
        float float55 = piePlot3D52.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D56 = null;
        java.awt.geom.Rectangle2D rectangle2D57 = null;
        piePlot3D52.drawBackgroundImage(graphics2D56, rectangle2D57);
        float float59 = piePlot3D52.getBackgroundImageAlpha();
        org.jfree.chart.util.Rotation rotation60 = piePlot3D52.getDirection();
        piePlot3D32.setDirection(rotation60);
        piePlot3D0.setDirection(rotation60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D12 and piePlot3D40", piePlot3D12.equals(piePlot3D40) ? piePlot3D12.hashCode() == piePlot3D40.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        boolean boolean4 = piePlot3D0.getLabelLinksVisible();
        double double5 = piePlot3D0.getLabelLinkMargin();
        piePlot3D0.setBackgroundImageAlignment((int) 'a');
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot3D0.getDatasetGroup();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator9 = piePlot3D0.getURLGenerator();
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D10.setSectionOutlinesVisible(true);
        piePlot3D10.setStartAngle((double) (byte) -1);
        boolean boolean15 = piePlot3D10.isCircular();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator16 = piePlot3D10.getLegendLabelGenerator();
        piePlot3D10.setStartAngle((double) (-1.0f));
        boolean boolean19 = piePlot3D10.getIgnoreNullValues();
        java.awt.Stroke stroke20 = piePlot3D10.getBaseSectionOutlineStroke();
        piePlot3D0.setLabelOutlineStroke(stroke20);
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean23 = piePlot3D22.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator24 = null;
        piePlot3D22.setToolTipGenerator(pieToolTipGenerator24);
        boolean boolean26 = piePlot3D22.isOutlineVisible();
        java.lang.String str27 = piePlot3D22.getPlotType();
        org.jfree.chart.plot.PiePlot3D piePlot3D28 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D28.setLabelPadding(rectangleInsets29);
        java.awt.Paint paint31 = piePlot3D28.getLabelLinkPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator32 = null;
        piePlot3D28.setLegendLabelToolTipGenerator(pieSectionLabelGenerator32);
        piePlot3D28.setLabelLinkMargin(0.0d);
        piePlot3D28.setShadowXOffset(1.0d);
        java.awt.Paint paint38 = piePlot3D28.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D39 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D39.setSectionOutlinesVisible(true);
        piePlot3D39.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D44 = null;
        java.awt.geom.Rectangle2D rectangle2D45 = null;
        piePlot3D39.drawBackgroundImage(graphics2D44, rectangle2D45);
        java.awt.Paint paint47 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot3D39.setNoDataMessagePaint(paint47);
        piePlot3D28.setShadowPaint(paint47);
        org.jfree.chart.plot.PiePlot3D piePlot3D50 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets51 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D50.setLabelPadding(rectangleInsets51);
        piePlot3D28.setInsets(rectangleInsets51);
        piePlot3D22.setLabelPadding(rectangleInsets51);
        piePlot3D0.setLabelPadding(rectangleInsets51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D22 and piePlot3D50", piePlot3D22.equals(piePlot3D50) ? piePlot3D22.hashCode() == piePlot3D50.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        boolean boolean1 = piePlot3D0.getSimpleLabels();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot3D0.setToolTipGenerator(pieToolTipGenerator2);
        java.awt.Paint paint4 = piePlot3D0.getShadowPaint();
        piePlot3D0.setCircular(false, false);
        java.awt.Paint paint8 = piePlot3D0.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setLabelPadding(rectangleInsets11);
        org.jfree.data.general.PieDataset pieDataset13 = piePlot3D10.getDataset();
        java.awt.Paint paint15 = piePlot3D10.getSectionOutlinePaint((java.lang.Comparable) (short) 100);
        piePlot3D10.setLabelLinksVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3D10.getInsets();
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D19.setLabelPadding(rectangleInsets20);
        float float22 = piePlot3D19.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        piePlot3D19.drawBackgroundImage(graphics2D23, rectangle2D24);
        java.awt.Paint paint26 = piePlot3D19.getShadowPaint();
        piePlot3D10.setShadowPaint(paint26);
        piePlot3D0.setSectionOutlinePaint((java.lang.Comparable) (byte) 100, paint26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D10 and piePlot3D19", piePlot3D10.equals(piePlot3D19) ? piePlot3D10.hashCode() == piePlot3D19.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        java.awt.Paint paint3 = piePlot3D0.getLabelLinkPaint();
        double double4 = piePlot3D0.getShadowYOffset();
        boolean boolean5 = piePlot3D0.getSimpleLabels();
        org.jfree.chart.plot.PiePlot3D piePlot3D6 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D6.setLabelPadding(rectangleInsets7);
        float float9 = piePlot3D6.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        piePlot3D6.drawBackgroundImage(graphics2D10, rectangle2D11);
        float float13 = piePlot3D6.getBackgroundImageAlpha();
        org.jfree.chart.util.Rotation rotation14 = piePlot3D6.getDirection();
        piePlot3D0.setDirection(rotation14);
        java.awt.Paint paint16 = piePlot3D0.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D17.setLabelPadding(rectangleInsets18);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        piePlot3D17.handleClick((int) (short) 100, 0, plotRenderingInfo22);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator24 = piePlot3D17.getURLGenerator();
        java.awt.Paint paint25 = piePlot3D17.getLabelOutlinePaint();
        piePlot3D0.setLabelShadowPaint(paint25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D6 and piePlot3D17", piePlot3D6.equals(piePlot3D17) ? piePlot3D6.hashCode() == piePlot3D17.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
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
        float float34 = piePlot3D0.getBackgroundAlpha();
        org.jfree.chart.plot.PiePlot3D piePlot3D35 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D35.setLabelPadding(rectangleInsets36);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo40 = null;
        piePlot3D35.handleClick((int) (short) 100, 0, plotRenderingInfo40);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator42 = piePlot3D35.getURLGenerator();
        java.awt.Paint paint43 = piePlot3D35.getLabelOutlinePaint();
        double double44 = piePlot3D35.getLabelLinkMargin();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator45 = piePlot3D35.getURLGenerator();
        java.awt.Paint paint47 = null;
        piePlot3D35.setSectionPaint((java.lang.Comparable) 10L, paint47);
        org.jfree.chart.util.Rotation rotation49 = piePlot3D35.getDirection();
        java.lang.String str50 = piePlot3D35.getNoDataMessage();
        org.jfree.chart.plot.PiePlot3D piePlot3D51 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D51.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets54 = piePlot3D51.getLabelPadding();
        piePlot3D51.setShadowXOffset(10.0d);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent57 = null;
        piePlot3D51.datasetChanged(datasetChangeEvent57);
        org.jfree.chart.plot.PiePlot3D piePlot3D60 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D60.setSectionOutlinesVisible(true);
        piePlot3D60.setStartAngle((double) (byte) -1);
        java.awt.Graphics2D graphics2D65 = null;
        java.awt.geom.Rectangle2D rectangle2D66 = null;
        piePlot3D60.drawBackgroundImage(graphics2D65, rectangle2D66);
        piePlot3D60.zoom((double) '#');
        double double70 = piePlot3D60.getShadowXOffset();
        java.awt.Stroke stroke71 = piePlot3D60.getLabelOutlineStroke();
        piePlot3D51.setSectionOutlineStroke((java.lang.Comparable) 0.14d, stroke71);
        piePlot3D35.setBaseSectionOutlineStroke(stroke71);
        org.jfree.chart.plot.PiePlot3D piePlot3D74 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets75 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D74.setLabelPadding(rectangleInsets75);
        java.awt.Paint paint77 = piePlot3D74.getLabelLinkPaint();
        boolean boolean78 = piePlot3D74.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent79 = null;
        piePlot3D74.notifyListeners(plotChangeEvent79);
        double double81 = piePlot3D74.getDepthFactor();
        java.awt.Paint paint82 = piePlot3D74.getLabelLinkPaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent83 = null;
        piePlot3D74.axisChanged(axisChangeEvent83);
        java.awt.Paint paint85 = piePlot3D74.getLabelBackgroundPaint();
        piePlot3D35.setBaseSectionOutlinePaint(paint85);
        piePlot3D0.setShadowPaint(paint85);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D24 and piePlot3D74", piePlot3D24.equals(piePlot3D74) ? piePlot3D24.hashCode() == piePlot3D74.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets1 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D0.setLabelPadding(rectangleInsets1);
        float float3 = piePlot3D0.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot3D0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Stroke stroke8 = piePlot3D0.getSectionOutlineStroke((java.lang.Comparable) 0.5f);
        java.awt.Paint paint9 = piePlot3D0.getBaseSectionPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        float float11 = piePlot3D10.getBackgroundImageAlpha();
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D12.setLabelPadding(rectangleInsets13);
        java.awt.Paint paint15 = piePlot3D12.getLabelLinkPaint();
        boolean boolean16 = piePlot3D12.getLabelLinksVisible();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent17 = null;
        piePlot3D12.notifyListeners(plotChangeEvent17);
        double double19 = piePlot3D12.getDepthFactor();
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D20.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = piePlot3D20.getLabelPadding();
        java.awt.Font font24 = piePlot3D20.getNoDataMessageFont();
        java.awt.Paint paint25 = piePlot3D20.getOutlinePaint();
        java.awt.Font font26 = piePlot3D20.getNoDataMessageFont();
        piePlot3D12.setLabelFont(font26);
        java.awt.Paint paint28 = piePlot3D12.getBaseSectionPaint();
        piePlot3D10.setShadowPaint(paint28);
        boolean boolean30 = piePlot3D0.equals((java.lang.Object) paint28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D10 and piePlot3D20", piePlot3D10.equals(piePlot3D20) ? piePlot3D10.hashCode() == piePlot3D20.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D29 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D29.setLabelPadding(rectangleInsets30);
        java.awt.Paint paint32 = piePlot3D29.getLabelLinkPaint();
        double double33 = piePlot3D29.getShadowYOffset();
        boolean boolean34 = piePlot3D29.getSimpleLabels();
        org.jfree.chart.plot.PiePlot3D piePlot3D35 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D35.setLabelPadding(rectangleInsets36);
        float float38 = piePlot3D35.getBackgroundImageAlpha();
        java.awt.Graphics2D graphics2D39 = null;
        java.awt.geom.Rectangle2D rectangle2D40 = null;
        piePlot3D35.drawBackgroundImage(graphics2D39, rectangle2D40);
        float float42 = piePlot3D35.getBackgroundImageAlpha();
        org.jfree.chart.util.Rotation rotation43 = piePlot3D35.getDirection();
        piePlot3D29.setDirection(rotation43);
        piePlot3D0.setDirection(rotation43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D12 and piePlot3D29", piePlot3D12.equals(piePlot3D29) ? piePlot3D12.hashCode() == piePlot3D29.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D29 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D29.setLabelPadding(rectangleInsets30);
        java.awt.Paint paint32 = piePlot3D29.getLabelLinkPaint();
        boolean boolean33 = piePlot3D29.getLabelLinksVisible();
        org.jfree.chart.plot.PiePlot3D piePlot3D34 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D34.setLabelPadding(rectangleInsets35);
        piePlot3D29.setSimpleLabelOffset(rectangleInsets35);
        org.jfree.chart.plot.PiePlot3D piePlot3D38 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D38.setSectionOutlinesVisible(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = piePlot3D38.getLabelPadding();
        piePlot3D38.setShadowXOffset(10.0d);
        piePlot3D38.setCircular(false);
        piePlot3D38.setLabelGap((double) (short) 1);
        java.awt.Paint paint48 = piePlot3D38.getBaseSectionOutlinePaint();
        java.awt.Stroke stroke49 = piePlot3D38.getLabelLinkStroke();
        java.awt.Paint paint50 = piePlot3D38.getBaseSectionPaint();
        piePlot3D29.setBaseSectionPaint(paint50);
        piePlot3D0.setNoDataMessagePaint(paint50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D11 and piePlot3D34", piePlot3D11.equals(piePlot3D34) ? piePlot3D11.hashCode() == piePlot3D34.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
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
        org.jfree.chart.plot.PiePlot3D piePlot3D49 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets50 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D49.setLabelPadding(rectangleInsets50);
        java.awt.Paint paint52 = piePlot3D49.getLabelLinkPaint();
        java.awt.Paint paint53 = piePlot3D49.getShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D54 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets55 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D54.setLabelPadding(rectangleInsets55);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo59 = null;
        piePlot3D54.handleClick((int) (short) 100, 0, plotRenderingInfo59);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator61 = piePlot3D54.getURLGenerator();
        java.awt.Paint paint62 = piePlot3D54.getLabelOutlinePaint();
        piePlot3D49.setLabelShadowPaint(paint62);
        org.jfree.data.general.DatasetGroup datasetGroup64 = piePlot3D49.getDatasetGroup();
        double double65 = piePlot3D49.getMinimumArcAngleToDraw();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator66 = piePlot3D49.getLabelGenerator();
        org.jfree.chart.plot.PiePlot3D piePlot3D68 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.chart.util.RectangleInsets rectangleInsets69 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D68.setLabelPadding(rectangleInsets69);
        java.awt.Paint paint71 = piePlot3D68.getLabelLinkPaint();
        boolean boolean72 = piePlot3D68.getLabelLinksVisible();
        piePlot3D68.setOutlineVisible(false);
        java.awt.Paint paint75 = piePlot3D68.getNoDataMessagePaint();
        piePlot3D49.setSectionPaint((java.lang.Comparable) 1.0d, paint75);
        piePlot3D0.setSectionOutlinePaint((java.lang.Comparable) 1.0f, paint75);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3D24 and piePlot3D54", piePlot3D24.equals(piePlot3D54) ? piePlot3D24.hashCode() == piePlot3D54.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        piePlot3D0.setSectionOutlinesVisible(true);
        piePlot3D0.setStartAngle((double) (byte) -1);
        java.lang.Object obj5 = piePlot3D0.clone();
        java.awt.Paint paint6 = piePlot3D0.getLabelOutlinePaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator7 = piePlot3D0.getLabelGenerator();
        java.lang.Object obj8 = piePlot3D0.clone();
        java.awt.Paint paint9 = piePlot3D0.getLabelPaint();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and obj8", obj5.equals(obj8) ? obj5.hashCode() == obj8.hashCode() : true);
    }
}

