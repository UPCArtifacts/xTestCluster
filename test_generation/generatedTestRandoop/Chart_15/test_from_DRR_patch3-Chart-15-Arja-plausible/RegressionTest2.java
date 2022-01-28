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
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint5 = piePlot3D1.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setShadowPaint(paint10);
        java.awt.Paint paint13 = piePlot3D1.getBaseSectionPaint();
        piePlot3D1.setDarkerSides(true);
        piePlot3D1.setShadowXOffset((double) (short) -1);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent18 = null;
        piePlot3D1.notifyListeners(plotChangeEvent18);
        org.jfree.data.general.DatasetGroup datasetGroup20 = piePlot3D1.getDatasetGroup();
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(datasetGroup20);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        java.lang.String str13 = piePlot3D1.getPlotType();
        piePlot3D1.setLabelLinkMargin(0.0d);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D(pieDataset16);
        piePlot3D17.setBackgroundImageAlignment(1);
        boolean boolean20 = piePlot3D17.getSectionOutlinesVisible();
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        piePlot3D17.addChangeListener(plotChangeListener21);
        boolean boolean23 = piePlot3D1.equals((java.lang.Object) piePlot3D17);
        boolean boolean24 = piePlot3D17.isOutlineVisible();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator25 = piePlot3D17.getURLGenerator();
        java.awt.Stroke stroke26 = piePlot3D17.getLabelOutlineStroke();
        piePlot3D17.setIgnoreNullValues(false);
        java.awt.Stroke stroke30 = piePlot3D17.getSectionOutlineStroke((java.lang.Comparable) 1);
        java.lang.String str31 = piePlot3D17.getNoDataMessage();
        java.awt.Graphics2D graphics2D32 = null;
        java.awt.geom.Rectangle2D rectangle2D33 = null;
        org.jfree.data.general.PieDataset pieDataset34 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D35 = new org.jfree.chart.plot.PiePlot3D(pieDataset34);
        piePlot3D35.setBackgroundImageAlignment(1);
        boolean boolean38 = piePlot3D35.getSectionOutlinesVisible();
        double double39 = piePlot3D35.getMaximumLabelWidth();
        piePlot3D35.setCircular(false, true);
        org.jfree.data.general.PieDataset pieDataset43 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D44 = new org.jfree.chart.plot.PiePlot3D(pieDataset43);
        piePlot3D44.setBackgroundImageAlignment(1);
        java.awt.Paint paint47 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D44.setNoDataMessagePaint(paint47);
        org.jfree.data.general.PieDataset pieDataset49 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D50 = new org.jfree.chart.plot.PiePlot3D(pieDataset49);
        piePlot3D50.setBackgroundImageAlignment(1);
        java.awt.Paint paint53 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D50.setNoDataMessagePaint(paint53);
        piePlot3D44.setBaseSectionOutlinePaint(paint53);
        org.jfree.chart.util.RectangleInsets rectangleInsets56 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D44.setInsets(rectangleInsets56, false);
        piePlot3D35.setInsets(rectangleInsets56);
        piePlot3D35.setLabelLinkMargin((double) 1L);
        piePlot3D35.setOutlineVisible(false);
        java.awt.Font font64 = piePlot3D35.getNoDataMessageFont();
        double double65 = piePlot3D35.getInteriorGap();
        piePlot3D35.setCircular(true);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo69 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState70 = piePlot3D17.initialise(graphics2D32, rectangle2D33, (org.jfree.chart.plot.PiePlot) piePlot3D35, (java.lang.Integer) 10, plotRenderingInfo69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pie 3D Plot" + "'", str13, "Pie 3D Plot");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(pieURLGenerator25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNull(stroke30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.14d + "'", double39 == 0.14d);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertNotNull(rectangleInsets56);
        org.junit.Assert.assertNotNull(font64);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.08d + "'", double65 == 0.08d);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot3D1.getLegendLabelURLGenerator();
        java.awt.Stroke stroke7 = null;
        piePlot3D1.setLabelOutlineStroke(stroke7);
        boolean boolean9 = piePlot3D1.getSectionOutlinesVisible();
        piePlot3D1.setIgnoreZeroValues(false);
        piePlot3D1.setMaximumLabelWidth((double) '4');
        boolean boolean14 = piePlot3D1.isOutlineVisible();
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D(pieDataset15);
        piePlot3D16.setBackgroundImageAlignment(1);
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D16.setLabelOutlinePaint(paint19);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator21 = piePlot3D16.getLegendLabelURLGenerator();
        double double22 = piePlot3D16.getInteriorGap();
        java.awt.Shape shape23 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot3D16.setLegendItemShape(shape23);
        java.awt.Paint paint26 = piePlot3D16.getSectionPaint((java.lang.Comparable) (-1L));
        boolean boolean27 = piePlot3D16.getLabelLinksVisible();
        java.lang.Object obj28 = piePlot3D16.clone();
        piePlot3D16.setBackgroundImageAlignment((int) 'a');
        java.awt.Paint paint32 = piePlot3D16.getSectionOutlinePaint((java.lang.Comparable) (short) 1);
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D34 = new org.jfree.chart.plot.PiePlot3D(pieDataset33);
        piePlot3D34.setBackgroundImageAlignment(1);
        boolean boolean37 = piePlot3D34.getSectionOutlinesVisible();
        double double38 = piePlot3D34.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator39 = piePlot3D34.getLegendLabelGenerator();
        java.awt.Font font40 = piePlot3D34.getLabelFont();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo43 = null;
        piePlot3D34.handleClick((int) ' ', (int) ' ', plotRenderingInfo43);
        org.jfree.data.general.PieDataset pieDataset45 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D46 = new org.jfree.chart.plot.PiePlot3D(pieDataset45);
        piePlot3D46.setBackgroundImageAlignment(1);
        java.awt.Paint paint49 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D46.setLabelOutlinePaint(paint49);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator51 = piePlot3D46.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset52 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D53 = new org.jfree.chart.plot.PiePlot3D(pieDataset52);
        piePlot3D53.setBackgroundImageAlignment(1);
        java.awt.Paint paint56 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D53.setNoDataMessagePaint(paint56);
        piePlot3D46.setBaseSectionPaint(paint56);
        piePlot3D34.setLabelBackgroundPaint(paint56);
        java.awt.Paint paint60 = piePlot3D34.getNoDataMessagePaint();
        org.jfree.data.general.PieDataset pieDataset61 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D62 = new org.jfree.chart.plot.PiePlot3D(pieDataset61);
        piePlot3D62.setBackgroundImageAlignment(1);
        boolean boolean65 = piePlot3D62.getSectionOutlinesVisible();
        double double66 = piePlot3D62.getMaximumLabelWidth();
        piePlot3D62.setShadowXOffset((double) (byte) 10);
        boolean boolean69 = piePlot3D62.getSimpleLabels();
        java.awt.Stroke stroke70 = null;
        piePlot3D62.setLabelOutlineStroke(stroke70);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator72 = null;
        piePlot3D62.setToolTipGenerator(pieToolTipGenerator72);
        piePlot3D62.setOutlineVisible(false);
        org.jfree.data.general.PieDataset pieDataset76 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D77 = new org.jfree.chart.plot.PiePlot3D(pieDataset76);
        piePlot3D77.setBackgroundImageAlignment(1);
        java.awt.Paint paint80 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D77.setLabelOutlinePaint(paint80);
        piePlot3D77.setBackgroundAlpha(0.0f);
        piePlot3D77.setBackgroundAlpha((float) 0L);
        double double87 = piePlot3D77.getExplodePercent((java.lang.Comparable) 10.0f);
        java.awt.Paint paint88 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot3D77.setBaseSectionOutlinePaint(paint88);
        piePlot3D62.setBaseSectionOutlinePaint(paint88);
        org.jfree.chart.util.RectangleInsets rectangleInsets91 = piePlot3D62.getLabelPadding();
        piePlot3D34.setInsets(rectangleInsets91);
        java.awt.Paint paint93 = piePlot3D34.getBackgroundPaint();
        piePlot3D16.setBaseSectionOutlinePaint(paint93);
        piePlot3D1.setLabelOutlinePaint(paint93);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(pieURLGenerator21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.08d + "'", double22 == 0.08d);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNull(paint32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.14d + "'", double38 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator39);
        org.junit.Assert.assertNotNull(font40);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNull(pieURLGenerator51);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNotNull(paint60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.14d + "'", double66 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(paint80);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.0d + "'", double87 == 0.0d);
        org.junit.Assert.assertNotNull(paint88);
        org.junit.Assert.assertNotNull(rectangleInsets91);
        org.junit.Assert.assertNotNull(paint93);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot3D1.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D(pieDataset7);
        piePlot3D8.setBackgroundImageAlignment(1);
        java.awt.Paint paint11 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D8.setNoDataMessagePaint(paint11);
        piePlot3D1.setBaseSectionPaint(paint11);
        java.lang.String str14 = piePlot3D1.getNoDataMessage();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot3D1.getSimpleLabelOffset();
        java.awt.Paint paint16 = piePlot3D1.getShadowPaint();
        java.awt.Font font17 = piePlot3D1.getLabelFont();
        java.awt.Paint paint18 = piePlot3D1.getShadowPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = piePlot3D1.getLabelPadding();
        piePlot3D1.setBackgroundImageAlpha((float) (byte) 0);
        piePlot3D1.setInteriorGap(0.0d);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D(pieDataset15);
        piePlot3D16.setBackgroundImageAlignment(1);
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D16.setLabelOutlinePaint(paint19);
        piePlot3D16.setBackgroundAlpha(0.0f);
        piePlot3D16.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint25 = piePlot3D16.getLabelShadowPaint();
        piePlot3D16.setStartAngle((double) (short) 0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator28 = null;
        piePlot3D16.setURLGenerator(pieURLGenerator28);
        piePlot3D16.setCircular(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D16.setInsets(rectangleInsets32, true);
        java.lang.Object obj35 = piePlot3D16.clone();
        org.jfree.chart.LegendItemCollection legendItemCollection36 = piePlot3D16.getLegendItems();
        org.jfree.data.general.PieDataset pieDataset37 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D38 = new org.jfree.chart.plot.PiePlot3D(pieDataset37);
        piePlot3D38.setBackgroundImageAlignment(1);
        java.awt.Paint paint41 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D38.setLabelOutlinePaint(paint41);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator43 = piePlot3D38.getLegendLabelURLGenerator();
        java.awt.Stroke stroke44 = null;
        piePlot3D38.setLabelOutlineStroke(stroke44);
        org.jfree.data.general.PieDataset pieDataset46 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D47 = new org.jfree.chart.plot.PiePlot3D(pieDataset46);
        piePlot3D47.setBackgroundImageAlignment(1);
        java.awt.Paint paint50 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D47.setLabelOutlinePaint(paint50);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator52 = piePlot3D47.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset53 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D54 = new org.jfree.chart.plot.PiePlot3D(pieDataset53);
        piePlot3D54.setBackgroundImageAlignment(1);
        java.awt.Paint paint57 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D54.setNoDataMessagePaint(paint57);
        piePlot3D47.setBaseSectionPaint(paint57);
        java.lang.String str60 = piePlot3D47.getNoDataMessage();
        org.jfree.chart.util.RectangleInsets rectangleInsets61 = piePlot3D47.getSimpleLabelOffset();
        piePlot3D38.setSimpleLabelOffset(rectangleInsets61);
        piePlot3D16.setLabelPadding(rectangleInsets61);
        piePlot3D1.setInsets(rectangleInsets61);
        piePlot3D1.setLabelGap((double) (byte) -1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(rectangleInsets32);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(legendItemCollection36);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNull(pieURLGenerator43);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNull(pieURLGenerator52);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(rectangleInsets61);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D1.getLegendLabelGenerator();
        java.awt.Font font7 = piePlot3D1.getLabelFont();
        piePlot3D1.setMinimumArcAngleToDraw(100.0d);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D(pieDataset10);
        piePlot3D11.setBackgroundImageAlignment(1);
        java.awt.Paint paint15 = piePlot3D11.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D(pieDataset16);
        piePlot3D17.setBackgroundImageAlignment(1);
        java.awt.Paint paint20 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D17.setNoDataMessagePaint(paint20);
        piePlot3D11.setShadowPaint(paint20);
        java.lang.Object obj23 = piePlot3D11.clone();
        piePlot3D11.setMinimumArcAngleToDraw(1.0d);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator26 = null;
        piePlot3D11.setToolTipGenerator(pieToolTipGenerator26);
        java.awt.Stroke stroke28 = piePlot3D11.getOutlineStroke();
        piePlot3D1.setOutlineStroke(stroke28);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator30 = null;
        piePlot3D1.setLegendLabelURLGenerator(pieURLGenerator30);
        java.lang.String str32 = piePlot3D1.getPlotType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Pie 3D Plot" + "'", str32, "Pie 3D Plot");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint5 = piePlot3D1.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setShadowPaint(paint10);
        java.awt.Paint paint13 = piePlot3D1.getBaseSectionPaint();
        java.awt.Shape shape14 = piePlot3D1.getLegendItemShape();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = piePlot3D1.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(shape14);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setCircular(false, true);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D(pieDataset9);
        piePlot3D10.setBackgroundImageAlignment(1);
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D10.setNoDataMessagePaint(paint13);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D(pieDataset15);
        piePlot3D16.setBackgroundImageAlignment(1);
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D16.setNoDataMessagePaint(paint19);
        piePlot3D10.setBaseSectionOutlinePaint(paint19);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setInsets(rectangleInsets22, false);
        piePlot3D1.setInsets(rectangleInsets22);
        piePlot3D1.setLabelLinkMargin((double) 1L);
        piePlot3D1.setOutlineVisible(false);
        java.awt.Paint paint30 = piePlot3D1.getBaseSectionOutlinePaint();
        piePlot3D1.setBackgroundImageAlpha((float) 0L);
        piePlot3D1.setSectionOutlinesVisible(true);
        double double35 = piePlot3D1.getInteriorGap();
        org.jfree.chart.util.RectangleInsets rectangleInsets36 = piePlot3D1.getSimpleLabelOffset();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.08d + "'", double35 == 0.08d);
        org.junit.Assert.assertNotNull(rectangleInsets36);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setShadowXOffset((double) (byte) 10);
        boolean boolean8 = piePlot3D1.getSimpleLabels();
        org.jfree.chart.util.Rotation rotation9 = piePlot3D1.getDirection();
        piePlot3D1.setInteriorGap(0.025d);
        piePlot3D1.setPieIndex((int) (short) 1);
        piePlot3D1.setIgnoreNullValues(true);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D(pieDataset16);
        piePlot3D17.setBackgroundImageAlignment(1);
        java.awt.Paint paint21 = piePlot3D17.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D23 = new org.jfree.chart.plot.PiePlot3D(pieDataset22);
        piePlot3D23.setBackgroundImageAlignment(1);
        java.awt.Paint paint26 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D23.setNoDataMessagePaint(paint26);
        piePlot3D17.setShadowPaint(paint26);
        java.lang.Object obj29 = piePlot3D17.clone();
        piePlot3D17.setMinimumArcAngleToDraw(1.0d);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator32 = null;
        piePlot3D17.setToolTipGenerator(pieToolTipGenerator32);
        java.awt.Stroke stroke34 = piePlot3D17.getOutlineStroke();
        java.awt.Paint paint35 = piePlot3D17.getBaseSectionPaint();
        piePlot3D17.setPieIndex((int) (byte) 1);
        java.awt.Font font38 = piePlot3D17.getLabelFont();
        piePlot3D1.setNoDataMessageFont(font38);
        piePlot3D1.setDepthFactor((double) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rotation9);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(font38);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint10 = piePlot3D1.getLabelShadowPaint();
        piePlot3D1.setStartAngle((double) (short) 0);
        piePlot3D1.setIgnoreNullValues(false);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot3D1.getSimpleLabelOffset();
        boolean boolean16 = piePlot3D1.isCircular();
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D(pieDataset18);
        piePlot3D19.setBackgroundImageAlignment(1);
        java.awt.Paint paint23 = piePlot3D19.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D(pieDataset24);
        piePlot3D25.setBackgroundImageAlignment(1);
        java.awt.Paint paint28 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D25.setNoDataMessagePaint(paint28);
        piePlot3D19.setShadowPaint(paint28);
        java.awt.Paint paint31 = piePlot3D19.getBaseSectionOutlinePaint();
        java.awt.Paint paint32 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D19.setBaseSectionPaint(paint32);
        org.jfree.chart.event.PlotChangeListener plotChangeListener34 = null;
        piePlot3D19.addChangeListener(plotChangeListener34);
        org.jfree.data.general.PieDataset pieDataset36 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D37 = new org.jfree.chart.plot.PiePlot3D(pieDataset36);
        piePlot3D37.setBackgroundImageAlignment(1);
        boolean boolean40 = piePlot3D37.getSectionOutlinesVisible();
        double double41 = piePlot3D37.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator42 = piePlot3D37.getLegendLabelGenerator();
        java.awt.Font font43 = piePlot3D37.getLabelFont();
        piePlot3D37.setMinimumArcAngleToDraw(100.0d);
        java.awt.Paint paint46 = piePlot3D37.getLabelPaint();
        java.awt.Stroke stroke47 = piePlot3D37.getBaseSectionOutlineStroke();
        piePlot3D19.setOutlineStroke(stroke47);
        piePlot3D1.setSectionOutlineStroke((java.lang.Comparable) true, stroke47);
        java.awt.Paint paint50 = piePlot3D1.getBaseSectionOutlinePaint();
        boolean boolean51 = piePlot3D1.getDarkerSides();
        org.jfree.chart.util.Rotation rotation52 = piePlot3D1.getDirection();
        boolean boolean53 = piePlot3D1.getSectionOutlinesVisible();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.14d + "'", double41 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator42);
        org.junit.Assert.assertNotNull(font43);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(stroke47);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(rotation52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot3D1.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D(pieDataset7);
        piePlot3D8.setBackgroundImageAlignment(1);
        java.awt.Paint paint11 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D8.setNoDataMessagePaint(paint11);
        piePlot3D1.setBaseSectionPaint(paint11);
        java.lang.String str14 = piePlot3D1.getNoDataMessage();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot3D1.getSimpleLabelOffset();
        piePlot3D1.setShadowYOffset((-1.0d));
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator18 = piePlot3D1.getURLGenerator();
        java.awt.Stroke stroke19 = piePlot3D1.getLabelOutlineStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNull(pieURLGenerator18);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        double double10 = piePlot3D1.getLabelGap();
        piePlot3D1.setIgnoreNullValues(true);
        piePlot3D1.setExplodePercent((java.lang.Comparable) 0.0d, 1.0d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.025d + "'", double10 == 0.025d);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setShadowXOffset((double) (byte) 10);
        boolean boolean8 = piePlot3D1.getSimpleLabels();
        java.awt.Stroke stroke9 = null;
        piePlot3D1.setLabelOutlineStroke(stroke9);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator11 = null;
        piePlot3D1.setToolTipGenerator(pieToolTipGenerator11);
        piePlot3D1.setSimpleLabels(true);
        float float15 = piePlot3D1.getBackgroundImageAlpha();
        piePlot3D1.setMaximumLabelWidth(1.0d);
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D(pieDataset18);
        piePlot3D19.setBackgroundImageAlignment(1);
        boolean boolean22 = piePlot3D19.getSectionOutlinesVisible();
        double double23 = piePlot3D19.getMaximumLabelWidth();
        piePlot3D19.setShadowXOffset((double) (byte) 10);
        boolean boolean26 = piePlot3D19.getSimpleLabels();
        java.awt.Stroke stroke27 = null;
        piePlot3D19.setLabelOutlineStroke(stroke27);
        boolean boolean29 = piePlot3D19.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset30 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D31 = new org.jfree.chart.plot.PiePlot3D(pieDataset30);
        piePlot3D31.setBackgroundImageAlignment(1);
        java.awt.Paint paint34 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D31.setLabelOutlinePaint(paint34);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator36 = piePlot3D31.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset37 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D38 = new org.jfree.chart.plot.PiePlot3D(pieDataset37);
        piePlot3D38.setBackgroundImageAlignment(1);
        java.awt.Paint paint41 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D38.setNoDataMessagePaint(paint41);
        piePlot3D31.setBaseSectionPaint(paint41);
        java.lang.String str44 = piePlot3D31.getNoDataMessage();
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = piePlot3D31.getSimpleLabelOffset();
        piePlot3D31.setShadowYOffset((-1.0d));
        java.awt.Paint paint48 = piePlot3D31.getShadowPaint();
        piePlot3D19.setNoDataMessagePaint(paint48);
        java.awt.Image image50 = piePlot3D19.getBackgroundImage();
        double double51 = piePlot3D19.getDepthFactor();
        piePlot3D19.setCircular(false);
        org.jfree.data.general.PieDataset pieDataset54 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D55 = new org.jfree.chart.plot.PiePlot3D(pieDataset54);
        piePlot3D55.setBackgroundImageAlignment(1);
        boolean boolean58 = piePlot3D55.getSectionOutlinesVisible();
        double double59 = piePlot3D55.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator60 = piePlot3D55.getLegendLabelGenerator();
        java.awt.Font font61 = piePlot3D55.getLabelFont();
        piePlot3D55.setMinimumArcAngleToDraw(100.0d);
        java.awt.Paint paint64 = piePlot3D55.getLabelPaint();
        piePlot3D55.setDepthFactor((double) (byte) 10);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator67 = piePlot3D55.getLegendLabelGenerator();
        piePlot3D19.setLegendLabelToolTipGenerator(pieSectionLabelGenerator67);
        piePlot3D1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator67);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.14d + "'", double23 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNull(pieURLGenerator36);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(rectangleInsets45);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNull(image50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.12d + "'", double51 == 0.12d);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.14d + "'", double59 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator60);
        org.junit.Assert.assertNotNull(font61);
        org.junit.Assert.assertNotNull(paint64);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator67);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        java.awt.Paint paint7 = piePlot3D1.getSectionPaint((java.lang.Comparable) 1.0d);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = null;
        piePlot3D1.setDrawingSupplier(drawingSupplier8);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier10 = piePlot3D1.getDrawingSupplier();
        java.awt.Stroke stroke11 = piePlot3D1.getOutlineStroke();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(drawingSupplier10);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        double double10 = piePlot3D1.getLabelGap();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        piePlot3D1.handleClick((int) (byte) 100, (int) (byte) 1, plotRenderingInfo13);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        piePlot3D1.drawBackgroundImage(graphics2D15, rectangle2D16);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor18 = piePlot3D1.getLabelDistributor();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        piePlot3D1.notifyListeners(plotChangeEvent19);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator21 = null;
        piePlot3D1.setLegendLabelURLGenerator(pieURLGenerator21);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D(pieDataset24);
        piePlot3D25.setBackgroundImageAlignment(1);
        java.awt.Paint paint28 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D25.setNoDataMessagePaint(paint28);
        org.jfree.data.general.PieDataset pieDataset30 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D31 = new org.jfree.chart.plot.PiePlot3D(pieDataset30);
        piePlot3D31.setBackgroundImageAlignment(1);
        java.awt.Paint paint34 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D31.setNoDataMessagePaint(paint34);
        piePlot3D25.setBaseSectionOutlinePaint(paint34);
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D25.setInsets(rectangleInsets37, false);
        java.awt.Stroke stroke41 = null;
        piePlot3D25.setSectionOutlineStroke((java.lang.Comparable) 1.0f, stroke41);
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D25.setInsets(rectangleInsets43, true);
        piePlot3D25.setShadowYOffset(90.0d);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo50 = null;
        piePlot3D25.handleClick(0, 0, plotRenderingInfo50);
        java.awt.Paint paint52 = piePlot3D25.getLabelLinkPaint();
        piePlot3D1.setSectionOutlinePaint((java.lang.Comparable) 0.12d, paint52);
        java.awt.Paint paint54 = piePlot3D1.getBaseSectionOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.025d + "'", double10 == 0.025d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor18);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(rectangleInsets37);
        org.junit.Assert.assertNotNull(rectangleInsets43);
        org.junit.Assert.assertNotNull(paint52);
        org.junit.Assert.assertNotNull(paint54);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D1.getLegendLabelGenerator();
        java.awt.Font font7 = piePlot3D1.getLabelFont();
        piePlot3D1.setMinimumArcAngleToDraw(100.0d);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D(pieDataset10);
        piePlot3D11.setBackgroundImageAlignment(1);
        java.awt.Paint paint15 = piePlot3D11.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D(pieDataset16);
        piePlot3D17.setBackgroundImageAlignment(1);
        java.awt.Paint paint20 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D17.setNoDataMessagePaint(paint20);
        piePlot3D11.setShadowPaint(paint20);
        java.lang.Object obj23 = piePlot3D11.clone();
        piePlot3D11.setMinimumArcAngleToDraw(1.0d);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator26 = null;
        piePlot3D11.setToolTipGenerator(pieToolTipGenerator26);
        java.awt.Stroke stroke28 = piePlot3D11.getOutlineStroke();
        piePlot3D1.setOutlineStroke(stroke28);
        org.jfree.data.general.PieDataset pieDataset30 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D31 = new org.jfree.chart.plot.PiePlot3D(pieDataset30);
        piePlot3D31.setBackgroundImageAlignment(1);
        java.awt.Paint paint34 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D31.setLabelOutlinePaint(paint34);
        piePlot3D1.setLabelPaint(paint34);
        java.awt.Graphics2D graphics2D37 = null;
        java.awt.geom.Rectangle2D rectangle2D38 = null;
        piePlot3D1.drawBackgroundImage(graphics2D37, rectangle2D38);
        java.awt.Stroke stroke40 = piePlot3D1.getBaseSectionOutlineStroke();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent41 = null;
        piePlot3D1.notifyListeners(plotChangeEvent41);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor43 = piePlot3D1.getLabelDistributor();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor43);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        java.lang.String str13 = piePlot3D1.getPlotType();
        piePlot3D1.setLabelLinkMargin(0.0d);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D(pieDataset16);
        piePlot3D17.setBackgroundImageAlignment(1);
        boolean boolean20 = piePlot3D17.getSectionOutlinesVisible();
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        piePlot3D17.addChangeListener(plotChangeListener21);
        boolean boolean23 = piePlot3D1.equals((java.lang.Object) piePlot3D17);
        boolean boolean24 = piePlot3D17.isOutlineVisible();
        java.awt.Image image25 = piePlot3D17.getBackgroundImage();
        int int26 = piePlot3D17.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pie 3D Plot" + "'", str13, "Pie 3D Plot");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(image25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = piePlot3D1.getLabelPadding();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        piePlot3D1.axisChanged(axisChangeEvent11);
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D(pieDataset13);
        piePlot3D14.setBackgroundImageAlignment(1);
        java.awt.Paint paint17 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D14.setNoDataMessagePaint(paint17);
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D(pieDataset19);
        piePlot3D20.setBackgroundImageAlignment(1);
        java.awt.Paint paint23 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D20.setNoDataMessagePaint(paint23);
        piePlot3D14.setBaseSectionOutlinePaint(paint23);
        org.jfree.chart.util.RectangleInsets rectangleInsets26 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D14.setInsets(rectangleInsets26, false);
        double double30 = piePlot3D14.getExplodePercent((java.lang.Comparable) 10);
        double double31 = piePlot3D14.getLabelGap();
        org.jfree.chart.plot.Plot plot32 = piePlot3D14.getRootPlot();
        org.jfree.chart.LegendItemCollection legendItemCollection33 = piePlot3D14.getLegendItems();
        java.awt.Paint paint34 = piePlot3D14.getLabelOutlinePaint();
        piePlot3D1.setLabelPaint(paint34);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleInsets26);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.025d + "'", double31 == 0.025d);
        org.junit.Assert.assertNotNull(plot32);
        org.junit.Assert.assertNotNull(legendItemCollection33);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint10 = piePlot3D1.getLabelShadowPaint();
        java.awt.Paint paint11 = piePlot3D1.getBackgroundPaint();
        java.awt.Paint paint12 = piePlot3D1.getBackgroundPaint();
        piePlot3D1.setCircular(false);
        boolean boolean15 = piePlot3D1.isOutlineVisible();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator16 = piePlot3D1.getToolTipGenerator();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent17 = null;
        piePlot3D1.markerChanged(markerChangeEvent17);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(pieToolTipGenerator16);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D1.getLegendLabelGenerator();
        java.awt.Font font7 = piePlot3D1.getLabelFont();
        piePlot3D1.setMinimumArcAngleToDraw(100.0d);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D(pieDataset10);
        piePlot3D11.setBackgroundImageAlignment(1);
        java.awt.Paint paint15 = piePlot3D11.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D(pieDataset16);
        piePlot3D17.setBackgroundImageAlignment(1);
        java.awt.Paint paint20 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D17.setNoDataMessagePaint(paint20);
        piePlot3D11.setShadowPaint(paint20);
        java.lang.Object obj23 = piePlot3D11.clone();
        piePlot3D11.setMinimumArcAngleToDraw(1.0d);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator26 = null;
        piePlot3D11.setToolTipGenerator(pieToolTipGenerator26);
        java.awt.Stroke stroke28 = piePlot3D11.getOutlineStroke();
        piePlot3D1.setOutlineStroke(stroke28);
        org.jfree.data.general.PieDataset pieDataset30 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D31 = new org.jfree.chart.plot.PiePlot3D(pieDataset30);
        piePlot3D31.setBackgroundImageAlignment(1);
        java.awt.Paint paint34 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D31.setLabelOutlinePaint(paint34);
        piePlot3D1.setLabelPaint(paint34);
        java.awt.Graphics2D graphics2D37 = null;
        java.awt.geom.Rectangle2D rectangle2D38 = null;
        piePlot3D1.drawBackgroundImage(graphics2D37, rectangle2D38);
        org.jfree.data.general.PieDataset pieDataset40 = piePlot3D1.getDataset();
        org.jfree.chart.plot.Plot plot41 = piePlot3D1.getParent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNull(pieDataset40);
        org.junit.Assert.assertNull(plot41);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint5 = piePlot3D1.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        piePlot3D1.setDataset(pieDataset6);
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D(pieDataset8);
        piePlot3D9.setBackgroundImageAlignment(1);
        java.awt.Paint paint12 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D9.setLabelOutlinePaint(paint12);
        piePlot3D9.setBackgroundAlpha(0.0f);
        piePlot3D9.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint18 = piePlot3D9.getLabelShadowPaint();
        java.awt.Paint paint19 = piePlot3D9.getBackgroundPaint();
        java.awt.Paint paint20 = piePlot3D9.getBackgroundPaint();
        piePlot3D1.setOutlinePaint(paint20);
        org.jfree.data.general.DatasetGroup datasetGroup22 = piePlot3D1.getDatasetGroup();
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(datasetGroup22);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot3D1.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D(pieDataset7);
        piePlot3D8.setBackgroundImageAlignment(1);
        java.awt.Paint paint11 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D8.setNoDataMessagePaint(paint11);
        piePlot3D1.setBaseSectionPaint(paint11);
        java.lang.String str14 = piePlot3D1.getNoDataMessage();
        java.awt.Stroke stroke16 = null;
        piePlot3D1.setSectionOutlineStroke((java.lang.Comparable) 0.025d, stroke16);
        org.jfree.chart.plot.Plot plot18 = piePlot3D1.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = piePlot3D1.getSimpleLabelOffset();
        java.awt.Stroke stroke20 = piePlot3D1.getLabelLinkStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(stroke20);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D1.getLegendLabelGenerator();
        java.awt.Font font7 = piePlot3D1.getLabelFont();
        piePlot3D1.setMinimumArcAngleToDraw(100.0d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator10 = piePlot3D1.getURLGenerator();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D(pieDataset11);
        piePlot3D12.setBackgroundImageAlignment(1);
        java.awt.Paint paint15 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D12.setLabelOutlinePaint(paint15);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator17 = piePlot3D12.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D(pieDataset18);
        piePlot3D19.setBackgroundImageAlignment(1);
        java.awt.Paint paint22 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D19.setNoDataMessagePaint(paint22);
        piePlot3D12.setBaseSectionPaint(paint22);
        java.lang.String str25 = piePlot3D12.getNoDataMessage();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent26 = null;
        piePlot3D12.notifyListeners(plotChangeEvent26);
        int int28 = piePlot3D12.getPieIndex();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent29 = null;
        piePlot3D12.notifyListeners(plotChangeEvent29);
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = piePlot3D12.getInsets();
        piePlot3D1.setInsets(rectangleInsets31, false);
        float float34 = piePlot3D1.getBackgroundImageAlpha();
        piePlot3D1.setMaximumLabelWidth((double) 1L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNull(pieURLGenerator10);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(pieURLGenerator17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.5f + "'", float34 == 0.5f);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        java.awt.Paint paint1 = piePlot3D0.getLabelLinkPaint();
        boolean boolean2 = piePlot3D0.getIgnoreZeroValues();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator10 = null;
        piePlot3D1.setLegendLabelURLGenerator(pieURLGenerator10);
        boolean boolean12 = piePlot3D1.getDarkerSides();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        piePlot3D1.setBackgroundImageAlpha((float) (byte) 1);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D(pieDataset12);
        piePlot3D13.setBackgroundImageAlignment(1);
        java.awt.Paint paint16 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D13.setNoDataMessagePaint(paint16);
        piePlot3D7.setBaseSectionOutlinePaint(paint16);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D7.setInsets(rectangleInsets19, false);
        piePlot3D1.setSimpleLabelOffset(rectangleInsets19);
        double double23 = piePlot3D1.getMinimumArcAngleToDraw();
        piePlot3D1.setExplodePercent((java.lang.Comparable) (short) 10, (double) 0);
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        piePlot3D1.drawBackgroundImage(graphics2D27, rectangle2D28);
        piePlot3D1.zoom((double) (short) 100);
        java.awt.Paint paint32 = piePlot3D1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0E-5d + "'", double23 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint32);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint10 = piePlot3D1.getLabelShadowPaint();
        piePlot3D1.setStartAngle((double) (short) 0);
        piePlot3D1.setIgnoreNullValues(false);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot3D1.getSimpleLabelOffset();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D(pieDataset16);
        piePlot3D17.setBackgroundImageAlignment(1);
        java.awt.Paint paint21 = piePlot3D17.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D23 = new org.jfree.chart.plot.PiePlot3D(pieDataset22);
        piePlot3D23.setBackgroundImageAlignment(1);
        java.awt.Paint paint26 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D23.setNoDataMessagePaint(paint26);
        piePlot3D17.setShadowPaint(paint26);
        java.lang.Object obj29 = piePlot3D17.clone();
        piePlot3D17.setMinimumArcAngleToDraw(1.0d);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator32 = null;
        piePlot3D17.setToolTipGenerator(pieToolTipGenerator32);
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = piePlot3D17.getLabelPadding();
        piePlot3D1.setLabelPadding(rectangleInsets34);
        java.awt.Font font36 = piePlot3D1.getLabelFont();
        double double37 = piePlot3D1.getStartAngle();
        java.awt.Paint paint38 = piePlot3D1.getLabelOutlinePaint();
        java.awt.Paint paint40 = piePlot3D1.getSectionPaint((java.lang.Comparable) "hi!");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(rectangleInsets34);
        org.junit.Assert.assertNotNull(font36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNull(paint40);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setDepthFactor(0.4d);
        java.awt.Image image8 = piePlot3D1.getBackgroundImage();
        piePlot3D1.setForegroundAlpha((-1.0f));
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot3D1.getInsets();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNull(image8);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D1.getLegendLabelGenerator();
        java.awt.Font font7 = piePlot3D1.getLabelFont();
        piePlot3D1.setMinimumArcAngleToDraw(100.0d);
        java.awt.Paint paint10 = piePlot3D1.getLabelPaint();
        piePlot3D1.setDepthFactor((double) (byte) 10);
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D1.drawBackground(graphics2D13, rectangle2D14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        java.awt.Paint paint6 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot3D1.setSectionOutlinePaint((java.lang.Comparable) "Pie 3D Plot", paint6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot3D1.getURLGenerator();
        double double9 = piePlot3D1.getMaximumLabelWidth();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D(pieDataset10);
        piePlot3D11.setBackgroundImageAlignment(1);
        java.awt.Paint paint14 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D11.setLabelOutlinePaint(paint14);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = piePlot3D11.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D(pieDataset17);
        piePlot3D18.setBackgroundImageAlignment(1);
        java.awt.Paint paint21 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D18.setNoDataMessagePaint(paint21);
        piePlot3D11.setBaseSectionPaint(paint21);
        java.lang.String str24 = piePlot3D11.getNoDataMessage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator25 = null;
        piePlot3D11.setLegendLabelURLGenerator(pieURLGenerator25);
        piePlot3D11.setShadowYOffset((double) 100L);
        java.awt.Font font29 = piePlot3D11.getNoDataMessageFont();
        java.awt.Paint paint30 = piePlot3D11.getLabelBackgroundPaint();
        piePlot3D1.setLabelLinkPaint(paint30);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D33 = new org.jfree.chart.plot.PiePlot3D(pieDataset32);
        piePlot3D33.setBackgroundImageAlignment(1);
        java.awt.Paint paint36 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D33.setLabelOutlinePaint(paint36);
        piePlot3D33.setBackgroundAlpha(0.0f);
        piePlot3D33.setBackgroundAlpha((float) 0L);
        piePlot3D33.setLabelLinksVisible(false);
        java.awt.Stroke stroke45 = piePlot3D33.getSectionOutlineStroke((java.lang.Comparable) 100L);
        piePlot3D33.setExplodePercent((java.lang.Comparable) 10L, (double) 100.0f);
        org.jfree.data.general.PieDataset pieDataset49 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D50 = new org.jfree.chart.plot.PiePlot3D(pieDataset49);
        piePlot3D50.setBackgroundImageAlignment(1);
        java.awt.Paint paint53 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D50.setLabelOutlinePaint(paint53);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator55 = piePlot3D50.getLegendLabelURLGenerator();
        double double56 = piePlot3D50.getInteriorGap();
        java.awt.Shape shape57 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot3D50.setLegendItemShape(shape57);
        java.awt.Paint paint60 = piePlot3D50.getSectionPaint((java.lang.Comparable) (-1L));
        java.awt.Paint paint62 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D50.setSectionOutlinePaint((java.lang.Comparable) (short) 100, paint62);
        piePlot3D33.setLabelShadowPaint(paint62);
        piePlot3D1.setNoDataMessagePaint(paint62);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14d + "'", double9 == 0.14d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(pieURLGenerator16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNull(stroke45);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertNull(pieURLGenerator55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.08d + "'", double56 == 0.08d);
        org.junit.Assert.assertNotNull(shape57);
        org.junit.Assert.assertNull(paint60);
        org.junit.Assert.assertNotNull(paint62);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint10 = piePlot3D1.getLabelShadowPaint();
        piePlot3D1.setStartAngle((double) (short) 0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = null;
        piePlot3D1.setURLGenerator(pieURLGenerator13);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator15 = null;
        piePlot3D1.setToolTipGenerator(pieToolTipGenerator15);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot3D1.setLabelBackgroundPaint(paint17);
        org.jfree.chart.util.Rotation rotation19 = piePlot3D1.getDirection();
        boolean boolean20 = piePlot3D1.getDarkerSides();
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D(pieDataset21);
        piePlot3D22.setBackgroundImageAlignment(1);
        boolean boolean25 = piePlot3D22.getSectionOutlinesVisible();
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot3D22.setSectionOutlinePaint((java.lang.Comparable) "Pie 3D Plot", paint27);
        piePlot3D1.setBaseSectionOutlinePaint(paint27);
        org.jfree.data.general.PieDataset pieDataset30 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D31 = new org.jfree.chart.plot.PiePlot3D(pieDataset30);
        piePlot3D31.setBackgroundImageAlignment(1);
        java.awt.Paint paint34 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D31.setNoDataMessagePaint(paint34);
        org.jfree.data.general.PieDataset pieDataset36 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D37 = new org.jfree.chart.plot.PiePlot3D(pieDataset36);
        piePlot3D37.setBackgroundImageAlignment(1);
        java.awt.Paint paint40 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D37.setNoDataMessagePaint(paint40);
        piePlot3D31.setBaseSectionOutlinePaint(paint40);
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D31.setInsets(rectangleInsets43, false);
        java.awt.Stroke stroke47 = null;
        piePlot3D31.setSectionOutlineStroke((java.lang.Comparable) 1.0f, stroke47);
        org.jfree.chart.util.RectangleInsets rectangleInsets49 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D31.setInsets(rectangleInsets49, true);
        piePlot3D31.setShadowYOffset(90.0d);
        boolean boolean54 = piePlot3D31.isOutlineVisible();
        org.jfree.data.general.PieDataset pieDataset55 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D56 = new org.jfree.chart.plot.PiePlot3D(pieDataset55);
        piePlot3D56.setBackgroundImageAlignment(1);
        java.awt.Paint paint60 = piePlot3D56.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets61 = piePlot3D56.getSimpleLabelOffset();
        org.jfree.chart.event.PlotChangeListener plotChangeListener62 = null;
        piePlot3D56.removeChangeListener(plotChangeListener62);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator64 = piePlot3D56.getToolTipGenerator();
        piePlot3D56.setCircular(false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo69 = null;
        piePlot3D56.handleClick((int) (short) 10, (int) 'a', plotRenderingInfo69);
        org.jfree.chart.util.RectangleInsets rectangleInsets71 = piePlot3D56.getLabelPadding();
        piePlot3D31.setInsets(rectangleInsets71);
        piePlot3D1.setSimpleLabelOffset(rectangleInsets71);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(rotation19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(rectangleInsets43);
        org.junit.Assert.assertNotNull(rectangleInsets49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(paint60);
        org.junit.Assert.assertNotNull(rectangleInsets61);
        org.junit.Assert.assertNull(pieToolTipGenerator64);
        org.junit.Assert.assertNotNull(rectangleInsets71);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setShadowXOffset((double) (byte) 10);
        piePlot3D1.setForegroundAlpha((float) 0L);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        piePlot3D1.drawBackgroundImage(graphics2D10, rectangle2D11);
        java.awt.Paint paint13 = piePlot3D1.getLabelShadowPaint();
        double double14 = piePlot3D1.getStartAngle();
        piePlot3D1.setShadowYOffset(10.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 90.0d + "'", double14 == 90.0d);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets13, false);
        java.awt.Stroke stroke17 = null;
        piePlot3D1.setSectionOutlineStroke((java.lang.Comparable) 1.0f, stroke17);
        piePlot3D1.setIgnoreZeroValues(false);
        java.awt.Stroke stroke21 = null;
        piePlot3D1.setOutlineStroke(stroke21);
        piePlot3D1.setSectionOutlinesVisible(true);
        piePlot3D1.setBackgroundImageAlignment((int) 'a');
        boolean boolean27 = piePlot3D1.getSectionOutlinesVisible();
        java.awt.Font font28 = piePlot3D1.getNoDataMessageFont();
        java.awt.Stroke stroke29 = piePlot3D1.getLabelLinkStroke();
        java.awt.Font font30 = piePlot3D1.getNoDataMessageFont();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(font30);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint5 = piePlot3D1.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot3D1.getSimpleLabelOffset();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        piePlot3D1.removeChangeListener(plotChangeListener7);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator9 = piePlot3D1.getToolTipGenerator();
        double double10 = piePlot3D1.getStartAngle();
        boolean boolean11 = piePlot3D1.getIgnoreZeroValues();
        java.awt.Shape shape12 = piePlot3D1.getLegendItemShape();
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D(pieDataset13);
        piePlot3D14.setBackgroundImageAlignment(1);
        java.awt.Paint paint17 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D14.setLabelOutlinePaint(paint17);
        piePlot3D14.setBackgroundAlpha(0.0f);
        piePlot3D14.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint23 = piePlot3D14.getLabelShadowPaint();
        piePlot3D14.setStartAngle((double) (short) 0);
        java.awt.Stroke stroke26 = piePlot3D14.getLabelLinkStroke();
        piePlot3D1.setLabelOutlineStroke(stroke26);
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D29 = new org.jfree.chart.plot.PiePlot3D(pieDataset28);
        piePlot3D29.setBackgroundImageAlignment(1);
        java.awt.Paint paint32 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D29.setLabelOutlinePaint(paint32);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator34 = piePlot3D29.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset35 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D36 = new org.jfree.chart.plot.PiePlot3D(pieDataset35);
        piePlot3D36.setBackgroundImageAlignment(1);
        java.awt.Paint paint39 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D36.setNoDataMessagePaint(paint39);
        piePlot3D29.setBaseSectionPaint(paint39);
        java.lang.String str42 = piePlot3D29.getNoDataMessage();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor43 = piePlot3D29.getLabelDistributor();
        java.awt.Paint paint44 = piePlot3D29.getNoDataMessagePaint();
        piePlot3D1.setLabelLinkPaint(paint44);
        org.jfree.chart.LegendItemCollection legendItemCollection46 = piePlot3D1.getLegendItems();
        piePlot3D1.setShadowXOffset((double) (byte) 0);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(pieToolTipGenerator9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 90.0d + "'", double10 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNull(pieURLGenerator34);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor43);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(legendItemCollection46);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets13, false);
        java.awt.Stroke stroke17 = null;
        piePlot3D1.setSectionOutlineStroke((java.lang.Comparable) 1.0f, stroke17);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets19, true);
        piePlot3D1.setShadowYOffset(90.0d);
        double double24 = piePlot3D1.getLabelLinkMargin();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator25 = null;
        piePlot3D1.setToolTipGenerator(pieToolTipGenerator25);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.025d + "'", double24 == 0.025d);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint5 = piePlot3D1.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setShadowPaint(paint10);
        java.awt.Paint paint13 = piePlot3D1.getBaseSectionOutlinePaint();
        java.awt.Paint paint14 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setBaseSectionPaint(paint14);
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        piePlot3D1.addChangeListener(plotChangeListener16);
        java.awt.Paint paint18 = piePlot3D1.getLabelShadowPaint();
        piePlot3D1.setExplodePercent((java.lang.Comparable) (short) -1, (double) 0.0f);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D1.getLegendLabelGenerator();
        java.awt.Font font7 = piePlot3D1.getLabelFont();
        piePlot3D1.setMinimumArcAngleToDraw(100.0d);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D(pieDataset10);
        piePlot3D11.setBackgroundImageAlignment(1);
        java.awt.Paint paint15 = piePlot3D11.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D(pieDataset16);
        piePlot3D17.setBackgroundImageAlignment(1);
        java.awt.Paint paint20 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D17.setNoDataMessagePaint(paint20);
        piePlot3D11.setShadowPaint(paint20);
        java.lang.Object obj23 = piePlot3D11.clone();
        piePlot3D11.setMinimumArcAngleToDraw(1.0d);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator26 = null;
        piePlot3D11.setToolTipGenerator(pieToolTipGenerator26);
        java.awt.Stroke stroke28 = piePlot3D11.getOutlineStroke();
        piePlot3D1.setOutlineStroke(stroke28);
        org.jfree.data.general.PieDataset pieDataset30 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D31 = new org.jfree.chart.plot.PiePlot3D(pieDataset30);
        piePlot3D31.setBackgroundImageAlignment(1);
        java.awt.Paint paint34 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D31.setLabelOutlinePaint(paint34);
        piePlot3D1.setLabelPaint(paint34);
        java.awt.Graphics2D graphics2D37 = null;
        java.awt.geom.Rectangle2D rectangle2D38 = null;
        piePlot3D1.drawBackgroundImage(graphics2D37, rectangle2D38);
        org.jfree.data.general.DatasetGroup datasetGroup40 = piePlot3D1.getDatasetGroup();
        piePlot3D1.setSimpleLabels(false);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator43 = null;
        piePlot3D1.setURLGenerator(pieURLGenerator43);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNull(datasetGroup40);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        piePlot3D1.setLabelLinksVisible(false);
        java.awt.Stroke stroke13 = piePlot3D1.getSectionOutlineStroke((java.lang.Comparable) 100L);
        piePlot3D1.setExplodePercent((java.lang.Comparable) 10L, (double) 100.0f);
        float float17 = piePlot3D1.getBackgroundImageAlpha();
        piePlot3D1.setForegroundAlpha((float) (byte) 1);
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D(pieDataset20);
        piePlot3D21.setBackgroundImageAlignment(1);
        boolean boolean24 = piePlot3D21.getSectionOutlinesVisible();
        double double25 = piePlot3D21.getMaximumLabelWidth();
        piePlot3D21.setCircular(false, true);
        org.jfree.data.general.PieDataset pieDataset29 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D30 = new org.jfree.chart.plot.PiePlot3D(pieDataset29);
        piePlot3D30.setBackgroundImageAlignment(1);
        java.awt.Paint paint33 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D30.setNoDataMessagePaint(paint33);
        org.jfree.data.general.PieDataset pieDataset35 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D36 = new org.jfree.chart.plot.PiePlot3D(pieDataset35);
        piePlot3D36.setBackgroundImageAlignment(1);
        java.awt.Paint paint39 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D36.setNoDataMessagePaint(paint39);
        piePlot3D30.setBaseSectionOutlinePaint(paint39);
        org.jfree.chart.util.RectangleInsets rectangleInsets42 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D30.setInsets(rectangleInsets42, false);
        piePlot3D21.setInsets(rectangleInsets42);
        piePlot3D21.setLabelLinkMargin((double) 1L);
        piePlot3D21.setOutlineVisible(false);
        java.awt.Paint paint50 = piePlot3D21.getBaseSectionOutlinePaint();
        piePlot3D1.setLabelPaint(paint50);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(stroke13);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.14d + "'", double25 == 0.14d);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(rectangleInsets42);
        org.junit.Assert.assertNotNull(paint50);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        java.lang.String str13 = piePlot3D1.getPlotType();
        piePlot3D1.setLabelLinkMargin(0.0d);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D(pieDataset16);
        piePlot3D17.setBackgroundImageAlignment(1);
        boolean boolean20 = piePlot3D17.getSectionOutlinesVisible();
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        piePlot3D17.addChangeListener(plotChangeListener21);
        boolean boolean23 = piePlot3D1.equals((java.lang.Object) piePlot3D17);
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        piePlot3D17.addChangeListener(plotChangeListener24);
        piePlot3D17.setMaximumLabelWidth(0.4d);
        piePlot3D17.setLabelLinkMargin(1.0d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pie 3D Plot" + "'", str13, "Pie 3D Plot");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        java.lang.String str13 = piePlot3D1.getPlotType();
        piePlot3D1.setLabelLinkMargin(0.0d);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D(pieDataset16);
        piePlot3D17.setBackgroundImageAlignment(1);
        boolean boolean20 = piePlot3D17.getSectionOutlinesVisible();
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        piePlot3D17.addChangeListener(plotChangeListener21);
        boolean boolean23 = piePlot3D1.equals((java.lang.Object) piePlot3D17);
        java.awt.Stroke stroke25 = piePlot3D17.getSectionOutlineStroke((java.lang.Comparable) 0L);
        float float26 = piePlot3D17.getBackgroundImageAlpha();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pie 3D Plot" + "'", str13, "Pie 3D Plot");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(stroke25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.5f + "'", float26 == 0.5f);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint10 = piePlot3D1.getLabelShadowPaint();
        piePlot3D1.setStartAngle((double) (short) 0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = null;
        piePlot3D1.setURLGenerator(pieURLGenerator13);
        boolean boolean15 = piePlot3D1.getIgnoreNullValues();
        double double16 = piePlot3D1.getShadowYOffset();
        piePlot3D1.setPieIndex(0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator19 = piePlot3D1.getLegendLabelURLGenerator();
        boolean boolean20 = piePlot3D1.getSimpleLabels();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertNull(pieURLGenerator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        piePlot3D1.removeChangeListener(plotChangeListener6);
        java.awt.Paint paint9 = piePlot3D1.getSectionPaint((java.lang.Comparable) 0);
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D(pieDataset11);
        piePlot3D12.setBackgroundImageAlignment(1);
        boolean boolean15 = piePlot3D12.getSectionOutlinesVisible();
        double double16 = piePlot3D12.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator17 = piePlot3D12.getLegendLabelGenerator();
        java.awt.Font font18 = piePlot3D12.getLabelFont();
        java.awt.Paint paint19 = piePlot3D12.getLabelBackgroundPaint();
        piePlot3D10.setNoDataMessagePaint(paint19);
        int int21 = piePlot3D10.getBackgroundImageAlignment();
        double double22 = piePlot3D10.getDepthFactor();
        java.awt.Shape shape23 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        piePlot3D10.setLegendItemShape(shape23);
        piePlot3D1.setLegendItemShape(shape23);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.14d + "'", double16 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator17);
        org.junit.Assert.assertNotNull(font18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.12d + "'", double22 == 0.12d);
        org.junit.Assert.assertNotNull(shape23);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint10 = piePlot3D1.getLabelShadowPaint();
        piePlot3D1.setStartAngle((double) (short) 0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = null;
        piePlot3D1.setURLGenerator(pieURLGenerator13);
        boolean boolean15 = piePlot3D1.getIgnoreNullValues();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D(pieDataset16);
        piePlot3D17.setBackgroundImageAlignment(1);
        boolean boolean20 = piePlot3D17.getSectionOutlinesVisible();
        double double21 = piePlot3D17.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator22 = piePlot3D17.getLegendLabelGenerator();
        java.awt.Font font23 = piePlot3D17.getLabelFont();
        piePlot3D17.setMinimumArcAngleToDraw(100.0d);
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D27 = new org.jfree.chart.plot.PiePlot3D(pieDataset26);
        piePlot3D27.setBackgroundImageAlignment(1);
        java.awt.Paint paint31 = piePlot3D27.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D33 = new org.jfree.chart.plot.PiePlot3D(pieDataset32);
        piePlot3D33.setBackgroundImageAlignment(1);
        java.awt.Paint paint36 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D33.setNoDataMessagePaint(paint36);
        piePlot3D27.setShadowPaint(paint36);
        java.lang.Object obj39 = piePlot3D27.clone();
        piePlot3D27.setMinimumArcAngleToDraw(1.0d);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator42 = null;
        piePlot3D27.setToolTipGenerator(pieToolTipGenerator42);
        java.awt.Stroke stroke44 = piePlot3D27.getOutlineStroke();
        piePlot3D17.setOutlineStroke(stroke44);
        piePlot3D1.setOutlineStroke(stroke44);
        piePlot3D1.setIgnoreZeroValues(true);
        org.jfree.data.general.DatasetGroup datasetGroup49 = piePlot3D1.getDatasetGroup();
        java.lang.Object obj50 = piePlot3D1.clone();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.14d + "'", double21 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator22);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNull(paint31);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNull(datasetGroup49);
        org.junit.Assert.assertNotNull(obj50);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setCircular(false, true);
        piePlot3D1.setForegroundAlpha(0.0f);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator11 = piePlot3D1.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D(pieDataset12);
        piePlot3D13.setBackgroundImageAlignment(1);
        boolean boolean16 = piePlot3D13.getSectionOutlinesVisible();
        double double17 = piePlot3D13.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator18 = piePlot3D13.getLegendLabelGenerator();
        java.awt.Font font19 = piePlot3D13.getLabelFont();
        piePlot3D13.setMinimumArcAngleToDraw(100.0d);
        java.awt.Paint paint22 = piePlot3D13.getLabelPaint();
        java.awt.Stroke stroke23 = piePlot3D13.getBaseSectionOutlineStroke();
        double double24 = piePlot3D13.getDepthFactor();
        piePlot3D13.setLabelLinksVisible(false);
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D28 = new org.jfree.chart.plot.PiePlot3D(pieDataset27);
        piePlot3D28.setBackgroundImageAlignment(1);
        java.awt.Paint paint32 = piePlot3D28.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D34 = new org.jfree.chart.plot.PiePlot3D(pieDataset33);
        piePlot3D34.setBackgroundImageAlignment(1);
        java.awt.Paint paint37 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D34.setNoDataMessagePaint(paint37);
        piePlot3D28.setShadowPaint(paint37);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent40 = null;
        piePlot3D28.axisChanged(axisChangeEvent40);
        java.awt.Stroke stroke42 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D28.setBaseSectionOutlineStroke(stroke42);
        piePlot3D13.setOutlineStroke(stroke42);
        org.jfree.data.general.DatasetGroup datasetGroup45 = piePlot3D13.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset46 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D47 = new org.jfree.chart.plot.PiePlot3D(pieDataset46);
        piePlot3D47.setBackgroundImageAlignment(1);
        boolean boolean50 = piePlot3D47.getSectionOutlinesVisible();
        double double51 = piePlot3D47.getMaximumLabelWidth();
        piePlot3D47.setShadowXOffset((double) (byte) 10);
        boolean boolean54 = piePlot3D47.getSimpleLabels();
        org.jfree.chart.util.Rotation rotation55 = piePlot3D47.getDirection();
        piePlot3D47.setInteriorGap(0.025d);
        piePlot3D47.setCircular(true, false);
        java.awt.Paint paint61 = piePlot3D47.getNoDataMessagePaint();
        piePlot3D13.setLabelOutlinePaint(paint61);
        piePlot3D1.setBaseSectionPaint(paint61);
        piePlot3D1.setLabelLinkMargin(4.0d);
        org.jfree.chart.plot.Plot plot66 = piePlot3D1.getRootPlot();
        org.jfree.chart.util.RectangleInsets rectangleInsets67 = piePlot3D1.getSimpleLabelOffset();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNull(pieURLGenerator11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.14d + "'", double17 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator18);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.12d + "'", double24 == 0.12d);
        org.junit.Assert.assertNull(paint32);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNull(datasetGroup45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.14d + "'", double51 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(rotation55);
        org.junit.Assert.assertNotNull(paint61);
        org.junit.Assert.assertNotNull(plot66);
        org.junit.Assert.assertNotNull(rectangleInsets67);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint11 = piePlot3D7.getSectionPaint((java.lang.Comparable) (short) 0);
        boolean boolean12 = piePlot3D7.getIgnoreZeroValues();
        double double13 = piePlot3D7.getLabelLinkMargin();
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D(pieDataset15);
        piePlot3D16.setBackgroundImageAlignment(1);
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D16.setLabelOutlinePaint(paint19);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator21 = piePlot3D16.getLegendLabelURLGenerator();
        double double22 = piePlot3D16.getInteriorGap();
        java.awt.Shape shape23 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot3D16.setLegendItemShape(shape23);
        java.awt.Paint paint26 = piePlot3D16.getSectionPaint((java.lang.Comparable) (-1L));
        java.awt.Paint paint28 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D16.setSectionOutlinePaint((java.lang.Comparable) (short) 100, paint28);
        piePlot3D7.setSectionOutlinePaint((java.lang.Comparable) 1.0E-5d, paint28);
        org.jfree.data.general.PieDataset pieDataset31 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D32 = new org.jfree.chart.plot.PiePlot3D(pieDataset31);
        piePlot3D32.setBackgroundImageAlignment(1);
        boolean boolean35 = piePlot3D32.getSectionOutlinesVisible();
        double double36 = piePlot3D32.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator37 = piePlot3D32.getLegendLabelGenerator();
        java.awt.Font font38 = piePlot3D32.getLabelFont();
        piePlot3D32.setMinimumArcAngleToDraw(100.0d);
        org.jfree.data.general.PieDataset pieDataset41 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D42 = new org.jfree.chart.plot.PiePlot3D(pieDataset41);
        piePlot3D42.setBackgroundImageAlignment(1);
        java.awt.Paint paint46 = piePlot3D42.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset47 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D48 = new org.jfree.chart.plot.PiePlot3D(pieDataset47);
        piePlot3D48.setBackgroundImageAlignment(1);
        java.awt.Paint paint51 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D48.setNoDataMessagePaint(paint51);
        piePlot3D42.setShadowPaint(paint51);
        java.lang.Object obj54 = piePlot3D42.clone();
        piePlot3D42.setMinimumArcAngleToDraw(1.0d);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator57 = null;
        piePlot3D42.setToolTipGenerator(pieToolTipGenerator57);
        java.awt.Stroke stroke59 = piePlot3D42.getOutlineStroke();
        piePlot3D32.setOutlineStroke(stroke59);
        org.jfree.data.general.PieDataset pieDataset61 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D62 = new org.jfree.chart.plot.PiePlot3D(pieDataset61);
        piePlot3D62.setBackgroundImageAlignment(1);
        java.awt.Paint paint65 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D62.setLabelOutlinePaint(paint65);
        piePlot3D32.setLabelPaint(paint65);
        java.awt.Graphics2D graphics2D68 = null;
        java.awt.geom.Rectangle2D rectangle2D69 = null;
        piePlot3D32.drawBackgroundImage(graphics2D68, rectangle2D69);
        java.awt.Stroke stroke71 = piePlot3D32.getBaseSectionOutlineStroke();
        java.awt.Paint paint72 = piePlot3D32.getLabelBackgroundPaint();
        piePlot3D7.setBackgroundPaint(paint72);
        piePlot3D1.setOutlinePaint(paint72);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.025d + "'", double13 == 0.025d);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(pieURLGenerator21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.08d + "'", double22 == 0.08d);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNull(paint26);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.14d + "'", double36 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator37);
        org.junit.Assert.assertNotNull(font38);
        org.junit.Assert.assertNull(paint46);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNotNull(stroke59);
        org.junit.Assert.assertNotNull(paint65);
        org.junit.Assert.assertNotNull(stroke71);
        org.junit.Assert.assertNotNull(paint72);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        java.awt.Paint paint6 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot3D1.setSectionOutlinePaint((java.lang.Comparable) "Pie 3D Plot", paint6);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator8 = piePlot3D1.getURLGenerator();
        double double9 = piePlot3D1.getMaximumLabelWidth();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D(pieDataset10);
        piePlot3D11.setBackgroundImageAlignment(1);
        java.awt.Paint paint14 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D11.setLabelOutlinePaint(paint14);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = piePlot3D11.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D(pieDataset17);
        piePlot3D18.setBackgroundImageAlignment(1);
        java.awt.Paint paint21 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D18.setNoDataMessagePaint(paint21);
        piePlot3D11.setBaseSectionPaint(paint21);
        java.lang.String str24 = piePlot3D11.getNoDataMessage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator25 = null;
        piePlot3D11.setLegendLabelURLGenerator(pieURLGenerator25);
        piePlot3D11.setShadowYOffset((double) 100L);
        java.awt.Font font29 = piePlot3D11.getNoDataMessageFont();
        java.awt.Paint paint30 = piePlot3D11.getLabelBackgroundPaint();
        piePlot3D1.setLabelLinkPaint(paint30);
        // The following exception was thrown during execution in test generation
        try {
            double double32 = piePlot3D1.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(pieURLGenerator8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.14d + "'", double9 == 0.14d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(pieURLGenerator16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        piePlot3D1.setLabelLinksVisible(false);
        java.awt.Stroke stroke13 = piePlot3D1.getSectionOutlineStroke((java.lang.Comparable) 100L);
        org.jfree.chart.plot.Plot plot14 = piePlot3D1.getRootPlot();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor15 = piePlot3D1.getLabelDistributor();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D(pieDataset16);
        piePlot3D17.setBackgroundImageAlignment(1);
        java.awt.Paint paint20 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D17.setNoDataMessagePaint(paint20);
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D23 = new org.jfree.chart.plot.PiePlot3D(pieDataset22);
        piePlot3D23.setBackgroundImageAlignment(1);
        java.awt.Paint paint26 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D23.setNoDataMessagePaint(paint26);
        piePlot3D17.setBaseSectionOutlinePaint(paint26);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D17.setInsets(rectangleInsets29, false);
        java.awt.Stroke stroke33 = null;
        piePlot3D17.setSectionOutlineStroke((java.lang.Comparable) 1.0f, stroke33);
        org.jfree.chart.util.RectangleInsets rectangleInsets35 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D17.setInsets(rectangleInsets35, true);
        piePlot3D17.setShadowYOffset(90.0d);
        boolean boolean40 = piePlot3D17.isOutlineVisible();
        java.awt.Image image41 = null;
        piePlot3D17.setBackgroundImage(image41);
        java.awt.Paint paint43 = piePlot3D17.getBaseSectionPaint();
        piePlot3D1.setLabelBackgroundPaint(paint43);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(stroke13);
        org.junit.Assert.assertNotNull(plot14);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(rectangleInsets29);
        org.junit.Assert.assertNotNull(rectangleInsets35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(paint43);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D1.getLegendLabelGenerator();
        java.awt.Font font7 = piePlot3D1.getLabelFont();
        piePlot3D1.setMinimumArcAngleToDraw(100.0d);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent10 = null;
        piePlot3D1.axisChanged(axisChangeEvent10);
        java.awt.Stroke stroke12 = piePlot3D1.getLabelOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D(pieDataset13);
        piePlot3D14.setBackgroundImageAlignment(1);
        java.awt.Paint paint17 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D14.setNoDataMessagePaint(paint17);
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D(pieDataset19);
        piePlot3D20.setBackgroundImageAlignment(1);
        java.awt.Paint paint23 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D20.setNoDataMessagePaint(paint23);
        piePlot3D14.setBaseSectionOutlinePaint(paint23);
        java.lang.String str26 = piePlot3D14.getPlotType();
        piePlot3D14.setLabelLinkMargin(0.0d);
        piePlot3D14.setShadowXOffset((double) 0.0f);
        java.awt.Paint paint31 = piePlot3D14.getNoDataMessagePaint();
        piePlot3D1.setOutlinePaint(paint31);
        org.jfree.chart.event.PlotChangeListener plotChangeListener33 = null;
        piePlot3D1.addChangeListener(plotChangeListener33);
        org.jfree.data.general.DatasetGroup datasetGroup35 = piePlot3D1.getDatasetGroup();
        java.awt.Paint paint36 = piePlot3D1.getLabelLinkPaint();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Pie 3D Plot" + "'", str26, "Pie 3D Plot");
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNull(datasetGroup35);
        org.junit.Assert.assertNotNull(paint36);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint10 = piePlot3D1.getLabelShadowPaint();
        java.awt.Paint paint11 = piePlot3D1.getBackgroundPaint();
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D(pieDataset12);
        piePlot3D13.setBackgroundImageAlignment(1);
        piePlot3D13.setBackgroundImageAlpha((float) (byte) 1);
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D(pieDataset18);
        piePlot3D19.setBackgroundImageAlignment(1);
        java.awt.Paint paint22 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D19.setNoDataMessagePaint(paint22);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D(pieDataset24);
        piePlot3D25.setBackgroundImageAlignment(1);
        java.awt.Paint paint28 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D25.setNoDataMessagePaint(paint28);
        piePlot3D19.setBaseSectionOutlinePaint(paint28);
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D19.setInsets(rectangleInsets31, false);
        piePlot3D13.setSimpleLabelOffset(rectangleInsets31);
        org.jfree.chart.LegendItemCollection legendItemCollection35 = piePlot3D13.getLegendItems();
        org.jfree.chart.event.PlotChangeListener plotChangeListener36 = null;
        piePlot3D13.addChangeListener(plotChangeListener36);
        org.jfree.data.general.DatasetGroup datasetGroup38 = piePlot3D13.getDatasetGroup();
        java.awt.Paint paint39 = piePlot3D13.getShadowPaint();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator40 = piePlot3D13.getLegendLabelGenerator();
        piePlot3D1.setLegendLabelToolTipGenerator(pieSectionLabelGenerator40);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(legendItemCollection35);
        org.junit.Assert.assertNull(datasetGroup38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator40);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets13, false);
        java.awt.Stroke stroke17 = null;
        piePlot3D1.setSectionOutlineStroke((java.lang.Comparable) 1.0f, stroke17);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets19, true);
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D23 = new org.jfree.chart.plot.PiePlot3D(pieDataset22);
        piePlot3D23.setBackgroundImageAlignment(1);
        java.awt.Paint paint26 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D23.setLabelOutlinePaint(paint26);
        piePlot3D1.setLabelOutlinePaint(paint26);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator29 = piePlot3D1.getURLGenerator();
        java.awt.Font font30 = piePlot3D1.getLabelFont();
        double double31 = piePlot3D1.getMaximumLabelWidth();
        java.awt.Paint paint32 = piePlot3D1.getBaseSectionPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNull(pieURLGenerator29);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.14d + "'", double31 == 0.14d);
        org.junit.Assert.assertNotNull(paint32);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setCircular(false, true);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D(pieDataset9);
        piePlot3D10.setBackgroundImageAlignment(1);
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D10.setNoDataMessagePaint(paint13);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D(pieDataset15);
        piePlot3D16.setBackgroundImageAlignment(1);
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D16.setNoDataMessagePaint(paint19);
        piePlot3D10.setBaseSectionOutlinePaint(paint19);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setInsets(rectangleInsets22, false);
        piePlot3D1.setInsets(rectangleInsets22);
        piePlot3D1.setLabelLinkMargin((double) 1L);
        piePlot3D1.setOutlineVisible(false);
        java.awt.Paint paint30 = piePlot3D1.getBaseSectionOutlinePaint();
        piePlot3D1.setBackgroundImageAlpha((float) 0L);
        java.awt.Paint paint33 = piePlot3D1.getOutlinePaint();
        double double34 = piePlot3D1.getLabelGap();
        piePlot3D1.setCircular(false);
        java.awt.Font font37 = piePlot3D1.getLabelFont();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator38 = null;
        piePlot3D1.setLabelGenerator(pieSectionLabelGenerator38);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.025d + "'", double34 == 0.025d);
        org.junit.Assert.assertNotNull(font37);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D1.getLegendLabelGenerator();
        java.awt.Font font7 = piePlot3D1.getLabelFont();
        piePlot3D1.setMinimumArcAngleToDraw(100.0d);
        java.awt.Paint paint10 = piePlot3D1.getLabelPaint();
        java.awt.Stroke stroke11 = piePlot3D1.getBaseSectionOutlineStroke();
        double double12 = piePlot3D1.getDepthFactor();
        piePlot3D1.setLabelLinksVisible(false);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D(pieDataset15);
        piePlot3D16.setBackgroundImageAlignment(1);
        java.awt.Paint paint20 = piePlot3D16.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D(pieDataset21);
        piePlot3D22.setBackgroundImageAlignment(1);
        java.awt.Paint paint25 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D22.setNoDataMessagePaint(paint25);
        piePlot3D16.setShadowPaint(paint25);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent28 = null;
        piePlot3D16.axisChanged(axisChangeEvent28);
        java.awt.Stroke stroke30 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D16.setBaseSectionOutlineStroke(stroke30);
        piePlot3D1.setOutlineStroke(stroke30);
        org.jfree.data.general.DatasetGroup datasetGroup33 = piePlot3D1.getDatasetGroup();
        java.awt.Stroke stroke34 = piePlot3D1.getOutlineStroke();
        piePlot3D1.setBackgroundImageAlignment((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12d + "'", double12 == 0.12d);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNull(datasetGroup33);
        org.junit.Assert.assertNotNull(stroke34);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot3D1.getLegendLabelURLGenerator();
        double double7 = piePlot3D1.getInteriorGap();
        java.awt.Shape shape8 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot3D1.setLegendItemShape(shape8);
        java.awt.Paint paint11 = piePlot3D1.getSectionPaint((java.lang.Comparable) (-1L));
        double double12 = piePlot3D1.getStartAngle();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        java.awt.geom.Point2D point2D15 = null;
        org.jfree.chart.plot.PlotState plotState16 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D1.draw(graphics2D13, rectangle2D14, point2D15, plotState16, plotRenderingInfo17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08d + "'", double7 == 0.08d);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 90.0d + "'", double12 == 90.0d);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        piePlot3D1.setBackgroundImageAlpha((float) (byte) 1);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D(pieDataset12);
        piePlot3D13.setBackgroundImageAlignment(1);
        java.awt.Paint paint16 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D13.setNoDataMessagePaint(paint16);
        piePlot3D7.setBaseSectionOutlinePaint(paint16);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D7.setInsets(rectangleInsets19, false);
        piePlot3D1.setSimpleLabelOffset(rectangleInsets19);
        org.jfree.chart.LegendItemCollection legendItemCollection23 = piePlot3D1.getLegendItems();
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        piePlot3D1.addChangeListener(plotChangeListener24);
        piePlot3D1.setCircular(false);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = piePlot3D1.getSimpleLabelOffset();
        java.awt.Stroke stroke29 = piePlot3D1.getLabelOutlineStroke();
        org.jfree.chart.event.PlotChangeListener plotChangeListener30 = null;
        piePlot3D1.removeChangeListener(plotChangeListener30);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        piePlot3D1.markerChanged(markerChangeEvent32);
        java.awt.Paint paint34 = piePlot3D1.getOutlinePaint();
        piePlot3D1.setInteriorGap((double) 0L);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(legendItemCollection23);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint10 = piePlot3D1.getLabelShadowPaint();
        piePlot3D1.setStartAngle((double) (short) 0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = null;
        piePlot3D1.setURLGenerator(pieURLGenerator13);
        piePlot3D1.setCircular(true);
        org.jfree.chart.plot.Plot plot17 = piePlot3D1.getParent();
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D(pieDataset18);
        piePlot3D19.setBackgroundImageAlignment(1);
        java.awt.Paint paint22 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D19.setNoDataMessagePaint(paint22);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D(pieDataset24);
        piePlot3D25.setBackgroundImageAlignment(1);
        java.awt.Paint paint28 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D25.setNoDataMessagePaint(paint28);
        piePlot3D19.setBaseSectionOutlinePaint(paint28);
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D19.setInsets(rectangleInsets31, false);
        java.awt.Stroke stroke35 = null;
        piePlot3D19.setSectionOutlineStroke((java.lang.Comparable) 1.0f, stroke35);
        piePlot3D19.setIgnoreZeroValues(false);
        java.awt.Stroke stroke39 = null;
        piePlot3D19.setOutlineStroke(stroke39);
        piePlot3D19.setSectionOutlinesVisible(true);
        piePlot3D19.setBackgroundImageAlignment((int) (short) 10);
        org.jfree.data.general.PieDataset pieDataset45 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D46 = new org.jfree.chart.plot.PiePlot3D(pieDataset45);
        piePlot3D46.setBackgroundImageAlignment(1);
        boolean boolean49 = piePlot3D46.getSectionOutlinesVisible();
        double double50 = piePlot3D46.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator51 = piePlot3D46.getLegendLabelGenerator();
        java.awt.Font font52 = piePlot3D46.getLabelFont();
        piePlot3D19.setLabelFont(font52);
        java.awt.Stroke stroke54 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D19.setLabelLinkStroke(stroke54);
        piePlot3D1.setOutlineStroke(stroke54);
        java.awt.Paint paint57 = piePlot3D1.getLabelOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset58 = piePlot3D1.getDataset();
        piePlot3D1.setIgnoreZeroValues(false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(plot17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.14d + "'", double50 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator51);
        org.junit.Assert.assertNotNull(font52);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertNull(pieDataset58);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent10 = null;
        piePlot3D1.notifyListeners(plotChangeEvent10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D(pieDataset12);
        piePlot3D13.setBackgroundImageAlignment(1);
        java.awt.Paint paint16 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D13.setLabelOutlinePaint(paint16);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator18 = piePlot3D13.getLegendLabelURLGenerator();
        double double19 = piePlot3D13.getInteriorGap();
        java.awt.Shape shape20 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot3D13.setLegendItemShape(shape20);
        java.awt.Paint paint23 = piePlot3D13.getSectionPaint((java.lang.Comparable) (-1L));
        boolean boolean24 = piePlot3D13.getLabelLinksVisible();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator25 = piePlot3D13.getLegendLabelURLGenerator();
        piePlot3D13.setShadowXOffset((double) (byte) -1);
        java.awt.Stroke stroke28 = piePlot3D13.getLabelLinkStroke();
        piePlot3D1.setLabelOutlineStroke(stroke28);
        org.jfree.data.general.PieDataset pieDataset30 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D31 = new org.jfree.chart.plot.PiePlot3D(pieDataset30);
        piePlot3D31.setBackgroundImageAlignment(1);
        java.awt.Paint paint34 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D31.setNoDataMessagePaint(paint34);
        org.jfree.data.general.PieDataset pieDataset36 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D37 = new org.jfree.chart.plot.PiePlot3D(pieDataset36);
        piePlot3D37.setBackgroundImageAlignment(1);
        java.awt.Paint paint40 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D37.setNoDataMessagePaint(paint40);
        piePlot3D31.setBaseSectionOutlinePaint(paint40);
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D31.setInsets(rectangleInsets43, false);
        java.awt.Stroke stroke47 = null;
        piePlot3D31.setSectionOutlineStroke((java.lang.Comparable) 1.0f, stroke47);
        org.jfree.chart.util.RectangleInsets rectangleInsets49 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D31.setInsets(rectangleInsets49, true);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator52 = piePlot3D31.getLabelGenerator();
        piePlot3D1.setLegendLabelGenerator(pieSectionLabelGenerator52);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(pieURLGenerator18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.08d + "'", double19 == 0.08d);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(pieURLGenerator25);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(rectangleInsets43);
        org.junit.Assert.assertNotNull(rectangleInsets49);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator52);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setShadowXOffset((double) (byte) 10);
        boolean boolean8 = piePlot3D1.getSimpleLabels();
        java.awt.Stroke stroke9 = null;
        piePlot3D1.setLabelOutlineStroke(stroke9);
        float float11 = piePlot3D1.getBackgroundImageAlpha();
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D(pieDataset12);
        piePlot3D13.setBackgroundImageAlignment(1);
        boolean boolean16 = piePlot3D13.getSectionOutlinesVisible();
        java.awt.Paint paint18 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot3D13.setSectionOutlinePaint((java.lang.Comparable) "Pie 3D Plot", paint18);
        java.awt.Stroke stroke20 = piePlot3D13.getLabelLinkStroke();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier21 = piePlot3D13.getDrawingSupplier();
        piePlot3D1.setDrawingSupplier(drawingSupplier21);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.5f + "'", float11 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(drawingSupplier21);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets13, false);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = piePlot3D1.getURLGenerator();
        org.jfree.data.general.DatasetGroup datasetGroup17 = piePlot3D1.getDatasetGroup();
        piePlot3D1.setMinimumArcAngleToDraw((double) 1);
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D(pieDataset20);
        piePlot3D21.setBackgroundImageAlignment(1);
        java.awt.Paint paint24 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D21.setLabelOutlinePaint(paint24);
        double double27 = piePlot3D21.getExplodePercent((java.lang.Comparable) "");
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor28 = piePlot3D21.getLabelDistributor();
        piePlot3D1.setLabelDistributor(abstractPieLabelDistributor28);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNull(pieURLGenerator16);
        org.junit.Assert.assertNull(datasetGroup17);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor28);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setShadowXOffset((double) (byte) 10);
        boolean boolean8 = piePlot3D1.getSimpleLabels();
        java.awt.Stroke stroke9 = null;
        piePlot3D1.setLabelOutlineStroke(stroke9);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator11 = null;
        piePlot3D1.setToolTipGenerator(pieToolTipGenerator11);
        piePlot3D1.setSimpleLabels(true);
        float float15 = piePlot3D1.getBackgroundImageAlpha();
        float float16 = piePlot3D1.getForegroundAlpha();
        java.awt.Font font17 = piePlot3D1.getLabelFont();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
        org.junit.Assert.assertNotNull(font17);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        double double10 = piePlot3D1.getLabelGap();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        piePlot3D1.handleClick((int) (byte) 100, (int) (byte) 1, plotRenderingInfo13);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        piePlot3D1.drawBackgroundImage(graphics2D15, rectangle2D16);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator18 = null;
        piePlot3D1.setURLGenerator(pieURLGenerator18);
        float float20 = piePlot3D1.getBackgroundAlpha();
        piePlot3D1.setMaximumLabelWidth((double) (byte) 100);
        boolean boolean23 = piePlot3D1.getIgnoreZeroValues();
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D1.drawBackground(graphics2D24, rectangle2D25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.025d + "'", double10 == 0.025d);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint5 = piePlot3D1.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setLabelOutlinePaint(paint10);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = piePlot3D7.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D(pieDataset13);
        piePlot3D14.setBackgroundImageAlignment(1);
        java.awt.Paint paint17 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D14.setNoDataMessagePaint(paint17);
        piePlot3D7.setBaseSectionPaint(paint17);
        piePlot3D1.setShadowPaint(paint17);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot3D1.getSimpleLabelOffset();
        java.awt.Stroke stroke22 = piePlot3D1.getBaseSectionOutlineStroke();
        boolean boolean23 = piePlot3D1.isCircular();
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D(pieDataset24);
        piePlot3D25.setBackgroundImageAlignment(1);
        java.awt.Paint paint28 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D25.setLabelOutlinePaint(paint28);
        piePlot3D25.setBackgroundAlpha(0.0f);
        piePlot3D25.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint34 = piePlot3D25.getLabelShadowPaint();
        piePlot3D25.setStartAngle((double) (short) 0);
        piePlot3D25.setIgnoreNullValues(false);
        java.awt.Shape shape39 = piePlot3D25.getLegendItemShape();
        piePlot3D1.setLegendItemShape(shape39);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent41 = null;
        piePlot3D1.axisChanged(axisChangeEvent41);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(pieURLGenerator12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(shape39);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint10 = piePlot3D1.getLabelShadowPaint();
        piePlot3D1.setStartAngle((double) (short) 0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = null;
        piePlot3D1.setURLGenerator(pieURLGenerator13);
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        piePlot3D1.addChangeListener(plotChangeListener15);
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D(pieDataset17);
        piePlot3D18.setBackgroundImageAlignment(1);
        java.awt.Paint paint22 = piePlot3D18.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = piePlot3D18.getSimpleLabelOffset();
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        piePlot3D18.removeChangeListener(plotChangeListener24);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator26 = piePlot3D18.getToolTipGenerator();
        double double27 = piePlot3D18.getStartAngle();
        boolean boolean28 = piePlot3D18.getIgnoreZeroValues();
        java.awt.Shape shape29 = piePlot3D18.getLegendItemShape();
        org.jfree.data.general.PieDataset pieDataset30 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D31 = new org.jfree.chart.plot.PiePlot3D(pieDataset30);
        piePlot3D31.setBackgroundImageAlignment(1);
        java.awt.Paint paint34 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D31.setLabelOutlinePaint(paint34);
        piePlot3D31.setBackgroundAlpha(0.0f);
        piePlot3D31.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint40 = piePlot3D31.getLabelShadowPaint();
        piePlot3D31.setStartAngle((double) (short) 0);
        java.awt.Stroke stroke43 = piePlot3D31.getLabelLinkStroke();
        piePlot3D18.setLabelOutlineStroke(stroke43);
        piePlot3D1.setLabelOutlineStroke(stroke43);
        boolean boolean46 = piePlot3D1.getIgnoreZeroValues();
        double double47 = piePlot3D1.getInteriorGap();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertNull(pieToolTipGenerator26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 90.0d + "'", double27 == 90.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.08d + "'", double47 == 0.08d);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setCircular(false, true);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D(pieDataset9);
        piePlot3D10.setBackgroundImageAlignment(1);
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D10.setNoDataMessagePaint(paint13);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D(pieDataset15);
        piePlot3D16.setBackgroundImageAlignment(1);
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D16.setNoDataMessagePaint(paint19);
        piePlot3D10.setBaseSectionOutlinePaint(paint19);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setInsets(rectangleInsets22, false);
        piePlot3D1.setInsets(rectangleInsets22);
        piePlot3D1.setLabelLinkMargin((double) 1L);
        piePlot3D1.setOutlineVisible(false);
        java.awt.Paint paint30 = piePlot3D1.getBaseSectionOutlinePaint();
        piePlot3D1.setBackgroundImageAlpha((float) 0L);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent33 = null;
        piePlot3D1.datasetChanged(datasetChangeEvent33);
        // The following exception was thrown during execution in test generation
        try {
            double double35 = piePlot3D1.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint5 = piePlot3D1.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot3D1.getSimpleLabelOffset();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        piePlot3D1.removeChangeListener(plotChangeListener7);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator9 = piePlot3D1.getToolTipGenerator();
        piePlot3D1.setCircular(false);
        piePlot3D1.setShadowXOffset(0.0d);
        double double14 = piePlot3D1.getInteriorGap();
        piePlot3D1.setMinimumArcAngleToDraw(100.0d);
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D(pieDataset17);
        piePlot3D18.setBackgroundImageAlignment(1);
        java.awt.Paint paint21 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D18.setNoDataMessagePaint(paint21);
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D24 = new org.jfree.chart.plot.PiePlot3D(pieDataset23);
        piePlot3D24.setBackgroundImageAlignment(1);
        java.awt.Paint paint27 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D24.setNoDataMessagePaint(paint27);
        piePlot3D18.setBaseSectionOutlinePaint(paint27);
        org.jfree.chart.util.RectangleInsets rectangleInsets30 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D18.setInsets(rectangleInsets30, false);
        double double34 = piePlot3D18.getExplodePercent((java.lang.Comparable) 10);
        double double35 = piePlot3D18.getLabelGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier36 = piePlot3D18.getDrawingSupplier();
        piePlot3D1.setDrawingSupplier(drawingSupplier36);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator38 = piePlot3D1.getURLGenerator();
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(pieToolTipGenerator9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.08d + "'", double14 == 0.08d);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(rectangleInsets30);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.025d + "'", double35 == 0.025d);
        org.junit.Assert.assertNotNull(drawingSupplier36);
        org.junit.Assert.assertNull(pieURLGenerator38);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setShadowXOffset((double) (byte) 10);
        boolean boolean8 = piePlot3D1.getSimpleLabels();
        java.awt.Stroke stroke9 = null;
        piePlot3D1.setLabelOutlineStroke(stroke9);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator11 = null;
        piePlot3D1.setToolTipGenerator(pieToolTipGenerator11);
        piePlot3D1.setOutlineVisible(false);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D(pieDataset15);
        piePlot3D16.setBackgroundImageAlignment(1);
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D16.setLabelOutlinePaint(paint19);
        piePlot3D16.setBackgroundAlpha(0.0f);
        piePlot3D16.setBackgroundAlpha((float) 0L);
        double double26 = piePlot3D16.getExplodePercent((java.lang.Comparable) 10.0f);
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot3D16.setBaseSectionOutlinePaint(paint27);
        piePlot3D1.setBaseSectionOutlinePaint(paint27);
        double double31 = piePlot3D1.getExplodePercent((java.lang.Comparable) 4.0d);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor32 = piePlot3D1.getLabelDistributor();
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D34 = new org.jfree.chart.plot.PiePlot3D(pieDataset33);
        piePlot3D34.setBackgroundImageAlignment(1);
        java.awt.Paint paint37 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D34.setNoDataMessagePaint(paint37);
        org.jfree.data.general.PieDataset pieDataset39 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D40 = new org.jfree.chart.plot.PiePlot3D(pieDataset39);
        piePlot3D40.setBackgroundImageAlignment(1);
        java.awt.Paint paint43 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D40.setNoDataMessagePaint(paint43);
        piePlot3D34.setBaseSectionOutlinePaint(paint43);
        java.lang.String str46 = piePlot3D34.getPlotType();
        piePlot3D34.setLabelLinkMargin(0.0d);
        org.jfree.data.general.PieDataset pieDataset49 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D50 = new org.jfree.chart.plot.PiePlot3D(pieDataset49);
        piePlot3D50.setBackgroundImageAlignment(1);
        boolean boolean53 = piePlot3D50.getSectionOutlinesVisible();
        org.jfree.chart.event.PlotChangeListener plotChangeListener54 = null;
        piePlot3D50.addChangeListener(plotChangeListener54);
        boolean boolean56 = piePlot3D34.equals((java.lang.Object) piePlot3D50);
        boolean boolean57 = piePlot3D50.isOutlineVisible();
        double double58 = piePlot3D50.getLabelGap();
        org.jfree.data.general.PieDataset pieDataset59 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D60 = new org.jfree.chart.plot.PiePlot3D(pieDataset59);
        piePlot3D60.setBackgroundImageAlignment(1);
        boolean boolean63 = piePlot3D60.getSectionOutlinesVisible();
        org.jfree.chart.event.PlotChangeListener plotChangeListener64 = null;
        piePlot3D60.addChangeListener(plotChangeListener64);
        java.awt.Paint paint66 = piePlot3D60.getLabelShadowPaint();
        piePlot3D50.setOutlinePaint(paint66);
        java.awt.Paint paint68 = piePlot3D50.getLabelBackgroundPaint();
        piePlot3D1.setLabelOutlinePaint(paint68);
        piePlot3D1.setLabelLinkMargin(0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor32);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Pie 3D Plot" + "'", str46, "Pie 3D Plot");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.025d + "'", double58 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(paint66);
        org.junit.Assert.assertNotNull(paint68);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint10 = piePlot3D1.getLabelShadowPaint();
        piePlot3D1.setStartAngle((double) (short) 0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = null;
        piePlot3D1.setURLGenerator(pieURLGenerator13);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator15 = null;
        piePlot3D1.setToolTipGenerator(pieToolTipGenerator15);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator17 = null;
        piePlot3D1.setURLGenerator(pieURLGenerator17);
        piePlot3D1.setCircular(false, false);
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D23 = new org.jfree.chart.plot.PiePlot3D(pieDataset22);
        piePlot3D23.setBackgroundImageAlignment(1);
        boolean boolean26 = piePlot3D23.getSectionOutlinesVisible();
        double double27 = piePlot3D23.getMaximumLabelWidth();
        java.awt.Font font28 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D23.setLabelFont(font28);
        java.awt.Paint paint31 = piePlot3D23.getSectionPaint((java.lang.Comparable) (byte) 100);
        java.awt.Paint paint32 = piePlot3D23.getBaseSectionPaint();
        piePlot3D1.setNoDataMessagePaint(paint32);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.14d + "'", double27 == 0.14d);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertNull(paint31);
        org.junit.Assert.assertNotNull(paint32);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot3D1.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D(pieDataset7);
        piePlot3D8.setBackgroundImageAlignment(1);
        java.awt.Paint paint11 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D8.setNoDataMessagePaint(paint11);
        piePlot3D1.setBaseSectionPaint(paint11);
        java.lang.String str14 = piePlot3D1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        piePlot3D1.notifyListeners(plotChangeEvent15);
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = piePlot3D1.getSimpleLabelOffset();
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        piePlot3D1.drawBackgroundImage(graphics2D18, rectangle2D19);
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D(pieDataset21);
        piePlot3D22.setBackgroundImageAlignment(1);
        boolean boolean25 = piePlot3D22.getSectionOutlinesVisible();
        double double26 = piePlot3D22.getMaximumLabelWidth();
        double double27 = piePlot3D22.getShadowXOffset();
        piePlot3D22.setIgnoreNullValues(false);
        java.awt.Font font30 = piePlot3D22.getLabelFont();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator31 = piePlot3D22.getLabelGenerator();
        piePlot3D1.setLabelGenerator(pieSectionLabelGenerator31);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.14d + "'", double26 == 0.14d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 4.0d + "'", double27 == 4.0d);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator31);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        java.lang.String str13 = piePlot3D1.getPlotType();
        piePlot3D1.setLabelLinkMargin(0.0d);
        piePlot3D1.setExplodePercent((java.lang.Comparable) true, (double) (short) 1);
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D(pieDataset19);
        piePlot3D20.setBackgroundImageAlignment(1);
        boolean boolean23 = piePlot3D20.getSectionOutlinesVisible();
        double double24 = piePlot3D20.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = piePlot3D20.getLegendLabelGenerator();
        piePlot3D1.setLabelGenerator(pieSectionLabelGenerator25);
        java.awt.Paint paint27 = piePlot3D1.getLabelBackgroundPaint();
        int int28 = piePlot3D1.getPieIndex();
        double double29 = piePlot3D1.getShadowXOffset();
        org.jfree.data.general.PieDataset pieDataset30 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D31 = new org.jfree.chart.plot.PiePlot3D(pieDataset30);
        piePlot3D31.setBackgroundImageAlignment(1);
        java.awt.Paint paint34 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D31.setLabelOutlinePaint(paint34);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator36 = piePlot3D31.getLegendLabelURLGenerator();
        double double37 = piePlot3D31.getInteriorGap();
        java.awt.Shape shape38 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot3D31.setLegendItemShape(shape38);
        java.awt.Paint paint41 = piePlot3D31.getSectionPaint((java.lang.Comparable) (-1L));
        java.awt.Paint paint43 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D31.setSectionOutlinePaint((java.lang.Comparable) (short) 100, paint43);
        java.awt.Paint paint45 = piePlot3D31.getBackgroundPaint();
        piePlot3D1.setLabelShadowPaint(paint45);
        double double47 = piePlot3D1.getMinimumArcAngleToDraw();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pie 3D Plot" + "'", str13, "Pie 3D Plot");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.14d + "'", double24 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator25);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 4.0d + "'", double29 == 4.0d);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNull(pieURLGenerator36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.08d + "'", double37 == 0.08d);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertNull(paint41);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 1.0E-5d + "'", double47 == 1.0E-5d);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot3D1.getLegendLabelURLGenerator();
        java.awt.Stroke stroke7 = null;
        piePlot3D1.setLabelOutlineStroke(stroke7);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D(pieDataset9);
        piePlot3D10.setBackgroundImageAlignment(1);
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D10.setLabelOutlinePaint(paint13);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator15 = piePlot3D10.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D(pieDataset16);
        piePlot3D17.setBackgroundImageAlignment(1);
        java.awt.Paint paint20 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D17.setNoDataMessagePaint(paint20);
        piePlot3D10.setBaseSectionPaint(paint20);
        java.lang.String str23 = piePlot3D10.getNoDataMessage();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = piePlot3D10.getSimpleLabelOffset();
        piePlot3D1.setSimpleLabelOffset(rectangleInsets24);
        piePlot3D1.setDarkerSides(false);
        boolean boolean28 = piePlot3D1.getSectionOutlinesVisible();
        java.awt.Stroke stroke29 = piePlot3D1.getLabelOutlineStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(pieURLGenerator15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(stroke29);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets13, false);
        java.lang.String str16 = piePlot3D1.getPlotType();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent17 = null;
        piePlot3D1.datasetChanged(datasetChangeEvent17);
        java.awt.Paint paint19 = piePlot3D1.getBaseSectionOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D(pieDataset20);
        piePlot3D21.setBackgroundImageAlignment(1);
        boolean boolean24 = piePlot3D21.getSectionOutlinesVisible();
        double double25 = piePlot3D21.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator26 = piePlot3D21.getLegendLabelGenerator();
        java.awt.Font font27 = piePlot3D21.getLabelFont();
        java.awt.Paint paint28 = piePlot3D21.getLabelBackgroundPaint();
        piePlot3D1.setLabelPaint(paint28);
        piePlot3D1.setCircular(true, false);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pie 3D Plot" + "'", str16, "Pie 3D Plot");
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.14d + "'", double25 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator26);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets13, false);
        java.awt.Stroke stroke17 = null;
        piePlot3D1.setSectionOutlineStroke((java.lang.Comparable) 1.0f, stroke17);
        boolean boolean19 = piePlot3D1.isSubplot();
        piePlot3D1.setCircular(false);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor22 = piePlot3D1.getLabelDistributor();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor22);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setShadowXOffset((double) (byte) 10);
        piePlot3D1.setForegroundAlpha((float) 0L);
        piePlot3D1.setSectionOutlinesVisible(false);
        java.awt.Paint paint12 = piePlot3D1.getLabelShadowPaint();
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D15 = new org.jfree.chart.plot.PiePlot3D(pieDataset14);
        piePlot3D15.setBackgroundImageAlignment(1);
        boolean boolean18 = piePlot3D15.getSectionOutlinesVisible();
        double double19 = piePlot3D15.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator20 = piePlot3D15.getLegendLabelGenerator();
        java.awt.Font font21 = piePlot3D15.getLabelFont();
        java.awt.Paint paint22 = piePlot3D15.getLabelBackgroundPaint();
        piePlot3D13.setNoDataMessagePaint(paint22);
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = piePlot3D13.getSimpleLabelOffset();
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = piePlot3D13.getInsets();
        piePlot3D1.setParent((org.jfree.chart.plot.Plot) piePlot3D13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.14d + "'", double19 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator20);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertNotNull(rectangleInsets25);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint10 = piePlot3D1.getLabelShadowPaint();
        piePlot3D1.setStartAngle((double) (short) 0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = null;
        piePlot3D1.setURLGenerator(pieURLGenerator13);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator15 = null;
        piePlot3D1.setToolTipGenerator(pieToolTipGenerator15);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot3D1.setLabelShadowPaint(paint17);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator19 = piePlot3D1.getLegendLabelURLGenerator();
        piePlot3D1.setMinimumArcAngleToDraw((double) 'a');
        piePlot3D1.setCircular(true, true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(pieURLGenerator19);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D1.getLegendLabelGenerator();
        java.awt.Font font7 = piePlot3D1.getLabelFont();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor8 = piePlot3D1.getLabelDistributor();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D(pieDataset9);
        piePlot3D10.setBackgroundImageAlignment(1);
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D10.setLabelOutlinePaint(paint13);
        piePlot3D10.setBackgroundAlpha(0.0f);
        piePlot3D10.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint19 = piePlot3D10.getLabelShadowPaint();
        piePlot3D10.setStartAngle((double) (short) 0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = null;
        piePlot3D10.setURLGenerator(pieURLGenerator22);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator24 = null;
        piePlot3D10.setToolTipGenerator(pieToolTipGenerator24);
        java.awt.Paint paint26 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot3D10.setLabelShadowPaint(paint26);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = piePlot3D10.getSimpleLabelOffset();
        piePlot3D1.setSimpleLabelOffset(rectangleInsets28);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(rectangleInsets28);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint5 = piePlot3D1.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setShadowPaint(paint10);
        java.awt.Paint paint13 = piePlot3D1.getBaseSectionPaint();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator14 = null;
        piePlot3D1.setToolTipGenerator(pieToolTipGenerator14);
        boolean boolean16 = piePlot3D1.getDarkerSides();
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D1.getLegendLabelGenerator();
        java.awt.Font font7 = piePlot3D1.getLabelFont();
        piePlot3D1.setMinimumArcAngleToDraw(100.0d);
        java.awt.Paint paint10 = piePlot3D1.getLabelPaint();
        java.awt.Stroke stroke11 = piePlot3D1.getBaseSectionOutlineStroke();
        double double12 = piePlot3D1.getDepthFactor();
        piePlot3D1.setLabelLinksVisible(false);
        java.lang.Class<?> wildcardClass15 = piePlot3D1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12d + "'", double12 == 0.12d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets13, false);
        java.awt.Stroke stroke17 = null;
        piePlot3D1.setSectionOutlineStroke((java.lang.Comparable) 1.0f, stroke17);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets19, true);
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D23 = new org.jfree.chart.plot.PiePlot3D(pieDataset22);
        piePlot3D23.setBackgroundImageAlignment(1);
        java.awt.Paint paint26 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D23.setLabelOutlinePaint(paint26);
        piePlot3D1.setLabelOutlinePaint(paint26);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator29 = piePlot3D1.getURLGenerator();
        double double30 = piePlot3D1.getInteriorGap();
        org.jfree.data.general.PieDataset pieDataset31 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D32 = new org.jfree.chart.plot.PiePlot3D(pieDataset31);
        piePlot3D32.setBackgroundImageAlignment(1);
        java.awt.Paint paint35 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D32.setLabelOutlinePaint(paint35);
        piePlot3D32.setBackgroundAlpha(0.0f);
        java.awt.Font font39 = piePlot3D32.getNoDataMessageFont();
        piePlot3D1.setNoDataMessageFont(font39);
        piePlot3D1.setShadowYOffset((double) (short) 100);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNull(pieURLGenerator29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.08d + "'", double30 == 0.08d);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(font39);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint5 = piePlot3D1.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setShadowPaint(paint10);
        java.lang.Object obj13 = piePlot3D1.clone();
        piePlot3D1.setMinimumArcAngleToDraw(1.0d);
        piePlot3D1.setDarkerSides(false);
        java.awt.Paint paint18 = piePlot3D1.getBaseSectionPaint();
        piePlot3D1.setCircular(false);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        java.lang.String str13 = piePlot3D1.getPlotType();
        piePlot3D1.setLabelLinkMargin(0.0d);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D(pieDataset16);
        piePlot3D17.setBackgroundImageAlignment(1);
        boolean boolean20 = piePlot3D17.getSectionOutlinesVisible();
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        piePlot3D17.addChangeListener(plotChangeListener21);
        boolean boolean23 = piePlot3D1.equals((java.lang.Object) piePlot3D17);
        java.awt.Paint paint24 = piePlot3D17.getLabelPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pie 3D Plot" + "'", str13, "Pie 3D Plot");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint5 = piePlot3D1.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot3D1.getSimpleLabelOffset();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        piePlot3D1.removeChangeListener(plotChangeListener7);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator9 = piePlot3D1.getToolTipGenerator();
        piePlot3D1.setMaximumLabelWidth((double) 1L);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D(pieDataset12);
        piePlot3D13.setBackgroundImageAlignment(1);
        piePlot3D13.setBackgroundImageAlpha((float) (byte) 1);
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D(pieDataset18);
        piePlot3D19.setBackgroundImageAlignment(1);
        java.awt.Paint paint22 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D19.setNoDataMessagePaint(paint22);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D(pieDataset24);
        piePlot3D25.setBackgroundImageAlignment(1);
        java.awt.Paint paint28 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D25.setNoDataMessagePaint(paint28);
        piePlot3D19.setBaseSectionOutlinePaint(paint28);
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D19.setInsets(rectangleInsets31, false);
        piePlot3D13.setSimpleLabelOffset(rectangleInsets31);
        org.jfree.chart.LegendItemCollection legendItemCollection35 = piePlot3D13.getLegendItems();
        org.jfree.chart.event.PlotChangeListener plotChangeListener36 = null;
        piePlot3D13.addChangeListener(plotChangeListener36);
        piePlot3D13.setCircular(false);
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = piePlot3D13.getSimpleLabelOffset();
        java.awt.Stroke stroke41 = piePlot3D13.getLabelOutlineStroke();
        org.jfree.chart.event.PlotChangeListener plotChangeListener42 = null;
        piePlot3D13.removeChangeListener(plotChangeListener42);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent44 = null;
        piePlot3D13.markerChanged(markerChangeEvent44);
        java.awt.Paint paint46 = piePlot3D13.getOutlinePaint();
        piePlot3D1.setLabelBackgroundPaint(paint46);
        java.awt.Font font48 = piePlot3D1.getLabelFont();
        org.jfree.data.general.PieDataset pieDataset49 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D50 = new org.jfree.chart.plot.PiePlot3D(pieDataset49);
        piePlot3D50.setBackgroundImageAlignment(1);
        java.awt.Paint paint53 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D50.setLabelOutlinePaint(paint53);
        piePlot3D50.setBackgroundAlpha(0.0f);
        piePlot3D50.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint59 = piePlot3D50.getLabelShadowPaint();
        piePlot3D50.setStartAngle((double) (short) 0);
        piePlot3D50.setIgnoreNullValues(false);
        java.awt.Shape shape64 = piePlot3D50.getLegendItemShape();
        piePlot3D1.setLegendItemShape(shape64);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(pieToolTipGenerator9);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertNotNull(legendItemCollection35);
        org.junit.Assert.assertNotNull(rectangleInsets40);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(font48);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertNotNull(paint59);
        org.junit.Assert.assertNotNull(shape64);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets13, false);
        double double17 = piePlot3D1.getExplodePercent((java.lang.Comparable) 10);
        double double18 = piePlot3D1.getLabelGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = piePlot3D1.getDrawingSupplier();
        java.awt.Paint paint20 = piePlot3D1.getNoDataMessagePaint();
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D(pieDataset21);
        piePlot3D22.setBackgroundImageAlignment(1);
        boolean boolean25 = piePlot3D22.getSectionOutlinesVisible();
        double double26 = piePlot3D22.getMaximumLabelWidth();
        java.awt.Paint paint27 = piePlot3D22.getBaseSectionPaint();
        piePlot3D1.setLabelPaint(paint27);
        double double29 = piePlot3D1.getInteriorGap();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.025d + "'", double18 == 0.025d);
        org.junit.Assert.assertNotNull(drawingSupplier19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.14d + "'", double26 == 0.14d);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.08d + "'", double29 == 0.08d);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        piePlot3D1.setLabelLinksVisible(false);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D(pieDataset12);
        piePlot3D13.setBackgroundImageAlignment(1);
        java.awt.Paint paint16 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D13.setNoDataMessagePaint(paint16);
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D(pieDataset18);
        piePlot3D19.setBackgroundImageAlignment(1);
        java.awt.Paint paint22 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D19.setNoDataMessagePaint(paint22);
        piePlot3D13.setBaseSectionOutlinePaint(paint22);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D13.setInsets(rectangleInsets25, false);
        java.lang.String str28 = piePlot3D13.getPlotType();
        java.awt.Paint paint29 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D13.setLabelShadowPaint(paint29);
        piePlot3D1.setBaseSectionOutlinePaint(paint29);
        java.awt.Stroke stroke33 = null;
        piePlot3D1.setSectionOutlineStroke((java.lang.Comparable) (short) 1, stroke33);
        java.awt.Stroke stroke35 = piePlot3D1.getBaseSectionOutlineStroke();
        java.awt.Paint paint36 = piePlot3D1.getLabelOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset37 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D38 = new org.jfree.chart.plot.PiePlot3D(pieDataset37);
        piePlot3D38.setBackgroundImageAlignment(1);
        boolean boolean41 = piePlot3D38.getSectionOutlinesVisible();
        double double42 = piePlot3D38.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator43 = piePlot3D38.getLegendLabelGenerator();
        java.awt.Font font44 = piePlot3D38.getLabelFont();
        piePlot3D38.setMinimumArcAngleToDraw(100.0d);
        java.awt.Paint paint47 = piePlot3D38.getLabelPaint();
        java.awt.Stroke stroke48 = piePlot3D38.getBaseSectionOutlineStroke();
        piePlot3D1.setLabelOutlineStroke(stroke48);
        double double50 = piePlot3D1.getStartAngle();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator51 = null;
        piePlot3D1.setURLGenerator(pieURLGenerator51);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Pie 3D Plot" + "'", str28, "Pie 3D Plot");
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.14d + "'", double42 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator43);
        org.junit.Assert.assertNotNull(font44);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 90.0d + "'", double50 == 90.0d);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot3D1.getLegendLabelURLGenerator();
        boolean boolean7 = piePlot3D1.getIgnoreZeroValues();
        piePlot3D1.setStartAngle((double) (byte) 1);
        double double10 = piePlot3D1.getLabelLinkMargin();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D(pieDataset11);
        piePlot3D12.setBackgroundImageAlignment(1);
        java.awt.Paint paint15 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D12.setLabelOutlinePaint(paint15);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator17 = piePlot3D12.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D(pieDataset18);
        piePlot3D19.setBackgroundImageAlignment(1);
        java.awt.Paint paint22 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D19.setNoDataMessagePaint(paint22);
        piePlot3D12.setBaseSectionPaint(paint22);
        java.lang.String str25 = piePlot3D12.getNoDataMessage();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent26 = null;
        piePlot3D12.notifyListeners(plotChangeEvent26);
        int int28 = piePlot3D12.getPieIndex();
        piePlot3D12.setCircular(true);
        piePlot3D1.setParent((org.jfree.chart.plot.Plot) piePlot3D12);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D33 = new org.jfree.chart.plot.PiePlot3D(pieDataset32);
        piePlot3D33.setBackgroundImageAlignment(1);
        java.awt.Paint paint36 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D33.setLabelOutlinePaint(paint36);
        piePlot3D33.setBackgroundAlpha(0.0f);
        piePlot3D33.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint42 = piePlot3D33.getLabelShadowPaint();
        piePlot3D33.setStartAngle((double) (short) 0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator45 = null;
        piePlot3D33.setURLGenerator(pieURLGenerator45);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator47 = null;
        piePlot3D33.setToolTipGenerator(pieToolTipGenerator47);
        java.awt.Paint paint49 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot3D33.setLabelBackgroundPaint(paint49);
        piePlot3D12.setLabelShadowPaint(paint49);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.025d + "'", double10 == 0.025d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(pieURLGenerator17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(paint49);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets13, false);
        double double17 = piePlot3D1.getExplodePercent((java.lang.Comparable) 10);
        double double18 = piePlot3D1.getLabelGap();
        org.jfree.chart.plot.Plot plot19 = piePlot3D1.getRootPlot();
        piePlot3D1.setDarkerSides(false);
        int int22 = piePlot3D1.getBackgroundImageAlignment();
        piePlot3D1.setIgnoreNullValues(true);
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D28 = new org.jfree.chart.plot.PiePlot3D(pieDataset27);
        piePlot3D28.setBackgroundImageAlignment(1);
        boolean boolean31 = piePlot3D28.getSectionOutlinesVisible();
        double double32 = piePlot3D28.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator33 = piePlot3D28.getLegendLabelGenerator();
        java.awt.Font font34 = piePlot3D28.getLabelFont();
        piePlot3D28.setMinimumArcAngleToDraw(100.0d);
        org.jfree.data.general.PieDataset pieDataset37 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D38 = new org.jfree.chart.plot.PiePlot3D(pieDataset37);
        piePlot3D38.setBackgroundImageAlignment(1);
        java.awt.Paint paint42 = piePlot3D38.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset43 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D44 = new org.jfree.chart.plot.PiePlot3D(pieDataset43);
        piePlot3D44.setBackgroundImageAlignment(1);
        java.awt.Paint paint47 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D44.setNoDataMessagePaint(paint47);
        piePlot3D38.setShadowPaint(paint47);
        java.lang.Object obj50 = piePlot3D38.clone();
        piePlot3D38.setMinimumArcAngleToDraw(1.0d);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator53 = null;
        piePlot3D38.setToolTipGenerator(pieToolTipGenerator53);
        java.awt.Stroke stroke55 = piePlot3D38.getOutlineStroke();
        piePlot3D28.setOutlineStroke(stroke55);
        org.jfree.data.general.PieDataset pieDataset57 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D58 = new org.jfree.chart.plot.PiePlot3D(pieDataset57);
        piePlot3D58.setBackgroundImageAlignment(1);
        java.awt.Paint paint61 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D58.setLabelOutlinePaint(paint61);
        piePlot3D28.setLabelPaint(paint61);
        java.awt.Graphics2D graphics2D64 = null;
        java.awt.geom.Rectangle2D rectangle2D65 = null;
        piePlot3D28.drawBackgroundImage(graphics2D64, rectangle2D65);
        org.jfree.data.general.DatasetGroup datasetGroup67 = piePlot3D28.getDatasetGroup();
        piePlot3D28.setSimpleLabels(false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo71 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.plot.PiePlotState piePlotState72 = piePlot3D1.initialise(graphics2D25, rectangle2D26, (org.jfree.chart.plot.PiePlot) piePlot3D28, (java.lang.Integer) (-1), plotRenderingInfo71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.025d + "'", double18 == 0.025d);
        org.junit.Assert.assertNotNull(plot19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.14d + "'", double32 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator33);
        org.junit.Assert.assertNotNull(font34);
        org.junit.Assert.assertNull(paint42);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(stroke55);
        org.junit.Assert.assertNotNull(paint61);
        org.junit.Assert.assertNull(datasetGroup67);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot3D1.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D(pieDataset7);
        piePlot3D8.setBackgroundImageAlignment(1);
        java.awt.Paint paint11 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D8.setNoDataMessagePaint(paint11);
        piePlot3D1.setBaseSectionPaint(paint11);
        java.lang.String str14 = piePlot3D1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        piePlot3D1.notifyListeners(plotChangeEvent15);
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = piePlot3D1.getSimpleLabelOffset();
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D(pieDataset18);
        piePlot3D19.setBackgroundImageAlignment(1);
        java.awt.Paint paint23 = piePlot3D19.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D(pieDataset24);
        piePlot3D25.setBackgroundImageAlignment(1);
        java.awt.Paint paint28 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D25.setLabelOutlinePaint(paint28);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator30 = piePlot3D25.getLegendLabelURLGenerator();
        double double31 = piePlot3D25.getInteriorGap();
        java.awt.Shape shape32 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot3D25.setLegendItemShape(shape32);
        piePlot3D19.setLegendItemShape(shape32);
        piePlot3D1.setLegendItemShape(shape32);
        boolean boolean36 = piePlot3D1.getSimpleLabels();
        java.awt.Paint paint37 = piePlot3D1.getBaseSectionPaint();
        org.jfree.data.general.PieDataset pieDataset38 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D39 = new org.jfree.chart.plot.PiePlot3D(pieDataset38);
        piePlot3D39.setBackgroundImageAlignment(1);
        java.awt.Paint paint42 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D39.setLabelOutlinePaint(paint42);
        piePlot3D39.setBackgroundAlpha(0.0f);
        piePlot3D39.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint48 = piePlot3D39.getLabelShadowPaint();
        piePlot3D39.setStartAngle((double) (short) 0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator51 = null;
        piePlot3D39.setURLGenerator(pieURLGenerator51);
        piePlot3D39.setCircular(true);
        float float55 = piePlot3D39.getBackgroundImageAlpha();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator56 = piePlot3D39.getLabelGenerator();
        piePlot3D1.setLegendLabelGenerator(pieSectionLabelGenerator56);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNull(pieURLGenerator30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.08d + "'", double31 == 0.08d);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 0.5f + "'", float55 == 0.5f);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator56);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets13, false);
        java.awt.Stroke stroke17 = null;
        piePlot3D1.setSectionOutlineStroke((java.lang.Comparable) 1.0f, stroke17);
        piePlot3D1.setIgnoreZeroValues(false);
        org.jfree.chart.plot.Plot plot21 = piePlot3D1.getParent();
        piePlot3D1.setForegroundAlpha((float) (byte) -1);
        boolean boolean24 = piePlot3D1.isCircular();
        java.awt.Image image25 = null;
        piePlot3D1.setBackgroundImage(image25);
        boolean boolean27 = piePlot3D1.isCircular();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNull(plot21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        boolean boolean6 = piePlot3D1.isOutlineVisible();
        double double7 = piePlot3D1.getShadowXOffset();
        boolean boolean8 = piePlot3D1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D(pieDataset9);
        piePlot3D10.setBackgroundImageAlignment(1);
        boolean boolean13 = piePlot3D10.getSectionOutlinesVisible();
        double double14 = piePlot3D10.getMaximumLabelWidth();
        java.awt.Font font15 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_FONT;
        piePlot3D10.setLabelFont(font15);
        java.awt.Stroke stroke17 = piePlot3D10.getLabelLinkStroke();
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D(pieDataset18);
        piePlot3D19.setBackgroundImageAlignment(1);
        boolean boolean22 = piePlot3D19.getSectionOutlinesVisible();
        double double23 = piePlot3D19.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator24 = piePlot3D19.getLegendLabelGenerator();
        java.awt.Font font25 = piePlot3D19.getLabelFont();
        piePlot3D19.setMinimumArcAngleToDraw(100.0d);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent28 = null;
        piePlot3D19.axisChanged(axisChangeEvent28);
        java.awt.Stroke stroke30 = piePlot3D19.getLabelOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset31 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D32 = new org.jfree.chart.plot.PiePlot3D(pieDataset31);
        piePlot3D32.setBackgroundImageAlignment(1);
        java.awt.Paint paint35 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D32.setNoDataMessagePaint(paint35);
        org.jfree.data.general.PieDataset pieDataset37 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D38 = new org.jfree.chart.plot.PiePlot3D(pieDataset37);
        piePlot3D38.setBackgroundImageAlignment(1);
        java.awt.Paint paint41 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D38.setNoDataMessagePaint(paint41);
        piePlot3D32.setBaseSectionOutlinePaint(paint41);
        java.lang.String str44 = piePlot3D32.getPlotType();
        piePlot3D32.setLabelLinkMargin(0.0d);
        piePlot3D32.setShadowXOffset((double) 0.0f);
        java.awt.Paint paint49 = piePlot3D32.getNoDataMessagePaint();
        piePlot3D19.setOutlinePaint(paint49);
        piePlot3D10.setOutlinePaint(paint49);
        piePlot3D1.setLabelLinkPaint(paint49);
        java.awt.Font font53 = piePlot3D1.getNoDataMessageFont();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 4.0d + "'", double7 == 4.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.14d + "'", double14 == 0.14d);
        org.junit.Assert.assertNotNull(font15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.14d + "'", double23 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator24);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Pie 3D Plot" + "'", str44, "Pie 3D Plot");
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(font53);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        org.jfree.chart.event.PlotChangeListener plotChangeListener5 = null;
        piePlot3D1.addChangeListener(plotChangeListener5);
        boolean boolean7 = piePlot3D1.getIgnoreNullValues();
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot3D1.getDatasetGroup();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D(pieDataset10);
        piePlot3D11.setBackgroundImageAlignment(1);
        java.awt.Paint paint14 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D11.setLabelOutlinePaint(paint14);
        piePlot3D11.setBackgroundAlpha(0.0f);
        piePlot3D11.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint20 = piePlot3D11.getLabelShadowPaint();
        piePlot3D11.setStartAngle((double) (short) 0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator23 = null;
        piePlot3D11.setURLGenerator(pieURLGenerator23);
        piePlot3D11.setCircular(true);
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D11.setInsets(rectangleInsets27, true);
        org.jfree.data.general.PieDataset pieDataset30 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D31 = new org.jfree.chart.plot.PiePlot3D(pieDataset30);
        piePlot3D31.setBackgroundImageAlignment(1);
        java.awt.Paint paint34 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D31.setNoDataMessagePaint(paint34);
        org.jfree.data.general.PieDataset pieDataset36 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D37 = new org.jfree.chart.plot.PiePlot3D(pieDataset36);
        piePlot3D37.setBackgroundImageAlignment(1);
        java.awt.Paint paint40 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D37.setNoDataMessagePaint(paint40);
        piePlot3D31.setBaseSectionOutlinePaint(paint40);
        org.jfree.chart.util.RectangleInsets rectangleInsets43 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D31.setInsets(rectangleInsets43, false);
        double double47 = piePlot3D31.getExplodePercent((java.lang.Comparable) 10);
        double double48 = piePlot3D31.getLabelGap();
        org.jfree.chart.plot.Plot plot49 = piePlot3D31.getRootPlot();
        java.awt.Paint paint50 = plot49.getNoDataMessagePaint();
        piePlot3D11.setOutlinePaint(paint50);
        piePlot3D1.setSectionOutlinePaint((java.lang.Comparable) 1, paint50);
        double double54 = piePlot3D1.getExplodePercent((java.lang.Comparable) (short) 1);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent55 = null;
        piePlot3D1.notifyListeners(plotChangeEvent55);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(rectangleInsets43);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.025d + "'", double48 == 0.025d);
        org.junit.Assert.assertNotNull(plot49);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setCircular(false, true);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D(pieDataset9);
        piePlot3D10.setBackgroundImageAlignment(1);
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D10.setNoDataMessagePaint(paint13);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D(pieDataset15);
        piePlot3D16.setBackgroundImageAlignment(1);
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D16.setNoDataMessagePaint(paint19);
        piePlot3D10.setBaseSectionOutlinePaint(paint19);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setInsets(rectangleInsets22, false);
        piePlot3D1.setInsets(rectangleInsets22);
        piePlot3D1.setLabelLinkMargin((double) 1L);
        piePlot3D1.setOutlineVisible(false);
        java.awt.Paint paint30 = piePlot3D1.getBaseSectionOutlinePaint();
        piePlot3D1.setBackgroundImageAlpha((float) 0L);
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = piePlot3D1.getLabelPadding();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(rectangleInsets33);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets13, false);
        java.awt.Stroke stroke17 = null;
        piePlot3D1.setSectionOutlineStroke((java.lang.Comparable) 1.0f, stroke17);
        piePlot3D1.setIgnoreZeroValues(false);
        org.jfree.chart.plot.Plot plot21 = piePlot3D1.getParent();
        piePlot3D1.setShadowXOffset((double) (short) 100);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator24 = null;
        piePlot3D1.setToolTipGenerator(pieToolTipGenerator24);
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D28 = new org.jfree.chart.plot.PiePlot3D(pieDataset27);
        piePlot3D28.setBackgroundImageAlignment(1);
        boolean boolean31 = piePlot3D28.getSectionOutlinesVisible();
        double double32 = piePlot3D28.getMaximumLabelWidth();
        piePlot3D28.setDepthFactor(0.4d);
        java.awt.Image image35 = piePlot3D28.getBackgroundImage();
        piePlot3D28.setOutlineVisible(true);
        java.awt.Paint paint38 = piePlot3D28.getBaseSectionPaint();
        piePlot3D1.setSectionPaint((java.lang.Comparable) 'a', paint38);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNull(plot21);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.14d + "'", double32 == 0.14d);
        org.junit.Assert.assertNull(image35);
        org.junit.Assert.assertNotNull(paint38);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        double double7 = piePlot3D1.getExplodePercent((java.lang.Comparable) "");
        boolean boolean8 = piePlot3D1.getIgnoreZeroValues();
        double double9 = piePlot3D1.getShadowXOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D1.getLegendLabelGenerator();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D(pieDataset7);
        piePlot3D8.setBackgroundImageAlignment(1);
        java.awt.Paint paint11 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D8.setLabelOutlinePaint(paint11);
        piePlot3D8.setBackgroundAlpha(0.0f);
        piePlot3D8.setBackgroundAlpha((float) 0L);
        piePlot3D8.setLabelLinksVisible(false);
        java.awt.Stroke stroke20 = piePlot3D8.getSectionOutlineStroke((java.lang.Comparable) 100L);
        java.awt.Paint paint21 = piePlot3D8.getBackgroundPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = piePlot3D8.getSimpleLabelOffset();
        piePlot3D1.setInsets(rectangleInsets22, false);
        piePlot3D1.setStartAngle((double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(stroke20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(rectangleInsets22);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        piePlot3D1.removeChangeListener(plotChangeListener6);
        java.awt.Paint paint9 = piePlot3D1.getSectionPaint((java.lang.Comparable) 0);
        piePlot3D1.setDepthFactor((double) (short) 10);
        java.awt.Paint paint12 = piePlot3D1.getLabelPaint();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent13 = null;
        piePlot3D1.markerChanged(markerChangeEvent13);
        piePlot3D1.setPieIndex(100);
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D(pieDataset17);
        piePlot3D18.setBackgroundImageAlignment(1);
        java.awt.Paint paint21 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D18.setLabelOutlinePaint(paint21);
        piePlot3D18.setBackgroundAlpha(0.0f);
        piePlot3D18.setBackgroundAlpha((float) 0L);
        piePlot3D18.setLabelLinksVisible(false);
        piePlot3D18.setLabelGap(4.0d);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent31 = null;
        piePlot3D18.markerChanged(markerChangeEvent31);
        java.awt.Paint paint33 = piePlot3D18.getOutlinePaint();
        piePlot3D1.setBaseSectionPaint(paint33);
        org.jfree.data.general.PieDataset pieDataset35 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D36 = new org.jfree.chart.plot.PiePlot3D(pieDataset35);
        piePlot3D36.setBackgroundImageAlignment(1);
        boolean boolean39 = piePlot3D36.getSectionOutlinesVisible();
        double double40 = piePlot3D36.getMaximumLabelWidth();
        double double41 = piePlot3D36.getShadowXOffset();
        piePlot3D36.setIgnoreNullValues(false);
        java.awt.Font font44 = piePlot3D36.getLabelFont();
        org.jfree.data.general.PieDataset pieDataset45 = piePlot3D36.getDataset();
        org.jfree.data.general.PieDataset pieDataset46 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D47 = new org.jfree.chart.plot.PiePlot3D(pieDataset46);
        piePlot3D47.setBackgroundImageAlignment(1);
        java.awt.Paint paint50 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D47.setLabelOutlinePaint(paint50);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator52 = piePlot3D47.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset53 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D54 = new org.jfree.chart.plot.PiePlot3D(pieDataset53);
        piePlot3D54.setBackgroundImageAlignment(1);
        java.awt.Paint paint57 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D54.setNoDataMessagePaint(paint57);
        piePlot3D47.setBaseSectionPaint(paint57);
        java.lang.String str60 = piePlot3D47.getNoDataMessage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator61 = null;
        piePlot3D47.setLegendLabelURLGenerator(pieURLGenerator61);
        piePlot3D47.setShadowYOffset((double) 100L);
        java.awt.Font font65 = piePlot3D47.getNoDataMessageFont();
        piePlot3D36.setLabelFont(font65);
        piePlot3D1.setNoDataMessageFont(font65);
        org.jfree.data.general.DatasetGroup datasetGroup68 = piePlot3D1.getDatasetGroup();
        int int69 = piePlot3D1.getPieIndex();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.14d + "'", double40 == 0.14d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 4.0d + "'", double41 == 4.0d);
        org.junit.Assert.assertNotNull(font44);
        org.junit.Assert.assertNull(pieDataset45);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNull(pieURLGenerator52);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(font65);
        org.junit.Assert.assertNull(datasetGroup68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D1.getLegendLabelGenerator();
        java.awt.Font font7 = piePlot3D1.getLabelFont();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        piePlot3D1.handleClick((int) ' ', (int) ' ', plotRenderingInfo10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D(pieDataset12);
        piePlot3D13.setBackgroundImageAlignment(1);
        java.awt.Paint paint16 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D13.setLabelOutlinePaint(paint16);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator18 = piePlot3D13.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D(pieDataset19);
        piePlot3D20.setBackgroundImageAlignment(1);
        java.awt.Paint paint23 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D20.setNoDataMessagePaint(paint23);
        piePlot3D13.setBaseSectionPaint(paint23);
        piePlot3D1.setLabelBackgroundPaint(paint23);
        java.awt.Paint paint27 = piePlot3D1.getNoDataMessagePaint();
        piePlot3D1.setDepthFactor((double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(pieURLGenerator18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint27);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets13, false);
        boolean boolean16 = piePlot3D1.getLabelLinksVisible();
        org.jfree.chart.plot.Plot plot17 = piePlot3D1.getRootPlot();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(plot17);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setDepthFactor(0.4d);
        double double8 = piePlot3D1.getLabelLinkMargin();
        piePlot3D1.setStartAngle((double) 15);
        int int11 = piePlot3D1.getPieIndex();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.025d + "'", double8 == 0.025d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        java.lang.String str13 = piePlot3D1.getPlotType();
        piePlot3D1.setLabelLinkMargin(0.0d);
        piePlot3D1.setExplodePercent((java.lang.Comparable) true, (double) (short) 1);
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D(pieDataset19);
        piePlot3D20.setBackgroundImageAlignment(1);
        boolean boolean23 = piePlot3D20.getSectionOutlinesVisible();
        double double24 = piePlot3D20.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator25 = piePlot3D20.getLegendLabelGenerator();
        piePlot3D1.setLabelGenerator(pieSectionLabelGenerator25);
        java.awt.Paint paint27 = piePlot3D1.getLabelBackgroundPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator28 = piePlot3D1.getLegendLabelURLGenerator();
        java.awt.Stroke stroke29 = piePlot3D1.getBaseSectionOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset30 = piePlot3D1.getDataset();
        java.awt.Graphics2D graphics2D31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        piePlot3D1.drawBackgroundImage(graphics2D31, rectangle2D32);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pie 3D Plot" + "'", str13, "Pie 3D Plot");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.14d + "'", double24 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator25);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNull(pieURLGenerator28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNull(pieDataset30);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        java.awt.Paint paint6 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot3D1.setSectionOutlinePaint((java.lang.Comparable) "Pie 3D Plot", paint6);
        java.awt.Stroke stroke8 = piePlot3D1.getLabelLinkStroke();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D(pieDataset9);
        piePlot3D10.setBackgroundImageAlignment(1);
        boolean boolean13 = piePlot3D10.getSectionOutlinesVisible();
        double double14 = piePlot3D10.getMaximumLabelWidth();
        boolean boolean15 = piePlot3D10.isOutlineVisible();
        double double16 = piePlot3D10.getShadowXOffset();
        piePlot3D1.setParent((org.jfree.chart.plot.Plot) piePlot3D10);
        java.awt.Font font18 = piePlot3D10.getLabelFont();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.14d + "'", double14 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertNotNull(font18);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        piePlot3D1.setBackgroundImageAlpha((float) (byte) 1);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D(pieDataset12);
        piePlot3D13.setBackgroundImageAlignment(1);
        java.awt.Paint paint16 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D13.setNoDataMessagePaint(paint16);
        piePlot3D7.setBaseSectionOutlinePaint(paint16);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D7.setInsets(rectangleInsets19, false);
        piePlot3D1.setSimpleLabelOffset(rectangleInsets19);
        org.jfree.chart.LegendItemCollection legendItemCollection23 = piePlot3D1.getLegendItems();
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        piePlot3D1.addChangeListener(plotChangeListener24);
        java.awt.Graphics2D graphics2D26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        piePlot3D1.drawBackgroundImage(graphics2D26, rectangle2D27);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(legendItemCollection23);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint5 = piePlot3D1.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        piePlot3D1.setDataset(pieDataset6);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D(pieDataset9);
        piePlot3D10.setBackgroundImageAlignment(1);
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D10.setNoDataMessagePaint(paint13);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D(pieDataset15);
        piePlot3D16.setBackgroundImageAlignment(1);
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D16.setNoDataMessagePaint(paint19);
        piePlot3D10.setBaseSectionOutlinePaint(paint19);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setInsets(rectangleInsets22, false);
        java.awt.Stroke stroke26 = null;
        piePlot3D10.setSectionOutlineStroke((java.lang.Comparable) 1.0f, stroke26);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setInsets(rectangleInsets28, true);
        org.jfree.data.general.PieDataset pieDataset31 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D32 = new org.jfree.chart.plot.PiePlot3D(pieDataset31);
        piePlot3D32.setBackgroundImageAlignment(1);
        java.awt.Paint paint35 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D32.setLabelOutlinePaint(paint35);
        piePlot3D10.setLabelOutlinePaint(paint35);
        piePlot3D1.setSectionPaint((java.lang.Comparable) 0.0d, paint35);
        java.awt.Paint paint39 = piePlot3D1.getBaseSectionOutlinePaint();
        double double40 = piePlot3D1.getStartAngle();
        org.jfree.data.general.PieDataset pieDataset41 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D42 = new org.jfree.chart.plot.PiePlot3D(pieDataset41);
        piePlot3D42.setBackgroundImageAlignment(1);
        java.awt.Paint paint45 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D42.setLabelOutlinePaint(paint45);
        piePlot3D42.setBackgroundAlpha(0.0f);
        piePlot3D42.setBackgroundAlpha((float) 0L);
        piePlot3D42.setLabelLinksVisible(false);
        piePlot3D42.setLabelGap(4.0d);
        org.jfree.data.general.PieDataset pieDataset55 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D56 = new org.jfree.chart.plot.PiePlot3D(pieDataset55);
        piePlot3D56.setBackgroundImageAlignment(1);
        boolean boolean59 = piePlot3D56.getSectionOutlinesVisible();
        double double60 = piePlot3D56.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator61 = piePlot3D56.getLegendLabelGenerator();
        java.awt.Font font62 = piePlot3D56.getLabelFont();
        piePlot3D42.setLabelFont(font62);
        piePlot3D1.setLabelFont(font62);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 90.0d + "'", double40 == 90.0d);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.14d + "'", double60 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator61);
        org.junit.Assert.assertNotNull(font62);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets13, false);
        double double17 = piePlot3D1.getExplodePercent((java.lang.Comparable) 10);
        boolean boolean18 = piePlot3D1.isSubplot();
        double double19 = piePlot3D1.getShadowXOffset();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 4.0d + "'", double19 == 4.0d);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        double double10 = piePlot3D1.getLabelGap();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        piePlot3D1.handleClick((int) (byte) 100, (int) (byte) 1, plotRenderingInfo13);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        piePlot3D1.drawBackgroundImage(graphics2D15, rectangle2D16);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator18 = null;
        piePlot3D1.setURLGenerator(pieURLGenerator18);
        float float20 = piePlot3D1.getBackgroundAlpha();
        piePlot3D1.setMaximumLabelWidth((double) (byte) 100);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator23 = piePlot3D1.getURLGenerator();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.025d + "'", double10 == 0.025d);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertNull(pieURLGenerator23);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        piePlot3D1.removeChangeListener(plotChangeListener6);
        java.awt.Paint paint9 = piePlot3D1.getSectionPaint((java.lang.Comparable) 0);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D(pieDataset10);
        piePlot3D11.setBackgroundImageAlignment(1);
        java.awt.Paint paint14 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D11.setNoDataMessagePaint(paint14);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D(pieDataset16);
        piePlot3D17.setBackgroundImageAlignment(1);
        java.awt.Paint paint20 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D17.setNoDataMessagePaint(paint20);
        piePlot3D11.setBaseSectionOutlinePaint(paint20);
        java.lang.String str23 = piePlot3D11.getPlotType();
        piePlot3D11.setLabelLinkMargin(0.0d);
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D27 = new org.jfree.chart.plot.PiePlot3D(pieDataset26);
        piePlot3D27.setBackgroundImageAlignment(1);
        boolean boolean30 = piePlot3D27.getSectionOutlinesVisible();
        org.jfree.chart.event.PlotChangeListener plotChangeListener31 = null;
        piePlot3D27.addChangeListener(plotChangeListener31);
        boolean boolean33 = piePlot3D11.equals((java.lang.Object) piePlot3D27);
        boolean boolean34 = piePlot3D27.isOutlineVisible();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator35 = piePlot3D27.getURLGenerator();
        java.awt.Stroke stroke36 = piePlot3D27.getLabelOutlineStroke();
        piePlot3D1.setBaseSectionOutlineStroke(stroke36);
        boolean boolean38 = piePlot3D1.getDarkerSides();
        boolean boolean39 = piePlot3D1.isCircular();
        piePlot3D1.setBackgroundImageAlignment((int) (byte) 1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pie 3D Plot" + "'", str23, "Pie 3D Plot");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(pieURLGenerator35);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        piePlot3D1.removeChangeListener(plotChangeListener6);
        java.awt.Paint paint9 = piePlot3D1.getSectionPaint((java.lang.Comparable) 0);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D(pieDataset10);
        piePlot3D11.setBackgroundImageAlignment(1);
        java.awt.Paint paint14 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D11.setNoDataMessagePaint(paint14);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D(pieDataset16);
        piePlot3D17.setBackgroundImageAlignment(1);
        java.awt.Paint paint20 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D17.setNoDataMessagePaint(paint20);
        piePlot3D11.setBaseSectionOutlinePaint(paint20);
        java.lang.String str23 = piePlot3D11.getPlotType();
        piePlot3D11.setLabelLinkMargin(0.0d);
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D27 = new org.jfree.chart.plot.PiePlot3D(pieDataset26);
        piePlot3D27.setBackgroundImageAlignment(1);
        boolean boolean30 = piePlot3D27.getSectionOutlinesVisible();
        org.jfree.chart.event.PlotChangeListener plotChangeListener31 = null;
        piePlot3D27.addChangeListener(plotChangeListener31);
        boolean boolean33 = piePlot3D11.equals((java.lang.Object) piePlot3D27);
        boolean boolean34 = piePlot3D27.isOutlineVisible();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator35 = piePlot3D27.getURLGenerator();
        java.awt.Stroke stroke36 = piePlot3D27.getLabelOutlineStroke();
        piePlot3D1.setBaseSectionOutlineStroke(stroke36);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator38 = null;
        piePlot3D1.setURLGenerator(pieURLGenerator38);
        org.jfree.chart.util.RectangleInsets rectangleInsets40 = piePlot3D1.getInsets();
        java.awt.Paint paint42 = piePlot3D1.getSectionOutlinePaint((java.lang.Comparable) (byte) -1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pie 3D Plot" + "'", str23, "Pie 3D Plot");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(pieURLGenerator35);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(rectangleInsets40);
        org.junit.Assert.assertNull(paint42);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        boolean boolean10 = piePlot3D1.isCircular();
        org.jfree.data.general.DatasetGroup datasetGroup11 = piePlot3D1.getDatasetGroup();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(datasetGroup11);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot3D1.getLegendLabelURLGenerator();
        java.awt.Stroke stroke7 = null;
        piePlot3D1.setLabelOutlineStroke(stroke7);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D(pieDataset9);
        piePlot3D10.setBackgroundImageAlignment(1);
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D10.setLabelOutlinePaint(paint13);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator15 = piePlot3D10.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D(pieDataset16);
        piePlot3D17.setBackgroundImageAlignment(1);
        java.awt.Paint paint20 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D17.setNoDataMessagePaint(paint20);
        piePlot3D10.setBaseSectionPaint(paint20);
        java.lang.String str23 = piePlot3D10.getNoDataMessage();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = piePlot3D10.getSimpleLabelOffset();
        piePlot3D1.setSimpleLabelOffset(rectangleInsets24);
        java.lang.String str26 = piePlot3D1.getPlotType();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator27 = null;
        piePlot3D1.setURLGenerator(pieURLGenerator27);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(pieURLGenerator15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(rectangleInsets24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Pie 3D Plot" + "'", str26, "Pie 3D Plot");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        double double10 = piePlot3D1.getLabelGap();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        piePlot3D1.handleClick((int) (byte) 100, (int) (byte) 1, plotRenderingInfo13);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        piePlot3D1.drawBackgroundImage(graphics2D15, rectangle2D16);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator18 = null;
        piePlot3D1.setURLGenerator(pieURLGenerator18);
        java.awt.Font font20 = piePlot3D1.getLabelFont();
        piePlot3D1.setIgnoreZeroValues(true);
        boolean boolean23 = piePlot3D1.getSimpleLabels();
        boolean boolean24 = piePlot3D1.getIgnoreZeroValues();
        boolean boolean25 = piePlot3D1.isCircular();
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D27 = new org.jfree.chart.plot.PiePlot3D(pieDataset26);
        piePlot3D27.setBackgroundImageAlignment(1);
        java.awt.Paint paint30 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D27.setLabelOutlinePaint(paint30);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator32 = piePlot3D27.getLegendLabelURLGenerator();
        double double33 = piePlot3D27.getInteriorGap();
        java.awt.Shape shape34 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot3D27.setLegendItemShape(shape34);
        piePlot3D1.setLegendItemShape(shape34);
        boolean boolean37 = piePlot3D1.getIgnoreZeroValues();
        java.awt.Graphics2D graphics2D38 = null;
        java.awt.geom.Rectangle2D rectangle2D39 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D1.drawBackground(graphics2D38, rectangle2D39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.025d + "'", double10 == 0.025d);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNull(pieURLGenerator32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.08d + "'", double33 == 0.08d);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot3D1.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D(pieDataset7);
        piePlot3D8.setBackgroundImageAlignment(1);
        java.awt.Paint paint11 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D8.setNoDataMessagePaint(paint11);
        piePlot3D1.setBaseSectionPaint(paint11);
        piePlot3D1.setPieIndex((int) (short) 0);
        java.awt.Paint paint16 = piePlot3D1.getLabelOutlinePaint();
        piePlot3D1.zoom((-1.0d));
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setShadowXOffset((double) (byte) 10);
        boolean boolean8 = piePlot3D1.getSimpleLabels();
        java.awt.Stroke stroke9 = null;
        piePlot3D1.setLabelOutlineStroke(stroke9);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator11 = null;
        piePlot3D1.setToolTipGenerator(pieToolTipGenerator11);
        piePlot3D1.setOutlineVisible(false);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D(pieDataset15);
        piePlot3D16.setBackgroundImageAlignment(1);
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D16.setLabelOutlinePaint(paint19);
        piePlot3D16.setBackgroundAlpha(0.0f);
        piePlot3D16.setBackgroundAlpha((float) 0L);
        double double26 = piePlot3D16.getExplodePercent((java.lang.Comparable) 10.0f);
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot3D16.setBaseSectionOutlinePaint(paint27);
        piePlot3D1.setBaseSectionOutlinePaint(paint27);
        double double31 = piePlot3D1.getExplodePercent((java.lang.Comparable) 4.0d);
        boolean boolean32 = piePlot3D1.getLabelLinksVisible();
        boolean boolean33 = piePlot3D1.isSubplot();
        double double34 = piePlot3D1.getLabelGap();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.025d + "'", double34 == 0.025d);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        double double10 = piePlot3D1.getLabelGap();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        piePlot3D1.handleClick((int) (byte) 100, (int) (byte) 1, plotRenderingInfo13);
        piePlot3D1.setForegroundAlpha((-1.0f));
        piePlot3D1.setPieIndex((int) (byte) 100);
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent19 = null;
        piePlot3D1.datasetChanged(datasetChangeEvent19);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator21 = piePlot3D1.getLegendLabelToolTipGenerator();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.025d + "'", double10 == 0.025d);
        org.junit.Assert.assertNull(pieSectionLabelGenerator21);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets13, false);
        java.awt.Stroke stroke17 = null;
        piePlot3D1.setSectionOutlineStroke((java.lang.Comparable) 1.0f, stroke17);
        piePlot3D1.setIgnoreZeroValues(false);
        org.jfree.chart.plot.Plot plot21 = piePlot3D1.getParent();
        piePlot3D1.setShadowXOffset((double) (short) 100);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D(pieDataset24);
        piePlot3D25.setBackgroundImageAlignment(1);
        boolean boolean28 = piePlot3D25.getSectionOutlinesVisible();
        double double29 = piePlot3D25.getMaximumLabelWidth();
        piePlot3D25.setShadowXOffset((double) (byte) 10);
        boolean boolean32 = piePlot3D25.getSimpleLabels();
        java.awt.Stroke stroke33 = null;
        piePlot3D25.setLabelOutlineStroke(stroke33);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator35 = null;
        piePlot3D25.setToolTipGenerator(pieToolTipGenerator35);
        piePlot3D25.setSimpleLabels(true);
        java.awt.Font font39 = piePlot3D25.getLabelFont();
        java.awt.Paint paint40 = piePlot3D25.getLabelLinkPaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier41 = piePlot3D25.getDrawingSupplier();
        piePlot3D1.setDrawingSupplier(drawingSupplier41);
        java.awt.Stroke stroke43 = piePlot3D1.getBaseSectionOutlineStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNull(plot21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.14d + "'", double29 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(font39);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNotNull(drawingSupplier41);
        org.junit.Assert.assertNotNull(stroke43);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setShadowXOffset((double) (byte) 10);
        boolean boolean8 = piePlot3D1.getSimpleLabels();
        org.jfree.chart.util.Rotation rotation9 = piePlot3D1.getDirection();
        piePlot3D1.setInteriorGap(0.025d);
        piePlot3D1.setCircular(true, false);
        java.awt.Paint paint15 = piePlot3D1.getNoDataMessagePaint();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D(pieDataset16);
        piePlot3D17.setBackgroundImageAlignment(1);
        java.awt.Paint paint20 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D17.setLabelOutlinePaint(paint20);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator22 = piePlot3D17.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset23 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D24 = new org.jfree.chart.plot.PiePlot3D(pieDataset23);
        piePlot3D24.setBackgroundImageAlignment(1);
        java.awt.Paint paint27 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D24.setNoDataMessagePaint(paint27);
        piePlot3D17.setBaseSectionPaint(paint27);
        java.lang.String str30 = piePlot3D17.getNoDataMessage();
        java.awt.Stroke stroke32 = null;
        piePlot3D17.setSectionOutlineStroke((java.lang.Comparable) 0.025d, stroke32);
        java.awt.Stroke stroke34 = piePlot3D17.getLabelOutlineStroke();
        piePlot3D1.setBaseSectionOutlineStroke(stroke34);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rotation9);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNull(pieURLGenerator22);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(stroke34);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint5 = piePlot3D1.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setShadowPaint(paint10);
        java.lang.Object obj13 = piePlot3D1.clone();
        piePlot3D1.setMinimumArcAngleToDraw(1.0d);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator16 = null;
        piePlot3D1.setToolTipGenerator(pieToolTipGenerator16);
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D(pieDataset18);
        piePlot3D19.setBackgroundImageAlignment(1);
        java.awt.Paint paint22 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D19.setLabelOutlinePaint(paint22);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator24 = piePlot3D19.getLegendLabelURLGenerator();
        java.awt.Stroke stroke25 = null;
        piePlot3D19.setLabelOutlineStroke(stroke25);
        boolean boolean27 = piePlot3D19.getSectionOutlinesVisible();
        piePlot3D19.setIgnoreZeroValues(false);
        org.jfree.chart.util.Rotation rotation30 = piePlot3D19.getDirection();
        piePlot3D1.setDirection(rotation30);
        java.awt.Paint paint32 = piePlot3D1.getNoDataMessagePaint();
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(pieURLGenerator24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(rotation30);
        org.junit.Assert.assertNotNull(paint32);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint10 = piePlot3D1.getLabelShadowPaint();
        piePlot3D1.setStartAngle((double) (short) 0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = null;
        piePlot3D1.setURLGenerator(pieURLGenerator13);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator15 = null;
        piePlot3D1.setToolTipGenerator(pieToolTipGenerator15);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot3D1.setLabelShadowPaint(paint17);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator19 = piePlot3D1.getLegendLabelURLGenerator();
        piePlot3D1.setMinimumArcAngleToDraw((double) 'a');
        double double22 = piePlot3D1.getMinimumArcAngleToDraw();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        piePlot3D1.handleClick((int) '4', (int) (short) 0, plotRenderingInfo25);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(pieURLGenerator19);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 97.0d + "'", double22 == 97.0d);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setShadowXOffset((double) (byte) 10);
        boolean boolean8 = piePlot3D1.getSimpleLabels();
        java.awt.Stroke stroke9 = null;
        piePlot3D1.setLabelOutlineStroke(stroke9);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator11 = null;
        piePlot3D1.setToolTipGenerator(pieToolTipGenerator11);
        piePlot3D1.setOutlineVisible(false);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D(pieDataset15);
        piePlot3D16.setBackgroundImageAlignment(1);
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D16.setLabelOutlinePaint(paint19);
        piePlot3D16.setBackgroundAlpha(0.0f);
        piePlot3D16.setBackgroundAlpha((float) 0L);
        double double26 = piePlot3D16.getExplodePercent((java.lang.Comparable) 10.0f);
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot3D16.setBaseSectionOutlinePaint(paint27);
        piePlot3D1.setBaseSectionOutlinePaint(paint27);
        double double31 = piePlot3D1.getExplodePercent((java.lang.Comparable) 4.0d);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor32 = piePlot3D1.getLabelDistributor();
        java.awt.Shape shape33 = piePlot3D1.getLegendItemShape();
        piePlot3D1.setDarkerSides(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor32);
        org.junit.Assert.assertNotNull(shape33);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint5 = piePlot3D1.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot3D1.getSimpleLabelOffset();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        piePlot3D1.removeChangeListener(plotChangeListener7);
        double double9 = piePlot3D1.getStartAngle();
        java.awt.Paint paint10 = piePlot3D1.getLabelShadowPaint();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D(pieDataset11);
        piePlot3D12.setBackgroundImageAlignment(1);
        boolean boolean15 = piePlot3D12.getSectionOutlinesVisible();
        double double16 = piePlot3D12.getMaximumLabelWidth();
        java.awt.Paint paint17 = piePlot3D12.getBaseSectionPaint();
        piePlot3D1.setLabelPaint(paint17);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 90.0d + "'", double9 == 90.0d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.14d + "'", double16 == 0.14d);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D1.getLegendLabelGenerator();
        java.awt.Font font7 = piePlot3D1.getLabelFont();
        piePlot3D1.setMinimumArcAngleToDraw(100.0d);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent10 = null;
        piePlot3D1.axisChanged(axisChangeEvent10);
        java.awt.Stroke stroke12 = piePlot3D1.getLabelOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D(pieDataset13);
        piePlot3D14.setBackgroundImageAlignment(1);
        java.awt.Paint paint17 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D14.setNoDataMessagePaint(paint17);
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D(pieDataset19);
        piePlot3D20.setBackgroundImageAlignment(1);
        java.awt.Paint paint23 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D20.setNoDataMessagePaint(paint23);
        piePlot3D14.setBaseSectionOutlinePaint(paint23);
        java.lang.String str26 = piePlot3D14.getPlotType();
        piePlot3D14.setLabelLinkMargin(0.0d);
        piePlot3D14.setShadowXOffset((double) 0.0f);
        java.awt.Paint paint31 = piePlot3D14.getNoDataMessagePaint();
        piePlot3D1.setOutlinePaint(paint31);
        int int33 = piePlot3D1.getPieIndex();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator34 = piePlot3D1.getLegendLabelToolTipGenerator();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Pie 3D Plot" + "'", str26, "Pie 3D Plot");
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(pieSectionLabelGenerator34);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setShadowXOffset((double) (byte) 10);
        boolean boolean8 = piePlot3D1.getSimpleLabels();
        java.awt.Stroke stroke9 = null;
        piePlot3D1.setLabelOutlineStroke(stroke9);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator11 = null;
        piePlot3D1.setToolTipGenerator(pieToolTipGenerator11);
        piePlot3D1.setSimpleLabels(true);
        float float15 = piePlot3D1.getBackgroundImageAlpha();
        boolean boolean16 = piePlot3D1.getDarkerSides();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets13, false);
        java.lang.String str16 = piePlot3D1.getPlotType();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent17 = null;
        piePlot3D1.datasetChanged(datasetChangeEvent17);
        java.awt.Paint paint19 = piePlot3D1.getBaseSectionOutlinePaint();
        java.awt.Paint paint20 = piePlot3D1.getBaseSectionPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setLabelPadding(rectangleInsets21);
        java.awt.Paint paint23 = piePlot3D1.getNoDataMessagePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pie 3D Plot" + "'", str16, "Pie 3D Plot");
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot3D1.getLegendLabelURLGenerator();
        double double7 = piePlot3D1.getInteriorGap();
        org.jfree.data.general.DatasetGroup datasetGroup8 = piePlot3D1.getDatasetGroup();
        java.awt.Paint paint9 = piePlot3D1.getOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D(pieDataset10);
        piePlot3D11.setBackgroundImageAlignment(1);
        boolean boolean14 = piePlot3D11.getSectionOutlinesVisible();
        double double15 = piePlot3D11.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator16 = piePlot3D11.getLegendLabelGenerator();
        java.awt.Font font17 = piePlot3D11.getLabelFont();
        piePlot3D11.setMinimumArcAngleToDraw(100.0d);
        java.awt.Paint paint20 = piePlot3D11.getLabelPaint();
        java.awt.Stroke stroke21 = piePlot3D11.getBaseSectionOutlineStroke();
        double double22 = piePlot3D11.getDepthFactor();
        double double23 = piePlot3D11.getMinimumArcAngleToDraw();
        org.jfree.chart.util.RectangleInsets rectangleInsets24 = piePlot3D11.getSimpleLabelOffset();
        piePlot3D1.setLabelPadding(rectangleInsets24);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08d + "'", double7 == 0.08d);
        org.junit.Assert.assertNull(datasetGroup8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.14d + "'", double15 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator16);
        org.junit.Assert.assertNotNull(font17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.12d + "'", double22 == 0.12d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(rectangleInsets24);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setCircular(false, true);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D(pieDataset9);
        piePlot3D10.setBackgroundImageAlignment(1);
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D10.setNoDataMessagePaint(paint13);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D(pieDataset15);
        piePlot3D16.setBackgroundImageAlignment(1);
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D16.setNoDataMessagePaint(paint19);
        piePlot3D10.setBaseSectionOutlinePaint(paint19);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setInsets(rectangleInsets22, false);
        piePlot3D1.setInsets(rectangleInsets22);
        java.awt.Stroke stroke26 = piePlot3D1.getLabelLinkStroke();
        java.awt.Paint paint28 = null;
        piePlot3D1.setSectionPaint((java.lang.Comparable) (byte) -1, paint28);
        java.lang.Object obj30 = piePlot3D1.clone();
        float float31 = piePlot3D1.getBackgroundAlpha();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot3D1.getLegendLabelURLGenerator();
        java.awt.Stroke stroke7 = null;
        piePlot3D1.setLabelOutlineStroke(stroke7);
        boolean boolean9 = piePlot3D1.getSectionOutlinesVisible();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        piePlot3D1.drawBackgroundImage(graphics2D10, rectangle2D11);
        piePlot3D1.setExplodePercent((java.lang.Comparable) (short) 1, 1.0E-5d);
        piePlot3D1.setShadowXOffset(0.0d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        piePlot3D1.setBackgroundImageAlpha((float) (byte) 1);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D(pieDataset12);
        piePlot3D13.setBackgroundImageAlignment(1);
        java.awt.Paint paint16 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D13.setNoDataMessagePaint(paint16);
        piePlot3D7.setBaseSectionOutlinePaint(paint16);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D7.setInsets(rectangleInsets19, false);
        piePlot3D1.setSimpleLabelOffset(rectangleInsets19);
        piePlot3D1.setLabelGap(100.0d);
        org.jfree.data.general.DatasetGroup datasetGroup25 = piePlot3D1.getDatasetGroup();
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNull(datasetGroup25);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint10 = piePlot3D1.getLabelShadowPaint();
        piePlot3D1.setStartAngle((double) (short) 0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = null;
        piePlot3D1.setURLGenerator(pieURLGenerator13);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator15 = null;
        piePlot3D1.setToolTipGenerator(pieToolTipGenerator15);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator17 = null;
        piePlot3D1.setURLGenerator(pieURLGenerator17);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent19 = null;
        piePlot3D1.notifyListeners(plotChangeEvent19);
        double double21 = piePlot3D1.getMaximumLabelWidth();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.14d + "'", double21 == 0.14d);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setDepthFactor(0.4d);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_OUTLINE_STROKE;
        piePlot3D1.setLabelOutlineStroke(stroke8);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D(pieDataset10);
        piePlot3D11.setBackgroundImageAlignment(1);
        java.awt.Paint paint14 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D11.setNoDataMessagePaint(paint14);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D(pieDataset16);
        piePlot3D17.setBackgroundImageAlignment(1);
        java.awt.Paint paint20 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D17.setNoDataMessagePaint(paint20);
        piePlot3D11.setBaseSectionOutlinePaint(paint20);
        org.jfree.chart.util.RectangleInsets rectangleInsets23 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D11.setInsets(rectangleInsets23, false);
        java.lang.String str26 = piePlot3D11.getPlotType();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent27 = null;
        piePlot3D11.datasetChanged(datasetChangeEvent27);
        java.awt.Paint paint29 = piePlot3D11.getBaseSectionOutlinePaint();
        piePlot3D1.setShadowPaint(paint29);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(rectangleInsets23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Pie 3D Plot" + "'", str26, "Pie 3D Plot");
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        java.lang.String str13 = piePlot3D1.getPlotType();
        piePlot3D1.setLabelLinkMargin(0.0d);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D(pieDataset16);
        piePlot3D17.setBackgroundImageAlignment(1);
        boolean boolean20 = piePlot3D17.getSectionOutlinesVisible();
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        piePlot3D17.addChangeListener(plotChangeListener21);
        boolean boolean23 = piePlot3D1.equals((java.lang.Object) piePlot3D17);
        boolean boolean24 = piePlot3D17.isOutlineVisible();
        piePlot3D17.setNoDataMessage("");
        boolean boolean27 = piePlot3D17.getIgnoreZeroValues();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pie 3D Plot" + "'", str13, "Pie 3D Plot");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D1.getLegendLabelGenerator();
        java.awt.Font font7 = piePlot3D1.getLabelFont();
        piePlot3D1.setMinimumArcAngleToDraw(100.0d);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent10 = null;
        piePlot3D1.axisChanged(axisChangeEvent10);
        java.awt.Stroke stroke12 = piePlot3D1.getLabelOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D(pieDataset13);
        piePlot3D14.setBackgroundImageAlignment(1);
        java.awt.Paint paint17 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D14.setNoDataMessagePaint(paint17);
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D(pieDataset19);
        piePlot3D20.setBackgroundImageAlignment(1);
        java.awt.Paint paint23 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D20.setNoDataMessagePaint(paint23);
        piePlot3D14.setBaseSectionOutlinePaint(paint23);
        java.lang.String str26 = piePlot3D14.getPlotType();
        piePlot3D14.setLabelLinkMargin(0.0d);
        piePlot3D14.setShadowXOffset((double) 0.0f);
        java.awt.Paint paint31 = piePlot3D14.getNoDataMessagePaint();
        piePlot3D1.setOutlinePaint(paint31);
        org.jfree.chart.event.PlotChangeListener plotChangeListener33 = null;
        piePlot3D1.addChangeListener(plotChangeListener33);
        boolean boolean35 = piePlot3D1.getSimpleLabels();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Pie 3D Plot" + "'", str26, "Pie 3D Plot");
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets13, false);
        double double17 = piePlot3D1.getExplodePercent((java.lang.Comparable) 10);
        double double18 = piePlot3D1.getLabelGap();
        org.jfree.chart.plot.Plot plot19 = piePlot3D1.getRootPlot();
        piePlot3D1.setDarkerSides(false);
        int int22 = piePlot3D1.getBackgroundImageAlignment();
        org.jfree.data.general.DatasetGroup datasetGroup23 = piePlot3D1.getDatasetGroup();
        piePlot3D1.setShadowYOffset((double) (byte) 1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.025d + "'", double18 == 0.025d);
        org.junit.Assert.assertNotNull(plot19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(datasetGroup23);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets13, false);
        java.lang.String str16 = piePlot3D1.getPlotType();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent17 = null;
        piePlot3D1.datasetChanged(datasetChangeEvent17);
        java.awt.Paint paint19 = piePlot3D1.getBaseSectionOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D(pieDataset20);
        piePlot3D21.setBackgroundImageAlignment(1);
        boolean boolean24 = piePlot3D21.getSectionOutlinesVisible();
        double double25 = piePlot3D21.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator26 = piePlot3D21.getLegendLabelGenerator();
        java.awt.Font font27 = piePlot3D21.getLabelFont();
        java.awt.Paint paint28 = piePlot3D21.getLabelBackgroundPaint();
        piePlot3D1.setLabelPaint(paint28);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator30 = null;
        piePlot3D1.setLegendLabelURLGenerator(pieURLGenerator30);
        boolean boolean32 = piePlot3D1.isSubplot();
        double double33 = piePlot3D1.getStartAngle();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator34 = piePlot3D1.getLegendLabelGenerator();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pie 3D Plot" + "'", str16, "Pie 3D Plot");
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.14d + "'", double25 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator26);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 90.0d + "'", double33 == 90.0d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator34);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        piePlot3D1.setBackgroundImageAlpha((float) (byte) 1);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D(pieDataset12);
        piePlot3D13.setBackgroundImageAlignment(1);
        java.awt.Paint paint16 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D13.setNoDataMessagePaint(paint16);
        piePlot3D7.setBaseSectionOutlinePaint(paint16);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D7.setInsets(rectangleInsets19, false);
        piePlot3D1.setSimpleLabelOffset(rectangleInsets19);
        org.jfree.chart.LegendItemCollection legendItemCollection23 = piePlot3D1.getLegendItems();
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        piePlot3D1.addChangeListener(plotChangeListener24);
        piePlot3D1.setCircular(false);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = piePlot3D1.getSimpleLabelOffset();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator29 = null;
        piePlot3D1.setLegendLabelURLGenerator(pieURLGenerator29);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(legendItemCollection23);
        org.junit.Assert.assertNotNull(rectangleInsets28);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint5 = piePlot3D1.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setLabelOutlinePaint(paint10);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator12 = piePlot3D7.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset13 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D14 = new org.jfree.chart.plot.PiePlot3D(pieDataset13);
        piePlot3D14.setBackgroundImageAlignment(1);
        java.awt.Paint paint17 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D14.setNoDataMessagePaint(paint17);
        piePlot3D7.setBaseSectionPaint(paint17);
        piePlot3D1.setShadowPaint(paint17);
        org.jfree.chart.util.RectangleInsets rectangleInsets21 = piePlot3D1.getSimpleLabelOffset();
        java.awt.Stroke stroke22 = piePlot3D1.getBaseSectionOutlineStroke();
        boolean boolean23 = piePlot3D1.isCircular();
        double double25 = piePlot3D1.getExplodePercent((java.lang.Comparable) 90.0d);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(pieURLGenerator12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(rectangleInsets21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint5 = piePlot3D1.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot3D1.getSimpleLabelOffset();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        piePlot3D1.removeChangeListener(plotChangeListener7);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator9 = piePlot3D1.getToolTipGenerator();
        piePlot3D1.setCircular(false);
        piePlot3D1.setShadowXOffset(0.0d);
        double double14 = piePlot3D1.getInteriorGap();
        piePlot3D1.setMinimumArcAngleToDraw(100.0d);
        piePlot3D1.setLabelLinksVisible(true);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(pieToolTipGenerator9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.08d + "'", double14 == 0.08d);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets13, false);
        java.lang.String str16 = piePlot3D1.getPlotType();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent17 = null;
        piePlot3D1.datasetChanged(datasetChangeEvent17);
        java.awt.Paint paint19 = piePlot3D1.getNoDataMessagePaint();
        piePlot3D1.setOutlineVisible(true);
        boolean boolean22 = piePlot3D1.isOutlineVisible();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pie 3D Plot" + "'", str16, "Pie 3D Plot");
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        double double6 = piePlot3D1.getShadowXOffset();
        piePlot3D1.setIgnoreNullValues(false);
        java.awt.Font font9 = piePlot3D1.getLabelFont();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator10 = piePlot3D1.getLabelGenerator();
        org.jfree.chart.util.RectangleInsets rectangleInsets11 = piePlot3D1.getLabelPadding();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = piePlot3D1.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator10);
        org.junit.Assert.assertNotNull(rectangleInsets11);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot3D1.getLegendLabelURLGenerator();
        java.awt.Stroke stroke7 = null;
        piePlot3D1.setLabelOutlineStroke(stroke7);
        boolean boolean9 = piePlot3D1.getSectionOutlinesVisible();
        java.awt.Paint paint10 = piePlot3D1.getOutlinePaint();
        piePlot3D1.setExplodePercent((java.lang.Comparable) 1, 0.0d);
        float float14 = piePlot3D1.getForegroundAlpha();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets13, false);
        java.awt.Stroke stroke17 = null;
        piePlot3D1.setSectionOutlineStroke((java.lang.Comparable) 1.0f, stroke17);
        piePlot3D1.setIgnoreZeroValues(false);
        java.awt.Stroke stroke21 = null;
        piePlot3D1.setOutlineStroke(stroke21);
        piePlot3D1.setStartAngle((double) (byte) 100);
        piePlot3D1.setNoDataMessage("Pie 3D Plot");
        double double27 = piePlot3D1.getMinimumArcAngleToDraw();
        piePlot3D1.setForegroundAlpha(0.0f);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0E-5d + "'", double27 == 1.0E-5d);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint10 = piePlot3D1.getLabelShadowPaint();
        piePlot3D1.setStartAngle((double) (short) 0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = null;
        piePlot3D1.setURLGenerator(pieURLGenerator13);
        org.jfree.chart.event.PlotChangeListener plotChangeListener15 = null;
        piePlot3D1.addChangeListener(plotChangeListener15);
        float float17 = piePlot3D1.getForegroundAlpha();
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D(pieDataset18);
        piePlot3D19.setBackgroundImageAlignment(1);
        java.awt.Paint paint22 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D19.setNoDataMessagePaint(paint22);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D(pieDataset24);
        piePlot3D25.setBackgroundImageAlignment(1);
        java.awt.Paint paint28 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D25.setNoDataMessagePaint(paint28);
        piePlot3D19.setBaseSectionOutlinePaint(paint28);
        java.lang.String str31 = piePlot3D19.getPlotType();
        piePlot3D19.setLabelLinkMargin(0.0d);
        piePlot3D19.setShadowXOffset((double) 0.0f);
        java.awt.Paint paint36 = piePlot3D19.getNoDataMessagePaint();
        piePlot3D1.setBackgroundPaint(paint36);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator38 = null;
        piePlot3D1.setURLGenerator(pieURLGenerator38);
        org.jfree.data.general.PieDataset pieDataset40 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D41 = new org.jfree.chart.plot.PiePlot3D(pieDataset40);
        piePlot3D41.setBackgroundImageAlignment(1);
        boolean boolean44 = piePlot3D41.getSectionOutlinesVisible();
        double double45 = piePlot3D41.getMaximumLabelWidth();
        piePlot3D41.setCircular(false, true);
        piePlot3D41.setForegroundAlpha(0.0f);
        org.jfree.data.general.PieDataset pieDataset51 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D52 = new org.jfree.chart.plot.PiePlot3D(pieDataset51);
        piePlot3D52.setBackgroundImageAlignment(1);
        boolean boolean55 = piePlot3D52.getSectionOutlinesVisible();
        double double56 = piePlot3D52.getMaximumLabelWidth();
        double double57 = piePlot3D52.getShadowXOffset();
        piePlot3D52.setIgnoreNullValues(false);
        java.awt.Font font60 = piePlot3D52.getLabelFont();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator61 = piePlot3D52.getLabelGenerator();
        piePlot3D41.setLegendLabelToolTipGenerator(pieSectionLabelGenerator61);
        piePlot3D1.setLabelGenerator(pieSectionLabelGenerator61);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Pie 3D Plot" + "'", str31, "Pie 3D Plot");
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.14d + "'", double45 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.14d + "'", double56 == 0.14d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 4.0d + "'", double57 == 4.0d);
        org.junit.Assert.assertNotNull(font60);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator61);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot3D1.getLegendLabelURLGenerator();
        float float7 = piePlot3D1.getForegroundAlpha();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator8 = null;
        piePlot3D1.setToolTipGenerator(pieToolTipGenerator8);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D(pieDataset10);
        piePlot3D11.setBackgroundImageAlignment(1);
        java.awt.Paint paint14 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D11.setLabelOutlinePaint(paint14);
        piePlot3D11.setBackgroundAlpha(0.0f);
        piePlot3D11.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint20 = piePlot3D11.getLabelShadowPaint();
        piePlot3D11.setStartAngle((double) (short) 0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator23 = null;
        piePlot3D11.setURLGenerator(pieURLGenerator23);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator25 = null;
        piePlot3D11.setToolTipGenerator(pieToolTipGenerator25);
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot3D11.setLabelShadowPaint(paint27);
        piePlot3D1.setBaseSectionOutlinePaint(paint27);
        java.lang.String str30 = piePlot3D1.getPlotType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Pie 3D Plot" + "'", str30, "Pie 3D Plot");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.jfree.chart.plot.PiePlot3D piePlot3D0 = new org.jfree.chart.plot.PiePlot3D();
        org.jfree.data.general.PieDataset pieDataset1 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D2 = new org.jfree.chart.plot.PiePlot3D(pieDataset1);
        piePlot3D2.setBackgroundImageAlignment(1);
        boolean boolean5 = piePlot3D2.getSectionOutlinesVisible();
        double double6 = piePlot3D2.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator7 = piePlot3D2.getLegendLabelGenerator();
        java.awt.Font font8 = piePlot3D2.getLabelFont();
        java.awt.Paint paint9 = piePlot3D2.getLabelBackgroundPaint();
        piePlot3D0.setNoDataMessagePaint(paint9);
        int int11 = piePlot3D0.getBackgroundImageAlignment();
        piePlot3D0.setMaximumLabelWidth(10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.14d + "'", double6 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator7);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint10 = piePlot3D1.getLabelShadowPaint();
        piePlot3D1.setStartAngle((double) (short) 0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = null;
        piePlot3D1.setURLGenerator(pieURLGenerator13);
        boolean boolean15 = piePlot3D1.getIgnoreNullValues();
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D(pieDataset16);
        piePlot3D17.setBackgroundImageAlignment(1);
        boolean boolean20 = piePlot3D17.getSectionOutlinesVisible();
        double double21 = piePlot3D17.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator22 = piePlot3D17.getLegendLabelGenerator();
        java.awt.Font font23 = piePlot3D17.getLabelFont();
        piePlot3D17.setMinimumArcAngleToDraw(100.0d);
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D27 = new org.jfree.chart.plot.PiePlot3D(pieDataset26);
        piePlot3D27.setBackgroundImageAlignment(1);
        java.awt.Paint paint31 = piePlot3D27.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D33 = new org.jfree.chart.plot.PiePlot3D(pieDataset32);
        piePlot3D33.setBackgroundImageAlignment(1);
        java.awt.Paint paint36 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D33.setNoDataMessagePaint(paint36);
        piePlot3D27.setShadowPaint(paint36);
        java.lang.Object obj39 = piePlot3D27.clone();
        piePlot3D27.setMinimumArcAngleToDraw(1.0d);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator42 = null;
        piePlot3D27.setToolTipGenerator(pieToolTipGenerator42);
        java.awt.Stroke stroke44 = piePlot3D27.getOutlineStroke();
        piePlot3D17.setOutlineStroke(stroke44);
        piePlot3D1.setOutlineStroke(stroke44);
        piePlot3D1.setIgnoreNullValues(false);
        java.lang.String str49 = piePlot3D1.getPlotType();
        java.awt.Stroke stroke50 = piePlot3D1.getLabelLinkStroke();
        piePlot3D1.setBackgroundImageAlignment(100);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.14d + "'", double21 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator22);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNull(paint31);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Pie 3D Plot" + "'", str49, "Pie 3D Plot");
        org.junit.Assert.assertNotNull(stroke50);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets13, false);
        java.lang.String str16 = piePlot3D1.getPlotType();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent17 = null;
        piePlot3D1.datasetChanged(datasetChangeEvent17);
        java.awt.Paint paint19 = piePlot3D1.getBaseSectionOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D(pieDataset20);
        piePlot3D21.setBackgroundImageAlignment(1);
        boolean boolean24 = piePlot3D21.getSectionOutlinesVisible();
        double double25 = piePlot3D21.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator26 = piePlot3D21.getLegendLabelGenerator();
        java.awt.Font font27 = piePlot3D21.getLabelFont();
        java.awt.Paint paint28 = piePlot3D21.getLabelBackgroundPaint();
        piePlot3D1.setLabelPaint(paint28);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator30 = null;
        piePlot3D1.setLegendLabelURLGenerator(pieURLGenerator30);
        double double32 = piePlot3D1.getDepthFactor();
        org.jfree.chart.LegendItemCollection legendItemCollection33 = piePlot3D1.getLegendItems();
        org.jfree.chart.util.Rotation rotation34 = piePlot3D1.getDirection();
        java.lang.Comparable comparable35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Stroke stroke36 = piePlot3D1.getSectionOutlineStroke(comparable35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pie 3D Plot" + "'", str16, "Pie 3D Plot");
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.14d + "'", double25 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator26);
        org.junit.Assert.assertNotNull(font27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.12d + "'", double32 == 0.12d);
        org.junit.Assert.assertNotNull(legendItemCollection33);
        org.junit.Assert.assertNotNull(rotation34);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        java.lang.String str13 = piePlot3D1.getPlotType();
        piePlot3D1.setLabelLinkMargin(0.0d);
        piePlot3D1.setExplodePercent((java.lang.Comparable) true, (double) (short) 1);
        org.jfree.chart.util.Rotation rotation19 = piePlot3D1.getDirection();
        java.awt.Paint paint20 = piePlot3D1.getOutlinePaint();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent21 = null;
        piePlot3D1.datasetChanged(datasetChangeEvent21);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pie 3D Plot" + "'", str13, "Pie 3D Plot");
        org.junit.Assert.assertNotNull(rotation19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        double double11 = piePlot3D1.getExplodePercent((java.lang.Comparable) 10.0f);
        boolean boolean12 = piePlot3D1.getLabelLinksVisible();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint10 = piePlot3D1.getLabelShadowPaint();
        piePlot3D1.setStartAngle((double) (short) 0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = null;
        piePlot3D1.setURLGenerator(pieURLGenerator13);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator15 = null;
        piePlot3D1.setToolTipGenerator(pieToolTipGenerator15);
        boolean boolean17 = piePlot3D1.getSimpleLabels();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot3D1.getLegendLabelURLGenerator();
        java.awt.Stroke stroke7 = null;
        piePlot3D1.setLabelOutlineStroke(stroke7);
        boolean boolean9 = piePlot3D1.getSectionOutlinesVisible();
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        piePlot3D1.drawBackgroundImage(graphics2D10, rectangle2D11);
        boolean boolean13 = piePlot3D1.getSectionOutlinesVisible();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot3D1.getLegendLabelURLGenerator();
        boolean boolean7 = piePlot3D1.getIgnoreZeroValues();
        java.lang.String str8 = piePlot3D1.getNoDataMessage();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D(pieDataset9);
        piePlot3D10.setBackgroundImageAlignment(1);
        boolean boolean13 = piePlot3D10.getSectionOutlinesVisible();
        double double14 = piePlot3D10.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator15 = piePlot3D10.getLegendLabelGenerator();
        piePlot3D1.setLabelGenerator(pieSectionLabelGenerator15);
        java.awt.Paint paint17 = piePlot3D1.getBackgroundPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.14d + "'", double14 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator15);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint5 = piePlot3D1.getSectionPaint((java.lang.Comparable) (short) 0);
        boolean boolean6 = piePlot3D1.getIgnoreZeroValues();
        double double7 = piePlot3D1.getLabelLinkMargin();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D(pieDataset9);
        piePlot3D10.setBackgroundImageAlignment(1);
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D10.setLabelOutlinePaint(paint13);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator15 = piePlot3D10.getLegendLabelURLGenerator();
        double double16 = piePlot3D10.getInteriorGap();
        java.awt.Shape shape17 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot3D10.setLegendItemShape(shape17);
        java.awt.Paint paint20 = piePlot3D10.getSectionPaint((java.lang.Comparable) (-1L));
        java.awt.Paint paint22 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_PAINT;
        piePlot3D10.setSectionOutlinePaint((java.lang.Comparable) (short) 100, paint22);
        piePlot3D1.setSectionOutlinePaint((java.lang.Comparable) 1.0E-5d, paint22);
        float float25 = piePlot3D1.getBackgroundImageAlpha();
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.025d + "'", double7 == 0.025d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNull(pieURLGenerator15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.08d + "'", double16 == 0.08d);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.5f + "'", float25 == 0.5f);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot3D1.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D(pieDataset7);
        piePlot3D8.setBackgroundImageAlignment(1);
        java.awt.Paint paint11 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D8.setNoDataMessagePaint(paint11);
        piePlot3D1.setBaseSectionPaint(paint11);
        java.lang.String str14 = piePlot3D1.getNoDataMessage();
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent15 = null;
        piePlot3D1.markerChanged(markerChangeEvent15);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator17 = piePlot3D1.getLegendLabelURLGenerator();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(pieURLGenerator17);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint5 = piePlot3D1.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot3D1.getSimpleLabelOffset();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        piePlot3D1.removeChangeListener(plotChangeListener7);
        java.awt.Stroke stroke9 = piePlot3D1.getLabelLinkStroke();
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D(pieDataset10);
        piePlot3D11.setBackgroundImageAlignment(1);
        java.awt.Paint paint14 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D11.setLabelOutlinePaint(paint14);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator16 = piePlot3D11.getLegendLabelURLGenerator();
        double double17 = piePlot3D11.getInteriorGap();
        piePlot3D11.setNoDataMessage("");
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D(pieDataset20);
        piePlot3D21.setBackgroundImageAlignment(1);
        java.awt.Paint paint24 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D21.setLabelOutlinePaint(paint24);
        piePlot3D21.setBackgroundAlpha(0.0f);
        piePlot3D21.setBackgroundAlpha((float) 0L);
        piePlot3D21.setLabelLinksVisible(false);
        org.jfree.data.general.PieDataset pieDataset32 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D33 = new org.jfree.chart.plot.PiePlot3D(pieDataset32);
        piePlot3D33.setBackgroundImageAlignment(1);
        java.awt.Paint paint36 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D33.setNoDataMessagePaint(paint36);
        org.jfree.data.general.PieDataset pieDataset38 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D39 = new org.jfree.chart.plot.PiePlot3D(pieDataset38);
        piePlot3D39.setBackgroundImageAlignment(1);
        java.awt.Paint paint42 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D39.setNoDataMessagePaint(paint42);
        piePlot3D33.setBaseSectionOutlinePaint(paint42);
        org.jfree.chart.util.RectangleInsets rectangleInsets45 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D33.setInsets(rectangleInsets45, false);
        java.lang.String str48 = piePlot3D33.getPlotType();
        java.awt.Paint paint49 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D33.setLabelShadowPaint(paint49);
        piePlot3D21.setBaseSectionOutlinePaint(paint49);
        java.awt.Stroke stroke53 = null;
        piePlot3D21.setSectionOutlineStroke((java.lang.Comparable) (short) 1, stroke53);
        java.awt.Stroke stroke55 = piePlot3D21.getLabelOutlineStroke();
        piePlot3D11.setLabelLinkStroke(stroke55);
        piePlot3D1.setLabelLinkStroke(stroke55);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(pieURLGenerator16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.08d + "'", double17 == 0.08d);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(rectangleInsets45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Pie 3D Plot" + "'", str48, "Pie 3D Plot");
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(stroke55);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets13, false);
        java.lang.String str16 = piePlot3D1.getPlotType();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent17 = null;
        piePlot3D1.datasetChanged(datasetChangeEvent17);
        java.awt.Paint paint19 = piePlot3D1.getBaseSectionOutlinePaint();
        piePlot3D1.setPieIndex(10);
        java.awt.Paint paint22 = piePlot3D1.getShadowPaint();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator23 = piePlot3D1.getToolTipGenerator();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pie 3D Plot" + "'", str16, "Pie 3D Plot");
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(pieToolTipGenerator23);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D1.getLegendLabelGenerator();
        java.awt.Font font7 = piePlot3D1.getLabelFont();
        piePlot3D1.setMinimumArcAngleToDraw(100.0d);
        java.awt.Paint paint10 = piePlot3D1.getLabelPaint();
        java.awt.Stroke stroke11 = piePlot3D1.getBaseSectionOutlineStroke();
        double double12 = piePlot3D1.getDepthFactor();
        piePlot3D1.setLabelLinksVisible(false);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D(pieDataset15);
        piePlot3D16.setBackgroundImageAlignment(1);
        java.awt.Paint paint20 = piePlot3D16.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D(pieDataset21);
        piePlot3D22.setBackgroundImageAlignment(1);
        java.awt.Paint paint25 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D22.setNoDataMessagePaint(paint25);
        piePlot3D16.setShadowPaint(paint25);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent28 = null;
        piePlot3D16.axisChanged(axisChangeEvent28);
        java.awt.Stroke stroke30 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D16.setBaseSectionOutlineStroke(stroke30);
        piePlot3D1.setOutlineStroke(stroke30);
        org.jfree.data.general.DatasetGroup datasetGroup33 = piePlot3D1.getDatasetGroup();
        java.awt.Stroke stroke34 = piePlot3D1.getOutlineStroke();
        piePlot3D1.setIgnoreNullValues(false);
        piePlot3D1.setIgnoreNullValues(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.12d + "'", double12 == 0.12d);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNull(datasetGroup33);
        org.junit.Assert.assertNotNull(stroke34);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        piePlot3D1.setLabelLinksVisible(false);
        java.awt.Stroke stroke13 = piePlot3D1.getSectionOutlineStroke((java.lang.Comparable) 100L);
        piePlot3D1.setExplodePercent((java.lang.Comparable) 10L, (double) 100.0f);
        float float17 = piePlot3D1.getBackgroundImageAlpha();
        piePlot3D1.setPieIndex(0);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(stroke13);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot3D1.getLegendLabelURLGenerator();
        java.awt.Stroke stroke7 = null;
        piePlot3D1.setLabelOutlineStroke(stroke7);
        boolean boolean9 = piePlot3D1.getSectionOutlinesVisible();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator10 = piePlot3D1.getLegendLabelURLGenerator();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator11 = null;
        piePlot3D1.setLegendLabelURLGenerator(pieURLGenerator11);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = null;
        piePlot3D1.setLegendLabelURLGenerator(pieURLGenerator13);
        boolean boolean15 = piePlot3D1.getSectionOutlinesVisible();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(pieURLGenerator10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint5 = piePlot3D1.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        piePlot3D1.setDataset(pieDataset6);
        java.awt.Paint paint8 = piePlot3D1.getNoDataMessagePaint();
        double double9 = piePlot3D1.getMinimumArcAngleToDraw();
        org.jfree.data.general.PieDataset pieDataset11 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D12 = new org.jfree.chart.plot.PiePlot3D(pieDataset11);
        piePlot3D12.setBackgroundImageAlignment(1);
        java.awt.Paint paint15 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D12.setLabelOutlinePaint(paint15);
        piePlot3D12.setBackgroundAlpha(0.0f);
        piePlot3D12.setBackgroundAlpha((float) 0L);
        double double21 = piePlot3D12.getLabelGap();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo24 = null;
        piePlot3D12.handleClick((int) (byte) 100, (int) (byte) 1, plotRenderingInfo24);
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D28 = new org.jfree.chart.plot.PiePlot3D(pieDataset27);
        piePlot3D28.setBackgroundImageAlignment(1);
        boolean boolean31 = piePlot3D28.getSectionOutlinesVisible();
        double double32 = piePlot3D28.getMaximumLabelWidth();
        piePlot3D28.setShadowXOffset((double) (byte) 10);
        boolean boolean35 = piePlot3D28.getSimpleLabels();
        java.awt.Stroke stroke36 = null;
        piePlot3D28.setLabelOutlineStroke(stroke36);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator38 = null;
        piePlot3D28.setToolTipGenerator(pieToolTipGenerator38);
        piePlot3D28.setSimpleLabels(true);
        float float42 = piePlot3D28.getBackgroundImageAlpha();
        org.jfree.data.general.PieDataset pieDataset43 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D44 = new org.jfree.chart.plot.PiePlot3D(pieDataset43);
        piePlot3D44.setBackgroundImageAlignment(1);
        java.awt.Paint paint48 = piePlot3D44.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset49 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D50 = new org.jfree.chart.plot.PiePlot3D(pieDataset49);
        piePlot3D50.setBackgroundImageAlignment(1);
        java.awt.Paint paint53 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D50.setNoDataMessagePaint(paint53);
        piePlot3D44.setShadowPaint(paint53);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent56 = null;
        piePlot3D44.axisChanged(axisChangeEvent56);
        java.awt.Stroke stroke58 = piePlot3D44.getOutlineStroke();
        piePlot3D28.setOutlineStroke(stroke58);
        piePlot3D12.setSectionOutlineStroke((java.lang.Comparable) (short) 10, stroke58);
        piePlot3D1.setSectionOutlineStroke((java.lang.Comparable) (byte) 1, stroke58);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-5d + "'", double9 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.025d + "'", double21 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.14d + "'", double32 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.5f + "'", float42 == 0.5f);
        org.junit.Assert.assertNull(paint48);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertNotNull(stroke58);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setShadowXOffset((double) (byte) 10);
        boolean boolean8 = piePlot3D1.getSimpleLabels();
        java.awt.Stroke stroke9 = null;
        piePlot3D1.setLabelOutlineStroke(stroke9);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator11 = null;
        piePlot3D1.setToolTipGenerator(pieToolTipGenerator11);
        piePlot3D1.setOutlineVisible(false);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D(pieDataset15);
        piePlot3D16.setBackgroundImageAlignment(1);
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D16.setLabelOutlinePaint(paint19);
        piePlot3D16.setBackgroundAlpha(0.0f);
        piePlot3D16.setBackgroundAlpha((float) 0L);
        double double26 = piePlot3D16.getExplodePercent((java.lang.Comparable) 10.0f);
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot3D16.setBaseSectionOutlinePaint(paint27);
        piePlot3D1.setBaseSectionOutlinePaint(paint27);
        double double31 = piePlot3D1.getExplodePercent((java.lang.Comparable) 4.0d);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor32 = piePlot3D1.getLabelDistributor();
        piePlot3D1.setIgnoreNullValues(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor32);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        java.lang.String str13 = piePlot3D1.getPlotType();
        piePlot3D1.setLabelLinkMargin(0.0d);
        piePlot3D1.setShadowXOffset((double) 0.0f);
        piePlot3D1.setIgnoreZeroValues(true);
        boolean boolean20 = piePlot3D1.getIgnoreNullValues();
        piePlot3D1.setIgnoreNullValues(true);
        piePlot3D1.setIgnoreZeroValues(true);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = piePlot3D1.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pie 3D Plot" + "'", str13, "Pie 3D Plot");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets13, false);
        double double17 = piePlot3D1.getExplodePercent((java.lang.Comparable) 10);
        java.awt.Paint paint18 = piePlot3D1.getBaseSectionOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint5 = piePlot3D1.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        piePlot3D1.setDataset(pieDataset6);
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D(pieDataset8);
        piePlot3D9.setBackgroundImageAlignment(1);
        java.awt.Paint paint12 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D9.setLabelOutlinePaint(paint12);
        piePlot3D9.setBackgroundAlpha(0.0f);
        piePlot3D9.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint18 = piePlot3D9.getLabelShadowPaint();
        java.awt.Paint paint19 = piePlot3D9.getBackgroundPaint();
        java.awt.Paint paint20 = piePlot3D9.getBackgroundPaint();
        piePlot3D1.setOutlinePaint(paint20);
        org.jfree.data.general.PieDataset pieDataset22 = null;
        piePlot3D1.setDataset(pieDataset22);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets13, false);
        java.awt.Stroke stroke17 = null;
        piePlot3D1.setSectionOutlineStroke((java.lang.Comparable) 1.0f, stroke17);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets19, true);
        piePlot3D1.setShadowYOffset(90.0d);
        boolean boolean24 = piePlot3D1.isOutlineVisible();
        java.awt.Graphics2D graphics2D25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        piePlot3D1.drawBackgroundImage(graphics2D25, rectangle2D26);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        double double10 = piePlot3D1.getLabelGap();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        piePlot3D1.handleClick((int) (byte) 100, (int) (byte) 1, plotRenderingInfo13);
        piePlot3D1.setForegroundAlpha((-1.0f));
        org.jfree.chart.event.PlotChangeListener plotChangeListener17 = null;
        piePlot3D1.addChangeListener(plotChangeListener17);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator19 = piePlot3D1.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D(pieDataset20);
        piePlot3D21.setBackgroundImageAlignment(1);
        java.awt.Paint paint24 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D21.setNoDataMessagePaint(paint24);
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D27 = new org.jfree.chart.plot.PiePlot3D(pieDataset26);
        piePlot3D27.setBackgroundImageAlignment(1);
        java.awt.Paint paint30 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D27.setNoDataMessagePaint(paint30);
        piePlot3D21.setBaseSectionOutlinePaint(paint30);
        java.lang.String str33 = piePlot3D21.getPlotType();
        piePlot3D21.setLabelLinkMargin(0.0d);
        piePlot3D21.setExplodePercent((java.lang.Comparable) true, (double) (short) 1);
        org.jfree.data.general.PieDataset pieDataset39 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D40 = new org.jfree.chart.plot.PiePlot3D(pieDataset39);
        piePlot3D40.setBackgroundImageAlignment(1);
        boolean boolean43 = piePlot3D40.getSectionOutlinesVisible();
        double double44 = piePlot3D40.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator45 = piePlot3D40.getLegendLabelGenerator();
        piePlot3D21.setLabelGenerator(pieSectionLabelGenerator45);
        java.awt.Paint paint47 = piePlot3D21.getLabelBackgroundPaint();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator48 = piePlot3D21.getLegendLabelURLGenerator();
        java.awt.Stroke stroke49 = piePlot3D21.getBaseSectionOutlineStroke();
        piePlot3D1.setLabelOutlineStroke(stroke49);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.025d + "'", double10 == 0.025d);
        org.junit.Assert.assertNull(pieURLGenerator19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Pie 3D Plot" + "'", str33, "Pie 3D Plot");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.14d + "'", double44 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator45);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNull(pieURLGenerator48);
        org.junit.Assert.assertNotNull(stroke49);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator6 = piePlot3D1.getLegendLabelGenerator();
        java.awt.Font font7 = piePlot3D1.getLabelFont();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        piePlot3D1.handleClick((int) ' ', (int) ' ', plotRenderingInfo10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D(pieDataset12);
        piePlot3D13.setBackgroundImageAlignment(1);
        java.awt.Paint paint16 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D13.setLabelOutlinePaint(paint16);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator18 = piePlot3D13.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D(pieDataset19);
        piePlot3D20.setBackgroundImageAlignment(1);
        java.awt.Paint paint23 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D20.setNoDataMessagePaint(paint23);
        piePlot3D13.setBaseSectionPaint(paint23);
        piePlot3D1.setLabelBackgroundPaint(paint23);
        java.awt.Paint paint27 = piePlot3D1.getNoDataMessagePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = piePlot3D1.getSimpleLabelOffset();
        float float29 = piePlot3D1.getBackgroundImageAlpha();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator6);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(pieURLGenerator18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.5f + "'", float29 == 0.5f);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = piePlot3D1.getLegendItems();
        boolean boolean11 = piePlot3D1.isSubplot();
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D(pieDataset12);
        piePlot3D13.setBackgroundImageAlignment(1);
        java.awt.Paint paint16 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D13.setNoDataMessagePaint(paint16);
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D(pieDataset18);
        piePlot3D19.setBackgroundImageAlignment(1);
        java.awt.Paint paint22 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D19.setNoDataMessagePaint(paint22);
        piePlot3D13.setBaseSectionOutlinePaint(paint22);
        java.lang.String str25 = piePlot3D13.getPlotType();
        piePlot3D13.setLabelLinkMargin(0.0d);
        org.jfree.data.general.PieDataset pieDataset28 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D29 = new org.jfree.chart.plot.PiePlot3D(pieDataset28);
        piePlot3D29.setBackgroundImageAlignment(1);
        boolean boolean32 = piePlot3D29.getSectionOutlinesVisible();
        org.jfree.chart.event.PlotChangeListener plotChangeListener33 = null;
        piePlot3D29.addChangeListener(plotChangeListener33);
        boolean boolean35 = piePlot3D13.equals((java.lang.Object) piePlot3D29);
        boolean boolean36 = piePlot3D29.isOutlineVisible();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator37 = piePlot3D29.getURLGenerator();
        java.awt.Stroke stroke38 = piePlot3D29.getLabelOutlineStroke();
        java.awt.Stroke stroke39 = piePlot3D29.getLabelOutlineStroke();
        piePlot3D1.setLabelOutlineStroke(stroke39);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(legendItemCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Pie 3D Plot" + "'", str25, "Pie 3D Plot");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(pieURLGenerator37);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(stroke39);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        java.lang.String str13 = piePlot3D1.getPlotType();
        piePlot3D1.setLabelLinkMargin(0.0d);
        piePlot3D1.setShadowXOffset((double) 0.0f);
        piePlot3D1.setIgnoreZeroValues(true);
        boolean boolean20 = piePlot3D1.getIgnoreNullValues();
        piePlot3D1.setIgnoreNullValues(true);
        piePlot3D1.setIgnoreZeroValues(true);
        java.awt.Paint paint25 = piePlot3D1.getOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pie 3D Plot" + "'", str13, "Pie 3D Plot");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot3D1.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D(pieDataset7);
        piePlot3D8.setBackgroundImageAlignment(1);
        java.awt.Paint paint11 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D8.setNoDataMessagePaint(paint11);
        piePlot3D1.setBaseSectionPaint(paint11);
        java.lang.String str14 = piePlot3D1.getNoDataMessage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator15 = null;
        piePlot3D1.setLegendLabelURLGenerator(pieURLGenerator15);
        piePlot3D1.setShadowYOffset((double) 100L);
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D(pieDataset19);
        piePlot3D20.setBackgroundImageAlignment(1);
        java.awt.Paint paint23 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D20.setLabelOutlinePaint(paint23);
        piePlot3D20.setBackgroundAlpha(0.0f);
        piePlot3D20.setBackgroundAlpha((float) 0L);
        org.jfree.chart.util.RectangleInsets rectangleInsets29 = piePlot3D20.getLabelPadding();
        piePlot3D1.setSimpleLabelOffset(rectangleInsets29);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator31 = null;
        piePlot3D1.setURLGenerator(pieURLGenerator31);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(rectangleInsets29);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setShadowXOffset((double) (byte) 10);
        boolean boolean8 = piePlot3D1.getSimpleLabels();
        java.awt.Stroke stroke9 = null;
        piePlot3D1.setLabelOutlineStroke(stroke9);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator11 = null;
        piePlot3D1.setToolTipGenerator(pieToolTipGenerator11);
        piePlot3D1.setOutlineVisible(false);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D(pieDataset15);
        piePlot3D16.setBackgroundImageAlignment(1);
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D16.setLabelOutlinePaint(paint19);
        piePlot3D16.setBackgroundAlpha(0.0f);
        piePlot3D16.setBackgroundAlpha((float) 0L);
        double double26 = piePlot3D16.getExplodePercent((java.lang.Comparable) 10.0f);
        java.awt.Paint paint27 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot3D16.setBaseSectionOutlinePaint(paint27);
        piePlot3D1.setBaseSectionOutlinePaint(paint27);
        double double31 = piePlot3D1.getExplodePercent((java.lang.Comparable) 4.0d);
        boolean boolean32 = piePlot3D1.getDarkerSides();
        org.jfree.data.general.PieDataset pieDataset33 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D34 = new org.jfree.chart.plot.PiePlot3D(pieDataset33);
        piePlot3D34.setBackgroundImageAlignment(1);
        java.awt.Paint paint37 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D34.setNoDataMessagePaint(paint37);
        org.jfree.data.general.PieDataset pieDataset39 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D40 = new org.jfree.chart.plot.PiePlot3D(pieDataset39);
        piePlot3D40.setBackgroundImageAlignment(1);
        java.awt.Paint paint43 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D40.setNoDataMessagePaint(paint43);
        piePlot3D34.setBaseSectionOutlinePaint(paint43);
        org.jfree.chart.util.RectangleInsets rectangleInsets46 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D34.setInsets(rectangleInsets46, false);
        java.awt.Stroke stroke50 = null;
        piePlot3D34.setSectionOutlineStroke((java.lang.Comparable) 1.0f, stroke50);
        org.jfree.chart.util.RectangleInsets rectangleInsets52 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D34.setInsets(rectangleInsets52, true);
        org.jfree.data.general.PieDataset pieDataset55 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D56 = new org.jfree.chart.plot.PiePlot3D(pieDataset55);
        piePlot3D56.setBackgroundImageAlignment(1);
        java.awt.Paint paint59 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D56.setLabelOutlinePaint(paint59);
        piePlot3D34.setLabelOutlinePaint(paint59);
        org.jfree.data.general.PieDataset pieDataset63 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D64 = new org.jfree.chart.plot.PiePlot3D(pieDataset63);
        piePlot3D64.setBackgroundImageAlignment(1);
        boolean boolean67 = piePlot3D64.getSectionOutlinesVisible();
        org.jfree.chart.event.PlotChangeListener plotChangeListener68 = null;
        piePlot3D64.addChangeListener(plotChangeListener68);
        java.awt.Paint paint70 = piePlot3D64.getLabelShadowPaint();
        piePlot3D34.setSectionPaint((java.lang.Comparable) (short) 100, paint70);
        piePlot3D1.setBackgroundPaint(paint70);
        piePlot3D1.setStartAngle((double) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(rectangleInsets46);
        org.junit.Assert.assertNotNull(rectangleInsets52);
        org.junit.Assert.assertNotNull(paint59);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(paint70);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setShadowXOffset((double) (byte) 10);
        boolean boolean8 = piePlot3D1.getSimpleLabels();
        org.jfree.chart.util.Rotation rotation9 = piePlot3D1.getDirection();
        piePlot3D1.setInteriorGap(0.025d);
        piePlot3D1.setCircular(true, false);
        piePlot3D1.setDepthFactor((double) (short) 10);
        piePlot3D1.setLabelGap((double) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rotation9);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        double double7 = piePlot3D1.getExplodePercent((java.lang.Comparable) "");
        double double8 = piePlot3D1.getLabelLinkMargin();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.025d + "'", double8 == 0.025d);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint5 = piePlot3D1.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot3D1.getSimpleLabelOffset();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        piePlot3D1.removeChangeListener(plotChangeListener7);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator9 = piePlot3D1.getToolTipGenerator();
        piePlot3D1.setCircular(false);
        java.awt.Image image12 = null;
        piePlot3D1.setBackgroundImage(image12);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator14 = piePlot3D1.getLegendLabelGenerator();
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(pieToolTipGenerator9);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator14);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets13, false);
        java.awt.Stroke stroke17 = null;
        piePlot3D1.setSectionOutlineStroke((java.lang.Comparable) 1.0f, stroke17);
        piePlot3D1.setIgnoreZeroValues(false);
        java.awt.Stroke stroke21 = null;
        piePlot3D1.setOutlineStroke(stroke21);
        piePlot3D1.setSectionOutlinesVisible(true);
        piePlot3D1.setBackgroundImageAlignment((int) 'a');
        boolean boolean27 = piePlot3D1.getSectionOutlinesVisible();
        java.awt.Paint paint28 = piePlot3D1.getLabelLinkPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        double double10 = piePlot3D1.getLabelGap();
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D(pieDataset12);
        piePlot3D13.setBackgroundImageAlignment(1);
        java.awt.Paint paint17 = piePlot3D13.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3D13.getSimpleLabelOffset();
        java.awt.Stroke stroke19 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D13.setLabelLinkStroke(stroke19);
        piePlot3D1.setSectionOutlineStroke((java.lang.Comparable) (short) 10, stroke19);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator22 = null;
        piePlot3D1.setToolTipGenerator(pieToolTipGenerator22);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.025d + "'", double10 == 0.025d);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertNotNull(rectangleInsets18);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        piePlot3D1.setLabelLinksVisible(false);
        piePlot3D1.setLabelGap(4.0d);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        piePlot3D1.markerChanged(markerChangeEvent14);
        java.awt.Paint paint16 = piePlot3D1.getOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D(pieDataset18);
        piePlot3D19.setBackgroundImageAlignment(1);
        java.awt.Paint paint23 = piePlot3D19.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D(pieDataset24);
        piePlot3D25.setBackgroundImageAlignment(1);
        java.awt.Paint paint28 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D25.setNoDataMessagePaint(paint28);
        piePlot3D19.setShadowPaint(paint28);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent31 = null;
        piePlot3D19.axisChanged(axisChangeEvent31);
        java.awt.Paint paint33 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_OUTLINE_PAINT;
        piePlot3D19.setLabelLinkPaint(paint33);
        piePlot3D1.setSectionPaint((java.lang.Comparable) 15, paint33);
        boolean boolean36 = piePlot3D1.getLabelLinksVisible();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setCircular(false, true);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D(pieDataset9);
        piePlot3D10.setBackgroundImageAlignment(1);
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D10.setNoDataMessagePaint(paint13);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D(pieDataset15);
        piePlot3D16.setBackgroundImageAlignment(1);
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D16.setNoDataMessagePaint(paint19);
        piePlot3D10.setBaseSectionOutlinePaint(paint19);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setInsets(rectangleInsets22, false);
        piePlot3D1.setInsets(rectangleInsets22);
        piePlot3D1.setLabelLinkMargin((double) 1L);
        piePlot3D1.setOutlineVisible(false);
        java.awt.Paint paint30 = piePlot3D1.getBaseSectionOutlinePaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        piePlot3D1.handleClick((int) (short) 10, (int) (byte) -1, plotRenderingInfo33);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier35 = piePlot3D1.getDrawingSupplier();
        piePlot3D1.setIgnoreNullValues(true);
        double double38 = piePlot3D1.getDepthFactor();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(drawingSupplier35);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.12d + "'", double38 == 0.12d);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets13, false);
        double double17 = piePlot3D1.getExplodePercent((java.lang.Comparable) 10);
        double double18 = piePlot3D1.getLabelGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = piePlot3D1.getDrawingSupplier();
        java.awt.Paint paint20 = piePlot3D1.getNoDataMessagePaint();
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D(pieDataset21);
        piePlot3D22.setBackgroundImageAlignment(1);
        boolean boolean25 = piePlot3D22.getSectionOutlinesVisible();
        double double26 = piePlot3D22.getMaximumLabelWidth();
        java.awt.Paint paint27 = piePlot3D22.getBaseSectionPaint();
        piePlot3D1.setLabelPaint(paint27);
        piePlot3D1.setNoDataMessage("");
        double double31 = piePlot3D1.getDepthFactor();
        boolean boolean32 = piePlot3D1.getIgnoreZeroValues();
        java.lang.String str33 = piePlot3D1.getNoDataMessage();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.025d + "'", double18 == 0.025d);
        org.junit.Assert.assertNotNull(drawingSupplier19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.14d + "'", double26 == 0.14d);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.12d + "'", double31 == 0.12d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint5 = piePlot3D1.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setShadowPaint(paint10);
        java.lang.Object obj13 = piePlot3D1.clone();
        piePlot3D1.setMinimumArcAngleToDraw(1.0d);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator16 = null;
        piePlot3D1.setToolTipGenerator(pieToolTipGenerator16);
        org.jfree.chart.util.RectangleInsets rectangleInsets18 = piePlot3D1.getLabelPadding();
        piePlot3D1.setForegroundAlpha((float) '#');
        java.awt.Image image21 = null;
        piePlot3D1.setBackgroundImage(image21);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(rectangleInsets18);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot3D1.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D(pieDataset7);
        piePlot3D8.setBackgroundImageAlignment(1);
        java.awt.Paint paint11 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D8.setNoDataMessagePaint(paint11);
        piePlot3D1.setBaseSectionPaint(paint11);
        java.lang.String str14 = piePlot3D1.getNoDataMessage();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot3D1.getSimpleLabelOffset();
        piePlot3D1.setNoDataMessage("hi!");
        java.awt.Paint paint18 = piePlot3D1.getBaseSectionPaint();
        piePlot3D1.setShadowXOffset((double) (byte) 1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        double double11 = piePlot3D1.getExplodePercent((java.lang.Comparable) 10.0f);
        org.jfree.data.general.DatasetGroup datasetGroup12 = piePlot3D1.getDatasetGroup();
        piePlot3D1.setSimpleLabels(false);
        piePlot3D1.zoom(0.0d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(datasetGroup12);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setCircular(false, true);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D(pieDataset9);
        piePlot3D10.setBackgroundImageAlignment(1);
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D10.setNoDataMessagePaint(paint13);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D(pieDataset15);
        piePlot3D16.setBackgroundImageAlignment(1);
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D16.setNoDataMessagePaint(paint19);
        piePlot3D10.setBaseSectionOutlinePaint(paint19);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setInsets(rectangleInsets22, false);
        piePlot3D1.setInsets(rectangleInsets22);
        piePlot3D1.setOutlineVisible(false);
        org.jfree.chart.plot.Plot plot28 = piePlot3D1.getParent();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNull(plot28);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint5 = piePlot3D1.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        piePlot3D1.setDataset(pieDataset6);
        org.jfree.data.general.PieDataset pieDataset8 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D9 = new org.jfree.chart.plot.PiePlot3D(pieDataset8);
        piePlot3D9.setBackgroundImageAlignment(1);
        java.awt.Paint paint12 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D9.setLabelOutlinePaint(paint12);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator14 = piePlot3D9.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D(pieDataset15);
        piePlot3D16.setBackgroundImageAlignment(1);
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D16.setNoDataMessagePaint(paint19);
        piePlot3D9.setBaseSectionPaint(paint19);
        java.lang.String str22 = piePlot3D9.getNoDataMessage();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator23 = null;
        piePlot3D9.setLegendLabelURLGenerator(pieURLGenerator23);
        piePlot3D9.setShadowYOffset((double) 100L);
        org.jfree.data.general.PieDataset pieDataset27 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D28 = new org.jfree.chart.plot.PiePlot3D(pieDataset27);
        piePlot3D28.setBackgroundImageAlignment(1);
        java.awt.Paint paint31 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D28.setLabelOutlinePaint(paint31);
        piePlot3D28.setBackgroundAlpha(0.0f);
        piePlot3D28.setBackgroundAlpha((float) 0L);
        org.jfree.chart.util.RectangleInsets rectangleInsets37 = piePlot3D28.getLabelPadding();
        piePlot3D9.setSimpleLabelOffset(rectangleInsets37);
        piePlot3D1.setLabelPadding(rectangleInsets37);
        boolean boolean40 = piePlot3D1.isCircular();
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(pieURLGenerator14);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(rectangleInsets37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.data.general.DatasetGroup datasetGroup6 = piePlot3D1.getDatasetGroup();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator7 = piePlot3D1.getLegendLabelToolTipGenerator();
        double double9 = piePlot3D1.getExplodePercent((java.lang.Comparable) true);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(datasetGroup6);
        org.junit.Assert.assertNull(pieSectionLabelGenerator7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot3D1.getLegendLabelURLGenerator();
        java.awt.Stroke stroke7 = null;
        piePlot3D1.setLabelOutlineStroke(stroke7);
        boolean boolean9 = piePlot3D1.getSectionOutlinesVisible();
        piePlot3D1.setIgnoreZeroValues(false);
        org.jfree.chart.util.Rotation rotation12 = piePlot3D1.getDirection();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = null;
        piePlot3D1.setURLGenerator(pieURLGenerator13);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D(pieDataset15);
        piePlot3D16.setBackgroundImageAlignment(1);
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D16.setLabelOutlinePaint(paint19);
        piePlot3D16.setBackgroundAlpha(0.0f);
        piePlot3D16.setBackgroundAlpha((float) 0L);
        org.jfree.chart.util.RectangleInsets rectangleInsets25 = piePlot3D16.getLabelPadding();
        piePlot3D1.setInsets(rectangleInsets25, false);
        java.awt.Paint paint28 = piePlot3D1.getBaseSectionOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(rotation12);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets25);
        org.junit.Assert.assertNotNull(paint28);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        java.lang.String str13 = piePlot3D1.getPlotType();
        piePlot3D1.setLabelLinkMargin(0.0d);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D(pieDataset16);
        piePlot3D17.setBackgroundImageAlignment(1);
        boolean boolean20 = piePlot3D17.getSectionOutlinesVisible();
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        piePlot3D17.addChangeListener(plotChangeListener21);
        boolean boolean23 = piePlot3D1.equals((java.lang.Object) piePlot3D17);
        boolean boolean24 = piePlot3D17.isOutlineVisible();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator25 = piePlot3D17.getURLGenerator();
        float float26 = piePlot3D17.getForegroundAlpha();
        piePlot3D17.setStartAngle(0.0d);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator29 = null;
        piePlot3D17.setLegendLabelURLGenerator(pieURLGenerator29);
        int int31 = piePlot3D17.getPieIndex();
        java.lang.String str32 = piePlot3D17.getPlotType();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pie 3D Plot" + "'", str13, "Pie 3D Plot");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(pieURLGenerator25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 1.0f + "'", float26 == 1.0f);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Pie 3D Plot" + "'", str32, "Pie 3D Plot");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setShadowXOffset((double) (byte) 10);
        boolean boolean8 = piePlot3D1.getSimpleLabels();
        java.awt.Stroke stroke9 = null;
        piePlot3D1.setLabelOutlineStroke(stroke9);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator11 = null;
        piePlot3D1.setToolTipGenerator(pieToolTipGenerator11);
        piePlot3D1.setSimpleLabels(true);
        float float15 = piePlot3D1.getBackgroundImageAlpha();
        java.awt.Stroke stroke17 = piePlot3D1.getSectionOutlineStroke((java.lang.Comparable) 0);
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D(pieDataset18);
        piePlot3D19.setBackgroundImageAlignment(1);
        java.awt.Paint paint22 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D19.setLabelOutlinePaint(paint22);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator24 = piePlot3D19.getLegendLabelURLGenerator();
        java.awt.Stroke stroke25 = null;
        piePlot3D19.setLabelOutlineStroke(stroke25);
        java.awt.Font font27 = piePlot3D19.getLabelFont();
        piePlot3D1.setNoDataMessageFont(font27);
        piePlot3D1.setOutlineVisible(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertNull(stroke17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(pieURLGenerator24);
        org.junit.Assert.assertNotNull(font27);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setShadowXOffset((double) (byte) 10);
        piePlot3D1.setForegroundAlpha((float) 0L);
        piePlot3D1.setSectionOutlinesVisible(false);
        boolean boolean12 = piePlot3D1.getIgnoreZeroValues();
        java.awt.Paint paint13 = piePlot3D1.getOutlinePaint();
        org.jfree.data.general.PieDataset pieDataset14 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D15 = new org.jfree.chart.plot.PiePlot3D(pieDataset14);
        piePlot3D15.setBackgroundImageAlignment(1);
        java.awt.Paint paint18 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D15.setNoDataMessagePaint(paint18);
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D(pieDataset20);
        piePlot3D21.setBackgroundImageAlignment(1);
        java.awt.Paint paint24 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D21.setNoDataMessagePaint(paint24);
        piePlot3D15.setBaseSectionOutlinePaint(paint24);
        java.lang.String str27 = piePlot3D15.getPlotType();
        piePlot3D15.setLabelLinkMargin(0.0d);
        org.jfree.data.general.PieDataset pieDataset30 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D31 = new org.jfree.chart.plot.PiePlot3D(pieDataset30);
        piePlot3D31.setBackgroundImageAlignment(1);
        boolean boolean34 = piePlot3D31.getSectionOutlinesVisible();
        org.jfree.chart.event.PlotChangeListener plotChangeListener35 = null;
        piePlot3D31.addChangeListener(plotChangeListener35);
        boolean boolean37 = piePlot3D15.equals((java.lang.Object) piePlot3D31);
        boolean boolean38 = piePlot3D31.isOutlineVisible();
        double double39 = piePlot3D31.getLabelGap();
        org.jfree.data.general.PieDataset pieDataset40 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D41 = new org.jfree.chart.plot.PiePlot3D(pieDataset40);
        piePlot3D41.setBackgroundImageAlignment(1);
        boolean boolean44 = piePlot3D41.getSectionOutlinesVisible();
        org.jfree.chart.event.PlotChangeListener plotChangeListener45 = null;
        piePlot3D41.addChangeListener(plotChangeListener45);
        java.awt.Paint paint47 = piePlot3D41.getLabelShadowPaint();
        piePlot3D31.setOutlinePaint(paint47);
        java.awt.Paint paint49 = piePlot3D31.getLabelBackgroundPaint();
        java.awt.Stroke stroke50 = piePlot3D31.getLabelLinkStroke();
        java.awt.Paint paint51 = piePlot3D31.getNoDataMessagePaint();
        piePlot3D1.setBackgroundPaint(paint51);
        double double53 = piePlot3D1.getLabelGap();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Pie 3D Plot" + "'", str27, "Pie 3D Plot");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.025d + "'", double39 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(stroke50);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.025d + "'", double53 == 0.025d);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint11 = piePlot3D7.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D(pieDataset12);
        piePlot3D13.setBackgroundImageAlignment(1);
        java.awt.Paint paint16 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D13.setNoDataMessagePaint(paint16);
        piePlot3D7.setShadowPaint(paint16);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent19 = null;
        piePlot3D7.axisChanged(axisChangeEvent19);
        java.awt.Paint paint21 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_OUTLINE_PAINT;
        piePlot3D7.setLabelLinkPaint(paint21);
        piePlot3D1.setOutlinePaint(paint21);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent24 = null;
        piePlot3D1.axisChanged(axisChangeEvent24);
        org.jfree.chart.util.Rotation rotation26 = piePlot3D1.getDirection();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(rotation26);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setShadowXOffset((double) (byte) 10);
        boolean boolean8 = piePlot3D1.getSimpleLabels();
        java.awt.Stroke stroke9 = null;
        piePlot3D1.setLabelOutlineStroke(stroke9);
        boolean boolean11 = piePlot3D1.getIgnoreZeroValues();
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D(pieDataset12);
        piePlot3D13.setBackgroundImageAlignment(1);
        java.awt.Paint paint16 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D13.setLabelOutlinePaint(paint16);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator18 = piePlot3D13.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset19 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D20 = new org.jfree.chart.plot.PiePlot3D(pieDataset19);
        piePlot3D20.setBackgroundImageAlignment(1);
        java.awt.Paint paint23 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D20.setNoDataMessagePaint(paint23);
        piePlot3D13.setBaseSectionPaint(paint23);
        java.lang.String str26 = piePlot3D13.getNoDataMessage();
        org.jfree.chart.util.RectangleInsets rectangleInsets27 = piePlot3D13.getSimpleLabelOffset();
        piePlot3D13.setShadowYOffset((-1.0d));
        java.awt.Paint paint30 = piePlot3D13.getShadowPaint();
        piePlot3D1.setNoDataMessagePaint(paint30);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(pieURLGenerator18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(rectangleInsets27);
        org.junit.Assert.assertNotNull(paint30);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets13, false);
        double double17 = piePlot3D1.getExplodePercent((java.lang.Comparable) 10);
        double double18 = piePlot3D1.getLabelGap();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = piePlot3D1.getDrawingSupplier();
        java.awt.Paint paint20 = piePlot3D1.getNoDataMessagePaint();
        org.jfree.data.general.PieDataset pieDataset21 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D22 = new org.jfree.chart.plot.PiePlot3D(pieDataset21);
        piePlot3D22.setBackgroundImageAlignment(1);
        boolean boolean25 = piePlot3D22.getSectionOutlinesVisible();
        double double26 = piePlot3D22.getMaximumLabelWidth();
        java.awt.Paint paint27 = piePlot3D22.getBaseSectionPaint();
        piePlot3D1.setLabelPaint(paint27);
        piePlot3D1.setNoDataMessage("");
        org.jfree.data.general.PieDataset pieDataset31 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D32 = new org.jfree.chart.plot.PiePlot3D(pieDataset31);
        piePlot3D32.setBackgroundImageAlignment(1);
        java.awt.Paint paint35 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D32.setLabelOutlinePaint(paint35);
        double double38 = piePlot3D32.getExplodePercent((java.lang.Comparable) "");
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor39 = piePlot3D32.getLabelDistributor();
        piePlot3D1.setLabelDistributor(abstractPieLabelDistributor39);
        java.awt.Paint paint42 = piePlot3D1.getSectionPaint((java.lang.Comparable) (short) -1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.025d + "'", double18 == 0.025d);
        org.junit.Assert.assertNotNull(drawingSupplier19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.14d + "'", double26 == 0.14d);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor39);
        org.junit.Assert.assertNull(paint42);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        piePlot3D1.setLabelLinksVisible(false);
        java.awt.Stroke stroke13 = piePlot3D1.getSectionOutlineStroke((java.lang.Comparable) 100L);
        java.awt.Paint paint14 = piePlot3D1.getBackgroundPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = piePlot3D1.getSimpleLabelOffset();
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator16 = null;
        piePlot3D1.setToolTipGenerator(pieToolTipGenerator16);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(stroke13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot3D1.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D(pieDataset7);
        piePlot3D8.setBackgroundImageAlignment(1);
        java.awt.Paint paint11 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D8.setNoDataMessagePaint(paint11);
        piePlot3D1.setBaseSectionPaint(paint11);
        java.lang.String str14 = piePlot3D1.getNoDataMessage();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = null;
        piePlot3D1.notifyListeners(plotChangeEvent15);
        int int17 = piePlot3D1.getPieIndex();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent18 = null;
        piePlot3D1.notifyListeners(plotChangeEvent18);
        java.awt.Paint paint20 = piePlot3D1.getLabelBackgroundPaint();
        boolean boolean21 = piePlot3D1.isOutlineVisible();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint5 = piePlot3D1.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setShadowPaint(paint10);
        java.lang.Object obj13 = piePlot3D1.clone();
        piePlot3D1.setMinimumArcAngleToDraw(1.0d);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator16 = null;
        piePlot3D1.setToolTipGenerator(pieToolTipGenerator16);
        java.awt.Stroke stroke18 = piePlot3D1.getOutlineStroke();
        double double19 = piePlot3D1.getDepthFactor();
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D(pieDataset20);
        piePlot3D21.setBackgroundImageAlignment(1);
        boolean boolean24 = piePlot3D21.getSectionOutlinesVisible();
        java.awt.Paint paint26 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot3D21.setSectionOutlinePaint((java.lang.Comparable) "Pie 3D Plot", paint26);
        piePlot3D1.setBaseSectionPaint(paint26);
        double double30 = piePlot3D1.getExplodePercent((java.lang.Comparable) 100);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.12d + "'", double19 == 0.12d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot3D1.getLegendLabelURLGenerator();
        double double7 = piePlot3D1.getInteriorGap();
        java.awt.Shape shape8 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        piePlot3D1.setLegendItemShape(shape8);
        java.awt.Paint paint11 = piePlot3D1.getSectionPaint((java.lang.Comparable) (-1L));
        boolean boolean12 = piePlot3D1.getLabelLinksVisible();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = piePlot3D1.getLegendLabelURLGenerator();
        piePlot3D1.setShadowXOffset((double) (byte) -1);
        java.awt.Stroke stroke16 = piePlot3D1.getLabelLinkStroke();
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D(pieDataset17);
        piePlot3D18.setBackgroundImageAlignment(1);
        boolean boolean21 = piePlot3D18.getSectionOutlinesVisible();
        double double22 = piePlot3D18.getMaximumLabelWidth();
        piePlot3D18.setShadowXOffset((double) (byte) 10);
        boolean boolean25 = piePlot3D18.getSimpleLabels();
        java.awt.Stroke stroke26 = null;
        piePlot3D18.setLabelOutlineStroke(stroke26);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator28 = null;
        piePlot3D18.setToolTipGenerator(pieToolTipGenerator28);
        piePlot3D18.setSimpleLabels(true);
        java.awt.Font font32 = piePlot3D18.getLabelFont();
        java.awt.Paint paint33 = piePlot3D18.getLabelLinkPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets34 = piePlot3D18.getLabelPadding();
        piePlot3D1.setSimpleLabelOffset(rectangleInsets34);
        double double37 = piePlot3D1.getExplodePercent((java.lang.Comparable) "");
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator38 = piePlot3D1.getLegendLabelToolTipGenerator();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.08d + "'", double7 == 0.08d);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(pieURLGenerator13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.14d + "'", double22 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(font32);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(rectangleInsets34);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNull(pieSectionLabelGenerator38);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        boolean boolean6 = piePlot3D1.isOutlineVisible();
        double double7 = piePlot3D1.getLabelGap();
        java.awt.Stroke stroke8 = piePlot3D1.getOutlineStroke();
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D(pieDataset9);
        piePlot3D10.setBackgroundImageAlignment(1);
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D10.setLabelOutlinePaint(paint13);
        piePlot3D10.setBackgroundAlpha(0.0f);
        piePlot3D10.setBackgroundAlpha((float) 0L);
        double double19 = piePlot3D10.getLabelGap();
        boolean boolean20 = piePlot3D10.getSectionOutlinesVisible();
        boolean boolean21 = piePlot3D10.getDarkerSides();
        java.awt.Font font22 = piePlot3D10.getNoDataMessageFont();
        piePlot3D1.setLabelFont(font22);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.025d + "'", double7 == 0.025d);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.025d + "'", double19 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(font22);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator6 = piePlot3D1.getLegendLabelURLGenerator();
        org.jfree.data.general.PieDataset pieDataset7 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D8 = new org.jfree.chart.plot.PiePlot3D(pieDataset7);
        piePlot3D8.setBackgroundImageAlignment(1);
        java.awt.Paint paint11 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D8.setNoDataMessagePaint(paint11);
        piePlot3D1.setBaseSectionPaint(paint11);
        piePlot3D1.setPieIndex((int) (short) 0);
        java.awt.Paint paint16 = piePlot3D1.getLabelOutlinePaint();
        double double17 = piePlot3D1.getInteriorGap();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(pieURLGenerator6);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.08d + "'", double17 == 0.08d);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint10 = piePlot3D1.getLabelShadowPaint();
        piePlot3D1.setStartAngle((double) (short) 0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = null;
        piePlot3D1.setURLGenerator(pieURLGenerator13);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator15 = null;
        piePlot3D1.setToolTipGenerator(pieToolTipGenerator15);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot3D1.setLabelBackgroundPaint(paint17);
        boolean boolean19 = piePlot3D1.getSimpleLabels();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint10 = piePlot3D1.getLabelShadowPaint();
        piePlot3D1.setStartAngle((double) (short) 0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = null;
        piePlot3D1.setURLGenerator(pieURLGenerator13);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator15 = null;
        piePlot3D1.setToolTipGenerator(pieToolTipGenerator15);
        java.awt.Paint paint17 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        piePlot3D1.setLabelShadowPaint(paint17);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator19 = piePlot3D1.getLegendLabelURLGenerator();
        piePlot3D1.setNoDataMessage("hi!");
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent22 = null;
        piePlot3D1.notifyListeners(plotChangeEvent22);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D(pieDataset24);
        piePlot3D25.setBackgroundImageAlignment(1);
        java.awt.Paint paint28 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D25.setLabelOutlinePaint(paint28);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator30 = piePlot3D25.getLegendLabelURLGenerator();
        java.awt.Stroke stroke31 = null;
        piePlot3D25.setLabelOutlineStroke(stroke31);
        boolean boolean33 = piePlot3D25.getSectionOutlinesVisible();
        java.awt.Paint paint34 = piePlot3D25.getOutlinePaint();
        piePlot3D1.setLabelPaint(paint34);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(pieURLGenerator19);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNull(pieURLGenerator30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        org.jfree.chart.util.RectangleInsets rectangleInsets10 = piePlot3D1.getLabelPadding();
        piePlot3D1.setBackgroundImageAlpha((float) (byte) 0);
        java.lang.String str13 = piePlot3D1.getPlotType();
        piePlot3D1.setInteriorGap((double) (short) 0);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(rectangleInsets10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pie 3D Plot" + "'", str13, "Pie 3D Plot");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        org.jfree.chart.event.PlotChangeListener plotChangeListener6 = null;
        piePlot3D1.removeChangeListener(plotChangeListener6);
        java.awt.Paint paint9 = piePlot3D1.getSectionPaint((java.lang.Comparable) 0);
        org.jfree.data.general.PieDataset pieDataset10 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D11 = new org.jfree.chart.plot.PiePlot3D(pieDataset10);
        piePlot3D11.setBackgroundImageAlignment(1);
        java.awt.Paint paint14 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D11.setNoDataMessagePaint(paint14);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D(pieDataset16);
        piePlot3D17.setBackgroundImageAlignment(1);
        java.awt.Paint paint20 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D17.setNoDataMessagePaint(paint20);
        piePlot3D11.setBaseSectionOutlinePaint(paint20);
        java.lang.String str23 = piePlot3D11.getPlotType();
        piePlot3D11.setLabelLinkMargin(0.0d);
        org.jfree.data.general.PieDataset pieDataset26 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D27 = new org.jfree.chart.plot.PiePlot3D(pieDataset26);
        piePlot3D27.setBackgroundImageAlignment(1);
        boolean boolean30 = piePlot3D27.getSectionOutlinesVisible();
        org.jfree.chart.event.PlotChangeListener plotChangeListener31 = null;
        piePlot3D27.addChangeListener(plotChangeListener31);
        boolean boolean33 = piePlot3D11.equals((java.lang.Object) piePlot3D27);
        boolean boolean34 = piePlot3D27.isOutlineVisible();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator35 = piePlot3D27.getURLGenerator();
        java.awt.Stroke stroke36 = piePlot3D27.getLabelOutlineStroke();
        piePlot3D1.setBaseSectionOutlineStroke(stroke36);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator38 = null;
        piePlot3D1.setURLGenerator(pieURLGenerator38);
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator40 = piePlot3D1.getLegendLabelGenerator();
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D1.setInteriorGap((double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid 'percent' (100.0) argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Pie 3D Plot" + "'", str23, "Pie 3D Plot");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(pieURLGenerator35);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator40);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        piePlot3D1.setLabelLinksVisible(false);
        java.awt.Stroke stroke13 = piePlot3D1.getSectionOutlineStroke((java.lang.Comparable) 100L);
        java.awt.Paint paint14 = piePlot3D1.getBackgroundPaint();
        org.jfree.data.general.PieDataset pieDataset15 = null;
        piePlot3D1.setDataset(pieDataset15);
        org.jfree.data.general.PieDataset pieDataset17 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D18 = new org.jfree.chart.plot.PiePlot3D(pieDataset17);
        piePlot3D18.setBackgroundImageAlignment(1);
        boolean boolean21 = piePlot3D18.getSectionOutlinesVisible();
        double double22 = piePlot3D18.getMaximumLabelWidth();
        piePlot3D18.setShadowXOffset((double) (byte) 10);
        boolean boolean25 = piePlot3D18.getSimpleLabels();
        java.awt.Stroke stroke26 = null;
        piePlot3D18.setLabelOutlineStroke(stroke26);
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor28 = piePlot3D18.getLabelDistributor();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator29 = piePlot3D18.getLabelGenerator();
        piePlot3D1.setLabelGenerator(pieSectionLabelGenerator29);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(stroke13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.14d + "'", double22 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor28);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator29);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint5 = piePlot3D1.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.chart.util.RectangleInsets rectangleInsets6 = piePlot3D1.getSimpleLabelOffset();
        org.jfree.chart.event.PlotChangeListener plotChangeListener7 = null;
        piePlot3D1.removeChangeListener(plotChangeListener7);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator9 = piePlot3D1.getToolTipGenerator();
        piePlot3D1.setCircular(false);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D(pieDataset12);
        piePlot3D13.setBackgroundImageAlignment(1);
        java.awt.Paint paint17 = piePlot3D13.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D(pieDataset18);
        piePlot3D19.setBackgroundImageAlignment(1);
        java.awt.Paint paint22 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D19.setNoDataMessagePaint(paint22);
        piePlot3D13.setShadowPaint(paint22);
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent25 = null;
        piePlot3D13.axisChanged(axisChangeEvent25);
        java.awt.Paint paint27 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_OUTLINE_PAINT;
        piePlot3D13.setLabelLinkPaint(paint27);
        piePlot3D1.setNoDataMessagePaint(paint27);
        boolean boolean30 = piePlot3D1.getIgnoreZeroValues();
        piePlot3D1.setExplodePercent((java.lang.Comparable) (short) 10, 0.025d);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(rectangleInsets6);
        org.junit.Assert.assertNull(pieToolTipGenerator9);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        java.lang.String str5 = piePlot3D1.getPlotType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Pie 3D Plot" + "'", str5, "Pie 3D Plot");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setShadowXOffset((double) (byte) 10);
        boolean boolean8 = piePlot3D1.getSimpleLabels();
        java.awt.Stroke stroke9 = null;
        piePlot3D1.setLabelOutlineStroke(stroke9);
        org.jfree.chart.labels.PieToolTipGenerator pieToolTipGenerator11 = null;
        piePlot3D1.setToolTipGenerator(pieToolTipGenerator11);
        piePlot3D1.setSimpleLabels(true);
        float float15 = piePlot3D1.getBackgroundImageAlpha();
        java.awt.Stroke stroke17 = piePlot3D1.getSectionOutlineStroke((java.lang.Comparable) 0);
        double double18 = piePlot3D1.getLabelLinkMargin();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        org.junit.Assert.assertNull(stroke17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.025d + "'", double18 == 0.025d);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        java.lang.String str13 = piePlot3D1.getPlotType();
        piePlot3D1.setLabelLinkMargin(0.0d);
        org.jfree.data.general.PieDataset pieDataset16 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D17 = new org.jfree.chart.plot.PiePlot3D(pieDataset16);
        piePlot3D17.setBackgroundImageAlignment(1);
        boolean boolean20 = piePlot3D17.getSectionOutlinesVisible();
        org.jfree.chart.event.PlotChangeListener plotChangeListener21 = null;
        piePlot3D17.addChangeListener(plotChangeListener21);
        boolean boolean23 = piePlot3D1.equals((java.lang.Object) piePlot3D17);
        boolean boolean24 = piePlot3D17.isOutlineVisible();
        piePlot3D17.setNoDataMessage("");
        java.awt.Stroke stroke27 = piePlot3D17.getLabelOutlineStroke();
        java.awt.Font font28 = piePlot3D17.getLabelFont();
        java.awt.Shape shape29 = piePlot3D17.getLegendItemShape();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent30 = null;
        piePlot3D17.datasetChanged(datasetChangeEvent30);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Pie 3D Plot" + "'", str13, "Pie 3D Plot");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(font28);
        org.junit.Assert.assertNotNull(shape29);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        double double7 = piePlot3D1.getExplodePercent((java.lang.Comparable) "");
        piePlot3D1.setNoDataMessage("hi!");
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setCircular(false, true);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D(pieDataset9);
        piePlot3D10.setBackgroundImageAlignment(1);
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D10.setNoDataMessagePaint(paint13);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D(pieDataset15);
        piePlot3D16.setBackgroundImageAlignment(1);
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D16.setNoDataMessagePaint(paint19);
        piePlot3D10.setBaseSectionOutlinePaint(paint19);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setInsets(rectangleInsets22, false);
        piePlot3D1.setInsets(rectangleInsets22);
        java.awt.Paint paint26 = piePlot3D1.getNoDataMessagePaint();
        piePlot3D1.setDepthFactor((double) (short) 0);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent29 = null;
        piePlot3D1.markerChanged(markerChangeEvent29);
        piePlot3D1.setNoDataMessage("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets13, false);
        java.lang.String str16 = piePlot3D1.getPlotType();
        org.jfree.data.general.DatasetChangeEvent datasetChangeEvent17 = null;
        piePlot3D1.datasetChanged(datasetChangeEvent17);
        java.awt.Paint paint19 = piePlot3D1.getBaseSectionOutlinePaint();
        piePlot3D1.setLabelLinksVisible(true);
        org.jfree.data.general.PieDataset pieDataset22 = null;
        piePlot3D1.setDataset(pieDataset22);
        java.awt.Paint paint24 = piePlot3D1.getLabelBackgroundPaint();
        java.awt.Paint paint25 = piePlot3D1.getBaseSectionOutlinePaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Pie 3D Plot" + "'", str16, "Pie 3D Plot");
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint5 = piePlot3D1.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setShadowPaint(paint10);
        java.awt.Paint paint13 = piePlot3D1.getBaseSectionOutlinePaint();
        java.awt.Paint paint14 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setBaseSectionPaint(paint14);
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        piePlot3D1.addChangeListener(plotChangeListener16);
        piePlot3D1.setShadowXOffset((double) (byte) 1);
        org.jfree.data.general.PieDataset pieDataset20 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D21 = new org.jfree.chart.plot.PiePlot3D(pieDataset20);
        piePlot3D21.setBackgroundImageAlignment(1);
        boolean boolean24 = piePlot3D21.getSectionOutlinesVisible();
        double double25 = piePlot3D21.getMaximumLabelWidth();
        org.jfree.chart.plot.AbstractPieLabelDistributor abstractPieLabelDistributor26 = piePlot3D21.getLabelDistributor();
        java.awt.Font font27 = piePlot3D21.getNoDataMessageFont();
        piePlot3D1.setLabelFont(font27);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.14d + "'", double25 == 0.14d);
        org.junit.Assert.assertNotNull(abstractPieLabelDistributor26);
        org.junit.Assert.assertNotNull(font27);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        piePlot3D1.setBackgroundImageAlpha((float) (byte) 1);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        org.jfree.data.general.PieDataset pieDataset12 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D13 = new org.jfree.chart.plot.PiePlot3D(pieDataset12);
        piePlot3D13.setBackgroundImageAlignment(1);
        java.awt.Paint paint16 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D13.setNoDataMessagePaint(paint16);
        piePlot3D7.setBaseSectionOutlinePaint(paint16);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D7.setInsets(rectangleInsets19, false);
        piePlot3D1.setSimpleLabelOffset(rectangleInsets19);
        org.jfree.chart.LegendItemCollection legendItemCollection23 = piePlot3D1.getLegendItems();
        org.jfree.chart.event.PlotChangeListener plotChangeListener24 = null;
        piePlot3D1.addChangeListener(plotChangeListener24);
        piePlot3D1.setCircular(false);
        org.jfree.chart.util.RectangleInsets rectangleInsets28 = piePlot3D1.getSimpleLabelOffset();
        java.awt.Stroke stroke29 = piePlot3D1.getLabelOutlineStroke();
        org.jfree.chart.event.PlotChangeListener plotChangeListener30 = null;
        piePlot3D1.removeChangeListener(plotChangeListener30);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent32 = null;
        piePlot3D1.markerChanged(markerChangeEvent32);
        piePlot3D1.setSectionOutlinesVisible(true);
        org.jfree.data.general.PieDataset pieDataset36 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D37 = new org.jfree.chart.plot.PiePlot3D(pieDataset36);
        piePlot3D37.setBackgroundImageAlignment(1);
        java.awt.Paint paint40 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D37.setLabelOutlinePaint(paint40);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator42 = piePlot3D37.getLegendLabelURLGenerator();
        java.awt.Stroke stroke43 = null;
        piePlot3D37.setLabelOutlineStroke(stroke43);
        boolean boolean45 = piePlot3D37.getSectionOutlinesVisible();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator46 = piePlot3D37.getLegendLabelURLGenerator();
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator47 = null;
        piePlot3D37.setLegendLabelURLGenerator(pieURLGenerator47);
        java.awt.Stroke stroke49 = piePlot3D37.getOutlineStroke();
        piePlot3D1.setLabelLinkStroke(stroke49);
        // The following exception was thrown during execution in test generation
        try {
            double double51 = piePlot3D1.getMaximumExplodePercent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(legendItemCollection23);
        org.junit.Assert.assertNotNull(rectangleInsets28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNull(pieURLGenerator42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(pieURLGenerator46);
        org.junit.Assert.assertNotNull(stroke49);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        boolean boolean4 = piePlot3D1.getSectionOutlinesVisible();
        double double5 = piePlot3D1.getMaximumLabelWidth();
        piePlot3D1.setCircular(false, true);
        org.jfree.data.general.PieDataset pieDataset9 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D10 = new org.jfree.chart.plot.PiePlot3D(pieDataset9);
        piePlot3D10.setBackgroundImageAlignment(1);
        java.awt.Paint paint13 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D10.setNoDataMessagePaint(paint13);
        org.jfree.data.general.PieDataset pieDataset15 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D16 = new org.jfree.chart.plot.PiePlot3D(pieDataset15);
        piePlot3D16.setBackgroundImageAlignment(1);
        java.awt.Paint paint19 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D16.setNoDataMessagePaint(paint19);
        piePlot3D10.setBaseSectionOutlinePaint(paint19);
        org.jfree.chart.util.RectangleInsets rectangleInsets22 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D10.setInsets(rectangleInsets22, false);
        piePlot3D1.setInsets(rectangleInsets22);
        piePlot3D1.setLabelLinkMargin((double) 1L);
        piePlot3D1.setOutlineVisible(false);
        java.awt.Paint paint30 = piePlot3D1.getBaseSectionOutlinePaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = piePlot3D1.getLabelPadding();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.14d + "'", double5 == 0.14d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(rectangleInsets22);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(rectangleInsets31);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets13, false);
        java.awt.Stroke stroke17 = null;
        piePlot3D1.setSectionOutlineStroke((java.lang.Comparable) 1.0f, stroke17);
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets19, true);
        org.jfree.data.general.PieDataset pieDataset22 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D23 = new org.jfree.chart.plot.PiePlot3D(pieDataset22);
        piePlot3D23.setBackgroundImageAlignment(1);
        java.awt.Paint paint26 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D23.setLabelOutlinePaint(paint26);
        piePlot3D1.setLabelOutlinePaint(paint26);
        double double29 = piePlot3D1.getDepthFactor();
        double double30 = piePlot3D1.getMinimumArcAngleToDraw();
        java.awt.Paint paint31 = piePlot3D1.getLabelBackgroundPaint();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.12d + "'", double29 == 0.12d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0E-5d + "'", double30 == 1.0E-5d);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setLabelOutlinePaint(paint4);
        piePlot3D1.setBackgroundAlpha(0.0f);
        piePlot3D1.setBackgroundAlpha((float) 0L);
        java.awt.Paint paint10 = piePlot3D1.getLabelShadowPaint();
        piePlot3D1.setStartAngle((double) (short) 0);
        org.jfree.chart.urls.PieURLGenerator pieURLGenerator13 = null;
        piePlot3D1.setURLGenerator(pieURLGenerator13);
        piePlot3D1.setCircular(true);
        org.jfree.chart.plot.Plot plot17 = piePlot3D1.getParent();
        org.jfree.data.general.PieDataset pieDataset18 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D19 = new org.jfree.chart.plot.PiePlot3D(pieDataset18);
        piePlot3D19.setBackgroundImageAlignment(1);
        java.awt.Paint paint22 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D19.setNoDataMessagePaint(paint22);
        org.jfree.data.general.PieDataset pieDataset24 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D25 = new org.jfree.chart.plot.PiePlot3D(pieDataset24);
        piePlot3D25.setBackgroundImageAlignment(1);
        java.awt.Paint paint28 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D25.setNoDataMessagePaint(paint28);
        piePlot3D19.setBaseSectionOutlinePaint(paint28);
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D19.setInsets(rectangleInsets31, false);
        java.awt.Stroke stroke35 = null;
        piePlot3D19.setSectionOutlineStroke((java.lang.Comparable) 1.0f, stroke35);
        piePlot3D19.setIgnoreZeroValues(false);
        java.awt.Stroke stroke39 = null;
        piePlot3D19.setOutlineStroke(stroke39);
        piePlot3D19.setSectionOutlinesVisible(true);
        piePlot3D19.setBackgroundImageAlignment((int) (short) 10);
        org.jfree.data.general.PieDataset pieDataset45 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D46 = new org.jfree.chart.plot.PiePlot3D(pieDataset45);
        piePlot3D46.setBackgroundImageAlignment(1);
        boolean boolean49 = piePlot3D46.getSectionOutlinesVisible();
        double double50 = piePlot3D46.getMaximumLabelWidth();
        org.jfree.chart.labels.PieSectionLabelGenerator pieSectionLabelGenerator51 = piePlot3D46.getLegendLabelGenerator();
        java.awt.Font font52 = piePlot3D46.getLabelFont();
        piePlot3D19.setLabelFont(font52);
        java.awt.Stroke stroke54 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        piePlot3D19.setLabelLinkStroke(stroke54);
        piePlot3D1.setOutlineStroke(stroke54);
        piePlot3D1.setSimpleLabels(false);
        java.awt.Stroke stroke59 = piePlot3D1.getLabelOutlineStroke();
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(plot17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(rectangleInsets31);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.14d + "'", double50 == 0.14d);
        org.junit.Assert.assertNotNull(pieSectionLabelGenerator51);
        org.junit.Assert.assertNotNull(font52);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertNotNull(stroke59);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint5 = piePlot3D1.getSectionPaint((java.lang.Comparable) (short) 0);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setShadowPaint(paint10);
        java.awt.Paint paint13 = piePlot3D1.getBaseSectionOutlinePaint();
        java.awt.Paint paint14 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setBaseSectionPaint(paint14);
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        piePlot3D1.addChangeListener(plotChangeListener16);
        java.awt.Paint paint18 = piePlot3D1.getLabelShadowPaint();
        java.awt.Stroke stroke20 = piePlot3D1.getSectionOutlineStroke((java.lang.Comparable) 4.0d);
        java.awt.Paint paint21 = piePlot3D1.getOutlinePaint();
        piePlot3D1.setShadowYOffset((double) 10.0f);
        java.awt.Graphics2D graphics2D24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        // The following exception was thrown during execution in test generation
        try {
            piePlot3D1.drawBackground(graphics2D24, rectangle2D25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(stroke20);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.jfree.data.general.PieDataset pieDataset0 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D1 = new org.jfree.chart.plot.PiePlot3D(pieDataset0);
        piePlot3D1.setBackgroundImageAlignment(1);
        java.awt.Paint paint4 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D1.setNoDataMessagePaint(paint4);
        org.jfree.data.general.PieDataset pieDataset6 = null;
        org.jfree.chart.plot.PiePlot3D piePlot3D7 = new org.jfree.chart.plot.PiePlot3D(pieDataset6);
        piePlot3D7.setBackgroundImageAlignment(1);
        java.awt.Paint paint10 = org.jfree.chart.plot.PiePlot.DEFAULT_LABEL_BACKGROUND_PAINT;
        piePlot3D7.setNoDataMessagePaint(paint10);
        piePlot3D1.setBaseSectionOutlinePaint(paint10);
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
        piePlot3D1.setInsets(rectangleInsets13, false);
        java.awt.Stroke stroke17 = null;
        piePlot3D1.setSectionOutlineStroke((java.lang.Comparable) 1.0f, stroke17);
        piePlot3D1.setIgnoreZeroValues(false);
        java.awt.Stroke stroke21 = null;
        piePlot3D1.setOutlineStroke(stroke21);
        piePlot3D1.setSectionOutlinesVisible(true);
        piePlot3D1.setBackgroundImageAlignment((int) 'a');
        double double27 = piePlot3D1.getLabelLinkMargin();
        piePlot3D1.setLabelLinkMargin(0.0d);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.025d + "'", double27 == 0.025d);
    }
}

