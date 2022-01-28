import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("Pie Plot", "hi!", "Pie Plot", intervalCategoryDataset3, true, false, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        double double5 = piePlot0.getLabelGap();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot0.getLegendLabelURLGenerator();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = null;
        piePlot0.setLegendLabelURLGenerator(pieURLGenerator7);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(pieURLGenerator6);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = piePlot0.getDrawingSupplier();
        java.awt.Stroke stroke6 = piePlot0.getOutlineStroke();
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double8 = piePlot7.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor9 = piePlot7.getLabelDistributor();
        double double10 = piePlot7.getMinimumArcAngleToDraw();
        boolean boolean11 = piePlot7.getIgnoreNullValues();
        org.jfree.data.general.PieDataset pieDataset12 = null;
        piePlot7.setDataset(pieDataset12);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot7.getInsets();
        piePlot0.setSimpleLabelOffset(rectangleInsets14);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(rectangleInsets14);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.jfree.data.general.WaferMapDataset waferMapDataset1 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createWaferMapChart("hi!", waferMapDataset1, plotOrientation2, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        piePlot0.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelToolTipGenerator();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = null;
        piePlot0.setURLGenerator(pieURLGenerator7);
        org.jfree.data.general.PieDataset pieDataset9 = piePlot0.getDataset();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNull(pieDataset9);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
        java.awt.Stroke stroke24 = piePlot0.getLabelLinkStroke();
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
        org.junit.Assert.assertNotNull(stroke24);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        boolean boolean2 = piePlot0.isCircular();
        java.lang.String str3 = piePlot0.getPlotType();
        java.awt.Shape shape4 = piePlot0.getLegendItemShape();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertNotNull(shape4);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createHistogram("hi!", "", "Pie Plot", intervalXYDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("Pie Plot", pieDataset1, pieDataset2, (int) '#', false, false, false, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createRingChart("", pieDataset1, false, false, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setIgnoreNullValues(false);
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        double double5 = piePlot4.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor6 = piePlot4.getLabelDistributor();
        double double7 = piePlot4.getMinimumArcAngleToDraw();
        java.awt.Paint paint8 = piePlot4.getBaseSectionOutlinePaint();
        java.awt.Paint paint9 = piePlot4.getBaseSectionPaint();
        java.awt.Paint paint10 = piePlot4.getShadowPaint();
        piePlot0.setLabelBackgroundPaint(paint10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-5d + "'", double7 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
        org.jfree.chart.LegendItemCollection legendItemCollection36 = piePlot0.getLegendItems();
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
        org.junit.Assert.assertNull(legendItemCollection36);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        double double4 = piePlot0.getInteriorGap();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08d + "'", double4 == 0.08d);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        java.awt.Stroke stroke3 = piePlot0.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        double double5 = piePlot4.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor6 = piePlot4.getLabelDistributor();
        double double7 = piePlot4.getMinimumArcAngleToDraw();
        boolean boolean8 = piePlot4.getIgnoreNullValues();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        piePlot4.setDataset(pieDataset9);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator11 = piePlot4.getURLGenerator();
        java.awt.Stroke stroke12 = piePlot4.getLabelOutlineStroke();
        piePlot0.setOutlineStroke(stroke12);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-5d + "'", double7 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(pieURLGenerator11);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        piePlot0.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelToolTipGenerator();
        boolean boolean7 = piePlot0.getSimpleLabels();
        org.jfree.chart.LegendItemCollection legendItemCollection8 = piePlot0.getLegendItems();
        piePlot0.zoom((double) 1.0f);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(legendItemCollection8);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepAreaChart("", "hi!", "", xYDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        piePlot0.setIgnoreZeroValues(false);
        double double6 = piePlot0.getStartAngle();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 90.0d + "'", double6 == 90.0d);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        boolean boolean4 = piePlot0.isOutlineVisible();
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        double double7 = piePlot5.getExplodePercent((java.lang.Comparable) 0);
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        piePlot8.setDataset(pieDataset9);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator11 = piePlot8.getURLGenerator();
        org.jfree.chart.plot.Plot plot12 = piePlot8.getRootPlot();
        java.awt.Stroke stroke13 = piePlot8.getLabelOutlineStroke();
        java.awt.Shape shape14 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot8.setLegendItemShape(shape14);
        java.awt.Stroke stroke16 = piePlot8.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot17 = new org.jfree.chart.plot.PiePlot();
        double double18 = piePlot17.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor19 = piePlot17.getLabelDistributor();
        double double20 = piePlot17.getMinimumArcAngleToDraw();
        java.awt.Paint paint21 = piePlot17.getBaseSectionOutlinePaint();
        double double22 = piePlot17.getShadowYOffset();
        piePlot17.setBackgroundImageAlignment((int) (byte) -1);
        double double25 = piePlot17.getInteriorGap();
        java.awt.Font font26 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot17.setNoDataMessageFont(font26);
        piePlot8.setLabelFont(font26);
        piePlot5.setLabelFont(font26);
        piePlot0.setLabelFont(font26);
        piePlot0.setCircular(true, false);
        java.awt.Graphics2D graphics2D34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        piePlot0.drawBackgroundImage(graphics2D34, rectangle2D35);
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setInteriorGap((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (-1.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(pieURLGenerator11);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.14d + "'", double18 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E-5d + "'", double20 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.08d + "'", double25 == 0.08d);
        org.junit.Assert.assertNotNull(font26);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo39 = null;
        piePlot20.handleClick((int) (short) 100, (int) (byte) 1, plotRenderingInfo39);
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
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.lang.String str3 = piePlot0.getPlotType();
        org.jfree.data.general.DatasetGroup datasetGroup4 = piePlot0.getDatasetGroup();
        java.lang.String str5 = piePlot0.getNoDataMessage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = null;
        piePlot0.setURLGenerator(pieURLGenerator6);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent8 = null;
        piePlot0.markerChanged(markerChangeEvent8);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("Pie Plot", "hi!", "hi!", windDataset3, true, false, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
        piePlot0.setPieIndex((int) (byte) 0);
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot();
        double double16 = piePlot15.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor17 = piePlot15.getLabelDistributor();
        double double18 = piePlot15.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        piePlot15.drawBackgroundImage(graphics2D19, rectangle2D20);
        java.awt.Paint paint23 = piePlot15.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font24 = piePlot15.getLabelFont();
        piePlot15.setSimpleLabels(false);
        java.awt.Paint paint27 = piePlot15.getLabelPaint();
        org.jfree.chart.plot.PiePlot piePlot28 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset29 = null;
        piePlot28.setDataset(pieDataset29);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator31 = piePlot28.getURLGenerator();
        piePlot28.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator34 = piePlot28.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot35 = new org.jfree.chart.plot.PiePlot();
        double double36 = piePlot35.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor37 = piePlot35.getLabelDistributor();
        double double38 = piePlot35.getMinimumArcAngleToDraw();
        boolean boolean39 = piePlot35.getIgnoreZeroValues();
        boolean boolean40 = piePlot35.isSubplot();
        piePlot35.setCircular(false);
        java.awt.Paint paint44 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot35.setSectionOutlinePaint((java.lang.Comparable) "", paint44);
        piePlot28.setNoDataMessagePaint(paint44);
        piePlot15.setLabelBackgroundPaint(paint44);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor48 = piePlot15.getLabelDistributor();
        piePlot15.setExplodePercent((java.lang.Comparable) 0.4d, (double) (short) 1);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent52 = null;
        piePlot15.datasetChanged(datasetChangeEvent52);
        java.awt.Paint paint54 = piePlot15.getBackgroundPaint();
        org.jfree.chart.plot.PiePlot piePlot55 = new org.jfree.chart.plot.PiePlot();
        double double56 = piePlot55.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor57 = piePlot55.getLabelDistributor();
        java.lang.String str58 = piePlot55.getPlotType();
        org.jfree.data.general.DatasetGroup datasetGroup59 = piePlot55.getDatasetGroup();
        java.awt.Shape shape60 = piePlot55.getLegendItemShape();
        boolean boolean61 = piePlot55.isOutlineVisible();
        piePlot55.setMaximumLabelWidth((double) (byte) 100);
        org.jfree.chart.util.RectangleInsets rectangleInsets64 = piePlot55.getLabelPadding();
        piePlot15.setInsets(rectangleInsets64, false);
        piePlot0.setSimpleLabelOffset(rectangleInsets64);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14d + "'", double7 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-5d + "'", double9 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.14d + "'", double16 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-5d + "'", double18 == 1.0E-5d);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNull(pieURLGenerator31);
        org.junit.Assert.assertNull(pieSectionLabelGenerator34);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.14d + "'", double36 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0E-5d + "'", double38 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor48);
        org.junit.Assert.assertNotNull(paint54);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.14d + "'", double56 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Pie Plot" + "'", str58, "Pie Plot");
        org.junit.Assert.assertNull(datasetGroup59);
        org.junit.Assert.assertNotNull(shape60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(rectangleInsets64);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        piePlot0.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelToolTipGenerator();
        boolean boolean7 = piePlot0.getSimpleLabels();
        piePlot0.setStartAngle((double) (short) -1);
        piePlot0.setCircular(false, true);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
        org.jfree.chart.plot.Plot plot22 = piePlot0.getParent();
        java.awt.Paint paint24 = piePlot0.getSectionPaint((java.lang.Comparable) false);
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
        org.junit.Assert.assertNotNull(plot22);
        org.junit.Assert.assertNull(paint24);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        org.jfree.chart.plot.PiePlot piePlot3 = new org.jfree.chart.plot.PiePlot();
        double double4 = piePlot3.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor5 = piePlot3.getLabelDistributor();
        double double6 = piePlot3.getMinimumArcAngleToDraw();
        java.awt.Paint paint7 = piePlot3.getBaseSectionOutlinePaint();
        double double8 = piePlot3.getShadowYOffset();
        piePlot3.setBackgroundImageAlignment((int) (byte) -1);
        piePlot3.setBackgroundImageAlpha((float) (short) 1);
        java.awt.Paint paint14 = piePlot3.getSectionOutlinePaint((java.lang.Comparable) 10.0d);
        piePlot3.setForegroundAlpha((float) 'a');
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        piePlot3.drawBackgroundImage(graphics2D17, rectangle2D18);
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
        piePlot3.setSectionPaint((java.lang.Comparable) (short) -1, paint32);
        piePlot0.setSectionOutlinePaint((java.lang.Comparable) (byte) 10, paint32);
        java.awt.Stroke stroke35 = piePlot0.getLabelOutlineStroke();
        java.awt.Paint paint36 = piePlot0.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.14d + "'", double4 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-5d + "'", double6 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.14d + "'", double22 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0E-5d + "'", double24 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.0d + "'", double26 == 4.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.08d + "'", double29 == 0.08d);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(paint36);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
        org.jfree.data.general.PieDataset pieDataset13 = null;
        piePlot12.setDataset(pieDataset13);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator15 = piePlot12.getURLGenerator();
        float float16 = piePlot12.getForegroundAlpha();
        java.awt.Stroke stroke17 = piePlot12.getBaseSectionOutlineStroke();
        java.awt.Stroke stroke18 = piePlot12.getLabelLinkStroke();
        piePlot12.setNoDataMessage("Pie Plot");
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent21 = null;
        piePlot12.markerChanged(markerChangeEvent21);
        java.awt.Paint paint23 = piePlot12.getLabelPaint();
        piePlot0.setLabelBackgroundPaint(paint23);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator25 = null;
        piePlot0.setToolTipGenerator(pieToolTipGenerator25);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.08d + "'", double11 == 0.08d);
        org.junit.Assert.assertNull(pieURLGenerator15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreNullValues();
        boolean boolean5 = piePlot0.getIgnoreNullValues();
        org.jfree.chart.plot.Plot plot6 = piePlot0.getParent();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(plot6);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
        java.awt.Graphics2D graphics2D22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawBackground(graphics2D22, rectangle2D23);
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
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator21);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("", "", "Pie Plot", tableXYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        double double5 = piePlot0.getLabelGap();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot0.getLegendLabelURLGenerator();
        piePlot0.setNoDataMessage("Pie Plot");
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot();
        double double10 = piePlot9.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup11 = piePlot9.getDatasetGroup();
        piePlot9.setOutlineVisible(true);
        boolean boolean14 = piePlot9.getSectionOutlinesVisible();
        java.awt.Stroke stroke15 = piePlot9.getLabelOutlineStroke();
        piePlot0.setLabelLinkStroke(stroke15);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart3D("", "Pie Plot", "", categoryDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        org.jfree.chart.plot.Plot plot22 = piePlot0.getParent();
        double double23 = piePlot0.getMinimumArcAngleToDraw();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent24 = null;
        piePlot0.markerChanged(markerChangeEvent24);
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
        org.junit.Assert.assertNotNull(plot22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0E-5d + "'", double23 == 1.0E-5d);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
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
        java.awt.Stroke stroke19 = piePlot0.getSectionOutlineStroke((java.lang.Comparable) "Pie Plot");
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator20 = null;
        piePlot0.setURLGenerator(pieURLGenerator20);
        piePlot0.setMaximumLabelWidth(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(pieURLGenerator17);
        org.junit.Assert.assertNull(stroke19);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        float float7 = piePlot0.getBackgroundAlpha();
        double double8 = piePlot0.getShadowYOffset();
        boolean boolean9 = piePlot0.getSimpleLabels();
        boolean boolean10 = piePlot0.getLabelLinksVisible();
        java.lang.Object obj11 = piePlot0.clone();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 4.0d + "'", double8 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor5 = piePlot0.getLabelDistributor();
        boolean boolean6 = piePlot0.isSubplot();
        piePlot0.setPieIndex(0);
        piePlot0.setExplodePercent((java.lang.Comparable) 0.4d, 1.0E-5d);
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset13 = null;
        piePlot12.setDataset(pieDataset13);
        int int15 = piePlot12.getPieIndex();
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot();
        double double17 = piePlot16.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor18 = piePlot16.getLabelDistributor();
        double double19 = piePlot16.getMinimumArcAngleToDraw();
        java.awt.Paint paint20 = piePlot16.getBaseSectionOutlinePaint();
        double double21 = piePlot16.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = piePlot16.getSimpleLabelOffset();
        piePlot12.setInsets(rectangleInsets22, true);
        piePlot0.setSimpleLabelOffset(rectangleInsets22);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.14d + "'", double17 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0E-5d + "'", double19 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.0d + "'", double21 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets22);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = piePlot0.getDrawingSupplier();
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        double double7 = piePlot6.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor8 = piePlot6.getLabelDistributor();
        double double9 = piePlot6.getMinimumArcAngleToDraw();
        boolean boolean10 = piePlot6.getIgnoreZeroValues();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator11 = piePlot6.getLabelGenerator();
        piePlot0.setLegendLabelGenerator(pieSectionLabelGenerator11);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        piePlot0.setDataset(pieDataset13);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14d + "'", double7 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-5d + "'", double9 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator11);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        double double30 = piePlot0.getInteriorGap();
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
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.08d + "'", double30 == 0.08d);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        piePlot0.setBackgroundAlpha((float) (byte) 0);
        piePlot0.setStartAngle(100.0d);
        java.awt.Paint paint7 = piePlot0.getShadowPaint();
        java.awt.Paint paint8 = piePlot0.getOutlinePaint();
        piePlot0.setLabelLinksVisible(true);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        java.awt.Font font22 = piePlot0.getNoDataMessageFont();
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
        org.junit.Assert.assertNotNull(font22);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        piePlot0.setBackgroundImageAlignment((int) (byte) -1);
        float float8 = piePlot0.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("hi!", "hi!", "", xYDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepAreaChart("Pie Plot", "", "Pie Plot", xYDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint3 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot0.setLabelShadowPaint(paint3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        piePlot0.handleClick((int) ' ', (int) (short) -1, plotRenderingInfo7);
        float float9 = piePlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.util.TableOrder tableOrder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createMultiplePieChart("hi!", categoryDataset1, tableOrder2, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        piePlot0.setBackgroundImageAlignment((int) 'a');
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot0.getLabelDistributor();
        piePlot0.setBackgroundImageAlignment(100);
        org.junit.Assert.assertNull(datasetGroup1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
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
        org.jfree.chart.plot.Plot plot10 = piePlot0.getRootPlot();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(plot10);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        boolean boolean1 = piePlot0.getSimpleLabels();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator2 = piePlot0.getURLGenerator();
        piePlot0.setSectionOutlinesVisible(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(pieURLGenerator2);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Stroke stroke3 = piePlot0.getOutlineStroke();
        piePlot0.setPieIndex(100);
        int int6 = piePlot0.getBackgroundImageAlignment();
        java.awt.Stroke stroke7 = piePlot0.getLabelOutlineStroke();
        java.awt.Paint paint8 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot0.setBackgroundPaint(paint8);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        piePlot0.setSectionOutlinesVisible(true);
        boolean boolean6 = piePlot0.isSubplot();
        java.awt.Paint paint7 = piePlot0.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setMinimumArcAngleToDraw((double) '4');
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        double double5 = piePlot4.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor6 = piePlot4.getLabelDistributor();
        java.awt.Paint paint7 = piePlot4.getLabelOutlinePaint();
        piePlot4.setStartAngle((double) (byte) 10);
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
        piePlot11.setMinimumArcAngleToDraw((double) 100);
        boolean boolean25 = piePlot11.isOutlineVisible();
        java.awt.Paint paint26 = piePlot11.getBaseSectionOutlinePaint();
        piePlot4.setSectionOutlinePaint((java.lang.Comparable) 4.0d, paint26);
        piePlot0.setSectionPaint((java.lang.Comparable) 0.14d, paint26);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
        piePlot0.setStartAngle((double) (short) 100);
        java.awt.Font font12 = piePlot0.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(font12);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        piePlot0.setSectionOutlinesVisible(true);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = null;
        piePlot0.setURLGenerator(pieURLGenerator6);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        piePlot0.handleClick((int) (byte) 10, (int) (short) -1, plotRenderingInfo10);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawOutline(graphics2D12, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator25 = piePlot0.getLegendLabelURLGenerator();
        piePlot0.setLabelLinksVisible(false);
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
        org.junit.Assert.assertNull(pieURLGenerator25);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot0.getInsets();
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot();
        double double17 = piePlot16.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor18 = piePlot16.getLabelDistributor();
        double double19 = piePlot16.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        piePlot16.drawBackgroundImage(graphics2D20, rectangle2D21);
        java.awt.Paint paint24 = piePlot16.getSectionPaint((java.lang.Comparable) false);
        piePlot16.setShadowYOffset((double) (short) 1);
        java.awt.Stroke stroke27 = piePlot16.getLabelLinkStroke();
        java.awt.Stroke stroke28 = piePlot16.getLabelLinkStroke();
        org.jfree.data.xy.WindDataset windDataset32 = null;
        org.jfree.chart.JFreeChart jFreeChart36 = org.jfree.chart.ChartFactory.createWindPlot("", "", "", windDataset32, false, true, false);
        piePlot16.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart36);
        boolean boolean38 = piePlot0.equals((java.lang.Object) jFreeChart36);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.14d + "'", double17 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0E-5d + "'", double19 == 1.0E-5d);
        org.junit.Assert.assertNull(paint24);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(jFreeChart36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        org.jfree.chart.plot.Plot plot2 = piePlot0.getParent();
        boolean boolean3 = piePlot0.isCircular();
        piePlot0.setSectionOutlinesVisible(true);
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot();
        double double7 = piePlot6.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor8 = piePlot6.getLabelDistributor();
        double double9 = piePlot6.getMinimumArcAngleToDraw();
        boolean boolean10 = piePlot6.getIgnoreNullValues();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        piePlot6.setDataset(pieDataset11);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = piePlot6.getInsets();
        java.awt.Paint paint15 = piePlot6.getSectionOutlinePaint((java.lang.Comparable) (byte) 10);
        java.awt.Font font16 = piePlot6.getLabelFont();
        piePlot0.setLabelFont(font16);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14d + "'", double7 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-5d + "'", double9 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(font16);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint7 = piePlot0.getLabelOutlinePaint();
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        double double9 = piePlot8.getMaximumLabelWidth();
        java.awt.Shape shape10 = piePlot8.getLegendItemShape();
        piePlot0.setLegendItemShape(shape10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14d + "'", double9 == 0.14d);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        piePlot0.setCircular(true);
        int int8 = piePlot0.getPieIndex();
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
        int int22 = piePlot9.getPieIndex();
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot();
        double double24 = piePlot23.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor25 = piePlot23.getLabelDistributor();
        java.lang.String str26 = piePlot23.getPlotType();
        org.jfree.data.general.DatasetGroup datasetGroup27 = piePlot23.getDatasetGroup();
        java.awt.Paint paint28 = piePlot23.getOutlinePaint();
        java.awt.Stroke stroke29 = piePlot23.getBaseSectionOutlineStroke();
        piePlot9.setLabelLinkStroke(stroke29);
        piePlot0.setLabelOutlineStroke(stroke29);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.14d + "'", double24 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Pie Plot" + "'", str26, "Pie Plot");
        org.junit.Assert.assertNull(datasetGroup27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(stroke29);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
        float float3 = piePlot0.getForegroundAlpha();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        piePlot0.setSectionOutlinesVisible(false);
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
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor19 = piePlot7.getLabelDistributor();
        piePlot0.setLabelDistributor(abstractPieLabelDistributor19);
        double double21 = piePlot0.getLabelGap();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.025d + "'", double21 == 0.025d);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", pieDataset1, pieDataset2, (int) '4', false, false, false, locale7, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
        org.jfree.chart.plot.Plot plot12 = piePlot0.getParent();
        java.awt.Paint paint13 = piePlot0.getLabelPaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(plot12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("", "Pie Plot", "hi!", categoryDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        double double18 = piePlot0.getInteriorGap();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.08d + "'", double18 == 0.08d);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator23 = null;
        piePlot0.setURLGenerator(pieURLGenerator23);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        java.awt.Paint paint19 = piePlot0.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        java.awt.Paint paint21 = null;
        piePlot0.setLabelShadowPaint(paint21);
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
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.jfree.data.statistics.BoxAndWhiskerCategoryDataset boxAndWhiskerCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("hi!", "hi!", "Pie Plot", boxAndWhiskerCategoryDataset3, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        piePlot0.setNoDataMessage("");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
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
        java.awt.Image image14 = piePlot0.getBackgroundImage();
        java.awt.Stroke stroke15 = piePlot0.getBaseSectionOutlineStroke();
        piePlot0.setLabelGap((double) 1);
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset21 = null;
        org.jfree.chart.JFreeChart jFreeChart25 = org.jfree.chart.ChartFactory.createGanttChart("Pie Plot", "Pie Plot", "", intervalCategoryDataset21, false, false, true);
        piePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart25);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(image14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(jFreeChart25);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
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
        boolean boolean39 = piePlot0.getSectionOutlinesVisible();
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
        java.awt.Paint paint51 = piePlot40.getLabelShadowPaint();
        java.awt.Font font52 = piePlot40.getLabelFont();
        org.jfree.chart.plot.PiePlot piePlot53 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset54 = null;
        piePlot53.setDataset(pieDataset54);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator56 = piePlot53.getURLGenerator();
        org.jfree.chart.plot.Plot plot57 = piePlot53.getRootPlot();
        org.jfree.chart.plot.PiePlot piePlot59 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset60 = null;
        piePlot59.setDataset(pieDataset60);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator62 = piePlot59.getURLGenerator();
        piePlot59.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator65 = piePlot59.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot66 = new org.jfree.chart.plot.PiePlot();
        double double67 = piePlot66.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor68 = piePlot66.getLabelDistributor();
        double double69 = piePlot66.getMinimumArcAngleToDraw();
        boolean boolean70 = piePlot66.getIgnoreZeroValues();
        boolean boolean71 = piePlot66.isSubplot();
        piePlot66.setCircular(false);
        java.awt.Paint paint75 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot66.setSectionOutlinePaint((java.lang.Comparable) "", paint75);
        piePlot59.setNoDataMessagePaint(paint75);
        piePlot53.setSectionPaint((java.lang.Comparable) 52.0d, paint75);
        piePlot40.setLabelPaint(paint75);
        piePlot0.setLabelShadowPaint(paint75);
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.14d + "'", double41 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0E-5d + "'", double43 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 4.0d + "'", double45 == 4.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.08d + "'", double48 == 0.08d);
        org.junit.Assert.assertNotNull(font49);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(font52);
        org.junit.Assert.assertNull(pieURLGenerator56);
        org.junit.Assert.assertNotNull(plot57);
        org.junit.Assert.assertNull(pieURLGenerator62);
        org.junit.Assert.assertNull(pieSectionLabelGenerator65);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.14d + "'", double67 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor68);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 1.0E-5d + "'", double69 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(paint75);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator31 = piePlot14.getToolTipGenerator();
        piePlot14.setSimpleLabels(false);
        org.jfree.chart.plot.PiePlot piePlot35 = new org.jfree.chart.plot.PiePlot();
        double double36 = piePlot35.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor37 = piePlot35.getLabelDistributor();
        double double38 = piePlot35.getMinimumArcAngleToDraw();
        java.awt.Paint paint39 = piePlot35.getBaseSectionOutlinePaint();
        double double40 = piePlot35.getShadowYOffset();
        java.awt.Stroke stroke41 = piePlot35.getOutlineStroke();
        piePlot14.setSectionOutlineStroke((java.lang.Comparable) (byte) 100, stroke41);
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = piePlot14.getInsets();
        piePlot14.setLabelLinksVisible(true);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator46 = piePlot14.getLegendLabelGenerator();
        piePlot0.setLabelGenerator(pieSectionLabelGenerator46);
        java.awt.Paint paint48 = piePlot0.getNoDataMessagePaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.025d + "'", double13 == 0.025d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-5d + "'", double17 == 1.0E-5d);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNull(pieToolTipGenerator31);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.14d + "'", double36 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0E-5d + "'", double38 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 4.0d + "'", double40 == 4.0d);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(rectangleInsets43);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator46);
        org.junit.Assert.assertNotNull(paint48);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        double double5 = piePlot4.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup6 = piePlot4.getDatasetGroup();
        java.awt.Paint paint7 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot4.setNoDataMessagePaint(paint7);
        double double10 = piePlot4.getExplodePercent((java.lang.Comparable) (-1));
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double13 = piePlot11.getExplodePercent((java.lang.Comparable) 0);
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset15 = null;
        piePlot14.setDataset(pieDataset15);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator17 = piePlot14.getURLGenerator();
        org.jfree.chart.plot.Plot plot18 = piePlot14.getRootPlot();
        java.awt.Stroke stroke19 = piePlot14.getLabelOutlineStroke();
        java.awt.Shape shape20 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot14.setLegendItemShape(shape20);
        java.awt.Stroke stroke22 = piePlot14.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot23 = new org.jfree.chart.plot.PiePlot();
        double double24 = piePlot23.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor25 = piePlot23.getLabelDistributor();
        double double26 = piePlot23.getMinimumArcAngleToDraw();
        java.awt.Paint paint27 = piePlot23.getBaseSectionOutlinePaint();
        double double28 = piePlot23.getShadowYOffset();
        piePlot23.setBackgroundImageAlignment((int) (byte) -1);
        double double31 = piePlot23.getInteriorGap();
        java.awt.Font font32 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot23.setNoDataMessageFont(font32);
        piePlot14.setLabelFont(font32);
        piePlot11.setLabelFont(font32);
        piePlot4.setNoDataMessageFont(font32);
        java.awt.Stroke stroke38 = piePlot4.getSectionOutlineStroke((java.lang.Comparable) 52.0d);
        boolean boolean39 = piePlot4.getSectionOutlinesVisible();
        java.awt.Font font40 = piePlot4.getNoDataMessageFont();
        piePlot0.setNoDataMessageFont(font40);
        java.awt.Paint paint42 = null;
        piePlot0.setOutlinePaint(paint42);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(pieURLGenerator17);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.14d + "'", double24 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0E-5d + "'", double26 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.0d + "'", double28 == 4.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.08d + "'", double31 == 0.08d);
        org.junit.Assert.assertNotNull(font32);
        org.junit.Assert.assertNull(stroke38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(font40);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = null;
        piePlot0.setLabelGenerator(pieSectionLabelGenerator5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot0.getURLGenerator();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNull(pieURLGenerator7);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        java.lang.Object obj36 = piePlot0.clone();
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
        org.junit.Assert.assertNotNull(obj36);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("Pie Plot", "", false, "Pie Plot", intervalXYDataset4, plotOrientation5, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot0.notifyListeners(plotChangeEvent3);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = piePlot0.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("Pie Plot", "", "hi!", xYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepAreaChart("Pie Plot", "", "Pie Plot", xYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        double double4 = piePlot0.getShadowXOffset();
        piePlot0.setIgnoreNullValues(false);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = piePlot0.getToolTipGenerator();
        int int8 = piePlot0.getPieIndex();
        java.awt.Paint paint9 = piePlot0.getLabelShadowPaint();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
        org.junit.Assert.assertNull(pieToolTipGenerator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        boolean boolean9 = piePlot0.isCircular();
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
        piePlot10.setIgnoreZeroValues(false);
        piePlot10.setMinimumArcAngleToDraw((double) (-1.0f));
        piePlot0.setParent((org.jfree.chart.plot.Plot) piePlot10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.14d + "'", double11 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-5d + "'", double13 == 1.0E-5d);
        org.junit.Assert.assertNull(paint18);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        java.awt.Paint paint4 = piePlot0.getShadowPaint();
        int int5 = piePlot0.getPieIndex();
        boolean boolean6 = piePlot0.isSubplot();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setMinimumArcAngleToDraw((double) '4');
        piePlot0.setStartAngle((double) 1L);
        piePlot0.setSectionOutlinesVisible(true);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent7 = null;
        piePlot0.markerChanged(markerChangeEvent7);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator9 = piePlot0.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        piePlot10.setDataset(pieDataset11);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = piePlot10.getURLGenerator();
        org.jfree.chart.plot.Plot plot14 = piePlot10.getRootPlot();
        java.awt.Stroke stroke15 = piePlot10.getLabelOutlineStroke();
        java.awt.Shape shape16 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot10.setLegendItemShape(shape16);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator18 = piePlot10.getLegendLabelURLGenerator();
        java.awt.Paint paint19 = piePlot10.getShadowPaint();
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset21 = null;
        piePlot20.setDataset(pieDataset21);
        int int23 = piePlot20.getPieIndex();
        double double24 = piePlot20.getShadowXOffset();
        java.awt.Stroke stroke25 = piePlot20.getOutlineStroke();
        piePlot10.setLabelOutlineStroke(stroke25);
        piePlot0.setLabelOutlineStroke(stroke25);
        org.junit.Assert.assertNull(pieSectionLabelGenerator9);
        org.junit.Assert.assertNull(pieURLGenerator13);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNull(pieURLGenerator18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 4.0d + "'", double24 == 4.0d);
        org.junit.Assert.assertNotNull(stroke25);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot piePlot1 = new org.jfree.chart.plot.PiePlot(pieDataset0);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent2 = null;
        piePlot1.axisChanged(axisChangeEvent2);
        java.awt.Stroke stroke4 = piePlot1.getLabelOutlineStroke();
        java.awt.Image image5 = piePlot1.getBackgroundImage();
        piePlot1.setBackgroundImageAlpha((float) (short) 1);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(image5);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
        piePlot0.setMaximumLabelWidth((double) (byte) -1);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        double double6 = piePlot0.getMinimumArcAngleToDraw();
        float float7 = piePlot0.getBackgroundImageAlpha();
        org.jfree.data.xy.OHLCDataset oHLCDataset11 = null;
        org.jfree.chart.JFreeChart jFreeChart13 = org.jfree.chart.ChartFactory.createCandlestickChart("Pie Plot", "hi!", "hi!", oHLCDataset11, false);
        piePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart13);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-5d + "'", double6 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(jFreeChart13);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
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
        double double28 = piePlot0.getShadowXOffset();
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
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.0d + "'", double28 == 4.0d);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        piePlot0.setBackgroundImageAlignment((int) (byte) -1);
        piePlot0.setBackgroundImageAlpha((float) (short) 1);
        java.awt.Paint paint11 = piePlot0.getSectionOutlinePaint((java.lang.Comparable) 10.0d);
        org.jfree.data.xy.OHLCDataset oHLCDataset15 = null;
        org.jfree.chart.JFreeChart jFreeChart17 = org.jfree.chart.ChartFactory.createHighLowChart("hi!", "Pie Plot", "Pie Plot", oHLCDataset15, true);
        piePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart17);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(jFreeChart17);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("", "", "", xYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        java.awt.Paint paint16 = piePlot0.getBackgroundPaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot25 = piePlot24.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor26 = piePlot24.getLabelDistributor();
        java.awt.Paint paint27 = piePlot24.getNoDataMessagePaint();
        piePlot0.setLabelPaint(paint27);
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
        org.junit.Assert.assertNull(plot25);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor26);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent3 = null;
        piePlot0.notifyListeners(plotChangeEvent3);
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset6 = null;
        piePlot5.setDataset(pieDataset6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot5.getURLGenerator();
        piePlot5.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator11 = piePlot5.getLegendLabelToolTipGenerator();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = null;
        piePlot5.setURLGenerator(pieURLGenerator12);
        boolean boolean14 = piePlot5.getSimpleLabels();
        java.awt.Shape shape15 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot5.setLegendItemShape(shape15);
        piePlot0.setLegendItemShape(shape15);
        java.awt.Stroke stroke18 = piePlot0.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNull(pieSectionLabelGenerator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
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
        java.awt.Stroke stroke12 = piePlot0.getOutlineStroke();
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        double double14 = piePlot13.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor15 = piePlot13.getLabelDistributor();
        double double16 = piePlot13.getMinimumArcAngleToDraw();
        boolean boolean17 = piePlot13.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot18 = piePlot13.getRootPlot();
        piePlot13.setOutlineVisible(false);
        org.jfree.chart.plot.PiePlot piePlot21 = new org.jfree.chart.plot.PiePlot();
        double double22 = piePlot21.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor23 = piePlot21.getLabelDistributor();
        double double24 = piePlot21.getMinimumArcAngleToDraw();
        java.awt.Paint paint25 = piePlot21.getBaseSectionOutlinePaint();
        double double26 = piePlot21.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = piePlot21.getSimpleLabelOffset();
        java.awt.Stroke stroke28 = piePlot21.getLabelLinkStroke();
        piePlot13.setLabelOutlineStroke(stroke28);
        piePlot0.setOutlineStroke(stroke28);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.14d + "'", double14 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-5d + "'", double16 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.14d + "'", double22 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0E-5d + "'", double24 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 4.0d + "'", double26 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(stroke28);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart3D("hi!", pieDataset1, true, false, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
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
        piePlot0.setLabelGap((double) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = piePlot0.getLabelPadding();
        java.awt.Shape shape33 = piePlot0.getLegendItemShape();
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
        org.junit.Assert.assertNotNull(rectangleInsets32);
        org.junit.Assert.assertNotNull(shape33);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        piePlot0.setOutlineVisible(false);
        org.jfree.data.general.DatasetGroup datasetGroup7 = piePlot0.getDatasetGroup();
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        piePlot8.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint11 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot8.setLabelShadowPaint(paint11);
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        piePlot13.setDataset(pieDataset14);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = piePlot13.getURLGenerator();
        org.jfree.chart.plot.Plot plot17 = piePlot13.getRootPlot();
        java.awt.Stroke stroke18 = piePlot13.getLabelOutlineStroke();
        java.awt.Shape shape19 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot13.setLegendItemShape(shape19);
        boolean boolean21 = piePlot8.equals((java.lang.Object) piePlot13);
        double double22 = piePlot8.getStartAngle();
        double double23 = piePlot8.getMinimumArcAngleToDraw();
        piePlot0.setParent((org.jfree.chart.plot.Plot) piePlot8);
        org.jfree.data.general.DatasetGroup datasetGroup25 = piePlot0.getDatasetGroup();
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
        java.awt.Paint paint40 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot27.setLabelOutlinePaint(paint40);
        piePlot27.setStartAngle((double) 100L);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator44 = piePlot27.getToolTipGenerator();
        piePlot27.setSimpleLabels(false);
        org.jfree.chart.plot.PiePlot piePlot48 = new org.jfree.chart.plot.PiePlot();
        double double49 = piePlot48.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor50 = piePlot48.getLabelDistributor();
        double double51 = piePlot48.getMinimumArcAngleToDraw();
        java.awt.Paint paint52 = piePlot48.getBaseSectionOutlinePaint();
        double double53 = piePlot48.getShadowYOffset();
        java.awt.Stroke stroke54 = piePlot48.getOutlineStroke();
        piePlot27.setSectionOutlineStroke((java.lang.Comparable) (byte) 100, stroke54);
        org.jfree.chart.util.RectangleInsets rectangleInsets56 = piePlot27.getInsets();
        java.awt.Paint paint57 = piePlot27.getOutlinePaint();
        piePlot0.setSectionOutlinePaint((java.lang.Comparable) 0.0d, paint57);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(pieURLGenerator16);
        org.junit.Assert.assertNotNull(plot17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 90.0d + "'", double22 == 90.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 52.0d + "'", double23 == 52.0d);
        org.junit.Assert.assertNull(datasetGroup25);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.14d + "'", double28 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0E-5d + "'", double30 == 1.0E-5d);
        org.junit.Assert.assertNull(paint35);
        org.junit.Assert.assertNotNull(font36);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNull(pieToolTipGenerator44);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.14d + "'", double49 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0E-5d + "'", double51 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 4.0d + "'", double53 == 4.0d);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertNotNull(rectangleInsets56);
        org.junit.Assert.assertNotNull(paint57);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        java.awt.Paint paint64 = piePlot0.getBaseSectionOutlinePaint();
        boolean boolean65 = piePlot0.getLabelLinksVisible();
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
        org.junit.Assert.assertNotNull(paint64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
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
        java.awt.Paint paint43 = piePlot0.getBackgroundPaint();
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
        org.junit.Assert.assertNotNull(paint43);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double2 = piePlot0.getExplodePercent((java.lang.Comparable) 0);
        piePlot0.setIgnoreZeroValues(false);
        piePlot0.zoom((double) 1L);
        piePlot0.setLabelLinkMargin((double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        piePlot0.setCircular(true);
        piePlot0.setForegroundAlpha((float) (short) 100);
        boolean boolean10 = piePlot0.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        java.awt.Paint paint40 = piePlot0.getSectionOutlinePaint((java.lang.Comparable) (short) 100);
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
        org.junit.Assert.assertNull(paint40);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        org.jfree.data.general.DatasetGroup datasetGroup12 = piePlot0.getDatasetGroup();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertNull(datasetGroup12);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        piePlot0.setMaximumLabelWidth(0.08d);
        java.awt.Paint paint11 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreZeroValues(false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        piePlot0.setOutlineVisible(false);
        piePlot0.setSectionOutlinesVisible(true);
        int int9 = piePlot0.getBackgroundImageAlignment();
        java.awt.Paint paint10 = piePlot0.getLabelBackgroundPaint();
        piePlot0.setNoDataMessage("");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
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
        double double20 = piePlot0.getLabelGap();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(pieToolTipGenerator17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.025d + "'", double20 == 0.025d);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
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
        piePlot0.setIgnoreZeroValues(true);
        float float25 = piePlot0.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(paint18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 1.0f + "'", float25 == 1.0f);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        java.awt.Paint paint3 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setNoDataMessagePaint(paint3);
        piePlot0.setCircular(true, false);
        java.awt.Font font8 = piePlot0.getLabelFont();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(font8);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.util.TableOrder tableOrder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createMultiplePieChart("hi!", categoryDataset1, tableOrder2, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        org.jfree.chart.plot.Plot plot12 = piePlot0.getParent();
        // The following exception was thrown during execution in test generation
        try {
            plot12.zoom(0.08d);
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
        org.junit.Assert.assertNull(plot12);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYAreaChart("Pie Plot", "", "Pie Plot", xYDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
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
        double double16 = piePlot0.getMinimumArcAngleToDraw();
        org.jfree.chart.plot.Plot plot17 = piePlot0.getParent();
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-5d + "'", double16 == 1.0E-5d);
        org.junit.Assert.assertNull(plot17);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
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
        double double12 = piePlot11.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup13 = piePlot11.getDatasetGroup();
        java.awt.Paint paint14 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot11.setNoDataMessagePaint(paint14);
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset17 = null;
        piePlot16.setDataset(pieDataset17);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator19 = piePlot16.getURLGenerator();
        org.jfree.chart.plot.Plot plot20 = piePlot16.getRootPlot();
        java.awt.Stroke stroke21 = piePlot16.getLabelOutlineStroke();
        piePlot11.setLabelLinkStroke(stroke21);
        org.jfree.chart.util.Rotation rotation23 = piePlot11.getDirection();
        int int24 = piePlot11.getPieIndex();
        piePlot11.setIgnoreZeroValues(false);
        piePlot11.setCircular(true);
        piePlot11.setLabelLinkMargin((double) (byte) 100);
        java.awt.Paint paint31 = piePlot11.getLabelLinkPaint();
        piePlot0.setLabelLinkPaint(paint31);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-5d + "'", double6 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.025d + "'", double9 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(pieURLGenerator19);
        org.junit.Assert.assertNotNull(plot20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(rotation23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
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
        piePlot0.setShadowXOffset(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNull(stroke12);
        org.junit.Assert.assertNull(paint14);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        double double6 = piePlot0.getMinimumArcAngleToDraw();
        piePlot0.setNoDataMessage("Pie Plot");
        double double9 = piePlot0.getLabelGap();
        float float10 = piePlot0.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-5d + "'", double6 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.025d + "'", double9 == 0.025d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("", "hi!", false, "Pie Plot", intervalXYDataset4, plotOrientation5, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart3D("", pieDataset1, false, true, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }
}

