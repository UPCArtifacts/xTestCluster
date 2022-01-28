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
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot();
        double double17 = piePlot16.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor18 = piePlot16.getLabelDistributor();
        java.awt.Paint paint19 = piePlot16.getLabelOutlinePaint();
        piePlot16.setStartAngle((double) (byte) 10);
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot();
        double double24 = piePlot23.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor25 = piePlot23.getLabelDistributor();
        double double26 = piePlot23.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        piePlot23.drawBackgroundImage(graphics2D27, rectangle2D28);
        java.awt.Paint paint31 = piePlot23.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font32 = piePlot23.getLabelFont();
        piePlot23.setSimpleLabels(false);
        piePlot23.setMinimumArcAngleToDraw((double) 100);
        boolean boolean37 = piePlot23.isOutlineVisible();
        java.awt.Paint paint38 = piePlot23.getBaseSectionOutlinePaint();
        piePlot16.setSectionOutlinePaint((java.lang.Comparable) 4.0d, paint38);
        org.jfree.chart.plot.PiePlot piePlot40 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup41 = piePlot40.getDatasetGroup();
        piePlot40.setBackgroundImageAlignment((int) 'a');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor44 = piePlot40.getLabelDistributor();
        piePlot16.setLabelDistributor(abstractPieLabelDistributor44);
        piePlot0.setLabelDistributor(abstractPieLabelDistributor44);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(pieURLGenerator15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.14d + "'", double17 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.14d + "'", double24 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0E-5d + "'", double26 == 1.0E-5d);
        org.junit.Assert.assertNull(paint31);
        org.junit.Assert.assertNotNull(font32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNull(datasetGroup41);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor44);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("hi!", "", "", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Stroke stroke3 = piePlot0.getOutlineStroke();
        piePlot0.setPieIndex(100);
        int int6 = piePlot0.getBackgroundImageAlignment();
        java.awt.Stroke stroke7 = piePlot0.getLabelOutlineStroke();
        piePlot0.setIgnoreNullValues(false);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(stroke7);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("", "hi!", "", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        double double21 = piePlot0.getStartAngle();
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 90.0d + "'", double21 == 90.0d);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        piePlot13.setDataset(pieDataset14);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = piePlot13.getURLGenerator();
        piePlot13.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator19 = piePlot13.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot();
        double double21 = piePlot20.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor22 = piePlot20.getLabelDistributor();
        double double23 = piePlot20.getMinimumArcAngleToDraw();
        boolean boolean24 = piePlot20.getIgnoreZeroValues();
        boolean boolean25 = piePlot20.isSubplot();
        piePlot20.setCircular(false);
        java.awt.Paint paint29 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot20.setSectionOutlinePaint((java.lang.Comparable) "", paint29);
        piePlot13.setNoDataMessagePaint(paint29);
        piePlot0.setLabelBackgroundPaint(paint29);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor33 = piePlot0.getLabelDistributor();
        piePlot0.setExplodePercent((java.lang.Comparable) 0.4d, (double) (short) 1);
        java.awt.Graphics2D graphics2D37 = null;
        java.awt.geom.Rectangle2D rectangle2D38 = null;
        org.jfree.chart.plot.PiePlot piePlot39 = new org.jfree.chart.plot.PiePlot();
        double double40 = piePlot39.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor41 = piePlot39.getLabelDistributor();
        double double42 = piePlot39.getMinimumArcAngleToDraw();
        java.awt.Paint paint43 = piePlot39.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier44 = piePlot39.getDrawingSupplier();
        double double45 = piePlot39.getShadowXOffset();
        org.jfree.chart.plot.PiePlot piePlot46 = new org.jfree.chart.plot.PiePlot();
        double double47 = piePlot46.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup48 = piePlot46.getDatasetGroup();
        piePlot46.setOutlineVisible(true);
        boolean boolean52 = piePlot46.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot53 = new org.jfree.chart.plot.PiePlot();
        double double54 = piePlot53.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor55 = piePlot53.getLabelDistributor();
        double double56 = piePlot53.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D57 = null;
        java.awt.geom.Rectangle2D rectangle2D58 = null;
        piePlot53.drawBackgroundImage(graphics2D57, rectangle2D58);
        java.awt.Paint paint61 = piePlot53.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font62 = piePlot53.getLabelFont();
        piePlot53.setSimpleLabels(false);
        java.awt.Paint paint65 = piePlot53.getLabelPaint();
        org.jfree.chart.plot.PiePlot piePlot66 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset67 = null;
        piePlot66.setDataset(pieDataset67);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator69 = piePlot66.getURLGenerator();
        piePlot66.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator72 = piePlot66.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot73 = new org.jfree.chart.plot.PiePlot();
        double double74 = piePlot73.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor75 = piePlot73.getLabelDistributor();
        double double76 = piePlot73.getMinimumArcAngleToDraw();
        boolean boolean77 = piePlot73.getIgnoreZeroValues();
        boolean boolean78 = piePlot73.isSubplot();
        piePlot73.setCircular(false);
        java.awt.Paint paint82 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot73.setSectionOutlinePaint((java.lang.Comparable) "", paint82);
        piePlot66.setNoDataMessagePaint(paint82);
        piePlot53.setLabelBackgroundPaint(paint82);
        piePlot46.setBaseSectionPaint(paint82);
        java.awt.Paint paint87 = piePlot46.getBaseSectionOutlinePaint();
        piePlot39.setLabelOutlinePaint(paint87);
        double double89 = piePlot39.getLabelGap();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo91 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState92 = piePlot0.initialise(graphics2D37, rectangle2D38, piePlot39, (java.lang.Integer) 10, plotRenderingInfo91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(pieURLGenerator16);
        org.junit.Assert.assertNull(pieSectionLabelGenerator19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.14d + "'", double21 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0E-5d + "'", double23 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor33);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.14d + "'", double40 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0E-5d + "'", double42 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(drawingSupplier44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 4.0d + "'", double45 == 4.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.14d + "'", double47 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.14d + "'", double54 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0E-5d + "'", double56 == 1.0E-5d);
        org.junit.Assert.assertNull(paint61);
        org.junit.Assert.assertNotNull(font62);
        org.junit.Assert.assertNotNull(paint65);
        org.junit.Assert.assertNull(pieURLGenerator69);
        org.junit.Assert.assertNull(pieSectionLabelGenerator72);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.14d + "'", double74 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor75);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 1.0E-5d + "'", double76 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(paint82);
        org.junit.Assert.assertNotNull(paint87);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.025d + "'", double89 == 0.025d);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        java.awt.Stroke stroke2 = piePlot0.getBaseSectionOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot0.getLabelPadding();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        piePlot0.markerChanged(markerChangeEvent4);
        java.awt.Paint paint6 = piePlot0.getLabelOutlinePaint();
        double double7 = piePlot0.getLabelGap();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.025d + "'", double7 == 0.025d);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("hi!", "", "hi!", intervalCategoryDataset3, false, false, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Stroke stroke3 = piePlot0.getOutlineStroke();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = null;
        piePlot0.setLegendLabelURLGenerator(pieURLGenerator4);
        piePlot0.setPieIndex((int) '4');
        java.awt.Paint paint8 = piePlot0.getBaseSectionPaint();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        float float7 = piePlot0.getBackgroundAlpha();
        double double8 = piePlot0.getShadowYOffset();
        java.awt.Stroke stroke9 = piePlot0.getBaseSectionOutlineStroke();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        piePlot0.setMinimumArcAngleToDraw((double) (byte) 10);
        piePlot0.setSimpleLabels(true);
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
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.jfree.data.general.WaferMapDataset waferMapDataset1 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createWaferMapChart("Pie Plot", waferMapDataset1, plotOrientation2, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        java.awt.Font font14 = piePlot0.getLabelFont();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.025d + "'", double13 == 0.025d);
        org.junit.Assert.assertNotNull(font14);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("Pie Plot", "", "hi!", windDataset3, false, false, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        piePlot0.setLabelLinkMargin((double) 0.5f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        boolean boolean14 = piePlot0.isOutlineVisible();
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot();
        double double16 = piePlot15.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor17 = piePlot15.getLabelDistributor();
        double double18 = piePlot15.getMinimumArcAngleToDraw();
        java.awt.Paint paint19 = piePlot15.getBaseSectionOutlinePaint();
        java.awt.Paint paint20 = piePlot15.getBaseSectionPaint();
        java.awt.Paint paint21 = piePlot15.getShadowPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator22 = piePlot15.getLegendLabelGenerator();
        piePlot15.setPieIndex((int) ' ');
        double double25 = piePlot15.getShadowXOffset();
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot27 = piePlot26.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor28 = piePlot26.getLabelDistributor();
        java.awt.Stroke stroke29 = piePlot26.getOutlineStroke();
        piePlot26.setPieIndex(100);
        int int32 = piePlot26.getBackgroundImageAlignment();
        java.awt.Stroke stroke33 = piePlot26.getLabelOutlineStroke();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator34 = piePlot26.getLabelGenerator();
        piePlot15.setLegendLabelGenerator(pieSectionLabelGenerator34);
        piePlot0.setLabelGenerator(pieSectionLabelGenerator34);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.14d + "'", double16 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-5d + "'", double18 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.0d + "'", double25 == 4.0d);
        org.junit.Assert.assertNull(plot27);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 15 + "'", int32 == 15);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator34);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.lang.String str3 = piePlot0.getPlotType();
        org.jfree.data.general.DatasetGroup datasetGroup4 = piePlot0.getDatasetGroup();
        java.awt.Shape shape5 = piePlot0.getLegendItemShape();
        boolean boolean6 = piePlot0.isOutlineVisible();
        piePlot0.setMaximumLabelWidth((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = piePlot0.getLabelPadding();
        boolean boolean10 = piePlot0.getSectionOutlinesVisible();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(pieURLGenerator15);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.025d + "'", double17 == 0.025d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.14d + "'", double19 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0E-5d + "'", double21 == 1.0E-5d);
        org.junit.Assert.assertNull(paint26);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNull(pieToolTipGenerator35);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(stroke38);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
        java.awt.Paint paint14 = piePlot0.getLabelBackgroundPaint();
        boolean boolean15 = piePlot0.getSimpleLabels();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        piePlot0.setBackgroundImageAlignment((int) (byte) -1);
        double double8 = piePlot0.getInteriorGap();
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot();
        double double10 = piePlot9.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor11 = piePlot9.getLabelDistributor();
        double double12 = piePlot9.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        piePlot9.drawBackgroundImage(graphics2D13, rectangle2D14);
        java.awt.Paint paint17 = piePlot9.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font18 = piePlot9.getLabelFont();
        piePlot0.setLabelFont(font18);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator20 = piePlot0.getLabelGenerator();
        float float21 = piePlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("", "hi!", "Pie Plot", intervalCategoryDataset3, true, true, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("", "hi!", "Pie Plot", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        org.jfree.data.xy.XYDataset xYDataset5 = null;
        org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createPolarChart("", xYDataset5, false, false, true);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart9);
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
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset25 = null;
        piePlot24.setDataset(pieDataset25);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator27 = piePlot24.getURLGenerator();
        piePlot24.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator30 = piePlot24.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot();
        double double32 = piePlot31.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor33 = piePlot31.getLabelDistributor();
        double double34 = piePlot31.getMinimumArcAngleToDraw();
        boolean boolean35 = piePlot31.getIgnoreZeroValues();
        boolean boolean36 = piePlot31.isSubplot();
        piePlot31.setCircular(false);
        java.awt.Paint paint40 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot31.setSectionOutlinePaint((java.lang.Comparable) "", paint40);
        piePlot24.setNoDataMessagePaint(paint40);
        piePlot11.setLabelBackgroundPaint(paint40);
        piePlot0.setLabelLinkPaint(paint40);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier45 = piePlot0.getDrawingSupplier();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(pieURLGenerator27);
        org.junit.Assert.assertNull(pieSectionLabelGenerator30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.14d + "'", double32 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0E-5d + "'", double34 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(drawingSupplier45);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.lang.String str3 = piePlot0.getPlotType();
        org.jfree.data.general.DatasetGroup datasetGroup4 = piePlot0.getDatasetGroup();
        java.awt.Shape shape5 = piePlot0.getLegendItemShape();
        boolean boolean6 = piePlot0.isOutlineVisible();
        piePlot0.setMaximumLabelWidth((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = piePlot0.getLabelPadding();
        java.awt.Paint paint10 = piePlot0.getShadowPaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("hi!", "hi!", "Pie Plot", intervalCategoryDataset3, false, false, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        piePlot17.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint20 = piePlot17.getLabelLinkPaint();
        piePlot0.setBaseSectionPaint(paint20);
        java.awt.Paint paint23 = piePlot0.getSectionPaint((java.lang.Comparable) 0.5f);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator24 = null;
        piePlot0.setURLGenerator(pieURLGenerator24);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(paint23);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("Pie Plot", "", true, "", intervalXYDataset4, plotOrientation5, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        float float4 = piePlot0.getForegroundAlpha();
        java.awt.Stroke stroke5 = piePlot0.getBaseSectionOutlineStroke();
        java.awt.Paint paint7 = piePlot0.getSectionPaint((java.lang.Comparable) (short) 10);
        double double8 = piePlot0.getShadowXOffset();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent18 = null;
        piePlot0.notifyListeners(plotChangeEvent18);
        int int20 = piePlot0.getBackgroundImageAlignment();
        org.jfree.chart.plot.Plot plot21 = null;
        piePlot0.setParent(plot21);
        float float23 = piePlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.5f + "'", float23 == 0.5f);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        boolean boolean5 = piePlot0.getSectionOutlinesVisible();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelGenerator();
        double double7 = piePlot0.getStartAngle();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        piePlot0.markerChanged(markerChangeEvent8);
        java.awt.Paint paint10 = piePlot0.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        piePlot0.setPieIndex((int) (byte) 10);
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        piePlot6.setDataset(pieDataset7);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator9 = piePlot6.getURLGenerator();
        float float10 = piePlot6.getForegroundAlpha();
        java.awt.Stroke stroke11 = piePlot6.getBaseSectionOutlineStroke();
        java.awt.Stroke stroke12 = piePlot6.getLabelLinkStroke();
        piePlot6.setNoDataMessage("Pie Plot");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        piePlot6.markerChanged(markerChangeEvent15);
        java.awt.Paint paint17 = piePlot6.getLabelPaint();
        piePlot0.setLabelPaint(paint17);
        java.awt.Image image19 = piePlot0.getBackgroundImage();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNull(pieURLGenerator9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(image19);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        java.awt.Paint paint6 = piePlot0.getShadowPaint();
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setInteriorGap((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (-1.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        piePlot0.drawBackgroundImage(graphics2D14, rectangle2D15);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(shape13);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup26 = piePlot25.getDatasetGroup();
        piePlot25.setBackgroundImageAlignment((int) 'a');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor29 = piePlot25.getLabelDistributor();
        piePlot0.setLabelDistributor(abstractPieLabelDistributor29);
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
        org.junit.Assert.assertNull(datasetGroup26);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor29);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.zoom(0.4d);
        java.awt.Stroke stroke5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) false, stroke5);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        piePlot1.setDataset(pieDataset7);
        boolean boolean9 = piePlot1.getSectionOutlinesVisible();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("", "hi!", "Pie Plot", xYDataset3, false, true, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("hi!", "hi!", "hi!", windDataset3, false, true, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        java.awt.Paint paint6 = piePlot0.getSectionOutlinePaint((java.lang.Comparable) (byte) 100);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNull(paint6);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot();
        double double28 = piePlot27.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor29 = piePlot27.getLabelDistributor();
        double double30 = piePlot27.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        piePlot27.drawBackgroundImage(graphics2D31, rectangle2D32);
        java.awt.Paint paint35 = piePlot27.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str36 = piePlot27.getNoDataMessage();
        java.awt.Paint paint37 = piePlot27.getLabelOutlinePaint();
        java.awt.Stroke stroke38 = piePlot27.getLabelOutlineStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState41 = piePlot0.initialise(graphics2D25, rectangle2D26, piePlot27, (java.lang.Integer) 10, plotRenderingInfo40);
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
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.14d + "'", double28 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0E-5d + "'", double30 == 1.0E-5d);
        org.junit.Assert.assertNull(paint35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(stroke38);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart3D("", "", "Pie Plot", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("Pie Plot", "hi!", "", xYDataset3, false, true, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.jfree.data.general.WaferMapDataset waferMapDataset1 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createWaferMapChart("hi!", waferMapDataset1, plotOrientation2, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("hi!", "hi!", "Pie Plot", boxAndWhiskerXYDataset3, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        piePlot0.setShadowYOffset(0.025d);
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
        org.junit.Assert.assertNotNull(font24);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.lang.String str3 = piePlot0.getPlotType();
        org.jfree.data.general.DatasetGroup datasetGroup4 = piePlot0.getDatasetGroup();
        java.awt.Shape shape5 = piePlot0.getLegendItemShape();
        boolean boolean6 = piePlot0.isOutlineVisible();
        piePlot0.setMaximumLabelWidth((double) (byte) 100);
        java.awt.Paint paint9 = piePlot0.getBaseSectionOutlinePaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(pieURLGenerator17);
        org.junit.Assert.assertNull(pieSectionLabelGenerator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.14d + "'", double23 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0E-5d + "'", double25 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 4.0d + "'", double27 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.025d + "'", double29 == 0.025d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 90.0d + "'", double30 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNotNull(font36);
        org.junit.Assert.assertNotNull(paint39);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Paint paint7 = piePlot0.getNoDataMessagePaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        piePlot0.handleClick((int) (short) -1, (int) (byte) 100, plotRenderingInfo10);
        java.awt.Paint paint12 = piePlot0.getBaseSectionPaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("Pie Plot", pieDataset1, pieDataset2, (int) (short) 100, true, false, true, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor15 = piePlot0.getLabelDistributor();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor15);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        org.jfree.data.general.DatasetGroup datasetGroup32 = piePlot0.getDatasetGroup();
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
        org.junit.Assert.assertNull(datasetGroup32);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        piePlot0.setCircular(true);
        // The following exception was thrown during execution in test generation
        try {
            double double45 = piePlot0.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart("", pieDataset1, true, true, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        double double4 = piePlot0.getShadowXOffset();
        boolean boolean5 = piePlot0.getIgnoreZeroValues();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot0.getSimpleLabelOffset();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(rectangleInsets6);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot1.getInsets();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14d + "'", double9 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(rectangleInsets14);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor18 = piePlot10.getLabelDistributor();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = piePlot10.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor18);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        boolean boolean2 = piePlot0.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot piePlot3 = new org.jfree.chart.plot.PiePlot();
        double double4 = piePlot3.getMaximumLabelWidth();
        piePlot3.setForegroundAlpha(100.0f);
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double8 = piePlot7.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor9 = piePlot7.getLabelDistributor();
        double double10 = piePlot7.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot7.drawBackgroundImage(graphics2D11, rectangle2D12);
        java.awt.Paint paint15 = piePlot7.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str16 = piePlot7.getNoDataMessage();
        java.awt.Paint paint17 = piePlot7.getLabelOutlinePaint();
        piePlot3.setBaseSectionOutlinePaint(paint17);
        piePlot0.setLabelOutlinePaint(paint17);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.14d + "'", double4 == 0.14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot();
        double double18 = piePlot17.getMaximumLabelWidth();
        piePlot17.setForegroundAlpha(100.0f);
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset22 = null;
        piePlot21.setDataset(pieDataset22);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator24 = piePlot21.getURLGenerator();
        org.jfree.chart.plot.Plot plot25 = piePlot21.getRootPlot();
        java.awt.Stroke stroke26 = piePlot21.getLabelOutlineStroke();
        java.awt.Shape shape27 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot21.setLegendItemShape(shape27);
        java.awt.Stroke stroke29 = piePlot21.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot();
        double double31 = piePlot30.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor32 = piePlot30.getLabelDistributor();
        double double33 = piePlot30.getMinimumArcAngleToDraw();
        java.awt.Paint paint34 = piePlot30.getBaseSectionOutlinePaint();
        double double35 = piePlot30.getShadowYOffset();
        piePlot30.setBackgroundImageAlignment((int) (byte) -1);
        double double38 = piePlot30.getInteriorGap();
        java.awt.Font font39 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot30.setNoDataMessageFont(font39);
        piePlot21.setLabelFont(font39);
        piePlot17.setLabelFont(font39);
        piePlot0.setNoDataMessageFont(font39);
        org.jfree.chart.plot.PiePlot piePlot45 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset46 = null;
        piePlot45.setDataset(pieDataset46);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator48 = piePlot45.getURLGenerator();
        org.jfree.chart.plot.Plot plot49 = piePlot45.getRootPlot();
        double double50 = piePlot45.getLabelGap();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator51 = piePlot45.getLegendLabelURLGenerator();
        org.jfree.chart.plot.PiePlot piePlot52 = new org.jfree.chart.plot.PiePlot();
        piePlot52.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint55 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot52.setLabelShadowPaint(paint55);
        piePlot45.setShadowPaint(paint55);
        piePlot0.setSectionPaint((java.lang.Comparable) (short) 10, paint55);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.14d + "'", double18 == 0.14d);
        org.junit.Assert.assertNull(pieURLGenerator24);
        org.junit.Assert.assertNotNull(plot25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.14d + "'", double31 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0E-5d + "'", double33 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 4.0d + "'", double35 == 4.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.08d + "'", double38 == 0.08d);
        org.junit.Assert.assertNotNull(font39);
        org.junit.Assert.assertNull(pieURLGenerator48);
        org.junit.Assert.assertNotNull(plot49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.025d + "'", double50 == 0.025d);
        org.junit.Assert.assertNull(pieURLGenerator51);
        org.junit.Assert.assertNotNull(paint55);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createHistogram("Pie Plot", "", "", intervalXYDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        double double4 = piePlot0.getShadowXOffset();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot0.getLabelGenerator();
        java.awt.Paint paint7 = piePlot0.getSectionOutlinePaint((java.lang.Comparable) '4');
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup10 = piePlot9.getDatasetGroup();
        piePlot9.setBackgroundImageAlignment((int) 'a');
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
        piePlot9.setSectionPaint((java.lang.Comparable) 1.0d, paint24);
        piePlot0.setSectionOutlinePaint((java.lang.Comparable) 10L, paint24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator5);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(datasetGroup10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-5d + "'", double17 == 1.0E-5d);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        double double19 = piePlot0.getShadowYOffset();
        java.awt.Paint paint20 = piePlot0.getBaseSectionOutlinePaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(paint18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4.0d + "'", double19 == 4.0d);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Stroke stroke3 = piePlot0.getOutlineStroke();
        piePlot0.setPieIndex(100);
        piePlot0.setLabelLinkMargin((double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setBackgroundImageAlpha((float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(stroke3);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        piePlot0.setOutlineVisible(true);
        java.awt.Paint paint8 = piePlot0.getLabelPaint();
        boolean boolean9 = piePlot0.getIgnoreNullValues();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        piePlot0.setPieIndex(0);
        piePlot0.setIgnoreNullValues(false);
        piePlot0.setShadowXOffset((double) '4');
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
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        java.lang.String str12 = piePlot0.getNoDataMessage();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pie Plot" + "'", str12, "Pie Plot");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.lang.String str3 = piePlot0.getPlotType();
        org.jfree.data.general.DatasetGroup datasetGroup4 = piePlot0.getDatasetGroup();
        java.awt.Shape shape5 = piePlot0.getLegendItemShape();
        boolean boolean6 = piePlot0.isOutlineVisible();
        piePlot0.setMaximumLabelWidth((double) (byte) 100);
        float float9 = piePlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot0.setToolTipGenerator(pieToolTipGenerator2);
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset7 = null;
        org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "hi!", "", boxAndWhiskerXYDataset7, false);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart9);
        java.awt.Paint paint11 = piePlot0.getLabelPaint();
        piePlot0.setForegroundAlpha((float) 'a');
        double double14 = piePlot0.getLabelLinkMargin();
        org.junit.Assert.assertNull(datasetGroup1);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.025d + "'", double14 == 0.025d);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        piePlot0.setPieIndex((int) (byte) 10);
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        piePlot7.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint10 = piePlot7.getLabelLinkPaint();
        piePlot0.setSectionOutlinePaint((java.lang.Comparable) "", paint10);
        piePlot0.setIgnoreZeroValues(false);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart3D("", "Pie Plot", "", categoryDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        double double4 = piePlot0.getShadowXOffset();
        piePlot0.setForegroundAlpha((float) 1L);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = piePlot0.getToolTipGenerator();
        boolean boolean8 = piePlot0.getIgnoreZeroValues();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawOutline(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
        org.junit.Assert.assertNull(pieToolTipGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setBackgroundImageAlpha((float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(pieURLGenerator14);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = piePlot0.getDrawingSupplier();
        double double6 = piePlot0.getLabelGap();
        piePlot0.setBackgroundAlpha((float) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.025d + "'", double6 == 0.025d);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", pieDataset1, pieDataset2, 0, true, true, false, locale7, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.axis.Timeline timeline4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createHighLowChart("hi!", "", "Pie Plot", oHLCDataset3, timeline4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        org.jfree.chart.LegendItemCollection legendItemCollection5 = piePlot0.getLegendItems();
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        double double7 = piePlot6.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor8 = piePlot6.getLabelDistributor();
        double double9 = piePlot6.getMinimumArcAngleToDraw();
        boolean boolean10 = piePlot6.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot11 = piePlot6.getRootPlot();
        piePlot6.setOutlineVisible(false);
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot();
        double double15 = piePlot14.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor16 = piePlot14.getLabelDistributor();
        double double17 = piePlot14.getMinimumArcAngleToDraw();
        java.awt.Paint paint18 = piePlot14.getBaseSectionOutlinePaint();
        double double19 = piePlot14.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = piePlot14.getSimpleLabelOffset();
        java.awt.Stroke stroke21 = piePlot14.getLabelLinkStroke();
        piePlot6.setLabelOutlineStroke(stroke21);
        org.jfree.chart.plot.Plot plot23 = piePlot6.getParent();
        org.jfree.data.general.DatasetGroup datasetGroup24 = piePlot6.getDatasetGroup();
        java.awt.Paint paint25 = piePlot6.getLabelBackgroundPaint();
        piePlot0.setBaseSectionPaint(paint25);
        piePlot0.setBackgroundImageAlignment(15);
        piePlot0.setSimpleLabels(false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14d + "'", double7 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-5d + "'", double9 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-5d + "'", double17 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4.0d + "'", double19 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNull(plot23);
        org.junit.Assert.assertNull(datasetGroup24);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("hi!", "", "Pie Plot", intervalCategoryDataset3, true, true, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("hi!", "hi!", "hi!", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent2 = null;
        piePlot1.axisChanged(axisChangeEvent2);
        java.awt.Stroke stroke4 = piePlot1.getLabelOutlineStroke();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        piePlot1.datasetChanged(datasetChangeEvent5);
        org.junit.Assert.assertNotNull(stroke4);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        org.jfree.chart.LegendItemCollection legendItemCollection20 = piePlot0.getLegendItems();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator21 = piePlot0.getToolTipGenerator();
        double double22 = piePlot0.getShadowYOffset();
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
        org.junit.Assert.assertNull(legendItemCollection20);
        org.junit.Assert.assertNull(pieToolTipGenerator21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator30 = piePlot0.getLabelGenerator();
        java.awt.Stroke stroke31 = piePlot0.getLabelLinkStroke();
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
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator30);
        org.junit.Assert.assertNotNull(stroke31);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        java.awt.Paint paint16 = piePlot0.getLabelShadowPaint();
        java.awt.Paint paint17 = piePlot0.getLabelBackgroundPaint();
        piePlot0.setCircular(true);
        java.awt.Stroke stroke20 = piePlot0.getLabelLinkStroke();
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
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke20);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        double double5 = piePlot0.getLabelGap();
        double double6 = piePlot0.getStartAngle();
        double double7 = piePlot0.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = piePlot0.getLabelPadding();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = piePlot0.getInsets();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 90.0d + "'", double6 == 90.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        piePlot0.setLabelGap((double) (-1.0f));
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
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        piePlot13.setDataset(pieDataset14);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = piePlot13.getURLGenerator();
        piePlot13.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator19 = piePlot13.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot();
        double double21 = piePlot20.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor22 = piePlot20.getLabelDistributor();
        double double23 = piePlot20.getMinimumArcAngleToDraw();
        boolean boolean24 = piePlot20.getIgnoreZeroValues();
        boolean boolean25 = piePlot20.isSubplot();
        piePlot20.setCircular(false);
        java.awt.Paint paint29 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot20.setSectionOutlinePaint((java.lang.Comparable) "", paint29);
        piePlot13.setNoDataMessagePaint(paint29);
        piePlot0.setLabelBackgroundPaint(paint29);
        java.awt.Stroke stroke33 = piePlot0.getBaseSectionOutlineStroke();
        java.awt.Paint paint34 = piePlot0.getLabelShadowPaint();
        int int35 = piePlot0.getBackgroundImageAlignment();
        java.awt.Graphics2D graphics2D36 = null;
        java.awt.geom.Rectangle2D rectangle2D37 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawOutline(graphics2D36, rectangle2D37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(pieURLGenerator16);
        org.junit.Assert.assertNull(pieSectionLabelGenerator19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.14d + "'", double21 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0E-5d + "'", double23 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 15 + "'", int35 == 15);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("", "", false, "Pie Plot", intervalXYDataset4, plotOrientation5, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        piePlot0.setOutlineVisible(true);
        piePlot0.setLabelLinkMargin((double) (short) -1);
        piePlot0.setForegroundAlpha(1.0f);
        double double8 = piePlot0.getLabelLinkMargin();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
        float float32 = piePlot0.getBackgroundAlpha();
        int int33 = piePlot0.getPieIndex();
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
        org.junit.Assert.assertNotNull(rectangleInsets29);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 1.0f + "'", float32 == 1.0f);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot11.getInsets();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent22 = null;
        piePlot11.notifyListeners(plotChangeEvent22);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator24 = null;
        piePlot11.setToolTipGenerator(pieToolTipGenerator24);
        org.jfree.data.general.DatasetGroup datasetGroup26 = piePlot11.getDatasetGroup();
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
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNull(datasetGroup26);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        boolean boolean20 = piePlot0.getSectionOutlinesVisible();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rotation12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        boolean boolean7 = piePlot0.getSectionOutlinesVisible();
        java.awt.Stroke stroke8 = piePlot0.getBaseSectionOutlineStroke();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        float float20 = piePlot0.getBackgroundImageAlpha();
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
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.5f + "'", float20 == 0.5f);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator17 = null;
        piePlot0.setToolTipGenerator(pieToolTipGenerator17);
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
        java.awt.Paint paint30 = piePlot19.getLabelShadowPaint();
        piePlot0.setLabelLinkPaint(paint30);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.14d + "'", double20 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0E-5d + "'", double22 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.08d + "'", double27 == 0.08d);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Font font3 = piePlot0.getLabelFont();
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset5 = null;
        piePlot4.setDataset(pieDataset5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot4.getURLGenerator();
        org.jfree.chart.plot.Plot plot8 = piePlot4.getRootPlot();
        double double9 = piePlot4.getLabelGap();
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        double double11 = piePlot10.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = piePlot10.getLabelDistributor();
        double double13 = piePlot10.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        piePlot10.drawBackgroundImage(graphics2D14, rectangle2D15);
        java.awt.Paint paint18 = piePlot10.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font19 = piePlot10.getLabelFont();
        piePlot10.setSimpleLabels(false);
        java.awt.Paint paint22 = piePlot10.getLabelPaint();
        java.awt.Paint paint23 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot10.setLabelOutlinePaint(paint23);
        piePlot10.setStartAngle((double) 100L);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator27 = piePlot10.getToolTipGenerator();
        java.awt.Paint paint28 = piePlot10.getLabelBackgroundPaint();
        piePlot4.setLabelLinkPaint(paint28);
        piePlot0.setLabelOutlinePaint(paint28);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator31 = piePlot0.getLegendLabelGenerator();
        org.jfree.chart.plot.Plot plot32 = piePlot0.getParent();
        org.junit.Assert.assertNotNull(font3);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.025d + "'", double9 == 0.025d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.14d + "'", double11 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-5d + "'", double13 == 1.0E-5d);
        org.junit.Assert.assertNull(paint18);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(pieToolTipGenerator27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator31);
        org.junit.Assert.assertNull(plot32);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        double double20 = piePlot0.getLabelGap();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14d + "'", double7 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-5d + "'", double9 == 1.0E-5d);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.025d + "'", double20 == 0.025d);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
        double double20 = piePlot0.getInteriorGap();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        piePlot0.markerChanged(markerChangeEvent21);
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.08d + "'", double20 == 0.08d);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        org.jfree.data.general.PieDataset pieDataset18 = null;
        piePlot0.setDataset(pieDataset18);
        piePlot0.setIgnoreNullValues(false);
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
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
        piePlot0.setCircular(false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNull(plot12);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        java.awt.Paint paint2 = piePlot0.getBackgroundPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot0.getInsets();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
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
        java.awt.Stroke stroke13 = piePlot0.getLabelOutlineStroke();
        piePlot0.setLabelGap((double) (-1.0f));
        piePlot0.setSimpleLabels(true);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        java.awt.Paint paint17 = piePlot0.getLabelOutlinePaint();
        double double18 = piePlot0.getLabelLinkMargin();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.025d + "'", double18 == 0.025d);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
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
        piePlot0.setBackgroundAlpha((float) (-1));
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
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        piePlot0.setBackgroundImageAlignment(0);
        piePlot0.setBackgroundImageAlpha((float) (byte) 1);
        org.jfree.chart.LegendItemCollection legendItemCollection19 = piePlot0.getLegendItems();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNull(legendItemCollection19);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
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
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        int int13 = piePlot0.getPieIndex();
        piePlot0.setExplodePercent((java.lang.Comparable) 0.025d, 1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        piePlot0.setBackgroundImageAlignment((int) 'a');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot0.getLabelDistributor();
        double double6 = piePlot0.getExplodePercent((java.lang.Comparable) 90.0d);
        double double7 = piePlot0.getLabelGap();
        float float8 = piePlot0.getBackgroundAlpha();
        double double9 = piePlot0.getMinimumArcAngleToDraw();
        org.junit.Assert.assertNull(datasetGroup1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.025d + "'", double7 == 0.025d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-5d + "'", double9 == 1.0E-5d);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        java.lang.String str18 = piePlot0.getNoDataMessage();
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
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart("hi!", pieDataset1, true, false, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint3 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot0.setLabelShadowPaint(paint3);
        float float5 = piePlot0.getForegroundAlpha();
        java.awt.Paint paint6 = piePlot0.getShadowPaint();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
        boolean boolean14 = piePlot0.isOutlineVisible();
        java.awt.Paint paint15 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setOutlineVisible(false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        boolean boolean7 = piePlot0.getSectionOutlinesVisible();
        piePlot0.setCircular(false, false);
        org.jfree.chart.LegendItemCollection legendItemCollection11 = piePlot0.getLegendItems();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(legendItemCollection11);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        boolean boolean5 = piePlot0.getSectionOutlinesVisible();
        java.awt.Stroke stroke6 = piePlot0.getLabelOutlineStroke();
        float float7 = piePlot0.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        piePlot8.setIgnoreNullValues(false);
        java.awt.Paint paint15 = piePlot8.getNoDataMessagePaint();
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot17 = piePlot16.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor18 = piePlot16.getLabelDistributor();
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
        java.awt.Paint paint32 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot19.setLabelOutlinePaint(paint32);
        piePlot16.setLabelShadowPaint(paint32);
        piePlot8.setBaseSectionOutlinePaint(paint32);
        piePlot0.setLabelLinkPaint(paint32);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14d + "'", double9 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-5d + "'", double11 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(plot17);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.14d + "'", double20 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0E-5d + "'", double22 == 1.0E-5d);
        org.junit.Assert.assertNull(paint27);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint32);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        piePlot0.setForegroundAlpha(100.0f);
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset5 = null;
        piePlot4.setDataset(pieDataset5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot4.getURLGenerator();
        org.jfree.chart.plot.Plot plot8 = piePlot4.getRootPlot();
        java.awt.Stroke stroke9 = piePlot4.getLabelOutlineStroke();
        java.awt.Shape shape10 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot4.setLegendItemShape(shape10);
        java.awt.Stroke stroke12 = piePlot4.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        double double14 = piePlot13.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor15 = piePlot13.getLabelDistributor();
        double double16 = piePlot13.getMinimumArcAngleToDraw();
        java.awt.Paint paint17 = piePlot13.getBaseSectionOutlinePaint();
        double double18 = piePlot13.getShadowYOffset();
        piePlot13.setBackgroundImageAlignment((int) (byte) -1);
        double double21 = piePlot13.getInteriorGap();
        java.awt.Font font22 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot13.setNoDataMessageFont(font22);
        piePlot4.setLabelFont(font22);
        piePlot0.setLabelFont(font22);
        int int26 = piePlot0.getPieIndex();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.14d + "'", double14 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-5d + "'", double16 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.08d + "'", double21 == 0.08d);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYAreaChart("", "", "hi!", xYDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
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
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator23 = piePlot0.getLegendLabelToolTipGenerator();
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
        org.junit.Assert.assertNull(pieSectionLabelGenerator23);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart3D("hi!", "", "", categoryDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        org.jfree.chart.plot.Plot plot2 = piePlot0.getParent();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = null;
        piePlot0.setLegendLabelURLGenerator(pieURLGenerator3);
        org.jfree.data.xy.WindDataset windDataset8 = null;
        org.jfree.chart.JFreeChart jFreeChart12 = org.jfree.chart.ChartFactory.createWindPlot("Pie Plot", "Pie Plot", "Pie Plot", windDataset8, true, true, false);
        piePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart12);
        piePlot0.setBackgroundAlpha((float) '4');
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(jFreeChart12);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("", "", "", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        boolean boolean4 = piePlot0.isOutlineVisible();
        java.awt.Paint paint5 = piePlot0.getNoDataMessagePaint();
        java.awt.Stroke stroke6 = piePlot0.getLabelOutlineStroke();
        boolean boolean7 = piePlot0.isCircular();
        java.awt.Shape shape8 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        piePlot0.setLegendItemShape(shape8);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator14 = piePlot10.getLegendLabelURLGenerator();
        double double15 = piePlot10.getMinimumArcAngleToDraw();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertNull(pieURLGenerator14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("", "hi!", "", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("Pie Plot", "hi!", "Pie Plot", intervalCategoryDataset3, false, false, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        piePlot0.setMinimumArcAngleToDraw((double) 100.0f);
        java.awt.Paint paint6 = piePlot0.getBaseSectionPaint();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        piePlot0.setForegroundAlpha(100.0f);
        piePlot0.zoom(0.0d);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        piePlot0.handleClick((int) (byte) 0, 1, plotRenderingInfo8);
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        piePlot10.setDataset(pieDataset11);
        java.awt.Paint paint13 = piePlot10.getLabelLinkPaint();
        java.awt.Paint paint14 = piePlot10.getNoDataMessagePaint();
        piePlot0.setOutlinePaint(paint14);
        double double16 = piePlot0.getMinimumArcAngleToDraw();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-5d + "'", double16 == 1.0E-5d);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        java.awt.Paint paint3 = piePlot0.getLabelLinkPaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent4 = null;
        piePlot0.axisChanged(axisChangeEvent4);
        java.awt.Image image6 = null;
        piePlot0.setBackgroundImage(image6);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
        boolean boolean15 = piePlot0.isSubplot();
        float float16 = piePlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        piePlot10.setDataset(pieDataset11);
        int int13 = piePlot10.getPieIndex();
        double double14 = piePlot10.getShadowXOffset();
        java.awt.Stroke stroke15 = piePlot10.getOutlineStroke();
        piePlot0.setLabelOutlineStroke(stroke15);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawBackground(graphics2D17, rectangle2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedAreaChart("", "hi!", "hi!", categoryDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
        boolean boolean14 = piePlot0.isOutlineVisible();
        java.awt.Stroke stroke15 = piePlot0.getLabelOutlineStroke();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Stroke stroke7 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot0.setLabelLinkStroke(stroke7);
        java.awt.Paint paint9 = piePlot0.getShadowPaint();
        piePlot0.setIgnoreZeroValues(false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot();
        double double10 = piePlot9.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor11 = piePlot9.getLabelDistributor();
        double double12 = piePlot9.getMinimumArcAngleToDraw();
        java.awt.Paint paint13 = piePlot9.getBaseSectionOutlinePaint();
        java.awt.Paint paint14 = piePlot9.getBaseSectionPaint();
        piePlot0.setLabelLinkPaint(paint14);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = piePlot0.getURLGenerator();
        java.awt.Stroke stroke17 = piePlot0.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(pieURLGenerator16);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedAreaChart("hi!", "hi!", "", categoryDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        // The following exception was thrown during execution in test generation
        try {
            plot37.setBackgroundImageAlpha(10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(plot37);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.axis.Timeline timeline4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createHighLowChart("", "Pie Plot", "hi!", oHLCDataset3, timeline4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        float float4 = piePlot0.getForegroundAlpha();
        java.awt.Stroke stroke5 = piePlot0.getBaseSectionOutlineStroke();
        java.awt.Stroke stroke6 = piePlot0.getLabelLinkStroke();
        piePlot0.setNoDataMessage("Pie Plot");
        java.awt.Paint paint10 = piePlot0.getSectionPaint((java.lang.Comparable) 1);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNull(paint10);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator14 = piePlot10.getLegendLabelURLGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot10.getLabelPadding();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertNull(pieURLGenerator14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        java.awt.Font font13 = piePlot0.getLabelFont();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(image12);
        org.junit.Assert.assertNotNull(font13);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
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
        piePlot0.setBackgroundAlpha(0.0f);
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
        piePlot16.setStartAngle((double) 100L);
        java.awt.Paint paint34 = piePlot16.getSectionOutlinePaint((java.lang.Comparable) (-1L));
        piePlot16.setExplodePercent((java.lang.Comparable) (short) 100, (double) '#');
        org.jfree.chart.plot.PiePlot piePlot38 = new org.jfree.chart.plot.PiePlot();
        double double39 = piePlot38.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor40 = piePlot38.getLabelDistributor();
        double double41 = piePlot38.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D42 = null;
        java.awt.geom.Rectangle2D rectangle2D43 = null;
        piePlot38.drawBackgroundImage(graphics2D42, rectangle2D43);
        java.awt.Paint paint46 = piePlot38.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font47 = piePlot38.getLabelFont();
        piePlot38.setSimpleLabels(false);
        java.awt.Paint paint50 = piePlot38.getLabelPaint();
        org.jfree.chart.plot.PiePlot piePlot51 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset52 = null;
        piePlot51.setDataset(pieDataset52);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator54 = piePlot51.getURLGenerator();
        piePlot51.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator57 = piePlot51.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot58 = new org.jfree.chart.plot.PiePlot();
        double double59 = piePlot58.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor60 = piePlot58.getLabelDistributor();
        double double61 = piePlot58.getMinimumArcAngleToDraw();
        boolean boolean62 = piePlot58.getIgnoreZeroValues();
        boolean boolean63 = piePlot58.isSubplot();
        piePlot58.setCircular(false);
        java.awt.Paint paint67 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot58.setSectionOutlinePaint((java.lang.Comparable) "", paint67);
        piePlot51.setNoDataMessagePaint(paint67);
        piePlot38.setLabelBackgroundPaint(paint67);
        java.awt.Stroke stroke71 = piePlot38.getBaseSectionOutlineStroke();
        piePlot16.setOutlineStroke(stroke71);
        piePlot0.setLabelLinkStroke(stroke71);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.14d + "'", double17 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0E-5d + "'", double19 == 1.0E-5d);
        org.junit.Assert.assertNull(paint24);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNull(paint34);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.14d + "'", double39 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0E-5d + "'", double41 == 1.0E-5d);
        org.junit.Assert.assertNull(paint46);
        org.junit.Assert.assertNotNull(font47);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNull(pieURLGenerator54);
        org.junit.Assert.assertNull(pieSectionLabelGenerator57);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.14d + "'", double59 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor60);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 1.0E-5d + "'", double61 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(paint67);
        org.junit.Assert.assertNotNull(stroke71);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        piePlot0.setExplodePercent((java.lang.Comparable) (-1), (double) (byte) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        piePlot0.axisChanged(axisChangeEvent8);
        java.awt.Paint paint10 = piePlot0.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
        java.awt.Font font12 = piePlot0.getLabelFont();
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        piePlot13.setDataset(pieDataset14);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = piePlot13.getURLGenerator();
        org.jfree.chart.plot.Plot plot17 = piePlot13.getRootPlot();
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset20 = null;
        piePlot19.setDataset(pieDataset20);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = piePlot19.getURLGenerator();
        piePlot19.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = piePlot19.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot();
        double double27 = piePlot26.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor28 = piePlot26.getLabelDistributor();
        double double29 = piePlot26.getMinimumArcAngleToDraw();
        boolean boolean30 = piePlot26.getIgnoreZeroValues();
        boolean boolean31 = piePlot26.isSubplot();
        piePlot26.setCircular(false);
        java.awt.Paint paint35 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot26.setSectionOutlinePaint((java.lang.Comparable) "", paint35);
        piePlot19.setNoDataMessagePaint(paint35);
        piePlot13.setSectionPaint((java.lang.Comparable) 52.0d, paint35);
        piePlot0.setLabelPaint(paint35);
        piePlot0.setIgnoreZeroValues(false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNull(pieURLGenerator16);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertNull(pieURLGenerator22);
        org.junit.Assert.assertNull(pieSectionLabelGenerator25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.14d + "'", double27 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0E-5d + "'", double29 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        boolean boolean12 = piePlot0.isCircular();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        boolean boolean21 = piePlot0.getIgnoreZeroValues();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14d + "'", double7 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-5d + "'", double9 == 1.0E-5d);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor18);
        org.junit.Assert.assertNull(image20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawOutline(graphics2D26, rectangle2D27);
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.14d + "'", double18 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E-5d + "'", double20 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNotNull(stroke24);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        java.awt.Stroke stroke5 = piePlot0.getLabelOutlineStroke();
        java.awt.Shape shape6 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot0.setLegendItemShape(shape6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot0.getLegendLabelURLGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = piePlot0.getSimpleLabelOffset();
        piePlot0.setOutlineVisible(false);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        piePlot0.setForegroundAlpha(100.0f);
        piePlot0.zoom(0.0d);
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
        java.awt.Paint paint20 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot7.setLabelOutlinePaint(paint20);
        piePlot7.setStartAngle((double) 100L);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator24 = piePlot7.getURLGenerator();
        java.awt.Paint paint25 = piePlot7.getLabelLinkPaint();
        piePlot0.setSectionOutlinePaint((java.lang.Comparable) 100.0f, paint25);
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
        piePlot27.setNoDataMessageFont(font43);
        boolean boolean45 = piePlot27.isOutlineVisible();
        org.jfree.chart.plot.PiePlot piePlot46 = new org.jfree.chart.plot.PiePlot();
        double double47 = piePlot46.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor48 = piePlot46.getLabelDistributor();
        double double49 = piePlot46.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D50 = null;
        java.awt.geom.Rectangle2D rectangle2D51 = null;
        piePlot46.drawBackgroundImage(graphics2D50, rectangle2D51);
        java.awt.Paint paint54 = piePlot46.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font55 = piePlot46.getLabelFont();
        piePlot46.setSimpleLabels(false);
        piePlot46.setMinimumArcAngleToDraw((double) 100);
        boolean boolean60 = piePlot46.isOutlineVisible();
        java.awt.Paint paint61 = piePlot46.getBaseSectionOutlinePaint();
        piePlot27.setLabelLinkPaint(paint61);
        piePlot0.setBaseSectionOutlinePaint(paint61);
        java.awt.Stroke stroke64 = piePlot0.getLabelOutlineStroke();
        org.jfree.chart.plot.PiePlot piePlot65 = new org.jfree.chart.plot.PiePlot();
        double double66 = piePlot65.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor67 = piePlot65.getLabelDistributor();
        double double68 = piePlot65.getMinimumArcAngleToDraw();
        java.awt.Paint paint69 = piePlot65.getBaseSectionOutlinePaint();
        double double70 = piePlot65.getShadowYOffset();
        piePlot65.setBackgroundImageAlignment((int) (byte) -1);
        piePlot65.setBackgroundImageAlpha((float) (short) 1);
        java.awt.Paint paint76 = piePlot65.getSectionOutlinePaint((java.lang.Comparable) 10.0d);
        java.awt.Font font77 = piePlot65.getLabelFont();
        piePlot0.setNoDataMessageFont(font77);
        piePlot0.zoom((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(pieURLGenerator24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.14d + "'", double28 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.14d + "'", double35 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0E-5d + "'", double37 == 1.0E-5d);
        org.junit.Assert.assertNull(paint42);
        org.junit.Assert.assertNotNull(font43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.14d + "'", double47 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0E-5d + "'", double49 == 1.0E-5d);
        org.junit.Assert.assertNull(paint54);
        org.junit.Assert.assertNotNull(font55);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(paint61);
        org.junit.Assert.assertNotNull(stroke64);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.14d + "'", double66 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor67);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 1.0E-5d + "'", double68 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint69);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 4.0d + "'", double70 == 4.0d);
        org.junit.Assert.assertNull(paint76);
        org.junit.Assert.assertNotNull(font77);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent3 = null;
        piePlot0.datasetChanged(datasetChangeEvent3);
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
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        org.jfree.chart.plot.Plot plot19 = piePlot0.getParent();
        java.awt.Stroke stroke20 = piePlot0.getBaseSectionOutlineStroke();
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot22 = piePlot21.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor23 = piePlot21.getLabelDistributor();
        java.awt.Paint paint24 = piePlot21.getLabelOutlinePaint();
        boolean boolean25 = piePlot21.isOutlineVisible();
        java.awt.Paint paint26 = piePlot21.getNoDataMessagePaint();
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset28 = null;
        piePlot27.setDataset(pieDataset28);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator30 = piePlot27.getURLGenerator();
        float float31 = piePlot27.getForegroundAlpha();
        java.awt.Stroke stroke32 = piePlot27.getBaseSectionOutlineStroke();
        java.awt.Stroke stroke33 = piePlot27.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot34 = new org.jfree.chart.plot.PiePlot();
        double double35 = piePlot34.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor36 = piePlot34.getLabelDistributor();
        double double37 = piePlot34.getMinimumArcAngleToDraw();
        java.awt.Paint paint38 = piePlot34.getBaseSectionOutlinePaint();
        double double39 = piePlot34.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = piePlot34.getSimpleLabelOffset();
        piePlot27.setLabelPadding(rectangleInsets40);
        piePlot21.setInsets(rectangleInsets40);
        piePlot0.setSimpleLabelOffset(rectangleInsets40);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator44 = null;
        piePlot0.setLegendLabelURLGenerator(pieURLGenerator44);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(pieURLGenerator17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(plot19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNull(plot22);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNull(pieURLGenerator30);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.14d + "'", double35 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0E-5d + "'", double37 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 4.0d + "'", double39 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets40);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        boolean boolean2 = piePlot0.isCircular();
        java.lang.String str3 = piePlot0.getPlotType();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = piePlot0.getLabelPadding();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertNotNull(rectangleInsets4);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
        boolean boolean12 = piePlot0.getLabelLinksVisible();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-5d + "'", double7 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        boolean boolean32 = piePlot0.getSectionOutlinesVisible();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createCandlestickChart("", "", "hi!", oHLCDataset3, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
        org.jfree.data.xy.OHLCDataset oHLCDataset23 = null;
        org.jfree.chart.JFreeChart jFreeChart25 = org.jfree.chart.ChartFactory.createHighLowChart("hi!", "hi!", "", oHLCDataset23, true);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart25);
        piePlot0.setStartAngle((double) 1.0f);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(jFreeChart25);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        piePlot0.setBackgroundImageAlignment((int) 'a');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot0.getLabelDistributor();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot0.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        piePlot6.setDataset(pieDataset7);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator9 = piePlot6.getURLGenerator();
        org.jfree.chart.plot.Plot plot10 = piePlot6.getRootPlot();
        double double11 = piePlot6.getLabelGap();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator12 = piePlot6.getLegendLabelGenerator();
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot();
        double double15 = piePlot14.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor16 = piePlot14.getLabelDistributor();
        double double17 = piePlot14.getMinimumArcAngleToDraw();
        java.awt.Paint paint18 = piePlot14.getBaseSectionOutlinePaint();
        piePlot14.setIgnoreNullValues(false);
        java.awt.Paint paint21 = piePlot14.getNoDataMessagePaint();
        piePlot6.setSectionPaint((java.lang.Comparable) 100L, paint21);
        piePlot0.setLabelPaint(paint21);
        org.jfree.data.general.DatasetGroup datasetGroup24 = piePlot0.getDatasetGroup();
        org.junit.Assert.assertNull(datasetGroup1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
        org.junit.Assert.assertNull(pieSectionLabelGenerator5);
        org.junit.Assert.assertNull(pieURLGenerator9);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.025d + "'", double11 == 0.025d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-5d + "'", double17 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNull(datasetGroup24);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        piePlot0.setDataset(pieDataset3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot0.setInsets(rectangleInsets5, false);
        java.lang.Class<?> wildcardClass8 = piePlot0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
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
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        java.awt.geom.Point2D point2D18 = null;
        org.jfree.chart.plot.PlotState plotState19 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.draw(graphics2D16, rectangle2D17, point2D18, plotState19, plotRenderingInfo20);
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
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", pieDataset1, pieDataset2, (int) (byte) 0, true, false, false, locale7, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.util.TableOrder tableOrder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createMultiplePieChart3D("Pie Plot", categoryDataset1, tableOrder2, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        piePlot0.setCircular(true);
        piePlot0.setForegroundAlpha((float) (short) 100);
        boolean boolean10 = piePlot0.getSimpleLabels();
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
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot30 = piePlot29.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor31 = piePlot29.getLabelDistributor();
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
        piePlot32.setBackgroundImageAlignment((int) '#');
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = piePlot32.getInsets();
        piePlot29.setLabelPadding(rectangleInsets47);
        piePlot19.setSimpleLabelOffset(rectangleInsets47);
        org.jfree.chart.plot.PiePlot piePlot50 = new org.jfree.chart.plot.PiePlot();
        double double51 = piePlot50.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor52 = piePlot50.getLabelDistributor();
        double double53 = piePlot50.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D54 = null;
        java.awt.geom.Rectangle2D rectangle2D55 = null;
        piePlot50.drawBackgroundImage(graphics2D54, rectangle2D55);
        java.awt.Paint paint58 = piePlot50.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font59 = piePlot50.getLabelFont();
        piePlot50.setSimpleLabels(false);
        java.awt.Paint paint62 = piePlot50.getLabelPaint();
        org.jfree.chart.plot.PiePlot piePlot63 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset64 = null;
        piePlot63.setDataset(pieDataset64);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator66 = piePlot63.getURLGenerator();
        piePlot63.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator69 = piePlot63.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot70 = new org.jfree.chart.plot.PiePlot();
        double double71 = piePlot70.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor72 = piePlot70.getLabelDistributor();
        double double73 = piePlot70.getMinimumArcAngleToDraw();
        boolean boolean74 = piePlot70.getIgnoreZeroValues();
        boolean boolean75 = piePlot70.isSubplot();
        piePlot70.setCircular(false);
        java.awt.Paint paint79 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot70.setSectionOutlinePaint((java.lang.Comparable) "", paint79);
        piePlot63.setNoDataMessagePaint(paint79);
        piePlot50.setLabelBackgroundPaint(paint79);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor83 = piePlot50.getLabelDistributor();
        piePlot19.setLabelDistributor(abstractPieLabelDistributor83);
        piePlot0.setLabelDistributor(abstractPieLabelDistributor83);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
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
        org.junit.Assert.assertNull(plot30);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor31);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.14d + "'", double33 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0E-5d + "'", double35 == 1.0E-5d);
        org.junit.Assert.assertNull(paint40);
        org.junit.Assert.assertNotNull(font41);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(rectangleInsets47);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.14d + "'", double51 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0E-5d + "'", double53 == 1.0E-5d);
        org.junit.Assert.assertNull(paint58);
        org.junit.Assert.assertNotNull(font59);
        org.junit.Assert.assertNotNull(paint62);
        org.junit.Assert.assertNull(pieURLGenerator66);
        org.junit.Assert.assertNull(pieSectionLabelGenerator69);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.14d + "'", double71 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor72);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 1.0E-5d + "'", double73 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(paint79);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor83);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
        double double11 = piePlot8.getMinimumArcAngleToDraw();
        boolean boolean12 = piePlot8.getIgnoreZeroValues();
        boolean boolean13 = piePlot8.isSubplot();
        piePlot8.setCircular(false);
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset19 = null;
        org.jfree.chart.JFreeChart jFreeChart21 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "hi!", "", boxAndWhiskerXYDataset19, false);
        piePlot8.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart21);
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset24 = null;
        piePlot23.setDataset(pieDataset24);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator26 = piePlot23.getURLGenerator();
        float float27 = piePlot23.getForegroundAlpha();
        java.awt.Stroke stroke28 = piePlot23.getBaseSectionOutlineStroke();
        java.awt.Stroke stroke29 = piePlot23.getLabelLinkStroke();
        piePlot8.setBaseSectionOutlineStroke(stroke29);
        piePlot0.setOutlineStroke(stroke29);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14d + "'", double9 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-5d + "'", double11 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jFreeChart21);
        org.junit.Assert.assertNull(pieURLGenerator26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(stroke29);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("hi!", "hi!", "", xYDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        piePlot0.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelToolTipGenerator();
        double double7 = piePlot0.getShadowXOffset();
        piePlot0.setLabelLinkMargin((double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = piePlot0.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        double double37 = piePlot20.getLabelGap();
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
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.025d + "'", double37 == 0.025d);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setBackgroundImageAlpha((float) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        boolean boolean5 = piePlot0.isSubplot();
        java.awt.Paint paint6 = piePlot0.getNoDataMessagePaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent7 = null;
        piePlot0.datasetChanged(datasetChangeEvent7);
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot();
        double double10 = piePlot9.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor11 = piePlot9.getLabelDistributor();
        java.lang.String str12 = piePlot9.getPlotType();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = piePlot9.getLabelGenerator();
        piePlot0.setLabelGenerator(pieSectionLabelGenerator13);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pie Plot" + "'", str12, "Pie Plot");
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator13);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("Pie Plot", "Pie Plot", "Pie Plot", xYDataset3, false, true, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        double double4 = piePlot0.getShadowXOffset();
        piePlot0.setForegroundAlpha((float) 1L);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = piePlot0.getToolTipGenerator();
        piePlot0.setBackgroundAlpha(0.0f);
        piePlot0.setLabelGap(1.0d);
        int int12 = piePlot0.getPieIndex();
        piePlot0.setOutlineVisible(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
        org.junit.Assert.assertNull(pieToolTipGenerator7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        java.lang.Object obj20 = piePlot0.clone();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator21 = piePlot0.getLegendLabelToolTipGenerator();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent22 = null;
        piePlot0.datasetChanged(datasetChangeEvent22);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14d + "'", double7 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-5d + "'", double9 == 1.0E-5d);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor18);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNull(pieSectionLabelGenerator21);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        boolean boolean5 = piePlot0.isSubplot();
        piePlot0.setCircular(false);
        java.awt.Paint paint9 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot0.setSectionOutlinePaint((java.lang.Comparable) "", paint9);
        java.lang.String str11 = piePlot0.getNoDataMessage();
        double double12 = piePlot0.getInteriorGap();
        java.awt.Stroke stroke13 = piePlot0.getLabelOutlineStroke();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawOutline(graphics2D14, rectangle2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.08d + "'", double12 == 0.08d);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        double double6 = piePlot0.getMinimumArcAngleToDraw();
        piePlot0.setNoDataMessage("Pie Plot");
        double double9 = piePlot0.getLabelGap();
        java.awt.Paint paint10 = piePlot0.getLabelOutlinePaint();
        boolean boolean11 = piePlot0.getIgnoreZeroValues();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = piePlot0.getLegendLabelURLGenerator();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-5d + "'", double6 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.025d + "'", double9 == 0.025d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(pieURLGenerator12);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        piePlot0.setForegroundAlpha((float) '4');
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
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot0.setToolTipGenerator(pieToolTipGenerator2);
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset7 = null;
        org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "hi!", "", boxAndWhiskerXYDataset7, false);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart9);
        java.awt.Paint paint11 = piePlot0.getBackgroundPaint();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        piePlot0.drawBackgroundImage(graphics2D12, rectangle2D13);
        piePlot0.setSectionOutlinesVisible(true);
        org.junit.Assert.assertNull(datasetGroup1);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("Pie Plot", "", "hi!", xYDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawOutline(graphics2D4, rectangle2D5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getShadowYOffset();
        piePlot0.setIgnoreNullValues(false);
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        piePlot5.setDataset(pieDataset6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot5.getURLGenerator();
        float float9 = piePlot5.getForegroundAlpha();
        java.awt.Stroke stroke10 = piePlot5.getBaseSectionOutlineStroke();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator11 = piePlot5.getLegendLabelGenerator();
        piePlot0.setLegendLabelGenerator(pieSectionLabelGenerator11);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator11);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        java.awt.Paint paint6 = piePlot0.getLabelPaint();
        java.awt.Paint paint7 = piePlot0.getLabelPaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = piePlot0.getDrawingSupplier();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot0.getDrawingSupplier();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertNotNull(drawingSupplier9);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        double double5 = piePlot0.getLabelGap();
        java.awt.Stroke stroke6 = piePlot0.getLabelLinkStroke();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator19 = piePlot18.getLegendLabelGenerator();
        piePlot18.setOutlineVisible(true);
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        double double23 = piePlot22.getMaximumLabelWidth();
        piePlot22.setForegroundAlpha((float) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot22.setInsets(rectangleInsets26);
        piePlot18.setLabelPadding(rectangleInsets26);
        piePlot10.setLabelPadding(rectangleInsets26);
        java.awt.Font font30 = piePlot10.getLabelFont();
        piePlot10.setLabelLinksVisible(false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.14d + "'", double23 == 0.14d);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertNotNull(font30);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
        float float3 = piePlot0.getForegroundAlpha();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        piePlot0.setSectionOutlinesVisible(false);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot0.getURLGenerator();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(pieURLGenerator7);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
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
        java.awt.Stroke stroke22 = piePlot0.getLabelLinkStroke();
        double double24 = piePlot0.getExplodePercent((java.lang.Comparable) 100);
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("Pie Plot", "", "Pie Plot", tableXYDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot0.getLabelGenerator();
        piePlot0.setMaximumLabelWidth((-1.0d));
        piePlot0.setLabelGap((double) (short) -1);
        boolean boolean10 = piePlot0.getSectionOutlinesVisible();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
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
        double double21 = piePlot0.getExplodePercent((java.lang.Comparable) 0L);
        org.jfree.chart.LegendItemCollection legendItemCollection22 = piePlot0.getLegendItems();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNull(legendItemCollection22);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart3D("Pie Plot", "hi!", "hi!", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("Pie Plot", "", "", intervalCategoryDataset3, false, false, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("", "Pie Plot", "", intervalCategoryDataset3, true, false, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
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
        piePlot0.setShadowXOffset(90.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        piePlot0.setOutlineVisible(true);
        piePlot0.setLabelLinkMargin((double) (short) -1);
        piePlot0.setSimpleLabels(false);
        double double8 = piePlot0.getLabelGap();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.025d + "'", double8 == 0.025d);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        org.jfree.chart.plot.PiePlot piePlot39 = new org.jfree.chart.plot.PiePlot();
        double double40 = piePlot39.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor41 = piePlot39.getLabelDistributor();
        double double42 = piePlot39.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D43 = null;
        java.awt.geom.Rectangle2D rectangle2D44 = null;
        piePlot39.drawBackgroundImage(graphics2D43, rectangle2D44);
        java.awt.Paint paint47 = piePlot39.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font48 = piePlot39.getLabelFont();
        piePlot39.setSimpleLabels(false);
        java.awt.Paint paint51 = piePlot39.getLabelPaint();
        org.jfree.chart.plot.PiePlot piePlot52 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset53 = null;
        piePlot52.setDataset(pieDataset53);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator55 = piePlot52.getURLGenerator();
        piePlot52.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator58 = piePlot52.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot59 = new org.jfree.chart.plot.PiePlot();
        double double60 = piePlot59.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor61 = piePlot59.getLabelDistributor();
        double double62 = piePlot59.getMinimumArcAngleToDraw();
        boolean boolean63 = piePlot59.getIgnoreZeroValues();
        boolean boolean64 = piePlot59.isSubplot();
        piePlot59.setCircular(false);
        java.awt.Paint paint68 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot59.setSectionOutlinePaint((java.lang.Comparable) "", paint68);
        piePlot52.setNoDataMessagePaint(paint68);
        piePlot39.setLabelBackgroundPaint(paint68);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor72 = piePlot39.getLabelDistributor();
        piePlot8.setLabelDistributor(abstractPieLabelDistributor72);
        piePlot8.setSectionOutlinesVisible(true);
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
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.14d + "'", double40 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0E-5d + "'", double42 == 1.0E-5d);
        org.junit.Assert.assertNull(paint47);
        org.junit.Assert.assertNotNull(font48);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNull(pieURLGenerator55);
        org.junit.Assert.assertNull(pieSectionLabelGenerator58);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.14d + "'", double60 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor61);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 1.0E-5d + "'", double62 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(paint68);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor72);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
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
        double double24 = piePlot0.getShadowXOffset();
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        boolean boolean5 = piePlot0.isSubplot();
        piePlot0.setCircular(false);
        java.awt.Paint paint9 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot0.setSectionOutlinePaint((java.lang.Comparable) "", paint9);
        java.lang.String str11 = piePlot0.getNoDataMessage();
        double double12 = piePlot0.getInteriorGap();
        int int13 = piePlot0.getPieIndex();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.08d + "'", double12 == 0.08d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        java.awt.Paint paint6 = piePlot0.getShadowPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator7 = piePlot0.getLegendLabelGenerator();
        java.awt.Paint paint8 = piePlot0.getLabelPaint();
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot();
        piePlot9.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint12 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot9.setLabelShadowPaint(paint12);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        piePlot9.handleClick((int) ' ', (int) (short) -1, plotRenderingInfo16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = piePlot9.getDrawingSupplier();
        piePlot0.setDrawingSupplier(drawingSupplier18);
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawBackground(graphics2D20, rectangle2D21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(drawingSupplier18);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        double double4 = piePlot0.getShadowXOffset();
        piePlot0.setForegroundAlpha((float) 1L);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = piePlot0.getToolTipGenerator();
        piePlot0.setBackgroundAlpha(0.0f);
        piePlot0.setShadowYOffset(90.0d);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset15 = null;
        piePlot14.setDataset(pieDataset15);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator17 = piePlot14.getURLGenerator();
        piePlot14.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator20 = piePlot14.getLegendLabelToolTipGenerator();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator21 = null;
        piePlot14.setURLGenerator(pieURLGenerator21);
        boolean boolean23 = piePlot14.getSimpleLabels();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState26 = piePlot0.initialise(graphics2D12, rectangle2D13, piePlot14, (java.lang.Integer) 100, plotRenderingInfo25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
        org.junit.Assert.assertNull(pieToolTipGenerator7);
        org.junit.Assert.assertNull(pieURLGenerator17);
        org.junit.Assert.assertNull(pieSectionLabelGenerator20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("Pie Plot", "Pie Plot", "Pie Plot", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent41 = null;
        piePlot0.axisChanged(axisChangeEvent41);
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = piePlot0.getInsets();
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
        org.junit.Assert.assertNotNull(rectangleInsets43);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        piePlot13.setDataset(pieDataset14);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = piePlot13.getURLGenerator();
        piePlot13.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator19 = piePlot13.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot();
        double double21 = piePlot20.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor22 = piePlot20.getLabelDistributor();
        double double23 = piePlot20.getMinimumArcAngleToDraw();
        boolean boolean24 = piePlot20.getIgnoreZeroValues();
        boolean boolean25 = piePlot20.isSubplot();
        piePlot20.setCircular(false);
        java.awt.Paint paint29 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot20.setSectionOutlinePaint((java.lang.Comparable) "", paint29);
        piePlot13.setNoDataMessagePaint(paint29);
        piePlot0.setLabelBackgroundPaint(paint29);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor33 = piePlot0.getLabelDistributor();
        org.jfree.data.general.PieDataset pieDataset34 = piePlot0.getDataset();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(pieURLGenerator16);
        org.junit.Assert.assertNull(pieSectionLabelGenerator19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.14d + "'", double21 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0E-5d + "'", double23 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor33);
        org.junit.Assert.assertNull(pieDataset34);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Paint paint7 = piePlot0.getNoDataMessagePaint();
        java.awt.Stroke stroke9 = piePlot0.getSectionOutlineStroke((java.lang.Comparable) 52.0d);
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        piePlot10.setDataset(pieDataset11);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = piePlot10.getURLGenerator();
        org.jfree.chart.plot.Plot plot14 = piePlot10.getRootPlot();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor15 = piePlot10.getLabelDistributor();
        boolean boolean16 = piePlot10.isSubplot();
        piePlot10.setPieIndex(0);
        piePlot10.setExplodePercent((java.lang.Comparable) 0.4d, 1.0E-5d);
        java.awt.Paint paint22 = piePlot10.getLabelLinkPaint();
        piePlot0.setBackgroundPaint(paint22);
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot();
        double double27 = piePlot26.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor28 = piePlot26.getLabelDistributor();
        double double29 = piePlot26.getMinimumArcAngleToDraw();
        boolean boolean30 = piePlot26.getIgnoreZeroValues();
        boolean boolean31 = piePlot26.isSubplot();
        piePlot26.setCircular(false);
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset37 = null;
        org.jfree.chart.JFreeChart jFreeChart39 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "hi!", "", boxAndWhiskerXYDataset37, false);
        piePlot26.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart39);
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset42 = null;
        piePlot41.setDataset(pieDataset42);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator44 = piePlot41.getURLGenerator();
        float float45 = piePlot41.getForegroundAlpha();
        java.awt.Stroke stroke46 = piePlot41.getBaseSectionOutlineStroke();
        java.awt.Stroke stroke47 = piePlot41.getLabelLinkStroke();
        piePlot26.setBaseSectionOutlineStroke(stroke47);
        java.awt.Image image49 = null;
        piePlot26.setBackgroundImage(image49);
        double double51 = piePlot26.getStartAngle();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo53 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState54 = piePlot0.initialise(graphics2D24, rectangle2D25, piePlot26, (java.lang.Integer) 0, plotRenderingInfo53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(stroke9);
        org.junit.Assert.assertNull(pieURLGenerator13);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.14d + "'", double27 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0E-5d + "'", double29 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jFreeChart39);
        org.junit.Assert.assertNull(pieURLGenerator44);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 1.0f + "'", float45 == 1.0f);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertNotNull(stroke47);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 90.0d + "'", double51 == 90.0d);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot17 = piePlot16.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor18 = piePlot16.getLabelDistributor();
        java.awt.Paint paint19 = piePlot16.getNoDataMessagePaint();
        java.awt.Paint paint20 = piePlot16.getLabelPaint();
        piePlot0.setLabelPaint(paint20);
        java.awt.Paint paint22 = piePlot0.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(plot17);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("", "Pie Plot", "Pie Plot", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
        int int14 = piePlot0.getBackgroundImageAlignment();
        piePlot0.setPieIndex((int) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        org.jfree.chart.plot.Plot plot2 = piePlot0.getParent();
        boolean boolean3 = piePlot0.isCircular();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier4 = piePlot0.getDrawingSupplier();
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        double double6 = piePlot5.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor7 = piePlot5.getLabelDistributor();
        double double8 = piePlot5.getMinimumArcAngleToDraw();
        java.awt.Paint paint9 = piePlot5.getBaseSectionOutlinePaint();
        double double10 = piePlot5.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot5.getSimpleLabelOffset();
        piePlot0.setSimpleLabelOffset(rectangleInsets11);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(drawingSupplier4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.14d + "'", double6 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        java.awt.Paint paint14 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setLabelPaint(paint14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
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
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createRingChart("Pie Plot", pieDataset1, false, false, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        org.jfree.chart.plot.Plot plot28 = piePlot0.getParent();
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
        org.junit.Assert.assertNull(plot28);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.jfree.data.xy.XYZDataset xYZDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBubbleChart("Pie Plot", "Pie Plot", "hi!", xYZDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        java.awt.Stroke stroke5 = piePlot0.getLabelOutlineStroke();
        java.awt.Shape shape6 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot0.setLegendItemShape(shape6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot0.getLegendLabelURLGenerator();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator9 = piePlot0.getLegendLabelToolTipGenerator();
        double double10 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        piePlot0.drawBackgroundImage(graphics2D11, rectangle2D12);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNull(pieSectionLabelGenerator9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        java.awt.Paint paint16 = piePlot0.getLabelShadowPaint();
        piePlot0.setSimpleLabels(false);
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
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = piePlot0.getDrawingSupplier();
        double double6 = piePlot0.getShadowXOffset();
        java.awt.Paint paint7 = piePlot0.getLabelLinkPaint();
        org.jfree.chart.util.Rotation rotation8 = piePlot0.getDirection();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent9 = null;
        piePlot0.datasetChanged(datasetChangeEvent9);
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot(pieDataset11);
        piePlot12.zoom(0.4d);
        java.awt.Stroke stroke16 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot12.setSectionOutlineStroke((java.lang.Comparable) false, stroke16);
        piePlot0.setLabelLinkStroke(stroke16);
        piePlot0.setSectionOutlinesVisible(false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(rotation8);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getNoDataMessagePaint();
        double double4 = piePlot0.getInteriorGap();
        java.awt.Stroke stroke5 = piePlot0.getBaseSectionOutlineStroke();
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        double double7 = piePlot6.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot6.getDatasetGroup();
        piePlot6.setOutlineVisible(true);
        boolean boolean12 = piePlot6.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        double double14 = piePlot13.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor15 = piePlot13.getLabelDistributor();
        double double16 = piePlot13.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        piePlot13.drawBackgroundImage(graphics2D17, rectangle2D18);
        java.awt.Paint paint21 = piePlot13.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font22 = piePlot13.getLabelFont();
        piePlot6.setNoDataMessageFont(font22);
        boolean boolean24 = piePlot6.isOutlineVisible();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = piePlot6.getInsets();
        double double27 = piePlot6.getExplodePercent((java.lang.Comparable) 52.0d);
        java.awt.Stroke stroke28 = piePlot6.getLabelLinkStroke();
        piePlot0.setBaseSectionOutlineStroke(stroke28);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08d + "'", double4 == 0.08d);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14d + "'", double7 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.14d + "'", double14 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-5d + "'", double16 == 1.0E-5d);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(stroke28);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
        piePlot0.setCircular(true);
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
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.lang.String str3 = piePlot0.getPlotType();
        org.jfree.data.general.DatasetGroup datasetGroup4 = piePlot0.getDatasetGroup();
        java.awt.Paint paint5 = piePlot0.getOutlinePaint();
        org.jfree.data.general.DatasetGroup datasetGroup6 = piePlot0.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(datasetGroup6);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createHighLowChart("Pie Plot", "", "Pie Plot", oHLCDataset3, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreNullValues();
        boolean boolean5 = piePlot0.getIgnoreNullValues();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        piePlot0.setDataset(pieDataset6);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup20 = piePlot19.getDatasetGroup();
        piePlot19.setBackgroundImageAlignment((int) 'a');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor23 = piePlot19.getLabelDistributor();
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset25 = null;
        piePlot24.setDataset(pieDataset25);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator27 = piePlot24.getURLGenerator();
        piePlot24.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator30 = piePlot24.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot();
        double double32 = piePlot31.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor33 = piePlot31.getLabelDistributor();
        double double34 = piePlot31.getMinimumArcAngleToDraw();
        boolean boolean35 = piePlot31.getIgnoreZeroValues();
        boolean boolean36 = piePlot31.isSubplot();
        piePlot31.setCircular(false);
        java.awt.Paint paint40 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot31.setSectionOutlinePaint((java.lang.Comparable) "", paint40);
        piePlot24.setNoDataMessagePaint(paint40);
        piePlot19.setBaseSectionOutlinePaint(paint40);
        piePlot0.setSectionPaint((java.lang.Comparable) (short) 1, paint40);
        org.jfree.chart.plot.PiePlot piePlot45 = new org.jfree.chart.plot.PiePlot();
        double double46 = piePlot45.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor47 = piePlot45.getLabelDistributor();
        double double48 = piePlot45.getMinimumArcAngleToDraw();
        java.awt.Paint paint49 = piePlot45.getBaseSectionOutlinePaint();
        piePlot45.setIgnoreNullValues(false);
        java.awt.Paint paint52 = piePlot45.getNoDataMessagePaint();
        java.awt.Paint paint53 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot45.setLabelPaint(paint53);
        piePlot0.setLabelShadowPaint(paint53);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.14d + "'", double13 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(datasetGroup20);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor23);
        org.junit.Assert.assertNull(pieURLGenerator27);
        org.junit.Assert.assertNull(pieSectionLabelGenerator30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.14d + "'", double32 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0E-5d + "'", double34 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.14d + "'", double46 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0E-5d + "'", double48 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertNotNull(paint53);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createRingChart("", pieDataset1, false, false, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        boolean boolean4 = piePlot0.isOutlineVisible();
        java.awt.Paint paint5 = piePlot0.getNoDataMessagePaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot0.getURLGenerator();
        boolean boolean7 = piePlot0.isSubplot();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setMinimumArcAngleToDraw((double) '4');
        piePlot0.setStartAngle((double) 1L);
        piePlot0.setSectionOutlinesVisible(true);
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
        piePlot7.setBackgroundImageAlignment((int) '#');
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        double double23 = piePlot22.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor24 = piePlot22.getLabelDistributor();
        java.awt.Paint paint25 = piePlot22.getLabelOutlinePaint();
        org.jfree.data.xy.XYDataset xYDataset27 = null;
        org.jfree.chart.JFreeChart jFreeChart31 = org.jfree.chart.ChartFactory.createPolarChart("", xYDataset27, false, false, true);
        piePlot22.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart31);
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot();
        double double34 = piePlot33.getMaximumLabelWidth();
        piePlot33.setForegroundAlpha((float) (short) 0);
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot();
        double double38 = piePlot37.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor39 = piePlot37.getLabelDistributor();
        double double40 = piePlot37.getMinimumArcAngleToDraw();
        java.awt.Paint paint41 = piePlot37.getBaseSectionOutlinePaint();
        double double42 = piePlot37.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = piePlot37.getSimpleLabelOffset();
        piePlot33.setInsets(rectangleInsets43);
        piePlot22.setInsets(rectangleInsets43, false);
        piePlot7.setInsets(rectangleInsets43, false);
        piePlot0.setLabelPadding(rectangleInsets43);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.14d + "'", double23 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(jFreeChart31);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.14d + "'", double34 == 0.14d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.14d + "'", double38 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0E-5d + "'", double40 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 4.0d + "'", double42 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets43);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor5 = piePlot0.getLabelDistributor();
        org.jfree.data.general.PieDataset pieDataset6 = piePlot0.getDataset();
        java.awt.Stroke stroke7 = piePlot0.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        piePlot8.setDataset(pieDataset9);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator11 = piePlot8.getURLGenerator();
        org.jfree.chart.plot.Plot plot12 = piePlot8.getRootPlot();
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset15 = null;
        piePlot14.setDataset(pieDataset15);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator17 = piePlot14.getURLGenerator();
        piePlot14.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator20 = piePlot14.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot();
        double double22 = piePlot21.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor23 = piePlot21.getLabelDistributor();
        double double24 = piePlot21.getMinimumArcAngleToDraw();
        boolean boolean25 = piePlot21.getIgnoreZeroValues();
        boolean boolean26 = piePlot21.isSubplot();
        piePlot21.setCircular(false);
        java.awt.Paint paint30 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot21.setSectionOutlinePaint((java.lang.Comparable) "", paint30);
        piePlot14.setNoDataMessagePaint(paint30);
        piePlot8.setSectionPaint((java.lang.Comparable) 52.0d, paint30);
        boolean boolean34 = piePlot8.getLabelLinksVisible();
        java.awt.Paint paint35 = piePlot8.getLabelPaint();
        piePlot0.setOutlinePaint(paint35);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor5);
        org.junit.Assert.assertNull(pieDataset6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(pieURLGenerator11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(pieURLGenerator17);
        org.junit.Assert.assertNull(pieSectionLabelGenerator20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.14d + "'", double22 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0E-5d + "'", double24 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        piePlot0.markerChanged(markerChangeEvent10);
        org.jfree.data.general.DatasetGroup datasetGroup12 = piePlot0.getDatasetGroup();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = piePlot0.getLegendLabelGenerator();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(datasetGroup12);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator13);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        piePlot0.setDataset(pieDataset3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot0.setInsets(rectangleInsets5, false);
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        double double9 = piePlot8.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor10 = piePlot8.getLabelDistributor();
        double double11 = piePlot8.getMinimumArcAngleToDraw();
        boolean boolean12 = piePlot8.getIgnoreZeroValues();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator13 = piePlot8.getLabelGenerator();
        piePlot8.setMaximumLabelWidth((-1.0d));
        piePlot8.setCircular(false);
        java.lang.String str18 = piePlot8.getNoDataMessage();
        org.jfree.chart.util.Rotation rotation19 = piePlot8.getDirection();
        piePlot0.setDirection(rotation19);
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot();
        double double22 = piePlot21.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor23 = piePlot21.getLabelDistributor();
        java.awt.Paint paint24 = piePlot21.getLabelOutlinePaint();
        org.jfree.data.xy.XYDataset xYDataset26 = null;
        org.jfree.chart.JFreeChart jFreeChart30 = org.jfree.chart.ChartFactory.createPolarChart("", xYDataset26, false, false, true);
        piePlot21.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart30);
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot();
        double double33 = piePlot32.getMaximumLabelWidth();
        piePlot32.setForegroundAlpha((float) (short) 0);
        org.jfree.chart.plot.PiePlot piePlot36 = new org.jfree.chart.plot.PiePlot();
        double double37 = piePlot36.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor38 = piePlot36.getLabelDistributor();
        double double39 = piePlot36.getMinimumArcAngleToDraw();
        java.awt.Paint paint40 = piePlot36.getBaseSectionOutlinePaint();
        double double41 = piePlot36.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets42 = piePlot36.getSimpleLabelOffset();
        piePlot32.setInsets(rectangleInsets42);
        piePlot21.setInsets(rectangleInsets42, false);
        boolean boolean46 = piePlot21.isCircular();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent47 = null;
        piePlot21.axisChanged(axisChangeEvent47);
        java.awt.Paint paint49 = piePlot21.getLabelShadowPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets50 = piePlot21.getSimpleLabelOffset();
        piePlot0.setInsets(rectangleInsets50);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14d + "'", double9 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-5d + "'", double11 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(rotation19);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.14d + "'", double22 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(jFreeChart30);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.14d + "'", double33 == 0.14d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.14d + "'", double37 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0E-5d + "'", double39 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 4.0d + "'", double41 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(rectangleInsets50);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        piePlot3.setBackgroundImageAlignment((int) '#');
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3.getInsets();
        piePlot0.setLabelPadding(rectangleInsets18);
        java.awt.Image image20 = piePlot0.getBackgroundImage();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.14d + "'", double4 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-5d + "'", double6 == 1.0E-5d);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNull(image20);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        piePlot0.setDataset(pieDataset3);
        piePlot0.setPieIndex((int) '4');
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot0.axisChanged(axisChangeEvent7);
        boolean boolean9 = piePlot0.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        piePlot0.setDataset(pieDataset3);
        int int5 = piePlot0.getPieIndex();
        java.awt.Paint paint6 = piePlot0.getLabelLinkPaint();
        piePlot0.setNoDataMessage("hi!");
        java.awt.Paint paint10 = piePlot0.getSectionOutlinePaint((java.lang.Comparable) (short) 1);
        double double11 = piePlot0.getInteriorGap();
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
        java.awt.Stroke stroke54 = piePlot12.getBaseSectionOutlineStroke();
        org.jfree.chart.plot.Plot plot55 = piePlot12.getRootPlot();
        java.awt.Paint paint56 = piePlot12.getNoDataMessagePaint();
        piePlot0.setOutlinePaint(paint56);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.08d + "'", double11 == 0.08d);
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
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertNotNull(plot55);
        org.junit.Assert.assertNotNull(paint56);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        int int44 = plot43.getBackgroundImageAlignment();
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 15 + "'", int44 == 15);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
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
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator20 = piePlot0.getLegendLabelGenerator();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNull(plot12);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator20);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot();
        double double21 = piePlot20.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup22 = piePlot20.getDatasetGroup();
        piePlot20.setOutlineVisible(true);
        boolean boolean25 = piePlot20.getSectionOutlinesVisible();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator26 = piePlot20.getLegendLabelGenerator();
        boolean boolean27 = piePlot20.getSectionOutlinesVisible();
        boolean boolean28 = piePlot14.equals((java.lang.Object) piePlot20);
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
        java.awt.Paint paint42 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot29.setLabelOutlinePaint(paint42);
        piePlot29.setStartAngle((double) 100L);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator46 = piePlot29.getURLGenerator();
        java.awt.Paint paint47 = piePlot29.getLabelLinkPaint();
        org.jfree.chart.plot.Plot plot48 = piePlot29.getParent();
        java.awt.Stroke stroke49 = piePlot29.getBaseSectionOutlineStroke();
        piePlot14.setLabelOutlineStroke(stroke49);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(plot15);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor16);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.14d + "'", double21 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.14d + "'", double30 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0E-5d + "'", double32 == 1.0E-5d);
        org.junit.Assert.assertNull(paint37);
        org.junit.Assert.assertNotNull(font38);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNull(pieURLGenerator46);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNull(plot48);
        org.junit.Assert.assertNotNull(stroke49);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
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
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent15 = null;
        piePlot0.axisChanged(axisChangeEvent15);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        float float4 = piePlot0.getForegroundAlpha();
        float float5 = piePlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        org.jfree.chart.plot.Plot plot2 = piePlot0.getParent();
        float float3 = piePlot0.getBackgroundImageAlpha();
        java.awt.Shape shape4 = piePlot0.getLegendItemShape();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
        org.junit.Assert.assertNotNull(shape4);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator41 = piePlot0.getLegendLabelURLGenerator();
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
        org.junit.Assert.assertNull(pieURLGenerator41);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Stroke stroke3 = piePlot0.getOutlineStroke();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = null;
        piePlot0.setLegendLabelURLGenerator(pieURLGenerator4);
        java.awt.Font font6 = piePlot0.getLabelFont();
        java.awt.Stroke stroke7 = null;
        piePlot0.setOutlineStroke(stroke7);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(font6);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        boolean boolean5 = piePlot0.isSubplot();
        java.awt.Paint paint6 = piePlot0.getNoDataMessagePaint();
        float float7 = piePlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        boolean boolean4 = piePlot0.isOutlineVisible();
        java.awt.Paint paint5 = piePlot0.getNoDataMessagePaint();
        java.awt.Stroke stroke6 = piePlot0.getLabelOutlineStroke();
        piePlot0.setIgnoreNullValues(false);
        org.jfree.chart.util.RectangleInsets rectangleInsets9 = piePlot0.getInsets();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(rectangleInsets9);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
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
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator19 = piePlot0.getLegendLabelToolTipGenerator();
        java.lang.Comparable comparable20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Stroke stroke21 = piePlot0.getSectionOutlineStroke(comparable20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNull(pieSectionLabelGenerator19);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot11.getInsets();
        java.lang.String str22 = piePlot11.getPlotType();
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
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Pie Plot" + "'", str22, "Pie Plot");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
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
        piePlot0.setShadowXOffset((double) 0L);
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
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        piePlot13.setDataset(pieDataset14);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = piePlot13.getURLGenerator();
        piePlot13.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator19 = piePlot13.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot();
        double double21 = piePlot20.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor22 = piePlot20.getLabelDistributor();
        double double23 = piePlot20.getMinimumArcAngleToDraw();
        boolean boolean24 = piePlot20.getIgnoreZeroValues();
        boolean boolean25 = piePlot20.isSubplot();
        piePlot20.setCircular(false);
        java.awt.Paint paint29 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot20.setSectionOutlinePaint((java.lang.Comparable) "", paint29);
        piePlot13.setNoDataMessagePaint(paint29);
        piePlot0.setLabelBackgroundPaint(paint29);
        java.awt.Stroke stroke33 = piePlot0.getBaseSectionOutlineStroke();
        java.awt.Paint paint34 = piePlot0.getLabelShadowPaint();
        org.jfree.chart.plot.PiePlot piePlot35 = new org.jfree.chart.plot.PiePlot();
        double double36 = piePlot35.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor37 = piePlot35.getLabelDistributor();
        double double38 = piePlot35.getMinimumArcAngleToDraw();
        java.awt.Paint paint39 = piePlot35.getBaseSectionOutlinePaint();
        double double40 = piePlot35.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets41 = piePlot35.getSimpleLabelOffset();
        piePlot0.setLabelPadding(rectangleInsets41);
        java.lang.String str43 = piePlot0.getPlotType();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(pieURLGenerator16);
        org.junit.Assert.assertNull(pieSectionLabelGenerator19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.14d + "'", double21 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0E-5d + "'", double23 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.14d + "'", double36 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0E-5d + "'", double38 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 4.0d + "'", double40 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Pie Plot" + "'", str43, "Pie Plot");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
        java.awt.Font font23 = piePlot0.getLabelFont();
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
        org.junit.Assert.assertNotNull(font23);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Stroke stroke3 = piePlot0.getOutlineStroke();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = null;
        piePlot0.setLegendLabelURLGenerator(pieURLGenerator4);
        java.awt.Paint paint7 = piePlot0.getSectionOutlinePaint((java.lang.Comparable) 4.0d);
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot9 = piePlot8.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor10 = piePlot8.getLabelDistributor();
        java.awt.Paint paint11 = piePlot8.getLabelOutlinePaint();
        boolean boolean12 = piePlot8.isOutlineVisible();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator13 = piePlot8.getToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup15 = piePlot14.getDatasetGroup();
        piePlot14.setBackgroundImageAlignment((int) 'a');
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
        piePlot14.setSectionPaint((java.lang.Comparable) 1.0d, paint29);
        piePlot8.setLabelBackgroundPaint(paint29);
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.JFreeChart jFreeChart37 = org.jfree.chart.ChartFactory.createPieChart3D("Pie Plot", pieDataset33, false, true, true);
        piePlot8.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart37);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart37);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(plot9);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(pieToolTipGenerator13);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.14d + "'", double20 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0E-5d + "'", double22 == 1.0E-5d);
        org.junit.Assert.assertNull(paint27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(jFreeChart37);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        double double5 = piePlot0.getLabelGap();
        double double6 = piePlot0.getStartAngle();
        double double7 = piePlot0.getShadowYOffset();
        java.awt.Paint paint9 = piePlot0.getSectionPaint((java.lang.Comparable) true);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 90.0d + "'", double6 == 90.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
        org.junit.Assert.assertNull(paint9);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        piePlot0.setStartAngle((double) (byte) 10);
        piePlot0.setSectionOutlinesVisible(true);
        piePlot0.setStartAngle((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        float float4 = piePlot0.getForegroundAlpha();
        java.awt.Stroke stroke5 = piePlot0.getBaseSectionOutlineStroke();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelGenerator();
        float float7 = piePlot0.getBackgroundAlpha();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        boolean boolean5 = piePlot0.getLabelLinksVisible();
        java.awt.Font font6 = piePlot0.getNoDataMessageFont();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = piePlot0.getDrawingSupplier();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(font6);
        org.junit.Assert.assertNotNull(drawingSupplier7);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
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
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset17 = null;
        piePlot16.setDataset(pieDataset17);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator19 = piePlot16.getURLGenerator();
        piePlot16.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator22 = piePlot16.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot();
        double double24 = piePlot23.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor25 = piePlot23.getLabelDistributor();
        double double26 = piePlot23.getMinimumArcAngleToDraw();
        boolean boolean27 = piePlot23.getIgnoreZeroValues();
        boolean boolean28 = piePlot23.isSubplot();
        piePlot23.setCircular(false);
        java.awt.Paint paint32 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot23.setSectionOutlinePaint((java.lang.Comparable) "", paint32);
        piePlot16.setNoDataMessagePaint(paint32);
        piePlot3.setLabelBackgroundPaint(paint32);
        piePlot0.setShadowPaint(paint32);
        double double37 = piePlot0.getMinimumArcAngleToDraw();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.14d + "'", double4 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-5d + "'", double6 == 1.0E-5d);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(pieURLGenerator19);
        org.junit.Assert.assertNull(pieSectionLabelGenerator22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.14d + "'", double24 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0E-5d + "'", double26 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0E-5d + "'", double37 == 1.0E-5d);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        java.awt.Paint paint2 = piePlot0.getLabelLinkPaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(paint2);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
        float float39 = piePlot0.getBackgroundImageAlpha();
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
        org.junit.Assert.assertNull(plot37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 4.0d + "'", double38 == 4.0d);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.5f + "'", float39 == 0.5f);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        piePlot0.setForegroundAlpha(100.0f);
        piePlot0.zoom(0.0d);
        java.awt.Shape shape6 = piePlot0.getLegendItemShape();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
        piePlot0.setShadowXOffset((double) 0L);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNull(pieURLGenerator10);
        org.junit.Assert.assertNull(pieSectionLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
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
        java.awt.Font font12 = piePlot0.getLabelFont();
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        piePlot13.setDataset(pieDataset14);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = piePlot13.getURLGenerator();
        org.jfree.chart.plot.Plot plot17 = piePlot13.getRootPlot();
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset20 = null;
        piePlot19.setDataset(pieDataset20);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = piePlot19.getURLGenerator();
        piePlot19.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = piePlot19.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot();
        double double27 = piePlot26.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor28 = piePlot26.getLabelDistributor();
        double double29 = piePlot26.getMinimumArcAngleToDraw();
        boolean boolean30 = piePlot26.getIgnoreZeroValues();
        boolean boolean31 = piePlot26.isSubplot();
        piePlot26.setCircular(false);
        java.awt.Paint paint35 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot26.setSectionOutlinePaint((java.lang.Comparable) "", paint35);
        piePlot19.setNoDataMessagePaint(paint35);
        piePlot13.setSectionPaint((java.lang.Comparable) 52.0d, paint35);
        piePlot0.setLabelPaint(paint35);
        org.jfree.data.general.PieDataset pieDataset40 = null;
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot(pieDataset40);
        piePlot41.zoom(0.4d);
        java.awt.Stroke stroke45 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot41.setSectionOutlineStroke((java.lang.Comparable) false, stroke45);
        boolean boolean47 = piePlot41.getIgnoreNullValues();
        java.awt.Paint paint48 = piePlot41.getLabelLinkPaint();
        piePlot0.setLabelPaint(paint48);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNull(pieURLGenerator16);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertNull(pieURLGenerator22);
        org.junit.Assert.assertNull(pieSectionLabelGenerator25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.14d + "'", double27 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0E-5d + "'", double29 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(paint48);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        piePlot0.setSectionOutlinesVisible(true);
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        double double7 = piePlot6.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor8 = piePlot6.getLabelDistributor();
        double double9 = piePlot6.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        piePlot6.drawBackgroundImage(graphics2D10, rectangle2D11);
        java.awt.Paint paint14 = piePlot6.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str15 = piePlot6.getNoDataMessage();
        piePlot6.setNoDataMessage("hi!");
        java.awt.Stroke stroke18 = piePlot6.getOutlineStroke();
        java.awt.Shape shape19 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot6.setLegendItemShape(shape19);
        piePlot0.setLegendItemShape(shape19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14d + "'", double7 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-5d + "'", double9 == 1.0E-5d);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(shape19);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        boolean boolean4 = piePlot0.isOutlineVisible();
        java.awt.Paint paint5 = piePlot0.getNoDataMessagePaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot0.getURLGenerator();
        java.awt.Font font7 = piePlot0.getNoDataMessageFont();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertNotNull(font7);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot();
        double double15 = piePlot14.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor16 = piePlot14.getLabelDistributor();
        double double17 = piePlot14.getMinimumArcAngleToDraw();
        java.awt.Paint paint18 = piePlot14.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = piePlot14.getDrawingSupplier();
        double double20 = piePlot14.getShadowXOffset();
        java.awt.Paint paint21 = piePlot14.getLabelLinkPaint();
        org.jfree.chart.util.Rotation rotation22 = piePlot14.getDirection();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent23 = null;
        piePlot14.datasetChanged(datasetChangeEvent23);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState27 = piePlot0.initialise(graphics2D12, rectangle2D13, piePlot14, (java.lang.Integer) 10, plotRenderingInfo26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-5d + "'", double17 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(drawingSupplier19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(rotation22);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
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
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        piePlot13.drawBackgroundImage(graphics2D17, rectangle2D18);
        java.awt.Paint paint21 = piePlot13.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str22 = piePlot13.getNoDataMessage();
        piePlot13.setNoDataMessage("hi!");
        java.awt.Stroke stroke25 = piePlot13.getOutlineStroke();
        java.awt.Shape shape26 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot13.setLegendItemShape(shape26);
        piePlot13.setBackgroundImageAlignment(0);
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
        java.awt.Paint paint42 = piePlot31.getLabelShadowPaint();
        piePlot13.setSectionPaint((java.lang.Comparable) 100.0f, paint42);
        piePlot0.setOutlinePaint(paint42);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator10);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.14d + "'", double14 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-5d + "'", double16 == 1.0E-5d);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.14d + "'", double32 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0E-5d + "'", double34 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 4.0d + "'", double36 == 4.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.08d + "'", double39 == 0.08d);
        org.junit.Assert.assertNotNull(font40);
        org.junit.Assert.assertNotNull(paint42);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        double double21 = piePlot0.getShadowYOffset();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator22 = piePlot0.getLegendLabelToolTipGenerator();
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E-5d + "'", double20 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.0d + "'", double21 == 4.0d);
        org.junit.Assert.assertNull(pieSectionLabelGenerator22);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str9 = piePlot0.getNoDataMessage();
        org.jfree.chart.plot.Plot plot10 = piePlot0.getParent();
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
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = piePlot11.getLabelPadding();
        // The following exception was thrown during execution in test generation
        try {
            plot10.setInsets(rectangleInsets27, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(plot10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.14d + "'", double16 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-5d + "'", double18 == 1.0E-5d);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(rectangleInsets27);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        boolean boolean4 = piePlot0.isOutlineVisible();
        java.awt.Paint paint5 = piePlot0.getNoDataMessagePaint();
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        piePlot6.setDataset(pieDataset7);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator9 = piePlot6.getURLGenerator();
        float float10 = piePlot6.getForegroundAlpha();
        java.awt.Stroke stroke11 = piePlot6.getBaseSectionOutlineStroke();
        java.awt.Stroke stroke12 = piePlot6.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        double double14 = piePlot13.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor15 = piePlot13.getLabelDistributor();
        double double16 = piePlot13.getMinimumArcAngleToDraw();
        java.awt.Paint paint17 = piePlot13.getBaseSectionOutlinePaint();
        double double18 = piePlot13.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = piePlot13.getSimpleLabelOffset();
        piePlot6.setLabelPadding(rectangleInsets19);
        piePlot0.setInsets(rectangleInsets19);
        float float22 = piePlot0.getBackgroundAlpha();
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset24 = null;
        piePlot23.setDataset(pieDataset24);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator26 = piePlot23.getURLGenerator();
        org.jfree.chart.plot.Plot plot27 = piePlot23.getRootPlot();
        java.awt.Stroke stroke28 = piePlot23.getLabelOutlineStroke();
        java.awt.Shape shape29 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot23.setLegendItemShape(shape29);
        java.awt.Stroke stroke31 = piePlot23.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot();
        double double33 = piePlot32.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor34 = piePlot32.getLabelDistributor();
        double double35 = piePlot32.getMinimumArcAngleToDraw();
        java.awt.Paint paint36 = piePlot32.getBaseSectionOutlinePaint();
        double double37 = piePlot32.getShadowYOffset();
        piePlot32.setBackgroundImageAlignment((int) (byte) -1);
        double double40 = piePlot32.getInteriorGap();
        java.awt.Font font41 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot32.setNoDataMessageFont(font41);
        piePlot23.setLabelFont(font41);
        piePlot0.setNoDataMessageFont(font41);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(pieURLGenerator9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.14d + "'", double14 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-5d + "'", double16 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertNull(pieURLGenerator26);
        org.junit.Assert.assertNotNull(plot27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.14d + "'", double33 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0E-5d + "'", double35 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 4.0d + "'", double37 == 4.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.08d + "'", double40 == 0.08d);
        org.junit.Assert.assertNotNull(font41);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        java.awt.Paint paint18 = piePlot8.getLabelShadowPaint();
        java.awt.Font font19 = piePlot8.getLabelFont();
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
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(font19);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
        float float10 = piePlot0.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
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
        java.awt.Paint paint14 = piePlot0.getSectionOutlinePaint((java.lang.Comparable) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertNull(paint14);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        boolean boolean4 = piePlot0.isOutlineVisible();
        java.awt.Paint paint5 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot0.setOutlinePaint(paint5);
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double8 = piePlot7.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor9 = piePlot7.getLabelDistributor();
        java.awt.Paint paint10 = piePlot7.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot11.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor13 = piePlot11.getLabelDistributor();
        double double14 = piePlot11.getMinimumArcAngleToDraw();
        java.awt.Paint paint15 = piePlot11.getBaseSectionOutlinePaint();
        double double16 = piePlot11.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = piePlot11.getSimpleLabelOffset();
        piePlot7.setInsets(rectangleInsets17);
        piePlot0.setInsets(rectangleInsets17, false);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent21 = null;
        piePlot0.datasetChanged(datasetChangeEvent21);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets17);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
        boolean boolean33 = piePlot0.isSubplot();
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        java.awt.geom.Point2D point2D36 = null;
        org.jfree.chart.plot.PlotState plotState37 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo38 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.draw(graphics2D34, rectangle2D35, point2D36, plotState37, plotRenderingInfo38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
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
        java.awt.Paint paint16 = piePlot0.getLabelShadowPaint();
        java.awt.Paint paint17 = piePlot0.getLabelBackgroundPaint();
        piePlot0.setShadowXOffset((double) (byte) 1);
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
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
        org.jfree.data.general.DatasetGroup datasetGroup32 = piePlot18.getDatasetGroup();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = piePlot18.getSimpleLabelOffset();
        piePlot7.setSimpleLabelOffset(rectangleInsets33);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNull(pieURLGenerator10);
        org.junit.Assert.assertNull(pieSectionLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.0d + "'", double17 == 4.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.14d + "'", double19 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0E-5d + "'", double21 == 1.0E-5d);
        org.junit.Assert.assertNull(paint26);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertNull(datasetGroup32);
        org.junit.Assert.assertNotNull(rectangleInsets33);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        java.awt.Stroke stroke2 = piePlot0.getBaseSectionOutlineStroke();
        boolean boolean3 = piePlot0.getSimpleLabels();
        java.awt.Paint paint4 = piePlot0.getBackgroundPaint();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        java.awt.Paint paint6 = piePlot0.getShadowPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator7 = piePlot0.getLegendLabelGenerator();
        java.awt.Paint paint8 = piePlot0.getLabelPaint();
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot();
        piePlot9.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint12 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot9.setLabelShadowPaint(paint12);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        piePlot9.handleClick((int) ' ', (int) (short) -1, plotRenderingInfo16);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier18 = piePlot9.getDrawingSupplier();
        piePlot0.setDrawingSupplier(drawingSupplier18);
        java.awt.Paint paint21 = piePlot0.getSectionOutlinePaint((java.lang.Comparable) 'a');
        java.awt.Font font22 = piePlot0.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(drawingSupplier18);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNotNull(font22);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.lang.String str3 = piePlot0.getPlotType();
        org.jfree.data.general.DatasetGroup datasetGroup4 = piePlot0.getDatasetGroup();
        piePlot0.setIgnoreNullValues(true);
        double double7 = piePlot0.getLabelLinkMargin();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = null;
        piePlot0.setURLGenerator(pieURLGenerator8);
        boolean boolean10 = piePlot0.isSubplot();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.025d + "'", double7 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("Pie Plot", "", "", categoryDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint3 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot0.setLabelShadowPaint(paint3);
        float float5 = piePlot0.getForegroundAlpha();
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
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset20 = null;
        piePlot19.setDataset(pieDataset20);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = piePlot19.getURLGenerator();
        piePlot19.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = piePlot19.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot();
        double double27 = piePlot26.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor28 = piePlot26.getLabelDistributor();
        double double29 = piePlot26.getMinimumArcAngleToDraw();
        boolean boolean30 = piePlot26.getIgnoreZeroValues();
        boolean boolean31 = piePlot26.isSubplot();
        piePlot26.setCircular(false);
        java.awt.Paint paint35 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot26.setSectionOutlinePaint((java.lang.Comparable) "", paint35);
        piePlot19.setNoDataMessagePaint(paint35);
        piePlot6.setLabelBackgroundPaint(paint35);
        java.awt.Stroke stroke39 = piePlot6.getBaseSectionOutlineStroke();
        piePlot0.setBaseSectionOutlineStroke(stroke39);
        int int41 = piePlot0.getBackgroundImageAlignment();
        double double42 = piePlot0.getStartAngle();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent43 = null;
        piePlot0.markerChanged(markerChangeEvent43);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14d + "'", double7 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-5d + "'", double9 == 1.0E-5d);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(pieURLGenerator22);
        org.junit.Assert.assertNull(pieSectionLabelGenerator25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.14d + "'", double27 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0E-5d + "'", double29 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 15 + "'", int41 == 15);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 90.0d + "'", double42 == 90.0d);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
        java.awt.Paint paint37 = piePlot0.getLabelShadowPaint();
        boolean boolean38 = piePlot0.isCircular();
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
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
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
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset17 = null;
        piePlot16.setDataset(pieDataset17);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator19 = piePlot16.getURLGenerator();
        piePlot16.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator22 = piePlot16.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot();
        double double24 = piePlot23.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor25 = piePlot23.getLabelDistributor();
        double double26 = piePlot23.getMinimumArcAngleToDraw();
        boolean boolean27 = piePlot23.getIgnoreZeroValues();
        boolean boolean28 = piePlot23.isSubplot();
        piePlot23.setCircular(false);
        java.awt.Paint paint32 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot23.setSectionOutlinePaint((java.lang.Comparable) "", paint32);
        piePlot16.setNoDataMessagePaint(paint32);
        piePlot3.setLabelBackgroundPaint(paint32);
        piePlot0.setShadowPaint(paint32);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator37 = null;
        piePlot0.setURLGenerator(pieURLGenerator37);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.14d + "'", double4 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-5d + "'", double6 == 1.0E-5d);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(pieURLGenerator19);
        org.junit.Assert.assertNull(pieSectionLabelGenerator22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.14d + "'", double24 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0E-5d + "'", double26 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(paint32);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        boolean boolean35 = piePlot0.getSectionOutlinesVisible();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent36 = null;
        piePlot0.axisChanged(axisChangeEvent36);
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
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
        java.awt.Image image25 = null;
        piePlot0.setBackgroundImage(image25);
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
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        piePlot0.setOutlineVisible(false);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent7 = null;
        piePlot0.notifyListeners(plotChangeEvent7);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator9 = piePlot0.getLabelGenerator();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator10 = piePlot0.getLegendLabelToolTipGenerator();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator9);
        org.junit.Assert.assertNull(pieSectionLabelGenerator10);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        boolean boolean20 = piePlot0.getIgnoreNullValues();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getShadowYOffset();
        piePlot0.setIgnoreNullValues(false);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        java.util.Locale locale9 = null;
        org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart3D("hi!", pieDataset6, true, false, locale9);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        piePlot0.setLabelLinksVisible(false);
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup15 = piePlot14.getDatasetGroup();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator16 = null;
        piePlot14.setToolTipGenerator(pieToolTipGenerator16);
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset21 = null;
        org.jfree.chart.JFreeChart jFreeChart23 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "hi!", "", boxAndWhiskerXYDataset21, false);
        piePlot14.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart23);
        java.awt.Paint paint25 = piePlot14.getLabelPaint();
        org.jfree.chart.plot.PiePlot piePlot26 = new org.jfree.chart.plot.PiePlot();
        double double27 = piePlot26.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup28 = piePlot26.getDatasetGroup();
        piePlot26.setOutlineVisible(true);
        boolean boolean32 = piePlot26.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot();
        double double34 = piePlot33.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor35 = piePlot33.getLabelDistributor();
        double double36 = piePlot33.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D37 = null;
        java.awt.geom.Rectangle2D rectangle2D38 = null;
        piePlot33.drawBackgroundImage(graphics2D37, rectangle2D38);
        java.awt.Paint paint41 = piePlot33.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font42 = piePlot33.getLabelFont();
        piePlot33.setSimpleLabels(false);
        java.awt.Paint paint45 = piePlot33.getLabelPaint();
        org.jfree.chart.plot.PiePlot piePlot46 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset47 = null;
        piePlot46.setDataset(pieDataset47);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator49 = piePlot46.getURLGenerator();
        piePlot46.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator52 = piePlot46.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot53 = new org.jfree.chart.plot.PiePlot();
        double double54 = piePlot53.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor55 = piePlot53.getLabelDistributor();
        double double56 = piePlot53.getMinimumArcAngleToDraw();
        boolean boolean57 = piePlot53.getIgnoreZeroValues();
        boolean boolean58 = piePlot53.isSubplot();
        piePlot53.setCircular(false);
        java.awt.Paint paint62 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot53.setSectionOutlinePaint((java.lang.Comparable) "", paint62);
        piePlot46.setNoDataMessagePaint(paint62);
        piePlot33.setLabelBackgroundPaint(paint62);
        piePlot26.setBaseSectionPaint(paint62);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator67 = piePlot26.getLabelGenerator();
        piePlot14.setLegendLabelToolTipGenerator(pieSectionLabelGenerator67);
        piePlot0.setLegendLabelGenerator(pieSectionLabelGenerator67);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(datasetGroup15);
        org.junit.Assert.assertNotNull(jFreeChart23);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.14d + "'", double27 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.14d + "'", double34 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0E-5d + "'", double36 == 1.0E-5d);
        org.junit.Assert.assertNull(paint41);
        org.junit.Assert.assertNotNull(font42);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNull(pieURLGenerator49);
        org.junit.Assert.assertNull(pieSectionLabelGenerator52);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.14d + "'", double54 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0E-5d + "'", double56 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(paint62);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator67);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        double double5 = piePlot0.getLabelGap();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelGenerator();
        float float7 = piePlot0.getBackgroundImageAlpha();
        piePlot0.setMinimumArcAngleToDraw(1.0d);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = piePlot0.getSimpleLabelOffset();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(rectangleInsets10);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
        piePlot0.setStartAngle(0.025d);
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset19 = null;
        org.jfree.chart.JFreeChart jFreeChart21 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "hi!", "", boxAndWhiskerXYDataset19, false);
        piePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart21);
        org.jfree.chart.util.Rotation rotation23 = piePlot0.getDirection();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(jFreeChart21);
        org.junit.Assert.assertNotNull(rotation23);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        piePlot0.setOutlineVisible(true);
        piePlot0.setOutlineVisible(false);
        piePlot0.setCircular(false);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreNullValues();
        boolean boolean5 = piePlot0.getIgnoreNullValues();
        java.awt.Paint paint6 = piePlot0.getLabelShadowPaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        piePlot0.setDataset(pieDataset3);
        piePlot0.setIgnoreZeroValues(true);
        java.awt.Paint paint7 = piePlot0.getLabelPaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("Pie Plot", "Pie Plot", "Pie Plot", windDataset3, false, false, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        piePlot11.drawBackgroundImage(graphics2D15, rectangle2D16);
        java.awt.Paint paint19 = piePlot11.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str20 = piePlot11.getNoDataMessage();
        java.awt.Paint paint21 = piePlot11.getLabelOutlinePaint();
        java.awt.Stroke stroke22 = piePlot11.getLabelOutlineStroke();
        java.lang.String str23 = piePlot11.getPlotType();
        piePlot11.setShadowXOffset((double) (short) 0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator26 = piePlot11.getLabelGenerator();
        piePlot0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator26);
        java.awt.Stroke stroke28 = piePlot0.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot();
        double double30 = piePlot29.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor31 = piePlot29.getLabelDistributor();
        double double32 = piePlot29.getMinimumArcAngleToDraw();
        boolean boolean33 = piePlot29.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot34 = piePlot29.getRootPlot();
        org.jfree.chart.plot.PiePlot piePlot35 = new org.jfree.chart.plot.PiePlot();
        double double36 = piePlot35.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor37 = piePlot35.getLabelDistributor();
        double double38 = piePlot35.getMinimumArcAngleToDraw();
        java.awt.Paint paint39 = piePlot35.getBaseSectionOutlinePaint();
        double double40 = piePlot35.getShadowYOffset();
        piePlot35.setBackgroundImageAlignment((int) (byte) -1);
        java.awt.Paint paint43 = piePlot35.getLabelPaint();
        piePlot29.setShadowPaint(paint43);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier45 = piePlot29.getDrawingSupplier();
        org.jfree.chart.plot.PiePlot piePlot46 = new org.jfree.chart.plot.PiePlot();
        double double47 = piePlot46.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor48 = piePlot46.getLabelDistributor();
        double double49 = piePlot46.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D50 = null;
        java.awt.geom.Rectangle2D rectangle2D51 = null;
        piePlot46.drawBackgroundImage(graphics2D50, rectangle2D51);
        java.awt.Paint paint54 = piePlot46.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str55 = piePlot46.getNoDataMessage();
        org.jfree.chart.plot.PiePlot piePlot56 = new org.jfree.chart.plot.PiePlot();
        double double57 = piePlot56.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor58 = piePlot56.getLabelDistributor();
        double double59 = piePlot56.getMinimumArcAngleToDraw();
        java.awt.Paint paint60 = piePlot56.getBaseSectionOutlinePaint();
        piePlot56.setIgnoreNullValues(false);
        java.awt.Paint paint63 = piePlot56.getNoDataMessagePaint();
        java.awt.Stroke stroke65 = piePlot56.getSectionOutlineStroke((java.lang.Comparable) 52.0d);
        org.jfree.chart.util.Rotation rotation66 = piePlot56.getDirection();
        org.jfree.chart.plot.PiePlot piePlot67 = new org.jfree.chart.plot.PiePlot();
        double double68 = piePlot67.getMaximumLabelWidth();
        piePlot67.setForegroundAlpha((float) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets71 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot67.setInsets(rectangleInsets71);
        piePlot56.setInsets(rectangleInsets71, false);
        piePlot46.setLabelPadding(rectangleInsets71);
        piePlot29.setSimpleLabelOffset(rectangleInsets71);
        piePlot0.setInsets(rectangleInsets71, false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pie Plot" + "'", str23, "Pie Plot");
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator26);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.14d + "'", double30 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0E-5d + "'", double32 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(plot34);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.14d + "'", double36 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0E-5d + "'", double38 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 4.0d + "'", double40 == 4.0d);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(drawingSupplier45);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.14d + "'", double47 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0E-5d + "'", double49 == 1.0E-5d);
        org.junit.Assert.assertNull(paint54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.14d + "'", double57 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 1.0E-5d + "'", double59 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint60);
        org.junit.Assert.assertNotNull(paint63);
        org.junit.Assert.assertNull(stroke65);
        org.junit.Assert.assertNotNull(rotation66);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.14d + "'", double68 == 0.14d);
        org.junit.Assert.assertNotNull(rectangleInsets71);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
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
        org.jfree.chart.LegendItemCollection legendItemCollection12 = piePlot0.getLegendItems();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-5d + "'", double7 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNull(legendItemCollection12);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot0.setToolTipGenerator(pieToolTipGenerator2);
        float float4 = piePlot0.getBackgroundAlpha();
        org.jfree.data.general.PieDataset pieDataset5 = piePlot0.getDataset();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNull(pieDataset5);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Stroke stroke3 = piePlot0.getOutlineStroke();
        piePlot0.setPieIndex(100);
        piePlot0.setLabelLinkMargin((double) (short) 100);
        boolean boolean8 = piePlot0.isOutlineVisible();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
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
        piePlot0.setShadowXOffset((double) 1L);
        java.awt.Paint paint14 = piePlot0.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
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
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot();
        double double16 = piePlot15.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup17 = piePlot15.getDatasetGroup();
        piePlot15.setOutlineVisible(true);
        boolean boolean21 = piePlot15.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        double double23 = piePlot22.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor24 = piePlot22.getLabelDistributor();
        double double25 = piePlot22.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        piePlot22.drawBackgroundImage(graphics2D26, rectangle2D27);
        java.awt.Paint paint30 = piePlot22.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font31 = piePlot22.getLabelFont();
        piePlot15.setNoDataMessageFont(font31);
        boolean boolean33 = piePlot15.isOutlineVisible();
        double double34 = piePlot15.getLabelGap();
        org.jfree.chart.plot.Plot plot35 = piePlot15.getRootPlot();
        piePlot15.setCircular(true, false);
        int int39 = piePlot15.getBackgroundImageAlignment();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator40 = piePlot15.getLegendLabelURLGenerator();
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot();
        double double42 = piePlot41.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor43 = piePlot41.getLabelDistributor();
        double double44 = piePlot41.getMinimumArcAngleToDraw();
        java.awt.Paint paint45 = piePlot41.getBaseSectionOutlinePaint();
        double double46 = piePlot41.getShadowYOffset();
        piePlot41.setBackgroundImageAlignment((int) (byte) -1);
        double double49 = piePlot41.getInteriorGap();
        java.awt.Font font50 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot41.setNoDataMessageFont(font50);
        java.awt.Paint paint52 = piePlot41.getLabelShadowPaint();
        piePlot15.setOutlinePaint(paint52);
        piePlot0.setShadowPaint(paint52);
        piePlot0.setIgnoreZeroValues(true);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.14d + "'", double16 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.14d + "'", double23 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0E-5d + "'", double25 == 1.0E-5d);
        org.junit.Assert.assertNull(paint30);
        org.junit.Assert.assertNotNull(font31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.025d + "'", double34 == 0.025d);
        org.junit.Assert.assertNotNull(plot35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 15 + "'", int39 == 15);
        org.junit.Assert.assertNull(pieURLGenerator40);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.14d + "'", double42 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0E-5d + "'", double44 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 4.0d + "'", double46 == 4.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.08d + "'", double49 == 0.08d);
        org.junit.Assert.assertNotNull(font50);
        org.junit.Assert.assertNotNull(paint52);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("", "", "Pie Plot", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
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
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor22 = piePlot0.getLabelDistributor();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14d + "'", double7 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-5d + "'", double9 == 1.0E-5d);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor18);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor22);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator20 = null;
        piePlot0.setLegendLabelURLGenerator(pieURLGenerator20);
        java.awt.Font font22 = piePlot0.getLabelFont();
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
        org.junit.Assert.assertNotNull(font22);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
        java.awt.Stroke stroke29 = piePlot0.getBaseSectionOutlineStroke();
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
        org.junit.Assert.assertNotNull(stroke29);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.axis.Timeline timeline4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createHighLowChart("", "", "hi!", oHLCDataset3, timeline4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        org.jfree.chart.plot.Plot plot2 = piePlot0.getParent();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = null;
        piePlot0.setLegendLabelURLGenerator(pieURLGenerator3);
        org.jfree.data.xy.WindDataset windDataset8 = null;
        org.jfree.chart.JFreeChart jFreeChart12 = org.jfree.chart.ChartFactory.createWindPlot("Pie Plot", "Pie Plot", "Pie Plot", windDataset8, true, true, false);
        piePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart12);
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot15 = piePlot14.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor16 = piePlot14.getLabelDistributor();
        java.awt.Paint paint17 = piePlot14.getLabelOutlinePaint();
        boolean boolean18 = piePlot14.isOutlineVisible();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator19 = piePlot14.getToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup21 = piePlot20.getDatasetGroup();
        piePlot20.setBackgroundImageAlignment((int) 'a');
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
        piePlot20.setSectionPaint((java.lang.Comparable) 1.0d, paint35);
        piePlot14.setLabelBackgroundPaint(paint35);
        piePlot0.setShadowPaint(paint35);
        java.awt.Stroke stroke39 = piePlot0.getLabelOutlineStroke();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertNotNull(jFreeChart12);
        org.junit.Assert.assertNull(plot15);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(pieToolTipGenerator19);
        org.junit.Assert.assertNull(datasetGroup21);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.14d + "'", double26 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0E-5d + "'", double28 == 1.0E-5d);
        org.junit.Assert.assertNull(paint33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(stroke39);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("", "Pie Plot", "hi!", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setMinimumArcAngleToDraw((double) '4');
        piePlot0.setStartAngle((double) 1L);
        piePlot0.setSectionOutlinesVisible(true);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        piePlot0.markerChanged(markerChangeEvent7);
        float float9 = piePlot0.getBackgroundImageAlpha();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor10 = piePlot0.getLabelDistributor();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("Pie Plot", "Pie Plot", "Pie Plot", intervalCategoryDataset3, true, true, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot0.setToolTipGenerator(pieToolTipGenerator2);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot0.getLabelDistributor();
        piePlot0.setPieIndex((int) (byte) 0);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        org.junit.Assert.assertNotNull(rectangleInsets29);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
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
        org.jfree.chart.plot.Plot plot19 = piePlot0.getParent();
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot();
        double double21 = piePlot20.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor22 = piePlot20.getLabelDistributor();
        double double23 = piePlot20.getMinimumArcAngleToDraw();
        java.awt.Paint paint24 = piePlot20.getBaseSectionOutlinePaint();
        double double25 = piePlot20.getShadowYOffset();
        piePlot20.setBackgroundImageAlignment((int) (byte) -1);
        double double28 = piePlot20.getInteriorGap();
        java.awt.Font font29 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot20.setNoDataMessageFont(font29);
        java.awt.Paint paint31 = piePlot20.getLabelShadowPaint();
        piePlot0.setLabelLinkPaint(paint31);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(pieURLGenerator17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(plot19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.14d + "'", double21 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0E-5d + "'", double23 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.0d + "'", double25 == 4.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.08d + "'", double28 == 0.08d);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        piePlot0.setBackgroundImageAlignment((int) (byte) -1);
        java.awt.Paint paint8 = piePlot0.getLabelPaint();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        piePlot0.setDataset(pieDataset9);
        float float11 = piePlot0.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        piePlot0.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelToolTipGenerator();
        boolean boolean7 = piePlot0.getSimpleLabels();
        piePlot0.setStartAngle((double) (short) -1);
        piePlot0.setPieIndex((int) (byte) 10);
        java.lang.Object obj12 = piePlot0.clone();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createRingChart("hi!", pieDataset1, false, false, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", pieDataset1, pieDataset2, 1, true, true, true, locale7, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelToolTipGenerator();
        piePlot0.setCircular(false, true);
        piePlot0.setLabelLinksVisible(true);
        boolean boolean7 = piePlot0.isOutlineVisible();
        piePlot0.setSectionOutlinesVisible(false);
        org.jfree.chart.plot.Plot plot10 = piePlot0.getRootPlot();
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
        java.lang.String str34 = piePlot22.getPlotType();
        piePlot22.setShadowXOffset((double) (short) 0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator37 = piePlot22.getLabelGenerator();
        piePlot11.setLegendLabelToolTipGenerator(pieSectionLabelGenerator37);
        java.awt.Stroke stroke39 = piePlot11.getLabelLinkStroke();
        plot10.setOutlineStroke(stroke39);
        org.junit.Assert.assertNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.14d + "'", double23 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0E-5d + "'", double25 == 1.0E-5d);
        org.junit.Assert.assertNull(paint30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Pie Plot" + "'", str34, "Pie Plot");
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator37);
        org.junit.Assert.assertNotNull(stroke39);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
        int int14 = piePlot0.getBackgroundImageAlignment();
        java.awt.Paint paint15 = piePlot0.getShadowPaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        double double4 = piePlot0.getShadowXOffset();
        piePlot0.setForegroundAlpha((float) 1L);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = piePlot0.getToolTipGenerator();
        boolean boolean8 = piePlot0.getIgnoreZeroValues();
        java.awt.Paint paint10 = piePlot0.getSectionPaint((java.lang.Comparable) (-1.0d));
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator11 = piePlot0.getLegendLabelURLGenerator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
        org.junit.Assert.assertNull(pieToolTipGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertNull(pieURLGenerator11);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart("hi!", pieDataset1, true, true, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        piePlot0.setBackgroundImageAlignment((int) 'a');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot0.getLabelDistributor();
        double double6 = piePlot0.getExplodePercent((java.lang.Comparable) 90.0d);
        org.jfree.data.general.PieDataset pieDataset7 = null;
        piePlot0.setDataset(pieDataset7);
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot();
        double double10 = piePlot9.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor11 = piePlot9.getLabelDistributor();
        double double12 = piePlot9.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        piePlot9.drawBackgroundImage(graphics2D13, rectangle2D14);
        java.awt.Paint paint17 = piePlot9.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str18 = piePlot9.getNoDataMessage();
        piePlot9.setNoDataMessage("hi!");
        java.awt.Stroke stroke21 = piePlot9.getOutlineStroke();
        java.awt.Shape shape22 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot9.setLegendItemShape(shape22);
        piePlot0.setLegendItemShape(shape22);
        org.junit.Assert.assertNull(datasetGroup1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(shape22);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        piePlot0.setBackgroundImageAlignment((int) 'a');
        piePlot0.setForegroundAlpha(100.0f);
        java.awt.Paint paint7 = piePlot0.getSectionOutlinePaint((java.lang.Comparable) 1);
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot0.getDatasetGroup();
        org.junit.Assert.assertNull(datasetGroup1);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(datasetGroup8);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart3D("", "hi!", "hi!", categoryDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str9 = piePlot0.getNoDataMessage();
        org.jfree.chart.plot.Plot plot10 = piePlot0.getParent();
        org.jfree.chart.util.Rotation rotation11 = piePlot0.getDirection();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(plot10);
        org.junit.Assert.assertNotNull(rotation11);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        piePlot0.setForegroundAlpha(100.0f);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = piePlot0.getLegendLabelToolTipGenerator();
        org.jfree.data.general.PieDataset pieDataset5 = piePlot0.getDataset();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(pieSectionLabelGenerator4);
        org.junit.Assert.assertNull(pieDataset5);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("", "hi!", "", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        org.jfree.data.general.PieDataset pieDataset21 = null;
        piePlot0.setDataset(pieDataset21);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(pieURLGenerator17);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        piePlot0.setCircular(false);
        piePlot0.setNoDataMessage("hi!");
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator20 = null;
        piePlot0.setLegendLabelURLGenerator(pieURLGenerator20);
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
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        java.awt.Paint paint6 = piePlot0.getShadowPaint();
        boolean boolean7 = piePlot0.getIgnoreZeroValues();
        piePlot0.setCircular(false);
        piePlot0.zoom((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator24 = piePlot0.getToolTipGenerator();
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
        org.junit.Assert.assertNull(pieToolTipGenerator24);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        piePlot0.setForegroundAlpha(100.0f);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator4 = piePlot0.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        double double7 = piePlot6.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot6.getDatasetGroup();
        piePlot6.setOutlineVisible(true);
        boolean boolean11 = piePlot6.getSectionOutlinesVisible();
        java.awt.Stroke stroke12 = piePlot6.getLabelOutlineStroke();
        piePlot0.setSectionOutlineStroke((java.lang.Comparable) true, stroke12);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(pieSectionLabelGenerator4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14d + "'", double7 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        java.awt.Stroke stroke25 = piePlot0.getLabelLinkStroke();
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
        org.junit.Assert.assertNotNull(stroke25);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart3D("hi!", "Pie Plot", "", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator18 = null;
        piePlot8.setLegendLabelURLGenerator(pieURLGenerator18);
        org.jfree.data.general.PieDataset pieDataset20 = piePlot8.getDataset();
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
        org.junit.Assert.assertNull(pieDataset20);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setIgnoreNullValues(false);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = null;
        piePlot0.setLegendLabelURLGenerator(pieURLGenerator3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        piePlot0.handleClick((int) '#', (int) (byte) 10, plotRenderingInfo7);
        int int9 = piePlot0.getBackgroundImageAlignment();
        piePlot0.setMinimumArcAngleToDraw((double) (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Paint paint7 = piePlot0.getNoDataMessagePaint();
        java.awt.Stroke stroke9 = piePlot0.getSectionOutlineStroke((java.lang.Comparable) 52.0d);
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        piePlot10.setDataset(pieDataset11);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = piePlot10.getURLGenerator();
        org.jfree.chart.plot.Plot plot14 = piePlot10.getRootPlot();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor15 = piePlot10.getLabelDistributor();
        boolean boolean16 = piePlot10.isSubplot();
        piePlot10.setPieIndex(0);
        piePlot10.setExplodePercent((java.lang.Comparable) 0.4d, 1.0E-5d);
        java.awt.Paint paint22 = piePlot10.getLabelLinkPaint();
        piePlot0.setBackgroundPaint(paint22);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        piePlot0.setDataset(pieDataset24);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(stroke9);
        org.junit.Assert.assertNull(pieURLGenerator13);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        double double4 = piePlot0.getShadowXOffset();
        piePlot0.setForegroundAlpha((float) 1L);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = piePlot0.getToolTipGenerator();
        piePlot0.setBackgroundAlpha(0.0f);
        java.awt.Paint paint10 = piePlot0.getShadowPaint();
        piePlot0.setMaximumLabelWidth((double) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
        org.junit.Assert.assertNull(pieToolTipGenerator7);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.jfree.data.statistics.BoxAndWhiskerCategoryDataset boxAndWhiskerCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "hi!", "Pie Plot", boxAndWhiskerCategoryDataset3, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        piePlot0.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelToolTipGenerator();
        boolean boolean7 = piePlot0.getSimpleLabels();
        org.jfree.chart.LegendItemCollection legendItemCollection8 = piePlot0.getLegendItems();
        double double9 = piePlot0.getInteriorGap();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(legendItemCollection8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.08d + "'", double9 == 0.08d);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("Pie Plot", "hi!", "Pie Plot", boxAndWhiskerXYDataset3, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("Pie Plot", "hi!", "", categoryDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        boolean boolean5 = piePlot0.isSubplot();
        java.awt.Paint paint6 = piePlot0.getNoDataMessagePaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator7 = piePlot0.getLegendLabelGenerator();
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        double double9 = piePlot8.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor10 = piePlot8.getLabelDistributor();
        double double11 = piePlot8.getMinimumArcAngleToDraw();
        java.awt.Paint paint12 = piePlot8.getBaseSectionOutlinePaint();
        java.awt.Paint paint13 = piePlot8.getBaseSectionPaint();
        java.awt.Paint paint14 = piePlot8.getShadowPaint();
        piePlot0.setOutlinePaint(paint14);
        double double17 = piePlot0.getExplodePercent((java.lang.Comparable) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14d + "'", double9 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-5d + "'", double11 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("Pie Plot", "Pie Plot", "hi!", xYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = piePlot0.getDrawingSupplier();
        double double6 = piePlot0.getShadowXOffset();
        double double7 = piePlot0.getLabelLinkMargin();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator8 = piePlot0.getLegendLabelGenerator();
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot();
        double double10 = piePlot9.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor11 = piePlot9.getLabelDistributor();
        double double12 = piePlot9.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        piePlot9.drawBackgroundImage(graphics2D13, rectangle2D14);
        java.awt.Paint paint17 = piePlot9.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str18 = piePlot9.getNoDataMessage();
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot();
        double double20 = piePlot19.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor21 = piePlot19.getLabelDistributor();
        double double22 = piePlot19.getMinimumArcAngleToDraw();
        java.awt.Paint paint23 = piePlot19.getBaseSectionOutlinePaint();
        piePlot19.setIgnoreNullValues(false);
        java.awt.Paint paint26 = piePlot19.getNoDataMessagePaint();
        java.awt.Stroke stroke28 = piePlot19.getSectionOutlineStroke((java.lang.Comparable) 52.0d);
        org.jfree.chart.util.Rotation rotation29 = piePlot19.getDirection();
        org.jfree.chart.plot.PiePlot piePlot30 = new org.jfree.chart.plot.PiePlot();
        double double31 = piePlot30.getMaximumLabelWidth();
        piePlot30.setForegroundAlpha((float) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot30.setInsets(rectangleInsets34);
        piePlot19.setInsets(rectangleInsets34, false);
        piePlot9.setLabelPadding(rectangleInsets34);
        piePlot0.setInsets(rectangleInsets34);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.025d + "'", double7 == 0.025d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.14d + "'", double20 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0E-5d + "'", double22 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNull(stroke28);
        org.junit.Assert.assertNotNull(rotation29);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.14d + "'", double31 == 0.14d);
        org.junit.Assert.assertNotNull(rectangleInsets34);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = piePlot0.getDrawingSupplier();
        double double6 = piePlot0.getShadowXOffset();
        java.awt.Paint paint7 = piePlot0.getLabelLinkPaint();
        java.awt.Paint paint8 = piePlot0.getLabelLinkPaint();
        piePlot0.setPieIndex((int) (byte) 100);
        double double11 = piePlot0.getShadowXOffset();
        org.jfree.data.general.PieDataset pieDataset12 = piePlot0.getDataset();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.0d + "'", double11 == 4.0d);
        org.junit.Assert.assertNull(pieDataset12);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        boolean boolean15 = piePlot0.isSubplot();
        piePlot0.zoom(0.025d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
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
        float float16 = piePlot0.getBackgroundImageAlpha();
        java.awt.Image image17 = piePlot0.getBackgroundImage();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor18 = piePlot0.getLabelDistributor();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.14d + "'", double4 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-5d + "'", double6 == 1.0E-5d);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
        org.junit.Assert.assertNull(image17);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor18);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent10 = null;
        piePlot0.markerChanged(markerChangeEvent10);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = piePlot0.getLabelDistributor();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("", "hi!", "hi!", xYDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", pieDataset1, pieDataset2, (int) (short) 10, true, true, true, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        boolean boolean5 = piePlot0.getIgnoreZeroValues();
        boolean boolean6 = piePlot0.getSectionOutlinesVisible();
        piePlot0.setIgnoreZeroValues(false);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint3 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot0.setLabelShadowPaint(paint3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        piePlot0.handleClick((int) ' ', (int) (short) -1, plotRenderingInfo7);
        double double9 = piePlot0.getStartAngle();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 90.0d + "'", double9 == 90.0d);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
        java.awt.Paint paint13 = piePlot1.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot();
        double double15 = piePlot14.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor16 = piePlot14.getLabelDistributor();
        double double17 = piePlot14.getMinimumArcAngleToDraw();
        boolean boolean18 = piePlot14.getIgnoreZeroValues();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator19 = piePlot14.getLabelGenerator();
        piePlot14.setMaximumLabelWidth((-1.0d));
        piePlot14.setCircular(false);
        java.lang.String str24 = piePlot14.getNoDataMessage();
        org.jfree.chart.util.Rotation rotation25 = piePlot14.getDirection();
        piePlot1.setDirection(rotation25);
        piePlot1.setIgnoreNullValues(true);
        int int29 = piePlot1.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14d + "'", double9 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-5d + "'", double17 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(rotation25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 15 + "'", int29 == 15);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        piePlot0.setOutlineVisible(true);
        java.awt.Paint paint8 = piePlot0.getLabelPaint();
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator10 = piePlot9.getLegendLabelToolTipGenerator();
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
        piePlot9.setOutlinePaint(paint22);
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot();
        double double25 = piePlot24.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor26 = piePlot24.getLabelDistributor();
        double double27 = piePlot24.getMinimumArcAngleToDraw();
        java.awt.Paint paint28 = piePlot24.getBaseSectionOutlinePaint();
        double double29 = piePlot24.getShadowYOffset();
        piePlot24.setOutlineVisible(true);
        java.awt.Paint paint32 = piePlot24.getLabelPaint();
        boolean boolean33 = piePlot9.equals((java.lang.Object) paint32);
        piePlot0.setLabelLinkPaint(paint32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(pieSectionLabelGenerator10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.08d + "'", double19 == 0.08d);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.14d + "'", double25 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0E-5d + "'", double27 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 4.0d + "'", double29 == 4.0d);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = piePlot0.getDrawingSupplier();
        double double6 = piePlot0.getShadowXOffset();
        java.awt.Paint paint7 = piePlot0.getLabelLinkPaint();
        org.jfree.chart.util.Rotation rotation8 = piePlot0.getDirection();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent9 = null;
        piePlot0.datasetChanged(datasetChangeEvent9);
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot12 = piePlot11.getParent();
        java.awt.Stroke stroke13 = piePlot11.getBaseSectionOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot11.getLabelPadding();
        piePlot0.setInsets(rectangleInsets14);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = piePlot0.getDrawingSupplier();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(rotation8);
        org.junit.Assert.assertNull(plot12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertNotNull(drawingSupplier16);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        boolean boolean5 = piePlot0.getLabelLinksVisible();
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot7.getDatasetGroup();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator9 = null;
        piePlot7.setToolTipGenerator(pieToolTipGenerator9);
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot11.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor13 = piePlot11.getLabelDistributor();
        double double14 = piePlot11.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        piePlot11.drawBackgroundImage(graphics2D15, rectangle2D16);
        java.awt.Paint paint19 = piePlot11.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str20 = piePlot11.getNoDataMessage();
        piePlot11.setNoDataMessage("hi!");
        java.awt.Stroke stroke23 = piePlot11.getOutlineStroke();
        java.awt.Shape shape24 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot11.setLegendItemShape(shape24);
        piePlot11.setBackgroundImageAlignment(0);
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot();
        double double30 = piePlot29.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor31 = piePlot29.getLabelDistributor();
        double double32 = piePlot29.getMinimumArcAngleToDraw();
        java.awt.Paint paint33 = piePlot29.getBaseSectionOutlinePaint();
        double double34 = piePlot29.getShadowYOffset();
        piePlot29.setBackgroundImageAlignment((int) (byte) -1);
        double double37 = piePlot29.getInteriorGap();
        java.awt.Font font38 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot29.setNoDataMessageFont(font38);
        java.awt.Paint paint40 = piePlot29.getLabelShadowPaint();
        piePlot11.setSectionPaint((java.lang.Comparable) 100.0f, paint40);
        piePlot7.setOutlinePaint(paint40);
        piePlot0.setSectionOutlinePaint((java.lang.Comparable) (-1.0d), paint40);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.14d + "'", double30 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0E-5d + "'", double32 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4.0d + "'", double34 == 4.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.08d + "'", double37 == 0.08d);
        org.junit.Assert.assertNotNull(font38);
        org.junit.Assert.assertNotNull(paint40);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
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
        org.jfree.chart.plot.Plot plot17 = piePlot7.getParent();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNull(pieURLGenerator10);
        org.junit.Assert.assertNull(pieSectionLabelGenerator13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(plot17);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.util.TableOrder tableOrder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createMultiplePieChart("Pie Plot", categoryDataset1, tableOrder2, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        piePlot0.setBackgroundImageAlignment((int) 'a');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot0.getLabelDistributor();
        double double6 = piePlot0.getExplodePercent((java.lang.Comparable) 90.0d);
        double double7 = piePlot0.getLabelGap();
        float float8 = piePlot0.getBackgroundAlpha();
        piePlot0.setIgnoreZeroValues(true);
        org.junit.Assert.assertNull(datasetGroup1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.025d + "'", double7 == 0.025d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("hi!", "hi!", "", intervalCategoryDataset3, true, false, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot0.setToolTipGenerator(pieToolTipGenerator2);
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset7 = null;
        org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "hi!", "", boxAndWhiskerXYDataset7, false);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart9);
        java.awt.Paint paint11 = piePlot0.getLabelPaint();
        piePlot0.setForegroundAlpha((float) 'a');
        double double14 = piePlot0.getShadowXOffset();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = piePlot0.getLabelGenerator();
        org.junit.Assert.assertNull(datasetGroup1);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator15);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset25 = null;
        piePlot24.setDataset(pieDataset25);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator27 = piePlot24.getURLGenerator();
        piePlot24.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator30 = piePlot24.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot();
        double double32 = piePlot31.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor33 = piePlot31.getLabelDistributor();
        double double34 = piePlot31.getMinimumArcAngleToDraw();
        boolean boolean35 = piePlot31.getIgnoreZeroValues();
        boolean boolean36 = piePlot31.isSubplot();
        piePlot31.setCircular(false);
        java.awt.Paint paint40 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot31.setSectionOutlinePaint((java.lang.Comparable) "", paint40);
        piePlot24.setNoDataMessagePaint(paint40);
        piePlot11.setLabelBackgroundPaint(paint40);
        java.awt.Stroke stroke44 = piePlot11.getBaseSectionOutlineStroke();
        java.awt.Paint paint45 = piePlot11.getLabelShadowPaint();
        piePlot0.setNoDataMessagePaint(paint45);
        piePlot0.setSimpleLabels(true);
        java.awt.Stroke stroke49 = piePlot0.getLabelLinkStroke();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(pieURLGenerator27);
        org.junit.Assert.assertNull(pieSectionLabelGenerator30);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.14d + "'", double32 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0E-5d + "'", double34 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(stroke49);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        java.awt.Paint paint6 = piePlot0.getShadowPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator7 = piePlot0.getLegendLabelGenerator();
        double double8 = piePlot0.getMinimumArcAngleToDraw();
        piePlot0.setLabelLinksVisible(true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator11 = null;
        piePlot0.setURLGenerator(pieURLGenerator11);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        org.jfree.chart.plot.DrawingSupplier drawingSupplier16 = piePlot0.getDrawingSupplier();
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot();
        double double18 = piePlot17.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor19 = piePlot17.getLabelDistributor();
        double double20 = piePlot17.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        piePlot17.drawBackgroundImage(graphics2D21, rectangle2D22);
        java.awt.Paint paint25 = piePlot17.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str26 = piePlot17.getNoDataMessage();
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot();
        double double28 = piePlot27.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor29 = piePlot27.getLabelDistributor();
        double double30 = piePlot27.getMinimumArcAngleToDraw();
        java.awt.Paint paint31 = piePlot27.getBaseSectionOutlinePaint();
        piePlot27.setIgnoreNullValues(false);
        java.awt.Paint paint34 = piePlot27.getNoDataMessagePaint();
        java.awt.Stroke stroke36 = piePlot27.getSectionOutlineStroke((java.lang.Comparable) 52.0d);
        org.jfree.chart.util.Rotation rotation37 = piePlot27.getDirection();
        org.jfree.chart.plot.PiePlot piePlot38 = new org.jfree.chart.plot.PiePlot();
        double double39 = piePlot38.getMaximumLabelWidth();
        piePlot38.setForegroundAlpha((float) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets42 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot38.setInsets(rectangleInsets42);
        piePlot27.setInsets(rectangleInsets42, false);
        piePlot17.setLabelPadding(rectangleInsets42);
        piePlot0.setSimpleLabelOffset(rectangleInsets42);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator48 = piePlot0.getLegendLabelURLGenerator();
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
        org.junit.Assert.assertNotNull(drawingSupplier16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.14d + "'", double18 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E-5d + "'", double20 == 1.0E-5d);
        org.junit.Assert.assertNull(paint25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.14d + "'", double28 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0E-5d + "'", double30 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNull(stroke36);
        org.junit.Assert.assertNotNull(rotation37);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.14d + "'", double39 == 0.14d);
        org.junit.Assert.assertNotNull(rectangleInsets42);
        org.junit.Assert.assertNull(pieURLGenerator48);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        piePlot0.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double8 = piePlot7.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor9 = piePlot7.getLabelDistributor();
        double double10 = piePlot7.getMinimumArcAngleToDraw();
        boolean boolean11 = piePlot7.getIgnoreZeroValues();
        boolean boolean12 = piePlot7.isSubplot();
        piePlot7.setCircular(false);
        java.awt.Paint paint16 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot7.setSectionOutlinePaint((java.lang.Comparable) "", paint16);
        piePlot0.setNoDataMessagePaint(paint16);
        java.lang.Object obj19 = piePlot0.clone();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        boolean boolean5 = piePlot0.isSubplot();
        piePlot0.setCircular(false);
        java.awt.Paint paint9 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot0.setSectionOutlinePaint((java.lang.Comparable) "", paint9);
        boolean boolean11 = piePlot0.getSectionOutlinesVisible();
        java.awt.Paint paint12 = piePlot0.getLabelShadowPaint();
        java.awt.Stroke stroke14 = piePlot0.getSectionOutlineStroke((java.lang.Comparable) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(stroke14);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
        piePlot0.setCircular(true);
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setInteriorGap((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (-1.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
        java.awt.Stroke stroke13 = null;
        piePlot0.setLabelOutlineStroke(stroke13);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        piePlot0.drawBackgroundImage(graphics2D15, rectangle2D16);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14d + "'", double7 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-5d + "'", double9 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator47 = piePlot25.getURLGenerator();
        org.junit.Assert.assertNull(datasetGroup1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNull(pieSectionLabelGenerator11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.14d + "'", double13 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.14d + "'", double26 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0E-5d + "'", double28 == 1.0E-5d);
        org.junit.Assert.assertNull(paint33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.14d + "'", double37 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup38);
        org.junit.Assert.assertNotNull(rectangleInsets41);
        org.junit.Assert.assertNull(pieURLGenerator47);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        piePlot0.setShadowYOffset((double) (byte) 0);
        org.jfree.data.general.PieDataset pieDataset20 = null;
        piePlot0.setDataset(pieDataset20);
        java.lang.Object obj22 = piePlot0.clone();
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot();
        double double24 = piePlot23.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor25 = piePlot23.getLabelDistributor();
        double double26 = piePlot23.getMinimumArcAngleToDraw();
        boolean boolean27 = piePlot23.getIgnoreZeroValues();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator28 = piePlot23.getLabelGenerator();
        piePlot0.setLegendLabelGenerator(pieSectionLabelGenerator28);
        double double31 = piePlot0.getExplodePercent((java.lang.Comparable) 90.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(pieURLGenerator17);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.14d + "'", double24 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0E-5d + "'", double26 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator28);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.axis.Timeline timeline4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createHighLowChart("", "", "Pie Plot", oHLCDataset3, timeline4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("Pie Plot", "hi!", "hi!", boxAndWhiskerXYDataset3, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot0.getSimpleLabelOffset();
        java.awt.Image image7 = null;
        piePlot0.setBackgroundImage(image7);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets6);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
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
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-5d + "'", double6 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.025d + "'", double9 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
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
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot11.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup13 = piePlot11.getDatasetGroup();
        piePlot11.setOutlineVisible(true);
        piePlot11.setOutlineVisible(false);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent18 = null;
        piePlot11.notifyListeners(plotChangeEvent18);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator20 = piePlot11.getLabelGenerator();
        piePlot0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator20);
        boolean boolean22 = piePlot0.getSimpleLabels();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup13);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        piePlot3.setBackgroundImageAlignment((int) '#');
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3.getInsets();
        piePlot0.setLabelPadding(rectangleInsets18);
        piePlot0.setBackgroundImageAlignment((-1));
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.14d + "'", double4 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-5d + "'", double6 == 1.0E-5d);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(rectangleInsets18);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        double double4 = piePlot0.getShadowXOffset();
        piePlot0.setForegroundAlpha((float) 1L);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = piePlot0.getToolTipGenerator();
        piePlot0.setBackgroundAlpha(0.0f);
        piePlot0.setLabelGap(1.0d);
        int int12 = piePlot0.getPieIndex();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent13 = null;
        piePlot0.datasetChanged(datasetChangeEvent13);
        piePlot0.setIgnoreZeroValues(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
        org.junit.Assert.assertNull(pieToolTipGenerator7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        java.awt.Stroke stroke3 = piePlot0.getLabelLinkStroke();
        double double4 = piePlot0.getInteriorGap();
        piePlot0.setCircular(false, true);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08d + "'", double4 == 0.08d);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getLabelLinksVisible();
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
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.JFreeChart jFreeChart28 = org.jfree.chart.ChartFactory.createRingChart("Pie Plot", pieDataset24, true, false, false);
        piePlot5.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart28);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart28);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor31 = piePlot0.getLabelDistributor();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNull(pieSectionLabelGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.14d + "'", double14 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-5d + "'", double16 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.025d + "'", double20 == 0.025d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 90.0d + "'", double21 == 90.0d);
        org.junit.Assert.assertNotNull(jFreeChart28);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor31);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("Pie Plot", "Pie Plot", "hi!", xYDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
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
        double double19 = piePlot0.getMaximumLabelWidth();
        piePlot0.setNoDataMessage("");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.14d + "'", double19 == 0.14d);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("Pie Plot", "Pie Plot", "Pie Plot", categoryDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
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
        java.awt.Stroke stroke15 = piePlot3.getOutlineStroke();
        java.awt.Shape shape16 = piePlot3.getLegendItemShape();
        piePlot3.setInteriorGap((double) 0.0f);
        boolean boolean19 = piePlot3.isOutlineVisible();
        java.awt.Stroke stroke20 = piePlot3.getLabelLinkStroke();
        piePlot0.setSectionOutlineStroke((java.lang.Comparable) 0.14d, stroke20);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = piePlot0.getInsets();
        piePlot0.setLabelLinksVisible(true);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.14d + "'", double4 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(pieURLGenerator11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(rectangleInsets22);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
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
        java.awt.Stroke stroke22 = piePlot0.getLabelOutlineStroke();
        java.lang.Object obj23 = piePlot0.clone();
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
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        boolean boolean4 = piePlot0.isOutlineVisible();
        java.awt.Paint paint5 = piePlot0.getNoDataMessagePaint();
        java.awt.Stroke stroke6 = piePlot0.getLabelOutlineStroke();
        double double7 = piePlot0.getMinimumArcAngleToDraw();
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot9 = piePlot8.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor10 = piePlot8.getLabelDistributor();
        java.awt.Stroke stroke11 = piePlot8.getOutlineStroke();
        piePlot0.setBaseSectionOutlineStroke(stroke11);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-5d + "'", double7 == 1.0E-5d);
        org.junit.Assert.assertNull(plot9);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        boolean boolean2 = piePlot0.isCircular();
        java.awt.Paint paint3 = piePlot0.getLabelBackgroundPaint();
        double double4 = piePlot0.getInteriorGap();
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        piePlot5.setDataset(pieDataset6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot5.getURLGenerator();
        org.jfree.chart.plot.Plot plot9 = piePlot5.getRootPlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator10 = null;
        piePlot5.setLabelGenerator(pieSectionLabelGenerator10);
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot();
        double double13 = piePlot12.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor14 = piePlot12.getLabelDistributor();
        double double15 = piePlot12.getMinimumArcAngleToDraw();
        java.awt.Paint paint16 = piePlot12.getBaseSectionOutlinePaint();
        double double17 = piePlot12.getShadowYOffset();
        piePlot12.setBackgroundImageAlignment((int) (byte) -1);
        double double20 = piePlot12.getInteriorGap();
        java.awt.Image image21 = null;
        piePlot12.setBackgroundImage(image21);
        java.awt.Stroke stroke23 = piePlot12.getLabelLinkStroke();
        piePlot5.setLabelLinkStroke(stroke23);
        piePlot0.setBaseSectionOutlineStroke(stroke23);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08d + "'", double4 == 0.08d);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.14d + "'", double13 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.0d + "'", double17 == 4.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.08d + "'", double20 == 0.08d);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart3D("hi!", pieDataset1, false, false, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", pieDataset1, pieDataset2, (int) (byte) 0, true, true, true, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = piePlot0.getDrawingSupplier();
        java.awt.Stroke stroke6 = piePlot0.getOutlineStroke();
        float float7 = piePlot0.getBackgroundImageAlpha();
        java.awt.Stroke stroke9 = piePlot0.getSectionOutlineStroke((java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNull(stroke9);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
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
        java.awt.Stroke stroke18 = piePlot0.getLabelOutlineStroke();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator19 = piePlot0.getURLGenerator();
        piePlot0.setLabelGap((double) (byte) 10);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.14d + "'", double13 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNull(pieURLGenerator19);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        org.jfree.chart.plot.Plot plot2 = piePlot0.getParent();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = null;
        piePlot0.setLegendLabelURLGenerator(pieURLGenerator3);
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
        java.awt.Shape shape18 = piePlot5.getLegendItemShape();
        piePlot5.setInteriorGap((double) 0.0f);
        boolean boolean21 = piePlot5.isOutlineVisible();
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot();
        double double24 = piePlot23.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor25 = piePlot23.getLabelDistributor();
        double double26 = piePlot23.getMinimumArcAngleToDraw();
        java.awt.Paint paint27 = piePlot23.getBaseSectionOutlinePaint();
        double double28 = piePlot23.getShadowYOffset();
        piePlot23.setBackgroundImageAlignment((int) (byte) -1);
        java.awt.Paint paint31 = piePlot23.getLabelPaint();
        piePlot5.setSectionOutlinePaint((java.lang.Comparable) (-1.0f), paint31);
        piePlot0.setBackgroundPaint(paint31);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.14d + "'", double6 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNull(pieURLGenerator13);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.14d + "'", double24 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0E-5d + "'", double26 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.0d + "'", double28 == 4.0d);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint3 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot0.setLabelShadowPaint(paint3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        piePlot0.handleClick((int) ' ', (int) (short) -1, plotRenderingInfo7);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot0.getDrawingSupplier();
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        double double11 = piePlot10.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = piePlot10.getLabelDistributor();
        double double13 = piePlot10.getMinimumArcAngleToDraw();
        java.awt.Paint paint14 = piePlot10.getBaseSectionOutlinePaint();
        double double15 = piePlot10.getShadowYOffset();
        piePlot10.setBackgroundImageAlignment((int) (byte) -1);
        double double18 = piePlot10.getInteriorGap();
        org.jfree.chart.plot.PiePlot piePlot19 = new org.jfree.chart.plot.PiePlot();
        double double20 = piePlot19.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor21 = piePlot19.getLabelDistributor();
        double double22 = piePlot19.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        piePlot19.drawBackgroundImage(graphics2D23, rectangle2D24);
        java.awt.Paint paint27 = piePlot19.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font28 = piePlot19.getLabelFont();
        piePlot10.setLabelFont(font28);
        piePlot0.setLabelFont(font28);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(drawingSupplier9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.14d + "'", double11 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-5d + "'", double13 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 4.0d + "'", double15 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.08d + "'", double18 == 0.08d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.14d + "'", double20 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0E-5d + "'", double22 == 1.0E-5d);
        org.junit.Assert.assertNull(paint27);
        org.junit.Assert.assertNotNull(font28);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        org.jfree.data.general.DatasetGroup datasetGroup28 = piePlot0.getDatasetGroup();
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
        org.junit.Assert.assertNull(datasetGroup28);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createHistogram("hi!", "hi!", "Pie Plot", intervalXYDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
        java.awt.Paint paint17 = piePlot0.getSectionOutlinePaint((java.lang.Comparable) 15);
        boolean boolean18 = piePlot0.getIgnoreZeroValues();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
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
        piePlot0.setIgnoreNullValues(true);
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
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        piePlot0.setShadowYOffset((double) (byte) 0);
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot();
        double double21 = piePlot20.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor22 = piePlot20.getLabelDistributor();
        piePlot0.setLabelDistributor(abstractPieLabelDistributor22);
        java.awt.Paint paint25 = piePlot0.getSectionPaint((java.lang.Comparable) (-1.0d));
        java.awt.Image image26 = piePlot0.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(pieURLGenerator17);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.14d + "'", double21 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor22);
        org.junit.Assert.assertNull(paint25);
        org.junit.Assert.assertNull(image26);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot4.getLegendLabelGenerator();
        piePlot4.setOutlineVisible(true);
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        double double9 = piePlot8.getMaximumLabelWidth();
        piePlot8.setForegroundAlpha((float) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets12 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot8.setInsets(rectangleInsets12);
        piePlot4.setLabelPadding(rectangleInsets12);
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot();
        double double16 = piePlot15.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup17 = piePlot15.getDatasetGroup();
        piePlot15.setOutlineVisible(true);
        boolean boolean21 = piePlot15.equals((java.lang.Object) true);
        org.jfree.chart.plot.PiePlot piePlot22 = new org.jfree.chart.plot.PiePlot();
        double double23 = piePlot22.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor24 = piePlot22.getLabelDistributor();
        double double25 = piePlot22.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        piePlot22.drawBackgroundImage(graphics2D26, rectangle2D27);
        java.awt.Paint paint30 = piePlot22.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font31 = piePlot22.getLabelFont();
        piePlot15.setNoDataMessageFont(font31);
        boolean boolean33 = piePlot15.isOutlineVisible();
        double double34 = piePlot15.getLabelGap();
        java.awt.Paint paint35 = piePlot15.getLabelLinkPaint();
        java.awt.Paint paint36 = piePlot15.getNoDataMessagePaint();
        piePlot4.setNoDataMessagePaint(paint36);
        piePlot0.setLabelPaint(paint36);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14d + "'", double9 == 0.14d);
        org.junit.Assert.assertNotNull(rectangleInsets12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.14d + "'", double16 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.14d + "'", double23 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0E-5d + "'", double25 == 1.0E-5d);
        org.junit.Assert.assertNull(paint30);
        org.junit.Assert.assertNotNull(font31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.025d + "'", double34 == 0.025d);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint36);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.util.TableOrder tableOrder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createMultiplePieChart3D("", categoryDataset1, tableOrder2, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        piePlot0.setForegroundAlpha((float) (short) 0);
        piePlot0.setMinimumArcAngleToDraw((double) (-1));
        java.awt.Paint paint6 = piePlot0.getLabelLinkPaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
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
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        piePlot0.drawBackgroundImage(graphics2D25, rectangle2D26);
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
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
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
        org.jfree.chart.plot.Plot plot19 = piePlot0.getParent();
        java.awt.Stroke stroke20 = piePlot0.getBaseSectionOutlineStroke();
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
        java.awt.Stroke stroke32 = piePlot21.getLabelOutlineStroke();
        java.awt.Paint paint33 = piePlot21.getLabelOutlinePaint();
        int int34 = piePlot21.getPieIndex();
        java.awt.Paint paint35 = piePlot21.getLabelLinkPaint();
        boolean boolean36 = piePlot0.equals((java.lang.Object) piePlot21);
        java.awt.Stroke stroke37 = piePlot21.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(pieURLGenerator17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(plot19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.14d + "'", double22 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0E-5d + "'", double24 == 1.0E-5d);
        org.junit.Assert.assertNull(paint29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(stroke37);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        piePlot0.setOutlineVisible(false);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent7 = null;
        piePlot0.notifyListeners(plotChangeEvent7);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator9 = piePlot0.getLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = piePlot0.getInsets();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator9);
        org.junit.Assert.assertNotNull(rectangleInsets10);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
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
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor15 = piePlot0.getLabelDistributor();
        java.awt.Paint paint16 = piePlot0.getLabelPaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor15);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.jfree.data.xy.XYDataset xYDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPolarChart("", xYDataset1, false, true, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = piePlot0.getLabelPadding();
        boolean boolean17 = piePlot0.isSubplot();
        java.awt.Stroke stroke18 = piePlot0.getLabelOutlineStroke();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rotation12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("hi!", "Pie Plot", "hi!", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        piePlot0.setDataset(pieDataset3);
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot7 = piePlot6.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor8 = piePlot6.getLabelDistributor();
        java.awt.Stroke stroke9 = piePlot6.getOutlineStroke();
        piePlot0.setSectionOutlineStroke((java.lang.Comparable) 'a', stroke9);
        java.awt.Paint paint11 = piePlot0.getBaseSectionPaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNull(plot7);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        piePlot0.setDataset(pieDataset3);
        int int5 = piePlot0.getPieIndex();
        java.awt.Paint paint6 = piePlot0.getLabelLinkPaint();
        java.awt.Paint paint7 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot0.setBackgroundPaint(paint7);
        boolean boolean9 = piePlot0.isSubplot();
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        double double11 = piePlot10.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = piePlot10.getLabelDistributor();
        double double13 = piePlot10.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        piePlot10.drawBackgroundImage(graphics2D14, rectangle2D15);
        java.awt.Paint paint18 = piePlot10.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font19 = piePlot10.getLabelFont();
        piePlot10.setSimpleLabels(false);
        java.awt.Paint paint22 = piePlot10.getLabelPaint();
        java.awt.Paint paint23 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot10.setLabelOutlinePaint(paint23);
        piePlot10.setStartAngle((double) 100L);
        java.awt.Paint paint27 = piePlot10.getLabelShadowPaint();
        piePlot10.setBackgroundImageAlignment(100);
        double double30 = piePlot10.getShadowYOffset();
        org.jfree.chart.plot.PiePlot piePlot31 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator32 = piePlot31.getLegendLabelGenerator();
        piePlot31.setOutlineVisible(true);
        piePlot31.setLabelLinkMargin((double) (short) -1);
        org.jfree.chart.plot.PiePlot piePlot37 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset38 = null;
        piePlot37.setDataset(pieDataset38);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator40 = piePlot37.getURLGenerator();
        org.jfree.chart.plot.Plot plot41 = piePlot37.getRootPlot();
        double double42 = piePlot37.getLabelGap();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator43 = piePlot37.getLegendLabelGenerator();
        piePlot31.setLegendLabelGenerator(pieSectionLabelGenerator43);
        piePlot10.setLegendLabelGenerator(pieSectionLabelGenerator43);
        piePlot0.setLabelGenerator(pieSectionLabelGenerator43);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.14d + "'", double11 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-5d + "'", double13 == 1.0E-5d);
        org.junit.Assert.assertNull(paint18);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 4.0d + "'", double30 == 4.0d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator32);
        org.junit.Assert.assertNull(pieURLGenerator40);
        org.junit.Assert.assertNotNull(plot41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.025d + "'", double42 == 0.025d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator43);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createHighLowChart("Pie Plot", "Pie Plot", "Pie Plot", oHLCDataset3, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        piePlot0.setIgnoreZeroValues(false);
        java.awt.Paint paint6 = piePlot0.getLabelLinkPaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("Pie Plot", "hi!", "", xYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
        double double31 = piePlot0.getExplodePercent((java.lang.Comparable) 1);
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
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        boolean boolean35 = piePlot0.getSectionOutlinesVisible();
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        java.awt.Paint paint29 = piePlot0.getLabelLinkPaint();
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
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("", "hi!", "Pie Plot", xYDataset3, false, false, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
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
        java.lang.Class<?> wildcardClass24 = piePlot0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
        java.awt.Paint paint11 = piePlot0.getLabelLinkPaint();
        java.lang.String str12 = piePlot0.getPlotType();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pie Plot" + "'", str12, "Pie Plot");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
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
        java.awt.Stroke stroke13 = piePlot0.getLabelOutlineStroke();
        piePlot0.setLabelGap((double) (-1.0f));
        piePlot0.setBackgroundAlpha((float) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator18 = piePlot0.getToolTipGenerator();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNull(plot12);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(pieToolTipGenerator18);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("hi!", "Pie Plot", "hi!", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("hi!", "Pie Plot", "", xYDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator19 = piePlot0.getLegendLabelToolTipGenerator();
        boolean boolean20 = piePlot0.getSectionOutlinesVisible();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNull(pieSectionLabelGenerator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator15 = null;
        piePlot0.setURLGenerator(pieURLGenerator15);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart3D("", "Pie Plot", "", categoryDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        boolean boolean2 = piePlot0.isCircular();
        java.awt.Font font3 = piePlot0.getLabelFont();
        piePlot0.setBackgroundAlpha(1.0f);
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot7.getDatasetGroup();
        piePlot7.setBackgroundImageAlignment((int) 'a');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor11 = piePlot7.getLabelDistributor();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator12 = piePlot7.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        piePlot13.setDataset(pieDataset14);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = piePlot13.getURLGenerator();
        org.jfree.chart.plot.Plot plot17 = piePlot13.getRootPlot();
        double double18 = piePlot13.getLabelGap();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator19 = piePlot13.getLegendLabelGenerator();
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot();
        double double22 = piePlot21.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor23 = piePlot21.getLabelDistributor();
        double double24 = piePlot21.getMinimumArcAngleToDraw();
        java.awt.Paint paint25 = piePlot21.getBaseSectionOutlinePaint();
        piePlot21.setIgnoreNullValues(false);
        java.awt.Paint paint28 = piePlot21.getNoDataMessagePaint();
        piePlot13.setSectionPaint((java.lang.Comparable) 100L, paint28);
        piePlot7.setLabelPaint(paint28);
        piePlot0.setSectionPaint((java.lang.Comparable) (byte) -1, paint28);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(font3);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor11);
        org.junit.Assert.assertNull(pieSectionLabelGenerator12);
        org.junit.Assert.assertNull(pieURLGenerator16);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.025d + "'", double18 == 0.025d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator19);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.14d + "'", double22 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0E-5d + "'", double24 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        java.awt.Stroke stroke3 = piePlot0.getLabelLinkStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = piePlot0.getLabelPadding();
        piePlot0.setShadowYOffset((double) 0.5f);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(rectangleInsets4);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot0.getLabelPadding();
        float float15 = piePlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(rectangleInsets14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
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
        boolean boolean16 = piePlot0.getSimpleLabels();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator17 = null;
        piePlot0.setLegendLabelURLGenerator(pieURLGenerator17);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        piePlot11.setBackgroundImageAlpha((float) (byte) 1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator23 = piePlot11.getURLGenerator();
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
        org.junit.Assert.assertNull(pieURLGenerator23);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYAreaChart("", "Pie Plot", "", xYDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getLabelLinksVisible();
        piePlot0.setBackgroundImageAlpha(0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        org.jfree.chart.plot.PiePlot piePlot2 = new org.jfree.chart.plot.PiePlot();
        double double3 = piePlot2.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot2.getLabelDistributor();
        double double5 = piePlot2.getMinimumArcAngleToDraw();
        java.awt.Paint paint6 = piePlot2.getBaseSectionOutlinePaint();
        double double7 = piePlot2.getShadowYOffset();
        java.awt.Image image8 = null;
        piePlot2.setBackgroundImage(image8);
        org.jfree.chart.util.Rotation rotation10 = piePlot2.getDirection();
        piePlot0.setDirection(rotation10);
        org.jfree.chart.plot.Plot plot12 = piePlot0.getParent();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.14d + "'", double3 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-5d + "'", double5 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
        org.junit.Assert.assertNotNull(rotation10);
        org.junit.Assert.assertNull(plot12);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        boolean boolean1 = piePlot0.getSimpleLabels();
        org.jfree.chart.plot.PiePlot piePlot2 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator3 = piePlot2.getLegendLabelGenerator();
        piePlot2.setOutlineVisible(true);
        piePlot2.setLabelLinkMargin((double) (short) -1);
        piePlot2.setForegroundAlpha(1.0f);
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        double double11 = piePlot10.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = piePlot10.getLabelDistributor();
        double double13 = piePlot10.getMinimumArcAngleToDraw();
        java.awt.Paint paint14 = piePlot10.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier15 = piePlot10.getDrawingSupplier();
        piePlot2.setDrawingSupplier(drawingSupplier15);
        piePlot0.setDrawingSupplier(drawingSupplier15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator3);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.14d + "'", double11 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-5d + "'", double13 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(drawingSupplier15);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("hi!", "", "", xYDataset3, true, false, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
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
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        piePlot13.setDataset(pieDataset14);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = piePlot13.getURLGenerator();
        piePlot13.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator19 = piePlot13.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot();
        double double21 = piePlot20.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor22 = piePlot20.getLabelDistributor();
        double double23 = piePlot20.getMinimumArcAngleToDraw();
        boolean boolean24 = piePlot20.getIgnoreZeroValues();
        boolean boolean25 = piePlot20.isSubplot();
        piePlot20.setCircular(false);
        java.awt.Paint paint29 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot20.setSectionOutlinePaint((java.lang.Comparable) "", paint29);
        piePlot13.setNoDataMessagePaint(paint29);
        piePlot0.setLabelBackgroundPaint(paint29);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor33 = piePlot0.getLabelDistributor();
        piePlot0.setExplodePercent((java.lang.Comparable) 0.4d, (double) (short) 1);
        double double37 = piePlot0.getLabelLinkMargin();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent38 = null;
        piePlot0.axisChanged(axisChangeEvent38);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(pieURLGenerator16);
        org.junit.Assert.assertNull(pieSectionLabelGenerator19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.14d + "'", double21 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0E-5d + "'", double23 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor33);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.025d + "'", double37 == 0.025d);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        boolean boolean5 = piePlot0.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot6 = piePlot0.getParent();
        piePlot0.setLabelLinkMargin((double) 10);
        org.jfree.chart.plot.Plot plot9 = piePlot0.getParent();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(plot6);
        org.junit.Assert.assertNull(plot9);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        piePlot0.setForegroundAlpha(100.0f);
        piePlot0.zoom(0.0d);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        piePlot0.handleClick((int) (byte) 0, (int) (byte) 1, plotRenderingInfo8);
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        piePlot10.setDataset(pieDataset11);
        piePlot10.setBackgroundAlpha((float) (byte) 0);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = piePlot10.getLegendLabelGenerator();
        piePlot0.setLabelGenerator(pieSectionLabelGenerator15);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator15);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.jfree.data.statistics.BoxAndWhiskerCategoryDataset boxAndWhiskerCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("Pie Plot", "Pie Plot", "Pie Plot", boxAndWhiskerCategoryDataset3, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        java.awt.Paint paint4 = piePlot0.getLabelShadowPaint();
        java.awt.Image image5 = null;
        piePlot0.setBackgroundImage(image5);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        boolean boolean33 = piePlot0.isSubplot();
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
        java.awt.Paint paint47 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot34.setLabelOutlinePaint(paint47);
        piePlot34.setStartAngle((double) 100L);
        java.awt.Paint paint51 = piePlot34.getLabelShadowPaint();
        java.awt.Image image52 = null;
        piePlot34.setBackgroundImage(image52);
        org.jfree.chart.plot.PiePlot piePlot54 = new org.jfree.chart.plot.PiePlot();
        double double55 = piePlot54.getMaximumLabelWidth();
        piePlot54.setForegroundAlpha(100.0f);
        org.jfree.chart.plot.PiePlot piePlot58 = new org.jfree.chart.plot.PiePlot();
        double double59 = piePlot58.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor60 = piePlot58.getLabelDistributor();
        double double61 = piePlot58.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D62 = null;
        java.awt.geom.Rectangle2D rectangle2D63 = null;
        piePlot58.drawBackgroundImage(graphics2D62, rectangle2D63);
        java.awt.Paint paint66 = piePlot58.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str67 = piePlot58.getNoDataMessage();
        java.awt.Paint paint68 = piePlot58.getLabelOutlinePaint();
        piePlot54.setBaseSectionOutlinePaint(paint68);
        boolean boolean70 = piePlot34.equals((java.lang.Object) piePlot54);
        boolean boolean71 = piePlot54.isCircular();
        org.jfree.chart.plot.PiePlot piePlot72 = new org.jfree.chart.plot.PiePlot();
        double double73 = piePlot72.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor74 = piePlot72.getLabelDistributor();
        double double75 = piePlot72.getMinimumArcAngleToDraw();
        boolean boolean76 = piePlot72.getIgnoreZeroValues();
        boolean boolean77 = piePlot72.isSubplot();
        piePlot72.setCircular(false);
        java.awt.Paint paint81 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot72.setSectionOutlinePaint((java.lang.Comparable) "", paint81);
        piePlot54.setShadowPaint(paint81);
        java.awt.Paint paint84 = piePlot54.getLabelShadowPaint();
        piePlot0.setBaseSectionOutlinePaint(paint84);
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.14d + "'", double35 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0E-5d + "'", double37 == 1.0E-5d);
        org.junit.Assert.assertNull(paint42);
        org.junit.Assert.assertNotNull(font43);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.14d + "'", double55 == 0.14d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.14d + "'", double59 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor60);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 1.0E-5d + "'", double61 == 1.0E-5d);
        org.junit.Assert.assertNull(paint66);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(paint68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.14d + "'", double73 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor74);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 1.0E-5d + "'", double75 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(paint81);
        org.junit.Assert.assertNotNull(paint84);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        java.awt.Stroke stroke5 = piePlot0.getLabelOutlineStroke();
        java.awt.Shape shape6 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot0.setLegendItemShape(shape6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot0.getLegendLabelURLGenerator();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator9 = piePlot0.getLegendLabelToolTipGenerator();
        double double10 = piePlot0.getMinimumArcAngleToDraw();
        float float11 = piePlot0.getForegroundAlpha();
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset15 = null;
        org.jfree.chart.JFreeChart jFreeChart17 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("hi!", "hi!", "", boxAndWhiskerXYDataset15, false);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart17);
        piePlot0.setBackgroundAlpha((float) 'a');
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNull(pieSectionLabelGenerator9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertNotNull(jFreeChart17);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        piePlot0.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelToolTipGenerator();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = null;
        piePlot0.setURLGenerator(pieURLGenerator7);
        boolean boolean9 = piePlot0.getSimpleLabels();
        java.awt.Shape shape10 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot0.setLegendItemShape(shape10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = null;
        piePlot0.notifyListeners(plotChangeEvent12);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("", "hi!", "", categoryDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.axis.Timeline timeline4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createHighLowChart("hi!", "Pie Plot", "hi!", oHLCDataset3, timeline4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        double double6 = piePlot0.getMinimumArcAngleToDraw();
        float float7 = piePlot0.getBackgroundImageAlpha();
        piePlot0.setIgnoreNullValues(true);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        java.awt.geom.Point2D point2D12 = null;
        org.jfree.chart.plot.PlotState plotState13 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.draw(graphics2D10, rectangle2D11, point2D12, plotState13, plotRenderingInfo14);
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
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        java.awt.Stroke stroke3 = piePlot0.getLabelLinkStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = piePlot0.getLabelPadding();
        java.awt.Stroke stroke5 = piePlot0.getBaseSectionOutlineStroke();
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertNotNull(stroke5);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("hi!", "Pie Plot", "hi!", categoryDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepAreaChart("Pie Plot", "", "hi!", xYDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("hi!", "hi!", "hi!", intervalCategoryDataset3, true, false, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
        int int22 = piePlot0.getBackgroundImageAlignment();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent23 = null;
        piePlot0.axisChanged(axisChangeEvent23);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(paint18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
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
        piePlot0.setBackgroundAlpha((float) (byte) 100);
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
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
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
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        piePlot0.notifyListeners(plotChangeEvent24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(datasetGroup5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        boolean boolean4 = piePlot0.isOutlineVisible();
        java.awt.Paint paint5 = piePlot0.getNoDataMessagePaint();
        java.awt.Stroke stroke6 = piePlot0.getLabelOutlineStroke();
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator8 = piePlot7.getLegendLabelGenerator();
        double double9 = piePlot7.getMaximumLabelWidth();
        float float10 = piePlot7.getForegroundAlpha();
        boolean boolean11 = piePlot7.getIgnoreZeroValues();
        piePlot7.setSectionOutlinesVisible(false);
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
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor26 = piePlot14.getLabelDistributor();
        piePlot7.setLabelDistributor(abstractPieLabelDistributor26);
        piePlot0.setLabelDistributor(abstractPieLabelDistributor26);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14d + "'", double9 == 0.14d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-5d + "'", double17 == 1.0E-5d);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor26);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart3D("Pie Plot", "Pie Plot", "Pie Plot", categoryDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getShadowYOffset();
        piePlot0.setIgnoreNullValues(false);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        java.util.Locale locale9 = null;
        org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart3D("hi!", pieDataset6, true, false, locale9);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart10);
        org.jfree.data.general.PieDataset pieDataset12 = piePlot0.getDataset();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(pieDataset12);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot0.setToolTipGenerator(pieToolTipGenerator2);
        double double4 = piePlot0.getShadowYOffset();
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        double double6 = piePlot5.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor7 = piePlot5.getLabelDistributor();
        double double8 = piePlot5.getMinimumArcAngleToDraw();
        java.awt.Paint paint9 = piePlot5.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = piePlot5.getDrawingSupplier();
        double double11 = piePlot5.getShadowXOffset();
        double double12 = piePlot5.getLabelLinkMargin();
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot14 = piePlot13.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor15 = piePlot13.getLabelDistributor();
        java.awt.Stroke stroke16 = piePlot13.getOutlineStroke();
        piePlot13.setPieIndex(100);
        java.awt.Paint paint19 = piePlot13.getLabelOutlinePaint();
        org.jfree.data.statistics.BoxAndWhiskerCategoryDataset boxAndWhiskerCategoryDataset23 = null;
        org.jfree.chart.JFreeChart jFreeChart25 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("Pie Plot", "hi!", "hi!", boxAndWhiskerCategoryDataset23, true);
        piePlot13.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart25);
        java.awt.Paint paint27 = piePlot13.getLabelLinkPaint();
        piePlot5.setBaseSectionPaint(paint27);
        piePlot0.setLabelShadowPaint(paint27);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.14d + "'", double6 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(drawingSupplier10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.0d + "'", double11 == 4.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.025d + "'", double12 == 0.025d);
        org.junit.Assert.assertNull(plot14);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(jFreeChart25);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        java.awt.Paint paint4 = piePlot0.getLabelShadowPaint();
        double double5 = piePlot0.getInteriorGap();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.08d + "'", double5 == 0.08d);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
        org.jfree.chart.plot.Plot plot19 = piePlot0.getParent();
        java.awt.Stroke stroke20 = piePlot0.getBaseSectionOutlineStroke();
        piePlot0.setStartAngle(1.0E-5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(pieURLGenerator17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(plot19);
        org.junit.Assert.assertNotNull(stroke20);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("hi!", "hi!", "hi!", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        piePlot0.setDataset(pieDataset3);
        piePlot0.setIgnoreZeroValues(true);
        piePlot0.setCircular(true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator9 = piePlot0.getLegendLabelURLGenerator();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNull(pieURLGenerator9);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        boolean boolean2 = piePlot0.isCircular();
        java.lang.String str3 = piePlot0.getPlotType();
        boolean boolean4 = piePlot0.isSubplot();
        java.awt.Stroke stroke6 = piePlot0.getSectionOutlineStroke((java.lang.Comparable) (-1.0f));
        org.jfree.chart.LegendItemCollection legendItemCollection7 = piePlot0.getLegendItems();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertNull(legendItemCollection7);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        boolean boolean5 = piePlot0.isSubplot();
        piePlot0.setCircular(false);
        boolean boolean8 = piePlot0.isCircular();
        piePlot0.setOutlineVisible(false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        piePlot0.setForegroundAlpha(100.0f);
        piePlot0.zoom(0.0d);
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
        java.awt.Paint paint20 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot7.setLabelOutlinePaint(paint20);
        piePlot7.setStartAngle((double) 100L);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator24 = piePlot7.getURLGenerator();
        java.awt.Paint paint25 = piePlot7.getLabelLinkPaint();
        piePlot0.setSectionOutlinePaint((java.lang.Comparable) 100.0f, paint25);
        org.jfree.data.general.PieDataset pieDataset27 = null;
        piePlot0.setDataset(pieDataset27);
        piePlot0.setShadowXOffset((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(pieURLGenerator24);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getStartAngle();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 90.0d + "'", double5 == 90.0d);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.lang.String str3 = piePlot0.getPlotType();
        org.jfree.data.general.DatasetGroup datasetGroup4 = piePlot0.getDatasetGroup();
        java.awt.Shape shape5 = piePlot0.getLegendItemShape();
        float float6 = piePlot0.getBackgroundImageAlpha();
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
        java.awt.Paint paint20 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot7.setLabelOutlinePaint(paint20);
        piePlot7.setShadowXOffset(1.0E-5d);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = piePlot7.getDrawingSupplier();
        piePlot0.setDrawingSupplier(drawingSupplier24);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(drawingSupplier24);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("", "", "hi!", xYDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
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
        org.jfree.chart.plot.Plot plot26 = piePlot25.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor27 = piePlot25.getLabelDistributor();
        java.awt.Stroke stroke28 = piePlot25.getOutlineStroke();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator29 = null;
        piePlot25.setLegendLabelURLGenerator(pieURLGenerator29);
        java.awt.Font font31 = piePlot25.getLabelFont();
        org.jfree.chart.plot.PiePlot piePlot32 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset33 = null;
        piePlot32.setDataset(pieDataset33);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator35 = piePlot32.getURLGenerator();
        org.jfree.chart.plot.Plot plot36 = piePlot32.getRootPlot();
        java.awt.Stroke stroke37 = piePlot32.getLabelOutlineStroke();
        java.awt.Shape shape38 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot32.setLegendItemShape(shape38);
        java.awt.Stroke stroke40 = piePlot32.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot41 = new org.jfree.chart.plot.PiePlot();
        double double42 = piePlot41.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor43 = piePlot41.getLabelDistributor();
        double double44 = piePlot41.getMinimumArcAngleToDraw();
        java.awt.Paint paint45 = piePlot41.getBaseSectionOutlinePaint();
        double double46 = piePlot41.getShadowYOffset();
        piePlot41.setBackgroundImageAlignment((int) (byte) -1);
        double double49 = piePlot41.getInteriorGap();
        java.awt.Font font50 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot41.setNoDataMessageFont(font50);
        piePlot32.setLabelFont(font50);
        piePlot25.setNoDataMessageFont(font50);
        piePlot0.setNoDataMessageFont(font50);
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
        org.junit.Assert.assertNotNull(jFreeChart23);
        org.junit.Assert.assertNull(plot26);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(font31);
        org.junit.Assert.assertNull(pieURLGenerator35);
        org.junit.Assert.assertNotNull(plot36);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.14d + "'", double42 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0E-5d + "'", double44 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 4.0d + "'", double46 == 4.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.08d + "'", double49 == 0.08d);
        org.junit.Assert.assertNotNull(font50);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedAreaChart("", "hi!", "hi!", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Stroke stroke7 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot0.setLabelLinkStroke(stroke7);
        java.awt.Paint paint9 = piePlot0.getShadowPaint();
        double double10 = piePlot0.getLabelGap();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.025d + "'", double10 == 0.025d);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createRingChart("", pieDataset1, false, true, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        piePlot0.setOutlineVisible(false);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent7 = null;
        piePlot0.notifyListeners(plotChangeEvent7);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator9 = piePlot0.getLabelGenerator();
        boolean boolean10 = piePlot0.getSimpleLabels();
        org.jfree.data.xy.XYDataset xYDataset12 = null;
        org.jfree.chart.JFreeChart jFreeChart16 = org.jfree.chart.ChartFactory.createPolarChart("hi!", xYDataset12, true, true, true);
        piePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart16);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jFreeChart16);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Font font3 = piePlot0.getLabelFont();
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset5 = null;
        piePlot4.setDataset(pieDataset5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot4.getURLGenerator();
        org.jfree.chart.plot.Plot plot8 = piePlot4.getRootPlot();
        double double9 = piePlot4.getLabelGap();
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        double double11 = piePlot10.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = piePlot10.getLabelDistributor();
        double double13 = piePlot10.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        piePlot10.drawBackgroundImage(graphics2D14, rectangle2D15);
        java.awt.Paint paint18 = piePlot10.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font19 = piePlot10.getLabelFont();
        piePlot10.setSimpleLabels(false);
        java.awt.Paint paint22 = piePlot10.getLabelPaint();
        java.awt.Paint paint23 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot10.setLabelOutlinePaint(paint23);
        piePlot10.setStartAngle((double) 100L);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator27 = piePlot10.getToolTipGenerator();
        java.awt.Paint paint28 = piePlot10.getLabelBackgroundPaint();
        piePlot4.setLabelLinkPaint(paint28);
        piePlot0.setLabelOutlinePaint(paint28);
        java.awt.Stroke stroke32 = piePlot0.getSectionOutlineStroke((java.lang.Comparable) (-1));
        org.jfree.chart.plot.PiePlot piePlot33 = new org.jfree.chart.plot.PiePlot();
        double double34 = piePlot33.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor35 = piePlot33.getLabelDistributor();
        double double36 = piePlot33.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D37 = null;
        java.awt.geom.Rectangle2D rectangle2D38 = null;
        piePlot33.drawBackgroundImage(graphics2D37, rectangle2D38);
        java.awt.Paint paint41 = piePlot33.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str42 = piePlot33.getNoDataMessage();
        java.awt.Paint paint43 = piePlot33.getLabelOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets44 = piePlot33.getLabelPadding();
        boolean boolean45 = piePlot33.getSimpleLabels();
        piePlot33.setBackgroundAlpha((float) 10);
        java.awt.Paint paint48 = piePlot33.getLabelBackgroundPaint();
        piePlot0.setOutlinePaint(paint48);
        org.junit.Assert.assertNotNull(font3);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNotNull(plot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.025d + "'", double9 == 0.025d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.14d + "'", double11 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-5d + "'", double13 == 1.0E-5d);
        org.junit.Assert.assertNull(paint18);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(pieToolTipGenerator27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNull(stroke32);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.14d + "'", double34 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0E-5d + "'", double36 == 1.0E-5d);
        org.junit.Assert.assertNull(paint41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(rectangleInsets44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(paint48);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
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
        piePlot0.setMaximumLabelWidth((double) 10.0f);
        java.awt.Paint paint44 = piePlot0.getLabelOutlinePaint();
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
        org.junit.Assert.assertNotNull(paint44);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
        java.awt.Paint paint55 = piePlot0.getNoDataMessagePaint();
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
        org.junit.Assert.assertNotNull(paint55);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        java.awt.Stroke stroke5 = piePlot0.getLabelOutlineStroke();
        java.awt.Shape shape6 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot0.setLegendItemShape(shape6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot0.getLegendLabelURLGenerator();
        piePlot0.setStartAngle((double) 0.0f);
        piePlot0.setNoDataMessage("Pie Plot");
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNull(pieURLGenerator8);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        piePlot1.zoom(0.4d);
        java.awt.Stroke stroke5 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot1.setSectionOutlineStroke((java.lang.Comparable) false, stroke5);
        boolean boolean7 = piePlot1.getIgnoreNullValues();
        java.awt.Paint paint8 = piePlot1.getLabelLinkPaint();
        java.awt.Paint paint9 = piePlot1.getOutlinePaint();
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("Pie Plot", "", "hi!", xYDataset3, false, true, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.jfree.data.statistics.BoxAndWhiskerCategoryDataset boxAndWhiskerCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "Pie Plot", "hi!", boxAndWhiskerCategoryDataset3, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        piePlot0.setOutlineVisible(true);
        piePlot0.setOutlineVisible(false);
        java.awt.Paint paint6 = piePlot0.getBackgroundPaint();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("", "", "Pie Plot", categoryDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        java.awt.Paint paint14 = piePlot1.getNoDataMessagePaint();
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot();
        double double16 = piePlot15.getMaximumLabelWidth();
        piePlot15.setForegroundAlpha(100.0f);
        piePlot15.zoom(0.0d);
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator39 = piePlot22.getURLGenerator();
        java.awt.Paint paint40 = piePlot22.getLabelLinkPaint();
        piePlot15.setSectionOutlinePaint((java.lang.Comparable) 100.0f, paint40);
        piePlot1.setLabelBackgroundPaint(paint40);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14d + "'", double9 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.14d + "'", double16 == 0.14d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.14d + "'", double23 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0E-5d + "'", double25 == 1.0E-5d);
        org.junit.Assert.assertNull(paint30);
        org.junit.Assert.assertNotNull(font31);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNull(pieURLGenerator39);
        org.junit.Assert.assertNotNull(paint40);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot();
        double double15 = piePlot14.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor16 = piePlot14.getLabelDistributor();
        double double17 = piePlot14.getMinimumArcAngleToDraw();
        java.awt.Paint paint18 = piePlot14.getBaseSectionOutlinePaint();
        piePlot14.setIgnoreNullValues(false);
        java.awt.Paint paint21 = piePlot14.getNoDataMessagePaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        piePlot14.handleClick((int) (short) -1, (int) (byte) 100, plotRenderingInfo24);
        java.awt.Stroke stroke26 = piePlot14.getLabelLinkStroke();
        piePlot0.setLabelLinkStroke(stroke26);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-5d + "'", double17 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
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
        int int22 = piePlot0.getBackgroundImageAlignment();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = piePlot0.getLabelPadding();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent24 = null;
        piePlot0.datasetChanged(datasetChangeEvent24);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(paint18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
        org.junit.Assert.assertNotNull(rectangleInsets23);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        java.awt.Paint paint6 = piePlot0.getShadowPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator7 = piePlot0.getLegendLabelGenerator();
        piePlot0.setPieIndex((int) ' ');
        float float10 = piePlot0.getBackgroundImageAlpha();
        double double11 = piePlot0.getStartAngle();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 90.0d + "'", double11 == 90.0d);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        piePlot0.setExplodePercent((java.lang.Comparable) (-1), (double) (byte) 1);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent8 = null;
        piePlot0.axisChanged(axisChangeEvent8);
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        double double11 = piePlot10.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = piePlot10.getLabelDistributor();
        double double13 = piePlot10.getMinimumArcAngleToDraw();
        java.awt.Paint paint14 = piePlot10.getBaseSectionOutlinePaint();
        piePlot0.setLabelLinkPaint(paint14);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.14d + "'", double11 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-5d + "'", double13 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
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
        double double20 = piePlot0.getExplodePercent((java.lang.Comparable) 1.0d);
        java.awt.Image image21 = piePlot0.getBackgroundImage();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.14d + "'", double4 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-5d + "'", double6 == 1.0E-5d);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNull(image21);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("", "hi!", "", xYDataset3, true, false, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = piePlot0.getLegendLabelURLGenerator();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Pie Plot" + "'", str20, "Pie Plot");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(pieURLGenerator22);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        float float4 = piePlot0.getForegroundAlpha();
        java.awt.Stroke stroke5 = piePlot0.getBaseSectionOutlineStroke();
        piePlot0.setMinimumArcAngleToDraw((double) '#');
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(stroke5);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("Pie Plot", "hi!", "Pie Plot", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelToolTipGenerator();
        piePlot0.setCircular(false, true);
        piePlot0.setLabelLinksVisible(true);
        double double7 = piePlot0.getInteriorGap();
        java.awt.Stroke stroke8 = piePlot0.getLabelLinkStroke();
        org.junit.Assert.assertNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08d + "'", double7 == 0.08d);
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
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
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor14 = piePlot12.getLabelDistributor();
        double double15 = piePlot12.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        piePlot12.drawBackgroundImage(graphics2D16, rectangle2D17);
        java.awt.Paint paint20 = piePlot12.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str21 = piePlot12.getNoDataMessage();
        java.awt.Paint paint22 = piePlot12.getLabelOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = piePlot12.getLabelPadding();
        boolean boolean24 = piePlot12.getSimpleLabels();
        piePlot12.setBackgroundAlpha((float) 10);
        piePlot0.setParent((org.jfree.chart.plot.Plot) piePlot12);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.14d + "'", double13 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-5d + "'", double15 == 1.0E-5d);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("", "hi!", "hi!", xYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.Plot plot2 = piePlot0.getRootPlot();
        double double3 = piePlot0.getStartAngle();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(plot2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 90.0d + "'", double3 == 90.0d);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
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
        java.awt.Font font12 = piePlot0.getLabelFont();
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot();
        double double15 = piePlot14.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor16 = piePlot14.getLabelDistributor();
        java.awt.Paint paint17 = piePlot14.getLabelOutlinePaint();
        org.jfree.data.xy.XYDataset xYDataset19 = null;
        org.jfree.chart.JFreeChart jFreeChart23 = org.jfree.chart.ChartFactory.createPolarChart("", xYDataset19, false, false, true);
        piePlot14.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart23);
        org.jfree.chart.plot.PiePlot piePlot25 = new org.jfree.chart.plot.PiePlot();
        double double26 = piePlot25.getMaximumLabelWidth();
        piePlot25.setForegroundAlpha((float) (short) 0);
        org.jfree.chart.plot.PiePlot piePlot29 = new org.jfree.chart.plot.PiePlot();
        double double30 = piePlot29.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor31 = piePlot29.getLabelDistributor();
        double double32 = piePlot29.getMinimumArcAngleToDraw();
        java.awt.Paint paint33 = piePlot29.getBaseSectionOutlinePaint();
        double double34 = piePlot29.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = piePlot29.getSimpleLabelOffset();
        piePlot25.setInsets(rectangleInsets35);
        piePlot14.setInsets(rectangleInsets35, false);
        boolean boolean39 = piePlot14.isCircular();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent40 = null;
        piePlot14.axisChanged(axisChangeEvent40);
        java.awt.Paint paint42 = piePlot14.getLabelShadowPaint();
        piePlot0.setSectionOutlinePaint((java.lang.Comparable) (short) 10, paint42);
        java.lang.String str44 = piePlot0.getNoDataMessage();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(jFreeChart23);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.14d + "'", double26 == 0.14d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.14d + "'", double30 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0E-5d + "'", double32 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 4.0d + "'", double34 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        java.awt.Stroke stroke2 = piePlot0.getBaseSectionOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot0.getLabelPadding();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent4 = null;
        piePlot0.markerChanged(markerChangeEvent4);
        java.awt.Paint paint6 = piePlot0.getLabelOutlinePaint();
        boolean boolean7 = piePlot0.isOutlineVisible();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        piePlot0.setBackgroundImageAlignment((int) (byte) -1);
        double double8 = piePlot0.getInteriorGap();
        java.awt.Paint paint9 = piePlot0.getShadowPaint();
        org.jfree.chart.plot.Plot plot10 = piePlot0.getParent();
        piePlot0.setShadowYOffset((double) 0.5f);
        java.awt.Image image13 = piePlot0.getBackgroundImage();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(plot10);
        org.junit.Assert.assertNull(image13);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        boolean boolean4 = piePlot0.isOutlineVisible();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator5 = piePlot0.getToolTipGenerator();
        double double6 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        piePlot0.markerChanged(markerChangeEvent7);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(pieToolTipGenerator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.14d + "'", double6 == 0.14d);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        float float4 = piePlot0.getForegroundAlpha();
        java.awt.Stroke stroke5 = piePlot0.getBaseSectionOutlineStroke();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = piePlot0.getLabelPadding();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        piePlot0.handleClick((int) '#', (int) (byte) 100, plotRenderingInfo14);
        piePlot0.setIgnoreZeroValues(false);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        piePlot0.drawBackgroundImage(graphics2D18, rectangle2D19);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(font9);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        java.awt.Paint paint6 = piePlot0.getLabelPaint();
        java.awt.Paint paint7 = piePlot0.getLabelPaint();
        java.awt.Paint paint8 = piePlot0.getBackgroundPaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = piePlot0.getDrawingSupplier();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(drawingSupplier9);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("", "hi!", "hi!", windDataset3, false, false, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.lang.String str3 = piePlot0.getPlotType();
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        double double5 = piePlot4.getMaximumLabelWidth();
        java.awt.Paint paint6 = piePlot4.getLabelPaint();
        java.awt.Stroke stroke7 = piePlot4.getLabelOutlineStroke();
        piePlot0.setBaseSectionOutlineStroke(stroke7);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke7);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
            piePlot0.drawBackground(graphics2D21, rectangle2D22);
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
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
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
        java.awt.Font font14 = piePlot0.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(font14);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        piePlot0.setOutlineVisible(false);
        org.jfree.data.general.DatasetGroup datasetGroup7 = piePlot0.getDatasetGroup();
        boolean boolean8 = piePlot0.getIgnoreZeroValues();
        java.awt.Font font9 = piePlot0.getNoDataMessageFont();
        java.awt.Paint paint11 = piePlot0.getSectionPaint((java.lang.Comparable) 10);
        boolean boolean12 = piePlot0.getLabelLinksVisible();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Stroke stroke7 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot0.setLabelLinkStroke(stroke7);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        java.util.Locale locale13 = null;
        org.jfree.chart.JFreeChart jFreeChart14 = org.jfree.chart.ChartFactory.createPieChart3D("Pie Plot", pieDataset10, false, false, locale13);
        piePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart14);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = null;
        piePlot0.setURLGenerator(pieURLGenerator16);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(jFreeChart14);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        boolean boolean5 = piePlot0.isSubplot();
        piePlot0.setCircular(false);
        java.awt.Paint paint9 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot0.setSectionOutlinePaint((java.lang.Comparable) "", paint9);
        java.lang.String str11 = piePlot0.getNoDataMessage();
        double double12 = piePlot0.getInteriorGap();
        java.awt.Stroke stroke13 = piePlot0.getLabelOutlineStroke();
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setInteriorGap((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (10.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.08d + "'", double12 == 0.08d);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        boolean boolean4 = piePlot0.isOutlineVisible();
        java.awt.Paint paint5 = piePlot0.getNoDataMessagePaint();
        java.awt.Stroke stroke6 = piePlot0.getLabelOutlineStroke();
        piePlot0.setLabelGap((double) (short) 0);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(stroke6);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
        java.awt.Stroke stroke18 = piePlot0.getLabelOutlineStroke();
        java.awt.Image image19 = null;
        piePlot0.setBackgroundImage(image19);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.14d + "'", double13 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createCandlestickChart("", "Pie Plot", "Pie Plot", oHLCDataset3, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        piePlot0.setDataset(pieDataset3);
        piePlot0.setPieIndex((int) '4');
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot0.axisChanged(axisChangeEvent7);
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup10 = piePlot9.getDatasetGroup();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator11 = null;
        piePlot9.setToolTipGenerator(pieToolTipGenerator11);
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset16 = null;
        org.jfree.chart.JFreeChart jFreeChart18 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "hi!", "", boxAndWhiskerXYDataset16, false);
        piePlot9.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart18);
        java.awt.Paint paint20 = piePlot9.getBackgroundPaint();
        piePlot0.setLabelOutlinePaint(paint20);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNull(datasetGroup10);
        org.junit.Assert.assertNotNull(jFreeChart18);
        org.junit.Assert.assertNotNull(paint20);
    }
}

