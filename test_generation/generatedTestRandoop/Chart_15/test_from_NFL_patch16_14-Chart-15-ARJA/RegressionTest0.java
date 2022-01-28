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
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createRingChart("", pieDataset1, true, false, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createHighLowChart("", "", "hi!", oHLCDataset3, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.awt.Stroke stroke0 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_OUTLINE_STROKE;
        org.junit.Assert.assertNotNull(stroke0);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.jfree.data.general.WaferMapDataset waferMapDataset1 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createWaferMapChart("", waferMapDataset1, plotOrientation2, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        float float0 = org.jfree.chart.plot.Plot.DEFAULT_FOREGROUND_ALPHA;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("hi!", "hi!", "", xYDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "", "", boxAndWhiskerXYDataset3, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        double double0 = org.jfree.chart.plot.PiePlot.MAX_INTERIOR_GAP;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.4d + "'", double0 == 0.4d);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("", "hi!", true, "hi!", intervalXYDataset4, plotOrientation5, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("", "", "hi!", xYDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("hi!", "", "hi!", xYDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
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
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jfree.data.general.WaferMapDataset waferMapDataset1 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createWaferMapChart("hi!", waferMapDataset1, plotOrientation2, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("", "", "", tableXYDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        piePlot0.setOutlineVisible(true);
        java.awt.Font font4 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setLabelFont(font4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'font' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setInsets(rectangleInsets2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        int int0 = org.jfree.chart.plot.Plot.MINIMUM_WIDTH_TO_DRAW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Graphics2D graphics2D3 = null;
        java.awt.geom.Rectangle2D rectangle2D4 = null;
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        double double6 = piePlot5.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor7 = piePlot5.getLabelDistributor();
        double double8 = piePlot5.getMinimumArcAngleToDraw();
        boolean boolean9 = piePlot5.getIgnoreZeroValues();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState12 = piePlot0.initialise(graphics2D3, rectangle2D4, piePlot5, (java.lang.Integer) 100, plotRenderingInfo11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.14d + "'", double6 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.util.RectangleInsets rectangleInsets2 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setSimpleLabelOffset(rectangleInsets2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'offset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot1);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
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
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createRingChart("", pieDataset1, false, false, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("", "hi!", "", windDataset3, true, false, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("Pie Plot", "", "", windDataset3, true, false, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setInsets(rectangleInsets5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYAreaChart("Pie Plot", "", "hi!", xYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("hi!", "hi!", "Pie Plot", xYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepAreaChart("", "Pie Plot", "", xYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", pieDataset1, pieDataset2, (int) (byte) 0, true, false, true, locale7, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createRingChart("Pie Plot", pieDataset1, false, false, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.axis.Timeline timeline4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createHighLowChart("", "", "hi!", oHLCDataset3, timeline4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        java.awt.Graphics2D graphics2D2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot1.drawOutline(graphics2D2, rectangle2D3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot1);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart("hi!", pieDataset1, false, true, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        java.awt.Stroke stroke5 = piePlot0.getLabelOutlineStroke();
        java.awt.Shape shape6 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot0.setLegendItemShape(shape6);
        java.awt.Paint paint8 = piePlot0.getLabelPaint();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.awt.Paint paint0 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_OUTLINE_PAINT;
        org.junit.Assert.assertNotNull(paint0);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        java.awt.geom.Point2D point2D8 = null;
        org.jfree.chart.plot.PlotState plotState9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.draw(graphics2D6, rectangle2D7, point2D8, plotState9, plotRenderingInfo10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", pieDataset1, pieDataset2, (int) (short) -1, false, false, true, locale7, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart3D("Pie Plot", pieDataset1, false, true, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart3D("Pie Plot", "hi!", "", categoryDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawBackground(graphics2D5, rectangle2D6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYAreaChart("Pie Plot", "Pie Plot", "", xYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.jfree.data.general.WaferMapDataset waferMapDataset1 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createWaferMapChart("Pie Plot", waferMapDataset1, plotOrientation2, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("Pie Plot", "hi!", "", xYDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.axis.Timeline timeline4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createHighLowChart("", "hi!", "", oHLCDataset3, timeline4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        float float0 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_ALPHA;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createRingChart("hi!", pieDataset1, true, false, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.jfree.data.xy.XYZDataset xYZDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBubbleChart("hi!", "Pie Plot", "", xYZDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createHistogram("hi!", "", "Pie Plot", intervalXYDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart("Pie Plot", pieDataset1, false, false, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart3D("Pie Plot", "", "hi!", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        java.awt.Stroke stroke5 = piePlot0.getLabelOutlineStroke();
        java.awt.Shape shape6 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot0.setLegendItemShape(shape6);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawOutline(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("hi!", "hi!", "", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        int int0 = org.jfree.chart.plot.Plot.MINIMUM_HEIGHT_TO_DRAW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        double double0 = org.jfree.chart.plot.PiePlot.DEFAULT_MINIMUM_ARC_ANGLE_TO_DRAW;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0E-5d + "'", double0 == 1.0E-5d);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("", "", "", xYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot0.getLabelGenerator();
        java.awt.Paint paint6 = piePlot0.getLabelPaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setInteriorGap((double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (100.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart("", pieDataset1, false, false, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createCandlestickChart("hi!", "Pie Plot", "Pie Plot", oHLCDataset3, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
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
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setBackgroundImageAlpha((float) '4');
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
        org.junit.Assert.assertNull(pieURLGenerator15);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(shape18);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("hi!", "", "Pie Plot", xYDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        piePlot0.setBackgroundImageAlignment((int) (byte) -1);
        java.awt.Paint paint8 = piePlot0.getLabelPaint();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawOutline(graphics2D9, rectangle2D10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        double double0 = org.jfree.chart.plot.PiePlot.DEFAULT_START_ANGLE;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 90.0d + "'", double0 == 90.0d);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.jfree.data.general.WaferMapDataset waferMapDataset1 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createWaferMapChart("Pie Plot", waferMapDataset1, plotOrientation2, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYAreaChart("hi!", "hi!", "Pie Plot", xYDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
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
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setLabelDistributor(abstractPieLabelDistributor12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'distributor' argument.");
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
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
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
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setBackgroundImageAlpha(10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
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
        org.junit.Assert.assertNull(pieToolTipGenerator17);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
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
        java.lang.Class<?> wildcardClass12 = piePlot0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createHistogram("", "hi!", "Pie Plot", intervalXYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("Pie Plot", pieDataset1, pieDataset2, (int) '#', true, true, false, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        boolean boolean5 = piePlot0.isSubplot();
        piePlot0.setCircular(false);
        piePlot0.setPieIndex((int) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.lang.Number number0 = org.jfree.chart.plot.Plot.ZERO;
        org.junit.Assert.assertEquals("'" + number0 + "' != '" + 0 + "'", number0, 0);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        double double6 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Image image7 = null;
        piePlot0.setBackgroundImage(image7);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-5d + "'", double6 == 1.0E-5d);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("hi!", "hi!", "Pie Plot", windDataset3, false, false, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        piePlot0.setForegroundAlpha((float) (short) 0);
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawBackground(graphics2D4, rectangle2D5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("Pie Plot", "", "", xYDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        double double5 = piePlot0.getLabelGap();
        boolean boolean6 = piePlot0.isSubplot();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart3D("", "", "", categoryDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        double double9 = piePlot0.getShadowXOffset();
        java.awt.Shape shape10 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setLegendItemShape(shape10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
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
        // The following exception was thrown during execution in test generation
        try {
            piePlot11.setBackgroundImageAlpha((float) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
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
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot();
        double double19 = piePlot18.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor20 = piePlot18.getLabelDistributor();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState23 = piePlot10.initialise(graphics2D16, rectangle2D17, piePlot18, (java.lang.Integer) (-1), plotRenderingInfo22);
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
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.14d + "'", double19 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor20);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.jfree.data.statistics.BoxAndWhiskerCategoryDataset boxAndWhiskerCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("Pie Plot", "", "", boxAndWhiskerCategoryDataset3, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        java.awt.geom.Point2D point2D17 = null;
        org.jfree.chart.plot.PlotState plotState18 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.draw(graphics2D15, rectangle2D16, point2D17, plotState18, plotRenderingInfo19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createCandlestickChart("Pie Plot", "Pie Plot", "", oHLCDataset3, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.util.TableOrder tableOrder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createMultiplePieChart3D("", categoryDataset1, tableOrder2, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jfree.data.xy.XYZDataset xYZDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBubbleChart("hi!", "", "Pie Plot", xYZDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        org.jfree.chart.plot.PiePlot piePlot2 = new org.jfree.chart.plot.PiePlot();
        double double3 = piePlot2.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot2.getLabelDistributor();
        double double5 = piePlot2.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        piePlot2.drawBackgroundImage(graphics2D6, rectangle2D7);
        java.awt.Paint paint10 = piePlot2.getSectionPaint((java.lang.Comparable) false);
        piePlot2.setShadowYOffset((double) (short) 1);
        java.awt.Stroke stroke13 = piePlot2.getLabelLinkStroke();
        piePlot0.setLabelOutlineStroke(stroke13);
        org.junit.Assert.assertNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.14d + "'", double3 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-5d + "'", double5 == 1.0E-5d);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart("", pieDataset1, true, true, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        piePlot0.handleClick((int) (byte) 100, (int) (byte) 0, plotRenderingInfo13);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(font9);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "", "", boxAndWhiskerXYDataset3, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepAreaChart("", "", "Pie Plot", xYDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("", "hi!", "", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("", "Pie Plot", "hi!", tableXYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("Pie Plot", "Pie Plot", "hi!", xYDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("hi!", "", "", xYDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        piePlot0.setDataset(pieDataset3);
        int int5 = piePlot0.getPieIndex();
        java.awt.Paint paint6 = piePlot0.getLabelLinkPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = null;
        piePlot0.setLegendLabelURLGenerator(pieURLGenerator7);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("Pie Plot", "", "", xYDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.jfree.data.xy.XYDataset xYDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPolarChart("", xYDataset1, false, true, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("", "", "", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor5 = piePlot0.getLabelDistributor();
        boolean boolean6 = piePlot0.isSubplot();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = piePlot0.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("Pie Plot", "", true, "hi!", intervalXYDataset4, plotOrientation5, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setMinimumArcAngleToDraw((double) '4');
        double double3 = piePlot0.getShadowYOffset();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.0d + "'", double3 == 4.0d);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
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
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawOutline(graphics2D26, rectangle2D27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
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
        java.awt.Font font20 = piePlot11.getLabelFont();
        piePlot11.setSimpleLabels(false);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor23 = piePlot11.getLabelDistributor();
        piePlot0.setLabelDistributor(abstractPieLabelDistributor23);
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
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor23);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.jfree.data.statistics.BoxAndWhiskerCategoryDataset boxAndWhiskerCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("Pie Plot", "", "Pie Plot", boxAndWhiskerCategoryDataset3, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart("hi!", pieDataset1, false, false, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
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
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent16 = null;
        piePlot0.datasetChanged(datasetChangeEvent16);
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
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreNullValues();
        org.jfree.data.general.DatasetGroup datasetGroup5 = piePlot0.getDatasetGroup();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        piePlot0.handleClick((int) (byte) -1, 0, plotRenderingInfo8);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(datasetGroup5);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("hi!", "", "hi!", intervalCategoryDataset3, true, false, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setInteriorGap((double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (97.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
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
        org.jfree.chart.util.RectangleInsets rectangleInsets20 = piePlot9.getLabelPadding();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState23 = piePlot0.initialise(graphics2D7, rectangle2D8, piePlot9, (java.lang.Integer) 1, plotRenderingInfo22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets20);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("hi!", "", "", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Stroke stroke7 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot0.setLabelLinkStroke(stroke7);
        java.lang.Comparable comparable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = piePlot0.getExplodePercent(comparable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
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
        java.awt.Paint paint12 = piePlot0.getLabelPaint();
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
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelToolTipGenerator();
        piePlot0.setCircular(false, true);
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        double double6 = piePlot5.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor7 = piePlot5.getLabelDistributor();
        double double8 = piePlot5.getMinimumArcAngleToDraw();
        java.awt.Paint paint9 = piePlot5.getBaseSectionOutlinePaint();
        piePlot5.setIgnoreNullValues(false);
        java.awt.Stroke stroke12 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot5.setLabelLinkStroke(stroke12);
        piePlot0.setLabelOutlineStroke(stroke12);
        org.junit.Assert.assertNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.14d + "'", double6 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.util.TableOrder tableOrder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createMultiplePieChart3D("hi!", categoryDataset1, tableOrder2, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("hi!", "", "", boxAndWhiskerXYDataset3, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("", "", "hi!", xYDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        double double0 = org.jfree.chart.plot.PiePlot.DEFAULT_INTERIOR_GAP;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.08d + "'", double0 == 0.08d);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
        int int17 = piePlot0.getPieIndex();
        org.junit.Assert.assertNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.14d + "'", double6 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("", "Pie Plot", "hi!", intervalCategoryDataset3, false, false, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.jfree.data.statistics.BoxAndWhiskerCategoryDataset boxAndWhiskerCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("hi!", "Pie Plot", "", boxAndWhiskerCategoryDataset3, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createHighLowChart("", "", "hi!", oHLCDataset3, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
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
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNull(pieURLGenerator15);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor17);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator5 = piePlot0.getLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setLabelPadding(rectangleInsets6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'padding' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator5);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        piePlot0.setForegroundAlpha(100.0f);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot0.getLabelDistributor();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        boolean boolean2 = piePlot0.isCircular();
        java.awt.Graphics2D graphics2D3 = null;
        java.awt.geom.Rectangle2D rectangle2D4 = null;
        piePlot0.drawBackgroundImage(graphics2D3, rectangle2D4);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("Pie Plot", "hi!", "", xYDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("", "Pie Plot", "Pie Plot", windDataset3, false, false, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Graphics2D graphics2D5 = null;
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawOutline(graphics2D5, rectangle2D6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent5 = null;
        plot4.datasetChanged(datasetChangeEvent5);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        double double5 = piePlot0.getLabelGap();
        org.jfree.chart.LegendItemCollection legendItemCollection6 = piePlot0.getLegendItems();
        java.awt.Stroke stroke7 = piePlot0.getOutlineStroke();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNull(legendItemCollection6);
        org.junit.Assert.assertNotNull(stroke7);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        org.jfree.chart.plot.Plot plot2 = piePlot0.getParent();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            plot2.datasetChanged(datasetChangeEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertNull(plot2);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.jfree.data.xy.XYDataset xYDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPolarChart("Pie Plot", xYDataset1, true, false, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setInteriorGap((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (10.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart3D("Pie Plot", "", "hi!", categoryDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", pieDataset1, pieDataset2, (int) (short) -1, true, true, true, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        boolean boolean7 = piePlot0.getSectionOutlinesVisible();
        piePlot0.setCircular(false, false);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = piePlot0.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createRingChart("Pie Plot", pieDataset1, true, true, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.lang.String str3 = piePlot0.getPlotType();
        org.jfree.data.general.DatasetGroup datasetGroup4 = piePlot0.getDatasetGroup();
        java.lang.String str5 = piePlot0.getNoDataMessage();
        java.awt.Graphics2D graphics2D6 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        java.awt.geom.Point2D point2D8 = null;
        org.jfree.chart.plot.PlotState plotState9 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.draw(graphics2D6, rectangle2D7, point2D8, plotState9, plotRenderingInfo10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertNull(datasetGroup4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
        java.lang.Class<?> wildcardClass36 = paint34.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
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
        java.lang.Class<?> wildcardClass12 = piePlot0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("Pie Plot", "", "hi!", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
        // The following exception was thrown during execution in test generation
        try {
            double double16 = piePlot0.getMaximumExplodePercent();
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
        org.junit.Assert.assertNotNull(rectangleInsets11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset19 = null;
        piePlot18.setDataset(pieDataset19);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator21 = piePlot18.getURLGenerator();
        org.jfree.chart.plot.Plot plot22 = piePlot18.getRootPlot();
        double double23 = piePlot18.getLabelGap();
        double double24 = piePlot18.getStartAngle();
        double double25 = piePlot18.getShadowYOffset();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState28 = piePlot0.initialise(graphics2D16, rectangle2D17, piePlot18, (java.lang.Integer) 100, plotRenderingInfo27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNull(pieURLGenerator21);
        org.junit.Assert.assertNotNull(plot22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.025d + "'", double23 == 0.025d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 90.0d + "'", double24 == 90.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 4.0d + "'", double25 == 4.0d);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepAreaChart("", "Pie Plot", "", xYDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("hi!", "", "Pie Plot", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot0.setToolTipGenerator(pieToolTipGenerator2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = null;
        piePlot0.notifyListeners(plotChangeEvent4);
        org.junit.Assert.assertNull(plot1);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("", "Pie Plot", "Pie Plot", xYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setInsets(rectangleInsets19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
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
        org.junit.Assert.assertNull(pieURLGenerator17);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
        java.lang.Comparable comparable17 = null;
        org.jfree.chart.plot.PiePlot piePlot18 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset19 = null;
        piePlot18.setDataset(pieDataset19);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator21 = piePlot18.getURLGenerator();
        org.jfree.chart.plot.Plot plot22 = piePlot18.getRootPlot();
        java.awt.Stroke stroke23 = piePlot18.getLabelOutlineStroke();
        java.awt.Shape shape24 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot18.setLegendItemShape(shape24);
        java.awt.Stroke stroke26 = piePlot18.getLabelLinkStroke();
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setSectionOutlineStroke(comparable17, stroke26);
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
        org.junit.Assert.assertNull(pieURLGenerator21);
        org.junit.Assert.assertNotNull(plot22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
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
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup13);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Pie Plot" + "'", str21, "Pie Plot");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
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
        // The following exception was thrown during execution in test generation
        try {
            double double30 = piePlot0.getMaximumExplodePercent();
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
        org.junit.Assert.assertNull(pieURLGenerator15);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(jFreeChart28);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        java.lang.Class<?> wildcardClass21 = piePlot0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("", "", true, "", intervalXYDataset4, plotOrientation5, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
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
        piePlot0.zoom((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
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
        java.awt.Stroke stroke23 = piePlot0.getSectionOutlineStroke((java.lang.Comparable) (-1.0d));
        double double24 = piePlot0.getMaximumLabelWidth();
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
        org.junit.Assert.assertNull(stroke23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.14d + "'", double24 == 0.14d);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("Pie Plot", "", false, "hi!", intervalXYDataset4, plotOrientation5, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("hi!", "", "", windDataset3, false, false, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("hi!", "hi!", "hi!", intervalCategoryDataset3, true, true, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
        java.awt.Font font15 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setNoDataMessageFont(font15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'font' argument.");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", pieDataset1, pieDataset2, (int) '#', false, false, true, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        java.lang.Comparable comparable19 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setSectionPaint(comparable19, paint35);
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
        org.junit.Assert.assertNull(paint18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.14d + "'", double21 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0E-5d + "'", double23 == 1.0E-5d);
        org.junit.Assert.assertNull(paint28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
        double double16 = piePlot0.getShadowXOffset();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.14d + "'", double4 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-5d + "'", double6 == 1.0E-5d);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("hi!", "", "Pie Plot", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", pieDataset1, pieDataset2, (int) '#', false, false, false, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
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
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14d + "'", double9 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-5d + "'", double17 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.jfree.data.xy.XYDataset xYDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPolarChart("Pie Plot", xYDataset1, true, true, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        int int6 = piePlot0.getPieIndex();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        org.jfree.data.xy.XYDataset xYDataset5 = null;
        org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createPolarChart("", xYDataset5, false, false, true);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart9);
        org.jfree.chart.plot.Plot plot11 = null;
        piePlot0.setParent(plot11);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(jFreeChart9);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.jfree.data.general.WaferMapDataset waferMapDataset1 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createWaferMapChart("Pie Plot", waferMapDataset1, plotOrientation2, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", pieDataset1, pieDataset2, 1, false, true, false, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYAreaChart("", "hi!", "", xYDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jfree.data.statistics.BoxAndWhiskerCategoryDataset boxAndWhiskerCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("Pie Plot", "", "hi!", boxAndWhiskerCategoryDataset3, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        java.awt.Paint paint18 = piePlot0.getSectionPaint((java.lang.Comparable) 15);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(paint18);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createHistogram("", "", "", intervalXYDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setInteriorGap((double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (32.0) argument.");
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
        org.junit.Assert.assertNull(datasetGroup19);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.axis.Timeline timeline4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createHighLowChart("hi!", "Pie Plot", "", oHLCDataset3, timeline4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("", "", "Pie Plot", categoryDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
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
        float float38 = piePlot0.getBackgroundImageAlpha();
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
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.5f + "'", float38 == 0.5f);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
        float float3 = piePlot0.getBackgroundImageAlpha();
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setBackgroundImageAlpha((-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.5f + "'", float3 == 0.5f);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createRingChart("hi!", pieDataset1, true, true, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart3D("", "", "hi!", categoryDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createHighLowChart("", "Pie Plot", "hi!", oHLCDataset3, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        double double6 = piePlot0.getMinimumArcAngleToDraw();
        piePlot0.setSectionOutlinesVisible(false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-5d + "'", double6 == 1.0E-5d);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("Pie Plot", "", "hi!", xYDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
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
        org.jfree.data.general.PieDataset pieDataset17 = null;
        piePlot16.setDataset(pieDataset17);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator19 = piePlot16.getURLGenerator();
        float float20 = piePlot16.getForegroundAlpha();
        java.awt.Stroke stroke21 = piePlot16.getBaseSectionOutlineStroke();
        piePlot0.setLabelOutlineStroke(stroke21);
        java.awt.Paint paint23 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
        piePlot0.setLabelLinkPaint(paint23);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 90.0d + "'", double14 == 90.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertNull(pieURLGenerator19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("Pie Plot", "", "Pie Plot", tableXYDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        java.awt.Stroke stroke6 = piePlot0.getOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = piePlot0.getSimpleLabelOffset();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
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
        piePlot0.setStartAngle(0.4d);
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
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("Pie Plot", "hi!", "", xYDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.axis.Timeline timeline4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createHighLowChart("hi!", "Pie Plot", "", oHLCDataset3, timeline4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart3D("", "", "", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.axis.Timeline timeline4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createHighLowChart("Pie Plot", "", "", oHLCDataset3, timeline4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
        float float42 = piePlot0.getBackgroundImageAlpha();
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
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.5f + "'", float42 == 0.5f);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("hi!", "hi!", "", categoryDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("", "", "", tableXYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
        piePlot0.setIgnoreNullValues(false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertNotNull(plot14);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("hi!", "hi!", "hi!", categoryDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createRingChart("", pieDataset1, true, true, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawOutline(graphics2D18, rectangle2D19);
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
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart3D("hi!", pieDataset1, true, true, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = piePlot0.getSimpleLabelOffset();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(rectangleInsets14);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        java.awt.Stroke stroke2 = piePlot0.getBaseSectionOutlineStroke();
        piePlot0.setStartAngle((double) 10);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(stroke2);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createRingChart("Pie Plot", pieDataset1, false, true, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        float float7 = piePlot0.getBackgroundAlpha();
        boolean boolean8 = piePlot0.getSectionOutlinesVisible();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
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
        float float21 = plot20.getBackgroundAlpha();
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
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 1.0f + "'", float21 == 1.0f);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        java.awt.Paint paint3 = piePlot0.getLabelLinkPaint();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        java.awt.geom.Point2D point2D6 = null;
        org.jfree.chart.plot.PlotState plotState7 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.draw(graphics2D4, rectangle2D5, point2D6, plotState7, plotRenderingInfo8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
        org.jfree.chart.LegendItemCollection legendItemCollection26 = piePlot0.getLegendItems();
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
        org.junit.Assert.assertNull(legendItemCollection26);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.util.TableOrder tableOrder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createMultiplePieChart3D("", categoryDataset1, tableOrder2, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("", "", "", xYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double8 = piePlot7.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor9 = piePlot7.getLabelDistributor();
        double double10 = piePlot7.getMinimumArcAngleToDraw();
        java.awt.Paint paint11 = piePlot7.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = piePlot7.getDrawingSupplier();
        piePlot0.setDrawingSupplier(drawingSupplier12);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(drawingSupplier12);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.util.TableOrder tableOrder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createMultiplePieChart3D("", categoryDataset1, tableOrder2, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        piePlot0.setOutlineVisible(true);
        java.awt.Paint paint8 = piePlot0.getLabelPaint();
        java.lang.Class<?> wildcardClass9 = piePlot0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart3D("Pie Plot", pieDataset1, false, true, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", pieDataset1, pieDataset2, (int) '4', false, false, false, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
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
        java.awt.Stroke stroke22 = piePlot0.getSectionOutlineStroke((java.lang.Comparable) 0.0f);
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
        org.junit.Assert.assertNull(stroke22);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createHistogram("Pie Plot", "hi!", "hi!", intervalXYDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.axis.Timeline timeline4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createHighLowChart("Pie Plot", "hi!", "hi!", oHLCDataset3, timeline4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        boolean boolean16 = piePlot0.getSimpleLabels();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart3D("", "", "", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        java.awt.Stroke stroke6 = piePlot0.getOutlineStroke();
        java.lang.Class<?> wildcardClass7 = stroke6.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("hi!", "hi!", "", intervalCategoryDataset3, true, false, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart3D("hi!", "hi!", "", categoryDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.util.TableOrder tableOrder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createMultiplePieChart("hi!", categoryDataset1, tableOrder2, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        java.awt.Stroke stroke5 = piePlot0.getLabelOutlineStroke();
        java.awt.Shape shape6 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot0.setLegendItemShape(shape6);
        java.awt.Stroke stroke8 = piePlot0.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot9 = new org.jfree.chart.plot.PiePlot();
        double double10 = piePlot9.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor11 = piePlot9.getLabelDistributor();
        double double12 = piePlot9.getMinimumArcAngleToDraw();
        java.awt.Paint paint13 = piePlot9.getBaseSectionOutlinePaint();
        double double14 = piePlot9.getShadowYOffset();
        piePlot9.setBackgroundImageAlignment((int) (byte) -1);
        double double17 = piePlot9.getInteriorGap();
        java.awt.Font font18 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot9.setNoDataMessageFont(font18);
        piePlot0.setLabelFont(font18);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = piePlot0.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4.0d + "'", double14 == 4.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.08d + "'", double17 == 0.08d);
        org.junit.Assert.assertNotNull(font18);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.util.TableOrder tableOrder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createMultiplePieChart3D("", categoryDataset1, tableOrder2, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("Pie Plot", "Pie Plot", "hi!", windDataset3, false, true, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("hi!", "Pie Plot", "hi!", windDataset3, true, true, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart3D("", "hi!", "hi!", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", pieDataset1, pieDataset2, (int) (byte) 0, true, false, true, locale7, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("", "Pie Plot", "", tableXYDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("Pie Plot", pieDataset1, pieDataset2, 15, false, false, false, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator17 = null;
        piePlot0.setLegendLabelURLGenerator(pieURLGenerator17);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Graphics2D graphics2D3 = null;
        java.awt.geom.Rectangle2D rectangle2D4 = null;
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        double double6 = piePlot5.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor7 = piePlot5.getLabelDistributor();
        double double8 = piePlot5.getMinimumArcAngleToDraw();
        java.awt.Paint paint9 = piePlot5.getBaseSectionOutlinePaint();
        piePlot5.setIgnoreNullValues(false);
        java.awt.Stroke stroke12 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot5.setLabelLinkStroke(stroke12);
        boolean boolean14 = piePlot5.isOutlineVisible();
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot16 = piePlot15.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor17 = piePlot15.getLabelDistributor();
        piePlot5.setParent((org.jfree.chart.plot.Plot) piePlot15);
        org.jfree.chart.plot.Plot plot19 = piePlot5.getRootPlot();
        piePlot5.zoom(0.14d);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState24 = piePlot0.initialise(graphics2D3, rectangle2D4, piePlot5, (java.lang.Integer) 1, plotRenderingInfo23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.14d + "'", double6 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(plot16);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor17);
        org.junit.Assert.assertNotNull(plot19);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        java.awt.Stroke stroke5 = piePlot0.getLabelOutlineStroke();
        java.awt.Shape shape6 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot0.setLegendItemShape(shape6);
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
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        java.awt.Paint paint4 = piePlot0.getShadowPaint();
        float float5 = piePlot0.getForegroundAlpha();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = piePlot0.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        piePlot0.markerChanged(markerChangeEvent14);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart3D("hi!", "Pie Plot", "", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        double double16 = piePlot10.getStartAngle();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 90.0d + "'", double16 == 90.0d);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        boolean boolean5 = piePlot0.getSectionOutlinesVisible();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelGenerator();
        piePlot0.setShadowYOffset((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.util.TableOrder tableOrder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createMultiplePieChart3D("hi!", categoryDataset1, tableOrder2, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        java.awt.Stroke stroke5 = piePlot0.getLabelOutlineStroke();
        java.awt.Paint paint6 = piePlot0.getLabelBackgroundPaint();
        piePlot0.setCircular(false);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        java.awt.Paint paint6 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setNoDataMessagePaint(paint6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("hi!", "", "hi!", intervalCategoryDataset3, true, true, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.util.TableOrder tableOrder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createMultiplePieChart3D("hi!", categoryDataset1, tableOrder2, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("", "hi!", "hi!", xYDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        piePlot0.setDataset(pieDataset3);
        int int5 = piePlot0.getPieIndex();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelGenerator();
        java.lang.Class<?> wildcardClass7 = piePlot0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        piePlot0.setOutlineVisible(false);
        org.jfree.data.general.DatasetGroup datasetGroup7 = piePlot0.getDatasetGroup();
        float float8 = piePlot0.getForegroundAlpha();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreNullValues();
        boolean boolean5 = piePlot0.getIgnoreNullValues();
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
        java.awt.Stroke stroke18 = piePlot6.getOutlineStroke();
        java.awt.Shape shape19 = piePlot6.getLegendItemShape();
        piePlot6.setInteriorGap((double) 0.0f);
        boolean boolean22 = piePlot6.isOutlineVisible();
        java.awt.Stroke stroke23 = piePlot6.getLabelLinkStroke();
        piePlot0.setLabelLinkStroke(stroke23);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.14d + "'", double7 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(pieURLGenerator14);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(stroke23);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart3D("", "", "", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("Pie Plot", pieDataset1, pieDataset2, 0, true, false, true, locale7, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        java.awt.Image image30 = null;
        piePlot0.setBackgroundImage(image30);
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
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator49 = piePlot32.getToolTipGenerator();
        piePlot32.setSimpleLabels(false);
        org.jfree.chart.plot.PiePlot piePlot52 = new org.jfree.chart.plot.PiePlot();
        double double53 = piePlot52.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor54 = piePlot52.getLabelDistributor();
        java.awt.Paint paint55 = piePlot52.getLabelOutlinePaint();
        piePlot52.setStartAngle((double) (byte) 10);
        org.jfree.chart.plot.PiePlot piePlot59 = new org.jfree.chart.plot.PiePlot();
        double double60 = piePlot59.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor61 = piePlot59.getLabelDistributor();
        double double62 = piePlot59.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D63 = null;
        java.awt.geom.Rectangle2D rectangle2D64 = null;
        piePlot59.drawBackgroundImage(graphics2D63, rectangle2D64);
        java.awt.Paint paint67 = piePlot59.getSectionPaint((java.lang.Comparable) false);
        java.awt.Font font68 = piePlot59.getLabelFont();
        piePlot59.setSimpleLabels(false);
        piePlot59.setMinimumArcAngleToDraw((double) 100);
        boolean boolean73 = piePlot59.isOutlineVisible();
        java.awt.Paint paint74 = piePlot59.getBaseSectionOutlinePaint();
        piePlot52.setSectionOutlinePaint((java.lang.Comparable) 4.0d, paint74);
        java.awt.Paint paint76 = piePlot52.getBackgroundPaint();
        piePlot32.setLabelOutlinePaint(paint76);
        piePlot0.setLabelShadowPaint(paint76);
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
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.14d + "'", double33 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0E-5d + "'", double35 == 1.0E-5d);
        org.junit.Assert.assertNull(paint40);
        org.junit.Assert.assertNotNull(font41);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNull(pieToolTipGenerator49);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.14d + "'", double53 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor54);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.14d + "'", double60 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor61);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 1.0E-5d + "'", double62 == 1.0E-5d);
        org.junit.Assert.assertNull(paint67);
        org.junit.Assert.assertNotNull(font68);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(paint74);
        org.junit.Assert.assertNotNull(paint76);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        float float4 = piePlot0.getForegroundAlpha();
        java.awt.Stroke stroke5 = piePlot0.getBaseSectionOutlineStroke();
        java.awt.Stroke stroke6 = piePlot0.getLabelLinkStroke();
        piePlot0.setNoDataMessage("Pie Plot");
        java.lang.Class<?> wildcardClass9 = piePlot0.getClass();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("Pie Plot", "Pie Plot", "Pie Plot", xYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("hi!", "", "Pie Plot", xYDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.axis.Timeline timeline4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createHighLowChart("Pie Plot", "hi!", "", oHLCDataset3, timeline4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("Pie Plot", "hi!", "", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "", "Pie Plot", boxAndWhiskerXYDataset3, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
        double double30 = piePlot27.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        piePlot27.drawBackgroundImage(graphics2D31, rectangle2D32);
        java.awt.Paint paint35 = piePlot27.getSectionPaint((java.lang.Comparable) false);
        java.lang.String str36 = piePlot27.getNoDataMessage();
        java.awt.Paint paint37 = piePlot27.getLabelOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets38 = piePlot27.getLabelPadding();
        boolean boolean39 = piePlot27.getSimpleLabels();
        piePlot27.setBackgroundAlpha((float) 10);
        java.awt.Paint paint42 = piePlot27.getLabelBackgroundPaint();
        java.awt.Paint paint43 = piePlot27.getLabelOutlinePaint();
        piePlot0.setLabelBackgroundPaint(paint43);
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
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.14d + "'", double28 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0E-5d + "'", double30 == 1.0E-5d);
        org.junit.Assert.assertNull(paint35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(rectangleInsets38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(paint43);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createHistogram("", "Pie Plot", "Pie Plot", intervalXYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getShadowYOffset();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        double double4 = piePlot0.getInteriorGap();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.08d + "'", double4 == 0.08d);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart3D("", pieDataset1, false, true, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("", "hi!", "hi!", categoryDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        double double18 = piePlot0.getShadowXOffset();
        piePlot0.setCircular(true);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator21 = piePlot0.getLegendLabelToolTipGenerator();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 4.0d + "'", double18 == 4.0d);
        org.junit.Assert.assertNull(pieSectionLabelGenerator21);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
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
        java.awt.Graphics2D graphics2D23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
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
        java.awt.Paint paint37 = piePlot25.getLabelPaint();
        java.awt.Paint paint38 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot25.setLabelOutlinePaint(paint38);
        piePlot25.setStartAngle((double) 100L);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator42 = piePlot25.getToolTipGenerator();
        java.awt.Paint paint43 = piePlot25.getLabelBackgroundPaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState46 = piePlot0.initialise(graphics2D23, rectangle2D24, piePlot25, (java.lang.Integer) 15, plotRenderingInfo45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.14d + "'", double26 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0E-5d + "'", double28 == 1.0E-5d);
        org.junit.Assert.assertNull(paint33);
        org.junit.Assert.assertNotNull(font34);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNull(pieToolTipGenerator42);
        org.junit.Assert.assertNotNull(paint43);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "Pie Plot", "hi!", boxAndWhiskerXYDataset3, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
        float float3 = piePlot0.getForegroundAlpha();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        piePlot0.setSectionOutlinesVisible(false);
        boolean boolean7 = piePlot0.getSimpleLabels();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
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
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = piePlot0.getInsets();
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
        org.junit.Assert.assertNotNull(rectangleInsets25);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot0.getSimpleLabelOffset();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo9 = null;
        piePlot0.handleClick((int) (short) 0, 0, plotRenderingInfo9);
        piePlot0.setLabelLinkMargin((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets6);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        java.awt.geom.Point2D point2D16 = null;
        org.jfree.chart.plot.PlotState plotState17 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.draw(graphics2D14, rectangle2D15, point2D16, plotState17, plotRenderingInfo18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        piePlot0.setExplodePercent((java.lang.Comparable) (byte) 10, (double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup13);
        org.junit.Assert.assertNotNull(rectangleInsets16);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("", "Pie Plot", "hi!", xYDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        boolean boolean5 = piePlot0.isSubplot();
        java.lang.Object obj6 = piePlot0.clone();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Stroke stroke7 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot0.setLabelLinkStroke(stroke7);
        java.awt.Stroke stroke9 = piePlot0.getLabelLinkStroke();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("Pie Plot", "", "hi!", xYDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("", "", "Pie Plot", categoryDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.jfree.data.statistics.BoxAndWhiskerCategoryDataset boxAndWhiskerCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("hi!", "", "Pie Plot", boxAndWhiskerCategoryDataset3, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        double double4 = piePlot0.getShadowXOffset();
        piePlot0.setForegroundAlpha((float) 1L);
        java.awt.Image image7 = null;
        piePlot0.setBackgroundImage(image7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart3D("Pie Plot", pieDataset1, true, true, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        org.jfree.chart.plot.PiePlot piePlot20 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset21 = null;
        piePlot20.setDataset(pieDataset21);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator23 = piePlot20.getURLGenerator();
        org.jfree.chart.plot.Plot plot24 = piePlot20.getRootPlot();
        java.awt.Stroke stroke25 = piePlot20.getLabelOutlineStroke();
        java.awt.Shape shape26 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot20.setLegendItemShape(shape26);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator28 = piePlot20.getLegendLabelURLGenerator();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState31 = piePlot0.initialise(graphics2D18, rectangle2D19, piePlot20, (java.lang.Integer) 0, plotRenderingInfo30);
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
        org.junit.Assert.assertNull(pieURLGenerator23);
        org.junit.Assert.assertNotNull(plot24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNull(pieURLGenerator28);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart3D("", "", "", categoryDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", pieDataset1, pieDataset2, (-1), false, true, true, locale7, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
        int int41 = piePlot0.getBackgroundImageAlignment();
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = piePlot0.getLabelGenerator();
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
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Pie Plot" + "'", str12, "Pie Plot");
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator15);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("", "hi!", "hi!", categoryDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        java.awt.Paint paint6 = piePlot0.getShadowPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator7 = piePlot0.getLegendLabelGenerator();
        piePlot0.setPieIndex((int) ' ');
        piePlot0.setIgnoreNullValues(true);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator7);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        org.jfree.data.xy.WindDataset windDataset16 = null;
        org.jfree.chart.JFreeChart jFreeChart20 = org.jfree.chart.ChartFactory.createWindPlot("", "hi!", "Pie Plot", windDataset16, true, true, true);
        // The following exception was thrown during execution in test generation
        try {
            plot12.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart20);
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
        org.junit.Assert.assertNotNull(jFreeChart20);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart3D("Pie Plot", "hi!", "Pie Plot", categoryDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("hi!", "hi!", "Pie Plot", xYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.util.TableOrder tableOrder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createMultiplePieChart("", categoryDataset1, tableOrder2, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("Pie Plot", "", "", xYDataset3, false, false, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYAreaChart("Pie Plot", "", "Pie Plot", xYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart3D("", pieDataset1, true, true, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYAreaChart("hi!", "", "", xYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawBackground(graphics2D25, rectangle2D26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("hi!", "", true, "Pie Plot", intervalXYDataset4, plotOrientation5, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("", "hi!", "Pie Plot", xYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        java.awt.Stroke stroke2 = piePlot0.getBaseSectionOutlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = piePlot0.getLabelPadding();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = null;
        piePlot0.setURLGenerator(pieURLGenerator4);
        piePlot0.setCircular(false);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.lang.String str3 = piePlot0.getPlotType();
        int int4 = piePlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Pie Plot" + "'", str3, "Pie Plot");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
        piePlot10.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint13 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot10.setLabelShadowPaint(paint13);
        piePlot0.setBaseSectionPaint(paint13);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        java.awt.geom.Point2D point2D16 = null;
        org.jfree.chart.plot.PlotState plotState17 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.draw(graphics2D14, rectangle2D15, point2D16, plotState17, plotRenderingInfo18);
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
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("", "", false, "hi!", intervalXYDataset4, plotOrientation5, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        boolean boolean5 = piePlot0.getSectionOutlinesVisible();
        java.awt.Stroke stroke6 = piePlot0.getLabelOutlineStroke();
        java.lang.Object obj7 = piePlot0.clone();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator19 = piePlot0.getURLGenerator();
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
        org.junit.Assert.assertNull(pieURLGenerator19);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        java.awt.Paint paint6 = piePlot0.getShadowPaint();
        piePlot0.setSectionOutlinesVisible(false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
        boolean boolean42 = piePlot0.getSimpleLabels();
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("hi!", "", "hi!", intervalCategoryDataset3, false, true, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = piePlot0.getLegendLabelURLGenerator();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(plot12);
        org.junit.Assert.assertNull(pieURLGenerator13);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "", "hi!", boxAndWhiskerXYDataset3, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("hi!", "hi!", "hi!", tableXYDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = piePlot0.getDrawingSupplier();
        double double6 = piePlot0.getShadowXOffset();
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
        piePlot7.setBaseSectionPaint(paint43);
        java.awt.Paint paint48 = piePlot7.getBaseSectionOutlinePaint();
        piePlot0.setLabelOutlinePaint(paint48);
        double double50 = piePlot0.getLabelGap();
        piePlot0.setBackgroundAlpha(0.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
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
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.025d + "'", double50 == 0.025d);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart3D("hi!", "hi!", "hi!", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        double double5 = piePlot0.getLabelGap();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelGenerator();
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        double double9 = piePlot8.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor10 = piePlot8.getLabelDistributor();
        double double11 = piePlot8.getMinimumArcAngleToDraw();
        java.awt.Paint paint12 = piePlot8.getBaseSectionOutlinePaint();
        piePlot8.setIgnoreNullValues(false);
        java.awt.Paint paint15 = piePlot8.getNoDataMessagePaint();
        piePlot0.setSectionPaint((java.lang.Comparable) 100L, paint15);
        java.awt.Graphics2D graphics2D17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawOutline(graphics2D17, rectangle2D18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14d + "'", double9 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-5d + "'", double11 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        java.awt.Stroke stroke17 = piePlot0.getLabelLinkStroke();
        boolean boolean18 = piePlot0.isCircular();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createRingChart("Pie Plot", pieDataset1, false, false, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
        double double15 = piePlot0.getMaximumLabelWidth();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator24 = piePlot0.getLegendLabelToolTipGenerator();
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
        org.junit.Assert.assertNull(pieSectionLabelGenerator24);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createHistogram("Pie Plot", "hi!", "", intervalXYDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("Pie Plot", "Pie Plot", "hi!", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot0.getSimpleLabelOffset();
        double double7 = piePlot0.getLabelLinkMargin();
        double double8 = piePlot0.getStartAngle();
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
        piePlot9.setMinimumArcAngleToDraw((double) 100);
        boolean boolean23 = piePlot9.isOutlineVisible();
        java.awt.Paint paint24 = piePlot9.getBaseSectionOutlinePaint();
        piePlot0.setBaseSectionPaint(paint24);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.025d + "'", double7 == 0.025d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 90.0d + "'", double8 == 90.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.14d + "'", double10 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-5d + "'", double12 == 1.0E-5d);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart("hi!", "hi!", "", categoryDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jfree.data.xy.XYDataset xYDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPolarChart("hi!", xYDataset1, false, false, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor5 = piePlot0.getLabelDistributor();
        org.jfree.chart.plot.Plot plot6 = piePlot0.getRootPlot();
        org.jfree.chart.plot.PiePlot piePlot7 = new org.jfree.chart.plot.PiePlot();
        double double8 = piePlot7.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup9 = piePlot7.getDatasetGroup();
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot7.setNoDataMessagePaint(paint10);
        double double13 = piePlot7.getExplodePercent((java.lang.Comparable) (-1));
        org.jfree.chart.plot.PiePlot piePlot14 = new org.jfree.chart.plot.PiePlot();
        double double15 = piePlot14.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor16 = piePlot14.getLabelDistributor();
        double double17 = piePlot14.getMinimumArcAngleToDraw();
        java.awt.Paint paint18 = piePlot14.getBaseSectionOutlinePaint();
        java.awt.Paint paint19 = piePlot14.getBaseSectionPaint();
        java.awt.Paint paint20 = piePlot14.getShadowPaint();
        piePlot7.setLabelOutlinePaint(paint20);
        piePlot0.setLabelBackgroundPaint(paint20);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor5);
        org.junit.Assert.assertNotNull(plot6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0E-5d + "'", double17 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        piePlot0.setStartAngle((double) 0.0f);
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
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        org.jfree.chart.plot.Plot plot11 = piePlot0.getRootPlot();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNotNull(plot11);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart3D("Pie Plot", pieDataset1, true, false, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("", "", "hi!", categoryDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.PiePlot piePlot3 = new org.jfree.chart.plot.PiePlot();
        double double4 = piePlot3.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor5 = piePlot3.getLabelDistributor();
        double double6 = piePlot3.getMinimumArcAngleToDraw();
        java.awt.Paint paint7 = piePlot3.getBaseSectionOutlinePaint();
        piePlot3.setIgnoreNullValues(false);
        java.awt.Paint paint10 = piePlot3.getNoDataMessagePaint();
        java.awt.Stroke stroke12 = piePlot3.getSectionOutlineStroke((java.lang.Comparable) 52.0d);
        org.jfree.chart.util.Rotation rotation13 = piePlot3.getDirection();
        piePlot0.setDirection(rotation13);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.14d + "'", double4 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-5d + "'", double6 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(stroke12);
        org.junit.Assert.assertNotNull(rotation13);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
        java.awt.Graphics2D graphics2D47 = null;
        java.awt.geom.Rectangle2D rectangle2D48 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot25.drawOutline(graphics2D47, rectangle2D48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart3D("Pie Plot", "Pie Plot", "hi!", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        boolean boolean4 = piePlot0.isOutlineVisible();
        org.jfree.data.general.PieDataset pieDataset5 = null;
        org.jfree.chart.plot.PiePlot piePlot6 = new org.jfree.chart.plot.PiePlot(pieDataset5);
        piePlot6.zoom(0.4d);
        java.awt.Stroke stroke10 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot6.setSectionOutlineStroke((java.lang.Comparable) false, stroke10);
        org.jfree.chart.plot.PiePlot piePlot13 = new org.jfree.chart.plot.PiePlot();
        double double14 = piePlot13.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor15 = piePlot13.getLabelDistributor();
        java.awt.Paint paint16 = piePlot13.getLabelOutlinePaint();
        piePlot6.setSectionPaint((java.lang.Comparable) 1.0E-5d, paint16);
        java.awt.Paint paint18 = piePlot6.getLabelOutlinePaint();
        java.awt.Paint paint19 = piePlot6.getBackgroundPaint();
        piePlot0.setLabelOutlinePaint(paint19);
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.14d + "'", double14 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedAreaChart("Pie Plot", "", "hi!", categoryDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("hi!", "hi!", "Pie Plot", intervalCategoryDataset3, true, true, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        boolean boolean7 = piePlot0.getSectionOutlinesVisible();
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        double double9 = piePlot8.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor10 = piePlot8.getLabelDistributor();
        double double11 = piePlot8.getMinimumArcAngleToDraw();
        java.awt.Paint paint12 = piePlot8.getBaseSectionOutlinePaint();
        piePlot8.setIgnoreNullValues(false);
        java.awt.Stroke stroke15 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot8.setLabelLinkStroke(stroke15);
        org.jfree.data.general.PieDataset pieDataset18 = null;
        java.util.Locale locale21 = null;
        org.jfree.chart.JFreeChart jFreeChart22 = org.jfree.chart.ChartFactory.createPieChart3D("Pie Plot", pieDataset18, false, false, locale21);
        piePlot8.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart22);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart22);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14d + "'", double9 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-5d + "'", double11 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(jFreeChart22);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
        piePlot0.setIgnoreZeroValues(false);
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
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("hi!", "", "Pie Plot", categoryDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        java.awt.Stroke stroke42 = null;
        piePlot0.setOutlineStroke(stroke42);
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
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getLabelOutlinePaint();
        org.jfree.data.xy.XYDataset xYDataset5 = null;
        org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createPolarChart("", xYDataset5, false, false, true);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart9);
        java.awt.Shape shape11 = piePlot0.getLegendItemShape();
        java.awt.Shape shape12 = piePlot0.getLegendItemShape();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        piePlot0.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint3 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot0.setLabelShadowPaint(paint3);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        piePlot0.handleClick((int) ' ', (int) (short) -1, plotRenderingInfo7);
        double double9 = piePlot0.getLabelGap();
        float float10 = piePlot0.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.025d + "'", double9 == 0.025d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.5f + "'", float10 == 0.5f);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createHighLowChart("", "hi!", "hi!", oHLCDataset3, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawOutline(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("hi!", "hi!", "", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.PiePlot piePlot2 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot3 = piePlot2.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor4 = piePlot2.getLabelDistributor();
        java.awt.Paint paint5 = piePlot2.getLabelOutlinePaint();
        boolean boolean6 = piePlot2.isOutlineVisible();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = piePlot2.getToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot8 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup9 = piePlot8.getDatasetGroup();
        piePlot8.setBackgroundImageAlignment((int) 'a');
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
        piePlot8.setSectionPaint((java.lang.Comparable) 1.0d, paint23);
        piePlot2.setLabelBackgroundPaint(paint23);
        // The following exception was thrown during execution in test generation
        try {
            plot1.setBackgroundPaint(paint23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNull(plot3);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(pieToolTipGenerator7);
        org.junit.Assert.assertNull(datasetGroup9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.14d + "'", double14 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-5d + "'", double16 == 1.0E-5d);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYAreaChart("hi!", "Pie Plot", "", xYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
        float float3 = piePlot0.getForegroundAlpha();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        java.awt.Paint paint6 = piePlot0.getSectionOutlinePaint((java.lang.Comparable) 1.0f);
        double double7 = piePlot0.getStartAngle();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 90.0d + "'", double7 == 90.0d);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("hi!", "Pie Plot", "", windDataset3, true, true, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedBarChart3D("", "hi!", "hi!", categoryDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("", "", "Pie Plot", xYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.jfree.data.xy.XYDataset xYDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPolarChart("Pie Plot", xYDataset1, false, false, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        boolean boolean4 = piePlot0.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot5 = piePlot0.getRootPlot();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        piePlot0.axisChanged(axisChangeEvent6);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(plot5);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        piePlot0.setExplodePercent((java.lang.Comparable) (short) 1, (double) (short) 0);
        org.junit.Assert.assertNull(datasetGroup1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.14d + "'", double6 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-5d + "'", double8 == 1.0E-5d);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.025d + "'", double17 == 0.025d);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Stroke stroke3 = piePlot0.getOutlineStroke();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator4 = null;
        piePlot0.setLegendLabelURLGenerator(pieURLGenerator4);
        piePlot0.setPieIndex((int) '4');
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawOutline(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(stroke3);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        piePlot0.setOutlineVisible(true);
        piePlot0.setLabelLinkMargin((double) (short) -1);
        java.lang.Comparable comparable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = piePlot0.getExplodePercent(comparable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("hi!", "", "", xYDataset3, false, false, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.jfree.data.xy.XYZDataset xYZDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBubbleChart("hi!", "", "", xYZDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        boolean boolean5 = piePlot0.getSectionOutlinesVisible();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelGenerator();
        boolean boolean7 = piePlot0.getSectionOutlinesVisible();
        org.jfree.data.general.PieDataset pieDataset8 = piePlot0.getDataset();
        java.lang.Object obj9 = piePlot0.clone();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(pieDataset8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
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
        boolean boolean22 = piePlot0.isCircular();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        java.lang.Object obj42 = piePlot0.clone();
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
        org.junit.Assert.assertNotNull(obj42);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot0.getSimpleLabelOffset();
        double double7 = piePlot0.getLabelLinkMargin();
        java.awt.Stroke stroke8 = piePlot0.getBaseSectionOutlineStroke();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.025d + "'", double7 == 0.025d);
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        double double5 = piePlot0.getLabelGap();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelGenerator();
        piePlot0.setMinimumArcAngleToDraw((double) 15);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.025d + "'", double5 == 0.025d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        java.awt.Paint paint13 = piePlot0.getBaseSectionPaint();
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
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        org.jfree.chart.plot.Plot plot44 = plot43.getParent();
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
        org.junit.Assert.assertNull(plot44);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", pieDataset1, pieDataset2, (-1), true, true, false, locale7, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor14 = piePlot0.getLabelDistributor();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor14);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createRingChart("", pieDataset1, true, true, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        java.awt.Paint paint4 = piePlot0.getShadowPaint();
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        piePlot5.setMinimumArcAngleToDraw((double) '4');
        java.awt.Paint paint8 = piePlot5.getLabelLinkPaint();
        piePlot0.setLabelPaint(paint8);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        piePlot0.setBackgroundImageAlignment((int) (short) -1);
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
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createCandlestickChart("Pie Plot", "Pie Plot", "hi!", oHLCDataset3, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "Pie Plot", "Pie Plot", boxAndWhiskerXYDataset3, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        piePlot10.setSimpleLabels(false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertNull(pieURLGenerator14);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        double double23 = piePlot0.getShadowYOffset();
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 4.0d + "'", double23 == 4.0d);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        piePlot0.setForegroundAlpha((float) (short) 0);
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        double double5 = piePlot4.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor6 = piePlot4.getLabelDistributor();
        double double7 = piePlot4.getMinimumArcAngleToDraw();
        java.awt.Paint paint8 = piePlot4.getBaseSectionOutlinePaint();
        double double9 = piePlot4.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = piePlot4.getSimpleLabelOffset();
        piePlot0.setInsets(rectangleInsets10);
        piePlot0.setIgnoreZeroValues(false);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-5d + "'", double7 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets10);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("hi!", "hi!", "", xYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("", pieDataset1, pieDataset2, (int) (byte) -1, true, true, false, locale7, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("", "", "Pie Plot", windDataset3, false, true, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator19 = piePlot0.getLegendLabelURLGenerator();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(plot11);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNull(pieURLGenerator19);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        java.awt.Paint paint6 = piePlot0.getLabelPaint();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent7 = null;
        piePlot0.axisChanged(axisChangeEvent7);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        java.lang.String str16 = piePlot0.getNoDataMessage();
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createScatterPlot("Pie Plot", "", "hi!", xYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        piePlot0.setLabelLinkMargin((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(pieToolTipGenerator17);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        piePlot0.setOutlineVisible(true);
        piePlot0.setLabelLinkMargin((double) (short) -1);
        piePlot0.setForegroundAlpha(1.0f);
        boolean boolean8 = piePlot0.getIgnoreZeroValues();
        java.awt.Paint paint9 = piePlot0.getShadowPaint();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        piePlot0.setBackgroundImageAlignment((int) (byte) -1);
        double double8 = piePlot0.getInteriorGap();
        java.awt.Paint paint9 = piePlot0.getShadowPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator10 = piePlot0.getLegendLabelToolTipGenerator();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(pieSectionLabelGenerator10);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createHistogram("hi!", "hi!", "Pie Plot", intervalXYDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        int int3 = piePlot0.getPieIndex();
        double double4 = piePlot0.getShadowXOffset();
        piePlot0.setIgnoreNullValues(false);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator7 = piePlot0.getToolTipGenerator();
        java.awt.Paint paint8 = piePlot0.getLabelPaint();
        piePlot0.setIgnoreNullValues(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
        org.junit.Assert.assertNull(pieToolTipGenerator7);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.util.TableOrder tableOrder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createMultiplePieChart3D("hi!", categoryDataset1, tableOrder2, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'order' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        piePlot0.setOutlineVisible(true);
        piePlot0.setLabelLinkMargin((double) (short) -1);
        piePlot0.setForegroundAlpha(1.0f);
        boolean boolean8 = piePlot0.getIgnoreZeroValues();
        double double9 = piePlot0.getShadowYOffset();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("", "Pie Plot", "", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedAreaChart("Pie Plot", "Pie Plot", "Pie Plot", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
        java.awt.Paint paint16 = piePlot0.getShadowPaint();
        piePlot0.setLabelLinksVisible(false);
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
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
        java.lang.Object obj11 = piePlot0.clone();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNull(datasetGroup10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        org.jfree.data.xy.OHLCDataset oHLCDataset15 = null;
        org.jfree.chart.JFreeChart jFreeChart17 = org.jfree.chart.ChartFactory.createHighLowChart("Pie Plot", "", "", oHLCDataset15, false);
        piePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart17);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(jFreeChart17);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("hi!", "Pie Plot", "", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
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
        piePlot0.setOutlinePaint(paint13);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        piePlot0.drawBackgroundImage(graphics2D15, rectangle2D16);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.14d + "'", double4 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-5d + "'", double6 == 1.0E-5d);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("hi!", "hi!", "hi!", xYDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getShadowYOffset();
        piePlot0.setLabelLinksVisible(false);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.jfree.data.general.WaferMapDataset waferMapDataset1 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createWaferMapChart("", waferMapDataset1, plotOrientation2, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("", "Pie Plot", "", categoryDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("Pie Plot", "", "Pie Plot", xYDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
        org.jfree.data.general.PieDataset pieDataset17 = null;
        piePlot16.setDataset(pieDataset17);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator19 = piePlot16.getURLGenerator();
        float float20 = piePlot16.getForegroundAlpha();
        java.awt.Stroke stroke21 = piePlot16.getBaseSectionOutlineStroke();
        piePlot0.setLabelOutlineStroke(stroke21);
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset26 = null;
        org.jfree.chart.JFreeChart jFreeChart28 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "Pie Plot", "hi!", boxAndWhiskerXYDataset26, false);
        piePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart28);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 90.0d + "'", double14 == 90.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertNull(pieURLGenerator19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(jFreeChart28);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        piePlot0.setForegroundAlpha((float) (short) 0);
        piePlot0.setLabelLinkMargin((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        piePlot0.setDataset(pieDataset3);
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot0.setInsets(rectangleInsets5, false);
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = piePlot0.getLabelPadding();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(rectangleInsets5);
        org.junit.Assert.assertNotNull(rectangleInsets8);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createHighLowChart("hi!", "Pie Plot", "Pie Plot", oHLCDataset3, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("", "Pie Plot", "", xYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        java.awt.Paint paint3 = piePlot0.getNoDataMessagePaint();
        java.awt.Paint paint4 = piePlot0.getLabelPaint();
        int int5 = piePlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.Plot plot4 = piePlot0.getRootPlot();
        java.awt.Stroke stroke5 = piePlot0.getLabelOutlineStroke();
        java.awt.Paint paint6 = piePlot0.getLabelBackgroundPaint();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = piePlot0.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.jfree.data.general.WaferMapDataset waferMapDataset1 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createWaferMapChart("", waferMapDataset1, plotOrientation2, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createCandlestickChart("", "", "", oHLCDataset3, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYAreaChart("hi!", "", "hi!", xYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("", "", "", windDataset3, false, false, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createTimeSeriesChart("", "hi!", "hi!", xYDataset3, false, true, false);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        piePlot0.setBackgroundImageAlignment((int) (byte) -1);
        piePlot0.setBackgroundImageAlpha((float) (short) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = piePlot0.getDrawingSupplier();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(drawingSupplier10);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        piePlot0.setShadowXOffset((double) ' ');
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
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("", "", "Pie Plot", xYDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        java.awt.Paint paint6 = piePlot0.getShadowPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator7 = piePlot0.getLegendLabelGenerator();
        java.awt.Paint paint8 = piePlot0.getLabelPaint();
        java.awt.Graphics2D graphics2D9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawBackground(graphics2D9, rectangle2D10);
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
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent20 = null;
        piePlot0.datasetChanged(datasetChangeEvent20);
        java.awt.Paint paint22 = piePlot0.getLabelShadowPaint();
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
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("", "", false, "", intervalXYDataset4, plotOrientation5, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        org.jfree.chart.LegendItemCollection legendItemCollection13 = piePlot0.getLegendItems();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.08d + "'", double8 == 0.08d);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection13);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        piePlot0.setOutlineVisible(true);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = piePlot0.getDrawingSupplier();
        boolean boolean6 = piePlot0.isSubplot();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(drawingSupplier5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("hi!", "", "hi!", xYDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createHighLowChart("", "hi!", "", oHLCDataset3, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        org.jfree.chart.plot.Plot plot2 = piePlot0.getParent();
        boolean boolean3 = piePlot0.isCircular();
        java.lang.Object obj4 = piePlot0.clone();
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertNull(plot2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createHighLowChart("Pie Plot", "hi!", "hi!", oHLCDataset3, true);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Stroke stroke7 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot0.setLabelLinkStroke(stroke7);
        java.awt.Paint paint9 = piePlot0.getShadowPaint();
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        double double11 = piePlot10.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = piePlot10.getLabelDistributor();
        java.lang.String str13 = piePlot10.getPlotType();
        org.jfree.data.general.DatasetGroup datasetGroup14 = piePlot10.getDatasetGroup();
        java.awt.Shape shape15 = piePlot10.getLegendItemShape();
        piePlot0.setLegendItemShape(shape15);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.14d + "'", double11 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pie Plot" + "'", str13, "Pie Plot");
        org.junit.Assert.assertNull(datasetGroup14);
        org.junit.Assert.assertNotNull(shape15);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart3D("", "", "hi!", categoryDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        piePlot0.setMinimumArcAngleToDraw((double) ' ');
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
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart3D("Pie Plot", pieDataset1, true, true, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
        java.awt.Font font13 = piePlot0.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertNotNull(font13);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("Pie Plot", "", "hi!", xYDataset3, plotOrientation4, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset3 = null;
        piePlot0.setDataset(pieDataset3);
        int int5 = piePlot0.getPieIndex();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot0.getLegendLabelGenerator();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = piePlot0.getDrawingSupplier();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setInsets(rectangleInsets8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(drawingSupplier7);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = null;
        piePlot0.setURLGenerator(pieURLGenerator12);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo16 = null;
        piePlot0.handleClick((int) (byte) 10, 100, plotRenderingInfo16);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.14d + "'", double3 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-5d + "'", double5 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
        org.junit.Assert.assertNotNull(rotation10);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        java.awt.Paint paint5 = piePlot0.getBaseSectionPaint();
        java.awt.Paint paint6 = piePlot0.getShadowPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator7 = piePlot0.getLegendLabelGenerator();
        java.lang.Class<?> wildcardClass8 = piePlot0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("hi!", "", "Pie Plot", windDataset3, true, false, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        double double28 = piePlot0.getInteriorGap();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.14d + "'", double19 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0E-5d + "'", double21 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 4.0d + "'", double23 == 4.0d);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("", "hi!", "hi!", xYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.DatasetGroup datasetGroup1 = piePlot0.getDatasetGroup();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot0.setToolTipGenerator(pieToolTipGenerator2);
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset7 = null;
        org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "hi!", "", boxAndWhiskerXYDataset7, false);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart9);
        java.awt.Paint paint11 = piePlot0.getLabelPaint();
        double double12 = piePlot0.getShadowXOffset();
        org.junit.Assert.assertNull(datasetGroup1);
        org.junit.Assert.assertNotNull(jFreeChart9);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYAreaChart("Pie Plot", "", "", xYDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        org.jfree.data.general.DatasetGroup datasetGroup30 = piePlot11.getDatasetGroup();
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
        org.junit.Assert.assertNull(datasetGroup30);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("Pie Plot", "", "Pie Plot", intervalCategoryDataset3, true, true, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("Pie Plot", "Pie Plot", true, "", intervalXYDataset4, plotOrientation5, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        java.awt.Paint paint41 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setBaseSectionOutlinePaint(paint41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        piePlot0.setDataset(pieDataset1);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator3 = piePlot0.getURLGenerator();
        org.jfree.chart.plot.PiePlot piePlot4 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset5 = null;
        piePlot4.setDataset(pieDataset5);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator7 = piePlot4.getURLGenerator();
        piePlot4.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator10 = piePlot4.getLegendLabelToolTipGenerator();
        org.jfree.chart.plot.PiePlot piePlot11 = new org.jfree.chart.plot.PiePlot();
        double double12 = piePlot11.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor13 = piePlot11.getLabelDistributor();
        double double14 = piePlot11.getMinimumArcAngleToDraw();
        boolean boolean15 = piePlot11.getIgnoreZeroValues();
        boolean boolean16 = piePlot11.isSubplot();
        piePlot11.setCircular(false);
        java.awt.Paint paint20 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot11.setSectionOutlinePaint((java.lang.Comparable) "", paint20);
        piePlot4.setNoDataMessagePaint(paint20);
        piePlot0.setLabelShadowPaint(paint20);
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.drawOutline(graphics2D24, rectangle2D25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNull(pieURLGenerator7);
        org.junit.Assert.assertNull(pieSectionLabelGenerator10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.14d + "'", double12 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-5d + "'", double14 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createWaterfallChart("hi!", "Pie Plot", "Pie Plot", categoryDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
        piePlot0.setStartAngle((double) ' ');
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
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("", "hi!", "Pie Plot", xYDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYLineChart("Pie Plot", "Pie Plot", "", xYDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYAreaChart("hi!", "", "hi!", xYDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("", "hi!", "hi!", tableXYDataset3, plotOrientation4, false, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        java.awt.Paint paint1 = piePlot0.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint1);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.plot.Plot plot1 = piePlot0.getParent();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator2 = null;
        piePlot0.setToolTipGenerator(pieToolTipGenerator2);
        double double4 = piePlot0.getShadowYOffset();
        java.lang.String str5 = piePlot0.getPlotType();
        org.junit.Assert.assertNull(plot1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie Plot" + "'", str5, "Pie Plot");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jfree.data.xy.XYDataset xYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createXYStepChart("", "Pie Plot", "", xYDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createRingChart("hi!", pieDataset1, false, true, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createHighLowChart("", "hi!", "Pie Plot", oHLCDataset3, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("hi!", "hi!", "Pie Plot", categoryDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        double double2 = piePlot0.getMaximumLabelWidth();
        float float3 = piePlot0.getForegroundAlpha();
        int int4 = piePlot0.getPieIndex();
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        double double6 = piePlot5.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup7 = piePlot5.getDatasetGroup();
        piePlot5.setOutlineVisible(true);
        boolean boolean10 = piePlot5.getSectionOutlinesVisible();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator11 = piePlot5.getLegendLabelGenerator();
        piePlot0.setLegendLabelToolTipGenerator(pieSectionLabelGenerator11);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.14d + "'", double2 == 0.14d);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.14d + "'", double6 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator11);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createAreaChart("Pie Plot", "hi!", "Pie Plot", categoryDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        piePlot0.setForegroundAlpha((float) (short) 0);
        boolean boolean4 = piePlot0.getIgnoreNullValues();
        org.jfree.data.xy.WindDataset windDataset8 = null;
        org.jfree.chart.JFreeChart jFreeChart12 = org.jfree.chart.ChartFactory.createWindPlot("", "hi!", "Pie Plot", windDataset8, true, true, true);
        piePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart12);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jFreeChart12);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart3D("Pie Plot", "", "", categoryDataset3, plotOrientation4, true, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jfree.data.category.IntervalCategoryDataset intervalCategoryDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createGanttChart("", "", "hi!", intervalCategoryDataset3, true, true, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        piePlot1.setLabelGap(0.025d);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14d + "'", double9 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.14d + "'", double8 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-5d + "'", double10 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator23 = piePlot0.getLabelGenerator();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(paint18);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator23);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("hi!", "hi!", "Pie Plot", windDataset3, true, true, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator23 = piePlot0.getLegendLabelURLGenerator();
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
        org.junit.Assert.assertNull(pieURLGenerator23);
        org.junit.Assert.assertNull(pieToolTipGenerator24);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator25 = null;
        piePlot0.setURLGenerator(pieURLGenerator25);
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
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = piePlot0.getDrawingSupplier();
        piePlot0.setLabelLinksVisible(true);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(drawingSupplier5);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.jfree.data.xy.TableXYDataset tableXYDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createStackedXYAreaChart("Pie Plot", "", "", tableXYDataset3, plotOrientation4, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart("", "hi!", "hi!", categoryDataset3, plotOrientation4, false, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setInteriorGap((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (100.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-5d + "'", double7 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets10);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.data.general.PieDataset pieDataset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart10 = org.jfree.chart.ChartFactory.createPieChart("hi!", pieDataset1, pieDataset2, (int) (short) 1, false, false, false, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        org.jfree.data.general.DatasetGroup datasetGroup22 = piePlot0.getDatasetGroup();
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setInteriorGap((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (-1.0) argument.");
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
        org.junit.Assert.assertNull(pieURLGenerator17);
        org.junit.Assert.assertNull(datasetGroup22);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        piePlot0.drawBackgroundImage(graphics2D4, rectangle2D5);
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) false);
        boolean boolean9 = piePlot0.isOutlineVisible();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        java.lang.Class<?> wildcardClass22 = piePlot0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        float float11 = piePlot0.getBackgroundAlpha();
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerXYDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("Pie Plot", "", "Pie Plot", boxAndWhiskerXYDataset3, false);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jfree.data.xy.IntervalXYDataset intervalXYDataset4 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart9 = org.jfree.chart.ChartFactory.createXYBarChart("hi!", "", true, "", intervalXYDataset4, plotOrientation5, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        piePlot0.setIgnoreNullValues(false);
        java.awt.Stroke stroke7 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot0.setLabelLinkStroke(stroke7);
        boolean boolean9 = piePlot0.isOutlineVisible();
        org.jfree.chart.plot.Plot plot10 = piePlot0.getRootPlot();
        double double11 = piePlot0.getShadowYOffset();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(plot10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 4.0d + "'", double11 == 4.0d);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createBarChart3D("hi!", "hi!", "", categoryDataset3, plotOrientation4, true, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart3D("hi!", "", "", categoryDataset3, plotOrientation4, false, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        org.jfree.data.statistics.BoxAndWhiskerCategoryDataset boxAndWhiskerCategoryDataset5 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createBoxAndWhiskerChart("", "", "", boxAndWhiskerCategoryDataset5, false);
        piePlot0.removeChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart7);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.JFreeChart jFreeChart14 = org.jfree.chart.ChartFactory.createPieChart("", pieDataset10, false, true, true);
        piePlot0.addChangeListener((org.jfree.chart.event.PlotChangeListener) jFreeChart14);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertNotNull(jFreeChart7);
        org.junit.Assert.assertNotNull(jFreeChart14);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator1 = piePlot0.getLegendLabelGenerator();
        piePlot0.setOutlineVisible(true);
        piePlot0.setLabelLinkMargin((double) (short) -1);
        piePlot0.setForegroundAlpha(1.0f);
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator11 = piePlot10.getLegendLabelGenerator();
        piePlot10.setOutlineVisible(true);
        piePlot10.setLabelLinkMargin((double) (short) -1);
        piePlot10.setForegroundAlpha(1.0f);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState20 = piePlot0.initialise(graphics2D8, rectangle2D9, piePlot10, (java.lang.Integer) 10, plotRenderingInfo19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator11);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createRingChart("hi!", pieDataset1, true, true, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup2 = piePlot0.getDatasetGroup();
        java.awt.Paint paint3 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot0.setNoDataMessagePaint(paint3);
        org.jfree.chart.plot.PiePlot piePlot5 = new org.jfree.chart.plot.PiePlot();
        double double6 = piePlot5.getMaximumLabelWidth();
        org.jfree.data.general.DatasetGroup datasetGroup7 = piePlot5.getDatasetGroup();
        java.awt.Paint paint8 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot5.setNoDataMessagePaint(paint8);
        double double11 = piePlot5.getExplodePercent((java.lang.Comparable) (-1));
        org.jfree.chart.plot.PiePlot piePlot12 = new org.jfree.chart.plot.PiePlot();
        double double14 = piePlot12.getExplodePercent((java.lang.Comparable) 0);
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        piePlot15.setDataset(pieDataset16);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator18 = piePlot15.getURLGenerator();
        org.jfree.chart.plot.Plot plot19 = piePlot15.getRootPlot();
        java.awt.Stroke stroke20 = piePlot15.getLabelOutlineStroke();
        java.awt.Shape shape21 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot15.setLegendItemShape(shape21);
        java.awt.Stroke stroke23 = piePlot15.getLabelLinkStroke();
        org.jfree.chart.plot.PiePlot piePlot24 = new org.jfree.chart.plot.PiePlot();
        double double25 = piePlot24.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor26 = piePlot24.getLabelDistributor();
        double double27 = piePlot24.getMinimumArcAngleToDraw();
        java.awt.Paint paint28 = piePlot24.getBaseSectionOutlinePaint();
        double double29 = piePlot24.getShadowYOffset();
        piePlot24.setBackgroundImageAlignment((int) (byte) -1);
        double double32 = piePlot24.getInteriorGap();
        java.awt.Font font33 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot24.setNoDataMessageFont(font33);
        piePlot15.setLabelFont(font33);
        piePlot12.setLabelFont(font33);
        piePlot5.setNoDataMessageFont(font33);
        piePlot0.setLabelFont(font33);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.14d + "'", double6 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(pieURLGenerator18);
        org.junit.Assert.assertNotNull(plot19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.14d + "'", double25 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0E-5d + "'", double27 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 4.0d + "'", double29 == 4.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.08d + "'", double32 == 0.08d);
        org.junit.Assert.assertNotNull(font33);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.jfree.data.xy.OHLCDataset oHLCDataset3 = null;
        org.jfree.chart.axis.Timeline timeline4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart6 = org.jfree.chart.ChartFactory.createHighLowChart("", "", "", oHLCDataset3, timeline4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        org.jfree.chart.plot.Plot plot15 = piePlot14.getParent();
        boolean boolean16 = piePlot14.isCircular();
        java.awt.Paint paint17 = piePlot14.getLabelBackgroundPaint();
        piePlot0.setLabelPaint(paint17);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
        org.junit.Assert.assertNotNull(jFreeChart10);
        org.junit.Assert.assertNull(plot15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
        org.jfree.chart.plot.PiePlot piePlot10 = new org.jfree.chart.plot.PiePlot();
        double double11 = piePlot10.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor12 = piePlot10.getLabelDistributor();
        double double13 = piePlot10.getMinimumArcAngleToDraw();
        boolean boolean14 = piePlot10.getIgnoreZeroValues();
        org.jfree.chart.plot.Plot plot15 = piePlot10.getRootPlot();
        org.jfree.chart.plot.PiePlot piePlot16 = new org.jfree.chart.plot.PiePlot();
        double double17 = piePlot16.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor18 = piePlot16.getLabelDistributor();
        double double19 = piePlot16.getMinimumArcAngleToDraw();
        java.awt.Paint paint20 = piePlot16.getBaseSectionOutlinePaint();
        double double21 = piePlot16.getShadowYOffset();
        piePlot16.setBackgroundImageAlignment((int) (byte) -1);
        java.awt.Paint paint24 = piePlot16.getLabelPaint();
        piePlot10.setShadowPaint(paint24);
        java.awt.Paint paint26 = piePlot10.getLabelBackgroundPaint();
        org.jfree.chart.plot.PiePlot piePlot27 = new org.jfree.chart.plot.PiePlot();
        double double28 = piePlot27.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor29 = piePlot27.getLabelDistributor();
        double double30 = piePlot27.getMinimumArcAngleToDraw();
        java.awt.Paint paint31 = piePlot27.getBaseSectionOutlinePaint();
        double double32 = piePlot27.getShadowYOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = piePlot27.getSimpleLabelOffset();
        java.awt.Stroke stroke34 = piePlot27.getLabelLinkStroke();
        piePlot10.setBaseSectionOutlineStroke(stroke34);
        piePlot0.setLabelOutlineStroke(stroke34);
        org.junit.Assert.assertNull(pieURLGenerator3);
        org.junit.Assert.assertNotNull(plot4);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(rectangleInsets9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.14d + "'", double11 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-5d + "'", double13 == 1.0E-5d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(plot15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.14d + "'", double17 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0E-5d + "'", double19 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 4.0d + "'", double21 == 4.0d);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.14d + "'", double28 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0E-5d + "'", double30 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 4.0d + "'", double32 == 4.0d);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertNotNull(stroke34);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart3D("", pieDataset1, true, true, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jfree.data.general.PieDataset pieDataset1 = null;
        java.util.Locale locale4 = null;
        org.jfree.chart.JFreeChart jFreeChart5 = org.jfree.chart.ChartFactory.createPieChart3D("", pieDataset1, true, false, locale4);
        org.junit.Assert.assertNotNull(jFreeChart5);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.JFreeChart jFreeChart8 = org.jfree.chart.ChartFactory.createLineChart("hi!", "hi!", "", categoryDataset3, plotOrientation4, true, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        java.awt.Paint paint20 = piePlot0.getBaseSectionPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator21 = piePlot0.getLegendLabelURLGenerator();
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
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(pieURLGenerator21);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jfree.data.xy.WindDataset windDataset3 = null;
        org.jfree.chart.JFreeChart jFreeChart7 = org.jfree.chart.ChartFactory.createWindPlot("Pie Plot", "", "Pie Plot", windDataset3, true, true, true);
        org.junit.Assert.assertNotNull(jFreeChart7);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jfree.chart.plot.PiePlot piePlot0 = new org.jfree.chart.plot.PiePlot();
        double double1 = piePlot0.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor2 = piePlot0.getLabelDistributor();
        double double3 = piePlot0.getMinimumArcAngleToDraw();
        java.awt.Paint paint4 = piePlot0.getBaseSectionOutlinePaint();
        double double5 = piePlot0.getShadowYOffset();
        java.awt.Paint paint6 = piePlot0.getLabelPaint();
        java.awt.Paint paint8 = piePlot0.getSectionPaint((java.lang.Comparable) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            piePlot0.setInteriorGap((double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (100.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-5d + "'", double3 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(paint8);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        java.awt.Paint paint14 = piePlot0.getLabelLinkPaint();
        piePlot0.setPieIndex((int) (short) -1);
        java.awt.Paint paint17 = piePlot0.getLabelPaint();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.14d + "'", double1 == 0.14d);
        org.junit.Assert.assertNull(datasetGroup2);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertNotNull(plot9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(rotation12);
        org.junit.Assert.assertNotNull(rotation13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.plot.PiePlot piePlot15 = new org.jfree.chart.plot.PiePlot();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        piePlot15.setDataset(pieDataset16);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator18 = piePlot15.getURLGenerator();
        piePlot15.setPieIndex((int) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator21 = piePlot15.getLegendLabelToolTipGenerator();
        double double22 = piePlot15.getShadowXOffset();
        piePlot15.setLabelLinkMargin((double) (short) 0);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState27 = piePlot0.initialise(graphics2D13, rectangle2D14, piePlot15, (java.lang.Integer) 0, plotRenderingInfo26);
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
        org.junit.Assert.assertNull(pieURLGenerator18);
        org.junit.Assert.assertNull(pieSectionLabelGenerator21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 4.0d + "'", double22 == 4.0d);
    }
}

