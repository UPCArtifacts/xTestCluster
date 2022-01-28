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
        double double13 = piePlot12.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor14 = piePlot12.getLabelDistributor();
        double double15 = piePlot12.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        piePlot12.drawBackgroundImage(graphics2D16, rectangle2D17);
        java.awt.Paint paint20 = piePlot12.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font21 = piePlot12.getLabelFont();
        piePlot12.setSimpleLabels(false);
        java.awt.Paint paint24 = piePlot12.getLabelPaint();
        piePlot0.setBaseSectionPaint(paint24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot5 and piePlot12", piePlot5.equals(piePlot12) ? piePlot5.hashCode() == piePlot12.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
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
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot();
        double double19 = piePlot18.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor20 = piePlot18.getLabelDistributor();
        double double21 = piePlot18.getMinimumArcAngleToDraw();
        java.awt.Paint paint22 = piePlot18.getBaseSectionOutlinePaint();
        piePlot18.setIgnoreNullValues(false);
        java.awt.Stroke stroke25 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot18.setLabelLinkStroke(stroke25);
        piePlot0.setLabelLinkStroke(stroke25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot7 and piePlot18", piePlot7.equals(piePlot18) ? piePlot7.hashCode() == piePlot18.hashCode() : true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
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
        piePlot0.setLabelLinkStroke(stroke22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot12 and piePlot17", piePlot12.equals(piePlot17) ? piePlot12.hashCode() == piePlot17.hashCode() : true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
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
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot();
        double double17 = piePlot16.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor18 = piePlot16.getLabelDistributor();
        double double19 = piePlot16.getMinimumArcAngleToDraw();
        java.awt.Paint paint20 = piePlot16.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = piePlot16.getDrawingSupplier();
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        double double23 = piePlot22.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor24 = piePlot22.getLabelDistributor();
        double double25 = piePlot22.getMinimumArcAngleToDraw();
        boolean boolean26 = piePlot22.getIgnoreZeroValues();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator27 = piePlot22.getLabelGenerator();
        piePlot16.setLegendLabelGenerator(pieSectionLabelGenerator27);
        piePlot0.setLegendLabelGenerator(pieSectionLabelGenerator27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot16 and piePlot22", piePlot16.equals(piePlot22) ? piePlot16.hashCode() == piePlot22.hashCode() : true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
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
        java.awt.Font font12 = piePlot3.getLabelFont();
        piePlot3.setSimpleLabels(false);
        java.awt.Paint paint15 = piePlot3.getLabelPaint();
        java.awt.Paint paint16 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3.setLabelOutlinePaint(paint16);
        piePlot0.setLabelShadowPaint(paint16);
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot();
        double double20 = piePlot19.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor21 = piePlot19.getLabelDistributor();
        double double22 = piePlot19.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        piePlot19.drawBackgroundImage(graphics2D23, rectangle2D24);
        java.awt.Paint paint27 = piePlot19.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str28 = piePlot19.getNoDataMessage();
        java.awt.Paint paint29 = piePlot19.getLabelOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = piePlot19.getLabelPadding();
        piePlot0.setInsets(rectangleInsets30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3 and piePlot19", piePlot3.equals(piePlot19) ? piePlot3.hashCode() == piePlot19.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        double double6 = piePlot0.getMinimumArcAngleToDraw();
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double8 = piePlot7.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup9 = piePlot7.getDatasetGroup();
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot7.setNoDataMessagePaint(paint10);
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset13 = null;
        piePlot12.setDataset(pieDataset13);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator15 = piePlot12.getURLGenerator();
        org.jfree.chart.plot.Plot plot16 = piePlot12.getRootPlot();
        java.awt.Stroke stroke17 = piePlot12.getLabelOutlineStroke();
        piePlot7.setLabelLinkStroke(stroke17);
        piePlot0.setLabelLinkStroke(stroke17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot7 and piePlot12", piePlot7.equals(piePlot12) ? piePlot7.hashCode() == piePlot12.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        org.jfree.chart.plot.PiePlot piePlot3 = new org.jfree.chart.plot.PiePlot();
        double double4 = piePlot3.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup5 = piePlot3.getDatasetGroup();
        java.awt.Paint paint6 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3.setNoDataMessagePaint(paint6);
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        piePlot8.setDataset(pieDataset9);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator11 = piePlot8.getURLGenerator();
        org.jfree.chart.plot.Plot plot12 = piePlot8.getRootPlot();
        java.awt.Stroke stroke13 = piePlot8.getLabelOutlineStroke();
        piePlot3.setLabelLinkStroke(stroke13);
        org.jfree.chart.util.Rotation rotation15 = piePlot3.getDirection();
        piePlot0.setDirection(rotation15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3 and piePlot8", piePlot3.equals(piePlot8) ? piePlot3.hashCode() == piePlot8.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
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
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot();
        double double15 = piePlot14.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor16 = piePlot14.getLabelDistributor();
        double double17 = piePlot14.getMinimumArcAngleToDraw();
        java.awt.Paint paint18 = piePlot14.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = piePlot14.getDrawingSupplier();
        piePlot0.setDrawingSupplier(drawingSupplier19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot5 and piePlot14", piePlot5.equals(piePlot14) ? piePlot5.hashCode() == piePlot14.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
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
        java.lang.Class<?> wildcardClass13 = stroke12.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot0 and piePlot5", piePlot0.equals(piePlot5) ? piePlot0.hashCode() == piePlot5.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
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
        boolean boolean15 = plot14.isSubplot();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot0 and plot14", piePlot0.equals(plot14) ? piePlot0.hashCode() == plot14.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        piePlot0.setBackgroundImageAlignment((int) 'a');
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        double double6 = piePlot5.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor7 = piePlot5.getLabelDistributor();
        double double8 = piePlot5.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        piePlot5.drawBackgroundImage(graphics2D9, rectangle2D10);
        java.awt.Paint paint13 = piePlot5.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str14 = piePlot5.getNoDataMessage();
        java.awt.Paint paint15 = piePlot5.getLabelOutlinePaint();
        piePlot0.setSectionPaint((java.lang.Comparable) 1.0d, paint15);
        double double17 = piePlot0.getLabelGap();
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator19 = piePlot18.getLegendLabelGenerator();
        piePlot0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot5 and piePlot18", piePlot5.equals(piePlot18) ? piePlot5.hashCode() == piePlot18.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
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
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot();
        double double42 = piePlot41.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor43 = piePlot41.getLabelDistributor();
        double double44 = piePlot41.getMinimumArcAngleToDraw();
        java.awt.Paint paint45 = piePlot41.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier46 = piePlot41.getDrawingSupplier();
        org.jfree.chart.plot.PiePlot piePlot47 = new org.jfree.chart.plot.PiePlot();
        double double48 = piePlot47.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor49 = piePlot47.getLabelDistributor();
        double double50 = piePlot47.getMinimumArcAngleToDraw();
        boolean boolean51 = piePlot47.getIgnoreZeroValues();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator52 = piePlot47.getLabelGenerator();
        piePlot41.setLegendLabelGenerator(pieSectionLabelGenerator52);
        piePlot0.setLegendLabelGenerator(pieSectionLabelGenerator52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot7 and piePlot41", piePlot7.equals(piePlot41) ? piePlot7.hashCode() == piePlot41.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
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
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot();
        double double19 = piePlot18.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor20 = piePlot18.getLabelDistributor();
        double double21 = piePlot18.getMinimumArcAngleToDraw();
        java.awt.Paint paint22 = piePlot18.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = piePlot18.getDrawingSupplier();
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot();
        double double25 = piePlot24.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor26 = piePlot24.getLabelDistributor();
        double double27 = piePlot24.getMinimumArcAngleToDraw();
        boolean boolean28 = piePlot24.getIgnoreZeroValues();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator29 = piePlot24.getLabelGenerator();
        piePlot18.setLegendLabelGenerator(pieSectionLabelGenerator29);
        piePlot0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot18 and piePlot24", piePlot18.equals(piePlot24) ? piePlot18.hashCode() == piePlot24.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
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
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot();
        double double17 = piePlot16.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup18 = piePlot16.getDatasetGroup();
        piePlot16.setOutlineVisible(true);
        boolean boolean22 = piePlot16.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot();
        double double24 = piePlot23.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor25 = piePlot23.getLabelDistributor();
        double double26 = piePlot23.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        piePlot23.drawBackgroundImage(graphics2D27, rectangle2D28);
        java.awt.Paint paint31 = piePlot23.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font32 = piePlot23.getLabelFont();
        piePlot16.setNoDataMessageFont(font32);
        boolean boolean34 = piePlot16.isOutlineVisible();
        double double35 = piePlot16.getLabelGap();
        java.awt.Paint paint36 = piePlot16.getLabelLinkPaint();
        piePlot10.setLabelOutlinePaint(paint36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot0 and piePlot23", piePlot0.equals(piePlot23) ? piePlot0.hashCode() == piePlot23.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        org.jfree.data.xy.XYDataset xYDataset5 = null;
        org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createPolarChart("", xYDataset5, false, false, true);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart9);
        java.awt.Shape shape11 = piePlot0.getLegendItemShape();
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
        piePlot0.setLabelLinkStroke(stroke22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot12 and piePlot17", piePlot12.equals(piePlot17) ? piePlot12.hashCode() == piePlot17.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
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
        piePlot7.setLabelLinksVisible(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot0 and piePlot11", piePlot0.equals(piePlot11) ? piePlot0.hashCode() == piePlot11.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
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
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot();
        double double25 = piePlot24.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup26 = piePlot24.getDatasetGroup();
        java.awt.Paint paint27 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot24.setNoDataMessagePaint(paint27);
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset30 = null;
        piePlot29.setDataset(pieDataset30);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator32 = piePlot29.getURLGenerator();
        org.jfree.chart.plot.Plot plot33 = piePlot29.getRootPlot();
        java.awt.Stroke stroke34 = piePlot29.getLabelOutlineStroke();
        piePlot24.setLabelLinkStroke(stroke34);
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset37 = null;
        piePlot36.setDataset(pieDataset37);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator39 = piePlot36.getURLGenerator();
        org.jfree.chart.plot.Plot plot40 = piePlot36.getRootPlot();
        java.awt.Stroke stroke41 = piePlot36.getLabelOutlineStroke();
        java.awt.Shape shape42 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot36.setLegendItemShape(shape42);
        piePlot24.setLegendItemShape(shape42);
        org.jfree.data.xy.XYDataset xYDataset48 = null;
        org.jfree.chart.JFreeChart jFreeChart52 = org.jfree.chart.ChartFactory.createTimeSeriesChart("Pie Plot", "Pie Plot", "hi!", xYDataset48, false, true, true);
        piePlot24.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart52);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot7 and piePlot29", piePlot7.equals(piePlot29) ? piePlot7.hashCode() == piePlot29.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
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
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset13 = null;
        piePlot12.setDataset(pieDataset13);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator15 = piePlot12.getURLGenerator();
        org.jfree.chart.plot.Plot plot16 = piePlot12.getRootPlot();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor17 = piePlot12.getLabelDistributor();
        piePlot0.setLabelDistributor(abstractPieLabelDistributor17);
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot();
        double double20 = piePlot19.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor21 = piePlot19.getLabelDistributor();
        double double22 = piePlot19.getMinimumArcAngleToDraw();
        boolean boolean23 = piePlot19.getIgnoreZeroValues();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator24 = piePlot19.getLabelGenerator();
        piePlot0.setLegendLabelGenerator(pieSectionLabelGenerator24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot12 and piePlot19", piePlot12.equals(piePlot19) ? piePlot12.hashCode() == piePlot19.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        piePlot0.setStartAngle((double) (byte) 10);
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        double double7 = piePlot6.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor8 = piePlot6.getLabelDistributor();
        double double9 = piePlot6.getMinimumArcAngleToDraw();
        java.awt.Paint paint10 = piePlot6.getBaseSectionOutlinePaint();
        java.awt.Paint paint11 = piePlot6.getBaseSectionPaint();
        piePlot0.setLabelPaint(paint11);
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup14 = piePlot13.getDatasetGroup();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator15 = null;
        piePlot13.setToolTipGenerator(pieToolTipGenerator15);
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset20 = null;
        org.jfree.chart.JFreeChart jFreeChart22 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "hi!", "", boxAndWhiskerXYDataset20, false);
        piePlot13.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart22);
        java.awt.Font font24 = piePlot13.getLabelFont();
        piePlot0.setLabelFont(font24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot6 and piePlot13", piePlot6.equals(piePlot13) ? piePlot6.hashCode() == piePlot13.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
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
        java.awt.Font font12 = piePlot3.getLabelFont();
        piePlot3.setSimpleLabels(false);
        java.awt.Paint paint15 = piePlot3.getLabelPaint();
        java.awt.Paint paint16 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3.setLabelOutlinePaint(paint16);
        piePlot0.setLabelShadowPaint(paint16);
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot(pieDataset19);
        piePlot20.zoom(0.4d);
        java.awt.Stroke stroke24 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot20.setSectionOutlineStroke((java.lang.Comparable) false, stroke24);
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot();
        double double28 = piePlot27.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor29 = piePlot27.getLabelDistributor();
        java.awt.Paint paint30 = piePlot27.getLabelOutlinePaint();
        piePlot20.setSectionPaint((java.lang.Comparable) 1.0E-5d, paint30);
        piePlot0.setLabelPaint(paint30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3 and piePlot27", piePlot3.equals(piePlot27) ? piePlot3.hashCode() == piePlot27.hashCode() : true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
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
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot();
        double double19 = piePlot18.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor20 = piePlot18.getLabelDistributor();
        double double21 = piePlot18.getMinimumArcAngleToDraw();
        boolean boolean22 = piePlot18.getIgnoreZeroValues();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator23 = piePlot18.getLabelGenerator();
        piePlot0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot8 and piePlot18", piePlot8.equals(piePlot18) ? piePlot8.hashCode() == piePlot18.hashCode() : true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
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
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        double double23 = piePlot22.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor24 = piePlot22.getLabelDistributor();
        double double25 = piePlot22.getMinimumArcAngleToDraw();
        java.awt.Paint paint26 = piePlot22.getBaseSectionOutlinePaint();
        java.awt.Paint paint27 = piePlot22.getBaseSectionPaint();
        java.awt.Paint paint28 = piePlot22.getShadowPaint();
        boolean boolean29 = piePlot22.getIgnoreZeroValues();
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot();
        double double31 = piePlot30.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor32 = piePlot30.getLabelDistributor();
        java.awt.Paint paint33 = piePlot30.getLabelOutlinePaint();
        piePlot30.setStartAngle((double) (byte) 10);
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot();
        double double37 = piePlot36.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor38 = piePlot36.getLabelDistributor();
        double double39 = piePlot36.getMinimumArcAngleToDraw();
        java.awt.Paint paint40 = piePlot36.getBaseSectionOutlinePaint();
        java.awt.Paint paint41 = piePlot36.getBaseSectionPaint();
        piePlot30.setLabelPaint(paint41);
        piePlot22.setBackgroundPaint(paint41);
        piePlot0.setLabelBackgroundPaint(paint41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot7 and piePlot36", piePlot7.equals(piePlot36) ? piePlot7.hashCode() == piePlot36.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        double double4 = piePlot0.getShadowXOffset();
        java.lang.Object obj5 = piePlot0.clone();
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        piePlot6.setDataset(pieDataset7);
        int int9 = piePlot6.getPieIndex();
        double double10 = piePlot6.getShadowXOffset();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator11 = piePlot6.getLabelGenerator();
        piePlot0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj5 and piePlot6", obj5.equals(piePlot6) ? obj5.hashCode() == piePlot6.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Font font3 = piePlot0.getLabelFont();
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        double double6 = piePlot5.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup7 = piePlot5.getDatasetGroup();
        java.awt.Paint paint8 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot5.setNoDataMessagePaint(paint8);
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        piePlot10.setDataset(pieDataset11);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = piePlot10.getURLGenerator();
        org.jfree.chart.plot.Plot plot14 = piePlot10.getRootPlot();
        java.awt.Stroke stroke15 = piePlot10.getLabelOutlineStroke();
        piePlot5.setLabelLinkStroke(stroke15);
        java.awt.Stroke stroke17 = piePlot5.getOutlineStroke();
        piePlot0.setSectionOutlineStroke((java.lang.Comparable) 10.0d, stroke17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot5 and piePlot10", piePlot5.equals(piePlot10) ? piePlot5.hashCode() == piePlot10.hashCode() : true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
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
        boolean boolean18 = piePlot0.getIgnoreZeroValues();
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator20 = piePlot19.getLegendLabelGenerator();
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot();
        double double22 = piePlot21.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor23 = piePlot21.getLabelDistributor();
        double double24 = piePlot21.getMinimumArcAngleToDraw();
        java.awt.Paint paint25 = piePlot21.getBaseSectionOutlinePaint();
        double double26 = piePlot21.getShadowYOffset();
        java.awt.Image image27 = null;
        piePlot21.setBackgroundImage(image27);
        org.jfree.chart.util.Rotation rotation29 = piePlot21.getDirection();
        piePlot19.setDirection(rotation29);
        piePlot0.setDirection(rotation29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot8 and piePlot19", piePlot8.equals(piePlot19) ? piePlot8.hashCode() == piePlot19.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
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
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot();
        double double43 = piePlot42.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor44 = piePlot42.getLabelDistributor();
        java.awt.Paint paint45 = piePlot42.getLabelOutlinePaint();
        org.jfree.data.xy.XYDataset xYDataset47 = null;
        org.jfree.chart.JFreeChart jFreeChart51 = org.jfree.chart.ChartFactory.createPolarChart("", xYDataset47, false, false, true);
        piePlot42.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart51);
        java.awt.Shape shape53 = piePlot42.getLegendItemShape();
        piePlot0.setLegendItemShape(shape53);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot7 and piePlot42", piePlot7.equals(piePlot42) ? piePlot7.hashCode() == piePlot42.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        piePlot0.setOutlineVisible(true);
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator9 = piePlot8.getLegendLabelGenerator();
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        double double11 = piePlot10.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = piePlot10.getLabelDistributor();
        double double13 = piePlot10.getMinimumArcAngleToDraw();
        java.awt.Paint paint14 = piePlot10.getBaseSectionOutlinePaint();
        double double15 = piePlot10.getShadowYOffset();
        java.awt.Image image16 = null;
        piePlot10.setBackgroundImage(image16);
        org.jfree.chart.util.Rotation rotation18 = piePlot10.getDirection();
        piePlot8.setDirection(rotation18);
        piePlot0.setDirection(rotation18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot8 and piePlot10", piePlot8.equals(piePlot10) ? piePlot8.hashCode() == piePlot10.hashCode() : true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = piePlot0.getMaximumExplodePercent();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
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
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset20 = null;
        piePlot19.setDataset(pieDataset20);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = piePlot19.getURLGenerator();
        float float23 = piePlot19.getForegroundAlpha();
        java.awt.Stroke stroke24 = piePlot19.getBaseSectionOutlineStroke();
        java.awt.Stroke stroke25 = piePlot19.getLabelLinkStroke();
        piePlot0.setOutlineStroke(stroke25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot9 and piePlot19", piePlot9.equals(piePlot19) ? piePlot9.hashCode() == piePlot19.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
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
        piePlot0.setInteriorGap((double) 0.0f);
        boolean boolean16 = piePlot0.isOutlineVisible();
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset18 = null;
        piePlot17.setDataset(pieDataset18);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator20 = piePlot17.getURLGenerator();
        piePlot17.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator23 = piePlot17.getLegendLabelToolTipGenerator();
        boolean boolean24 = piePlot17.getSimpleLabels();
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot();
        double double26 = piePlot25.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor27 = piePlot25.getLabelDistributor();
        double double28 = piePlot25.getMinimumArcAngleToDraw();
        java.awt.Paint paint29 = piePlot25.getBaseSectionOutlinePaint();
        double double30 = piePlot25.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = piePlot25.getSimpleLabelOffset();
        double double32 = piePlot25.getLabelLinkMargin();
        double double33 = piePlot25.getStartAngle();
        piePlot17.setParent((org.jfree.chart.plot.Plot) piePlot25);
        java.awt.Paint paint35 = piePlot25.getLabelShadowPaint();
        piePlot0.setLabelBackgroundPaint(paint35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot5 and piePlot25", piePlot5.equals(piePlot25) ? piePlot5.hashCode() == piePlot25.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
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
        org.jfree.data.general.DatasetGroup datasetGroup13 = piePlot11.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        piePlot11.setDataset(pieDataset14);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot11.setInsets(rectangleInsets16, false);
        piePlot0.setInsets(rectangleInsets16, true);
        java.lang.String str21 = piePlot0.getPlotType();
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        double double23 = piePlot22.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup24 = piePlot22.getDatasetGroup();
        piePlot22.setOutlineVisible(true);
        boolean boolean28 = piePlot22.equals((java.lang.Object) true);
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
        java.awt.Paint paint41 = piePlot29.getLabelPaint();
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset43 = null;
        piePlot42.setDataset(pieDataset43);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator45 = piePlot42.getURLGenerator();
        piePlot42.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator48 = piePlot42.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot49 = new org.jfree.chart.plot.PiePlot();
        double double50 = piePlot49.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor51 = piePlot49.getLabelDistributor();
        double double52 = piePlot49.getMinimumArcAngleToDraw();
        boolean boolean53 = piePlot49.getIgnoreZeroValues();
        boolean boolean54 = piePlot49.isSubplot();
        piePlot49.setCircular(false);
        java.awt.Paint paint58 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot49.setSectionOutlinePaint((java.lang.Comparable) "", paint58);
        piePlot42.setNoDataMessagePaint(paint58);
        piePlot29.setLabelBackgroundPaint(paint58);
        piePlot22.setBaseSectionPaint(paint58);
        java.awt.Paint paint63 = piePlot22.getBaseSectionOutlinePaint();
        piePlot0.setOutlinePaint(paint63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot29", piePlot11.equals(piePlot29) ? piePlot11.hashCode() == piePlot29.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
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
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        double double23 = piePlot22.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup24 = piePlot22.getDatasetGroup();
        java.awt.Paint paint25 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot22.setNoDataMessagePaint(paint25);
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset28 = null;
        piePlot27.setDataset(pieDataset28);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator30 = piePlot27.getURLGenerator();
        org.jfree.chart.plot.Plot plot31 = piePlot27.getRootPlot();
        java.awt.Stroke stroke32 = piePlot27.getLabelOutlineStroke();
        piePlot22.setLabelLinkStroke(stroke32);
        java.awt.Stroke stroke34 = piePlot22.getOutlineStroke();
        java.awt.Shape shape35 = piePlot22.getLegendItemShape();
        piePlot22.setInteriorGap((double) 0.0f);
        boolean boolean38 = piePlot22.isOutlineVisible();
        org.jfree.chart.plot.PiePlot piePlot39 = new org.jfree.chart.plot.PiePlot();
        piePlot39.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint42 = piePlot39.getLabelLinkPaint();
        piePlot22.setBaseSectionPaint(paint42);
        piePlot0.setLabelShadowPaint(paint42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot13 and piePlot27", piePlot13.equals(piePlot27) ? piePlot13.hashCode() == piePlot27.hashCode() : true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
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
        org.jfree.chart.plot.Plot plot18 = piePlot17.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor19 = piePlot17.getLabelDistributor();
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot();
        double double21 = piePlot20.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor22 = piePlot20.getLabelDistributor();
        double double23 = piePlot20.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        piePlot20.drawBackgroundImage(graphics2D24, rectangle2D25);
        java.awt.Paint paint28 = piePlot20.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str29 = piePlot20.getNoDataMessage();
        java.awt.Paint paint30 = piePlot20.getLabelOutlinePaint();
        java.awt.Stroke stroke31 = piePlot20.getLabelOutlineStroke();
        piePlot17.setLabelLinkStroke(stroke31);
        piePlot0.setBaseSectionOutlineStroke(stroke31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot17 and piePlot20", piePlot17.equals(piePlot20) ? piePlot17.hashCode() == piePlot20.hashCode() : true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
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
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot();
        double double20 = piePlot19.getMaximumLabelWidth();
        piePlot19.setForegroundAlpha(100.0f);
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot();
        double double24 = piePlot23.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor25 = piePlot23.getLabelDistributor();
        double double26 = piePlot23.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        piePlot23.drawBackgroundImage(graphics2D27, rectangle2D28);
        java.awt.Paint paint31 = piePlot23.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str32 = piePlot23.getNoDataMessage();
        java.awt.Paint paint33 = piePlot23.getLabelOutlinePaint();
        piePlot19.setBaseSectionOutlinePaint(paint33);
        piePlot0.setLabelShadowPaint(paint33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot9 and piePlot23", piePlot9.equals(piePlot23) ? piePlot9.hashCode() == piePlot23.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        java.awt.Stroke stroke5 = piePlot0.getLabelOutlineStroke();
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        double double7 = piePlot6.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot6.getDatasetGroup();
        java.awt.Paint paint9 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot6.setNoDataMessagePaint(paint9);
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset12 = null;
        piePlot11.setDataset(pieDataset12);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator14 = piePlot11.getURLGenerator();
        org.jfree.chart.plot.Plot plot15 = piePlot11.getRootPlot();
        java.awt.Stroke stroke16 = piePlot11.getLabelOutlineStroke();
        piePlot6.setLabelLinkStroke(stroke16);
        org.jfree.chart.util.Rotation rotation18 = piePlot6.getDirection();
        org.jfree.chart.util.Rotation rotation19 = piePlot6.getDirection();
        piePlot0.setDirection(rotation19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot0 and piePlot6", piePlot0.equals(piePlot6) ? piePlot0.hashCode() == piePlot6.hashCode() : true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreNullValues();
        org.jfree.data.general.DatasetGroup datasetGroup5 = piePlot0.getDatasetGroup();
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        double double7 = piePlot6.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor8 = piePlot6.getLabelDistributor();
        double double9 = piePlot6.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        piePlot6.drawBackgroundImage(graphics2D10, rectangle2D11);
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        double double14 = piePlot13.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor15 = piePlot13.getLabelDistributor();
        double double16 = piePlot13.getMinimumArcAngleToDraw();
        java.awt.Paint paint17 = piePlot13.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = piePlot13.getDrawingSupplier();
        piePlot6.setDrawingSupplier(drawingSupplier18);
        piePlot0.setDrawingSupplier(drawingSupplier18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot6 and piePlot13", piePlot6.equals(piePlot13) ? piePlot6.hashCode() == piePlot13.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
        float float3 = piePlot0.getForegroundAlpha();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot6 = piePlot5.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor7 = piePlot5.getLabelDistributor();
        java.awt.Paint paint8 = piePlot5.getLabelOutlinePaint();
        boolean boolean9 = piePlot5.isOutlineVisible();
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot10.getExplodePercent((java.lang.Comparable) 0);
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        piePlot13.setDataset(pieDataset14);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = piePlot13.getURLGenerator();
        org.jfree.chart.plot.Plot plot17 = piePlot13.getRootPlot();
        java.awt.Stroke stroke18 = piePlot13.getLabelOutlineStroke();
        java.awt.Shape shape19 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot13.setLegendItemShape(shape19);
        java.awt.Stroke stroke21 = piePlot13.getLabelLinkStroke();
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
        piePlot13.setLabelFont(font31);
        piePlot10.setLabelFont(font31);
        piePlot5.setLabelFont(font31);
        piePlot0.setNoDataMessageFont(font31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot5 and piePlot10", piePlot5.equals(piePlot10) ? piePlot5.hashCode() == piePlot10.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
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
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot();
        double double28 = piePlot27.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor29 = piePlot27.getLabelDistributor();
        java.lang.String str30 = piePlot27.getPlotType();
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot();
        double double32 = piePlot31.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup33 = piePlot31.getDatasetGroup();
        piePlot31.setOutlineVisible(true);
        boolean boolean37 = piePlot31.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot38 = new org.jfree.chart.plot.PiePlot();
        double double39 = piePlot38.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor40 = piePlot38.getLabelDistributor();
        double double41 = piePlot38.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D42 = null;
        java.awt.geom.Rectangle2D rectangle2D43 = null;
        piePlot38.drawBackgroundImage(graphics2D42, rectangle2D43);
        java.awt.Paint paint46 = piePlot38.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font47 = piePlot38.getLabelFont();
        piePlot31.setNoDataMessageFont(font47);
        piePlot27.setNoDataMessageFont(font47);
        piePlot0.setLabelFont(font47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot27 and piePlot31", piePlot27.equals(piePlot31) ? piePlot27.hashCode() == piePlot31.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.lang.String str3 = piePlot0.getPlotType();
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
        piePlot0.setNoDataMessageFont(font20);
        java.awt.Stroke stroke23 = piePlot0.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot();
        double double25 = piePlot24.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor26 = piePlot24.getLabelDistributor();
        double double27 = piePlot24.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        piePlot24.drawBackgroundImage(graphics2D28, rectangle2D29);
        java.awt.Paint paint32 = piePlot24.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font33 = piePlot24.getLabelFont();
        piePlot24.setSimpleLabels(false);
        java.awt.Paint paint36 = piePlot24.getLabelPaint();
        java.awt.Paint paint37 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot24.setLabelOutlinePaint(paint37);
        piePlot24.setStartAngle((double) 100L);
        java.awt.Paint paint42 = piePlot24.getSectionOutlinePaint((java.lang.Comparable) (-1L));
        piePlot24.setExplodePercent((java.lang.Comparable) (short) 100, (double) '#');
        org.jfree.chart.plot.PiePlot piePlot46 = new org.jfree.chart.plot.PiePlot();
        double double47 = piePlot46.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup48 = piePlot46.getDatasetGroup();
        piePlot46.setOutlineVisible(true);
        boolean boolean51 = piePlot46.getSectionOutlinesVisible();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator52 = piePlot46.getLegendLabelGenerator();
        piePlot24.setLabelGenerator(pieSectionLabelGenerator52);
        piePlot0.setLabelGenerator(pieSectionLabelGenerator52);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot46", piePlot11.equals(piePlot46) ? piePlot11.hashCode() == piePlot46.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
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
        piePlot0.setInteriorGap((double) 0.0f);
        boolean boolean16 = piePlot0.isOutlineVisible();
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot();
        double double19 = piePlot18.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor20 = piePlot18.getLabelDistributor();
        double double21 = piePlot18.getMinimumArcAngleToDraw();
        java.awt.Paint paint22 = piePlot18.getBaseSectionOutlinePaint();
        double double23 = piePlot18.getShadowYOffset();
        piePlot18.setBackgroundImageAlignment((int) (byte) -1);
        java.awt.Paint paint26 = piePlot18.getLabelPaint();
        piePlot0.setSectionOutlinePaint((java.lang.Comparable) (-1.0f), paint26);
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot();
        double double30 = piePlot29.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup31 = piePlot29.getDatasetGroup();
        piePlot29.setOutlineVisible(true);
        boolean boolean35 = piePlot29.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot();
        double double37 = piePlot36.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor38 = piePlot36.getLabelDistributor();
        double double39 = piePlot36.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D40 = null;
        java.awt.geom.Rectangle2D rectangle2D41 = null;
        piePlot36.drawBackgroundImage(graphics2D40, rectangle2D41);
        java.awt.Paint paint44 = piePlot36.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font45 = piePlot36.getLabelFont();
        piePlot29.setNoDataMessageFont(font45);
        boolean boolean47 = piePlot29.isOutlineVisible();
        double double48 = piePlot29.getLabelGap();
        org.jfree.chart.plot.Plot plot49 = piePlot29.getRootPlot();
        piePlot29.setCircular(true, false);
        int int53 = piePlot29.getBackgroundImageAlignment();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator54 = piePlot29.getLegendLabelURLGenerator();
        org.jfree.chart.plot.PiePlot piePlot55 = new org.jfree.chart.plot.PiePlot();
        double double56 = piePlot55.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor57 = piePlot55.getLabelDistributor();
        double double58 = piePlot55.getMinimumArcAngleToDraw();
        java.awt.Paint paint59 = piePlot55.getBaseSectionOutlinePaint();
        double double60 = piePlot55.getShadowYOffset();
        piePlot55.setBackgroundImageAlignment((int) (byte) -1);
        double double63 = piePlot55.getInteriorGap();
        java.awt.Font font64 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot55.setNoDataMessageFont(font64);
        java.awt.Paint paint66 = piePlot55.getLabelShadowPaint();
        piePlot29.setOutlinePaint(paint66);
        piePlot0.setSectionOutlinePaint((java.lang.Comparable) (-1.0d), paint66);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot5 and piePlot36", piePlot5.equals(piePlot36) ? piePlot5.hashCode() == piePlot36.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
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
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot();
        double double25 = piePlot24.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor26 = piePlot24.getLabelDistributor();
        java.lang.String str27 = piePlot24.getPlotType();
        org.jfree.data.general.DatasetGroup datasetGroup28 = piePlot24.getDatasetGroup();
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset30 = null;
        piePlot29.setDataset(pieDataset30);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator32 = piePlot29.getURLGenerator();
        org.jfree.chart.plot.Plot plot33 = piePlot29.getRootPlot();
        double double34 = piePlot29.getLabelGap();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator35 = piePlot29.getLegendLabelGenerator();
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot();
        double double38 = piePlot37.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor39 = piePlot37.getLabelDistributor();
        double double40 = piePlot37.getMinimumArcAngleToDraw();
        java.awt.Paint paint41 = piePlot37.getBaseSectionOutlinePaint();
        piePlot37.setIgnoreNullValues(false);
        java.awt.Paint paint44 = piePlot37.getNoDataMessagePaint();
        piePlot29.setSectionPaint((java.lang.Comparable) 100L, paint44);
        piePlot24.setLabelShadowPaint(paint44);
        piePlot0.setLabelLinkPaint(paint44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot37", piePlot11.equals(piePlot37) ? piePlot11.hashCode() == piePlot37.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
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
        boolean boolean18 = piePlot0.getIgnoreZeroValues();
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset20 = null;
        piePlot19.setDataset(pieDataset20);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = piePlot19.getURLGenerator();
        org.jfree.chart.plot.Plot plot23 = piePlot19.getRootPlot();
        java.awt.Stroke stroke24 = piePlot19.getLabelOutlineStroke();
        piePlot0.setOutlineStroke(stroke24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot8 and piePlot19", piePlot8.equals(piePlot19) ? piePlot8.hashCode() == piePlot19.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        piePlot0.setBackgroundImageAlignment((int) 'a');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot0.getLabelDistributor();
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        piePlot5.setDataset(pieDataset6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot5.getURLGenerator();
        piePlot5.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator11 = piePlot5.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot();
        double double13 = piePlot12.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor14 = piePlot12.getLabelDistributor();
        double double15 = piePlot12.getMinimumArcAngleToDraw();
        boolean boolean16 = piePlot12.getIgnoreZeroValues();
        boolean boolean17 = piePlot12.isSubplot();
        piePlot12.setCircular(false);
        java.awt.Paint paint21 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot12.setSectionOutlinePaint((java.lang.Comparable) "", paint21);
        piePlot5.setNoDataMessagePaint(paint21);
        piePlot0.setBaseSectionOutlinePaint(paint21);
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot();
        double double26 = piePlot25.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor27 = piePlot25.getLabelDistributor();
        double double28 = piePlot25.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        piePlot25.drawBackgroundImage(graphics2D29, rectangle2D30);
        java.awt.Paint paint33 = piePlot25.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str34 = piePlot25.getNoDataMessage();
        java.awt.Paint paint35 = piePlot25.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot();
        double double37 = piePlot36.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup38 = piePlot36.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset39 = null;
        piePlot36.setDataset(pieDataset39);
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot36.setInsets(rectangleInsets41, false);
        piePlot25.setInsets(rectangleInsets41, true);
        piePlot0.setParent((org.jfree.chart.plot.Plot) piePlot25);
        org.jfree.chart.plot.PiePlot piePlot47 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset48 = null;
        piePlot47.setDataset(pieDataset48);
        piePlot47.setBackgroundAlpha((float) (byte) 0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator52 = piePlot47.getLegendLabelGenerator();
        boolean boolean53 = piePlot0.equals((java.lang.Object) piePlot47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot25 and piePlot36", piePlot25.equals(piePlot36) ? piePlot25.hashCode() == piePlot36.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
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
        piePlot0.setIgnoreNullValues(false);
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot();
        double double24 = piePlot23.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup25 = piePlot23.getDatasetGroup();
        java.awt.Paint paint26 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot23.setNoDataMessagePaint(paint26);
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset29 = null;
        piePlot28.setDataset(pieDataset29);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator31 = piePlot28.getURLGenerator();
        org.jfree.chart.plot.Plot plot32 = piePlot28.getRootPlot();
        java.awt.Stroke stroke33 = piePlot28.getLabelOutlineStroke();
        piePlot23.setLabelLinkStroke(stroke33);
        org.jfree.chart.util.Rotation rotation35 = piePlot23.getDirection();
        int int36 = piePlot23.getPieIndex();
        piePlot23.setIgnoreZeroValues(false);
        org.jfree.chart.util.RectangleInsets rectangleInsets39 = piePlot23.getLabelPadding();
        piePlot0.setInsets(rectangleInsets39, true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot23", piePlot11.equals(piePlot23) ? piePlot11.hashCode() == piePlot23.hashCode() : true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
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
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot();
        double double27 = piePlot26.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor28 = piePlot26.getLabelDistributor();
        double double29 = piePlot26.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        piePlot26.drawBackgroundImage(graphics2D30, rectangle2D31);
        java.awt.Paint paint34 = piePlot26.getSectionPaint((java.lang.Comparable) false);
        float float35 = piePlot26.getForegroundAlpha();
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot();
        piePlot36.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint39 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot36.setLabelShadowPaint(paint39);
        piePlot26.setBaseSectionPaint(paint39);
        piePlot0.setLabelLinkPaint(paint39);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot15 and piePlot26", piePlot15.equals(piePlot26) ? piePlot15.hashCode() == piePlot26.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        piePlot0.setBackgroundImageAlignment((int) 'a');
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        double double6 = piePlot5.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor7 = piePlot5.getLabelDistributor();
        double double8 = piePlot5.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        piePlot5.drawBackgroundImage(graphics2D9, rectangle2D10);
        java.awt.Paint paint13 = piePlot5.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str14 = piePlot5.getNoDataMessage();
        java.awt.Paint paint15 = piePlot5.getLabelOutlinePaint();
        piePlot0.setSectionPaint((java.lang.Comparable) 1.0d, paint15);
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot();
        double double18 = piePlot17.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup19 = piePlot17.getDatasetGroup();
        piePlot17.setOutlineVisible(true);
        boolean boolean23 = piePlot17.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot();
        double double25 = piePlot24.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor26 = piePlot24.getLabelDistributor();
        double double27 = piePlot24.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        piePlot24.drawBackgroundImage(graphics2D28, rectangle2D29);
        java.awt.Paint paint32 = piePlot24.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font33 = piePlot24.getLabelFont();
        piePlot17.setNoDataMessageFont(font33);
        boolean boolean35 = piePlot17.isOutlineVisible();
        double double36 = piePlot17.getLabelGap();
        java.awt.Paint paint37 = piePlot17.getLabelLinkPaint();
        java.awt.Paint paint38 = piePlot17.getNoDataMessagePaint();
        piePlot0.setLabelBackgroundPaint(paint38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot5 and piePlot24", piePlot5.equals(piePlot24) ? piePlot5.hashCode() == piePlot24.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
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
        java.awt.Paint paint13 = piePlot7.getShadowPaint();
        piePlot0.setLabelOutlinePaint(paint13);
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
        java.awt.Paint paint29 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot16.setLabelOutlinePaint(paint29);
        piePlot0.setSectionOutlinePaint((java.lang.Comparable) (byte) 0, paint29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot7 and piePlot16", piePlot7.equals(piePlot16) ? piePlot7.hashCode() == piePlot16.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
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
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator43 = piePlot42.getLegendLabelGenerator();
        piePlot0.setLabelGenerator(pieSectionLabelGenerator43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot7 and piePlot42", piePlot7.equals(piePlot42) ? piePlot7.hashCode() == piePlot42.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        boolean boolean5 = piePlot0.isSubplot();
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot7 = piePlot6.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor8 = piePlot6.getLabelDistributor();
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
        piePlot6.setLabelLinkStroke(stroke20);
        piePlot0.setLabelLinkStroke(stroke20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot6 and piePlot9", piePlot6.equals(piePlot9) ? piePlot6.hashCode() == piePlot9.hashCode() : true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        piePlot0.setPieIndex((int) (byte) 10);
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        piePlot7.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint10 = piePlot7.getLabelLinkPaint();
        piePlot0.setSectionOutlinePaint((java.lang.Comparable) "", paint10);
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
        piePlot0.setLegendItemShape(shape25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot12 and piePlot17", piePlot12.equals(piePlot17) ? piePlot12.hashCode() == piePlot17.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        boolean boolean5 = piePlot0.getSectionOutlinesVisible();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelGenerator();
        piePlot0.setLabelLinksVisible(false);
        piePlot0.setCircular(true, false);
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
        org.jfree.chart.util.Rotation rotation24 = piePlot12.getDirection();
        org.jfree.chart.util.Rotation rotation25 = piePlot12.getDirection();
        java.awt.Paint paint26 = piePlot12.getLabelLinkPaint();
        piePlot0.setNoDataMessagePaint(paint26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot12 and piePlot17", piePlot12.equals(piePlot17) ? piePlot12.hashCode() == piePlot17.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
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
        java.awt.Paint paint16 = piePlot0.getLabelBackgroundPaint();
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot();
        double double18 = piePlot17.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor19 = piePlot17.getLabelDistributor();
        double double20 = piePlot17.getMinimumArcAngleToDraw();
        java.awt.Paint paint21 = piePlot17.getBaseSectionOutlinePaint();
        double double22 = piePlot17.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = piePlot17.getSimpleLabelOffset();
        java.awt.Stroke stroke24 = piePlot17.getLabelLinkStroke();
        piePlot0.setBaseSectionOutlineStroke(stroke24);
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset27 = null;
        piePlot26.setDataset(pieDataset27);
        int int29 = piePlot26.getPieIndex();
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot();
        double double31 = piePlot30.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor32 = piePlot30.getLabelDistributor();
        double double33 = piePlot30.getMinimumArcAngleToDraw();
        java.awt.Paint paint34 = piePlot30.getBaseSectionOutlinePaint();
        double double35 = piePlot30.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = piePlot30.getSimpleLabelOffset();
        piePlot26.setInsets(rectangleInsets36, true);
        piePlot0.setSimpleLabelOffset(rectangleInsets36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot17 and piePlot30", piePlot17.equals(piePlot30) ? piePlot17.hashCode() == piePlot30.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
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
        java.awt.Paint paint13 = piePlot7.getShadowPaint();
        piePlot0.setLabelOutlinePaint(paint13);
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot();
        double double16 = piePlot15.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup17 = piePlot15.getDatasetGroup();
        java.awt.Paint paint18 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot15.setNoDataMessagePaint(paint18);
        double double21 = piePlot15.getExplodePercent((java.lang.Comparable) (-1));
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        double double24 = piePlot22.getExplodePercent((java.lang.Comparable) 0);
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset26 = null;
        piePlot25.setDataset(pieDataset26);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator28 = piePlot25.getURLGenerator();
        org.jfree.chart.plot.Plot plot29 = piePlot25.getRootPlot();
        java.awt.Stroke stroke30 = piePlot25.getLabelOutlineStroke();
        java.awt.Shape shape31 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot25.setLegendItemShape(shape31);
        java.awt.Stroke stroke33 = piePlot25.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot();
        double double35 = piePlot34.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor36 = piePlot34.getLabelDistributor();
        double double37 = piePlot34.getMinimumArcAngleToDraw();
        java.awt.Paint paint38 = piePlot34.getBaseSectionOutlinePaint();
        double double39 = piePlot34.getShadowYOffset();
        piePlot34.setBackgroundImageAlignment((int) (byte) -1);
        double double42 = piePlot34.getInteriorGap();
        java.awt.Font font43 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot34.setNoDataMessageFont(font43);
        piePlot25.setLabelFont(font43);
        piePlot22.setLabelFont(font43);
        piePlot15.setNoDataMessageFont(font43);
        piePlot0.setLabelFont(font43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot7 and piePlot22", piePlot7.equals(piePlot22) ? piePlot7.hashCode() == piePlot22.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot0.setToolTipGenerator(pieToolTipGenerator2);
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset7 = null;
        org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "hi!", "", boxAndWhiskerXYDataset7, false);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart9);
        java.awt.Paint paint11 = piePlot0.getBackgroundPaint();
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot();
        double double13 = piePlot12.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor14 = piePlot12.getLabelDistributor();
        double double15 = piePlot12.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        piePlot12.drawBackgroundImage(graphics2D16, rectangle2D17);
        java.awt.Paint paint20 = piePlot12.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font21 = piePlot12.getLabelFont();
        piePlot12.setSimpleLabels(false);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor24 = piePlot12.getLabelDistributor();
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset26 = null;
        piePlot25.setDataset(pieDataset26);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator28 = piePlot25.getURLGenerator();
        float float29 = piePlot25.getForegroundAlpha();
        java.awt.Stroke stroke30 = piePlot25.getBaseSectionOutlineStroke();
        piePlot12.setBaseSectionOutlineStroke(stroke30);
        piePlot0.setBaseSectionOutlineStroke(stroke30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot12 and piePlot25", piePlot12.equals(piePlot25) ? piePlot12.hashCode() == piePlot25.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup5 = piePlot4.getDatasetGroup();
        piePlot4.setBackgroundImageAlignment((int) 'a');
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
        piePlot4.setSectionPaint((java.lang.Comparable) 1.0d, paint19);
        piePlot0.setOutlinePaint(paint19);
        org.jfree.chart.event.PlotChangeListener plotChangeListener22 = null;
        piePlot0.removeChangeListener(plotChangeListener22);
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot();
        double double25 = piePlot24.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor26 = piePlot24.getLabelDistributor();
        java.awt.Paint paint27 = piePlot24.getLabelOutlinePaint();
        piePlot0.setShadowPaint(paint27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot9 and piePlot24", piePlot9.equals(piePlot24) ? piePlot9.hashCode() == piePlot24.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.lang.String str3 = piePlot0.getPlotType();
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
        piePlot0.setNoDataMessageFont(font20);
        java.awt.Stroke stroke23 = piePlot0.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot();
        double double25 = piePlot24.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor26 = piePlot24.getLabelDistributor();
        double double27 = piePlot24.getMinimumArcAngleToDraw();
        java.awt.Paint paint28 = piePlot24.getBaseSectionOutlinePaint();
        java.awt.Paint paint29 = piePlot24.getBaseSectionPaint();
        java.awt.Paint paint30 = piePlot24.getShadowPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator31 = piePlot24.getLegendLabelGenerator();
        java.awt.Paint paint32 = piePlot24.getLabelPaint();
        piePlot0.setBackgroundPaint(paint32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot24", piePlot11.equals(piePlot24) ? piePlot11.hashCode() == piePlot24.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        java.awt.Paint paint6 = piePlot0.getShadowPaint();
        boolean boolean7 = piePlot0.getIgnoreZeroValues();
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        double double9 = piePlot8.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor10 = piePlot8.getLabelDistributor();
        java.awt.Paint paint11 = piePlot8.getLabelOutlinePaint();
        piePlot8.setStartAngle((double) (byte) 10);
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot();
        double double15 = piePlot14.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor16 = piePlot14.getLabelDistributor();
        double double17 = piePlot14.getMinimumArcAngleToDraw();
        java.awt.Paint paint18 = piePlot14.getBaseSectionOutlinePaint();
        java.awt.Paint paint19 = piePlot14.getBaseSectionPaint();
        piePlot8.setLabelPaint(paint19);
        piePlot0.setBackgroundPaint(paint19);
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        double double23 = piePlot22.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor24 = piePlot22.getLabelDistributor();
        double double25 = piePlot22.getMinimumArcAngleToDraw();
        java.awt.Paint paint26 = piePlot22.getBaseSectionOutlinePaint();
        piePlot0.setBaseSectionPaint(paint26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot14 and piePlot22", piePlot14.equals(piePlot22) ? piePlot14.hashCode() == piePlot22.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
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
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot();
        double double21 = piePlot20.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor22 = piePlot20.getLabelDistributor();
        double double23 = piePlot20.getMinimumArcAngleToDraw();
        java.awt.Paint paint24 = piePlot20.getBaseSectionOutlinePaint();
        piePlot20.setIgnoreNullValues(false);
        java.awt.Stroke stroke27 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot20.setLabelLinkStroke(stroke27);
        java.awt.Stroke stroke29 = piePlot20.getLabelLinkStroke();
        piePlot0.setLabelOutlineStroke(stroke29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot10 and piePlot20", piePlot10.equals(piePlot20) ? piePlot10.hashCode() == piePlot20.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
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
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset19 = null;
        piePlot18.setDataset(pieDataset19);
        int int21 = piePlot18.getPieIndex();
        double double22 = piePlot18.getShadowXOffset();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator23 = piePlot18.getLabelGenerator();
        piePlot0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot9 and piePlot18", piePlot9.equals(piePlot18) ? piePlot9.hashCode() == piePlot18.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
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
        org.jfree.data.general.PieDataset pieDataset37 = null;
        org.jfree.chart.plot.PiePlot piePlot38 = new org.jfree.chart.plot.PiePlot(pieDataset37);
        piePlot38.zoom(0.4d);
        java.awt.Stroke stroke42 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot38.setSectionOutlineStroke((java.lang.Comparable) false, stroke42);
        org.jfree.chart.plot.PiePlot piePlot45 = new org.jfree.chart.plot.PiePlot();
        double double46 = piePlot45.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor47 = piePlot45.getLabelDistributor();
        java.awt.Paint paint48 = piePlot45.getLabelOutlinePaint();
        piePlot38.setSectionPaint((java.lang.Comparable) 1.0E-5d, paint48);
        java.awt.Paint paint50 = piePlot38.getLabelOutlinePaint();
        piePlot0.setLabelLinkPaint(paint50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot7 and piePlot45", piePlot7.equals(piePlot45) ? piePlot7.hashCode() == piePlot45.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        boolean boolean5 = piePlot0.isSubplot();
        piePlot0.setCircular(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = piePlot0.getMaximumExplodePercent();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Stroke stroke3 = piePlot0.getOutlineStroke();
        piePlot0.setPieIndex(100);
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        double double7 = piePlot6.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor8 = piePlot6.getLabelDistributor();
        double double9 = piePlot6.getMinimumArcAngleToDraw();
        boolean boolean10 = piePlot6.getIgnoreNullValues();
        boolean boolean11 = piePlot6.getIgnoreNullValues();
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
        java.awt.Stroke stroke29 = piePlot12.getLabelLinkStroke();
        piePlot6.setLabelLinkStroke(stroke29);
        piePlot0.setOutlineStroke(stroke29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot6 and piePlot17", piePlot6.equals(piePlot17) ? piePlot6.hashCode() == piePlot17.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
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
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset23 = null;
        piePlot22.setDataset(pieDataset23);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator25 = piePlot22.getURLGenerator();
        org.jfree.chart.plot.Plot plot26 = piePlot22.getRootPlot();
        java.awt.Stroke stroke27 = piePlot22.getLabelOutlineStroke();
        java.awt.Paint paint28 = piePlot22.getLabelBackgroundPaint();
        piePlot0.setLabelLinkPaint(paint28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot6 and piePlot22", piePlot6.equals(piePlot22) ? piePlot6.hashCode() == piePlot22.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
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
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot();
        double double31 = piePlot30.getMaximumLabelWidth();
        piePlot30.setForegroundAlpha(100.0f);
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot();
        double double35 = piePlot34.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor36 = piePlot34.getLabelDistributor();
        double double37 = piePlot34.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D38 = null;
        java.awt.geom.Rectangle2D rectangle2D39 = null;
        piePlot34.drawBackgroundImage(graphics2D38, rectangle2D39);
        java.awt.Paint paint42 = piePlot34.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str43 = piePlot34.getNoDataMessage();
        java.awt.Paint paint44 = piePlot34.getLabelOutlinePaint();
        piePlot30.setBaseSectionOutlinePaint(paint44);
        piePlot0.setLabelPaint(paint44);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot5 and piePlot34", piePlot5.equals(piePlot34) ? piePlot5.hashCode() == piePlot34.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
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
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        piePlot22.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint25 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot22.setLabelShadowPaint(paint25);
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset28 = null;
        piePlot27.setDataset(pieDataset28);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator30 = piePlot27.getURLGenerator();
        org.jfree.chart.plot.Plot plot31 = piePlot27.getRootPlot();
        java.awt.Stroke stroke32 = piePlot27.getLabelOutlineStroke();
        java.awt.Shape shape33 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot27.setLegendItemShape(shape33);
        boolean boolean35 = piePlot22.equals((java.lang.Object) piePlot27);
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot();
        double double37 = piePlot36.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor38 = piePlot36.getLabelDistributor();
        double double39 = piePlot36.getMinimumArcAngleToDraw();
        java.awt.Paint paint40 = piePlot36.getBaseSectionOutlinePaint();
        piePlot27.setBackgroundPaint(paint40);
        piePlot0.setLabelBackgroundPaint(paint40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot6 and piePlot36", piePlot6.equals(piePlot36) ? piePlot6.hashCode() == piePlot36.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
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
        double double21 = piePlot0.getExplodePercent((java.lang.Comparable) 52.0d);
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator23 = piePlot22.getLegendLabelGenerator();
        java.awt.Paint paint24 = piePlot22.getBackgroundPaint();
        piePlot0.setBaseSectionOutlinePaint(paint24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot7 and piePlot22", piePlot7.equals(piePlot22) ? piePlot7.hashCode() == piePlot22.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
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
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot16 = piePlot15.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor17 = piePlot15.getLabelDistributor();
        java.awt.Paint paint18 = piePlot15.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot();
        double double20 = piePlot19.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup21 = piePlot19.getDatasetGroup();
        piePlot19.setOutlineVisible(true);
        boolean boolean25 = piePlot19.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot();
        double double27 = piePlot26.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor28 = piePlot26.getLabelDistributor();
        double double29 = piePlot26.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        piePlot26.drawBackgroundImage(graphics2D30, rectangle2D31);
        java.awt.Paint paint34 = piePlot26.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font35 = piePlot26.getLabelFont();
        piePlot19.setNoDataMessageFont(font35);
        boolean boolean37 = piePlot19.isOutlineVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = piePlot19.getInsets();
        piePlot15.setInsets(rectangleInsets38);
        piePlot0.setSimpleLabelOffset(rectangleInsets38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot6 and piePlot15", piePlot6.equals(piePlot15) ? piePlot6.hashCode() == piePlot15.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        java.awt.Paint paint6 = piePlot0.getLabelPaint();
        java.awt.Paint paint7 = piePlot0.getLabelPaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        piePlot0.axisChanged(axisChangeEvent8);
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        double double11 = piePlot10.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup12 = piePlot10.getDatasetGroup();
        piePlot10.setOutlineVisible(true);
        boolean boolean16 = piePlot10.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot();
        double double18 = piePlot17.getMaximumLabelWidth();
        piePlot17.setForegroundAlpha(100.0f);
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
        piePlot17.setBaseSectionOutlinePaint(paint31);
        piePlot10.setParent((org.jfree.chart.plot.Plot) piePlot17);
        float float34 = piePlot10.getBackgroundAlpha();
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = piePlot10.getInsets();
        piePlot0.setLabelPadding(rectangleInsets35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot10 and piePlot21", piePlot10.equals(piePlot21) ? piePlot10.hashCode() == piePlot21.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Stroke stroke3 = piePlot0.getOutlineStroke();
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        double double5 = piePlot4.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor6 = piePlot4.getLabelDistributor();
        double double7 = piePlot4.getMinimumArcAngleToDraw();
        java.awt.Paint paint8 = piePlot4.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot4.getDrawingSupplier();
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        double double11 = piePlot10.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = piePlot10.getLabelDistributor();
        double double13 = piePlot10.getMinimumArcAngleToDraw();
        boolean boolean14 = piePlot10.getIgnoreZeroValues();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = piePlot10.getLabelGenerator();
        piePlot4.setLegendLabelGenerator(pieSectionLabelGenerator15);
        piePlot0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot4 and piePlot10", piePlot4.equals(piePlot10) ? piePlot4.hashCode() == piePlot10.hashCode() : true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
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
        piePlot0.setForegroundAlpha(10.0f);
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot();
        double double22 = piePlot21.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup23 = piePlot21.getDatasetGroup();
        java.awt.Paint paint24 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot21.setNoDataMessagePaint(paint24);
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset27 = null;
        piePlot26.setDataset(pieDataset27);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator29 = piePlot26.getURLGenerator();
        org.jfree.chart.plot.Plot plot30 = piePlot26.getRootPlot();
        java.awt.Stroke stroke31 = piePlot26.getLabelOutlineStroke();
        piePlot21.setLabelLinkStroke(stroke31);
        piePlot21.setSimpleLabels(true);
        java.awt.Paint paint35 = piePlot21.getShadowPaint();
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot();
        piePlot36.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint39 = piePlot36.getLabelLinkPaint();
        piePlot21.setLabelBackgroundPaint(paint39);
        boolean boolean41 = piePlot0.equals((java.lang.Object) piePlot21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot10 and piePlot26", piePlot10.equals(piePlot26) ? piePlot10.hashCode() == piePlot26.hashCode() : true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        org.jfree.chart.plot.Plot plot2 = piePlot0.getParent();
        org.jfree.chart.plot.PiePlot piePlot3 = new org.jfree.chart.plot.PiePlot();
        double double4 = piePlot3.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor5 = piePlot3.getLabelDistributor();
        java.lang.String str6 = piePlot3.getPlotType();
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double8 = piePlot7.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup9 = piePlot7.getDatasetGroup();
        piePlot7.setOutlineVisible(true);
        boolean boolean13 = piePlot7.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot();
        double double15 = piePlot14.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor16 = piePlot14.getLabelDistributor();
        double double17 = piePlot14.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        piePlot14.drawBackgroundImage(graphics2D18, rectangle2D19);
        java.awt.Paint paint22 = piePlot14.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font23 = piePlot14.getLabelFont();
        piePlot7.setNoDataMessageFont(font23);
        piePlot3.setNoDataMessageFont(font23);
        piePlot0.setNoDataMessageFont(font23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3 and piePlot7", piePlot3.equals(piePlot7) ? piePlot3.hashCode() == piePlot7.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
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
        boolean boolean18 = piePlot0.getIgnoreZeroValues();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = piePlot0.getInsets();
        java.lang.String str20 = piePlot0.getPlotType();
        boolean boolean21 = piePlot0.getSimpleLabels();
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        double double23 = piePlot22.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup24 = piePlot22.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset25 = null;
        piePlot22.setDataset(pieDataset25);
        int int27 = piePlot22.getPieIndex();
        java.awt.Paint paint28 = piePlot22.getLabelLinkPaint();
        piePlot0.setBaseSectionPaint(paint28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot8 and piePlot22", piePlot8.equals(piePlot22) ? piePlot8.hashCode() == piePlot22.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor5 = piePlot0.getLabelDistributor();
        org.jfree.data.general.PieDataset pieDataset6 = piePlot0.getDataset();
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double8 = piePlot7.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup9 = piePlot7.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        piePlot7.setDataset(pieDataset10);
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot14 = piePlot13.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor15 = piePlot13.getLabelDistributor();
        java.awt.Stroke stroke16 = piePlot13.getOutlineStroke();
        piePlot7.setSectionOutlineStroke((java.lang.Comparable) 'a', stroke16);
        piePlot0.setBaseSectionOutlineStroke(stroke16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot0 and piePlot13", piePlot0.equals(piePlot13) ? piePlot0.hashCode() == piePlot13.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
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
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot30 = piePlot29.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor31 = piePlot29.getLabelDistributor();
        java.awt.Paint paint32 = piePlot29.getLabelOutlinePaint();
        boolean boolean33 = piePlot29.isOutlineVisible();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator34 = piePlot29.getToolTipGenerator();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator35 = piePlot29.getLabelGenerator();
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot();
        double double37 = piePlot36.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor38 = piePlot36.getLabelDistributor();
        double double39 = piePlot36.getMinimumArcAngleToDraw();
        java.awt.Paint paint40 = piePlot36.getBaseSectionOutlinePaint();
        java.awt.Paint paint41 = piePlot36.getBaseSectionPaint();
        java.awt.Paint paint42 = piePlot36.getShadowPaint();
        piePlot29.setBaseSectionOutlinePaint(paint42);
        piePlot0.setBaseSectionPaint(paint42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot15 and piePlot29", piePlot15.equals(piePlot29) ? piePlot15.hashCode() == piePlot29.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
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
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        double double14 = piePlot13.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor15 = piePlot13.getLabelDistributor();
        double double16 = piePlot13.getMinimumArcAngleToDraw();
        java.awt.Paint paint17 = piePlot13.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = piePlot13.getDrawingSupplier();
        double double19 = piePlot13.getShadowXOffset();
        java.awt.Paint paint20 = piePlot13.getLabelLinkPaint();
        java.awt.Paint paint21 = piePlot13.getLabelLinkPaint();
        piePlot0.setNoDataMessagePaint(paint21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot5 and piePlot13", piePlot5.equals(piePlot13) ? piePlot5.hashCode() == piePlot13.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        double double5 = piePlot4.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor6 = piePlot4.getLabelDistributor();
        double double7 = piePlot4.getMinimumArcAngleToDraw();
        java.awt.Paint paint8 = piePlot4.getBaseSectionOutlinePaint();
        double double9 = piePlot4.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = piePlot4.getSimpleLabelOffset();
        piePlot0.setInsets(rectangleInsets10, true);
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        double double14 = piePlot13.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor15 = piePlot13.getLabelDistributor();
        java.lang.String str16 = piePlot13.getPlotType();
        org.jfree.data.general.DatasetGroup datasetGroup17 = piePlot13.getDatasetGroup();
        java.awt.Shape shape18 = piePlot13.getLegendItemShape();
        piePlot0.setLegendItemShape(shape18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot4 and piePlot13", piePlot4.equals(piePlot13) ? piePlot4.hashCode() == piePlot13.hashCode() : true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
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
        org.jfree.data.general.DatasetGroup datasetGroup30 = piePlot28.getDatasetGroup();
        java.awt.Paint paint31 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot28.setNoDataMessagePaint(paint31);
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset34 = null;
        piePlot33.setDataset(pieDataset34);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator36 = piePlot33.getURLGenerator();
        org.jfree.chart.plot.Plot plot37 = piePlot33.getRootPlot();
        java.awt.Stroke stroke38 = piePlot33.getLabelOutlineStroke();
        piePlot28.setLabelLinkStroke(stroke38);
        org.jfree.chart.util.Rotation rotation40 = piePlot28.getDirection();
        int int41 = piePlot28.getPieIndex();
        piePlot28.setIgnoreZeroValues(false);
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = piePlot28.getLabelPadding();
        piePlot0.setInsets(rectangleInsets44, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot28", piePlot11.equals(piePlot28) ? piePlot11.hashCode() == piePlot28.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
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
        double double24 = piePlot7.getStartAngle();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot0 and piePlot11", piePlot0.equals(piePlot11) ? piePlot0.hashCode() == piePlot11.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
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
        piePlot0.setForegroundAlpha(10.0f);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot0.getSimpleLabelOffset();
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        double double23 = piePlot22.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor24 = piePlot22.getLabelDistributor();
        double double25 = piePlot22.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        piePlot22.drawBackgroundImage(graphics2D26, rectangle2D27);
        java.awt.Paint paint30 = piePlot22.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font31 = piePlot22.getLabelFont();
        piePlot22.setSimpleLabels(false);
        java.awt.Paint paint34 = piePlot22.getLabelPaint();
        piePlot0.setBackgroundPaint(paint34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot10 and piePlot22", piePlot10.equals(piePlot22) ? piePlot10.hashCode() == piePlot22.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double19 = piePlot0.getMaximumExplodePercent();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
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
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot();
        double double19 = piePlot18.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor20 = piePlot18.getLabelDistributor();
        java.awt.Paint paint21 = piePlot18.getLabelOutlinePaint();
        piePlot18.setStartAngle((double) (byte) 10);
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot();
        double double26 = piePlot25.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor27 = piePlot25.getLabelDistributor();
        double double28 = piePlot25.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        piePlot25.drawBackgroundImage(graphics2D29, rectangle2D30);
        java.awt.Paint paint33 = piePlot25.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font34 = piePlot25.getLabelFont();
        piePlot25.setSimpleLabels(false);
        piePlot25.setMinimumArcAngleToDraw((double) 100);
        boolean boolean39 = piePlot25.isOutlineVisible();
        java.awt.Paint paint40 = piePlot25.getBaseSectionOutlinePaint();
        piePlot18.setSectionOutlinePaint((java.lang.Comparable) 4.0d, paint40);
        java.awt.Paint paint42 = piePlot18.getBackgroundPaint();
        org.jfree.chart.plot.PiePlot piePlot43 = new org.jfree.chart.plot.PiePlot();
        double double44 = piePlot43.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup45 = piePlot43.getDatasetGroup();
        piePlot43.setOutlineVisible(true);
        boolean boolean49 = piePlot43.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot50 = new org.jfree.chart.plot.PiePlot();
        double double51 = piePlot50.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor52 = piePlot50.getLabelDistributor();
        double double53 = piePlot50.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D54 = null;
        java.awt.geom.Rectangle2D rectangle2D55 = null;
        piePlot50.drawBackgroundImage(graphics2D54, rectangle2D55);
        java.awt.Paint paint58 = piePlot50.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font59 = piePlot50.getLabelFont();
        piePlot43.setNoDataMessageFont(font59);
        boolean boolean61 = piePlot43.isOutlineVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets62 = piePlot43.getInsets();
        java.awt.Stroke stroke63 = piePlot43.getLabelOutlineStroke();
        piePlot18.setBaseSectionOutlineStroke(stroke63);
        piePlot0.setSectionOutlineStroke((java.lang.Comparable) 4.0d, stroke63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3 and piePlot50", piePlot3.equals(piePlot50) ? piePlot3.hashCode() == piePlot50.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
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
        float float11 = piePlot7.getForegroundAlpha();
        java.awt.Stroke stroke12 = piePlot7.getBaseSectionOutlineStroke();
        piePlot0.setLabelLinkStroke(stroke12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot0 and piePlot7", piePlot0.equals(piePlot7) ? piePlot0.hashCode() == piePlot7.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot2 = new org.jfree.chart.plot.PiePlot();
        double double3 = piePlot2.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot2.getLabelDistributor();
        double double5 = piePlot2.getMinimumArcAngleToDraw();
        java.awt.Paint paint6 = piePlot2.getBaseSectionOutlinePaint();
        double double7 = piePlot2.getShadowYOffset();
        piePlot2.setBackgroundImageAlignment((int) (byte) -1);
        double double10 = piePlot2.getInteriorGap();
        java.awt.Font font11 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot2.setNoDataMessageFont(font11);
        java.awt.Paint paint13 = piePlot2.getLabelShadowPaint();
        piePlot0.setOutlinePaint(paint13);
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot16 = piePlot15.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor17 = piePlot15.getLabelDistributor();
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot();
        double double19 = piePlot18.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor20 = piePlot18.getLabelDistributor();
        double double21 = piePlot18.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        piePlot18.drawBackgroundImage(graphics2D22, rectangle2D23);
        java.awt.Paint paint26 = piePlot18.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str27 = piePlot18.getNoDataMessage();
        java.awt.Paint paint28 = piePlot18.getLabelOutlinePaint();
        java.awt.Stroke stroke29 = piePlot18.getLabelOutlineStroke();
        piePlot15.setLabelLinkStroke(stroke29);
        piePlot0.setOutlineStroke(stroke29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot15 and piePlot18", piePlot15.equals(piePlot18) ? piePlot15.hashCode() == piePlot18.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
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
        java.lang.Object obj19 = piePlot0.clone();
        java.awt.Stroke stroke20 = piePlot0.getLabelLinkStroke();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot0 and obj19", piePlot0.equals(obj19) ? piePlot0.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
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
        java.awt.Paint paint16 = piePlot0.getLabelBackgroundPaint();
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot18 = piePlot17.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor19 = piePlot17.getLabelDistributor();
        java.awt.Paint paint20 = piePlot17.getLabelOutlinePaint();
        boolean boolean21 = piePlot17.isOutlineVisible();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator22 = piePlot17.getToolTipGenerator();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator23 = piePlot17.getLabelGenerator();
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot();
        double double25 = piePlot24.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor26 = piePlot24.getLabelDistributor();
        double double27 = piePlot24.getMinimumArcAngleToDraw();
        java.awt.Paint paint28 = piePlot24.getBaseSectionOutlinePaint();
        java.awt.Paint paint29 = piePlot24.getBaseSectionPaint();
        java.awt.Paint paint30 = piePlot24.getShadowPaint();
        piePlot17.setBaseSectionOutlinePaint(paint30);
        java.awt.Stroke stroke32 = piePlot17.getLabelLinkStroke();
        piePlot0.setOutlineStroke(stroke32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot17 and piePlot24", piePlot17.equals(piePlot24) ? piePlot17.hashCode() == piePlot24.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
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
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset19 = null;
        piePlot18.setDataset(pieDataset19);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator21 = piePlot18.getURLGenerator();
        org.jfree.chart.plot.Plot plot22 = piePlot18.getRootPlot();
        double double23 = piePlot18.getLabelGap();
        org.jfree.chart.LegendItemCollection legendItemCollection24 = piePlot18.getLegendItems();
        java.awt.Stroke stroke25 = piePlot18.getOutlineStroke();
        piePlot0.setLabelOutlineStroke(stroke25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot8 and piePlot18", piePlot8.equals(piePlot18) ? piePlot8.hashCode() == piePlot18.hashCode() : true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
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
        boolean boolean19 = piePlot0.isCircular();
        java.lang.Object obj20 = piePlot0.clone();
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot();
        double double22 = piePlot21.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor23 = piePlot21.getLabelDistributor();
        double double24 = piePlot21.getMinimumArcAngleToDraw();
        java.awt.Paint paint25 = piePlot21.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = piePlot21.getDrawingSupplier();
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot();
        double double28 = piePlot27.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor29 = piePlot27.getLabelDistributor();
        double double30 = piePlot27.getMinimumArcAngleToDraw();
        boolean boolean31 = piePlot27.getIgnoreZeroValues();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator32 = piePlot27.getLabelGenerator();
        piePlot21.setLegendLabelGenerator(pieSectionLabelGenerator32);
        piePlot0.setLabelGenerator(pieSectionLabelGenerator32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot0 and obj20", piePlot0.equals(obj20) ? piePlot0.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        piePlot0.setStartAngle((double) (byte) 10);
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        double double7 = piePlot6.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor8 = piePlot6.getLabelDistributor();
        double double9 = piePlot6.getMinimumArcAngleToDraw();
        java.awt.Paint paint10 = piePlot6.getBaseSectionOutlinePaint();
        java.awt.Paint paint11 = piePlot6.getBaseSectionPaint();
        piePlot0.setLabelPaint(paint11);
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot14 = piePlot13.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor15 = piePlot13.getLabelDistributor();
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot();
        double double17 = piePlot16.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor18 = piePlot16.getLabelDistributor();
        double double19 = piePlot16.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        piePlot16.drawBackgroundImage(graphics2D20, rectangle2D21);
        java.awt.Paint paint24 = piePlot16.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str25 = piePlot16.getNoDataMessage();
        java.awt.Paint paint26 = piePlot16.getLabelOutlinePaint();
        java.awt.Stroke stroke27 = piePlot16.getLabelOutlineStroke();
        piePlot13.setLabelLinkStroke(stroke27);
        java.awt.Paint paint29 = piePlot13.getLabelLinkPaint();
        piePlot0.setLabelBackgroundPaint(paint29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot6 and piePlot13", piePlot6.equals(piePlot13) ? piePlot6.hashCode() == piePlot13.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        boolean boolean5 = piePlot0.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        double double7 = piePlot6.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor8 = piePlot6.getLabelDistributor();
        double double9 = piePlot6.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        piePlot6.drawBackgroundImage(graphics2D10, rectangle2D11);
        java.awt.Paint paint14 = piePlot6.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str15 = piePlot6.getNoDataMessage();
        java.awt.Paint paint16 = piePlot6.getLabelOutlinePaint();
        java.awt.Stroke stroke17 = piePlot6.getLabelOutlineStroke();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent18 = null;
        piePlot6.datasetChanged(datasetChangeEvent18);
        piePlot6.setForegroundAlpha((-1.0f));
        java.lang.Object obj22 = piePlot6.clone();
        double double23 = piePlot6.getLabelGap();
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot();
        double double25 = piePlot24.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup26 = piePlot24.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset27 = null;
        piePlot24.setDataset(pieDataset27);
        int int29 = piePlot24.getPieIndex();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator30 = piePlot24.getLegendLabelGenerator();
        piePlot6.setLabelGenerator(pieSectionLabelGenerator30);
        piePlot0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot6 and obj22", piePlot6.equals(obj22) ? piePlot6.hashCode() == obj22.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
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
        boolean boolean20 = piePlot0.isOutlineVisible();
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator22 = piePlot21.getLegendLabelGenerator();
        double double23 = piePlot21.getMaximumLabelWidth();
        float float24 = piePlot21.getForegroundAlpha();
        int int25 = piePlot21.getPieIndex();
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot();
        double double27 = piePlot26.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup28 = piePlot26.getDatasetGroup();
        piePlot26.setOutlineVisible(true);
        boolean boolean31 = piePlot26.getSectionOutlinesVisible();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator32 = piePlot26.getLegendLabelGenerator();
        piePlot21.setLegendLabelToolTipGenerator(pieSectionLabelGenerator32);
        piePlot0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot7 and piePlot26", piePlot7.equals(piePlot26) ? piePlot7.hashCode() == piePlot26.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
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
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot();
        java.awt.Paint paint31 = piePlot30.getOutlinePaint();
        piePlot0.setLabelPaint(paint31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot15 and piePlot30", piePlot15.equals(piePlot30) ? piePlot15.hashCode() == piePlot30.hashCode() : true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
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
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset18 = null;
        piePlot17.setDataset(pieDataset18);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator20 = piePlot17.getURLGenerator();
        float float21 = piePlot17.getForegroundAlpha();
        java.awt.Stroke stroke22 = piePlot17.getBaseSectionOutlineStroke();
        java.awt.Stroke stroke23 = piePlot17.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot();
        double double25 = piePlot24.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor26 = piePlot24.getLabelDistributor();
        double double27 = piePlot24.getMinimumArcAngleToDraw();
        java.awt.Paint paint28 = piePlot24.getBaseSectionOutlinePaint();
        double double29 = piePlot24.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = piePlot24.getSimpleLabelOffset();
        piePlot17.setLabelPadding(rectangleInsets30);
        piePlot7.setSimpleLabelOffset(rectangleInsets30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot0 and piePlot24", piePlot0.equals(piePlot24) ? piePlot0.hashCode() == piePlot24.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
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
        java.lang.Object obj19 = piePlot0.clone();
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot();
        double double21 = piePlot20.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor22 = piePlot20.getLabelDistributor();
        double double23 = piePlot20.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        piePlot20.drawBackgroundImage(graphics2D24, rectangle2D25);
        java.awt.Paint paint28 = piePlot20.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str29 = piePlot20.getNoDataMessage();
        java.awt.Paint paint30 = piePlot20.getLabelOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = piePlot20.getLabelPadding();
        boolean boolean32 = piePlot20.getSimpleLabels();
        piePlot20.setBackgroundAlpha((float) 10);
        java.awt.Paint paint35 = piePlot20.getLabelBackgroundPaint();
        piePlot0.setLabelBackgroundPaint(paint35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot0 and obj19", piePlot0.equals(obj19) ? piePlot0.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
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
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot();
        double double28 = piePlot27.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor29 = piePlot27.getLabelDistributor();
        double double30 = piePlot27.getMinimumArcAngleToDraw();
        java.awt.Paint paint31 = piePlot27.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier32 = piePlot27.getDrawingSupplier();
        double double33 = piePlot27.getShadowXOffset();
        java.awt.Paint paint34 = piePlot27.getLabelLinkPaint();
        java.awt.Paint paint35 = piePlot27.getLabelLinkPaint();
        piePlot0.setNoDataMessagePaint(paint35);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot10 and piePlot27", piePlot10.equals(piePlot27) ? piePlot10.hashCode() == piePlot27.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot0.setToolTipGenerator(pieToolTipGenerator2);
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset7 = null;
        org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "hi!", "", boxAndWhiskerXYDataset7, false);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart9);
        java.awt.Paint paint11 = piePlot0.getLabelPaint();
        double double12 = piePlot0.getShadowXOffset();
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        double double14 = piePlot13.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor15 = piePlot13.getLabelDistributor();
        double double16 = piePlot13.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        piePlot13.drawBackgroundImage(graphics2D17, rectangle2D18);
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot();
        double double21 = piePlot20.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor22 = piePlot20.getLabelDistributor();
        double double23 = piePlot20.getMinimumArcAngleToDraw();
        java.awt.Paint paint24 = piePlot20.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = piePlot20.getDrawingSupplier();
        piePlot13.setDrawingSupplier(drawingSupplier25);
        piePlot0.setDrawingSupplier(drawingSupplier25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot13 and piePlot20", piePlot13.equals(piePlot20) ? piePlot13.hashCode() == piePlot20.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
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
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup19 = piePlot18.getDatasetGroup();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator20 = null;
        piePlot18.setToolTipGenerator(pieToolTipGenerator20);
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset25 = null;
        org.jfree.chart.JFreeChart jFreeChart27 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "hi!", "", boxAndWhiskerXYDataset25, false);
        piePlot18.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart27);
        java.awt.Paint paint29 = piePlot18.getNoDataMessagePaint();
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot();
        double double31 = piePlot30.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor32 = piePlot30.getLabelDistributor();
        double double33 = piePlot30.getMinimumArcAngleToDraw();
        java.awt.Paint paint34 = piePlot30.getBaseSectionOutlinePaint();
        double double35 = piePlot30.getShadowYOffset();
        piePlot30.setBackgroundImageAlignment((int) (byte) -1);
        double double38 = piePlot30.getInteriorGap();
        org.jfree.chart.plot.PiePlot piePlot39 = new org.jfree.chart.plot.PiePlot();
        double double40 = piePlot39.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor41 = piePlot39.getLabelDistributor();
        double double42 = piePlot39.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D43 = null;
        java.awt.geom.Rectangle2D rectangle2D44 = null;
        piePlot39.drawBackgroundImage(graphics2D43, rectangle2D44);
        java.awt.Paint paint47 = piePlot39.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font48 = piePlot39.getLabelFont();
        piePlot30.setLabelFont(font48);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator50 = piePlot30.getLabelGenerator();
        piePlot18.setLegendLabelGenerator(pieSectionLabelGenerator50);
        piePlot0.setLabelGenerator(pieSectionLabelGenerator50);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot18 and piePlot39", piePlot18.equals(piePlot39) ? piePlot18.hashCode() == piePlot39.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
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
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        double double23 = piePlot22.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor24 = piePlot22.getLabelDistributor();
        double double25 = piePlot22.getMinimumArcAngleToDraw();
        java.awt.Paint paint26 = piePlot22.getBaseSectionOutlinePaint();
        piePlot22.setIgnoreNullValues(false);
        java.awt.Stroke stroke29 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot22.setLabelLinkStroke(stroke29);
        boolean boolean31 = piePlot22.isOutlineVisible();
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot33 = piePlot32.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor34 = piePlot32.getLabelDistributor();
        piePlot22.setParent((org.jfree.chart.plot.Plot) piePlot32);
        org.jfree.data.general.PieDataset pieDataset36 = null;
        piePlot32.setDataset(pieDataset36);
        java.awt.Stroke stroke38 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot32.setOutlineStroke(stroke38);
        piePlot5.setOutlineStroke(stroke38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot14 and piePlot22", piePlot14.equals(piePlot22) ? piePlot14.hashCode() == piePlot22.hashCode() : true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
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
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot();
        double double38 = piePlot37.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup39 = piePlot37.getDatasetGroup();
        piePlot37.setOutlineVisible(true);
        boolean boolean43 = piePlot37.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot44 = new org.jfree.chart.plot.PiePlot();
        double double45 = piePlot44.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor46 = piePlot44.getLabelDistributor();
        double double47 = piePlot44.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D48 = null;
        java.awt.geom.Rectangle2D rectangle2D49 = null;
        piePlot44.drawBackgroundImage(graphics2D48, rectangle2D49);
        java.awt.Paint paint52 = piePlot44.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font53 = piePlot44.getLabelFont();
        piePlot44.setSimpleLabels(false);
        java.awt.Paint paint56 = piePlot44.getLabelPaint();
        org.jfree.chart.plot.PiePlot piePlot57 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset58 = null;
        piePlot57.setDataset(pieDataset58);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator60 = piePlot57.getURLGenerator();
        piePlot57.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator63 = piePlot57.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot64 = new org.jfree.chart.plot.PiePlot();
        double double65 = piePlot64.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor66 = piePlot64.getLabelDistributor();
        double double67 = piePlot64.getMinimumArcAngleToDraw();
        boolean boolean68 = piePlot64.getIgnoreZeroValues();
        boolean boolean69 = piePlot64.isSubplot();
        piePlot64.setCircular(false);
        java.awt.Paint paint73 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot64.setSectionOutlinePaint((java.lang.Comparable) "", paint73);
        piePlot57.setNoDataMessagePaint(paint73);
        piePlot44.setLabelBackgroundPaint(paint73);
        piePlot37.setBaseSectionPaint(paint73);
        piePlot0.setBaseSectionOutlinePaint(paint73);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot24 and piePlot44", piePlot24.equals(piePlot44) ? piePlot24.hashCode() == piePlot44.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
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
        double double20 = piePlot0.getMinimumArcAngleToDraw();
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator22 = piePlot21.getLegendLabelGenerator();
        double double23 = piePlot21.getMaximumLabelWidth();
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot();
        double double25 = piePlot24.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor26 = piePlot24.getLabelDistributor();
        double double27 = piePlot24.getMinimumArcAngleToDraw();
        java.awt.Paint paint28 = piePlot24.getBaseSectionOutlinePaint();
        piePlot24.setIgnoreNullValues(false);
        java.awt.Paint paint31 = piePlot24.getNoDataMessagePaint();
        java.awt.Stroke stroke33 = piePlot24.getSectionOutlineStroke((java.lang.Comparable) 52.0d);
        org.jfree.chart.util.Rotation rotation34 = piePlot24.getDirection();
        piePlot21.setDirection(rotation34);
        piePlot0.setDirection(rotation34);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot7 and piePlot21", piePlot7.equals(piePlot21) ? piePlot7.hashCode() == piePlot21.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
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
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot();
        double double28 = piePlot27.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor29 = piePlot27.getLabelDistributor();
        double double30 = piePlot27.getMinimumArcAngleToDraw();
        java.awt.Paint paint31 = piePlot27.getBaseSectionOutlinePaint();
        piePlot27.setIgnoreNullValues(false);
        java.awt.Stroke stroke34 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot27.setLabelLinkStroke(stroke34);
        java.awt.Paint paint36 = piePlot27.getShadowPaint();
        piePlot0.setLabelShadowPaint(paint36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot27", piePlot11.equals(piePlot27) ? piePlot11.hashCode() == piePlot27.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        boolean boolean1 = piePlot0.getSimpleLabels();
        org.jfree.chart.plot.PiePlot piePlot2 = new org.jfree.chart.plot.PiePlot();
        double double3 = piePlot2.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot2.getLabelDistributor();
        double double5 = piePlot2.getMinimumArcAngleToDraw();
        java.awt.Paint paint6 = piePlot2.getBaseSectionOutlinePaint();
        piePlot2.setIgnoreNullValues(false);
        java.awt.Stroke stroke9 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot2.setLabelLinkStroke(stroke9);
        boolean boolean11 = piePlot2.isOutlineVisible();
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot13 = piePlot12.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor14 = piePlot12.getLabelDistributor();
        piePlot2.setParent((org.jfree.chart.plot.Plot) piePlot12);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        piePlot12.setDataset(pieDataset16);
        java.awt.Stroke stroke18 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot12.setOutlineStroke(stroke18);
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator21 = piePlot20.getLegendLabelGenerator();
        piePlot20.setOutlineVisible(true);
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot();
        double double25 = piePlot24.getMaximumLabelWidth();
        piePlot24.setForegroundAlpha((float) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot24.setInsets(rectangleInsets28);
        piePlot20.setLabelPadding(rectangleInsets28);
        piePlot12.setLabelPadding(rectangleInsets28);
        piePlot0.setLabelPadding(rectangleInsets28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot12 and piePlot20", piePlot12.equals(piePlot20) ? piePlot12.hashCode() == piePlot20.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        java.awt.Paint paint6 = piePlot0.getShadowPaint();
        boolean boolean7 = piePlot0.getIgnoreZeroValues();
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        double double9 = piePlot8.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor10 = piePlot8.getLabelDistributor();
        java.awt.Paint paint11 = piePlot8.getLabelOutlinePaint();
        piePlot8.setStartAngle((double) (byte) 10);
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot();
        double double15 = piePlot14.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor16 = piePlot14.getLabelDistributor();
        double double17 = piePlot14.getMinimumArcAngleToDraw();
        java.awt.Paint paint18 = piePlot14.getBaseSectionOutlinePaint();
        java.awt.Paint paint19 = piePlot14.getBaseSectionPaint();
        piePlot8.setLabelPaint(paint19);
        piePlot0.setBackgroundPaint(paint19);
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        double double23 = piePlot22.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup24 = piePlot22.getDatasetGroup();
        piePlot22.setOutlineVisible(true);
        boolean boolean28 = piePlot22.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot();
        double double30 = piePlot29.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor31 = piePlot29.getLabelDistributor();
        double double32 = piePlot29.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D33 = null;
        java.awt.geom.Rectangle2D rectangle2D34 = null;
        piePlot29.drawBackgroundImage(graphics2D33, rectangle2D34);
        java.awt.Paint paint37 = piePlot29.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font38 = piePlot29.getLabelFont();
        piePlot22.setNoDataMessageFont(font38);
        boolean boolean40 = piePlot22.isOutlineVisible();
        double double41 = piePlot22.getLabelGap();
        java.awt.Paint paint42 = piePlot22.getLabelLinkPaint();
        piePlot0.setShadowPaint(paint42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot14 and piePlot29", piePlot14.equals(piePlot29) ? piePlot14.hashCode() == piePlot29.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent2 = null;
        piePlot0.datasetChanged(datasetChangeEvent2);
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        piePlot5.setDataset(pieDataset6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot5.getURLGenerator();
        org.jfree.chart.plot.Plot plot9 = piePlot5.getRootPlot();
        java.awt.Stroke stroke10 = piePlot5.getLabelOutlineStroke();
        java.awt.Shape shape11 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot5.setLegendItemShape(shape11);
        java.awt.Stroke stroke13 = piePlot5.getLabelLinkStroke();
        java.awt.Font font14 = piePlot5.getNoDataMessageFont();
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator17 = piePlot16.getLegendLabelGenerator();
        double double18 = piePlot16.getMaximumLabelWidth();
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
        piePlot16.setShadowPaint(paint48);
        piePlot5.setSectionPaint((java.lang.Comparable) 1L, paint48);
        piePlot0.setSectionOutlinePaint((java.lang.Comparable) 90.0d, paint48);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator1 and pieSectionLabelGenerator17", pieSectionLabelGenerator1.equals(pieSectionLabelGenerator17) ? pieSectionLabelGenerator1.hashCode() == pieSectionLabelGenerator17.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        piePlot0.setDataset(pieDataset3);
        int int5 = piePlot0.getPieIndex();
        java.awt.Paint paint6 = piePlot0.getLabelLinkPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = null;
        piePlot0.setLegendLabelURLGenerator(pieURLGenerator7);
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot();
        double double10 = piePlot9.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup11 = piePlot9.getDatasetGroup();
        java.awt.Paint paint12 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot9.setNoDataMessagePaint(paint12);
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset15 = null;
        piePlot14.setDataset(pieDataset15);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator17 = piePlot14.getURLGenerator();
        org.jfree.chart.plot.Plot plot18 = piePlot14.getRootPlot();
        java.awt.Stroke stroke19 = piePlot14.getLabelOutlineStroke();
        piePlot9.setLabelLinkStroke(stroke19);
        org.jfree.chart.util.Rotation rotation21 = piePlot9.getDirection();
        int int22 = piePlot9.getPieIndex();
        piePlot9.setIgnoreZeroValues(false);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = piePlot9.getLabelPadding();
        piePlot0.setInsets(rectangleInsets25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot9 and piePlot14", piePlot9.equals(piePlot14) ? piePlot9.hashCode() == piePlot14.hashCode() : true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        piePlot0.setBackgroundAlpha((float) (byte) 0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot0.getLegendLabelGenerator();
        java.awt.Stroke stroke6 = piePlot0.getLabelOutlineStroke();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator7 = piePlot0.getLabelGenerator();
        piePlot0.setExplodePercent((java.lang.Comparable) 10L, 1.0E-5d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator5 and pieSectionLabelGenerator7", pieSectionLabelGenerator5.equals(pieSectionLabelGenerator7) ? pieSectionLabelGenerator5.hashCode() == pieSectionLabelGenerator7.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
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
        java.lang.String str15 = piePlot6.getNoDataMessage();
        java.awt.Paint paint16 = piePlot6.getLabelOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = piePlot6.getLabelPadding();
        piePlot0.setSimpleLabelOffset(rectangleInsets17);
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot20 = piePlot19.getParent();
        java.awt.Stroke stroke21 = piePlot19.getBaseSectionOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = piePlot19.getLabelPadding();
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot(pieDataset23);
        piePlot24.zoom(0.4d);
        java.awt.Stroke stroke28 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot24.setSectionOutlineStroke((java.lang.Comparable) false, stroke28);
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot();
        double double32 = piePlot31.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor33 = piePlot31.getLabelDistributor();
        java.awt.Paint paint34 = piePlot31.getLabelOutlinePaint();
        piePlot24.setSectionPaint((java.lang.Comparable) 1.0E-5d, paint34);
        piePlot19.setLabelLinkPaint(paint34);
        java.awt.Stroke stroke37 = piePlot19.getLabelOutlineStroke();
        piePlot0.setLabelOutlineStroke(stroke37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot6 and piePlot19", piePlot6.equals(piePlot19) ? piePlot6.hashCode() == piePlot19.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
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
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        piePlot0.drawBackgroundImage(graphics2D20, rectangle2D21);
        boolean boolean23 = piePlot0.getLabelLinksVisible();
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot();
        double double25 = piePlot24.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor26 = piePlot24.getLabelDistributor();
        double double27 = piePlot24.getMinimumArcAngleToDraw();
        java.awt.Paint paint28 = piePlot24.getBaseSectionOutlinePaint();
        piePlot24.setIgnoreNullValues(false);
        java.awt.Stroke stroke31 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot24.setLabelLinkStroke(stroke31);
        java.awt.Stroke stroke33 = piePlot24.getLabelLinkStroke();
        piePlot0.setBaseSectionOutlineStroke(stroke33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot10 and piePlot24", piePlot10.equals(piePlot24) ? piePlot10.hashCode() == piePlot24.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
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
        piePlot7.setCircular(false, false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot0 and piePlot11", piePlot0.equals(piePlot11) ? piePlot0.hashCode() == piePlot11.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
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
        org.jfree.data.general.DatasetGroup datasetGroup13 = piePlot11.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        piePlot11.setDataset(pieDataset14);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot11.setInsets(rectangleInsets16, false);
        piePlot0.setInsets(rectangleInsets16, true);
        java.lang.String str21 = piePlot0.getPlotType();
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        double double23 = piePlot22.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor24 = piePlot22.getLabelDistributor();
        double double25 = piePlot22.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        piePlot22.drawBackgroundImage(graphics2D26, rectangle2D27);
        java.awt.Paint paint30 = piePlot22.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font31 = piePlot22.getLabelFont();
        piePlot22.setSimpleLabels(false);
        java.awt.Paint paint34 = piePlot22.getLabelPaint();
        java.awt.Paint paint35 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot22.setLabelOutlinePaint(paint35);
        piePlot22.setStartAngle((double) 100L);
        java.awt.Paint paint39 = piePlot22.getLabelShadowPaint();
        java.awt.Image image40 = null;
        piePlot22.setBackgroundImage(image40);
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot();
        double double43 = piePlot42.getMaximumLabelWidth();
        piePlot42.setForegroundAlpha(100.0f);
        org.jfree.chart.plot.PiePlot piePlot46 = new org.jfree.chart.plot.PiePlot();
        double double47 = piePlot46.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor48 = piePlot46.getLabelDistributor();
        double double49 = piePlot46.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D50 = null;
        java.awt.geom.Rectangle2D rectangle2D51 = null;
        piePlot46.drawBackgroundImage(graphics2D50, rectangle2D51);
        java.awt.Paint paint54 = piePlot46.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str55 = piePlot46.getNoDataMessage();
        java.awt.Paint paint56 = piePlot46.getLabelOutlinePaint();
        piePlot42.setBaseSectionOutlinePaint(paint56);
        boolean boolean58 = piePlot22.equals((java.lang.Object) piePlot42);
        piePlot22.setBackgroundImageAlignment((-1));
        org.jfree.chart.util.RectangleInsets rectangleInsets61 = piePlot22.getInsets();
        piePlot0.setInsets(rectangleInsets61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot46", piePlot11.equals(piePlot46) ? piePlot11.hashCode() == piePlot46.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
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
        org.jfree.chart.plot.PiePlot piePlot69 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset70 = null;
        piePlot69.setDataset(pieDataset70);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator72 = piePlot69.getURLGenerator();
        org.jfree.chart.plot.Plot plot73 = piePlot69.getRootPlot();
        java.awt.Stroke stroke74 = piePlot69.getLabelOutlineStroke();
        java.awt.Shape shape75 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot69.setLegendItemShape(shape75);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator77 = piePlot69.getLegendLabelURLGenerator();
        java.awt.Paint paint78 = piePlot69.getShadowPaint();
        org.jfree.chart.plot.PiePlot piePlot79 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset80 = null;
        piePlot79.setDataset(pieDataset80);
        int int82 = piePlot79.getPieIndex();
        double double83 = piePlot79.getShadowXOffset();
        java.awt.Stroke stroke84 = piePlot79.getOutlineStroke();
        piePlot69.setLabelOutlineStroke(stroke84);
        piePlot0.setLabelOutlineStroke(stroke84);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot79", piePlot11.equals(piePlot79) ? piePlot11.hashCode() == piePlot79.hashCode() : true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
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
        java.awt.Stroke stroke25 = piePlot14.getLabelOutlineStroke();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent26 = null;
        piePlot14.datasetChanged(datasetChangeEvent26);
        piePlot14.setForegroundAlpha((-1.0f));
        java.lang.Object obj30 = piePlot14.clone();
        double double31 = piePlot14.getLabelGap();
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot();
        double double33 = piePlot32.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup34 = piePlot32.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset35 = null;
        piePlot32.setDataset(pieDataset35);
        int int37 = piePlot32.getPieIndex();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator38 = piePlot32.getLegendLabelGenerator();
        piePlot14.setLabelGenerator(pieSectionLabelGenerator38);
        piePlot0.setLabelGenerator(pieSectionLabelGenerator38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot14 and obj30", piePlot14.equals(obj30) ? piePlot14.hashCode() == obj30.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        java.lang.String str2 = piePlot0.getPlotType();
        org.jfree.data.general.PieDataset pieDataset3 = piePlot0.getDataset();
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot5 = piePlot4.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor6 = piePlot4.getLabelDistributor();
        java.awt.Paint paint7 = piePlot4.getLabelOutlinePaint();
        boolean boolean8 = piePlot4.isOutlineVisible();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator9 = piePlot4.getToolTipGenerator();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator10 = piePlot4.getLabelGenerator();
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot11.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor13 = piePlot11.getLabelDistributor();
        double double14 = piePlot11.getMinimumArcAngleToDraw();
        java.awt.Paint paint15 = piePlot11.getBaseSectionOutlinePaint();
        java.awt.Paint paint16 = piePlot11.getBaseSectionPaint();
        java.awt.Paint paint17 = piePlot11.getShadowPaint();
        piePlot4.setBaseSectionOutlinePaint(paint17);
        java.awt.Stroke stroke19 = piePlot4.getLabelLinkStroke();
        piePlot0.setLabelOutlineStroke(stroke19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot4 and piePlot11", piePlot4.equals(piePlot11) ? piePlot4.hashCode() == piePlot11.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        org.jfree.data.xy.XYDataset xYDataset5 = null;
        org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createPolarChart("", xYDataset5, false, false, true);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart9);
        piePlot0.setMaximumLabelWidth((double) (-1));
        boolean boolean13 = piePlot0.getIgnoreZeroValues();
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset15 = null;
        piePlot14.setDataset(pieDataset15);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator17 = piePlot14.getURLGenerator();
        piePlot14.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator20 = piePlot14.getLegendLabelToolTipGenerator();
        boolean boolean21 = piePlot14.getSimpleLabels();
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        double double23 = piePlot22.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor24 = piePlot22.getLabelDistributor();
        double double25 = piePlot22.getMinimumArcAngleToDraw();
        java.awt.Paint paint26 = piePlot22.getBaseSectionOutlinePaint();
        double double27 = piePlot22.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = piePlot22.getSimpleLabelOffset();
        double double29 = piePlot22.getLabelLinkMargin();
        double double30 = piePlot22.getStartAngle();
        piePlot14.setParent((org.jfree.chart.plot.Plot) piePlot22);
        boolean boolean32 = piePlot14.getIgnoreZeroValues();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = piePlot14.getInsets();
        piePlot0.setInsets(rectangleInsets33, true);
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot();
        double double37 = piePlot36.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup38 = piePlot36.getDatasetGroup();
        java.awt.Paint paint39 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot36.setNoDataMessagePaint(paint39);
        double double42 = piePlot36.getExplodePercent((java.lang.Comparable) (-1));
        org.jfree.chart.plot.PiePlot piePlot43 = new org.jfree.chart.plot.PiePlot();
        double double44 = piePlot43.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor45 = piePlot43.getLabelDistributor();
        double double46 = piePlot43.getMinimumArcAngleToDraw();
        java.awt.Paint paint47 = piePlot43.getBaseSectionOutlinePaint();
        java.awt.Paint paint48 = piePlot43.getBaseSectionPaint();
        piePlot43.setCircular(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier51 = piePlot43.getDrawingSupplier();
        piePlot36.setDrawingSupplier(drawingSupplier51);
        piePlot0.setDrawingSupplier(drawingSupplier51);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot22 and piePlot36", piePlot22.equals(piePlot36) ? piePlot22.hashCode() == piePlot36.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
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
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot();
        double double21 = piePlot20.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor22 = piePlot20.getLabelDistributor();
        double double23 = piePlot20.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        piePlot20.drawBackgroundImage(graphics2D24, rectangle2D25);
        java.awt.Paint paint28 = piePlot20.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font29 = piePlot20.getLabelFont();
        piePlot20.setSimpleLabels(false);
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset33 = null;
        piePlot32.setDataset(pieDataset33);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator35 = piePlot32.getURLGenerator();
        org.jfree.chart.plot.Plot plot36 = piePlot32.getRootPlot();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor37 = piePlot32.getLabelDistributor();
        piePlot20.setLabelDistributor(abstractPieLabelDistributor37);
        piePlot0.setLabelDistributor(abstractPieLabelDistributor37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot10 and piePlot20", piePlot10.equals(piePlot20) ? piePlot10.hashCode() == piePlot20.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
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
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot();
        double double27 = piePlot26.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor28 = piePlot26.getLabelDistributor();
        double double29 = piePlot26.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        piePlot26.drawBackgroundImage(graphics2D30, rectangle2D31);
        java.awt.Paint paint34 = piePlot26.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str35 = piePlot26.getNoDataMessage();
        java.awt.Paint paint36 = piePlot26.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot();
        double double38 = piePlot37.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor39 = piePlot37.getLabelDistributor();
        double double40 = piePlot37.getMinimumArcAngleToDraw();
        java.awt.Paint paint41 = piePlot37.getBaseSectionOutlinePaint();
        double double42 = piePlot37.getShadowYOffset();
        piePlot37.setOutlineVisible(true);
        java.awt.Paint paint45 = piePlot37.getLabelPaint();
        piePlot26.setNoDataMessagePaint(paint45);
        piePlot8.setLabelLinkPaint(paint45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot18 and piePlot26", piePlot18.equals(piePlot26) ? piePlot18.hashCode() == piePlot26.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
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
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator21 = piePlot0.getLegendLabelGenerator();
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        double double23 = piePlot22.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor24 = piePlot22.getLabelDistributor();
        double double25 = piePlot22.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        piePlot22.drawBackgroundImage(graphics2D26, rectangle2D27);
        java.awt.Paint paint30 = piePlot22.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str31 = piePlot22.getNoDataMessage();
        java.awt.Paint paint32 = piePlot22.getLabelOutlinePaint();
        java.awt.Stroke stroke33 = piePlot22.getLabelOutlineStroke();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent34 = null;
        piePlot22.datasetChanged(datasetChangeEvent34);
        piePlot22.setForegroundAlpha((-1.0f));
        java.lang.Object obj38 = piePlot22.clone();
        double double39 = piePlot22.getLabelGap();
        org.jfree.chart.plot.PiePlot piePlot40 = new org.jfree.chart.plot.PiePlot();
        double double41 = piePlot40.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup42 = piePlot40.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset43 = null;
        piePlot40.setDataset(pieDataset43);
        int int45 = piePlot40.getPieIndex();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator46 = piePlot40.getLegendLabelGenerator();
        piePlot22.setLabelGenerator(pieSectionLabelGenerator46);
        piePlot0.setLabelGenerator(pieSectionLabelGenerator46);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot22 and obj38", piePlot22.equals(obj38) ? piePlot22.hashCode() == obj38.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double2 = piePlot0.getExplodePercent((java.lang.Comparable) 0);
        piePlot0.setIgnoreZeroValues(false);
        piePlot0.zoom((double) 1L);
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double8 = piePlot7.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup9 = piePlot7.getDatasetGroup();
        piePlot7.setOutlineVisible(true);
        boolean boolean13 = piePlot7.equals((java.lang.Object) true);
        java.awt.Paint paint15 = piePlot7.getSectionPaint((java.lang.Comparable) 10);
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot();
        double double17 = piePlot16.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor18 = piePlot16.getLabelDistributor();
        double double19 = piePlot16.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        piePlot16.drawBackgroundImage(graphics2D20, rectangle2D21);
        java.awt.Paint paint24 = piePlot16.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str25 = piePlot16.getNoDataMessage();
        java.awt.Paint paint26 = piePlot16.getLabelOutlinePaint();
        java.awt.Paint paint27 = piePlot16.getNoDataMessagePaint();
        java.awt.Image image28 = piePlot16.getBackgroundImage();
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot();
        double double30 = piePlot29.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor31 = piePlot29.getLabelDistributor();
        double double32 = piePlot29.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D33 = null;
        java.awt.geom.Rectangle2D rectangle2D34 = null;
        piePlot29.drawBackgroundImage(graphics2D33, rectangle2D34);
        java.awt.Paint paint37 = piePlot29.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str38 = piePlot29.getNoDataMessage();
        piePlot29.setNoDataMessage("hi!");
        java.awt.Stroke stroke41 = piePlot29.getOutlineStroke();
        java.awt.Shape shape42 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot29.setLegendItemShape(shape42);
        piePlot16.setLegendItemShape(shape42);
        piePlot7.setLegendItemShape(shape42);
        piePlot0.setLegendItemShape(shape42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot7 and piePlot16", piePlot7.equals(piePlot16) ? piePlot7.hashCode() == piePlot16.hashCode() : true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        java.awt.Stroke stroke5 = piePlot0.getLabelOutlineStroke();
        java.awt.Shape shape6 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot0.setLegendItemShape(shape6);
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        double double9 = piePlot8.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor10 = piePlot8.getLabelDistributor();
        java.lang.String str11 = piePlot8.getPlotType();
        org.jfree.data.general.DatasetGroup datasetGroup12 = piePlot8.getDatasetGroup();
        java.awt.Shape shape13 = piePlot8.getLegendItemShape();
        piePlot0.setLegendItemShape(shape13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot0 and piePlot8", piePlot0.equals(piePlot8) ? piePlot0.hashCode() == piePlot8.hashCode() : true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
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
        piePlot12.setCircular(false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot0 and piePlot17", piePlot0.equals(piePlot17) ? piePlot0.hashCode() == piePlot17.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.lang.String str3 = piePlot0.getPlotType();
        org.jfree.data.general.DatasetGroup datasetGroup4 = piePlot0.getDatasetGroup();
        java.awt.Shape shape5 = piePlot0.getLegendItemShape();
        boolean boolean6 = piePlot0.isOutlineVisible();
        piePlot0.setMaximumLabelWidth((double) (byte) 100);
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator10 = piePlot9.getLegendLabelGenerator();
        java.awt.Font font11 = piePlot9.getLabelFont();
        piePlot0.setLabelFont(font11);
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        double double14 = piePlot13.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor15 = piePlot13.getLabelDistributor();
        double double16 = piePlot13.getMinimumArcAngleToDraw();
        java.awt.Paint paint17 = piePlot13.getBaseSectionOutlinePaint();
        piePlot13.setIgnoreNullValues(false);
        java.awt.Paint paint20 = piePlot13.getNoDataMessagePaint();
        java.awt.Stroke stroke22 = piePlot13.getSectionOutlineStroke((java.lang.Comparable) 52.0d);
        org.jfree.chart.util.Rotation rotation23 = piePlot13.getDirection();
        piePlot0.setDirection(rotation23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot9 and piePlot13", piePlot9.equals(piePlot13) ? piePlot9.hashCode() == piePlot13.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
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
        piePlot0.setNoDataMessage("");
        org.jfree.chart.plot.Plot plot37 = piePlot0.getParent();
        double double38 = piePlot0.getShadowXOffset();
        org.jfree.chart.plot.PiePlot piePlot39 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset40 = null;
        piePlot39.setDataset(pieDataset40);
        int int42 = piePlot39.getPieIndex();
        org.jfree.chart.plot.PiePlot piePlot44 = new org.jfree.chart.plot.PiePlot();
        double double45 = piePlot44.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup46 = piePlot44.getDatasetGroup();
        piePlot44.setOutlineVisible(true);
        boolean boolean50 = piePlot44.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot51 = new org.jfree.chart.plot.PiePlot();
        double double52 = piePlot51.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor53 = piePlot51.getLabelDistributor();
        double double54 = piePlot51.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D55 = null;
        java.awt.geom.Rectangle2D rectangle2D56 = null;
        piePlot51.drawBackgroundImage(graphics2D55, rectangle2D56);
        java.awt.Paint paint59 = piePlot51.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font60 = piePlot51.getLabelFont();
        piePlot44.setNoDataMessageFont(font60);
        boolean boolean62 = piePlot44.isOutlineVisible();
        double double63 = piePlot44.getLabelGap();
        java.awt.Paint paint64 = piePlot44.getLabelLinkPaint();
        piePlot39.setSectionPaint((java.lang.Comparable) 0.0d, paint64);
        piePlot0.setLabelBackgroundPaint(paint64);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot21 and piePlot51", piePlot21.equals(piePlot51) ? piePlot21.hashCode() == piePlot51.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
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
        java.awt.Paint paint22 = piePlot0.getLabelPaint();
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot();
        double double25 = piePlot24.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor26 = piePlot24.getLabelDistributor();
        double double27 = piePlot24.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        piePlot24.drawBackgroundImage(graphics2D28, rectangle2D29);
        java.awt.Paint paint32 = piePlot24.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font33 = piePlot24.getLabelFont();
        piePlot24.setSimpleLabels(false);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor36 = piePlot24.getLabelDistributor();
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset38 = null;
        piePlot37.setDataset(pieDataset38);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator40 = piePlot37.getURLGenerator();
        float float41 = piePlot37.getForegroundAlpha();
        java.awt.Stroke stroke42 = piePlot37.getBaseSectionOutlineStroke();
        piePlot24.setBaseSectionOutlineStroke(stroke42);
        piePlot0.setSectionOutlineStroke((java.lang.Comparable) 100.0f, stroke42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot24 and piePlot37", piePlot24.equals(piePlot37) ? piePlot24.hashCode() == piePlot37.hashCode() : true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
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
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot();
        double double28 = piePlot27.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup29 = piePlot27.getDatasetGroup();
        piePlot27.setOutlineVisible(true);
        boolean boolean33 = piePlot27.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot();
        double double35 = piePlot34.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor36 = piePlot34.getLabelDistributor();
        double double37 = piePlot34.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D38 = null;
        java.awt.geom.Rectangle2D rectangle2D39 = null;
        piePlot34.drawBackgroundImage(graphics2D38, rectangle2D39);
        java.awt.Paint paint42 = piePlot34.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font43 = piePlot34.getLabelFont();
        piePlot34.setSimpleLabels(false);
        java.awt.Paint paint46 = piePlot34.getLabelPaint();
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
        piePlot34.setLabelBackgroundPaint(paint63);
        piePlot27.setBaseSectionPaint(paint63);
        piePlot0.setLabelLinkPaint(paint63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot10 and piePlot34", piePlot10.equals(piePlot34) ? piePlot10.hashCode() == piePlot34.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
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
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot23 = piePlot22.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor24 = piePlot22.getLabelDistributor();
        piePlot0.setLabelDistributor(abstractPieLabelDistributor24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot22", piePlot11.equals(piePlot22) ? piePlot11.hashCode() == piePlot22.hashCode() : true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
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
        org.jfree.chart.plot.PiePlot piePlot44 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset45 = null;
        piePlot44.setDataset(pieDataset45);
        int int47 = piePlot44.getPieIndex();
        piePlot44.setSectionOutlinesVisible(true);
        piePlot44.setIgnoreNullValues(false);
        org.jfree.chart.plot.PiePlot piePlot52 = new org.jfree.chart.plot.PiePlot();
        double double53 = piePlot52.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor54 = piePlot52.getLabelDistributor();
        double double55 = piePlot52.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D56 = null;
        java.awt.geom.Rectangle2D rectangle2D57 = null;
        piePlot52.drawBackgroundImage(graphics2D56, rectangle2D57);
        java.awt.Paint paint60 = piePlot52.getSectionPaint((java.lang.Comparable) false);
        double double61 = piePlot52.getShadowXOffset();
        org.jfree.data.general.DatasetGroup datasetGroup62 = piePlot52.getDatasetGroup();
        org.jfree.chart.util.Rotation rotation63 = piePlot52.getDirection();
        piePlot44.setDirection(rotation63);
        piePlot0.setDirection(rotation63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot12 and piePlot31", piePlot12.equals(piePlot31) ? piePlot12.hashCode() == piePlot31.hashCode() : true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
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
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.JFreeChart jFreeChart23 = org.jfree.chart.ChartFactory.createRingChart("Pie Plot", pieDataset19, true, false, false);
        piePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart23);
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
        piePlot32.setSimpleLabels(false);
        java.awt.Paint paint44 = piePlot32.getLabelPaint();
        org.jfree.chart.plot.PiePlot piePlot45 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset46 = null;
        piePlot45.setDataset(pieDataset46);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator48 = piePlot45.getURLGenerator();
        piePlot45.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator51 = piePlot45.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot52 = new org.jfree.chart.plot.PiePlot();
        double double53 = piePlot52.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor54 = piePlot52.getLabelDistributor();
        double double55 = piePlot52.getMinimumArcAngleToDraw();
        boolean boolean56 = piePlot52.getIgnoreZeroValues();
        boolean boolean57 = piePlot52.isSubplot();
        piePlot52.setCircular(false);
        java.awt.Paint paint61 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot52.setSectionOutlinePaint((java.lang.Comparable) "", paint61);
        piePlot45.setNoDataMessagePaint(paint61);
        piePlot32.setLabelBackgroundPaint(paint61);
        piePlot25.setBaseSectionPaint(paint61);
        piePlot0.setLabelLinkPaint(paint61);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot8 and piePlot32", piePlot8.equals(piePlot32) ? piePlot8.hashCode() == piePlot32.hashCode() : true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        float float4 = piePlot0.getForegroundAlpha();
        java.awt.Stroke stroke5 = piePlot0.getBaseSectionOutlineStroke();
        java.awt.Stroke stroke6 = piePlot0.getLabelLinkStroke();
        piePlot0.setNoDataMessage("Pie Plot");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent9 = null;
        piePlot0.markerChanged(markerChangeEvent9);
        java.awt.Paint paint11 = piePlot0.getLabelPaint();
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset13 = null;
        piePlot12.setDataset(pieDataset13);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator15 = piePlot12.getURLGenerator();
        org.jfree.chart.plot.Plot plot16 = piePlot12.getRootPlot();
        double double17 = piePlot12.getLabelGap();
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
        java.awt.Paint paint30 = piePlot18.getLabelPaint();
        java.awt.Paint paint31 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot18.setLabelOutlinePaint(paint31);
        piePlot18.setStartAngle((double) 100L);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator35 = piePlot18.getToolTipGenerator();
        java.awt.Paint paint36 = piePlot18.getLabelBackgroundPaint();
        piePlot12.setLabelLinkPaint(paint36);
        java.awt.Stroke stroke38 = piePlot12.getLabelLinkStroke();
        piePlot0.setLabelOutlineStroke(stroke38);
        org.jfree.chart.plot.PiePlot piePlot40 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot41 = piePlot40.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor42 = piePlot40.getLabelDistributor();
        java.awt.Paint paint43 = piePlot40.getLabelOutlinePaint();
        boolean boolean44 = piePlot40.isOutlineVisible();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator45 = piePlot40.getToolTipGenerator();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator46 = piePlot40.getLabelGenerator();
        org.jfree.chart.plot.PiePlot piePlot47 = new org.jfree.chart.plot.PiePlot();
        double double48 = piePlot47.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor49 = piePlot47.getLabelDistributor();
        double double50 = piePlot47.getMinimumArcAngleToDraw();
        java.awt.Paint paint51 = piePlot47.getBaseSectionOutlinePaint();
        java.awt.Paint paint52 = piePlot47.getBaseSectionPaint();
        java.awt.Paint paint53 = piePlot47.getShadowPaint();
        piePlot40.setBaseSectionOutlinePaint(paint53);
        java.awt.Stroke stroke55 = piePlot40.getLabelLinkStroke();
        piePlot0.setBaseSectionOutlineStroke(stroke55);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot40 and piePlot47", piePlot40.equals(piePlot47) ? piePlot40.hashCode() == piePlot47.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
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
        java.awt.Font font24 = piePlot0.getLabelFont();
        java.lang.Object obj25 = piePlot0.clone();
        java.awt.Image image26 = piePlot0.getBackgroundImage();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot0 and obj25", piePlot0.equals(obj25) ? piePlot0.hashCode() == obj25.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
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
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup26 = piePlot25.getDatasetGroup();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator27 = null;
        piePlot25.setToolTipGenerator(pieToolTipGenerator27);
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset32 = null;
        org.jfree.chart.JFreeChart jFreeChart34 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "hi!", "", boxAndWhiskerXYDataset32, false);
        piePlot25.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart34);
        java.awt.Paint paint36 = piePlot25.getLabelPaint();
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot();
        double double38 = piePlot37.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup39 = piePlot37.getDatasetGroup();
        piePlot37.setOutlineVisible(true);
        boolean boolean43 = piePlot37.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot44 = new org.jfree.chart.plot.PiePlot();
        double double45 = piePlot44.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor46 = piePlot44.getLabelDistributor();
        double double47 = piePlot44.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D48 = null;
        java.awt.geom.Rectangle2D rectangle2D49 = null;
        piePlot44.drawBackgroundImage(graphics2D48, rectangle2D49);
        java.awt.Paint paint52 = piePlot44.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font53 = piePlot44.getLabelFont();
        piePlot44.setSimpleLabels(false);
        java.awt.Paint paint56 = piePlot44.getLabelPaint();
        org.jfree.chart.plot.PiePlot piePlot57 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset58 = null;
        piePlot57.setDataset(pieDataset58);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator60 = piePlot57.getURLGenerator();
        piePlot57.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator63 = piePlot57.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot64 = new org.jfree.chart.plot.PiePlot();
        double double65 = piePlot64.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor66 = piePlot64.getLabelDistributor();
        double double67 = piePlot64.getMinimumArcAngleToDraw();
        boolean boolean68 = piePlot64.getIgnoreZeroValues();
        boolean boolean69 = piePlot64.isSubplot();
        piePlot64.setCircular(false);
        java.awt.Paint paint73 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot64.setSectionOutlinePaint((java.lang.Comparable) "", paint73);
        piePlot57.setNoDataMessagePaint(paint73);
        piePlot44.setLabelBackgroundPaint(paint73);
        piePlot37.setBaseSectionPaint(paint73);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator78 = piePlot37.getLabelGenerator();
        piePlot25.setLegendLabelToolTipGenerator(pieSectionLabelGenerator78);
        piePlot0.setLabelGenerator(pieSectionLabelGenerator78);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot44", piePlot11.equals(piePlot44) ? piePlot11.hashCode() == piePlot44.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
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
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset31 = null;
        piePlot30.setDataset(pieDataset31);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator33 = piePlot30.getURLGenerator();
        org.jfree.chart.plot.Plot plot34 = piePlot30.getRootPlot();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor35 = piePlot30.getLabelDistributor();
        org.jfree.data.general.PieDataset pieDataset36 = piePlot30.getDataset();
        java.awt.Stroke stroke37 = piePlot30.getLabelLinkStroke();
        piePlot0.setBaseSectionOutlineStroke(stroke37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot30", piePlot11.equals(piePlot30) ? piePlot11.hashCode() == piePlot30.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
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
        boolean boolean19 = piePlot0.isCircular();
        java.lang.Object obj20 = piePlot0.clone();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent21 = null;
        piePlot0.axisChanged(axisChangeEvent21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot0 and obj20", piePlot0.equals(obj20) ? piePlot0.hashCode() == obj20.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
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
        java.awt.Image image20 = piePlot0.getBackgroundImage();
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        double double23 = piePlot22.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor24 = piePlot22.getLabelDistributor();
        double double25 = piePlot22.getMinimumArcAngleToDraw();
        java.awt.Paint paint26 = piePlot22.getBaseSectionOutlinePaint();
        java.awt.Paint paint27 = piePlot22.getBaseSectionPaint();
        java.awt.Paint paint28 = piePlot22.getShadowPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator29 = piePlot22.getLegendLabelGenerator();
        java.awt.Paint paint30 = piePlot22.getLabelPaint();
        piePlot0.setSectionOutlinePaint((java.lang.Comparable) (-1.0f), paint30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot6 and piePlot22", piePlot6.equals(piePlot22) ? piePlot6.hashCode() == piePlot22.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
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
        piePlot0.setInteriorGap((double) 0.0f);
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot();
        double double18 = piePlot17.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor19 = piePlot17.getLabelDistributor();
        double double20 = piePlot17.getMinimumArcAngleToDraw();
        java.awt.Paint paint21 = piePlot17.getBaseSectionOutlinePaint();
        java.awt.Paint paint22 = piePlot17.getBaseSectionPaint();
        java.awt.Paint paint23 = piePlot17.getShadowPaint();
        piePlot0.setSectionOutlinePaint((java.lang.Comparable) 1.0f, paint23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot5 and piePlot17", piePlot5.equals(piePlot17) ? piePlot5.hashCode() == piePlot17.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
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
        java.awt.Paint paint44 = piePlot0.getNoDataMessagePaint();
        org.jfree.chart.plot.PiePlot piePlot45 = new org.jfree.chart.plot.PiePlot();
        double double46 = piePlot45.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor47 = piePlot45.getLabelDistributor();
        double double48 = piePlot45.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D49 = null;
        java.awt.geom.Rectangle2D rectangle2D50 = null;
        piePlot45.drawBackgroundImage(graphics2D49, rectangle2D50);
        java.awt.Paint paint53 = piePlot45.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str54 = piePlot45.getNoDataMessage();
        org.jfree.chart.plot.PiePlot piePlot55 = new org.jfree.chart.plot.PiePlot();
        double double56 = piePlot55.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor57 = piePlot55.getLabelDistributor();
        double double58 = piePlot55.getMinimumArcAngleToDraw();
        java.awt.Paint paint59 = piePlot55.getBaseSectionOutlinePaint();
        piePlot55.setIgnoreNullValues(false);
        java.awt.Paint paint62 = piePlot55.getNoDataMessagePaint();
        java.awt.Stroke stroke64 = piePlot55.getSectionOutlineStroke((java.lang.Comparable) 52.0d);
        org.jfree.chart.util.Rotation rotation65 = piePlot55.getDirection();
        org.jfree.chart.plot.PiePlot piePlot66 = new org.jfree.chart.plot.PiePlot();
        double double67 = piePlot66.getMaximumLabelWidth();
        piePlot66.setForegroundAlpha((float) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets70 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot66.setInsets(rectangleInsets70);
        piePlot55.setInsets(rectangleInsets70, false);
        piePlot45.setLabelPadding(rectangleInsets70);
        piePlot0.setLabelPadding(rectangleInsets70);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot7 and piePlot55", piePlot7.equals(piePlot55) ? piePlot7.hashCode() == piePlot55.hashCode() : true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
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
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot();
        double double30 = piePlot29.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor31 = piePlot29.getLabelDistributor();
        java.awt.Paint paint32 = piePlot29.getLabelOutlinePaint();
        piePlot0.setLabelLinkPaint(paint32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot7 and piePlot29", piePlot7.equals(piePlot29) ? piePlot7.hashCode() == piePlot29.hashCode() : true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
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
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot();
        double double22 = piePlot21.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor23 = piePlot21.getLabelDistributor();
        double double24 = piePlot21.getMinimumArcAngleToDraw();
        java.awt.Paint paint25 = piePlot21.getBaseSectionOutlinePaint();
        piePlot21.setIgnoreNullValues(false);
        java.awt.Stroke stroke28 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot21.setLabelLinkStroke(stroke28);
        boolean boolean30 = piePlot21.isOutlineVisible();
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot32 = piePlot31.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor33 = piePlot31.getLabelDistributor();
        piePlot21.setParent((org.jfree.chart.plot.Plot) piePlot31);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator35 = piePlot31.getLegendLabelURLGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = piePlot31.getLabelPadding();
        piePlot0.setInsets(rectangleInsets36);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot21", piePlot11.equals(piePlot21) ? piePlot11.hashCode() == piePlot21.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.zoom(0.4d);
        java.awt.Stroke stroke5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) false, stroke5);
        boolean boolean7 = piePlot1.getIgnoreNullValues();
        java.awt.Paint paint8 = piePlot1.getLabelLinkPaint();
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot();
        double double10 = piePlot9.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor11 = piePlot9.getLabelDistributor();
        double double12 = piePlot9.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        piePlot9.drawBackgroundImage(graphics2D13, rectangle2D14);
        java.awt.Paint paint17 = piePlot9.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font18 = piePlot9.getLabelFont();
        piePlot9.setSimpleLabels(false);
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset22 = null;
        piePlot21.setDataset(pieDataset22);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator24 = piePlot21.getURLGenerator();
        org.jfree.chart.plot.Plot plot25 = piePlot21.getRootPlot();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor26 = piePlot21.getLabelDistributor();
        piePlot9.setLabelDistributor(abstractPieLabelDistributor26);
        piePlot1.setLabelDistributor(abstractPieLabelDistributor26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot9 and piePlot21", piePlot9.equals(piePlot21) ? piePlot9.hashCode() == piePlot21.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        org.jfree.chart.plot.Plot plot2 = piePlot0.getParent();
        boolean boolean3 = piePlot0.isCircular();
        java.lang.Object obj4 = piePlot0.clone();
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        piePlot5.setDataset(pieDataset6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot5.getURLGenerator();
        piePlot5.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator11 = piePlot5.getLegendLabelToolTipGenerator();
        boolean boolean12 = piePlot5.getSimpleLabels();
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        double double14 = piePlot13.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor15 = piePlot13.getLabelDistributor();
        double double16 = piePlot13.getMinimumArcAngleToDraw();
        java.awt.Paint paint17 = piePlot13.getBaseSectionOutlinePaint();
        double double18 = piePlot13.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = piePlot13.getSimpleLabelOffset();
        double double20 = piePlot13.getLabelLinkMargin();
        double double21 = piePlot13.getStartAngle();
        piePlot5.setParent((org.jfree.chart.plot.Plot) piePlot13);
        java.awt.Paint paint23 = piePlot13.getLabelShadowPaint();
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
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator42 = piePlot24.getLabelGenerator();
        piePlot13.setLegendLabelGenerator(pieSectionLabelGenerator42);
        piePlot0.setLegendLabelGenerator(pieSectionLabelGenerator42);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj4 and piePlot13", obj4.equals(piePlot13) ? obj4.hashCode() == piePlot13.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent25 = null;
        piePlot0.markerChanged(markerChangeEvent25);
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot();
        double double28 = piePlot27.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor29 = piePlot27.getLabelDistributor();
        double double30 = piePlot27.getMinimumArcAngleToDraw();
        boolean boolean31 = piePlot27.getIgnoreNullValues();
        boolean boolean32 = piePlot27.getIgnoreNullValues();
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot();
        double double34 = piePlot33.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup35 = piePlot33.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset36 = null;
        piePlot33.setDataset(pieDataset36);
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot33.setInsets(rectangleInsets38, false);
        piePlot27.setLabelPadding(rectangleInsets38);
        piePlot0.setSimpleLabelOffset(rectangleInsets38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot15 and piePlot33", piePlot15.equals(piePlot33) ? piePlot15.hashCode() == piePlot33.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
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
        org.jfree.chart.plot.PiePlot piePlot38 = new org.jfree.chart.plot.PiePlot();
        double double39 = piePlot38.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor40 = piePlot38.getLabelDistributor();
        double double41 = piePlot38.getMinimumArcAngleToDraw();
        boolean boolean42 = piePlot38.getIgnoreZeroValues();
        boolean boolean43 = piePlot38.isSubplot();
        piePlot38.setCircular(false);
        java.awt.Paint paint47 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot38.setSectionOutlinePaint((java.lang.Comparable) "", paint47);
        piePlot20.setShadowPaint(paint47);
        java.awt.Paint paint50 = piePlot20.getLabelShadowPaint();
        org.jfree.chart.plot.PiePlot piePlot51 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset52 = null;
        piePlot51.setDataset(pieDataset52);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator54 = piePlot51.getURLGenerator();
        org.jfree.chart.plot.Plot plot55 = piePlot51.getRootPlot();
        double double56 = piePlot51.getLabelGap();
        double double57 = piePlot51.getStartAngle();
        double double58 = piePlot51.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets59 = piePlot51.getLabelPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets60 = piePlot51.getInsets();
        piePlot20.setInsets(rectangleInsets60);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot24 and piePlot51", piePlot24.equals(piePlot51) ? piePlot24.hashCode() == piePlot51.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
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
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot22 = piePlot21.getParent();
        boolean boolean23 = piePlot21.isCircular();
        java.awt.Paint paint24 = piePlot21.getLabelBackgroundPaint();
        piePlot0.setBaseSectionOutlinePaint(paint24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot21", piePlot11.equals(piePlot21) ? piePlot11.hashCode() == piePlot21.hashCode() : true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        org.jfree.data.xy.XYDataset xYDataset5 = null;
        org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createPolarChart("", xYDataset5, false, false, true);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart9);
        piePlot0.setMaximumLabelWidth((double) (-1));
        boolean boolean13 = piePlot0.getIgnoreZeroValues();
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset15 = null;
        piePlot14.setDataset(pieDataset15);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator17 = piePlot14.getURLGenerator();
        piePlot14.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator20 = piePlot14.getLegendLabelToolTipGenerator();
        boolean boolean21 = piePlot14.getSimpleLabels();
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        double double23 = piePlot22.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor24 = piePlot22.getLabelDistributor();
        double double25 = piePlot22.getMinimumArcAngleToDraw();
        java.awt.Paint paint26 = piePlot22.getBaseSectionOutlinePaint();
        double double27 = piePlot22.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = piePlot22.getSimpleLabelOffset();
        double double29 = piePlot22.getLabelLinkMargin();
        double double30 = piePlot22.getStartAngle();
        piePlot14.setParent((org.jfree.chart.plot.Plot) piePlot22);
        boolean boolean32 = piePlot14.getIgnoreZeroValues();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = piePlot14.getInsets();
        piePlot0.setInsets(rectangleInsets33, true);
        java.awt.Font font36 = piePlot0.getNoDataMessageFont();
        piePlot0.setIgnoreZeroValues(true);
        java.awt.Paint paint39 = piePlot0.getBaseSectionPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo42 = null;
        piePlot0.handleClick((int) (short) 10, (int) ' ', plotRenderingInfo42);
        org.jfree.chart.plot.PiePlot piePlot44 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset45 = null;
        piePlot44.setDataset(pieDataset45);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator47 = piePlot44.getURLGenerator();
        org.jfree.chart.plot.Plot plot48 = piePlot44.getRootPlot();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor49 = piePlot44.getLabelDistributor();
        piePlot0.setLabelDistributor(abstractPieLabelDistributor49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot22 and piePlot44", piePlot22.equals(piePlot44) ? piePlot22.hashCode() == piePlot44.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        piePlot0.setBackgroundImageAlignment((int) 'a');
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
        piePlot0.setLabelGenerator(pieSectionLabelGenerator41);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot12 and piePlot31", piePlot12.equals(piePlot31) ? piePlot12.hashCode() == piePlot31.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
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
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot18 = piePlot17.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor19 = piePlot17.getLabelDistributor();
        java.awt.Paint paint20 = piePlot17.getLabelOutlinePaint();
        boolean boolean21 = piePlot17.isOutlineVisible();
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        double double24 = piePlot22.getExplodePercent((java.lang.Comparable) 0);
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset26 = null;
        piePlot25.setDataset(pieDataset26);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator28 = piePlot25.getURLGenerator();
        org.jfree.chart.plot.Plot plot29 = piePlot25.getRootPlot();
        java.awt.Stroke stroke30 = piePlot25.getLabelOutlineStroke();
        java.awt.Shape shape31 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot25.setLegendItemShape(shape31);
        java.awt.Stroke stroke33 = piePlot25.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot();
        double double35 = piePlot34.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor36 = piePlot34.getLabelDistributor();
        double double37 = piePlot34.getMinimumArcAngleToDraw();
        java.awt.Paint paint38 = piePlot34.getBaseSectionOutlinePaint();
        double double39 = piePlot34.getShadowYOffset();
        piePlot34.setBackgroundImageAlignment((int) (byte) -1);
        double double42 = piePlot34.getInteriorGap();
        java.awt.Font font43 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot34.setNoDataMessageFont(font43);
        piePlot25.setLabelFont(font43);
        piePlot22.setLabelFont(font43);
        piePlot17.setLabelFont(font43);
        piePlot0.setNoDataMessageFont(font43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot17 and piePlot22", piePlot17.equals(piePlot22) ? piePlot17.hashCode() == piePlot22.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
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
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot();
        double double38 = piePlot37.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup39 = piePlot37.getDatasetGroup();
        java.awt.Paint paint40 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot37.setNoDataMessagePaint(paint40);
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot();
        double double43 = piePlot42.getMaximumLabelWidth();
        piePlot42.setForegroundAlpha((float) (short) 0);
        org.jfree.chart.plot.PiePlot piePlot46 = new org.jfree.chart.plot.PiePlot();
        double double47 = piePlot46.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor48 = piePlot46.getLabelDistributor();
        double double49 = piePlot46.getMinimumArcAngleToDraw();
        java.awt.Paint paint50 = piePlot46.getBaseSectionOutlinePaint();
        double double51 = piePlot46.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets52 = piePlot46.getSimpleLabelOffset();
        piePlot42.setInsets(rectangleInsets52);
        piePlot37.setSimpleLabelOffset(rectangleInsets52);
        double double55 = piePlot37.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets56 = piePlot37.getLabelPadding();
        boolean boolean57 = piePlot20.equals((java.lang.Object) rectangleInsets56);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot24 and piePlot37", piePlot24.equals(piePlot37) ? piePlot24.hashCode() == piePlot37.hashCode() : true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        piePlot0.setOutlineVisible(true);
        piePlot0.setLabelLinkMargin((double) (short) -1);
        piePlot0.setForegroundAlpha(1.0f);
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        double double9 = piePlot8.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor10 = piePlot8.getLabelDistributor();
        double double11 = piePlot8.getMinimumArcAngleToDraw();
        java.awt.Paint paint12 = piePlot8.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier13 = piePlot8.getDrawingSupplier();
        piePlot0.setDrawingSupplier(drawingSupplier13);
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot();
        double double16 = piePlot15.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor17 = piePlot15.getLabelDistributor();
        double double18 = piePlot15.getMinimumArcAngleToDraw();
        java.awt.Paint paint19 = piePlot15.getBaseSectionOutlinePaint();
        piePlot15.setIgnoreNullValues(false);
        java.awt.Paint paint22 = piePlot15.getNoDataMessagePaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        piePlot15.handleClick((int) (short) -1, (int) (byte) 100, plotRenderingInfo25);
        java.awt.Paint paint27 = piePlot15.getBaseSectionPaint();
        piePlot0.setLabelShadowPaint(paint27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot8 and piePlot15", piePlot8.equals(piePlot15) ? piePlot8.hashCode() == piePlot15.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
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
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot();
        double double15 = piePlot14.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor16 = piePlot14.getLabelDistributor();
        double double17 = piePlot14.getMinimumArcAngleToDraw();
        java.awt.Paint paint18 = piePlot14.getBaseSectionOutlinePaint();
        piePlot14.setIgnoreNullValues(false);
        java.awt.Paint paint21 = piePlot14.getNoDataMessagePaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        piePlot14.handleClick((int) (short) -1, (int) (byte) 100, plotRenderingInfo24);
        java.awt.Paint paint26 = piePlot14.getBaseSectionPaint();
        piePlot1.setShadowPaint(paint26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot8 and piePlot14", piePlot8.equals(piePlot14) ? piePlot8.hashCode() == piePlot14.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
        float float3 = piePlot0.getForegroundAlpha();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        java.awt.Paint paint6 = piePlot0.getSectionOutlinePaint((java.lang.Comparable) 1.0f);
        double double7 = piePlot0.getStartAngle();
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        double double9 = piePlot8.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup10 = piePlot8.getDatasetGroup();
        java.awt.Paint paint11 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot8.setNoDataMessagePaint(paint11);
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        piePlot13.setDataset(pieDataset14);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = piePlot13.getURLGenerator();
        org.jfree.chart.plot.Plot plot17 = piePlot13.getRootPlot();
        java.awt.Stroke stroke18 = piePlot13.getLabelOutlineStroke();
        piePlot8.setLabelLinkStroke(stroke18);
        java.awt.Stroke stroke20 = piePlot8.getOutlineStroke();
        java.awt.Shape shape21 = piePlot8.getLegendItemShape();
        int int22 = piePlot8.getBackgroundImageAlignment();
        java.awt.Paint paint23 = piePlot8.getShadowPaint();
        piePlot0.setNoDataMessagePaint(paint23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot8 and piePlot13", piePlot8.equals(piePlot13) ? piePlot8.hashCode() == piePlot13.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
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
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot();
        double double42 = piePlot41.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor43 = piePlot41.getLabelDistributor();
        double double44 = piePlot41.getMinimumArcAngleToDraw();
        java.awt.Paint paint45 = piePlot41.getBaseSectionOutlinePaint();
        java.awt.Paint paint46 = piePlot41.getBaseSectionPaint();
        piePlot32.setLabelLinkPaint(paint46);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator48 = piePlot32.getURLGenerator();
        java.awt.Stroke stroke49 = piePlot32.getOutlineStroke();
        piePlot0.setLabelOutlineStroke(stroke49);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot7 and piePlot41", piePlot7.equals(piePlot41) ? piePlot7.hashCode() == piePlot41.hashCode() : true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
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
        piePlot0.setInteriorGap((double) 0.0f);
        boolean boolean16 = piePlot0.isOutlineVisible();
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot();
        double double18 = piePlot17.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor19 = piePlot17.getLabelDistributor();
        double double20 = piePlot17.getMinimumArcAngleToDraw();
        java.awt.Paint paint21 = piePlot17.getBaseSectionOutlinePaint();
        double double22 = piePlot17.getShadowYOffset();
        java.awt.Paint paint23 = piePlot17.getLabelPaint();
        java.awt.Paint paint24 = piePlot17.getLabelPaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier25 = piePlot17.getDrawingSupplier();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = piePlot17.getDrawingSupplier();
        piePlot0.setDrawingSupplier(drawingSupplier26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot5 and piePlot17", piePlot5.equals(piePlot17) ? piePlot5.hashCode() == piePlot17.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
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
        java.awt.Paint paint13 = piePlot7.getShadowPaint();
        piePlot0.setLabelOutlinePaint(paint13);
        boolean boolean15 = piePlot0.getIgnoreNullValues();
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot17 = piePlot16.getParent();
        boolean boolean18 = piePlot16.isCircular();
        java.awt.Font font19 = piePlot16.getLabelFont();
        piePlot0.setLabelFont(font19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot7 and piePlot16", piePlot7.equals(piePlot16) ? piePlot7.hashCode() == piePlot16.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        double double4 = piePlot0.getShadowXOffset();
        boolean boolean5 = piePlot0.getIgnoreZeroValues();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot0.getSimpleLabelOffset();
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset8 = null;
        piePlot7.setDataset(pieDataset8);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator10 = piePlot7.getURLGenerator();
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator12 = piePlot11.getLegendLabelGenerator();
        piePlot11.setOutlineVisible(true);
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot();
        double double16 = piePlot15.getMaximumLabelWidth();
        piePlot15.setForegroundAlpha((float) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot15.setInsets(rectangleInsets19);
        piePlot11.setLabelPadding(rectangleInsets19);
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        double double23 = piePlot22.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup24 = piePlot22.getDatasetGroup();
        piePlot22.setOutlineVisible(true);
        boolean boolean28 = piePlot22.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot();
        double double30 = piePlot29.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor31 = piePlot29.getLabelDistributor();
        double double32 = piePlot29.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D33 = null;
        java.awt.geom.Rectangle2D rectangle2D34 = null;
        piePlot29.drawBackgroundImage(graphics2D33, rectangle2D34);
        java.awt.Paint paint37 = piePlot29.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font38 = piePlot29.getLabelFont();
        piePlot22.setNoDataMessageFont(font38);
        boolean boolean40 = piePlot22.isOutlineVisible();
        double double41 = piePlot22.getLabelGap();
        java.awt.Paint paint42 = piePlot22.getLabelLinkPaint();
        java.awt.Paint paint43 = piePlot22.getNoDataMessagePaint();
        piePlot11.setNoDataMessagePaint(paint43);
        piePlot7.setLabelPaint(paint43);
        piePlot0.setLabelLinkPaint(paint43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot7 and piePlot29", piePlot7.equals(piePlot29) ? piePlot7.hashCode() == piePlot29.hashCode() : true);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
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
        java.lang.Object obj19 = piePlot0.clone();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator20 = piePlot0.getLegendLabelToolTipGenerator();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot0 and obj19", piePlot0.equals(obj19) ? piePlot0.hashCode() == obj19.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier37 = piePlot12.getDrawingSupplier();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot0 and piePlot17", piePlot0.equals(piePlot17) ? piePlot0.hashCode() == piePlot17.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
        piePlot0.setCircular(true);
        org.jfree.chart.plot.Plot plot5 = piePlot0.getRootPlot();
        java.lang.Object obj6 = piePlot0.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = piePlot0.getInsets();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot0 and obj6", piePlot0.equals(obj6) ? piePlot0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
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
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot();
        double double22 = piePlot21.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup23 = piePlot21.getDatasetGroup();
        java.awt.Paint paint24 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot21.setNoDataMessagePaint(paint24);
        double double27 = piePlot21.getExplodePercent((java.lang.Comparable) (-1));
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot();
        double double30 = piePlot28.getExplodePercent((java.lang.Comparable) 0);
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset32 = null;
        piePlot31.setDataset(pieDataset32);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator34 = piePlot31.getURLGenerator();
        org.jfree.chart.plot.Plot plot35 = piePlot31.getRootPlot();
        java.awt.Stroke stroke36 = piePlot31.getLabelOutlineStroke();
        java.awt.Shape shape37 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot31.setLegendItemShape(shape37);
        java.awt.Stroke stroke39 = piePlot31.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot40 = new org.jfree.chart.plot.PiePlot();
        double double41 = piePlot40.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor42 = piePlot40.getLabelDistributor();
        double double43 = piePlot40.getMinimumArcAngleToDraw();
        java.awt.Paint paint44 = piePlot40.getBaseSectionOutlinePaint();
        double double45 = piePlot40.getShadowYOffset();
        piePlot40.setBackgroundImageAlignment((int) (byte) -1);
        double double48 = piePlot40.getInteriorGap();
        java.awt.Font font49 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot40.setNoDataMessageFont(font49);
        piePlot31.setLabelFont(font49);
        piePlot28.setLabelFont(font49);
        piePlot21.setNoDataMessageFont(font49);
        java.awt.Stroke stroke55 = piePlot21.getSectionOutlineStroke((java.lang.Comparable) 52.0d);
        boolean boolean56 = piePlot21.getSectionOutlinesVisible();
        java.awt.Font font57 = piePlot21.getNoDataMessageFont();
        piePlot0.setLabelFont(font57);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot8 and piePlot28", piePlot8.equals(piePlot28) ? piePlot8.hashCode() == piePlot28.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
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
        piePlot0.setShadowXOffset(100.0d);
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        double double23 = piePlot22.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor24 = piePlot22.getLabelDistributor();
        java.awt.Paint paint25 = piePlot22.getLabelOutlinePaint();
        piePlot22.setStartAngle((double) (byte) 10);
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot();
        double double29 = piePlot28.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor30 = piePlot28.getLabelDistributor();
        double double31 = piePlot28.getMinimumArcAngleToDraw();
        java.awt.Paint paint32 = piePlot28.getBaseSectionOutlinePaint();
        java.awt.Paint paint33 = piePlot28.getBaseSectionPaint();
        piePlot22.setLabelPaint(paint33);
        piePlot0.setNoDataMessagePaint(paint33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot6 and piePlot28", piePlot6.equals(piePlot28) ? piePlot6.hashCode() == piePlot28.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getShadowYOffset();
        org.jfree.chart.plot.PiePlot piePlot3 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup4 = piePlot3.getDatasetGroup();
        java.lang.String str5 = piePlot3.getPlotType();
        java.awt.Stroke stroke6 = piePlot3.getBaseSectionOutlineStroke();
        piePlot0.setParent((org.jfree.chart.plot.Plot) piePlot3);
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot();
        double double10 = piePlot9.getMaximumLabelWidth();
        piePlot9.setForegroundAlpha(100.0f);
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        double double14 = piePlot13.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor15 = piePlot13.getLabelDistributor();
        double double16 = piePlot13.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        piePlot13.drawBackgroundImage(graphics2D17, rectangle2D18);
        java.awt.Paint paint21 = piePlot13.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str22 = piePlot13.getNoDataMessage();
        java.awt.Paint paint23 = piePlot13.getLabelOutlinePaint();
        piePlot9.setBaseSectionOutlinePaint(paint23);
        piePlot0.setSectionOutlinePaint((java.lang.Comparable) (byte) 0, paint23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot3 and piePlot13", piePlot3.equals(piePlot13) ? piePlot3.hashCode() == piePlot13.hashCode() : true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        double double6 = piePlot0.getMinimumArcAngleToDraw();
        piePlot0.setNoDataMessage("Pie Plot");
        double double9 = piePlot0.getLabelGap();
        boolean boolean10 = piePlot0.getSimpleLabels();
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset12 = null;
        piePlot11.setDataset(pieDataset12);
        java.awt.Paint paint14 = piePlot11.getLabelLinkPaint();
        java.awt.Paint paint15 = piePlot11.getNoDataMessagePaint();
        piePlot0.setShadowPaint(paint15);
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot18 = piePlot17.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor19 = piePlot17.getLabelDistributor();
        java.awt.Paint paint20 = piePlot17.getNoDataMessagePaint();
        double double21 = piePlot17.getInteriorGap();
        java.awt.Stroke stroke22 = piePlot17.getBaseSectionOutlineStroke();
        piePlot0.setBaseSectionOutlineStroke(stroke22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot11 and piePlot17", piePlot11.equals(piePlot17) ? piePlot11.hashCode() == piePlot17.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        java.awt.Paint paint6 = piePlot0.getSectionOutlinePaint((java.lang.Comparable) (byte) 100);
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double8 = piePlot7.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor9 = piePlot7.getLabelDistributor();
        double double10 = piePlot7.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot7.drawBackgroundImage(graphics2D11, rectangle2D12);
        java.awt.Paint paint15 = piePlot7.getSectionPaint((java.lang.Comparable) false);
        double double16 = piePlot7.getShadowXOffset();
        org.jfree.data.general.DatasetGroup datasetGroup17 = piePlot7.getDatasetGroup();
        org.jfree.chart.util.Rotation rotation18 = piePlot7.getDirection();
        piePlot0.setDirection(rotation18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot0 and piePlot7", piePlot0.equals(piePlot7) ? piePlot0.hashCode() == piePlot7.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        java.awt.Stroke stroke2 = piePlot0.getBaseSectionOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot0.getLabelPadding();
        org.jfree.data.general.PieDataset pieDataset4 = null;
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot(pieDataset4);
        piePlot5.zoom(0.4d);
        java.awt.Stroke stroke9 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot5.setSectionOutlineStroke((java.lang.Comparable) false, stroke9);
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot();
        double double13 = piePlot12.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor14 = piePlot12.getLabelDistributor();
        java.awt.Paint paint15 = piePlot12.getLabelOutlinePaint();
        piePlot5.setSectionPaint((java.lang.Comparable) 1.0E-5d, paint15);
        piePlot0.setLabelLinkPaint(paint15);
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot(pieDataset18);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent20 = null;
        piePlot19.axisChanged(axisChangeEvent20);
        java.awt.Stroke stroke22 = piePlot19.getLabelOutlineStroke();
        piePlot0.setLabelLinkStroke(stroke22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot12 and piePlot19", piePlot12.equals(piePlot19) ? piePlot12.hashCode() == piePlot19.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
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
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot();
        double double27 = piePlot26.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor28 = piePlot26.getLabelDistributor();
        double double29 = piePlot26.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        piePlot26.drawBackgroundImage(graphics2D30, rectangle2D31);
        java.awt.Paint paint34 = piePlot26.getSectionPaint((java.lang.Comparable) false);
        org.jfree.chart.plot.PiePlot piePlot35 = new org.jfree.chart.plot.PiePlot();
        double double36 = piePlot35.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor37 = piePlot35.getLabelDistributor();
        double double38 = piePlot35.getMinimumArcAngleToDraw();
        java.awt.Paint paint39 = piePlot35.getBaseSectionOutlinePaint();
        java.awt.Paint paint40 = piePlot35.getBaseSectionPaint();
        piePlot26.setLabelLinkPaint(paint40);
        piePlot0.setLabelBackgroundPaint(paint40);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot7 and piePlot35", piePlot7.equals(piePlot35) ? piePlot7.hashCode() == piePlot35.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = piePlot0.getInsets();
        piePlot0.setLabelLinksVisible(true);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        piePlot0.markerChanged(markerChangeEvent32);
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot35 = piePlot34.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor36 = piePlot34.getLabelDistributor();
        java.awt.Paint paint37 = piePlot34.getLabelOutlinePaint();
        boolean boolean38 = piePlot34.isOutlineVisible();
        java.awt.Paint paint39 = piePlot34.getNoDataMessagePaint();
        java.awt.Stroke stroke40 = piePlot34.getLabelOutlineStroke();
        double double41 = piePlot34.getMinimumArcAngleToDraw();
        org.jfree.chart.plot.PiePlot piePlot42 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot43 = piePlot42.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor44 = piePlot42.getLabelDistributor();
        java.awt.Stroke stroke45 = piePlot42.getOutlineStroke();
        piePlot34.setBaseSectionOutlineStroke(stroke45);
        piePlot0.setLabelLinkStroke(stroke45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot21 and piePlot34", piePlot21.equals(piePlot34) ? piePlot21.hashCode() == piePlot34.hashCode() : true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        boolean boolean5 = piePlot0.getSectionOutlinesVisible();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelGenerator();
        boolean boolean7 = piePlot0.getSectionOutlinesVisible();
        double double8 = piePlot0.getMaximumLabelWidth();
        piePlot0.setNoDataMessage("Pie Plot");
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot12 = piePlot11.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor13 = piePlot11.getLabelDistributor();
        java.awt.Paint paint14 = piePlot11.getLabelOutlinePaint();
        boolean boolean15 = piePlot11.isOutlineVisible();
        java.awt.Stroke stroke16 = piePlot11.getLabelOutlineStroke();
        piePlot0.setLabelOutlineStroke(stroke16);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent18 = null;
        piePlot0.markerChanged(markerChangeEvent18);
        boolean boolean20 = piePlot0.isSubplot();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator21 = null;
        piePlot0.setToolTipGenerator(pieToolTipGenerator21);
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator24 = piePlot23.getLegendLabelGenerator();
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot();
        double double26 = piePlot25.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor27 = piePlot25.getLabelDistributor();
        double double28 = piePlot25.getMinimumArcAngleToDraw();
        java.awt.Paint paint29 = piePlot25.getBaseSectionOutlinePaint();
        double double30 = piePlot25.getShadowYOffset();
        java.awt.Image image31 = null;
        piePlot25.setBackgroundImage(image31);
        org.jfree.chart.util.Rotation rotation33 = piePlot25.getDirection();
        piePlot23.setDirection(rotation33);
        piePlot0.setDirection(rotation33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on pieSectionLabelGenerator6 and pieSectionLabelGenerator24", pieSectionLabelGenerator6.equals(pieSectionLabelGenerator24) ? pieSectionLabelGenerator6.hashCode() == pieSectionLabelGenerator24.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Stroke stroke7 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot0.setLabelLinkStroke(stroke7);
        boolean boolean9 = piePlot0.isOutlineVisible();
        java.awt.Paint paint10 = piePlot0.getBaseSectionPaint();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = piePlot0.getMaximumExplodePercent();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
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
        org.jfree.chart.plot.PiePlot piePlot38 = new org.jfree.chart.plot.PiePlot();
        double double39 = piePlot38.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor40 = piePlot38.getLabelDistributor();
        double double41 = piePlot38.getMinimumArcAngleToDraw();
        boolean boolean42 = piePlot38.getIgnoreZeroValues();
        boolean boolean43 = piePlot38.isSubplot();
        piePlot38.setCircular(false);
        java.awt.Paint paint47 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot38.setSectionOutlinePaint((java.lang.Comparable) "", paint47);
        piePlot20.setShadowPaint(paint47);
        org.jfree.chart.plot.PiePlot piePlot50 = new org.jfree.chart.plot.PiePlot();
        double double51 = piePlot50.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor52 = piePlot50.getLabelDistributor();
        double double53 = piePlot50.getMinimumArcAngleToDraw();
        java.awt.Paint paint54 = piePlot50.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier55 = piePlot50.getDrawingSupplier();
        double double56 = piePlot50.getShadowXOffset();
        java.awt.Paint paint57 = piePlot50.getLabelLinkPaint();
        java.awt.Paint paint58 = piePlot50.getLabelLinkPaint();
        piePlot20.setLabelPaint(paint58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on piePlot24 and piePlot50", piePlot24.equals(piePlot50) ? piePlot24.hashCode() == piePlot50.hashCode() : true);
    }
}

