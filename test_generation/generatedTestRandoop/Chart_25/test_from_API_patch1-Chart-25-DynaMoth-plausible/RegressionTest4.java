import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        boolean boolean4 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        int int5 = statisticalBarRenderer0.getColumnCount();
        double double6 = statisticalBarRenderer0.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer7.setBaseOutlinePaint(paint8);
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer7.setSeriesPaint(0, paint11);
        java.lang.Object obj13 = null;
        boolean boolean14 = statisticalBarRenderer7.equals(obj13);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = null;
        statisticalBarRenderer16.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition18, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator21 = statisticalBarRenderer16.getLegendItemToolTipGenerator();
        java.awt.Paint paint22 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer16.setErrorIndicatorPaint(paint22);
        statisticalBarRenderer7.setSeriesPaint(10, paint22);
        statisticalBarRenderer7.setBaseSeriesVisible(true);
        statisticalBarRenderer7.setIncludeBaseInRange(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer29.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = statisticalBarRenderer29.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition35 = statisticalBarRenderer29.getSeriesNegativeItemLabelPosition(100);
        statisticalBarRenderer7.setBaseNegativeItemLabelPosition(itemLabelPosition35, true);
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition35);
        java.awt.Paint paint40 = statisticalBarRenderer0.getSeriesOutlinePaint(10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition43 = statisticalBarRenderer0.getPositiveItemLabelPosition(0, 1);
        java.lang.Boolean boolean45 = statisticalBarRenderer0.getSeriesCreateEntities((int) (byte) 0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator47 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (byte) 10, categoryToolTipGenerator47, true);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNull(categoryPlot33);
        org.junit.Assert.assertNotNull(itemLabelPosition35);
        org.junit.Assert.assertNull(paint40);
        org.junit.Assert.assertNotNull(itemLabelPosition43);
        org.junit.Assert.assertNull(boolean45);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer0.setSeriesStroke((int) (short) 100, stroke7);
        statisticalBarRenderer0.setBaseItemLabelsVisible(false);
        boolean boolean13 = statisticalBarRenderer0.isItemLabelVisible((int) (byte) 1, (int) 'a');
        statisticalBarRenderer0.setSeriesItemLabelsVisible(0, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = null;
        statisticalBarRenderer17.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition19, false);
        java.awt.Paint paint23 = statisticalBarRenderer17.getSeriesFillPaint((int) (byte) 0);
        boolean boolean26 = statisticalBarRenderer17.getItemCreateEntity((int) '4', (int) 'a');
        java.awt.Paint paint29 = statisticalBarRenderer17.getItemPaint(1, (int) (short) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer31.setBaseOutlinePaint(paint32);
        boolean boolean34 = statisticalBarRenderer31.isDrawBarOutline();
        statisticalBarRenderer31.setDrawBarOutline(false);
        java.awt.Paint paint37 = statisticalBarRenderer31.getErrorIndicatorPaint();
        statisticalBarRenderer17.setSeriesFillPaint(0, paint37, false);
        statisticalBarRenderer0.setBasePaint(paint37, true);
        java.awt.Paint paint42 = statisticalBarRenderer0.getBaseFillPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer43 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint44 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer43.setBaseOutlinePaint(paint44);
        java.awt.Shape shape47 = statisticalBarRenderer43.getSeriesShape((int) (short) 100);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator49 = null;
        statisticalBarRenderer43.setSeriesItemLabelGenerator((int) (short) 1, categoryItemLabelGenerator49, true);
        java.awt.Paint paint52 = statisticalBarRenderer43.getBasePaint();
        statisticalBarRenderer0.setBaseItemLabelPaint(paint52);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNull(shape47);
        org.junit.Assert.assertNotNull(paint52);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = statisticalBarRenderer0.hasListener(eventListener3);
        boolean boolean5 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) '4', (java.lang.Boolean) true);
        statisticalBarRenderer0.setSeriesVisibleInLegend(100, (java.lang.Boolean) true, true);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer0.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) ' ', shape7, false);
        statisticalBarRenderer0.setMaximumBarWidth((double) 10.0f);
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, false);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true, true);
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(true);
        statisticalBarRenderer0.setDrawBarOutline(true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((-1));
        org.jfree.chart.LegendItemCollection legendItemCollection24 = statisticalBarRenderer0.getLegendItems();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(itemLabelPosition23);
        org.junit.Assert.assertNotNull(legendItemCollection24);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer4 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition5 = statisticalBarRenderer4.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = statisticalBarRenderer4.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition7);
        statisticalBarRenderer0.setAutoPopulateSeriesShape(false);
        statisticalBarRenderer0.setBaseCreateEntities(false);
        statisticalBarRenderer0.setSeriesVisible(1, (java.lang.Boolean) true, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator17 = statisticalBarRenderer0.getBaseToolTipGenerator();
        java.lang.Object obj18 = statisticalBarRenderer0.clone();
        statisticalBarRenderer0.setBaseCreateEntities(false);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(itemLabelPosition5);
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertNull(categoryToolTipGenerator17);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        statisticalBarRenderer0.setMaximumBarWidth((double) (short) 100);
        java.awt.Stroke stroke6 = statisticalBarRenderer0.getErrorIndicatorStroke();
        double double7 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) ' ', false);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0d + "'", double7 == 2.0d);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        boolean boolean4 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        int int5 = statisticalBarRenderer0.getColumnCount();
        double double6 = statisticalBarRenderer0.getItemMargin();
        boolean boolean7 = statisticalBarRenderer0.isDrawBarOutline();
        statisticalBarRenderer0.setBase((double) (short) 10);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) (short) -1);
        java.awt.Paint paint13 = statisticalBarRenderer0.getSeriesPaint((int) (byte) 0);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNull(paint13);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setSeriesPaint(0, paint4);
        java.lang.Object obj6 = null;
        boolean boolean7 = statisticalBarRenderer0.equals(obj6);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = null;
        statisticalBarRenderer9.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition11, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer9.getLegendItemToolTipGenerator();
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer9.setErrorIndicatorPaint(paint15);
        statisticalBarRenderer0.setSeriesPaint(10, paint15);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer18.setBaseOutlinePaint(paint19);
        boolean boolean21 = statisticalBarRenderer18.isDrawBarOutline();
        boolean boolean22 = statisticalBarRenderer18.getBaseItemLabelsVisible();
        int int23 = statisticalBarRenderer18.getColumnCount();
        double double24 = statisticalBarRenderer18.getItemMargin();
        java.awt.Shape shape27 = statisticalBarRenderer18.getItemShape(1, (int) (byte) 10);
        statisticalBarRenderer0.setBaseShape(shape27, false);
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (short) 10, (java.lang.Boolean) false);
        java.lang.Boolean boolean34 = statisticalBarRenderer0.getSeriesVisibleInLegend((int) (byte) 0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator36 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) ' ', categoryURLGenerator36, false);
        boolean boolean40 = statisticalBarRenderer0.isSeriesItemLabelsVisible(10);
        java.awt.Stroke stroke43 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 1, (int) (short) -1);
        double double44 = statisticalBarRenderer0.getMaximumBarWidth();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.2d + "'", double24 == 0.2d);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNull(boolean34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer0.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) ' ', shape7, false);
        statisticalBarRenderer0.setMaximumBarWidth((double) 10.0f);
        boolean boolean14 = statisticalBarRenderer0.isItemLabelVisible(100, (int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer15.setBaseOutlinePaint(paint16);
        statisticalBarRenderer0.setBaseOutlinePaint(paint16, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator20 = statisticalBarRenderer0.getLegendItemURLGenerator();
        boolean boolean23 = statisticalBarRenderer0.getItemCreateEntity((int) '4', (int) (short) 10);
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setPlot(categoryPlot24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer0.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) ' ', shape7, false);
        statisticalBarRenderer0.setMaximumBarWidth((double) 10.0f);
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, false);
        java.awt.Stroke stroke16 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) (byte) 0);
        java.awt.Paint paint18 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (short) 10);
        int int19 = statisticalBarRenderer0.getPassCount();
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        boolean boolean2 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer3 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition5 = null;
        statisticalBarRenderer3.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition5, false);
        java.awt.Stroke stroke10 = statisticalBarRenderer3.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer3.setSeriesShape((int) (short) 1, shape12);
        boolean boolean14 = statisticalBarRenderer3.isDrawBarOutline();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = statisticalBarRenderer3.getPlot();
        statisticalBarRenderer3.setBaseItemLabelsVisible(false, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition20 = statisticalBarRenderer3.getSeriesNegativeItemLabelPosition((int) (byte) 100);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition20);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = statisticalBarRenderer0.getSeriesURLGenerator(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(categoryPlot15);
        org.junit.Assert.assertNotNull(itemLabelPosition20);
        org.junit.Assert.assertNull(categoryURLGenerator23);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke(1, 100);
        double double8 = statisticalBarRenderer0.getMinimumBarLength();
        statisticalBarRenderer0.setMaximumBarWidth(10.0d);
        statisticalBarRenderer0.setSeriesCreateEntities(10, (java.lang.Boolean) true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) ' ', (int) (byte) -1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator17 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator17, true);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
        org.junit.Assert.assertNull(categoryItemLabelGenerator23);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer0.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) ' ', shape7, false);
        statisticalBarRenderer0.setMaximumBarWidth((double) 10.0f);
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, false);
        java.awt.Shape shape17 = statisticalBarRenderer0.getItemShape((int) (short) -1, (int) (byte) 100);
        java.awt.Paint paint19 = statisticalBarRenderer0.lookupSeriesPaint((int) (short) 0);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false, true);
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer0.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) ' ', shape7, false);
        statisticalBarRenderer0.setMaximumBarWidth((double) 10.0f);
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, false);
        boolean boolean15 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        java.awt.Paint paint17 = statisticalBarRenderer0.lookupSeriesFillPaint((int) (short) 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator18 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition20 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = null;
        statisticalBarRenderer21.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition23, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator26 = statisticalBarRenderer21.getLegendItemToolTipGenerator();
        java.awt.Stroke stroke28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer21.setSeriesStroke((int) (short) 100, stroke28);
        statisticalBarRenderer21.setBaseItemLabelsVisible(false);
        boolean boolean34 = statisticalBarRenderer21.isItemLabelVisible((int) (byte) 1, (int) 'a');
        statisticalBarRenderer21.setSeriesItemLabelsVisible(0, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition38 = statisticalBarRenderer21.getBaseNegativeItemLabelPosition();
        int int39 = statisticalBarRenderer21.getPassCount();
        boolean boolean40 = statisticalBarRenderer0.equals((java.lang.Object) statisticalBarRenderer21);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator41 = statisticalBarRenderer21.getLegendItemLabelGenerator();
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(categoryItemLabelGenerator18);
        org.junit.Assert.assertNotNull(itemLabelPosition20);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator26);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator41);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke(1, 100);
        double double8 = statisticalBarRenderer0.getMinimumBarLength();
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (byte) -1);
        java.awt.Paint paint12 = statisticalBarRenderer0.getBasePaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer13.setBaseOutlinePaint(paint14);
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer13.setSeriesPaint(0, paint17);
        java.lang.Object obj19 = null;
        boolean boolean20 = statisticalBarRenderer13.equals(obj19);
        java.awt.Shape shape23 = statisticalBarRenderer13.getItemShape((int) (byte) 1, (int) (short) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer24.setBaseOutlinePaint(paint25);
        java.awt.Paint paint28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer24.setSeriesPaint(0, paint28);
        java.lang.Object obj30 = null;
        boolean boolean31 = statisticalBarRenderer24.equals(obj30);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer33 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition35 = null;
        statisticalBarRenderer33.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition35, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator38 = statisticalBarRenderer33.getLegendItemToolTipGenerator();
        java.awt.Paint paint39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer33.setErrorIndicatorPaint(paint39);
        statisticalBarRenderer24.setSeriesPaint(10, paint39);
        statisticalBarRenderer24.setBaseSeriesVisible(true);
        statisticalBarRenderer24.setIncludeBaseInRange(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer46 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer46.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot50 = statisticalBarRenderer46.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition52 = statisticalBarRenderer46.getSeriesNegativeItemLabelPosition(100);
        statisticalBarRenderer24.setBaseNegativeItemLabelPosition(itemLabelPosition52, true);
        statisticalBarRenderer13.setNegativeItemLabelPositionFallback(itemLabelPosition52);
        boolean boolean56 = statisticalBarRenderer13.getAutoPopulateSeriesOutlineStroke();
        double double57 = statisticalBarRenderer13.getMinimumBarLength();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator58 = statisticalBarRenderer13.getLegendItemLabelGenerator();
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator58);
        double double60 = statisticalBarRenderer0.getLowerClip();
        java.awt.Paint paint63 = statisticalBarRenderer0.getItemPaint((int) (short) 0, (int) (short) 1);
        boolean boolean64 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNull(categoryPlot50);
        org.junit.Assert.assertNotNull(itemLabelPosition52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator58);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(paint63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = statisticalBarRenderer0.getPlot();
        java.awt.Paint paint9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseItemLabelPaint(paint9);
        boolean boolean11 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer0.setBaseSeriesVisible(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) 'a', (int) (byte) 10);
        double double17 = statisticalBarRenderer0.getUpperClip();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition20 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) ' ', (int) (short) -1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(categoryPlot8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(itemLabelPosition20);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setSeriesPaint(0, paint4);
        java.lang.Object obj6 = null;
        boolean boolean7 = statisticalBarRenderer0.equals(obj6);
        java.awt.Paint paint9 = statisticalBarRenderer0.lookupSeriesPaint(0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer11.setBaseOutlinePaint(paint12);
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer11.setSeriesPaint(0, paint15);
        java.lang.Object obj17 = null;
        boolean boolean18 = statisticalBarRenderer11.equals(obj17);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = null;
        statisticalBarRenderer20.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition22, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator25 = statisticalBarRenderer20.getLegendItemToolTipGenerator();
        java.awt.Paint paint26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer20.setErrorIndicatorPaint(paint26);
        statisticalBarRenderer11.setSeriesPaint(10, paint26);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator29 = statisticalBarRenderer11.getLegendItemURLGenerator();
        java.awt.Paint paint32 = statisticalBarRenderer11.getItemLabelPaint(1, (int) ' ');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator33 = null;
        statisticalBarRenderer11.setBaseToolTipGenerator(categoryToolTipGenerator33, true);
        boolean boolean36 = statisticalBarRenderer11.getIncludeBaseInRange();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer37.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = statisticalBarRenderer37.getPlot();
        java.awt.Paint paint43 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer37.setSeriesOutlinePaint(10, paint43, true);
        java.awt.Shape shape47 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer37.setSeriesShape((int) (byte) 1, shape47, true);
        java.awt.Paint paint50 = statisticalBarRenderer37.getBaseFillPaint();
        statisticalBarRenderer11.setBaseFillPaint(paint50);
        statisticalBarRenderer0.setSeriesItemLabelPaint((int) (byte) 100, paint50, false);
        java.awt.Paint paint54 = statisticalBarRenderer0.getBaseFillPaint();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator25);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator29);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(categoryPlot41);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(shape47);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNotNull(paint54);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = statisticalBarRenderer0.getPlot();
        java.awt.Stroke stroke9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke9);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer11.setBaseOutlinePaint(paint12);
        boolean boolean14 = statisticalBarRenderer11.isDrawBarOutline();
        statisticalBarRenderer11.setDrawBarOutline(false);
        java.awt.Stroke stroke18 = null;
        statisticalBarRenderer11.setSeriesOutlineStroke((int) (short) 0, stroke18, true);
        java.awt.Paint paint23 = statisticalBarRenderer11.getItemPaint(10, (-1));
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator26 = statisticalBarRenderer11.getURLGenerator((int) (short) -1, 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = null;
        statisticalBarRenderer27.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition29, false);
        java.awt.Stroke stroke34 = statisticalBarRenderer27.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape36 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer27.setSeriesShape((int) (short) 1, shape36);
        java.lang.Boolean boolean39 = statisticalBarRenderer27.getSeriesVisible((int) (byte) 0);
        statisticalBarRenderer27.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer42 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition43 = statisticalBarRenderer42.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition45 = statisticalBarRenderer42.getSeriesPositiveItemLabelPosition((int) '#');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer47 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint48 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer47.setBaseOutlinePaint(paint48);
        java.awt.Paint paint51 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer47.setSeriesPaint(0, paint51);
        java.lang.Object obj53 = null;
        boolean boolean54 = statisticalBarRenderer47.equals(obj53);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer56 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition58 = null;
        statisticalBarRenderer56.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition58, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator61 = statisticalBarRenderer56.getLegendItemToolTipGenerator();
        java.awt.Paint paint62 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer56.setErrorIndicatorPaint(paint62);
        statisticalBarRenderer47.setSeriesPaint(10, paint62);
        statisticalBarRenderer42.setSeriesPaint((int) (byte) 10, paint62);
        statisticalBarRenderer27.setBaseItemLabelPaint(paint62);
        statisticalBarRenderer11.setBaseOutlinePaint(paint62);
        statisticalBarRenderer11.setBaseSeriesVisibleInLegend(true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition71 = statisticalBarRenderer11.getSeriesNegativeItemLabelPosition((int) (short) -1);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition71);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(categoryPlot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNull(categoryURLGenerator26);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertNull(boolean39);
        org.junit.Assert.assertNull(itemLabelPosition43);
        org.junit.Assert.assertNotNull(itemLabelPosition45);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator61);
        org.junit.Assert.assertNotNull(paint62);
        org.junit.Assert.assertNotNull(itemLabelPosition71);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = statisticalBarRenderer0.hasListener(eventListener5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = statisticalBarRenderer0.getSeriesItemLabelGenerator(0);
        java.awt.Font font12 = statisticalBarRenderer0.getBaseItemLabelFont();
        java.awt.Stroke stroke13 = statisticalBarRenderer0.getBaseOutlineStroke();
        statisticalBarRenderer0.setBaseItemLabelsVisible(true);
        statisticalBarRenderer0.setBaseSeriesVisible(false);
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (short) 100, (java.lang.Boolean) false, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        boolean boolean4 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = null;
        statisticalBarRenderer6.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition8, false);
        java.awt.Stroke stroke13 = statisticalBarRenderer6.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer15.setBaseOutlinePaint(paint16);
        statisticalBarRenderer6.setSeriesPaint((int) 'a', paint16, false);
        statisticalBarRenderer0.setSeriesFillPaint((int) (short) 100, paint16);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer21 = null;
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer21);
        double double23 = statisticalBarRenderer0.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = null;
        statisticalBarRenderer24.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition26, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator29 = statisticalBarRenderer24.getLegendItemToolTipGenerator();
        java.awt.Paint paint30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer24.setErrorIndicatorPaint(paint30);
        java.awt.Stroke stroke32 = statisticalBarRenderer24.getBaseOutlineStroke();
        statisticalBarRenderer24.setBaseSeriesVisibleInLegend(false, true);
        statisticalBarRenderer24.setSeriesCreateEntities(0, (java.lang.Boolean) false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition41 = statisticalBarRenderer24.getPositiveItemLabelPosition((int) (short) 100, 100);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition41, false);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.2d + "'", double23 == 0.2d);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator29);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(itemLabelPosition41);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Stroke stroke4 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (short) 1);
        java.lang.Boolean boolean6 = statisticalBarRenderer0.getSeriesCreateEntities((-1));
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = null;
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition7);
        org.jfree.chart.event.RendererChangeListener rendererChangeListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.addChangeListener(rendererChangeListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertNull(boolean6);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = statisticalBarRenderer0.getPlot();
        double double9 = statisticalBarRenderer0.getMinimumBarLength();
        java.lang.Boolean boolean11 = statisticalBarRenderer0.getSeriesCreateEntities((int) 'a');
        java.awt.Paint paint12 = statisticalBarRenderer0.getBaseItemLabelPaint();
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(categoryPlot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) (short) 1, shape9);
        java.lang.Boolean boolean12 = statisticalBarRenderer0.getSeriesVisible((int) (byte) 0);
        boolean boolean15 = statisticalBarRenderer0.getItemVisible((int) 'a', (int) (byte) 10);
        double double16 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        boolean boolean17 = statisticalBarRenderer0.getAutoPopulateSeriesPaint();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = null;
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        org.jfree.chart.plot.Marker marker23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D20, categoryPlot21, valueAxis22, marker23, rectangle2D24);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 2.0d + "'", double16 == 2.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Paint paint6 = statisticalBarRenderer0.lookupSeriesFillPaint(0);
        java.awt.Paint paint8 = null;
        statisticalBarRenderer0.setSeriesOutlinePaint((int) (short) 0, paint8, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer11.setBaseOutlinePaint(paint12);
        boolean boolean14 = statisticalBarRenderer11.getAutoPopulateSeriesShape();
        java.awt.Paint paint16 = statisticalBarRenderer11.lookupSeriesPaint((int) (short) 0);
        java.awt.Paint paint18 = statisticalBarRenderer11.lookupSeriesOutlinePaint((int) (short) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator19 = null;
        statisticalBarRenderer11.setBaseToolTipGenerator(categoryToolTipGenerator19, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator22 = statisticalBarRenderer11.getLegendItemLabelGenerator();
        java.awt.Paint paint24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer11.setSeriesOutlinePaint((int) (byte) 100, paint24, false);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint24);
        java.awt.Graphics2D graphics2D28 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = null;
        org.jfree.chart.plot.CategoryMarker categoryMarker31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawDomainMarker(graphics2D28, categoryPlot29, categoryAxis30, categoryMarker31, rectangle2D32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator22);
        org.junit.Assert.assertNotNull(paint24);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        double double6 = statisticalBarRenderer0.getItemMargin();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator7);
        boolean boolean11 = statisticalBarRenderer0.getItemVisible((int) (short) 1, 100);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getBaseItemLabelPaint();
        statisticalBarRenderer0.setBaseCreateEntities(false, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.lang.Boolean boolean11 = statisticalBarRenderer0.getSeriesVisibleInLegend((int) (short) 1);
        java.awt.Stroke stroke13 = statisticalBarRenderer0.lookupSeriesStroke((int) 'a');
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer14 = statisticalBarRenderer0.getGradientPaintTransformer();
        java.awt.Stroke stroke16 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) 'a');
        java.awt.Font font17 = statisticalBarRenderer0.getBaseItemLabelFont();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setPlot(categoryPlot18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(gradientPaintTransformer14);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(font17);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer4 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition6 = null;
        statisticalBarRenderer4.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition6, false);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = statisticalBarRenderer4.hasListener(eventListener9);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = null;
        statisticalBarRenderer4.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator12);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = statisticalBarRenderer4.getSeriesItemLabelGenerator(0);
        java.awt.Font font16 = statisticalBarRenderer4.getBaseItemLabelFont();
        statisticalBarRenderer0.setBaseItemLabelFont(font16);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (byte) 1, categoryItemLabelGenerator19);
        statisticalBarRenderer0.setBaseItemLabelsVisible(false);
        java.lang.Object obj23 = statisticalBarRenderer0.clone();
        int int24 = statisticalBarRenderer0.getPassCount();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition6 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition(100);
        double double7 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        boolean boolean10 = statisticalBarRenderer0.getItemVisible((int) (short) 100, 10);
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNotNull(itemLabelPosition6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0d + "'", double7 == 2.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Stroke stroke4 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = statisticalBarRenderer0.getToolTipGenerator(0, 0);
        boolean boolean8 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        statisticalBarRenderer0.setSeriesCreateEntities((int) ' ', (java.lang.Boolean) false);
        boolean boolean16 = statisticalBarRenderer0.getItemVisible((-1), 100);
        boolean boolean17 = statisticalBarRenderer0.getBaseCreateEntities();
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = null;
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.plot.Marker marker21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D18, categoryPlot19, valueAxis20, marker21, rectangle2D22);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke(1, 100);
        statisticalBarRenderer0.setItemMargin(3.0d);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = statisticalBarRenderer11.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = statisticalBarRenderer11.getSeriesPositiveItemLabelPosition((int) '#');
        boolean boolean15 = statisticalBarRenderer11.getBaseSeriesVisible();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = statisticalBarRenderer11.getNegativeItemLabelPositionFallback();
        java.awt.Paint paint17 = statisticalBarRenderer11.getBaseFillPaint();
        statisticalBarRenderer0.setSeriesOutlinePaint((int) (byte) 10, paint17);
        statisticalBarRenderer0.setSeriesItemLabelsVisible(1, (java.lang.Boolean) false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = null;
        statisticalBarRenderer23.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition25, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator28 = statisticalBarRenderer23.getLegendItemToolTipGenerator();
        double double29 = statisticalBarRenderer23.getItemMargin();
        java.awt.Shape shape31 = statisticalBarRenderer23.getSeriesShape((int) ' ');
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer32 = null;
        statisticalBarRenderer23.setGradientPaintTransformer(gradientPaintTransformer32);
        boolean boolean34 = statisticalBarRenderer23.isDrawBarOutline();
        java.awt.Paint paint36 = statisticalBarRenderer23.getSeriesFillPaint((int) (byte) 100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition39 = statisticalBarRenderer23.getNegativeItemLabelPosition((int) (byte) -1, (int) (short) 1);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition39);
        java.awt.Paint paint41 = statisticalBarRenderer0.getBasePaint();
        java.awt.Paint paint43 = statisticalBarRenderer0.getSeriesItemLabelPaint((int) (short) -1);
        boolean boolean44 = statisticalBarRenderer0.getIncludeBaseInRange();
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(itemLabelPosition12);
        org.junit.Assert.assertNotNull(itemLabelPosition14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(itemLabelPosition16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.2d + "'", double29 == 0.2d);
        org.junit.Assert.assertNull(shape31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(paint36);
        org.junit.Assert.assertNotNull(itemLabelPosition39);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNull(paint43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer0.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) ' ', shape7, false);
        statisticalBarRenderer0.setMaximumBarWidth((double) 10.0f);
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, false);
        java.awt.Stroke stroke16 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) (byte) 0);
        java.awt.Paint paint18 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (short) 10);
        java.awt.Paint paint21 = statisticalBarRenderer0.getItemFillPaint((int) ' ', 100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = statisticalBarRenderer0.getNegativeItemLabelPosition(0, (int) 'a');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition28 = null;
        statisticalBarRenderer26.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition28, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator31 = statisticalBarRenderer26.getLegendItemToolTipGenerator();
        java.awt.Stroke stroke33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer26.setSeriesStroke((int) (short) 100, stroke33);
        statisticalBarRenderer26.setBaseItemLabelsVisible(false);
        boolean boolean39 = statisticalBarRenderer26.isItemLabelVisible((int) (byte) 1, (int) 'a');
        statisticalBarRenderer26.setSeriesItemLabelsVisible(0, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer43 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition45 = null;
        statisticalBarRenderer43.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition45, false);
        java.awt.Paint paint49 = statisticalBarRenderer43.getSeriesFillPaint((int) (byte) 0);
        boolean boolean52 = statisticalBarRenderer43.getItemCreateEntity((int) '4', (int) 'a');
        java.awt.Paint paint55 = statisticalBarRenderer43.getItemPaint(1, (int) (short) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer57 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint58 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer57.setBaseOutlinePaint(paint58);
        boolean boolean60 = statisticalBarRenderer57.isDrawBarOutline();
        statisticalBarRenderer57.setDrawBarOutline(false);
        java.awt.Paint paint63 = statisticalBarRenderer57.getErrorIndicatorPaint();
        statisticalBarRenderer43.setSeriesFillPaint(0, paint63, false);
        statisticalBarRenderer26.setBasePaint(paint63, true);
        java.awt.Paint paint68 = statisticalBarRenderer26.getBaseFillPaint();
        statisticalBarRenderer0.setSeriesPaint((int) 'a', paint68, true);
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(itemLabelPosition24);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator31);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(paint49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(paint63);
        org.junit.Assert.assertNotNull(paint68);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        java.awt.Paint paint6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint6, true);
        java.awt.Shape shape10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) (byte) 1, shape10, true);
        java.awt.Paint paint13 = statisticalBarRenderer0.getBaseFillPaint();
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false);
        boolean boolean18 = statisticalBarRenderer0.getItemCreateEntity(1, 1);
        double double19 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        double double20 = statisticalBarRenderer0.getItemMargin();
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2.0d + "'", double19 == 2.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.2d + "'", double20 == 0.2d);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        double double3 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer4 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint5 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer4.setBaseOutlinePaint(paint5);
        java.awt.Stroke stroke8 = statisticalBarRenderer4.getSeriesOutlineStroke((int) (short) 1);
        java.lang.Boolean boolean10 = statisticalBarRenderer4.getSeriesCreateEntities((-1));
        double double11 = statisticalBarRenderer4.getMaximumBarWidth();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = null;
        statisticalBarRenderer12.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition14, false);
        java.awt.Stroke stroke19 = statisticalBarRenderer12.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer12.setSeriesShape((int) (short) 1, shape21);
        java.lang.Boolean boolean24 = statisticalBarRenderer12.getSeriesVisible((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer25.setBaseOutlinePaint(paint26);
        boolean boolean28 = statisticalBarRenderer25.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition30 = statisticalBarRenderer29.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition32 = statisticalBarRenderer29.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer25.setBasePositiveItemLabelPosition(itemLabelPosition32);
        statisticalBarRenderer12.setBaseNegativeItemLabelPosition(itemLabelPosition32);
        statisticalBarRenderer4.setNegativeItemLabelPositionFallback(itemLabelPosition32);
        statisticalBarRenderer4.setBase((double) (short) 10);
        java.awt.Font font40 = statisticalBarRenderer4.getItemLabelFont((int) 'a', (int) (byte) -1);
        statisticalBarRenderer0.setBaseItemLabelFont(font40);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator42 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator42);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer44 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition46 = null;
        statisticalBarRenderer44.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition46, false);
        java.util.EventListener eventListener49 = null;
        boolean boolean50 = statisticalBarRenderer44.hasListener(eventListener49);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator52 = null;
        statisticalBarRenderer44.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator52);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator55 = statisticalBarRenderer44.getSeriesItemLabelGenerator(0);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer56 = null;
        statisticalBarRenderer44.setGradientPaintTransformer(gradientPaintTransformer56);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator58 = statisticalBarRenderer44.getLegendItemLabelGenerator();
        statisticalBarRenderer44.setMinimumBarLength(2.0d);
        statisticalBarRenderer44.setBaseCreateEntities(false);
        java.awt.Stroke stroke65 = statisticalBarRenderer44.getItemStroke((int) ' ', (int) (byte) 10);
        java.awt.Stroke stroke67 = statisticalBarRenderer44.lookupSeriesStroke((int) (byte) 1);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke67);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0d + "'", double3 == 2.0d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(stroke8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNull(boolean24);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(itemLabelPosition30);
        org.junit.Assert.assertNotNull(itemLabelPosition32);
        org.junit.Assert.assertNotNull(font40);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator55);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator58);
        org.junit.Assert.assertNotNull(stroke65);
        org.junit.Assert.assertNotNull(stroke67);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke(1, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = null;
        statisticalBarRenderer8.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition10, false);
        java.awt.Stroke stroke15 = statisticalBarRenderer8.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer8.setSeriesShape((int) (short) 1, shape17);
        statisticalBarRenderer0.setBaseShape(shape17, false);
        org.jfree.chart.LegendItemCollection legendItemCollection21 = statisticalBarRenderer0.getLegendItems();
        java.awt.Graphics2D graphics2D22 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = null;
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.plot.Marker marker25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D22, categoryPlot23, valueAxis24, marker25, rectangle2D26);
        double double28 = statisticalBarRenderer0.getUpperClip();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator29 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator29, true);
        statisticalBarRenderer0.setMinimumBarLength((double) 1.0f);
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(legendItemCollection21);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setSeriesPaint(0, paint4);
        java.lang.Object obj6 = null;
        boolean boolean7 = statisticalBarRenderer0.equals(obj6);
        java.awt.Shape shape10 = statisticalBarRenderer0.getItemShape((int) (byte) 1, (int) (short) -1);
        statisticalBarRenderer0.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = null;
        statisticalBarRenderer15.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition17, false);
        java.awt.Paint paint21 = statisticalBarRenderer15.getSeriesFillPaint((int) (byte) 0);
        boolean boolean24 = statisticalBarRenderer15.getItemCreateEntity((int) '4', (int) 'a');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator26 = statisticalBarRenderer15.getSeriesToolTipGenerator((int) (short) 10);
        boolean boolean28 = statisticalBarRenderer15.isSeriesItemLabelsVisible((int) (short) -1);
        statisticalBarRenderer15.setItemMargin((double) (short) 1);
        org.jfree.chart.LegendItemCollection legendItemCollection31 = statisticalBarRenderer15.getLegendItems();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer33 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer33.setBaseOutlinePaint(paint34);
        boolean boolean36 = statisticalBarRenderer33.isDrawBarOutline();
        statisticalBarRenderer33.setMaximumBarWidth((double) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator40 = statisticalBarRenderer33.getSeriesToolTipGenerator((-1));
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer42 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer42.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot46 = statisticalBarRenderer42.getPlot();
        java.awt.Stroke stroke49 = statisticalBarRenderer42.getItemOutlineStroke(1, 100);
        statisticalBarRenderer33.setSeriesOutlineStroke((int) (short) 0, stroke49);
        statisticalBarRenderer15.setSeriesStroke((int) (short) 1, stroke49, false);
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesOutlineStroke((-1), stroke49, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(categoryToolTipGenerator26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(legendItemCollection31);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator40);
        org.junit.Assert.assertNull(categoryPlot46);
        org.junit.Assert.assertNotNull(stroke49);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer0.setSeriesStroke((int) (short) 100, stroke7);
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        java.awt.Paint paint12 = statisticalBarRenderer0.lookupSeriesFillPaint((int) 'a');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer13.setBaseOutlinePaint(paint14);
        boolean boolean16 = statisticalBarRenderer13.getAutoPopulateSeriesShape();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = statisticalBarRenderer17.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition20 = statisticalBarRenderer17.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer13.setBasePositiveItemLabelPosition(itemLabelPosition20);
        statisticalBarRenderer13.setAutoPopulateSeriesShape(false);
        statisticalBarRenderer13.setBaseCreateEntities(false);
        statisticalBarRenderer13.setSeriesVisible(1, (java.lang.Boolean) true, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator30 = statisticalBarRenderer13.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator32 = null;
        statisticalBarRenderer13.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator32);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = statisticalBarRenderer13.getBasePositiveItemLabelPosition();
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition34);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition39 = null;
        statisticalBarRenderer37.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition39, false);
        java.awt.Stroke stroke44 = statisticalBarRenderer37.getItemOutlineStroke((int) (byte) 0, 0);
        java.lang.Boolean boolean46 = statisticalBarRenderer37.getSeriesVisible((int) (byte) 0);
        statisticalBarRenderer37.setAutoPopulateSeriesPaint(true);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer49 = statisticalBarRenderer37.getGradientPaintTransformer();
        java.awt.Stroke stroke51 = statisticalBarRenderer37.lookupSeriesStroke((int) 'a');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer52 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition54 = null;
        statisticalBarRenderer52.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition54, false);
        java.awt.Stroke stroke59 = statisticalBarRenderer52.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Stroke stroke61 = statisticalBarRenderer52.lookupSeriesOutlineStroke((int) (byte) -1);
        java.awt.Stroke stroke63 = statisticalBarRenderer52.getSeriesOutlineStroke((int) (byte) 0);
        statisticalBarRenderer52.setItemLabelAnchorOffset(0.2d);
        boolean boolean66 = statisticalBarRenderer52.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition68 = statisticalBarRenderer52.getSeriesNegativeItemLabelPosition((int) (short) 0);
        statisticalBarRenderer37.setNegativeItemLabelPositionFallback(itemLabelPosition68);
        statisticalBarRenderer0.setSeriesNegativeItemLabelPosition(1, itemLabelPosition68, true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(itemLabelPosition10);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(itemLabelPosition18);
        org.junit.Assert.assertNotNull(itemLabelPosition20);
        org.junit.Assert.assertNull(categoryToolTipGenerator30);
        org.junit.Assert.assertNotNull(itemLabelPosition34);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNull(boolean46);
        org.junit.Assert.assertNotNull(gradientPaintTransformer49);
        org.junit.Assert.assertNotNull(stroke51);
        org.junit.Assert.assertNotNull(stroke59);
        org.junit.Assert.assertNotNull(stroke61);
        org.junit.Assert.assertNull(stroke63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition68);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        double double6 = statisticalBarRenderer0.getItemMargin();
        java.awt.Shape shape8 = statisticalBarRenderer0.getSeriesShape((int) ' ');
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer9 = null;
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer9);
        org.jfree.chart.LegendItem legendItem13 = statisticalBarRenderer0.getLegendItem(0, (int) (short) 10);
        boolean boolean14 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = null;
        statisticalBarRenderer16.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition18, false);
        java.awt.Paint paint21 = statisticalBarRenderer16.getBaseItemLabelPaint();
        java.awt.Paint paint23 = statisticalBarRenderer16.getSeriesPaint((-1));
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = statisticalBarRenderer16.getPositiveItemLabelPosition((int) 'a', (int) (short) 0);
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (byte) 1, itemLabelPosition26);
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertNull(legendItem13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertNotNull(itemLabelPosition26);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        statisticalBarRenderer0.setMaximumBarWidth((double) (short) 100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition(10);
        double double8 = statisticalBarRenderer0.getLowerClip();
        java.awt.Paint paint11 = statisticalBarRenderer0.getItemFillPaint(1, 0);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setSeriesPaint(0, paint4);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (byte) 1, categoryURLGenerator7, true);
        java.lang.Boolean boolean11 = statisticalBarRenderer0.getSeriesVisible((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = statisticalBarRenderer12.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer12.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer12.setSeriesShape((int) ' ', shape19, false);
        statisticalBarRenderer12.setMaximumBarWidth((double) 10.0f);
        statisticalBarRenderer12.setBaseItemLabelsVisible(true, false);
        boolean boolean27 = statisticalBarRenderer12.getAutoPopulateSeriesOutlinePaint();
        java.awt.Paint paint29 = statisticalBarRenderer12.lookupSeriesFillPaint((int) (short) 0);
        statisticalBarRenderer12.setBaseSeriesVisibleInLegend(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer33 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer33.setBaseOutlinePaint(paint34);
        boolean boolean36 = statisticalBarRenderer33.isDrawBarOutline();
        statisticalBarRenderer33.setMaximumBarWidth((double) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator40 = statisticalBarRenderer33.getSeriesToolTipGenerator((-1));
        statisticalBarRenderer33.setSeriesVisible((int) (short) 10, (java.lang.Boolean) true);
        boolean boolean44 = statisticalBarRenderer33.getBaseItemLabelsVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator46 = statisticalBarRenderer33.getSeriesItemLabelGenerator((int) (short) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer47 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition49 = null;
        statisticalBarRenderer47.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition49, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator52 = statisticalBarRenderer47.getLegendItemToolTipGenerator();
        java.awt.Paint paint53 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer47.setErrorIndicatorPaint(paint53);
        statisticalBarRenderer33.setErrorIndicatorPaint(paint53);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer57 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition59 = null;
        statisticalBarRenderer57.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition59, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator62 = statisticalBarRenderer57.getLegendItemToolTipGenerator();
        double double63 = statisticalBarRenderer57.getItemMargin();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator64 = null;
        statisticalBarRenderer57.setBaseToolTipGenerator(categoryToolTipGenerator64);
        java.awt.Stroke stroke67 = statisticalBarRenderer57.lookupSeriesOutlineStroke((int) 'a');
        statisticalBarRenderer33.setSeriesStroke((int) (short) 10, stroke67, true);
        statisticalBarRenderer12.setSeriesStroke((int) (byte) 100, stroke67);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke67, false);
        java.awt.Paint paint74 = null;
        statisticalBarRenderer0.setSeriesFillPaint(100, paint74);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator76 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(itemLabelPosition13);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator46);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator52);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator62);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.2d + "'", double63 == 0.2d);
        org.junit.Assert.assertNotNull(stroke67);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator76);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        statisticalBarRenderer0.setDrawBarOutline(false);
        java.awt.Stroke stroke7 = null;
        statisticalBarRenderer0.setSeriesOutlineStroke((int) (short) 0, stroke7, true);
        java.awt.Paint paint12 = statisticalBarRenderer0.getItemPaint(10, (-1));
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = statisticalBarRenderer0.getURLGenerator((int) (short) -1, 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = null;
        statisticalBarRenderer16.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition18, false);
        java.awt.Stroke stroke23 = statisticalBarRenderer16.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer16.setSeriesShape((int) (short) 1, shape25);
        java.lang.Boolean boolean28 = statisticalBarRenderer16.getSeriesVisible((int) (byte) 0);
        statisticalBarRenderer16.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition32 = statisticalBarRenderer31.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = statisticalBarRenderer31.getSeriesPositiveItemLabelPosition((int) '#');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer36 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint37 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer36.setBaseOutlinePaint(paint37);
        java.awt.Paint paint40 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer36.setSeriesPaint(0, paint40);
        java.lang.Object obj42 = null;
        boolean boolean43 = statisticalBarRenderer36.equals(obj42);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer45 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition47 = null;
        statisticalBarRenderer45.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition47, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator50 = statisticalBarRenderer45.getLegendItemToolTipGenerator();
        java.awt.Paint paint51 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer45.setErrorIndicatorPaint(paint51);
        statisticalBarRenderer36.setSeriesPaint(10, paint51);
        statisticalBarRenderer31.setSeriesPaint((int) (byte) 10, paint51);
        statisticalBarRenderer16.setBaseItemLabelPaint(paint51);
        statisticalBarRenderer0.setBaseOutlinePaint(paint51);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition61 = statisticalBarRenderer0.getPositiveItemLabelPosition((int) (short) 0, (int) '4');
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(categoryURLGenerator15);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNull(boolean28);
        org.junit.Assert.assertNull(itemLabelPosition32);
        org.junit.Assert.assertNotNull(itemLabelPosition34);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator50);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(itemLabelPosition61);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = statisticalBarRenderer0.getSeriesURLGenerator((int) (byte) -1);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.lookupSeriesOutlineStroke(100);
        java.awt.Font font8 = statisticalBarRenderer0.getBaseItemLabelFont();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = null;
        statisticalBarRenderer10.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition12, false);
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = statisticalBarRenderer10.hasListener(eventListener15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator18 = null;
        statisticalBarRenderer10.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator18);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = statisticalBarRenderer10.getSeriesItemLabelGenerator(0);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer22 = null;
        statisticalBarRenderer10.setGradientPaintTransformer(gradientPaintTransformer22);
        java.awt.Paint paint25 = statisticalBarRenderer10.lookupSeriesPaint((int) ' ');
        java.awt.Paint paint28 = statisticalBarRenderer10.getItemPaint(0, (int) (short) -1);
        statisticalBarRenderer0.setSeriesItemLabelPaint((int) '#', paint28, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation31 = null;
        boolean boolean32 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation31);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(categoryURLGenerator5);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator21);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        boolean boolean4 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        int int5 = statisticalBarRenderer0.getColumnCount();
        double double6 = statisticalBarRenderer0.getItemMargin();
        java.awt.Shape shape9 = statisticalBarRenderer0.getItemShape(1, (int) (byte) 10);
        boolean boolean10 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = null;
        statisticalBarRenderer12.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition14, false);
        java.awt.Stroke stroke19 = statisticalBarRenderer12.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = statisticalBarRenderer12.getPlot();
        java.awt.Paint paint21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer12.setBaseItemLabelPaint(paint21);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = null;
        statisticalBarRenderer23.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition25, false);
        java.awt.Stroke stroke30 = statisticalBarRenderer23.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Stroke stroke32 = statisticalBarRenderer23.lookupSeriesOutlineStroke((int) (byte) -1);
        java.awt.Stroke stroke34 = statisticalBarRenderer23.getSeriesOutlineStroke((int) (byte) 0);
        java.awt.Font font35 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer23.setBaseItemLabelFont(font35, false);
        statisticalBarRenderer12.setBaseItemLabelFont(font35, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition41 = statisticalBarRenderer12.getSeriesNegativeItemLabelPosition(100);
        statisticalBarRenderer0.setSeriesNegativeItemLabelPosition((int) '#', itemLabelPosition41, false);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNull(categoryPlot20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNull(stroke34);
        org.junit.Assert.assertNotNull(font35);
        org.junit.Assert.assertNotNull(itemLabelPosition41);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer9.setBaseOutlinePaint(paint10);
        statisticalBarRenderer0.setSeriesPaint((int) 'a', paint10, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = statisticalBarRenderer0.getPlot();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(false);
        boolean boolean17 = statisticalBarRenderer0.getBaseCreateEntities();
        boolean boolean20 = statisticalBarRenderer0.getItemVisible((int) (byte) 1, 1);
        java.awt.Graphics2D graphics2D21 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = null;
        org.jfree.chart.plot.CategoryMarker categoryMarker24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawDomainMarker(graphics2D21, categoryPlot22, categoryAxis23, categoryMarker24, rectangle2D25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(categoryPlot14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        statisticalBarRenderer0.setDrawBarOutline(false);
        java.awt.Stroke stroke7 = null;
        statisticalBarRenderer0.setSeriesOutlineStroke((int) (short) 0, stroke7, true);
        java.awt.Paint paint12 = statisticalBarRenderer0.getItemPaint(10, (-1));
        java.awt.Shape shape14 = statisticalBarRenderer0.getSeriesShape((int) (short) 100);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation15 = null;
        boolean boolean16 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation15);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        boolean boolean18 = statisticalBarRenderer0.getBaseCreateEntities();
        boolean boolean20 = statisticalBarRenderer0.isSeriesVisibleInLegend(0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = statisticalBarRenderer21.getNegativeItemLabelPositionFallback();
        boolean boolean25 = statisticalBarRenderer21.getItemVisible((int) (byte) 100, (int) (byte) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = statisticalBarRenderer21.getDrawingSupplier();
        boolean boolean27 = statisticalBarRenderer21.getIncludeBaseInRange();
        java.awt.Stroke stroke28 = statisticalBarRenderer21.getErrorIndicatorStroke();
        statisticalBarRenderer0.setBaseOutlineStroke(stroke28, false);
        java.lang.Object obj31 = statisticalBarRenderer0.clone();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(itemLabelPosition22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(drawingSupplier26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(obj31);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        java.awt.Paint paint6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint6, true);
        double double9 = statisticalBarRenderer0.getLowerClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = statisticalBarRenderer11.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = statisticalBarRenderer11.getSeriesPositiveItemLabelPosition((int) '#');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer16.setBaseOutlinePaint(paint17);
        java.awt.Paint paint20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer16.setSeriesPaint(0, paint20);
        java.lang.Object obj22 = null;
        boolean boolean23 = statisticalBarRenderer16.equals(obj22);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition27 = null;
        statisticalBarRenderer25.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition27, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator30 = statisticalBarRenderer25.getLegendItemToolTipGenerator();
        java.awt.Paint paint31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer25.setErrorIndicatorPaint(paint31);
        statisticalBarRenderer16.setSeriesPaint(10, paint31);
        statisticalBarRenderer11.setSeriesPaint((int) (byte) 10, paint31);
        statisticalBarRenderer0.setSeriesItemLabelPaint(0, paint31, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer38 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer38.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot42 = statisticalBarRenderer38.getPlot();
        java.awt.Stroke stroke45 = statisticalBarRenderer38.getItemOutlineStroke(1, 100);
        statisticalBarRenderer0.setSeriesOutlineStroke(0, stroke45);
        double double47 = statisticalBarRenderer0.getItemMargin();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (byte) 100, (java.lang.Boolean) false);
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(itemLabelPosition12);
        org.junit.Assert.assertNotNull(itemLabelPosition14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator30);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNull(categoryPlot42);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.2d + "'", double47 == 0.2d);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = statisticalBarRenderer0.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) 'a');
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) (short) -1);
        java.awt.Font font14 = statisticalBarRenderer0.getSeriesItemLabelFont((int) (byte) 100);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator16 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (short) 10, categoryItemLabelGenerator16);
        int int18 = statisticalBarRenderer0.getRowCount();
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(categoryPlot8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
        org.junit.Assert.assertNull(font14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Stroke stroke4 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer5 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = null;
        statisticalBarRenderer5.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition7, false);
        java.awt.Paint paint10 = statisticalBarRenderer5.getBaseItemLabelPaint();
        statisticalBarRenderer5.setBaseCreateEntities(false, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer5.getLegendItemURLGenerator();
        java.awt.Stroke stroke16 = statisticalBarRenderer5.lookupSeriesOutlineStroke(0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator17 = null;
        statisticalBarRenderer5.setBaseItemLabelGenerator(categoryItemLabelGenerator17);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = null;
        statisticalBarRenderer20.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition22, false);
        java.awt.Stroke stroke27 = statisticalBarRenderer20.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Stroke stroke29 = statisticalBarRenderer20.lookupSeriesOutlineStroke((int) (byte) -1);
        java.awt.Font font32 = statisticalBarRenderer20.getItemLabelFont((int) (short) 0, 10);
        statisticalBarRenderer5.setSeriesItemLabelFont((int) (short) 1, font32, false);
        statisticalBarRenderer0.setBaseItemLabelFont(font32);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(font32);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setSeriesPaint(0, paint4);
        java.lang.Object obj6 = null;
        boolean boolean7 = statisticalBarRenderer0.equals(obj6);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = null;
        statisticalBarRenderer9.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition11, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer9.getLegendItemToolTipGenerator();
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer9.setErrorIndicatorPaint(paint15);
        statisticalBarRenderer0.setSeriesPaint(10, paint15);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = null;
        statisticalBarRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator18);
        java.awt.Paint paint21 = statisticalBarRenderer0.lookupSeriesPaint(1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer22.setBaseOutlinePaint(paint23);
        boolean boolean25 = statisticalBarRenderer22.isDrawBarOutline();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator26 = null;
        statisticalBarRenderer22.setBaseURLGenerator(categoryURLGenerator26);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer28 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint29 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer28.setBaseOutlinePaint(paint29);
        boolean boolean31 = statisticalBarRenderer28.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer32 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = null;
        statisticalBarRenderer32.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition34, false);
        java.util.EventListener eventListener37 = null;
        boolean boolean38 = statisticalBarRenderer32.hasListener(eventListener37);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = null;
        statisticalBarRenderer32.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator40);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator43 = statisticalBarRenderer32.getSeriesItemLabelGenerator(0);
        java.awt.Font font44 = statisticalBarRenderer32.getBaseItemLabelFont();
        statisticalBarRenderer28.setBaseItemLabelFont(font44);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator47 = null;
        statisticalBarRenderer28.setSeriesItemLabelGenerator((int) (byte) 1, categoryItemLabelGenerator47);
        java.awt.Shape shape50 = statisticalBarRenderer28.lookupSeriesShape((int) (short) 0);
        java.awt.Shape shape51 = statisticalBarRenderer28.getBaseShape();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer52 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint53 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer52.setBaseOutlinePaint(paint53);
        boolean boolean55 = statisticalBarRenderer52.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer56 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition58 = null;
        statisticalBarRenderer56.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition58, false);
        java.util.EventListener eventListener61 = null;
        boolean boolean62 = statisticalBarRenderer56.hasListener(eventListener61);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator64 = null;
        statisticalBarRenderer56.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator64);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator67 = statisticalBarRenderer56.getSeriesItemLabelGenerator(0);
        java.awt.Font font68 = statisticalBarRenderer56.getBaseItemLabelFont();
        statisticalBarRenderer52.setBaseItemLabelFont(font68);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator71 = null;
        statisticalBarRenderer52.setSeriesItemLabelGenerator((int) (byte) 1, categoryItemLabelGenerator71);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer73 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition74 = statisticalBarRenderer73.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition76 = statisticalBarRenderer73.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer52.setNegativeItemLabelPositionFallback(itemLabelPosition76);
        statisticalBarRenderer28.setNegativeItemLabelPositionFallback(itemLabelPosition76);
        statisticalBarRenderer22.setPositiveItemLabelPositionFallback(itemLabelPosition76);
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition76);
        java.awt.Shape shape83 = statisticalBarRenderer0.getItemShape((int) (byte) 100, (int) (byte) 0);
        statisticalBarRenderer0.setBaseSeriesVisible(true, false);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator43);
        org.junit.Assert.assertNotNull(font44);
        org.junit.Assert.assertNotNull(shape50);
        org.junit.Assert.assertNotNull(shape51);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator67);
        org.junit.Assert.assertNotNull(font68);
        org.junit.Assert.assertNull(itemLabelPosition74);
        org.junit.Assert.assertNotNull(itemLabelPosition76);
        org.junit.Assert.assertNotNull(shape83);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition5 = statisticalBarRenderer0.getBaseNegativeItemLabelPosition();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = null;
        statisticalBarRenderer6.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition8, false);
        java.awt.Stroke stroke13 = statisticalBarRenderer6.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = statisticalBarRenderer6.getPlot();
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer6.setBaseItemLabelPaint(paint15);
        statisticalBarRenderer0.setBaseOutlinePaint(paint15, true);
        statisticalBarRenderer0.setBaseCreateEntities(false, false);
        org.junit.Assert.assertNotNull(itemLabelPosition5);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNull(categoryPlot14);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer4 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition6 = null;
        statisticalBarRenderer4.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition6, false);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = statisticalBarRenderer4.hasListener(eventListener9);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = null;
        statisticalBarRenderer4.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator12);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = statisticalBarRenderer4.getSeriesItemLabelGenerator(0);
        java.awt.Font font16 = statisticalBarRenderer4.getBaseItemLabelFont();
        statisticalBarRenderer0.setBaseItemLabelFont(font16);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (byte) 1, categoryItemLabelGenerator19);
        java.awt.Shape shape22 = statisticalBarRenderer0.lookupSeriesShape((int) (short) 0);
        java.awt.Shape shape23 = statisticalBarRenderer0.getBaseShape();
        java.awt.Paint paint24 = statisticalBarRenderer0.getBaseItemLabelPaint();
        double double25 = statisticalBarRenderer0.getUpperClip();
        java.awt.Graphics2D graphics2D26 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = null;
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.plot.Marker marker29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D26, categoryPlot27, valueAxis28, marker29, rectangle2D30);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator34 = statisticalBarRenderer0.getItemLabelGenerator((int) (short) 0, (int) (short) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer35 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition37 = null;
        statisticalBarRenderer35.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition37, false);
        java.util.EventListener eventListener40 = null;
        boolean boolean41 = statisticalBarRenderer35.hasListener(eventListener40);
        boolean boolean42 = statisticalBarRenderer35.getAutoPopulateSeriesFillPaint();
        double double43 = statisticalBarRenderer35.getItemLabelAnchorOffset();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer44 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition46 = null;
        statisticalBarRenderer44.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition46, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition49 = statisticalBarRenderer44.getBaseNegativeItemLabelPosition();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer50 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition52 = null;
        statisticalBarRenderer50.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition52, false);
        java.awt.Stroke stroke57 = statisticalBarRenderer50.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot58 = statisticalBarRenderer50.getPlot();
        java.awt.Paint paint59 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer50.setBaseItemLabelPaint(paint59);
        statisticalBarRenderer44.setBaseOutlinePaint(paint59, true);
        statisticalBarRenderer35.setBasePaint(paint59);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint59, true);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNull(categoryItemLabelGenerator34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 2.0d + "'", double43 == 2.0d);
        org.junit.Assert.assertNotNull(itemLabelPosition49);
        org.junit.Assert.assertNotNull(stroke57);
        org.junit.Assert.assertNull(categoryPlot58);
        org.junit.Assert.assertNotNull(paint59);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) (short) 1, shape9);
        java.lang.Boolean boolean12 = statisticalBarRenderer0.getSeriesVisible((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer13.setBaseOutlinePaint(paint14);
        boolean boolean16 = statisticalBarRenderer13.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = statisticalBarRenderer17.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition20 = statisticalBarRenderer17.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer13.setBasePositiveItemLabelPosition(itemLabelPosition20);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition20);
        java.awt.Paint paint25 = statisticalBarRenderer0.getItemPaint(10, (int) (short) -1);
        java.awt.Shape shape26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setBaseShape(shape26, false);
        statisticalBarRenderer0.setBaseCreateEntities(false);
        statisticalBarRenderer0.setSeriesVisibleInLegend(0, (java.lang.Boolean) false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator35 = statisticalBarRenderer0.getBaseURLGenerator();
        java.awt.Stroke stroke36 = statisticalBarRenderer0.getBaseOutlineStroke();
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(itemLabelPosition18);
        org.junit.Assert.assertNotNull(itemLabelPosition20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNull(categoryURLGenerator35);
        org.junit.Assert.assertNotNull(stroke36);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer0.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) ' ', shape7, false);
        statisticalBarRenderer0.setMaximumBarWidth((double) 10.0f);
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = null;
        statisticalBarRenderer16.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition18, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator21 = statisticalBarRenderer16.getLegendItemToolTipGenerator();
        java.awt.Stroke stroke23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer16.setSeriesStroke((int) (short) 100, stroke23);
        statisticalBarRenderer16.setBaseItemLabelsVisible(false);
        boolean boolean29 = statisticalBarRenderer16.isItemLabelVisible((int) (byte) 1, (int) 'a');
        statisticalBarRenderer16.setSeriesItemLabelsVisible(0, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer33 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer33.setBaseOutlinePaint(paint34);
        boolean boolean36 = statisticalBarRenderer33.isDrawBarOutline();
        statisticalBarRenderer33.setMaximumBarWidth((double) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator40 = statisticalBarRenderer33.getSeriesToolTipGenerator((-1));
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition43 = statisticalBarRenderer33.getNegativeItemLabelPosition(100, (int) (short) -1);
        statisticalBarRenderer16.setBasePositiveItemLabelPosition(itemLabelPosition43);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer45 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint46 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer45.setBaseOutlinePaint(paint46);
        java.awt.Paint paint49 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer45.setSeriesPaint(0, paint49);
        java.lang.Object obj51 = null;
        boolean boolean52 = statisticalBarRenderer45.equals(obj51);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer54 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition56 = null;
        statisticalBarRenderer54.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition56, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator59 = statisticalBarRenderer54.getLegendItemToolTipGenerator();
        java.awt.Paint paint60 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer54.setErrorIndicatorPaint(paint60);
        statisticalBarRenderer45.setSeriesPaint(10, paint60);
        statisticalBarRenderer16.setBasePaint(paint60, true);
        java.awt.Paint paint65 = statisticalBarRenderer16.getBaseOutlinePaint();
        statisticalBarRenderer0.setSeriesPaint(1, paint65);
        org.jfree.chart.LegendItemCollection legendItemCollection67 = statisticalBarRenderer0.getLegendItems();
        org.jfree.chart.LegendItemCollection legendItemCollection68 = statisticalBarRenderer0.getLegendItems();
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator40);
        org.junit.Assert.assertNotNull(itemLabelPosition43);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator59);
        org.junit.Assert.assertNotNull(paint60);
        org.junit.Assert.assertNotNull(paint65);
        org.junit.Assert.assertNotNull(legendItemCollection67);
        org.junit.Assert.assertNotNull(legendItemCollection68);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke(1, 100);
        statisticalBarRenderer0.setItemMargin(3.0d);
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint((int) (short) 10, paint11);
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (short) 0, (java.lang.Boolean) false, true);
        java.awt.Shape shape17 = statisticalBarRenderer0.getBaseShape();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition((int) (byte) 10);
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(itemLabelPosition19);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = statisticalBarRenderer0.getPlot();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer10.setBaseOutlinePaint(paint11);
        boolean boolean13 = statisticalBarRenderer10.getAutoPopulateSeriesShape();
        java.awt.Paint paint15 = statisticalBarRenderer10.lookupSeriesPaint((int) (short) 0);
        statisticalBarRenderer0.setSeriesPaint((int) (short) 0, paint15);
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(false);
        java.lang.Boolean boolean20 = statisticalBarRenderer0.getSeriesCreateEntities((int) ' ');
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) '#', false);
        statisticalBarRenderer0.removeAnnotations();
        statisticalBarRenderer0.setAutoPopulateSeriesShape(true);
        java.awt.Paint paint29 = statisticalBarRenderer0.getItemLabelPaint((int) (short) 10, (int) (short) 100);
        java.awt.Stroke stroke30 = statisticalBarRenderer0.getErrorIndicatorStroke();
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(categoryPlot8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNotNull(stroke30);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) '#');
        boolean boolean4 = statisticalBarRenderer0.getBaseSeriesVisible();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition5 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        java.awt.Paint paint6 = statisticalBarRenderer0.getBaseFillPaint();
        double double7 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        statisticalBarRenderer0.setSeriesURLGenerator(100, categoryURLGenerator9, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Paint paint13 = statisticalBarRenderer0.getBaseFillPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = null;
        statisticalBarRenderer15.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition17, false);
        int int20 = statisticalBarRenderer15.getRowCount();
        java.awt.Paint paint22 = statisticalBarRenderer15.getSeriesFillPaint((int) (byte) 100);
        java.awt.Paint paint24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer15.setSeriesOutlinePaint((int) (short) 100, paint24, false);
        statisticalBarRenderer0.setSeriesOutlinePaint(100, paint24, false);
        java.lang.Object obj29 = statisticalBarRenderer0.clone();
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNotNull(itemLabelPosition3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(itemLabelPosition5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0d + "'", double7 == 2.0d);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(obj29);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        java.awt.Paint paint6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setErrorIndicatorPaint(paint6);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        statisticalBarRenderer0.setSeriesURLGenerator(0, categoryURLGenerator9);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getBasePositiveItemLabelPosition();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Paint paint14 = statisticalBarRenderer0.getErrorIndicatorPaint();
        double double15 = statisticalBarRenderer0.getBase();
        boolean boolean18 = statisticalBarRenderer0.getItemVisible((int) (byte) -1, (int) 'a');
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        java.awt.Paint paint6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setErrorIndicatorPaint(paint6);
        java.awt.Stroke stroke8 = statisticalBarRenderer0.getBaseOutlineStroke();
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false, true);
        boolean boolean13 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) '#');
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer14 = statisticalBarRenderer0.getGradientPaintTransformer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = statisticalBarRenderer0.getNegativeItemLabelPosition((int) (short) 0, (int) (short) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer18.setBaseOutlinePaint(paint19);
        boolean boolean21 = statisticalBarRenderer18.isDrawBarOutline();
        statisticalBarRenderer18.setDrawBarOutline(false);
        java.awt.Stroke stroke25 = null;
        statisticalBarRenderer18.setSeriesOutlineStroke((int) (short) 0, stroke25, true);
        java.awt.Paint paint30 = statisticalBarRenderer18.getItemPaint(10, (-1));
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator33 = statisticalBarRenderer18.getURLGenerator((int) (short) -1, 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer34 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition36 = null;
        statisticalBarRenderer34.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition36, false);
        java.awt.Stroke stroke41 = statisticalBarRenderer34.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape43 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer34.setSeriesShape((int) (short) 1, shape43);
        java.lang.Boolean boolean46 = statisticalBarRenderer34.getSeriesVisible((int) (byte) 0);
        statisticalBarRenderer34.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer49 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition50 = statisticalBarRenderer49.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition52 = statisticalBarRenderer49.getSeriesPositiveItemLabelPosition((int) '#');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer54 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint55 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer54.setBaseOutlinePaint(paint55);
        java.awt.Paint paint58 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer54.setSeriesPaint(0, paint58);
        java.lang.Object obj60 = null;
        boolean boolean61 = statisticalBarRenderer54.equals(obj60);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer63 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition65 = null;
        statisticalBarRenderer63.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition65, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator68 = statisticalBarRenderer63.getLegendItemToolTipGenerator();
        java.awt.Paint paint69 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer63.setErrorIndicatorPaint(paint69);
        statisticalBarRenderer54.setSeriesPaint(10, paint69);
        statisticalBarRenderer49.setSeriesPaint((int) (byte) 10, paint69);
        statisticalBarRenderer34.setBaseItemLabelPaint(paint69);
        statisticalBarRenderer18.setBaseOutlinePaint(paint69);
        statisticalBarRenderer18.setBaseSeriesVisibleInLegend(true);
        java.awt.Paint paint77 = statisticalBarRenderer18.getBasePaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer78 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer78.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        java.awt.Paint paint82 = statisticalBarRenderer78.getBaseFillPaint();
        statisticalBarRenderer18.setBasePaint(paint82, false);
        statisticalBarRenderer0.setBaseOutlinePaint(paint82, true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(gradientPaintTransformer14);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNull(categoryURLGenerator33);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(shape43);
        org.junit.Assert.assertNull(boolean46);
        org.junit.Assert.assertNull(itemLabelPosition50);
        org.junit.Assert.assertNotNull(itemLabelPosition52);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator68);
        org.junit.Assert.assertNotNull(paint69);
        org.junit.Assert.assertNotNull(paint77);
        org.junit.Assert.assertNotNull(paint82);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Stroke stroke9 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) (byte) -1);
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 0);
        java.awt.Font font12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font12, false);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 10, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer20.setBaseOutlinePaint(paint21);
        java.awt.Paint paint24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer20.setSeriesPaint(0, paint24);
        java.lang.Object obj26 = null;
        boolean boolean27 = statisticalBarRenderer20.equals(obj26);
        java.awt.Shape shape30 = statisticalBarRenderer20.getItemShape((int) (byte) 1, (int) (short) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer31.setBaseOutlinePaint(paint32);
        java.awt.Paint paint35 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer31.setSeriesPaint(0, paint35);
        java.lang.Object obj37 = null;
        boolean boolean38 = statisticalBarRenderer31.equals(obj37);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer40 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition42 = null;
        statisticalBarRenderer40.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition42, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator45 = statisticalBarRenderer40.getLegendItemToolTipGenerator();
        java.awt.Paint paint46 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer40.setErrorIndicatorPaint(paint46);
        statisticalBarRenderer31.setSeriesPaint(10, paint46);
        statisticalBarRenderer31.setBaseSeriesVisible(true);
        statisticalBarRenderer31.setIncludeBaseInRange(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer53 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer53.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot57 = statisticalBarRenderer53.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition59 = statisticalBarRenderer53.getSeriesNegativeItemLabelPosition(100);
        statisticalBarRenderer31.setBaseNegativeItemLabelPosition(itemLabelPosition59, true);
        statisticalBarRenderer20.setNegativeItemLabelPositionFallback(itemLabelPosition59);
        boolean boolean63 = statisticalBarRenderer20.getAutoPopulateSeriesOutlineStroke();
        double double64 = statisticalBarRenderer20.getMinimumBarLength();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator65 = statisticalBarRenderer20.getLegendItemLabelGenerator();
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator65);
        boolean boolean67 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation68 = null;
        boolean boolean69 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation68);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(stroke11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator45);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNull(categoryPlot57);
        org.junit.Assert.assertNotNull(itemLabelPosition59);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = statisticalBarRenderer0.hasListener(eventListener5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = statisticalBarRenderer0.getSeriesItemLabelGenerator(0);
        java.awt.Font font12 = statisticalBarRenderer0.getBaseItemLabelFont();
        java.awt.Shape shape14 = statisticalBarRenderer0.getSeriesShape((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNull(shape14);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setSeriesPaint(0, paint4);
        java.lang.Object obj6 = null;
        boolean boolean7 = statisticalBarRenderer0.equals(obj6);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = null;
        statisticalBarRenderer9.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition11, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer9.getLegendItemToolTipGenerator();
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer9.setErrorIndicatorPaint(paint15);
        statisticalBarRenderer0.setSeriesPaint(10, paint15);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = null;
        statisticalBarRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator18);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = statisticalBarRenderer0.getURLGenerator((int) '4', (int) (short) -1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = null;
        statisticalBarRenderer0.setSeriesNegativeItemLabelPosition((int) (byte) 10, itemLabelPosition24, true);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryURLGenerator22);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Paint paint6 = statisticalBarRenderer0.getSeriesFillPaint((int) (byte) 0);
        boolean boolean9 = statisticalBarRenderer0.getItemCreateEntity((int) '4', (int) 'a');
        java.awt.Paint paint12 = statisticalBarRenderer0.getItemPaint(1, (int) (short) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition15 = null;
        statisticalBarRenderer13.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition15, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = statisticalBarRenderer13.getLegendItemToolTipGenerator();
        java.awt.Stroke stroke20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer13.setSeriesStroke((int) (short) 100, stroke20);
        statisticalBarRenderer13.setBaseItemLabelsVisible(false);
        boolean boolean26 = statisticalBarRenderer13.isItemLabelVisible((int) (byte) 1, (int) 'a');
        statisticalBarRenderer13.setSeriesItemLabelsVisible(0, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer30.setBaseOutlinePaint(paint31);
        boolean boolean33 = statisticalBarRenderer30.isDrawBarOutline();
        statisticalBarRenderer30.setMaximumBarWidth((double) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator37 = statisticalBarRenderer30.getSeriesToolTipGenerator((-1));
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition40 = statisticalBarRenderer30.getNegativeItemLabelPosition(100, (int) (short) -1);
        statisticalBarRenderer13.setBasePositiveItemLabelPosition(itemLabelPosition40);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer42 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint43 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer42.setBaseOutlinePaint(paint43);
        java.awt.Paint paint46 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer42.setSeriesPaint(0, paint46);
        java.lang.Object obj48 = null;
        boolean boolean49 = statisticalBarRenderer42.equals(obj48);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer51 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition53 = null;
        statisticalBarRenderer51.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition53, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator56 = statisticalBarRenderer51.getLegendItemToolTipGenerator();
        java.awt.Paint paint57 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer51.setErrorIndicatorPaint(paint57);
        statisticalBarRenderer42.setSeriesPaint(10, paint57);
        statisticalBarRenderer13.setBasePaint(paint57, true);
        statisticalBarRenderer0.setErrorIndicatorPaint(paint57);
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) 1);
        java.awt.Paint paint65 = statisticalBarRenderer0.getBasePaint();
        boolean boolean66 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        java.awt.Paint paint68 = statisticalBarRenderer0.lookupSeriesPaint(0);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator37);
        org.junit.Assert.assertNotNull(itemLabelPosition40);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator56);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertNotNull(paint65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(paint68);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = statisticalBarRenderer0.getPlot();
        java.awt.Stroke stroke9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke9);
        statisticalBarRenderer0.setSeriesCreateEntities(1, (java.lang.Boolean) true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = statisticalBarRenderer16.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer16.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer16.setSeriesShape((int) ' ', shape23, false);
        statisticalBarRenderer16.setMaximumBarWidth((double) 10.0f);
        boolean boolean30 = statisticalBarRenderer16.isItemLabelVisible(100, (int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer31.setBaseOutlinePaint(paint32);
        statisticalBarRenderer16.setBaseOutlinePaint(paint32, false);
        statisticalBarRenderer0.setSeriesPaint(0, paint32);
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer40 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer40.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot44 = statisticalBarRenderer40.getPlot();
        java.awt.Stroke stroke47 = statisticalBarRenderer40.getItemOutlineStroke(1, 100);
        statisticalBarRenderer0.setSeriesOutlineStroke((int) '4', stroke47);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(categoryPlot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(itemLabelPosition17);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNull(categoryPlot44);
        org.junit.Assert.assertNotNull(stroke47);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = statisticalBarRenderer0.hasListener(eventListener5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator8);
        java.awt.Paint paint11 = statisticalBarRenderer0.getSeriesFillPaint((int) ' ');
        java.awt.Paint paint12 = statisticalBarRenderer0.getErrorIndicatorPaint();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = null;
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.util.Layer layer17 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawAnnotations(graphics2D13, rectangle2D14, categoryAxis15, valueAxis16, layer17, plotRenderingInfo18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        double double3 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        boolean boolean6 = statisticalBarRenderer0.getItemCreateEntity((int) (byte) 0, 0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = statisticalBarRenderer0.getDrawingSupplier();
        boolean boolean10 = statisticalBarRenderer0.getItemCreateEntity((int) (byte) -1, (int) (byte) 100);
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getBaseStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer13.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = statisticalBarRenderer13.getPlot();
        statisticalBarRenderer13.setBaseCreateEntities(false, false);
        boolean boolean21 = statisticalBarRenderer13.getBaseSeriesVisible();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = statisticalBarRenderer13.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer0.setSeriesNegativeItemLabelPosition((int) '#', itemLabelPosition22, false);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0d + "'", double3 == 2.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(drawingSupplier7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(categoryPlot17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition22);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        statisticalBarRenderer0.setDrawBarOutline(false);
        java.awt.Stroke stroke7 = null;
        statisticalBarRenderer0.setSeriesOutlineStroke((int) (short) 0, stroke7, true);
        java.awt.Paint paint12 = statisticalBarRenderer0.getItemPaint(10, (-1));
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = statisticalBarRenderer0.getURLGenerator((int) (short) -1, 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator17 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (short) 10, categoryItemLabelGenerator17);
        org.jfree.chart.LegendItem legendItem21 = statisticalBarRenderer0.getLegendItem(100, (int) (short) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = statisticalBarRenderer23.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer23.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer23.setSeriesShape((int) ' ', shape30, false);
        statisticalBarRenderer23.setMaximumBarWidth((double) 10.0f);
        java.awt.Paint paint37 = statisticalBarRenderer23.getItemOutlinePaint((int) (short) -1, (int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition39 = statisticalBarRenderer23.getSeriesNegativeItemLabelPosition((int) (short) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer40 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint41 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer40.setBaseOutlinePaint(paint41);
        double double43 = statisticalBarRenderer40.getItemLabelAnchorOffset();
        statisticalBarRenderer40.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Paint paint47 = statisticalBarRenderer40.lookupSeriesOutlinePaint(0);
        statisticalBarRenderer23.setBaseFillPaint(paint47);
        statisticalBarRenderer0.setSeriesOutlinePaint((int) 'a', paint47);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(categoryURLGenerator15);
        org.junit.Assert.assertNull(legendItem21);
        org.junit.Assert.assertNull(itemLabelPosition24);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(itemLabelPosition39);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 2.0d + "'", double43 == 2.0d);
        org.junit.Assert.assertNotNull(paint47);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setSeriesPaint(0, paint4);
        java.lang.Object obj6 = null;
        boolean boolean7 = statisticalBarRenderer0.equals(obj6);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = null;
        statisticalBarRenderer9.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition11, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer9.getLegendItemToolTipGenerator();
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer9.setErrorIndicatorPaint(paint15);
        statisticalBarRenderer0.setSeriesPaint(10, paint15);
        java.awt.Font font20 = statisticalBarRenderer0.getItemLabelFont((int) (byte) -1, (int) '4');
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Paint paint23 = null;
        statisticalBarRenderer0.setSeriesItemLabelPaint(0, paint23);
        statisticalBarRenderer0.setItemMargin((double) (short) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = null;
        statisticalBarRenderer27.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition29, false);
        java.awt.Stroke stroke34 = statisticalBarRenderer27.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = statisticalBarRenderer27.getPlot();
        java.awt.Paint paint36 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer27.setBaseItemLabelPaint(paint36);
        statisticalBarRenderer0.setBaseFillPaint(paint36);
        java.lang.Object obj39 = statisticalBarRenderer0.clone();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNull(categoryItemLabelGenerator21);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNull(categoryPlot35);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNotNull(obj39);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        java.awt.Stroke stroke6 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 1);
        java.awt.Paint paint8 = statisticalBarRenderer0.lookupSeriesFillPaint(10);
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertNotNull(paint8);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        double double5 = statisticalBarRenderer0.getBase();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer6.setBaseOutlinePaint(paint7);
        boolean boolean9 = statisticalBarRenderer6.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer10.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = statisticalBarRenderer10.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer6.setBasePositiveItemLabelPosition(itemLabelPosition13);
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition13);
        java.lang.Object obj16 = statisticalBarRenderer0.clone();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(itemLabelPosition11);
        org.junit.Assert.assertNotNull(itemLabelPosition13);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = statisticalBarRenderer0.getSeriesURLGenerator((int) (byte) -1);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.lookupSeriesOutlineStroke(100);
        java.awt.Font font8 = statisticalBarRenderer0.getBaseItemLabelFont();
        java.awt.Stroke stroke10 = statisticalBarRenderer0.lookupSeriesStroke((int) (byte) 1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = statisticalBarRenderer0.getBaseURLGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator12 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator12, true);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(categoryURLGenerator5);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(categoryURLGenerator11);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Paint paint6 = statisticalBarRenderer0.getSeriesFillPaint((int) (byte) 0);
        boolean boolean9 = statisticalBarRenderer0.getItemCreateEntity((int) '4', (int) 'a');
        java.awt.Paint paint12 = statisticalBarRenderer0.getItemPaint(1, (int) (short) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer13.setBaseOutlinePaint(paint14);
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer13.setSeriesPaint(0, paint17);
        java.lang.Object obj19 = null;
        boolean boolean20 = statisticalBarRenderer13.equals(obj19);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = null;
        statisticalBarRenderer22.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition24, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator27 = statisticalBarRenderer22.getLegendItemToolTipGenerator();
        java.awt.Paint paint28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer22.setErrorIndicatorPaint(paint28);
        statisticalBarRenderer13.setSeriesPaint(10, paint28);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator31 = null;
        statisticalBarRenderer13.setLegendItemToolTipGenerator(categorySeriesLabelGenerator31);
        java.awt.Paint paint34 = statisticalBarRenderer13.lookupSeriesPaint(1);
        statisticalBarRenderer0.setBasePaint(paint34, false);
        boolean boolean39 = statisticalBarRenderer0.isItemLabelVisible((int) (byte) -1, (int) (short) 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition41 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition((int) (short) 1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true, false);
        boolean boolean47 = statisticalBarRenderer0.getIncludeBaseInRange();
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer0.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) ' ', shape7, false);
        statisticalBarRenderer0.setMaximumBarWidth((double) 10.0f);
        java.awt.Paint paint14 = statisticalBarRenderer0.getItemOutlinePaint((int) (short) -1, (int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition((int) (short) -1);
        java.awt.Paint paint18 = statisticalBarRenderer0.getSeriesOutlinePaint((int) 'a');
        statisticalBarRenderer0.setSeriesVisibleInLegend(0, (java.lang.Boolean) false, false);
        java.awt.Font font24 = statisticalBarRenderer0.getSeriesItemLabelFont(0);
        java.awt.Paint paint25 = statisticalBarRenderer0.getBaseFillPaint();
        java.awt.Shape shape26 = statisticalBarRenderer0.getBaseShape();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) '4', categoryURLGenerator28, false);
        boolean boolean32 = statisticalBarRenderer0.isSeriesVisibleInLegend(1);
        int int33 = statisticalBarRenderer0.getRowCount();
        boolean boolean34 = statisticalBarRenderer0.getBaseCreateEntities();
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
        org.junit.Assert.assertNull(paint18);
        org.junit.Assert.assertNull(font24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer0.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) ' ', shape7, false);
        statisticalBarRenderer0.setMaximumBarWidth((double) 10.0f);
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, false);
        java.awt.Stroke stroke16 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) (byte) 0);
        java.awt.Paint paint18 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (short) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(false);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(false);
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(true);
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke(1, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = null;
        statisticalBarRenderer8.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition10, false);
        java.awt.Stroke stroke15 = statisticalBarRenderer8.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer8.setSeriesShape((int) (short) 1, shape17);
        statisticalBarRenderer0.setBaseShape(shape17, false);
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation23 = null;
        boolean boolean24 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation23);
        statisticalBarRenderer0.setBase(1.0d);
        double double27 = statisticalBarRenderer0.getMinimumBarLength();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer28 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer28.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = statisticalBarRenderer28.getPlot();
        java.awt.Paint paint34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer28.setSeriesOutlinePaint(10, paint34, true);
        java.awt.Shape shape38 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer28.setSeriesShape((int) (byte) 1, shape38, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer41 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint42 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer41.setBaseOutlinePaint(paint42);
        boolean boolean44 = statisticalBarRenderer41.isDrawBarOutline();
        statisticalBarRenderer41.setMaximumBarWidth((double) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator48 = statisticalBarRenderer41.getSeriesToolTipGenerator((-1));
        double double49 = statisticalBarRenderer41.getMinimumBarLength();
        java.awt.Paint paint52 = statisticalBarRenderer41.getItemOutlinePaint((int) 'a', 10);
        statisticalBarRenderer28.setBaseOutlinePaint(paint52, true);
        statisticalBarRenderer0.setBasePaint(paint52);
        org.jfree.data.category.CategoryDataset categoryDataset56 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.data.Range range57 = statisticalBarRenderer0.findRangeBounds(categoryDataset56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNull(categoryPlot32);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertNotNull(paint52);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = statisticalBarRenderer0.getPlot();
        java.awt.Paint paint9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseItemLabelPaint(paint9);
        java.awt.Shape shape11 = statisticalBarRenderer0.getBaseShape();
        java.awt.Stroke stroke14 = statisticalBarRenderer0.getItemStroke((int) 'a', 1);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(categoryPlot8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(stroke14);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer0.setSeriesStroke((int) (short) 100, stroke7);
        java.awt.Paint paint10 = statisticalBarRenderer0.getSeriesItemLabelPaint((int) (short) 100);
        java.awt.Paint paint12 = statisticalBarRenderer0.getSeriesItemLabelPaint(1);
        java.awt.Stroke stroke14 = null;
        statisticalBarRenderer0.setSeriesOutlineStroke(10, stroke14, true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertNull(paint12);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        boolean boolean4 = statisticalBarRenderer0.getItemVisible((int) (byte) 100, (int) (byte) 1);
        statisticalBarRenderer0.setMinimumBarLength(0.0d);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition9 = statisticalBarRenderer8.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer8.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer8.setSeriesShape((int) ' ', shape15, false);
        statisticalBarRenderer8.setMaximumBarWidth((double) 10.0f);
        java.awt.Paint paint22 = statisticalBarRenderer8.getItemOutlinePaint((int) (short) -1, (int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = statisticalBarRenderer8.getSeriesNegativeItemLabelPosition((int) (short) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer25.setBaseOutlinePaint(paint26);
        double double28 = statisticalBarRenderer25.getItemLabelAnchorOffset();
        statisticalBarRenderer25.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Paint paint32 = statisticalBarRenderer25.lookupSeriesOutlinePaint(0);
        statisticalBarRenderer8.setBaseFillPaint(paint32);
        statisticalBarRenderer0.setSeriesFillPaint((int) ' ', paint32);
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(false);
        statisticalBarRenderer0.setSeriesCreateEntities((int) (short) 0, (java.lang.Boolean) true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer42 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer42.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot46 = statisticalBarRenderer42.getPlot();
        statisticalBarRenderer42.setBaseCreateEntities(false, false);
        statisticalBarRenderer42.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) false);
        statisticalBarRenderer42.setSeriesVisibleInLegend((int) 'a', (java.lang.Boolean) false);
        statisticalBarRenderer42.setSeriesVisibleInLegend((int) (short) 10, (java.lang.Boolean) true);
        java.awt.Stroke stroke60 = statisticalBarRenderer42.lookupSeriesOutlineStroke((int) (byte) 1);
        statisticalBarRenderer0.setSeriesOutlineStroke((int) (byte) 1, stroke60, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer63 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint64 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer63.setBaseOutlinePaint(paint64);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint64, true);
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(itemLabelPosition9);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(itemLabelPosition24);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 2.0d + "'", double28 == 2.0d);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNull(categoryPlot46);
        org.junit.Assert.assertNotNull(stroke60);
        org.junit.Assert.assertNotNull(paint64);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer0.setSeriesStroke((int) (short) 100, stroke7);
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        java.awt.Paint paint12 = statisticalBarRenderer0.lookupSeriesFillPaint((int) 'a');
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setPlot(categoryPlot13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(itemLabelPosition10);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition5 = statisticalBarRenderer0.getBaseNegativeItemLabelPosition();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = null;
        statisticalBarRenderer6.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition8, false);
        java.awt.Stroke stroke13 = statisticalBarRenderer6.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = statisticalBarRenderer6.getPlot();
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer6.setBaseItemLabelPaint(paint15);
        statisticalBarRenderer0.setBaseOutlinePaint(paint15, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator19 = statisticalBarRenderer0.getBaseToolTipGenerator();
        java.awt.Paint paint20 = null;
        statisticalBarRenderer0.setErrorIndicatorPaint(paint20);
        org.junit.Assert.assertNotNull(itemLabelPosition5);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNull(categoryPlot14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryToolTipGenerator19);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        java.awt.Paint paint6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint6, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer9.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = statisticalBarRenderer9.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition15 = statisticalBarRenderer9.getSeriesNegativeItemLabelPosition(100);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition15);
        java.awt.Stroke stroke17 = statisticalBarRenderer0.getBaseOutlineStroke();
        java.awt.Font font19 = statisticalBarRenderer0.getSeriesItemLabelFont((int) (byte) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator21 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator(1, categoryToolTipGenerator21);
        java.awt.Paint paint25 = statisticalBarRenderer0.getItemLabelPaint((int) (short) 100, (int) ' ');
        statisticalBarRenderer0.setBaseItemLabelsVisible(false, false);
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(categoryPlot13);
        org.junit.Assert.assertNotNull(itemLabelPosition15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(font19);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        java.awt.Paint paint3 = statisticalBarRenderer0.getSeriesFillPaint((int) 'a');
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (byte) 0, categoryItemLabelGenerator5);
        java.awt.Paint paint8 = statisticalBarRenderer0.getSeriesItemLabelPaint((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = null;
        statisticalBarRenderer9.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition11, false);
        java.awt.Stroke stroke16 = statisticalBarRenderer9.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Stroke stroke18 = statisticalBarRenderer9.lookupSeriesOutlineStroke((int) (byte) -1);
        java.awt.Stroke stroke20 = statisticalBarRenderer9.getSeriesOutlineStroke((int) (byte) 0);
        java.awt.Font font21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer9.setBaseItemLabelFont(font21, false);
        statisticalBarRenderer9.setAutoPopulateSeriesOutlineStroke(true);
        statisticalBarRenderer9.setSeriesItemLabelsVisible((int) (short) 10, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer29.setBaseOutlinePaint(paint30);
        java.awt.Paint paint33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer29.setSeriesPaint(0, paint33);
        java.lang.Object obj35 = null;
        boolean boolean36 = statisticalBarRenderer29.equals(obj35);
        java.awt.Shape shape39 = statisticalBarRenderer29.getItemShape((int) (byte) 1, (int) (short) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer40 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint41 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer40.setBaseOutlinePaint(paint41);
        java.awt.Paint paint44 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer40.setSeriesPaint(0, paint44);
        java.lang.Object obj46 = null;
        boolean boolean47 = statisticalBarRenderer40.equals(obj46);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer49 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition51 = null;
        statisticalBarRenderer49.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition51, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator54 = statisticalBarRenderer49.getLegendItemToolTipGenerator();
        java.awt.Paint paint55 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer49.setErrorIndicatorPaint(paint55);
        statisticalBarRenderer40.setSeriesPaint(10, paint55);
        statisticalBarRenderer40.setBaseSeriesVisible(true);
        statisticalBarRenderer40.setIncludeBaseInRange(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer62 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer62.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot66 = statisticalBarRenderer62.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition68 = statisticalBarRenderer62.getSeriesNegativeItemLabelPosition(100);
        statisticalBarRenderer40.setBaseNegativeItemLabelPosition(itemLabelPosition68, true);
        statisticalBarRenderer29.setNegativeItemLabelPositionFallback(itemLabelPosition68);
        boolean boolean72 = statisticalBarRenderer29.getAutoPopulateSeriesOutlineStroke();
        double double73 = statisticalBarRenderer29.getMinimumBarLength();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator74 = statisticalBarRenderer29.getLegendItemLabelGenerator();
        statisticalBarRenderer9.setLegendItemURLGenerator(categorySeriesLabelGenerator74);
        statisticalBarRenderer0.setLegendItemLabelGenerator(categorySeriesLabelGenerator74);
        double double77 = statisticalBarRenderer0.getMinimumBarLength();
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNull(paint3);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNull(stroke20);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator54);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNull(categoryPlot66);
        org.junit.Assert.assertNotNull(itemLabelPosition68);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator74);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer0.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) ' ', shape7, false);
        statisticalBarRenderer0.setMaximumBarWidth((double) 10.0f);
        java.awt.Font font12 = statisticalBarRenderer0.getBaseItemLabelFont();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator14 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (short) 0, categoryURLGenerator14, false);
        boolean boolean19 = statisticalBarRenderer0.getItemVisible(0, (int) (byte) 1);
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawDomainGridline(graphics2D20, categoryPlot21, rectangle2D22, (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer0.setSeriesStroke((int) (short) 100, stroke7);
        statisticalBarRenderer0.setBaseItemLabelsVisible(false);
        boolean boolean12 = statisticalBarRenderer0.isSeriesItemLabelsVisible(0);
        double double13 = statisticalBarRenderer0.getLowerClip();
        java.lang.Class<?> wildcardClass14 = statisticalBarRenderer0.getClass();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getBaseItemLabelPaint();
        statisticalBarRenderer0.setBaseCreateEntities(false, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer0.getLegendItemURLGenerator();
        java.awt.Stroke stroke11 = statisticalBarRenderer0.lookupSeriesOutlineStroke(0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = null;
        statisticalBarRenderer12.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition14, false);
        java.awt.Stroke stroke19 = statisticalBarRenderer12.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer12.setSeriesShape((int) (short) 1, shape21);
        java.lang.Boolean boolean24 = statisticalBarRenderer12.getSeriesVisible((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition28 = null;
        statisticalBarRenderer26.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition28, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator31 = statisticalBarRenderer26.getLegendItemToolTipGenerator();
        java.awt.Stroke stroke33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer26.setSeriesStroke((int) (short) 100, stroke33);
        statisticalBarRenderer12.setSeriesOutlineStroke((int) (byte) 10, stroke33);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer36 = statisticalBarRenderer12.getGradientPaintTransformer();
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer36);
        statisticalBarRenderer0.setBaseItemLabelsVisible(false, true);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent41 = null;
        statisticalBarRenderer0.notifyListeners(rendererChangeEvent41);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer44 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint45 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer44.setBaseOutlinePaint(paint45);
        java.awt.Paint paint48 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer44.setSeriesPaint(0, paint48);
        java.lang.Object obj50 = null;
        boolean boolean51 = statisticalBarRenderer44.equals(obj50);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer53 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition55 = null;
        statisticalBarRenderer53.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition55, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator58 = statisticalBarRenderer53.getLegendItemToolTipGenerator();
        java.awt.Paint paint59 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer53.setErrorIndicatorPaint(paint59);
        statisticalBarRenderer44.setSeriesPaint(10, paint59);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator62 = statisticalBarRenderer44.getLegendItemURLGenerator();
        java.awt.Paint paint65 = statisticalBarRenderer44.getItemLabelPaint(1, (int) ' ');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator66 = null;
        statisticalBarRenderer44.setBaseToolTipGenerator(categoryToolTipGenerator66, true);
        boolean boolean69 = statisticalBarRenderer44.getIncludeBaseInRange();
        statisticalBarRenderer44.setBaseItemLabelsVisible(true);
        java.awt.Paint paint72 = statisticalBarRenderer44.getBaseOutlinePaint();
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesItemLabelPaint((-1), paint72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNull(boolean24);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator31);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(gradientPaintTransformer36);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator58);
        org.junit.Assert.assertNotNull(paint59);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator62);
        org.junit.Assert.assertNotNull(paint65);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(paint72);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Paint paint6 = statisticalBarRenderer0.getSeriesFillPaint((int) (byte) 0);
        boolean boolean9 = statisticalBarRenderer0.getItemCreateEntity((int) '4', (int) 'a');
        boolean boolean11 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) (byte) 10);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator13 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (short) 0, categoryURLGenerator13, true);
        java.awt.Stroke stroke16 = statisticalBarRenderer0.getBaseOutlineStroke();
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        double double5 = statisticalBarRenderer0.getBase();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer6.setBaseOutlinePaint(paint7);
        java.awt.Paint paint10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer6.setSeriesPaint(0, paint10);
        java.lang.Object obj12 = null;
        boolean boolean13 = statisticalBarRenderer6.equals(obj12);
        java.awt.Paint paint15 = statisticalBarRenderer6.lookupSeriesPaint(0);
        java.lang.Boolean boolean17 = statisticalBarRenderer6.getSeriesVisible(0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator20 = statisticalBarRenderer6.getURLGenerator((int) (short) 0, 0);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator21 = statisticalBarRenderer6.getLegendItemURLGenerator();
        java.awt.Shape shape24 = statisticalBarRenderer6.getItemShape(0, 1);
        statisticalBarRenderer0.setBaseShape(shape24);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertNull(categoryURLGenerator20);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator21);
        org.junit.Assert.assertNotNull(shape24);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer0.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) ' ', shape7, false);
        statisticalBarRenderer0.setMaximumBarWidth((double) 10.0f);
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, false);
        java.awt.Stroke stroke16 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) (byte) 0);
        java.awt.Paint paint18 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (short) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(false);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(false);
        boolean boolean24 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) '#');
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Stroke stroke4 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = statisticalBarRenderer0.getToolTipGenerator(0, 0);
        boolean boolean8 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        statisticalBarRenderer0.setSeriesCreateEntities((int) ' ', (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = null;
        statisticalBarRenderer14.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition16, false);
        java.awt.Stroke stroke21 = statisticalBarRenderer14.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Stroke stroke23 = statisticalBarRenderer14.lookupSeriesOutlineStroke((int) (byte) -1);
        java.awt.Font font26 = statisticalBarRenderer14.getItemLabelFont((int) (short) 0, 10);
        statisticalBarRenderer0.setBaseItemLabelFont(font26, false);
        double double29 = statisticalBarRenderer0.getItemMargin();
        java.awt.Stroke stroke30 = statisticalBarRenderer0.getBaseOutlineStroke();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.2d + "'", double29 == 0.2d);
        org.junit.Assert.assertNotNull(stroke30);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setSeriesPaint(0, paint4);
        java.lang.Object obj6 = null;
        boolean boolean7 = statisticalBarRenderer0.equals(obj6);
        java.awt.Shape shape10 = statisticalBarRenderer0.getItemShape((int) (byte) 1, (int) (short) -1);
        statisticalBarRenderer0.setSeriesItemLabelsVisible(100, (java.lang.Boolean) false);
        java.lang.Boolean boolean15 = statisticalBarRenderer0.getSeriesVisible(0);
        statisticalBarRenderer0.setDrawBarOutline(true);
        java.awt.Paint paint19 = statisticalBarRenderer0.getSeriesPaint((-1));
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer20.setBaseOutlinePaint(paint21);
        boolean boolean23 = statisticalBarRenderer20.isDrawBarOutline();
        boolean boolean24 = statisticalBarRenderer20.getBaseItemLabelsVisible();
        int int25 = statisticalBarRenderer20.getColumnCount();
        double double26 = statisticalBarRenderer20.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer27.setBaseOutlinePaint(paint28);
        java.awt.Paint paint31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer27.setSeriesPaint(0, paint31);
        java.lang.Object obj33 = null;
        boolean boolean34 = statisticalBarRenderer27.equals(obj33);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer36 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition38 = null;
        statisticalBarRenderer36.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition38, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator41 = statisticalBarRenderer36.getLegendItemToolTipGenerator();
        java.awt.Paint paint42 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer36.setErrorIndicatorPaint(paint42);
        statisticalBarRenderer27.setSeriesPaint(10, paint42);
        statisticalBarRenderer27.setBaseSeriesVisible(true);
        statisticalBarRenderer27.setIncludeBaseInRange(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer49 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer49.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot53 = statisticalBarRenderer49.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition55 = statisticalBarRenderer49.getSeriesNegativeItemLabelPosition(100);
        statisticalBarRenderer27.setBaseNegativeItemLabelPosition(itemLabelPosition55, true);
        statisticalBarRenderer20.setBasePositiveItemLabelPosition(itemLabelPosition55);
        statisticalBarRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition55);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator60 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator60);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator62 = statisticalBarRenderer0.getBaseToolTipGenerator();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNull(paint19);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.2d + "'", double26 == 0.2d);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator41);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertNull(categoryPlot53);
        org.junit.Assert.assertNotNull(itemLabelPosition55);
        org.junit.Assert.assertNull(categoryToolTipGenerator62);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setSeriesPaint(0, paint4);
        java.lang.Object obj6 = null;
        boolean boolean7 = statisticalBarRenderer0.equals(obj6);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = null;
        statisticalBarRenderer9.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition11, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer9.getLegendItemToolTipGenerator();
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer9.setErrorIndicatorPaint(paint15);
        statisticalBarRenderer0.setSeriesPaint(10, paint15);
        boolean boolean18 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer19.setBaseOutlinePaint(paint20);
        boolean boolean22 = statisticalBarRenderer19.getAutoPopulateSeriesShape();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = statisticalBarRenderer23.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = statisticalBarRenderer23.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer19.setBasePositiveItemLabelPosition(itemLabelPosition26);
        statisticalBarRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition26);
        boolean boolean29 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator30 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator30, false);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(itemLabelPosition24);
        org.junit.Assert.assertNotNull(itemLabelPosition26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer4 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition5 = statisticalBarRenderer4.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = statisticalBarRenderer4.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition7);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator10, false);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = statisticalBarRenderer0.getLegendItems();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer15.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = statisticalBarRenderer15.getPlot();
        java.awt.Stroke stroke21 = statisticalBarRenderer15.getSeriesOutlineStroke((int) (byte) 1);
        double double22 = statisticalBarRenderer15.getUpperClip();
        java.awt.Paint paint23 = statisticalBarRenderer15.getErrorIndicatorPaint();
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesItemLabelPaint((-1), paint23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(itemLabelPosition5);
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNotNull(legendItemCollection13);
        org.junit.Assert.assertNull(categoryPlot19);
        org.junit.Assert.assertNull(stroke21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke(1, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = null;
        statisticalBarRenderer8.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition10, false);
        java.awt.Stroke stroke15 = statisticalBarRenderer8.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer8.setSeriesShape((int) (short) 1, shape17);
        statisticalBarRenderer0.setBaseShape(shape17, false);
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation23 = null;
        boolean boolean24 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation23);
        statisticalBarRenderer0.setBase(1.0d);
        double double27 = statisticalBarRenderer0.getMinimumBarLength();
        boolean boolean28 = statisticalBarRenderer0.getBaseSeriesVisible();
        org.jfree.chart.LegendItemCollection legendItemCollection29 = statisticalBarRenderer0.getLegendItems();
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(legendItemCollection29);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setSeriesPaint(0, paint4);
        java.lang.Object obj6 = null;
        boolean boolean7 = statisticalBarRenderer0.equals(obj6);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = null;
        statisticalBarRenderer9.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition11, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer9.getLegendItemToolTipGenerator();
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer9.setErrorIndicatorPaint(paint15);
        statisticalBarRenderer0.setSeriesPaint(10, paint15);
        java.awt.Font font20 = statisticalBarRenderer0.getItemLabelFont((int) (byte) -1, (int) '4');
        java.awt.Stroke stroke21 = statisticalBarRenderer0.getBaseStroke();
        boolean boolean22 = statisticalBarRenderer0.getIncludeBaseInRange();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator23);
        java.awt.Graphics2D graphics2D25 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = null;
        org.jfree.chart.plot.CategoryMarker categoryMarker28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawDomainMarker(graphics2D25, categoryPlot26, categoryAxis27, categoryMarker28, rectangle2D29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        java.awt.Paint paint3 = statisticalBarRenderer0.lookupSeriesPaint((int) (short) 0);
        java.awt.Shape shape5 = statisticalBarRenderer0.lookupSeriesShape(0);
        statisticalBarRenderer0.setDrawBarOutline(false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        boolean boolean9 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNull(itemLabelPosition8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = statisticalBarRenderer0.hasListener(eventListener5);
        java.awt.Paint paint8 = statisticalBarRenderer0.getSeriesOutlinePaint((int) '#');
        int int9 = statisticalBarRenderer0.getPassCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = null;
        statisticalBarRenderer10.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition12, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition15 = statisticalBarRenderer10.getBaseNegativeItemLabelPosition();
        boolean boolean16 = statisticalBarRenderer10.getAutoPopulateSeriesOutlineStroke();
        java.awt.Stroke stroke17 = statisticalBarRenderer10.getBaseOutlineStroke();
        statisticalBarRenderer0.setBaseStroke(stroke17, false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(itemLabelPosition15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Shape shape4 = statisticalBarRenderer0.getSeriesShape((int) (short) 100);
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) 10L);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = null;
        statisticalBarRenderer8.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition10, false);
        java.awt.Stroke stroke15 = statisticalBarRenderer8.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer8.setSeriesShape((int) (short) 1, shape17);
        boolean boolean19 = statisticalBarRenderer8.isDrawBarOutline();
        java.awt.Shape shape21 = statisticalBarRenderer8.lookupSeriesShape((int) (byte) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = statisticalBarRenderer8.getItemLabelGenerator((int) (short) 10, (int) (short) 1);
        java.awt.Paint paint27 = statisticalBarRenderer8.getItemFillPaint((int) (byte) 10, (int) (byte) 10);
        statisticalBarRenderer0.setSeriesFillPaint(100, paint27, false);
        java.awt.Paint paint31 = statisticalBarRenderer0.getSeriesItemLabelPaint((int) (byte) 10);
        double double32 = statisticalBarRenderer0.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer33 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = statisticalBarRenderer33.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition36 = statisticalBarRenderer33.getSeriesPositiveItemLabelPosition((int) '#');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer38 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer38.setBaseOutlinePaint(paint39);
        java.awt.Paint paint42 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer38.setSeriesPaint(0, paint42);
        java.lang.Object obj44 = null;
        boolean boolean45 = statisticalBarRenderer38.equals(obj44);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer47 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition49 = null;
        statisticalBarRenderer47.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition49, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator52 = statisticalBarRenderer47.getLegendItemToolTipGenerator();
        java.awt.Paint paint53 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer47.setErrorIndicatorPaint(paint53);
        statisticalBarRenderer38.setSeriesPaint(10, paint53);
        java.awt.Font font58 = statisticalBarRenderer38.getItemLabelFont((int) (byte) -1, (int) '4');
        statisticalBarRenderer33.setSeriesItemLabelFont(10, font58, false);
        java.awt.Stroke stroke61 = statisticalBarRenderer33.getBaseOutlineStroke();
        statisticalBarRenderer0.setBaseStroke(stroke61, true);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNull(categoryItemLabelGenerator24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNull(paint31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.2d + "'", double32 == 0.2d);
        org.junit.Assert.assertNull(itemLabelPosition34);
        org.junit.Assert.assertNotNull(itemLabelPosition36);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator52);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertNotNull(font58);
        org.junit.Assert.assertNotNull(stroke61);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer4 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition5 = statisticalBarRenderer4.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = statisticalBarRenderer4.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition7);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator9);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(itemLabelPosition5);
        org.junit.Assert.assertNotNull(itemLabelPosition7);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation8 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.addAnnotation(categoryAnnotation8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke7);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer9.setBaseOutlinePaint(paint10);
        statisticalBarRenderer0.setSeriesPaint((int) 'a', paint10, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = statisticalBarRenderer0.getPlot();
        org.jfree.chart.LegendItem legendItem17 = statisticalBarRenderer0.getLegendItem((int) (short) -1, (int) (byte) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition20 = null;
        statisticalBarRenderer18.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition20, false);
        java.awt.Stroke stroke25 = statisticalBarRenderer18.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = statisticalBarRenderer18.getPlot();
        java.awt.Paint paint27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer18.setBaseItemLabelPaint(paint27);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition30 = statisticalBarRenderer18.getSeriesNegativeItemLabelPosition((int) (short) -1);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition30);
        statisticalBarRenderer0.setDrawBarOutline(false);
        java.awt.Paint paint35 = statisticalBarRenderer0.getSeriesPaint((int) '4');
        java.awt.Graphics2D graphics2D36 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = null;
        org.jfree.chart.axis.ValueAxis valueAxis38 = null;
        org.jfree.chart.plot.Marker marker39 = null;
        java.awt.geom.Rectangle2D rectangle2D40 = null;
        statisticalBarRenderer0.drawRangeMarker(graphics2D36, categoryPlot37, valueAxis38, marker39, rectangle2D40);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(categoryPlot14);
        org.junit.Assert.assertNull(legendItem17);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNull(categoryPlot26);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(itemLabelPosition30);
        org.junit.Assert.assertNull(paint35);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Shape shape6 = statisticalBarRenderer0.getSeriesShape((int) (short) 0);
        statisticalBarRenderer0.setBase(0.0d);
        statisticalBarRenderer0.setDrawBarOutline(false);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 10, (java.lang.Boolean) true, true);
        org.junit.Assert.assertNull(shape6);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        statisticalBarRenderer0.setMaximumBarWidth((double) (short) 100);
        statisticalBarRenderer0.setDrawBarOutline(false);
        statisticalBarRenderer0.setMaximumBarWidth((double) 1L);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = null;
        statisticalBarRenderer11.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition13, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator16 = statisticalBarRenderer11.getLegendItemToolTipGenerator();
        double double17 = statisticalBarRenderer11.getItemMargin();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer18 = null;
        statisticalBarRenderer11.setGradientPaintTransformer(gradientPaintTransformer18);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = statisticalBarRenderer21.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = statisticalBarRenderer21.getSeriesPositiveItemLabelPosition((int) '#');
        boolean boolean25 = statisticalBarRenderer21.getBaseSeriesVisible();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = statisticalBarRenderer21.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition27 = statisticalBarRenderer21.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer21.getSeriesPositiveItemLabelPosition(10);
        statisticalBarRenderer11.setSeriesNegativeItemLabelPosition(0, itemLabelPosition29);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition33 = null;
        statisticalBarRenderer31.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition33, false);
        java.awt.Paint paint36 = statisticalBarRenderer31.getBaseItemLabelPaint();
        statisticalBarRenderer11.setBaseFillPaint(paint36);
        statisticalBarRenderer0.setSeriesItemLabelPaint(10, paint36, false);
        boolean boolean40 = statisticalBarRenderer0.getBaseCreateEntities();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer42 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint43 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer42.setBaseOutlinePaint(paint43);
        boolean boolean45 = statisticalBarRenderer42.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer46 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition48 = null;
        statisticalBarRenderer46.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition48, false);
        java.util.EventListener eventListener51 = null;
        boolean boolean52 = statisticalBarRenderer46.hasListener(eventListener51);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator54 = null;
        statisticalBarRenderer46.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator54);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator57 = statisticalBarRenderer46.getSeriesItemLabelGenerator(0);
        java.awt.Font font58 = statisticalBarRenderer46.getBaseItemLabelFont();
        statisticalBarRenderer42.setBaseItemLabelFont(font58);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator61 = null;
        statisticalBarRenderer42.setSeriesItemLabelGenerator((int) (byte) 1, categoryItemLabelGenerator61);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer63 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition64 = statisticalBarRenderer63.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition66 = statisticalBarRenderer63.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer42.setNegativeItemLabelPositionFallback(itemLabelPosition66);
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) 'a', itemLabelPosition66, false);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2d + "'", double17 == 0.2d);
        org.junit.Assert.assertNull(itemLabelPosition22);
        org.junit.Assert.assertNotNull(itemLabelPosition24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(itemLabelPosition26);
        org.junit.Assert.assertNull(itemLabelPosition27);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator57);
        org.junit.Assert.assertNotNull(font58);
        org.junit.Assert.assertNull(itemLabelPosition64);
        org.junit.Assert.assertNotNull(itemLabelPosition66);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setSeriesPaint(0, paint4);
        java.lang.Object obj6 = null;
        boolean boolean7 = statisticalBarRenderer0.equals(obj6);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = null;
        statisticalBarRenderer9.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition11, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer9.getLegendItemToolTipGenerator();
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer9.setErrorIndicatorPaint(paint15);
        statisticalBarRenderer0.setSeriesPaint(10, paint15);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = null;
        statisticalBarRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator18);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer21.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = statisticalBarRenderer21.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition27 = statisticalBarRenderer21.getSeriesNegativeItemLabelPosition(100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer21.getSeriesNegativeItemLabelPosition((int) 'a');
        statisticalBarRenderer0.setSeriesNegativeItemLabelPosition((int) (short) 100, itemLabelPosition29);
        statisticalBarRenderer0.setAutoPopulateSeriesFillPaint(true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator34 = null;
        statisticalBarRenderer0.setSeriesURLGenerator(1, categoryURLGenerator34);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 0, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (short) 10, categoryItemLabelGenerator40);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryPlot25);
        org.junit.Assert.assertNotNull(itemLabelPosition27);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = statisticalBarRenderer0.getItemLabelGenerator((int) (byte) 10, (int) '4');
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator8);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer10.setBaseOutlinePaint(paint11);
        boolean boolean13 = statisticalBarRenderer10.getAutoPopulateSeriesShape();
        java.awt.Paint paint15 = statisticalBarRenderer10.lookupSeriesPaint((int) (short) 0);
        statisticalBarRenderer0.setBaseOutlinePaint(paint15, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = statisticalBarRenderer0.getSeriesItemLabelGenerator(100);
        statisticalBarRenderer0.setSeriesVisible((int) (short) 0, (java.lang.Boolean) true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator7);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryItemLabelGenerator19);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) '#');
        boolean boolean4 = statisticalBarRenderer0.getBaseSeriesVisible();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition5 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition6 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        java.lang.Boolean boolean8 = statisticalBarRenderer0.getSeriesVisibleInLegend(0);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false);
        statisticalBarRenderer0.setBaseCreateEntities(false);
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNotNull(itemLabelPosition3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(itemLabelPosition5);
        org.junit.Assert.assertNull(itemLabelPosition6);
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer0.setSeriesStroke((int) (short) 100, stroke7);
        statisticalBarRenderer0.setBaseItemLabelsVisible(false);
        boolean boolean13 = statisticalBarRenderer0.isItemLabelVisible((int) (byte) 1, (int) 'a');
        statisticalBarRenderer0.setSeriesItemLabelsVisible(0, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer17.setBaseOutlinePaint(paint18);
        boolean boolean20 = statisticalBarRenderer17.isDrawBarOutline();
        statisticalBarRenderer17.setMaximumBarWidth((double) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator24 = statisticalBarRenderer17.getSeriesToolTipGenerator((-1));
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition27 = statisticalBarRenderer17.getNegativeItemLabelPosition(100, (int) (short) -1);
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition27);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer29.setBaseOutlinePaint(paint30);
        java.awt.Paint paint33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer29.setSeriesPaint(0, paint33);
        java.lang.Object obj35 = null;
        boolean boolean36 = statisticalBarRenderer29.equals(obj35);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer38 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition40 = null;
        statisticalBarRenderer38.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition40, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator43 = statisticalBarRenderer38.getLegendItemToolTipGenerator();
        java.awt.Paint paint44 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer38.setErrorIndicatorPaint(paint44);
        statisticalBarRenderer29.setSeriesPaint(10, paint44);
        statisticalBarRenderer0.setBasePaint(paint44, true);
        java.awt.Paint paint51 = statisticalBarRenderer0.getItemFillPaint((int) (short) 1, 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer52 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition53 = statisticalBarRenderer52.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer52.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape59 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer52.setSeriesShape((int) ' ', shape59, false);
        statisticalBarRenderer52.setMaximumBarWidth((double) 10.0f);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer65 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition67 = null;
        statisticalBarRenderer65.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition67, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator70 = statisticalBarRenderer65.getLegendItemToolTipGenerator();
        java.awt.Paint paint71 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer65.setErrorIndicatorPaint(paint71);
        java.awt.Stroke stroke73 = statisticalBarRenderer65.getBaseOutlineStroke();
        statisticalBarRenderer52.setSeriesStroke(1, stroke73);
        statisticalBarRenderer0.setErrorIndicatorStroke(stroke73);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator24);
        org.junit.Assert.assertNotNull(itemLabelPosition27);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator43);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNull(itemLabelPosition53);
        org.junit.Assert.assertNotNull(shape59);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator70);
        org.junit.Assert.assertNotNull(paint71);
        org.junit.Assert.assertNotNull(stroke73);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        statisticalBarRenderer0.setMaximumBarWidth((double) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = statisticalBarRenderer0.getSeriesToolTipGenerator((-1));
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer9.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = statisticalBarRenderer9.getPlot();
        java.awt.Stroke stroke16 = statisticalBarRenderer9.getItemOutlineStroke(1, 100);
        statisticalBarRenderer0.setSeriesOutlineStroke((int) (short) 0, stroke16);
        java.awt.Paint paint19 = null;
        statisticalBarRenderer0.setSeriesOutlinePaint(1, paint19, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator22);
        java.awt.Paint paint25 = statisticalBarRenderer0.lookupSeriesPaint((int) (short) 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator28 = statisticalBarRenderer0.getItemLabelGenerator((int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertNull(categoryPlot13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNull(categoryItemLabelGenerator28);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) (short) 1, shape9);
        boolean boolean11 = statisticalBarRenderer0.isDrawBarOutline();
        java.awt.Shape shape13 = statisticalBarRenderer0.lookupSeriesShape((int) (byte) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator16 = statisticalBarRenderer0.getItemLabelGenerator((int) (short) 10, (int) (short) 1);
        java.awt.Stroke stroke18 = statisticalBarRenderer0.getSeriesStroke((int) '4');
        java.awt.Stroke stroke20 = statisticalBarRenderer0.lookupSeriesStroke((int) 'a');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = statisticalBarRenderer21.getNegativeItemLabelPositionFallback();
        boolean boolean25 = statisticalBarRenderer21.getItemVisible((int) (byte) 100, (int) (byte) 1);
        statisticalBarRenderer21.setMinimumBarLength(0.0d);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer29.setBaseOutlinePaint(paint30);
        boolean boolean32 = statisticalBarRenderer29.isDrawBarOutline();
        statisticalBarRenderer29.setDrawBarOutline(false);
        java.awt.Stroke stroke36 = null;
        statisticalBarRenderer29.setSeriesOutlineStroke((int) (short) 0, stroke36, true);
        java.awt.Paint paint41 = statisticalBarRenderer29.getItemPaint(10, (-1));
        statisticalBarRenderer21.setSeriesItemLabelPaint(1, paint41, true);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint41, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator46 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNull(categoryItemLabelGenerator16);
        org.junit.Assert.assertNull(stroke18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNull(itemLabelPosition22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator46);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        statisticalBarRenderer0.setMaximumBarWidth((double) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = statisticalBarRenderer0.getSeriesToolTipGenerator((-1));
        statisticalBarRenderer0.setSeriesVisible((int) (short) 10, (java.lang.Boolean) true);
        boolean boolean11 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (short) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = null;
        statisticalBarRenderer14.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition16, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator19 = statisticalBarRenderer14.getLegendItemToolTipGenerator();
        java.awt.Paint paint20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer14.setErrorIndicatorPaint(paint20);
        statisticalBarRenderer0.setErrorIndicatorPaint(paint20);
        java.awt.Paint paint25 = statisticalBarRenderer0.getItemLabelPaint((int) (byte) 1, (-1));
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator27 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) ' ', categoryItemLabelGenerator27, true);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        java.awt.Paint paint3 = statisticalBarRenderer0.lookupSeriesPaint((int) (short) 0);
        java.awt.Shape shape5 = statisticalBarRenderer0.lookupSeriesShape(0);
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) (byte) 100);
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) 'a', categoryItemLabelGenerator12);
        boolean boolean15 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) (byte) 0);
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = statisticalBarRenderer0.getItemLabelGenerator((int) (byte) 10, (int) '4');
        java.awt.Paint paint9 = statisticalBarRenderer0.getSeriesFillPaint((int) (short) 1);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = null;
        org.jfree.chart.axis.ValueAxis valueAxis13 = null;
        org.jfree.chart.util.Layer layer14 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawAnnotations(graphics2D10, rectangle2D11, categoryAxis12, valueAxis13, layer14, plotRenderingInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryItemLabelGenerator7);
        org.junit.Assert.assertNull(paint9);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Stroke stroke4 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (short) 1);
        java.lang.Boolean boolean6 = statisticalBarRenderer0.getSeriesCreateEntities((-1));
        double double7 = statisticalBarRenderer0.getMaximumBarWidth();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = null;
        statisticalBarRenderer8.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition10, false);
        java.awt.Stroke stroke15 = statisticalBarRenderer8.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer8.setSeriesShape((int) (short) 1, shape17);
        java.lang.Boolean boolean20 = statisticalBarRenderer8.getSeriesVisible((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint22 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer21.setBaseOutlinePaint(paint22);
        boolean boolean24 = statisticalBarRenderer21.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = statisticalBarRenderer25.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition28 = statisticalBarRenderer25.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer21.setBasePositiveItemLabelPosition(itemLabelPosition28);
        statisticalBarRenderer8.setBaseNegativeItemLabelPosition(itemLabelPosition28);
        statisticalBarRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition28);
        statisticalBarRenderer0.setBase((double) (short) 10);
        java.awt.Graphics2D graphics2D34 = null;
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState35 = null;
        java.awt.geom.Rectangle2D rectangle2D36 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis38 = null;
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        org.jfree.data.category.CategoryDataset categoryDataset40 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawItem(graphics2D34, categoryItemRendererState35, rectangle2D36, categoryPlot37, categoryAxis38, valueAxis39, categoryDataset40, (int) (byte) 1, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires StatisticalCategoryDataset.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(itemLabelPosition26);
        org.junit.Assert.assertNotNull(itemLabelPosition28);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer0.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) ' ', shape7, false);
        statisticalBarRenderer0.setMaximumBarWidth((double) 10.0f);
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, false);
        java.awt.Stroke stroke16 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) (byte) 0);
        java.awt.Paint paint18 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (short) 10);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator23 = statisticalBarRenderer0.getToolTipGenerator(100, (int) (byte) 100);
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(categoryToolTipGenerator23);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Stroke stroke9 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) (byte) -1);
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 0);
        statisticalBarRenderer0.setItemLabelAnchorOffset(0.2d);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator14 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator14);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = statisticalBarRenderer0.getBaseURLGenerator();
        statisticalBarRenderer0.setBaseCreateEntities(false);
        boolean boolean20 = statisticalBarRenderer0.isSeriesVisibleInLegend(0);
        java.awt.Shape shape21 = statisticalBarRenderer0.getBaseShape();
        int int22 = statisticalBarRenderer0.getColumnCount();
        statisticalBarRenderer0.setSeriesVisible((int) (short) 0, (java.lang.Boolean) true, false);
        java.awt.Graphics2D graphics2D27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState32 = statisticalBarRenderer0.initialise(graphics2D27, rectangle2D28, categoryPlot29, 100, plotRenderingInfo31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(stroke11);
        org.junit.Assert.assertNull(categoryURLGenerator16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        java.awt.Paint paint3 = statisticalBarRenderer0.lookupSeriesPaint((int) (short) 0);
        java.awt.Shape shape5 = statisticalBarRenderer0.lookupSeriesShape(0);
        statisticalBarRenderer0.setDrawBarOutline(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = null;
        statisticalBarRenderer8.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition10, false);
        java.awt.Stroke stroke15 = statisticalBarRenderer8.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = statisticalBarRenderer8.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = statisticalBarRenderer8.getSeriesPositiveItemLabelPosition((int) 'a');
        java.awt.Paint paint21 = statisticalBarRenderer8.getItemOutlinePaint((int) (byte) 1, (int) (byte) 1);
        statisticalBarRenderer0.setBasePaint(paint21, true);
        int int24 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator25 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator25);
        boolean boolean29 = statisticalBarRenderer0.isItemLabelVisible((int) 'a', 100);
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(categoryPlot16);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator4 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator4);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = statisticalBarRenderer0.getSeriesItemLabelGenerator(100);
        boolean boolean8 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        boolean boolean11 = statisticalBarRenderer0.getItemVisible((int) (short) 10, 0);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke(1, 100);
        double double8 = statisticalBarRenderer0.getMinimumBarLength();
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (byte) -1);
        java.awt.Paint paint12 = statisticalBarRenderer0.getBasePaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer13.setBaseOutlinePaint(paint14);
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer13.setSeriesPaint(0, paint17);
        java.lang.Object obj19 = null;
        boolean boolean20 = statisticalBarRenderer13.equals(obj19);
        java.awt.Shape shape23 = statisticalBarRenderer13.getItemShape((int) (byte) 1, (int) (short) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer24.setBaseOutlinePaint(paint25);
        java.awt.Paint paint28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer24.setSeriesPaint(0, paint28);
        java.lang.Object obj30 = null;
        boolean boolean31 = statisticalBarRenderer24.equals(obj30);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer33 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition35 = null;
        statisticalBarRenderer33.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition35, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator38 = statisticalBarRenderer33.getLegendItemToolTipGenerator();
        java.awt.Paint paint39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer33.setErrorIndicatorPaint(paint39);
        statisticalBarRenderer24.setSeriesPaint(10, paint39);
        statisticalBarRenderer24.setBaseSeriesVisible(true);
        statisticalBarRenderer24.setIncludeBaseInRange(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer46 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer46.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot50 = statisticalBarRenderer46.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition52 = statisticalBarRenderer46.getSeriesNegativeItemLabelPosition(100);
        statisticalBarRenderer24.setBaseNegativeItemLabelPosition(itemLabelPosition52, true);
        statisticalBarRenderer13.setNegativeItemLabelPositionFallback(itemLabelPosition52);
        boolean boolean56 = statisticalBarRenderer13.getAutoPopulateSeriesOutlineStroke();
        double double57 = statisticalBarRenderer13.getMinimumBarLength();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator58 = statisticalBarRenderer13.getLegendItemLabelGenerator();
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator58);
        double double60 = statisticalBarRenderer0.getLowerClip();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator62 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (short) 0, categoryItemLabelGenerator62, false);
        java.awt.Paint paint65 = statisticalBarRenderer0.getErrorIndicatorPaint();
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNull(categoryPlot50);
        org.junit.Assert.assertNotNull(itemLabelPosition52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator58);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(paint65);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setSeriesPaint(0, paint4);
        java.lang.Object obj6 = null;
        boolean boolean7 = statisticalBarRenderer0.equals(obj6);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = null;
        statisticalBarRenderer9.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition11, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer9.getLegendItemToolTipGenerator();
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer9.setErrorIndicatorPaint(paint15);
        statisticalBarRenderer0.setSeriesPaint(10, paint15);
        java.awt.Font font20 = statisticalBarRenderer0.getItemLabelFont((int) (byte) -1, (int) '4');
        statisticalBarRenderer0.setSeriesCreateEntities(100, (java.lang.Boolean) false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator26 = statisticalBarRenderer0.getItemLabelGenerator((int) (short) 100, (int) (short) 100);
        statisticalBarRenderer0.setSeriesItemLabelsVisible(1, (java.lang.Boolean) false, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition31 = statisticalBarRenderer0.getPositiveItemLabelPositionFallback();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNull(categoryItemLabelGenerator26);
        org.junit.Assert.assertNull(itemLabelPosition31);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        double double6 = statisticalBarRenderer0.getItemMargin();
        java.awt.Shape shape8 = statisticalBarRenderer0.getSeriesShape((int) ' ');
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer9 = null;
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer9);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = null;
        statisticalBarRenderer0.setSeriesURLGenerator(10, categoryURLGenerator12, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition((int) '4');
        double double17 = statisticalBarRenderer0.getUpperClip();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        double double6 = statisticalBarRenderer0.getItemMargin();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer7 = null;
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer7);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer10.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = statisticalBarRenderer10.getSeriesPositiveItemLabelPosition((int) '#');
        boolean boolean14 = statisticalBarRenderer10.getBaseSeriesVisible();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition15 = statisticalBarRenderer10.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = statisticalBarRenderer10.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = statisticalBarRenderer10.getSeriesPositiveItemLabelPosition(10);
        statisticalBarRenderer0.setSeriesNegativeItemLabelPosition(0, itemLabelPosition18);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = null;
        statisticalBarRenderer20.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition22, false);
        java.awt.Paint paint25 = statisticalBarRenderer20.getBaseItemLabelPaint();
        statisticalBarRenderer0.setBaseFillPaint(paint25);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator27 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator27, true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
        org.junit.Assert.assertNull(itemLabelPosition11);
        org.junit.Assert.assertNotNull(itemLabelPosition13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(itemLabelPosition15);
        org.junit.Assert.assertNull(itemLabelPosition16);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        java.lang.Boolean boolean9 = statisticalBarRenderer0.getSeriesVisible((int) (byte) 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator10, false);
        statisticalBarRenderer0.setBaseSeriesVisible(false);
        java.awt.Paint paint16 = statisticalBarRenderer0.lookupSeriesFillPaint((int) (short) -1);
        java.awt.Paint paint17 = statisticalBarRenderer0.getBasePaint();
        boolean boolean18 = statisticalBarRenderer0.isDrawBarOutline();
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        statisticalBarRenderer0.setDrawBarOutline(false);
        java.awt.Paint paint6 = statisticalBarRenderer0.getErrorIndicatorPaint();
        double double7 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0d + "'", double7 == 2.0d);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        statisticalBarRenderer0.setDrawBarOutline(false);
        java.awt.Stroke stroke7 = null;
        statisticalBarRenderer0.setSeriesOutlineStroke((int) (short) 0, stroke7, true);
        java.awt.Paint paint12 = statisticalBarRenderer0.getItemPaint(10, (-1));
        java.awt.Shape shape14 = statisticalBarRenderer0.getSeriesShape((int) (short) 100);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation15 = null;
        boolean boolean16 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation15);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true, false);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) (short) 1, shape9);
        boolean boolean11 = statisticalBarRenderer0.isDrawBarOutline();
        java.awt.Shape shape13 = statisticalBarRenderer0.lookupSeriesShape((int) (byte) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator16 = statisticalBarRenderer0.getItemLabelGenerator((int) (short) 10, (int) (short) 1);
        java.awt.Stroke stroke18 = statisticalBarRenderer0.getSeriesStroke((int) '4');
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) ' ');
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition21 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNull(categoryItemLabelGenerator16);
        org.junit.Assert.assertNull(stroke18);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertNull(itemLabelPosition21);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Paint paint6 = statisticalBarRenderer0.getSeriesFillPaint((int) (byte) 0);
        org.jfree.chart.LegendItem legendItem9 = statisticalBarRenderer0.getLegendItem((int) (short) 100, (int) 'a');
        java.awt.Font font10 = statisticalBarRenderer0.getBaseItemLabelFont();
        boolean boolean12 = statisticalBarRenderer0.isSeriesVisibleInLegend(0);
        boolean boolean15 = statisticalBarRenderer0.isItemLabelVisible((int) (byte) 10, (-1));
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNull(legendItem9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer4 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition6 = null;
        statisticalBarRenderer4.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition6, false);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = statisticalBarRenderer4.hasListener(eventListener9);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = null;
        statisticalBarRenderer4.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator12);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = statisticalBarRenderer4.getSeriesItemLabelGenerator(0);
        java.awt.Font font16 = statisticalBarRenderer4.getBaseItemLabelFont();
        statisticalBarRenderer0.setBaseItemLabelFont(font16);
        boolean boolean18 = statisticalBarRenderer0.getAutoPopulateSeriesPaint();
        boolean boolean19 = statisticalBarRenderer0.getIncludeBaseInRange();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = statisticalBarRenderer0.getPlot();
        java.awt.Paint paint9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseItemLabelPaint(paint9);
        boolean boolean11 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        boolean boolean12 = statisticalBarRenderer0.getBaseCreateEntities();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer14.setBaseOutlinePaint(paint15);
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer14.setSeriesPaint(0, paint18);
        java.lang.Object obj20 = null;
        boolean boolean21 = statisticalBarRenderer14.equals(obj20);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = null;
        statisticalBarRenderer23.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition25, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator28 = statisticalBarRenderer23.getLegendItemToolTipGenerator();
        java.awt.Paint paint29 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer23.setErrorIndicatorPaint(paint29);
        statisticalBarRenderer14.setSeriesPaint(10, paint29);
        statisticalBarRenderer14.setBaseSeriesVisible(true);
        statisticalBarRenderer14.setIncludeBaseInRange(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer36 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer36.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot40 = statisticalBarRenderer36.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition42 = statisticalBarRenderer36.getSeriesNegativeItemLabelPosition(100);
        statisticalBarRenderer14.setBaseNegativeItemLabelPosition(itemLabelPosition42, true);
        java.awt.Shape shape46 = statisticalBarRenderer14.getSeriesShape(1);
        java.awt.Font font49 = statisticalBarRenderer14.getItemLabelFont(100, 100);
        statisticalBarRenderer0.setSeriesItemLabelFont((int) (byte) 100, font49);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer51 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer51.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot55 = statisticalBarRenderer51.getPlot();
        statisticalBarRenderer51.setBaseCreateEntities(false, false);
        statisticalBarRenderer51.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator63 = null;
        statisticalBarRenderer51.setSeriesURLGenerator(0, categoryURLGenerator63, false);
        java.lang.Boolean boolean67 = statisticalBarRenderer51.getSeriesCreateEntities((int) (short) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer68 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint69 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer68.setBaseOutlinePaint(paint69);
        java.awt.Stroke stroke72 = statisticalBarRenderer68.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator75 = statisticalBarRenderer68.getToolTipGenerator(0, 0);
        boolean boolean76 = statisticalBarRenderer68.getAutoPopulateSeriesStroke();
        statisticalBarRenderer68.setAutoPopulateSeriesOutlinePaint(false);
        statisticalBarRenderer68.setSeriesCreateEntities((int) ' ', (java.lang.Boolean) false);
        java.awt.Font font84 = statisticalBarRenderer68.getItemLabelFont((int) (byte) 10, (int) (short) -1);
        statisticalBarRenderer51.setBaseItemLabelFont(font84);
        java.awt.Paint paint86 = statisticalBarRenderer51.getErrorIndicatorPaint();
        statisticalBarRenderer0.setBaseFillPaint(paint86);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(categoryPlot8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertNull(categoryPlot40);
        org.junit.Assert.assertNotNull(itemLabelPosition42);
        org.junit.Assert.assertNull(shape46);
        org.junit.Assert.assertNotNull(font49);
        org.junit.Assert.assertNull(categoryPlot55);
        org.junit.Assert.assertNull(boolean67);
        org.junit.Assert.assertNotNull(paint69);
        org.junit.Assert.assertNull(stroke72);
        org.junit.Assert.assertNull(categoryToolTipGenerator75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(font84);
        org.junit.Assert.assertNotNull(paint86);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        java.awt.Paint paint6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint6, true);
        java.awt.Shape shape10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) (byte) 1, shape10, true);
        java.awt.Paint paint13 = statisticalBarRenderer0.getBaseFillPaint();
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false);
        boolean boolean18 = statisticalBarRenderer0.getItemCreateEntity(1, 1);
        double double19 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        java.lang.Boolean boolean21 = statisticalBarRenderer0.getSeriesVisibleInLegend((int) (byte) 1);
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2.0d + "'", double19 == 2.0d);
        org.junit.Assert.assertNull(boolean21);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = statisticalBarRenderer0.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) 'a');
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) (short) -1);
        java.awt.Font font14 = statisticalBarRenderer0.getSeriesItemLabelFont((int) (byte) 100);
        boolean boolean16 = statisticalBarRenderer0.isSeriesItemLabelsVisible(100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer17.setBaseOutlinePaint(paint18);
        boolean boolean20 = statisticalBarRenderer17.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = null;
        statisticalBarRenderer21.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition23, false);
        java.util.EventListener eventListener26 = null;
        boolean boolean27 = statisticalBarRenderer21.hasListener(eventListener26);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator29 = null;
        statisticalBarRenderer21.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator29);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator32 = statisticalBarRenderer21.getSeriesItemLabelGenerator(0);
        java.awt.Font font33 = statisticalBarRenderer21.getBaseItemLabelFont();
        statisticalBarRenderer17.setBaseItemLabelFont(font33);
        boolean boolean35 = statisticalBarRenderer17.getAutoPopulateSeriesPaint();
        java.awt.Paint paint36 = statisticalBarRenderer17.getBaseItemLabelPaint();
        statisticalBarRenderer0.setBaseItemLabelPaint(paint36);
        statisticalBarRenderer0.setItemMargin((double) (short) 10);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(categoryPlot8);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNotNull(itemLabelPosition12);
        org.junit.Assert.assertNull(font14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator32);
        org.junit.Assert.assertNotNull(font33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(paint36);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer0.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) ' ', shape7, false);
        statisticalBarRenderer0.setMaximumBarWidth((double) 10.0f);
        java.awt.Paint paint14 = statisticalBarRenderer0.getItemOutlinePaint((int) (short) -1, (int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition((int) (short) -1);
        java.awt.Paint paint18 = statisticalBarRenderer0.getSeriesOutlinePaint((int) 'a');
        statisticalBarRenderer0.setSeriesVisibleInLegend(0, (java.lang.Boolean) false, false);
        java.awt.Font font24 = statisticalBarRenderer0.getSeriesItemLabelFont(0);
        boolean boolean25 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        double double26 = statisticalBarRenderer0.getBase();
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = statisticalBarRenderer0.getPlot();
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
        org.junit.Assert.assertNull(paint18);
        org.junit.Assert.assertNull(font24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNull(categoryPlot27);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setSeriesPaint(0, paint4);
        java.lang.Object obj6 = null;
        boolean boolean7 = statisticalBarRenderer0.equals(obj6);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = null;
        statisticalBarRenderer9.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition11, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer9.getLegendItemToolTipGenerator();
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer9.setErrorIndicatorPaint(paint15);
        statisticalBarRenderer0.setSeriesPaint(10, paint15);
        java.awt.Font font20 = statisticalBarRenderer0.getItemLabelFont((int) (byte) -1, (int) '4');
        java.awt.Stroke stroke23 = statisticalBarRenderer0.getItemOutlineStroke((int) '#', (int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = null;
        statisticalBarRenderer24.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition26, false);
        java.awt.Stroke stroke31 = statisticalBarRenderer24.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = statisticalBarRenderer24.getPlot();
        java.awt.Paint paint33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer24.setBaseItemLabelPaint(paint33);
        boolean boolean35 = statisticalBarRenderer24.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer36 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition37 = statisticalBarRenderer36.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer36.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape43 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer36.setSeriesShape((int) ' ', shape43, false);
        statisticalBarRenderer36.setMaximumBarWidth((double) 10.0f);
        java.awt.Paint paint50 = statisticalBarRenderer36.getItemOutlinePaint((int) (short) -1, (int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition52 = statisticalBarRenderer36.getSeriesNegativeItemLabelPosition((int) (short) -1);
        java.awt.Paint paint54 = statisticalBarRenderer36.getSeriesOutlinePaint((int) 'a');
        statisticalBarRenderer36.setSeriesVisibleInLegend(0, (java.lang.Boolean) false, false);
        java.awt.Font font60 = statisticalBarRenderer36.getSeriesItemLabelFont(0);
        java.awt.Paint paint61 = statisticalBarRenderer36.getBaseFillPaint();
        java.awt.Shape shape62 = statisticalBarRenderer36.getBaseShape();
        statisticalBarRenderer24.setBaseShape(shape62, true);
        statisticalBarRenderer0.setBaseShape(shape62, false);
        java.awt.Paint paint67 = statisticalBarRenderer0.getBaseItemLabelPaint();
        java.awt.Stroke stroke68 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setBaseOutlineStroke(stroke68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNull(categoryPlot32);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(itemLabelPosition37);
        org.junit.Assert.assertNotNull(shape43);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertNotNull(itemLabelPosition52);
        org.junit.Assert.assertNull(paint54);
        org.junit.Assert.assertNull(font60);
        org.junit.Assert.assertNotNull(paint61);
        org.junit.Assert.assertNotNull(shape62);
        org.junit.Assert.assertNotNull(paint67);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = statisticalBarRenderer0.getPlot();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer9.setBaseOutlinePaint(paint10);
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer9.setSeriesPaint(0, paint13);
        java.lang.Object obj15 = null;
        boolean boolean16 = statisticalBarRenderer9.equals(obj15);
        java.awt.Paint paint18 = statisticalBarRenderer9.lookupSeriesPaint(0);
        statisticalBarRenderer0.setBasePaint(paint18, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer22.setBaseOutlinePaint(paint23);
        boolean boolean25 = statisticalBarRenderer22.isDrawBarOutline();
        statisticalBarRenderer22.setMaximumBarWidth((double) (short) 100);
        statisticalBarRenderer22.setDrawBarOutline(false);
        boolean boolean30 = statisticalBarRenderer22.getAutoPopulateSeriesOutlinePaint();
        java.awt.Stroke stroke31 = statisticalBarRenderer22.getBaseStroke();
        statisticalBarRenderer0.setSeriesOutlineStroke((int) '4', stroke31);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(categoryPlot8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(stroke31);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        java.awt.Paint paint3 = statisticalBarRenderer0.lookupSeriesPaint((int) (short) 0);
        java.awt.Shape shape5 = statisticalBarRenderer0.lookupSeriesShape(0);
        statisticalBarRenderer0.setDrawBarOutline(false);
        java.awt.Paint paint9 = statisticalBarRenderer0.getSeriesFillPaint((int) (short) 0);
        boolean boolean10 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (byte) 1, categoryItemLabelGenerator12, false);
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        double double6 = statisticalBarRenderer0.getItemMargin();
        java.awt.Shape shape8 = statisticalBarRenderer0.getSeriesShape((int) ' ');
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer9 = null;
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer9);
        org.jfree.chart.LegendItem legendItem13 = statisticalBarRenderer0.getLegendItem(0, (int) (short) 10);
        boolean boolean14 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        statisticalBarRenderer0.setBaseCreateEntities(true);
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertNull(legendItem13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) (short) 1, shape9);
        java.lang.Boolean boolean12 = statisticalBarRenderer0.getSeriesVisible((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = null;
        statisticalBarRenderer14.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition16, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator19 = statisticalBarRenderer14.getLegendItemToolTipGenerator();
        java.awt.Stroke stroke21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer14.setSeriesStroke((int) (short) 100, stroke21);
        statisticalBarRenderer0.setSeriesOutlineStroke((int) (byte) 10, stroke21);
        double double24 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        boolean boolean25 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator27 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (byte) 0, categoryItemLabelGenerator27);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator19);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2.0d + "'", double24 == 2.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) (short) 1, shape9);
        java.lang.Boolean boolean12 = statisticalBarRenderer0.getSeriesVisible((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer13.setBaseOutlinePaint(paint14);
        boolean boolean16 = statisticalBarRenderer13.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = statisticalBarRenderer17.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition20 = statisticalBarRenderer17.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer13.setBasePositiveItemLabelPosition(itemLabelPosition20);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition20);
        java.awt.Paint paint25 = statisticalBarRenderer0.getItemPaint(10, (int) (short) -1);
        java.awt.Shape shape26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setBaseShape(shape26, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator29 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator29, false);
        java.awt.Paint paint34 = statisticalBarRenderer0.getItemFillPaint((int) 'a', (int) (byte) -1);
        java.awt.Paint paint37 = statisticalBarRenderer0.getItemOutlinePaint((int) (short) 10, 0);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(itemLabelPosition18);
        org.junit.Assert.assertNotNull(itemLabelPosition20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(paint37);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = statisticalBarRenderer0.getPlot();
        java.awt.Paint paint9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseItemLabelPaint(paint9);
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(false);
        statisticalBarRenderer0.setBaseSeriesVisible(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = null;
        statisticalBarRenderer16.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition18, false);
        java.awt.Stroke stroke23 = statisticalBarRenderer16.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Stroke stroke25 = statisticalBarRenderer16.lookupSeriesOutlineStroke((int) (byte) -1);
        java.awt.Stroke stroke27 = statisticalBarRenderer16.getSeriesOutlineStroke((int) (byte) 0);
        statisticalBarRenderer16.setItemLabelAnchorOffset(0.2d);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator30 = null;
        statisticalBarRenderer16.setBaseURLGenerator(categoryURLGenerator30);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator32 = statisticalBarRenderer16.getBaseURLGenerator();
        statisticalBarRenderer16.setBaseCreateEntities(false);
        boolean boolean36 = statisticalBarRenderer16.isSeriesVisibleInLegend(0);
        java.awt.Font font39 = statisticalBarRenderer16.getItemLabelFont((int) '4', (int) (byte) 10);
        statisticalBarRenderer0.setSeriesItemLabelFont(10, font39, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer42 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition44 = null;
        statisticalBarRenderer42.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition44, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator47 = statisticalBarRenderer42.getLegendItemToolTipGenerator();
        java.awt.Stroke stroke49 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer42.setSeriesStroke((int) (short) 100, stroke49);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke49, false);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(categoryPlot8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNull(stroke27);
        org.junit.Assert.assertNull(categoryURLGenerator32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(font39);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator47);
        org.junit.Assert.assertNotNull(stroke49);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (short) 100, categoryItemLabelGenerator4, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator7 = statisticalBarRenderer0.getLegendItemURLGenerator();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator7);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer0.setSeriesStroke((int) (short) 100, stroke7);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent9 = null;
        statisticalBarRenderer0.notifyListeners(rendererChangeEvent9);
        boolean boolean11 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        int int12 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer13.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = statisticalBarRenderer13.getPlot();
        java.awt.Stroke stroke20 = statisticalBarRenderer13.getItemOutlineStroke(1, 100);
        double double21 = statisticalBarRenderer13.getMinimumBarLength();
        statisticalBarRenderer13.setMaximumBarWidth(10.0d);
        statisticalBarRenderer13.setBaseCreateEntities(true, false);
        java.awt.Font font28 = statisticalBarRenderer13.getSeriesItemLabelFont((int) (short) 10);
        statisticalBarRenderer13.setSeriesVisible(10, (java.lang.Boolean) false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator33 = statisticalBarRenderer13.getSeriesURLGenerator((int) (short) 100);
        int int34 = statisticalBarRenderer13.getRowCount();
        statisticalBarRenderer13.setBaseItemLabelsVisible(false, true);
        boolean boolean38 = statisticalBarRenderer13.getBaseSeriesVisible();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer40 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition42 = null;
        statisticalBarRenderer40.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition42, false);
        java.awt.Paint paint46 = statisticalBarRenderer40.getSeriesPaint((int) (byte) 0);
        boolean boolean47 = statisticalBarRenderer40.getIncludeBaseInRange();
        java.awt.Font font49 = statisticalBarRenderer40.getSeriesItemLabelFont((int) (short) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer50 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer50.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot54 = statisticalBarRenderer50.getPlot();
        java.awt.Paint paint56 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer50.setSeriesOutlinePaint(10, paint56, true);
        double double59 = statisticalBarRenderer50.getLowerClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer61 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition62 = statisticalBarRenderer61.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition64 = statisticalBarRenderer61.getSeriesPositiveItemLabelPosition((int) '#');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer66 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint67 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer66.setBaseOutlinePaint(paint67);
        java.awt.Paint paint70 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer66.setSeriesPaint(0, paint70);
        java.lang.Object obj72 = null;
        boolean boolean73 = statisticalBarRenderer66.equals(obj72);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer75 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition77 = null;
        statisticalBarRenderer75.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition77, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator80 = statisticalBarRenderer75.getLegendItemToolTipGenerator();
        java.awt.Paint paint81 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer75.setErrorIndicatorPaint(paint81);
        statisticalBarRenderer66.setSeriesPaint(10, paint81);
        statisticalBarRenderer61.setSeriesPaint((int) (byte) 10, paint81);
        statisticalBarRenderer50.setSeriesItemLabelPaint(0, paint81, true);
        java.awt.Paint paint88 = statisticalBarRenderer50.lookupSeriesFillPaint((int) (short) 1);
        statisticalBarRenderer40.setBaseItemLabelPaint(paint88);
        statisticalBarRenderer13.setSeriesPaint(10, paint88, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition92 = statisticalBarRenderer13.getBasePositiveItemLabelPosition();
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition92, false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(categoryPlot17);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNull(font28);
        org.junit.Assert.assertNull(categoryURLGenerator33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(paint46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(font49);
        org.junit.Assert.assertNull(categoryPlot54);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertNull(itemLabelPosition62);
        org.junit.Assert.assertNotNull(itemLabelPosition64);
        org.junit.Assert.assertNotNull(paint67);
        org.junit.Assert.assertNotNull(paint70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator80);
        org.junit.Assert.assertNotNull(paint81);
        org.junit.Assert.assertNotNull(paint88);
        org.junit.Assert.assertNotNull(itemLabelPosition92);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        boolean boolean4 = statisticalBarRenderer0.getItemVisible((int) (byte) 100, (int) (byte) 1);
        org.jfree.chart.LegendItem legendItem7 = statisticalBarRenderer0.getLegendItem(0, (int) (byte) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer8.setBaseOutlinePaint(paint9);
        java.awt.Paint paint12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer8.setSeriesPaint(0, paint12);
        java.lang.Object obj14 = null;
        boolean boolean15 = statisticalBarRenderer8.equals(obj14);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = null;
        statisticalBarRenderer17.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition19, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator22 = statisticalBarRenderer17.getLegendItemToolTipGenerator();
        java.awt.Paint paint23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer17.setErrorIndicatorPaint(paint23);
        statisticalBarRenderer8.setSeriesPaint(10, paint23);
        java.awt.Paint paint26 = statisticalBarRenderer8.getBaseOutlinePaint();
        statisticalBarRenderer0.setBaseItemLabelPaint(paint26, true);
        java.awt.Stroke stroke29 = statisticalBarRenderer0.getErrorIndicatorStroke();
        java.awt.Paint paint31 = statisticalBarRenderer0.getSeriesItemLabelPaint((int) (short) 0);
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(legendItem7);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator22);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNull(paint31);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition6 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition(100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition((int) 'a');
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent9 = null;
        statisticalBarRenderer0.notifyListeners(rendererChangeEvent9);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator11);
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNotNull(itemLabelPosition6);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        java.awt.Stroke stroke6 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 1);
        double double7 = statisticalBarRenderer0.getUpperClip();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer10.getNegativeItemLabelPositionFallback();
        boolean boolean14 = statisticalBarRenderer10.getItemVisible((int) (byte) 100, (int) (byte) 1);
        org.jfree.chart.LegendItem legendItem17 = statisticalBarRenderer10.getLegendItem(0, (int) (byte) -1);
        statisticalBarRenderer10.setBaseSeriesVisibleInLegend(false);
        statisticalBarRenderer10.setSeriesCreateEntities(0, (java.lang.Boolean) true);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer23 = statisticalBarRenderer10.getGradientPaintTransformer();
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer23);
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(itemLabelPosition11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(legendItem17);
        org.junit.Assert.assertNotNull(gradientPaintTransformer23);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        statisticalBarRenderer0.setMaximumBarWidth((double) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = statisticalBarRenderer0.getSeriesToolTipGenerator((-1));
        boolean boolean8 = statisticalBarRenderer0.isDrawBarOutline();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator9 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator9);
        boolean boolean11 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Stroke stroke4 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer6.setBaseOutlinePaint(paint7);
        boolean boolean9 = statisticalBarRenderer6.isDrawBarOutline();
        statisticalBarRenderer6.setMaximumBarWidth((double) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator13 = statisticalBarRenderer6.getSeriesToolTipGenerator((-1));
        boolean boolean14 = statisticalBarRenderer6.isDrawBarOutline();
        statisticalBarRenderer6.setBaseCreateEntities(false);
        java.awt.Paint paint17 = statisticalBarRenderer6.getBaseFillPaint();
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesPaint((-1), paint17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer0.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) ' ', shape7, false);
        statisticalBarRenderer0.setMaximumBarWidth((double) 10.0f);
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, false);
        java.awt.Shape shape17 = statisticalBarRenderer0.getItemShape((int) (short) -1, (int) (byte) 100);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator18 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator18);
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape17);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        java.awt.Stroke stroke6 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 1);
        double double7 = statisticalBarRenderer0.getUpperClip();
        int int8 = statisticalBarRenderer0.getRowCount();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation9 = null;
        org.jfree.chart.util.Layer layer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.addAnnotation(categoryAnnotation9, layer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer0.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) ' ', shape7, false);
        statisticalBarRenderer0.setMaximumBarWidth((double) 10.0f);
        java.awt.Paint paint14 = statisticalBarRenderer0.getItemOutlinePaint((int) (short) -1, (int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition((int) (short) -1);
        java.awt.Paint paint18 = statisticalBarRenderer0.getSeriesOutlinePaint((int) 'a');
        statisticalBarRenderer0.setSeriesVisibleInLegend(0, (java.lang.Boolean) false, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 100, itemLabelPosition24);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 100, (java.lang.Boolean) true, true);
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
        org.junit.Assert.assertNull(paint18);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer0.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        int int6 = statisticalBarRenderer0.getColumnCount();
        java.awt.Paint paint9 = statisticalBarRenderer0.getItemFillPaint((int) (byte) 10, (int) '#');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer10.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = statisticalBarRenderer10.getPlot();
        java.awt.Shape shape17 = statisticalBarRenderer10.getItemShape((int) (short) -1, (int) (short) -1);
        statisticalBarRenderer0.setBaseShape(shape17);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer20.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        java.awt.Paint paint24 = statisticalBarRenderer20.getBaseOutlinePaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator26 = null;
        statisticalBarRenderer20.setSeriesToolTipGenerator(10, categoryToolTipGenerator26, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition31 = null;
        statisticalBarRenderer29.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition31, false);
        java.awt.Paint paint34 = statisticalBarRenderer29.getBaseItemLabelPaint();
        statisticalBarRenderer29.setBaseCreateEntities(false, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator38 = statisticalBarRenderer29.getLegendItemURLGenerator();
        java.lang.Boolean boolean40 = statisticalBarRenderer29.getSeriesVisibleInLegend((int) (short) 1);
        java.awt.Stroke stroke42 = statisticalBarRenderer29.lookupSeriesStroke((int) 'a');
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer43 = statisticalBarRenderer29.getGradientPaintTransformer();
        statisticalBarRenderer20.setGradientPaintTransformer(gradientPaintTransformer43);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer45 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer45.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot49 = statisticalBarRenderer45.getPlot();
        java.awt.Paint paint51 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer45.setSeriesOutlinePaint(10, paint51, true);
        java.awt.Shape shape55 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer45.setSeriesShape((int) (byte) 1, shape55, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer58 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint59 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer58.setBaseOutlinePaint(paint59);
        boolean boolean61 = statisticalBarRenderer58.isDrawBarOutline();
        statisticalBarRenderer58.setMaximumBarWidth((double) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator65 = statisticalBarRenderer58.getSeriesToolTipGenerator((-1));
        double double66 = statisticalBarRenderer58.getMinimumBarLength();
        java.awt.Paint paint69 = statisticalBarRenderer58.getItemOutlinePaint((int) 'a', 10);
        statisticalBarRenderer45.setBaseOutlinePaint(paint69, true);
        statisticalBarRenderer20.setBaseFillPaint(paint69);
        java.awt.Font font75 = statisticalBarRenderer20.getItemLabelFont((int) (byte) 1, (int) (short) 10);
        statisticalBarRenderer0.setSeriesItemLabelFont((int) (byte) 0, font75, true);
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNull(categoryPlot14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator38);
        org.junit.Assert.assertNull(boolean40);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(gradientPaintTransformer43);
        org.junit.Assert.assertNull(categoryPlot49);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(shape55);
        org.junit.Assert.assertNotNull(paint59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator65);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertNotNull(paint69);
        org.junit.Assert.assertNotNull(font75);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        statisticalBarRenderer2.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition4, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator7 = statisticalBarRenderer2.getLegendItemToolTipGenerator();
        java.awt.Paint paint8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer2.setErrorIndicatorPaint(paint8);
        statisticalBarRenderer2.setItemLabelAnchorOffset((double) 10.0f);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition15 = null;
        statisticalBarRenderer13.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition15, false);
        java.awt.Stroke stroke20 = statisticalBarRenderer13.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape22 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer13.setSeriesShape((int) (short) 1, shape22);
        java.lang.Boolean boolean25 = statisticalBarRenderer13.getSeriesVisible((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer26.setBaseOutlinePaint(paint27);
        boolean boolean29 = statisticalBarRenderer26.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition31 = statisticalBarRenderer30.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition33 = statisticalBarRenderer30.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer26.setBasePositiveItemLabelPosition(itemLabelPosition33);
        statisticalBarRenderer13.setBaseNegativeItemLabelPosition(itemLabelPosition33);
        statisticalBarRenderer2.setSeriesNegativeItemLabelPosition((int) (short) 10, itemLabelPosition33);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition33);
        double double38 = statisticalBarRenderer0.getMaximumBarWidth();
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator7);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(itemLabelPosition31);
        org.junit.Assert.assertNotNull(itemLabelPosition33);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) (short) 1, shape9);
        java.lang.Boolean boolean12 = statisticalBarRenderer0.getSeriesVisible((int) (byte) 0);
        boolean boolean15 = statisticalBarRenderer0.getItemVisible((int) 'a', (int) (byte) 10);
        boolean boolean16 = statisticalBarRenderer0.getBaseCreateEntities();
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer0.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) ' ', shape7, false);
        statisticalBarRenderer0.setMaximumBarWidth((double) 10.0f);
        java.awt.Paint paint14 = statisticalBarRenderer0.getItemOutlinePaint((int) (short) -1, (int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition((int) (short) -1);
        java.awt.Paint paint18 = statisticalBarRenderer0.getSeriesOutlinePaint((int) 'a');
        statisticalBarRenderer0.setSeriesVisibleInLegend(0, (java.lang.Boolean) false, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 100, itemLabelPosition24);
        java.awt.Stroke stroke27 = statisticalBarRenderer0.getSeriesStroke((int) (short) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer28 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition30 = null;
        statisticalBarRenderer28.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition30, false);
        java.awt.Paint paint33 = statisticalBarRenderer28.getBaseItemLabelPaint();
        statisticalBarRenderer0.setBasePaint(paint33, false);
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
        org.junit.Assert.assertNull(paint18);
        org.junit.Assert.assertNull(stroke27);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Stroke stroke4 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = statisticalBarRenderer0.getToolTipGenerator(0, 0);
        boolean boolean8 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        statisticalBarRenderer0.setSeriesCreateEntities((int) ' ', (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = null;
        statisticalBarRenderer14.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition16, false);
        java.awt.Stroke stroke21 = statisticalBarRenderer14.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Stroke stroke23 = statisticalBarRenderer14.lookupSeriesOutlineStroke((int) (byte) -1);
        java.awt.Font font26 = statisticalBarRenderer14.getItemLabelFont((int) (short) 0, 10);
        statisticalBarRenderer0.setBaseItemLabelFont(font26, false);
        java.util.EventListener eventListener29 = null;
        boolean boolean30 = statisticalBarRenderer0.hasListener(eventListener29);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        double double6 = statisticalBarRenderer0.getItemMargin();
        boolean boolean8 = statisticalBarRenderer0.isSeriesVisible((int) (short) 100);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (byte) 10, categoryURLGenerator10, true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        java.awt.Paint paint6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setErrorIndicatorPaint(paint6);
        java.awt.Stroke stroke8 = statisticalBarRenderer0.getBaseOutlineStroke();
        statisticalBarRenderer0.setSeriesVisible(1, (java.lang.Boolean) true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition15 = null;
        statisticalBarRenderer13.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition15, false);
        java.util.EventListener eventListener18 = null;
        boolean boolean19 = statisticalBarRenderer13.hasListener(eventListener18);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = null;
        statisticalBarRenderer13.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator21);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = statisticalBarRenderer13.getSeriesItemLabelGenerator(0);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer25 = null;
        statisticalBarRenderer13.setGradientPaintTransformer(gradientPaintTransformer25);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator27 = statisticalBarRenderer13.getLegendItemLabelGenerator();
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator27);
        java.awt.Graphics2D graphics2D29 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = null;
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawRangeGridline(graphics2D29, categoryPlot30, valueAxis31, rectangle2D32, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator24);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator27);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        double double6 = statisticalBarRenderer0.getItemMargin();
        java.awt.Shape shape8 = statisticalBarRenderer0.getSeriesShape((int) ' ');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = null;
        statisticalBarRenderer9.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition11, false);
        java.awt.Stroke stroke16 = statisticalBarRenderer9.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Stroke stroke18 = statisticalBarRenderer9.lookupSeriesOutlineStroke((int) (byte) -1);
        java.awt.Font font21 = statisticalBarRenderer9.getItemLabelFont((int) (short) 0, 10);
        statisticalBarRenderer0.setBaseItemLabelFont(font21, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer26.setBaseOutlinePaint(paint27);
        boolean boolean29 = statisticalBarRenderer26.isDrawBarOutline();
        boolean boolean30 = statisticalBarRenderer26.getBaseItemLabelsVisible();
        int int31 = statisticalBarRenderer26.getColumnCount();
        double double32 = statisticalBarRenderer26.getItemMargin();
        java.awt.Shape shape35 = statisticalBarRenderer26.getItemShape(1, (int) (byte) 10);
        java.lang.Boolean boolean37 = statisticalBarRenderer26.getSeriesVisible(1);
        int int38 = statisticalBarRenderer26.getPassCount();
        statisticalBarRenderer26.setAutoPopulateSeriesOutlineStroke(true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition43 = statisticalBarRenderer26.getPositiveItemLabelPosition((int) (byte) -1, (int) (byte) 0);
        statisticalBarRenderer0.setSeriesNegativeItemLabelPosition((int) (short) 100, itemLabelPosition43, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator46 = statisticalBarRenderer0.getBaseToolTipGenerator();
        boolean boolean49 = statisticalBarRenderer0.getItemCreateEntity((int) (byte) -1, 0);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(font21);
        org.junit.Assert.assertNull(itemLabelPosition24);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.2d + "'", double32 == 0.2d);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertNull(boolean37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(itemLabelPosition43);
        org.junit.Assert.assertNull(categoryToolTipGenerator46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        java.awt.Paint paint6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setErrorIndicatorPaint(paint6);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        statisticalBarRenderer0.setSeriesURLGenerator(0, categoryURLGenerator9);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = statisticalBarRenderer0.getBasePositiveItemLabelPosition();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Paint paint14 = statisticalBarRenderer0.getErrorIndicatorPaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator16 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (short) 100, categoryToolTipGenerator16, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator19, false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) (short) 1, shape9);
        java.lang.Boolean boolean12 = statisticalBarRenderer0.getSeriesVisible((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer13.setBaseOutlinePaint(paint14);
        boolean boolean16 = statisticalBarRenderer13.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = statisticalBarRenderer17.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition20 = statisticalBarRenderer17.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer13.setBasePositiveItemLabelPosition(itemLabelPosition20);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition20);
        java.awt.Font font25 = statisticalBarRenderer0.getItemLabelFont((int) (short) 0, (-1));
        java.awt.Font font27 = statisticalBarRenderer0.getSeriesItemLabelFont(1);
        java.awt.Shape shape29 = statisticalBarRenderer0.lookupSeriesShape((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition32 = null;
        statisticalBarRenderer30.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition32, false);
        java.util.EventListener eventListener35 = null;
        boolean boolean36 = statisticalBarRenderer30.hasListener(eventListener35);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator38 = null;
        statisticalBarRenderer30.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator38);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator41 = statisticalBarRenderer30.getSeriesItemLabelGenerator(0);
        java.awt.Font font42 = statisticalBarRenderer30.getBaseItemLabelFont();
        java.awt.Stroke stroke43 = statisticalBarRenderer30.getBaseOutlineStroke();
        statisticalBarRenderer0.setErrorIndicatorStroke(stroke43);
        java.awt.Paint paint47 = statisticalBarRenderer0.getItemLabelPaint((int) (short) 1, (int) '4');
        double double48 = statisticalBarRenderer0.getItemMargin();
        java.lang.Object obj49 = statisticalBarRenderer0.clone();
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(itemLabelPosition18);
        org.junit.Assert.assertNotNull(itemLabelPosition20);
        org.junit.Assert.assertNotNull(font25);
        org.junit.Assert.assertNull(font27);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator41);
        org.junit.Assert.assertNotNull(font42);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.2d + "'", double48 == 0.2d);
        org.junit.Assert.assertNotNull(obj49);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        boolean boolean6 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition9 = null;
        statisticalBarRenderer7.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition9, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator12 = statisticalBarRenderer7.getLegendItemToolTipGenerator();
        java.awt.Stroke stroke14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer7.setSeriesStroke((int) (short) 100, stroke14);
        statisticalBarRenderer7.setBaseItemLabelsVisible(false);
        boolean boolean20 = statisticalBarRenderer7.isItemLabelVisible((int) (byte) 1, (int) 'a');
        statisticalBarRenderer7.setSeriesItemLabelsVisible(0, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = statisticalBarRenderer7.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition24, false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition24);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        statisticalBarRenderer0.setDrawBarOutline(false);
        java.awt.Stroke stroke7 = null;
        statisticalBarRenderer0.setSeriesOutlineStroke((int) (short) 0, stroke7, true);
        java.awt.Paint paint12 = statisticalBarRenderer0.getItemPaint(10, (-1));
        java.awt.Shape shape14 = statisticalBarRenderer0.getSeriesShape((int) (short) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = null;
        statisticalBarRenderer15.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition17, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator20 = statisticalBarRenderer15.getLegendItemToolTipGenerator();
        java.awt.Stroke stroke22 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer15.setSeriesStroke((int) (short) 100, stroke22);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent24 = null;
        statisticalBarRenderer15.notifyListeners(rendererChangeEvent24);
        statisticalBarRenderer15.setSeriesVisible((int) 'a', (java.lang.Boolean) false, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition31 = statisticalBarRenderer15.getSeriesNegativeItemLabelPosition(100);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition31, true);
        java.lang.Boolean boolean35 = statisticalBarRenderer0.getSeriesVisibleInLegend((int) (short) 1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator37 = statisticalBarRenderer0.getSeriesURLGenerator((int) (short) 100);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator39 = statisticalBarRenderer0.getSeriesItemLabelGenerator(1);
        boolean boolean40 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator20);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(itemLabelPosition31);
        org.junit.Assert.assertNull(boolean35);
        org.junit.Assert.assertNull(categoryURLGenerator37);
        org.junit.Assert.assertNull(categoryItemLabelGenerator39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getBaseItemLabelPaint();
        java.awt.Paint paint7 = statisticalBarRenderer0.getSeriesPaint((-1));
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer8.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = statisticalBarRenderer8.getPlot();
        java.awt.Paint paint14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer8.setSeriesOutlinePaint(10, paint14, true);
        java.awt.Shape shape18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer8.setSeriesShape((int) (byte) 1, shape18, true);
        java.awt.Paint paint21 = statisticalBarRenderer8.getBaseFillPaint();
        statisticalBarRenderer0.setBasePaint(paint21);
        java.awt.Graphics2D graphics2D23 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = null;
        java.awt.geom.Rectangle2D rectangle2D25 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawBackground(graphics2D23, categoryPlot24, rectangle2D25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(categoryPlot12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        java.awt.Paint paint4 = statisticalBarRenderer0.getBaseOutlinePaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator(10, categoryToolTipGenerator6, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = null;
        statisticalBarRenderer9.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition11, false);
        java.awt.Paint paint14 = statisticalBarRenderer9.getBaseItemLabelPaint();
        statisticalBarRenderer9.setBaseCreateEntities(false, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = statisticalBarRenderer9.getLegendItemURLGenerator();
        java.lang.Boolean boolean20 = statisticalBarRenderer9.getSeriesVisibleInLegend((int) (short) 1);
        java.awt.Stroke stroke22 = statisticalBarRenderer9.lookupSeriesStroke((int) 'a');
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer23 = statisticalBarRenderer9.getGradientPaintTransformer();
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer23);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer25.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = statisticalBarRenderer25.getPlot();
        java.awt.Paint paint31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer25.setSeriesOutlinePaint(10, paint31, true);
        java.awt.Shape shape35 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer25.setSeriesShape((int) (byte) 1, shape35, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer38 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer38.setBaseOutlinePaint(paint39);
        boolean boolean41 = statisticalBarRenderer38.isDrawBarOutline();
        statisticalBarRenderer38.setMaximumBarWidth((double) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator45 = statisticalBarRenderer38.getSeriesToolTipGenerator((-1));
        double double46 = statisticalBarRenderer38.getMinimumBarLength();
        java.awt.Paint paint49 = statisticalBarRenderer38.getItemOutlinePaint((int) 'a', 10);
        statisticalBarRenderer25.setBaseOutlinePaint(paint49, true);
        statisticalBarRenderer0.setBaseFillPaint(paint49);
        java.awt.Font font55 = statisticalBarRenderer0.getItemLabelFont((int) (byte) 1, (int) (short) 10);
        boolean boolean56 = statisticalBarRenderer0.getBaseSeriesVisible();
        java.awt.Graphics2D graphics2D57 = null;
        java.awt.geom.Rectangle2D rectangle2D58 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis59 = null;
        org.jfree.chart.axis.ValueAxis valueAxis60 = null;
        org.jfree.chart.util.Layer layer61 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo62 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawAnnotations(graphics2D57, rectangle2D58, categoryAxis59, valueAxis60, layer61, plotRenderingInfo62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(gradientPaintTransformer23);
        org.junit.Assert.assertNull(categoryPlot29);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(font55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = statisticalBarRenderer0.hasListener(eventListener5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator8);
        java.awt.Paint paint11 = statisticalBarRenderer0.getSeriesFillPaint((int) ' ');
        double double12 = statisticalBarRenderer0.getItemMargin();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        double double14 = statisticalBarRenderer0.getMinimumBarLength();
        boolean boolean15 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2d + "'", double12 == 0.2d);
        org.junit.Assert.assertNull(itemLabelPosition13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        boolean boolean4 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        int int5 = statisticalBarRenderer0.getColumnCount();
        double double6 = statisticalBarRenderer0.getItemMargin();
        java.awt.Shape shape9 = statisticalBarRenderer0.getItemShape(1, (int) (byte) 10);
        boolean boolean10 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        java.awt.Paint paint12 = statisticalBarRenderer0.getSeriesOutlinePaint((int) (byte) 1);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator13 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer15.setBaseOutlinePaint(paint16);
        boolean boolean18 = statisticalBarRenderer15.isDrawBarOutline();
        statisticalBarRenderer15.setMaximumBarWidth((double) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator22 = statisticalBarRenderer15.getSeriesToolTipGenerator((-1));
        statisticalBarRenderer15.setSeriesVisible((int) (short) 10, (java.lang.Boolean) true);
        boolean boolean26 = statisticalBarRenderer15.getBaseItemLabelsVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator28 = statisticalBarRenderer15.getSeriesItemLabelGenerator((int) (short) 100);
        java.awt.Stroke stroke29 = statisticalBarRenderer15.getBaseOutlineStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition32 = null;
        statisticalBarRenderer30.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition32, false);
        java.awt.Paint paint36 = statisticalBarRenderer30.getSeriesFillPaint((int) (byte) 0);
        org.jfree.chart.LegendItem legendItem39 = statisticalBarRenderer30.getLegendItem((int) (short) 100, (int) 'a');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer40 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint41 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer40.setBaseOutlinePaint(paint41);
        boolean boolean43 = statisticalBarRenderer40.isDrawBarOutline();
        statisticalBarRenderer40.setDrawBarOutline(false);
        java.awt.Stroke stroke47 = null;
        statisticalBarRenderer40.setSeriesOutlineStroke((int) (short) 0, stroke47, true);
        java.awt.Paint paint52 = statisticalBarRenderer40.getItemFillPaint(1, (int) ' ');
        statisticalBarRenderer30.setBasePaint(paint52);
        statisticalBarRenderer15.setBasePaint(paint52, true);
        statisticalBarRenderer0.setSeriesFillPaint((int) 'a', paint52);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNull(paint36);
        org.junit.Assert.assertNull(legendItem39);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(paint52);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke(1, 100);
        double double8 = statisticalBarRenderer0.getMinimumBarLength();
        statisticalBarRenderer0.setMaximumBarWidth(10.0d);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        org.jfree.chart.LegendItem legendItem16 = statisticalBarRenderer0.getLegendItem((int) (byte) 1, (int) '#');
        boolean boolean17 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(legendItem16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        java.awt.Paint paint4 = statisticalBarRenderer0.getBaseFillPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) ' ');
        java.awt.Paint paint8 = null;
        statisticalBarRenderer0.setSeriesItemLabelPaint(0, paint8);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNull(categoryItemLabelGenerator6);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) '#');
        boolean boolean4 = statisticalBarRenderer0.getBaseSeriesVisible();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition5 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        java.awt.Paint paint6 = statisticalBarRenderer0.getBaseFillPaint();
        double double7 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = statisticalBarRenderer0.getBaseToolTipGenerator();
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNotNull(itemLabelPosition3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(itemLabelPosition5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0d + "'", double7 == 2.0d);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        statisticalBarRenderer0.setMaximumBarWidth((double) (short) 100);
        statisticalBarRenderer0.setDrawBarOutline(false);
        boolean boolean8 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier9 = statisticalBarRenderer0.getDrawingSupplier();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(drawingSupplier9);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        boolean boolean2 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer3 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition5 = null;
        statisticalBarRenderer3.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition5, false);
        java.awt.Stroke stroke10 = statisticalBarRenderer3.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer3.setSeriesShape((int) (short) 1, shape12);
        boolean boolean14 = statisticalBarRenderer3.isDrawBarOutline();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = statisticalBarRenderer3.getPlot();
        statisticalBarRenderer3.setBaseItemLabelsVisible(false, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition20 = statisticalBarRenderer3.getSeriesNegativeItemLabelPosition((int) (byte) 100);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition20);
        statisticalBarRenderer0.setBaseItemLabelsVisible(false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer26.setBaseOutlinePaint(paint27);
        boolean boolean29 = statisticalBarRenderer26.isDrawBarOutline();
        statisticalBarRenderer26.setMaximumBarWidth((double) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator33 = statisticalBarRenderer26.getSeriesToolTipGenerator((-1));
        java.lang.Boolean boolean35 = statisticalBarRenderer26.getSeriesVisibleInLegend((int) (short) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition39 = null;
        statisticalBarRenderer37.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition39, false);
        java.awt.Paint paint42 = statisticalBarRenderer37.getBaseItemLabelPaint();
        statisticalBarRenderer37.setBaseCreateEntities(false, false);
        boolean boolean46 = statisticalBarRenderer37.getAutoPopulateSeriesStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer48 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition49 = statisticalBarRenderer48.getNegativeItemLabelPositionFallback();
        java.awt.Paint paint51 = statisticalBarRenderer48.lookupSeriesPaint((int) (short) 0);
        statisticalBarRenderer37.setSeriesOutlinePaint(0, paint51, true);
        statisticalBarRenderer26.setSeriesFillPaint(1, paint51);
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesItemLabelPaint((-1), paint51, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(categoryPlot15);
        org.junit.Assert.assertNotNull(itemLabelPosition20);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator33);
        org.junit.Assert.assertNull(boolean35);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(itemLabelPosition49);
        org.junit.Assert.assertNotNull(paint51);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        java.awt.Paint paint6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint6, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer9.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = statisticalBarRenderer9.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition15 = statisticalBarRenderer9.getSeriesNegativeItemLabelPosition(100);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition15);
        java.awt.Stroke stroke18 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (short) 0);
        java.awt.Font font21 = statisticalBarRenderer0.getItemLabelFont((int) '4', 0);
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(categoryPlot13);
        org.junit.Assert.assertNotNull(itemLabelPosition15);
        org.junit.Assert.assertNull(stroke18);
        org.junit.Assert.assertNotNull(font21);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setSeriesPaint(0, paint4);
        java.lang.Object obj6 = null;
        boolean boolean7 = statisticalBarRenderer0.equals(obj6);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = null;
        statisticalBarRenderer9.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition11, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer9.getLegendItemToolTipGenerator();
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer9.setErrorIndicatorPaint(paint15);
        statisticalBarRenderer0.setSeriesPaint(10, paint15);
        java.awt.Font font20 = statisticalBarRenderer0.getItemLabelFont((int) (byte) -1, (int) '4');
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        java.awt.Paint paint23 = null;
        statisticalBarRenderer0.setSeriesItemLabelPaint(0, paint23);
        statisticalBarRenderer0.setItemMargin((double) (short) -1);
        java.awt.Font font28 = statisticalBarRenderer0.getSeriesItemLabelFont((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer29.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot33 = statisticalBarRenderer29.getPlot();
        java.awt.Paint paint35 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer29.setSeriesOutlinePaint(10, paint35, true);
        java.awt.Shape shape39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer29.setSeriesShape((int) (byte) 1, shape39, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator43 = statisticalBarRenderer29.getSeriesURLGenerator((int) 'a');
        statisticalBarRenderer29.setSeriesCreateEntities(10, (java.lang.Boolean) false);
        java.awt.Shape shape48 = statisticalBarRenderer29.lookupSeriesShape((int) (byte) -1);
        statisticalBarRenderer0.setBaseShape(shape48);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNull(categoryItemLabelGenerator21);
        org.junit.Assert.assertNull(font28);
        org.junit.Assert.assertNull(categoryPlot33);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertNull(categoryURLGenerator43);
        org.junit.Assert.assertNotNull(shape48);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        double double3 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        double double6 = statisticalBarRenderer0.getBase();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer8.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = statisticalBarRenderer8.getPlot();
        java.awt.Font font13 = statisticalBarRenderer8.getBaseItemLabelFont();
        statisticalBarRenderer0.setSeriesItemLabelFont((int) (byte) 1, font13, false);
        boolean boolean16 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator18 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) '#', categoryToolTipGenerator18, true);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0d + "'", double3 == 2.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(categoryPlot12);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        java.awt.Paint paint6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint6, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer9.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = statisticalBarRenderer9.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition15 = statisticalBarRenderer9.getSeriesNegativeItemLabelPosition(100);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition15);
        java.awt.Stroke stroke17 = statisticalBarRenderer0.getBaseOutlineStroke();
        java.awt.Font font19 = statisticalBarRenderer0.getSeriesItemLabelFont((int) (byte) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator21 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator(1, categoryToolTipGenerator21);
        java.awt.Paint paint25 = statisticalBarRenderer0.getItemLabelPaint((int) (short) 100, (int) ' ');
        statisticalBarRenderer0.setIncludeBaseInRange(false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator29 = statisticalBarRenderer0.getSeriesURLGenerator(1);
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(categoryPlot13);
        org.junit.Assert.assertNotNull(itemLabelPosition15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(font19);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNull(categoryURLGenerator29);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        statisticalBarRenderer0.setMaximumBarWidth((double) (short) 100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition(10);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator9 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (short) 0, categoryToolTipGenerator9, true);
        java.awt.Stroke stroke13 = statisticalBarRenderer0.getSeriesStroke(0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer15.setBaseOutlinePaint(paint16);
        boolean boolean18 = statisticalBarRenderer15.isDrawBarOutline();
        statisticalBarRenderer15.setDrawBarOutline(false);
        java.awt.Stroke stroke22 = null;
        statisticalBarRenderer15.setSeriesOutlineStroke((int) (short) 0, stroke22, true);
        java.awt.Paint paint27 = statisticalBarRenderer15.getItemPaint(10, (-1));
        java.awt.Shape shape29 = statisticalBarRenderer15.getSeriesShape((int) (short) 100);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation30 = null;
        boolean boolean31 = statisticalBarRenderer15.removeAnnotation(categoryAnnotation30);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator32 = statisticalBarRenderer15.getLegendItemToolTipGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer33 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition35 = null;
        statisticalBarRenderer33.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition35, false);
        java.awt.Paint paint39 = statisticalBarRenderer33.getSeriesFillPaint((int) (byte) 0);
        boolean boolean42 = statisticalBarRenderer33.getItemCreateEntity((int) '4', (int) 'a');
        java.awt.Paint paint45 = statisticalBarRenderer33.getItemPaint(1, (int) (short) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer46 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition48 = null;
        statisticalBarRenderer46.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition48, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator51 = statisticalBarRenderer46.getLegendItemToolTipGenerator();
        java.awt.Stroke stroke53 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer46.setSeriesStroke((int) (short) 100, stroke53);
        statisticalBarRenderer46.setBaseItemLabelsVisible(false);
        boolean boolean59 = statisticalBarRenderer46.isItemLabelVisible((int) (byte) 1, (int) 'a');
        statisticalBarRenderer46.setSeriesItemLabelsVisible(0, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer63 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint64 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer63.setBaseOutlinePaint(paint64);
        boolean boolean66 = statisticalBarRenderer63.isDrawBarOutline();
        statisticalBarRenderer63.setMaximumBarWidth((double) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator70 = statisticalBarRenderer63.getSeriesToolTipGenerator((-1));
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition73 = statisticalBarRenderer63.getNegativeItemLabelPosition(100, (int) (short) -1);
        statisticalBarRenderer46.setBasePositiveItemLabelPosition(itemLabelPosition73);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer75 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint76 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer75.setBaseOutlinePaint(paint76);
        java.awt.Paint paint79 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer75.setSeriesPaint(0, paint79);
        java.lang.Object obj81 = null;
        boolean boolean82 = statisticalBarRenderer75.equals(obj81);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer84 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition86 = null;
        statisticalBarRenderer84.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition86, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator89 = statisticalBarRenderer84.getLegendItemToolTipGenerator();
        java.awt.Paint paint90 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer84.setErrorIndicatorPaint(paint90);
        statisticalBarRenderer75.setSeriesPaint(10, paint90);
        statisticalBarRenderer46.setBasePaint(paint90, true);
        statisticalBarRenderer33.setErrorIndicatorPaint(paint90);
        statisticalBarRenderer15.setErrorIndicatorPaint(paint90);
        statisticalBarRenderer0.setSeriesPaint(0, paint90);
        org.jfree.chart.plot.CategoryPlot categoryPlot98 = statisticalBarRenderer0.getPlot();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertNull(stroke13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator32);
        org.junit.Assert.assertNull(paint39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator51);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(paint64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator70);
        org.junit.Assert.assertNotNull(itemLabelPosition73);
        org.junit.Assert.assertNotNull(paint76);
        org.junit.Assert.assertNotNull(paint79);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator89);
        org.junit.Assert.assertNotNull(paint90);
        org.junit.Assert.assertNull(categoryPlot98);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        java.awt.Paint paint3 = statisticalBarRenderer0.getSeriesFillPaint((int) 'a');
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (byte) 0, categoryItemLabelGenerator5);
        org.jfree.chart.LegendItem legendItem9 = statisticalBarRenderer0.getLegendItem(0, 1);
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNull(paint3);
        org.junit.Assert.assertNull(legendItem9);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setSeriesPaint(0, paint4);
        java.lang.Object obj6 = null;
        boolean boolean7 = statisticalBarRenderer0.equals(obj6);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = null;
        statisticalBarRenderer9.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition11, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer9.getLegendItemToolTipGenerator();
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer9.setErrorIndicatorPaint(paint15);
        statisticalBarRenderer0.setSeriesPaint(10, paint15);
        statisticalBarRenderer0.setBaseSeriesVisible(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = null;
        statisticalBarRenderer21.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition23, false);
        java.awt.Stroke stroke28 = statisticalBarRenderer21.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer21.setSeriesShape((int) (short) 1, shape30);
        java.lang.Boolean boolean33 = statisticalBarRenderer21.getSeriesVisible((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer34 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint35 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer34.setBaseOutlinePaint(paint35);
        boolean boolean37 = statisticalBarRenderer34.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer38 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition39 = statisticalBarRenderer38.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition41 = statisticalBarRenderer38.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer34.setBasePositiveItemLabelPosition(itemLabelPosition41);
        statisticalBarRenderer21.setBaseNegativeItemLabelPosition(itemLabelPosition41);
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (byte) 0, itemLabelPosition41);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator45 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator45);
        org.jfree.chart.plot.CategoryPlot categoryPlot47 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setPlot(categoryPlot47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNull(boolean33);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(itemLabelPosition39);
        org.junit.Assert.assertNotNull(itemLabelPosition41);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = statisticalBarRenderer0.getItemLabelGenerator((int) (byte) 10, (int) '4');
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator8);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer10.setBaseOutlinePaint(paint11);
        boolean boolean13 = statisticalBarRenderer10.getAutoPopulateSeriesShape();
        java.awt.Paint paint15 = statisticalBarRenderer10.lookupSeriesPaint((int) (short) 0);
        statisticalBarRenderer0.setBaseOutlinePaint(paint15, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = statisticalBarRenderer0.getSeriesItemLabelGenerator(100);
        java.lang.Boolean boolean21 = statisticalBarRenderer0.getSeriesCreateEntities((int) 'a');
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) 10.0f);
        boolean boolean24 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        org.junit.Assert.assertNull(categoryItemLabelGenerator7);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryItemLabelGenerator19);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        java.lang.Boolean boolean9 = statisticalBarRenderer0.getSeriesVisible((int) (byte) 0);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator10, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = null;
        statisticalBarRenderer14.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition16, false);
        java.awt.Paint paint20 = statisticalBarRenderer14.lookupSeriesFillPaint(0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = statisticalBarRenderer14.getSeriesPositiveItemLabelPosition((int) (byte) -1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = null;
        statisticalBarRenderer14.setBaseURLGenerator(categoryURLGenerator23, true);
        java.awt.Font font26 = statisticalBarRenderer14.getBaseItemLabelFont();
        boolean boolean27 = statisticalBarRenderer14.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer28 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition30 = null;
        statisticalBarRenderer28.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition30, false);
        java.util.EventListener eventListener33 = null;
        boolean boolean34 = statisticalBarRenderer28.hasListener(eventListener33);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator36 = null;
        statisticalBarRenderer28.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator36);
        java.awt.Paint paint39 = statisticalBarRenderer28.getSeriesFillPaint((int) ' ');
        java.awt.Paint paint40 = statisticalBarRenderer28.getErrorIndicatorPaint();
        statisticalBarRenderer14.setErrorIndicatorPaint(paint40);
        statisticalBarRenderer0.setSeriesItemLabelPaint((int) (byte) 10, paint40);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(itemLabelPosition22);
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(paint39);
        org.junit.Assert.assertNotNull(paint40);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = statisticalBarRenderer0.getPlot();
        java.awt.Stroke stroke9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer0.setBaseOutlineStroke(stroke9);
        statisticalBarRenderer0.setSeriesCreateEntities(1, (java.lang.Boolean) true, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) ' ');
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(categoryPlot8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setSeriesPaint(0, paint4);
        java.lang.Object obj6 = null;
        boolean boolean7 = statisticalBarRenderer0.equals(obj6);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = null;
        statisticalBarRenderer9.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition11, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer9.getLegendItemToolTipGenerator();
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer9.setErrorIndicatorPaint(paint15);
        statisticalBarRenderer0.setSeriesPaint(10, paint15);
        statisticalBarRenderer0.setBaseSeriesVisible(true);
        statisticalBarRenderer0.setBaseSeriesVisible(false);
        java.awt.Paint paint22 = statisticalBarRenderer0.getBaseItemLabelPaint();
        java.awt.Shape shape23 = statisticalBarRenderer0.getBaseShape();
        org.jfree.chart.event.RendererChangeListener rendererChangeListener24 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.addChangeListener(rendererChangeListener24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(shape23);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Paint paint6 = statisticalBarRenderer0.getSeriesFillPaint((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer7.setBaseOutlinePaint(paint8);
        boolean boolean10 = statisticalBarRenderer7.isDrawBarOutline();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator11 = null;
        statisticalBarRenderer7.setBaseURLGenerator(categoryURLGenerator11);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer13.setBaseOutlinePaint(paint14);
        boolean boolean16 = statisticalBarRenderer13.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = null;
        statisticalBarRenderer17.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition19, false);
        java.util.EventListener eventListener22 = null;
        boolean boolean23 = statisticalBarRenderer17.hasListener(eventListener22);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator25 = null;
        statisticalBarRenderer17.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator25);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator28 = statisticalBarRenderer17.getSeriesItemLabelGenerator(0);
        java.awt.Font font29 = statisticalBarRenderer17.getBaseItemLabelFont();
        statisticalBarRenderer13.setBaseItemLabelFont(font29);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator32 = null;
        statisticalBarRenderer13.setSeriesItemLabelGenerator((int) (byte) 1, categoryItemLabelGenerator32);
        java.awt.Shape shape35 = statisticalBarRenderer13.lookupSeriesShape((int) (short) 0);
        java.awt.Shape shape36 = statisticalBarRenderer13.getBaseShape();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint38 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer37.setBaseOutlinePaint(paint38);
        boolean boolean40 = statisticalBarRenderer37.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer41 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition43 = null;
        statisticalBarRenderer41.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition43, false);
        java.util.EventListener eventListener46 = null;
        boolean boolean47 = statisticalBarRenderer41.hasListener(eventListener46);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator49 = null;
        statisticalBarRenderer41.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator49);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator52 = statisticalBarRenderer41.getSeriesItemLabelGenerator(0);
        java.awt.Font font53 = statisticalBarRenderer41.getBaseItemLabelFont();
        statisticalBarRenderer37.setBaseItemLabelFont(font53);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator56 = null;
        statisticalBarRenderer37.setSeriesItemLabelGenerator((int) (byte) 1, categoryItemLabelGenerator56);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer58 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition59 = statisticalBarRenderer58.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition61 = statisticalBarRenderer58.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer37.setNegativeItemLabelPositionFallback(itemLabelPosition61);
        statisticalBarRenderer13.setNegativeItemLabelPositionFallback(itemLabelPosition61);
        statisticalBarRenderer7.setPositiveItemLabelPositionFallback(itemLabelPosition61);
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition61);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator68 = statisticalBarRenderer0.getItemLabelGenerator(1, (int) (byte) 10);
        boolean boolean69 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        boolean boolean70 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator28);
        org.junit.Assert.assertNotNull(font29);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator52);
        org.junit.Assert.assertNotNull(font53);
        org.junit.Assert.assertNull(itemLabelPosition59);
        org.junit.Assert.assertNotNull(itemLabelPosition61);
        org.junit.Assert.assertNull(categoryItemLabelGenerator68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = statisticalBarRenderer0.getPlot();
        double double9 = statisticalBarRenderer0.getMinimumBarLength();
        java.awt.Paint paint11 = null;
        statisticalBarRenderer0.setSeriesOutlinePaint((int) '#', paint11, false);
        java.lang.Boolean boolean15 = statisticalBarRenderer0.getSeriesItemLabelsVisible((int) (byte) 1);
        java.awt.Shape shape18 = statisticalBarRenderer0.getItemShape((int) (short) 100, (int) (short) 0);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator19 = statisticalBarRenderer0.getBaseURLGenerator();
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(categoryPlot8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNull(categoryURLGenerator19);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer0.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) ' ', shape7, false);
        statisticalBarRenderer0.setMaximumBarWidth((double) 10.0f);
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer15.setBaseOutlinePaint(paint16);
        boolean boolean18 = statisticalBarRenderer15.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition21 = null;
        statisticalBarRenderer19.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition21, false);
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = statisticalBarRenderer19.hasListener(eventListener24);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator27 = null;
        statisticalBarRenderer19.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator27);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator30 = statisticalBarRenderer19.getSeriesItemLabelGenerator(0);
        java.awt.Font font31 = statisticalBarRenderer19.getBaseItemLabelFont();
        statisticalBarRenderer15.setBaseItemLabelFont(font31);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator34 = null;
        statisticalBarRenderer15.setSeriesItemLabelGenerator((int) (byte) 1, categoryItemLabelGenerator34);
        java.awt.Shape shape37 = statisticalBarRenderer15.lookupSeriesShape((int) (short) 0);
        java.awt.Shape shape38 = statisticalBarRenderer15.getBaseShape();
        java.awt.Paint paint39 = statisticalBarRenderer15.getBaseItemLabelPaint();
        statisticalBarRenderer0.setBaseFillPaint(paint39);
        java.awt.Stroke stroke42 = statisticalBarRenderer0.getSeriesOutlineStroke((int) '#');
        double double43 = statisticalBarRenderer0.getLowerClip();
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (byte) -1, (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator30);
        org.junit.Assert.assertNotNull(font31);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNull(stroke42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Stroke stroke9 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) (byte) -1);
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 0);
        java.awt.Font font12 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setBaseItemLabelFont(font12, false);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 10, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer20.setBaseOutlinePaint(paint21);
        java.awt.Paint paint24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer20.setSeriesPaint(0, paint24);
        java.lang.Object obj26 = null;
        boolean boolean27 = statisticalBarRenderer20.equals(obj26);
        java.awt.Shape shape30 = statisticalBarRenderer20.getItemShape((int) (byte) 1, (int) (short) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer31.setBaseOutlinePaint(paint32);
        java.awt.Paint paint35 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer31.setSeriesPaint(0, paint35);
        java.lang.Object obj37 = null;
        boolean boolean38 = statisticalBarRenderer31.equals(obj37);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer40 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition42 = null;
        statisticalBarRenderer40.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition42, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator45 = statisticalBarRenderer40.getLegendItemToolTipGenerator();
        java.awt.Paint paint46 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer40.setErrorIndicatorPaint(paint46);
        statisticalBarRenderer31.setSeriesPaint(10, paint46);
        statisticalBarRenderer31.setBaseSeriesVisible(true);
        statisticalBarRenderer31.setIncludeBaseInRange(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer53 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer53.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot57 = statisticalBarRenderer53.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition59 = statisticalBarRenderer53.getSeriesNegativeItemLabelPosition(100);
        statisticalBarRenderer31.setBaseNegativeItemLabelPosition(itemLabelPosition59, true);
        statisticalBarRenderer20.setNegativeItemLabelPositionFallback(itemLabelPosition59);
        boolean boolean63 = statisticalBarRenderer20.getAutoPopulateSeriesOutlineStroke();
        double double64 = statisticalBarRenderer20.getMinimumBarLength();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator65 = statisticalBarRenderer20.getLegendItemLabelGenerator();
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator65);
        java.awt.Stroke stroke68 = statisticalBarRenderer0.lookupSeriesOutlineStroke(0);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator70 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (byte) 0, categoryToolTipGenerator70, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition73 = statisticalBarRenderer0.getPositiveItemLabelPositionFallback();
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(stroke11);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator45);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNull(categoryPlot57);
        org.junit.Assert.assertNotNull(itemLabelPosition59);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator65);
        org.junit.Assert.assertNotNull(stroke68);
        org.junit.Assert.assertNull(itemLabelPosition73);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Paint paint6 = statisticalBarRenderer0.getSeriesFillPaint((int) (byte) 0);
        boolean boolean9 = statisticalBarRenderer0.getItemCreateEntity((int) '4', (int) 'a');
        java.awt.Paint paint12 = statisticalBarRenderer0.getItemPaint(1, (int) (short) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer13.setBaseOutlinePaint(paint14);
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer13.setSeriesPaint(0, paint17);
        java.lang.Object obj19 = null;
        boolean boolean20 = statisticalBarRenderer13.equals(obj19);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = null;
        statisticalBarRenderer22.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition24, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator27 = statisticalBarRenderer22.getLegendItemToolTipGenerator();
        java.awt.Paint paint28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer22.setErrorIndicatorPaint(paint28);
        statisticalBarRenderer13.setSeriesPaint(10, paint28);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator31 = null;
        statisticalBarRenderer13.setLegendItemToolTipGenerator(categorySeriesLabelGenerator31);
        java.awt.Paint paint34 = statisticalBarRenderer13.lookupSeriesPaint(1);
        statisticalBarRenderer0.setBasePaint(paint34, false);
        boolean boolean39 = statisticalBarRenderer0.isItemLabelVisible((int) (byte) -1, (int) (short) 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition41 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition((int) (short) 1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer44 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer44.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        java.awt.Paint paint48 = statisticalBarRenderer44.getBaseOutlinePaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator50 = null;
        statisticalBarRenderer44.setSeriesToolTipGenerator(10, categoryToolTipGenerator50, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer53 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition55 = null;
        statisticalBarRenderer53.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition55, false);
        java.awt.Paint paint58 = statisticalBarRenderer53.getBaseItemLabelPaint();
        statisticalBarRenderer53.setBaseCreateEntities(false, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator62 = statisticalBarRenderer53.getLegendItemURLGenerator();
        java.lang.Boolean boolean64 = statisticalBarRenderer53.getSeriesVisibleInLegend((int) (short) 1);
        java.awt.Stroke stroke66 = statisticalBarRenderer53.lookupSeriesStroke((int) 'a');
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer67 = statisticalBarRenderer53.getGradientPaintTransformer();
        statisticalBarRenderer44.setGradientPaintTransformer(gradientPaintTransformer67);
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer67);
        statisticalBarRenderer0.setMaximumBarWidth((double) ' ');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer72 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition73 = statisticalBarRenderer72.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer72.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape79 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer72.setSeriesShape((int) ' ', shape79, false);
        statisticalBarRenderer72.setMaximumBarWidth((double) 10.0f);
        java.awt.Paint paint86 = statisticalBarRenderer72.getItemOutlinePaint((int) (short) -1, (int) (short) 1);
        java.awt.Shape shape89 = statisticalBarRenderer72.getItemShape(10, (int) '4');
        statisticalBarRenderer0.setBaseShape(shape89);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition41);
        org.junit.Assert.assertNotNull(paint48);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator62);
        org.junit.Assert.assertNull(boolean64);
        org.junit.Assert.assertNotNull(stroke66);
        org.junit.Assert.assertNotNull(gradientPaintTransformer67);
        org.junit.Assert.assertNull(itemLabelPosition73);
        org.junit.Assert.assertNotNull(shape79);
        org.junit.Assert.assertNotNull(paint86);
        org.junit.Assert.assertNotNull(shape89);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        java.awt.Paint paint6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setErrorIndicatorPaint(paint6);
        java.awt.Stroke stroke8 = statisticalBarRenderer0.getBaseOutlineStroke();
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false, true);
        boolean boolean13 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) '#');
        java.awt.Shape shape14 = statisticalBarRenderer0.getBaseShape();
        statisticalBarRenderer0.setSeriesVisible((int) '#', (java.lang.Boolean) true, false);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Paint paint22 = statisticalBarRenderer0.getSeriesFillPaint((int) '4');
        java.awt.Paint paint23 = statisticalBarRenderer0.getBaseFillPaint();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator4 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator4);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = statisticalBarRenderer0.getSeriesItemLabelGenerator(100);
        boolean boolean8 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        java.awt.Stroke stroke9 = statisticalBarRenderer0.getBaseStroke();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        java.awt.Paint paint6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setErrorIndicatorPaint(paint6);
        java.awt.Stroke stroke8 = statisticalBarRenderer0.getBaseOutlineStroke();
        statisticalBarRenderer0.setSeriesVisible(1, (java.lang.Boolean) true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer14.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = statisticalBarRenderer14.getPlot();
        java.awt.Font font19 = statisticalBarRenderer14.getBaseItemLabelFont();
        statisticalBarRenderer0.setSeriesItemLabelFont((int) (byte) 10, font19);
        java.awt.Paint paint22 = statisticalBarRenderer0.getSeriesOutlinePaint((int) (byte) 10);
        java.lang.Object obj23 = statisticalBarRenderer0.clone();
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNull(categoryPlot18);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        boolean boolean4 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = null;
        statisticalBarRenderer6.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition8, false);
        java.awt.Stroke stroke13 = statisticalBarRenderer6.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer15.setBaseOutlinePaint(paint16);
        statisticalBarRenderer6.setSeriesPaint((int) 'a', paint16, false);
        statisticalBarRenderer0.setSeriesFillPaint((int) (short) 100, paint16);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer22.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = statisticalBarRenderer22.getPlot();
        java.awt.Paint paint28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer22.setSeriesOutlinePaint(10, paint28, true);
        java.awt.Shape shape32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer22.setSeriesShape((int) (byte) 1, shape32, true);
        statisticalBarRenderer0.setSeriesShape((int) (byte) 1, shape32);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator38 = statisticalBarRenderer0.getItemLabelGenerator((int) 'a', 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition40 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition((int) ' ');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer41 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint42 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer41.setBaseOutlinePaint(paint42);
        boolean boolean44 = statisticalBarRenderer41.isDrawBarOutline();
        statisticalBarRenderer41.setDrawBarOutline(false);
        java.awt.Paint paint47 = statisticalBarRenderer41.getErrorIndicatorPaint();
        statisticalBarRenderer0.setBasePaint(paint47, true);
        boolean boolean50 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNull(categoryPlot26);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNull(categoryItemLabelGenerator38);
        org.junit.Assert.assertNotNull(itemLabelPosition40);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        double double6 = statisticalBarRenderer0.getItemMargin();
        java.awt.Shape shape8 = statisticalBarRenderer0.getSeriesShape((int) ' ');
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer9 = null;
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer9);
        org.jfree.chart.LegendItem legendItem13 = statisticalBarRenderer0.getLegendItem(0, (int) (short) 10);
        statisticalBarRenderer0.setMinimumBarLength((double) (byte) 100);
        double double16 = statisticalBarRenderer0.getItemMargin();
        boolean boolean17 = statisticalBarRenderer0.getBaseCreateEntities();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertNull(legendItem13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2d + "'", double16 == 0.2d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        double double6 = statisticalBarRenderer0.getItemMargin();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer7 = null;
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer7);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer9.setBaseOutlinePaint(paint10);
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer9.setSeriesPaint(0, paint13);
        java.lang.Object obj15 = null;
        boolean boolean16 = statisticalBarRenderer9.equals(obj15);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition20 = null;
        statisticalBarRenderer18.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition20, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator23 = statisticalBarRenderer18.getLegendItemToolTipGenerator();
        java.awt.Paint paint24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer18.setErrorIndicatorPaint(paint24);
        statisticalBarRenderer9.setSeriesPaint(10, paint24);
        boolean boolean27 = statisticalBarRenderer9.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer28 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint29 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer28.setBaseOutlinePaint(paint29);
        boolean boolean31 = statisticalBarRenderer28.getAutoPopulateSeriesShape();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer32 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition33 = statisticalBarRenderer32.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition35 = statisticalBarRenderer32.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer28.setBasePositiveItemLabelPosition(itemLabelPosition35);
        statisticalBarRenderer9.setNegativeItemLabelPositionFallback(itemLabelPosition35);
        boolean boolean38 = statisticalBarRenderer9.getIncludeBaseInRange();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator39 = statisticalBarRenderer9.getLegendItemLabelGenerator();
        statisticalBarRenderer0.setLegendItemLabelGenerator(categorySeriesLabelGenerator39);
        boolean boolean42 = statisticalBarRenderer0.isSeriesItemLabelsVisible(0);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator43 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        java.awt.Shape shape45 = statisticalBarRenderer0.getSeriesShape((int) ' ');
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(itemLabelPosition33);
        org.junit.Assert.assertNotNull(itemLabelPosition35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator43);
        org.junit.Assert.assertNull(shape45);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer4 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition5 = statisticalBarRenderer4.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = statisticalBarRenderer4.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition7);
        statisticalBarRenderer0.setAutoPopulateSeriesShape(false);
        statisticalBarRenderer0.setBaseCreateEntities(false);
        statisticalBarRenderer0.setSeriesVisible(1, (java.lang.Boolean) true, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator17 = statisticalBarRenderer0.getBaseToolTipGenerator();
        java.awt.Paint paint18 = statisticalBarRenderer0.getBaseFillPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer19.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = statisticalBarRenderer19.getPlot();
        java.awt.Stroke stroke25 = statisticalBarRenderer19.getSeriesOutlineStroke((int) (byte) 1);
        double double26 = statisticalBarRenderer19.getUpperClip();
        java.awt.Paint paint27 = statisticalBarRenderer19.getErrorIndicatorPaint();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator28 = statisticalBarRenderer19.getLegendItemToolTipGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition30 = statisticalBarRenderer29.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer29.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape36 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer29.setSeriesShape((int) ' ', shape36, false);
        statisticalBarRenderer29.setMaximumBarWidth((double) 10.0f);
        statisticalBarRenderer29.setBaseItemLabelsVisible(true, false);
        boolean boolean44 = statisticalBarRenderer29.getAutoPopulateSeriesOutlinePaint();
        java.awt.Paint paint46 = statisticalBarRenderer29.lookupSeriesFillPaint((int) (short) 0);
        statisticalBarRenderer19.setBaseItemLabelPaint(paint46, true);
        statisticalBarRenderer0.setBasePaint(paint46);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(itemLabelPosition5);
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertNull(categoryToolTipGenerator17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(categoryPlot23);
        org.junit.Assert.assertNull(stroke25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator28);
        org.junit.Assert.assertNull(itemLabelPosition30);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(paint46);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = statisticalBarRenderer0.getPlot();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer10.setBaseOutlinePaint(paint11);
        boolean boolean13 = statisticalBarRenderer10.getAutoPopulateSeriesShape();
        java.awt.Paint paint15 = statisticalBarRenderer10.lookupSeriesPaint((int) (short) 0);
        statisticalBarRenderer0.setSeriesPaint((int) (short) 0, paint15);
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent17 = null;
        statisticalBarRenderer0.notifyListeners(rendererChangeEvent17);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(categoryPlot8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint15);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        statisticalBarRenderer0.setDrawBarOutline(false);
        java.awt.Stroke stroke7 = null;
        statisticalBarRenderer0.setSeriesOutlineStroke((int) (short) 0, stroke7, true);
        java.awt.Paint paint12 = statisticalBarRenderer0.getItemPaint(10, (-1));
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = statisticalBarRenderer0.getURLGenerator((int) (short) -1, 10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator17 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (short) 10, categoryItemLabelGenerator17);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition21 = null;
        statisticalBarRenderer19.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition21, false);
        java.util.EventListener eventListener24 = null;
        boolean boolean25 = statisticalBarRenderer19.hasListener(eventListener24);
        boolean boolean26 = statisticalBarRenderer19.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = null;
        statisticalBarRenderer27.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition29, false);
        java.util.EventListener eventListener32 = null;
        boolean boolean33 = statisticalBarRenderer27.hasListener(eventListener32);
        boolean boolean34 = statisticalBarRenderer27.getAutoPopulateSeriesFillPaint();
        double double35 = statisticalBarRenderer27.getItemLabelAnchorOffset();
        java.awt.Paint paint36 = statisticalBarRenderer27.getErrorIndicatorPaint();
        statisticalBarRenderer19.setBasePaint(paint36, true);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint36, false);
        statisticalBarRenderer0.setAutoPopulateSeriesPaint(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer44 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition45 = statisticalBarRenderer44.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer44.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape51 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer44.setSeriesShape((int) ' ', shape51, false);
        statisticalBarRenderer44.setMaximumBarWidth((double) 10.0f);
        java.awt.Paint paint58 = statisticalBarRenderer44.getItemOutlinePaint((int) (short) -1, (int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition60 = statisticalBarRenderer44.getSeriesNegativeItemLabelPosition((int) (short) -1);
        java.awt.Paint paint62 = statisticalBarRenderer44.getSeriesOutlinePaint((int) 'a');
        statisticalBarRenderer44.setSeriesVisibleInLegend(0, (java.lang.Boolean) false, false);
        java.awt.Font font68 = statisticalBarRenderer44.getSeriesItemLabelFont(0);
        java.awt.Paint paint69 = statisticalBarRenderer44.getBaseFillPaint();
        java.awt.Shape shape70 = statisticalBarRenderer44.getBaseShape();
        statisticalBarRenderer0.setSeriesShape(1, shape70, true);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(categoryURLGenerator15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 2.0d + "'", double35 == 2.0d);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNull(itemLabelPosition45);
        org.junit.Assert.assertNotNull(shape51);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertNotNull(itemLabelPosition60);
        org.junit.Assert.assertNull(paint62);
        org.junit.Assert.assertNull(font68);
        org.junit.Assert.assertNotNull(paint69);
        org.junit.Assert.assertNotNull(shape70);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        statisticalBarRenderer0.setBaseCreateEntities(false, false);
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) ' ', (java.lang.Boolean) false);
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) 'a', (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer14.setBaseOutlinePaint(paint15);
        boolean boolean17 = statisticalBarRenderer14.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition21 = null;
        statisticalBarRenderer19.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition21, false);
        java.awt.Stroke stroke26 = statisticalBarRenderer19.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer19.setSeriesShape((int) (short) 1, shape28);
        boolean boolean30 = statisticalBarRenderer19.isDrawBarOutline();
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = statisticalBarRenderer19.getPlot();
        statisticalBarRenderer19.setBaseItemLabelsVisible(false, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition36 = statisticalBarRenderer19.getSeriesNegativeItemLabelPosition((int) (byte) 100);
        statisticalBarRenderer14.setSeriesPositiveItemLabelPosition(0, itemLabelPosition36);
        statisticalBarRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition36);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator39 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(categoryPlot31);
        org.junit.Assert.assertNotNull(itemLabelPosition36);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator39);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = statisticalBarRenderer0.getSeriesURLGenerator((int) (byte) -1);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.lookupSeriesOutlineStroke(100);
        java.awt.Font font8 = statisticalBarRenderer0.getBaseItemLabelFont();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = null;
        statisticalBarRenderer10.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition12, false);
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = statisticalBarRenderer10.hasListener(eventListener15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator18 = null;
        statisticalBarRenderer10.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator18);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = statisticalBarRenderer10.getSeriesItemLabelGenerator(0);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer22 = null;
        statisticalBarRenderer10.setGradientPaintTransformer(gradientPaintTransformer22);
        java.awt.Paint paint25 = statisticalBarRenderer10.lookupSeriesPaint((int) ' ');
        java.awt.Paint paint28 = statisticalBarRenderer10.getItemPaint(0, (int) (short) -1);
        statisticalBarRenderer0.setSeriesItemLabelPaint((int) '#', paint28, true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator32 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator((int) (short) 100, categoryToolTipGenerator32, false);
        java.awt.Paint paint35 = statisticalBarRenderer0.getErrorIndicatorPaint();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(categoryURLGenerator5);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator21);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setSeriesPaint(0, paint4);
        java.lang.Object obj6 = null;
        boolean boolean7 = statisticalBarRenderer0.equals(obj6);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = null;
        statisticalBarRenderer9.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition11, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer9.getLegendItemToolTipGenerator();
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer9.setErrorIndicatorPaint(paint15);
        statisticalBarRenderer0.setSeriesPaint(10, paint15);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = statisticalBarRenderer0.getLegendItemURLGenerator();
        boolean boolean21 = statisticalBarRenderer0.isItemLabelVisible((int) '4', 0);
        statisticalBarRenderer0.setBase((double) (short) 100);
        statisticalBarRenderer0.setSeriesVisible((int) '#', (java.lang.Boolean) false, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition31 = null;
        statisticalBarRenderer29.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition31, false);
        java.awt.Stroke stroke36 = statisticalBarRenderer29.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Font font38 = null;
        statisticalBarRenderer29.setSeriesItemLabelFont((int) (short) 1, font38);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer40 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint41 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer40.setBaseOutlinePaint(paint41);
        boolean boolean43 = statisticalBarRenderer40.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer44 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition46 = null;
        statisticalBarRenderer44.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition46, false);
        java.util.EventListener eventListener49 = null;
        boolean boolean50 = statisticalBarRenderer44.hasListener(eventListener49);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator52 = null;
        statisticalBarRenderer44.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator52);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator55 = statisticalBarRenderer44.getSeriesItemLabelGenerator(0);
        java.awt.Font font56 = statisticalBarRenderer44.getBaseItemLabelFont();
        statisticalBarRenderer40.setBaseItemLabelFont(font56);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator59 = null;
        statisticalBarRenderer40.setSeriesItemLabelGenerator((int) (byte) 1, categoryItemLabelGenerator59);
        java.awt.Shape shape62 = statisticalBarRenderer40.lookupSeriesShape((int) (short) 0);
        statisticalBarRenderer29.setBaseShape(shape62);
        statisticalBarRenderer29.setBaseSeriesVisible(false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer67 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition69 = null;
        statisticalBarRenderer67.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition69, false);
        java.awt.Stroke stroke74 = statisticalBarRenderer67.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Stroke stroke76 = statisticalBarRenderer67.lookupSeriesOutlineStroke((int) (byte) -1);
        java.awt.Stroke stroke78 = statisticalBarRenderer67.getSeriesOutlineStroke((int) (byte) 0);
        java.awt.Font font79 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer67.setBaseItemLabelFont(font79, false);
        statisticalBarRenderer29.setBaseItemLabelFont(font79);
        statisticalBarRenderer0.setSeriesItemLabelFont((int) (byte) 10, font79);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator55);
        org.junit.Assert.assertNotNull(font56);
        org.junit.Assert.assertNotNull(shape62);
        org.junit.Assert.assertNotNull(stroke74);
        org.junit.Assert.assertNotNull(stroke76);
        org.junit.Assert.assertNull(stroke78);
        org.junit.Assert.assertNotNull(font79);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        double double3 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        double double4 = statisticalBarRenderer0.getLowerClip();
        statisticalBarRenderer0.setBase((double) '#');
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0d + "'", double3 == 2.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setSeriesPaint(0, paint4);
        java.lang.Object obj6 = null;
        boolean boolean7 = statisticalBarRenderer0.equals(obj6);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = null;
        statisticalBarRenderer9.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition11, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer9.getLegendItemToolTipGenerator();
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer9.setErrorIndicatorPaint(paint15);
        statisticalBarRenderer0.setSeriesPaint(10, paint15);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer18.setBaseOutlinePaint(paint19);
        boolean boolean21 = statisticalBarRenderer18.isDrawBarOutline();
        boolean boolean22 = statisticalBarRenderer18.getBaseItemLabelsVisible();
        int int23 = statisticalBarRenderer18.getColumnCount();
        double double24 = statisticalBarRenderer18.getItemMargin();
        java.awt.Shape shape27 = statisticalBarRenderer18.getItemShape(1, (int) (byte) 10);
        statisticalBarRenderer0.setBaseShape(shape27, false);
        double double30 = statisticalBarRenderer0.getLowerClip();
        java.awt.Font font32 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesItemLabelFont((int) (short) -1, font32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.2d + "'", double24 == 0.2d);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke(1, 100);
        double double8 = statisticalBarRenderer0.getMinimumBarLength();
        statisticalBarRenderer0.setMaximumBarWidth(10.0d);
        statisticalBarRenderer0.setSeriesCreateEntities(10, (java.lang.Boolean) true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = null;
        statisticalBarRenderer14.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition16, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator19 = statisticalBarRenderer14.getLegendItemToolTipGenerator();
        java.awt.Paint paint20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer14.setErrorIndicatorPaint(paint20);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator23 = null;
        statisticalBarRenderer14.setSeriesURLGenerator(0, categoryURLGenerator23);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = statisticalBarRenderer14.getBasePositiveItemLabelPosition();
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition25);
        int int27 = statisticalBarRenderer0.getColumnCount();
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator19);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(itemLabelPosition25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        java.awt.Paint paint6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setErrorIndicatorPaint(paint6);
        java.awt.Stroke stroke8 = statisticalBarRenderer0.getBaseOutlineStroke();
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false, true);
        boolean boolean13 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) '#');
        java.awt.Shape shape14 = statisticalBarRenderer0.getBaseShape();
        statisticalBarRenderer0.setSeriesVisible((int) '#', (java.lang.Boolean) true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer19 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition20 = statisticalBarRenderer19.getNegativeItemLabelPositionFallback();
        boolean boolean23 = statisticalBarRenderer19.getItemVisible((int) (byte) 100, (int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = null;
        statisticalBarRenderer24.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition26, false);
        java.awt.Stroke stroke31 = statisticalBarRenderer24.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer24.setSeriesShape((int) (short) 1, shape33);
        java.lang.Boolean boolean36 = statisticalBarRenderer24.getSeriesVisible((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint38 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer37.setBaseOutlinePaint(paint38);
        boolean boolean40 = statisticalBarRenderer37.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer41 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition42 = statisticalBarRenderer41.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition44 = statisticalBarRenderer41.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer37.setBasePositiveItemLabelPosition(itemLabelPosition44);
        statisticalBarRenderer24.setBaseNegativeItemLabelPosition(itemLabelPosition44);
        java.awt.Paint paint49 = statisticalBarRenderer24.getItemPaint(10, (int) (short) -1);
        statisticalBarRenderer19.setBasePaint(paint49);
        statisticalBarRenderer0.setBaseOutlinePaint(paint49, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator54 = statisticalBarRenderer0.getSeriesItemLabelGenerator(0);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNull(itemLabelPosition20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNull(boolean36);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(itemLabelPosition42);
        org.junit.Assert.assertNotNull(itemLabelPosition44);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNull(categoryItemLabelGenerator54);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) (short) 1, shape9);
        boolean boolean11 = statisticalBarRenderer0.isDrawBarOutline();
        java.awt.Shape shape13 = statisticalBarRenderer0.lookupSeriesShape((int) (byte) 1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator16 = statisticalBarRenderer0.getItemLabelGenerator((int) (short) 10, (int) (short) 1);
        java.awt.Stroke stroke18 = statisticalBarRenderer0.getSeriesStroke((int) '4');
        java.awt.Stroke stroke20 = statisticalBarRenderer0.lookupSeriesStroke((int) 'a');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition22 = statisticalBarRenderer21.getNegativeItemLabelPositionFallback();
        boolean boolean25 = statisticalBarRenderer21.getItemVisible((int) (byte) 100, (int) (byte) 1);
        statisticalBarRenderer21.setMinimumBarLength(0.0d);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer29 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer29.setBaseOutlinePaint(paint30);
        boolean boolean32 = statisticalBarRenderer29.isDrawBarOutline();
        statisticalBarRenderer29.setDrawBarOutline(false);
        java.awt.Stroke stroke36 = null;
        statisticalBarRenderer29.setSeriesOutlineStroke((int) (short) 0, stroke36, true);
        java.awt.Paint paint41 = statisticalBarRenderer29.getItemPaint(10, (-1));
        statisticalBarRenderer21.setSeriesItemLabelPaint(1, paint41, true);
        statisticalBarRenderer0.setBaseItemLabelPaint(paint41, false);
        java.awt.Paint paint46 = statisticalBarRenderer0.getBaseItemLabelPaint();
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNull(categoryItemLabelGenerator16);
        org.junit.Assert.assertNull(stroke18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNull(itemLabelPosition22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(paint46);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        boolean boolean5 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) (byte) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer7.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = statisticalBarRenderer7.getPlot();
        java.awt.Stroke stroke14 = statisticalBarRenderer7.getItemOutlineStroke(1, 100);
        statisticalBarRenderer7.setItemMargin(3.0d);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = statisticalBarRenderer18.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition21 = statisticalBarRenderer18.getSeriesPositiveItemLabelPosition((int) '#');
        boolean boolean22 = statisticalBarRenderer18.getBaseSeriesVisible();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = statisticalBarRenderer18.getNegativeItemLabelPositionFallback();
        java.awt.Paint paint24 = statisticalBarRenderer18.getBaseFillPaint();
        statisticalBarRenderer7.setSeriesOutlinePaint((int) (byte) 10, paint24);
        java.awt.Font font26 = statisticalBarRenderer7.getBaseItemLabelFont();
        statisticalBarRenderer0.setSeriesItemLabelFont((int) '#', font26, false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator31 = statisticalBarRenderer0.getURLGenerator(100, (int) ' ');
        java.awt.Paint paint32 = statisticalBarRenderer0.getBaseItemLabelPaint();
        boolean boolean33 = statisticalBarRenderer0.isDrawBarOutline();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(categoryPlot11);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNull(itemLabelPosition19);
        org.junit.Assert.assertNotNull(itemLabelPosition21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(itemLabelPosition23);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertNull(categoryURLGenerator31);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Stroke stroke9 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) (byte) -1);
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 0);
        statisticalBarRenderer0.setItemLabelAnchorOffset(0.2d);
        boolean boolean14 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition((int) (short) 0);
        double double17 = statisticalBarRenderer0.getMinimumBarLength();
        org.jfree.chart.event.RendererChangeListener rendererChangeListener18 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.addChangeListener(rendererChangeListener18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Paint paint6 = statisticalBarRenderer0.getSeriesFillPaint((int) (byte) 0);
        java.lang.Object obj7 = statisticalBarRenderer0.clone();
        statisticalBarRenderer0.setBaseCreateEntities(false);
        statisticalBarRenderer0.setSeriesVisible(0, (java.lang.Boolean) false, true);
        double double14 = statisticalBarRenderer0.getMinimumBarLength();
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Paint paint6 = statisticalBarRenderer0.getSeriesPaint((int) (byte) 0);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator7 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator9 = statisticalBarRenderer0.getSeriesToolTipGenerator(1);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator7);
        org.junit.Assert.assertNull(categoryToolTipGenerator9);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator4 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator4);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer6.setBaseOutlinePaint(paint7);
        boolean boolean9 = statisticalBarRenderer6.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = null;
        statisticalBarRenderer10.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition12, false);
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = statisticalBarRenderer10.hasListener(eventListener15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator18 = null;
        statisticalBarRenderer10.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator18);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = statisticalBarRenderer10.getSeriesItemLabelGenerator(0);
        java.awt.Font font22 = statisticalBarRenderer10.getBaseItemLabelFont();
        statisticalBarRenderer6.setBaseItemLabelFont(font22);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator25 = null;
        statisticalBarRenderer6.setSeriesItemLabelGenerator((int) (byte) 1, categoryItemLabelGenerator25);
        java.awt.Shape shape28 = statisticalBarRenderer6.lookupSeriesShape((int) (short) 0);
        java.awt.Shape shape29 = statisticalBarRenderer6.getBaseShape();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer30.setBaseOutlinePaint(paint31);
        boolean boolean33 = statisticalBarRenderer30.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer34 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition36 = null;
        statisticalBarRenderer34.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition36, false);
        java.util.EventListener eventListener39 = null;
        boolean boolean40 = statisticalBarRenderer34.hasListener(eventListener39);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator42 = null;
        statisticalBarRenderer34.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator42);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator45 = statisticalBarRenderer34.getSeriesItemLabelGenerator(0);
        java.awt.Font font46 = statisticalBarRenderer34.getBaseItemLabelFont();
        statisticalBarRenderer30.setBaseItemLabelFont(font46);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator49 = null;
        statisticalBarRenderer30.setSeriesItemLabelGenerator((int) (byte) 1, categoryItemLabelGenerator49);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer51 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition52 = statisticalBarRenderer51.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition54 = statisticalBarRenderer51.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer30.setNegativeItemLabelPositionFallback(itemLabelPosition54);
        statisticalBarRenderer6.setNegativeItemLabelPositionFallback(itemLabelPosition54);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition54);
        statisticalBarRenderer0.setAutoPopulateSeriesShape(false);
        double double60 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        java.awt.Graphics2D graphics2D61 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot62 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis63 = null;
        org.jfree.chart.plot.CategoryMarker categoryMarker64 = null;
        java.awt.geom.Rectangle2D rectangle2D65 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawDomainMarker(graphics2D61, categoryPlot62, categoryAxis63, categoryMarker64, rectangle2D65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator45);
        org.junit.Assert.assertNotNull(font46);
        org.junit.Assert.assertNull(itemLabelPosition52);
        org.junit.Assert.assertNotNull(itemLabelPosition54);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 2.0d + "'", double60 == 2.0d);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        double double3 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) -1);
        java.awt.Stroke stroke8 = statisticalBarRenderer0.getBaseOutlineStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer10.setBaseOutlinePaint(paint11);
        boolean boolean13 = statisticalBarRenderer10.isDrawBarOutline();
        statisticalBarRenderer10.setDrawBarOutline(false);
        java.awt.Stroke stroke17 = null;
        statisticalBarRenderer10.setSeriesOutlineStroke((int) (short) 0, stroke17, true);
        java.awt.Paint paint22 = statisticalBarRenderer10.getItemFillPaint(1, (int) ' ');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = null;
        statisticalBarRenderer23.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition25, false);
        java.awt.Stroke stroke30 = statisticalBarRenderer23.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = statisticalBarRenderer23.getPlot();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer33 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer33.setBaseOutlinePaint(paint34);
        boolean boolean36 = statisticalBarRenderer33.getAutoPopulateSeriesShape();
        java.awt.Paint paint38 = statisticalBarRenderer33.lookupSeriesPaint((int) (short) 0);
        statisticalBarRenderer23.setSeriesPaint((int) (short) 0, paint38);
        statisticalBarRenderer10.setBaseFillPaint(paint38);
        statisticalBarRenderer0.setSeriesPaint(10, paint38, false);
        boolean boolean43 = statisticalBarRenderer0.getAutoPopulateSeriesPaint();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0d + "'", double3 == 2.0d);
        org.junit.Assert.assertNull(stroke7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNull(categoryPlot31);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Paint paint6 = statisticalBarRenderer0.getSeriesFillPaint((int) (byte) 0);
        org.jfree.chart.LegendItem legendItem9 = statisticalBarRenderer0.getLegendItem((int) (short) 100, (int) 'a');
        java.awt.Font font10 = statisticalBarRenderer0.getBaseItemLabelFont();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator13 = statisticalBarRenderer0.getURLGenerator(0, 1);
        java.awt.Stroke stroke15 = statisticalBarRenderer0.getSeriesOutlineStroke(0);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNull(legendItem9);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNull(categoryURLGenerator13);
        org.junit.Assert.assertNull(stroke15);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        java.awt.Paint paint6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint6, true);
        double double9 = statisticalBarRenderer0.getLowerClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = statisticalBarRenderer11.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = statisticalBarRenderer11.getSeriesPositiveItemLabelPosition((int) '#');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer16.setBaseOutlinePaint(paint17);
        java.awt.Paint paint20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer16.setSeriesPaint(0, paint20);
        java.lang.Object obj22 = null;
        boolean boolean23 = statisticalBarRenderer16.equals(obj22);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition27 = null;
        statisticalBarRenderer25.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition27, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator30 = statisticalBarRenderer25.getLegendItemToolTipGenerator();
        java.awt.Paint paint31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer25.setErrorIndicatorPaint(paint31);
        statisticalBarRenderer16.setSeriesPaint(10, paint31);
        statisticalBarRenderer11.setSeriesPaint((int) (byte) 10, paint31);
        statisticalBarRenderer0.setSeriesItemLabelPaint(0, paint31, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer38 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer38.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot42 = statisticalBarRenderer38.getPlot();
        java.awt.Stroke stroke45 = statisticalBarRenderer38.getItemOutlineStroke(1, 100);
        statisticalBarRenderer0.setSeriesOutlineStroke(0, stroke45);
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(false);
        statisticalBarRenderer0.setBaseSeriesVisible(false);
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(itemLabelPosition12);
        org.junit.Assert.assertNotNull(itemLabelPosition14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator30);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNull(categoryPlot42);
        org.junit.Assert.assertNotNull(stroke45);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Paint paint5 = statisticalBarRenderer0.getBaseItemLabelPaint();
        statisticalBarRenderer0.setBaseCreateEntities(false, false);
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = statisticalBarRenderer11.getNegativeItemLabelPositionFallback();
        java.awt.Paint paint14 = statisticalBarRenderer11.lookupSeriesPaint((int) (short) 0);
        statisticalBarRenderer0.setSeriesOutlinePaint(0, paint14, true);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        java.awt.Shape shape19 = statisticalBarRenderer0.lookupSeriesShape((int) ' ');
        boolean boolean20 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = statisticalBarRenderer0.getSeriesURLGenerator((int) (byte) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator24 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesToolTipGenerator((-1), categoryToolTipGenerator24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(itemLabelPosition12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator17);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(categoryURLGenerator22);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        double double3 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        double double4 = statisticalBarRenderer0.getLowerClip();
        boolean boolean5 = statisticalBarRenderer0.getIncludeBaseInRange();
        java.awt.Paint paint6 = statisticalBarRenderer0.getBasePaint();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0d + "'", double3 == 2.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Paint paint6 = statisticalBarRenderer0.lookupSeriesFillPaint(0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) (byte) -1);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator9, true);
        java.awt.Font font12 = statisticalBarRenderer0.getBaseItemLabelFont();
        boolean boolean13 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = null;
        statisticalBarRenderer14.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition16, false);
        java.util.EventListener eventListener19 = null;
        boolean boolean20 = statisticalBarRenderer14.hasListener(eventListener19);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator22 = null;
        statisticalBarRenderer14.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator22);
        java.awt.Paint paint25 = statisticalBarRenderer14.getSeriesFillPaint((int) ' ');
        java.awt.Paint paint26 = statisticalBarRenderer14.getErrorIndicatorPaint();
        statisticalBarRenderer0.setErrorIndicatorPaint(paint26);
        org.jfree.chart.event.RendererChangeListener rendererChangeListener28 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.removeChangeListener(rendererChangeListener28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'listener' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(paint25);
        org.junit.Assert.assertNotNull(paint26);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator4 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator4);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = statisticalBarRenderer0.getLegendItemLabelGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer7 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint8 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer7.setBaseOutlinePaint(paint8);
        boolean boolean10 = statisticalBarRenderer7.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = null;
        statisticalBarRenderer11.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition13, false);
        java.util.EventListener eventListener16 = null;
        boolean boolean17 = statisticalBarRenderer11.hasListener(eventListener16);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = null;
        statisticalBarRenderer11.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator19);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator22 = statisticalBarRenderer11.getSeriesItemLabelGenerator(0);
        java.awt.Font font23 = statisticalBarRenderer11.getBaseItemLabelFont();
        statisticalBarRenderer7.setBaseItemLabelFont(font23);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator26 = null;
        statisticalBarRenderer7.setSeriesItemLabelGenerator((int) (byte) 1, categoryItemLabelGenerator26);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer28 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer28.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition31 = statisticalBarRenderer28.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer7.setNegativeItemLabelPositionFallback(itemLabelPosition31);
        statisticalBarRenderer0.setNegativeItemLabelPositionFallback(itemLabelPosition31);
        boolean boolean35 = statisticalBarRenderer0.isSeriesVisible((int) ' ');
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator37 = null;
        statisticalBarRenderer0.setSeriesURLGenerator((int) (byte) 0, categoryURLGenerator37);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator6);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator22);
        org.junit.Assert.assertNotNull(font23);
        org.junit.Assert.assertNull(itemLabelPosition29);
        org.junit.Assert.assertNotNull(itemLabelPosition31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition3 = statisticalBarRenderer0.getSeriesPositiveItemLabelPosition((int) '#');
        boolean boolean4 = statisticalBarRenderer0.getBaseSeriesVisible();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition5 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition6 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        java.lang.Boolean boolean8 = statisticalBarRenderer0.getSeriesVisibleInLegend(0);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = null;
        statisticalBarRenderer11.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition13, false);
        java.awt.Paint paint17 = statisticalBarRenderer11.getSeriesFillPaint((int) (byte) 0);
        boolean boolean20 = statisticalBarRenderer11.getItemCreateEntity((int) '4', (int) 'a');
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator22 = statisticalBarRenderer11.getSeriesToolTipGenerator((int) (short) 10);
        boolean boolean25 = statisticalBarRenderer11.getItemVisible((int) (byte) 0, 1);
        java.awt.Paint paint26 = statisticalBarRenderer11.getBaseItemLabelPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer27.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        java.awt.Paint paint31 = statisticalBarRenderer27.getBaseOutlinePaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator33 = null;
        statisticalBarRenderer27.setSeriesToolTipGenerator(10, categoryToolTipGenerator33, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer36 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition38 = null;
        statisticalBarRenderer36.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition38, false);
        java.awt.Paint paint41 = statisticalBarRenderer36.getBaseItemLabelPaint();
        statisticalBarRenderer36.setBaseCreateEntities(false, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator45 = statisticalBarRenderer36.getLegendItemURLGenerator();
        java.lang.Boolean boolean47 = statisticalBarRenderer36.getSeriesVisibleInLegend((int) (short) 1);
        java.awt.Stroke stroke49 = statisticalBarRenderer36.lookupSeriesStroke((int) 'a');
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer50 = statisticalBarRenderer36.getGradientPaintTransformer();
        statisticalBarRenderer27.setGradientPaintTransformer(gradientPaintTransformer50);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer52 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer52.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot56 = statisticalBarRenderer52.getPlot();
        java.awt.Paint paint58 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer52.setSeriesOutlinePaint(10, paint58, true);
        java.awt.Shape shape62 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer52.setSeriesShape((int) (byte) 1, shape62, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer65 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint66 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer65.setBaseOutlinePaint(paint66);
        boolean boolean68 = statisticalBarRenderer65.isDrawBarOutline();
        statisticalBarRenderer65.setMaximumBarWidth((double) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator72 = statisticalBarRenderer65.getSeriesToolTipGenerator((-1));
        double double73 = statisticalBarRenderer65.getMinimumBarLength();
        java.awt.Paint paint76 = statisticalBarRenderer65.getItemOutlinePaint((int) 'a', 10);
        statisticalBarRenderer52.setBaseOutlinePaint(paint76, true);
        statisticalBarRenderer27.setBaseFillPaint(paint76);
        java.awt.Font font82 = statisticalBarRenderer27.getItemLabelFont((int) (byte) 1, (int) (short) 10);
        statisticalBarRenderer11.setBaseItemLabelFont(font82);
        statisticalBarRenderer0.setBaseItemLabelFont(font82);
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNotNull(itemLabelPosition3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(itemLabelPosition5);
        org.junit.Assert.assertNull(itemLabelPosition6);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(categoryToolTipGenerator22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator45);
        org.junit.Assert.assertNull(boolean47);
        org.junit.Assert.assertNotNull(stroke49);
        org.junit.Assert.assertNotNull(gradientPaintTransformer50);
        org.junit.Assert.assertNull(categoryPlot56);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertNotNull(shape62);
        org.junit.Assert.assertNotNull(paint66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator72);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertNotNull(paint76);
        org.junit.Assert.assertNotNull(font82);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Stroke stroke4 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (short) 1);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = statisticalBarRenderer0.getToolTipGenerator(0, 0);
        boolean boolean8 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        statisticalBarRenderer0.setSeriesCreateEntities((int) ' ', (java.lang.Boolean) false);
        java.awt.Font font16 = statisticalBarRenderer0.getItemLabelFont((int) (byte) 10, (int) (short) -1);
        boolean boolean19 = statisticalBarRenderer0.getItemVisible((int) 'a', 1);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        statisticalBarRenderer0.setDrawBarOutline(false);
        java.awt.Stroke stroke7 = null;
        statisticalBarRenderer0.setSeriesOutlineStroke((int) (short) 0, stroke7, true);
        java.awt.Paint paint12 = statisticalBarRenderer0.getItemPaint(10, (-1));
        java.awt.Shape shape14 = statisticalBarRenderer0.getSeriesShape((int) (short) 100);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation15 = null;
        boolean boolean16 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation15);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator17 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer18.setBaseOutlinePaint(paint19);
        boolean boolean21 = statisticalBarRenderer18.isDrawBarOutline();
        statisticalBarRenderer18.setMaximumBarWidth((double) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator25 = statisticalBarRenderer18.getSeriesToolTipGenerator((-1));
        boolean boolean26 = statisticalBarRenderer18.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer27.setBaseOutlinePaint(paint28);
        java.awt.Paint paint31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer27.setSeriesPaint(0, paint31);
        java.lang.Object obj33 = null;
        boolean boolean34 = statisticalBarRenderer27.equals(obj33);
        java.awt.Shape shape37 = statisticalBarRenderer27.getItemShape((int) (byte) 1, (int) (short) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer38 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer38.setBaseOutlinePaint(paint39);
        java.awt.Paint paint42 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer38.setSeriesPaint(0, paint42);
        java.lang.Object obj44 = null;
        boolean boolean45 = statisticalBarRenderer38.equals(obj44);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer47 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition49 = null;
        statisticalBarRenderer47.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition49, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator52 = statisticalBarRenderer47.getLegendItemToolTipGenerator();
        java.awt.Paint paint53 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer47.setErrorIndicatorPaint(paint53);
        statisticalBarRenderer38.setSeriesPaint(10, paint53);
        statisticalBarRenderer38.setBaseSeriesVisible(true);
        statisticalBarRenderer38.setIncludeBaseInRange(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer60 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer60.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot64 = statisticalBarRenderer60.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition66 = statisticalBarRenderer60.getSeriesNegativeItemLabelPosition(100);
        statisticalBarRenderer38.setBaseNegativeItemLabelPosition(itemLabelPosition66, true);
        statisticalBarRenderer27.setNegativeItemLabelPositionFallback(itemLabelPosition66);
        boolean boolean70 = statisticalBarRenderer27.getAutoPopulateSeriesOutlineStroke();
        double double71 = statisticalBarRenderer27.getMinimumBarLength();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator72 = statisticalBarRenderer27.getLegendItemLabelGenerator();
        statisticalBarRenderer18.setLegendItemLabelGenerator(categorySeriesLabelGenerator72);
        statisticalBarRenderer0.setLegendItemToolTipGenerator(categorySeriesLabelGenerator72);
        boolean boolean75 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        int int76 = statisticalBarRenderer0.getColumnCount();
        java.lang.Object obj77 = statisticalBarRenderer0.clone();
        boolean boolean78 = statisticalBarRenderer0.getAutoPopulateSeriesShape();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator17);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator52);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertNull(categoryPlot64);
        org.junit.Assert.assertNotNull(itemLabelPosition66);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator4 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator4);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer6.setBaseOutlinePaint(paint7);
        boolean boolean9 = statisticalBarRenderer6.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = null;
        statisticalBarRenderer10.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition12, false);
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = statisticalBarRenderer10.hasListener(eventListener15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator18 = null;
        statisticalBarRenderer10.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator18);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = statisticalBarRenderer10.getSeriesItemLabelGenerator(0);
        java.awt.Font font22 = statisticalBarRenderer10.getBaseItemLabelFont();
        statisticalBarRenderer6.setBaseItemLabelFont(font22);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator25 = null;
        statisticalBarRenderer6.setSeriesItemLabelGenerator((int) (byte) 1, categoryItemLabelGenerator25);
        java.awt.Shape shape28 = statisticalBarRenderer6.lookupSeriesShape((int) (short) 0);
        java.awt.Shape shape29 = statisticalBarRenderer6.getBaseShape();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer30.setBaseOutlinePaint(paint31);
        boolean boolean33 = statisticalBarRenderer30.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer34 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition36 = null;
        statisticalBarRenderer34.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition36, false);
        java.util.EventListener eventListener39 = null;
        boolean boolean40 = statisticalBarRenderer34.hasListener(eventListener39);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator42 = null;
        statisticalBarRenderer34.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator42);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator45 = statisticalBarRenderer34.getSeriesItemLabelGenerator(0);
        java.awt.Font font46 = statisticalBarRenderer34.getBaseItemLabelFont();
        statisticalBarRenderer30.setBaseItemLabelFont(font46);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator49 = null;
        statisticalBarRenderer30.setSeriesItemLabelGenerator((int) (byte) 1, categoryItemLabelGenerator49);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer51 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition52 = statisticalBarRenderer51.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition54 = statisticalBarRenderer51.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer30.setNegativeItemLabelPositionFallback(itemLabelPosition54);
        statisticalBarRenderer6.setNegativeItemLabelPositionFallback(itemLabelPosition54);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition54);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(false);
        statisticalBarRenderer0.setItemMargin((double) 0);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator45);
        org.junit.Assert.assertNotNull(font46);
        org.junit.Assert.assertNull(itemLabelPosition52);
        org.junit.Assert.assertNotNull(itemLabelPosition54);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Stroke stroke9 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) (byte) -1);
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 0);
        statisticalBarRenderer0.setItemLabelAnchorOffset(0.2d);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator14 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator14);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = statisticalBarRenderer0.getBaseURLGenerator();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = null;
        statisticalBarRenderer17.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition19, false);
        java.awt.Stroke stroke24 = statisticalBarRenderer17.getItemOutlineStroke((int) (byte) 0, 0);
        java.lang.Boolean boolean26 = statisticalBarRenderer17.getSeriesVisible((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer27.setBaseOutlinePaint(paint28);
        java.awt.Paint paint31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer27.setSeriesPaint(0, paint31);
        java.lang.Object obj33 = null;
        boolean boolean34 = statisticalBarRenderer27.equals(obj33);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer36 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition38 = null;
        statisticalBarRenderer36.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition38, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator41 = statisticalBarRenderer36.getLegendItemToolTipGenerator();
        java.awt.Paint paint42 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer36.setErrorIndicatorPaint(paint42);
        statisticalBarRenderer27.setSeriesPaint(10, paint42);
        boolean boolean45 = statisticalBarRenderer27.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer46 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint47 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer46.setBaseOutlinePaint(paint47);
        boolean boolean49 = statisticalBarRenderer46.getAutoPopulateSeriesShape();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer50 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition51 = statisticalBarRenderer50.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition53 = statisticalBarRenderer50.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer46.setBasePositiveItemLabelPosition(itemLabelPosition53);
        statisticalBarRenderer27.setNegativeItemLabelPositionFallback(itemLabelPosition53);
        boolean boolean56 = statisticalBarRenderer27.getIncludeBaseInRange();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator57 = statisticalBarRenderer27.getLegendItemLabelGenerator();
        statisticalBarRenderer17.setLegendItemURLGenerator(categorySeriesLabelGenerator57);
        statisticalBarRenderer0.setLegendItemURLGenerator(categorySeriesLabelGenerator57);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(stroke11);
        org.junit.Assert.assertNull(categoryURLGenerator16);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNull(boolean26);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator41);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNull(itemLabelPosition51);
        org.junit.Assert.assertNotNull(itemLabelPosition53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator57);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        int int5 = statisticalBarRenderer0.getRowCount();
        statisticalBarRenderer0.setSeriesVisible(100, (java.lang.Boolean) false, true);
        java.lang.Boolean boolean11 = statisticalBarRenderer0.getSeriesVisibleInLegend((int) (byte) 0);
        java.awt.Paint paint13 = statisticalBarRenderer0.getSeriesPaint((int) (byte) 1);
        java.awt.Stroke stroke16 = statisticalBarRenderer0.getItemStroke((int) 'a', 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint18 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer17.setBaseOutlinePaint(paint18);
        double double20 = statisticalBarRenderer17.getItemLabelAnchorOffset();
        boolean boolean23 = statisticalBarRenderer17.getItemCreateEntity((int) (byte) 0, 0);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier24 = statisticalBarRenderer17.getDrawingSupplier();
        boolean boolean27 = statisticalBarRenderer17.getItemCreateEntity((int) (byte) -1, (int) (byte) 100);
        java.awt.Stroke stroke28 = statisticalBarRenderer17.getBaseStroke();
        statisticalBarRenderer0.setBaseStroke(stroke28);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 2.0d + "'", double20 == 2.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(drawingSupplier24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(stroke28);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition5 = statisticalBarRenderer0.getBaseNegativeItemLabelPosition();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = statisticalBarRenderer0.getDrawingSupplier();
        java.awt.Paint paint8 = statisticalBarRenderer0.getSeriesPaint((int) (short) 0);
        java.awt.Shape shape10 = statisticalBarRenderer0.lookupSeriesShape(0);
        boolean boolean13 = statisticalBarRenderer0.isItemLabelVisible((int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertNotNull(itemLabelPosition5);
        org.junit.Assert.assertNull(drawingSupplier6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        java.awt.Stroke stroke6 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 1);
        double double7 = statisticalBarRenderer0.getUpperClip();
        java.awt.Paint paint8 = statisticalBarRenderer0.getErrorIndicatorPaint();
        java.awt.Font font10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setSeriesItemLabelFont((int) '#', font10, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition15 = null;
        statisticalBarRenderer13.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition15, false);
        java.awt.Stroke stroke20 = statisticalBarRenderer13.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape22 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer13.setSeriesShape((int) (short) 1, shape22);
        java.lang.Boolean boolean25 = statisticalBarRenderer13.getSeriesVisible((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer26.setBaseOutlinePaint(paint27);
        boolean boolean29 = statisticalBarRenderer26.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition31 = statisticalBarRenderer30.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition33 = statisticalBarRenderer30.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer26.setBasePositiveItemLabelPosition(itemLabelPosition33);
        statisticalBarRenderer13.setBaseNegativeItemLabelPosition(itemLabelPosition33);
        java.awt.Paint paint38 = statisticalBarRenderer13.getItemPaint(10, (int) (short) -1);
        java.awt.Shape shape39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer13.setBaseShape(shape39, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator42 = null;
        statisticalBarRenderer13.setBaseToolTipGenerator(categoryToolTipGenerator42, false);
        double double45 = statisticalBarRenderer13.getItemMargin();
        java.awt.Shape shape48 = statisticalBarRenderer13.getItemShape((int) ' ', (int) (byte) 100);
        statisticalBarRenderer0.setBaseShape(shape48);
        boolean boolean52 = statisticalBarRenderer0.getItemVisible(0, (int) (short) 0);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator53 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(itemLabelPosition31);
        org.junit.Assert.assertNotNull(itemLabelPosition33);
        org.junit.Assert.assertNotNull(paint38);
        org.junit.Assert.assertNotNull(shape39);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.2d + "'", double45 == 0.2d);
        org.junit.Assert.assertNotNull(shape48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator53);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        java.awt.Paint paint4 = statisticalBarRenderer0.getBaseOutlinePaint();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator6 = null;
        statisticalBarRenderer0.setSeriesToolTipGenerator(10, categoryToolTipGenerator6, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = null;
        statisticalBarRenderer9.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition11, false);
        java.awt.Paint paint14 = statisticalBarRenderer9.getBaseItemLabelPaint();
        statisticalBarRenderer9.setBaseCreateEntities(false, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = statisticalBarRenderer9.getLegendItemURLGenerator();
        java.lang.Boolean boolean20 = statisticalBarRenderer9.getSeriesVisibleInLegend((int) (short) 1);
        java.awt.Stroke stroke22 = statisticalBarRenderer9.lookupSeriesStroke((int) 'a');
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer23 = statisticalBarRenderer9.getGradientPaintTransformer();
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer23);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer25.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = statisticalBarRenderer25.getPlot();
        java.awt.Paint paint31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer25.setSeriesOutlinePaint(10, paint31, true);
        java.awt.Shape shape35 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer25.setSeriesShape((int) (byte) 1, shape35, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer38 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer38.setBaseOutlinePaint(paint39);
        boolean boolean41 = statisticalBarRenderer38.isDrawBarOutline();
        statisticalBarRenderer38.setMaximumBarWidth((double) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator45 = statisticalBarRenderer38.getSeriesToolTipGenerator((-1));
        double double46 = statisticalBarRenderer38.getMinimumBarLength();
        java.awt.Paint paint49 = statisticalBarRenderer38.getItemOutlinePaint((int) 'a', 10);
        statisticalBarRenderer25.setBaseOutlinePaint(paint49, true);
        statisticalBarRenderer0.setBaseFillPaint(paint49);
        boolean boolean55 = statisticalBarRenderer0.getItemVisible(1, (int) (byte) 100);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation56 = null;
        org.jfree.chart.util.Layer layer57 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.addAnnotation(categoryAnnotation56, layer57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(gradientPaintTransformer23);
        org.junit.Assert.assertNull(categoryPlot29);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.util.EventListener eventListener3 = null;
        boolean boolean4 = statisticalBarRenderer0.hasListener(eventListener3);
        double double5 = statisticalBarRenderer0.getItemMargin();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition(0);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertNotNull(itemLabelPosition7);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer4 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition6 = null;
        statisticalBarRenderer4.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition6, false);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = statisticalBarRenderer4.hasListener(eventListener9);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = null;
        statisticalBarRenderer4.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator12);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = statisticalBarRenderer4.getSeriesItemLabelGenerator(0);
        java.awt.Font font16 = statisticalBarRenderer4.getBaseItemLabelFont();
        statisticalBarRenderer0.setBaseItemLabelFont(font16);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (byte) 1, categoryItemLabelGenerator19);
        java.awt.Shape shape22 = statisticalBarRenderer0.lookupSeriesShape((int) (short) 0);
        java.awt.Shape shape23 = statisticalBarRenderer0.getBaseShape();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = null;
        statisticalBarRenderer0.setBaseItemLabelGenerator(categoryItemLabelGenerator24, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer28 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint29 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer28.setBaseOutlinePaint(paint29);
        boolean boolean31 = statisticalBarRenderer28.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer32 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = null;
        statisticalBarRenderer32.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition34, false);
        java.util.EventListener eventListener37 = null;
        boolean boolean38 = statisticalBarRenderer32.hasListener(eventListener37);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = null;
        statisticalBarRenderer32.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator40);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator43 = statisticalBarRenderer32.getSeriesItemLabelGenerator(0);
        java.awt.Font font44 = statisticalBarRenderer32.getBaseItemLabelFont();
        statisticalBarRenderer28.setBaseItemLabelFont(font44);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator47 = null;
        statisticalBarRenderer28.setSeriesItemLabelGenerator((int) (byte) 1, categoryItemLabelGenerator47);
        java.awt.Shape shape50 = statisticalBarRenderer28.lookupSeriesShape((int) (short) 0);
        java.awt.Font font53 = statisticalBarRenderer28.getItemLabelFont((int) '#', (int) '4');
        statisticalBarRenderer0.setSeriesItemLabelFont((int) 'a', font53);
        java.awt.Stroke stroke55 = statisticalBarRenderer0.getBaseOutlineStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer56 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint57 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer56.setBaseOutlinePaint(paint57);
        boolean boolean59 = statisticalBarRenderer56.isDrawBarOutline();
        boolean boolean60 = statisticalBarRenderer56.getBaseItemLabelsVisible();
        int int61 = statisticalBarRenderer56.getColumnCount();
        double double62 = statisticalBarRenderer56.getItemMargin();
        boolean boolean63 = statisticalBarRenderer56.isDrawBarOutline();
        org.jfree.chart.plot.CategoryPlot categoryPlot64 = statisticalBarRenderer56.getPlot();
        java.awt.Paint paint67 = statisticalBarRenderer56.getItemOutlinePaint((int) (short) 1, 1);
        statisticalBarRenderer0.setBaseFillPaint(paint67);
        java.awt.Paint paint71 = statisticalBarRenderer0.getItemOutlinePaint((int) (short) 100, 0);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator43);
        org.junit.Assert.assertNotNull(font44);
        org.junit.Assert.assertNotNull(shape50);
        org.junit.Assert.assertNotNull(font53);
        org.junit.Assert.assertNotNull(stroke55);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.2d + "'", double62 == 0.2d);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(categoryPlot64);
        org.junit.Assert.assertNotNull(paint67);
        org.junit.Assert.assertNotNull(paint71);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        boolean boolean4 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        int int5 = statisticalBarRenderer0.getColumnCount();
        double double6 = statisticalBarRenderer0.getItemMargin();
        java.awt.Shape shape9 = statisticalBarRenderer0.getItemShape(1, (int) (byte) 10);
        java.lang.Boolean boolean11 = statisticalBarRenderer0.getSeriesVisible(1);
        int int12 = statisticalBarRenderer0.getPassCount();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(true);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator17 = statisticalBarRenderer0.getToolTipGenerator((int) (byte) -1, 0);
        java.lang.Boolean boolean19 = statisticalBarRenderer0.getSeriesItemLabelsVisible(0);
        java.awt.Font font20 = statisticalBarRenderer0.getBaseItemLabelFont();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(categoryToolTipGenerator17);
        org.junit.Assert.assertNull(boolean19);
        org.junit.Assert.assertNotNull(font20);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer0.setBaseSeriesVisible(false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator5 = null;
        statisticalBarRenderer0.setSeriesURLGenerator(100, categoryURLGenerator5);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = statisticalBarRenderer0.getBaseToolTipGenerator();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator9 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator(100, categoryItemLabelGenerator9, false);
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Paint paint6 = statisticalBarRenderer0.getSeriesFillPaint((int) (byte) 0);
        boolean boolean9 = statisticalBarRenderer0.getItemCreateEntity((int) '4', (int) 'a');
        java.awt.Paint paint12 = statisticalBarRenderer0.getItemPaint(1, (int) (short) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer14.setBaseOutlinePaint(paint15);
        boolean boolean17 = statisticalBarRenderer14.isDrawBarOutline();
        statisticalBarRenderer14.setDrawBarOutline(false);
        java.awt.Paint paint20 = statisticalBarRenderer14.getErrorIndicatorPaint();
        statisticalBarRenderer0.setSeriesFillPaint(0, paint20, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = null;
        statisticalBarRenderer23.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition25, false);
        java.awt.Stroke stroke30 = statisticalBarRenderer23.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer23.setSeriesShape((int) (short) 1, shape32);
        java.lang.Boolean boolean35 = statisticalBarRenderer23.getSeriesVisible((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer36 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint37 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer36.setBaseOutlinePaint(paint37);
        boolean boolean39 = statisticalBarRenderer36.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer40 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition41 = statisticalBarRenderer40.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition43 = statisticalBarRenderer40.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer36.setBasePositiveItemLabelPosition(itemLabelPosition43);
        statisticalBarRenderer23.setBaseNegativeItemLabelPosition(itemLabelPosition43);
        java.awt.Font font48 = statisticalBarRenderer23.getItemLabelFont((int) (short) 0, (-1));
        java.awt.Font font50 = statisticalBarRenderer23.getSeriesItemLabelFont(1);
        java.awt.Shape shape52 = statisticalBarRenderer23.lookupSeriesShape((int) (short) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer53 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition55 = null;
        statisticalBarRenderer53.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition55, false);
        java.util.EventListener eventListener58 = null;
        boolean boolean59 = statisticalBarRenderer53.hasListener(eventListener58);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator61 = null;
        statisticalBarRenderer53.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator61);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator64 = statisticalBarRenderer53.getSeriesItemLabelGenerator(0);
        java.awt.Font font65 = statisticalBarRenderer53.getBaseItemLabelFont();
        java.awt.Stroke stroke66 = statisticalBarRenderer53.getBaseOutlineStroke();
        statisticalBarRenderer23.setErrorIndicatorStroke(stroke66);
        statisticalBarRenderer0.setErrorIndicatorStroke(stroke66);
        statisticalBarRenderer0.setSeriesVisibleInLegend(0, (java.lang.Boolean) false);
        java.awt.Stroke stroke74 = statisticalBarRenderer0.getItemStroke((int) (byte) 1, (-1));
        java.awt.Stroke stroke75 = statisticalBarRenderer0.getBaseOutlineStroke();
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNull(boolean35);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(itemLabelPosition41);
        org.junit.Assert.assertNotNull(itemLabelPosition43);
        org.junit.Assert.assertNotNull(font48);
        org.junit.Assert.assertNull(font50);
        org.junit.Assert.assertNotNull(shape52);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator64);
        org.junit.Assert.assertNotNull(font65);
        org.junit.Assert.assertNotNull(stroke66);
        org.junit.Assert.assertNotNull(stroke74);
        org.junit.Assert.assertNotNull(stroke75);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Stroke stroke9 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) (byte) -1);
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 0);
        statisticalBarRenderer0.setItemLabelAnchorOffset(0.2d);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator14 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator14);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator16 = statisticalBarRenderer0.getBaseURLGenerator();
        statisticalBarRenderer0.setBaseCreateEntities(false);
        boolean boolean20 = statisticalBarRenderer0.isSeriesVisibleInLegend(0);
        java.awt.Shape shape21 = statisticalBarRenderer0.getBaseShape();
        int int22 = statisticalBarRenderer0.getColumnCount();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (byte) 100);
        java.lang.Boolean boolean26 = statisticalBarRenderer0.getSeriesVisible(0);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(stroke11);
        org.junit.Assert.assertNull(categoryURLGenerator16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(categoryItemLabelGenerator24);
        org.junit.Assert.assertNull(boolean26);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer4 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition6 = null;
        statisticalBarRenderer4.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition6, false);
        java.util.EventListener eventListener9 = null;
        boolean boolean10 = statisticalBarRenderer4.hasListener(eventListener9);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = null;
        statisticalBarRenderer4.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator12);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = statisticalBarRenderer4.getSeriesItemLabelGenerator(0);
        java.awt.Font font16 = statisticalBarRenderer4.getBaseItemLabelFont();
        statisticalBarRenderer0.setBaseItemLabelFont(font16);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator19 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (byte) 1, categoryItemLabelGenerator19);
        statisticalBarRenderer0.setBaseItemLabelsVisible(false);
        java.lang.Object obj23 = statisticalBarRenderer0.clone();
        statisticalBarRenderer0.setAutoPopulateSeriesStroke(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator27 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesItemLabelGenerator((-1), categoryItemLabelGenerator27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator15);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        java.awt.Stroke stroke6 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 1);
        double double7 = statisticalBarRenderer0.getUpperClip();
        java.awt.Paint paint8 = statisticalBarRenderer0.getErrorIndicatorPaint();
        java.awt.Font font10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setSeriesItemLabelFont((int) '#', font10, false);
        java.awt.Stroke stroke15 = statisticalBarRenderer0.getItemOutlineStroke(0, (int) (short) 1);
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNotNull(stroke15);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke(1, 100);
        double double8 = statisticalBarRenderer0.getMinimumBarLength();
        statisticalBarRenderer0.setMaximumBarWidth(10.0d);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        java.awt.Font font15 = statisticalBarRenderer0.getSeriesItemLabelFont((int) (short) 10);
        statisticalBarRenderer0.setSeriesVisible(10, (java.lang.Boolean) false);
        java.awt.Stroke stroke20 = statisticalBarRenderer0.lookupSeriesOutlineStroke(100);
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(font15);
        org.junit.Assert.assertNotNull(stroke20);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) (short) 1, shape9);
        java.lang.Boolean boolean12 = statisticalBarRenderer0.getSeriesVisible((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer13.setBaseOutlinePaint(paint14);
        boolean boolean16 = statisticalBarRenderer13.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = statisticalBarRenderer17.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition20 = statisticalBarRenderer17.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer13.setBasePositiveItemLabelPosition(itemLabelPosition20);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition20);
        java.awt.Paint paint25 = statisticalBarRenderer0.getItemPaint(10, (int) (short) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer26 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition28 = null;
        statisticalBarRenderer26.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition28, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator31 = statisticalBarRenderer26.getLegendItemToolTipGenerator();
        double double32 = statisticalBarRenderer26.getItemMargin();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator33 = null;
        statisticalBarRenderer26.setBaseToolTipGenerator(categoryToolTipGenerator33);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer35 = statisticalBarRenderer26.getGradientPaintTransformer();
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer35);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition39 = null;
        statisticalBarRenderer37.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition39, false);
        java.awt.Stroke stroke44 = statisticalBarRenderer37.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot45 = statisticalBarRenderer37.getPlot();
        java.awt.Paint paint46 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer37.setBaseItemLabelPaint(paint46);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition49 = statisticalBarRenderer37.getSeriesNegativeItemLabelPosition((int) (short) -1);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition49, false);
        java.awt.Shape shape52 = statisticalBarRenderer0.getBaseShape();
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) 1L);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(itemLabelPosition18);
        org.junit.Assert.assertNotNull(itemLabelPosition20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.2d + "'", double32 == 0.2d);
        org.junit.Assert.assertNotNull(gradientPaintTransformer35);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNull(categoryPlot45);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertNotNull(itemLabelPosition49);
        org.junit.Assert.assertNotNull(shape52);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke(1, 100);
        double double8 = statisticalBarRenderer0.getMinimumBarLength();
        statisticalBarRenderer0.setMaximumBarWidth(10.0d);
        statisticalBarRenderer0.setSeriesCreateEntities(10, (java.lang.Boolean) true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = statisticalBarRenderer0.getSeriesURLGenerator((int) (short) 10);
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(categoryURLGenerator15);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer0.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) ' ', shape7, false);
        statisticalBarRenderer0.setMaximumBarWidth((double) 10.0f);
        java.awt.Font font12 = statisticalBarRenderer0.getBaseItemLabelFont();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition((int) (short) 0);
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNotNull(itemLabelPosition14);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = statisticalBarRenderer0.getPlot();
        java.awt.Paint paint9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseItemLabelPaint(paint9);
        boolean boolean11 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        boolean boolean12 = statisticalBarRenderer0.getBaseCreateEntities();
        statisticalBarRenderer0.setMinimumBarLength(0.0d);
        java.awt.Font font17 = statisticalBarRenderer0.getItemLabelFont(10, 1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(categoryPlot8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(font17);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        boolean boolean5 = statisticalBarRenderer0.isSeriesVisibleInLegend((int) (byte) -1);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (short) 10);
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) (short) 0);
        java.awt.Paint paint12 = statisticalBarRenderer0.getItemOutlinePaint(10, (int) (byte) 100);
        boolean boolean13 = statisticalBarRenderer0.getBaseSeriesVisible();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer0.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) ' ', shape7, false);
        statisticalBarRenderer0.setMaximumBarWidth((double) 10.0f);
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, false);
        boolean boolean15 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        java.awt.Paint paint17 = statisticalBarRenderer0.lookupSeriesFillPaint((int) (short) 0);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        java.awt.Paint paint19 = statisticalBarRenderer0.getErrorIndicatorPaint();
        double double20 = statisticalBarRenderer0.getMaximumBarWidth();
        statisticalBarRenderer0.setSeriesVisible((int) '#', (java.lang.Boolean) true);
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(itemLabelPosition18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        java.awt.Paint paint6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setSeriesOutlinePaint(10, paint6, true);
        java.awt.Shape shape10 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) (byte) 1, shape10, true);
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) (-1.0f));
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer15 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = null;
        statisticalBarRenderer15.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition17, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator20 = statisticalBarRenderer15.getLegendItemToolTipGenerator();
        java.awt.Paint paint21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer15.setErrorIndicatorPaint(paint21);
        java.awt.Stroke stroke23 = statisticalBarRenderer15.getBaseOutlineStroke();
        statisticalBarRenderer15.setBaseSeriesVisibleInLegend(false, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer27.setBaseOutlinePaint(paint28);
        boolean boolean30 = statisticalBarRenderer27.isDrawBarOutline();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator31 = null;
        statisticalBarRenderer27.setBaseURLGenerator(categoryURLGenerator31);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer33 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer33.setBaseOutlinePaint(paint34);
        boolean boolean36 = statisticalBarRenderer33.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer37 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition39 = null;
        statisticalBarRenderer37.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition39, false);
        java.util.EventListener eventListener42 = null;
        boolean boolean43 = statisticalBarRenderer37.hasListener(eventListener42);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator45 = null;
        statisticalBarRenderer37.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator45);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator48 = statisticalBarRenderer37.getSeriesItemLabelGenerator(0);
        java.awt.Font font49 = statisticalBarRenderer37.getBaseItemLabelFont();
        statisticalBarRenderer33.setBaseItemLabelFont(font49);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator52 = null;
        statisticalBarRenderer33.setSeriesItemLabelGenerator((int) (byte) 1, categoryItemLabelGenerator52);
        java.awt.Shape shape55 = statisticalBarRenderer33.lookupSeriesShape((int) (short) 0);
        java.awt.Shape shape56 = statisticalBarRenderer33.getBaseShape();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer57 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint58 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer57.setBaseOutlinePaint(paint58);
        boolean boolean60 = statisticalBarRenderer57.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer61 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition63 = null;
        statisticalBarRenderer61.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition63, false);
        java.util.EventListener eventListener66 = null;
        boolean boolean67 = statisticalBarRenderer61.hasListener(eventListener66);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator69 = null;
        statisticalBarRenderer61.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator69);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator72 = statisticalBarRenderer61.getSeriesItemLabelGenerator(0);
        java.awt.Font font73 = statisticalBarRenderer61.getBaseItemLabelFont();
        statisticalBarRenderer57.setBaseItemLabelFont(font73);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator76 = null;
        statisticalBarRenderer57.setSeriesItemLabelGenerator((int) (byte) 1, categoryItemLabelGenerator76);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer78 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition79 = statisticalBarRenderer78.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition81 = statisticalBarRenderer78.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer57.setNegativeItemLabelPositionFallback(itemLabelPosition81);
        statisticalBarRenderer33.setNegativeItemLabelPositionFallback(itemLabelPosition81);
        statisticalBarRenderer27.setPositiveItemLabelPositionFallback(itemLabelPosition81);
        statisticalBarRenderer15.setBaseNegativeItemLabelPosition(itemLabelPosition81);
        statisticalBarRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition81, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator89 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator(100, categoryItemLabelGenerator89);
        java.awt.Paint paint92 = statisticalBarRenderer0.getSeriesItemLabelPaint((int) (short) -1);
        java.awt.Paint paint94 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) (byte) -1);
        java.awt.Paint paint95 = statisticalBarRenderer0.getErrorIndicatorPaint();
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator20);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator48);
        org.junit.Assert.assertNotNull(font49);
        org.junit.Assert.assertNotNull(shape55);
        org.junit.Assert.assertNotNull(shape56);
        org.junit.Assert.assertNotNull(paint58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator72);
        org.junit.Assert.assertNotNull(font73);
        org.junit.Assert.assertNull(itemLabelPosition79);
        org.junit.Assert.assertNotNull(itemLabelPosition81);
        org.junit.Assert.assertNull(paint92);
        org.junit.Assert.assertNotNull(paint94);
        org.junit.Assert.assertNotNull(paint95);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer0.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        int int6 = statisticalBarRenderer0.getRowCount();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator7 = statisticalBarRenderer0.getLegendItemURLGenerator();
        statisticalBarRenderer0.setIncludeBaseInRange(true);
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator7);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        java.awt.Paint paint6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setErrorIndicatorPaint(paint6);
        java.awt.Stroke stroke8 = statisticalBarRenderer0.getBaseOutlineStroke();
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false, true);
        boolean boolean13 = statisticalBarRenderer0.isSeriesItemLabelsVisible((int) '#');
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = statisticalBarRenderer0.getBasePositiveItemLabelPosition();
        java.awt.Paint paint17 = statisticalBarRenderer0.getItemLabelPaint((int) 'a', (int) (short) 0);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition14);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        java.awt.Paint paint3 = statisticalBarRenderer0.lookupSeriesPaint((int) (short) 0);
        java.awt.Shape shape5 = statisticalBarRenderer0.lookupSeriesShape(0);
        statisticalBarRenderer0.setDrawBarOutline(false);
        double double8 = statisticalBarRenderer0.getUpperClip();
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Paint paint6 = statisticalBarRenderer0.getSeriesFillPaint((int) (byte) 0);
        boolean boolean9 = statisticalBarRenderer0.getItemCreateEntity((int) '4', (int) 'a');
        java.awt.Paint paint12 = statisticalBarRenderer0.getItemPaint(1, (int) (short) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer13.setBaseOutlinePaint(paint14);
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer13.setSeriesPaint(0, paint17);
        java.lang.Object obj19 = null;
        boolean boolean20 = statisticalBarRenderer13.equals(obj19);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = null;
        statisticalBarRenderer22.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition24, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator27 = statisticalBarRenderer22.getLegendItemToolTipGenerator();
        java.awt.Paint paint28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer22.setErrorIndicatorPaint(paint28);
        statisticalBarRenderer13.setSeriesPaint(10, paint28);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator31 = null;
        statisticalBarRenderer13.setLegendItemToolTipGenerator(categorySeriesLabelGenerator31);
        java.awt.Paint paint34 = statisticalBarRenderer13.lookupSeriesPaint(1);
        statisticalBarRenderer0.setBasePaint(paint34, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer38 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition40 = null;
        statisticalBarRenderer38.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition40, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator43 = statisticalBarRenderer38.getLegendItemToolTipGenerator();
        java.awt.Stroke stroke45 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer38.setSeriesStroke((int) (short) 100, stroke45);
        statisticalBarRenderer38.setBaseItemLabelsVisible(false);
        boolean boolean51 = statisticalBarRenderer38.isItemLabelVisible((int) (byte) 1, (int) 'a');
        java.awt.Font font52 = statisticalBarRenderer38.getBaseItemLabelFont();
        statisticalBarRenderer0.setSeriesItemLabelFont((int) '4', font52);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator27);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator43);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(font52);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Shape shape4 = statisticalBarRenderer0.getSeriesShape((int) (short) 100);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator6 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (short) 1, categoryItemLabelGenerator6, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = null;
        statisticalBarRenderer10.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition12, false);
        java.awt.Paint paint15 = statisticalBarRenderer10.getBaseItemLabelPaint();
        statisticalBarRenderer10.setBaseCreateEntities(false, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer20 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer20.setBaseOutlinePaint(paint21);
        java.awt.Stroke stroke24 = statisticalBarRenderer20.getSeriesOutlineStroke((int) (short) 1);
        java.lang.Boolean boolean26 = statisticalBarRenderer20.getSeriesCreateEntities((-1));
        double double27 = statisticalBarRenderer20.getMaximumBarWidth();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer28 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition30 = null;
        statisticalBarRenderer28.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition30, false);
        java.awt.Stroke stroke35 = statisticalBarRenderer28.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape37 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer28.setSeriesShape((int) (short) 1, shape37);
        java.lang.Boolean boolean40 = statisticalBarRenderer28.getSeriesVisible((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer41 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint42 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer41.setBaseOutlinePaint(paint42);
        boolean boolean44 = statisticalBarRenderer41.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer45 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition46 = statisticalBarRenderer45.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition48 = statisticalBarRenderer45.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer41.setBasePositiveItemLabelPosition(itemLabelPosition48);
        statisticalBarRenderer28.setBaseNegativeItemLabelPosition(itemLabelPosition48);
        statisticalBarRenderer20.setNegativeItemLabelPositionFallback(itemLabelPosition48);
        statisticalBarRenderer10.setSeriesPositiveItemLabelPosition((int) '4', itemLabelPosition48);
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition(10, itemLabelPosition48);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNull(stroke24);
        org.junit.Assert.assertNull(boolean26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertNull(boolean40);
        org.junit.Assert.assertNotNull(paint42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(itemLabelPosition46);
        org.junit.Assert.assertNotNull(itemLabelPosition48);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke(1, 100);
        double double8 = statisticalBarRenderer0.getMinimumBarLength();
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = statisticalBarRenderer0.getSeriesItemLabelGenerator((int) (byte) -1);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(false);
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator11);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = statisticalBarRenderer0.getPlot();
        java.awt.Paint paint9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseItemLabelPaint(paint9);
        boolean boolean11 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = statisticalBarRenderer12.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer12.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer12.setSeriesShape((int) ' ', shape19, false);
        statisticalBarRenderer12.setMaximumBarWidth((double) 10.0f);
        statisticalBarRenderer12.setBaseItemLabelsVisible(true, false);
        java.awt.Stroke stroke28 = statisticalBarRenderer12.lookupSeriesOutlineStroke((int) (byte) 0);
        java.awt.Paint paint30 = statisticalBarRenderer12.lookupSeriesOutlinePaint((int) (short) 10);
        java.awt.Paint paint33 = statisticalBarRenderer12.getItemFillPaint((int) ' ', 100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition36 = statisticalBarRenderer12.getNegativeItemLabelPosition(0, (int) 'a');
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition36);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(categoryPlot8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(itemLabelPosition13);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNotNull(itemLabelPosition36);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Stroke stroke4 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (short) 1);
        java.awt.Shape shape6 = statisticalBarRenderer0.lookupSeriesShape((int) '#');
        statisticalBarRenderer0.setBaseSeriesVisible(true, false);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation10 = null;
        boolean boolean11 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation10);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = statisticalBarRenderer0.getSeriesItemLabelGenerator(100);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Stroke stroke4 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (short) 1);
        java.lang.Boolean boolean6 = statisticalBarRenderer0.getSeriesCreateEntities((-1));
        java.awt.Paint paint9 = statisticalBarRenderer0.getItemPaint((int) (byte) 100, (int) (byte) 100);
        java.awt.Stroke stroke10 = statisticalBarRenderer0.getBaseOutlineStroke();
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getBaseOutlineStroke();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        statisticalBarRenderer0.setMaximumBarWidth((double) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = statisticalBarRenderer0.getSeriesToolTipGenerator((-1));
        statisticalBarRenderer0.setSeriesVisible((int) (short) 10, (java.lang.Boolean) true);
        boolean boolean11 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        statisticalBarRenderer0.setSeriesItemLabelsVisible((int) (short) 0, false);
        java.lang.Boolean boolean16 = statisticalBarRenderer0.getSeriesCreateEntities((-1));
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(boolean16);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Font font2 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_FONT;
        statisticalBarRenderer0.setSeriesItemLabelFont((int) (short) 1, font2);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = statisticalBarRenderer0.getBaseNegativeItemLabelPosition();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator5 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator5);
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(true, false);
        statisticalBarRenderer0.setMinimumBarLength((double) 10);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = null;
        statisticalBarRenderer12.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition14, false);
        java.awt.Stroke stroke19 = statisticalBarRenderer12.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = statisticalBarRenderer12.getPlot();
        java.awt.Stroke stroke21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer12.setBaseOutlineStroke(stroke21);
        statisticalBarRenderer12.setSeriesCreateEntities(1, (java.lang.Boolean) true, false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer28 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer28.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer28.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape35 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer28.setSeriesShape((int) ' ', shape35, false);
        statisticalBarRenderer28.setMaximumBarWidth((double) 10.0f);
        boolean boolean42 = statisticalBarRenderer28.isItemLabelVisible(100, (int) (byte) 1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer43 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint44 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer43.setBaseOutlinePaint(paint44);
        statisticalBarRenderer28.setBaseOutlinePaint(paint44, false);
        statisticalBarRenderer12.setSeriesPaint(0, paint44);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer49 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint50 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer49.setBaseOutlinePaint(paint50);
        boolean boolean52 = statisticalBarRenderer49.isDrawBarOutline();
        statisticalBarRenderer49.setMaximumBarWidth((double) (short) 100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition56 = statisticalBarRenderer49.getSeriesPositiveItemLabelPosition(10);
        statisticalBarRenderer12.setNegativeItemLabelPositionFallback(itemLabelPosition56);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition56);
        statisticalBarRenderer0.setAutoPopulateSeriesOutlineStroke(true);
        statisticalBarRenderer0.setItemLabelAnchorOffset(1.0d);
        org.junit.Assert.assertNotNull(font2);
        org.junit.Assert.assertNotNull(itemLabelPosition4);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNull(categoryPlot20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNull(itemLabelPosition29);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertNotNull(paint50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition56);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        statisticalBarRenderer0.setDrawBarOutline(false);
        java.awt.Stroke stroke7 = null;
        statisticalBarRenderer0.setSeriesOutlineStroke((int) (short) 0, stroke7, true);
        java.awt.Paint paint12 = statisticalBarRenderer0.getItemPaint(10, (-1));
        java.awt.Shape shape14 = statisticalBarRenderer0.getSeriesShape((int) (short) 100);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation15 = null;
        boolean boolean16 = statisticalBarRenderer0.removeAnnotation(categoryAnnotation15);
        statisticalBarRenderer0.setBaseItemLabelsVisible(true);
        boolean boolean19 = statisticalBarRenderer0.getBaseItemLabelsVisible();
        boolean boolean22 = statisticalBarRenderer0.getItemCreateEntity((int) (short) 1, 1);
        statisticalBarRenderer0.removeAnnotations();
        statisticalBarRenderer0.setBaseSeriesVisible(true, false);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.util.EventListener eventListener5 = null;
        boolean boolean6 = statisticalBarRenderer0.hasListener(eventListener5);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator8);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = statisticalBarRenderer0.getSeriesItemLabelGenerator(0);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer12 = null;
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer12);
        java.awt.Paint paint15 = statisticalBarRenderer0.lookupSeriesPaint((int) ' ');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer16 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer16.setBaseOutlinePaint(paint17);
        boolean boolean19 = statisticalBarRenderer16.isDrawBarOutline();
        statisticalBarRenderer16.setMaximumBarWidth((double) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator23 = statisticalBarRenderer16.getSeriesToolTipGenerator((-1));
        statisticalBarRenderer16.setSeriesVisible((int) (short) 10, (java.lang.Boolean) true);
        boolean boolean27 = statisticalBarRenderer16.getBaseItemLabelsVisible();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator29 = statisticalBarRenderer16.getSeriesItemLabelGenerator((int) (short) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition32 = null;
        statisticalBarRenderer30.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition32, false);
        java.awt.Stroke stroke37 = statisticalBarRenderer30.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer39 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint40 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer39.setBaseOutlinePaint(paint40);
        statisticalBarRenderer30.setSeriesPaint((int) 'a', paint40, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot44 = statisticalBarRenderer30.getPlot();
        java.awt.Paint paint47 = statisticalBarRenderer30.getItemOutlinePaint((int) (short) 100, (int) '#');
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer48 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint49 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer48.setBaseOutlinePaint(paint49);
        boolean boolean51 = statisticalBarRenderer48.isDrawBarOutline();
        statisticalBarRenderer48.setDrawBarOutline(false);
        java.awt.Stroke stroke55 = null;
        statisticalBarRenderer48.setSeriesOutlineStroke((int) (short) 0, stroke55, true);
        java.awt.Paint paint60 = statisticalBarRenderer48.getItemPaint(10, (-1));
        statisticalBarRenderer30.setErrorIndicatorPaint(paint60);
        statisticalBarRenderer16.setBasePaint(paint60, false);
        statisticalBarRenderer0.setBaseOutlinePaint(paint60, true);
        double double66 = statisticalBarRenderer0.getLowerClip();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator11);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator29);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertNull(categoryPlot44);
        org.junit.Assert.assertNotNull(paint47);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(paint60);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        boolean boolean4 = statisticalBarRenderer0.getItemVisible((int) (byte) 100, (int) (byte) 1);
        org.jfree.chart.plot.DrawingSupplier drawingSupplier5 = statisticalBarRenderer0.getDrawingSupplier();
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawOutline(graphics2D6, categoryPlot7, rectangle2D8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(drawingSupplier5);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator4 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator4);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer6.setBaseOutlinePaint(paint7);
        boolean boolean9 = statisticalBarRenderer6.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = null;
        statisticalBarRenderer10.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition12, false);
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = statisticalBarRenderer10.hasListener(eventListener15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator18 = null;
        statisticalBarRenderer10.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator18);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = statisticalBarRenderer10.getSeriesItemLabelGenerator(0);
        java.awt.Font font22 = statisticalBarRenderer10.getBaseItemLabelFont();
        statisticalBarRenderer6.setBaseItemLabelFont(font22);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator25 = null;
        statisticalBarRenderer6.setSeriesItemLabelGenerator((int) (byte) 1, categoryItemLabelGenerator25);
        java.awt.Shape shape28 = statisticalBarRenderer6.lookupSeriesShape((int) (short) 0);
        java.awt.Shape shape29 = statisticalBarRenderer6.getBaseShape();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer30.setBaseOutlinePaint(paint31);
        boolean boolean33 = statisticalBarRenderer30.isDrawBarOutline();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer34 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition36 = null;
        statisticalBarRenderer34.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition36, false);
        java.util.EventListener eventListener39 = null;
        boolean boolean40 = statisticalBarRenderer34.hasListener(eventListener39);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator42 = null;
        statisticalBarRenderer34.setSeriesItemLabelGenerator(10, categoryItemLabelGenerator42);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator45 = statisticalBarRenderer34.getSeriesItemLabelGenerator(0);
        java.awt.Font font46 = statisticalBarRenderer34.getBaseItemLabelFont();
        statisticalBarRenderer30.setBaseItemLabelFont(font46);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator49 = null;
        statisticalBarRenderer30.setSeriesItemLabelGenerator((int) (byte) 1, categoryItemLabelGenerator49);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer51 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition52 = statisticalBarRenderer51.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition54 = statisticalBarRenderer51.getSeriesPositiveItemLabelPosition((int) '#');
        statisticalBarRenderer30.setNegativeItemLabelPositionFallback(itemLabelPosition54);
        statisticalBarRenderer6.setNegativeItemLabelPositionFallback(itemLabelPosition54);
        statisticalBarRenderer0.setPositiveItemLabelPositionFallback(itemLabelPosition54);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator58 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot59 = statisticalBarRenderer0.getPlot();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator60 = statisticalBarRenderer0.getBaseToolTipGenerator();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator21);
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator45);
        org.junit.Assert.assertNotNull(font46);
        org.junit.Assert.assertNull(itemLabelPosition52);
        org.junit.Assert.assertNotNull(itemLabelPosition54);
        org.junit.Assert.assertNull(categoryItemLabelGenerator58);
        org.junit.Assert.assertNull(categoryPlot59);
        org.junit.Assert.assertNull(categoryToolTipGenerator60);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        double double6 = statisticalBarRenderer0.getItemMargin();
        java.awt.Shape shape8 = statisticalBarRenderer0.getSeriesShape((int) ' ');
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer9 = null;
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer9);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator12 = null;
        statisticalBarRenderer0.setSeriesURLGenerator(10, categoryURLGenerator12, false);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition((int) '4');
        boolean boolean17 = statisticalBarRenderer0.getBaseSeriesVisible();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke(1, 100);
        double double8 = statisticalBarRenderer0.getMinimumBarLength();
        boolean boolean9 = statisticalBarRenderer0.getAutoPopulateSeriesPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = null;
        statisticalBarRenderer10.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition12, false);
        int int15 = statisticalBarRenderer10.getRowCount();
        statisticalBarRenderer10.setSeriesVisible(100, (java.lang.Boolean) false, true);
        java.lang.Boolean boolean21 = statisticalBarRenderer10.getSeriesVisibleInLegend((int) (byte) 0);
        java.awt.Paint paint23 = statisticalBarRenderer10.getSeriesPaint((int) (byte) 1);
        java.awt.Stroke stroke26 = statisticalBarRenderer10.getItemStroke((int) 'a', 10);
        statisticalBarRenderer0.setBaseOutlineStroke(stroke26);
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        double double6 = statisticalBarRenderer0.getItemMargin();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = null;
        statisticalBarRenderer0.setBaseToolTipGenerator(categoryToolTipGenerator7);
        java.awt.Stroke stroke10 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) 'a');
        java.awt.Paint paint11 = statisticalBarRenderer0.getBaseItemLabelPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer12 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint13 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer12.setBaseOutlinePaint(paint13);
        boolean boolean15 = statisticalBarRenderer12.isDrawBarOutline();
        boolean boolean16 = statisticalBarRenderer12.getBaseItemLabelsVisible();
        java.awt.Paint paint19 = statisticalBarRenderer12.getItemFillPaint((int) (short) 0, (int) (byte) 10);
        int int20 = statisticalBarRenderer12.getPassCount();
        java.awt.Paint paint23 = statisticalBarRenderer12.getItemLabelPaint((int) (byte) 10, (int) (short) 10);
        statisticalBarRenderer0.setBaseFillPaint(paint23);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke(1, 100);
        statisticalBarRenderer0.setItemMargin(3.0d);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer11 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = statisticalBarRenderer11.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = statisticalBarRenderer11.getSeriesPositiveItemLabelPosition((int) '#');
        boolean boolean15 = statisticalBarRenderer11.getBaseSeriesVisible();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = statisticalBarRenderer11.getNegativeItemLabelPositionFallback();
        java.awt.Paint paint17 = statisticalBarRenderer11.getBaseFillPaint();
        statisticalBarRenderer0.setSeriesOutlinePaint((int) (byte) 10, paint17);
        java.awt.Font font19 = statisticalBarRenderer0.getBaseItemLabelFont();
        statisticalBarRenderer0.setSeriesItemLabelsVisible(0, (java.lang.Boolean) false);
        boolean boolean23 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        statisticalBarRenderer0.setSeriesCreateEntities((int) (byte) 1, (java.lang.Boolean) false, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator28 = null;
        statisticalBarRenderer0.setBaseURLGenerator(categoryURLGenerator28);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer31 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition32 = statisticalBarRenderer31.getNegativeItemLabelPositionFallback();
        statisticalBarRenderer31.setSeriesVisible((int) (short) 1, (java.lang.Boolean) true, true);
        java.awt.Shape shape38 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer31.setSeriesShape((int) ' ', shape38, false);
        statisticalBarRenderer31.setMaximumBarWidth((double) 10.0f);
        java.awt.Paint paint45 = statisticalBarRenderer31.getItemOutlinePaint((int) (short) -1, (int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition47 = statisticalBarRenderer31.getSeriesNegativeItemLabelPosition((int) (short) -1);
        statisticalBarRenderer0.setSeriesNegativeItemLabelPosition(100, itemLabelPosition47, true);
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(itemLabelPosition12);
        org.junit.Assert.assertNotNull(itemLabelPosition14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(itemLabelPosition16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(itemLabelPosition32);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(itemLabelPosition47);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setSeriesPaint(0, paint4);
        java.lang.Object obj6 = null;
        boolean boolean7 = statisticalBarRenderer0.equals(obj6);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = null;
        statisticalBarRenderer9.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition11, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer9.getLegendItemToolTipGenerator();
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer9.setErrorIndicatorPaint(paint15);
        statisticalBarRenderer0.setSeriesPaint(10, paint15);
        java.awt.Font font20 = statisticalBarRenderer0.getItemLabelFont((int) (byte) -1, (int) '4');
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = statisticalBarRenderer0.getBaseItemLabelGenerator();
        double double22 = statisticalBarRenderer0.getLowerClip();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer23 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer23.setBaseOutlinePaint(paint24);
        java.util.EventListener eventListener26 = null;
        boolean boolean27 = statisticalBarRenderer23.hasListener(eventListener26);
        boolean boolean28 = statisticalBarRenderer23.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = statisticalBarRenderer23.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition29, true);
        double double32 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNull(categoryItemLabelGenerator21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 2.0d + "'", double32 == 2.0d);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        boolean boolean3 = statisticalBarRenderer0.isDrawBarOutline();
        statisticalBarRenderer0.setMaximumBarWidth((double) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = statisticalBarRenderer0.getSeriesToolTipGenerator((-1));
        boolean boolean8 = statisticalBarRenderer0.isDrawBarOutline();
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = null;
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.drawItem(graphics2D9, categoryItemRendererState10, rectangle2D11, categoryPlot12, categoryAxis13, valueAxis14, categoryDataset15, (int) '#', 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires StatisticalCategoryDataset.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) (short) 1, shape9);
        java.lang.Boolean boolean12 = statisticalBarRenderer0.getSeriesVisible((int) (byte) 0);
        boolean boolean14 = statisticalBarRenderer0.isSeriesItemLabelsVisible(0);
        double double15 = statisticalBarRenderer0.getBase();
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        double double3 = statisticalBarRenderer0.getItemLabelAnchorOffset();
        statisticalBarRenderer0.setAutoPopulateSeriesOutlinePaint(false);
        double double6 = statisticalBarRenderer0.getBase();
        statisticalBarRenderer0.setBaseItemLabelsVisible(true, false);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0d + "'", double3 == 2.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        double double6 = statisticalBarRenderer0.getItemMargin();
        java.awt.Shape shape8 = statisticalBarRenderer0.getSeriesShape((int) ' ');
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer9 = null;
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer9);
        org.jfree.chart.LegendItem legendItem13 = statisticalBarRenderer0.getLegendItem(0, (int) (short) 10);
        statisticalBarRenderer0.setMinimumBarLength((double) (byte) 100);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer17 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer17.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = statisticalBarRenderer17.getPlot();
        statisticalBarRenderer17.setBaseCreateEntities(false, false);
        boolean boolean25 = statisticalBarRenderer17.getBaseSeriesVisible();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = statisticalBarRenderer17.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (byte) 100, itemLabelPosition26, false);
        java.awt.Paint paint29 = statisticalBarRenderer0.getBaseOutlinePaint();
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
        org.junit.Assert.assertNull(shape8);
        org.junit.Assert.assertNull(legendItem13);
        org.junit.Assert.assertNull(categoryPlot21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition26);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer0.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = statisticalBarRenderer0.getPlot();
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke(1, 100);
        double double8 = statisticalBarRenderer0.getMinimumBarLength();
        statisticalBarRenderer0.setMaximumBarWidth(10.0d);
        statisticalBarRenderer0.setBaseCreateEntities(true, false);
        org.jfree.chart.LegendItem legendItem16 = statisticalBarRenderer0.getLegendItem((int) (byte) 1, (int) '#');
        boolean boolean17 = statisticalBarRenderer0.getBaseSeriesVisibleInLegend();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer18 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = statisticalBarRenderer18.getNegativeItemLabelPositionFallback();
        boolean boolean22 = statisticalBarRenderer18.getItemVisible((int) (byte) 100, (int) (byte) 1);
        org.jfree.chart.LegendItem legendItem25 = statisticalBarRenderer18.getLegendItem(0, (int) (byte) -1);
        statisticalBarRenderer18.setBaseSeriesVisibleInLegend(false);
        statisticalBarRenderer18.setSeriesCreateEntities(0, (java.lang.Boolean) true);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer31 = statisticalBarRenderer18.getGradientPaintTransformer();
        statisticalBarRenderer0.setGradientPaintTransformer(gradientPaintTransformer31);
        boolean boolean33 = statisticalBarRenderer0.getBaseCreateEntities();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator36 = statisticalBarRenderer0.getURLGenerator(1, (int) (byte) 100);
        org.junit.Assert.assertNull(categoryPlot4);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(legendItem16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(itemLabelPosition19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(legendItem25);
        org.junit.Assert.assertNotNull(gradientPaintTransformer31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(categoryURLGenerator36);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = statisticalBarRenderer0.getPlot();
        java.awt.Paint paint9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        statisticalBarRenderer0.setBaseItemLabelPaint(paint9);
        boolean boolean11 = statisticalBarRenderer0.getAutoPopulateSeriesOutlineStroke();
        statisticalBarRenderer0.setBaseItemLabelsVisible(false, true);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNull(categoryPlot8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator5 = statisticalBarRenderer0.getLegendItemToolTipGenerator();
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer0.setSeriesStroke((int) (short) 100, stroke7);
        statisticalBarRenderer0.setBaseItemLabelsVisible(false);
        boolean boolean13 = statisticalBarRenderer0.isItemLabelVisible((int) (byte) 1, (int) 'a');
        statisticalBarRenderer0.setSeriesItemLabelsVisible(0, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = statisticalBarRenderer0.getBaseNegativeItemLabelPosition();
        statisticalBarRenderer0.setBaseSeriesVisibleInLegend(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator21 = null;
        // The following exception was thrown during execution in test generation
        try {
            statisticalBarRenderer0.setSeriesItemLabelGenerator((-1), categoryItemLabelGenerator21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(categorySeriesLabelGenerator5);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer0.setSeriesShape((int) (short) 1, shape9);
        boolean boolean11 = statisticalBarRenderer0.isDrawBarOutline();
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = statisticalBarRenderer0.getPlot();
        statisticalBarRenderer0.setMinimumBarLength((double) (-1L));
        java.util.EventListener eventListener15 = null;
        boolean boolean16 = statisticalBarRenderer0.hasListener(eventListener15);
        statisticalBarRenderer0.setItemMargin(0.2d);
        java.awt.Paint paint19 = statisticalBarRenderer0.getBaseItemLabelPaint();
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(categoryPlot12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Paint paint6 = statisticalBarRenderer0.getSeriesFillPaint((int) (byte) 0);
        org.jfree.chart.LegendItem legendItem9 = statisticalBarRenderer0.getLegendItem((int) (short) 100, (int) 'a');
        statisticalBarRenderer0.setSeriesCreateEntities((int) (short) 1, (java.lang.Boolean) false);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer14 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer14.setBaseOutlinePaint(paint15);
        boolean boolean17 = statisticalBarRenderer14.isDrawBarOutline();
        boolean boolean18 = statisticalBarRenderer14.getBaseItemLabelsVisible();
        int int19 = statisticalBarRenderer14.getColumnCount();
        double double20 = statisticalBarRenderer14.getItemMargin();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer21 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint22 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer21.setBaseOutlinePaint(paint22);
        java.awt.Paint paint25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer21.setSeriesPaint(0, paint25);
        java.lang.Object obj27 = null;
        boolean boolean28 = statisticalBarRenderer21.equals(obj27);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition32 = null;
        statisticalBarRenderer30.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition32, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator35 = statisticalBarRenderer30.getLegendItemToolTipGenerator();
        java.awt.Paint paint36 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer30.setErrorIndicatorPaint(paint36);
        statisticalBarRenderer21.setSeriesPaint(10, paint36);
        statisticalBarRenderer21.setBaseSeriesVisible(true);
        statisticalBarRenderer21.setIncludeBaseInRange(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer43 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer43.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot47 = statisticalBarRenderer43.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition49 = statisticalBarRenderer43.getSeriesNegativeItemLabelPosition(100);
        statisticalBarRenderer21.setBaseNegativeItemLabelPosition(itemLabelPosition49, true);
        statisticalBarRenderer14.setBasePositiveItemLabelPosition(itemLabelPosition49);
        java.awt.Paint paint54 = statisticalBarRenderer14.getSeriesOutlinePaint(10);
        java.awt.Paint paint56 = statisticalBarRenderer14.lookupSeriesPaint(0);
        statisticalBarRenderer0.setSeriesFillPaint((int) (short) 10, paint56);
        java.awt.Paint paint59 = statisticalBarRenderer0.lookupSeriesOutlinePaint((int) '#');
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNull(legendItem9);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.2d + "'", double20 == 0.2d);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator35);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNull(categoryPlot47);
        org.junit.Assert.assertNotNull(itemLabelPosition49);
        org.junit.Assert.assertNull(paint54);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNotNull(paint59);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.lang.Boolean boolean6 = statisticalBarRenderer0.getSeriesVisible((int) (byte) 10);
        boolean boolean7 = statisticalBarRenderer0.getAutoPopulateSeriesOutlinePaint();
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = statisticalBarRenderer0.getNegativeItemLabelPositionFallback();
        java.awt.Paint paint3 = statisticalBarRenderer0.getSeriesFillPaint((int) 'a');
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = null;
        statisticalBarRenderer0.setSeriesItemLabelGenerator((int) (byte) 0, categoryItemLabelGenerator5);
        boolean boolean7 = statisticalBarRenderer0.getBaseCreateEntities();
        java.awt.Paint paint8 = statisticalBarRenderer0.getBaseItemLabelPaint();
        boolean boolean10 = statisticalBarRenderer0.isSeriesItemLabelsVisible(1);
        statisticalBarRenderer0.setBaseSeriesVisible(true);
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(paint8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint1 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer0.setBaseOutlinePaint(paint1);
        java.awt.Paint paint4 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer0.setSeriesPaint(0, paint4);
        java.lang.Object obj6 = null;
        boolean boolean7 = statisticalBarRenderer0.equals(obj6);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer9 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = null;
        statisticalBarRenderer9.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition11, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = statisticalBarRenderer9.getLegendItemToolTipGenerator();
        java.awt.Paint paint15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer9.setErrorIndicatorPaint(paint15);
        statisticalBarRenderer0.setSeriesPaint(10, paint15);
        statisticalBarRenderer0.setBaseSeriesVisible(true);
        statisticalBarRenderer0.setIncludeBaseInRange(true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer22 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        statisticalBarRenderer22.setSeriesVisibleInLegend((int) (byte) 100, (java.lang.Boolean) false);
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = statisticalBarRenderer22.getPlot();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition28 = statisticalBarRenderer22.getSeriesNegativeItemLabelPosition(100);
        statisticalBarRenderer0.setBaseNegativeItemLabelPosition(itemLabelPosition28, true);
        java.awt.Shape shape32 = statisticalBarRenderer0.getSeriesShape(1);
        java.awt.Font font34 = statisticalBarRenderer0.getSeriesItemLabelFont(10);
        double double35 = statisticalBarRenderer0.getBase();
        java.awt.Paint paint37 = statisticalBarRenderer0.lookupSeriesFillPaint((int) (byte) 1);
        java.awt.Shape shape40 = statisticalBarRenderer0.getItemShape((int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNull(categoryPlot26);
        org.junit.Assert.assertNotNull(itemLabelPosition28);
        org.junit.Assert.assertNull(shape32);
        org.junit.Assert.assertNull(font34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(paint37);
        org.junit.Assert.assertNotNull(shape40);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Stroke stroke9 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) (byte) -1);
        java.awt.Stroke stroke11 = statisticalBarRenderer0.getSeriesOutlineStroke((int) (byte) 0);
        statisticalBarRenderer0.setItemLabelAnchorOffset(0.2d);
        boolean boolean14 = statisticalBarRenderer0.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = statisticalBarRenderer0.getSeriesNegativeItemLabelPosition((int) (short) 0);
        double double17 = statisticalBarRenderer0.getMinimumBarLength();
        int int18 = statisticalBarRenderer0.getColumnCount();
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Stroke stroke7 = statisticalBarRenderer0.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Stroke stroke9 = statisticalBarRenderer0.lookupSeriesOutlineStroke((int) (byte) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer10 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = null;
        statisticalBarRenderer10.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition12, false);
        java.awt.Stroke stroke17 = statisticalBarRenderer10.getItemOutlineStroke((int) (byte) 0, 0);
        java.awt.Shape shape19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        statisticalBarRenderer10.setSeriesShape((int) (short) 1, shape19);
        java.lang.Boolean boolean22 = statisticalBarRenderer10.getSeriesVisible((int) (byte) 0);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer24 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = null;
        statisticalBarRenderer24.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition26, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator29 = statisticalBarRenderer24.getLegendItemToolTipGenerator();
        java.awt.Stroke stroke31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer24.setSeriesStroke((int) (short) 100, stroke31);
        statisticalBarRenderer10.setSeriesOutlineStroke((int) (byte) 10, stroke31);
        statisticalBarRenderer0.setBaseStroke(stroke31);
        statisticalBarRenderer0.setBaseCreateEntities(true);
        boolean boolean37 = statisticalBarRenderer0.getAutoPopulateSeriesFillPaint();
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer39 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint40 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer39.setBaseOutlinePaint(paint40);
        boolean boolean42 = statisticalBarRenderer39.getAutoPopulateSeriesShape();
        java.awt.Stroke stroke45 = statisticalBarRenderer39.getItemStroke((int) ' ', (int) (short) 10);
        statisticalBarRenderer0.setSeriesStroke((int) ' ', stroke45, false);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator29);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(paint40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(stroke45);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = null;
        statisticalBarRenderer0.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition2, false);
        java.awt.Paint paint6 = statisticalBarRenderer0.getSeriesFillPaint((int) (byte) 0);
        boolean boolean9 = statisticalBarRenderer0.getItemCreateEntity((int) '4', (int) 'a');
        java.awt.Paint paint12 = statisticalBarRenderer0.getItemPaint(1, (int) (short) -1);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer13 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition15 = null;
        statisticalBarRenderer13.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition15, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator18 = statisticalBarRenderer13.getLegendItemToolTipGenerator();
        java.awt.Stroke stroke20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        statisticalBarRenderer13.setSeriesStroke((int) (short) 100, stroke20);
        statisticalBarRenderer13.setBaseItemLabelsVisible(false);
        boolean boolean26 = statisticalBarRenderer13.isItemLabelVisible((int) (byte) 1, (int) 'a');
        statisticalBarRenderer13.setSeriesItemLabelsVisible(0, true);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer30 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer30.setBaseOutlinePaint(paint31);
        boolean boolean33 = statisticalBarRenderer30.isDrawBarOutline();
        statisticalBarRenderer30.setMaximumBarWidth((double) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator37 = statisticalBarRenderer30.getSeriesToolTipGenerator((-1));
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition40 = statisticalBarRenderer30.getNegativeItemLabelPosition(100, (int) (short) -1);
        statisticalBarRenderer13.setBasePositiveItemLabelPosition(itemLabelPosition40);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer42 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        java.awt.Paint paint43 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        statisticalBarRenderer42.setBaseOutlinePaint(paint43);
        java.awt.Paint paint46 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer42.setSeriesPaint(0, paint46);
        java.lang.Object obj48 = null;
        boolean boolean49 = statisticalBarRenderer42.equals(obj48);
        org.jfree.chart.renderer.category.StatisticalBarRenderer statisticalBarRenderer51 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition53 = null;
        statisticalBarRenderer51.setSeriesPositiveItemLabelPosition((int) (short) 10, itemLabelPosition53, false);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator56 = statisticalBarRenderer51.getLegendItemToolTipGenerator();
        java.awt.Paint paint57 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        statisticalBarRenderer51.setErrorIndicatorPaint(paint57);
        statisticalBarRenderer42.setSeriesPaint(10, paint57);
        statisticalBarRenderer13.setBasePaint(paint57, true);
        statisticalBarRenderer0.setErrorIndicatorPaint(paint57);
        statisticalBarRenderer0.setItemLabelAnchorOffset((double) 1);
        java.awt.Paint paint67 = statisticalBarRenderer0.getItemPaint((int) '#', 1);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(categoryToolTipGenerator37);
        org.junit.Assert.assertNotNull(itemLabelPosition40);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(paint46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator56);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertNotNull(paint67);
    }
}

